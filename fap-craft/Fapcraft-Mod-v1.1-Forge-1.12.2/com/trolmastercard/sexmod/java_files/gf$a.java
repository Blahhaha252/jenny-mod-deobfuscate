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

import com.trolmastercard.sexmod.gf;
import com.trolmastercard.sexmod.v;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class gf.a
implements IMessageHandler<gf, IMessage> {
    public IMessage a(gf gf2, MessageContext messageContext) {
        block4: {
            try {
                try {
                    if (gf2.a && messageContext.side.equals((Object)Side.CLIENT)) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw gf.a.a(runtimeException);
                }
                System.out.println("received an invalid message @InformOfOwnership :(");
                return null;
            }
            catch (RuntimeException runtimeException) {
                throw gf.a.a(runtimeException);
            }
        }
        v.f = gf2.b;
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
