/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class bw
implements IMessage {
    boolean b;
    Vec3d a;

    public bw() {
    }

    public bw(Vec3d vec3d) {
        this.a = vec3d;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = new Vec3d(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeDouble(this.a.field_72450_a);
        byteBuf.writeDouble(this.a.field_72448_b);
        byteBuf.writeDouble(this.a.field_72449_c);
    }
}

