/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  javax.vecmath.Vector4d
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import javax.vecmath.Vector4d;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class b3
implements IMessage {
    boolean a = false;
    boolean b;
    List<Vector4d> c;

    public b3() {
        this.b = false;
        this.c = new ArrayList<Vector4d>();
    }

    public b3(boolean bl2, List<Vector4d> list) {
        this.b = bl2;
        this.c = list;
    }

    static b3 a() {
        return new b3(false, new ArrayList<Vector4d>());
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.b = byteBuf.readBoolean();
        int n2 = byteBuf.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.c.add(new Vector4d((double)byteBuf.readInt(), (double)byteBuf.readInt(), (double)byteBuf.readInt(), (double)byteBuf.readInt()));
        }
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeBoolean(this.b);
        byteBuf.writeInt(this.c.size());
        for (Vector4d vector4d : this.c) {
            byteBuf.writeInt((int)vector4d.getX());
            byteBuf.writeInt((int)vector4d.getY());
            byteBuf.writeInt((int)vector4d.getZ());
            byteBuf.writeInt((int)vector4d.getW());
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

