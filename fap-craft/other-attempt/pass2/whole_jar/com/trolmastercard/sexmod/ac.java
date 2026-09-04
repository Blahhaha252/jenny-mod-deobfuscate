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

public class ac
implements IMessage {
    boolean a;
    UUID b;

    public ac() {
        this.a = false;
    }

    public ac(UUID uUID) {
        this.b = uUID;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.b = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b.toString());
    }
}

