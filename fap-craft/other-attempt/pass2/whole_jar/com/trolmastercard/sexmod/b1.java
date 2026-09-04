/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class b1
implements IMessage {
    boolean b = false;
    ItemStack[] d;
    UUID a;
    UUID c;

    public b1() {
    }

    public b1(UUID uUID, UUID uUID2, ItemStack[] itemStackArray) {
        this.a = uUID;
        this.d = itemStackArray;
        this.c = uUID2;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.c = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        int n2 = byteBuf.readInt();
        this.d = new ItemStack[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.d[i2] = ByteBufUtils.readItemStack((ByteBuf)byteBuf);
        }
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c.toString());
        byteBuf.writeInt(this.d.length);
        for (ItemStack itemStack : this.d) {
            ByteBufUtils.writeItemStack((ByteBuf)byteBuf, (ItemStack)itemStack);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

