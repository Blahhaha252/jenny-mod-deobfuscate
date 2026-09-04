/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.item.ItemStack
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.dm;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dl
extends dm {
    public dl(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel);
    }

    @Override
    protected void c() {
        GlStateManager.func_179109_b((float)0.0f, (float)-1.5f, (float)0.0f);
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
                GlStateManager.func_179114_b((float)(bl ? 90.0f : 180.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                if (bl) {
                    GlStateManager.func_179137_b((double)0.0, (double)0.23900000452995301, (double)-0.1f);
                    break;
                }
                GlStateManager.func_179137_b((double)0.0, (double)0.1, (double)-0.07);
            }
        }
    }

    @Override
    protected void a(boolean bl) {
        block0: {
            GlStateManager.func_179114_b((float)(bl ? 90.0f : 180.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            if (!bl) break block0;
            GlStateManager.func_179137_b((double)0.2, (double)-0.2, (double)0.0);
        }
    }

    @Override
    protected void a(boolean bl, boolean bl2) {
        if (bl) {
            GlStateManager.func_179114_b((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            if (bl2) {
                GlStateManager.func_179114_b((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GlStateManager.func_179114_b((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179109_b((float)0.4f, (float)0.0f, (float)0.228f);
            }
        } else {
            GlStateManager.func_179109_b((float)0.0f, (float)0.282f, (float)0.141f);
            if (bl2) {
                GlStateManager.func_179137_b((double)0.165, (double)-0.45f, (double)0.0);
                GlStateManager.func_179114_b((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GlStateManager.func_179114_b((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)-27.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                GlStateManager.func_179137_b((double)0.0, (double)0.0, (double)-0.05);
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
