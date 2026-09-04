/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class gz
implements IMessage {
    boolean a;
    boolean b;

    public gz(boolean bl) {
        this.b = bl;
        this.a = true;
    }

    public gz() {
        this.a = false;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.b = byteBuf.readBoolean();
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeBoolean(this.b);
        this.a = true;
    }

    public static class a$a
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
}
