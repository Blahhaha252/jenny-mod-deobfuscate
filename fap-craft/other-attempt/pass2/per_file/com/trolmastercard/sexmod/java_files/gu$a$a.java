/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 */
package com.trolmastercard.sexmod;

import java.util.HashMap;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

static class gu.a.a {
    public static HashMap<String, Integer[]> a = new HashMap();

    gu.a.a() {
    }

    public static int a(EntityEquipmentSlot entityEquipmentSlot, ItemArmor.ArmorMaterial armorMaterial) {
        try {
            return a.get(entityEquipmentSlot.toString() + armorMaterial.toString())[0];
        }
        catch (NullPointerException nullPointerException) {
            return 3;
        }
    }

    public static int b(EntityEquipmentSlot entityEquipmentSlot, ItemArmor.ArmorMaterial armorMaterial) {
        try {
            return a.get(entityEquipmentSlot.toString() + armorMaterial.toString())[1];
        }
        catch (NullPointerException nullPointerException) {
            return 0;
        }
    }

    public static void a(EntityEquipmentSlot entityEquipmentSlot, ItemArmor.ArmorMaterial armorMaterial, int n, int n2) {
        a.put(entityEquipmentSlot.toString() + armorMaterial.toString(), new Integer[]{n, n2});
    }
}
