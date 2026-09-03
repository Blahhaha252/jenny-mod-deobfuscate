package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.NetworkManager;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ChatMessage implements IMessage {
    boolean valid; // was b
    String text; // was a
    int dimension; // was d
    UUID id; // was c
    
    public ChatMessage(String text, int dimension, UUID id) {
        this.text = text;
        this.dimension = dimension;
        this.id = id;
        this.valid = true;
    }
    
    public ChatMessage() {
        this.valid = false;
    }
    
    @Override
    public void fromBytes(ByteBuf buffer) {
        int len = buffer.readInt();
        byte[] bArray = new byte[len];
        for (int i = 0; i < len; ++i) {
            bArray[i] = buffer.readByte();
        }
        
        this.text = new String(bArray);
        this.dimension = buffer.readInt();
        this.id = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf) buffer);
        this.valid = true;
    }
    
    @Override
    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.text.getBytes().length);
        buffer.writeBytes(this.text.getBytes());
        buffer.writeInt(this.dimension);
        ByteBufUtils.writeUTF8String((ByteBuf) buffer, (String)this.id.toString());
    }
    
    public static class a implements IMessageHandler<ChatMessage, IMessage> {
        @Override
        public IMessage onMessage(ChatMessage msg, MessageContext ctx) {
            if (!msg.valid) {
                System.out.println("recieved an unvalid message @SendChatMessage :(");
                return null;
            }
            if (ctx.side.isClient()) {
                Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentString(msg.text));
                return null;
            } else {
                FMLCommonHandler.instance()
                    .getMinecraftServerInstance()
                    .addScheduledTask(() -> {
                        Vec3d vec3d = em.g(msg.id).get(0).M();
                        
                        ge.b.sendToAllAround(
                            (IMessage)new ChatMessage(
                                msg.text, msg.dimension, msg.id
                            ), new NetworkRegistry.TargetPoint(
                                msg.dimension, vec3d.x, vec3d.y, vec3d.z, 40.0
                            )
                        );
                    });
            }
            return null;
        }
    }
}


