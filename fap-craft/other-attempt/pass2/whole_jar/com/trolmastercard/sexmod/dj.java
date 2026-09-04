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

    public dj(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d10) {
        super(renderManager, animatedGeoModel, d10);
    }

    @Override
    protected Vec3i a(String string) {
        EntityDataManager entityDataManager = ((ff)this.j).func_184212_Q();
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)entityDataManager.func_187225_a(ff.N));
        BlockPos blockPos = (BlockPos)entityDataManager.func_187225_a(ff.K);
        if (t.contains(string)) {
            return eyeAndKoboldColor.getMainColor();
        }
        if (u.contains(string)) {
            return eyeAndKoboldColor.getSecondaryColor();
        }
        if ("irisR".equals(string) || "irisL".equals(string)) {
            return blockPos;
        }
        return r;
    }

    @Override
    protected ItemStack a(@Nullable ItemStack itemStack) {
        switch (((ff)this.j).y()) {
            case MINE: {
                if (((Boolean)((ff)this.j).func_184212_Q().func_187225_a(ff.at)).booleanValue()) {
                    return new ItemStack(Items.field_151036_c);
                }
                return new ItemStack(Items.field_151035_b);
            }
            case NULL: {
                if (!((Boolean)((ff)this.j).func_184212_Q().func_187225_a(ff.aC)).booleanValue()) break;
                return new ItemStack(Items.field_151040_l);
            }
            case ATTACK: {
                return new ItemStack(Items.field_151040_l);
            }
        }
        return itemStack;
    }

    @Override
    public void a(BufferBuilder bufferBuilder, GeoBone geoBone, float f10, float f11, float f12, float f13, double d10) {
        String[] stringArray;
        int n2;
        if (((ff)this.j).field_70170_p instanceof gj) {
            return;
        }
        String string = geoBone.getName();
        if ("blowOpening".equals(string)) {
            d10 = 0.0;
        }
        if ("mouth".equals(string) && (n2 = Integer.parseInt((stringArray = e4.a(this.j))[7])) == 1) {
            d10 = -0.078125;
        }
        super.a(bufferBuilder, geoBone, f10, f11, f12, f13, d10);
    }

    @Override
    protected void d() {
        float f10 = 0.25f - ((Float)((ff)this.j).func_184212_Q().func_187225_a(e7.aA)).floatValue();
        GlStateManager.func_179152_a((float)(1.0f - f10), (float)(1.0f - f10), (float)(1.0f - f10));
    }

    @Override
    protected void b() {
        float f10 = 0.25f - ((Float)((ff)this.j).func_184212_Q().func_187225_a(e7.aA)).floatValue();
        double d10 = 1.0 / (1.0 - (double)f10);
        GlStateManager.func_179139_a((double)d10, (double)d10, (double)d10);
    }

    @Override
    protected ItemStack a() {
        String string = (String)((ff)this.j).func_184212_Q().func_187225_a(em.h);
        if ("STARTBLOWJOB".equals(string)) {
            return new ItemStack(Items.field_151035_b);
        }
        if ("ANAL_START".equals(string)) {
            return new ItemStack(Items.field_151043_k, 3);
        }
        return null;
    }

    @Override
    public void a(ff ff2, double d10, double d11, double d12, float f10, float f11) {
        String string = (String)ff2.func_184212_Q().func_187225_a(e4.N);
        if (ff2.as == null) {
            ff2.as = string;
        }
        if (!ff2.as.equals(string)) {
            dj.c();
            ff2.as = string;
        }
        this.v = new Vector3f((float)d10, (float)d11, (float)d12);
        super.a(ff2, d10, d11, d12, f10, f11);
    }

    @Override
    protected void a(double d10, double d11, double d12) {
        EntityDataManager entityDataManager = ((ff)this.j).func_184212_Q();
        String string = (String)entityDataManager.func_187225_a(ff.aU);
        if ("null".equals(string)) {
            super.a(d10, d11, d12);
            return;
        }
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)entityDataManager.func_187225_a(ff.N));
        string = eyeAndKoboldColor.getTextColor() + " -" + string + "-";
        this.func_147906_a((Entity)this.j, ((ff)this.j).ab() + string, d10, d11 + (double)((ff)this.j).i(), d12, 300);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

