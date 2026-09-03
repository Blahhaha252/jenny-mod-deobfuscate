/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  software.bernie.geckolib3.geo.render.built.GeoModel
 *  software.bernie.geckolib3.model.AnimatedGeoModel
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
    public d8(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d) {
        super(renderManager, animatedGeoModel, d);
    }

    public void a(GeoModel geoModel, em em2, float f, float f2, float f3, float f4, float f5) {
        float f6;
        float f8;
        float f9;
        ev ev2;
        block8: {
            ev2 = (ev)em2;
            try {
                try {
                    if (em2.y() != fp.NULL || em2.h()) break block8;
                }
                catch (RuntimeException runtimeException) {
                    throw d8.a(runtimeException);
                }
                return;
            }
            catch (RuntimeException runtimeException) {
                throw d8.a(runtimeException);
            }
        }
        try {
            ev ev3 = ev2;
            f9 = ev2.U == 1.0f ? ev2.U : ev2.U - 0.01f;
        }
        catch (RuntimeException runtimeException) {
            throw d8.a(runtimeException);
        }
        ev3.U = f9;
        f5 = ev2.U;
        try {
            GlStateManager.func_179152_a((float)f5, (float)f5, (float)f5);
            f8 = 0.0f;
            f6 = f5 == 1.0f ? 0.0f : 3.0f - f5 * 3.0f;
        }
        catch (RuntimeException runtimeException) {
            throw d8.a(runtimeException);
        }
        GlStateManager.func_179109_b((float)f8, (float)f6, (float)0.0f);
        super.a(geoModel, em2, f, f2, f3, f4, f5);
    }

    @Override
    protected void a(double d, double d2, double d3) {
        try {
            if (this.j.y() == fp.NULL) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw d8.a(runtimeException);
        }
        try {
            if (this.j.h()) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw d8.a(runtimeException);
        }
        try {
            if (this.j.y().hideNameTag) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw d8.a(runtimeException);
        }
        try {
            if (d8.i.func_175598_ae().field_78734_h == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw d8.a(runtimeException);
        }
        this.func_147906_a((Entity)this.j, this.j.ab(), d, d2 + (double)this.j.i(), d3, 300);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
