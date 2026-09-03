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

import com.trolmastercard.sexmod.bv;
import com.trolmastercard.sexmod.c4;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class bv.a
implements IMessageHandler<bv, IMessage> {
    public IMessage a(bv bv2, MessageContext messageContext) {
        block8: {
            block7: {
                block6: {
                    try {
                        try {
                            if (bv2.b && messageContext.side.equals((Object)Side.CLIENT)) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw bv.a.a(runtimeException);
                        }
                        System.out.println("received an invalid message @SpawnEnergyBallParticles :(");
                        return null;
                    }
                    catch (RuntimeException runtimeException) {
                        throw bv.a.a(runtimeException);
                    }
                }
                try {
                    if (!bv2.c) break block7;
                    c4.a(bv2.a);
                    break block8;
                }
                catch (RuntimeException runtimeException) {
                    throw bv.a.a(runtimeException);
                }
            }
            c4.c(bv2.a);
        }
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
