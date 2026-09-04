/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class aq
implements IMessage {
    boolean d = false;
    float a;
    float b;
    int c;

    public aq() {
    }

    public aq(float f10, float f11, int n2) {
        this.a = f10;
        this.b = f11;
        this.c = n2;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = byteBuf.readFloat();
        this.b = byteBuf.readFloat();
        this.c = byteBuf.readInt();
        this.d = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeFloat(this.a);
        byteBuf.writeFloat(this.b);
        byteBuf.writeInt(this.c);
    }
}

