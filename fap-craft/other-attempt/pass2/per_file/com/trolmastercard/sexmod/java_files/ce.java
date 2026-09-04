/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.processor.AnimationProcessor
 *  software.bernie.geckolib3.core.processor.IBone
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.ak;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.bm;
import com.trolmastercard.sexmod.ce;
import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.dh;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.f8;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ce
extends cv {
    public static final float h = 7.0f;
    public static final float k = 0.75f;
    static final float l = gc.c(140.0f);
    static final float m = gc.c(35.0f);
    static final float i = 90.0f;
    static final float g = gc.c(45.0f);
    static final float f = gc.c(-45.0f);
    public static final ResourceLocation j = new ResourceLocation("sexmod", "textures/entity/manglelie/manglelie.png");

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/manglelie/manglelie.geo.json"), new ResourceLocation("sexmod", "geo/manglelie/manglelie.geo.json"), new ResourceLocation("sexmod", "geo/galath/galath_con_mang.geo.json")};
    }

    @Override
    public ResourceLocation a(em em2) {
        if (em2.field_70170_p instanceof gj) {
            return this.c[0];
        }
        if (ce.c(em2)) {
            return this.c[2];
        }
        return this.c[(Integer)em2.func_184212_Q().func_187225_a(em.D)];
    }

    public static boolean c(em em2) {
        return fp.a(em2, fp.THREESOME_SLOW, fp.THREESOME_FAST, fp.THREESOME_CUM);
    }

    @Override
    public ResourceLocation b() {
        return j;
    }

    @Override
    public ResourceLocation b(em em2) {
        return new ResourceLocation("sexmod", "animations/manglelie/manglelie.animation.json");
    }

    public void a(em em2, Integer n, AnimationEvent animationEvent) {
        super.a(em2, n, animationEvent);
        ce.a(em2, this.getAnimationProcessor(), animationEvent.getPartialTick());
        this.b(em2);
        this.d(em2);
        this.a(em2);
        this.e(em2);
    }

    void e(em em2) {
        if (this.a.func_147113_T()) {
            return;
        }
        if (ce.c(em2)) {
            return;
        }
        f_ f_2 = f8.a(em2, false);
        if (f_2 == null) {
            return;
        }
        if (!fp.a(f_2.y(), fp.CORRUPT_CUM, fp.CARRY_FAST, fp.CORRUPT_INTRO, fp.CORRUPT_SLOW)) {
            return;
        }
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        IBone iBone = animationProcessor.getBone("legR");
        iBone.setRotationY(iBone.getRotationY() + f);
        IBone iBone2 = animationProcessor.getBone("lowerArmR");
        IBone iBone3 = animationProcessor.getBone("lowerArmL");
        iBone2.setRotationX(iBone2.getRotationX() + f);
        iBone3.setRotationX(iBone3.getRotationX() + f);
    }

    void a(em em2) {
        if (!(em2 instanceof f8)) {
            return;
        }
        if (ce.c(em2)) {
            return;
        }
        f8 f82 = (f8)em2;
        f_ f_2 = f82.a(false);
        if (f_2 == null) {
            return;
        }
        IBone iBone = this.getAnimationProcessor().getBone("body");
        iBone.setRotationY(f_2.bw + (this.a.func_147113_T() ? 0.0f : iBone.getRotationY()));
        iBone.setScaleX(f_2.bm);
        iBone.setScaleY(f_2.bm);
        iBone.setScaleZ(f_2.bm);
    }

    Vec3d a(@Nonnull Entity entity) {
        return ak.a(entity, this.a.func_184121_ak()).func_72441_c(0.0, (double)entity.func_70047_e(), 0.0);
    }

    void d(em em2) {
        float f;
        boolean bl;
        if (ClientProxy.IS_PRELOADING) {
            return;
        }
        if (ce.c(em2)) {
            return;
        }
        if (this.a.func_147113_T()) {
            return;
        }
        f8 f82 = (f8)em2;
        if (!f82.r()) {
            return;
        }
        f_ f_2 = f82.a(false);
        if (f_2 == null) {
            return;
        }
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        IBone iBone = animationProcessor.getBone("armL");
        IBone iBone2 = animationProcessor.getBone("armR");
        IBone iBone3 = animationProcessor.getBone("lowerArmL");
        IBone iBone4 = animationProcessor.getBone("lowerArmR");
        IBone iBone5 = animationProcessor.getBone("elbowR");
        IBone iBone6 = animationProcessor.getBone("elbowL");
        Entity entity = f82.b();
        boolean bl2 = bl = entity == null;
        if (!bl) {
            f82.R = this.a(entity);
        }
        if ((f = (float)Minecraft.func_175610_ah()) == 0.0f) {
            f = 1.0f;
        }
        f82.V = f82.aj == bl ? 0.0f : (f82.V += 1.5f / f);
        if (f82.V >= 1.0f) {
            f82.V = 0.0f;
            f82.aj = bl;
        }
        a.a a2 = f82.V == 0.0f ? (bl ? this.a(f_2, iBone2, iBone, iBone3, iBone4) : this.a(f82, f_2, iBone4, iBone3, animationProcessor)) : a.a.a(this.a(f_2, iBone2, iBone, iBone3, iBone4), this.a(f82, f_2, iBone4, iBone3, animationProcessor), (float)(f82.aj ? b6.c(f82.V) : 1.0 - b6.c(f82.V)));
        iBone2.setRotationX(((a.a)a2).c.a);
        iBone2.setRotationY(((a.a)a2).c.c);
        iBone2.setRotationZ(((a.a)a2).c.b);
        iBone.setRotationX(((a.a)a2).g.a);
        iBone.setRotationY(((a.a)a2).g.c);
        iBone.setRotationZ(((a.a)a2).g.b);
        iBone3.setRotationX(((a.a)a2).b.a);
        iBone3.setRotationY(((a.a)a2).b.c);
        iBone3.setRotationZ(((a.a)a2).b.b);
        iBone4.setRotationX(((a.a)a2).h.a);
        iBone4.setRotationY(((a.a)a2).h.c);
        iBone4.setRotationZ(((a.a)a2).h.b);
        iBone.setScaleY(a2.a);
        iBone2.setScaleY(a2.f);
        iBone5.setRotationY(a2.d);
        iBone6.setRotationY(a2.e);
    }

    a.a a(@Nonnull f8 f82, @Nonnull f_ f_2, IBone iBone, IBone iBone2, AnimationProcessor animationProcessor) {
        float f;
        a.a a2 = new a.a(null);
        a2.b = new f7(ce.m, 0.0f, iBone.getRotationZ());
        a2.h = new f7(ce.l, 0.0f, iBone2.getRotationZ());
        float f3 = f_2.aE + animationProcessor.getBone("upperBody").getRotationX();
        float f4 = this.a.func_184121_ak();
        Vec3d vec3d = dh.a(f_2, f4);
        Vec3d vec3d2 = f82.b("armR").func_178787_e(vec3d);
        Vec3d vec3d3 = f82.b("armL").func_178787_e(vec3d);
        bm bm2 = be.a(vec3d2, f82.R);
        bm bm3 = be.a(vec3d3, f82.R);
        Float f5 = f_.a(f_2, f4);
        float f6 = f5 == null ? b6.b(f_2.field_70758_at, f_2.field_70759_as, (double)f4) : f5.floatValue();
        float f9 = gc.c(f6);
        float f10 = f82.b(f4);
        float f11 = (float)b6.e(Math.min(1.0f, f10));
        if (f11 != 1.0f) {
            f = 0.0f;
        } else {
            f = (f10 * 28.0f - 28.0f) / 32.0f;
            f = Math.max(0.0f, f - 0.5f) * 2.0f;
        }
        float f12 = (float)b6.h(f);
        float f13 = gc.c(b6.a(0.0f, 90.0f, f11));
        boolean bl = f82.a(f82.R, f4);
        if (bl) {
            a2.c = new f7(-f3 + bm2.a + gc.c(90.0f), bm2.c, 0.0f);
            a2.g = new f7(-f3 + bm3.a + gc.c(90.0f), (float)((double)bm3.c + (double)gc.c(-20.0f) * Math.cos(bm2.c + f9 * 1.0f) + (double)b6.a(f13 / 2.0f, 0.0f, f12)), 0.0f);
            a2.a = 1.0f + Math.abs(Math.abs(bm2.c) - Math.abs(f9)) * 0.1909f;
            a2.e = gc.c(90.0f);
            ((a.a)a2).b.b = b6.a(f13, 0.0f, f12);
            if ((double)f > 0.5) {
                ((a.a)a2).b.a = m + (float)b6.b((double)g, 0.0, b6.h((f - 0.5f) * 2.0f));
            } else if (f != 0.0f && (double)f < 0.5) {
                ((a.a)a2).b.a = m + (float)b6.b(0.0, (double)g, b6.h(f * 2.0f));
            }
        } else {
            a2.g = new f7(-f3 + bm3.a + gc.c(90.0f), bm3.c, 0.0f);
            a2.c = new f7(-f3 + bm2.a + gc.c(90.0f), (float)((double)bm2.c + (double)gc.c(20.0f) * Math.cos(bm3.c + f9 * 1.0f)) - b6.a(f13 / 2.0f, 0.0f, f12), 0.0f);
            a2.f = 1.0f + Math.abs(Math.abs(bm3.c) - Math.abs(f9)) * 0.1909f;
            a2.d = gc.c(90.0f);
            ((a.a)a2).h.b = -b6.a(f13, 0.0f, f12);
            if ((double)f > 0.5) {
                ((a.a)a2).h.a = l + (float)b6.b((double)g, 0.0, b6.h((f - 0.5f) * 2.0f));
            } else if (f != 0.0f && (double)f < 0.5) {
                ((a.a)a2).h.a = l + (float)b6.b(0.0, (double)g, b6.h(f * 2.0f));
            }
        }
        ((a.a)a2).c.c += f9;
        ((a.a)a2).g.c += f9;
        return a2;
    }

    a.a a(f_ f_2, IBone iBone, IBone iBone2, IBone iBone3, IBone iBone4) {
        float f = f_2.aE;
        a.a a2 = new a.a(null);
        if (f > 0.0f) {
            a2.c = new f7(iBone.getRotationX() - f, iBone.getRotationY() - f * -25.0f / 45.0f, iBone.getRotationZ() + f * 12.5f / 45.0f);
            a2.g = new f7(iBone2.getRotationX() - f, iBone2.getRotationY() + f * 15.0f / 45.0f, iBone2.getRotationZ());
            a2.b = new f7(iBone3.getRotationX(), iBone3.getRotationY(), iBone3.getRotationZ());
            a2.h = new f7(iBone4.getRotationX(), iBone4.getRotationY(), iBone4.getRotationZ());
            return a2;
        }
        a2.h = new f7(iBone4.getRotationX() + 2.0f * f, iBone4.getRotationY(), iBone4.getRotationZ());
        a2.b = new f7(iBone3.getRotationX() + 2.2222223f * f, iBone3.getRotationY(), iBone3.getRotationZ());
        a2.c = new f7(iBone.getRotationX() - f, iBone.getRotationY(), iBone.getRotationZ() + f * 5.0f / 45.0f);
        a2.g = new f7(iBone2.getRotationX() - f, iBone2.getRotationY(), iBone2.getRotationZ() - f * 5.0f / 45.0f);
        return a2;
    }

    void b(em em2) {
        if (ClientProxy.IS_PRELOADING) {
            return;
        }
        if (this.a.func_147113_T()) {
            return;
        }
        f8 f82 = (f8)em2;
        if (!dh.b(f82)) {
            return;
        }
        f_ f_2 = f82.a(false);
        if (f_2 == null) {
            return;
        }
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        float f = f_2.aE;
        animationProcessor.getBone("rotationTool").setRotationX(f);
        IBone iBone = animationProcessor.getBone("head");
        IBone iBone2 = animationProcessor.getBone("upperBody");
        IBone iBone3 = animationProcessor.getBone("boobs");
        if (f > 0.0f) {
            iBone2.setRotationX(-1.1111112f * f);
            iBone.setRotationX(0.1333f * f);
            iBone3.setRotationX(f * 22.5f / 45.0f);
        } else {
            iBone2.setRotationX(-1.6666666f * f);
            iBone.setRotationX(f * 0.666f);
        }
        float f3 = be.a((double)f82.T, f82.af);
        float f4 = be.a((double)f82.ai, f82.W);
        float f5 = Minecraft.func_175610_ah();
        if (f5 == 0.0f) {
            f5 = 1.0f;
        }
        float f6 = 7.0f * (Math.abs(f3) < 7.0f ? f3 : (f3 > 0.0f ? 7.0f : -7.0f)) * (1.0f / f5);
        float f9 = 7.0f * (Math.abs(f4) < 7.0f ? f4 : (f4 > 0.0f ? 7.0f : -7.0f)) * (1.0f / f5);
        float f10 = f82.T + f6;
        float f11 = f82.ai + f9;
        iBone.setRotationY(iBone.getRotationY() + f10);
        iBone.setRotationX(iBone.getRotationX() + f11);
        f82.T = f10;
        f82.ai = f11;
    }

    public static void a(em em2, AnimationProcessor animationProcessor, float f) {
        if (ClientProxy.IS_PRELOADING) {
            return;
        }
        boolean bl = dh.a(em2);
        ce.e(animationProcessor, bl);
        ce.f(animationProcessor, bl);
        ce.b(em2, animationProcessor, f);
    }

    static void b(em em2, AnimationProcessor animationProcessor, float f) {
        if (!(em2 instanceof f8)) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            IBone iBone = animationProcessor.getBone("cockStage" + i);
            if (iBone == null) continue;
            iBone.setHidden(i > ((f8)em2).an);
        }
    }

    static void f(AnimationProcessor animationProcessor, boolean bl) {
        animationProcessor.getBone("skirt").setHidden(!bl);
    }

    static void e(AnimationProcessor animationProcessor, boolean bl) {
        animationProcessor.getBone("cheekRBelowSkirt").setHidden(bl);
        animationProcessor.getBone("cheekLBelowSkirt").setHidden(bl);
        animationProcessor.getBone("sideRNoSkirt").setHidden(bl);
        animationProcessor.getBone("sideRSkirt").setHidden(!bl);
        animationProcessor.getBone("sideLNoSkirt").setHidden(bl);
        animationProcessor.getBone("sideLSkirt").setHidden(!bl);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
