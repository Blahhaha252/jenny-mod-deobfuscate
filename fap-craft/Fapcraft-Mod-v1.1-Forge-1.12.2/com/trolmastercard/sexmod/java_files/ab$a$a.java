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

public static class ab.a.a
implements IMessageHandler<ab, IMessage> {
    public IMessage a(ab ab2, MessageContext messageContext) {
        if (!ab2.c || !messageContext.side.equals((Object)Side.CLIENT)) {
            System.out.println("received an invalid message @SpawnEnergyBallParticles :(");
            return null;
        }
        em em2 = em.b(ab2.a);
        if (!(em2 instanceof f_)) {
            System.out.println("doesnt exit");
            return null;
        }
        cc.a(ab2.b, (f_)em2);
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
