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

public class f3
implements IMessage {
    boolean b = false;
    UUID a;
    UUID c;

    public f3() {
    }

    public f3(UUID uUID, UUID uUID2) {
        this.a = uUID;
        this.c = uUID2;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.c = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c.toString());
    }
}

