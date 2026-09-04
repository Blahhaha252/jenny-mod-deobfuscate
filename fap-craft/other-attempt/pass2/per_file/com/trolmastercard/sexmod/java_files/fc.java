/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.BlockLog
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.bs;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.h6;
import io.netty.buffer.ByteBuf;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.block.BlockLog;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class fc
implements IMessage {
    Boolean b = false;
    BlockPos a;

    public fc() {
    }

    public fc(BlockPos blockPos) {
        this.a = blockPos;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.a = new BlockPos(byteBuf.readInt(), byteBuf.readInt(), byteBuf.readInt());
        this.b = true;
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(this.a.func_177958_n());
        byteBuf.writeInt(this.a.func_177956_o());
        byteBuf.writeInt(this.a.func_177952_p());
    }

    public static class a$a
    implements IMessageHandler<fc, IMessage> {
        public IMessage a(fc fc2, MessageContext messageContext) {
            if (!fc2.b.booleanValue() || !messageContext.side.equals((Object)Side.SERVER)) {
                System.out.println("received an invalid Message @FallTree :(");
                return null;
            }
            FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                int n2;
                EntityPlayerMP entityPlayerMP = messageContext.getServerHandler().field_147369_b;
                UUID uUID = ax.a(entityPlayerMP.getPersistentID());
                if (uUID == null) {
                    System.out.println("not tribe for player");
                    return;
                }
                int n3 = ax.h(uUID);
                if (n3 > (n2 = (int)Math.floor((double)ax.j(uUID).size() / 2.0))) {
                    entityPlayerMP.func_145747_a((ITextComponent)new TextComponentString(String.format("Ur Tribe will only work for you, if %severyone%s of them has a %sbed", TextFormatting.RED, TextFormatting.WHITE, TextFormatting.RED)));
                    entityPlayerMP.func_145747_a((ITextComponent)new TextComponentString(String.format("%s%d/%d Beds", TextFormatting.YELLOW, n2, n3)));
                    return;
                }
                World world = entityPlayerMP.field_70170_p;
                BlockPos blockPos = this.a(world, fc2.a);
                HashSet<BlockPos> hashSet = bs.a(world, blockPos, uUID);
                ge.b.sendTo((IMessage)new h6(hashSet, true), messageContext.getServerHandler().field_147369_b);
            });
            return null;
        }

        BlockPos a(World world, BlockPos blockPos) {
            if (world.func_180495_p(blockPos.func_177982_a(0, -1, 0)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(0, -1, 0));
            }
            if (world.func_180495_p(blockPos.func_177982_a(1, -1, 0)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(1, -1, 0));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, -1, 0)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(-1, -1, 0));
            }
            if (world.func_180495_p(blockPos.func_177982_a(0, -1, 1)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(0, -1, 1));
            }
            if (world.func_180495_p(blockPos.func_177982_a(0, -1, -1)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(0, -1, -1));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, -1, -1)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(-1, -1, -1));
            }
            if (world.func_180495_p(blockPos.func_177982_a(1, -1, 1)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(1, -1, 1));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, -1, 1)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(-1, -1, 1));
            }
            if (world.func_180495_p(blockPos.func_177982_a(1, -1, -1)).func_177230_c() instanceof BlockLog) {
                return this.a(world, blockPos.func_177982_a(1, -1, -1));
            }
            return blockPos;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
