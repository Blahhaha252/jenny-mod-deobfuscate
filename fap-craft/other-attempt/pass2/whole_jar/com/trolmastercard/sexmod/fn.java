/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ay;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.co;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.dz;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fn;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.r;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
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
public class fn
extends em {
    static final double Q = (double)0.7f;
    static final float W = 0.9f;
    static final double M = 100.0;
    static final float L = 0.1f;
    static final int O = 2400;
    a.a S = a.a.IDLE;
    public static DataParameter<Integer> U = EntityDataManager.func_187226_a(fn.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(113);
    public static DataParameter<Float> R = EntityDataManager.func_187226_a(fn.class, (DataSerializer)DataSerializers.field_187193_c).func_187156_b().func_187161_a(112);
    public static DataParameter<Integer> T = EntityDataManager.func_187226_a(fn.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(111);
    int N = 0;
    boolean K = true;
    boolean V = false;
    int P = 0;

    public fn(World world) {
        super(world);
    }

    @Override
    public String c() {
        return "Slime";
    }

    @Override
    public float i() {
        return 1.6f;
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.CUMBLOWJOB && (fp2 == fp.THRUSTBLOWJOB || fp2 == fp.SUCKBLOWJOB)) {
            return;
        }
        if (this.y() == fp.DOGGYCUM && (fp2 == fp.DOGGYFAST || fp2 == fp.DOGGYSLOW)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean t() {
        return false;
    }

    @Override
    protected void func_184651_r() {
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.func_184212_Q().func_187214_a(T, (Object)0);
        this.func_184212_Q().func_187214_a(R, (Object)Float.valueOf(0.0f));
        this.func_184212_Q().func_187214_a(U, (Object)-1);
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.SUCKBLOWJOB || fp2 == fp.THRUSTBLOWJOB) {
            return fp.CUMBLOWJOB;
        }
        if (fp2 == fp.DOGGYSLOW || fp2 == fp.DOGGYFAST) {
            return fp.DOGGYCUM;
        }
        return null;
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.SUCKBLOWJOB) {
            return fp.THRUSTBLOWJOB;
        }
        if (fp2 == fp.DOGGYSLOW) {
            return fp.DOGGYFAST;
        }
        return null;
    }

    protected float func_175134_bD() {
        return 0.9f;
    }

    @Override
    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        super.func_70014_b(nBTTagCompound);
        nBTTagCompound.func_74768_a("hornyLevel", ((Integer)this.m.func_187225_a(T)).intValue());
        nBTTagCompound.func_74768_a("ticksUntilBirth", ((Integer)this.m.func_187225_a(U)).intValue());
    }

    @Override
    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        super.func_70037_a(nBTTagCompound);
        this.m.func_187227_b(T, (Object)nBTTagCompound.func_74762_e("hornyLevel"));
        this.m.func_187227_b(U, (Object)nBTTagCompound.func_74762_e("ticksUntilBirth"));
        if ((Integer)this.m.func_187225_a(T) != 0) {
            this.m.func_187227_b(D, (Object)0);
        }
        this.field_70145_X = false;
        this.func_189654_d(false);
    }

    @Override
    protected ResourceLocation func_184647_J() {
        return dz.b;
    }

    @Override
    public void g() {
        this.m.func_187227_b(T, (Object)0);
        this.m.func_187227_b(D, (Object)1);
    }

    @Override
    public void func_70619_bc() {
        super.func_70619_bc();
        this.a();
        this.c();
        if (this.func_70644_a(co.b) && this.S == a.a.IDLE && (Integer)this.m.func_187225_a(U) == -1) {
            this.m.func_187227_b(T, (Object)2);
            if ((Integer)this.m.func_187225_a(D) == 1) {
                this.b(fp.UNDRESS);
            }
            this.func_184589_d(co.b);
        }
    }

    @Override
    public void func_70071_h_() {
        block2: {
            super.func_70071_h_();
            if (this.y() == fp.NULL) {
                this.b();
            }
            if ((Integer)this.m.func_187225_a(T) >= 2 && this.field_70173_aa % 10 == 0) {
                fn.a(EnumParticleTypes.HEART, (em)this);
            }
            if (!this.field_70170_p.field_72995_K) break block2;
            this.d();
            this.i();
        }
    }

    @SideOnly(value=Side.CLIENT)
    void i() {
        if (this.ae() == null) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        if (!this.ae().equals(entityPlayerSP.getPersistentID())) {
            return;
        }
        Vec3d vec3d = this.func_174791_d();
        Vec3d vec3d2 = ck.a(new Vec3d(0.0, 0.0, (double)0.65f), this.I().floatValue());
        vec3d = vec3d.func_178787_e(vec3d2);
        entityPlayerSP.func_70107_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        entityPlayerSP.func_70016_h(0.0, 0.0, 0.0);
    }

    void d() {
        block1: {
            int n2 = (Integer)this.m.func_187225_a(U);
            if (n2 == -1) {
                return;
            }
            fn.a(EnumParticleTypes.SPELL_WITCH, (em)this);
            if (n2 != 0) break block1;
            this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0]);
        }
    }

    void c() {
        int n2 = (Integer)this.m.func_187225_a(U);
        if (n2 == -1) {
            return;
        }
        this.m.func_187227_b(U, (Object)(n2 - 1));
        if (--n2 >= 0) {
            return;
        }
        ay ay2 = new ay(this.field_70170_p);
        ay2.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        this.field_70170_p.func_72838_d((Entity)ay2);
        this.m.func_187227_b(U, (Object)-1);
    }

    void a() {
        int n2 = (Integer)this.m.func_187225_a(T);
        if (n2 < 2) {
            return;
        }
        if (n2 >= 4 && this.field_70122_E && this.y() == fp.NULL) {
            this.c(this.func_174791_d());
            this.b(this.field_70177_z);
            this.m.func_187227_b(G, (Object)true);
            this.func_189654_d(true);
            this.field_70145_X = true;
            this.b(fp.STARTDOGGY);
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 1.0);
        if (entityPlayer == null || !entityPlayer.field_70122_E || fn.d(entityPlayer) != null) {
            return;
        }
        this.c(this.func_174791_d());
        this.b(this.field_70177_z);
        this.m.func_187227_b(G, (Object)true);
        this.func_189654_d(true);
        this.field_70145_X = true;
        entityPlayer.func_189654_d(true);
        entityPlayer.field_70145_X = true;
        ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        this.e(entityPlayer.getPersistentID());
        entityPlayer.field_70177_z = this.I().floatValue();
        Vec3d vec3d = ck.a(new Vec3d(0.0, 0.0, (double)0.65f), this.I().floatValue());
        entityPlayer.func_70107_b(this.field_70165_t + vec3d.field_72450_a, this.field_70163_u, this.field_70161_v + vec3d.field_72449_c);
        if (this.y() == fp.WAITDOGGY) {
            this.b(fp.DOGGYSTART);
        } else {
            this.b(fp.SUCKBLOWJOB);
        }
    }

    void b() {
        if (this.field_70170_p.field_72995_K) {
            float f10;
            if ((double)this.N == 90.0) {
                this.S = a.a.JUMP_START;
            }
            if (!this.K && this.field_70122_E) {
                this.S = a.a.JUMP_END;
                this.N = 0;
            }
            this.field_70177_z = f10 = ((Float)this.m.func_187225_a(R)).floatValue();
            this.field_70759_as = f10;
            this.field_70761_aq = f10;
        } else {
            if ((double)this.N == 85.0) {
                this.m.func_187227_b(R, (Object)Float.valueOf(this.e()));
            }
            if ((double)this.N == 100.0) {
                this.h();
            }
            if (!this.K && this.field_70122_E) {
                boolean bl2 = this.V = (Integer)this.m.func_187225_a(U) == -1 && this.func_70681_au().nextFloat() < 0.1f;
            }
            if (this.V && this.N == 50) {
                int n2 = (Integer)this.m.func_187225_a(T);
                int n3 = n2 + 1;
                this.m.func_187227_b(T, (Object)n3);
                if (n3 == 1) {
                    this.b(fp.UNDRESS);
                }
            }
        }
        if (this.field_70122_E) {
            ++this.N;
        }
        this.K = this.field_70122_E;
    }

    void h() {
        float f10;
        this.field_70159_w = 0.0;
        this.field_70181_x = 0.0;
        this.field_70179_y = 0.0;
        this.func_70664_aZ();
        this.field_70177_z = f10 = ((Float)this.m.func_187225_a(R)).floatValue();
        this.field_70126_B = f10;
        Vec3d vec3d = new Vec3d(0.0, 0.0, (double)0.7f);
        vec3d = ck.a(vec3d, f10);
        this.field_70159_w = vec3d.field_72450_a;
        this.field_70179_y = vec3d.field_72449_c;
        this.N = 0;
    }

    float e() {
        int n2 = (Integer)this.m.func_187225_a(T);
        if ((Integer)this.m.func_187225_a(U) != -1) {
            return this.f();
        }
        if (n2 < 2) {
            return this.f();
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 30.0);
        if (entityPlayer == null) {
            return this.f();
        }
        if (fn.d(entityPlayer) != null) {
            return this.f();
        }
        return (float)Math.atan2(this.field_70161_v - entityPlayer.field_70161_v, this.field_70165_t - entityPlayer.field_70165_t) * 57.29578f + 90.0f;
    }

    float f() {
        return com.trolmastercard.sexmod.r.f.nextFloat() * 360.0f;
    }

    public void func_180430_e(float f10, float f11) {
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
            return null;
        }
        block4 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() == fp.NULL || !this.y().autoBlink) {
                    this.a("animation.slime.null", true, animationEvent);
                    break;
                }
                this.a("animation.slime.fhappy", true, animationEvent);
                break;
            }
            case "action": {
                if (this.y() == fp.NULL) {
                    this.a(this.S.a, true, animationEvent);
                    break;
                }
                switch (this.y()) {
                    case UNDRESS: {
                        this.a("animation.slime.undress", false, animationEvent);
                        break block4;
                    }
                    case DRESS: {
                        this.a("animation.slime.dress", false, animationEvent);
                        break block4;
                    }
                    case STRIP: {
                        this.a("animation.slime.strip", false, animationEvent);
                        break block4;
                    }
                    case STARTBLOWJOB: {
                        this.a("animation.slime.blowjobintro", false, animationEvent);
                        break block4;
                    }
                    case SUCKBLOWJOB: {
                        this.a("animation.slime.blowjobsuck", true, animationEvent);
                        break block4;
                    }
                    case THRUSTBLOWJOB: {
                        this.a("animation.slime.blowjobthrust", true, animationEvent);
                        break block4;
                    }
                    case CUMBLOWJOB: {
                        this.a("animation.slime.blowjobcum", false, animationEvent);
                        break block4;
                    }
                    case STARTDOGGY: {
                        this.a("animation.slime.doggygoonbed", false, animationEvent);
                        break block4;
                    }
                    case WAITDOGGY: {
                        this.a("animation.slime.doggywait", true, animationEvent);
                        break block4;
                    }
                    case DOGGYSTART: {
                        this.a("animation.slime.doggystart", false, animationEvent);
                        break block4;
                    }
                    case DOGGYSLOW: {
                        this.a("animation.slime.doggyslow", true, animationEvent);
                        break block4;
                    }
                    case DOGGYFAST: {
                        this.a("animation.slime.doggyfast", true, animationEvent);
                        break block4;
                    }
                    case DOGGYCUM: {
                        this.a("animation.slime.doggycum", false, animationEvent);
                    }
                }
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        AnimationController.ISoundListener iSoundListener = soundKeyframeEvent -> {
            switch (soundKeyframeEvent.sound) {
                case "undress": {
                    if (!this.e()) break;
                    this.a("currentModel", "0");
                    this.b(fp.NULL);
                    break;
                }
                case "dress": {
                    if (!this.e()) break;
                    this.m.func_187227_b(D, (Object)1);
                    this.b((fp)null);
                    this.r();
                    break;
                }
                case "becomeNude": {
                    this.m.func_187227_b(D, (Object)0);
                    break;
                }
                case "sexUiOn": {
                    if (!this.n() || ds.d) break;
                    ds.d();
                    break;
                }
                case "bjiMSG10": {
                    if (!this.n()) break;
                    this.a(-0.4, -0.8, -0.2, 60.0f, -3.0f);
                    break;
                }
                case "bjiMSG11": {
                    this.a(SoundEvents.field_187886_fs, 0.5f);
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "bjiMSG12": {
                    if (com.trolmastercard.sexmod.r.f.nextInt(5) == 0) {
                        this.a(SoundEvents.field_187882_fq, 0.5f);
                    }
                    this.a(SoundEvents.field_187886_fs, 0.5f);
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "bjtMSG1": {
                    this.a(SoundEvents.field_187878_fo);
                    this.a(SoundEvents.field_187874_fm);
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "bjiDone": {
                    this.b(fp.SUCKBLOWJOB);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "bjtDone": {
                    this.b(fp.SUCKBLOWJOB);
                    break;
                }
                case "bjtReady": 
                case "doggyfastReady": {
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "bjcMSG1": {
                    this.a(SoundEvents.field_187882_fq);
                    break;
                }
                case "bjcMSG2": {
                    this.a(SoundEvents.field_187882_fq);
                    if (!this.n()) break;
                    ds.c();
                    break;
                }
                case "doggyslowMSG2": {
                    this.a(SoundEvents.field_187878_fo);
                    break;
                }
                case "bjcBlackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "bjcDone": 
                case "doggyCumDone": {
                    if (!this.n()) break;
                    ds.b();
                    this.r();
                    this.a("pregnant", String.valueOf(2400));
                    break;
                }
                case "doggyGoOnBedMSG1": {
                    this.a(SoundEvents.field_187886_fs);
                    this.r = this.field_70177_z;
                    break;
                }
                case "doggyGoOnBedDone": {
                    this.b(fp.WAITDOGGY);
                    break;
                }
                case "doggystartMSG1": {
                    this.a(com.trolmastercard.sexmod.c.MISC_TOUCH[0]);
                    break;
                }
                case "doggystartMSG2": {
                    this.a(com.trolmastercard.sexmod.c.MISC_TOUCH[1]);
                    break;
                }
                case "doggystartMSG3": {
                    this.a(SoundEvents.field_187886_fs, 0.25f);
                    break;
                }
                case "doggystartMSG4": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS), 1.5f);
                    break;
                }
                case "doggystartMSG5": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.33f);
                    this.a(SoundEvents.field_187878_fo);
                    break;
                }
                case "doggystartDone": {
                    this.b(fp.DOGGYSLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "doggyslowMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.33f);
                    int n2 = com.trolmastercard.sexmod.r.f.nextInt(4);
                    if (n2 == 0) {
                        n2 = com.trolmastercard.sexmod.r.f.nextInt(2);
                        if (n2 == 0) {
                            this.a(SoundEvents.field_187882_fq);
                        } else {
                            this.a(SoundEvents.field_187886_fs);
                        }
                    } else {
                        this.a(SoundEvents.field_187878_fo);
                    }
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "doggyfastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (this.n()) {
                        ds.a(0.04);
                    }
                    ++this.P;
                    if (this.P % 2 == 0) {
                        int n3 = com.trolmastercard.sexmod.r.f.nextInt(2);
                        if (n3 == 0) {
                            this.a(SoundEvents.field_187882_fq);
                            break;
                        }
                        this.a(SoundEvents.field_187886_fs);
                        break;
                    }
                    this.a(SoundEvents.field_187878_fo);
                    break;
                }
                case "doggyfastDone": {
                    this.b(fp.DOGGYSLOW);
                    break;
                }
                case "doggycumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.MISC_CUMINFLATION[0], 4.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 2.0f);
                    this.a(SoundEvents.field_187874_fm);
                    break;
                }
                case "jumpStart": {
                    this.a(SoundEvents.field_187882_fq);
                    break;
                }
                case "jumpStartDone": {
                    this.S = a.a.JUMP_AIR;
                    break;
                }
                case "jumpEndSound": {
                    this.a(SoundEvents.field_187886_fs);
                    break;
                }
                case "jumpEndDone": {
                    this.S = a.a.IDLE;
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.s);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

