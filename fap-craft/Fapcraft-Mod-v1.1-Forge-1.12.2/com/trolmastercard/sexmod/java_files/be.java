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
        block4: {
            try {
                try {
                    if (string != null && !string.isEmpty()) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw be.a(runtimeException);
                }
                return string;
            }
            catch (RuntimeException runtimeException) {
                throw be.a(runtimeException);
            }
        }
        return Character.toUpperCase(string.charAt(0)) + string.substring(1).toLowerCase();
    }

    public static boolean a(double d, double d2, double d3) {
        try {
            if (d < d2) {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw be.a(runtimeException);
        }
        try {
            if (d >= d3) {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw be.a(runtimeException);
        }
        return true;
    }

    public static int a(int n) {
        int n2;
        try {
            if (n <= 0) {
                return n;
            }
        }
        catch (RuntimeException runtimeException) {
            throw be.a(runtimeException);
        }
        Random random = new Random();
        int n3 = 0;
        for (n2 = 0; n2 <= n; ++n2) {
            n3 += n2;
        }
        n2 = random.nextInt(n3) + 1;
        int n4 = 0;
        for (int i = 0; i <= n; ++i) {
            n4 += i;
            try {
                if (n4 < n2) continue;
                return i;
            }
            catch (RuntimeException runtimeException) {
                throw be.a(runtimeException);
            }
        }
        return n;
    }

    public static int a() {
        int n;
        try {
            n = r.f.nextBoolean() ? 1 : -1;
        }
        catch (RuntimeException runtimeException) {
            throw be.a(runtimeException);
        }
        return n;
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static double b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float a(float f, boolean bl) {
        int n;
        float f2;
        block5: {
            block4: {
                Random random = new Random();
                try {
                    try {
                        f2 = random.nextFloat() * f;
                        if (!bl || !random.nextBoolean()) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw be.a(runtimeException);
                    }
                    n = -1;
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw be.a(runtimeException);
                }
            }
            n = 1;
        }
        return f2 * (float)n;
    }

    public static float a(float f, float f2, float f3) {
        block10: {
            block11: {
                try {
                    if (Math.abs(f - f2) <= f3) {
                        return f;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw be.a(runtimeException);
                }
                try {
                    try {
                        if (!(Math.abs(f) < Math.abs(f2))) break block10;
                        if (!(f2 > 0.0f)) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw be.a(runtimeException);
                    }
                    return f2 - f3;
                }
                catch (RuntimeException runtimeException) {
                    throw be.a(runtimeException);
                }
            }
            return f2 + f3;
        }
        try {
            if (f > 0.0f) {
                return f - f3;
            }
        }
        catch (RuntimeException runtimeException) {
            throw be.a(runtimeException);
        }
        return f + f3;
    }

    public static int a(double d) {
        return Math.round((float)d);
    }

    public static void a(int n, Runnable runnable) {
        String string;
        StringBuilder stringBuilder;
        Runnable runnable2;
        Thread thread;
        Thread thread2;
        String string2 = UUID.randomUUID().toString();
        try {
            Thread thread3;
            thread2 = thread3;
            thread = thread3;
            runnable2 = () -> {
                try {
                    Thread.sleep(n);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                runnable.run();
            };
            stringBuilder = new StringBuilder();
            string = g0.a() ? "server sexmod thread " : "client sexmod thread ";
        }
        catch (RuntimeException runtimeException) {
            throw be.a(runtimeException);
        }
        thread2(runnable2, stringBuilder.append(string).append(string2).toString());
        thread.start();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
