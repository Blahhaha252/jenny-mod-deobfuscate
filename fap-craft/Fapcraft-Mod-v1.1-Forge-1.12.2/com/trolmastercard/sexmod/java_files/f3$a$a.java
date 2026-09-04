/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f3;
import com.trolmastercard.sexmod.fz;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class f3.a.a
implements IMessageHandler<f3, IMessage> {
    public IMessage a(f3 f32, MessageContext messageContext) {
        if (!f32.b) {
            System.out.println("received an invalid message @BeeOpenChest :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(f32.a);
            for (em em2 : arrayList) {
                EntityPlayerMP entityPlayerMP;
                fz fz2;
                if (em2.field_70170_p.field_72995_K || !(em2 instanceof fz) || !((Boolean)(fz2 = (fz)em2).func_184212_Q().func_187225_a(fz.M)).booleanValue() || (entityPlayerMP = (EntityPlayerMP)fz2.field_70170_p.func_152378_a(f32.c)) == null) continue;
                entityPlayerMP.openGui((Object)Main.instance, 1, em2.field_70170_p, em2.func_180425_c().func_177958_n(), em2.func_180425_c().func_177956_o(), em2.func_180425_c().func_177952_p());
                return;
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
