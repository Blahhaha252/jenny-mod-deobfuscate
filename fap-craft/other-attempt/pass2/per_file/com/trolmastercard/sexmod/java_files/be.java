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
    public static float a(double d, double d2) {
        double d3;
        d = (d + Math.PI * 2) % (Math.PI * 2);
        d2 = (d2 + Math.PI * 2) % (Math.PI * 2);
        for (d3 = d2 - d; d3 < -Math.PI; d3 += Math.PI * 2) {
        }
        while (d3 >= Math.PI) {
            d3 -= Math.PI * 2;
        }
        return (float)d3;
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

    public static boolean a(double d, double d2, double d3) {
        if (d < d2) {
            return false;
        }
        return !(d >= d3);
    }

    public static int a(int n) {
        int n2;
        if (n <= 0) {
            return n;
        }
        Random random = new Random();
        int n3 = 0;
        for (n2 = 0; n2 <= n; ++n2) {
            n3 += n2;
        }
        n2 = random.nextInt(n3) + 1;
        int n4 = 0;
        for (int i = 0; i <= n; ++i) {
            if ((n4 += i) < n2) continue;
            return i;
        }
        return n;
    }

    public static int a() {
        return r.f.nextBoolean() ? 1 : -1;
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static double b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float a(float f, boolean bl) {
        Random random = new Random();
        return random.nextFloat() * f * (float)(bl && random.nextBoolean() ? -1 : 1);
    }

    public static float a(float f, float f2, float f3) {
        if (Math.abs(f - f2) <= f3) {
            return f;
        }
        if (Math.abs(f) < Math.abs(f2)) {
            if (f2 > 0.0f) {
                return f2 - f3;
            }
            return f2 + f3;
        }
        if (f > 0.0f) {
            return f - f3;
        }
        return f + f3;
    }

    public static int a(double d) {
        return Math.round((float)d);
    }

    public static void a(int n, Runnable runnable) {
        String string = UUID.randomUUID().toString();
        new Thread(() -> {
            try {
                Thread.sleep(n);
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
