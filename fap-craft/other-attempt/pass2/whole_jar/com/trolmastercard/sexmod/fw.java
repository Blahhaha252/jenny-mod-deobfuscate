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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class fw
implements IMessage {
    boolean a = false;
    String c;
    List<Integer> d = new ArrayList<Integer>();
    UUID b;

    public fw() {
    }

    public fw(String string, UUID uUID) {
        this.c = string;
        this.b = uUID;
    }

    public fw(String string, UUID uUID, List<Integer> list) {
        this.c = string;
        this.b = uUID;
        this.d = list;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.c = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.b = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        int n2 = byteBuf.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.d.add(byteBuf.readInt());
        }
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b.toString());
        byteBuf.writeInt(this.d.size());
        for (int n2 : this.d) {
            byteBuf.writeInt(n2);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

