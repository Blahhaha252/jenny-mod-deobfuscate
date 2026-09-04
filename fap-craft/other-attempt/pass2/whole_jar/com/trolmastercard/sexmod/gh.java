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

public class gh
implements IMessage {
    boolean b;
    String a;
    int d;
    UUID c;

    public gh(String string, int n2, UUID uUID) {
        this.a = string;
        this.d = n2;
        this.c = uUID;
        this.b = true;
    }

    public gh() {
        this.b = false;
    }

    public void fromBytes(ByteBuf byteBuf) {
        byte[] byArray;
        try {
            int n2 = byteBuf.readInt();
            byArray = new byte[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                byArray[i2] = byteBuf.readByte();
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.b = false;
            System.out.println("couldn't read bytes @SendChatMessage :(");
            return;
        }
        this.a = new String(byArray);
        this.d = byteBuf.readInt();
        this.c = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(this.a.getBytes().length);
        byteBuf.writeBytes(this.a.getBytes());
        byteBuf.writeInt(this.d);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c.toString());
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }
}

