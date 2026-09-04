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
import net.minecraftforge.fml.relauncher.Side;

public static class g4.a.a
implements IMessageHandler<g4, IMessage> {
    public IMessage a(g4 g42, MessageContext messageContext) {
        if (!g42.e) {
            System.out.println("received an invalid message @SexPrompt :(");
            return null;
        }
        if (messageContext.side.equals((Object)Side.CLIENT)) {
            w.a.a(new w.a$a(g42.c, g42.b, g42.a, g42.d));
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            World world = messageContext.getServerHandler().field_147369_b.field_70170_p;
            EntityPlayer entityPlayer = world.func_152378_a(g42.a);
            EntityPlayer entityPlayer2 = world.func_152378_a(g42.b);
            if (entityPlayer == null) {
                System.out.println("Sex prompt invalid -> female player not found");
                return;
            }
            if (entityPlayer2 == null) {
                System.out.println("Sex prompt invalid -> male player not found");
                return;
            }
            ge.b.sendTo((IMessage)new g4(g42.c, g42.b, g42.a, g42.d), (EntityPlayerMP)(g42.d ? entityPlayer : entityPlayer2));
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
