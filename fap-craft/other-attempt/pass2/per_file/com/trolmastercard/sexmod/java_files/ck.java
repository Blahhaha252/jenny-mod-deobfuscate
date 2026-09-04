/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3f
 *  net.minecraft.util.math.Vec3d
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.gc;
import javax.vecmath.Vector3f;
import net.minecraft.util.math.Vec3d;

public class ck {
    public static Vec3d a(Vec3d vec3d, double d) {
        return new Vec3d(vec3d.field_72450_a * d, vec3d.field_72448_b * d, vec3d.field_72449_c * d);
    }

    public static double a(Vector3f vector3f, Vec3d vec3d) {
        return (double)vector3f.x * vec3d.field_72450_a + (double)vector3f.y * vec3d.field_72448_b + (double)vector3f.z * vec3d.field_72449_c;
    }

    public static double a(Vec3d vec3d, Vec3d vec3d2) {
        return vec3d.field_72450_a * vec3d2.field_72450_a + vec3d.field_72448_b * vec3d2.field_72448_b + vec3d.field_72449_c * vec3d2.field_72449_c;
    }

    public static Vec3d b(Vec3d vec3d, Vec3d vec3d2) {
        return new Vec3d(vec3d.field_72448_b * vec3d2.field_72449_c - vec3d.field_72449_c * vec3d2.field_72448_b, vec3d.field_72449_c * vec3d2.field_72450_a - vec3d.field_72450_a * vec3d2.field_72449_c, vec3d.field_72450_a * vec3d2.field_72448_b - vec3d.field_72448_b * vec3d2.field_72450_a);
    }

    public static Vec3d a(double d, double d2, double d3, float f) {
        return ck.a(new Vec3d(d, d2, d3), f);
    }

    public static Vec3d a(Vec3d vec3d, float f) {
        return ck.a(vec3d, 0.0f, f);
    }

    public static Vec3d a(Vec3d vec3d, float f, float f2) {
        Vec3d vec3d2 = new Vec3d(vec3d.field_72450_a, vec3d.field_72448_b * Math.cos((double)f * (Math.PI / 180)) - vec3d.field_72449_c * Math.sin((double)f * (Math.PI / 180)), vec3d.field_72448_b * Math.sin((double)f * (Math.PI / 180)) + vec3d.field_72449_c * Math.cos((double)f * (Math.PI / 180)));
        Vec3d vec3d3 = new Vec3d(-Math.sin((double)(f2 + 90.0f) * (Math.PI / 180)) * vec3d2.field_72450_a - Math.sin((double)f2 * (Math.PI / 180)) * vec3d2.field_72449_c, vec3d2.field_72448_b, Math.cos((double)(f2 + 90.0f) * (Math.PI / 180)) * vec3d2.field_72450_a + Math.cos((double)f2 * (Math.PI / 180)) * vec3d2.field_72449_c);
        return vec3d3;
    }

    public static Vec3d a(double d, double d2, double d3, float f, float f2) {
        return ck.a(new Vec3d(d, d2, d3), f, f2);
    }

    public static Vec3d a(Vec3d vec3d, float f, float f2, float f3) {
        f = gc.c(f);
        f2 = gc.c(f2);
        f3 = gc.c(f3);
        double d = (float)Math.sin(f);
        double d2 = (float)Math.cos(f);
        double d3 = (float)Math.sin(f2);
        double d4 = (float)Math.cos(f2);
        double d5 = (float)Math.sin(f3);
        double d6 = (float)Math.cos(f3);
        double d7 = vec3d.field_72448_b * d2 - vec3d.field_72449_c * d;
        double d8 = vec3d.field_72448_b * d + vec3d.field_72449_c * d2;
        vec3d = new Vec3d(vec3d.field_72450_a, d7, d8);
        double d9 = vec3d.field_72450_a * d4 + vec3d.field_72449_c * d3;
        d8 = -vec3d.field_72450_a * d3 + vec3d.field_72449_c * d4;
        vec3d = new Vec3d(d9, vec3d.field_72448_b, d8);
        d9 = vec3d.field_72450_a * d6 - vec3d.field_72448_b * d5;
        d7 = vec3d.field_72450_a * d5 + vec3d.field_72448_b * d6;
        return new Vec3d(d9, d7, vec3d.field_72449_c);
    }

    public static Vec3d c(Vec3d vec3d) {
        return new Vec3d(-vec3d.field_72450_a, vec3d.field_72448_b, -vec3d.field_72449_c);
    }

    public static Vec3d a(Vec3d vec3d) {
        return new Vec3d(-vec3d.field_72450_a, -vec3d.field_72448_b, vec3d.field_72449_c);
    }

    public static Vec3d b(Vec3d vec3d) {
        return new Vec3d(vec3d.field_72450_a, -vec3d.field_72448_b, -vec3d.field_72449_c);
    }

    static double a(double d, double d2, double d3) {
        return (d3 - d) / (d2 - d);
    }

    public static double a(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        return ck.a(vec3d.field_72450_a, vec3d2.field_72450_a, vec3d3.field_72450_a);
    }
}
