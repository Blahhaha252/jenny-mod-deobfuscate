/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.g4;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.w;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public static class g4.a
implements IMessageHandler<g4, IMessage> {
    public IMessage a(g4 g42, MessageContext messageContext) {
        try {
            if (!g42.e) {
                System.out.println("received an invalid message @SexPrompt :(");
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw g4.a.a(runtimeException);
        }
        try {
            if (messageContext.side.equals((Object)Side.CLIENT)) {
                w.a.a(new w.a(g42.c, g42.b, g42.a, g42.d));
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw g4.a.a(runtimeException);
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            EntityPlayer entityPlayer;
            g4 g43;
            SimpleNetworkWrapper simpleNetworkWrapper;
            World world = messageContext.getServerHandler().field_147369_b.field_70170_p;
            EntityPlayer entityPlayer2 = world.func_152378_a(g42.a);
            EntityPlayer entityPlayer3 = world.func_152378_a(g42.b);
            try {
                if (entityPlayer2 == null) {
                    System.out.println("Sex prompt invalid -> female player not found");
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw g4.a.a(runtimeException);
            }
            try {
                if (entityPlayer3 == null) {
                    System.out.println("Sex prompt invalid -> male player not found");
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw g4.a.a(runtimeException);
            }
            try {
                simpleNetworkWrapper = ge.b;
                g43 = new g4(g42.c, g42.b, g42.a, g42.d);
                entityPlayer = g42.d ? entityPlayer2 : entityPlayer3;
            }
            catch (RuntimeException runtimeException) {
                throw g4.a.a(runtimeException);
            }
            simpleNetworkWrapper.sendTo((IMessage)g43, (EntityPlayerMP)entityPlayer);
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
