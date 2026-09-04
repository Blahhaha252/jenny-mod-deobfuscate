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

import com.trolmastercard.sexmod.cd;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class cd.a.a
implements IMessageHandler<cd, IMessage> {
    public IMessage a(cd cd2, MessageContext messageContext) {
        if (!cd2.a || !messageContext.side.equals((Object)Side.SERVER)) {
            System.out.println("received an invalid Message @GalathBackOffRape :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            block0: {
                em em2 = em.a(messageContext.getServerHandler().field_147369_b.getPersistentID(), true);
                if (!(em2 instanceof f_)) break block0;
                ((f_)em2).w();
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
