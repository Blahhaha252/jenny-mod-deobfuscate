/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.an;
import com.trolmastercard.sexmod.ar;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.b8;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.r;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ep {
    static final int c = 30;
    static final int k = 6;
    static final int f = 6;
    static final float b = 0.15f;
    List<an> g = new ArrayList<an>();
    final int a;
    final ar i;
    final b8 d;
    final em e;
    final float j;
    final float h;

    public ep(int n, ar ar2, b8 b82, em em2, float f, float f2) {
        this.a = n;
        this.i = ar2;
        this.d = b82;
        this.e = em2;
        this.j = f;
        this.h = f2;
    }

    void a(Minecraft minecraft, Tessellator tessellator, BufferBuilder bufferBuilder, float f) {
        Vec3d vec3d;
        if (this.g.size() < this.a) {
            for (int i = 0; i < 6; ++i) {
                vec3d = this.i.a(this.e);
                this.g.add(new an((World)minecraft.field_71441_e, this.d.a(this.e), new Vec3d(vec3d.field_72450_a + (double)((r.f.nextFloat() * 2.0f - 1.0f) * this.j), vec3d.field_72448_b + (double)((r.f.nextFloat() * 2.0f - 1.0f) * this.j), vec3d.field_72449_c + (double)((r.f.nextFloat() * 2.0f - 1.0f) * this.j))));
            }
        }
        GlStateManager.func_179129_p();
        GlStateManager.func_179118_c();
        Vec3d vec3d2 = b6.a(new Vec3d(minecraft.field_71439_g.field_70142_S, minecraft.field_71439_g.field_70137_T, minecraft.field_71439_g.field_70136_U), minecraft.field_71439_g.func_174791_d(), (double)f);
        bufferBuilder.func_181668_a(9, DefaultVertexFormats.field_181706_f);
        this.b();
        vec3d = null;
        for (an an2 : this.g) {
            Vec3d vec3d3 = b6.a(an2.d, an2.f, (double)f);
            if (vec3d == null) {
                vec3d = vec3d3;
            }
            if (vec3d.func_72438_d(vec3d3) > (double)this.h) {
                tessellator.func_78381_a();
                bufferBuilder.func_181668_a(9, DefaultVertexFormats.field_181706_f);
            }
            bufferBuilder.func_181662_b(vec3d3.field_72450_a - vec3d2.field_72450_a, vec3d3.field_72448_b - vec3d2.field_72448_b, vec3d3.field_72449_c - vec3d2.field_72449_c).func_181669_b(255, 255, 255, 255).func_181675_d();
            vec3d = vec3d3;
        }
        tessellator.func_78381_a();
        GlStateManager.func_179089_o();
    }

    void a() {
        for (an an2 : this.g) {
            an2.a();
        }
    }

    void b() {
        if (this.g.isEmpty() || this.g.size() <= 1) {
            return;
        }
        for (int i = 1; i < this.g.size(); ++i) {
            int n;
            an an2 = this.g.get(i);
            Vec3d vec3d = an2.f;
            for (n = i - 1; n >= 0 && vec3d.func_72438_d(this.g.get((int)n).f) < vec3d.func_72438_d(this.g.get((int)(n + 1)).f); --n) {
                this.g.set(n + 1, this.g.get(n));
            }
            this.g.set(n + 1, an2);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
