/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.MovementInput
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a5;
import com.trolmastercard.sexmod.a8;
import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.b7;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.ct;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.ep;
import com.trolmastercard.sexmod.f2;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ga;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.hf;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class er
extends ei
implements b7 {
    boolean ap = false;
    int ar = 0;
    boolean as = false;
    boolean aq = false;

    public er(World world) {
        super(world);
    }

    public er(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public at a(int n2) {
        return new a5();
    }

    @Override
    public String c(int n2) {
        return "textures/entity/galath/hand.png";
    }

    @Override
    @Nullable
    protected fp c(fp fp2) {
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.CORRUPT_FAST || fp2 == fp.CORRUPT_SLOW) {
            return fp.CORRUPT_CUM;
        }
        if (fp2 == fp.RAPE_ON_GOING) {
            return fp.RAPE_CUM;
        }
        return null;
    }

    @Override
    public float i() {
        return 2.3f;
    }

    @Override
    public void b(String string, UUID uUID) {
        if ("cowgirl".equals(string)) {
            this.b(uUID);
            this.b(fp.RAPE_INTRO);
            this.a(this.ah(), fp.RAPE_INTRO);
            return;
        }
        if ("mating press".equals(string)) {
            this.b(uUID);
            this.b(fp.CORRUPT_SLOW);
            this.a(this.ah(), fp.CORRUPT_SLOW);
            this.a();
            return;
        }
    }

    @Override
    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp3 == fp.CORRUPT_CUM && (fp2 == fp.CORRUPT_FAST || fp2 == fp.CORRUPT_SLOW)) {
            return;
        }
        if (fp3 == fp.RAPE_CUM && fp2 == fp.RAPE_ON_GOING) {
            return;
        }
        if (fp3 == fp.RAPE_CUM && fp2 == fp.RAPE_CUM_IDLE) {
            return;
        }
        if (fp2 == fp.CORRUPT_SLOW) {
            this.as = false;
        }
        super.b(fp2);
    }

    void a() {
        EntityPlayer entityPlayer = this.S();
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = ck.a(new Vec3d(0.5, (double)(0.5f - entityPlayer.func_70047_e()), (double)0.4f), this.I().floatValue()).func_178787_e(this.o());
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        er.a(entityPlayer, this, new String[]{"cowgirl", "mating press", "ride"}, false);
        return true;
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
    public f2 d() {
        return new f2(0.0, 0.0, 0.0, 0.0);
    }

    @Override
    public boolean c() {
        return this.ah() == 0 || this.ap;
    }

    @Override
    public boolean a() {
        switch (this.y()) {
            case CORRUPT_CUM: 
            case CORRUPT_FAST: 
            case CORRUPT_SLOW: 
            case COWGIRLCUM: {
                return false;
            }
        }
        return true;
    }

    @Override
    public void B() {
        this.c(true);
    }

    @Override
    public void func_70071_h_() {
        block0: {
            super.func_70071_h_();
            this.b();
            if (!this.field_70170_p.field_72995_K) break block0;
            this.d();
        }
    }

    @SideOnly(value=Side.CLIENT)
    void d() {
        if (!this.n()) {
            return;
        }
        if (this.y() != fp.RAPE_INTRO) {
            return;
        }
        ds.a(false);
    }

    void b() {
        switch (this.y()) {
            case CORRUPT_CUM: 
            case CORRUPT_FAST: 
            case CORRUPT_SLOW: 
            case RAPE_INTRO: 
            case RAPE_ON_GOING: 
            case RAPE_CUM: 
            case RAPE_CHARGE: 
            case RAPE_CUM_IDLE: {
                this.ap = true;
                return;
            }
        }
        this.ap = false;
    }

    boolean g() {
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
                    this.a("animation.galath.null", true, animationEvent);
                    break;
                }
                this.a("animation.galath.blink", true, animationEvent);
                break;
            }
            case "movement": {
                this.E.setAnimationSpeed(1.0);
                if (this.y() != fp.NULL) {
                    this.a("animation.galath.null", true, animationEvent);
                    break;
                }
                if (this.ak) {
                    this.a("animation.galath.sit", true, animationEvent);
                    break;
                }
                if (!this.af) {
                    this.a("animation.galath.controlled_flight", true, animationEvent);
                    break;
                }
                if (Math.abs(this.ao.x) + Math.abs(this.ao.y) == 0.0f) {
                    this.a(this.g() ? "animation.galath.crouchidle" : "animation.galath.idle", true, animationEvent);
                    break;
                }
                if (this.aj) {
                    this.E.setAnimationSpeed(1.5);
                    this.a(this.g() ? "animation.galath.crouchwalk" : "animation.galath.run", true, animationEvent);
                    break;
                }
                if (this.ao.y >= -0.1f) {
                    this.E.setAnimationSpeed(2.0);
                    this.a(this.g() ? "animation.galath.crouchwalk" : "animation.galath.walk", true, animationEvent);
                    break;
                }
                this.E.setAnimationSpeed(1.5);
                this.a(this.g() ? "animation.galath.crouchwalk" : "animation.galath.backwards_walk", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        return PlayState.STOP;
                    }
                    case STRIP: {
                        this.a("animation.galath.strip", true, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.galath.attack" + this.S, true, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.galath.bowcharge", true, animationEvent);
                        break block5;
                    }
                    case RIDE: 
                    case SIT: {
                        this.a("animation.galath.sit", true, animationEvent);
                        break block5;
                    }
                    case RAPE_INTRO: {
                        this.a("animation.galath.rape_intro", true, animationEvent);
                        break block5;
                    }
                    case RAPE_ON_GOING: {
                        this.a("animation.galath.rape" + this.ar, true, animationEvent);
                        break block5;
                    }
                    case RAPE_CUM: {
                        this.a("animation.galath.rape_cum", true, animationEvent);
                        break block5;
                    }
                    case RAPE_CUM_IDLE: {
                        this.a("animation.galath.rape_cum_idle", true, animationEvent);
                        break block5;
                    }
                    case CORRUPT_FAST: {
                        this.a("animation.galath.corrupt_" + (this.as ? "hard" : "soft"), true, animationEvent);
                        break block5;
                    }
                    case CORRUPT_SLOW: {
                        this.a("animation.galath.corrupt_slow", true, animationEvent);
                        break block5;
                    }
                    case CORRUPT_INTRO: {
                        this.a("animation.galath.corrupt_intro", true, animationEvent);
                        break block5;
                    }
                    case CORRUPT_CUM: {
                        this.a("animation.galath.corrupt_cum", true, animationEvent);
                        break block5;
                    }
                    case CONTROLLED_FLIGHT: {
                        this.a("animation.galath.controlled_flight", true, animationEvent);
                    }
                }
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void registerControllers(AnimationData animationData) {
        this.p();
        this.C.registerSoundListener(soundKeyframeEvent -> {
            switch (soundKeyframeEvent.sound) {
                case "attackDone": {
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 2.0f);
                    break;
                }
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING);
                    break;
                }
                case "flap": {
                    this.a(com.trolmastercard.sexmod.c.MISC_FLAP);
                    break;
                }
                case "setNude": {
                    this.ap = true;
                    Vec3d vec3d = this.func_174791_d();
                    Vec3d vec3d2 = this.b("slipR").func_178787_e(vec3d);
                    Vec3d vec3d3 = this.b("slipL").func_178787_e(vec3d);
                    Vec3d vec3d4 = this.b("turnable").func_178787_e(vec3d);
                    this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, 0.0, 0.0, 0.0, new int[0]);
                    this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, 0.0, 0.0, 0.0, new int[0]);
                    this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case "rapeIntroDone": {
                    if (!this.n()) break;
                    this.b(fp.RAPE_ON_GOING);
                    break;
                }
                case "rape_switch": {
                    Random random = this.func_70681_au();
                    int n2 = this.ar;
                    do {
                        this.ar = random.nextInt(3);
                    } while (this.ar == n2);
                    break;
                }
                case "poundRape": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING);
                    if (!this.n()) break;
                    ds.a(0.03f);
                    break;
                }
                case "enableRapeUI": {
                    if (!this.n()) break;
                    ds.a(false);
                    break;
                }
                case "reloadRenderer": {
                    if (!this.n()) {
                        return;
                    }
                    Minecraft minecraft = Minecraft.func_71410_x();
                    if (minecraft.field_71474_y.field_74320_O == 0) break;
                    minecraft.field_71438_f.func_72712_a();
                    break;
                }
                case "corruptSwitch": {
                    if (!this.n() || !d3.d) break;
                    this.b(fp.CORRUPT_FAST);
                    break;
                }
                case "corrupt_hard": {
                    if (!this.n() || !d3.d) break;
                    this.as = true;
                    this.N();
                    break;
                }
                case "corrupt_hard_end": {
                    this.b(fp.CORRUPT_SLOW);
                    this.as = false;
                    break;
                }
                case "addCum": {
                    ds.a(0.03);
                    break;
                }
                case "clearcum": {
                    ga.a(this);
                }
                case "reset": {
                    if (!this.n()) break;
                    this.r();
                    break;
                }
                case "setCamCorrupt": {
                    if (!this.n()) {
                        return;
                    }
                    this.aq = true;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    float f = this.I().floatValue() + 220.0f;
                    Vec3d vec3d = ck.a(new Vec3d(0.5, (double)(0.5f - entityPlayerSP.func_70047_e()), (double)0.4f), this.I().floatValue()).func_178787_e(this.o());
                    ge.b.sendToServer((IMessage)new a8(entityPlayerSP.getPersistentID().toString(), vec3d, f, 15.0f));
                    ds.d();
                    break;
                }
                case "enableBoyCam": {
                    if (!this.n()) break;
                    this.aq = false;
                    break;
                }
                case "creampie": {
                    ga.a(new ep(130, em2 -> {
                        Vec3d vec3d = em2.d("futaCockTip");
                        Vec3d vec3d2 = em2.d("futaCockTipDirHelp");
                        return vec3d.func_178788_d(vec3d2).func_72432_b();
                    }, em2 -> em2.b("futaCockTip").func_178787_e(em2.o()), this, 0.3f, 0.3f));
                    ga.a(new ep(100, em2 -> ck.a(new Vec3d(0.0, 0.0, (double)0.6f), this.I().floatValue()), em2 -> em2.b("creampiePos").func_178787_e(em2.o()), this, 0.6f, 0.5f));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS), 3.0f);
                    break;
                }
                case "blackScreenTamed": 
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "flapControlled": {
                    if (!this.n()) break;
                    hf.f();
                    this.a(com.trolmastercard.sexmod.c.MISC_FLAP);
                    Minecraft minecraft = Minecraft.func_71410_x();
                    EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
                    MovementInput movementInput = entityPlayerSP.field_71158_b;
                    Vec2f vec2f = movementInput.func_190020_b();
                    if (vec2f.field_189982_i == 0.0f && vec2f.field_189983_j == 0.0f) break;
                    Vec3d vec3d = ck.a(new Vec3d((double)(-vec2f.field_189982_i), 0.0, (double)vec2f.field_189983_j), b6.a(entityPlayerSP.field_70127_C, entityPlayerSP.field_70125_A, minecraft.func_184121_ak()), b6.a(entityPlayerSP.field_70758_at, entityPlayerSP.field_70759_as, minecraft.func_184121_ak()));
                    ge.b.sendToServer((IMessage)new ct(vec3d, this.f()));
                    break;
                }
                case "clap": {
                    this.a(com.trolmastercard.sexmod.c.MISC_CLAP);
                    break;
                }
                case "energysound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEEW[1]);
                    break;
                }
                case "energy2": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEEW[2]);
                    break;
                }
                case "tpSound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_WEOWEO[2]);
                    break;
                }
                case "sexui": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
            }
        });
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.s);
        animationData.addAnimationController(this.E);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
