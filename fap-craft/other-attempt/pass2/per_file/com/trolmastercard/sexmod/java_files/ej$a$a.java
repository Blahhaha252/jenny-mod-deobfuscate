/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.ej;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.gp;
import java.util.ArrayList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class ej.a.a
implements IMessageHandler<ej, IMessage> {
    public IMessage a(ej ej2, MessageContext messageContext) {
        if (!ej2.b || messageContext.side != Side.SERVER) {
            System.out.println("received an invalid message @CatActivateFishing :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(ej2.a);
            for (em em2 : arrayList) {
                if (em2.field_70170_p.field_72995_K || !(em2 instanceof eb)) continue;
                eb eb2 = (eb)em2;
                ItemStack itemStack = eb2.ao;
                gp gp2 = (gp)itemStack.func_77973_b();
                gp2.a(messageContext.getServerHandler().field_147369_b.field_70170_p, eb2, EnumHand.MAIN_HAND);
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
