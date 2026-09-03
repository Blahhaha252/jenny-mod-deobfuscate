/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.controller.AnimationController
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.processor.AnimationProcessor
 *  software.bernie.geckolib3.core.processor.IBone
 *  software.bernie.geckolib3.model.provider.data.EntityModelData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.cm;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gs;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public abstract class cv<T extends em>
extends cm<T>
implements gs {
    public static final List<String> b = Arrays.asList("braStringMidStartR", "braStringMidMid1R", "braStringMidMid2R", "braStringMidMid3R", "braStringMidEndR", "braStringBackR", "braStringRightEndR", "braStringRightStartR", "braStringRightL", "braStringMidMid1L", "braStringMidMid2L", "braStringMidMid3L", "braStringMidEndL", "braStringBackL", "braStringLeftEndL", "braStringLeftStartL", "braStringMidStartL", "braStringRightR");
    public static final List<String> e = Arrays.asList("boyCam", "girlCam");
    public static boolean d = true;
    protected ResourceLocation[] c = this.a();
    protected Minecraft a = Minecraft.func_71410_x();

    protected cv() {
    }

    protected abstract ResourceLocation[] a();

    public abstract ResourceLocation b();

    public abstract ResourceLocation b(em var1);

    public ResourceLocation c(em em2) {
        return this.b(em2);
    }

    public ResourceLocation a(em em2) {
        try {
            if (em2.field_70170_p instanceof gj) {
                return this.c[0];
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        try {
            if ((Integer)em2.func_184212_Q().func_187225_a(em.D) > this.c.length) {
                System.out.println("Girl doesn't have an outfit Nr." + em2.func_184212_Q().func_187225_a(em.D) + " so im just making her nude lol");
                return this.c[0];
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        return this.c[(Integer)em2.func_184212_Q().func_187225_a(em.D)];
    }

    public ResourceLocation g(em em2) {
        return this.b();
    }

    public void setMolangQueries(IAnimatable iAnimatable, double d) {
        try {
            if (Minecraft.func_71410_x().field_71441_e != null) {
                super.setMolangQueries(iAnimatable, d);
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
    }

    public void a(T t, Integer n, AnimationEvent animationEvent) {
        block24: {
            AnimationProcessor animationProcessor;
            block23: {
                block18: {
                    double d;
                    block21: {
                        block20: {
                            super.setLivingAnimations(t, n, animationEvent);
                            animationProcessor = this.getAnimationProcessor();
                            try {
                                this.a(t, animationProcessor);
                                if (((em)((Object)t)).field_70170_p instanceof gj) {
                                    return;
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                throw cv.b(runtimeException);
                            }
                            try {
                                if (((Boolean)t.func_184212_Q().func_187225_a(em.G)).booleanValue()) {
                                    t.func_180426_a(((em)((Object)t)).o().field_72450_a, ((em)((Object)t)).o().field_72448_b, ((em)((Object)t)).o().field_72449_c, ((em)((Object)t)).I().floatValue(), 0.0f, 3, true);
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                throw cv.b(runtimeException);
                            }
                            try {
                                block19: {
                                    try {
                                        try {
                                            if (((em)((Object)t)).C == null) break block18;
                                            AnimationController animationController = ((em)((Object)t)).C;
                                            if (((em)((Object)t)).field_70170_p instanceof gj) break block19;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw cv.b(runtimeException);
                                        }
                                        if (((em)((Object)t)).y() != null) break block20;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw cv.b(runtimeException);
                                    }
                                }
                                d = 5.0;
                                break block21;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cv.b(runtimeException);
                            }
                        }
                        d = ((em)((Object)t)).y().transitionTick;
                    }
                    animationController.transitionLengthTicks = d;
                }
                try {
                    block22: {
                        try {
                            try {
                                this.a(t, animationProcessor, animationEvent);
                                if (!(t instanceof e2) || ((em)((Object)t)).h()) break block22;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cv.b(runtimeException);
                            }
                            if (((em)((Object)t)).ah() != 0) break block23;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cv.b(runtimeException);
                        }
                    }
                    this.a(animationProcessor);
                    break block24;
                }
                catch (RuntimeException runtimeException) {
                    throw cv.b(runtimeException);
                }
            }
            this.a(animationProcessor, (ItemStack)((em)((Object)t)).m.func_187225_a(e2.X), (ItemStack)((em)((Object)t)).m.func_187225_a(e2.T), (ItemStack)((em)((Object)t)).m.func_187225_a(e2.U), (ItemStack)((em)((Object)t)).m.func_187225_a(e2.W));
        }
    }

    public static Vec3d d(em em2) {
        return cv.a(new Vec3d(em2.field_70142_S, em2.field_70137_T, em2.field_70136_U), em2.func_174791_d());
    }

    public static Vec3d a(em em2, Vec3d vec3d) {
        return cv.a(vec3d, em2.func_174791_d());
    }

    public static Vec3d a(Vec3d vec3d, Vec3d vec3d2) {
        float f;
        float f2;
        int n;
        Vec3d vec3d3;
        Vec3d vec3d4;
        Vec3d vec3d5 = vec3d2.func_178788_d(vec3d);
        Vec3d vec3d6 = new Vec3d(Math.abs(vec3d5.field_72450_a), Math.abs(vec3d5.field_72448_b), Math.abs(vec3d5.field_72449_c));
        double d = vec3d6.field_72450_a / (vec3d6.field_72450_a + vec3d6.field_72448_b + vec3d6.field_72449_c);
        double d2 = vec3d6.field_72448_b / (vec3d6.field_72450_a + vec3d6.field_72448_b + vec3d6.field_72449_c);
        double d3 = vec3d6.field_72449_c / (vec3d6.field_72450_a + vec3d6.field_72448_b + vec3d6.field_72449_c);
        try {
            Vec3d vec3d7;
            vec3d4 = vec3d7;
            vec3d3 = vec3d7;
            n = vec3d5.field_72450_a > 0.0 ? 1 : -1;
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        vec3d4((double)n * d, (double)(vec3d5.field_72448_b > 0.0 ? 1 : -1) * d2, (double)(vec3d5.field_72449_c > 0.0 ? 1 : -1) * d3);
        Vec3d vec3d8 = vec3d3;
        double d4 = vec3d8.field_72448_b / 2.0 + 0.5;
        float f3 = (float)b6.b(-180.0, 0.0, d4);
        if (Float.isNaN(f3)) {
            f3 = -90.0f;
        }
        try {
            float f4 = f2 = d4 < 0.5 ? 0.0f : (float)b6.b(0.0, 16.0, -d4);
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        if (Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        if (Float.isNaN(f = (float)(4.0 - Math.sin(1.5707963267948966 + d4 * 2.0 * Math.PI) * 4.0))) {
            f = 8.0f;
        }
        return new Vec3d((double)gc.c(f3), (double)f2, (double)f);
    }

    void a(AnimationProcessor<T> animationProcessor, ItemStack itemStack, ItemStack itemStack2, ItemStack itemStack3, ItemStack itemStack4) {
        boolean bl;
        AnimationProcessor<T> animationProcessor2;
        cv cv2;
        boolean bl2;
        AnimationProcessor<T> animationProcessor3;
        cv cv3;
        boolean bl3;
        AnimationProcessor<T> animationProcessor4;
        cv cv4;
        try {
            cv4 = this;
            animationProcessor4 = animationProcessor;
            bl3 = !itemStack.func_190926_b();
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        try {
            cv4.c(animationProcessor4, bl3);
            this.b(animationProcessor, itemStack2.func_77973_b() instanceof ItemArmor);
            cv3 = this;
            animationProcessor3 = animationProcessor;
            bl2 = !itemStack3.func_190926_b();
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        try {
            cv3.d(animationProcessor3, bl2);
            cv2 = this;
            animationProcessor2 = animationProcessor;
            bl = !itemStack4.func_190926_b();
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        cv2.a(animationProcessor2, bl);
    }

    protected void a(AnimationProcessor<T> animationProcessor) {
        this.c(animationProcessor, false);
        this.b(animationProcessor, false);
        this.d(animationProcessor, false);
        this.a(animationProcessor, false);
    }

    void c(AnimationProcessor animationProcessor, boolean bl) {
        boolean bl2;
        String[] stringArray;
        cv cv2;
        try {
            this.a(this.c(), bl, animationProcessor);
            cv2 = this;
            stringArray = this.g();
            bl2 = !bl;
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        cv2.a(stringArray, bl2, animationProcessor);
    }

    void b(AnimationProcessor<T> animationProcessor, boolean bl) {
        boolean bl2;
        String[] stringArray;
        cv cv2;
        try {
            this.a(this.f(), bl, animationProcessor);
            cv2 = this;
            stringArray = this.a();
            bl2 = !bl;
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        cv2.a(stringArray, bl2, animationProcessor);
    }

    void d(AnimationProcessor<T> animationProcessor, boolean bl) {
        boolean bl2;
        String[] stringArray;
        cv cv2;
        try {
            this.a(this.h(), bl, animationProcessor);
            cv2 = this;
            stringArray = this.e();
            bl2 = !bl;
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        cv2.a(stringArray, bl2, animationProcessor);
    }

    void a(AnimationProcessor<T> animationProcessor, boolean bl) {
        boolean bl2;
        String[] stringArray;
        cv cv2;
        try {
            this.a(this.b(), bl, animationProcessor);
            cv2 = this;
            stringArray = this.d();
            bl2 = !bl;
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        cv2.a(stringArray, bl2, animationProcessor);
    }

    void a(String[] stringArray, boolean bl, AnimationProcessor<T> animationProcessor) {
        for (String string : stringArray) {
            this.a(string, bl, animationProcessor);
        }
    }

    void a(String string, boolean bl, AnimationProcessor<T> animationProcessor) {
        boolean bl2;
        IBone iBone;
        try {
            if (animationProcessor.getBone(string) == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        try {
            iBone = animationProcessor.getBone(string);
            bl2 = !bl;
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        iBone.setHidden(bl2);
    }

    protected boolean f(T t) {
        UUID uUID = ((em)((Object)t)).ae();
        try {
            if (uUID == null) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        World world = ((em)((Object)t)).field_70170_p;
        AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)world.func_152378_a(uUID);
        try {
            if (abstractClientPlayer == null) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        return "default".equals(abstractClientPlayer.func_175154_l());
    }

    void a(T t, AnimationProcessor<T> animationProcessor) {
        block12: {
            boolean bl;
            IBone iBone;
            block14: {
                block13: {
                    boolean bl2;
                    IBone iBone2;
                    boolean bl3;
                    IBone iBone3;
                    boolean bl4;
                    IBone iBone4;
                    boolean bl5;
                    IBone iBone5;
                    boolean bl6 = this.f(t);
                    try {
                        animationProcessor.getBone("rightArmAlex").setHidden(bl6);
                        animationProcessor.getBone("rightLowerArmAlex").setHidden(bl6);
                        iBone5 = animationProcessor.getBone("rightArmSteve");
                        bl5 = !bl6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cv.b(runtimeException);
                    }
                    try {
                        iBone5.setHidden(bl5);
                        iBone4 = animationProcessor.getBone("rightLowerArmSteve");
                        bl4 = !bl6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cv.b(runtimeException);
                    }
                    try {
                        iBone4.setHidden(bl4);
                        animationProcessor.getBone("leftArmAlex").setHidden(bl6);
                        animationProcessor.getBone("leftLowerArmAlex").setHidden(bl6);
                        iBone3 = animationProcessor.getBone("leftArmSteve");
                        bl3 = !bl6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cv.b(runtimeException);
                    }
                    try {
                        iBone3.setHidden(bl3);
                        iBone2 = animationProcessor.getBone("leftLowerArmSteve");
                        bl2 = !bl6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cv.b(runtimeException);
                    }
                    iBone2.setHidden(bl2);
                    IBone iBone6 = animationProcessor.getBone("steve");
                    try {
                        try {
                            if (iBone6 == null) break block12;
                            iBone = iBone6;
                            if (((em)((Object)t)).y().hasPlayer) break block13;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cv.b(runtimeException);
                        }
                        bl = true;
                        break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cv.b(runtimeException);
                    }
                }
                bl = false;
            }
            iBone.setHidden(bl);
        }
    }

    protected boolean e(T t) {
        return true;
    }

    protected void a(T t, AnimationProcessor<T> animationProcessor, AnimationEvent animationEvent) {
        IBone iBone;
        block14: {
            try {
                if (((em)((Object)t)).field_70170_p instanceof gj) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw cv.b(runtimeException);
            }
            try {
                if (!this.e(t)) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw cv.b(runtimeException);
            }
            try {
                try {
                    try {
                        if (((em)((Object)t)).y() == fp.NULL || ((em)((Object)t)).y() == fp.ATTACK) break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cv.b(runtimeException);
                    }
                    if (((em)((Object)t)).y() == fp.BOW) break block14;
                }
                catch (RuntimeException runtimeException) {
                    throw cv.b(runtimeException);
                }
                return;
            }
            catch (RuntimeException runtimeException) {
                throw cv.b(runtimeException);
            }
        }
        EntityModelData entityModelData = (EntityModelData)animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        IBone iBone2 = animationProcessor.getBone("neck");
        iBone2.setRotationY(entityModelData.netHeadYaw * 0.5f * ((float)Math.PI / 180));
        IBone iBone3 = animationProcessor.getBone("head");
        try {
            iBone3.setRotationY(entityModelData.netHeadYaw * ((float)Math.PI / 180));
            iBone3.setRotationX(entityModelData.headPitch * ((float)Math.PI / 180));
            iBone = animationProcessor.getBone("body") == null ? animationProcessor.getBone("dd") : animationProcessor.getBone("body");
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        IBone iBone4 = iBone;
        iBone4.setRotationY(0.0f);
    }

    public ItemStack a(em em2, String string) {
        try {
            if (Arrays.asList(this.c()).contains(string)) {
                return (ItemStack)em2.m.func_187225_a(e2.X);
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        try {
            if (Arrays.asList(this.f()).contains(string)) {
                return (ItemStack)em2.m.func_187225_a(e2.T);
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        try {
            if (Arrays.asList(this.h()).contains(string)) {
                return (ItemStack)em2.m.func_187225_a(e2.U);
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        try {
            if (Arrays.asList(this.b()).contains(string)) {
                return (ItemStack)em2.m.func_187225_a(e2.W);
            }
        }
        catch (RuntimeException runtimeException) {
            throw cv.b(runtimeException);
        }
        return ItemStack.field_190927_a;
    }

    private static RuntimeException b(RuntimeException runtimeException) {
        return runtimeException;
    }
}
