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
        if (em2.field_70170_p instanceof gj) {
            return this.c[0];
        }
        if ((Integer)em2.func_184212_Q().func_187225_a(em.D) > this.c.length) {
            System.out.println("Girl doesn't have an outfit Nr." + em2.func_184212_Q().func_187225_a(em.D) + " so im just making her nude lol");
            return this.c[0];
        }
        return this.c[(Integer)em2.func_184212_Q().func_187225_a(em.D)];
    }

    public ResourceLocation g(em em2) {
        return this.b();
    }

    @Override
    public void setMolangQueries(IAnimatable iAnimatable, double d10) {
        block0: {
            if (Minecraft.func_71410_x().field_71441_e == null) break block0;
            super.setMolangQueries(iAnimatable, d10);
        }
    }

    public void a(T t2, Integer n2, AnimationEvent animationEvent) {
        super.setLivingAnimations(t2, n2, animationEvent);
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        this.a(t2, animationProcessor);
        if (((em)t2).field_70170_p instanceof gj) {
            return;
        }
        if (((Boolean)t2.func_184212_Q().func_187225_a(em.G)).booleanValue()) {
            t2.func_180426_a(((em)t2).o().field_72450_a, ((em)t2).o().field_72448_b, ((em)t2).o().field_72449_c, ((em)t2).I().floatValue(), 0.0f, 3, true);
        }
        if (((em)t2).C != null) {
            ((em)t2).C.transitionLengthTicks = ((em)t2).field_70170_p instanceof gj || ((em)t2).y() == null ? 5.0 : (double)((em)t2).y().transitionTick;
        }
        this.a(t2, animationProcessor, animationEvent);
        if (!(t2 instanceof e2) || ((em)t2).h() || ((em)t2).ah() == 0) {
            this.a(animationProcessor);
        } else {
            this.a(animationProcessor, (ItemStack)((em)t2).m.func_187225_a(e2.X), (ItemStack)((em)t2).m.func_187225_a(e2.T), (ItemStack)((em)t2).m.func_187225_a(e2.U), (ItemStack)((em)t2).m.func_187225_a(e2.W));
        }
    }

    public static Vec3d d(em em2) {
        return cv.a(new Vec3d(em2.field_70142_S, em2.field_70137_T, em2.field_70136_U), em2.func_174791_d());
    }

    public static Vec3d a(em em2, Vec3d vec3d) {
        return cv.a(vec3d, em2.func_174791_d());
    }

    public static Vec3d a(Vec3d vec3d, Vec3d vec3d2) {
        float f10;
        float f11;
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
        Vec3d vec3d4 = new Vec3d(Math.abs(vec3d3.field_72450_a), Math.abs(vec3d3.field_72448_b), Math.abs(vec3d3.field_72449_c));
        double d10 = vec3d4.field_72450_a / (vec3d4.field_72450_a + vec3d4.field_72448_b + vec3d4.field_72449_c);
        double d11 = vec3d4.field_72448_b / (vec3d4.field_72450_a + vec3d4.field_72448_b + vec3d4.field_72449_c);
        double d12 = vec3d4.field_72449_c / (vec3d4.field_72450_a + vec3d4.field_72448_b + vec3d4.field_72449_c);
        Vec3d vec3d5 = new Vec3d((double)(vec3d3.field_72450_a > 0.0 ? 1 : -1) * d10, (double)(vec3d3.field_72448_b > 0.0 ? 1 : -1) * d11, (double)(vec3d3.field_72449_c > 0.0 ? 1 : -1) * d12);
        double d13 = vec3d5.field_72448_b / 2.0 + 0.5;
        float f12 = (float)b6.b(-180.0, 0.0, d13);
        if (Float.isNaN(f12)) {
            f12 = -90.0f;
        }
        float f13 = f11 = d13 < 0.5 ? 0.0f : (float)b6.b(0.0, 16.0, -d13);
        if (Float.isNaN(f11)) {
            f11 = 0.0f;
        }
        if (Float.isNaN(f10 = (float)(4.0 - Math.sin(1.5707963267948966 + d13 * 2.0 * Math.PI) * 4.0))) {
            f10 = 8.0f;
        }
        return new Vec3d((double)gc.c(f12), (double)f11, (double)f10);
    }

    void a(AnimationProcessor<T> animationProcessor, ItemStack itemStack, ItemStack itemStack2, ItemStack itemStack3, ItemStack itemStack4) {
        this.c(animationProcessor, !itemStack.func_190926_b());
        this.b(animationProcessor, itemStack2.func_77973_b() instanceof ItemArmor);
        this.d(animationProcessor, !itemStack3.func_190926_b());
        this.a(animationProcessor, !itemStack4.func_190926_b());
    }

    protected void a(AnimationProcessor<T> animationProcessor) {
        this.c(animationProcessor, false);
        this.b(animationProcessor, false);
        this.d(animationProcessor, false);
        this.a(animationProcessor, false);
    }

    void c(AnimationProcessor animationProcessor, boolean bl2) {
        this.a(this.c(), bl2, animationProcessor);
        this.a(this.g(), !bl2, animationProcessor);
    }

    void b(AnimationProcessor<T> animationProcessor, boolean bl2) {
        this.a(this.f(), bl2, animationProcessor);
        this.a(this.a(), !bl2, animationProcessor);
    }

    void d(AnimationProcessor<T> animationProcessor, boolean bl2) {
        this.a(this.h(), bl2, animationProcessor);
        this.a(this.e(), !bl2, animationProcessor);
    }

    void a(AnimationProcessor<T> animationProcessor, boolean bl2) {
        this.a(this.b(), bl2, animationProcessor);
        this.a(this.d(), !bl2, animationProcessor);
    }

    void a(String[] stringArray, boolean bl2, AnimationProcessor<T> animationProcessor) {
        for (String string : stringArray) {
            this.a(string, bl2, animationProcessor);
        }
    }

    void a(String string, boolean bl2, AnimationProcessor<T> animationProcessor) {
        if (animationProcessor.getBone(string) == null) {
            return;
        }
        animationProcessor.getBone(string).setHidden(!bl2);
    }

    protected boolean f(T t2) {
        UUID uUID = ((em)t2).ae();
        if (uUID == null) {
            return true;
        }
        World world = ((em)t2).field_70170_p;
        AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)world.func_152378_a(uUID);
        if (abstractClientPlayer == null) {
            return true;
        }
        return "default".equals(abstractClientPlayer.func_175154_l());
    }

    void a(T t2, AnimationProcessor<T> animationProcessor) {
        boolean bl2 = this.f(t2);
        animationProcessor.getBone("rightArmAlex").setHidden(bl2);
        animationProcessor.getBone("rightLowerArmAlex").setHidden(bl2);
        animationProcessor.getBone("rightArmSteve").setHidden(!bl2);
        animationProcessor.getBone("rightLowerArmSteve").setHidden(!bl2);
        animationProcessor.getBone("leftArmAlex").setHidden(bl2);
        animationProcessor.getBone("leftLowerArmAlex").setHidden(bl2);
        animationProcessor.getBone("leftArmSteve").setHidden(!bl2);
        animationProcessor.getBone("leftLowerArmSteve").setHidden(!bl2);
        IBone iBone = animationProcessor.getBone("steve");
        if (iBone != null) {
            iBone.setHidden(!((em)t2).y().hasPlayer);
        }
    }

    protected boolean e(T t2) {
        return true;
    }

    protected void a(T t2, AnimationProcessor<T> animationProcessor, AnimationEvent animationEvent) {
        if (((em)t2).field_70170_p instanceof gj) {
            return;
        }
        if (!this.e(t2)) {
            return;
        }
        if (((em)t2).y() != fp.NULL && ((em)t2).y() != fp.ATTACK && ((em)t2).y() != fp.BOW) {
            return;
        }
        EntityModelData entityModelData = animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        IBone iBone = animationProcessor.getBone("neck");
        iBone.setRotationY(entityModelData.netHeadYaw * 0.5f * ((float)Math.PI / 180));
        IBone iBone2 = animationProcessor.getBone("head");
        iBone2.setRotationY(entityModelData.netHeadYaw * ((float)Math.PI / 180));
        iBone2.setRotationX(entityModelData.headPitch * ((float)Math.PI / 180));
        IBone iBone3 = animationProcessor.getBone("body") == null ? animationProcessor.getBone("dd") : animationProcessor.getBone("body");
        iBone3.setRotationY(0.0f);
    }

    public ItemStack a(em em2, String string) {
        if (Arrays.asList(this.c()).contains(string)) {
            return (ItemStack)em2.m.func_187225_a(e2.X);
        }
        if (Arrays.asList(this.f()).contains(string)) {
            return (ItemStack)em2.m.func_187225_a(e2.T);
        }
        if (Arrays.asList(this.h()).contains(string)) {
            return (ItemStack)em2.m.func_187225_a(e2.U);
        }
        if (Arrays.asList(this.b()).contains(string)) {
            return (ItemStack)em2.m.func_187225_a(e2.W);
        }
        return ItemStack.field_190927_a;
    }

    private static RuntimeException b(RuntimeException runtimeException) {
        return runtimeException;
    }
}

