/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.RenderGameOverlayEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.cd;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gr;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class gb
extends Gui {
    static final ResourceLocation l = new ResourceLocation("sexmod", "textures/gui/escape_minigame_ui.png");
    static final int f = 52;
    static final float a = 20.0f;
    static final int p = 35;
    static final float n = 0.08f;
    static final float h = 0.006f;
    static final int m = 2;
    static final float i = 0.33f;
    static boolean g = false;
    static gr q = null;
    static float k = 0.0f;
    static float j = 0.0f;
    static boolean b = true;
    static float d = 0.0f;
    static boolean c = false;
    static Minecraft e = Minecraft.func_71410_x();
    static boolean o = false;

    public static void e() {
        block6: {
            if (!g) {
                return;
            }
            if (gb.e.field_71441_e == null) {
                g = false;
                o = false;
                j = 0.0f;
                k = 0.0f;
                d = 0.0f;
                c = false;
            }
            if (c) {
                b = false;
                if ((d += 1.0f) >= 20.0f) {
                    g = false;
                }
                return;
            }
            if ((j += 1.0f) % (float)Math.max(1, 2) == 0.0f) {
                b = !b;
            }
            k = Math.max(0.0f, k - 0.006f);
            if (j < 20.0f) {
                return;
            }
            if (j % 35.0f != 0.0f && q != null) break block6;
            gb.b();
        }
    }

    static void b() {
        gr gr2 = q;
        Random random = new Random();
        while (gr2 == (q = gr.values()[random.nextInt(gr.values().length)])) {
        }
    }

    static void c() {
        if (!g) {
            return;
        }
        if (o) {
            return;
        }
        o = true;
        ge.b.sendToServer((IMessage)new cd());
        gb.d();
    }

    public static void a() {
        g = true;
        o = false;
        j = 0.0f;
        k = 0.0f;
        d = 0.0f;
        c = false;
    }

    public static void d() {
        c = true;
        d = 0.0f;
    }

    @SubscribeEvent
    public void a(RenderGameOverlayEvent renderGameOverlayEvent) {
        if (!g) {
            return;
        }
        if (renderGameOverlayEvent.getType() != RenderGameOverlayEvent.ElementType.TEXT) {
            return;
        }
        int n2 = renderGameOverlayEvent.getResolution().func_78326_a();
        int n3 = renderGameOverlayEvent.getResolution().func_78328_b();
        float f = renderGameOverlayEvent.getPartialTicks();
        e.func_110434_K().func_110577_a(l);
        double d = c ? 1.0 - b6.d((gb.d + f) / 20.0f) : Math.min(1.0, b6.c((j + f) / 20.0f));
        int n4 = n3 + 385;
        GlStateManager.func_179094_E();
        GlStateManager.func_179152_a((float)0.33f, (float)0.33f, (float)0.33f);
        GlStateManager.func_179109_b((float)485.0f, (float)0.0f, (float)0.0f);
        int n5 = 4 * n3;
        this.func_73729_b(n2 / 2 - 87, (int)b6.b((double)n5, (double)n4, d), 0, 104, 174, 48);
        this.func_73729_b((int)((float)n2 / 2.0f - 78.0f), (int)b6.b((double)n5, (double)(n4 - 52), d), 52, b && q == gr.A ? 52 : 0, 52, 52);
        this.func_73729_b((int)((float)n2 / 2.0f - 26.0f), (int)b6.b((double)n5, (double)(n4 - 52), d), 104, b && q == gr.S ? 52 : 0, 52, 52);
        this.func_73729_b((int)((float)n2 / 2.0f + 26.0f), (int)b6.b((double)n5, (double)(n4 - 52), d), 156, b && q == gr.D ? 52 : 0, 52, 52);
        this.func_73729_b((int)((float)n2 / 2.0f - 26.0f), (int)b6.b((double)n5, (double)(n4 - 104), d), 0, b && q == gr.W ? 52 : 0, 52, 52);
        this.func_73729_b(n2 / 2 - 87 + 8, (int)b6.b((double)(n5 - 8), (double)(n4 + 8), d), 8, 152, (int)(158.0f * k), 32);
        GlStateManager.func_179121_F();
    }

    @SubscribeEvent
    public void a(TickEvent.ClientTickEvent clientTickEvent) {
        if (clientTickEvent.phase == TickEvent.Phase.END) {
            return;
        }
        gb.e();
    }

    @SubscribeEvent
    public void a(InputEvent.KeyInputEvent keyInputEvent) {
        block4: {
            GameSettings gameSettings = Minecraft.func_71410_x().field_71474_y;
            if (GameSettings.func_100015_a((KeyBinding)gameSettings.field_74370_x)) {
                k = q == gr.A ? (k += 0.08f) : (k -= 0.04f);
                return;
            }
            if (GameSettings.func_100015_a((KeyBinding)gameSettings.field_74366_z)) {
                k = q == gr.D ? (k += 0.08f) : (k -= 0.04f);
                return;
            }
            if (GameSettings.func_100015_a((KeyBinding)gameSettings.field_74351_w)) {
                k = q == gr.W ? (k += 0.08f) : (k -= 0.04f);
                return;
            }
            if (GameSettings.func_100015_a((KeyBinding)gameSettings.field_74368_y)) {
                k = q == gr.S ? (k += 0.08f) : (k -= 0.04f);
                return;
            }
            if (!(k >= 1.0f)) break block4;
            gb.c();
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
