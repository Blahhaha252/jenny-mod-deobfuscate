/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.RenderGameOverlayEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.bl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class hf
extends Gui {
    static final ResourceLocation j = new ResourceLocation("sexmod", "textures/gui/galath_flight_ui.png");
    static final bl i = new bl(0, 77, 128, 41);
    static final bl w = new bl(0, 0, 23, 36);
    static final bl k = new bl(0, 36, 23, 36);
    static final bl p = new bl(23, 2, 20, 31);
    static long y = 3000L;
    static long n = 5000L;
    static final long l = 500L;
    static final float d = 150.0f;
    static final float m = 0.075f;
    static final float b = -11.25f;
    static final float[] x = new float[]{-14.25f, -15.5f, -16.875f};
    static final float h = 500.0f;
    static final float o = -0.15f;
    static final float r = 37.5f;
    static final float[] t = new float[]{37.5f, 43.0f, 45.0f};
    static final int v = 70;
    static final int a = 70;
    static boolean q = false;
    static Minecraft c = Minecraft.func_71410_x();
    static int e = 3;
    static long s = 0L;
    static long f = 0L;
    static long u = 0L;
    static long g = 9223372036854775307L;

    public static boolean d() {
        if (e <= 0) {
            return false;
        }
        return System.currentTimeMillis() - s > y;
    }

    public static void a() {
        --e;
        s = System.currentTimeMillis();
    }

    void b() {
        if (e == 3) {
            return;
        }
        long l = System.currentTimeMillis();
        if (l - Math.max(s, f) < n) {
            return;
        }
        ++e;
        f = l;
    }

    @SubscribeEvent
    public void a(RenderGameOverlayEvent renderGameOverlayEvent) {
        this.b();
        if (!q) {
            return;
        }
        ScaledResolution scaledResolution = renderGameOverlayEvent.getResolution();
        int n = scaledResolution.func_78326_a();
        int n2 = scaledResolution.func_78328_b();
        int n3 = n / 2;
        long l = System.currentTimeMillis();
        if (l - g > 500L) {
            hf.e();
            return;
        }
        c.func_110434_K().func_110577_a(j);
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.func_179141_d();
        float f = l < u + 500L ? (float)(l - u) / 500.0f : (l < g + 500L ? 1.0f + (float)(g - l) / 500.0f : 1.0f);
        f = be.b(f, 0.0f, 1.0f);
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
        this.a(i, n3 - hf.i.c / 2, n2 - 70);
        this.a(p, (int)((float)n3 - 1.5f * (float)hf.w.c + 1.0f), n2 - 70 + 3);
        this.a(p, n3 - hf.w.c / 2 + 1, n2 - 70 + 3);
        this.a(p, n3 + hf.w.c / 2 + 1, n2 - 70 + 3);
        float f2 = (float)b6.b(Math.min(1.0f, (float)(l - s) / 150.0f));
        float f3 = f2 == 1.0f ? be.b(1.0f - (float)(l - hf.f) / 500.0f, 0.0f, 1.0f) : 0.0f;
        this.a(1, -1.5f * (float)hf.w.c, f3, f2, n3, n2, f);
        this.a(2, (float)(-hf.w.c) / 2.0f, f3, f2, n3, n2, f);
        this.a(3, (float)hf.w.c / 2.0f, f3, f2, n3, n2, f);
    }

    void a(int n, float f, float f2, float f3, int n2, int n3, float f4) {
        float f5 = e >= n ? 0.0f : (e < n - 1 ? 1.0f : f3);
        float f6 = e == n ? f2 : 0.0f;
        float f8 = 1.0f + f5 * 0.075f + f6 * -0.15f;
        GlStateManager.func_179094_E();
        GlStateManager.func_179152_a((float)f8, (float)f8, (float)f8);
        GlStateManager.func_179109_b((float)(f5 * x[n - 1] + f6 * t[n - 1]), (float)(f5 * -11.25f + f6 * 37.5f), (float)0.0f);
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)(f4 - f5 - f6));
        this.a(w, (int)((float)n2 + f), n3 - 70);
        GlStateManager.func_179117_G();
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)((float)Math.sin(Math.PI * (double)f5) * 0.5f));
        this.a(k, (int)((float)n2 + f), n3 - 70);
        GlStateManager.func_179121_F();
        GlStateManager.func_179117_G();
    }

    public static void f() {
        if (q) {
            return;
        }
        q = true;
        u = System.currentTimeMillis();
        g = 9223372036854775307L;
    }

    public static void c() {
        g = System.currentTimeMillis();
    }

    public static void e() {
        q = false;
        g = 9223372036854775307L;
        u = 0L;
    }

    void a(bl bl2, int n, int n2) {
        this.func_73729_b(n, n2, bl2.a, bl2.d, bl2.c, bl2.b);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
