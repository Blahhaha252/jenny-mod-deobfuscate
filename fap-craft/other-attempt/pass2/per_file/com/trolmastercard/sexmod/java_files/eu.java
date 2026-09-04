/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class eu
implements IMessage {
    boolean c;
    UUID a;
    UUID b;
    String d;

    public eu() {
    }

    public eu(UUID uUID, UUID uUID2, String string) {
        this.a = uUID;
        this.b = uUID2;
        this.d = string;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.b = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        this.d = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.c = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.a.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b.toString());
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.d);
    }

    public static class a$a
    implements IMessageHandler<eu, IMessage> {
        public IMessage a(eu eu2, MessageContext messageContext) {
            if (!eu2.c || messageContext.side != Side.SERVER) {
                System.out.println("received an invalid message @StartStandingSexAnimation :(");
                return null;
            }
            FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> a$a.lambda$onMessage$0(eu2));
            return null;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private static /* synthetic */ void lambda$onMessage$0(eu var0) {
            block8: {
                var1_1 = ei.d(var0.a);
                if (var1_1 == null) {
                    return;
                }
                if (FMLCommonHandler.instance().getMinecraftServerInstance().func_71262_S()) break block8;
                try lbl-1000:
                // 3 sources

                {
                    for (em var3_4 : em.ad()) {
                        if (!(var3_4 instanceof ei)) {
                            continue;
                        }
                        ** GOTO lbl-1000
                    }
                    break block8;
                }
                catch (Exception var2_3) {
                    // empty catch block
                    break block8;
                }
lbl-1000:
                // 1 sources

                {
                    var1_1 = (ei)var3_4;
                    if (var1_1.field_70170_p.field_72995_K || !var1_1.m().equals(var0.a)) ** GOTO lbl-1000
                }
            }
            var1_1.b(var0.d, var0.b);
        }

        private static Exception a(Exception exception) {
            return exception;
        }
    }
}
