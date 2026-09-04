/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ft;
import java.util.ArrayList;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class ft.a.a
implements IMessageHandler<ft, IMessage> {
    public IMessage a(ft ft2, MessageContext messageContext) {
        if (!ft2.a) {
            System.out.println("received an invalid message @UpdateEquipment :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(ft2.c);
            for (em em2 : arrayList) {
                if (!(em2 instanceof e2)) continue;
                ((e2)em2).Q.deserializeNBT(ft2.b);
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
