/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.RenderGameOverlayEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.d3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class ds
extends Gui {
    static ResourceLocation e = new ResourceLocation("sexmod", "textures/gui/buttons.png");
    static ResourceLocation b = new ResourceLocation("sexmod", "textures/gui/hornymeter.png");
    public static boolean d = false;
    public static double c;
    static double a;
    static float f;
    static float g;
    static boolean i;
    static boolean h;

    public static void d() {
        if (d) {
            return;
        }
        ds.b();
        d = true;
        h = true;
    }

    public static void a(boolean bl2) {
        if (d) {
            return;
        }
        ds.b();
        d = true;
        h = bl2;
    }

    public static void c() {
        ds.b();
        d = false;
        h = true;
    }

    public static boolean a() {
        return d;
    }

    @SubscribeEvent
    public void a(RenderGameOverlayEvent renderGameOverlayEvent) {
        if (d && renderGameOverlayEvent.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            int n2;
            Minecraft minecraft = Minecraft.func_71410_x();
            f = f < 1.0f ? (f += minecraft.func_193989_ak() / 25.0f) : 1.0f;
            GL11.glPushMatrix();
            minecraft.field_71446_o.func_110577_a(e);
            GL11.glScalef((float)0.35f, (float)0.35f, (float)0.35f);
            if (c >= 1.0) {
                if (d3.a) {
                    i = true;
                }
                n2 = i ? 54 : 0;
                this.func_73729_b(240, 160, 0, 108 + n2, 256, 52);
            }
            if (h && !i) {
                n2 = d3.d ? 54 : 0;
                this.func_73729_b((int)b6.a(-200.0f, 98.0f, f), 405, 0, n2, 158, 54);
            }
            GL11.glScalef((float)2.857143f, (float)2.857143f, (float)2.857143f);
            minecraft.field_71446_o.func_110577_a(b);
            GL11.glScalef((float)0.75f, (float)0.75f, (float)0.75f);
            this.func_73729_b(10, (int)b6.a(-200.0f, 10.0f, f), 0, 0, 146, 175);
            a = b6.b(a, c, (double)minecraft.func_193989_ak());
            n2 = (int)b6.b(0.0, 160.0, a);
            int n3 = (int)b6.b(167.0, 8.0, a);
            double d10 = b6.b(178.0, 18.0, a);
            if (!i) {
                this.func_73729_b(67, (int)b6.b(-45.0, d10, (double)f), 159, n3, 32, n2);
                this.func_73729_b(120, (int)b6.b(-58.0, b6.b(178.0, 149.0, 1.0 - a), (double)f), 212, (int)b6.b(169.0, 141.0, 1.0 - a), 28, (int)b6.b(1.0, 29.0, 1.0 - a));
                this.func_73729_b(18, (int)b6.b(-58.0, b6.b(178.0, 149.0, 1.0 - a), (double)f), 212, (int)b6.b(169.0, 141.0, 1.0 - a), 28, (int)b6.b(1.0, 29.0, 1.0 - a));
            } else {
                this.func_73729_b(67, (int)b6.a(18.0f, -300.0f, g += minecraft.func_193989_ak() / 15.0f), 159, 8, 32, 160);
            }
            GL11.glPopMatrix();
        }
    }

    public static void a(double d10) {
        c = (c += d10) > 1.0 ? 1.0 : c;
    }

    public static void b() {
        c = 0.0;
        i = false;
    }

    static {
        a = c = 0.0;
        f = 0.0f;
        g = 0.0f;
        i = false;
        h = true;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

