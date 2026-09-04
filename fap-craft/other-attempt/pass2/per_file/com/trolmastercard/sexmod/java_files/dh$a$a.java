/*
 * Decompiled with CFR 0.152.
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fp;

static class dh.a.a {
    static final /* synthetic */ int[] a;

    static {
        a = new int[fp.values().length];
        try {
            dh.a.a.a[fp.CONTROLLED_FLIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dh.a.a.a[fp.BOOST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
