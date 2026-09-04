/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

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

    public static class a$a
    implements IMessageHandler<ct, IMessage> {
        public IMessage a(ct ct2, MessageContext messageContext) {
            if (!ct2.c || !messageContext.side.equals((Object)Side.SERVER)) {
                System.out.println("received an invalid message @UpdateVelocity :(");
                return null;
            }
            FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                block1: {
                    em em2 = em.a(ct2.a);
                    if (!(em2 instanceof f_)) {
                        return;
                    }
                    f_ f_2 = (f_)em2;
                    if (!messageContext.getServerHandler().field_147369_b.equals((Object)f_2.ab())) break block1;
                    f_2.d(ct2.b);
                }
            });
            return null;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
