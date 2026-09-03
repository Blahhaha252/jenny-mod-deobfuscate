/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  software.bernie.geckolib3.core.AnimationState
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.processor.AnimationProcessor
 *  software.bernie.geckolib3.core.processor.IBone
 *  software.bernie.geckolib3.resource.GeckoLibCache
 *  software.bernie.shadowed.eliotlash.molang.MolangParser
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.a_;
import com.trolmastercard.sexmod.ak;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.b7;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ce;
import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.resource.GeckoLibCache;
import software.bernie.shadowed.eliotlash.molang.MolangParser;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cb
extends cv {
    public static ResourceLocation h = new ResourceLocation("sexmod", "textures/entity/galath/galath.png");
    float g = 0.0f;
    long f = -1L;
    long i = -1L;

    public cb() {
        this.c = this.a();
    }

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/galath/galath.geo.json"), new ResourceLocation("sexmod", "geo/galath/galath.geo.json"), new ResourceLocation("sexmod", "geo/galath/galath_con_mang.geo.json")};
    }

    @Override
    public ResourceLocation a(em em2) {
        try {
            if (em2.field_70170_p instanceof gj) {
                return this.c[0];
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        try {
            if (((b7)((Object)em2)).b()) {
                return this.c[2];
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        return this.c[(Integer)em2.func_184212_Q().func_187225_a(em.D)];
    }

    @Override
    public ResourceLocation b() {
        return h;
    }

    @Override
    public ResourceLocation b(em em2) {
        return new ResourceLocation("sexmod", "animations/galath/galath.animation.json");
    }

    protected boolean e(em em2) {
        try {
            if (!(em2 instanceof f_)) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        f_ f_2 = (f_)em2;
        try {
            if (f_2.k()) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        try {
            if (f_2.M() == null) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        return false;
    }

    public void a(em em2, Integer n, AnimationEvent animationEvent) {
        try {
            this.k(em2);
            super.a(em2, n, animationEvent);
            this.a(em2);
            this.h(em2);
            this.f(em2);
            this.b(em2);
            this.e(em2);
            this.g(em2);
            this.j(em2);
            this.a();
            this.c(em2);
            this.i(em2);
            this.d(em2);
            if (!(em2 instanceof f_)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        f_ f_2 = (f_)em2;
        try {
            f_2.aE = this.getAnimationProcessor().getBone("head").getRotationX();
            if (f_2.b()) {
                ce.a(f_2, this.getAnimationProcessor(), animationEvent.getPartialTick());
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
    }

    void i(em em2) {
        float f;
        block23: {
            float f3;
            block21: {
                try {
                    if (!fp.a(em2, fp.PUSSY_LICKING)) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                try {
                    if (!(em2 instanceof f_)) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                try {
                    if (this.a.func_147113_T()) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                AnimationProcessor animationProcessor = this.getAnimationProcessor();
                IBone iBone = animationProcessor.getBone("head");
                f3 = this.a.func_184121_ak() + (float)this.a.field_71439_g.field_70173_aa;
                f7 f72 = this.a((f_)em2, f3);
                try {
                    try {
                        iBone.setRotationX(iBone.getRotationX() + f72.a);
                        iBone.setRotationY(iBone.getRotationY() + f72.c);
                        iBone.setRotationZ(iBone.getRotationZ() + f72.b);
                        if (em2.y() == fp.PUSSY_LICKING && !((f_)em2).a5) break block21;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cb.a(runtimeException);
                    }
                    return;
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
            }
            f = (float)(Math.sin(f3 * 0.3f) * 10.0);
            try {
                block22: {
                    try {
                        try {
                            try {
                                if (f > 0.0f && this.g < 0.0f) break block22;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cb.a(runtimeException);
                            }
                            if (!(f < 0.0f)) break block23;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cb.a(runtimeException);
                        }
                        if (!(this.g > 0.0f)) break block23;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cb.a(runtimeException);
                    }
                }
                em2.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND));
            }
            catch (RuntimeException runtimeException) {
                throw cb.a(runtimeException);
            }
        }
        this.g = f;
    }

    f7 a(f_ f_2, float f) {
        return b6.a(this.a(f), f7.d, (double)f_2.b(this.a.func_184121_ak()));
    }

    f7 a(float f) {
        return new f7((float)Math.sin(f * 0.3f) * gc.c(10.0f), (float)Math.sin(f * 0.15f) * gc.c(7.0f), (float)Math.sin((double)f * -0.15) * gc.c(7.0f));
    }

    void c(em em2) {
        try {
            if (!(em2 instanceof f_)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        f_ f_2 = (f_)em2;
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        IBone iBone = animationProcessor.getBone("body");
        f_2.bw = iBone.getRotationY();
        f_2.bm = iBone.getScaleY();
    }

    void d(em em2) {
        try {
            if (em2.C.getAnimationState() != AnimationState.Transitioning) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        fp fp2 = em2.y();
        if (fp2 == fp.HUG_MANG) {
            IBone iBone = animationProcessor.getBone("body2");
            try {
                if (iBone == null) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw cb.a(runtimeException);
            }
            iBone.setPositionX(0.0f);
            iBone.setPositionY(-0.53f);
            iBone.setPositionZ(-40.05f);
        }
    }

    void k(em em2) {
        try {
            if (ClientProxy.IS_PRELOADING) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        try {
            if (em2.y() != fp.MASTERBATE) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        EntityPlayer entityPlayer = em2.z();
        if (entityPlayer == null) {
            entityPlayer = this.a.field_71439_g;
        }
        MolangParser molangParser = GeckoLibCache.getInstance().parser;
        Vec3d vec3d = ak.b((Entity)em2, entityPlayer, this.a.func_184121_ak()).func_178787_e(em2.b("head"));
        float f = (float)gc.b(Math.atan2(vec3d.field_72449_c, vec3d.field_72450_a)) - em2.I().floatValue();
        float f3 = (float)gc.b(Math.atan2(vec3d.field_72448_b, Math.sqrt(vec3d.field_72450_a * vec3d.field_72450_a + vec3d.field_72449_c * vec3d.field_72449_c)));
        double d = Math.abs(vec3d.field_72450_a) + Math.abs(vec3d.field_72448_b) + Math.abs(vec3d.field_72449_c);
        double d2 = d * 7.0 + -20.0;
        double d3 = d * 5.0 + -20.0;
        molangParser.setValue("pitch", d2 + (double)f3 - 80.0);
        molangParser.setValue("armpitch", d3 + (double)f3 + -110.0);
        molangParser.setValue("armyaw", (double)(f + 80.0f));
        molangParser.setValue("yaw", (double)(f + 90.0f));
    }

    void a() {
        boolean bl;
        IBone iBone;
        boolean bl2;
        IBone iBone2;
        boolean bl3;
        IBone iBone3;
        try {
            if (ClientProxy.IS_PRELOADING) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        try {
            iBone3 = this.getAnimationProcessor().getBone("futaCock");
            bl3 = !a_.e;
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        try {
            iBone3.setHidden(bl3);
            iBone2 = this.getAnimationProcessor().getBone("futaBallLL");
            bl2 = !a_.e;
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        try {
            iBone2.setHidden(bl2);
            iBone = this.getAnimationProcessor().getBone("futaBallLR");
            bl = !a_.e;
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        iBone.setHidden(bl);
    }

    void j(em em2) {
        try {
            if (!(em2 instanceof ei)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        this.getAnimationProcessor().getBone("coin").setHidden(true);
    }

    void g(em em2) {
        boolean bl;
        IBone iBone;
        try {
            iBone = this.getAnimationProcessor().getBone("wings");
            bl = !((b7)((Object)em2)).a();
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        iBone.setHidden(bl);
    }

    void e(em em2) {
        boolean bl;
        IBone iBone;
        block15: {
            block14: {
                boolean bl2;
                IBone iBone2;
                boolean bl3;
                IBone iBone3;
                AnimationProcessor animationProcessor = this.getAnimationProcessor();
                IBone iBone4 = animationProcessor.getBone("nippleR");
                IBone iBone5 = animationProcessor.getBone("nippleL");
                IBone iBone6 = animationProcessor.getBone("braBoobL");
                IBone iBone7 = animationProcessor.getBone("braBoobR");
                IBone iBone8 = animationProcessor.getBone("slip");
                boolean bl4 = ((b7)((Object)em2)).c();
                boolean bl5 = fp.a(em2, fp.PUSSY_LICKING, fp.MASTERBATE_SITTING, fp.MASTERBATE_SITTING_CUM);
                try {
                    if (iBone4 == null) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                try {
                    if (iBone6 == null) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                try {
                    iBone3 = iBone4;
                    bl3 = !bl4;
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                try {
                    iBone3.setHidden(bl3);
                    iBone2 = iBone5;
                    bl2 = !bl4;
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                try {
                    try {
                        iBone2.setHidden(bl2);
                        iBone6.setHidden(bl4);
                        iBone7.setHidden(bl4);
                        iBone = iBone8;
                        if (!bl4 && !bl5) break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cb.a(runtimeException);
                    }
                    bl = true;
                    break block15;
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
            }
            bl = false;
        }
        iBone.setHidden(bl);
    }

    void b(em em2) {
        block14: {
            IBone iBone;
            block13: {
                boolean bl;
                try {
                    if (!(em2 instanceof f_)) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                try {
                    if (!((Boolean)em2.func_184212_Q().func_187225_a(f_.bP)).booleanValue()) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                try {
                    if (em2.y() != fp.KNOCK_OUT_FLY) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                iBone = this.getAnimationProcessor().getBone("body");
                Vec3d vec3d = new Vec3d(em2.field_70142_S, em2.field_70137_T, em2.field_70136_U);
                Vec3d vec3d2 = em2.func_174791_d().func_178788_d(vec3d);
                try {
                    bl = Math.abs(vec3d2.field_72450_a) + Math.abs(vec3d2.field_72449_c) < (double)0.01f;
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                boolean bl2 = bl;
                try {
                    if (!bl2) break block13;
                    iBone.setRotationX(gc.c(-90.0f));
                    iBone.setPositionY(0.0f);
                    iBone.setPositionZ(0.0f);
                    break block14;
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
            }
            Vec3d vec3d = cb.d(em2);
            iBone.setRotationX(-((float)vec3d.field_72450_a));
            iBone.setPositionY((float)vec3d.field_72448_b);
            iBone.setPositionZ((float)vec3d.field_72449_c);
        }
    }

    void h(em em2) {
        try {
            if (!(em2 instanceof f_)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        try {
            if (em2.y() != fp.RAPE_CHARGE) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        Vec3d vec3d = cb.d(em2);
        IBone iBone = this.getAnimationProcessor().getBone("body");
        IBone iBone2 = this.getAnimationProcessor().getBone("rotationTool");
        iBone2.setRotationX((float)vec3d.field_72450_a);
        iBone.setPositionY((float)vec3d.field_72448_b);
        iBone.setPositionZ((float)vec3d.field_72449_c);
        float f = ((Float)em2.func_184212_Q().func_187225_a(f_.bO)).floatValue();
        iBone.setRotationY(gc.c(f * 180.0f));
    }

    void f(em em2) {
        int n;
        f_ f_2;
        block13: {
            try {
                if (!(em2 instanceof f_)) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw cb.a(runtimeException);
            }
            f_2 = (f_)em2;
            try {
                if (f_2.y() != fp.ATTACK_SWORD) {
                    this.f = -1L;
                    this.i = -1L;
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw cb.a(runtimeException);
            }
            n = f_2.az();
            try {
                try {
                    if (n != 24 || this.f != -1L) break block13;
                }
                catch (RuntimeException runtimeException) {
                    throw cb.a(runtimeException);
                }
                this.f = this.a.field_71441_e.func_82737_E();
                this.i = this.f + 8L;
            }
            catch (RuntimeException runtimeException) {
                throw cb.a(runtimeException);
            }
        }
        try {
            if (!be.a((double)n, 24.0, 32.0)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cb.a(runtimeException);
        }
        IBone iBone = this.getAnimationProcessor().getBone("body");
        Vec3d vec3d = cb.a(f_2, f_2.B());
        float f = ((float)Minecraft.func_71410_x().field_71441_e.func_82737_E() + this.a.func_184121_ak() - (float)this.f) / (float)(this.i - this.f);
        vec3d = b6.a(vec3d, Vec3d.field_186680_a, (double)f);
        iBone.setRotationX((float)vec3d.field_72450_a);
        iBone.setPositionY((float)vec3d.field_72448_b);
        iBone.setPositionZ((float)vec3d.field_72449_c);
    }

    /*
     * Exception decompiling
     */
    void a(em var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
