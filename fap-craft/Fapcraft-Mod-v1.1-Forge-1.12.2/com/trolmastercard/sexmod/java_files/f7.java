/*
 * Decompiled with CFR 0.152.
 */
package com.trolmastercard.sexmod;

public class f7 {
    public static final f7 d = new f7(0.0f, 0.0f, 0.0f);
    public float a;
    public float c;
    public float b;

    public f7(float f, float f2, float f3) {
        this.a = f;
        this.c = f2;
        this.b = f3;
    }

    public f7 b(f7 f72) {
        return new f7(this.a - f72.a, this.c - f72.c, this.b - f72.b);
    }

    public f7 a(f7 f72) {
        return new f7(this.a + f72.a, this.c + f72.c, this.b + f72.b);
    }

    public f7 a(float f) {
        return new f7(this.a * f, this.c * f, this.b * f);
    }
}
