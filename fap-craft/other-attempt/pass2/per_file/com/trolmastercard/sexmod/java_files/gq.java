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

    public gq(Minecraft minecraft, a a2) {
        super(minecraft, a2.field_146294_l / 2, a2.field_146295_m, 0, a2.field_146295_m, 30);
        e = a2.field_146294_l / 2;
        this.d = a2;
    }

    public GuiListExtended.IGuiListEntry func_148180_b(int n) {
        return this.b.get(n);
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
        int n = Mouse.getEventDWheel();
        if (n == 0) {
            return;
        }
        n = n > 0 ? -1 : 1;
        this.field_148169_q += (float)(n * this.field_148149_f / 2);
    }

    protected void func_148136_c(int n, int n2, int n3, int n4) {
    }

    void a() {
        int n = this.b.size() * this.field_148149_f;
        if (n > this.field_148158_l) {
            this.field_148153_b = 0;
            return;
        }
        int n2 = this.field_148158_l - n;
        this.field_148153_b = n2 / 2;
    }

    public void func_148128_a(int n, int n2, float f) {
        this.b.clear();
        int n3 = 0;
        for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : com.trolmastercard.sexmod.a.m) {
            gw gw2 = entry.getKey();
            Map.Entry<List<String>, Integer> entry2 = entry.getValue();
            this.b.add(new a.a(this, gw2, entry2.getKey(), entry2.getValue()));
            if (!gw.CUSTOM_BONE.equals((Object)entry.getKey())) continue;
            ++n3;
        }
        this.b.sort(Comparator.comparingInt(a2 -> f.indexOf((Object)a2.d)));
        List<String> list = br.a(this.d.c).get((Object)gw.CUSTOM_BONE);
        list.add(0, "cross");
        this.b.add(new a.a(this, n3 > 1));
        this.a();
        this.a(n, n2, f);
        if (!this.h) {
            return;
        }
        this.func_148145_f(999999);
        this.h = false;
    }

    void a(int n, int n2, float f) {
        if (!this.field_178041_q) {
            return;
        }
        this.field_148150_g = n;
        this.field_148162_h = n2;
        this.func_148123_a();
        int n3 = this.func_148137_d();
        int n4 = n3 + 6;
        this.func_148121_k();
        GlStateManager.func_179140_f();
        GlStateManager.func_179106_n();
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        this.drawContainerBackground(tessellator);
        int n5 = this.field_148152_e + this.field_148155_a / 2 - this.func_148139_c() / 2 + 2;
        int n6 = this.field_148153_b + 4 - (int)this.field_148169_q;
        if (this.field_148165_u) {
            this.func_148129_a(n5, n6, tessellator);
        }
        this.func_192638_a(n5, n6, n, n2, f);
        GlStateManager.func_179097_i();
        this.func_148136_c(0, this.field_148153_b, 255, 255);
        this.func_148136_c(this.field_148154_c, this.field_148158_l, 255, 255);
        GlStateManager.func_179147_l();
        GlStateManager.func_187428_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ZERO, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE);
        GlStateManager.func_179118_c();
        GlStateManager.func_179103_j((int)7425);
        GlStateManager.func_179090_x();
        int n7 = this.func_148135_f();
        if (n7 > 0) {
            int n8 = (this.field_148154_c - this.field_148153_b) * (this.field_148154_c - this.field_148153_b) / this.func_148138_e();
            int n9 = (int)this.field_148169_q * (this.field_148154_c - this.field_148153_b - (n8 = MathHelper.func_76125_a((int)n8, (int)32, (int)(this.field_148154_c - this.field_148153_b - 8)))) / n7 + this.field_148153_b;
            if (n9 < this.field_148153_b) {
                n9 = this.field_148153_b;
            }
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            bufferBuilder.func_181662_b((double)n3, (double)this.field_148154_c, 0.0).func_187315_a(0.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n4, (double)this.field_148154_c, 0.0).func_187315_a(1.0, 1.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n4, (double)this.field_148153_b, 0.0).func_187315_a(1.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n3, (double)this.field_148153_b, 0.0).func_187315_a(0.0, 0.0).func_181669_b(0, 0, 0, 255).func_181675_d();
            tessellator.func_78381_a();
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            bufferBuilder.func_181662_b((double)n3, (double)(n9 + n8), 0.0).func_187315_a(0.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n4, (double)(n9 + n8), 0.0).func_187315_a(1.0, 1.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n4, (double)n9, 0.0).func_187315_a(1.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n3, (double)n9, 0.0).func_187315_a(0.0, 0.0).func_181669_b(128, 128, 128, 255).func_181675_d();
            tessellator.func_78381_a();
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            bufferBuilder.func_181662_b((double)n3, (double)(n9 + n8 - 1), 0.0).func_187315_a(0.0, 1.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)(n4 - 1), (double)(n9 + n8 - 1), 0.0).func_187315_a(1.0, 1.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)(n4 - 1), (double)n9, 0.0).func_187315_a(1.0, 0.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            bufferBuilder.func_181662_b((double)n3, (double)n9, 0.0).func_187315_a(0.0, 0.0).func_181669_b(192, 192, 192, 255).func_181675_d();
            tessellator.func_78381_a();
        }
        this.func_148142_b(n, n2);
        GlStateManager.func_179098_w();
        GlStateManager.func_179103_j((int)7424);
        GlStateManager.func_179141_d();
        GlStateManager.func_179084_k();
    }

    public boolean func_148179_a(int n, int n2, int n3) {
        this.a(n, n2, n3);
        return super.func_148179_a(n, n2, n3);
    }

    void a(int n, int n2, int n3) {
        block2: {
            if (n > this.field_148155_a) {
                return;
            }
            int n4 = this.func_148148_g();
            float f = n4 + n2 - 5 - this.field_148153_b;
            int n5 = Math.round((float)Math.floor(f / (float)this.field_148149_f));
            int n6 = (int)Math.round(((double)(f / (float)this.field_148149_f) - Math.floor(f / (float)this.field_148149_f)) * (double)this.field_148149_f);
            if (n5 < 0) {
                return;
            }
            if (n5 >= this.b.size()) break block2;
            this.b.get(n5).a(n, n6, n3, n5);
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
