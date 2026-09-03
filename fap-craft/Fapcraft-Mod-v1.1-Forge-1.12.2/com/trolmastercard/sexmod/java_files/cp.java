/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.util.math.Vec3i
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoModel
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.renderers.geo.GeoEntityRenderer
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.i;
import java.awt.Color;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class cp
extends GeoEntityRenderer<i> {
    public static final Color b = new Color(223, 206, 155);
    i a;

    public cp(RenderManager renderManager, AnimatedGeoModel<i> animatedGeoModel) {
        super(renderManager, animatedGeoModel);
    }

    public void a(GeoModel geoModel, i i2, float f, float f2, float f3, float f4, float f5) {
        this.a = i2;
        super.render(geoModel, (Object)i2, f, f2, f3, f4, f5);
    }

    public void renderRecursively(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f3, float f4) {
        String string = geoBone.getName();
        if ("shell".equals(string)) {
            f = (float)b.getRed() / 255.0f;
            f2 = (float)b.getGreen() / 255.0f;
            f3 = (float)b.getBlue() / 255.0f;
        }
        if ("colorSpots".equals(string)) {
            Vec3i vec3i = EyeAndKoboldColor.safeValueOf((String)this.a.func_184212_Q().func_187225_a(i.b)).getMainColor();
            f = (float)vec3i.func_177958_n() / 255.0f;
            f2 = (float)vec3i.func_177956_o() / 255.0f;
            f3 = (float)vec3i.func_177952_p() / 255.0f;
        }
        super.renderRecursively(bufferBuilder, geoBone, f, f2, f3, f4);
    }
}
