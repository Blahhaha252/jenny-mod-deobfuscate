/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.controller.AnimationController$ISoundListener
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.b0;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.cq;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.r;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class ec
extends ei {
    boolean ap = false;
    int aq = 0;

    protected ec(World world) {
        super(world);
    }

    public ec(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public float i() {
        return 1.6f;
    }

    public float func_70047_e() {
        return 1.64f;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public at a(int n2) {
        return new cq();
    }

    @Override
    public String c(int n2) {
        return "textures/entity/slime/hand.png";
    }

    @Override
    public void b(String string, UUID uUID) {
        block0: {
            if (!"action.names.blowjob".equals(string)) break block0;
            this.a(0, fp.SUCKBLOWJOB);
            this.b(fp.SUCKBLOWJOB);
            this.b(uUID);
        }
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        ec.a(entityPlayer, this, new String[]{"action.names.blowjob"}, false);
        return true;
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
    protected fp c(fp fp2) {
        if (fp2 == fp.SUCKBLOWJOB) {
            return fp.THRUSTBLOWJOB;
        }
        if (fp2 == fp.DOGGYSLOW) {
            return fp.DOGGYFAST;
        }
        return null;
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
    public void func_70619_bc() {
        super.func_70619_bc();
        if (this.y() != fp.WAITDOGGY) {
            return;
        }
        EntityPlayer entityPlayer = this.j();
        if (entityPlayer == null) {
            return;
        }
        if (entityPlayer.func_174791_d().func_72438_d(this.w()) > 1.0) {
            return;
        }
        ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        this.e(entityPlayer.getPersistentID());
        entityPlayer.field_70177_z = this.I().floatValue();
        this.r = this.I().floatValue();
        entityPlayer.func_70107_b(this.w().field_72450_a, this.w().field_72448_b, this.w().field_72449_c);
        entityPlayer.func_191958_b(0.0f, 0.0f, 0.0f, 0.0f);
        this.a(0.0, 0.0, 0.4, 0.0f, 60.0f);
        this.b(fp.DOGGYSTART);
        entityPlayer.func_189654_d(true);
        entityPlayer.field_70145_X = true;
        EntityPlayer entityPlayer2 = this.field_70170_p.func_152378_a(this.m());
        entityPlayer2.func_189654_d(true);
        entityPlayer.field_70145_X = true;
        entityPlayer.field_71075_bZ.field_75100_b = true;
        entityPlayer2.field_71075_bZ.field_75100_b = true;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() == fp.NULL || !this.y().autoBlink) {
                    this.a("animation.slime.null", true, animationEvent);
                    break;
                }
                this.a("animation.slime.fhappy", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.slime.null", true, animationEvent);
                    break;
                }
                if (this.ak) {
                    this.a("animation.slime.sit", true, animationEvent);
                    break;
                }
                if (this.E.getCurrentAnimation() != null && this.E.getCurrentAnimation().animationName.contains("fly") && this.af) {
                    boolean bl = this.ap = !this.ap;
                }
                if (!this.af) {
                    this.a("animation.slime.fly" + (this.ap ? "2" : ""), true, animationEvent);
                    break;
                }
                if (Math.abs(this.ao.x) + Math.abs(this.ao.y) > 0.0f) {
                    if (this.aj) {
                        this.a("animation.slime.run", true, animationEvent);
                        break;
                    }
                    if (this.ao.y >= -0.1f) {
                        this.a("animation.slime.walk", true, animationEvent);
                        break;
                    }
                    this.a("animation.slime.backwards_walk", true, animationEvent);
                    break;
                }
                this.a("animation.slime.idle", true, animationEvent);
                break;
            }
            case "action": {
                if (this.y() == fp.NULL) {
                    this.a("animation.slime.null", true, animationEvent);
                    break;
                }
                switch (this.y()) {
                    case UNDRESS: {
                        this.a("animation.slime.undress", false, animationEvent);
                        break block5;
                    }
                    case DRESS: {
                        this.a("animation.slime.dress", false, animationEvent);
                        break block5;
                    }
                    case STRIP: {
                        this.a("animation.slime.strip", false, animationEvent);
                        break block5;
                    }
                    case SUCKBLOWJOB: {
                        this.a("animation.slime.blowjobsuck", true, animationEvent);
                        break block5;
                    }
                    case THRUSTBLOWJOB: {
                        this.a("animation.slime.blowjobthrust", true, animationEvent);
                        break block5;
                    }
                    case CUMBLOWJOB: {
                        this.a("animation.slime.blowjobcum", false, animationEvent);
                        break block5;
                    }
                    case STARTDOGGY: {
                        this.a("animation.slime.doggygoonbed", false, animationEvent);
                        break block5;
                    }
                    case WAITDOGGY: {
                        this.a("animation.slime.doggywait", true, animationEvent);
                        break block5;
                    }
                    case DOGGYSTART: {
                        this.a("animation.slime.doggystart", false, animationEvent);
                        break block5;
                    }
                    case DOGGYSLOW: {
                        this.a("animation.slime.doggyslow", true, animationEvent);
                        break block5;
                    }
                    case DOGGYFAST: {
                        this.a("animation.slime.doggyfast", true, animationEvent);
                        break block5;
                    }
                    case DOGGYCUM: {
                        this.a("animation.slime.doggycum", false, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.slime.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.slime.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case RIDE: {
                        this.a("animation.slime.ride", true, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.slime.sit", true, animationEvent);
                    }
                }
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        if (this.C == null) {
            this.p();
        }
        AnimationController.ISoundListener iSoundListener = soundKeyframeEvent -> {
            String string;
            switch (string = soundKeyframeEvent.sound) {
                case "attackDone": {
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "undress": {
                    if (!this.e()) break;
                    this.m.func_187227_b(D, (Object)0);
                    this.r();
                    break;
                }
                case "dress": {
                    if (!this.e()) break;
                    this.m.func_187227_b(D, (Object)1);
                    this.b((fp)null);
                    this.r();
                    break;
                }
                case "sexUiOn": {
                    if (!this.n()) break;
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
                case "doggyfastReady": {
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "bjtReady": {
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
                    break;
                }
                case "doggyGoOnBedMSG1": {
                    this.a(SoundEvents.field_187886_fs);
                    this.r = this.field_70177_z;
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
                    this.a(SoundEvents.field_187886_fs, 0.25f);
                    break;
                }
                case "doggystartMSG4": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS), 1.5f);
                    if (!this.n()) break;
                    ds.b();
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
                    ds.a(0.00666);
                    break;
                }
                case "doggyfastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (this.n()) {
                        ds.a(0.02);
                    }
                    ++this.aq;
                    if (this.aq % 2 == 0) {
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
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.s);
        animationData.addAnimationController(this.E);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
