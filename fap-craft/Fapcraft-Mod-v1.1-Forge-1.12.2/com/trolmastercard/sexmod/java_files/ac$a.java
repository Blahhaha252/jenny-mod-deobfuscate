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

import com.trolmastercard.sexmod.ac;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fg;
import java.util.ArrayList;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class ac.a
implements IMessageHandler<ac, IMessage> {
    public IMessage a(ac ac2, MessageContext messageContext) {
        try {
            if (!ac2.a) {
                System.out.println("received an invalid message @SendGirlToSex :(");
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ac.a.a(runtimeException);
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(ac2.b);
            for (em em2 : arrayList) {
                try {
                    if (em2.field_70170_p.field_72995_K) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ac.a.a(runtimeException);
                }
                try {
                    if (!(em2 instanceof fg)) continue;
                    ((fg)((Object)em2)).a();
                }
                catch (RuntimeException runtimeException) {
                    throw ac.a.a(runtimeException);
                }
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
