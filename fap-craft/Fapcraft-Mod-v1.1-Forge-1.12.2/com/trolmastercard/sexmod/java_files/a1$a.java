/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a1;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ge;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class a1.a
implements IMessageHandler<a1, IMessage> {
    public IMessage a(a1 a12, MessageContext messageContext) {
        try {
            if (!a12.d) {
                System.out.println("received an invalid message @ResetController :(");
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw a1.a.a(runtimeException);
        }
        if (messageContext.side.isServer()) {
            em em2 = em.a(a12.a);
            try {
                if (em2 == null) {
                    return null;
                }
            }
            catch (RuntimeException runtimeException) {
                throw a1.a.a(runtimeException);
            }
            UUID uUID = messageContext.getServerHandler().field_147369_b.getPersistentID();
            em2.y().ticksPlaying = new int[]{0, 0};
            for (EntityPlayerMP entityPlayerMP : FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_181057_v()) {
                try {
                    try {
                        if (uUID.equals(entityPlayerMP.getPersistentID()) || !(entityPlayerMP.func_70032_d((Entity)em2) < 100.0f)) continue;
                    }
                    catch (RuntimeException runtimeException) {
                        throw a1.a.a(runtimeException);
                    }
                    ge.b.sendTo((IMessage)new a1(a12.a), entityPlayerMP);
                }
                catch (RuntimeException runtimeException) {
                    throw a1.a.a(runtimeException);
                }
            }
            return null;
        }
        em em3 = em.b(a12.a);
        try {
            if (em3 != null) {
                em3.ag();
            }
        }
        catch (RuntimeException runtimeException) {
            throw a1.a.a(runtimeException);
        }
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
