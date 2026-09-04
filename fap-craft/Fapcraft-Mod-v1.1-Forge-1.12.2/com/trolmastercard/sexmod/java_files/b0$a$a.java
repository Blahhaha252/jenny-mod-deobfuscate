/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.server.management.PlayerList
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b0;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ex;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.management.PlayerList;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class b0.a.a
implements IMessageHandler<b0, IMessage> {
    public IMessage a(b0 b02, MessageContext messageContext) {
        if (!b02.a || messageContext.side != Side.SERVER) {
            System.out.println("received an invalid message @SetPlayerForGirl :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(b02.c);
            for (em em2 : arrayList) {
                PlayerList playerList = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al();
                try {
                    playerList.func_177451_a(b02.b).func_70005_c_();
                }
                catch (NullPointerException nullPointerException) {
                    System.out.println("couldn't find player with UUID: " + b02.b);
                    System.out.println("could only find players with thsese UUID's:");
                    for (EntityPlayerMP entityPlayerMP : playerList.func_181057_v()) {
                        System.out.println(entityPlayerMP.func_70005_c_() + " " + entityPlayerMP.func_110124_au());
                    }
                    continue;
                }
                if (em2 instanceof ex) {
                    ((ex)em2).af = true;
                }
                em2.e(b02.b);
            }
        });
        return null;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }
}
