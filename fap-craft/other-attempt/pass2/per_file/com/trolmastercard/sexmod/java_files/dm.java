/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.inventory.GuiContainerCreative
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.ItemRenderer
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemShield
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  org.lwjgl.opengl.GL11
 *  software.bernie.geckolib3.core.util.Color
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoCube
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.renderers.geo.IGeoRenderer
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.bu;
import com.trolmastercard.sexmod.d_;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.p;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class dm
extends d_ {
    public static boolean v = false;
    ItemStack s = ItemStack.field_190927_a;
    ItemStack x = ItemStack.field_190927_a;
    boolean r = false;
    boolean u = false;
    protected ei w;
    protected float y;
    float t = 0.0f;

    public dm(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel, 0.0);
    }

    public void func_76979_b(Entity entity, double d, double d2, double d3, float f, float f2) {
    }

    boolean a(em em2) {
        if (em2.h()) {
            return true;
        }
        boolean bl = v;
        v = false;
        return bl;
    }

    public void a(em em2, double d, double d2, double d3, float f, float f2) {
        if (!this.a(em2)) {
            return;
        }
        ei ei2 = (ei)em2;
        if (ei2.m() == null) {
            return;
        }
        EntityPlayer entityPlayer = Minecraft.func_71410_x().field_71439_g.field_70170_p.func_152378_a(ei2.m());
        if (entityPlayer == null) {
            return;
        }
        this.s = entityPlayer.func_184614_ca();
        this.x = entityPlayer.func_184592_cb();
        this.u = ei2.ah;
        this.r = ei2.ad;
        this.w = (ei)em2;
        this.y = f2;
        ei2.f(entityPlayer);
        if (this.a(entityPlayer, em2)) {
            this.func_147906_a((Entity)em2, entityPlayer.func_70005_c_(), d, d2 + (double)ei2.i(), d3, 300);
        }
        super.a(em2, d, d2, d3, f, f2);
    }

    @Override
    public Entity c(em em2) {
        if (!(em2 instanceof ei)) {
            return em2;
        }
        ei ei2 = (ei)em2;
        EntityPlayer entityPlayer = ei2.k();
        if (entityPlayer == null) {
            return em2;
        }
        return entityPlayer;
    }

    boolean a(EntityPlayer entityPlayer, em em2) {
        if (entityPlayer.getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID())) {
            return false;
        }
        fp fp2 = em2.y();
        if (fp2 == null) {
            return true;
        }
        return !fp2.hideNameTag;
    }

    protected void a(String string, GeoBone geoBone) {
    }

    protected void a(String string, GeoBone geoBone, ei ei2, BufferBuilder bufferBuilder) {
    }

    @Override
    public void renderRecursively(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f3, float f4) {
        ItemStack itemStack;
        String string = geoBone.getName();
        if (this.r) {
            if (string.equals("upperBody")) {
                geoBone.setRotationX(geoBone.getRotationX() - 0.5f);
            }
            if (string.equals("head")) {
                geoBone.setRotationX(geoBone.getRotationX() + 0.5f);
            }
        }
        if (string.equals("head")) {
            this.a(bufferBuilder, geoBone, Color.ofRGB((float)f, (float)f2, (float)f3));
        }
        this.a(string, geoBone);
        this.a(string, geoBone, this.w, bufferBuilder);
        if (this.u && (this.s.func_77973_b() instanceof ItemBow || this.x.func_77973_b() instanceof ItemBow)) {
            if (string.equals("armR")) {
                geoBone.setRotationX(geoBone.getRotationX() - this.j.field_70125_A / 50.0f);
            }
            if (string.equals("armL")) {
                geoBone.setRotationY(geoBone.getRotationY() - this.j.field_70125_A / 50.0f);
            }
            if (this.x.func_77973_b() instanceof ItemBow) {
                itemStack = this.x;
                this.x = this.s;
                this.s = itemStack;
            }
        }
        if (this.u && this.s.func_77973_b() instanceof ItemShield) {
            if (string.equals("armR")) {
                geoBone.setRotationZ(0.0f);
                geoBone.setRotationX(0.5f);
            } else if (this.x.func_77973_b() instanceof ItemShield && string.equals("armL")) {
                geoBone.setRotationZ(0.0f);
                geoBone.setRotationX(0.5f);
            }
        }
        if (string.equals("weapon") && !this.s.func_190926_b()) {
            this.a(bufferBuilder, geoBone, false);
        }
        if (string.equals("offhand") && !this.x.func_190926_b()) {
            this.a(bufferBuilder, geoBone, true);
        }
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        if ("Head2".equals(string) && !this.c()) {
            MATRIX_STACK.pop();
            return;
        }
        if (("neck".equals(string) || "head".equals(string)) && !this.a()) {
            MATRIX_STACK.pop();
            return;
        }
        if (!geoBone.isHidden) {
            itemStack = this.a(string, f, f2, f3);
            f = itemStack.x;
            f2 = itemStack.y;
            f3 = itemStack.z;
            double d = itemStack.w;
            if (!this.p.contains(string)) {
                for (GeoCube geoCube : geoBone.childCubes) {
                    MATRIX_STACK.push();
                    GlStateManager.func_179094_E();
                    this.q = geoBone;
                    this.a(bufferBuilder, geoCube, f, f2, f3, f4, d);
                    GlStateManager.func_179121_F();
                    MATRIX_STACK.pop();
                }
            }
            for (GeoCube geoCube : geoBone.childBones) {
                if (d == 0.0) {
                    this.renderRecursively(bufferBuilder, (GeoBone)geoCube, f, f2, f3, f4);
                    continue;
                }
                this.a(bufferBuilder, (GeoBone)geoCube, f, f2, f3, f4, d);
            }
        }
        try {
            MATRIX_STACK.pop();
        }
        catch (IllegalStateException illegalStateException) {
            // empty catch block
        }
    }

    boolean a() {
        if (!((ei)this.j).f()) {
            return true;
        }
        if (dm.i.field_71474_y.field_74320_O != 0) {
            return true;
        }
        return dm.i.field_71462_r instanceof GuiInventory || dm.i.field_71462_r instanceof GuiContainerCreative;
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, Color color) {
        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, geoBone);
        GL11.glEnable((int)2896);
        this.c();
        new bu((IGeoRenderer)this).render((EntityLivingBase)this.j, this.j.field_184619_aG, this.j.field_70721_aZ, this.y, 0.0f, 0.0f, 0.0f, color);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture((EntityLivingBase)this.j)));
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GL11.glDisable((int)2896);
        GlStateManager.func_179121_F();
    }

    protected void c() {
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, boolean bl) {
        ItemRenderer itemRenderer = Minecraft.func_71410_x().func_175597_ag();
        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, geoBone);
        GL11.glEnable((int)2896);
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        ItemStack itemStack = bl ? this.x : this.s;
        switch (itemStack.func_77973_b().func_77661_b(itemStack)) {
            case BOW: {
                this.a(bl);
                break;
            }
            case BLOCK: {
                this.a(bl, this.u);
            }
        }
        if (this.u && !bl && itemStack.func_77973_b() instanceof ItemBow) {
            this.t += 0.015f;
            this.j.d(Math.round(-this.t * 20.0f + (float)itemStack.func_77988_m()));
            this.j.a(itemStack);
            this.j.func_184598_c(EnumHand.MAIN_HAND);
            this.j.W();
        } else {
            this.t = 0.0f;
            this.j.d(0);
            this.j.a(ItemStack.field_190927_a);
            this.j.W();
        }
        this.a(bl, itemStack);
        GlStateManager.func_179152_a((float)0.75f, (float)0.75f, (float)0.75f);
        itemRenderer.func_178099_a((EntityLivingBase)this.j, itemStack, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture((EntityLivingBase)this.j)));
        GL11.glDisable((int)2896);
        GlStateManager.func_179121_F();
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    }

    protected void a(boolean bl, ItemStack itemStack) {
        GlStateManager.func_179114_b((float)(bl ? 200.0f : 90.0f), (float)1.0f, (float)0.0f, (float)0.0f);
    }

    protected void a(boolean bl) {
        GlStateManager.func_179114_b((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
    }

    protected void a(boolean bl, boolean bl2) {
        block1: {
            block0: {
                if (!bl) break block0;
                GlStateManager.func_179114_b((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                if (!bl2) break block1;
                GlStateManager.func_179114_b((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)35.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GlStateManager.func_179114_b((float)-20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179109_b((float)0.0f, (float)0.0f, (float)0.228f);
                break block1;
            }
            if (!bl2) break block1;
            GlStateManager.func_179114_b((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.func_179109_b((float)0.0f, (float)0.165f, (float)0.0f);
        }
    }

    private static IllegalStateException b(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}
