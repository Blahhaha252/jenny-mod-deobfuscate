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

public static class ap.a {
    @SubscribeEvent
    public void a(PlayerEvent.PlayerLoggedOutEvent playerLoggedOutEvent) {
        playerLoggedOutEvent.player.getEntityData().func_74757_a(ap.e, false);
    }

    /*
     * Loose catch block
     */
    @SubscribeEvent
    public void a(PlayerInteractEvent.RightClickItem rightClickItem) {
        em em22222;
        EntityPlayer entityPlayer;
        block28: {
            ItemStack itemStack;
            block27: {
                entityPlayer = rightClickItem.getEntityPlayer();
                EnumHand enumHand = rightClickItem.getHand();
                itemStack = entityPlayer.func_184586_b(enumHand);
                try {
                    if (ei.e(entityPlayer)) {
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw ap.a.a(concurrentModificationException);
                }
                if (!entityPlayer.field_70170_p.field_72995_K) break block27;
                try {
                    block29: {
                        if (d3.b()) break block27;
                        break block29;
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw ap.a.a(concurrentModificationException);
                        }
                    }
                    return;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw ap.a.a(concurrentModificationException);
                }
            }
            if (!entityPlayer.field_70170_p.field_72995_K) {
                try {
                    for (em em22222 : em.ad()) {
                        try {
                            if (em22222.field_70128_L) {
                                continue;
                            }
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw ap.a.a(concurrentModificationException);
                        }
                        try {
                            if (!(em22222 instanceof ev)) {
                                continue;
                            }
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw ap.a.a(concurrentModificationException);
                        }
                        ev ev2 = (ev)em22222;
                        ItemStack itemStack2 = (ItemStack)ev2.func_184212_Q().func_187225_a(ev.N);
                        if (!itemStack.equals(itemStack2)) continue;
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    // empty catch block
                }
            }
            try {
                if (itemStack.func_77973_b() != b) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw ap.a.a(concurrentModificationException);
            }
            NBTTagCompound nBTTagCompound = itemStack.func_77978_p();
            try {
                try {
                    if (nBTTagCompound == null || nBTTagCompound.func_74762_e(ap.j) < 3) break block28;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw ap.a.a(concurrentModificationException);
                }
                return;
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw ap.a.a(concurrentModificationException);
            }
        }
        em22222 = entityPlayer.getEntityData();
        boolean bl = em22222.func_74767_n(ap.e);
        try {
            if (bl) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw ap.a.a(concurrentModificationException);
        }
        em22222.func_74757_a(ap.e, true);
        em22222.func_74768_a(ap.d, 0);
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
