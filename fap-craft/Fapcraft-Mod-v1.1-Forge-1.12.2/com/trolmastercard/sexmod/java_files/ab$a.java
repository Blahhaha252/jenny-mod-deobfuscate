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

import com.trolmastercard.sexmod.ab;
import com.trolmastercard.sexmod.cc;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class ab.a
implements IMessageHandler<ab, IMessage> {
    public IMessage a(ab ab2, MessageContext messageContext) {
        block7: {
            try {
                try {
                    if (ab2.c && messageContext.side.equals((Object)Side.CLIENT)) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw ab.a.a(runtimeException);
                }
                System.out.println("received an invalid message @SpawnEnergyBallParticles :(");
                return null;
            }
            catch (RuntimeException runtimeException) {
                throw ab.a.a(runtimeException);
            }
        }
        em em2 = em.b(ab2.a);
        try {
            if (!(em2 instanceof f_)) {
                System.out.println("doesnt exit");
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ab.a.a(runtimeException);
        }
        cc.a(ab2.b, (f_)em2);
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
