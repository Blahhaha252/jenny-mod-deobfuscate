/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.au;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.h6;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class au.a.a
implements IMessageHandler<au, IMessage> {
    public IMessage a(au au2, MessageContext messageContext) {
        if (!au2.a || !messageContext.side.equals((Object)Side.SERVER)) {
            System.out.println("received an invalid Message @CancelTask :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            UUID uUID = ax.a(messageContext.getServerHandler().field_147369_b.getPersistentID());
            if (uUID == null) {
                return;
            }
            HashSet<BlockPos> hashSet = ax.c(uUID, au2.b);
            if (hashSet.isEmpty()) {
                return;
            }
            ge.b.sendTo((IMessage)new h6(hashSet, false), messageContext.getServerHandler().field_147369_b);
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
