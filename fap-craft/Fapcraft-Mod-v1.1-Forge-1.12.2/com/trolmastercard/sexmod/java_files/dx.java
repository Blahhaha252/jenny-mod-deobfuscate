/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.vecmath.Vector4f
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.entity.RenderManager
 *  software.bernie.geckolib3.geo.render.built.GeoModel
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b7;
import com.trolmastercard.sexmod.da;
import com.trolmastercard.sexmod.dm;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gx;
import java.util.Arrays;
import java.util.HashSet;
import javax.annotation.Nullable;
import javax.vecmath.Vector4f;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dx
extends dm {
    static final HashSet<String> z = new HashSet<String>(Arrays.asList("kneeL", "kneeR", "shinL", "shinR", "armorHelmet", "sockL", "sockR", "braBoobL", "braBoobR", "armorNippleR", "armorNippleL", "slip", "turnable", "static"));

    public dx(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel);
    }

    @Nullable
    protected f7 e(em em2) {
        try {
            if (em2.field_70170_p instanceof gj) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dx.a(runtimeException);
        }
        try {
            if (((b7)((Object)em2)).c()) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dx.a(runtimeException);
        }
        return da.y;
    }

    @Override
    public HashSet<String> a() {
        HashSet<String> hashSet = da.E;
        da.E.addAll(gx.a);
        return da.E;
    }

    @Override
    protected void b(Tessellator tessellator, BufferBuilder bufferBuilder, em em2, f7 f72, float f) {
        dx.a(tessellator, bufferBuilder, em2, f72, f);
    }

    @Override
    public void a(em em2, double d, double d2, double d3, float f, float f3) {
        block6: {
            try {
                try {
                    try {
                        super.a(em2, d, d2, d3, f, f3);
                        if (dx.i.field_71474_y.field_74320_O != 0 || !dx.i.field_71439_g.getPersistentID().equals(((ei)em2).m())) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw dx.a(runtimeException);
                    }
                    if (em2.Q()) break block6;
                }
                catch (RuntimeException runtimeException) {
                    throw dx.a(runtimeException);
                }
                return;
            }
            catch (RuntimeException runtimeException) {
                throw dx.a(runtimeException);
            }
        }
        da.a(em2, f3);
    }

    @Override
    protected void a(boolean bl) {
        try {
            super.a(bl);
            if (bl) {
                GlStateManager.func_179137_b((double)0.15, (double)0.0, (double)0.0);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dx.a(runtimeException);
        }
    }

    @Override
    protected void a(boolean bl, boolean bl2) {
        block8: {
            block7: {
                try {
                    try {
                        super.a(bl, bl2);
                        if (!bl) break block7;
                        GlStateManager.func_179137_b((double)0.0, (double)-0.05, (double)-0.05);
                        GlStateManager.func_179114_b((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                        if (!bl2) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw dx.a(runtimeException);
                    }
                    GlStateManager.func_179137_b((double)0.3, (double)0.2, (double)0.0);
                    GlStateManager.func_179114_b((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GlStateManager.func_179114_b((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break block8;
                }
                catch (RuntimeException runtimeException) {
                    throw dx.a(runtimeException);
                }
            }
            try {
                GlStateManager.func_179137_b((double)0.0, (double)0.0, (double)0.1);
                GlStateManager.func_179114_b((float)30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                if (bl2) {
                    GlStateManager.func_179114_b((float)-29.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
            }
            catch (RuntimeException runtimeException) {
                throw dx.a(runtimeException);
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    protected Vector4f a(String var1_1, float var2_2, float var3_3, float var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 5[SWITCH]
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

    /*
     * Exception decompiling
     */
    protected void a(GeoModel var1_1, BufferBuilder var2_2, em var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    private static Exception a(Exception exception) {
        return exception;
    }
}
