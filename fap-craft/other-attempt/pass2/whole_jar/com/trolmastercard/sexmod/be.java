/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.bm;
import com.trolmastercard.sexmod.g0;
import com.trolmastercard.sexmod.r;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;

public class be {
    public static float a(double d10, double d11) {
        double d12;
        d10 = (d10 + Math.PI * 2) % (Math.PI * 2);
        d11 = (d11 + Math.PI * 2) % (Math.PI * 2);
        for (d12 = d11 - d10; d12 < -Math.PI; d12 += Math.PI * 2) {
        }
        while (d12 >= Math.PI) {
            d12 -= Math.PI * 2;
        }
        return (float)d12;
    }

    public static bm a(Vec3d vec3d, Vec3d vec3d2) {
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d).func_72432_b();
        return new bm((float)Math.atan2(vec3d3.field_72450_a, vec3d3.field_72449_c), (float)Math.atan2(vec3d3.field_72448_b, Math.sqrt(vec3d3.field_72450_a * vec3d3.field_72450_a + vec3d3.field_72449_c * vec3d3.field_72449_c)));
    }

    public static void a(String string) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(string);
        clipboard.setContents(stringSelection, null);
    }

    public static String b(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return Character.toUpperCase(string.charAt(0)) + string.substring(1).toLowerCase();
    }

    public static boolean a(double d10, double d11, double d12) {
        if (d10 < d11) {
            return false;
        }
        return !(d10 >= d12);
    }

    public static int a(int n2) {
        int n3;
        if (n2 <= 0) {
            return n2;
        }
        Random random = new Random();
        int n4 = 0;
        for (n3 = 0; n3 <= n2; ++n3) {
            n4 += n3;
        }
        n3 = random.nextInt(n4) + 1;
        int n5 = 0;
        for (int i2 = 0; i2 <= n2; ++i2) {
            if ((n5 += i2) < n3) continue;
            return i2;
        }
        return n2;
    }

    public static int a() {
        return r.f.nextBoolean() ? 1 : -1;
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static double b(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d12, d10));
    }

    public static float a(float f10, boolean bl2) {
        Random random = new Random();
        return random.nextFloat() * f10 * (float)(bl2 && random.nextBoolean() ? -1 : 1);
    }

    public static float a(float f10, float f11, float f12) {
        if (Math.abs(f10 - f11) <= f12) {
            return f10;
        }
        if (Math.abs(f10) < Math.abs(f11)) {
            if (f11 > 0.0f) {
                return f11 - f12;
            }
            return f11 + f12;
        }
        if (f10 > 0.0f) {
            return f10 - f12;
        }
        return f10 + f12;
    }

    public static int a(double d10) {
        return Math.round((float)d10);
    }

    public static void a(int n2, Runnable runnable) {
        String string = UUID.randomUUID().toString();
        new Thread(() -> {
            try {
                Thread.sleep(n2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            runnable.run();
        }, (g0.a() ? "server sexmod thread " : "client sexmod thread ") + string).start();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

