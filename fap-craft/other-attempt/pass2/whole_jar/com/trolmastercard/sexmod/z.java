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

public class z
implements IMessage {
    boolean a;

    public void fromBytes(ByteBuf byteBuf) {
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
    }
}

