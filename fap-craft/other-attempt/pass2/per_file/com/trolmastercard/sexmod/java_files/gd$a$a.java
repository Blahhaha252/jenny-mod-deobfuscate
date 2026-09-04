/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.gd;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class gd.a.a
implements IMessageHandler<gd, IMessage> {
    public IMessage a(gd gd2, MessageContext messageContext) {
        if (!gd2.d || !messageContext.side.equals((Object)Side.CLIENT)) {
            System.out.println("received an invalid message @ForcePlayerGirlUpdate :(");
            return null;
        }
        ei ei2 = ei.d(gd2.c);
        if (ei2 == null) {
            return null;
        }
        ei2.func_184212_Q().func_187227_b(em.J, (Object)gd2.a.toString());
        ei2.func_184212_Q().func_187227_b(em.D, (Object)gd2.b);
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
