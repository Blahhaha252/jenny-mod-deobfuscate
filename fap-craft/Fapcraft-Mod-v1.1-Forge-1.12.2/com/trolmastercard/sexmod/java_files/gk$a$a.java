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

import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.gk;
import java.util.ArrayList;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class gk.a.a
implements IMessageHandler<gk, IMessage> {
    public IMessage a(gk gk2, MessageContext messageContext) {
        if (!gk2.a || !messageContext.side.equals((Object)Side.SERVER)) {
            System.out.println("received an invalid message @CatEatingDone :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(gk2.b);
            for (em em2 : arrayList) {
                if (em2.field_70170_p.field_72995_K || !(em2 instanceof eb)) continue;
                eb eb2 = (eb)em2;
                eb2.h();
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
