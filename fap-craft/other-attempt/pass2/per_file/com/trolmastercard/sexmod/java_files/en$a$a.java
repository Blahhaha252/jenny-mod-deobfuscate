/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.en;
import java.util.ArrayList;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class en.a.a
implements IMessageHandler<en, IMessage> {
    public IMessage a(en en2, MessageContext messageContext) {
        if (!en2.d || !messageContext.side.equals((Object)Side.CLIENT)) {
            System.out.println("received an invalid message @SpawnParticle :(");
            return null;
        }
        ArrayList<em> arrayList = em.g(en2.c);
        for (em em2 : arrayList) {
            if (!em2.field_70170_p.field_72995_K) continue;
            for (int i = 0; i < en2.a; ++i) {
                em.a(EnumParticleTypes.func_186831_a((String)en2.b), em2);
            }
        }
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
