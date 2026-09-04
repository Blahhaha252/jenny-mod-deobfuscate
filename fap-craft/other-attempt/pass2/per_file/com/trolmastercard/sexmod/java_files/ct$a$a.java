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

public static class ct.a.a
implements IMessageHandler<ct, IMessage> {
    public IMessage a(ct ct2, MessageContext messageContext) {
        if (!ct2.c || !messageContext.side.equals((Object)Side.SERVER)) {
            System.out.println("received an invalid message @UpdateVelocity :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            block1: {
                em em2 = em.a(ct2.a);
                if (!(em2 instanceof f_)) {
                    return;
                }
                f_ f_2 = (f_)em2;
                if (!messageContext.getServerHandler().field_147369_b.equals((Object)f_2.ab())) break block1;
                f_2.d(ct2.b);
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
