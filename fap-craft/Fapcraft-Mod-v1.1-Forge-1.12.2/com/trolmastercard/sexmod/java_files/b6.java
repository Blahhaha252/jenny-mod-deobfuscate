/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.gv;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

public class b6 {
    public static Vec3d a(Vec3d vec3d, Vec3d vec3d2, int n) {
        try {
            if (n == 0) {
                return vec3d2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw b6.a(runtimeException);
        }
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
        return vec3d.func_72441_c(vec3d3.field_72450_a / (double)n, vec3d3.field_72448_b / (double)n, vec3d3.field_72449_c / (double)n);
    }

    public static double b(double d, double d2, double d3) {
        return d + (d2 - d) * d3;
    }

    public static float a(float f, float f2, float f3) {
        return f + (f2 - f) * f3;
    }

    public static float a(float f, float f2, double d) {
        float f3 = f2 - f;
        while ((double)f3 < -Math.PI) {
            f3 = (float)((double)f3 + Math.PI * 2);
        }
        while ((double)f3 >= Math.PI) {
            f3 = (float)((double)f3 - Math.PI * 2);
        }
        return (float)((double)f + (double)f3 * d);
    }

    public static float b(float f, float f2, double d) {
        double d2 = Math.toRadians(f);
        double d3 = Math.toRadians(f2);
        return (float)Math.toDegrees(b6.a((float)d2, (float)d3, d));
    }

    public static Vec3d a(Vec3d vec3d, Vec3d vec3d2, double d) {
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
        return vec3d.func_178787_e(new Vec3d(vec3d3.field_72450_a * d, vec3d3.field_72448_b * d, vec3d3.field_72449_c * d));
    }

    public static f7 a(f7 f72, f7 f73, double d) {
        f7 f74 = f73.b(f72);
        return f72.a(f74.a((float)d));
    }

    public static Vec3i a(Vec3i vec3i, Vec3i vec3i2, double d) {
        Vec3d vec3d = new Vec3d((double)(vec3i2.func_177958_n() - vec3i.func_177958_n()), (double)(vec3i2.func_177956_o() - vec3i.func_177956_o()), (double)(vec3i2.func_177952_p() - vec3i.func_177952_p()));
        return new Vec3i((double)vec3i.func_177958_n() + vec3d.field_72450_a * d, (double)vec3i.func_177956_o() + vec3d.field_72448_b * d, (double)vec3i.func_177952_p() + vec3d.field_72449_c * d);
    }

    public static gv a(gv gv2, gv gv3, double d) {
        gv gv4 = new gv(gv3.a - gv2.a, gv3.d - gv2.d, gv3.c - gv2.c, gv3.b - gv2.b);
        return new gv((int)((double)gv2.a + (double)gv4.a * d), (int)((double)gv2.d + (double)gv4.d * d), (int)((double)gv2.c + (double)gv4.c * d), (int)((double)gv2.b + (double)gv4.b * d));
    }

    public static double e(double d) {
        return 1.0 - Math.pow(1.0 - d, 4.0);
    }

    public static double g(double d) {
        return 1.0 - Math.pow(1.0 - d, 3.0);
    }

    public static double c(double d) {
        double d2 = 1.70158;
        double d3 = d2 + 1.0;
        return 1.0 + d3 * Math.pow(d - 1.0, 3.0) + d2 * Math.pow(d - 1.0, 2.0);
    }

    public static double d(double d) {
        double d2 = 1.70158;
        double d3 = d2 + 1.0;
        return d3 * d * d * d - d2 * d * d;
    }

    public static double b(double d) {
        return Math.sin(d * Math.PI / 2.0);
    }

    public static double a(double d) {
        return d * d * d;
    }

    public static double h(double d) {
        return -(Math.cos(Math.PI * d) - 1.0) / 2.0;
    }

    public static double f(double d) {
        return 1.0 - Math.cos(Math.PI * d / 2.0);
    }

    public static double a(double d, double d2, double d3) {
        double d4 = (1.0 - Math.cos(d3 * Math.PI)) / 2.0;
        return d * (1.0 - d4) + d2 * d4;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
