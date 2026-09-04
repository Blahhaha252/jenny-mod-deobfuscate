/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.controller.AnimationController$ISoundListener
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 *  software.bernie.geckolib3.resource.GeckoLibCache
 *  software.bernie.geckolib3.util.MatrixStack
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.a8;
import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.de;
import com.trolmastercard.sexmod.dj;
import com.trolmastercard.sexmod.dr;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.ew;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.fv;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.m;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.resource.GeckoLibCache;
import software.bernie.geckolib3.util.MatrixStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e7
extends ew
implements dr {
    public static final EyeAndKoboldColor aw = EyeAndKoboldColor.PURPLE;
    public static final DataParameter<Float> aA = EntityDataManager.func_187226_a(e7.class, (DataSerializer)DataSerializers.field_187193_c).func_187156_b().func_187161_a(122);
    boolean aB = false;
    boolean az = true;
    boolean ay = false;
    int ax = 0;

    protected e7(World world) {
        super(world);
    }

    public e7(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.values()[this.func_70681_au().nextInt(EyeAndKoboldColor.values().length)];
        this.m.func_187214_a(au, (Object)new BlockPos(eyeAndKoboldColor.getMainColor()));
        this.m.func_187214_a(as, (Object)aw.name());
        this.m.func_187214_a(aA, (Object)Float.valueOf(0.0f));
    }

    @Override
    public AxisAlignedBB a(EntityPlayer entityPlayer) {
        float f = 0.6f;
        float f2 = 0.9f;
        float f4 = f / 2.0f;
        return new AxisAlignedBB(entityPlayer.field_70165_t - (double)f4, entityPlayer.field_70163_u, entityPlayer.field_70161_v - (double)f4, entityPlayer.field_70165_t + (double)f4, entityPlayer.field_70163_u + (double)f2, entityPlayer.field_70161_v + (double)f4);
    }

    @Override
    public void a(List<Integer> list) {
        block6: {
            StringBuilder stringBuilder = new StringBuilder();
            block5: for (int i = 0; i < list.size(); ++i) {
                int n2 = list.get(i);
                switch (i) {
                    case 0: {
                        this.m.func_187227_b(aA, (Object)Float.valueOf((float)n2 / 100.0f * 0.25f));
                        continue block5;
                    }
                    case 1: {
                        this.m.func_187227_b(as, (Object)EyeAndKoboldColor.values()[n2].toString());
                        continue block5;
                    }
                    case 2: {
                        this.m.func_187227_b(au, (Object)new BlockPos(EyeAndKoboldColor.values()[n2].getMainColor()));
                        continue block5;
                    }
                    default: {
                        e4.c(stringBuilder, n2);
                    }
                }
            }
            this.m.func_187227_b(at, (Object)stringBuilder.toString());
            if (!this.field_70170_p.field_72995_K) break block6;
            de.e();
        }
    }

    @Override
    public ArrayList<Integer> L() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(Math.round(((Float)this.m.func_187225_a(aA)).floatValue() * 100.0f / 0.25f));
        arrayList.add(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((String)this.m.func_187225_a(as))));
        arrayList.add(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((Vec3i)this.m.func_187225_a(au))));
        return arrayList;
    }

    @Override
    protected String a(StringBuilder stringBuilder) {
        e4.b(stringBuilder, 8);
        e4.b(stringBuilder, 3);
        e4.b(stringBuilder);
        e4.b(stringBuilder);
        e4.a(stringBuilder, 2);
        e4.a(stringBuilder, 2);
        e4.a(stringBuilder, 1);
        e4.a(stringBuilder, 1);
        return stringBuilder.toString();
    }

    @Override
    public ArrayList<Integer> D() {
        return new ArrayList<Integer>(this){
            final /* synthetic */ e7 this$0;
            {
                this.this$0 = e72;
                this.add(101);
                this.add(EyeAndKoboldColor.values().length);
                this.add(EyeAndKoboldColor.values().length);
                this.add(8);
                this.add(3);
                this.add(101);
                this.add(101);
                this.add(3);
                this.add(3);
                this.add(4);
                this.add(2);
            }
        };
    }

    @Override
    protected void a() {
        de.e();
        dj.c();
    }

    @Override
    public float i() {
        float f = 0.25f - ((Float)this.m.func_187225_a(aA)).floatValue();
        return 1.4f - f;
    }

    @Override
    public void b(String string, UUID uUID) {
        block2: {
            if ("anal".equals(string)) {
                this.b(uUID);
                this.b(fp.KOBOLD_ANAL_START);
                this.a(this.ah(), fp.KOBOLD_ANAL_START);
                this.f(0);
            }
            if ("oral".equals(string)) {
                this.b(uUID);
                this.b(fp.STARTBLOWJOB);
                this.a(this.ah(), fp.STARTBLOWJOB);
                this.f(0);
            }
            if (!"mating".equals(string)) break block2;
            this.b(uUID);
            this.b(fp.MATING_PRESS_START);
            this.a(this.ah(), fp.MATING_PRESS_START);
            this.f(0);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean b(EntityPlayer entityPlayer) {
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(this, entityPlayer, new String[]{"anal", "oral", "mating"}, null, false));
        return true;
    }

    @Override
    public boolean a() {
        Block block = this.field_70170_p.func_180495_p(this.func_180425_c().func_177982_a(0, 1, 0)).func_177230_c();
        return !block.func_176205_b((IBlockAccess)this.field_70170_p, this.func_180425_c().func_177982_a(0, 1, 0));
    }

    @Override
    protected MatrixStack a(MatrixStack matrixStack) {
        float f = 0.25f - ((Float)this.m.func_187225_a(aA)).floatValue();
        matrixStack.scale(1.0f - f, 1.0f - f, 1.0f - f);
        return matrixStack;
    }

    @Override
    protected float a(float f) {
        float f2 = 1.0f - (0.25f - ((Float)this.m.func_187225_a(aA)).floatValue());
        return f * f2;
    }

    @Override
    public at a(int n2) {
        return new fv();
    }

    @Override
    public String c(int n2) {
        return "textures/entity/kobold/hand.png";
    }

    @Override
    public Vec3i b(int n2) {
        try {
            return EyeAndKoboldColor.valueOf((String)this.m.func_187225_a(as)).getMainColor();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return super.b(n2);
        }
    }

    @Override
    @Nullable
    protected fp c(fp fp2) {
        if (fp2 == fp.SUCKBLOWJOB_BLINK) {
            return fp.THRUSTBLOWJOB;
        }
        if (fp2 == fp.KOBOLD_ANAL_SLOW) {
            return fp.KOBOLD_ANAL_FAST;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.THRUSTBLOWJOB || fp2 == fp.SUCKBLOWJOB_BLINK) {
            return fp.CUMBLOWJOB;
        }
        if (fp2 == fp.KOBOLD_ANAL_SLOW || fp2 == fp.KOBOLD_ANAL_FAST) {
            return fp.KOBOLD_ANAL_CUM;
        }
        if (fp2 == fp.MATING_PRESS_HARD || fp2 == fp.MATING_PRESS_SOFT) {
            return fp.MATING_PRESS_CUM;
        }
        return null;
    }

    @Override
    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp3 == fp.MATING_PRESS_CUM && (fp2 == fp.MATING_PRESS_SOFT || fp2 == fp.MATING_PRESS_HARD)) {
            return;
        }
        if (fp3 == fp.KOBOLD_ANAL_CUM && (fp2 == fp.KOBOLD_ANAL_SLOW || fp2 == fp.KOBOLD_ANAL_FAST)) {
            return;
        }
        if (fp3 == fp.CUMBLOWJOB && (fp2 == fp.SUCKBLOWJOB || fp2 == fp.THRUSTBLOWJOB)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
            return PlayState.STOP;
        }
        float f = 0.25f - ((Float)this.func_184212_Q().func_187225_a(ff.aE)).floatValue();
        GeckoLibCache.getInstance().parser.setValue("size", (double)f);
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
                    this.a("animation.kobold.null", true, animationEvent);
                    break;
                }
                this.a("animation.kobold.blink", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.kobold.null", true, animationEvent);
                    break;
                }
                if (this.ak) {
                    this.a("animation.kobold.sit", true, animationEvent);
                    break;
                }
                if (this.E.getCurrentAnimation() != null && this.E.getCurrentAnimation().animationName.contains("fly") && this.af) {
                    boolean bl = this.aB = !this.aB;
                }
                if (!this.af) {
                    this.a("animation.kobold.fly" + (this.aB ? "2" : ""), true, animationEvent);
                    break;
                }
                if (Math.abs(this.ao.x) + Math.abs(this.ao.y) > 0.0f) {
                    if (this.aj) {
                        this.E.setAnimationSpeed((double)1.2f);
                        this.a("animation.kobold.run", true, animationEvent);
                        break;
                    }
                    if (this.ao.y >= -0.1f) {
                        this.E.setAnimationSpeed(2.0);
                        this.a("animation.kobold.walk", true, animationEvent);
                        break;
                    }
                    this.E.setAnimationSpeed(1.75);
                    this.a("animation.kobold.backwards_walk", true, animationEvent);
                    break;
                }
                this.a("animation.kobold.idle", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.kobold.null", true, animationEvent);
                        break block5;
                    }
                    case STRIP: {
                        this.a("animation.kobold.strip", false, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.kobold.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.kobold.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.kobold.sit", true, animationEvent);
                        break block5;
                    }
                    case MINE: {
                        this.a("animation.kobold.fall_tree", true, animationEvent);
                        break block5;
                    }
                    case PAYMENT: {
                        this.a("animation.kobold.paymentBackpack", true, animationEvent);
                        break block5;
                    }
                    case STARTBLOWJOB: {
                        this.a("animation.kobold.blowjobStart", false, animationEvent);
                        break block5;
                    }
                    case SUCKBLOWJOB_BLINK: {
                        String string = this.az ? "R" : "L";
                        String string2 = this.ay ? "Switch" : "";
                        this.a("animation.kobold.blowjobSlow" + string + string2, true, animationEvent);
                        break block5;
                    }
                    case THRUSTBLOWJOB: {
                        this.a("animation.kobold.blowjobFast", true, animationEvent);
                        break block5;
                    }
                    case CUMBLOWJOB: {
                        this.a("animation.kobold.blowjobCum", false, animationEvent);
                        break block5;
                    }
                    case KOBOLD_ANAL_START: {
                        this.a("animation.kobold.analStart", false, animationEvent);
                        break block5;
                    }
                    case KOBOLD_ANAL_SLOW: {
                        this.a("animation.kobold.analSoft", true, animationEvent);
                        break block5;
                    }
                    case KOBOLD_ANAL_FAST: {
                        this.a("animation.kobold.analHard", true, animationEvent);
                        break block5;
                    }
                    case KOBOLD_ANAL_CUM: {
                        this.a("animation.kobold.analCum", true, animationEvent);
                        break block5;
                    }
                    case SLEEP: {
                        this.a("animation.kobold.sleep", true, animationEvent);
                        break block5;
                    }
                    case MATING_PRESS_START: {
                        this.a("animation.kobold.mating_press_start", false, animationEvent);
                        break block5;
                    }
                    case MATING_PRESS_SOFT: {
                        this.a("animation.kobold.mating_press_soft", true, animationEvent);
                        break block5;
                    }
                    case MATING_PRESS_HARD: {
                        this.a("animation.kobold.mating_press_hard", true, animationEvent);
                        break block5;
                    }
                    case MATING_PRESS_CUM: {
                        this.a("animation.kobold.mating_press_cum", true, animationEvent);
                    }
                }
            }
        }
        return PlayState.CONTINUE;
    }

    void b(SoundEvent soundEvent) {
        this.b(soundEvent, 1.0f);
    }

    void b(SoundEvent[] soundEventArray) {
        this.b(soundEventArray, 1.0f);
    }

    void b(SoundEvent[] soundEventArray, float f) {
        this.b(soundEventArray[this.func_70681_au().nextInt(soundEventArray.length)], f);
    }

    void b(SoundEvent soundEvent, float f) {
        float f2 = 0.25f - ((Float)this.m.func_187225_a(aA)).floatValue();
        double d = f2 / 0.25f;
        float f4 = (float)b6.b((double)0.9f, (double)1.1f, d);
        this.a(soundEvent, f, f4);
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
                case "paymentMSG1": {
                    this.a(this.ae(), "I'd like to use ur services owo");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "plob": {
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "paymentDone": {
                    if (!this.n()) break;
                    this.U();
                    break;
                }
                case "blowjobStartMSG1": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = ck.a(new Vec3d(0.0, 0.625 - (double)entityPlayerSP.func_70047_e(), -1.0), this.I().floatValue() + 180.0f);
                    ge.b.sendToServer((IMessage)new a8(this.ae().toString(), this.o().func_178787_e(vec3d), this.I().floatValue() + 180.0f, 0.0f));
                    break;
                }
                case "blowjobStartMSG2": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = ck.a(new Vec3d(0.5, 0.5 - (double)entityPlayerSP.func_70047_e(), -0.6875), this.I().floatValue() + 180.0f);
                    ge.b.sendToServer((IMessage)new a8(this.ae().toString(), this.o().func_178787_e(vec3d), this.I().floatValue() + 180.0f - 40.0f, 0.0f));
                    break;
                }
                case "lipsound": {
                    if (this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND, 1.5f);
                    } else {
                        this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIPSOUND, 1.5f);
                    }
                    ds.a(0.02f);
                    break;
                }
                case "touch": {
                    this.a(com.trolmastercard.sexmod.c.MISC_TOUCH);
                    break;
                }
                case "blowjobStartDone": {
                    this.b(fp.SUCKBLOWJOB_BLINK);
                    this.ay = false;
                    this.az = true;
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "switch": {
                    this.ay = this.func_70681_au().nextBoolean();
                    this.C.clearAnimationCache();
                    break;
                }
                case "endSwitch": {
                    this.ay = false;
                    this.az = !this.az;
                    this.C.clearAnimationCache();
                    break;
                }
                case "blowjobFastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.SUCKBLOWJOB_BLINK);
                    break;
                }
                case "cumLoud": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 3.0f);
                    break;
                }
                case "cumQuiet": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 1.5f);
                    break;
                }
                case "analCumDone": 
                case "blowjobCumDone": {
                    if (!this.n()) break;
                    this.r();
                    ds.c();
                    break;
                }
                case "analStartDone": {
                    this.b(fp.KOBOLD_ANAL_SLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "analStartCam": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = ck.a(new Vec3d(0.0, 0.5625 - (double)entityPlayerSP.func_70047_e(), 0.5625), this.I().floatValue() + 180.0f);
                    ge.b.sendToServer((IMessage)new a8(this.ae().toString(), this.o().func_178787_e(vec3d), this.I().floatValue(), 0.0f));
                    break;
                }
                case "pounding": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING);
                    break;
                }
                case "analFastRapid": {
                    if (!this.n() || !d3.d) break;
                    if (this.y() == fp.KOBOLD_ANAL_FAST) {
                        this.N();
                        break;
                    }
                    this.b(fp.KOBOLD_ANAL_FAST);
                    break;
                }
                case "analDone": {
                    if (this.y() != fp.KOBOLD_ANAL_FAST) break;
                    this.b(fp.KOBOLD_ANAL_SLOW);
                    break;
                }
                case "analHard": {
                    if (!this.n()) break;
                    ds.a(0.04f);
                    break;
                }
                case "analSoft": {
                    if (!this.n()) break;
                    ds.a(0.02f);
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 2.0f);
                    break;
                }
                case "giggle": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_GIGGLE);
                    break;
                }
                case "moan": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_MOAN);
                    break;
                }
                case "moanMating": {
                    --this.ax;
                    if (this.ax > 0) break;
                    this.ax = 3;
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_MOAN);
                    break;
                }
                case "analHardMSG1": {
                    --this.ax;
                    if (this.ax > 0) break;
                    this.ax = 4;
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_MOAN);
                    break;
                }
                case "orgasm": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_ORGASM);
                    break;
                }
                case "breath": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_LIGHTBREATHING, 0.5f);
                    break;
                }
                case "haa": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_HAA, 0.7f);
                    break;
                }
                case "interested": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_INTERESTED);
                    break;
                }
                case "yep": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_YEP);
                    break;
                }
                case "bjmoan": {
                    this.b(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_BJMOAN));
                    break;
                }
                case "blowjobStartbreath": {
                    int n2 = this.func_70681_au().nextInt(3);
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_LIGHTBREATHING[n2]);
                    break;
                }
                case "matingCam": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = new Vec3d(0.0, 0.4375 - (double)entityPlayerSP.eyeHeight, -0.6875);
                    vec3d = ck.a(vec3d, this.I().floatValue() + 180.0f);
                    vec3d = vec3d.func_178787_e(this.o());
                    ge.b.sendToServer((IMessage)new a8(entityPlayerSP.getPersistentID().toString(), vec3d, this.I().floatValue() + 180.0f, 10.0f));
                    break;
                }
                case "mating_press_startDone": {
                    if (this.n()) {
                        ds.d();
                    }
                }
                case "mating_press_hardDone": {
                    if (!this.n()) break;
                    this.b(fp.MATING_PRESS_SOFT);
                    break;
                }
                case "mating_press_softReady": {
                    if (this.n()) {
                        ds.a(0.04f);
                    }
                    if (!this.n() || !d3.d) break;
                    this.b(fp.MATING_PRESS_HARD);
                    break;
                }
                case "mating_press_hardReady": {
                    if (this.n()) {
                        ds.a(0.04f);
                    }
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "mating_cum_cam": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = new Vec3d(0.0, 1.1875 - (double)entityPlayerSP.eyeHeight, 0.125);
                    vec3d = ck.a(vec3d, this.I().floatValue() + 180.0f);
                    vec3d = vec3d.func_178787_e(this.o());
                    ge.b.sendToServer((IMessage)new a8(entityPlayerSP.getPersistentID().toString(), vec3d, this.I().floatValue() + 180.0f, 70.0f));
                    break;
                }
                case "cumMsg": {
                    this.a("I.. hope I am satisfying you sir");
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_SAD[this.func_70681_au().nextInt(1)]);
                    break;
                }
                case "mating_press_cumDone": {
                    if (!this.n()) break;
                    this.r();
                    break;
                }
            }
        };
        this.E.transitionLengthTicks = 3.0;
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
