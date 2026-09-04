/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIWanderAvoidWater
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ac;
import com.trolmastercard.sexmod.b0;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.bh;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.co;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fg;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.r;
import java.util.UUID;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
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
public class ex
extends e2
implements bh,
fg {
    public boolean Z = false;
    public boolean ab = false;
    public boolean af = false;
    public static final DataParameter<Boolean> Y = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(118);
    int ac = 0;
    int ad = 0;
    boolean aa = false;
    int ag = 0;
    boolean ae = false;

    public ex(World world) {
        super(world);
        this.func_70105_a(0.49f, 1.95f);
        this.P = 140;
        this.O = 50;
        this.K = 140;
        this.V = new Vec3d(0.0, -0.029999997854232782, -0.2);
    }

    public static ex a(World world) {
        ex ex2 = new ex(world);
        ex2.F = true;
        return ex2;
    }

    @Override
    public String c() {
        return "Jenny";
    }

    @Override
    public float i() {
        return -0.2f;
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.m.func_187214_a(Y, (Object)false);
    }

    @Override
    public void c() {
        this.a("Alright, this is my new Home~");
        this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HAPPYOH[1]);
    }

    public float func_70047_e() {
        return 1.64f;
    }

    protected SoundEvent func_184615_bR() {
        return com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_SIGH);
    }

    protected SoundEvent func_184601_bQ(DamageSource damageSource) {
        return null;
    }

    @Override
    public void func_70619_bc() {
        EntityPlayerMP entityPlayerMP;
        super.func_70619_bc();
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 15.0);
        if (this.af && entityPlayer != null && entityPlayer.func_174791_d().func_72438_d(this.func_174791_d()) < 0.5) {
            this.af = false;
            this.m.func_187227_b(em.y, (Object)this.field_70170_p.func_72890_a((Entity)this, 15.0).getPersistentID().toString());
            entityPlayerMP = this.func_184102_h().func_184103_al().func_177451_a(this.ae());
            this.m.func_187227_b(em.y, (Object)entityPlayerMP.getPersistentID().toString());
            entityPlayerMP.func_70634_a(this.func_174791_d().field_72450_a, this.func_174791_d().field_72448_b, this.func_174791_d().field_72449_c);
            this.a(entityPlayerMP, false);
            entityPlayerMP.func_191958_b(0.0f, 0.0f, 0.0f, 0.0f);
            this.a(0.0, 0.0, 0.4, 0.0f, 60.0f);
            this.B = null;
            this.b(fp.DOGGYSTART);
            ge.b.sendTo((IMessage)new gz(false), entityPlayerMP);
        }
        if (this.Z) {
            if (this.func_174791_d().func_72438_d(this.o()) < 0.6 || this.ad > 200) {
                this.Z = false;
                this.m.func_187227_b(em.G, (Object)true);
                this.ad = 0;
                this.field_70145_X = true;
                this.func_189654_d(true);
                this.field_70159_w = 0.0;
                this.field_70181_x = 0.0;
                this.field_70179_y = 0.0;
                this.b(fp.STARTDOGGY);
            } else {
                ++this.ad;
                if (this.ad == 60 || this.ad == 120) {
                    this.func_70661_as().func_75499_g();
                    this.func_70661_as().func_75492_a(this.o().field_72450_a, this.o().field_72448_b, this.o().field_72449_c, 0.35);
                }
            }
        }
        if (this.ab) {
            ++this.ac;
            if (this.func_174791_d().equals(em.e) || this.ac > 40) {
                this.ab = false;
                this.ac = 0;
                this.b(this.field_70170_p.func_73046_m().func_184103_al().func_177451_a((UUID)this.ae()).field_70177_z + 180.0f);
                this.m.func_187227_b(em.G, (Object)true);
                this.func_70661_as().func_75499_g();
                if (((Boolean)this.m.func_187225_a(Y)).booleanValue()) {
                    this.U();
                    return;
                }
                this.b(fp.PAYMENT);
            } else {
                this.field_70177_z = this.I().floatValue();
                this.c(this.aa());
                this.func_189654_d(false);
                entityPlayerMP = b6.a(this.func_174791_d(), this.o(), 40 - this.ac);
                this.func_70107_b(entityPlayerMP.field_72450_a, entityPlayerMP.field_72448_b, entityPlayerMP.field_72449_c);
            }
        }
    }

    public boolean func_184645_a(EntityPlayer entityPlayer, EnumHand enumHand) {
        block1: {
            if (super.func_184645_a(entityPlayer, enumHand)) {
                return true;
            }
            if (!this.field_70170_p.field_72995_K || this.b(entityPlayer)) break block1;
            this.a(I18n.func_135052_a((String)"jenny.dialogue.busy", (Object[])new Object[0]));
        }
        return true;
    }

    @Override
    public void func_70071_h_() {
        block0: {
            super.func_70071_h_();
            if (this.field_70170_p.field_72995_K) break block0;
            this.m.func_187227_b(Y, (Object)this.func_70644_a(co.b));
        }
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (this.ae() == null && (!this.J() || ((String)this.m.func_187225_a(em.v)).equals(Minecraft.func_71410_x().field_71439_g.getPersistentID().toString()))) {
            String[] stringArray = new String[]{"action.names.blowjob", "action.names.boobjob", "action.names.doggy", (Integer)this.m.func_187225_a(em.D) == 1 ? "action.names.strip" : "action.names.dressup"};
            if (((Boolean)this.m.func_187225_a(Y)).booleanValue()) {
                em.a(entityPlayer, this, stringArray, true);
                return true;
            }
            em.a(entityPlayer, this, stringArray, new ItemStack[]{new ItemStack(Items.field_151166_bC, 3), new ItemStack(Items.field_151079_bi, 2), new ItemStack(Items.field_151045_i, 2), (Integer)this.m.func_187225_a(em.D) == 1 ? new ItemStack(Items.field_151043_k, 1) : new ItemStack(Items.field_190931_a, 0)}, true);
            return true;
        }
        return false;
    }

    @Override
    public void a(String string, UUID uUID) {
        block1: {
            block4: {
                block3: {
                    block2: {
                        block0: {
                            super.a(string, uUID);
                            if (!"action.names.blowjob".equals(string)) break block0;
                            this.a("animationFollowUp", "blowjob");
                            this.a(true, uUID);
                            break block1;
                        }
                        if (!"action.names.boobjob".equals(string)) break block2;
                        this.a("animationFollowUp", "boobjob");
                        this.a(true, uUID);
                        break block1;
                    }
                    if (!"action.names.doggy".equals(string)) break block3;
                    this.a("animationFollowUp", "doggy");
                    this.a(true, uUID);
                    break block1;
                }
                if (!"action.names.strip".equals(string)) break block4;
                this.a("animationFollowUp", "strip");
                this.a(true, uUID);
                break block1;
            }
            if (!"action.names.dressup".equals(string)) break block1;
            this.b(fp.STRIP);
        }
    }

    protected void a(boolean bl2, UUID uUID) {
        super.a(bl2, true, uUID);
        d3.a(false);
    }

    @Override
    public void a() {
        BlockPos blockPos = this.a(this.func_180425_c());
        if (blockPos == null) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HMPH[2]);
            this.a(I18n.func_135052_a((String)"jenny.dialogue.nobedinsight", (Object[])new Object[0]));
        } else {
            this.field_70714_bg.func_85156_a((EntityAIBase)this.z);
            this.field_70714_bg.func_85156_a((EntityAIBase)this.o);
            Vec3d vec3d = new Vec3d((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p());
            int[] nArray = new int[]{0, 180, -90, 90};
            Vec3d[][] vec3dArrayArray = new Vec3d[][]{{new Vec3d(0.5, 0.0, -0.5), new Vec3d(0.0, 0.0, -1.0)}, {new Vec3d(0.5, 0.0, 1.5), new Vec3d(0.0, 0.0, 1.0)}, {new Vec3d(-0.5, 0.0, 0.5), new Vec3d(-1.0, 0.0, 0.0)}, {new Vec3d(1.5, 0.0, 0.5), new Vec3d(1.0, 0.0, 0.0)}};
            int n2 = -1;
            for (int i2 = 0; i2 < vec3dArrayArray.length; ++i2) {
                Vec3d vec3d2 = vec3d.func_178787_e(vec3dArrayArray[i2][1]);
                if (this.field_70170_p.func_180495_p(new BlockPos(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c)).func_177230_c() != Blocks.field_150350_a) continue;
                if (n2 == -1) {
                    n2 = i2;
                    continue;
                }
                double d10 = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72450_a, vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72448_b, vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72449_c);
                double d11 = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)vec3dArrayArray[i2][0]).field_72450_a, vec3d.func_178787_e((Vec3d)vec3dArrayArray[i2][0]).field_72448_b, vec3d.func_178787_e((Vec3d)vec3dArrayArray[i2][0]).field_72449_c);
                if (!(d11 < d10)) continue;
                n2 = i2;
            }
            if (n2 == -1) {
                this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HMPH[2]);
                this.a(I18n.func_135052_a((String)"jenny.dialogue.bedobscured", (Object[])new Object[0]));
                return;
            }
            Vec3d vec3d3 = vec3d.func_178787_e(vec3dArrayArray[n2][0]);
            this.a(false);
            this.b(nArray[n2]);
            this.c(new Vec3d(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c));
            this.r = this.I().floatValue();
            this.func_70661_as().func_75499_g();
            this.func_70661_as().func_75492_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, 0.35);
            this.Z = true;
            this.ad = 0;
        }
    }

    @Override
    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp3 == fp.DOGGYCUM && (fp2 == fp.DOGGYSLOW || fp2 == fp.DOGGYFAST)) {
            return;
        }
        if (fp3 == fp.CUMBLOWJOB && (fp2 == fp.THRUSTBLOWJOB || fp2 == fp.SUCKBLOWJOB)) {
            return;
        }
        if (fp3 == fp.PAIZURI_CUM && (fp2 == fp.PAIZURI_SLOW || fp2 == fp.PAIZURI_FAST)) {
            return;
        }
        super.b(fp2);
        if (fp3 != fp.STARTBLOWJOB && fp3 != fp.PAIZURI_START) {
            return;
        }
        UUID uUID = this.ae();
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = ck.a(new Vec3d(0.0, 0.0, 0.2), this.I().floatValue() + 180.0f);
        entityPlayer.func_70634_a(entityPlayer.field_70165_t + vec3d.field_72450_a, entityPlayer.field_70163_u, entityPlayer.field_70161_v + vec3d.field_72449_c);
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.SUCKBLOWJOB || fp2 == fp.THRUSTBLOWJOB) {
            this.a(0.0, 0.0, 0.0, 0.0f, 70.0f);
            return fp.CUMBLOWJOB;
        }
        if (fp2 == fp.DOGGYSLOW || fp2 == fp.DOGGYFAST) {
            return fp.DOGGYCUM;
        }
        if (fp2 == fp.PAIZURI_FAST || fp2 == fp.PAIZURI_SLOW) {
            return fp.PAIZURI_CUM;
        }
        return null;
    }

    @Override
    protected fp c(fp fp2) {
        switch (fp2) {
            case SUCKBLOWJOB: {
                return fp.THRUSTBLOWJOB;
            }
            case DOGGYSLOW: {
                return fp.DOGGYFAST;
            }
            case PAIZURI_SLOW: {
                if (this.ae) {
                    this.ae = false;
                    this.a(0.0, 0.0, (double)0.2f, 0.0f, 70.0f);
                }
                return fp.PAIZURI_FAST;
            }
        }
        return null;
    }

    @Override
    public void b() {
        this.ab = true;
    }

    @Override
    public void g() {
        this.z = new EntityAIWanderAvoidWater((EntityCreature)this, 0.35);
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.o);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.z);
    }

    @Override
    protected void U() {
        switch ((String)this.m.func_187225_a(em.h)) {
            case "strip": {
                this.s();
                this.b(fp.STRIP);
                break;
            }
            case "blowjob": {
                this.b(fp.STARTBLOWJOB);
                break;
            }
            case "boobjob": {
                if ((Integer)this.m.func_187225_a(em.D) != 0) {
                    this.b(fp.STRIP);
                    return;
                }
                this.b(fp.PAIZURI_START);
                break;
            }
            case "doggy": {
                if ((Integer)this.m.func_187225_a(em.D) != 0) {
                    this.b(fp.STRIP);
                    this.s();
                    return;
                }
                this.r();
                if (this.field_70170_p.field_72995_K) {
                    ge.b.sendToServer((IMessage)new ac(this.f()));
                    break;
                }
                this.s();
                this.a();
            }
        }
        if (this.field_70170_p.field_72995_K) {
            this.a("animationFollowUp", "");
        } else {
            this.m.func_187227_b(em.h, (Object)"");
        }
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
            return null;
        }
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
                    this.a("animation.jenny.null", true, animationEvent);
                    break;
                }
                this.a("animation.jenny.fhappy", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL && this.y() != null) {
                    this.a("animation.jenny.null", true, animationEvent);
                    break;
                }
                if (this.func_184218_aH()) {
                    this.a("animation.jenny.sit", true, animationEvent);
                    break;
                }
                if (Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v) > 0.0) {
                    switch (this.q()) {
                        case RUN: {
                            this.a("animation.jenny.run", true, animationEvent);
                            break;
                        }
                        case FAST_WALK: {
                            this.a("animation.jenny.fastwalk", true, animationEvent);
                            break;
                        }
                        case WALK: {
                            this.a("animation.jenny.walk", true, animationEvent);
                        }
                    }
                    this.field_70177_z = this.field_70759_as;
                    break;
                }
                this.a("animation.jenny.idle", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.jenny.null", true, animationEvent);
                        break block5;
                    }
                    case STRIP: {
                        this.a("animation.jenny.strip", false, animationEvent);
                        break block5;
                    }
                    case PAYMENT: {
                        this.a("animation.jenny.payment", false, animationEvent);
                        break block5;
                    }
                    case STARTBLOWJOB: {
                        this.a("animation.jenny.blowjobintro", false, animationEvent);
                        break block5;
                    }
                    case SUCKBLOWJOB: {
                        this.a("animation.jenny.blowjobsuck", true, animationEvent);
                        break block5;
                    }
                    case THRUSTBLOWJOB: {
                        this.a("animation.jenny.blowjobthrust", true, animationEvent);
                        break block5;
                    }
                    case CUMBLOWJOB: {
                        this.a("animation.jenny.blowjobcum", false, animationEvent);
                        break block5;
                    }
                    case STARTDOGGY: {
                        this.a("animation.jenny.doggygoonbed", false, animationEvent);
                        break block5;
                    }
                    case WAITDOGGY: {
                        this.a("animation.jenny.doggywait", true, animationEvent);
                        break block5;
                    }
                    case DOGGYSTART: {
                        this.a("animation.jenny.doggystart", false, animationEvent);
                        break block5;
                    }
                    case DOGGYSLOW: {
                        this.a("animation.jenny.doggyslow", true, animationEvent);
                        break block5;
                    }
                    case DOGGYFAST: {
                        this.a("animation.jenny.doggyfast_" + (this.aa ? "hard" : "soft"), true, animationEvent);
                        break block5;
                    }
                    case DOGGYCUM: {
                        this.a("animation.jenny.doggycum", false, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.jenny.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.jenny.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case RIDE: {
                        this.a("animation.jenny.ride", true, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.jenny.sit", true, animationEvent);
                        break block5;
                    }
                    case THROW_PEARL: {
                        this.a("animation.jenny.throwpearl", false, animationEvent);
                        break block5;
                    }
                    case DOWNED: {
                        this.a("animation.jenny.downed", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_START: {
                        this.a("animation.jenny.paizuri_start", false, animationEvent);
                        break block5;
                    }
                    case PAIZURI_SLOW: {
                        this.a("animation.jenny.paizuri_slow", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_FAST: {
                        this.a("animation.jenny.paizuri_fast", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_CUM: {
                        this.a("animation.jenny.paizuri_cum", false, animationEvent);
                        break block5;
                    }
                    case WAVE: {
                        this.a("animation.jenny.wave", true, animationEvent);
                        break block5;
                    }
                    case WAVE_IDLE: {
                        this.a("animation.jenny.wave_idle", true, animationEvent);
                    }
                }
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void registerControllers(AnimationData animationData) {
        if (this.C == null) {
            this.p();
        }
        AnimationController.ISoundListener iSoundListener = soundKeyframeEvent -> {
            block71 : switch (soundKeyframeEvent.sound) {
                case "attackSound": {
                    this.a(SoundEvents.field_187727_dV);
                    break;
                }
                case "attackDone": {
                    this.b(fp.NULL);
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "becomeNude": {
                    if (!this.e()) break;
                    this.a("currentModel", (Integer)this.m.func_187225_a(em.D) == 1 ? "0" : "1");
                    break;
                }
                case "stripDone": {
                    if (!((String)this.m.func_187225_a(em.h)).equals("boobjob")) {
                        this.r();
                    }
                    this.U();
                    break;
                }
                case "stripMSG1": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.hihi", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_GIGGLE));
                    break;
                }
                case "paymentMSG1": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.huh", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HUH[1]);
                    break;
                }
                case "paymentMSG2": {
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0], 0.5f);
                    String string = "<" + Minecraft.func_71410_x().field_71439_g.func_70005_c_() + "> ";
                    switch ((String)this.m.func_187225_a(em.h)) {
                        case "strip": {
                            this.b(string + I18n.func_135052_a((String)"jenny.dialogue.showBobsandveganapls", (Object[])new Object[0]), true);
                            break block71;
                        }
                        case "blowjob": {
                            this.b(string + I18n.func_135052_a((String)"jenny.dialogue.giveblowjob", (Object[])new Object[0]), true);
                            break block71;
                        }
                        case "doggy": {
                            this.b(string + I18n.func_135052_a((String)"jenny.dialogue.givesex", (Object[])new Object[0]), true);
                            break block71;
                        }
                        case "boobjob": {
                            this.b(string + I18n.func_135052_a((String)"jenny.dialogue.givebooba", (Object[])new Object[0]), true);
                            break block71;
                        }
                    }
                    this.b(string + "sex pls", true);
                    break;
                }
                case "paymentMSG3": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.hehe", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_GIGGLE));
                    break;
                }
                case "sexUiOn": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "paymentMSG4": {
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0], 0.25f);
                    break;
                }
                case "paymentDone": {
                    this.U();
                    break;
                }
                case "bjiMSG1": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.blowjobtext1", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MMM[8]);
                    this.r = this.field_70177_z + 180.0f;
                    if (!this.n()) break;
                    ds.b();
                    break;
                }
                case "bjiMSG2": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.blowjobtext2", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[8]);
                    break;
                }
                case "bjiMSG3": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.blowjobtext3", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_AFTERSESSIONMOAN[0]);
                    break;
                }
                case "bjiMSG4": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BELLJINGLE[0]);
                    break;
                }
                case "bjiMSG5": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.blowjobtext4", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HMPH[1], 0.5f);
                    if (!this.n()) break;
                    ds.b();
                    break;
                }
                case "bjiMSG6": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.blowjobtext5", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[8]);
                    break;
                }
                case "bjiMSG7": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.blowjobtext6", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_GIGGLE[4]);
                    break;
                }
                case "bjiMSG8": {
                    this.b("<" + Minecraft.func_71410_x().field_71439_g.func_70005_c_() + "> " + I18n.func_135052_a((String)"jenny.dialogue.blowjobtext7", (Object[])new Object[0]), true);
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0], 0.5f);
                    break;
                }
                case "bjiMSG9": {
                    this.h(I18n.func_135052_a((String)"jenny.dialogue.blowjobtext8", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_GIGGLE[2]);
                    break;
                }
                case "bjiMSG10": {
                    if (!this.n()) break;
                    this.a(-0.65, -0.8, -0.25, 60.0f, -3.0f);
                    break;
                }
                case "bjiMSG11": {
                    if (this.n() && d3.d) {
                        this.N();
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIPSOUND));
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "bjiMSG12": {
                    if (com.trolmastercard.sexmod.r.f.nextInt(5) == 0) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_BJMOAN));
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIPSOUND));
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "bjtMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MMM));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIPSOUND));
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
                case "doggyfastReady": {
                    if (!this.n() || !d3.d) break;
                    this.N();
                    this.aa = true;
                    break;
                }
                case "bjtReady": 
                case "paizuriReady": {
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "bjcMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_BJMOAN[1]);
                    break;
                }
                case "bjcMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_BJMOAN[7]);
                    if (!this.n()) break;
                    ds.c();
                    break;
                }
                case "bjcMSG3": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_AFTERSESSIONMOAN[1]);
                    break;
                }
                case "bjcMSG4": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[0]);
                    break;
                }
                case "bjcMSG5": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[1]);
                    break;
                }
                case "bjcMSG6": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[2]);
                    break;
                }
                case "bjcMSG7": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[3]);
                    break;
                }
                case "bjcBlackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "bjcDone": 
                case "paizuri_cumDone": 
                case "doggyCumDone": {
                    if (!this.n()) break;
                    ds.b();
                    this.r();
                    break;
                }
                case "doggyGoOnBedMSG1": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEDRUSTLE[0]);
                    this.r = this.field_70177_z;
                    break;
                }
                case "doggyGoOnBedMSG2": {
                    this.a(I18n.func_135052_a((String)"jenny.dialogue.doggytext1", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[9]);
                    break;
                }
                case "doggyGoOnBedMSG3": {
                    this.a(I18n.func_135052_a((String)"jenny.dialogue.doggytext2", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_GIGGLE[0]);
                    break;
                }
                case "doggyGoOnBedMSG4": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SLAP[0], 0.75f);
                    break;
                }
                case "doggyGoOnBedDone": {
                    ge.b.sendToServer((IMessage)new b0(this.f(), Minecraft.func_71410_x().field_71439_g.getPersistentID()));
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
                    this.a(com.trolmastercard.sexmod.c.MISC_BEDRUSTLE[1], 0.5f);
                    break;
                }
                case "doggystartMSG4": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MMM[1]);
                    if (!this.n()) break;
                    ds.b();
                    break;
                }
                case "doggystartMSG5": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.33f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MOAN));
                    break;
                }
                case "doggystartDone": {
                    this.b(fp.DOGGYSLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "doggyslowMSG1": {
                    this.aa = false;
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.33f);
                    int n2 = com.trolmastercard.sexmod.r.f.nextInt(4);
                    if (n2 == 0) {
                        n2 = com.trolmastercard.sexmod.r.f.nextInt(2);
                        if (n2 == 0) {
                            this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MMM));
                        } else {
                            this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MOAN));
                        }
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HEAVYBREATHING));
                    }
                    if (!this.n()) break;
                    ds.a(0.00666);
                    break;
                }
                case "doggyslowMSG2": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING), 0.5f);
                    break;
                }
                case "doggyfastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (this.n()) {
                        ds.a(0.02);
                    }
                    ++this.ag;
                    if (this.ag % 2 == 0) {
                        int n3 = com.trolmastercard.sexmod.r.f.nextInt(2);
                        if (n3 == 0) {
                            this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MOAN));
                            break;
                        }
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HEAVYBREATHING));
                        break;
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_AHH));
                    break;
                }
                case "doggyfastDone": {
                    this.aa = false;
                    this.b(fp.DOGGYSLOW);
                    break;
                }
                case "doggycumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.MISC_CUMINFLATION[0], 2.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 2.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MOAN));
                    break;
                }
                case "doggycumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HEAVYBREATHING[4]);
                    break;
                }
                case "doggycumMSG3": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HEAVYBREATHING[5]);
                    break;
                }
                case "doggycumMSG4": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HEAVYBREATHING[6]);
                    break;
                }
                case "doggycumMSG5": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HEAVYBREATHING[7]);
                    break;
                }
                case "pearl": {
                    ge.b.sendToServer((IMessage)new gg(this.f()));
                    break;
                }
                case "boobjob_camera": {
                    UUID uUID = Minecraft.func_71410_x().field_71439_g.getPersistentID();
                    if (!uUID.equals(this.field_70170_p.func_72890_a((Entity)this.af(), 2.0).getPersistentID())) break;
                    this.r = this.field_70170_p.func_152378_a((UUID)uUID).field_70177_z;
                    this.e(uUID);
                    if (this.ae) break;
                    this.ae = true;
                    this.a(-0.7, -0.6, 0.2, 60.0f, -3.0f);
                    break;
                }
                case "paizuri_startDone": {
                    if (!this.n()) break;
                    this.b(fp.PAIZURI_SLOW);
                    ds.b();
                    ds.d();
                    break;
                }
                case "paizuriFastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    if (this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MMM));
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_AHH));
                    }
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "paizuriSlowMSG1": 
                case "paizuriStartMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "paizuri_fastDone": {
                    this.b(fp.PAIZURI_SLOW);
                    if (!this.n() || this.ae) break;
                    this.ae = true;
                    this.a(-0.7, -0.6, 0.2, 60.0f, -3.0f);
                    break;
                }
                case "paizuri_startStep": {
                    IBlockState iBlockState = this.field_70170_p.func_180495_p(this.func_180425_c().func_177973_b(new Vec3i(0, 1, 0)));
                    this.a(iBlockState.func_177230_c().getSoundType(iBlockState, this.field_70170_p, this.func_180425_c(), (Entity)this).func_185844_d());
                    break;
                }
                case "paizuri_cumStart": {
                    if (!this.n() || this.ae) break;
                    this.a(-0.7, -0.6, 0.2, 60.0f, -3.0f);
                    break;
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

