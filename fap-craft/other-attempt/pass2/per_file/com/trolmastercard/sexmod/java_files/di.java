/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.dm;
import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.gc;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class di
extends dm {
    float z = 0.0f;

    public di(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel);
    }

    @Override
    protected void c() {
        GlStateManager.func_179109_b((float)0.0f, (float)-1.0f, (float)0.0f);
        GlStateManager.func_179152_a((float)0.65f, (float)0.65f, (float)0.65f);
    }

    @Override
    protected ItemStack a(@Nullable ItemStack itemStack) {
        switch (this.j.y()) {
            case FISHING_IDLE: 
            case FISHING_START: {
                ItemStack itemStack2 = ((eb)this.j).ao;
                this.j.func_184611_a(EnumHand.MAIN_HAND, itemStack2);
                return itemStack2;
            }
        }
        return itemStack;
    }

    boolean b() {
        return (Boolean)this.j.func_184212_Q().func_187225_a(em.G);
    }

    @Override
    protected void a(String string, GeoBone geoBone) {
        if (Minecraft.func_71410_x().func_147113_T()) {
            return;
        }
        switch (string) {
            case "head": {
                this.z = geoBone.getRotationX();
                break;
            }
            case "backHair": {
                if (this.b() || !(this.z > 0.0f)) break;
                double d = this.z / gc.c(45.0f);
                float f = (float)b6.b(0.0, 0.75, d);
                geoBone.setPositionZ(f);
                geoBone.setPositionY(f);
                geoBone.setRotationX(-this.z);
                break;
            }
            case "frontHairL": 
            case "frontHairR": {
                if (this.b()) break;
                geoBone.setRotationX(-this.z);
            }
        }
    }

    @Override
    protected void a(boolean bl, ItemStack itemStack) {
        super.a(bl, itemStack);
        switch (itemStack.func_77973_b().func_77661_b(itemStack)) {
            case BLOCK: 
            case BOW: {
                break;
            }
            default: {
                GlStateManager.func_179114_b((float)(bl ? 60.0f : 150.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179137_b((double)0.0, (double)0.08, (double)-0.05);
            }
        }
    }

    @Override
    protected void a(boolean bl) {
        block0: {
            GlStateManager.func_179114_b((float)(bl ? 60.0f : 150.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            if (!bl) break block0;
            GlStateManager.func_179137_b((double)0.12, (double)0.0, (double)0.0);
        }
    }

    @Override
    protected void a(boolean bl, boolean bl2) {
        super.a(bl, bl2);
        if (!bl && bl2) {
            GlStateManager.func_179114_b((float)120.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            return;
        }
        if (!bl && !bl2) {
            GlStateManager.func_179137_b((double)0.0, (double)0.3, (double)-0.15);
            GlStateManager.func_179114_b((float)-45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            return;
        }
        if (bl && !bl2) {
            GlStateManager.func_179137_b((double)-0.025, (double)-0.05, (double)0.0);
            return;
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
