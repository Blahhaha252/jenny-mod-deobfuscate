/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.w;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class g4
implements IMessage {
    boolean e = false;
    String c;
    UUID b;
    UUID a;
    boolean d;

    public g4() {
    }

    public g4(String string, UUID uUID, UUID uUID2, boolean bl) {
        this.c = string;
        this.b = uUID;
        this.a = uUID2;
        this.d = bl;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.c = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.b = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.d = byteBuf.readBoolean();
        this.e = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        byteBuf.writeBoolean(this.d);
    }

    public static class a$a
    implements IMessageHandler<g4, IMessage> {
        public IMessage a(g4 g42, MessageContext messageContext) {
            if (!g42.e) {
                System.out.println("received an invalid message @SexPrompt :(");
                return null;
            }
            if (messageContext.side.equals((Object)Side.CLIENT)) {
                w.a.a(new w.a$a(g42.c, g42.b, g42.a, g42.d));
                return null;
            }
            FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                World world = messageContext.getServerHandler().field_147369_b.field_70170_p;
                EntityPlayer entityPlayer = world.func_152378_a(g42.a);
                EntityPlayer entityPlayer2 = world.func_152378_a(g42.b);
                if (entityPlayer == null) {
                    System.out.println("Sex prompt invalid -> female player not found");
                    return;
                }
                if (entityPlayer2 == null) {
                    System.out.println("Sex prompt invalid -> male player not found");
                    return;
                }
                ge.b.sendTo((IMessage)new g4(g42.c, g42.b, g42.a, g42.d), (EntityPlayerMP)(g42.d ? entityPlayer : entityPlayer2));
            });
            return null;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
