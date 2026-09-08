/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 *  software.bernie.geckolib3.core.processor.IBone
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d_;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gv;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.processor.IBone;

public class af {
    public static Vec3d[][] a(em em2, float f, String string, String string2, String string3, float f2, float f3, float f4, float f5, String string4) {
        Vec3d[] vec3dArray = af.b(em2, f, string, string2, string3, f2, f3, f4, f5, string4);
        return af.a(vec3dArray);
    }

    public static Vec3d[][] a(em em2, float f, String string, String string2, f7 f72, f7 f73) {
        Vec3d[] vec3dArray = af.b(em2, f, string, string2, f72, f73);
        return af.b(vec3dArray);
    }

    static Vec3d[] b(em em2, float f, String string, String string2, f7 f72, f7 f73) {
        int n;
        Vec3d vec3d = em2.b(string);
        Vec3d vec3d2 = em2.b(string2);
        Vec3d[] vec3dArray = new Vec3d[8];
        if (f72.a == 0.0f && f73.a == 0.0f) {
            vec3dArray[0] = new Vec3d(0.0, (double)f72.c, (double)f72.b);
            vec3dArray[1] = new Vec3d(0.0, (double)(-f72.c), (double)f72.b);
            vec3dArray[2] = new Vec3d(0.0, (double)(-f72.c), (double)(-f72.b));
            vec3dArray[3] = new Vec3d(0.0, (double)f72.c, (double)(-f72.b));
            vec3dArray[4] = new Vec3d(0.0, (double)f73.c, (double)f73.b);
            vec3dArray[5] = new Vec3d(0.0, (double)(-f73.c), (double)f73.b);
            vec3dArray[6] = new Vec3d(0.0, (double)(-f73.c), (double)(-f73.b));
            vec3dArray[7] = new Vec3d(0.0, (double)f73.c, (double)(-f73.b));
        } else {
            vec3dArray[0] = new Vec3d((double)f72.a, (double)f72.c, 0.0);
            vec3dArray[1] = new Vec3d((double)(-f72.a), (double)f72.c, 0.0);
            vec3dArray[2] = new Vec3d((double)(-f72.a), (double)(-f72.c), 0.0);
            vec3dArray[3] = new Vec3d((double)f72.a, (double)(-f72.c), 0.0);
            vec3dArray[4] = new Vec3d((double)f73.a, (double)f73.c, 0.0);
            vec3dArray[5] = new Vec3d((double)(-f73.a), (double)f73.c, 0.0);
            vec3dArray[6] = new Vec3d((double)(-f73.a), (double)(-f73.c), 0.0);
            vec3dArray[7] = new Vec3d((double)f73.a, (double)(-f73.c), 0.0);
        }
        for (n = 0; n < vec3dArray.length; ++n) {
            vec3dArray[n] = ck.a(vec3dArray[n], f);
        }
        for (n = 0; n < 4; ++n) {
            vec3dArray[n] = vec3dArray[n].func_178787_e(vec3d);
        }
        for (n = 4; n < 8; ++n) {
            vec3dArray[n] = vec3dArray[n].func_178787_e(vec3d2);
        }
        return vec3dArray;
    }

    static Vec3d[][] b(Vec3d[] vec3dArray) {
        Vec3d[][] vec3dArray2 = new Vec3d[6][4];
        vec3dArray2[0][0] = vec3dArray[0];
        vec3dArray2[0][1] = vec3dArray[1];
        vec3dArray2[0][2] = vec3dArray[2];
        vec3dArray2[0][3] = vec3dArray[3];
        vec3dArray2[1][0] = vec3dArray[4];
        vec3dArray2[1][1] = vec3dArray[5];
        vec3dArray2[1][2] = vec3dArray[6];
        vec3dArray2[1][3] = vec3dArray[7];
        vec3dArray2[2][0] = vec3dArray[1];
        vec3dArray2[2][1] = vec3dArray[2];
        vec3dArray2[2][2] = vec3dArray[6];
        vec3dArray2[2][3] = vec3dArray[5];
        vec3dArray2[3][0] = vec3dArray[3];
        vec3dArray2[3][1] = vec3dArray[7];
        vec3dArray2[3][2] = vec3dArray[4];
        vec3dArray2[3][3] = vec3dArray[0];
        vec3dArray2[4][0] = vec3dArray[1];
        vec3dArray2[4][1] = vec3dArray[0];
        vec3dArray2[4][2] = vec3dArray[4];
        vec3dArray2[4][3] = vec3dArray[5];
        vec3dArray2[5][0] = vec3dArray[2];
        vec3dArray2[5][1] = vec3dArray[3];
        vec3dArray2[5][2] = vec3dArray[7];
        vec3dArray2[5][3] = vec3dArray[6];
        return vec3dArray2;
    }

