/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTTagCompound
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
import com.trolmastercard.sexmod.fy;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class fw
implements IMessage {
    boolean a = false;
    String c;
    List<Integer> d = new ArrayList<Integer>();
    UUID b;

    public fw() {
    }

    public fw(String string, UUID uUID) {
        this.c = string;
        this.b = uUID;
    }

    public fw(String string, UUID uUID, List<Integer> list) {
        this.c = string;
        this.b = uUID;
        this.d = list;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.c = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
        this.b = UUID.fromString(ByteBufUtils.readUTF8String((ByteBuf)byteBuf));
        int n = byteBuf.readInt();
        for (int i = 0; i < n; ++i) {
            this.d.add(byteBuf.readInt());
        }
        this.a = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.c);
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.b.toString());
        byteBuf.writeInt(this.d.size());
        for (int n : this.d) {
            byteBuf.writeInt(n);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static class a$a
    implements IMessageHandler<fw, IMessage> {
        public IMessage a(fw fw2, MessageContext messageContext) {
            if (!fw2.a || messageContext.side != Side.SERVER) {
                System.out.println("received an invalid message @UploadModelString :(");
                return null;
            }
            FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                block3: {
                    em em2 = em.a(fw2.b);
                    boolean bl = fw2.d.size() > 0;
                    boolean bl2 = false;
                    if (bl && (bl2 = this.a(em2, fw2.d))) {
                        em2.a(fw2.d);
                    }
                    if (!(em2 instanceof ei)) {
                        em2.f(fw2.c);
                        return;
                    }
                    EntityPlayerMP entityPlayerMP = messageContext.getServerHandler().field_147369_b;
                    NBTTagCompound nBTTagCompound = entityPlayerMP.getEntityData();
                    ei ei2 = ei.g((EntityPlayer)entityPlayerMP);
                    if (ei2 == null) {
                        return;
                    }
                    fy fy2 = fy.a((Entity)ei2);
                    nBTTagCompound.func_74778_a("sexmod:CustomModel" + fy2.toString(), fw2.c);
                    if (!bl || !bl2) break block3;
                    nBTTagCompound.func_74778_a("sexmod:GirlSpecific" + fy2.toString(), em.c(fw2.d));
                }
            });
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean a(em em2, List<Integer> list) {
            ArrayList<Integer> arrayList = em2.D();
            try {
                for (int i = 0; i < arrayList.size(); ++i) {
                    if (arrayList.get(i) > list.get(i)) continue;
                    return false;
                }
                return true;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                return false;
            }
        }

        private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
            return indexOutOfBoundsException;
        }
    }
}
