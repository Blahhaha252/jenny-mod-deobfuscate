/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.t;
import java.util.UUID;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class t.a
implements IMessageHandler<t, IMessage> {
    public IMessage a(t t2, MessageContext messageContext) {
        block4: {
            try {
                try {
                    if (t2.c && messageContext.side == Side.SERVER) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw t.a.a(runtimeException);
                }
                System.out.println("recieved an unvalid message @RemoveItems :(");
                return null;
            }
            catch (RuntimeException runtimeException) {
                throw t.a.a(runtimeException);
            }
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            InventoryPlayer inventoryPlayer = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_177451_a((UUID)t2.a).field_71071_by;
            for (int i = 0; i < inventoryPlayer.func_70302_i_(); ++i) {
                ItemStack itemStack = inventoryPlayer.func_70301_a(i);
                try {
                    if (!itemStack.func_77973_b().equals(t2.b.func_77973_b())) continue;
                    itemStack.func_190918_g(t2.b.func_190916_E());
                    break;
                }
                catch (RuntimeException runtimeException) {
                    throw t.a.a(runtimeException);
                }
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
