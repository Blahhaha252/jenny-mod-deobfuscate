/*
 * Decompiled with CFR 0.152.
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fp;

static class dp.a {
    static final /* synthetic */ int[] a;

    static {
        a = new int[fp.values().length];
        try {
            dp.a.a[fp.FISHING_IDLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dp.a.a[fp.FISHING_START.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
