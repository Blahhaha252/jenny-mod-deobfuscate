/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fp;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class gd
implements IMessage {
    boolean d = false;
    UUID c;
    int b;
    fp a;

    public gd() {
    }

    public gd(UUID uUID, int n2, fp fp2) {
        this.c = uUID;
        this.b = n2;
        this.a = fp2;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.c = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = byteBuf.readInt();
        this.a = fp.valueOf(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.d = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c.toString());
        byteBuf.writeInt(this.b);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
    }
}

