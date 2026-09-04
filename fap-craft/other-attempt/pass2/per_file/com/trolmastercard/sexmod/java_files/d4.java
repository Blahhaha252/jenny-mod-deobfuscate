/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraftforge.items.CapabilityItemHandler
 *  net.minecraftforge.items.IItemHandler
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fe;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class d4
extends Container {
    em b;
    public Slot[] d;
    public UUID a;
    public static List<d4> c = new ArrayList<d4>();

    public d4(em em2, InventoryPlayer inventoryPlayer, UUID uUID) {
        this.a = uUID;
        c.add(this);
        if (em2.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH)) {
            int n;
            IItemHandler iItemHandler = (IItemHandler)em2.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
            this.b = em2;
            this.d = new Slot[]{new fe(fe.b$b.WEAPON, iItemHandler, fe.b$b.WEAPON.id, 31, 60), new fe(fe.b$b.BOW, iItemHandler, fe.b$b.BOW.id, 50, 60), new fe(fe.b$b.HELMET, iItemHandler, fe.b$b.HELMET.id, 72, 60), new fe(fe.b$b.CHEST_PLATE, iItemHandler, fe.b$b.CHEST_PLATE.id, 91, 60), new fe(fe.b$b.PANTS, iItemHandler, fe.b$b.PANTS.id, 110, 60), new fe(fe.b$b.SHOES, iItemHandler, fe.b$b.SHOES.id, 129, 60)};
            ArrayList<Slot> arrayList = new ArrayList<Slot>();
            for (n = 0; n < 3; ++n) {
                for (int i = 0; i < 9; ++i) {
                    arrayList.add(new Slot((IInventory)inventoryPlayer, i + n * 9 + 9, 8 + i * 18, 84 + n * 18));
                }
            }
            for (n = 0; n < 9; ++n) {
                arrayList.add(new Slot((IInventory)inventoryPlayer, n, 8 + n * 18, 142));
            }
            for (Slot slot : this.d) {
                this.func_75146_a(slot);
            }
            for (Slot slot : arrayList) {
                this.func_75146_a(slot);
            }
        }
    }

    public ItemStack func_82846_b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = ItemStack.field_190927_a;
        Slot slot = (Slot)this.field_75151_b.get(n);
        if (slot != null && slot.func_75216_d()) {
            ItemStack itemStack2 = slot.func_75211_c();
            itemStack = itemStack2.func_77946_l();
            int n2 = this.field_75151_b.size() - entityPlayer.field_71071_by.field_70462_a.size();
            if (n < n2 ? !this.func_75135_a(itemStack2, n2, this.field_75151_b.size(), true) : !this.func_75135_a(itemStack2, 0, n2, false)) {
                return ItemStack.field_190927_a;
            }
            if (itemStack2.func_190916_E() == 0) {
                slot.func_75215_d(ItemStack.field_190927_a);
            } else {
                slot.func_75218_e();
            }
            slot.func_190901_a(entityPlayer, itemStack2);
        }
        return itemStack;
    }

    public void func_75141_a(int n, ItemStack itemStack) {
        super.func_75141_a(n, itemStack);
    }

    public boolean func_75145_c(EntityPlayer entityPlayer) {
        return true;
    }

    public void func_75134_a(EntityPlayer entityPlayer) {
        super.func_75134_a(entityPlayer);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
