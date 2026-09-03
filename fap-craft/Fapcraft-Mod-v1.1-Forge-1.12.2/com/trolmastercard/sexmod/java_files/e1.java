/*
 * Decompiled with CFR 0.152.
 */
package com.trolmastercard.sexmod;

public class e1 {
    public static final e1 a = new e1(0, 0);
    public int c;
    public int b;

    public e1(int n, int n2) {
        this.c = n;
        this.b = n2;
    }

    public float a(int n, int n2) {
        float f = n - this.c;
        float f2 = n2 - this.b;
        return (float)Math.sqrt(f * f + f2 * f2);
    }

    public String toString() {
        return String.format("(%s, %s)", this.c, this.b);
    }
}
