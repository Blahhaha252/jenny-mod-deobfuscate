/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiListExtended
 *  net.minecraft.client.gui.GuiListExtended$IGuiListEntry
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.input.Mouse
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.gq;
import com.trolmastercard.sexmod.gw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.input.Mouse;

public class gq
extends GuiListExtended {
    static final int c = 3809871;
    static final List<gw> f = Arrays.asList(gw.values());
    static final String a = "MMMMMMMMMM";
    protected static int i = 5;
    protected static int e = 200;
    private List<a.a> b = new ArrayList<a.a>();
    a d;
    boolean h = false;
    float g = 0.0f;

    public gq(Minecraft minecraft, a a10) {
        super(minecraft, a10.field_146294_l / 2, a10.field_146295_m, 0, a10.field_146295_m, 30);
        e = a10.field_146294_l / 2;
        this.d = a10;
    }

    public GuiListExtended.IGuiListEntry func_148180_b(int n2) {
        return this.b.get(n2);
    }

    protected int func_148127_b() {
        return this.b.size();
    }

    protected int func_148137_d() {
        return 0;
    }

    protected void drawContainerBackground(Tessellator tessellator) {
    }

    public void func_178039_p() {
        if (!this.func_148141_e(this.field_148162_h)) {
            return;
        }
        int n2 = Mouse.getEventDWheel();
        if (n2 == 0) {
            return;
        }
        n2 = n2 > 0 ? -1 : 1;
        this.field_148169_q += (float)(n2 * this.field_148149_f / 2);
    }

    protected void func_148136_c(int n2, int n3, int n4, int n5) {
    }

    void a() {
        int n2 = this.b.size() * this.field_148149_f;
        if (n2 > this.field_148158_l) {
            this.field_148153_b = 0;
            return;
        }
        int n3 = this.field_148158_l - n2;
        this.field_148153_b = n3 / 2;
    }

    public void func_148128_a(int n2, int n3, float f10) {
        this.b.clear();
        int n4 = 0;
        for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : com.trolmastercard.sexmod.a.m) {
            gw gw2 = entry.getKey();
            Map.Entry<List<String>, Integer> entry2 = entry.getValue();
            this.b.add(new a.a(this, gw2, entry2.getKey(), entry2.getValue()));
            if (!gw.CUSTOM_BONE.equals((Object)entry.getKey())) continue;
            ++n4;
        }
        this.b.sort(Comparator.comparingInt(a10 -> f.indexOf((Object)a10.d)));
        List<String> list = br.a(this.d.c).get((Object)gw.CUSTOM_BONE);
        list.add(0, "cross");
        this.b.add(new a.a(this, n4 > 1));
        this.a();
        this.a(n2, n3, f10);
        if (!this.h) {
            return;
        }
        this.func_148145_f(999999);
        this.h = false;
    }

    void a(int n2, int n3, float f10) {
        if (!this.field_178041_q) {
            return;
        }
        this.field_148150_g = n2;
        this.field_148162_h = n3;
        this.func_148123_a();
        int n4 = this.func_148137_d();
        int n5 = n4 + 6;
        this.func_148121_k();
        GlStateManager.func_179140_f();
        GlStateManager.func_179106_n();
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        this.drawContainerBackground(tessellator);
        int n6 = this.field_148152_e + this.field_148155_a / 2 - this.func_148139_c() / 2 + 2;
        int n7 = this.field_148153_b + 4 - (int)this.field_148169_q;
        if (this.field_148165_u) {
            this.func_148129_a(n6, n7, tessellator);
        }
        this.func_192638_a(n6, n7, n2, n3, f10);
        GlStateManager.func_179097_i();
        this.func_148136_c(0, this.field_148153_b, 255, 255);
        this.func_148136_c(this.field_148154_c, this.field_148158_l, 255, 255);
        GlStateManager.func_179147_l();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ZERO, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE);
        GlStateManager.func_179118_c();
        GlStateManager.func_179103_j((int)7425);
        GlStateManager.func_179090_x();
        int n8 = this.func_148135_f();
        if (n8 > 0) {
            int n9 = (this.field_148154_c - this.field_148153_b) * (this.field_148154_c - this.field_148153_b) / this.func_148138_e();
            int n10 = (int)this.field_148169_q * (this.field_148154_c - this.field_148153_b - (n9 = MathHelper.func_76125_a((int)n9, (int)32, (int)(this.field_148154_c - this.field_148153_b - 8)))) / n8 + this.field_148153_b;
            if (n10 < this.field_148153_b) {
                n10 = this.field_148153_b;
            }
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            bufferBuilder.func_181662_b((double)n4, (double)this.field_148154_c, 0.0).func_187315_a(0.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n5, (double)this.field_148154_c, 0.0).func_187315_a(1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n5, (double)this.field_148153_b, 0.0).func_187315_a(1.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n4, (double)this.field_148153_b, 0.0).func_187315_a(0.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            tessellator.func_78381_a();
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            bufferBuilder.func_181662_b((double)n4, (double)(n10 + n9), 0.0).func_187315_a(0.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n5, (double)(n10 + n9), 0.0).func_187315_a(1.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n5, (double)n10, 0.0).func_187315_a(1.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n4, (double)n10, 0.0).func_187315_a(0.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            tessellator.func_78381_a();
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            bufferBuilder.func_181662_b((double)n4, (double)(n10 + n9 - 1), 0.0).func_187315_a(0.0, 1.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)(n5 - 1), (double)(n10 + n9 - 1), 0.0).func_187315_a(1.0, 1.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)(n5 - 1), (double)n10, 0.0).func_187315_a(1.0, 0.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n4, (double)n10, 0.0).func_187315_a(0.0, 0.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            tessellator.func_78381_a();
        }
        this.func_148142_b(n2, n3);
        GlStateManager.func_179098_w();
        GlStateManager.func_179103_j((int)7424);
        GlStateManager.func_179141_d();
        GlStateManager.func_179084_k();
    }

    public boolean func_148179_a(int n2, int n3, int n4) {
        this.a(n2, n3, n4);
        return super.func_148179_a(n2, n3, n4);
    }

    void a(int n2, int n3, int n4) {
        block2: {
            if (n2 > this.field_148155_a) {
                return;
            }
            int n5 = this.func_148148_g();
            float f10 = n5 + n3 - 5 - this.field_148153_b;
            int n6 = Math.round((float)Math.floor(f10 / (float)this.field_148149_f));
            int n7 = (int)Math.round(((double)(f10 / (float)this.field_148149_f) - Math.floor(f10 / (float)this.field_148149_f)) * (double)this.field_148149_f);
            if (n6 < 0) {
                return;
            }
            if (n6 >= this.b.size()) break block2;
            this.b.get(n6).a(n2, n7, n4, n6);
        }
    }

    static /* synthetic */ Minecraft access$000(gq gq2) {
        return gq2.field_148161_k;
    }

    static /* synthetic */ Minecraft access$100(gq gq2) {
        return gq2.field_148161_k;
    }

    static /* synthetic */ Minecraft access$200(gq gq2) {
        return gq2.field_148161_k;
    }

    static /* synthetic */ Minecraft access$300(gq gq2) {
        return gq2.field_148161_k;
    }

    static /* synthetic */ Minecraft access$400(gq gq2) {
        return gq2.field_148161_k;
    }

    static /* synthetic */ Minecraft access$500(gq gq2) {
        return gq2.field_148161_k;
    }

    static /* synthetic */ Minecraft access$600(gq gq2) {
        return gq2.field_148161_k;
    }

    static /* synthetic */ Minecraft access$700(gq gq2) {
        return gq2.field_148161_k;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

