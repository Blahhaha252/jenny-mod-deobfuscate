/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.controller.AnimationController$ISoundListener
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.bf;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
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

public class ed
extends ei {
    int ar = 0;
    boolean aq = false;
    boolean ap = false;
    boolean as = false;

    protected ed(World world) {
        super(world);
    }

    public ed(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public float i() {
        return 1.6f;
    }

    public float func_70047_e() {
        return 1.34f;
    }

    @Override
    public at a(int n2) {
        return new bf();
    }

    @Override
    public String c(int n2) {
        return "textures/entity/cat/hand.png";
    }

    @Override
    public void b(String string, UUID uUID) {
        block1: {
            if ("action.names.touchboobs".equals(string)) {
                this.a(0, fp.TOUCH_BOOBS_INTRO);
                this.b(fp.TOUCH_BOOBS_INTRO);
                this.m.func_187227_b(D, (Object)0);
                this.b(uUID);
            }
            if (!"action.names.headpat".equals(string)) break block1;
            this.b(fp.HEAD_PAT);
            this.b(uUID);
        }
    }

    @Override
    public void u() {
        this.b(fp.WAIT_CAT);
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        ed.a(entityPlayer, this, new String[]{"action.names.touchboobs", "action.names.headpat"}, false);
        return true;
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.COWGIRL_SITTING_CUM && (fp2 == fp.COWGIRL_SITTING_SLOW || fp2 == fp.COWGIRL_SITTING_FAST)) {
            return;
        }
        if (this.y() == fp.TOUCH_BOOBS_CUM && (fp2 == fp.TOUCH_BOOBS_FAST || fp2 == fp.TOUCH_BOOBS_SLOW)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
        if (fp.WAIT_CAT.equals((Object)this.y())) {
            this.a();
        } else {
            this.ar = 0;
        }
    }

    void a() {
        EntityPlayer entityPlayer = this.j();
        if (entityPlayer == null) {
            return;
        }
        if (entityPlayer.func_70011_f(this.field_70165_t, this.w().field_72448_b, this.field_70161_v) > 1.25) {
            return;
        }
        if (this.field_70170_p.field_72995_K) {
            this.a(entityPlayer, this.ar);
        } else if (this.ar == 25) {
            this.e(entityPlayer.getPersistentID());
            entityPlayer.func_191958_b(0.0f, 0.0f, 0.0f, 0.0f);
            entityPlayer.func_70634_a(this.func_174791_d().field_72450_a, this.w().field_72448_b, this.func_174791_d().field_72449_c);
            this.b(fp.COWGIRL_SITTING_INTRO);
            entityPlayer.func_70034_d(this.I().floatValue() + 180.0f);
            entityPlayer.field_70177_z = this.I().floatValue() + 180.0f;
            entityPlayer.field_70126_B = this.I().floatValue() + 180.0f;
            this.r = this.I().floatValue() + 180.0f;
            this.a(0.0, -0.075f, -0.7109375, 0.0f, 0.0f);
            this.m.func_187227_b(D, (Object)0);
        }
        ++this.ar;
    }

    @SideOnly(value=Side.CLIENT)
    void a(EntityPlayer entityPlayer, int n2) {
        block1: {
            EntityPlayerSP entityPlayerSP;
            if (n2 == 0 && (entityPlayerSP = Minecraft.func_71410_x().field_71439_g).getPersistentID().equals(entityPlayer.getPersistentID())) {
                fh.b();
                entityPlayerSP.func_70016_h(0.0, 0.0, 0.0);
                d3.a(false);
            }
            if (n2 != 25 || !(entityPlayerSP = Minecraft.func_71410_x().field_71439_g).getPersistentID().equals(entityPlayer.getPersistentID())) break block1;
            Minecraft.func_71410_x().field_71474_y.field_74320_O = 2;
        }
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.TOUCH_BOOBS_SLOW) {
            return fp.TOUCH_BOOBS_FAST;
        }
        if (fp2 == fp.COWGIRL_SITTING_SLOW) {
            return fp.COWGIRL_SITTING_FAST;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.TOUCH_BOOBS_SLOW || fp2 == fp.TOUCH_BOOBS_FAST) {
            return fp.TOUCH_BOOBS_CUM;
        }
        if (fp2 == fp.COWGIRL_SITTING_FAST || fp2 == fp.COWGIRL_SITTING_SLOW) {
            return fp.COWGIRL_SITTING_CUM;
        }
        return null;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
                    this.a("animation.cat.null", true, animationEvent);
                    break;
                }
                this.a("animation.cat.blink", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.cat.null", true, animationEvent);
                    break;
                }
                if (this.ak) {
                    this.a("animation.cat.sit", true, animationEvent);
                    break;
                }
                if (this.E.getCurrentAnimation() != null && this.E.getCurrentAnimation().animationName.contains("fly") && this.af) {
                    boolean bl = this.aq = !this.aq;
                }
                if (!this.af) {
                    this.a("animation.cat.fly" + (this.aq ? "2" : ""), true, animationEvent);
                    break;
                }
                if (Math.abs(this.ao.x) + Math.abs(this.ao.y) > 0.0f) {
                    if (this.aj) {
                        this.E.setAnimationSpeed(1.5);
                        this.a("animation.cat.run", true, animationEvent);
                        break;
                    }
                    if (this.ao.y >= -0.1f) {
                        this.E.setAnimationSpeed(2.0);
                        this.a("animation.cat.fastwalk", true, animationEvent);
                        break;
                    }
                    this.E.setAnimationSpeed(2.0);
                    this.a("animation.cat.backwards_walk", true, animationEvent);
                    break;
                }
                this.a("animation.cat.idle", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.cat.null", true, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.cat.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case RIDE: 
                    case SIT: {
                        this.a("animation.cat.sit", true, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.cat.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case THROW_PEARL: {
                        this.a("animation.cat.throwpearl", true, animationEvent);
                        break block5;
                    }
                    case DOWNED: {
                        this.a("animation.cat.downed", true, animationEvent);
                        break block5;
                    }
                    case FISHING_START: {
                        this.a("animation.cat.start_fishing", false, animationEvent);
                        break block5;
                    }
                    case FISHING_IDLE: {
                        this.a("animation.cat.idle_fishing", true, animationEvent);
                        break block5;
                    }
                    case FISHING_EAT: {
                        this.a("animation.cat.eat_fishing", false, animationEvent);
                        break block5;
                    }
                    case FISHING_THROW_AWAY: {
                        this.a("animation.cat.throw_away", false, animationEvent);
                        break block5;
                    }
                    case PAYMENT: {
                        this.a("animation.cat.payment", false, animationEvent);
                        break block5;
                    }
                    case TOUCH_BOOBS_INTRO: {
                        this.a("animation.cat.touch_boobs_intro", false, animationEvent);
                        break block5;
                    }
                    case TOUCH_BOOBS_SLOW: {
                        this.a("animation.cat.touch_boobs_slow" + (this.ap ? "1" : ""), true, animationEvent);
                        break block5;
                    }
                    case TOUCH_BOOBS_FAST: {
                        this.a("animation.cat.touch_boobs_fast", true, animationEvent);
                        break block5;
                    }
                    case TOUCH_BOOBS_CUM: {
                        this.a("animation.cat.touch_boobs_cum", false, animationEvent);
                        break block5;
                    }
                    case WAIT_CAT: {
                        this.a("animation.cat.wait", false, animationEvent);
                        break block5;
                    }
                    case COWGIRL_SITTING_INTRO: {
                        this.a("animation.cat.sitting_intro", false, animationEvent);
                        break block5;
                    }
                    case COWGIRL_SITTING_SLOW: {
                        this.a("animation.cat.sitting_slow", true, animationEvent);
                        break block5;
                    }
                    case COWGIRL_SITTING_FAST: {
                        this.a("animation.cat.sitting_fast", true, animationEvent);
                        break block5;
                    }
                    case COWGIRL_SITTING_CUM: {
                        this.a("animation.cat.sitting_cum", true, animationEvent);
                        break block5;
                    }
                    case HEAD_PAT: {
                        this.a("animation.cat.head_pat", true, animationEvent);
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
            switch (soundKeyframeEvent.sound) {
                case "attackDone": {
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "idleDone": {
                    this.as = this.func_70681_au().nextInt(10) == 0;
                    break;
                }
                case "idle2Done": {
                    this.as = false;
                    break;
                }
                case "pearl": {
                    ge.b.sendToServer((IMessage)new gg(this.f()));
                    break;
                }
                case "paymentMSG1": {
                    this.a(this.ae(), "Here, I know u like fish and yea.. these are for you");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0]);
                    break;
                }
                case "paymentMSG2": {
                    this.a("huh~?");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HUH);
                    break;
                }
                case "paymentMSG3": {
                    this.a("nyyyaaaa~ :D");
                    int[] nArray = new int[]{1, 7, 10, 11};
                    int n2 = nArray[this.func_70681_au().nextInt(nArray.length)];
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_CUTENYA[n2]);
                    break;
                }
                case "paymentMSG4": {
                    this.a("tankuuuu owowowo");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_OWO);
                    break;
                }
                case "paymentDone": {
                    if (this.e()) {
                        this.U();
                    }
                    this.n = 1.0f;
                    break;
                }
                case "breath": 
                case "rod_breath": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_LIGHTBREATHING);
                    break;
                }
                case "happyOh": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HAPPYOH);
                    break;
                }
                case "cutenya3": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_CUTENYA[3]);
                    break;
                }
                case "cutenya2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_CUTENYA[2]);
                    break;
                }
                case "huh": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HUH);
                    break;
                }
                case "hmph": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HMPH);
                    break;
                }
                case "hehe": 
                case "giggle": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE);
                    break;
                }
                case "singing": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_SINGING);
                    break;
                }
                case "touch_boobsMSG1": {
                    this.a("comon~ touch me hihi~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE);
                    break;
                }
                case "touch": {
                    this.a(com.trolmastercard.sexmod.c.MISC_TOUCH);
                    break;
                }
                case "jump": {
                    this.a(com.trolmastercard.sexmod.c.MISC_JUMP[0], 0.2f);
                    break;
                }
                case "horninya": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA);
                    break;
                }
                case "horninya2": 
                case "touch_boobs_cumMSG3": 
                case "sitting_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA[1]);
                    this.a(com.trolmastercard.sexmod.c.MISC_CUMINFLATION[0], 5.0f);
                    break;
                }
                case "moan": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MOAN));
                    break;
                }
                case "touch_boobs_introDone": {
                    this.b(fp.TOUCH_BOOBS_SLOW);
                    if (!this.n()) break;
                    ds.b();
                    ds.d();
                    d3.a(false);
                    break;
                }
                case "touch_boobs_slowDone": {
                    if (this.ap) {
                        this.ap = false;
                        break;
                    }
                    this.ap = Math.random() < 0.5;
                    break;
                }
                case "addCumSlow": {
                    if (!this.n()) break;
                    ds.a(0.02f);
                    break;
                }
                case "addCumFast": {
                    if (!this.n()) break;
                    ds.a(0.04f);
                    break;
                }
                case "fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.TOUCH_BOOBS_SLOW);
                    break;
                }
                case "moanOrNya": {
                    if (Math.random() > 0.5) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MOAN));
                        break;
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA));
                    break;
                }
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "touch_boobs_cumDone": {
                    if (!this.n()) break;
                    ds.b();
                    this.r();
                    break;
                }
                case "resetGirl": {
                    if (!this.n()) break;
                    this.r();
                    break;
                }
                case "touch_boobs_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA[3]);
                    break;
                }
                case "touch_boobs_cumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA[9]);
                    break;
                }
                case "call_playerMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE);
                    this.a("come here - big guy hehe~");
                    break;
                }
                case "pounding": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    break;
                }
                case "sitting_introMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE);
                    this.a("hehe~");
                    break;
                }
                case "sitting_introDone": {
                    if (!this.n()) break;
                    this.b(fp.COWGIRL_SITTING_SLOW);
                    ds.b();
                    ds.d();
                    break;
                }
                case "sitting_slowMSG1": {
                    if (this.func_70681_au().nextBoolean()) {
                        if (this.func_70681_au().nextBoolean()) {
                            this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA));
                            break;
                        }
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MOAN));
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_LIGHTBREATHING));
                    }
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "sitting_fastMSG1": {
                    if (this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA));
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MOAN));
                    }
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "sitting_fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.COWGIRL_SITTING_SLOW);
                    Vec3d vec3d = new Vec3d(0.0, (double)-0.075f, -0.7109375);
                    Vec3d vec3d2 = ck.a(vec3d, this.I().floatValue() + 180.0f);
                    Minecraft.func_71410_x().field_71439_g.func_70107_b(this.o().field_72450_a + vec3d2.field_72450_a, this.o().field_72448_b - 0.0 + vec3d2.field_72448_b, this.o().field_72449_c + vec3d2.field_72449_c);
                    break;
                }
                case "sitting_fastTp": {
                    if (!this.n()) break;
                    Vec3d vec3d = new Vec3d(0.0, -0.160625, -0.9925);
                    Vec3d vec3d3 = ck.a(vec3d, this.I().floatValue() + 180.0f);
                    Minecraft.func_71410_x().field_71439_g.func_70107_b(this.o().field_72450_a + vec3d3.field_72450_a, this.o().field_72448_b - 0.0 + vec3d3.field_72448_b, this.o().field_72449_c + vec3d3.field_72449_c);
                    break;
                }
                case "headpatMSG1": {
                    this.a("huh?~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HUH);
                    break;
                }
                case "headpatMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MMM);
                    break;
                }
                case "headpatMSG3": {
                    this.a("nya~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA[0]);
                }
            }
        };
        this.E.transitionLengthTicks = 10.0;
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
