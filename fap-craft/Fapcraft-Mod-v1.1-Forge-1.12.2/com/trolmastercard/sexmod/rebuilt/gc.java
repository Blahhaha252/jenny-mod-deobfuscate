/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package com.trolmastercard.sexmod;

import net.minecraft.util.math.Vec3d;

public class gc {
    
    public static double a(Vec3d vec, Vec3d vec2) {
        double x = vec2.x - vec.x;
        double y = vec2.y - vec.y;
        double z = vec2.z - vec.z;
        return Math.atan2(z, Math.sqrt(x * x + y * y));
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

}