    static Vec3d[] b(em em2, float f, String string, String string2, String string3, float f2, float f3, float f4, float f5, String string4) {
        int n;
        IBone iBone = em2.b().getBone(string4);
        if (iBone == null) {
            Object[] objectArray = new Vec3d[12];
            Arrays.fill(objectArray, Vec3d.field_186680_a);
            return objectArray;
        }
        float f6 = gc.d(iBone.getRotationY());
        float f8 = gc.d(iBone.getRotationZ());
        Vec3d vec3d = em2.b(string);
        Vec3d vec3d2 = em2.b(string2);
        Vec3d vec3d3 = em2.b(string3);
        Vec3d[] vec3dArray = new Vec3d[]{new Vec3d((double)f2, 0.0, (double)(-f3)), new Vec3d((double)(-f2), 0.0, (double)(-f3)), new Vec3d((double)(-f2), 0.0, (double)f3), new Vec3d((double)f2, 0.0, (double)f3), new Vec3d((double)f2, (double)f3, 0.0), new Vec3d((double)(-f2), (double)f3, 0.0), new Vec3d((double)(-f2), (double)(-f3), 0.0), new Vec3d((double)f2, (double)(-f3), 0.0), new Vec3d((double)f4, 0.0, (double)(-f5)), new Vec3d((double)(-f4), 0.0, (double)(-f5)), new Vec3d((double)(-f4), 0.0, (double)f5), new Vec3d((double)f4, 0.0, (double)f5)};
        for (n = 0; n < vec3dArray.length; ++n) {
            vec3dArray[n] = ck.a(vec3dArray[n], f);
        }
        for (n = 0; n < 4; ++n) {
            vec3dArray[n] = ck.a(vec3dArray[n], 0.0f, f6, f8);
        }
        for (n = 0; n < 4; ++n) {
            vec3dArray[n] = vec3dArray[n].func_178787_e(vec3d);
        }
        for (n = 4; n < 8; ++n) {
            vec3dArray[n] = vec3dArray[n].func_178787_e(vec3d2);
        }
        for (n = 8; n < 12; ++n) {
            vec3dArray[n] = vec3dArray[n].func_178787_e(vec3d3);
        }
        return vec3dArray;
    }

    static Vec3d[][] a(Vec3d[] vec3dArray) {
        Vec3d[][] vec3dArray2 = new Vec3d[10][4];
        vec3dArray2[0][0] = vec3dArray[0];
        vec3dArray2[0][1] = vec3dArray[1];
        vec3dArray2[0][2] = vec3dArray[5];
        vec3dArray2[0][3] = vec3dArray[4];
        vec3dArray2[1][0] = vec3dArray[1];
        vec3dArray2[1][1] = vec3dArray[2];
        vec3dArray2[1][2] = vec3dArray[6];
        vec3dArray2[1][3] = vec3dArray[5];
        vec3dArray2[2][0] = vec3dArray[3];
        vec3dArray2[2][1] = vec3dArray[2];
        vec3dArray2[2][2] = vec3dArray[6];
        vec3dArray2[2][3] = vec3dArray[7];
        vec3dArray2[3][0] = vec3dArray[0];
        vec3dArray2[3][1] = vec3dArray[4];
        vec3dArray2[3][2] = vec3dArray[7];
        vec3dArray2[3][3] = vec3dArray[3];
        vec3dArray2[4][0] = vec3dArray[0];
        vec3dArray2[4][1] = vec3dArray[1];
        vec3dArray2[4][2] = vec3dArray[2];
        vec3dArray2[4][3] = vec3dArray[3];
        vec3dArray2[5][0] = vec3dArray[4];
        vec3dArray2[5][1] = vec3dArray[5];
        vec3dArray2[5][2] = vec3dArray[9];
        vec3dArray2[5][3] = vec3dArray[8];
        vec3dArray2[6][0] = vec3dArray[9];
        vec3dArray2[6][1] = vec3dArray[10];
        vec3dArray2[6][2] = vec3dArray[6];
        vec3dArray2[6][3] = vec3dArray[5];
        vec3dArray2[7][0] = vec3dArray[10];
        vec3dArray2[7][1] = vec3dArray[11];
        vec3dArray2[7][2] = vec3dArray[7];
        vec3dArray2[7][3] = vec3dArray[6];
        vec3dArray2[8][0] = vec3dArray[4];
        vec3dArray2[8][1] = vec3dArray[7];
        vec3dArray2[8][2] = vec3dArray[11];
        vec3dArray2[8][3] = vec3dArray[8];
        vec3dArray2[9][0] = vec3dArray[8];
        vec3dArray2[9][1] = vec3dArray[9];
        vec3dArray2[9][2] = vec3dArray[10];
        vec3dArray2[9][3] = vec3dArray[11];
        return vec3dArray2;
    }

    public static void a(BufferBuilder bufferBuilder, Vec3d[][] vec3dArray, gv gv2) {
        Vec3d[][] vec3dArray2 = vec3dArray;
        int n = vec3dArray2.length;
        for (int i = 0; i < n; ++i) {
            Vec3d[] vec3dArray3;
            for (Vec3d vec3d : vec3dArray3 = vec3dArray2[i]) {
                bufferBuilder.func_181662_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c).func_187315_a(0.0, 0.0).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
            }
        }
    }

    public static void a(Minecraft minecraft, em em2, float f) {
        EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
        if (entityPlayerSP == null) {
            return;
        }
        GlStateManager.func_179137_b((double)0.0, (double)0.01, (double)0.0);
        Entity entity = ((d_)minecraft.func_175598_ae().func_78713_a((Entity)em2)).c(em2);
        Vec3d vec3d = em2.Q() ? em2.o() : b6.a(new Vec3d(entity.field_70142_S, entity.field_70137_T, entity.field_70136_U), entity.func_174791_d(), (double)f);
        Vec3d vec3d2 = b6.a(new Vec3d(entityPlayerSP.field_70142_S, entityPlayerSP.field_70137_T, entityPlayerSP.field_70136_U), entityPlayerSP.func_174791_d(), (double)f);
        Vec3d vec3d3 = vec3d.func_178788_d(vec3d2);
        vec3d3 = em2.a(vec3d3, f);
        GlStateManager.func_179137_b((double)vec3d3.field_72450_a, (double)vec3d3.field_72448_b, (double)vec3d3.field_72449_c);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
