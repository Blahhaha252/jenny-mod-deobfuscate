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
        try {
            if (em2.field_70170_p instanceof gj) {
                return this.c[0];
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        try {
            if (ce.c(em2)) {
                return this.c[2];
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
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
        try {
            if (this.a.func_147113_T()) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        try {
            if (ce.c(em2)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        f_ f_2 = f8.a(em2, false);
        try {
            if (f_2 == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        try {
            if (!fp.a(f_2.y(), fp.CORRUPT_CUM, fp.CARRY_FAST, fp.CORRUPT_INTRO, fp.CORRUPT_SLOW)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
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
        float f;
        float f3;
        IBone iBone;
        try {
            if (!(em2 instanceof f8)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        try {
            if (ce.c(em2)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        f8 f82 = (f8)em2;
        f_ f_2 = f82.a(false);
        try {
            if (f_2 == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        IBone iBone2 = this.getAnimationProcessor().getBone("body");
        try {
            iBone = iBone2;
            f3 = f_2.bw;
            f = this.a.func_147113_T() ? 0.0f : iBone2.getRotationY();
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        iBone.setRotationY(f3 + f);
        iBone2.setScaleX(f_2.bm);
        iBone2.setScaleY(f_2.bm);
        iBone2.setScaleZ(f_2.bm);
    }

    Vec3d a(@Nonnull Entity entity) {
        return ak.a(entity, this.a.func_184121_ak()).func_72441_c(0.0, (double)entity.func_70047_e(), 0.0);
    }

    void d(em em2) {
        a a2;
        IBone iBone;
        IBone iBone2;
        IBone iBone3;
        IBone iBone4;
        IBone iBone5;
        IBone iBone6;
        block37: {
            double d;
            a a3;
            a a4;
            AnimationProcessor animationProcessor;
            f_ f_2;
            f8 f82;
            block34: {
                a a5;
                block36: {
                    block35: {
                        boolean bl;
                        block33: {
                            float f;
                            block32: {
                                boolean bl2;
                                try {
                                    if (ClientProxy.IS_PRELOADING) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                try {
                                    if (ce.c(em2)) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                try {
                                    if (this.a.func_147113_T()) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                f82 = (f8)em2;
                                try {
                                    if (!f82.r()) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                f_2 = f82.a(false);
                                try {
                                    if (f_2 == null) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                animationProcessor = this.getAnimationProcessor();
                                iBone6 = animationProcessor.getBone("armL");
                                iBone5 = animationProcessor.getBone("armR");
                                iBone4 = animationProcessor.getBone("lowerArmL");
                                iBone3 = animationProcessor.getBone("lowerArmR");
                                iBone2 = animationProcessor.getBone("elbowR");
                                iBone = animationProcessor.getBone("elbowL");
                                Entity entity = f82.b();
                                try {
                                    bl2 = entity == null;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                bl = bl2;
                                try {
                                    if (!bl) {
                                        f82.R = this.a(entity);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                f = Minecraft.func_175610_ah();
                                if (f == 0.0f) {
                                    f = 1.0f;
                                }
                                try {
                                    if (f82.aj != bl) break block32;
                                    f82.V = 0.0f;
                                    break block33;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                            }
                            f82.V += 1.5f / f;
                        }
                        try {
                            if (f82.V >= 1.0f) {
                                f82.V = 0.0f;
                                f82.aj = bl;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw ce.a(runtimeException);
                        }
                        try {
                            try {
                                if (f82.V != 0.0f) break block34;
                                if (!bl) break block35;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ce.a(runtimeException);
                            }
                            a5 = this.a(f_2, iBone5, iBone6, iBone4, iBone3);
                            break block36;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ce.a(runtimeException);
                        }
                    }
                    a5 = this.a(f82, f_2, iBone3, iBone4, animationProcessor);
                }
                a2 = a5;
                break block37;
            }
            try {
                a4 = this.a(f_2, iBone5, iBone6, iBone4, iBone3);
                a3 = this.a(f82, f_2, iBone3, iBone4, animationProcessor);
                d = f82.aj ? b6.c(f82.V) : 1.0 - b6.c(f82.V);
            }
            catch (RuntimeException runtimeException) {
                throw ce.a(runtimeException);
            }
            a2 = com.trolmastercard.sexmod.ce$a.a(a4, a3, (float)d);
        }
        iBone5.setRotationX(((a)a2).c.a);
        iBone5.setRotationY(((a)a2).c.c);
        iBone5.setRotationZ(((a)a2).c.b);
        iBone6.setRotationX(((a)a2).g.a);
        iBone6.setRotationY(((a)a2).g.c);
        iBone6.setRotationZ(((a)a2).g.b);
        iBone4.setRotationX(((a)a2).b.a);
        iBone4.setRotationY(((a)a2).b.c);
        iBone4.setRotationZ(((a)a2).b.b);
        iBone3.setRotationX(((a)a2).h.a);
        iBone3.setRotationY(((a)a2).h.c);
        iBone3.setRotationZ(((a)a2).h.b);
        iBone6.setScaleY(a2.a);
        iBone5.setScaleY(a2.f);
        iBone2.setRotationY(a2.d);
        iBone.setRotationY(a2.e);
    }

    /*
     * Unable to fully structure code
     */
    a a(@Nonnull f8 var1_1, @Nonnull f_ var2_2, IBone var3_3, IBone var4_4, AnimationProcessor var5_5) {
        block20: {
            block21: {
                block18: {
                    block19: {
                        var6_6 = new a();
                        com.trolmastercard.sexmod.ce$a.access$202(var6_6, new f7(ce.m, 0.0f, var3_3.getRotationZ()));
                        com.trolmastercard.sexmod.ce$a.access$302(var6_6, new f7(ce.l, 0.0f, var4_4.getRotationZ()));
                        var7_7 = var2_2.aE + var5_5.getBone("upperBody").getRotationX();
                        var8_8 = this.a.func_184121_ak();
                        var9_9 = dh.a(var2_2, var8_8);
                        var10_10 = var1_1.b("armR").func_178787_e(var9_9);
                        var11_11 = var1_1.b("armL").func_178787_e(var9_9);
                        var12_12 = be.a(var10_10, var1_1.R);
                        var13_13 = be.a(var11_11, var1_1.R);
                        var14_14 = f_.a(var2_2, var8_8);
                        try {
                            v0 = var14_14 == null ? b6.b(var2_2.field_70758_at, var2_2.field_70759_as, (double)var8_8) : var14_14.floatValue();
                        }
                        catch (RuntimeException v1) {
                            throw ce.a(v1);
                        }
                        var15_15 = v0;
                        var16_16 = gc.c(var15_15);
                        var17_17 = var1_1.b(var8_8);
                        var18_18 = (float)b6.e(Math.min(1.0f, var17_17));
                        if (var18_18 != 1.0f) {
                            var19_19 = 0.0f;
                        } else {
                            var19_19 = (var17_17 * 28.0f - 28.0f) / 32.0f;
                            var19_19 = Math.max(0.0f, var19_19 - 0.5f) * 2.0f;
                        }
                        var20_20 = (float)b6.h(var19_19);
                        var21_21 = gc.c(b6.a(0.0f, 90.0f, var18_18));
                        var22_22 = var1_1.a(var1_1.R, var8_8);
                        try {
                            try {
                                if (!var22_22) break block18;
                                com.trolmastercard.sexmod.ce$a.access$002(var6_6, new f7(-var7_7 + var12_12.a + gc.c(90.0f), var12_12.c, 0.0f));
                                com.trolmastercard.sexmod.ce$a.access$102(var6_6, new f7(-var7_7 + var13_13.a + gc.c(90.0f), (float)((double)var13_13.c + (double)gc.c(-20.0f) * Math.cos(var12_12.c + var16_16 * 1.0f) + (double)b6.a(var21_21 / 2.0f, 0.0f, var20_20)), 0.0f));
                                com.trolmastercard.sexmod.ce$a.access$402(var6_6, 1.0f + Math.abs(Math.abs(var12_12.c) - Math.abs(var16_16)) * 0.1909f);
                                com.trolmastercard.sexmod.ce$a.access$702(var6_6, gc.c(90.0f));
                                com.trolmastercard.sexmod.ce$a.access$200((a)var6_6).b = b6.a(var21_21, 0.0f, var20_20);
                                if (!((double)var19_19 > 0.5)) break block19;
                            }
                            catch (RuntimeException v2) {
                                throw ce.a(v2);
                            }
                            com.trolmastercard.sexmod.ce$a.access$200((a)var6_6).a = ce.m + (float)b6.b((double)ce.g, 0.0, b6.h((var19_19 - 0.5f) * 2.0f));
                            break block20;
                        }
                        catch (RuntimeException v3) {
                            throw ce.a(v3);
                        }
                    }
                    try {
                        try {
                            if (var19_19 == 0.0f || !((double)var19_19 < 0.5)) ** GOTO lbl88
                        }
                        catch (RuntimeException v4) {
                            throw ce.a(v4);
                        }
                        com.trolmastercard.sexmod.ce$a.access$200((a)var6_6).a = ce.m + (float)b6.b(0.0, (double)ce.g, b6.h(var19_19 * 2.0f));
                    }
                    catch (RuntimeException v5) {
                        throw ce.a(v5);
                    }
                }
                try {
                    com.trolmastercard.sexmod.ce$a.access$102(var6_6, new f7(-var7_7 + var13_13.a + gc.c(90.0f), var13_13.c, 0.0f));
                    com.trolmastercard.sexmod.ce$a.access$002(var6_6, new f7(-var7_7 + var12_12.a + gc.c(90.0f), (float)((double)var12_12.c + (double)gc.c(20.0f) * Math.cos(var13_13.c + var16_16 * 1.0f)) - b6.a(var21_21 / 2.0f, 0.0f, var20_20), 0.0f));
                    com.trolmastercard.sexmod.ce$a.access$502(var6_6, 1.0f + Math.abs(Math.abs(var13_13.c) - Math.abs(var16_16)) * 0.1909f);
                    com.trolmastercard.sexmod.ce$a.access$602(var6_6, gc.c(90.0f));
                    com.trolmastercard.sexmod.ce$a.access$300((a)var6_6).b = -b6.a(var21_21, 0.0f, var20_20);
                    if (!((double)var19_19 > 0.5)) break block21;
                    com.trolmastercard.sexmod.ce$a.access$300((a)var6_6).a = ce.l + (float)b6.b((double)ce.g, 0.0, b6.h((var19_19 - 0.5f) * 2.0f));
                    break block20;
                }
                catch (RuntimeException v6) {
                    throw ce.a(v6);
                }
            }
            try {
                try {
                    if (var19_19 == 0.0f || !((double)var19_19 < 0.5)) break block20;
                }
                catch (RuntimeException v7) {
                    throw ce.a(v7);
                }
                com.trolmastercard.sexmod.ce$a.access$300((a)var6_6).a = ce.l + (float)b6.b(0.0, (double)ce.g, b6.h(var19_19 * 2.0f));
            }
            catch (RuntimeException v8) {
                throw ce.a(v8);
            }
        }
        com.trolmastercard.sexmod.ce$a.access$000((a)var6_6).c += var16_16;
        com.trolmastercard.sexmod.ce$a.access$100((a)var6_6).c += var16_16;
        return var6_6;
    }

    a a(f_ f_2, IBone iBone, IBone iBone2, IBone iBone3, IBone iBone4) {
        float f = f_2.aE;
        a a2 = new a();
        try {
            if (f > 0.0f) {
                a2.c = new f7(iBone.getRotationX() - f, iBone.getRotationY() - f * -25.0f / 45.0f, iBone.getRotationZ() + f * 12.5f / 45.0f);
                a2.g = new f7(iBone2.getRotationX() - f, iBone2.getRotationY() + f * 15.0f / 45.0f, iBone2.getRotationZ());
                a2.b = new f7(iBone3.getRotationX(), iBone3.getRotationY(), iBone3.getRotationZ());
                a2.h = new f7(iBone4.getRotationX(), iBone4.getRotationY(), iBone4.getRotationZ());
                return a2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        a2.h = new f7(iBone4.getRotationX() + 2.0f * f, iBone4.getRotationY(), iBone4.getRotationZ());
        a2.b = new f7(iBone3.getRotationX() + 2.2222223f * f, iBone3.getRotationY(), iBone3.getRotationZ());
        a2.c = new f7(iBone.getRotationX() - f, iBone.getRotationY(), iBone.getRotationZ() + f * 5.0f / 45.0f);
        a2.g = new f7(iBone2.getRotationX() - f, iBone2.getRotationY(), iBone2.getRotationZ() - f * 5.0f / 45.0f);
        return a2;
    }

    void b(em em2) {
        float f;
        float f3;
        float f4;
        float f5;
        IBone iBone;
        f8 f82;
        block28: {
            float f6;
            block27: {
                float f9;
                float f10;
                block26: {
                    float f11;
                    block25: {
                        block24: {
                            IBone iBone2;
                            float f12;
                            block23: {
                                try {
                                    if (ClientProxy.IS_PRELOADING) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                try {
                                    if (this.a.func_147113_T()) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                f82 = (f8)em2;
                                try {
                                    if (!dh.b(f82)) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                f_ f_2 = f82.a(false);
                                try {
                                    if (f_2 == null) {
                                        return;
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                                AnimationProcessor animationProcessor = this.getAnimationProcessor();
                                f12 = f_2.aE;
                                animationProcessor.getBone("rotationTool").setRotationX(f12);
                                iBone = animationProcessor.getBone("head");
                                iBone2 = animationProcessor.getBone("upperBody");
                                IBone iBone3 = animationProcessor.getBone("boobs");
                                try {
                                    if (!(f12 > 0.0f)) break block23;
                                    iBone2.setRotationX(-1.1111112f * f12);
                                    iBone.setRotationX(0.1333f * f12);
                                    iBone3.setRotationX(f12 * 22.5f / 45.0f);
                                    break block24;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ce.a(runtimeException);
                                }
                            }
                            iBone2.setRotationX(-1.6666666f * f12);
                            iBone.setRotationX(f12 * 0.666f);
                        }
                        f11 = be.a((double)f82.T, f82.af);
                        f6 = be.a((double)f82.ai, f82.W);
                        f5 = Minecraft.func_175610_ah();
                        if (f5 == 0.0f) {
                            f5 = 1.0f;
                        }
                        try {
                            f10 = 7.0f;
                            if (!(Math.abs(f11) < 7.0f)) break block25;
                            f9 = f11;
                            break block26;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ce.a(runtimeException);
                        }
                    }
                    try {
                        f9 = f11 > 0.0f ? 7.0f : -7.0f;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ce.a(runtimeException);
                    }
                }
                f4 = f10 * f9 * (1.0f / f5);
                try {
                    f3 = 7.0f;
                    if (!(Math.abs(f6) < 7.0f)) break block27;
                    f = f6;
                    break block28;
                }
                catch (RuntimeException runtimeException) {
                    throw ce.a(runtimeException);
                }
            }
            try {
                f = f6 > 0.0f ? 7.0f : -7.0f;
            }
            catch (RuntimeException runtimeException) {
                throw ce.a(runtimeException);
            }
        }
        float f13 = f3 * f * (1.0f / f5);
        float f14 = f82.T + f4;
        float f15 = f82.ai + f13;
        iBone.setRotationY(iBone.getRotationY() + f14);
        iBone.setRotationX(iBone.getRotationX() + f15);
        f82.T = f14;
        f82.ai = f15;
    }

    public static void a(em em2, AnimationProcessor animationProcessor, float f) {
        try {
            if (ClientProxy.IS_PRELOADING) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        boolean bl = dh.a(em2);
        ce.e(animationProcessor, bl);
        ce.f(animationProcessor, bl);
        ce.b(em2, animationProcessor, f);
    }

    static void b(em em2, AnimationProcessor animationProcessor, float f) {
        try {
            if (!(em2 instanceof f8)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        for (int i = 0; i < 3; ++i) {
            boolean bl;
            IBone iBone;
            block9: {
                block8: {
                    IBone iBone2 = animationProcessor.getBone("cockStage" + i);
                    try {
                        try {
                            if (iBone2 == null) continue;
                            iBone = iBone2;
                            if (i <= ((f8)em2).an) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ce.a(runtimeException);
                        }
                        bl = true;
                        break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ce.a(runtimeException);
                    }
                }
                bl = false;
            }
            iBone.setHidden(bl);
        }
    }

    static void f(AnimationProcessor animationProcessor, boolean bl) {
        boolean bl2;
        IBone iBone;
        try {
            iBone = animationProcessor.getBone("skirt");
            bl2 = !bl;
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        iBone.setHidden(bl2);
    }

    static void e(AnimationProcessor animationProcessor, boolean bl) {
        boolean bl2;
        IBone iBone;
        boolean bl3;
        IBone iBone2;
        try {
            animationProcessor.getBone("cheekRBelowSkirt").setHidden(bl);
            animationProcessor.getBone("cheekLBelowSkirt").setHidden(bl);
            animationProcessor.getBone("sideRNoSkirt").setHidden(bl);
            iBone2 = animationProcessor.getBone("sideRSkirt");
            bl3 = !bl;
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        try {
            iBone2.setHidden(bl3);
            animationProcessor.getBone("sideLNoSkirt").setHidden(bl);
            iBone = animationProcessor.getBone("sideLSkirt");
            bl2 = !bl;
        }
        catch (RuntimeException runtimeException) {
            throw ce.a(runtimeException);
        }
        iBone.setHidden(bl2);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static class a {
        private f7 c;
        private f7 g;
        private f7 h;
        private f7 b;
        private float f = 1.0f;
        private float a = 1.0f;
        private float e = 0.0f;
        private float d = 0.0f;

        private a() {
        }

        static a a(a a2, a a3, float f) {
            a a4 = new a();
            a4.c = b6.a(a2.c, a3.c, (double)f);
            a4.g = b6.a(a2.g, a3.g, (double)f);
            a4.h = b6.a(a2.h, a3.h, (double)f);
            a4.b = b6.a(a2.b, a3.b, (double)f);
            a4.f = b6.a(a2.f, a3.f, f);
            a4.a = b6.a(a2.a, a3.a, f);
            a4.e = b6.a(a2.e, a3.e, f);
            a4.d = b6.a(a2.d, a3.d, f);
            return a4;
        }

        static /* synthetic */ float access$402(a a2, float f) {
            a2.a = f;
            return a2.a;
        }

        static /* synthetic */ float access$702(a a2, float f) {
            a2.e = f;
            return a2.e;
        }

        static /* synthetic */ float access$502(a a2, float f) {
            a2.f = f;
            return a2.f;
        }

        static /* synthetic */ float access$602(a a2, float f) {
            a2.d = f;
            return a2.d;
        }
    }
}
