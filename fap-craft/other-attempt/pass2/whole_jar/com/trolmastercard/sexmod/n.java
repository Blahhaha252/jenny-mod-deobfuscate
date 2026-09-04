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

public class n
implements IMessage {
    boolean b;
    UUID d;
    String a;
    String c;

    public n() {
        this.b = false;
    }

    public n(UUID uUID, String string, String string2) {
        this.d = uUID;
        this.a = string;
        this.c = string2;
        this.b = true;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.d = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.a = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.c = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.d.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)(this.c == null ? "null" : this.c));
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

