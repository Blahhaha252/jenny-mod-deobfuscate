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
    public static final DataParameter<String> ad = EntityDataManager.createKey(f8.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(111);
    public static final DataParameter<Boolean> ap = EntityDataManager.createKey(f8.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(112);
    public static final DataParameter<Integer> ab = EntityDataManager.createKey(f8.class, (DataSerializer)DataSerializers.VARINT).getSerializer().createKey(113);
    public static final DataParameter<String> al = EntityDataManager.createKey(f8.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(114);
    public static final DataParameter<Boolean> ar = EntityDataManager.createKey(f8.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(115);
    private UUID Q = null;
    public boolean aj = true;
    public Vec3d R = Vec3d.ZERO;
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
    protected void entityInit() {
        super.entityInit();
        this.m.register(ad, (Object)"");
        this.m.register(ap, (Object)false);
        this.m.register(ab, (Object)-1);
        this.m.register(al, (Object)"");
        this.m.register(ar, (Object)false);
    }

    @Override
    public String c() {
        return "Manglelie";
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(1, (EntityAIBase)new bt(this, 20.0f, 1.0, 1.2));
    }

    @Override
    public float i() {
        return 0.0f;
    }

    public void c(boolean bl) {
        this.m.set(ap, (Object)bl);
    }

    public boolean r() {
        return (Boolean)this.m.get(ap);
    }

    @Nullable
    public UUID v() {
        String string = (String)this.m.get(ad);
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
            this.m.set(ad, (Object)"");
            return;
        }
        this.m.set(ad, (Object)uUID.toString());
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
    public void updateAITasks() {
        if (this.aa) {
            this.world.removeEntity((Entity)this);
            return;
        }
        this.f();
        this.w();
        super.updateAITasks();
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
            this.world.removeEntity((Entity)this);
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
        this.world.removeEntity((Entity)this);
    }

    public static f_ a(em em2, boolean bl) {
        if (!(em2 instanceof f8)) {
            return null;
        }
        return ((f8)em2).a(bl);
    }

    public long e() {
        String string = (String)this.m.get(al);
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
        this.m.set(al, (Object)Long.toString(l));
        this.U = false;
    }

    void h() {
        long l = this.e();
        if (l == -1L) {
            return;
        }
        long l2 = this.world.getTotalWorldTime();
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
        EntityTippedArrow entityTippedArrow = new EntityTippedArrow(this.world, (EntityLivingBase)this);
        Vec3d vec3d = f_2.getPositionVector().add(0.0, 3.5, 0.0);
        entityTippedArrow.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
        Vec3d vec3d2 = entity.getPositionVector();
        Vec3d vec3d3 = vec3d2.subtract(vec3d).normalize();
        entityTippedArrow.motionX = vec3d3.x * 4.0;
        entityTippedArrow.motionY = vec3d3.y * 4.0;
        entityTippedArrow.motionZ = vec3d3.z * 4.0;
        em.a((em)f_2, SoundEvents.ENTITY_ARROW_SHOOT, true);
        this.world.spawnEntity((Entity)entityTippedArrow);
        this.U = true;
    }

    public void addPotionEffect(PotionEffect potionEffect) {
    }

    void u() {
        boolean bl = this.v() != null;
        this.setNoGravity(bl);
        this.noClip = bl;
    }

    public boolean canBeCollidedWith() {
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
        long l2 = this.world.getTotalWorldTime();
        float f3 = l2 - l;
        return (f3 + f) / 28.0f;
    }

    @Nullable
    public Entity b() {
        int n = (Integer)this.m.get(ab);
        if (n == -1) {
            return null;
        }
        return this.world.getEntityByID(n);
    }

    void a(int n) {
        this.m.set(ab, (Object)n);
        this.a(n == -1 ? -1L : this.world.getTotalWorldTime());
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
        if (entity.isDead) {
            return true;
        }
        if (entity.dimension != f_2.dimension) {
            return true;
        }
        if (!com.trolmastercard.sexmod.d.a(entity)) {
            return true;
        }
        if (!com.trolmastercard.sexmod.d.a(f_2.world, f_2.o().add(0.0, (double)f_2.getEyeHeight(), 0.0), entity)) {
            return true;
        }
        Vec3d vec3d = entity.getPositionVector().subtract(f_2.getPositionVector());
        if (vec3d.x * vec3d.x + vec3d.z * vec3d.z > 225.0) {
            return true;
        }
        Float f = f_.a(f_2, 0.0f);
        float f3 = f == null ? f_2.rotationYawHead : f.floatValue();
        Vec3d vec3d2 = ck.a(vec3d, f3);
        return vec3d2.z < 0.0;
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
        BlockPos blockPos = f_2.getPosition();
        BlockPos blockPos2 = new BlockPos(15.0, 15.0, 15.0);
        List list = this.world.getEntitiesWithinAABB(EntityMob.class, new AxisAlignedBB(blockPos.add((Vec3i)blockPos2), blockPos.subtract((Vec3i)blockPos2)));
        for (EntityMob entityMob : list) {
            if (f8.a((Entity)entityMob, f_2)) continue;
            this.a(entityMob.getEntityId());
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
        long l2 = this.world.getTotalWorldTime();
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
        if (!this.world.isRemote && fp2 == fp.THREESOME_CUM) {
            com.trolmastercard.sexmod.v.a(this.ae(), this.world.getTotalWorldTime());
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
        if (f_2.isDead || !this.f().equals(f_2.aF())) {
            Main.LOGGER.warn("A dead mommy has been saved onto a mang. Deleting her and creating a new one");
            this.world.removeEntity((Entity)this);
            return;
        }
        this.b(0.0f);
        this.c(f_2.getPositionVector());
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
        BlockPos blockPos = this.getPosition();
        BlockPos blockPos2 = blockPos.add(-15.0, -15.0, -15.0);
        BlockPos blockPos3 = blockPos.add(15.0, 15.0, 15.0);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos2, blockPos3);
        List list = this.world.getEntitiesWithinAABB(f_.class, axisAlignedBB);
        f_ f_3 = null;
        for (f_ f_22 : list) {
            if (f_22.isDead || f_22.a(true) != null || !f_22.onGround) continue;
            f_3 = f_22;
            break;
        }
        if (f_3 == null) {
            if (this.y() == fp.RUN) {
                this.b((fp)null);
                this.getNavigator().clearPath();
            }
            return;
        }
        if (this.y() == fp.RIDE_MOMMY_HEAD) {
            return;
        }
        this.b(fp.RUN);
        Vec3d vec3d = this.getPositionVector();
        f_22 = f_3.getPositionVector();
        Vec3d vec3d2 = f_22.subtract(vec3d);
        float f = (float)gc.b(Math.atan2(vec3d2.z, vec3d2.x)) - 90.0f;
        this.b(f);
        this.f = this.getNavigator();
        this.f.clearPath();
        this.f.tryMoveToEntityLiving((Entity)f_3, (double)0.65f);
    }

    boolean a(Entity entity, float f) {
        f_ f_2 = this.a(f == 1.0f);
        if (f_2 == null) {
            return false;
        }
        Vec3d vec3d = com.trolmastercard.sexmod.ak.a((Entity)this, f);
        return this.a(com.trolmastercard.sexmod.ak.a(entity, f).subtract(vec3d), f_2, f);
    }

    boolean a(Vec3d vec3d, float f) {
        f_ f_2 = this.a(f == 1.0f);
        if (f_2 == null) {
            return false;
        }
        Vec3d vec3d2 = com.trolmastercard.sexmod.ak.a((Entity)this, f);
        return this.a(vec3d.subtract(vec3d2), f_2, f);
    }

    boolean a(Vec3d vec3d, f_ f_2, float f) {
        Vec3d vec3d2 = ck.a(vec3d, b6.b(f_2.prevRotationYawHead, f_2.rotationYawHead, (double)f));
        return vec3d2.x > 0.35;
    }

    @Override
    public void onUpdate() {
        block0: {
            super.onUpdate();
            if (!this.world.isRemote) break block0;
            this.m();
        }
    }

    @SideOnly(value=Side.CLIENT)
    void m() {
        if ((float)Minecraft.getMinecraft().player.ticksExisted % 7.0f != 0.0f) {
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
        Vec3d vec3d = entity.getPositionVector().add(0.0, (double)entity.getEyeHeight(), 0.0);
        Vec3d vec3d2 = f_2.getPositionVector().add(f_2.b("mangPos")).add(this.b("head"));
        Vec3d vec3d3 = vec3d2.subtract(vec3d);
        float f = (float)(gc.b(Math.atan2(vec3d3.z, vec3d3.x)) + 90.0);
        Float f3 = f_.a(f_2, 0.0f);
        f -= f_2.rotationYawHead;
        if (f3 != null) {
            f -= f3.floatValue();
        }
        this.af = Math.abs(cj.a(0.0f, f)) < 80.0f ? -gc.c(f) : 0.0f;
        this.W = this.af == 0.0f ? 0.0f : (float)be.b(-vec3d3.y / 2.0, -0.75, 0.75);
    }

    public boolean attackEntityFrom(DamageSource damageSource, float f) {
        if (damageSource == DamageSource.OUT_OF_WORLD) {
            return super.attackEntityFrom(damageSource, f);
        }
        f_ f_2 = this.a(true);
        if (f_2 == null) {
            return super.attackEntityFrom(damageSource, f);
        }
        f_2.attackEntityFrom(damageSource, f);
        return false;
    }

    @Nullable
    Entity o() {
        Entity entity = this.b();
        if (entity != null) {
            return entity;
        }
        for (EntityPlayer entityPlayer : this.world.playerEntities) {
            float f = entityPlayer.getDistance((Entity)this);
            if (f > 6.0f || entity != null && !(entity.getDistance((Entity)this) > f)) continue;
            entity = entityPlayer;
        }
        return entity;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nBTTagCompound) {
        block0: {
            super.writeEntityToNBT(nBTTagCompound);
            UUID uUID = this.v();
            nBTTagCompound.setString(ac, uUID == null ? "" : uUID.toString());
            nBTTagCompound.setBoolean("sexmod:iswild", this.aq);
            if (!this.S) break block0;
            nBTTagCompound.setBoolean("sexmod:despawned", true);
        }
    }

    public void readFromNBT(NBTTagCompound nBTTagCompound) {
        super.readFromNBT(nBTTagCompound);
        String string = nBTTagCompound.getString(ac);
        if (!"".equals(string)) {
            this.Q = UUID.fromString(string);
        }
        if (nBTTagCompound.getBoolean("sexmod:despawned")) {
            this.aa = true;
        }
        this.aq = nBTTagCompound.getBoolean("sexmod:iswild");
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
            this.m.setDirty(w);
        }
    }

    public boolean getCanSpawnHere() {
        if (!super.getCanSpawnHere()) {
            return false;
        }
        BlockPos blockPos = this.getPosition();
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.addAll(fq.c);
        arrayList.addAll(fq.b);
        for (BlockPos blockPos2 : arrayList) {
            if (!(Math.sqrt(blockPos.distanceSq((Vec3i)blockPos2)) < 700.0)) continue;
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
            if (Math.abs(this.prevPosX - this.posX) + Math.abs(this.prevPosZ - this.posZ) > 0.0) {
                if (((Boolean)this.m.get(ar)).booleanValue()) {
                    this.a("animation.manglelie.scared_run", true, animationEvent);
                } else {
                    this.a("animation.manglelie.walk", true, animationEvent);
                }
                this.rotationYaw = this.rotationYawHead;
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
                        return vec3d.subtract(vec3d2).normalize();
                    }, em2 -> em2.b("semenEmitter").add(em2.o()), this, 0.3f, 0.3f));
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
                if (!(entityArrow.shootingEntity instanceof f8)) {
                    return;
                }
                if (!(rayTraceResult.entityHit instanceof em)) break block1;
                arrow.setCanceled(true);
            }
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
