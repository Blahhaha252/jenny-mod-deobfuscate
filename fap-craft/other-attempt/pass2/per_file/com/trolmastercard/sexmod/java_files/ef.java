/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.math.Vec3d
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.ef;
import com.trolmastercard.sexmod.gv;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;

public class ef {
    public static void a(BufferBuilder bufferBuilder, Tessellator tessellator, Minecraft minecraft, b.b b2) {
        Vec3d[] vec3dArray;
        int n;
        Vec3d[] vec3dArray2 = new Vec3d[]{new Vec3d((double)(-b2.f), (double)(-b2.a), 0.0), new Vec3d((double)(-b2.f), (double)b2.a, 0.0), new Vec3d((double)b2.f, (double)b2.a, 0.0), new Vec3d((double)b2.f, (double)(-b2.a), 0.0)};
        Vec3d vec3d = new Vec3d(0.0, 0.0, (double)(-b2.g));
        Vec3d vec3d2 = ck.a(vec3d.func_72432_b(), (double)b2.e);
        Vec3d[] vec3dArray3 = new Vec3d[4];
        System.arraycopy(vec3dArray2, 0, vec3dArray3, 0, 4);
        ArrayList<Vec3d[]> arrayList = new ArrayList<Vec3d[]>();
        float f = (float)minecraft.field_71439_g.field_70173_aa + minecraft.func_184121_ak();
        for (n = 0; n <= b2.c; ++n) {
            vec3dArray = new Vec3d[4];
            float f2 = 1.0f - (float)n / (float)b2.c;
            for (int i = 0; i < 4; ++i) {
                Vec3d vec3d3 = vec3dArray2[i];
                vec3dArray[i] = new Vec3d(vec3d3.field_72450_a * (double)f2, vec3d3.field_72448_b, vec3d3.field_72449_c).func_178787_e(vec3d2);
            }
            arrayList.add(vec3dArray);
            vec3d = ck.a(vec3d, b2.i.a(n, f), b2.b.a(n, f), b2.d.a(n, f));
            vec3d2 = vec3d2.func_178787_e(vec3d);
        }
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        ef.a(bufferBuilder, vec3dArray3, (Vec3d[])arrayList.get(0), b2.h);
        for (n = 0; n < b2.c - 1; ++n) {
            vec3dArray = (Vec3d[])arrayList.get(n);
            Vec3d[] vec3dArray4 = (Vec3d[])arrayList.get(n + 1);
            ef.a(bufferBuilder, vec3dArray, vec3dArray4, b2.h);
        }
        tessellator.func_78381_a();
    }

    static float a(float f, float f2, float f3, int n, float f4) {
        return (float)(Math.sin(f * f2 + f3 * (float)n) * (double)f4);
    }

    static void a(BufferBuilder bufferBuilder, Vec3d[] vec3dArray, Vec3d[] vec3dArray2, gv gv2) {
        bufferBuilder.func_181662_b(vec3dArray[1].field_72450_a, vec3dArray[1].field_72448_b, vec3dArray[1].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[2].field_72450_a, vec3dArray[2].field_72448_b, vec3dArray[2].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray2[2].field_72450_a, vec3dArray2[2].field_72448_b, vec3dArray2[2].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray2[1].field_72450_a, vec3dArray2[1].field_72448_b, vec3dArray2[1].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[0].field_72450_a, vec3dArray[0].field_72448_b, vec3dArray[0].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[1].field_72450_a, vec3dArray[1].field_72448_b, vec3dArray[1].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray2[1].field_72450_a, vec3dArray2[1].field_72448_b, vec3dArray2[1].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray2[0].field_72450_a, vec3dArray2[0].field_72448_b, vec3dArray2[0].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[2].field_72450_a, vec3dArray[2].field_72448_b, vec3dArray[2].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[3].field_72450_a, vec3dArray[3].field_72448_b, vec3dArray[3].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray2[3].field_72450_a, vec3dArray2[3].field_72448_b, vec3dArray2[3].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray2[2].field_72450_a, vec3dArray2[2].field_72448_b, vec3dArray2[2].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[0].field_72450_a, vec3dArray[0].field_72448_b, vec3dArray[0].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[3].field_72450_a, vec3dArray[3].field_72448_b, vec3dArray[3].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray2[3].field_72450_a, vec3dArray2[3].field_72448_b, vec3dArray2[3].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray2[0].field_72450_a, vec3dArray2[0].field_72448_b, vec3dArray2[0].field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
    }

    @FunctionalInterface
    public static interface a$a {
        public float a(int var1, float var2);
    }
}
