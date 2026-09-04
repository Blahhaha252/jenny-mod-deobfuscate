/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemFishingRod
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.item.ItemTool
 *  net.minecraftforge.items.IItemHandler
 *  net.minecraftforge.items.SlotItemHandler
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fe;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class fe
extends SlotItemHandler {
    b.b a;

    public fe(b.b b2, IItemHandler iItemHandler, int n, int n2, int n3) {
        super(iItemHandler, n, n2, n3);
        this.a = b2;
    }

    public static boolean a(ItemStack itemStack, int n) {
        return fe.a(itemStack, b.b.a(n));
    }

    public boolean func_75214_a(ItemStack itemStack) {
        return fe.a(itemStack, this.a);
    }

    static boolean a(ItemStack itemStack, b.b b2) {
        Item item = itemStack.func_77973_b();
        switch (b2) {
            case WEAPON: {
                return item instanceof ItemSword || item instanceof ItemTool;
            }
            case BOW: {
                return item instanceof ItemBow;
            }
            case HELMET: {
                return item instanceof ItemArmor && ((ItemArmor)item).field_77881_a == EntityEquipmentSlot.HEAD;
            }
            case CHEST_PLATE: {
                return item instanceof ItemArmor && ((ItemArmor)item).field_77881_a == EntityEquipmentSlot.CHEST;
            }
            case PANTS: {
                return item instanceof ItemArmor && ((ItemArmor)item).field_77881_a == EntityEquipmentSlot.LEGS;
            }
            case SHOES: {
                return item instanceof ItemArmor && ((ItemArmor)item).field_77881_a == EntityEquipmentSlot.FEET;
            }
            case ROD: {
                return item instanceof ItemFishingRod;
            }
        }
        return false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
