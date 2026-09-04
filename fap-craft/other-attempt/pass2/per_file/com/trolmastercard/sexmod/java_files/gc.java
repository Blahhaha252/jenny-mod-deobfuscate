/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package com.trolmastercard.sexmod;

import net.minecraft.util.math.Vec3d;

public class gc {
    public static double a(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d2.field_72450_a - vec3d.field_72450_a;
        double d2 = vec3d2.field_72448_b - vec3d.field_72448_b;
        double d3 = vec3d2.field_72449_c - vec3d.field_72449_c;
        return Math.atan2(d3, Math.sqrt(d * d + d2 * d2));
    }

    public static float b(float f) {
        if ((f %= 360.0f) < 0.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static float a(float f) {
        float f2;
        return f2 >= 0.0f ? f : (f %= 360.0f) + 360.0f;
    }

    public static double a(double d) {
        double d2;
        return d2 >= 0.0 ? d : (d %= 360.0) + 360.0;
    }

    public static float c(float f) {
        return (float)(Math.PI * 2 / (360.0 / (double)f));
    }

    public static float c(double d) {
        return (float)(Math.PI * 2 / (360.0 / d));
    }

    public static float d(float f) {
        return (float)(57.29577951308232 * (double)f);
    }

    public static double b(double d) {
        return 57.29577951308232 * d;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
