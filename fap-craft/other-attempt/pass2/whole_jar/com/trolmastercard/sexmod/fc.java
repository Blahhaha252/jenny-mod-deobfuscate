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

public class fc
implements IMessage {
    Boolean b = false;
    BlockPos a;

    public fc() {
    }

    public fc(BlockPos blockPos) {
        this.a = blockPos;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = new BlockPos(byteBuf.readInt(), byteBuf.readInt(), byteBuf.readInt());
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(this.a.func_177958_n());
        byteBuf.writeInt(this.a.func_177956_o());
        byteBuf.writeInt(this.a.func_177952_p());
    }
}

