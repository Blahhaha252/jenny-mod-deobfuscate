/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.EnumHand
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickItem
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedOutEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ap;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ev;
import java.util.ConcurrentModificationException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public static class ap.a.a {
    @SubscribeEvent
    public void a(PlayerEvent.PlayerLoggedOutEvent playerLoggedOutEvent) {
        playerLoggedOutEvent.player.getEntityData().func_74757_a("sexmodAllieInUse", false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SubscribeEvent
    public void a(PlayerInteractEvent.RightClickItem rightClickItem) {
        em em22;
        EntityPlayer entityPlayer = rightClickItem.getEntityPlayer();
        EnumHand enumHand = rightClickItem.getHand();
        ItemStack itemStack = entityPlayer.func_184586_b(enumHand);
        if (ei.e(entityPlayer)) {
            return;
        }
        if (entityPlayer.field_70170_p.field_72995_K && !d3.b()) {
            return;
        }
        if (!entityPlayer.field_70170_p.field_72995_K) {
            try {
                for (em em22 : em.ad()) {
                    ev ev2;
                    ItemStack itemStack2;
                    if (em22.field_70128_L || !(em22 instanceof ev) || !itemStack.equals(itemStack2 = (ItemStack)(ev2 = (ev)em22).func_184212_Q().func_187225_a(ev.N))) continue;
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                // empty catch block
            }
        }
        if (itemStack.func_77973_b() != ap.b) {
            return;
        }
        NBTTagCompound nBTTagCompound = itemStack.func_77978_p();
        if (nBTTagCompound != null && nBTTagCompound.func_74762_e("sexmodUses") >= 3) {
            return;
        }
        em22 = entityPlayer.getEntityData();
        boolean bl = em22.func_74767_n("sexmodAllieInUse");
        if (bl) {
            return;
        }
        em22.func_74757_a("sexmodAllieInUse", true);
        em22.func_74768_a("sexmodAllieInUseTicks", 0);
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
