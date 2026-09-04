/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
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

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fy;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Constructor;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

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

    public static class a$a
    implements IMessageHandler<b_, IMessage> {
        public IMessage a(b_ b_2, MessageContext messageContext) {
            if (!b_2.b || messageContext.side != Side.SERVER) {
                System.out.println("received an invalid message @UpdatePlayerModel :(");
                return null;
            }
            FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                ei ei2;
                fy fy2;
                EntityPlayerMP entityPlayerMP = messageContext.getServerHandler().field_147369_b;
                World world = entityPlayerMP.field_70170_p;
                UUID uUID = messageContext.getServerHandler().field_147369_b.getPersistentID();
                ei ei3 = ei.d(uUID);
                if (ei3 != null) {
                    try {
                        for (em em2 : em.ad()) {
                            if (em2.field_70170_p.field_72995_K || !em2.f().equals(ei3.f())) continue;
                            world.func_72900_e((Entity)em2);
                        }
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        // empty catch block
                    }
                    ei3.y();
                    ei.al.remove(uUID);
                    em.ad().remove((Object)ei3);
                    ei3.a((Optional<UUID>)Optional.absent());
                }
                if ((fy2 = b_2.a) == null) {
                    return;
                }
                try {
                    Constructor<? extends ei> constructor = fy2.playerClass.getConstructor(World.class, UUID.class);
                    ei2 = constructor.newInstance(world, messageContext.getServerHandler().field_147369_b.getPersistentID());
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
                ei2.func_189654_d(true);
                ei2.field_70145_X = true;
                ei2.field_70159_w = 0.0;
                ei2.field_70181_x = 0.0;
                ei2.field_70179_y = 0.0;
                ei2.func_70107_b(entityPlayerMP.field_70165_t, entityPlayerMP.field_70163_u + 69.0, entityPlayerMP.field_70161_v);
                world.func_72838_d(ei2);
                ei2.B();
            });
            return null;
        }

        private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
            return concurrentModificationException;
        }
    }
}
