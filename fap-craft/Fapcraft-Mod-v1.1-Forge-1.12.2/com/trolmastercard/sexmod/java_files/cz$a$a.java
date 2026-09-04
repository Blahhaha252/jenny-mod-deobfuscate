/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.cz;
import com.trolmastercard.sexmod.em;
import java.util.ArrayList;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class cz.a.a
implements IMessageHandler<cz, IMessage> {
    public IMessage a(cz cz2, MessageContext messageContext) {
        if (!cz2.a || messageContext.side != Side.SERVER) {
            System.out.println("received an invalid message @UploadInventoryToServer :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(cz2.b);
            for (em em2 : arrayList) {
                if (em2.field_70170_p.field_72995_K) continue;
                em2.field_70170_p.func_72900_e((Entity)em2);
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
