/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
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

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.a8;
import com.trolmastercard.sexmod.ac;
import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.cf;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.g4;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.n;
import com.trolmastercard.sexmod.r;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
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

public class ee
extends ei {
    boolean ar = false;
    boolean aq = false;
    int ap = 1;

    protected ee(World world) {
        super(world);
    }

    public ee(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public float i() {
        return 2.05f;
    }

    public float func_70047_e() {
        return this.a() ? 1.53f : 1.9f;
    }

    @Override
    public void u() {
        this.b(fp.SITDOWN);
    }

    @Override
    public void b(String string, UUID uUID) {
        block0: {
            if (!"Face fuck".equals(string)) break block0;
            this.b(uUID);
            this.b(fp.CARRY_INTRO);
            this.a(this.ah(), fp.CARRY_INTRO);
        }
    }

    @Override
    public at a(int n2) {
        return new cf();
    }

    @Override
    public String c(int n2) {
        if (n2 == 0) {
            return "textures/entity/ellie/hand_nude.png";
        }
        return "textures/entity/ellie/hand.png";
    }

    @Override
    public boolean p() {
        return true;
    }

    @Override
    public void a(String string, UUID uUID) {
        if ("action.names.cowgirl".equals(string)) {
            this.a("animationFollowUp", "Cowgirl");
            return;
        }
        if ("action.names.missionary".equals(string)) {
            this.a("animationFollowUp", "Missionary");
            return;
        }
        if (!((Optional)this.m.func_187225_a(ai)).isPresent()) {
            return;
        }
        ge.b.sendToServer((IMessage)new g4(string, uUID, (UUID)((Optional)this.m.func_187225_a(ai)).get(), this.ab));
        this.ab = true;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        ee.a(entityPlayer, this, new String[]{"Face fuck"}, false);
        return true;
    }

    void c(EntityPlayer entityPlayer) {
        ee.a(entityPlayer, this, new String[]{"action.names.cowgirl", "action.names.missionary"}, false);
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp3 == fp.MISSIONARY_CUM && (fp2 == fp.MISSIONARY_FAST || fp2 == fp.MISSIONARY_SLOW)) {
            return;
        }
        if (fp3 == fp.COWGIRLCUM && (fp2 == fp.COWGIRLSLOW || fp2 == fp.COWGIRLFAST)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.COWGIRLSLOW) {
            return fp.COWGIRLFAST;
        }
        if (fp2 == fp.MISSIONARY_SLOW) {
            return fp.MISSIONARY_FAST;
        }
        if (fp2 == fp.CARRY_SLOW) {
            return fp.CARRY_FAST;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.COWGIRLFAST || fp2 == fp.COWGIRLSLOW) {
            return fp.COWGIRLCUM;
        }
        if (fp2 == fp.MISSIONARY_FAST || fp2 == fp.MISSIONARY_SLOW) {
            return fp.MISSIONARY_CUM;
        }
        if (fp2 == fp.CARRY_SLOW || fp2 == fp.CARRY_FAST) {
            return fp.CARRY_CUM;
        }
        return null;
    }

    @Override
    public void func_70619_bc() {
        super.func_70619_bc();
        if (this.y() == fp.SITDOWNIDLE) {
            String string = (String)this.m.func_187225_a(em.h);
            if (!"Missionary".equals(string) && !"Cowgirl".equals(string)) {
                return;
            }
            EntityPlayer entityPlayer = this.j();
            if (entityPlayer == null || entityPlayer.func_70011_f(this.w().field_72450_a, this.w().field_72448_b, this.w().field_72449_c) > 1.0) {
                return;
            }
            this.m.func_187227_b(em.h, (Object)"");
            this.m.func_187227_b(em.D, (Object)0);
            this.e(entityPlayer.getPersistentID());
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)this.field_70170_p.func_152378_a((UUID)((Optional)this.m.func_187225_a(ai)).get());
            ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
            ge.b.sendTo((IMessage)new gz(false), entityPlayerMP);
            entityPlayer.func_191958_b(0.0f, 0.0f, 0.0f, 0.0f);
            entityPlayerMP.field_71075_bZ.field_75100_b = true;
            entityPlayer.field_71075_bZ.field_75100_b = true;
            entityPlayerMP.field_70145_X = true;
            entityPlayer.field_70145_X = true;
            entityPlayerMP.func_189654_d(true);
            entityPlayer.func_189654_d(true);
            if ("Missionary".equals(string)) {
                this.b(fp.MISSIONARY_START);
                Vec3d vec3d = this.w().func_178786_a(0.0, 0.1, 0.0);
                entityPlayer.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, this.I().floatValue(), 60.0f);
                entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
            } else {
                this.b(fp.COWGIRLSTART);
                Vec3d vec3d = this.w().func_178787_e(new Vec3d(-Math.sin((double)this.I().floatValue() * (Math.PI / 180)) * 1.8, -0.65, Math.cos((double)this.I().floatValue() * (Math.PI / 180)) * 1.8));
                entityPlayer.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, 180.0f + this.I().floatValue(), -30.0f);
                entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
            }
        }
    }

    boolean a() {
        EntityPlayer entityPlayer = this.k();
        if (entityPlayer == null) {
            return false;
        }
        return this.field_70170_p.func_180495_p(entityPlayer.func_180425_c().func_177984_a().func_177984_a()).func_177230_c() != Blocks.field_150350_a;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
                    this.a("animation.ellie.null", true, animationEvent);
                    break;
                }
                this.a("animation.ellie.eyes", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.ellie.null", true, animationEvent);
                    break;
                }
                if (this.ak) {
                    this.a("animation.ellie.ride", true, animationEvent);
                    break;
                }
                if (this.E.getCurrentAnimation() != null && this.E.getCurrentAnimation().animationName.contains("fly") && this.af) {
                    boolean bl = this.ar = !this.ar;
                }
                if (!this.af) {
                    this.a("animation.ellie.fly" + (this.ar ? "2" : ""), true, animationEvent);
                    break;
                }
                if (Math.abs(this.ao.x) + Math.abs(this.ao.y) > 0.0f) {
                    if (this.aj) {
                        this.E.setAnimationSpeed(1.5);
                        this.a(this.a() ? "animation.ellie.crouchwalk" : "animation.ellie.run", true, animationEvent);
                        break;
                    }
                    if (this.ao.y >= -0.1f) {
                        this.E.setAnimationSpeed(2.0);
                        this.a(this.a() ? "animation.ellie.crouchwalk" : "animation.ellie.fastwalk", true, animationEvent);
                        break;
                    }
                    this.E.setAnimationSpeed(1.5);
                    this.a(this.a() ? "animation.ellie.crouchwalk" : "animation.ellie.backwards_walk", true, animationEvent);
                    break;
                }
                this.a(this.a() ? "animation.ellie.crouchidle" : "animation.ellie.idle", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.ellie.null", true, animationEvent);
                        break block5;
                    }
                    case STRIP: {
                        this.a("animation.ellie.strip", false, animationEvent);
                        break block5;
                    }
                    case DASH: {
                        this.a("animation.ellie.dash", false, animationEvent);
                        break block5;
                    }
                    case HUG: {
                        this.a("animation.ellie.hug", false, animationEvent);
                        break block5;
                    }
                    case HUGIDLE: {
                        this.a("animation.ellie.hugidle", true, animationEvent);
                        break block5;
                    }
                    case HUGSELECTED: {
                        this.a("animation.ellie.hugselected", false, animationEvent);
                        break block5;
                    }
                    case SITDOWN: {
                        this.a("animation.ellie.sitdown", false, animationEvent);
                        break block5;
                    }
                    case SITDOWNIDLE: {
                        this.a("animation.ellie.sitdownidle", true, animationEvent);
                        break block5;
                    }
                    case COWGIRLSTART: {
                        this.a("animation.ellie.cowgirlstart", false, animationEvent);
                        break block5;
                    }
                    case COWGIRLSLOW: {
                        this.a("animation.ellie.cowgirlslow2", true, animationEvent);
                        break block5;
                    }
                    case COWGIRLFAST: {
                        this.a("animation.ellie.cowgirlfast", true, animationEvent);
                        break block5;
                    }
                    case COWGIRLCUM: {
                        this.a("animation.ellie.cowgirlcum", true, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.ellie.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.ellie.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case RIDE: {
                        this.a("animation.ellie.ride", true, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.ellie.sit", true, animationEvent);
                        break block5;
                    }
                    case THROW_PEARL: {
                        this.a("animation.ellie.throwpearl", false, animationEvent);
                        break block5;
                    }
                    case DOWNED: {
                        this.a("animation.ellie.downed", true, animationEvent);
                        break block5;
                    }
                    case MISSIONARY_START: {
                        this.a("animation.ellie.missionary_start", false, animationEvent);
                        break block5;
                    }
                    case MISSIONARY_SLOW: {
                        this.a("animation.ellie.missionary_slow", true, animationEvent);
                        break block5;
                    }
                    case MISSIONARY_FAST: {
                        this.a("animation.ellie.missionary_fast", true, animationEvent);
                        break block5;
                    }
                    case MISSIONARY_CUM: {
                        this.a("animation.ellie.missionary_cum", false, animationEvent);
                        break block5;
                    }
                    case CARRY_INTRO: {
                        this.a("animation.ellie.carry_intro", false, animationEvent);
                        break block5;
                    }
                    case CARRY_SLOW: {
                        this.a("animation.ellie.carry_slow" + this.ap, true, animationEvent);
                        break block5;
                    }
                    case CARRY_FAST: {
                        this.a("animation.ellie.carry_fast", true, animationEvent);
                        break block5;
                    }
                    case CARRY_CUM: {
                        this.a("animation.ellie.carry_cum", true, animationEvent);
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
                case "dashMSG1": {
                    float f;
                    EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 15.0);
                    if (entityPlayer == null) break;
                    Vec3d vec3d = this.func_174791_d().func_178788_d(entityPlayer.func_174791_d());
                    this.field_70177_z = f = (float)Math.atan2(vec3d.field_72449_c, vec3d.field_72450_a) * 57.29578f;
                    this.field_70759_as = f;
                    this.field_70761_aq = f;
                    break;
                }
                case "dashReady": {
                    if (!this.e()) break;
                    break;
                }
                case "dashDone": {
                    float f;
                    this.b(fp.HUG);
                    EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 15.0);
                    if (entityPlayer == null) break;
                    this.field_70177_z = f = entityPlayer.field_70177_z;
                    this.field_70759_as = f;
                    this.field_70761_aq = f;
                    break;
                }
                case "hugMSG1": {
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    if (!entityPlayerSP.getPersistentID().equals(this.ae()) && !entityPlayerSP.func_110124_au().equals(this.ae())) break;
                    ge.b.sendToServer((IMessage)new a8(entityPlayerSP.func_110124_au().toString(), entityPlayerSP.func_174791_d(), entityPlayerSP.field_70177_z - 80.0f, entityPlayerSP.field_70125_A));
                    break;
                }
                case "hugMSG2": {
                    this.h("Hmm...");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HMPH[3], 3.0f);
                    break;
                }
                case "hugMSG3": {
                    this.h("Hey!");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH[2], 3.0f);
                    break;
                }
                case "hugMSG4": {
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.mommyhorny", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[0], 3.0f);
                    break;
                }
                case "hugMSG5": {
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.whattodo", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HUH[1], 3.0f);
                    break;
                }
                case "hugDone": {
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    if (!entityPlayerSP.getPersistentID().equals(this.ae())) break;
                    this.b(fp.HUGIDLE);
                    this.c((EntityPlayer)entityPlayerSP);
                    break;
                }
                case "hugselectedMSG1": {
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.iknow", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_MMM[0], 3.0f);
                    break;
                }
                case "hugselectedMSG2": {
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.followmedarling", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[3], 3.0f);
                    break;
                }
                case "hugselectedDone": {
                    if (!this.e()) break;
                    Vec3d vec3d = this.func_174791_d();
                    vec3d = vec3d.func_72441_c(-Math.sin((double)(this.field_70177_z + 90.0f) * (Math.PI / 180)) * -0.7803124785423279, 0.0, Math.cos((double)(this.field_70177_z + 90.0f) * (Math.PI / 180)) * -0.7803124785423279);
                    vec3d = vec3d.func_72441_c(-Math.sin((double)this.field_70177_z * (Math.PI / 180)) * 0.5296875238418579, 0.0, Math.cos((double)this.field_70177_z * (Math.PI / 180)) * 0.5296875238418579);
                    String string = vec3d.field_72450_a + "f" + vec3d.field_72448_b + "f" + vec3d.field_72449_c + "f";
                    ge.b.sendToServer((IMessage)new n(this.f(), "targetPos", string));
                    this.r();
                    ge.b.sendToServer((IMessage)new ac(this.f()));
                    this.b(fp.NULL);
                    break;
                }
                case "sitdownMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[3], 3.0f);
                    if (!this.e()) break;
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.cometomommy", (Object[])new Object[0]));
                    break;
                }
                case "sitdownDone": {
                    if (!this.f()) break;
                    this.b(fp.SITDOWNIDLE);
                    this.c(this.field_70170_p.func_152378_a(this.m()));
                    break;
                }
                case "missionary_startDone": {
                    if (!this.n()) break;
                    this.b(fp.MISSIONARY_SLOW);
                    ds.d();
                    break;
                }
                case "cowgirlStartMSG0": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[4], 3.0f);
                    break;
                }
                case "cowgirlStartMSG1": {
                    if (!this.e()) break;
                    this.a(I18n.func_135052_a((String)"ellie.dialogue.like", (Object[])new Object[0]));
                    ds.b();
                    break;
                }
                case "cowgirlStartMSG2": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 3.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "cowgirlStartDone": {
                    if (!this.n()) break;
                    this.b(fp.COWGIRLSLOW);
                    ds.d();
                    break;
                }
                case "cowgirlfastMSG1": {
                    if (this.aq) {
                        this.aq = false;
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 3.0f);
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "cowgirlfastReady": {
                    if (!this.n()) break;
                    if (!d3.d) {
                        this.b(fp.COWGIRLSLOW);
                        break;
                    }
                    if (com.trolmastercard.sexmod.r.f.nextInt(4) == 1) break;
                    this.C.clearAnimationCache();
                    break;
                }
                case "cowgirlfastdomMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (!this.n()) break;
                    ds.a(0.2);
                    break;
                }
                case "cowgirlcumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 3.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    break;
                }
                case "cowgirlcumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_MOAN[5], 3.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    break;
                }
                case "cowgirlcumMSG3": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    break;
                }
                case "cowgirlcumMSG4": {
                    if (!this.n()) break;
                    ds.c();
                    break;
                }
                case "cowgirlcumMSG5": 
                case "missionary_cumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[4], 3.0f);
                    if (!this.n()) break;
                    this.a(I18n.func_135052_a((String)"ellie.dialogue.goodboy", (Object[])new Object[0]));
                    break;
                }
                case "cowgirlcumMSG6": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "missionary_cumDone": 
                case "cowgirlcumDone": 
                case "carry_cumDone": {
                    if (!this.n()) break;
                    ds.b();
                    this.r();
                    break;
                }
                case "attackDone": {
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "pearl": {
                    ge.b.sendToServer((IMessage)new gg(this.f()));
                    break;
                }
                case "openSexUi": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "missionary_slowMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    if (this.func_70681_au().nextBoolean() && this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_MOAN), 3.0f);
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 3.0f);
                    }
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "missionary_fastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    if (this.func_70681_au().nextBoolean() || this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_MOAN), 3.0f);
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 3.0f);
                    }
                    if (!this.n()) break;
                    ds.a(0.05);
                    break;
                }
                case "missionary_fastDone": {
                    if (!this.n()) break;
                    if (d3.d) {
                        this.b(fp.MISSIONARY_FAST);
                        break;
                    }
                    this.b(fp.MISSIONARY_SLOW);
                    break;
                }
                case "bedRustle": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    this.a(com.trolmastercard.sexmod.c.MISC_BEDRUSTLE[0]);
                    break;
                }
                case "bedRustle1": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEDRUSTLE[1]);
                    break;
                }
                case "missionary_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 3.0f);
                    break;
                }
                case "carry_introMSG1": {
                    this.a("I'm hungry..");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HMPH, 6.0f);
                    break;
                }
                case "carry_introMSG2": {
                    this.a("heh~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[3], 6.0f);
                    break;
                }
                case "lipsound": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND);
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_INSERTS, 6.0f);
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING);
                    break;
                }
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING);
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "carry_slowDone": {
                    int n2 = this.ap;
                    do {
                        this.ap = this.func_70681_au().nextInt(4) + 1;
                    } while (this.ap == n2);
                    break;
                }
                case "carry_fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.CARRY_SLOW);
                    break;
                }
                case "sexUI": {
                    if (!this.n()) break;
                    ds.d();
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
