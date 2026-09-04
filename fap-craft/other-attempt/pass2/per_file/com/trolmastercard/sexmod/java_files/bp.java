/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.util.ResourceLocation
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a4;
import com.trolmastercard.sexmod.ay;
import com.trolmastercard.sexmod.c_;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class bp
extends RenderLiving<ay> {
    private static final ResourceLocation a = new ResourceLocation("textures/entity/slime/slime.png");

    public bp(RenderManager renderManager) {
        super(renderManager, (ModelBase)new c_(), 0.25f);
        this.func_177094_a(new a4(this));
    }

    public void a(ay ay2, double d, double d2, double d3, float f, float f2) {
        this.field_76989_e = 0.25f * (float)ay2.h();
        super.func_76986_a((EntityLiving)ay2, d, d2, d3, f, f2);
    }

    protected void a(ay ay2, float f) {
        float f2 = 0.999f;
        GlStateManager.func_179152_a((float)0.999f, (float)0.999f, (float)0.999f);
        float f3 = ay2.h();
        float f4 = (ay2.h + (ay2.e - ay2.h) * f) / (f3 * 0.5f + 1.0f);
        float f5 = 1.0f / (f4 + 1.0f);
        GlStateManager.func_179152_a((float)(f5 * f3), (float)(1.0f / f5 * f3), (float)(f5 * f3));
    }

    protected ResourceLocation a(ay ay2) {
        return a;
    }
}
