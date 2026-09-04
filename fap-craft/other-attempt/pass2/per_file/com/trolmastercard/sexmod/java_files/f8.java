/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.projectile.EntityArrow
 *  net.minecraft.entity.projectile.EntityTippedArrow
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.ProjectileImpactEvent$Arrow
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.controller.AnimationController
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.ak;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.bj;
import com.trolmastercard.sexmod.bt;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ce;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.cy;
import com.trolmastercard.sexmod.d;
import com.trolmastercard.sexmod.dh;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ep;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.fq;
import com.trolmastercard.sexmod.ga;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.v;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f8
extends em {
    public static final String ac = "sexmod:mommy";
    public static final float am = 60.0f;
    public static final float ag = 4.0f;
    public static final float P = 3.5f;
    public static final float ah = 28.0f;
    public static final float ae = 15.0f;
    public static final float K = 15.0f;
    public static final float L = 0.65f;
    public static final float ao = 3.65f;
    public static final float O = 6.0f;
    public static final float ak = 80.0f;
    public static final float X = 700.0f;
    public static final DataParameter<String> ad = EntityDataManager.func_187226_a(f8.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(111);
    public static final DataParameter<Boolean> ap = EntityDataManager.func_187226_a(f8.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(112);
    public static final DataParameter<Integer> ab = EntityDataManager.func_187226_a(f8.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(113);
    public static final DataParameter<String> al = EntityDataManager.func_187226_a(f8.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(114);
    public static final DataParameter<Boolean> ar = EntityDataManager.func_187226_a(f8.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(115);
    private UUID Q = null;
    public boolean aj = true;
    public Vec3d R = Vec3d.field_186680_a;
    public float V = 0.0f;
    boolean aq = true;
    boolean S = false;
    boolean U = false;
    public float af = 0.0f;
    public float W = 0.0f;
    public float T = 0.0f;
    public float ai = 0.0f;
    boolean aa = false;
    boolean Z = false;
    boolean N = false;
    boolean Y = false;
    boolean M = false;
    public int an = 2;

    public f8(World world) {
        super(world);
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.m.func_187214_a(ad, (Object)"");
        this.m.func_187214_a(ap, (Object)false);
        this.m.func_187214_a(ab, (Object)-1);
        this.m.func_187214_a(al, (Object)"");
        this.m.func_187214_a(ar, (Object)false);
    }

    @Override
    public String c() {
        return "Manglelie";
    }

    @Override
    protected void func_184651_r() {
        super.func_184651_r();
        this.field_70714_bg.func_75776_a(1, (EntityAIBase)new bt(this, 20.0f, 1.0, 1.2));
    }

    @Override
    public float i() {
        return 0.0f;
    }

    public void c(boolean bl) {
        this.m.func_187227_b(ap, (Object)bl);
    }

    public boolean r() {
        return (Boolean)this.m.func_187225_a(ap);
    }

    @Nullable
    public UUID v() {
        String string = (String)this.m.func_187225_a(ad);
        if ("".equals(string)) {
            return null;
        }
        try {
            return UUID.fromString(string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean t() {
        return !this.r();
    }

    @Nullable
    public f_ a(boolean bl) {
        em em2;
        UUID uUID = this.v();
        if (uUID == null) {
            return null;
        }
        em em3 = em2 = bl ? em.a(uUID) : em.b(uUID);
        if (!(em2 instanceof f_)) {
            return null;
        }
        return (f_)em2;
    }

    public void a(UUID uUID) {
        if (uUID == null) {
            this.m.func_187227_b(ad, (Object)"");
            return;
        }
        this.m.func_187227_b(ad, (Object)uUID.toString());
    }

    @Override
    public Float I() {
        float f = super.I().floatValue();
        if (ce.c(this)) {
            f += 180.0f;
        }
        return Float.valueOf(f);
    }

    public void q() {
        this.S = true;
    }

    @Override
    public void func_70619_bc() {
        if (this.aa) {
            this.field_70170_p.func_72900_e((Entity)this);
            return;
        }
        this.f();
        this.w();
        super.func_70619_bc();
        this.j();
        this.c();
        this.d();
        this.i();
        this.n();
        this.u();
        this.h();
        this.a();
        this.t();
    }

    void t() {
        block2: {
            if (this.v() != null) {
                this.aq = false;
            }
            if (this.aq) {
                return;
            }
            if (this.a(true) != null) break block2;
            System.out.println("removed non-wild mang for lack of mommy");
            this.field_70170_p.func_72900_e((Entity)this);
        }
    }

    void a() {
        f_ f_2 = this.a(true);
        if (f_2 == null) {
            return;
        }
        if (f_2.aF() == null) {
            return;
        }
        if (this.f().equals(f_2.aF())) {
            return;
        }
        System.out.println("removed non-wild mang cuz her mommy disowned her and got another mang");
        this.field_70170_p.func_72900_e((Entity)this);
    }

    public static f_ a(em em2, boolean bl) {
        if (!(em2 instanceof f8)) {
            return null;
        }
        return ((f8)em2).a(bl);
    }

    public long e() {
        String string = (String)this.m.func_187225_a(al);
        if ("".equals(string)) {
            return -1L;
        }
        try {
            return Long.parseLong(string);
        }
        catch (Exception exception) {
            return -1L;
        }
    }

    public void a(long l) {
        this.m.func_187227_b(al, (Object)Long.toString(l));
        this.U = false;
    }

    void h() {
        long l = this.e();
        if (l == -1L) {
            return;
        }
        long l2 = this.field_70170_p.func_82737_E();
        if ((float)l2 < 28.0f + (float)l) {
            return;
        }
        if (this.U) {
            return;
        }
        Entity entity = this.b();
        if (entity == null) {
            return;
        }
        f_ f_2 = this.a(true);
        if (f_2 == null) {
            return;
        }
        EntityTippedArrow entityTippedArrow = new EntityTippedArrow(this.field_70170_p, (EntityLivingBase)this);
        Vec3d vec3d = f_2.func_174791_d().func_72441_c(0.0, 3.5, 0.0);
        entityTippedArrow.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        Vec3d vec3d2 = entity.func_174791_d();
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d).func_72432_b();
        entityTippedArrow.field_70159_w = vec3d3.field_72450_a * 4.0;
        entityTippedArrow.field_70181_x = vec3d3.field_72448_b * 4.0;
        entityTippedArrow.field_70179_y = vec3d3.field_72449_c * 4.0;
        em.a((em)f_2, SoundEvents.field_187737_v, true);
        this.field_70170_p.func_72838_d((Entity)entityTippedArrow);
        this.U = true;
    }

    public void func_70690_d(PotionEffect potionEffect) {
    }

    void u() {
        boolean bl = this.v() != null;
        this.func_189654_d(bl);
        this.field_70145_X = bl;
    }

    public boolean func_70067_L() {
        return this.v() == null;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public Vec3d a(Minecraft minecraft, cy cy2, EntityLivingBase entityLivingBase, float f) {
        if (this.h()) {
            return super.a(minecraft, cy2, entityLivingBase, f);
        }
        if (!this.r()) {
            return super.a(minecraft, cy2, entityLivingBase, f);
        }
        f_ f_2 = this.a(false);
        if (f_2 == null) {
            return super.a(minecraft, cy2, entityLivingBase, f);
        }
        dh.a(f_2, f, cy2);
        return dh.b(f_2, f);
    }

    public float b(float f) {
        long l = this.e();
        if (l == -1L) {
            return 0.0f;
        }
        long l2 = this.field_70170_p.func_82737_E();
        float f3 = l2 - l;
        return (f3 + f) / 28.0f;
    }

    @Nullable
    public Entity b() {
        int n = (Integer)this.m.func_187225_a(ab);
        if (n == -1) {
            return null;
        }
        return this.field_70170_p.func_73045_a(n);
    }

    void a(int n) {
        this.m.func_187227_b(ab, (Object)n);
        this.a(n == -1 ? -1L : this.field_70170_p.func_82737_E());
    }

    void d() {
        block3: {
            Entity entity = this.b();
            if (entity == null) {
                return;
            }
            f_ f_2 = this.a(true);
            if (f_2 == null) {
                this.a(-1);
                return;
            }
            if (!this.r()) {
                this.a(-1);
                return;
            }
            if (!f8.a(entity, f_2)) break block3;
            this.a(-1);
        }
    }

    public static boolean a(Entity entity, f_ f_2) {
        if (entity.field_70128_L) {
            return true;
        }
        if (entity.field_71093_bK != f_2.field_71093_bK) {
            return true;
        }
        if (!com.trolmastercard.sexmod.d.a(entity)) {
            return true;
        }
        if (!com.trolmastercard.sexmod.d.a(f_2.field_70170_p, f_2.o().func_72441_c(0.0, (double)f_2.func_70047_e(), 0.0), entity)) {
            return true;
        }
        Vec3d vec3d = entity.func_174791_d().func_178788_d(f_2.func_174791_d());
        if (vec3d.field_72450_a * vec3d.field_72450_a + vec3d.field_72449_c * vec3d.field_72449_c > 225.0) {
            return true;
        }
        Float f = f_.a(f_2, 0.0f);
        float f3 = f == null ? f_2.field_70759_as : f.floatValue();
        Vec3d vec3d2 = ck.a(vec3d, f3);
        return vec3d2.field_72449_c < 0.0;
    }

    void n() {
        if (this.b() != null) {
            return;
        }
        if (!this.r()) {
            return;
        }
        f_ f_2 = this.a(true);
        if (f_2 == null) {
            return;
        }
        if (f_2.ae() != null) {
            return;
        }
        if (f_2.y() == fp.MASTERBATE) {
            return;
        }
        BlockPos blockPos = f_2.func_180425_c();
        BlockPos blockPos2 = new BlockPos(15.0, 15.0, 15.0);
        List list = this.field_70170_p.func_72872_a(EntityMob.class, new AxisAlignedBB(blockPos.func_177971_a((Vec3i)blockPos2), blockPos.func_177973_b((Vec3i)blockPos2)));
        for (EntityMob entityMob : list) {
            if (f8.a((Entity)entityMob, f_2)) continue;
            this.a(entityMob.func_145782_y());
            return;
        }
    }

    void i() {
        Entity entity = this.b();
        if (entity == null) {
            return;
        }
        f_ f_2 = this.a(true);
        if (f_2 == null) {
            return;
        }
        long l = this.e();
        if (l == -1L) {
            return;
        }
        long l2 = this.field_70170_p.func_82737_E();
        long l3 = l2 - this.e();
        if ((float)l3 < 60.0f) {
            return;
        }
        this.U = false;
        this.a(-1);
    }

    void j() {
        block2: {
            if (this.Q == null) {
                return;
            }
            em em2 = em.a(this.Q);
            if (!(em2 instanceof f_)) {
                return;
            }
            f_ f_2 = (f_)em2;
            this.a(this.Q);
            f_2.a(this.f());
            this.c(true);
            this.b(fp.RIDE_MOMMY_HEAD);
            this.Q = null;
            if (f_2.y() != fp.HUG_MANG) break block2;
            f_2.a(false);
            f_2.b((fp)null);
        }
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.THREESOME_CUM && fp.a(fp2, fp.THREESOME_FAST, fp.THREESOME_SLOW)) {
            return;
        }
        if (!this.field_70170_p.field_72995_K && fp2 == fp.THREESOME_CUM) {
            com.trolmastercard.sexmod.v.a(this.ae(), this.field_70170_p.func_82737_E());
        }
        super.b(fp2);
    }

    void w() {
        if (!this.r() || fp.a((em)this, fp.THREESOME_SLOW, fp.THREESOME_CUM, fp.THREESOME_FAST)) {
            return;
        }
        f_ f_2 = this.a(true);
        if (f_2 == null) {
            return;
        }
        if (f_2.field_70128_L || !this.f().equals(f_2.aF())) {
            Main.LOGGER.warn("A dead mommy has been saved onto a mang. Deleting her and creating a new one");
            this.field_70170_p.func_72900_e((Entity)this);
            return;
        }
        this.b(0.0f);
        this.c(f_2.func_174791_d());
        this.a(true);
    }

    @Override
    public void b(float f) {
        super.b(f);
    }

    @Override
    public Vec3d a(Vec3d vec3d, float f) {
        if (!this.r()) {
            return vec3d;
        }
        if (ce.c(this)) {
            return vec3d;
        }
        f_ f_2 = this.a(false);
        if (f_2 == null) {
            return vec3d;
        }
        return dh.b(f_2, f);
    }

    void c() {
        f_ f_22;
        if (this.r()) {
            return;
        }
        if (this.v() != null) {
            return;
        }
        BlockPos blockPos = this.func_180425_c();
        BlockPos blockPos2 = blockPos.func_177963_a(-15.0, -15.0, -15.0);
        BlockPos blockPos3 = blockPos.func_177963_a(15.0, 15.0, 15.0);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos2, blockPos3);
        List list = this.field_70170_p.func_72872_a(f_.class, axisAlignedBB);
        f_ f_3 = null;
        for (f_ f_22 : list) {
            if (f_22.field_70128_L || f_22.a(true) != null || !f_22.field_70122_E) continue;
            f_3 = f_22;
            break;
        }
        if (f_3 == null) {
            if (this.y() == fp.RUN) {
                this.b((fp)null);
                this.func_70661_as().func_75499_g();
            }
            return;
        }
        if (this.y() == fp.RIDE_MOMMY_HEAD) {
            return;
        }
        this.b(fp.RUN);
        Vec3d vec3d = this.func_174791_d();
        f_22 = f_3.func_174791_d();
        Vec3d vec3d2 = f_22.func_178788_d(vec3d);
        float f = (float)gc.b(Math.atan2(vec3d2.field_72449_c, vec3d2.field_72450_a)) - 90.0f;
        this.b(f);
        this.f = this.func_70661_as();
        this.f.func_75499_g();
        this.f.func_75497_a((Entity)f_3, (double)0.65f);
    }

    boolean a(Entity entity, float f) {
        f_ f_2 = this.a(f == 1.0f);
        if (f_2 == null) {
            return false;
        }
        Vec3d vec3d = com.trolmastercard.sexmod.ak.a((Entity)this, f);
        return this.a(com.trolmastercard.sexmod.ak.a(entity, f).func_178788_d(vec3d), f_2, f);
    }

    boolean a(Vec3d vec3d, float f) {
        f_ f_2 = this.a(f == 1.0f);
        if (f_2 == null) {
            return false;
        }
        Vec3d vec3d2 = com.trolmastercard.sexmod.ak.a((Entity)this, f);
        return this.a(vec3d.func_178788_d(vec3d2), f_2, f);
    }

    boolean a(Vec3d vec3d, f_ f_2, float f) {
        Vec3d vec3d2 = ck.a(vec3d, b6.b(f_2.field_70758_at, f_2.field_70759_as, (double)f));
        return vec3d2.field_72450_a > 0.35;
    }

    @Override
    public void func_70071_h_() {
        block0: {
            super.func_70071_h_();
            if (!this.field_70170_p.field_72995_K) break block0;
            this.m();
        }
    }

    @SideOnly(value=Side.CLIENT)
    void m() {
        if ((float)Minecraft.func_71410_x().field_71439_g.field_70173_aa % 7.0f != 0.0f) {
            return;
        }
        if (!dh.b(this)) {
            return;
        }
        f_ f_2 = this.a(false);
        if (f_2 == null) {
            return;
        }
        Entity entity = this.o();
        if (entity == null) {
            this.af = 0.0f;
            this.W = 0.0f;
            return;
        }
        Vec3d vec3d = entity.func_174791_d().func_72441_c(0.0, (double)entity.func_70047_e(), 0.0);
        Vec3d vec3d2 = f_2.func_174791_d().func_178787_e(f_2.b("mangPos")).func_178787_e(this.b("head"));
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
        float f = (float)(gc.b(Math.atan2(vec3d3.field_72449_c, vec3d3.field_72450_a)) + 90.0);
        Float f3 = f_.a(f_2, 0.0f);
        f -= f_2.field_70759_as;
        if (f3 != null) {
            f -= f3.floatValue();
        }
        this.af = Math.abs(cj.a(0.0f, f)) < 80.0f ? -gc.c(f) : 0.0f;
        this.W = this.af == 0.0f ? 0.0f : (float)be.b(-vec3d3.field_72448_b / 2.0, -0.75, 0.75);
    }

    public boolean func_70097_a(DamageSource damageSource, float f) {
        if (damageSource == DamageSource.field_76380_i) {
            return super.func_70097_a(damageSource, f);
        }
        f_ f_2 = this.a(true);
        if (f_2 == null) {
            return super.func_70097_a(damageSource, f);
        }
        f_2.func_70097_a(damageSource, f);
        return false;
    }

    @Nullable
    Entity o() {
        Entity entity = this.b();
        if (entity != null) {
            return entity;
        }
        for (EntityPlayer entityPlayer : this.field_70170_p.field_73010_i) {
            float f = entityPlayer.func_70032_d((Entity)this);
            if (f > 6.0f || entity != null && !(entity.func_70032_d((Entity)this) > f)) continue;
            entity = entityPlayer;
        }
        return entity;
    }

    @Override
    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        block0: {
            super.func_70014_b(nBTTagCompound);
            UUID uUID = this.v();
            nBTTagCompound.func_74778_a(ac, uUID == null ? "" : uUID.toString());
            nBTTagCompound.func_74757_a("sexmod:iswild", this.aq);
            if (!this.S) break block0;
            nBTTagCompound.func_74757_a("sexmod:despawned", true);
        }
    }

    public void func_70020_e(NBTTagCompound nBTTagCompound) {
        super.func_70020_e(nBTTagCompound);
        String string = nBTTagCompound.func_74779_i(ac);
        if (!"".equals(string)) {
            this.Q = UUID.fromString(string);
        }
        if (nBTTagCompound.func_74767_n("sexmod:despawned")) {
            this.aa = true;
        }
        this.aq = nBTTagCompound.func_74767_n("sexmod:iswild");
    }

    @Override
    protected boolean X() {
        return false;
    }

    @Override
    public void f(String string) {
        super.f(string);
        bj.a(this);
    }

    void f() {
        if (this.Z) {
            return;
        }
        this.f(bj.c(this));
        this.Z = true;
    }

    @Override
    @Nullable
    protected fp c(fp fp2) {
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        block0: {
            if (!fp.a(fp2, fp.THREESOME_FAST, fp.THREESOME_SLOW)) break block0;
            this.N = true;
        }
        return null;
    }

    @Override
    public void g() {
        block0: {
            if (!this.r()) break block0;
            this.b(fp.RIDE_MOMMY_HEAD);
            this.b(0.0f);
            this.m.func_187217_b(w);
        }
    }

    public boolean func_70601_bi() {
        if (!super.func_70601_bi()) {
            return false;
        }
        BlockPos blockPos = this.func_180425_c();
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.addAll(fq.c);
        arrayList.addAll(fq.b);
        for (BlockPos blockPos2 : arrayList) {
            if (!(Math.sqrt(blockPos.func_177951_i((Vec3i)blockPos2)) < 700.0)) continue;
            return false;
        }
        fq.a(blockPos, fq.b);
        return true;
    }

    @Override
    protected boolean a(fp fp2, String string, boolean bl, AnimationEvent animationEvent) {
        if (fp2 == fp.THREESOME_CUM) {
            this.N = false;
            this.Y = false;
            this.M = false;
            this.an = 2;
            this.r();
            f_ f_2 = this.a(false);
            if (f_2 != null) {
                f_2.r();
                ga.a(f_2);
            }
            ga.a(this);
            return true;
        }
        if (this.N && fp2 == fp.THREESOME_FAST) {
            this.b(fp.THREESOME_CUM);
            this.a("animation.shared.double_holding_cum", true, animationEvent, true);
            f_ f_3 = this.a(false);
            if (f_3 != null) {
                f_3.b(fp.MASTERBATE_SITTING_CUM);
            }
            return true;
        }
        if ((this.N || bl) && fp2 == fp.THREESOME_SLOW) {
            this.Y = false;
            this.b(fp.THREESOME_FAST);
            this.a("animation.shared.double_holding_soft", true, animationEvent, true);
            f_ f_4 = this.a(false);
            if (f_4 != null) {
                f_4.ak();
            }
            return true;
        }
        if (this.N) {
            return false;
        }
        if (bl && !this.Y && fp2 == fp.THREESOME_FAST) {
            this.Y = true;
            this.a("animation.shared.double_holding_hard", true, animationEvent, true);
            return true;
        }
        if (!bl && fp2 == fp.THREESOME_FAST) {
            this.M = true;
            this.b(fp.THREESOME_SLOW);
            this.a("animation.shared.double_holding_back", true, animationEvent, true);
            f_ f_5 = this.a(false);
            if (f_5 != null) {
                f_5.a();
            }
            return true;
        }
        if (this.M && fp2 == fp.THREESOME_SLOW) {
            this.M = false;
            this.a("animation.shared.double_holding_slow", true, animationEvent, true);
            return true;
        }
        return false;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        AnimationController animationController = animationEvent.getController();
        if (this.s == animationController) {
            if (this.b() == null) {
                return PlayState.STOP;
            }
            this.a("animation.manglelie.angry_face", true, animationEvent);
            return PlayState.CONTINUE;
        }
        if (this.E == animationController) {
            if (this.y() != fp.NULL || this.r()) {
                return PlayState.STOP;
            }
            if (Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v) > 0.0) {
                if (((Boolean)this.m.func_187225_a(ar)).booleanValue()) {
                    this.a("animation.manglelie.scared_run", true, animationEvent);
                } else {
                    this.a("animation.manglelie.walk", true, animationEvent);
                }
                this.field_70177_z = this.field_70759_as;
                return PlayState.CONTINUE;
            }
            this.a("animation.manglelie.idle", true, animationEvent);
            return PlayState.CONTINUE;
        }
        switch (this.y()) {
            default: {
                return PlayState.STOP;
            }
            case RUN: {
                this.a("animation.manglelie.running", true, animationEvent);
                break;
            }
            case RIDE_MOMMY_HEAD: {
                this.a("animation.manglelie.sit_on_galath", true, animationEvent);
                break;
            }
            case THREESOME_SLOW: {
                if (this.M) {
                    this.a("animation.shared.double_holding_back", true, animationEvent);
                    break;
                }
                this.a("animation.shared.double_holding_slow", 4, 0.33f, animationEvent);
                break;
            }
            case THREESOME_FAST: {
                if (this.Y) {
                    this.a("animation.shared.double_holding_hard", 3, 0.33f, animationEvent);
                    break;
                }
                this.a("animation.shared.double_holding_soft", true, animationEvent);
                break;
            }
            case THREESOME_CUM: {
                this.a("animation.shared.double_holding_cum", true, animationEvent);
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
        this.C.registerSoundListener(soundKeyframeEvent -> {
            switch (soundKeyframeEvent.sound) {
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "cs0": {
                    this.an = 0;
                    break;
                }
                case "cs1": {
                    this.an = 1;
                    break;
                }
                case "cs2": {
                    this.an = 2;
                    break;
                }
                case "sexui": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "doubleSemen0": {
                    this.a(com.trolmastercard.sexmod.c.MISC_INSERTS, 6.0f);
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                }
                case "doubleSemen": {
                    ga.a(new ep(10, em2 -> {
                        Vec3d vec3d = em2.d("semenEmitter");
                        Vec3d vec3d2 = em2.d("semenDir");
                        return vec3d.func_178788_d(vec3d2).func_72432_b();
                    }, em2 -> em2.b("semenEmitter").func_178787_e(em2.o()), this, 0.3f, 0.3f));
                    break;
                }
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
            }
        });
        animationData.addAnimationController(this.C);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static class b$b {
        @SubscribeEvent
        public void a(ProjectileImpactEvent.Arrow arrow) {
            block1: {
                RayTraceResult rayTraceResult = arrow.getRayTraceResult();
                EntityArrow entityArrow = arrow.getArrow();
                if (!(entityArrow.field_70250_c instanceof f8)) {
                    return;
                }
                if (!(rayTraceResult.field_72308_g instanceof em)) break block1;
                arrow.setCanceled(true);
            }
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
