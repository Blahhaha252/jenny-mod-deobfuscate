/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class e6
implements IMessage {
    boolean c = false;
    BlockPos a;
    EnumFacing b;

    public e6() {
    }

    public e6(BlockPos blockPos, EnumFacing enumFacing) {
        this.a = blockPos;
        this.b = enumFacing;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = new BlockPos(byteBuf.readInt(), byteBuf.readInt(), byteBuf.readInt());
        this.b = EnumFacing.func_176739_a((String)ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(this.a.func_177958_n());
        byteBuf.writeInt(this.a.func_177956_o());
        byteBuf.writeInt(this.a.func_177952_p());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b.func_176610_l());
    }
}

