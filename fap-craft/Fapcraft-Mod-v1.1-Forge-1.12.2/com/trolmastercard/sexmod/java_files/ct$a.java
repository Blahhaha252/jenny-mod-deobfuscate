/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ct;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class ct.a
implements IMessageHandler<ct, IMessage> {
    public IMessage a(ct ct2, MessageContext messageContext) {
        block4: {
            try {
                try {
                    if (ct2.c && messageContext.side.equals((Object)Side.SERVER)) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw ct.a.a(runtimeException);
                }
                System.out.println("received an invalid message @UpdateVelocity :(");
                return null;
            }
            catch (RuntimeException runtimeException) {
                throw ct.a.a(runtimeException);
            }
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            em em2 = em.a(ct2.a);
            try {
                if (!(em2 instanceof f_)) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ct.a.a(runtimeException);
            }
            f_ f_2 = (f_)em2;
            try {
                if (messageContext.getServerHandler().field_147369_b.equals((Object)f_2.ab())) {
                    f_2.d(ct2.b);
                }
            }
            catch (RuntimeException runtimeException) {
                throw ct.a.a(runtimeException);
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
