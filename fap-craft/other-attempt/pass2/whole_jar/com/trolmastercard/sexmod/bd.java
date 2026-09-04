/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.fy;
import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class bd
implements IMessage {
    boolean c = false;
    EntityPlayer b;
    HashMap<fy, String> a = new HashMap();

    public bd() {
    }

    public bd(EntityPlayer entityPlayer) {
        this.b = entityPlayer;
    }

    public void fromBytes(ByteBuf byteBuf) {
        int n2 = byteBuf.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a.put(fy.valueOf(ByteBufUtils.readUTF8String((ByteBuf)byteBuf)), ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        }
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        for (fy fy2 : fy.values()) {
            String string;
            if (!fy2.hasSpecifics || "".equals(string = this.b.getEntityData().func_74779_i("sexmod:GirlSpecific" + (Object)((Object)fy2)))) continue;
            this.a.put(fy2, string);
        }
        byteBuf.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)((fy)((Object)entry.getKey())).toString());
            ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)((String)entry.getValue()));
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

