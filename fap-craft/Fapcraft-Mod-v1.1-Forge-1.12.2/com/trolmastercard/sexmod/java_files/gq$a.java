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
public class gq.a
implements GuiListExtended.IGuiListEntry {
    static final int g = 4;
    public gw d;
    public List<String> b;
    public int f;
    FontRenderer c;
    boolean a = false;
    boolean e = false;

    public gq.a(gw gw2, List<String> list, int n) {
        this.d = gw2;
        this.b = list;
        this.f = n;
        this.c = ((gq)gq.this).field_148161_k.field_71466_p;
    }

    public gq.a(boolean bl) {
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
            throw gq.a.a(runtimeException);
        }
        try {
            if (n > n5) {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
        }
        try {
            if (n2 < n4) {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
        }
        try {
            if (n2 > n6) {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
        }
        return true;
    }

    void b(int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        a a2;
        block9: {
            block8: {
                int n8;
                int n9;
                int n10;
                int n11;
                a a3;
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
                    throw gq.a.a(runtimeException);
                }
                try {
                    a3.func_73729_b(n11, n10, n9, n8, 20, 20);
                    a2 = gq.this.d;
                    n7 = n12 += 40;
                    n6 = n;
                    n5 = this.e ? 60 : 80;
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
                }
                try {
                    try {
                        if (!this.e || !this.b(n2, n3, n12, n, n12 + 20, n + 20)) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw gq.a.a(runtimeException);
                    }
                    n4 = 40;
                    break block9;
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
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
        a a2;
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
                a a3;
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
                    throw gq.a.a(runtimeException);
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
                        throw gq.a.a(runtimeException);
                    }
                    f = 1.0f;
                    break block27;
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
                }
            }
            f = b2.d();
        }
        float f2 = f;
        try {
            n7 = b2 == null ? 0 : (int)(-b2.g());
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
        }
        int n14 = n7;
        try {
            a2 = gq.this.d;
            n6 = n8;
            n5 = n + 10;
            n4 = cy2.f ? 0 : 6;
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
        }
        try {
            a2.a(n6, n5 + n4 + n14, 30.0f * f2, cy2);
            if (this.f != 0) {
                gq.this.d.a(cy2);
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
        }
        ((gq)gq.this).field_148161_k.field_71441_e.func_72973_f((Entity)cy2);
        n8 = (int)((float)n8 + 30.0f);
        try {
            if (this.f == 0) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
        }
        int n15 = n8;
        String string3 = this.b.get(this.f);
        try {
            string2 = string3.length() > gq.a.length() ? string3.substring(0, gq.a.length() - 3) + "..." : string3;
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
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
            throw gq.a.a(runtimeException);
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
            throw gq.a.a(runtimeException);
        }
        try {
            if (this.b(n2, n3, n17, n + 10, n18, n + 10 + this.c.field_78288_b)) {
                gq.this.d.a(string5, n2, n3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
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
        a a2;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        a a3;
        try {
            a3 = gq.this.d;
            n14 = n;
            n13 = n2;
            n12 = 0;
            n11 = 20;
            n10 = this.b(n3, n4, n, n2, n + 20, n2 + 20) ? 2 : 1;
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
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
            throw gq.a.a(runtimeException);
        }
        a2.a(n9, n8, n7, n6 * n5);
        return n + 40;
    }

    void a(int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        a a2;
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
            throw gq.a.a(runtimeException);
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
                throw gq.a.a(runtimeException);
            }
            try {
                if ((float)n4 > 0.33333334f * (float)gq.this.d.field_146294_l) {
                    return this.a(n6);
                }
            }
            catch (RuntimeException runtimeException) {
                throw gq.a.a(runtimeException);
            }
            try {
                try {
                    if (n5 >= n && n5 <= n + 20) break block16;
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
                }
                return this.a(n6);
            }
            catch (RuntimeException runtimeException) {
                throw gq.a.a(runtimeException);
            }
        }
        try {
            if (n4 < n2) {
                return 0.0f;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
        }
        try {
            if (n4 > n3) {
                return 1.0f;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gq.a.a(runtimeException);
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
                            throw gq.a.a(runtimeException);
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
                    throw gq.a.a(runtimeException);
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
                        throw gq.a.a(runtimeException);
                    }
                }
                try {
                    if (this.d != gw.GIRL_SPECIFIC) break block6;
                    this.b(n3, n6, n7, n);
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
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
                    throw gq.a.a(runtimeException);
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
                throw gq.a.a(runtimeException);
            }
            try {
                try {
                    if (n <= (n3 += 40) || n >= n3 + 20) break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
                }
                gq.this.field_148161_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a((SoundEvent)SoundEvents.field_187909_gi, (float)1.0f));
                com.trolmastercard.sexmod.a.m.remove(com.trolmastercard.sexmod.a.m.size() - 1);
            }
            catch (RuntimeException runtimeException) {
                throw gq.a.a(runtimeException);
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
                        throw gq.a.a(runtimeException);
                    }
                    gq.this.d.a(this.d, false, n2);
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
                }
            }
            try {
                try {
                    if (n <= 60 || n >= 80) break block9;
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
                }
                gq.this.d.a(this.d, true, n2);
            }
            catch (RuntimeException runtimeException) {
                throw gq.a.a(runtimeException);
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
            throw gq.a.a(runtimeException);
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
                        throw gq.a.a(runtimeException);
                    }
                    try {
                        if (n2 < 5) {
                            return;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw gq.a.a(runtimeException);
                    }
                    try {
                        if (n2 > 25) {
                            return;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw gq.a.a(runtimeException);
                    }
                    try {
                        if (!this.a) break block13;
                        this.b(n, n2);
                        break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw gq.a.a(runtimeException);
                    }
                }
                try {
                    if (this.d != gw.GIRL_SPECIFIC) break block15;
                    this.c(n, n4);
                    break block14;
                }
                catch (RuntimeException runtimeException) {
                    throw gq.a.a(runtimeException);
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
