/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.gz;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class gz.a.a
implements IMessageHandler<gz, IMessage> {
    public IMessage a(gz gz2, MessageContext messageContext) {
        block3: {
            if (!gz2.a || messageContext.side != Side.CLIENT) {
                System.out.println("received an invalid message @SetPlayerMovement :(");
                return null;
            }
            d3.a(gz2.b);
            try {
                Minecraft.func_71410_x().field_71439_g.func_70016_h(0.0, 0.0, 0.0);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (!gz2.b) break block3;
            ds.c();
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}
