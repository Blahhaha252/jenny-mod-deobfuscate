/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.ItemRenderer
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.item.ItemMap
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumHandSide
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraft.world.storage.MapData
 *  net.minecraftforge.client.event.RenderSpecificHandEvent
 *  net.minecraftforge.fml.common.ObfuscationReflectionHelper
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ad;
import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.ei;
import java.io.PrintWriter;
import java.io.StringWriter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class cn {
    Minecraft f;
    float g = 2.0f;
    boolean c = false;
    private static final ResourceLocation e = new ResourceLocation("textures/map/map_background.png");
    at d;
    ResourceLocation h;
    Vec3i b;
    float a = 0.0f;

    @SubscribeEvent
    public void a(RenderSpecificHandEvent renderSpecificHandEvent) {
        block26: {
            float f;
            block23: {
                block27: {
                    ItemStack itemStack;
                    ItemRenderer itemRenderer;
                    float f2;
                    float f3;
                    block25: {
                        ei.C();
                        ei ei2 = ei.d(Minecraft.func_71410_x().field_71439_g.getPersistentID());
                        try {
                            if (ei2 == null) {
                                return;
                            }
                        }
                        catch (Exception exception) {
                            throw cn.a(exception);
                        }
                        int n = ei2.ah();
                        try {
                            this.d = ei2.a(n);
                            this.h = new ResourceLocation("sexmod", ei2.c(n));
                            this.b = ei2.b(n);
                            if (this.d == null) {
                                System.out.println("HAND IS NULL uwu did you forget to assign this girl a hand owo?");
                                return;
                            }
                        }
                        catch (Exception exception) {
                            throw cn.a(exception);
                        }
                        this.f = Minecraft.func_71410_x();
                        f3 = 0.0f;
                        f2 = 0.0f;
                        try {
                            itemRenderer = this.f.func_175597_ag();
                            if (ad.a()) {
                                f3 = ((Float)ObfuscationReflectionHelper.getPrivateValue(ItemRenderer.class, (Object)itemRenderer, (String)"prevEquippedProgressMainHand")).floatValue();
                                f2 = ((Float)ObfuscationReflectionHelper.getPrivateValue(ItemRenderer.class, (Object)itemRenderer, (String)"equippedProgressMainHand")).floatValue();
                            } else {
                                f3 = ((Float)ObfuscationReflectionHelper.getPrivateValue(ItemRenderer.class, (Object)itemRenderer, (String)"field_187470_g")).floatValue();
                                f2 = ((Float)ObfuscationReflectionHelper.getPrivateValue(ItemRenderer.class, (Object)itemRenderer, (String)"field_187469_f")).floatValue();
                            }
                            this.g = 2.0f - (f3 + (f2 - f3) * renderSpecificHandEvent.getPartialTicks());
                        }
                        catch (Exception exception) {
                            System.out.println("couldnt do the reflection thingy");
                            StringWriter stringWriter = new StringWriter();
                            exception.printStackTrace(new PrintWriter(stringWriter));
                            Minecraft.func_71410_x().field_71439_g.func_71165_d(stringWriter.toString());
                        }
                        itemRenderer = this.f.field_71439_g;
                        f = itemRenderer.func_70678_g(renderSpecificHandEvent.getPartialTicks());
                        itemStack = this.f.field_71439_g.func_184614_ca();
                        try {
                            block24: {
                                try {
                                    try {
                                        GlStateManager.func_179124_c((float)((float)this.b.func_177958_n() / 255.0f), (float)((float)this.b.func_177956_o() / 255.0f), (float)((float)this.b.func_177952_p() / 255.0f));
                                        if (renderSpecificHandEvent.getHand() != EnumHand.MAIN_HAND) break block23;
                                        if (itemStack.func_190926_b()) break block24;
                                    }
                                    catch (Exception exception) {
                                        throw cn.a(exception);
                                    }
                                    if (!(itemStack.func_77973_b() instanceof ItemMap)) break block25;
                                }
                                catch (Exception exception) {
                                    throw cn.a(exception);
                                }
                            }
                            renderSpecificHandEvent.setCanceled(true);
                            this.a(itemStack, renderSpecificHandEvent.getPartialTicks(), (AbstractClientPlayer)itemRenderer, this.g, f);
                            this.c = true;
                            break block26;
                        }
                        catch (Exception exception) {
                            throw cn.a(exception);
                        }
                    }
                    try {
                        try {
                            if (!(f2 < f3)) break block27;
                            if (!this.c) break block26;
                        }
                        catch (Exception exception) {
                            throw cn.a(exception);
                        }
                        renderSpecificHandEvent.setCanceled(true);
                        this.a(itemStack, renderSpecificHandEvent.getPartialTicks(), (AbstractClientPlayer)itemRenderer, this.g, f);
                        break block26;
                    }
                    catch (Exception exception) {
                        throw cn.a(exception);
                    }
                }
                this.c = false;
                break block26;
            }
            try {
                if (this.f.field_71439_g.func_184592_cb().func_77973_b() instanceof ItemMap) {
                    renderSpecificHandEvent.setCanceled(true);
                    this.a(EnumHandSide.LEFT, this.g - 1.0f, f, this.f.field_71439_g.func_184592_cb());
                }
            }
            catch (Exception exception) {
                throw cn.a(exception);
            }
        }
        GlStateManager.func_179117_G();
    }

    void a(ItemStack itemStack, float f, AbstractClientPlayer abstractClientPlayer, float f2, float f3) {
        block6: {
            block4: {
                block5: {
                    try {
                        try {
                            if (!(itemStack.func_77973_b() instanceof ItemMap)) break block4;
                            if (!abstractClientPlayer.func_184592_cb().func_190926_b()) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cn.a(runtimeException);
                        }
                        this.a(itemStack, abstractClientPlayer, f3, f);
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cn.a(runtimeException);
                    }
                }
                this.a(EnumHandSide.RIGHT, f2 - 1.0f, f3, itemStack);
                break block6;
            }
            this.a(f3, f);
        }
    }

    void a(EnumHandSide enumHandSide, float f, float f2, ItemStack itemStack) {
        float f3;
        block6: {
            block8: {
                block7: {
                    float f4;
                    try {
                        f4 = enumHandSide == EnumHandSide.RIGHT ? 1.0f : -1.0f;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cn.a(runtimeException);
                    }
                    f3 = f4;
                    try {
                        try {
                            GlStateManager.func_179109_b((float)(f3 * 0.125f), (float)-0.125f, (float)0.0f);
                            if (this.f.field_71439_g.func_82150_aj()) break block6;
                            GlStateManager.func_179094_E();
                            GlStateManager.func_179114_b((float)(f3 * 10.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                            this.a(f, f2, enumHandSide);
                            GlStateManager.func_179109_b((float)-0.5f, (float)-1.1f, (float)0.0f);
                            if (enumHandSide != EnumHandSide.RIGHT) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cn.a(runtimeException);
                        }
                        GlStateManager.func_179109_b((float)0.48f, (float)0.15f, (float)0.0f);
                        break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cn.a(runtimeException);
                    }
                }
                GlStateManager.func_179109_b((float)0.44f, (float)1.3f, (float)1.0f);
            }
            Minecraft.func_71410_x().func_110434_K().func_110577_a(this.h);
            this.d.a().func_78785_a(0.175f);
            GlStateManager.func_179121_F();
        }
        GlStateManager.func_179094_E();
        GlStateManager.func_179109_b((float)(f3 * 0.51f), (float)(-0.08f + f * -1.2f), (float)-0.75f);
        float f5 = MathHelper.func_76129_c((float)f2);
        float f6 = MathHelper.func_76126_a((float)(f5 * (float)Math.PI));
        float f7 = -0.5f * f6;
        float f8 = 0.4f * MathHelper.func_76126_a((float)(f5 * ((float)Math.PI * 2)));
        float f9 = -0.3f * MathHelper.func_76126_a((float)(f2 * (float)Math.PI));
        GlStateManager.func_179109_b((float)(f3 * f7), (float)(f8 - 0.3f * f6), (float)f9);
        GlStateManager.func_179114_b((float)(f6 * -45.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)(f3 * f6 * -30.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        this.a(itemStack);
        GlStateManager.func_179121_F();
    }

    void a(ItemStack itemStack, AbstractClientPlayer abstractClientPlayer, float f, float f2) {
        float f3 = abstractClientPlayer.field_70127_C + (abstractClientPlayer.field_70125_A - abstractClientPlayer.field_70127_C) * f2;
        float f4 = MathHelper.func_76129_c((float)f);
        float f5 = -0.2f * MathHelper.func_76126_a((float)(f * (float)Math.PI));
        float f6 = -0.4f * MathHelper.func_76126_a((float)(f4 * (float)Math.PI));
        GlStateManager.func_179109_b((float)0.0f, (float)(-f5 / 2.0f), (float)f6);
        float f7 = this.a(f3);
        GlStateManager.func_179109_b((float)0.0f, (float)(0.04f + (this.g - 1.0f) * -1.2f + f7 * -0.5f), (float)-0.72f);
        GlStateManager.func_179114_b((float)(f7 * -85.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.func_179129_p();
        GlStateManager.func_179094_E();
        GlStateManager.func_179114_b((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        this.a(EnumHandSide.RIGHT);
        this.a(EnumHandSide.LEFT);
        GlStateManager.func_179121_F();
        GlStateManager.func_179089_o();
        float f8 = MathHelper.func_76126_a((float)(f4 * (float)Math.PI));
        GlStateManager.func_179114_b((float)(f8 * 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.func_179152_a((float)2.0f, (float)2.0f, (float)2.0f);
        this.a(itemStack);
        GlStateManager.func_179145_e();
    }

    void a(ItemStack itemStack) {
        GlStateManager.func_179117_G();
        GlStateManager.func_179114_b((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GlStateManager.func_179152_a((float)0.38f, (float)0.38f, (float)0.38f);
        GlStateManager.func_179140_f();
        this.f.func_110434_K().func_110577_a(e);
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        GlStateManager.func_179109_b((float)-0.5f, (float)-0.5f, (float)0.0f);
        GlStateManager.func_179152_a((float)0.0078125f, (float)0.0078125f, (float)0.0078125f);
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
        bufferBuilder.func_181662_b(-7.0, 135.0, 0.0).func_187315_a(0.0, 1.0).func_181675_d();
        bufferBuilder.func_181662_b(135.0, 135.0, 0.0).func_187315_a(1.0, 1.0).func_181675_d();
        bufferBuilder.func_181662_b(135.0, -7.0, 0.0).func_187315_a(1.0, 0.0).func_181675_d();
        bufferBuilder.func_181662_b(-7.0, -7.0, 0.0).func_187315_a(0.0, 0.0).func_181675_d();
        tessellator.func_78381_a();
        MapData mapData = ((ItemMap)itemStack.func_77973_b()).func_77873_a(itemStack, (World)this.f.field_71441_e);
        try {
            if (mapData != null) {
                this.f.field_71460_t.func_147701_i().func_148250_a(mapData, false);
            }
        }
        catch (RuntimeException runtimeException) {
            throw cn.a(runtimeException);
        }
        GlStateManager.func_179124_c((float)((float)this.b.func_177958_n() / 255.0f), (float)((float)this.b.func_177956_o() / 255.0f), (float)((float)this.b.func_177952_p() / 255.0f));
    }

    private void a(EnumHandSide enumHandSide) {
        block5: {
            block4: {
                float f;
                try {
                    GlStateManager.func_179094_E();
                    f = enumHandSide == EnumHandSide.RIGHT ? 1.0f : -1.0f;
                }
                catch (RuntimeException runtimeException) {
                    throw cn.a(runtimeException);
                }
                float f2 = f;
                try {
                    GlStateManager.func_179114_b((float)92.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GlStateManager.func_179114_b((float)45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GlStateManager.func_179114_b((float)(f2 * -41.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                    GlStateManager.func_179109_b((float)(f2 * 0.3f), (float)-1.1f, (float)0.45f);
                    if (enumHandSide != EnumHandSide.RIGHT) break block4;
                    GlStateManager.func_179109_b((float)0.63f, (float)0.36f, (float)0.0f);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw cn.a(runtimeException);
                }
            }
            GlStateManager.func_179109_b((float)1.6f, (float)0.35f, (float)0.0f);
        }
        Minecraft.func_71410_x().func_110434_K().func_110577_a(this.h);
        this.d.a().func_78785_a(0.175f);
        GlStateManager.func_179121_F();
    }

    private float a(float f) {
        float f2 = 1.0f - f / 45.0f + 0.1f;
        f2 = MathHelper.func_76131_a((float)f2, (float)0.0f, (float)1.0f);
        f2 = -MathHelper.func_76134_b((float)(f2 * (float)Math.PI)) * 0.5f + 0.5f;
        return f2;
    }

    void a(float f, float f2) {
        GlStateManager.func_179129_p();
        GlStateManager.func_179094_E();
        this.a(this.g, f, EnumHandSide.RIGHT);
        Minecraft.func_71410_x().func_110434_K().func_110577_a(this.h);
        this.d.a().func_78785_a(0.175f);
        GlStateManager.func_179084_k();
        GlStateManager.func_179089_o();
        GlStateManager.func_179121_F();
    }

    private void a(float f, float f2, EnumHandSide enumHandSide) {
        float f3;
        boolean bl;
        try {
            bl = enumHandSide != EnumHandSide.LEFT;
        }
        catch (RuntimeException runtimeException) {
            throw cn.a(runtimeException);
        }
        boolean bl2 = bl;
        try {
            f3 = bl2 ? 1.0f : -1.0f;
        }
        catch (RuntimeException runtimeException) {
            throw cn.a(runtimeException);
        }
        float f4 = f3;
        float f5 = MathHelper.func_76129_c((float)f2);
        float f6 = -0.3f * MathHelper.func_76126_a((float)(f5 * (float)Math.PI));
        float f7 = 0.4f * MathHelper.func_76126_a((float)(f5 * ((float)Math.PI * 2)));
        float f8 = -0.4f * MathHelper.func_76126_a((float)(f2 * (float)Math.PI));
        GlStateManager.func_179109_b((float)(f4 * (f6 + 0.64000005f)), (float)(f7 + -0.6f + f * -0.6f), (float)(f8 + -0.71999997f));
        GlStateManager.func_179114_b((float)(f4 * 45.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        float f9 = MathHelper.func_76126_a((float)(f2 * f2 * (float)Math.PI));
        float f10 = MathHelper.func_76126_a((float)(f5 * (float)Math.PI));
        GlStateManager.func_179114_b((float)(f4 * f10 * 70.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)(f4 * f9 * -20.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        GlStateManager.func_179109_b((float)(f4 * -1.0f), (float)3.6f, (float)3.5f);
        GlStateManager.func_179114_b((float)(f4 * 120.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        GlStateManager.func_179114_b((float)200.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)(f4 * -135.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179109_b((float)(f4 * 5.6f), (float)0.0f, (float)0.0f);
        GlStateManager.func_179109_b((float)0.5f, (float)1.1f, (float)0.0f);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}
