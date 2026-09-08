/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.em;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class dq
implements IMessage {
    boolean a = false;
    UUID b;

    public dq() {
    }

    public dq(UUID uid) {
        this.b = uid;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.b = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b.toString());
    }

    public static class a$a
    implements IMessageHandler<dq, IMessage> {
        public IMessage a(dq dq2, MessageContext messageContext) {
            if (!dq2.a || !messageContext.side.equals((Object)Side.SERVER)) {
                System.out.println("received an invalid message @CatThrowAwayItem :(");
                return null;
            }
            FMLCommonHandler.instance().getMinecraftServerInstance().addScheduledTask(() -> {
                ArrayList<em> arrayList = em.g(dq2.b);
                for (em em2 : arrayList) {
                    if (em2.world.isRemote || !(em2 instanceof eb)) continue;
                    eb eb2 = (eb)em2;
                    eb2.j();
                }
            });
            return null;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
