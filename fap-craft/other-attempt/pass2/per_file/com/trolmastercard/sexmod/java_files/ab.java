/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.cc;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class ab
implements IMessage {
    boolean c = false;
    UUID a;
    UUID b;

    public ab() {
    }

    public ab(UUID uUID, UUID uUID2) {
        this.a = uUID;
        this.b = uUID2;
    }

    public void fromBytes(ByteBuf byteBuf) {
        try {
            this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        }
        catch (Exception exception) {
            this.a = null;
        }
        try {
            this.b = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        }
        catch (Exception exception) {
            this.b = null;
        }
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)(this.a == null ? "trol was here" : this.a.toString()));
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)(this.b == null ? "trol was here" : this.b.toString()));
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static class a$a
    implements IMessageHandler<ab, IMessage> {
        public IMessage a(ab ab2, MessageContext messageContext) {
            if (!ab2.c || !messageContext.side.equals((Object)Side.CLIENT)) {
                System.out.println("received an invalid message @SpawnEnergyBallParticles :(");
                return null;
            }
            em em2 = em.b(ab2.a);
            if (!(em2 instanceof f_)) {
                System.out.println("doesnt exit");
                return null;
            }
            cc.a(ab2.b, (f_)em2);
            return null;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
