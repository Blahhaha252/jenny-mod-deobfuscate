/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityMoveHelper
 *  net.minecraft.entity.ai.EntityMoveHelper$Action
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.Item
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigateGround
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 *  net.minecraft.world.storage.loot.LootTableList
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fn;
import com.trolmastercard.sexmod.r;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

public class ay
extends EntityLiving {
    public static int b = 8400;
    public static List<ay> g = new ArrayList<ay>();
    private static final DataParameter<Integer> d = EntityDataManager.func_187226_a(ay.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(111);
    private static final DataParameter<Integer> c = EntityDataManager.func_187226_a(ay.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(110);
    public float a;
    public float e;
    public float h;
    private boolean f;

    public ay(World world) {
        super(world);
        this.field_70765_h = new b$b(this);
    }

    protected void func_184651_r() {
        this.field_70714_bg.func_75776_a(1, (EntityAIBase)new d$d(this));
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)new c$c(this));
    }

    protected void func_70088_a() {
        super.func_70088_a();
        this.field_70180_af.func_187214_a(c, (Object)1);
        this.field_70180_af.func_187214_a(d, (Object)0);
    }

    public void func_180430_e(float f, float f2) {
    }

    protected boolean func_70692_ba() {
        return false;
    }

    protected void a(int n, boolean bl) {
        this.field_70180_af.func_187227_b(c, (Object)n);
        this.func_70105_a(0.51000005f * (float)n, 0.51000005f * (float)n);
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a((double)(n * n));
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a((double)(0.2f + 0.1f * (float)n));
        if (bl) {
            this.func_70606_j(this.func_110138_aP());
        }
        this.field_70728_aV = n;
    }

    public int h() {
        return (Integer)this.field_70180_af.func_187225_a(c);
    }

    public static void a(DataFixer dataFixer) {
        EntityLiving.func_189752_a((DataFixer)dataFixer, ay.class);
    }

    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        super.func_70014_b(nBTTagCompound);
        nBTTagCompound.func_74768_a("Size", this.h() - 1);
        nBTTagCompound.func_74757_a("wasOnGround", this.f);
        nBTTagCompound.func_74768_a("ageInTicks", ((Integer)this.field_70180_af.func_187225_a(d)).intValue());
    }

    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        super.func_70037_a(nBTTagCompound);
        int n = nBTTagCompound.func_74762_e("Size");
        if (n < 0) {
            n = 0;
        }
        this.a(n + 1, false);
        this.f = nBTTagCompound.func_74767_n("wasOnGround");
        this.field_70180_af.func_187227_b(d, (Object)nBTTagCompound.func_74762_e("ageInTicks"));
    }

    public boolean j() {
        return this.h() <= 1;
    }

    protected EnumParticleTypes g() {
        return EnumParticleTypes.SLIME;
    }

    public static ArrayList<ay> a(Vec3d vec3d) {
        ArrayList<ay> arrayList = ay.a(vec3d, 0.1);
        if (arrayList.isEmpty()) {
            arrayList = ay.a(vec3d, 0.5);
        }
        return arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ArrayList<ay> a(Vec3d var0, double var1_1) {
        var3_2 = new ArrayList<ay>();
        try lbl-1000:
        // 4 sources

        {
            for (ay var5_5 : ay.g) {
                if (var5_5 == null) {
                    continue;
                }
                ** GOTO lbl-1000
            }
            return var3_2;
        }
        catch (Exception var4_4) {
            System.out.println("couldnt find slimes at distance " + var1_1);
            return var3_2;
        }
lbl-1000:
        // 1 sources

        {
            var6_6 = Math.abs(var5_5.field_70169_q - var0.field_72450_a) + Math.abs(var5_5.field_70167_r - var0.field_72448_b) + Math.abs(var5_5.field_70166_s - var0.field_72449_c);
            if (var5_5.field_70170_p == null || !(var6_6 < var1_1)) ** GOTO lbl-1000
        }
        {
            var3_2.add(var5_5);
        }
        ** GOTO lbl-1000
    }

    public Vec3d e() {
        return new Vec3d(this.field_70169_q, this.field_70167_r, this.field_70166_s);
    }

    void a(EnumParticleTypes enumParticleTypes) {
        double d = r.f.nextGaussian() * 0.02;
        double d2 = r.f.nextGaussian() * 0.02;
        double d3 = r.f.nextGaussian() * 0.02;
        this.field_70170_p.func_175688_a(enumParticleTypes, this.field_70165_t + (double)(r.f.nextFloat() * this.field_70130_N * 2.0f) - (double)this.field_70130_N, this.field_70163_u + 0.15 + (double)(r.f.nextFloat() * this.field_70131_O), this.field_70161_v + (double)(r.f.nextFloat() * this.field_70130_N * 2.0f) - (double)this.field_70130_N, d, d2, d3, new int[0]);
    }

    public void func_70071_h_() {
        this.field_70180_af.func_187227_b(d, (Object)((Integer)this.field_70180_af.func_187225_a(d) + 1));
        if (this.field_70170_p.field_72995_K) {
            if ((double)((Integer)this.field_70180_af.func_187225_a(d)).intValue() > (double)b * 0.95) {
                this.a(EnumParticleTypes.CLOUD);
            } else if ((double)((Integer)this.field_70180_af.func_187225_a(d)).intValue() > (double)b * 0.7 && this.field_70173_aa % 10 == 0) {
                this.a(EnumParticleTypes.VILLAGER_HAPPY);
            }
        } else if ((Integer)this.field_70180_af.func_187225_a(d) > b) {
            fn fn2 = new fn(this.field_70170_p);
            fn2.func_70080_a(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70177_z, this.field_70125_A);
            this.field_70170_p.func_72838_d((Entity)fn2);
            fn2.a(SoundEvents.field_187604_bf);
            this.field_70170_p.func_72900_e((Entity)this);
        }
        this.e += (this.a - this.e) * 0.5f;
        this.h = this.e;
        super.func_70071_h_();
        if (this.field_70122_E && !this.f) {
            int n = this.h();
            if (this.k()) {
                n = 0;
            }
            for (int i = 0; i < n * 8; ++i) {
                float f = this.field_70146_Z.nextFloat() * ((float)Math.PI * 2);
                float f2 = this.field_70146_Z.nextFloat() * 0.5f + 0.5f;
                float f3 = MathHelper.func_76126_a((float)f) * (float)n * 0.5f * f2;
                float f4 = MathHelper.func_76134_b((float)f) * (float)n * 0.5f * f2;
                World world = this.field_70170_p;
                EnumParticleTypes enumParticleTypes = this.g();
                double d = this.field_70165_t + (double)f3;
                double d2 = this.field_70161_v + (double)f4;
                world.func_175688_a(enumParticleTypes, d, this.func_174813_aQ().field_72338_b, d2, 0.0, 0.0, 0.0, new int[0]);
            }
            this.func_184185_a(this.f(), this.func_70599_aP(), ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            this.a = -0.5f;
        } else if (!this.field_70122_E && this.f) {
            this.a = 1.0f;
        }
        this.f = this.field_70122_E;
        this.b();
    }

    protected void b() {
        this.a *= 0.6f;
    }

    protected int a() {
        return this.field_70146_Z.nextInt(100) + 50;
    }

    protected ay d() {
        return new ay(this.field_70170_p);
    }

    public void func_184206_a(DataParameter<?> dataParameter) {
        if (c.equals(dataParameter)) {
            int n = this.h();
            this.func_70105_a(0.51000005f * (float)n, 0.51000005f * (float)n);
            this.field_70177_z = this.field_70759_as;
            this.field_70761_aq = this.field_70759_as;
            if (this.func_70090_H() && this.field_70146_Z.nextInt(20) == 0) {
                this.func_71061_d_();
            }
        }
        super.func_184206_a(dataParameter);
    }

    public void func_70106_y() {
        int n = this.h();
        if (!this.field_70170_p.field_72995_K && n > 1 && this.func_110143_aJ() <= 0.0f) {
            int n2 = 2 + this.field_70146_Z.nextInt(3);
            for (int i = 0; i < n2; ++i) {
                float f = ((float)(i % 2) - 0.5f) * (float)n / 4.0f;
                float f2 = ((float)(i / 2) - 0.5f) * (float)n / 4.0f;
                ay ay2 = this.d();
                if (this.func_145818_k_()) {
                    ay2.func_96094_a(this.func_95999_t());
                }
                if (this.func_104002_bU()) {
                    ay2.func_110163_bv();
                }
                ay2.a(n / 2, true);
                ay2.func_70012_b(this.field_70165_t + (double)f, this.field_70163_u + 0.5, this.field_70161_v + (double)f2, this.field_70146_Z.nextFloat() * 360.0f, 0.0f);
                this.field_70170_p.func_72838_d((Entity)ay2);
            }
        }
        super.func_70106_y();
    }

    public float func_70047_e() {
        return 0.625f * this.field_70131_O;
    }

    protected SoundEvent func_184601_bQ(DamageSource damageSource) {
        return this.j() ? SoundEvents.field_187898_fy : SoundEvents.field_187880_fp;
    }

    protected SoundEvent func_184615_bR() {
        return this.j() ? SoundEvents.field_187896_fx : SoundEvents.field_187874_fm;
    }

    protected SoundEvent f() {
        return this.j() ? SoundEvents.field_187900_fz : SoundEvents.field_187886_fs;
    }

    protected Item func_146068_u() {
        return this.h() == 1 ? Items.field_151123_aH : null;
    }

    @Nullable
    protected ResourceLocation func_184647_J() {
        return this.h() == 1 ? LootTableList.field_186378_ac : LootTableList.field_186419_a;
    }

    protected float func_70599_aP() {
        return 0.4f * (float)this.h();
    }

    public int func_70646_bf() {
        return 0;
    }

    protected boolean i() {
        return this.h() > 0;
    }

    protected void func_70664_aZ() {
        this.field_70181_x = 0.42f;
        this.field_70160_al = true;
    }

    @Nullable
    public IEntityLivingData func_180482_a(DifficultyInstance difficultyInstance, @Nullable IEntityLivingData iEntityLivingData) {
        this.a(1, true);
        return super.func_180482_a(difficultyInstance, iEntityLivingData);
    }

    protected SoundEvent c() {
        return this.j() ? SoundEvents.field_189110_fE : SoundEvents.field_187882_fq;
    }

    protected boolean k() {
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static class b$b
    extends EntityMoveHelper {
        private float b;
        private int c;
        private final ay d;
        private boolean a;

        public b$b(ay ay2) {
            super((EntityLiving)ay2);
            this.d = ay2;
            this.b = 180.0f * ay2.field_70177_z / (float)Math.PI;
        }

        public void a(float f, boolean bl) {
            this.b = f;
            this.a = bl;
        }

        public void a(double d) {
            this.field_75645_e = d;
            this.field_188491_h = EntityMoveHelper.Action.MOVE_TO;
        }

        public void func_75641_c() {
            this.field_75648_a.field_70759_as = this.field_75648_a.field_70177_z = this.func_75639_a(this.field_75648_a.field_70177_z, this.b, 90.0f);
            this.field_75648_a.field_70761_aq = this.field_75648_a.field_70177_z;
            if (this.field_188491_h != EntityMoveHelper.Action.MOVE_TO) {
                this.field_75648_a.func_191989_p(0.0f);
            } else {
                this.field_188491_h = EntityMoveHelper.Action.WAIT;
                if (this.field_75648_a.field_70122_E) {
                    this.field_75648_a.func_70659_e((float)(this.field_75645_e * this.field_75648_a.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e()));
                    if (this.c-- <= 0) {
                        this.c = this.d.a();
                        if (this.a) {
                            this.c /= 3;
                        }
                        float f = r.f.nextInt(360);
                        ((b$b)this.d.func_70605_aq()).a(f, false);
                        this.d.func_70683_ar().func_75660_a();
                        if (this.d.i()) {
                            this.d.func_184185_a(this.d.c(), this.d.func_70599_aP(), ((this.d.func_70681_au().nextFloat() - this.d.func_70681_au().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                        }
                    } else {
                        this.d.field_70702_br = 0.0f;
                        this.d.field_191988_bg = 0.0f;
                        this.field_75648_a.func_70659_e(0.0f);
                    }
                } else {
                    this.field_75648_a.func_70659_e((float)(this.field_75645_e * this.field_75648_a.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e()));
                }
            }
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }

    static class c$c
    extends EntityAIBase {
        private final ay a;

        public c$c(ay ay2) {
            this.a = ay2;
            this.func_75248_a(5);
        }

        public boolean func_75250_a() {
            return true;
        }

        public void func_75246_d() {
            ((b$b)this.a.func_70605_aq()).a(1.0);
        }
    }

    static class d$d
    extends EntityAIBase {
        private final ay a;

        public d$d(ay ay2) {
            this.a = ay2;
            this.func_75248_a(5);
            ((PathNavigateGround)ay2.func_70661_as()).func_179693_d(true);
        }

        public boolean func_75250_a() {
            return this.a.func_70090_H() || this.a.func_180799_ab();
        }

        public void func_75246_d() {
            if (this.a.func_70681_au().nextFloat() < 0.8f) {
                this.a.func_70683_ar().func_75660_a();
            }
            ((b$b)this.a.func_70605_aq()).a(1.2);
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }

    static class a$a
    extends EntityAIBase {
        private final ay b;
        private float a;
        private int c;

        public a$a(ay ay2) {
            this.b = ay2;
            this.func_75248_a(2);
        }

        public boolean func_75250_a() {
            return this.b.func_70638_az() == null && (this.b.field_70122_E || this.b.func_70090_H() || this.b.func_180799_ab() || this.b.func_70644_a(MobEffects.field_188424_y));
        }

        public void func_75246_d() {
            if (--this.c <= 0) {
                this.c = 40 + this.b.func_70681_au().nextInt(60);
                this.a = this.b.func_70681_au().nextInt(360);
            }
            ((b$b)this.b.func_70605_aq()).a(this.a, false);
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
