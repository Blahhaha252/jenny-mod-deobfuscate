/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelElytra
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  software.bernie.geckolib3.core.util.Color
 *  software.bernie.geckolib3.renderers.geo.GeoLayerRenderer
 *  software.bernie.geckolib3.renderers.geo.IGeoRenderer
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.ei;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelElytra;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class bu
extends GeoLayerRenderer {
    private static final ResourceLocation b = new ResourceLocation("textures/entity/elytra.png");
    private final ModelElytra a = new ModelElytra();

    public bu(IGeoRenderer iGeoRenderer) {
        super(iGeoRenderer);
    }

    public void render(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        UUID uUID;
        if (!(entityLivingBase instanceof e2)) {
            return;
        }
        e2 e22 = (e2)entityLivingBase;
        ItemStack itemStack = (ItemStack)e22.func_184212_Q().func_187225_a(e2.T);
        EntityPlayer entityPlayer = null;
        if (e22 instanceof ei && (uUID = ((ei)e22).m()) != null) {
            entityPlayer = entityLivingBase.field_70170_p.func_152378_a(uUID);
        }
        if (itemStack.func_77973_b() != Items.field_185160_cR) {
            return;
        }
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        Minecraft.func_71410_x().func_175598_ae().field_78724_e.func_110577_a(b);
        GlStateManager.func_179094_E();
        GlStateManager.func_179109_b((float)0.0f, (float)0.0f, (float)0.125f);
        float f7 = this.a();
        this.a.func_78087_a(f, f2, f4, f5, f6, f7, (Entity)(entityPlayer == null ? entityLivingBase : entityPlayer));
        this.a.func_78088_a((Entity)(entityPlayer == null ? entityLivingBase : entityPlayer), f, f2, f4, f5, f6, f7);
        GlStateManager.func_179084_k();
        GlStateManager.func_179121_F();
    }

    public float a() {
        GlStateManager.func_179091_B();
        GlStateManager.func_179152_a((float)-1.0f, (float)-1.0f, (float)1.0f);
        GlStateManager.func_179109_b((float)0.0f, (float)-1.501f, (float)0.0f);
        return 0.0625f;
    }

    public void func_177141_a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public boolean func_177142_b() {
        return false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
