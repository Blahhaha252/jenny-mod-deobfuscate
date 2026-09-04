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
}

