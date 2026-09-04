/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Vec3i
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.renderers.geo.GeoItemRenderer
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.c7;
import com.trolmastercard.sexmod.cp;
import com.trolmastercard.sexmod.f6;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class hn
extends GeoItemRenderer<c7> {
    ItemStack a = null;

    public hn() {
        super((AnimatedGeoModel)new f6());
    }

    public void a(c7 c72, ItemStack itemStack) {
        this.a = itemStack;
        super.render((Item)c72, itemStack);
    }

    public void renderRecursively(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f3, float f4) {
        String string = geoBone.getName();
        if ("shell".equals(string)) {
            f = (float)cp.b.getRed() / 255.0f;
            f2 = (float)cp.b.getGreen() / 255.0f;
            f3 = (float)cp.b.getBlue() / 255.0f;
        }
        if ("colorSpots".equals(string)) {
            Vec3i vec3i = this.a(this.a).getMainColor();
            f = (float)vec3i.func_177958_n() / 255.0f;
            f2 = (float)vec3i.func_177956_o() / 255.0f;
            f3 = (float)vec3i.func_177952_p() / 255.0f;
        }
        super.renderRecursively(bufferBuilder, geoBone, f, f2, f3, f4);
    }

    EyeAndKoboldColor a(ItemStack itemStack) {
        return EyeAndKoboldColor.getColorByWoolId(itemStack.func_77960_j());
    }
}
