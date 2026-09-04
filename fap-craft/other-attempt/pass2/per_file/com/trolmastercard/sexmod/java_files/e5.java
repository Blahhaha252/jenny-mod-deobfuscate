/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumParticleTypes
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
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.dc;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.f1;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gj;
import java.util.UUID;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
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

public class e5
extends ei {
    static final double au = 4.0;
    static final double at = 4.0;
    public float aq = 0.0f;
    EntityPlayer as = null;
    boolean ap = false;
    int ar = 1;
    int av = 1;

    protected e5(World world) {
        super(world);
    }

    public e5(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public float i() {
        return 1.9f + this.aq;
    }

    public float func_70047_e() {
        return 1.63f;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public at a(int n2) {
        return new f1();
    }

    @Override
    public String c(int n2) {
        return "textures/entity/allie/hand.png";
    }

    @Override
    public void b(String string, UUID uUID) {
        block1: {
            if ("action.names.deepthroat".equals(string)) {
                this.b(fp.DEEPTHROAT_START);
                this.a(this.ah(), fp.DEEPTHROAT_START);
                this.b(uUID);
            }
            if (!"Reverse cowgirl".equals(string)) break block1;
            this.b(fp.REVERSE_COWGIRL_START);
            this.a(0, fp.REVERSE_COWGIRL_START);
            this.b(uUID);
        }
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        e5.a(entityPlayer, this, new String[]{"action.names.deepthroat", "Reverse cowgirl"}, false);
        return true;
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.DEEPTHROAT_CUM && (fp2 == fp.DEEPTHROAT_FAST || fp2 == fp.DEEPTHROAT_SLOW)) {
            return;
        }
        if (this.y() == fp.REVERSE_COWGIRL_CUM && (fp2 == fp.REVERSE_COWGIRL_SLOW || fp2 == fp.REVERSE_COWGIRL_FAST_START || fp2 == fp.REVERSE_COWGIRL_FAST_CONTINUES)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    public boolean F() {
        switch (this.y()) {
            case ALLIE_PREPARE_NORMAL: 
            case DEEPTHROAT_START: 
            case DEEPTHROAT_CUM: 
            case DEEPTHROAT_FAST: 
            case ALLIE_PREPARE_FIRST_TIME: 
            case DEEPTHROAT_SLOW: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void func_70619_bc() {
        super.func_70619_bc();
        if (this.m() == null) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.m());
        if (entityPlayer != null && this.as == null) {
            this.c(true);
        }
        this.as = entityPlayer;
    }

    @Override
    public void func_70071_h_() {
        block0: {
            super.func_70071_h_();
            if (!this.field_70170_p.field_72995_K) break block0;
            this.a();
        }
    }

    @SideOnly(value=Side.CLIENT)
    void a() {
        if (this.field_70173_aa % 10 != 0) {
            return;
        }
        int n2 = this.func_70681_au().nextInt(8);
        Vec3d vec3d = this.b("tail" + n2).func_178787_e(this.func_174791_d());
        this.field_70170_p.func_175688_a(EnumParticleTypes.PORTAL, vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, this.func_70681_au().nextGaussian() * (double)0.01f, this.func_70681_au().nextGaussian() * (double)0.01f, this.func_70681_au().nextGaussian() * (double)0.01f, new int[0]);
    }

    @Override
    public void B() {
        this.c(true);
    }

    @Override
    public void y() {
        this.c(false);
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.DEEPTHROAT_SLOW) {
            return fp.DEEPTHROAT_FAST;
        }
        if (fp2 == fp.REVERSE_COWGIRL_SLOW) {
            return fp.REVERSE_COWGIRL_FAST_START;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.DEEPTHROAT_FAST || fp2 == fp.DEEPTHROAT_SLOW) {
            return fp.DEEPTHROAT_CUM;
        }
        if (fp2 == fp.REVERSE_COWGIRL_SLOW || fp2 == fp.REVERSE_COWGIRL_FAST_START || fp2 == fp.REVERSE_COWGIRL_FAST_CONTINUES) {
            return fp.REVERSE_COWGIRL_CUM;
        }
        return null;
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
                case "deepthroat_prepareMSG1": {
                    this.a(I18n.func_135052_a((String)"allie.dialogue.hihi", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0]);
                    break;
                }
                case "deepthroat_prepareMSG2": {
                    this.a(I18n.func_135052_a((String)"allie.dialogue.boys", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0]);
                    break;
                }
                case "blackscreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "deepthroat_prepareDone": {
                    this.b(fp.DEEPTHROAT_START);
                    if (!this.n()) break;
                    ge.b.sendToServer((IMessage)new dc(this.f(), this.ae(), false, true));
                    this.r = this.field_70177_z + 180.0f;
                    this.a(0.0, 0.0, (double)1.35f, 0.0f, 30.0f);
                    ds.b();
                    break;
                }
                case "deepthroat_fastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_BJMOAN));
                    if (!this.n()) break;
                    ds.d();
                    ds.a(0.04f);
                    break;
                }
                case "deepthroat_fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.DEEPTHROAT_SLOW);
                    break;
                }
                case "deepthroat_startDone": {
                    this.b(fp.DEEPTHROAT_SLOW);
                    break;
                }
                case "deepthroat_slowMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND));
                    if (!this.n()) break;
                    ds.d();
                    ds.a(0.02f);
                    break;
                }
                case "deepthroat_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_CUMINFLATION), 1.5f);
                    break;
                }
                case "cowgirl_cumDone": 
                case "deepthroat_cumDone": {
                    if (!this.n()) break;
                    this.r();
                    break;
                }
                case "deepthroat_normal_prepareMSG1": {
                    this.a(I18n.func_135052_a((String)"allie.dialogue.alright", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_PLOB));
                    break;
                }
                case "giggle": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_GIGGLE);
                    break;
                }
                case "pounding": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING);
                    break;
                }
                case "moan": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_MOAN);
                    break;
                }
                case "mmm": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_MMM));
                    break;
                }
                case "slide": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SLIDE, 0, 1, 4, 6);
                    break;
                }
                case "slowMoan": {
                    if (this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_AHH));
                    }
                    if (!this.n()) break;
                    ds.a(0.02f);
                    break;
                }
                case "cowgirlSlowDone": {
                    int n2 = this.ar;
                    do {
                        this.ar = this.func_70681_au().nextInt(3) + 1;
                    } while (this.ar == n2);
                    break;
                }
                case "fastMoan": {
                    if (this.n()) {
                        ds.a(0.04f);
                    }
                    if (!this.ap) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_MOAN));
                        this.ap = true;
                        break;
                    }
                    this.ap = false;
                    break;
                }
                case "fastSwitch": {
                    if (!this.n() || !d3.d) break;
                    fp fp2 = this.y();
                    if (fp2 == fp.REVERSE_COWGIRL_FAST_START) {
                        this.b(fp.REVERSE_COWGIRL_FAST_CONTINUES);
                        break;
                    }
                    this.N();
                    int n3 = this.av;
                    do {
                        this.av = this.func_70681_au().nextInt(3) + 1;
                    } while (this.av == n3);
                    break;
                }
                case "openSexUi": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_INSERTS, 6.0f);
                    break;
                }
                case "aftermoan": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_AFTERSESSIONMOAN);
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
            return PlayState.STOP;
        }
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
                    this.a("animation.allie.null", true, animationEvent);
                    break;
                }
                this.a("animation.bia.blink", true, animationEvent);
                break;
            }
            case "movement": {
                double d = 4.0 * (Math.abs(this.field_70165_t - this.field_70142_S) + Math.abs(this.field_70163_u - this.field_70137_T) + Math.abs(this.field_70161_v - this.field_70136_U));
                d = Math.min(1.0 + d, 4.0);
                this.E.setAnimationSpeed(d);
                this.a("animation.allie.tail", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.allie.null", true, animationEvent);
                        break block5;
                    }
                    case SUMMON: {
                        this.a("animation.allie.summon", false, animationEvent);
                        break block5;
                    }
                    case SUMMON_NORMAL: {
                        this.a("animation.allie.summon_normal", false, animationEvent);
                        break block5;
                    }
                    case SUMMON_NORMAL_WAIT: {
                        this.a("animation.allie.summon_normal_wait", true, animationEvent);
                        break block5;
                    }
                    case SUMMON_WAIT: {
                        this.a("animation.allie.summon_wait", true, animationEvent);
                        break block5;
                    }
                    case ALLIE_PREPARE_FIRST_TIME: {
                        this.a("animation.allie.deepthroat_prepare", false, animationEvent);
                        break block5;
                    }
                    case ALLIE_PREPARE_NORMAL: {
                        this.a("animation.allie.deepthroat_normal_prepare", false, animationEvent);
                        break block5;
                    }
                    case DEEPTHROAT_START: {
                        this.a("animation.allie.deepthroat_start", false, animationEvent);
                        break block5;
                    }
                    case DEEPTHROAT_SLOW: {
                        this.a("animation.allie.deepthroat_slow", true, animationEvent);
                        break block5;
                    }
                    case DEEPTHROAT_FAST: {
                        this.a("animation.allie.deepthroat_fast", true, animationEvent);
                        break block5;
                    }
                    case DEEPTHROAT_CUM: {
                        this.a("animation.allie.deepthroat_cum", false, animationEvent);
                        break block5;
                    }
                    case RICH_FIRST_TIME: {
                        this.a("animation.allie.rich", false, animationEvent);
                        break block5;
                    }
                    case RICH_NORMAL: {
                        this.a("animation.allie.rich_normal", false, animationEvent);
                        break block5;
                    }
                    case SUMMON_SAND: {
                        this.a("animation.allie.summon_sand", false, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.allie.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.allie.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_START: {
                        this.a("animation.allie.reverse_cowgirl_start", true, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_SLOW: {
                        this.a("animation.allie.reverse_cowgirl_slow" + this.ar, true, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_FAST_CONTINUES: {
                        this.a("animation.allie.reverse_cowgirl_fastc" + this.av, true, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_FAST_START: {
                        this.a("animation.allie.reverse_cowgirl_fasts", true, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_CUM: {
                        this.a("animation.allie.reverse_cowgirl_cum", true, animationEvent);
                    }
                }
            }
        }
        return PlayState.CONTINUE;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
