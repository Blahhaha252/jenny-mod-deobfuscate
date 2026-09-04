/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.audio.ISound
 *  net.minecraft.client.audio.PositionedSoundRecord
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiListExtended$IGuiListEntry
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.cy;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.gq;
import com.trolmastercard.sexmod.gw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class gq.a.a
implements GuiListExtended.IGuiListEntry {
    static final int g = 4;
    public gw d;
    public List<String> b;
    public int f;
    FontRenderer c;
    boolean a = false;
    boolean e = false;

    public gq.a.a(gw gw2, List<String> list, int n) {
        this.d = gw2;
        this.b = list;
        this.f = n;
        this.c = ((gq)gq.this).field_148161_k.field_71466_p;
    }

    public gq.a.a(boolean bl) {
        this.e = bl;
        this.a = true;
    }

    boolean b(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n < n3) {
            return false;
        }
        if (n > n5) {
            return false;
        }
        if (n2 < n4) {
            return false;
        }
        return n2 <= n6;
    }

    void b(int n, int n2, int n3) {
        int n4 = 30;
        ((gq)gq.this).field_148161_k.field_71446_o.func_110577_a(com.trolmastercard.sexmod.a.k);
        gq.this.d.func_73729_b(n4, n, 40, this.b(n2, n3, n4, n += 5, n4 + 20, n + 20) ? 40 : 20, 20, 20);
        gq.this.d.func_73729_b(n4, n, this.e ? 60 : 80, this.e && this.b(n2, n3, n4 += 40, n, n4 + 20, n + 20) ? 40 : 20, 20, 20);
    }

    void a(int n, int n2, int n3) {
        ((gq)gq.this).field_148161_k.field_71446_o.func_110577_a(com.trolmastercard.sexmod.a.k);
        gq.this.d.func_73729_b(gq.i, n, 0, 60, this.f == 0 ? 119 : 256, 30);
        int n4 = gq.i + 10;
        gq.this.d.a(n4, n += 5, this.d.iconXPos);
        n4 += 25;
        n4 = this.c(n4, n, n2, n3);
        em em2 = gq.this.d.d();
        cy cy2 = this.f == 0 ? cy.a((World)((gq)gq.this).field_148161_k.field_71441_e, em2.f(), this.d) : new cy(em2.field_70170_p, em2.f(), this.b.get(this.f));
        br.b$b b$b2 = br.b(cy2.a());
        float f = cy2.f || b$b2 == null ? 1.0f : b$b2.d();
        int n5 = b$b2 == null ? 0 : (int)(-b$b2.g());
        gq.this.d.a(n4, n + 10 + (cy2.f ? 0 : 6) + n5, 30.0f * f, cy2);
        if (this.f != 0) {
            gq.this.d.a(cy2);
        }
        ((gq)gq.this).field_148161_k.field_71441_e.func_72973_f((Entity)cy2);
        n4 = (int)((float)n4 + 30.0f);
        if (this.f == 0) {
            return;
        }
        int n6 = n4;
        String string = this.b.get(this.f);
        String string2 = string.length() > "MMMMMMMMMM".length() ? string.substring(0, "MMMMMMMMMM".length() - 3) + "..." : string;
        this.a(string2, n4, n + 10);
        int n7 = n4 += this.c.func_78256_a("MMMMMMMMMM");
        int n8 = n4;
        String string3 = br.d(string);
        String string4 = string3.length() > "MMMMMMMMMM".length() ? string3.substring(0, "MMMMMMMMMM".length() - 3) + "..." : string3;
        this.a(string4, n4, n + 10);
        int n9 = n4 += this.c.func_78256_a("MMMMMMMMMM");
        if (this.b(n2, n3, n6, n + 10, n7, n + 10 + this.c.field_78288_b)) {
            gq.this.d.a(string, n2, n3);
        }
        if (this.b(n2, n3, n8, n + 10, n9, n + 10 + this.c.field_78288_b)) {
            gq.this.d.a(string3, n2, n3);
        }
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.func_179131_c((float)255.0f, (float)255.0f, (float)255.0f, (float)255.0f);
    }

    int c(int n, int n2, int n3, int n4) {
        gq.this.d.a(n, n2, 0, 20 * (this.b(n3, n4, n, n2, n + 20, n2 + 20) ? 2 : 1));
        gq.this.d.a(n, n2, 20, 20 * (this.b(n3, n4, n += 20, n2, n + 20, n2 + 20) ? 2 : 1));
        return n + 40;
    }

    void a(int n, int n2, int n3, int n4, int n5) {
        gq.this.d.func_73729_b(n, n2, 140, 20, 79, 20);
        int n6 = n += 4;
        int n7 = n + 71 - 4;
        float f = this.a(n2, n6, n7, n3, n4, n5);
        int n8 = (int)b6.a((float)n6, (float)n7, f);
        gq.this.d.func_73729_b(n8, n2, this.b(n3, n4, n8, n2, n8 + 4, n2 + 20) ? 223 : 219, 20, 4, 20);
        gq.this.d.c.a(n5, (int)(f * 100.0f));
    }

    float a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (!gq.this.d.f) {
            return this.a(n6);
        }
        if ((float)n4 > 0.33333334f * (float)gq.this.d.field_146294_l) {
            return this.a(n6);
        }
        if (n5 < n || n5 > n + 20) {
            return this.a(n6);
        }
        if (n4 < n2) {
            return 0.0f;
        }
        if (n4 > n3) {
            return 1.0f;
        }
        return (float)(n4 -= n2) / (float)(n3 -= n2);
    }

    float a(int n) {
        Map.Entry<gw, Map.Entry<List<String>, Integer>> entry = gq.this.d.c.d(gq.this.d.g).get(n);
        return (float)entry.getValue().getValue().intValue() / 100.0f;
    }

    void b(int n, int n2, int n3, int n4) {
        boolean bl = gq.this.d.c.h(n4);
        ((gq)gq.this).field_148161_k.field_71446_o.func_110577_a(com.trolmastercard.sexmod.a.k);
        if (bl) {
            gq.this.d.func_73729_b(gq.i, n, 0, 60, 119, 30);
        } else {
            gq.this.d.func_73729_b(gq.i, n, 0, 90, 95, 30);
        }
        int n5 = gq.i + 10;
        gq.this.d.a(n5, n += 5, gq.this.d.c.g(n4));
        n5 += 25;
        if (bl) {
            this.a(n5, n, n2, n3, n4);
        } else {
            this.c(n5, n, n2, n3);
        }
    }

    public void func_192634_a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        if (this.a) {
            this.b(n3, n6, n7);
        } else if (this.d == gw.GIRL_SPECIFIC) {
            this.b(n3, n6, n7, n);
        } else {
            this.a(n3, n6, n7);
        }
    }

    void a(String string, int n, int n2) {
        this.c.func_78276_b(string, n, n2, 3809871);
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    void b(int n, int n2) {
        block2: {
            int n3 = 30;
            if (n > n3 && n < n3 + 20) {
                gq.this.h = true;
                gq.this.field_148161_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a((SoundEvent)SoundEvents.field_187909_gi, (float)1.0f));
                ArrayList<String> arrayList = new ArrayList<String>();
                arrayList.add("cross");
                arrayList.addAll((Collection)br.a(gq.this.d.c).get((Object)gw.CUSTOM_BONE));
                com.trolmastercard.sexmod.a.m.add(com.trolmastercard.sexmod.a.b(gq.this.d.c));
            }
            if (!this.e) {
                return;
            }
            if (n <= (n3 += 40) || n >= n3 + 20) break block2;
            gq.this.field_148161_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a((SoundEvent)SoundEvents.field_187909_gi, (float)1.0f));
            com.trolmastercard.sexmod.a.m.remove(com.trolmastercard.sexmod.a.m.size() - 1);
        }
    }

    void a(int n, int n2) {
        block1: {
            if (n > 40 && n < 60) {
                gq.this.d.a(this.d, false, n2);
            }
            if (n <= 60 || n >= 80) break block1;
            gq.this.d.a(this.d, true, n2);
        }
    }

    void c(int n, int n2) {
        block0: {
            if (gq.this.d.c.h(n2)) break block0;
            this.a(n, n2);
        }
    }

    public void a(int n, int n2, int n3, int n4) {
        if (n3 != 0) {
            return;
        }
        if (n2 < 5) {
            return;
        }
        if (n2 > 25) {
            return;
        }
        if (this.a) {
            this.b(n, n2);
        } else if (this.d == gw.GIRL_SPECIFIC) {
            this.c(n, n4);
        } else {
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
