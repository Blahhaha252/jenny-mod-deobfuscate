/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.item.ItemStack
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.dm;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class d2
extends dm {
    public d2(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel);
    }

    @Override
    protected void a(boolean bl2, ItemStack itemStack) {
        GlStateManager.func_179114_b((float)(bl2 ? 290.0f : 90.0f), (float)1.0f, (float)0.0f, (float)0.0f);
    }

    @Override
    protected void c() {
        GlStateManager.func_179109_b((float)0.0f, (float)-0.6f, (float)0.0f);
        GlStateManager.func_179152_a((float)0.4f, (float)0.4f, (float)0.4f);
    }

    @Override
    protected void a(boolean bl2) {
        block0: {
            super.a(bl2);
            if (!bl2) break block0;
            GlStateManager.func_179137_b((double)0.1, (double)0.0, (double)0.0);
        }
    }

    @Override
    protected void a(boolean bl2, boolean bl3) {
        block1: {
            block0: {
                if (!bl2) break block0;
                GlStateManager.func_179114_b((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179109_b((float)0.0f, (float)-0.14f, (float)-0.17f);
                if (!bl3) break block1;
                GlStateManager.func_179114_b((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GlStateManager.func_179137_b((double)0.067, (double)0.0, (double)0.0);
                break block1;
            }
            if (!bl3) break block1;
            GlStateManager.func_179114_b((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.func_179109_b((float)0.0f, (float)0.165f, (float)0.0f);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

