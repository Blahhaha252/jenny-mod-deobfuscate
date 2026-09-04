/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class eu
implements IMessage {
    boolean c;
    UUID a;
    UUID b;
    String d;

    public eu() {
    }

    public eu(UUID uUID, UUID uUID2, String string) {
        this.a = uUID;
        this.b = uUID2;
        this.d = string;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.d = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.d);
    }
}

