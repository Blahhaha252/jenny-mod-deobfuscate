/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.d_;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ev;
import com.trolmastercard.sexmod.fp;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class d8
extends d_ {
    public d8(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d10) {
        super(renderManager, animatedGeoModel, d10);
    }

    public void a(GeoModel geoModel, em em2, float f10, float f11, float f12, float f13, float f14) {
        ev ev2 = (ev)em2;
        if (em2.y() == fp.NULL && !em2.h()) {
            return;
        }
        f14 = ev2.U = ev2.U == 1.0f ? ev2.U : ev2.U - 0.01f;
        GlStateManager.func_179152_a((float)f14, (float)f14, (float)f14);
        GlStateManager.func_179109_b((float)0.0f, (float)(f14 == 1.0f ? 0.0f : 3.0f - f14 * 3.0f), (float)0.0f);
        super.a(geoModel, em2, f10, f11, f12, f13, f14);
    }

    @Override
    protected void a(double d10, double d11, double d12) {
        if (this.j.y() == fp.NULL) {
            return;
        }
        if (this.j.h()) {
            return;
        }
        if (this.j.y().hideNameTag) {
            return;
        }
        if (d8.i.func_175598_ae().field_78734_h == null) {
            return;
        }
        this.func_147906_a((Entity)this.j, this.j.ab(), d10, d11 + (double)this.j.i(), d12, 300);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

