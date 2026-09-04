/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemStack
 */
package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class bx
extends Container {
    private final IInventory a;
    private final int d;
    public static List<bx> b = new ArrayList<bx>();
    public UUID c;

    public bx(IInventory iInventory, IInventory iInventory2, EntityPlayer entityPlayer, UUID uUID) {
        int n;
        int n2;
        this.c = uUID;
        b.add(this);
        this.a = iInventory2;
        iInventory2.func_174889_b(entityPlayer);
        this.d = 3;
        int n3 = -18;
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.func_75146_a(new Slot(iInventory2, n + n2 * 9, 8 + n * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.func_75146_a(new Slot(iInventory, n + n2 * 9 + 9, 8 + n * 18, 103 + n2 * 18 + n3));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.func_75146_a(new Slot(iInventory, n2, 8 + n2 * 18, 161 + n3));
        }
    }

    public boolean func_75145_c(EntityPlayer entityPlayer) {
        return this.a.func_70300_a(entityPlayer);
    }

    public ItemStack func_82846_b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = ItemStack.field_190927_a;
        Slot slot = (Slot)this.field_75151_b.get(n);
        if (slot != null && slot.func_75216_d()) {
            ItemStack itemStack2 = slot.func_75211_c();
            itemStack = itemStack2.func_77946_l();
            if (n < this.d * 9 ? !this.func_75135_a(itemStack2, this.d * 9, this.field_75151_b.size(), true) : !this.func_75135_a(itemStack2, 0, this.d * 9, false)) {
                return ItemStack.field_190927_a;
            }
            if (itemStack2.func_190926_b()) {
                slot.func_75215_d(ItemStack.field_190927_a);
            } else {
                slot.func_75218_e();
            }
        }
        return itemStack;
    }

    public void func_75134_a(EntityPlayer entityPlayer) {
        super.func_75134_a(entityPlayer);
        this.a.func_174886_c(entityPlayer);
    }

    public IInventory a() {
        return this.a;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
