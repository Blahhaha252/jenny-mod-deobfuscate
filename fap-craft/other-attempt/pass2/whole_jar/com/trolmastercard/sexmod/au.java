/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class au
implements IMessage {
    boolean a = false;
    BlockPos b;

    public au() {
    }

    public au(BlockPos blockPos) {
        this.b = blockPos;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.b = new BlockPos(byteBuf.readInt(), byteBuf.readInt(), byteBuf.readInt());
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(this.b.func_177958_n());
        byteBuf.writeInt(this.b.func_177956_o());
        byteBuf.writeInt(this.b.func_177952_p());
    }
}

