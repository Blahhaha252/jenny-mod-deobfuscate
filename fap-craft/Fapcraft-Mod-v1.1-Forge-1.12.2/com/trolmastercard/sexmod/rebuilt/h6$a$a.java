/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockBed
 *  net.minecraft.block.BlockChest
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gm;
import com.trolmastercard.sexmod.h6;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class h6.a.a
implements IMessageHandler<h6, IMessage> {
    public IMessage a(h6 h62, MessageContext messageContext) {
        if (!h62.b) {
            System.out.println("received an invalid Message @SendBlocks :(");
            return null;
        }
        if (messageContext.side.isClient()) {
            if (h62.a) {
                gm.a(h62.c);
            } else {
                gm.b(h62.c);
            }
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().addScheduledTask(() -> {
            UUID uUID = messageContext.getServerHandler().player.getPersistentID();
            UUID uUID2 = ax.a(uUID);
            if (uUID2 == null) {
                return;
            }
            if (h62.c.size() != 1) {
                return;
            }
            World world = messageContext.getServerHandler().player.world;
            for (BlockPos blockPos : h62.c) {
                Object object;
                IBlockState iBlockState = world.getBlockState(blockPos);
                BlockPos blockPos2 = null;
                if (iBlockState.getBlock() instanceof BlockBed) {
                    blockPos2 = cj.a(blockPos, iBlockState);
                }
                if (iBlockState.getBlock() instanceof BlockChest) {
                    object = ((BlockChest)iBlockState.getBlock()).chestType;
                    if (world.getBlockState(blockPos.north()).getBlock() instanceof BlockChest && object.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.north()).getBlock()).chestType)) {
                        blockPos2 = blockPos.north();
                    }
                    if (world.getBlockState(blockPos.east()).getBlock() instanceof BlockChest && object.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.east()).getBlock()).chestType)) {
                        blockPos2 = blockPos.east();
                    }
                    if (world.getBlockState(blockPos.south()).getBlock() instanceof BlockChest && object.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.south()).getBlock()).chestType)) {
                        blockPos2 = blockPos.south();
                    }
                    if (world.getBlockState(blockPos.west()).getBlock() instanceof BlockChest && object.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.west()).getBlock()).chestType)) {
                        blockPos2 = blockPos.west();
                    }
                }
                if (blockPos2 == null && iBlockState.getBlock() instanceof BlockBed) {
                    return;
                }
                if (h62.a) {
                    if (iBlockState.getBlock() instanceof BlockBed) {
                        ax.a(uUID2, blockPos);
                        ax.a(uUID2, blockPos2);
                    } else {
                        ax.f(uUID2, blockPos);
                        ax.f(uUID2, blockPos2);
                    }
                } else if (iBlockState.getBlock() instanceof BlockBed) {
                    ax.e(uUID2, blockPos);
                    ax.e(uUID2, blockPos2);
                } else {
                    ax.d(uUID2, blockPos);
                    ax.d(uUID2, blockPos2);
                }
                object = new HashSet();
                ((HashSet)object).add(blockPos);
                if (blockPos2 != null) {
                    ((HashSet)object).add(blockPos2);
                }
                ge.b.sendTo((IMessage)new h6((HashSet<BlockPos>)object, h62.a), messageContext.getServerHandler().player);
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
