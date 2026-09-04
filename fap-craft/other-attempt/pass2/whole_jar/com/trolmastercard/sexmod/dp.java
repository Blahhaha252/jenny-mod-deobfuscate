/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.d_;
import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.p;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class dp
extends d_ {
    float r;

    public dp(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d10) {
        super(renderManager, animatedGeoModel, d10);
    }

    @Override
    protected ItemStack a(@Nullable ItemStack itemStack) {
        switch (this.j.y()) {
            case FISHING_IDLE: 
            case FISHING_START: {
                ItemStack itemStack2 = ((eb)this.j).ao;
                ItemStack itemStack3 = (ItemStack)this.j.func_184212_Q().func_187225_a(eb.az);
                if (itemStack3.equals(ItemStack.field_190927_a)) {
                    return itemStack2;
                }
                Map map = EnchantmentHelper.func_82781_a((ItemStack)itemStack3);
                EnchantmentHelper.func_82782_a((Map)map, (ItemStack)itemStack2);
                this.j.func_184611_a(EnumHand.MAIN_HAND, itemStack2);
                return itemStack2;
            }
        }
        return itemStack;
    }

    boolean a() {
        return (Boolean)this.j.func_184212_Q().func_187225_a(em.G);
    }

    @Override
    protected void a(BufferBuilder bufferBuilder, String string, GeoBone geoBone) {
        if (Minecraft.func_71410_x().func_147113_T()) {
            return;
        }
        switch (string) {
            case "head": {
                this.r = geoBone.getRotationX();
                break;
            }
            case "backHair": {
                if (this.a()) break;
                double d10 = this.r / gc.c(45.0f);
                float f10 = (float)b6.b(0.0, 0.75, d10);
                geoBone.setPositionZ(f10);
                geoBone.setPositionY(f10);
                geoBone.setRotationX(-this.r);
                break;
            }
            case "sideHairR": 
            case "sideHairL": {
                if (this.a()) break;
                double d11 = this.r / gc.c(45.0f);
                float f11 = (float)b6.b(0.0, (double)1.3f, d11);
                geoBone.setPositionZ(-f11);
                geoBone.setPositionY(f11);
            }
            case "frontHairL": 
            case "frontHairR": {
                if (this.a()) break;
                geoBone.setRotationX(-this.r);
                break;
            }
            case "offhand": {
                eb eb2 = (eb)this.j;
                ItemStack itemStack = (ItemStack)this.j.func_184212_Q().func_187225_a(eb.ag);
                if (itemStack.equals(ItemStack.field_190927_a) || eb2.Z != 1.0f) break;
                GlStateManager.func_179094_E();
                Tessellator.func_178181_a().func_78381_a();
                com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, geoBone);
                GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179152_a((float)eb2.aa, (float)eb2.aa, (float)eb2.aa);
                Minecraft.func_71410_x().func_175597_ag().func_178099_a((EntityLivingBase)this.j, itemStack, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
                d_.n.func_181668_a(7, DefaultVertexFormats.field_181712_l);
                this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
                GlStateManager.func_179121_F();
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

