/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a0;
import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.b0;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.r;
import java.util.UUID;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class es
extends ei {
    boolean ap = false;
    boolean ar = false;
    int aq = 0;
    boolean as = false;

    protected es(World world) {
        super(world);
    }

    public es(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public float i() {
        return 1.75f;
    }

    @Override
    public float T() {
        return 35.0f;
    }

    @Override
    public float ai() {
        return 140.0f;
    }

    public float func_70047_e() {
        return 1.64f;
    }

    @Override
    public void u() {
        this.b(fp.STARTDOGGY);
        this.m.func_187227_b(em.D, (Object)0);
        this.r = ((Float)this.m.func_187225_a(em.w)).floatValue();
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public at a(int n2) {
        return new a0();
    }

    @Override
    public String c(int n2) {
        if (n2 == 0) {
            return "textures/entity/jenny/hand_nude.png";
        }
        return "textures/entity/jenny/hand.png";
    }

    @Override
    public void b(String string, UUID uUID) {
        block1: {
            if ("action.names.boobjob".equals(string)) {
                this.m.func_187227_b(em.D, (Object)0);
                this.b(fp.PAIZURI_START);
                this.a(0, fp.PAIZURI_START);
                this.b(uUID);
            }
            if (!"action.names.blowjob".equals(string)) break block1;
            this.b(fp.STARTBLOWJOB);
            this.a(this.ah(), fp.PAIZURI_START);
            this.b(uUID);
        }
    }

    @Override
    public void func_70619_bc() {
        EntityPlayer entityPlayer;
        super.func_70619_bc();
        if (this.y() == fp.WAITDOGGY && (entityPlayer = this.j()) != null && entityPlayer.func_70011_f(this.w().field_72450_a, this.w().field_72448_b, this.w().field_72449_c) < 1.0) {
            if (this.c(entityPlayer.getPersistentID())) {
                entityPlayer.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.DARK_PURPLE + "sowy no lesbo action yet uwu"));
                return;
            }
            this.e(entityPlayer.getPersistentID());
            entityPlayer.func_70634_a(this.func_174791_d().field_72450_a, this.w().field_72448_b, this.func_174791_d().field_72449_c);
            this.a((EntityPlayerMP)entityPlayer, false);
            entityPlayer.func_191958_b(0.0f, 0.0f, 0.0f, 0.0f);
            entityPlayer.field_71075_bZ.field_75100_b = true;
            this.field_70170_p.func_152378_a((UUID)this.m()).field_71075_bZ.field_75100_b = true;
            this.a(0.0, 0.0, 0.4, 0.0f, 60.0f);
            this.B = null;
            this.b(fp.DOGGYSTART);
            ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        }
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        em.a(entityPlayer, this, new String[]{"action.names.blowjob", "action.names.boobjob"}, false);
        return true;
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
                if (this.as) {
                    this.as = false;
                    this.a(0.0, 0.0, 0.0, 0.0f, 70.0f);
                }
                return fp.PAIZURI_FAST;
            }
        }
        return null;
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
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
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
                if (this.y() != fp.NULL) {
                    this.a("animation.jenny.null", true, animationEvent);
                    break;
                }
                if (this.ak) {
                    this.a("animation.jenny.sit", true, animationEvent);
                    break;
                }
                if (this.E.getCurrentAnimation() != null && this.E.getCurrentAnimation().animationName.contains("fly") && this.af) {
                    boolean bl2 = this.ap = !this.ap;
                }
                if (!this.af) {
                    this.a("animation.jenny.fly" + (this.ap ? "2" : ""), true, animationEvent);
                    break;
                }
                if (Math.abs(this.ao.x) + Math.abs(this.ao.y) > 0.0f) {
                    if (this.aj) {
                        this.E.setAnimationSpeed(1.2f);
                        this.a("animation.jenny.run", true, animationEvent);
                        break;
                    }
                    if (this.ao.y >= -0.1f) {
                        this.E.setAnimationSpeed(1.5);
                        this.a("animation.jenny.fastwalk", true, animationEvent);
                        break;
                    }
                    this.E.setAnimationSpeed(1.2f);
                    this.a("animation.jenny.backwards_walk", true, animationEvent);
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
                        this.a("animation.jenny.doggyfast_" + (this.ar ? "hard" : "soft"), true, animationEvent);
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
            block68 : switch (soundKeyframeEvent.sound) {
                case "attackDone": {
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "stripMSG1": {
                    this.h("Hihi~");
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_GIGGLE));
                    break;
                }
                case "paymentMSG1": {
                    this.h("Huh?");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HUH[1]);
                    break;
                }
                case "paymentMSG2": {
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0], 0.5f);
                    String string = "<" + Minecraft.func_71410_x().field_71439_g.func_70005_c_() + "> ";
                    switch ((String)this.m.func_187225_a(em.h)) {
                        case "strip": {
                            this.b(string + "show Bobs and vegana pls", true);
                            break block68;
                        }
                        case "blowjob": {
                            this.b(string + "Give me the sucky sucky and these are yours", true);
                            break block68;
                        }
                        case "doggy": {
                            this.b(string + "Give me the sex pls :)", true);
                            break block68;
                        }
                        case "boobjob": {
                            this.b(string + "gib boba OwO", true);
                            break block68;
                        }
                    }
                    this.b(string + "sex pls", true);
                    break;
                }
                case "paymentMSG3": {
                    this.h("Hehe~");
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
                    this.h("What are you...");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_MMM[8]);
                    this.r = 180.0f;
                    if (!this.n()) break;
                    ds.b();
                    break;
                }
                case "bjiMSG2": {
                    this.h("eh... boys...");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[8]);
                    break;
                }
                case "bjiMSG3": {
                    this.h("OHOhh...!");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_AFTERSESSIONMOAN[0]);
                    break;
                }
                case "bjiMSG4": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BELLJINGLE[0]);
                    break;
                }
                case "bjiMSG5": {
                    this.h("Was this really necessary?!");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_HMPH[1], 0.5f);
                    if (!this.n()) break;
                    ds.b();
                    break;
                }
                case "bjiMSG6": {
                    this.h("Oh~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[8]);
                    break;
                }
                case "bjiMSG7": {
                    this.h("You like it?~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_GIGGLE[4]);
                    break;
                }
                case "bjiMSG8": {
                    this.b("<" + Minecraft.func_71410_x().field_71439_g.func_70005_c_() + "> Yee", true);
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0], 0.5f);
                    break;
                }
                case "bjiMSG9": {
                    this.h("Hihihi~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_GIGGLE[2]);
                    break;
                }
                case "bjiMSG10": {
                    if (!this.n()) break;
                    this.a(-0.4, -0.8, -0.2, 60.0f, -3.0f);
                    break;
                }
                case "bjiMSG11": {
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
                    this.ar = true;
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
                    this.a("what are you waiting for?~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIGHTBREATHING[9]);
                    break;
                }
                case "doggyGoOnBedMSG3": {
                    this.a("this ass ain't gonna fuck itself...");
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
                    this.ar = false;
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
                    ++this.aq;
                    if (this.aq % 2 == 0) {
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
                    this.ar = false;
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
                    if (!this.n() || this.as) break;
                    this.as = true;
                    this.r = 180.0f;
                    this.a(-0.7, -0.6, -0.2, 60.0f, -3.0f);
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
                    if (!this.n() || this.as) break;
                    this.as = true;
                    this.a(-0.7, -0.6, -0.2, 60.0f, -3.0f);
                    break;
                }
                case "paizuri_startStep": {
                    IBlockState iBlockState = this.field_70170_p.func_180495_p(this.func_180425_c().func_177973_b(new Vec3i(0, 1, 0)));
                    this.a(iBlockState.func_177230_c().getSoundType(iBlockState, this.field_70170_p, this.func_180425_c(), (Entity)this).func_185844_d());
                    break;
                }
                case "paizuri_cumStart": {
                    if (!this.n() || this.as) break;
                    this.a(-0.7, -0.6, -0.2, 60.0f, -3.0f);
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

