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
import java.util.HashSet;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class h6
implements IMessage {
    boolean b = false;
    HashSet<BlockPos> c = new HashSet();
    boolean a;

    public h6() {
    }

    public h6(HashSet<BlockPos> hashSet, boolean bl2) {
        this.c = hashSet;
        this.a = bl2;
    }

    public h6(BlockPos blockPos, boolean bl2) {
        this.c.add(blockPos);
        this.a = bl2;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = byteBuf.readBoolean();
        int n2 = byteBuf.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.c.add(new BlockPos(byteBuf.readInt(), byteBuf.readInt(), byteBuf.readInt()));
        }
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeBoolean(this.a);
        byteBuf.writeInt(this.c.size());
        for (BlockPos blockPos : this.c) {
            byteBuf.writeInt(blockPos.func_177958_n());
            byteBuf.writeInt(blockPos.func_177956_o());
            byteBuf.writeInt(blockPos.func_177952_p());
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

