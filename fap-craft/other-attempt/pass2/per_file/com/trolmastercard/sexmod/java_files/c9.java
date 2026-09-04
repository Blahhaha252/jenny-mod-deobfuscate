/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ResourceLocation
 *  software.bernie.geckolib3.core.AnimationState
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.processor.AnimationProcessor
 *  software.bernie.geckolib3.core.processor.IBone
 *  software.bernie.geckolib3.model.provider.data.EntityModelData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.dr;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gj;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c9
extends cv {
    static final float g = 1.2f;
    static final float f = 1.0f;

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/kobold/kobold.geo.json"), new ResourceLocation("sexmod", "geo/kobold/armored.geo.json")};
    }

    @Override
    public ResourceLocation b() {
        return new ResourceLocation("sexmod", "textures/entity/kobold/kobold.png");
    }

    @Override
    public ResourceLocation b(em em2) {
        return new ResourceLocation("sexmod", "animations/kobold/kobold.animation.json");
    }

    public void a(em em2, Integer n, AnimationEvent animationEvent) {
        super.a(em2, n, animationEvent);
        if (em2.field_70170_p instanceof gj) {
            return;
        }
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        if (!em2.h() && em2 instanceof ff) {
            animationProcessor.getBone("crown").setHidden((Boolean)em2.func_184212_Q().func_187225_a(ff.aZ) == false);
            animationProcessor.getBone("egg").setHidden(!((ff)em2).Q);
        } else {
            animationProcessor.getBone("crown").setHidden(true);
            animationProcessor.getBone("egg").setHidden(true);
        }
        String[] stringArray = e4.a(em2);
        this.b(animationProcessor, stringArray[0]);
        this.e(animationProcessor, stringArray[1]);
        this.a(animationProcessor, stringArray[2], 0.75f, 1.35f, "boobL", "boobR", "armorBoobs");
        this.a(animationProcessor, stringArray[3], 1.0f, 1.2f, "eyeL", "eyeR");
        this.a(animationProcessor, stringArray[3], 1.0f, 1.2f);
        this.a(animationProcessor, stringArray[4]);
        this.d(animationProcessor, stringArray[5]);
        this.a(em2, animationProcessor, stringArray[6]);
        switch (em2.y()) {
            case STARTBLOWJOB: 
            case SUCKBLOWJOB_BLINK: 
            case THRUSTBLOWJOB: 
            case CUMBLOWJOB: {
                animationProcessor.getBone("tounge").setHidden(false);
                break;
            }
            default: {
                animationProcessor.getBone("tounge").setHidden(true);
            }
        }
        this.b(em2, animationProcessor);
    }

    void b(em em2, AnimationProcessor animationProcessor) {
        if (em2.C.getAnimationState() != AnimationState.Transitioning) {
            return;
        }
        float f = ((Float)em2.func_184212_Q().func_187225_a(ff.aE)).floatValue();
        f = 0.25f - f;
        switch (em2.y()) {
            case SUCKBLOWJOB_BLINK: 
            case THRUSTBLOWJOB: 
            case CUMBLOWJOB: {
                IBone iBone = animationProcessor.getBone("body");
                iBone.setPositionZ(11.43f + f * -7.0f);
                return;
            }
            case KOBOLD_ANAL_SLOW: 
            case ANAL_FAST: 
            case ANAL_CUM: 
            case ANAL_START: {
                IBone iBone = animationProcessor.getBone("body");
                iBone.setPositionX(1.78f + f * -1.5f);
                iBone.setPositionY(13.07f + f * -11.0f);
                iBone.setPositionZ(2.05f + f * -8.0f);
                return;
            }
            case MATING_PRESS_CUM: 
            case MATING_PRESS_HARD: 
            case MATING_PRESS_SOFT: 
            case MATING_PRESS_START: {
                IBone iBone = animationProcessor.getBone("body");
                iBone.setPositionX(0.0f);
                iBone.setPositionY(2.85f);
                iBone.setPositionZ(-7.0f + f * 4.7f);
                return;
            }
        }
    }

    void a(em em2, AnimationProcessor animationProcessor, String string) {
        block6: {
            int n = Integer.parseInt(string);
            IBone iBone = animationProcessor.getBone("backpack");
            IBone iBone2 = animationProcessor.getBone("tailpack");
            switch (n) {
                case 0: {
                    iBone.setHidden(false);
                    iBone2.setHidden(true);
                    break;
                }
                case 1: {
                    iBone.setHidden(false);
                    iBone2.setHidden(false);
                    break;
                }
                case 2: {
                    iBone.setHidden(true);
                    iBone2.setHidden(false);
                    break;
                }
                case 3: {
                    iBone.setHidden(true);
                    iBone2.setHidden(true);
                }
            }
            if (em2.y() != fp.PAYMENT) break block6;
            iBone.setHidden(false);
        }
    }

    void d(AnimationProcessor animationProcessor, String string) {
        int n = Integer.parseInt(string);
        IBone iBone = animationProcessor.getBone("frecklesHR1");
        IBone iBone2 = animationProcessor.getBone("frecklesHR2");
        IBone iBone3 = animationProcessor.getBone("frecklesHL1");
        IBone iBone4 = animationProcessor.getBone("frecklesHL2");
        iBone3.setHidden(n != 1);
        iBone.setHidden(n != 1);
        iBone4.setHidden(n != 2);
        iBone2.setHidden(n != 2);
    }

    void a(AnimationProcessor animationProcessor, String string) {
        int n = Integer.parseInt(string);
        IBone iBone = animationProcessor.getBone("frecklesAR1");
        IBone iBone2 = animationProcessor.getBone("frecklesAR2");
        IBone iBone3 = animationProcessor.getBone("frecklesAL1");
        IBone iBone4 = animationProcessor.getBone("frecklesAL2");
        iBone3.setHidden(n != 1);
        iBone.setHidden(n != 1);
        iBone4.setHidden(n != 2);
        iBone2.setHidden(n != 2);
    }

    void a(AnimationProcessor animationProcessor, String string, float f, float f2) {
        if (Minecraft.func_71410_x().func_147113_T()) {
            return;
        }
        float f3 = Float.parseFloat(string);
        f3 /= 100.0f;
        f3 = f + (f2 - f) * f3 - 1.0f;
        IBone iBone = animationProcessor.getBone("eyeL");
        iBone.setPositionX(iBone.getPositionX() + f3);
        IBone iBone2 = animationProcessor.getBone("eyeR");
        iBone2.setPositionX(iBone2.getPositionX() - f3);
    }

    void a(AnimationProcessor animationProcessor, String string, float f, float f2, String ... stringArray) {
        float f3 = Float.parseFloat(string);
        f3 /= 100.0f;
        f3 = f + (f2 - f) * f3;
        for (String string2 : stringArray) {
            IBone iBone = animationProcessor.getBone(string2);
            if (iBone == null) continue;
            iBone.setScaleX(f3);
            iBone.setScaleY(f3);
            iBone.setScaleZ(f3);
        }
    }

    void e(AnimationProcessor animationProcessor, String string) {
        List<IBone> list = this.c(animationProcessor, "hornDL");
        List<IBone> list2 = this.c(animationProcessor, "hornDR");
        this.a(list);
        this.a(list2);
        int n = new Integer(string);
        animationProcessor.getBone("hornDL" + n).setHidden(false);
        animationProcessor.getBone("hornDR" + n).setHidden(false);
    }

    void b(AnimationProcessor animationProcessor, String string) {
        List<IBone> list = this.c(animationProcessor, "hornUL");
        List<IBone> list2 = this.c(animationProcessor, "hornUR");
        this.a(list);
        this.a(list2);
        int n = new Integer(string);
        animationProcessor.getBone("hornUL" + n).setHidden(false);
        animationProcessor.getBone("hornUR" + n).setHidden(false);
    }

    List<IBone> c(AnimationProcessor animationProcessor, String string) {
        IBone iBone;
        ArrayList<IBone> arrayList = new ArrayList<IBone>();
        int n = 0;
        while ((iBone = animationProcessor.getBone(string + n)) != null) {
            arrayList.add(iBone);
            ++n;
        }
        return arrayList;
    }

    void a(List<IBone> list) {
        for (IBone iBone : list) {
            iBone.setHidden(true);
        }
    }

    protected void a(em em2, AnimationProcessor animationProcessor, AnimationEvent animationEvent) {
        if (em2.field_70170_p instanceof gj) {
            return;
        }
        switch (em2.y()) {
            case NULL: {
                if (Math.abs(em2.field_70169_q - em2.field_70165_t) + Math.abs(em2.field_70166_s - em2.field_70161_v) < 0.0 || em2.field_70122_E && Math.abs(Math.abs(em2.field_70167_r) - Math.abs(em2.field_70163_u)) > (double)0.1f || !((dr)((Object)em2)).a()) break;
            }
            default: {
                return;
            }
        }
        EntityModelData entityModelData = (EntityModelData)animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        IBone iBone = animationProcessor.getBone("head");
        iBone.setRotationY(entityModelData.netHeadYaw * ((float)Math.PI / 180));
        iBone.setRotationX(entityModelData.headPitch * ((float)Math.PI / 180));
        IBone iBone2 = animationProcessor.getBone("body") == null ? animationProcessor.getBone("dd") : animationProcessor.getBone("body");
        iBone2.setRotationY(0.0f);
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] a() {
        return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip", "armorKneeR", "armorKneeL"};
    }

    @Override
    public String[] e() {
        return new String[]{"fleshL", "fleshR", "vagina", "fuckhole", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

    @Override
    public String[] d() {
        return new String[]{"toesR", "toesL"};
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
