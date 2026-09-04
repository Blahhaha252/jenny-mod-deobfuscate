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

    public static class a$a
    implements IMessageHandler<dc, IMessage> {
        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static void a(UUID var0, UUID var1_1, boolean var2_2, boolean var3_3) {
            try lbl-1000:
            // 3 sources

            {
                for (em var5_6 : em.g(var0)) {
                    if (var5_6.field_70170_p.field_72995_K) {
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                return;
            }
            catch (ConcurrentModificationException var4_5) {
                // empty catch block
                return;
            }
lbl-1000:
            // 1 sources

            {
                if (!(var5_6 instanceof ex) && !(var5_6 instanceof el) && !(var5_6 instanceof eb)) ** GOTO lbl-1000
            }
            {
                var5_6.field_70714_bg.func_85156_a((EntityAIBase)var5_6.o);
                var5_6.field_70714_bg.func_85156_a((EntityAIBase)var5_6.z);
            }
lbl-1000:
            // 2 sources

            {
                var5_6.func_70661_as().func_75499_g();
                var5_6.field_70159_w = 0.0;
                var5_6.field_70181_x = 0.0;
                var5_6.field_70179_y = 0.0;
                if (var5_6.ae() != null) ** GOTO lbl-1000
                var5_6.e(var1_1);
            }
lbl-1000:
            // 2 sources

            {
                if (!var3_3) ** GOTO lbl-1000
                var5_6.c(var5_6.aa());
            }
lbl-1000:
            // 2 sources

            {
                var5_6.j(var5_6.ae());
                if (!var2_2) {
                    return;
                }
                if (var5_6 instanceof bh) ** GOTO lbl-1000
                return;
            }
lbl-1000:
            // 1 sources

            {
                var6_7 = (bh)var5_6;
                var6_7.b();
                ** GOTO lbl-1000
            }
        }

        public IMessage a(dc dc2, MessageContext messageContext) {
            block0: {
                if (!dc2.c || messageContext.side != Side.SERVER) break block0;
                FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> a$a.a(dc2.a, dc2.e, dc2.b, dc2.d));
            }
            return null;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
