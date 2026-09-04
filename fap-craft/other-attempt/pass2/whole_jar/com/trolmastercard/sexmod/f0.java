/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.ResourceLocation
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a9;
import com.trolmastercard.sexmod.ap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class f0
extends GeoItemRenderer<ap> {
    Minecraft a = Minecraft.func_71410_x();
    static ResourceLocation b = null;

    public f0() {
        super(new a9());
    }

    /*
     * Exception decompiling
     */
    ResourceLocation a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 8[FORLOOP]
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
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void a(GeoModel geoModel, ap ap2, float f10, float f11, float f12, float f13, float f14) {
        GlStateManager.func_179129_p();
        GlStateManager.func_179091_B();
        this.renderEarly(ap2, f10, f11, f12, f13, f14);
        this.renderLate(ap2, f10, f11, f12, f13, f14);
        BufferBuilder bufferBuilder = Tessellator.func_178181_a().func_178180_c();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        for (GeoBone geoBone : geoModel.topLevelBones) {
            this.a(bufferBuilder, ap2, geoBone, f11, f12, f13, f14);
        }
        Tessellator.func_178181_a().func_78381_a();
        this.renderAfter(ap2, f10, f11, f12, f13, f14);
        GlStateManager.func_179101_C();
        GlStateManager.func_179089_o();
    }

    public void a(BufferBuilder bufferBuilder, ap ap2, GeoBone geoBone, float f10, float f11, float f12, float f13) {
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        this.a.field_71446_o.func_110577_a(this.a());
        if (this.a(geoBone.getName())) {
            this.b(bufferBuilder, ap2, geoBone, f10, f11, f12, f13);
        }
        MATRIX_STACK.pop();
    }

    boolean a(String string) {
        if (!string.equals("leftArm") && !string.equals("rightArm")) {
            return true;
        }
        return this.a.field_71439_g.getEntityData().func_74767_n("sexmodAllieInUse") && this.a.field_71474_y.field_74320_O == 0;
    }

    void b(BufferBuilder bufferBuilder, ap ap2, GeoBone geoBone, float f10, float f11, float f12, float f13) {
        if (!geoBone.isHidden) {
            for (GeoCube object : geoBone.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.func_179094_E();
                this.renderCube(bufferBuilder, object, f10, f11, f12, f13);
                GlStateManager.func_179121_F();
                MATRIX_STACK.pop();
            }
            for (GeoBone geoBone2 : geoBone.childBones) {
                this.a(bufferBuilder, ap2, geoBone2, f10, f11, f12, f13);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

