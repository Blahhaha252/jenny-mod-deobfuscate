/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.cu;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class cu
implements IMessage {
    boolean d;
    List<String> c = new ArrayList<String>();
    byte[] b;
    b.b f;
    String e;
    int a = 0;

    public cu() {
    }

    public cu(List<String> list) {
        this.c = list;
    }

    public cu(byte[] byArray, b.b b10, String string) {
        this.b = byArray;
        this.f = b10;
        this.e = string;
    }

    public int a() {
        return this.a;
    }

    public void a(int n2) {
        this.a = n2;
    }

    public void fromBytes(ByteBuf byteBuf) {
        if (Main.proxy instanceof ClientProxy) {
            if (!br.b()) {
                return;
            }
            this.e = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
            this.f = b.b.valueOf(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
            this.a = byteBuf.readInt();
            int n2 = byteBuf.readInt();
            this.b = new byte[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                this.b[i2] = byteBuf.readByte();
            }
            this.d = true;
            return;
        }
        int n3 = byteBuf.readInt();
        for (int i3 = 0; i3 < n3; ++i3) {
            this.c.add(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        }
        this.d = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        if (Main.proxy instanceof ClientProxy) {
            byteBuf.writeInt(this.c.size());
            for (String string : this.c) {
                ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)string);
            }
            return;
        }
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.e);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.f.toString());
        byteBuf.writeInt(this.a);
        byteBuf.writeInt(this.b.length);
        for (byte by2 : this.b) {
            byteBuf.writeByte((int)by2);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

