/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class en
implements IMessage {
    boolean d = false;
    UUID c;
    String b;
    int a;

    public en() {
    }

    public en(UUID uUID, String string) {
        this.c = uUID;
        this.b = string;
        this.a = 1;
    }

    public en(UUID uUID, String string, int n) {
        this.c = uUID;
        this.b = string;
        this.a = n;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.c = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.a = byteBuf.readInt();
        this.d = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b);
        byteBuf.writeInt(this.a);
    }

    public static class a$a
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
}
