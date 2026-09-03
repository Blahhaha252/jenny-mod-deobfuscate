/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.vecmath.Vector3f
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.d6;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.e7;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.gj;
import java.util.Arrays;
import java.util.HashSet;
import javax.annotation.Nullable;
import javax.vecmath.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dj
extends d6<ff> {
    static final HashSet<String> t = new HashSet<String>(Arrays.asList("colorSpots", "neck", "head", "snout", "midSectionR", "midSectionL", "innerCheekLR", "innerCheekRR", "gayL", "gayR", "legR", "legL", "shinL", "toesL", "kneeL", "curvesL", "shinR", "toesR", "kneeR", "curvesR", "sideL", "sideR", "hip", "torsoL", "torsoR", "armR", "lowerArmR", "ellbowR", "armL", "lowerArmL", "ellbowL", "hornUL", "hornUR", "tail", "tail2", "tail3", "tail4", "tail5", "hornDL2", "hornDR2", "hornDR3M", "hornDL3M", "frecklesAL1", "frecklesAL2", "frecklesAR1", "frecklesAR2", "frecklesHL1", "frecklesHL2", "frecklesHR1", "frecklesHR2"));
    static final HashSet<String> u = new HashSet<String>(Arrays.asList("boobR", "boobL", "frontNeck", "Rside", "Lside", "frontAndInside", "innerCheekLL", "innerCheekRL", "layer", "layer2", "down", "down2", "down3", "down4", "down5", "fuckhole", "hornDR3S", "hornDL3S", "assholeCoverUp", "assholeCoverUp2"));
    Minecraft w = Minecraft.func_71410_x();
    Vector3f v;

    public dj(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d) {
        super(renderManager, animatedGeoModel, d);
    }

    @Override
    protected Vec3i a(String string) {
        block10: {
            EntityDataManager entityDataManager = ((ff)this.j).func_184212_Q();
            EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)entityDataManager.func_187225_a(ff.N));
            BlockPos blockPos = (BlockPos)entityDataManager.func_187225_a(ff.K);
            try {
                if (t.contains(string)) {
                    return eyeAndKoboldColor.getMainColor();
                }
            }
            catch (RuntimeException runtimeException) {
                throw dj.a(runtimeException);
            }
            try {
                if (u.contains(string)) {
                    return eyeAndKoboldColor.getSecondaryColor();
                }
            }
            catch (RuntimeException runtimeException) {
                throw dj.a(runtimeException);
            }
            try {
                try {
                    if (!"irisR".equals(string) && !"irisL".equals(string)) break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw dj.a(runtimeException);
                }
                return blockPos;
            }
            catch (RuntimeException runtimeException) {
                throw dj.a(runtimeException);
            }
        }
        return r;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected ItemStack a(@Nullable ItemStack var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[SWITCH]
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
    public void a(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f3, float f4, double d) {
        String[] stringArray;
        int n;
        try {
            if (((ff)this.j).field_70170_p instanceof gj) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dj.a(runtimeException);
        }
        String string = geoBone.getName();
        if ("blowOpening".equals(string)) {
            d = 0.0;
        }
        if ("mouth".equals(string) && (n = Integer.parseInt((stringArray = e4.a(this.j))[7])) == 1) {
            d = -0.078125;
        }
        super.a(bufferBuilder, geoBone, f, f2, f3, f4, d);
    }

    @Override
    protected void d() {
        float f = 0.25f - ((Float)((ff)this.j).func_184212_Q().func_187225_a(e7.aA)).floatValue();
        GlStateManager.func_179152_a((float)(1.0f - f), (float)(1.0f - f), (float)(1.0f - f));
    }

    @Override
    protected void b() {
        float f = 0.25f - ((Float)((ff)this.j).func_184212_Q().func_187225_a(e7.aA)).floatValue();
        double d = 1.0 / (1.0 - (double)f);
        GlStateManager.func_179139_a((double)d, (double)d, (double)d);
    }

    @Override
    protected ItemStack a() {
        String string = (String)((ff)this.j).func_184212_Q().func_187225_a(em.h);
        try {
            if ("STARTBLOWJOB".equals(string)) {
                return new ItemStack(Items.field_151035_b);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dj.a(runtimeException);
        }
        try {
            if ("ANAL_START".equals(string)) {
                return new ItemStack(Items.field_151043_k, 3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dj.a(runtimeException);
        }
        return null;
    }

    @Override
    public void a(ff ff2, double d, double d2, double d3, float f, float f2) {
        String string = (String)ff2.func_184212_Q().func_187225_a(e4.N);
        try {
            if (ff2.as == null) {
                ff2.as = string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dj.a(runtimeException);
        }
        try {
            if (!ff2.as.equals(string)) {
                dj.c();
                ff2.as = string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dj.a(runtimeException);
        }
        this.v = new Vector3f((float)d, (float)d2, (float)d3);
        super.a(ff2, d, d2, d3, f, f2);
    }

    @Override
    protected void a(double d, double d2, double d3) {
        EntityDataManager entityDataManager = ((ff)this.j).func_184212_Q();
        String string = (String)entityDataManager.func_187225_a(ff.aU);
        try {
            if ("null".equals(string)) {
                super.a(d, d2, d3);
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dj.a(runtimeException);
        }
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)entityDataManager.func_187225_a(ff.N));
        string = eyeAndKoboldColor.getTextColor() + " -" + string + "-";
        this.func_147906_a((Entity)this.j, ((ff)this.j).ab() + string, d, d2 + (double)((ff)this.j).i(), d3, 300);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
