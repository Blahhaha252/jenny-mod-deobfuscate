/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.bh;
import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.el;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ex;
import io.netty.buffer.ByteBuf;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class dc
implements IMessage {
    boolean c;
    UUID a;
    boolean b;
    boolean d;
    UUID e = null;

    public dc() {
        this.c = false;
    }

    public dc(UUID uUID, UUID uUID2, boolean bl, boolean bl2) {
        this.a = uUID;
        this.b = bl;
        this.e = uUID2;
        this.d = bl2;
        this.c = true;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = byteBuf.readBoolean();
        this.d = byteBuf.readBoolean();
        String string = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.e = string.equals("null") ? null : UUID.fromString(string);
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        byteBuf.writeBoolean(this.b);
        byteBuf.writeBoolean(this.d);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)(this.e == null ? "null" : this.e.toString()));
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public class dc$a$a implements IMessageHandler<dc, IMessage> {
        public static void a(UUID var0, UUID var1, boolean var2, boolean var3) {
          try {
             Iterator var4 = em.g(var0).iterator();

             while(true) {
                em var5;
                do {
                   if (!var4.hasNext()) {
                      return;
                   }

                   var5 = (em)var4.next();
                } while(var5.world.isRemote);

                if (var5 instanceof ex || var5 instanceof el || var5 instanceof eb) {
                   var5.tasks.removeTask(var5.o);
                   var5.tasks.removeTask(var5.z);
                }

                var5.getNavigator().clearPath();
                var5.motionX = 0.0D;
                var5.motionY = 0.0D;
                var5.motionZ = 0.0D;
                if (var5.ae() == null) {
                   var5.e(var1);
                }

                if (var3) {
                   var5.c(var5.aa());
                }

                var5.j(var5.ae());
                if (!var2) {
                   return;
                }

                if (!(var5 instanceof bh)) {
                   return;
                }

                bh var6 = (bh)var5;
                var6.b();
             }
          } catch (ConcurrentModificationException var7) {
          }
       }

       public IMessage a(dc var1, MessageContext var2) {
          if (var1.c && var2.side == Side.SERVER) {
             FMLCommonHandler.instance().getMinecraftServerInstance().addScheduledTask(() -> {
                a(var1.a, var1.e, var1.b, var1.d);
             });
          }

          return null;
       }

       // $FF: synthetic method
       // $FF: bridge method
       public IMessage onMessage(IMessage var1, MessageContext var2) {
          return this.a((dc)var1, var2);
       }

       private static RuntimeException a(RuntimeException var0) {
          return var0;
       }
    }
}
