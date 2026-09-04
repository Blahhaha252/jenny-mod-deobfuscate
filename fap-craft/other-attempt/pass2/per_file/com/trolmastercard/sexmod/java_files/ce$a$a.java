/*
 * Decompiled with CFR 0.152.
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.f7;

private static class ce.a.a {
    private f7 c;
    private f7 g;
    private f7 h;
    private f7 b;
    private float f = 1.0f;
    private float a = 1.0f;
    private float e = 0.0f;
    private float d = 0.0f;

    private ce.a.a() {
    }

    static ce.a.a a(ce.a.a a2, ce.a.a a3, float f) {
        ce.a.a a4 = new ce.a.a();
        a4.c = b6.a(a2.c, a3.c, (double)f);
        a4.g = b6.a(a2.g, a3.g, (double)f);
        a4.h = b6.a(a2.h, a3.h, (double)f);
        a4.b = b6.a(a2.b, a3.b, (double)f);
        a4.f = b6.a(a2.f, a3.f, f);
        a4.a = b6.a(a2.a, a3.a, f);
        a4.e = b6.a(a2.e, a3.e, f);
        a4.d = b6.a(a2.d, a3.d, f);
        return a4;
    }

    static /* synthetic */ f7 access$000(ce.a.a a2) {
        return a2.c;
    }

    static /* synthetic */ f7 access$100(ce.a.a a2) {
        return a2.g;
    }

    static /* synthetic */ f7 access$200(ce.a.a a2) {
        return a2.b;
    }

    static /* synthetic */ f7 access$300(ce.a.a a2) {
        return a2.h;
    }

    static /* synthetic */ float access$400(ce.a.a a2) {
        return a2.a;
    }

    static /* synthetic */ float access$500(ce.a.a a2) {
        return a2.f;
    }

    static /* synthetic */ float access$600(ce.a.a a2) {
        return a2.d;
    }

    static /* synthetic */ float access$700(ce.a.a a2) {
        return a2.e;
    }

    static /* synthetic */ f7 access$202(ce.a.a a2, f7 f72) {
        a2.b = f72;
        return a2.b;
    }

    static /* synthetic */ f7 access$302(ce.a.a a2, f7 f72) {
        a2.h = f72;
        return a2.h;
    }

    static /* synthetic */ f7 access$002(ce.a.a a2, f7 f72) {
        a2.c = f72;
        return a2.c;
    }

    static /* synthetic */ f7 access$102(ce.a.a a2, f7 f72) {
        a2.g = f72;
        return a2.g;
    }

    static /* synthetic */ float access$402(ce.a.a a2, float f) {
        a2.a = f;
        return a2.a;
    }

    static /* synthetic */ float access$702(ce.a.a a2, float f) {
        a2.e = f;
        return a2.e;
    }

    static /* synthetic */ float access$502(ce.a.a a2, float f) {
        a2.f = f;
        return a2.f;
    }

    static /* synthetic */ float access$602(ce.a.a a2, float f) {
        a2.d = f;
        return a2.d;
    }
}
