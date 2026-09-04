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

public class g9
implements IMessage {
    boolean c = false;
    UUID d;
    UUID a;
    String b;

    public g9() {
    }

    public g9(UUID uUID, UUID uUID2, String string) {
        this.d = uUID;
        this.a = uUID2;
        this.b = string;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.d = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.d.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b);
    }
}

