/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.ISound
 *  net.minecraft.client.audio.PositionedSoundRecord
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiListExtended
 *  net.minecraft.client.gui.GuiListExtended$IGuiListEntry
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.input.Mouse
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.cy;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.gw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Mouse;

public class gq
extends GuiListExtended {
    static final int c = 3809871;
    static final List<gw> f = Arrays.asList(gw.values());
    static final String a = "MMMMMMMMMM";
    protected static int i = 5;
    protected static int e = 200;
    private List<a> b = new ArrayList<a>();
    com.trolmastercard.sexmod.a d;
    boolean h = false;
    float g = 0.0f;

    public gq(Minecraft minecraft, com.trolmastercard.sexmod.a a2) {
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
        try {
            if (!this.func_148141_e(this.field_148162_h)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
        }
        int n = Mouse.getEventDWheel();
        try {
            if (n == 0) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
        }
        n = n > 0 ? -1 : 1;
        this.field_148169_q += (float)(n * this.field_148149_f / 2);
    }

    protected void func_148136_c(int n, int n2, int n3, int n4) {
    }

    void a() {
        int n = this.b.size() * this.field_148149_f;
        try {
            if (n > this.field_148158_l) {
                this.field_148153_b = 0;
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
        }
        int n2 = this.field_148158_l - n;
        this.field_148153_b = n2 / 2;
    }

    public void func_148128_a(int n, int n2, float f) {
        boolean bl;
        gq gq2;
        a a3;
        a a4;
        List<a> list;
        this.b.clear();
        int n3 = 0;
        for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : com.trolmastercard.sexmod.a.m) {
            gw gw2 = entry.getKey();
            Map.Entry<List<String>, Integer> entry2 = entry.getValue();
            try {
                this.b.add(new a(gw2, entry2.getKey(), entry2.getValue()));
                if (!gw.CUSTOM_BONE.equals((Object)entry.getKey())) continue;
                ++n3;
            }
            catch (RuntimeException runtimeException) {
                throw gq.a(runtimeException);
            }
        }
        this.b.sort(Comparator.comparingInt(a2 -> f.indexOf((Object)a2.d)));
        List<String> list2 = br.a(this.d.c).get((Object)gw.CUSTOM_BONE);
        try {
            a a5;
            list2.add(0, "cross");
            list = this.b;
            a4 = a5;
            a3 = a5;
            gq2 = this;
            bl = n3 > 1;
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
        }
        a4(bl);
        list.add(a3);
        this.a();
        this.a(n, n2, f);
        if (!this.h) {
            return;
        }
        this.func_148145_f(999999);
        this.h = false;
    }

    void a(int n, int n2, float f) {
        try {
            if (!this.field_178041_q) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
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
        try {
            if (this.field_148165_u) {
                this.func_148129_a(n5, n6, tessellator);
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
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
        try {
            if (n > this.field_148155_a) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
        }
        int n4 = this.func_148148_g();
        float f = n4 + n2 - 5 - this.field_148153_b;
        int n5 = Math.round((float)Math.floor(f / (float)this.field_148149_f));
        int n6 = (int)Math.round(((double)(f / (float)this.field_148149_f) - Math.floor(f / (float)this.field_148149_f)) * (double)this.field_148149_f);
        try {
            if (n5 < 0) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
        }
        try {
            if (n5 < this.b.size()) {
                this.b.get(n5).a(n, n6, n3, n5);
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a(runtimeException);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    @SideOnly(value=Side.CLIENT)
    public class a
    implements GuiListExtended.IGuiListEntry {
        static final int g = 4;
        public gw d;
        public List<String> b;
        public int f;
        FontRenderer c;
        boolean a = false;
        boolean e = false;

        public a(gw gw2, List<String> list, int n) {
            this.d = gw2;
            this.b = list;
            this.f = n;
            this.c = ((gq)gq.this).field_148161_k.field_71466_p;
        }

        public a(boolean bl) {
            this.e = bl;
            this.a = true;
        }

        boolean b(int n, int n2, int n3, int n4, int n5, int n6) {
            try {
                if (n < n3) {
                    return false;
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            try {
                if (n > n5) {
                    return false;
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            try {
                if (n2 < n4) {
                    return false;
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            try {
                if (n2 > n6) {
                    return false;
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            return true;
        }

        void b(int n, int n2, int n3) {
            int n4;
            int n5;
            int n6;
            int n7;
            com.trolmastercard.sexmod.a a2;
            block9: {
                block8: {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    com.trolmastercard.sexmod.a a3;
                    int n12 = 30;
                    try {
                        ((gq)gq.this).field_148161_k.field_71446_o.func_110577_a(com.trolmastercard.sexmod.a.k);
                        a3 = gq.this.d;
                        n11 = n12;
                        n10 = n += 5;
                        n9 = 40;
                        n8 = this.b(n2, n3, n12, n, n12 + 20, n + 20) ? 40 : 20;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                    try {
                        a3.func_73729_b(n11, n10, n9, n8, 20, 20);
                        a2 = gq.this.d;
                        n7 = n12 += 40;
                        n6 = n;
                        n5 = this.e ? 60 : 80;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                    try {
                        try {
                            if (!this.e || !this.b(n2, n3, n12, n, n12 + 20, n + 20)) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                        }
                        n4 = 40;
                        break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                }
                n4 = 20;
            }
            a2.func_73729_b(n7, n6, n5, n4, 20, 20);
        }

        void a(int n, int n2, int n3) {
            String string;
            String string2;
            int n4;
            int n5;
            int n6;
            com.trolmastercard.sexmod.a a2;
            int n7;
            float f;
            br.b b2;
            cy cy2;
            int n8;
            block27: {
                block26: {
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    com.trolmastercard.sexmod.a a3;
                    try {
                        ((gq)gq.this).field_148161_k.field_71446_o.func_110577_a(com.trolmastercard.sexmod.a.k);
                        a3 = gq.this.d;
                        n13 = i;
                        n12 = n;
                        n11 = 0;
                        n10 = 60;
                        n9 = this.f == 0 ? 119 : 256;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                    a3.func_73729_b(n13, n12, n11, n10, n9, 30);
                    n8 = i + 10;
                    gq.this.d.a(n8, n += 5, this.d.iconXPos);
                    n8 += 25;
                    n8 = this.c(n8, n, n2, n3);
                    em em2 = gq.this.d.d();
                    cy2 = this.f == 0 ? cy.a((World)((gq)gq.this).field_148161_k.field_71441_e, em2.f(), this.d) : new cy(em2.field_70170_p, em2.f(), this.b.get(this.f));
                    b2 = br.b(cy2.a());
                    try {
                        try {
                            if (!cy2.f && b2 != null) break block26;
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                        }
                        f = 1.0f;
                        break block27;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                }
                f = b2.d();
            }
            float f2 = f;
            try {
                n7 = b2 == null ? 0 : (int)(-b2.g());
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            int n14 = n7;
            try {
                a2 = gq.this.d;
                n6 = n8;
                n5 = n + 10;
                n4 = cy2.f ? 0 : 6;
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            try {
                a2.a(n6, n5 + n4 + n14, 30.0f * f2, cy2);
                if (this.f != 0) {
                    gq.this.d.a(cy2);
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            ((gq)gq.this).field_148161_k.field_71441_e.func_72973_f((Entity)cy2);
            n8 = (int)((float)n8 + 30.0f);
            try {
                if (this.f == 0) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            int n15 = n8;
            String string3 = this.b.get(this.f);
            try {
                string2 = string3.length() > gq.a.length() ? string3.substring(0, gq.a.length() - 3) + "..." : string3;
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            String string4 = string2;
            this.a(string4, n8, n + 10);
            int n16 = n8 += this.c.func_78256_a(gq.a);
            int n17 = n8;
            String string5 = br.d(string3);
            try {
                string = string5.length() > gq.a.length() ? string5.substring(0, gq.a.length() - 3) + "..." : string5;
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            String string6 = string;
            this.a(string6, n8, n + 10);
            int n18 = n8 += this.c.func_78256_a(gq.a);
            try {
                if (this.b(n2, n3, n15, n + 10, n16, n + 10 + this.c.field_78288_b)) {
                    gq.this.d.a(string3, n2, n3);
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            try {
                if (this.b(n2, n3, n17, n + 10, n18, n + 10 + this.c.field_78288_b)) {
                    gq.this.d.a(string5, n2, n3);
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.func_179131_c((float)255.0f, (float)255.0f, (float)255.0f, (float)255.0f);
        }

        int c(int n, int n2, int n3, int n4) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            com.trolmastercard.sexmod.a a2;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            com.trolmastercard.sexmod.a a3;
            try {
                a3 = gq.this.d;
                n14 = n;
                n13 = n2;
                n12 = 0;
                n11 = 20;
                n10 = this.b(n3, n4, n, n2, n + 20, n2 + 20) ? 2 : 1;
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            try {
                a3.a(n14, n13, n12, n11 * n10);
                a2 = gq.this.d;
                n9 = n += 20;
                n8 = n2;
                n7 = 20;
                n6 = 20;
                n5 = this.b(n3, n4, n, n2, n + 20, n2 + 20) ? 2 : 1;
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            a2.a(n9, n8, n7, n6 * n5);
            return n + 40;
        }

        void a(int n, int n2, int n3, int n4, int n5) {
            int n6;
            int n7;
            int n8;
            com.trolmastercard.sexmod.a a2;
            gq.this.d.func_73729_b(n, n2, 140, 20, 79, 20);
            int n9 = n += 4;
            int n10 = n + 71 - 4;
            float f = this.a(n2, n9, n10, n3, n4, n5);
            int n11 = (int)b6.a((float)n9, (float)n10, f);
            try {
                a2 = gq.this.d;
                n8 = n11;
                n7 = n2;
                n6 = this.b(n3, n4, n11, n2, n11 + 4, n2 + 20) ? 223 : 219;
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            a2.func_73729_b(n8, n7, n6, 20, 4, 20);
            gq.this.d.c.a(n5, (int)(f * 100.0f));
        }

        float a(int n, int n2, int n3, int n4, int n5, int n6) {
            block16: {
                try {
                    if (!gq.this.d.f) {
                        return this.a(n6);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                }
                try {
                    if ((float)n4 > 0.33333334f * (float)gq.this.d.field_146294_l) {
                        return this.a(n6);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                }
                try {
                    try {
                        if (n5 >= n && n5 <= n + 20) break block16;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                    return this.a(n6);
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                }
            }
            try {
                if (n4 < n2) {
                    return 0.0f;
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            try {
                if (n4 > n3) {
                    return 1.0f;
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
            return (float)(n4 -= n2) / (float)(n3 -= n2);
        }

        float a(int n) {
            Map.Entry<gw, Map.Entry<List<String>, Integer>> entry = gq.this.d.c.d(gq.this.d.g).get(n);
            return (float)entry.getValue().getValue().intValue() / 100.0f;
        }

        void b(int n, int n2, int n3, int n4) {
            block7: {
                int n5;
                block6: {
                    boolean bl;
                    block5: {
                        block4: {
                            bl = gq.this.d.c.h(n4);
                            try {
                                ((gq)gq.this).field_148161_k.field_71446_o.func_110577_a(com.trolmastercard.sexmod.a.k);
                                if (!bl) break block4;
                                gq.this.d.func_73729_b(i, n, 0, 60, 119, 30);
                                break block5;
                            }
                            catch (RuntimeException runtimeException) {
                                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                            }
                        }
                        gq.this.d.func_73729_b(i, n, 0, 90, 95, 30);
                    }
                    n5 = i + 10;
                    try {
                        gq.this.d.a(n5, n += 5, gq.this.d.c.g(n4));
                        n5 += 25;
                        if (!bl) break block6;
                        this.a(n5, n, n2, n3, n4);
                        break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                }
                this.c(n5, n, n2, n3);
            }
        }

        public void func_192634_a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
            block5: {
                block6: {
                    block4: {
                        try {
                            if (!this.a) break block4;
                            this.b(n3, n6, n7);
                            break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                        }
                    }
                    try {
                        if (this.d != gw.GIRL_SPECIFIC) break block6;
                        this.b(n3, n6, n7, n);
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                }
                this.a(n3, n6, n7);
            }
        }

        void a(String string, int n, int n2) {
            this.c.func_78276_b(string, n, n2, 3809871);
            GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }

        void b(int n, int n2) {
            block10: {
                int n3;
                block9: {
                    n3 = 30;
                    try {
                        if (n <= n3 || n >= n3 + 20) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                    gq.this.h = true;
                    gq.this.field_148161_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a((SoundEvent)SoundEvents.field_187909_gi, (float)1.0f));
                    ArrayList<String> arrayList = new ArrayList<String>();
                    arrayList.add("cross");
                    arrayList.addAll((Collection)br.a(gq.this.d.c).get((Object)gw.CUSTOM_BONE));
                    com.trolmastercard.sexmod.a.m.add(com.trolmastercard.sexmod.a.b(gq.this.d.c));
                }
                try {
                    if (!this.e) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                }
                try {
                    try {
                        if (n <= (n3 += 40) || n >= n3 + 20) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                    gq.this.field_148161_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a((SoundEvent)SoundEvents.field_187909_gi, (float)1.0f));
                    com.trolmastercard.sexmod.a.m.remove(com.trolmastercard.sexmod.a.m.size() - 1);
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                }
            }
        }

        void a(int n, int n2) {
            block9: {
                block8: {
                    try {
                        try {
                            if (n <= 40 || n >= 60) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                        }
                        gq.this.d.a(this.d, false, n2);
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                }
                try {
                    try {
                        if (n <= 60 || n >= 80) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                    gq.this.d.a(this.d, true, n2);
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                }
            }
        }

        void c(int n, int n2) {
            try {
                if (!gq.this.d.c.h(n2)) {
                    this.a(n, n2);
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
            }
        }

        public void a(int n, int n2, int n3, int n4) {
            block14: {
                block15: {
                    block13: {
                        try {
                            if (n3 != 0) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                        }
                        try {
                            if (n2 < 5) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                        }
                        try {
                            if (n2 > 25) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                        }
                        try {
                            if (!this.a) break block13;
                            this.b(n, n2);
                            break block14;
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                        }
                    }
                    try {
                        if (this.d != gw.GIRL_SPECIFIC) break block15;
                        this.c(n, n4);
                        break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.gq$a.a(runtimeException);
                    }
                }
                this.a(n, n4);
            }
        }

        public void func_192633_a(int n, int n2, int n3, float f) {
        }

        public boolean func_148278_a(int n, int n2, int n3, int n4, int n5, int n6) {
            return false;
        }

        public void func_148277_b(int n, int n2, int n3, int n4, int n5, int n6) {
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
