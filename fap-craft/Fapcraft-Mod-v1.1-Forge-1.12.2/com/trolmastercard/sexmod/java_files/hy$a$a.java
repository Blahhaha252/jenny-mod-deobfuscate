/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBed
 *  net.minecraft.block.BlockChest
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickItem
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b3;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.hy;
import com.trolmastercard.sexmod.j;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockChest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public static class hy.a.a {
    @SubscribeEvent
    public void a(PlayerInteractEvent.RightClickItem rightClickItem) {
        World world = rightClickItem.getWorld();
        if (!world.field_72995_K) {
            return;
        }
        EntityPlayer entityPlayer = rightClickItem.getEntityPlayer();
        if (entityPlayer.func_184586_b(EnumHand.MAIN_HAND).func_77973_b() != hy.b && entityPlayer.func_184586_b(EnumHand.OFF_HAND).func_77973_b() != hy.b) {
            return;
        }
        if (ff.aY.isEmpty()) {
            return;
        }
        this.a();
    }

    @SideOnly(value=Side.CLIENT)
    void a() {
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new j());
        ge.b.sendToServer((IMessage)new b3());
    }

    @SubscribeEvent
    public void a(PlayerInteractEvent.RightClickBlock rightClickBlock) {
        block2: {
            EntityPlayer entityPlayer = rightClickBlock.getEntityPlayer();
            if (entityPlayer.func_184586_b(EnumHand.MAIN_HAND).func_77973_b() != hy.b && entityPlayer.func_184586_b(EnumHand.OFF_HAND).func_77973_b() != hy.b) {
                return;
            }
            Block block = rightClickBlock.getWorld().func_180495_p(rightClickBlock.getPos()).func_177230_c();
            if (block instanceof BlockBed) {
                rightClickBlock.setCancellationResult(EnumActionResult.FAIL);
                rightClickBlock.setResult(Event.Result.DENY);
                rightClickBlock.setCanceled(true);
            }
            if (!(block instanceof BlockChest)) break block2;
            rightClickBlock.setCancellationResult(EnumActionResult.FAIL);
            rightClickBlock.setResult(Event.Result.DENY);
            rightClickBlock.setCanceled(true);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
