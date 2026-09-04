/*
 * Decompiled with CFR 0.152.
 */
package com.trolmastercard.sexmod;

public static enum fe.b.b {
    WEAPON(0),
    BOW(1),
    HELMET(2),
    CHEST_PLATE(3),
    PANTS(4),
    SHOES(5),
    ROD(6);

    public int id;

    public static fe.b.b a(int n) {
        switch (n) {
            case 0: {
                return WEAPON;
            }
            case 1: {
                return BOW;
            }
            case 2: {
                return HELMET;
            }
            case 3: {
                return CHEST_PLATE;
            }
            case 4: {
                return PANTS;
            }
            case 5: {
                return SHOES;
            }
            case 6: {
                return ROD;
            }
        }
        throw new NullPointerException("Girls don't have a slot nr. " + n);
    }

    private fe.b.b(int n2) {
        this.id = n2;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }
}
