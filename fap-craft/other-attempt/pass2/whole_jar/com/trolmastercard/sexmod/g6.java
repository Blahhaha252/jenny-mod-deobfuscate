/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.br;
import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class g6
implements IMessage {
    boolean a = false;
    HashMap<String, Float> b = new HashMap();

    public g6() {
    }

    public g6(HashMap<String, Float> hashMap) {
        this.b = hashMap;
    }

    public void fromBytes(ByteBuf byteBuf) {
        int n2;
        if (!(Main.proxy instanceof ClientProxy)) {
            this.a = true;
            return;
        }
        if (!br.b()) {
            return;
        }
        try {
            n2 = byteBuf.readInt();
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.a = true;
            return;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b.put(ByteBufUtils.readUTF8String((ByteBuf)byteBuf), Float.valueOf(byteBuf.readFloat()));
        }
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        if (Main.proxy instanceof ClientProxy) {
            return;
        }
        byteBuf.writeInt(this.b.size());
        for (Map.Entry<String, Float> entry : this.b.entrySet()) {
            ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)entry.getKey());
            byteBuf.writeFloat(entry.getValue().floatValue());
        }
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }
}

