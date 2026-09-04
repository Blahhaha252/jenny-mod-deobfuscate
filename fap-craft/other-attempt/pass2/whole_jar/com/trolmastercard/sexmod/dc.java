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

public class dc
implements IMessage {
    boolean c;
    UUID a;
    boolean b;
    boolean d;
    UUID e = null;

    public dc() {
        this.c = false;
    }

    public dc(UUID uUID, UUID uUID2, boolean bl2, boolean bl3) {
        this.a = uUID;
        this.b = bl2;
        this.e = uUID2;
        this.d = bl3;
        this.c = true;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = byteBuf.readBoolean();
        this.d = byteBuf.readBoolean();
        String string = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.e = string.equals("null") ? null : UUID.fromString(string);
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        byteBuf.writeBoolean(this.b);
        byteBuf.writeBoolean(this.d);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)(this.e == null ? "null" : this.e.toString()));
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

