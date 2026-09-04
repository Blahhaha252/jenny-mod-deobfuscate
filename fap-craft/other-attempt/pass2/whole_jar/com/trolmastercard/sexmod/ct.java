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
import java.util.UUID;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ct
implements IMessage {
    boolean c = false;
    Vec3d b;
    UUID a;

    public ct(Vec3d vec3d, UUID uUID) {
        this.b = vec3d;
        this.a = uUID;
    }

    public ct() {
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.b = new Vec3d(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeDouble(this.b.field_72450_a);
        byteBuf.writeDouble(this.b.field_72448_b);
        byteBuf.writeDouble(this.b.field_72449_c);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
    }
}

