/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a6;
import com.trolmastercard.sexmod.em;
import java.util.ArrayList;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class a6.a.a
implements IMessageHandler<a6, IMessage> {
    public IMessage a(a6 a62, MessageContext messageContext) {
        if (!a62.b) {
            System.out.println("received an invalid message @SetNewHome :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(a62.c);
            if (arrayList.isEmpty()) {
                return;
            }
            for (em em2 : arrayList) {
                em2.l = new Vec3d(a62.a.field_72450_a, Math.floor(a62.a.field_72448_b), a62.a.field_72449_c);
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
