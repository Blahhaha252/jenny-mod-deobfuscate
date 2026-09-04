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
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemFishingRod
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHandSide
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.gi;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class fi
extends Render<gi> {
    static final double b = 0.1896224320030116;
    static final double d = -0.5;
    static final double c = 0.08742380916962415;
    private static final ResourceLocation a = new ResourceLocation("textures/particle/particles.png");

    public fi(RenderManager renderManager) {
        super(renderManager);
    }

    public void a(gi gi2, double d, double d2, double d3, float f, float f2) {
        Vec3d vec3d;
        BufferBuilder bufferBuilder;
        eb eb2 = gi2.g();
        if (eb2 == null || this.field_188301_f || eb2.Z == 1.0f) {
            return;
        }
        eb2.av = gi2;
        ItemStack itemStack = (ItemStack)eb2.func_184212_Q().func_187225_a(eb.ag);
        if (!itemStack.func_77973_b().equals(Items.field_190931_a)) {
            float f3 = Minecraft.func_175610_ah();
            if (f3 == 0.0f) {
                f3 = 0.1f;
            }
            eb2.Z += 60.0f / f3 * 0.01666f * 2.0f;
            eb2.Z = Math.min(1.0f, eb2.Z);
            bufferBuilder = Minecraft.func_71410_x().field_71439_g;
            Vec3d vec3d2 = b6.a(new Vec3d(bufferBuilder.field_70142_S, bufferBuilder.field_70137_T, bufferBuilder.field_70136_U), bufferBuilder.func_174791_d(), (double)f2);
            vec3d = new Vec3d(d, d2, d3);
            Vec3d vec3d3 = b6.a(new Vec3d(eb2.field_70142_S, eb2.field_70137_T + 0.875, eb2.field_70136_U), eb2.func_174791_d().func_72441_c(0.0, 0.875, 0.0), (double)f2);
            vec3d3 = vec3d3.func_178788_d(vec3d2);
            vec3d = b6.a(vec3d, vec3d3, (double)eb2.Z);
            d = vec3d.field_72450_a;
            d2 = vec3d.field_72448_b;
            d3 = vec3d.field_72449_c;
        } else {
            eb2.Z = 0.0f;
        }
        GlStateManager.func_179094_E();
        GlStateManager.func_179109_b((float)((float)d), (float)((float)d2), (float)((float)d3));
        GlStateManager.func_179091_B();
        GlStateManager.func_179152_a((float)0.5f, (float)0.5f, (float)0.5f);
        this.func_180548_c(gi2);
        Tessellator tessellator = Tessellator.func_178181_a();
        bufferBuilder = tessellator.func_178180_c();
        GlStateManager.func_179114_b((float)(180.0f - this.field_76990_c.field_78735_i), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)((float)(this.field_76990_c.field_78733_k.field_74320_O == 2 ? -1 : 1) * -this.field_76990_c.field_78732_j), (float)1.0f, (float)0.0f, (float)0.0f);
        if (this.field_188301_f) {
            GlStateManager.func_179142_g();
            GlStateManager.func_187431_e((int)this.func_188298_c(gi2));
        }
        if (!itemStack.func_77973_b().equals(Items.field_190931_a)) {
            GlStateManager.func_179152_a((float)2.0f, (float)2.0f, (float)2.0f);
            GlStateManager.func_179109_b((float)0.0f, (float)-0.2f, (float)0.0f);
            Minecraft.func_71410_x().func_175597_ag().func_178099_a((EntityLivingBase)eb2, itemStack, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
            GlStateManager.func_179109_b((float)0.0f, (float)0.2f, (float)0.0f);
            GlStateManager.func_179152_a((float)0.5f, (float)0.5f, (float)0.5f);
        }
        this.func_180548_c(gi2);
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181710_j);
        bufferBuilder.func_181662_b(-0.5, -0.5, 0.0).func_187315_a(0.0625, 0.1875).func_181663_c(0.0f, 1.0f, 0.0f).func_181675_d();
        bufferBuilder.func_181662_b(0.5, -0.5, 0.0).func_187315_a(0.125, 0.1875).func_181663_c(0.0f, 1.0f, 0.0f).func_181675_d();
        bufferBuilder.func_181662_b(0.5, 0.5, 0.0).func_187315_a(0.125, 0.125).func_181663_c(0.0f, 1.0f, 0.0f).func_181675_d();
        bufferBuilder.func_181662_b(-0.5, 0.5, 0.0).func_187315_a(0.0625, 0.125).func_181663_c(0.0f, 1.0f, 0.0f).func_181675_d();
        tessellator.func_78381_a();
        if (this.field_188301_f) {
            GlStateManager.func_187417_n();
            GlStateManager.func_179119_h();
        }
        GlStateManager.func_179101_C();
        GlStateManager.func_179121_F();
        int n = eb2.func_184591_cq() == EnumHandSide.RIGHT ? 1 : -1;
        vec3d = eb2.func_184614_ca();
        if (!(vec3d.func_77973_b() instanceof ItemFishingRod)) {
            n = -n;
        }
        eb2.field_70177_z = eb2.I().floatValue();
        eb2.field_70761_aq = eb2.I().floatValue();
        eb2.field_70165_t = eb2.o().field_72450_a;
        eb2.field_70163_u = eb2.o().field_72448_b;
        eb2.field_70161_v = eb2.o().field_72449_c;
        eb2.field_70169_q = eb2.o().field_72450_a;
        eb2.field_70167_r = eb2.o().field_72448_b;
        eb2.field_70166_s = eb2.o().field_72449_c;
        float f4 = (eb2.field_70760_ar + (eb2.field_70761_aq - eb2.field_70760_ar) * f2) * ((float)Math.PI / 180);
        double d4 = MathHelper.func_76126_a((float)f4);
        double d5 = MathHelper.func_76134_b((float)f4);
        double d6 = (double)n * 0.35;
        double d7 = eb2.field_70169_q + (eb2.field_70165_t - eb2.field_70169_q) * (double)f2 - d5 * d6 - d4 * 0.8;
        double d8 = eb2.field_70167_r + (double)eb2.func_70047_e() + (eb2.field_70163_u - eb2.field_70167_r) * (double)f2 - 0.45;
        double d9 = eb2.field_70166_s + (eb2.field_70161_v - eb2.field_70166_s) * (double)f2 - d4 * d6 + d5 * 0.8;
        double d10 = eb2.func_70093_af() ? -0.1875 : 0.0;
        double d11 = gi2.field_70169_q + (gi2.field_70165_t - gi2.field_70169_q) * (double)f2 - Math.sin((double)(eb2.I().floatValue() + 90.0f) * (Math.PI / 180)) * 0.1896224320030116 - Math.sin((double)eb2.I().floatValue() * (Math.PI / 180)) * 0.08742380916962415;
        double d12 = gi2.field_70167_r + (gi2.field_70163_u - gi2.field_70167_r) * (double)f2 + 0.25 + -0.5;
        double d13 = gi2.field_70166_s + (gi2.field_70161_v - gi2.field_70166_s) * (double)f2 + Math.cos((double)(eb2.I().floatValue() + 90.0f) * (Math.PI / 180)) * 0.1896224320030116 + Math.cos((double)eb2.I().floatValue() * (Math.PI / 180)) * 0.08742380916962415;
        double d14 = (float)(d7 - d11);
        double d15 = (double)((float)(d8 - d12)) + d10;
        double d16 = (float)(d9 - d13);
        GlStateManager.func_179090_x();
        GlStateManager.func_179140_f();
        if (itemStack.func_77973_b().equals(Items.field_190931_a)) {
            bufferBuilder.func_181668_a(3, DefaultVertexFormats.field_181706_f);
            for (int i = 0; i <= 16; ++i) {
                float f5 = (float)i / 16.0f;
                bufferBuilder.func_181662_b(d + d14 * (double)f5, d2 + d15 * (double)(f5 * f5 + f5) * 0.5 + 0.25, d3 + d16 * (double)f5).func_181669_b(0, 0, 0, 255).func_181675_d();
            }
            tessellator.func_78381_a();
        }
        GlStateManager.func_179145_e();
        GlStateManager.func_179098_w();
        super.func_76986_a((Entity)gi2, d, d2, d3, f, f2);
    }

    @Nullable
    protected ResourceLocation a(gi gi2) {
        return a;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
