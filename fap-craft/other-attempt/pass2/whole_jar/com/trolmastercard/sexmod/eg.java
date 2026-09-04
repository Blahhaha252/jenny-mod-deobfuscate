/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.go;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
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

public class eg
extends ei {
    int ar = -1;
    boolean ap = false;
    int aq = 1;

    public eg(World world) {
        super(world);
    }

    public eg(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public float i() {
        return 1.5f;
    }

    public float func_70047_e() {
        return 1.5f;
    }

    @Override
    public void u() {
    }

    @Override
    public boolean a(String string) {
        if ("anal".equals(string)) {
            this.b(fp.ANAL_PREPARE);
            this.f(0);
            return true;
        }
        if ("doggy".equals(string)) {
            this.b(fp.SITDOWN);
            this.f(0);
            return true;
        }
        return false;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void H() {
        em.a((EntityPlayer)Minecraft.func_71410_x().field_71439_g, this, new String[]{"anal", "doggy"}, false);
    }

    @Override
    public void b(String string, UUID uUID) {
        block0: {
            if (!"action.names.headpat".equals(string)) break block0;
            this.b(uUID);
            this.b(fp.HEAD_PAT);
            this.a(this.ah(), fp.HEAD_PAT);
        }
    }

    @Override
    public at a(int n2) {
        return new go();
    }

    @Override
    public String c(int n2) {
        return "textures/entity/bia/hand.png";
    }

    @Override
    public float T() {
        return 35.0f;
    }

    @Override
    public float ai() {
        return 140.0f;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        em.a(entityPlayer, this, new String[]{"action.names.headpat"}, false);
        return true;
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.ANAL_CUM && (fp2 == fp.ANAL_FAST || fp2 == fp.ANAL_SLOW)) {
            return;
        }
        if (this.y() == fp.PRONE_DOGGY_CUM && (fp2 == fp.PRONE_DOGGY_HARD || fp2 == fp.PRONE_DOGGY_SOFT)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.ANAL_SLOW) {
            return fp.ANAL_FAST;
        }
        if (fp2 == fp.PRONE_DOGGY_INTRO) {
            return fp.PRONE_DOGGY_INSERT;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.ANAL_SLOW || fp2 == fp.ANAL_FAST) {
            return fp.ANAL_CUM;
        }
        if (fp2 == fp.PRONE_DOGGY_SOFT || fp2 == fp.PRONE_DOGGY_HARD) {
            return fp.PRONE_DOGGY_CUM;
        }
        return null;
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
        this.a();
    }

    @Override
    protected void V() {
        super.V();
        this.ar = -1;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean a(EntityPlayer entityPlayer) {
        return Minecraft.func_71410_x().field_71439_g.getPersistentID().equals(entityPlayer.getPersistentID());
    }

    void a() {
        float f10;
        fp fp2 = this.y();
        if (fp2 != fp.ANAL_WAIT && fp2 != fp.SITDOWNIDLE) {
            return;
        }
        EntityPlayer entityPlayer = this.j();
        if (entityPlayer == null) {
            return;
        }
        if (entityPlayer.func_70032_d((Entity)this) > 1.0f) {
            return;
        }
        if (this.field_70170_p.field_72995_K && !this.a(entityPlayer)) {
            return;
        }
        if (this.ar == -1) {
            if (this.field_70170_p.field_72995_K) {
                fh.b();
                d3.a(false);
            } else {
                this.e(entityPlayer.getPersistentID());
            }
            this.ar = em.j;
            return;
        }
        if (--this.ar > 0) {
            return;
        }
        this.ar = -1;
        entityPlayer.field_70145_X = true;
        entityPlayer.func_189654_d(true);
        if (fp2 == fp.ANAL_WAIT) {
            if (!this.field_70170_p.field_72995_K) {
                this.b(fp.ANAL_START);
                Vec3d vec3d = this.o().func_178787_e(ck.a(-0.3, -1.0, -0.5, this.I().floatValue()));
                entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
            } else if (this.n()) {
                ds.d();
            }
            return;
        }
        entityPlayer.field_70177_z = f10 = this.I().floatValue();
        entityPlayer.field_70125_A = 60.0f;
        if (!this.field_70170_p.field_72995_K) {
            this.f(0);
            this.b(fp.PRONE_DOGGY_INTRO);
            Vec3d vec3d = this.o();
            Vec3d vec3d2 = vec3d.func_178787_e(ck.a(0.0, 0.0, 1.0, f10));
            this.c(vec3d2);
            EntityPlayer entityPlayer2 = this.k();
            if (entityPlayer2 != null) {
                entityPlayer2.func_70634_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c);
            }
            Vec3d vec3d3 = vec3d.func_178787_e(ck.a(0.0, 1.1875 - (double)entityPlayer.func_70047_e(), 0.5, f10));
            entityPlayer.func_70634_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
            this.a(true);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void ag() {
        super.ag();
        if (this.y() != fp.PRONE_DOGGY_HARD) {
            return;
        }
        int n2 = this.aq;
        do {
            this.aq = this.func_70681_au().nextInt(3) + 1;
        } while (n2 == this.aq);
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
                    this.a("animation.bia.null", true, animationEvent);
                    break;
                }
                this.a("animation.bia.fhappy", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.bia.null", true, animationEvent);
                    break;
                }
                if (this.ak) {
                    this.a("animation.bia.sit", true, animationEvent);
                    break;
                }
                if (this.E.getCurrentAnimation() != null && this.E.getCurrentAnimation().animationName.contains("fly") && this.af) {
                    boolean bl2 = this.ap = !this.ap;
                }
                if (!this.af) {
                    this.a("animation.bia.fly" + (this.ap ? "2" : ""), true, animationEvent);
                    break;
                }
                if (Math.abs(this.ao.x) + Math.abs(this.ao.y) > 0.0f) {
                    if (this.aj) {
                        this.E.setAnimationSpeed(1.2);
                        this.a("animation.bia.run", true, animationEvent);
                        break;
                    }
                    if (this.ao.y >= -0.1f) {
                        this.E.setAnimationSpeed(1.2);
                        this.a("animation.bia.fastwalk", true, animationEvent);
                        break;
                    }
                    this.E.setAnimationSpeed(1.2);
                    this.a("animation.bia.backwards_walk", true, animationEvent);
                    break;
                }
                this.a("animation.bia.idle", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.bia.null", true, animationEvent);
                        break block5;
                    }
                    case STRIP: {
                        this.a("animation.bia.strip", false, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.bia.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.bia.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case RIDE: {
                        this.a("animation.bia.ride", true, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.bia.sit", true, animationEvent);
                        break block5;
                    }
                    case THROW_PEARL: {
                        this.a("animation.bia.throwpearl", false, animationEvent);
                        break block5;
                    }
                    case DOWNED: {
                        this.a("animation.bia.downed", true, animationEvent);
                        break block5;
                    }
                    case TALK_HORNY: {
                        this.a("animation.bia.talk_horny", false, animationEvent);
                        break block5;
                    }
                    case TALK_IDLE: {
                        this.a("animation.bia.talk_idle", true, animationEvent);
                        break block5;
                    }
                    case TALK_RESPONSE: {
                        this.a("animation.bia.talk_response", true, animationEvent);
                        break block5;
                    }
                    case ANAL_PREPARE: {
                        this.a("animation.bia.anal_prepare", false, animationEvent);
                        break block5;
                    }
                    case ANAL_WAIT: {
                        this.a("animation.bia.anal_wait", true, animationEvent);
                        break block5;
                    }
                    case ANAL_START: {
                        this.a("animation.bia.anal_start", true, animationEvent);
                        break block5;
                    }
                    case ANAL_SLOW: {
                        this.a("animation.bia.anal_slow", true, animationEvent);
                        break block5;
                    }
                    case ANAL_FAST: {
                        this.a("animation.bia.anal_fast", true, animationEvent);
                        break block5;
                    }
                    case ANAL_CUM: {
                        this.a("animation.bia.anal_cum", false, animationEvent);
                        break block5;
                    }
                    case HEAD_PAT: {
                        this.a("animation.bia.headpat", false, animationEvent);
                        break block5;
                    }
                    case SITDOWN: {
                        this.a("animation.bia.sitdown", false, animationEvent);
                        break block5;
                    }
                    case SITDOWNIDLE: {
                        this.a("animation.bia.sitdownidle", true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_INTRO: {
                        this.a("animation.bia.prone_doggy_intro", true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_INSERT: {
                        this.a("animation.bia.prone_doggy_insert", true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_SOFT: {
                        this.a("animation.bia.prone_doggy_soft", true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_HARD: {
                        this.a("animation.bia.prone_doggy_hard" + this.aq, true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_CUM: {
                        this.a("animation.bia.prone_doggy_cum", true, animationEvent);
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
            switch (soundKeyframeEvent.sound) {
                case "attackDone": {
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "stripMSG1": {
                    this.h("Hihi~");
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE));
                    break;
                }
                case "sexUiOn": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "pearl": {
                    ge.b.sendToServer((IMessage)new gg(this.f()));
                    break;
                }
                case "talk_hornyMSG1": {
                    this.a("Heyaaa~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HEY[3]);
                    break;
                }
                case "talk_hornyMSG2": {
                    this.a("I am Hornyyyyy~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE[2]);
                    break;
                }
                case "talk_hornyMSG3": {
                    this.a("So...");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[0]);
                    break;
                }
                case "talk_hornyMSG4": {
                    this.a("Are we gonna have some fun nyaa?");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[0]);
                    break;
                }
                case "talk_responseMSG1": {
                    this.a("Huh?!...");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[2]);
                    break;
                }
                case "talk_responseMSG2": {
                    this.a("I... uhm...");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[1]);
                    break;
                }
                case "talk_responseMSG3": {
                    this.a("yes~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE[0]);
                    break;
                }
                case "talk_responseDone": {
                    this.s();
                    if ((Integer)this.m.func_187225_a(em.D) != 0) {
                        this.b(fp.STRIP);
                        break;
                    }
                    this.U();
                    break;
                }
                case "anal_prepareMSG1": {
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0]);
                    break;
                }
                case "anal_prepareMSG2": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEDRUSTLE[0]);
                    break;
                }
                case "anal_prepareDone": {
                    this.b(fp.ANAL_WAIT);
                    if (!this.n()) break;
                    ds.b();
                    break;
                }
                case "anal_startMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[3]);
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING[34]);
                    break;
                }
                case "anal_fastMSG1": {
                    if (this.n()) {
                        ds.a(0.02);
                    }
                    if (this.n()) {
                        ds.a(0.02);
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.5f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_BIA_AHH));
                    break;
                }
                case "anal_slowMSG1": 
                case "anal_startMSG2": {
                    if (this.n()) {
                        ds.a(0.02);
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.5f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_BIA_AHH));
                    break;
                }
                case "anal_fastDone": {
                    if (!this.n() || d3.d) break;
                }
                case "anal_startDone": {
                    this.b(fp.ANAL_SLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "anal_cumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_BIA_AHH));
                    break;
                }
                case "anal_cumBlackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "doggy_cumDone": 
                case "anal_cumDone": {
                    if (this.n()) {
                        ds.b();
                    }
                    this.r();
                    break;
                }
                case "headpatMSG1": {
                    this.a("Ooh headpats!");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[0]);
                    break;
                }
                case "headpatMSG2": {
                    this.a("Hmmm.... :D");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[0]);
                    break;
                }
                case "headpatMSG3": {
                    this.a("huh...?");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[0]);
                    break;
                }
                case "headpatMSG4": {
                    this.a("Tanku hehe");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE[1]);
                    break;
                }
                case "headpatDone": {
                    if (!this.e()) break;
                    this.r();
                    break;
                }
                case "sitdownMSG1": {
                    this.a("come here big boy~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH);
                    break;
                }
                case "sitdownDone": {
                    this.b(fp.SITDOWNIDLE);
                    break;
                }
                case "slide": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_SLIDE));
                    if (!this.n()) break;
                    ds.a(0.005);
                    break;
                }
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING);
                    break;
                }
                case "doggyMoan": {
                    this.a(this.func_70681_au().nextBoolean() ? com.trolmastercard.sexmod.c.GIRLS_BIA_AHH : com.trolmastercard.sexmod.c.GIRLS_BIA_MMM);
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "doggySwitch": {
                    if (!this.n() || !d3.d) break;
                    this.b(fp.PRONE_DOGGY_HARD);
                    break;
                }
                case "doggyReset": {
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_INSERTS, 6.0f);
                    break;
                }
                case "orgasm1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[6]);
                    break;
                }
                case "orgasm2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[7]);
                    break;
                }
                case "openSexUI": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
        animationData.addAnimationController(this.C);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

