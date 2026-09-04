/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fy;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class b_
implements IMessage {
    boolean b = false;
    fy a;

    public b_() {
    }

    public b_(fy fy2) {
        this.a = fy2;
    }

    public void fromBytes(ByteBuf byteBuf) {
        String string = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.a = "player".equals(string) ? null : fy.valueOf(string);
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        if (this.a == null) {
            ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)"player");
        } else {
            ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

