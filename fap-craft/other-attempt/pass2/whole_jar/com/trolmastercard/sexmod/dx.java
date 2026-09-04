/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.vecmath.Vector4f
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b7;
import com.trolmastercard.sexmod.da;
import com.trolmastercard.sexmod.dm;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gx;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import javax.annotation.Nullable;
import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.geo.render.built.GeoBone;
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
        if (em2.field_70170_p instanceof gj) {
            return null;
        }
        if (((b7)((Object)em2)).c()) {
            return null;
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
    protected void b(Tessellator tessellator, BufferBuilder bufferBuilder, em em2, f7 f72, float f10) {
        dx.a(tessellator, bufferBuilder, em2, f72, f10);
    }

    @Override
    public void a(em em2, double d10, double d11, double d12, float f10, float f11) {
        super.a(em2, d10, d11, d12, f10, f11);
        if (dx.i.field_71474_y.field_74320_O == 0 && dx.i.field_71439_g.getPersistentID().equals(((ei)em2).m()) && !em2.Q()) {
            return;
        }
        da.a(em2, f11);
    }

    @Override
    protected void a(boolean bl2) {
        block0: {
            super.a(bl2);
            if (!bl2) break block0;
            GlStateManager.func_179137_b((double)0.15, (double)0.0, (double)0.0);
        }
    }

    @Override
    protected void a(boolean bl2, boolean bl3) {
        block1: {
            block0: {
                super.a(bl2, bl3);
                if (!bl2) break block0;
                GlStateManager.func_179137_b((double)0.0, (double)-0.05, (double)-0.05);
                GlStateManager.func_179114_b((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                if (!bl3) break block1;
                GlStateManager.func_179137_b((double)0.3, (double)0.2, (double)0.0);
                GlStateManager.func_179114_b((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)15.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                break block1;
            }
            GlStateManager.func_179137_b((double)0.0, (double)0.0, (double)0.1);
            GlStateManager.func_179114_b((float)30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (!bl3) break block1;
            GlStateManager.func_179114_b((float)-29.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }
    }

    @Override
    protected Vector4f a(String string, float f10, float f11, float f12) {
        if (!z.contains(string)) {
            return this.a(f10, f11, f12);
        }
        if ("armorHelmet".equals(string)) {
            return super.a(string, f10, f11, f12);
        }
        ItemStack itemStack = ItemStack.field_190927_a;
        switch (string) {
            case "braBoobL": 
            case "braBoobR": 
            case "armorNippleR": 
            case "armorNippleL": {
                itemStack = (ItemStack)this.j.func_184212_Q().func_187225_a(e2.T);
                break;
            }
            case "turnable": 
            case "static": 
            case "slip": {
                itemStack = (ItemStack)this.j.func_184212_Q().func_187225_a(e2.U);
                break;
            }
            case "shinL": 
            case "shinR": 
            case "sockL": 
            case "sockR": 
            case "kneeL": 
            case "kneeR": {
                itemStack = (ItemStack)this.j.func_184212_Q().func_187225_a(e2.W);
            }
        }
        if (!(itemStack.func_77973_b() instanceof ItemArmor)) {
            return this.a(f10, f11, f12);
        }
        String string2 = (ItemArmor)itemStack.func_77973_b();
        switch (string2.func_82812_d()) {
            default: {
                return new Vector4f(f10, f11, f12, -0.1875f);
            }
            case GOLD: {
                return new Vector4f(f10, f11, f12, -0.15625f);
            }
            case IRON: 
            case CHAIN: {
                return new Vector4f(f10, f11, f12, -0.125f);
            }
            case LEATHER: 
        }
        int n2 = string2.func_82814_b(itemStack);
        float f13 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f14 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f15 = (float)(n2 & 0xFF) / 255.0f;
        return new Vector4f(f10 *= f13, f11 *= f14, f12 *= f15, -0.09375f);
    }

    protected void a(GeoModel geoModel, BufferBuilder bufferBuilder, em em2, float f10, float f11, float f12, float f13, float f14) {
        GeoBone geoBone = geoModel.topLevelBones.get(0);
        GeoBone geoBone2 = null;
        GeoBone geoBone3 = null;
        for (GeoBone geoBone4 : geoBone.childBones) {
            switch (geoBone4.getName()) {
                case "steve": {
                    geoBone3 = geoBone4;
                    break;
                }
                case "body": {
                    geoBone2 = geoBone4;
                }
            }
        }
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        this.renderRecursively(bufferBuilder, geoBone2, f10, f11, f12, f13);
        Tessellator.func_178181_a().func_78381_a();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        try {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.d(this.j));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.renderRecursively(bufferBuilder, geoBone3, f10, f11, f12, this.j.v());
        Tessellator.func_178181_a().func_78381_a();
        MATRIX_STACK.pop();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

