/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class a8
implements IMessage {
    boolean b;
    String c;
    Vec3d e;
    float a;
    float d;

    public a8() {
        this.b = false;
    }

    public a8(String string, Vec3d vec3d) {
        this.c = string;
        this.e = vec3d;
        this.a = 0.0f;
        this.d = 0.0f;
        this.b = true;
    }

    public a8(String string, Vec3d vec3d, float f10, float f11) {
        this.c = string;
        this.e = vec3d;
        this.a = f10;
        this.d = f11;
        this.b = true;
    }

    public a8(String string, double d10, double d11, double d12, float f10, float f11) {
        this.c = string;
        this.e = new Vec3d(d10, d11, d12);
        this.a = f10;
        this.d = f11;
        this.b = true;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.c = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.e = new Vec3d(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
        this.a = byteBuf.readFloat();
        this.d = byteBuf.readFloat();
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c);
        byteBuf.writeDouble(this.e.field_72450_a);
        byteBuf.writeDouble(this.e.field_72448_b);
        byteBuf.writeDouble(this.e.field_72449_c);
        byteBuf.writeFloat(this.a);
        byteBuf.writeFloat(this.d);
        this.b = true;
    }
}

