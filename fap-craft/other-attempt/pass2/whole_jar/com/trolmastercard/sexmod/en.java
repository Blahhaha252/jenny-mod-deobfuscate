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

    public en(UUID uUID, String string, int n2) {
        this.c = uUID;
        this.b = string;
        this.a = n2;
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
}

