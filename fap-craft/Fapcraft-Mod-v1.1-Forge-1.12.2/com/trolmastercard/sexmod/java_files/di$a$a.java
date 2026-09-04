/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.EnumAction
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fp;
import net.minecraft.item.EnumAction;

static class di.a.a {
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] a;

    static {
        a = new int[EnumAction.values().length];
        try {
            di.a.a.a[EnumAction.BLOCK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            di.a.a.a[EnumAction.BOW.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[fp.values().length];
        try {
            di.a.a.b[fp.FISHING_IDLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            di.a.a.b[fp.FISHING_START.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
