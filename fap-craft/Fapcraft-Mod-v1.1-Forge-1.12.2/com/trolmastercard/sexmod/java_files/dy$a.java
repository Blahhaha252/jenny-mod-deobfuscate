/*
 * Decompiled with CFR 0.152.
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fp;

static class dy.a {
    static final /* synthetic */ int[] a;

    static {
        a = new int[fp.values().length];
        try {
            dy.a.a[fp.PICK_UP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dy.a.a[fp.CATCH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dy.a.a[fp.CATCH_BJ.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dy.a.a[fp.CATCH_BJ_IDLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dy.a.a[fp.START_THROWING.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
