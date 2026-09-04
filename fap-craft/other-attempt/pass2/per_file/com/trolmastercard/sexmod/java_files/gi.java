/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.MoverType
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraft.world.storage.loot.LootContext$Builder
 *  net.minecraft.world.storage.loot.LootTableList
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.em;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class gi
extends Entity {
    public static final int m = 15;
    private static final DataParameter<Integer> g = EntityDataManager.func_187226_a(gi.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(111);
    private static final DataParameter<Optional<UUID>> f = EntityDataManager.func_187226_a(gi.class, (DataSerializer)DataSerializers.field_187203_m).func_187156_b().func_187161_a(110);
    private boolean k;
    private int l;
    private int h;
    public int d;
    private int c;
    private int j;
    private float e;
    public Entity i;
    private a$a n = a$a.FLYING;
    private int a;
    private int o;
    public static eb b = null;

    public gi(World world, eb eb2, double d) {
        super(world);
        this.a(eb2);
        this.a(d);
    }

    public gi(World world) {
        super(world);
    }

    private void a(eb eb2) {
        this.func_70105_a(0.25f, 0.25f);
        this.field_70158_ak = true;
        eb2.av = this;
    }

    protected void func_70088_a() {
        this.func_184212_Q().func_187214_a(g, (Object)0);
        this.func_184212_Q().func_187214_a(f, (Object)Optional.of((Object)b.f()));
    }

    public AxisAlignedBB func_184177_bl() {
        return this.func_174813_aQ().func_186662_g(10.0);
    }

    eb b() {
        Optional optional = (Optional)this.field_70180_af.func_187225_a(f);
        if (!optional.isPresent()) {
            return null;
        }
        em em2 = em.a((UUID)optional.get());
        if (em2 == null) {
            return null;
        }
        if (!(em2 instanceof eb)) {
            return null;
        }
        return (eb)em2;
    }

    eb g() {
        Optional optional = (Optional)this.field_70180_af.func_187225_a(f);
        if (!optional.isPresent()) {
            return null;
        }
        em em2 = em.b((UUID)optional.get());
        if (!(em2 instanceof eb)) {
            return null;
        }
        return (eb)em2;
    }

    public void b(int n) {
        this.o = n;
    }

    public void a(int n) {
        this.a = n;
    }

    public void func_70030_z() {
        block1: {
            super.func_70030_z();
            if (this.field_70170_p.field_72995_K) {
                return;
            }
            if (this.i == null && !this.field_70122_E || this.d != 0) break block1;
            this.b().o();
        }
    }

    public void a(double d) {
        eb eb2 = this.b();
        if (eb2 == null) {
            return;
        }
        BlockPos blockPos = eb2.ai;
        float f = (float)Math.sqrt(eb2.func_174791_d().func_186679_c((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p()));
        float f2 = -22.5f + 45.0f * (f / 7.0f);
        float f3 = eb2.I().floatValue();
        float f4 = MathHelper.func_76134_b((float)(-f3 * ((float)Math.PI / 180) - (float)Math.PI));
        float f5 = MathHelper.func_76126_a((float)(-f3 * ((float)Math.PI / 180) - (float)Math.PI));
        float f6 = -MathHelper.func_76134_b((float)(-f2 * ((float)Math.PI / 180)));
        float f7 = MathHelper.func_76126_a((float)(-f2 * ((float)Math.PI / 180)));
        double d2 = eb2.field_70169_q + (eb2.field_70165_t - eb2.field_70169_q) - (double)f5 * 0.3;
        double d3 = eb2.field_70167_r + (eb2.field_70163_u - eb2.field_70167_r) + (double)eb2.func_70047_e();
        double d4 = eb2.field_70166_s + (eb2.field_70161_v - eb2.field_70166_s) - (double)f4 * 0.3;
        this.func_70012_b(d2, d3, d4, f3, f2);
        this.field_70159_w = d * (double)(-f5);
        this.field_70181_x = d * (double)MathHelper.func_76131_a((float)(-(f7 / f6)), (float)-5.0f, (float)5.0f);
        this.field_70179_y = d * (double)(-f4);
        float f8 = MathHelper.func_76133_a((double)(this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y));
        this.field_70159_w *= 0.6 / (double)f8 + 0.5 + this.field_70146_Z.nextGaussian() * 0.0045;
        this.field_70181_x *= 0.6 / (double)f8 + 0.5 + this.field_70146_Z.nextGaussian() * 0.0045;
        this.field_70179_y *= 0.6 / (double)f8 + 0.5 + this.field_70146_Z.nextGaussian() * 0.0045;
        float f9 = MathHelper.func_76133_a((double)(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y));
        this.field_70177_z = (float)(MathHelper.func_181159_b((double)this.field_70159_w, (double)this.field_70179_y) * 57.29577951308232);
        this.field_70125_A = (float)(MathHelper.func_181159_b((double)this.field_70181_x, (double)f9) * 57.29577951308232);
        this.field_70126_B = this.field_70177_z;
        this.field_70127_C = this.field_70125_A;
    }

    public void func_184206_a(DataParameter<?> dataParameter) {
        if (g.equals(dataParameter)) {
            int n = (Integer)this.func_184212_Q().func_187225_a(g);
            this.i = n > 0 ? this.field_70170_p.func_73045_a(n - 1) : null;
        }
        super.func_184206_a(dataParameter);
    }

    @SideOnly(value=Side.CLIENT)
    public boolean func_70112_a(double d) {
        double d2 = 64.0;
        return d < 4096.0;
    }

    @SideOnly(value=Side.CLIENT)
    public void func_180426_a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
    }

    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.b() == null) {
            this.func_70106_y();
        } else if (this.field_70170_p.field_72995_K || !this.f()) {
            double d;
            if (this.k) {
                ++this.l;
                if (this.l >= 1200) {
                    this.func_70106_y();
                    return;
                }
            }
            float f = 0.0f;
            BlockPos blockPos = new BlockPos((Entity)this);
            IBlockState iBlockState = this.field_70170_p.func_180495_p(blockPos);
            if (iBlockState.func_185904_a() == Material.field_151586_h) {
                f = BlockLiquid.func_190973_f((IBlockState)iBlockState, (IBlockAccess)this.field_70170_p, (BlockPos)blockPos);
            }
            if (this.n == a$a.FLYING) {
                if (this.i != null) {
                    this.field_70159_w = 0.0;
                    this.field_70181_x = 0.0;
                    this.field_70179_y = 0.0;
                    this.n = a$a.HOOKED_IN_ENTITY;
                    return;
                }
                if (f > 0.0f) {
                    this.field_70159_w *= 0.3;
                    this.field_70181_x *= 0.2;
                    this.field_70179_y *= 0.3;
                    this.n = a$a.BOBBING;
                    return;
                }
                if (!this.field_70170_p.field_72995_K) {
                    this.e();
                }
                if (!(this.k || this.field_70122_E || this.field_70123_F)) {
                    ++this.h;
                } else {
                    this.h = 0;
                    this.field_70159_w = 0.0;
                    this.field_70181_x = 0.0;
                    this.field_70179_y = 0.0;
                }
            } else {
                if (this.n == a$a.HOOKED_IN_ENTITY) {
                    if (this.i != null) {
                        if (this.i.field_70128_L) {
                            this.i = null;
                            this.n = a$a.FLYING;
                        } else {
                            this.field_70165_t = this.i.field_70165_t;
                            double d2 = this.i.field_70131_O;
                            this.field_70163_u = this.i.func_174813_aQ().field_72338_b + d2 * 0.8;
                            this.field_70161_v = this.i.field_70161_v;
                            this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
                        }
                    }
                    return;
                }
                if (this.n == a$a.BOBBING) {
                    this.field_70159_w *= 0.9;
                    this.field_70179_y *= 0.9;
                    d = this.field_70163_u + this.field_70181_x - (double)blockPos.func_177956_o() - (double)f;
                    if (Math.abs(d) < 0.01) {
                        d += Math.signum(d) * 0.1;
                    }
                    this.field_70181_x -= d * (double)this.field_70146_Z.nextFloat() * 0.2;
                    if (!this.field_70170_p.field_72995_K && f > 0.0f) {
                        this.a(blockPos);
                    }
                }
            }
            if (iBlockState.func_185904_a() != Material.field_151586_h) {
                this.field_70181_x -= 0.03;
            }
            this.func_70091_d(MoverType.SELF, this.field_70159_w, this.field_70181_x, this.field_70179_y);
            this.h();
            d = 0.92;
            this.field_70159_w *= 0.92;
            this.field_70181_x *= 0.92;
            this.field_70179_y *= 0.92;
            this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        }
    }

    private boolean f() {
        return false;
    }

    private void h() {
        float f = MathHelper.func_76133_a((double)(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y));
        this.field_70177_z = (float)(MathHelper.func_181159_b((double)this.field_70159_w, (double)this.field_70179_y) * 57.29577951308232);
        this.field_70125_A = (float)(MathHelper.func_181159_b((double)this.field_70181_x, (double)f) * 57.29577951308232);
        while (this.field_70125_A - this.field_70127_C < -180.0f) {
            this.field_70127_C -= 360.0f;
        }
        while (this.field_70125_A - this.field_70127_C >= 180.0f) {
            this.field_70127_C += 360.0f;
        }
        while (this.field_70177_z - this.field_70126_B < -180.0f) {
            this.field_70126_B -= 360.0f;
        }
        while (this.field_70177_z - this.field_70126_B >= 180.0f) {
            this.field_70126_B += 360.0f;
        }
        this.field_70125_A = this.field_70127_C + (this.field_70125_A - this.field_70127_C) * 0.2f;
        this.field_70177_z = this.field_70126_B + (this.field_70177_z - this.field_70126_B) * 0.2f;
    }

    private void e() {
        Vec3d vec3d = new Vec3d(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        Vec3d vec3d2 = new Vec3d(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
        RayTraceResult rayTraceResult = this.field_70170_p.func_147447_a(vec3d, vec3d2, false, true, false);
        vec3d = new Vec3d(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        vec3d2 = new Vec3d(this.field_70165_t + this.field_70159_w, this.field_70163_u + this.field_70181_x, this.field_70161_v + this.field_70179_y);
        if (rayTraceResult != null) {
            vec3d2 = new Vec3d(rayTraceResult.field_72307_f.field_72450_a, rayTraceResult.field_72307_f.field_72448_b, rayTraceResult.field_72307_f.field_72449_c);
        }
        Entity entity = null;
        List list = this.field_70170_p.func_72839_b((Entity)this, this.func_174813_aQ().func_72321_a(this.field_70159_w, this.field_70181_x, this.field_70179_y).func_186662_g(1.0));
        double d = 0.0;
        for (Entity entity2 : list) {
            double d2;
            AxisAlignedBB axisAlignedBB;
            RayTraceResult rayTraceResult2;
            if (!this.a(entity2) || entity2 == this.b() && this.h < 5 || (rayTraceResult2 = (axisAlignedBB = entity2.func_174813_aQ().func_186662_g((double)0.3f)).func_72327_a(vec3d, vec3d2)) == null || !((d2 = vec3d.func_72436_e(rayTraceResult2.field_72307_f)) < d) && d != 0.0) continue;
            entity = entity2;
            d = d2;
        }
        if (entity != null) {
            rayTraceResult = new RayTraceResult(entity);
        }
        if (rayTraceResult != null && rayTraceResult.field_72313_a != RayTraceResult.Type.MISS) {
            if (rayTraceResult.field_72313_a == RayTraceResult.Type.ENTITY) {
                this.i = rayTraceResult.field_72308_g;
                this.a();
            } else {
                this.k = true;
            }
        }
    }

    private void a() {
        this.func_184212_Q().func_187227_b(g, (Object)(this.i.func_145782_y() + 1));
    }

    private void a(BlockPos blockPos) {
        WorldServer worldServer = (WorldServer)this.field_70170_p;
        int n = 1;
        BlockPos blockPos2 = blockPos.func_177984_a();
        if (this.field_70146_Z.nextFloat() < 0.25f && this.field_70170_p.func_175727_C(blockPos2)) {
            ++n;
        }
        if (this.field_70146_Z.nextFloat() < 0.5f && !this.field_70170_p.func_175678_i(blockPos2)) {
            --n;
        }
        if (this.d > 0) {
            --this.d;
            if (this.d <= 0) {
                this.c = 0;
                this.j = 0;
            } else {
                this.field_70181_x -= 0.2 * (double)this.field_70146_Z.nextFloat() * (double)this.field_70146_Z.nextFloat();
            }
        } else if (this.j > 0) {
            this.j -= n;
            if (this.j > 0) {
                double d;
                this.e = (float)((double)this.e + this.field_70146_Z.nextGaussian() * 4.0);
                float f = this.e * ((float)Math.PI / 180);
                float f2 = MathHelper.func_76126_a((float)f);
                float f3 = MathHelper.func_76134_b((float)f);
                double d2 = this.field_70165_t + (double)(f2 * (float)this.j * 0.1f);
                double d3 = (float)MathHelper.func_76128_c((double)this.func_174813_aQ().field_72338_b) + 1.0f;
                IBlockState iBlockState = worldServer.func_180495_p(new BlockPos(d2, d3 - 1.0, d = this.field_70161_v + (double)(f3 * (float)this.j * 0.1f)));
                if (iBlockState.func_185904_a() == Material.field_151586_h) {
                    if (this.field_70146_Z.nextFloat() < 0.15f) {
                        worldServer.func_175739_a(EnumParticleTypes.WATER_BUBBLE, d2, d3 - (double)0.1f, d, 1, (double)f2, 0.1, (double)f3, 0.0, new int[0]);
                    }
                    float f4 = f2 * 0.04f;
                    float f5 = f3 * 0.04f;
                    worldServer.func_175739_a(EnumParticleTypes.WATER_WAKE, d2, d3, d, 0, (double)f5, 0.01, (double)(-f4), 1.0, new int[0]);
                    worldServer.func_175739_a(EnumParticleTypes.WATER_WAKE, d2, d3, d, 0, (double)(-f5), 0.01, (double)f4, 1.0, new int[0]);
                }
            } else {
                this.field_70181_x = -0.4f * MathHelper.func_151240_a((Random)this.field_70146_Z, (float)0.6f, (float)1.0f);
                this.func_184185_a(SoundEvents.field_187609_F, 0.25f, 1.0f + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.4f);
                double d = this.func_174813_aQ().field_72338_b + 0.5;
                worldServer.func_175739_a(EnumParticleTypes.WATER_BUBBLE, this.field_70165_t, d, this.field_70161_v, (int)(1.0f + this.field_70130_N * 20.0f), (double)this.field_70130_N, 0.0, (double)this.field_70130_N, (double)0.2f, new int[0]);
                worldServer.func_175739_a(EnumParticleTypes.WATER_WAKE, this.field_70165_t, d, this.field_70161_v, (int)(1.0f + this.field_70130_N * 20.0f), (double)this.field_70130_N, 0.0, (double)this.field_70130_N, (double)0.2f, new int[0]);
                this.d = MathHelper.func_76136_a((Random)this.field_70146_Z, (int)20, (int)40);
            }
        } else if (this.c > 0) {
            this.c -= n;
            float f = 0.15f;
            if (this.c < 20) {
                f = (float)((double)f + (double)(20 - this.c) * 0.05);
            } else if (this.c < 40) {
                f = (float)((double)f + (double)(40 - this.c) * 0.02);
            } else if (this.c < 60) {
                f = (float)((double)f + (double)(60 - this.c) * 0.01);
            }
            if (this.field_70146_Z.nextFloat() < f) {
                double d;
                double d4;
                float f6 = MathHelper.func_151240_a((Random)this.field_70146_Z, (float)0.0f, (float)360.0f) * ((float)Math.PI / 180);
                float f7 = MathHelper.func_151240_a((Random)this.field_70146_Z, (float)25.0f, (float)60.0f);
                double d5 = this.field_70165_t + (double)(MathHelper.func_76126_a((float)f6) * f7 * 0.1f);
                IBlockState iBlockState = worldServer.func_180495_p(new BlockPos((int)d5, (int)(d4 = (double)((float)MathHelper.func_76128_c((double)this.func_174813_aQ().field_72338_b) + 1.0f)) - 1, (int)(d = this.field_70161_v + (double)(MathHelper.func_76134_b((float)f6) * f7 * 0.1f))));
                if (iBlockState.func_185904_a() == Material.field_151586_h) {
                    worldServer.func_175739_a(EnumParticleTypes.WATER_SPLASH, d5, d4, d, 2 + this.field_70146_Z.nextInt(2), (double)0.1f, 0.0, (double)0.1f, 0.0, new int[0]);
                }
            }
            if (this.c <= 0) {
                this.e = MathHelper.func_151240_a((Random)this.field_70146_Z, (float)0.0f, (float)360.0f);
                this.j = MathHelper.func_76136_a((Random)this.field_70146_Z, (int)20, (int)80);
            }
        } else {
            this.c = MathHelper.func_76136_a((Random)this.field_70146_Z, (int)100, (int)600);
            this.c -= this.o * 20 * 5;
        }
    }

    protected boolean a(Entity entity) {
        return entity.func_70067_L() || entity instanceof EntityItem;
    }

    public void func_70014_b(NBTTagCompound nBTTagCompound) {
    }

    public void func_70037_a(NBTTagCompound nBTTagCompound) {
    }

    public int c() {
        if (!this.field_70170_p.field_72995_K && this.b() != null) {
            int n = 0;
            Object var2_2 = null;
            if (this.i != null) {
                this.d();
                this.field_70170_p.func_72960_a((Entity)this, (byte)31);
                n = this.i instanceof EntityItem ? 3 : 5;
            } else if (this.d > 0) {
                LootContext.Builder builder = new LootContext.Builder((WorldServer)this.field_70170_p);
                List list = this.field_70170_p.func_184146_ak().func_186521_a(LootTableList.field_186387_al).func_186462_a(this.field_70146_Z, builder.func_186471_a());
                for (ItemStack itemStack : list) {
                    eb eb2 = this.b();
                    eb2.b(itemStack);
                }
                this.d = 9999;
                n = 1;
            }
            if (this.k) {
                n = 2;
            }
            return var2_2 == null ? n : var2_2.getRodDamage();
        }
        return 0;
    }

    protected void d() {
        eb eb2 = this.b();
        if (eb2 != null) {
            double d = eb2.field_70165_t - this.field_70165_t;
            double d2 = eb2.field_70163_u - this.field_70163_u;
            double d3 = eb2.field_70161_v - this.field_70161_v;
            double d4 = 0.1;
            this.i.field_70159_w += d * 0.1;
            this.i.field_70181_x += d2 * 0.1;
            this.i.field_70179_y += d3 * 0.1;
        }
    }

    protected boolean func_70041_e_() {
        return false;
    }

    public void func_70020_e(NBTTagCompound nBTTagCompound) {
    }

    public NBTTagCompound func_189511_e(NBTTagCompound nBTTagCompound) {
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    static enum a$a {
        FLYING,
        HOOKED_IN_ENTITY,
        BOBBING;

    }
}
