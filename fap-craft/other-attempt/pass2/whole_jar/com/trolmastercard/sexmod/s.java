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

public class s
implements IMessage {
    boolean b;
    UUID c;
    boolean a;

    public s() {
        this.b = false;
    }

    public s(UUID uUID) {
        this.c = uUID;
        this.a = false;
        this.b = true;
    }

    public s(UUID uUID, boolean bl2) {
        this.c = uUID;
        this.a = bl2;
        this.b = true;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.c = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.a = byteBuf.readBoolean();
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c.toString());
        byteBuf.writeBoolean(this.a);
        this.b = true;
    }
}

