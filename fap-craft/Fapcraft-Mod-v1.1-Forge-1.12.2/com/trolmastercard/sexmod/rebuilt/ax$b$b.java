/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBed
 *  net.minecraft.block.BlockChest
 *  net.minecraft.block.BlockChest$Type
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.monster.AbstractSkeleton
 *  net.minecraft.entity.monster.EntitySpider
 *  net.minecraft.entity.monster.EntityZombie
 *  net.minecraft.entity.player.EntityPlayer$SleepResult
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraft.world.storage.WorldSavedData
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.event.entity.player.PlayerSleepInBedEvent
 *  net.minecraftforge.event.world.BlockEvent$BreakEvent
 *  net.minecraftforge.event.world.BlockEvent$PlaceEvent
 *  net.minecraftforge.event.world.WorldEvent$Load
 *  net.minecraftforge.event.world.WorldEvent$Save
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.aa;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.bs;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.h6;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public static class ax.b.b
extends WorldSavedData {
    public ax.b.b(String string) {
        super(string);
    }

    @SubscribeEvent
    public void a(WorldEvent.Save save) {
        World world = save.getWorld();
        world.getMapStorage().setData("tribes", (WorldSavedData)this);
        this.markDirty();
    }

    @SubscribeEvent
    public void a(WorldEvent.Load load) {
        World world = load.getWorld();
        world.getMapStorage().getOrLoadData(ax.b.b.class, "tribes");
    }

    @SubscribeEvent
    public void a(PlayerSleepInBedEvent playerSleepInBedEvent) {
        block0: {
            if (!ax.a(playerSleepInBedEvent.getPos())) break block0;
            playerSleepInBedEvent.setResult(EntityPlayer.SleepResult.OTHER_PROBLEM);
        }
    }

    @SubscribeEvent
    public void a(BlockEvent.PlaceEvent placeEvent) {
        BlockPos blockPos = placeEvent.getPos();
        IBlockState iBlockState = placeEvent.getState();
        World world = placeEvent.getWorld();
        if (world.isRemote) {
            return;
        }
        if (!(iBlockState.getBlock() instanceof BlockChest)) {
            return;
        }
        BlockChest.Type type = ((BlockChest)world.getBlockState((BlockPos)blockPos).getBlock()).chestType;
        BlockPos blockPos2 = null;
        if (world.getBlockState(blockPos.north()).getBlock() instanceof BlockChest && type.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.north()).getBlock()).chestType)) {
            blockPos2 = blockPos.north();
        }
        if (world.getBlockState(blockPos.east()).getBlock() instanceof BlockChest && type.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.east()).getBlock()).chestType)) {
            blockPos2 = blockPos.east();
        }
        if (world.getBlockState(blockPos.south()).getBlock() instanceof BlockChest && type.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.south()).getBlock()).chestType)) {
            blockPos2 = blockPos.south();
        }
        if (world.getBlockState(blockPos.west()).getBlock() instanceof BlockChest && type.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.west()).getBlock()).chestType)) {
            blockPos2 = blockPos.west();
        }
        if (blockPos2 == null) {
            return;
        }
        for (Map.Entry entry : c.entrySet()) {
            EntityPlayerMP entityPlayerMP;
            ax.a$a a$a2 = (ax.a$a)entry.getValue();
            if (!a$a2.i.contains(blockPos2)) continue;
            a$a2.i.add(blockPos);
            UUID uUID = ax.b((UUID)entry.getKey());
            if (uUID == null || (entityPlayerMP = (EntityPlayerMP)world.getPlayerEntityByUUID(uUID)) == null) continue;
            ge.b.sendTo((IMessage)new h6(blockPos, true), entityPlayerMP);
        }
    }

    @SubscribeEvent
    public void a(EntityJoinWorldEvent entityJoinWorldEvent) {
        EntityZombie entityZombie;
        Entity entity = entityJoinWorldEvent.getEntity();
        if (entity instanceof EntityZombie) {
            entityZombie = (EntityZombie)entity;
            entityZombie.targetTasks.addTask(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, false));
        }
        if (entity instanceof AbstractSkeleton) {
            entityZombie = (AbstractSkeleton)entity;
            entityZombie.targetTasks.addTask(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, false));
        }
        if (entity instanceof EntitySpider) {
            entityZombie = (EntitySpider)entity;
            entityZombie.targetTasks.addTask(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, true));
        }
    }

    @SubscribeEvent
    public void a(BlockEvent.BreakEvent breakEvent) {
        Object object;
        Object object2;
        ax.a$a a$a2;
        BlockPos blockPos = breakEvent.getPos();
        World world = breakEvent.getWorld();
        if (world.isRemote) {
            return;
        }
        IBlockState iBlockState = world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        if (block instanceof BlockChest) {
            for (Map.Entry entry : c.entrySet()) {
                a$a2 = (ax.a$a)entry.getValue();
                if (!a$a2.i.contains(blockPos)) continue;
                a$a2.i.remove(blockPos);
                object2 = ax.b((UUID)entry.getKey());
                if (object2 == null || (object = (EntityPlayerMP)world.getPlayerEntityByUUID((UUID)object2)) == null) continue;
                ge.b.sendTo((IMessage)new h6(blockPos, false), object);
            }
        }
        if (block instanceof BlockBed) {
            for (Map.Entry entry : c.entrySet()) {
                EntityPlayerMP entityPlayerMP;
                a$a2 = (ax.a$a)entry.getValue();
                if (!a$a2.b.contains(blockPos)) continue;
                object2 = cj.a(blockPos, iBlockState);
                a$a2.b.remove(blockPos);
                a$a2.b.remove(object2);
                object = ax.b((UUID)entry.getKey());
                if (object == null || (entityPlayerMP = (EntityPlayerMP)world.getPlayerEntityByUUID((UUID)object)) == null) continue;
                HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
                hashSet.add(blockPos);
                hashSet.add((BlockPos)object2);
                ge.b.sendTo((IMessage)new h6(hashSet, false), entityPlayerMP);
            }
        }
    }

    String a(String string, NBTTagCompound nBTTagCompound) {
        String string2 = nBTTagCompound.getString(string);
        nBTTagCompound.setString(string, "");
        return string2;
    }

    public void readFromNBT(NBTTagCompound nBTTagCompound) {
        String string;
        int n2 = 0;
        while (!"".equals(string = this.a("tribeId" + n2, nBTTagCompound))) {
            Object object;
            Object object2;
            Object object3;
            String string2;
            String string3;
            UUID uUID = UUID.fromString(string);
            EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf(this.a("tribeColor" + n2, nBTTagCompound));
            ax.a(uUID, eyeAndKoboldColor);
            String string4 = this.a("tribeMaster" + n2, nBTTagCompound);
            if (!"".equals(string4)) {
                ax.a(uUID, UUID.fromString(string4));
            }
            int n3 = 0;
            while (!"".equals(string3 = this.a(uUID.toString() + "member" + n3 + "pos", nBTTagCompound)) && !"".equals(string2 = this.a(uUID.toString() + "member" + n3 + "id", nBTTagCompound))) {
                object3 = string3.split("\\|");
                object2 = new BlockPos(Integer.parseInt(object3[0]), Integer.parseInt(object3[1]), Integer.parseInt(object3[2]));
                object = UUID.fromString(string2);
                ax.a(uUID, (UUID)object, (BlockPos)object2);
                ++n3;
            }
            int n4 = 0;
            while (!"".equals(string2 = this.a(uUID.toString() + "bed" + n4, nBTTagCompound))) {
                object3 = string2.split("\\|");
                object2 = new BlockPos(Integer.parseInt(object3[0]), Integer.parseInt(object3[1]), Integer.parseInt(object3[2]));
                ax.a(uUID, (BlockPos)object2);
                ++n4;
            }
            int n5 = 0;
            while (!"".equals(object3 = this.a(uUID.toString() + "chest" + n5, nBTTagCompound))) {
                object2 = ((String)object3).split("\\|");
                object = new BlockPos(Integer.parseInt(object2[0]), Integer.parseInt(object2[1]), Integer.parseInt(object2[2]));
                ax.f(uUID, (BlockPos)object);
                ++n5;
            }
            int n6 = 0;
            while (!"".equals(object2 = this.a(uUID.toString() + n6 + "taskKind", nBTTagCompound))) {
                String string5;
                object = this.a(uUID.toString() + n6 + "facing", nBTTagCompound);
                EnumFacing enumFacing = EnumFacing.NORTH;
                if (!"".equals(object)) {
                    enumFacing = EnumFacing.byName((String)object);
                }
                String string6 = this.a(uUID.toString() + n6 + "pos", nBTTagCompound);
                String[] stringArray = string6.split("\\|");
                BlockPos blockPos = new BlockPos(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]), Integer.parseInt(stringArray[2]));
                HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
                int n7 = 0;
                while (!"".equals(string5 = this.a(uUID.toString() + n6 + "block" + n7, nBTTagCompound))) {
                    String[] stringArray2 = string5.split("\\|");
                    BlockPos blockPos2 = new BlockPos(Integer.parseInt(stringArray2[0]), Integer.parseInt(stringArray2[1]), Integer.parseInt(stringArray2[2]));
                    hashSet.add(blockPos2);
                    ++n7;
                }
                ax.b(uUID, new bs(blockPos, bs.a$a.valueOf((String)object2), hashSet, enumFacing));
                ++n6;
            }
            ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public NBTTagCompound writeToNBT(NBTTagCompound nBTTagCompound) {
        int n2 = 0;
        for (Map.Entry entry : c.entrySet()) {
            Object object2;
            ax.a$a a$a2 = (ax.a$a)entry.getValue();
            UUID uUID = (UUID)entry.getKey();
            UUID uUID2 = a$a2.a();
            nBTTagCompound.setString("tribeId" + n2, uUID.toString());
            nBTTagCompound.setString("tribeColor" + n2, a$a2.h.toString());
            if (uUID2 != null) {
                nBTTagCompound.setString("tribeMaster" + n2, uUID2.toString());
            }
            int n3 = 0;
            HashSet<Object> hashSet = new HashSet<Object>();
            for (ff iterator2 : a$a2.a) {
                if (iterator2.isDead) continue;
                object2 = iterator2.getPosition();
                UUID uUID3 = iterator2.f();
                nBTTagCompound.setString(uUID.toString() + "member" + n3 + "pos", object2.getX() + "|" + object2.getY() + "|" + object2.getZ());
                nBTTagCompound.setString(uUID.toString() + "member" + n3 + "id", uUID3.toString());
                hashSet.add(uUID3);
                ++n3;
            }
            for (Map.Entry entry2 : a$a2.k.entrySet()) {
                object2 = (UUID)entry2.getKey();
                BlockPos blockPos = (BlockPos)entry2.getValue();
                if (hashSet.contains(object2)) continue;
                nBTTagCompound.setString(uUID.toString() + "member" + n3 + "pos", blockPos.getX() + "|" + blockPos.getY() + "|" + blockPos.getZ());
                nBTTagCompound.setString(uUID.toString() + "member" + n3 + "id", ((UUID)object2).toString());
                hashSet.add(object2);
                ++n3;
            }
            int n4 = 0;
            for (Object object2 : a$a2.b) {
                nBTTagCompound.setString(uUID.toString() + "bed" + n4, object2.getX() + "|" + object2.getY() + "|" + object2.getZ());
                ++n4;
            }
            boolean bl = false;
            object2 = a$a2.i.iterator();
            while (object2.hasNext()) {
                void n5;
                BlockPos blockPos = (BlockPos)object2.next();
                nBTTagCompound.setString(uUID.toString() + "chest" + (int)n5, blockPos.getX() + "|" + blockPos.getY() + "|" + blockPos.getZ());
                ++n5;
            }
            int n5 = 0;
            for (bs bs2 : a$a2.f) {
                nBTTagCompound.setString(uUID.toString() + n5 + "taskKind", bs2.c.toString());
                nBTTagCompound.setString(uUID.toString() + n5 + "pos", bs2.a.getX() + "|" + bs2.a.getY() + "|" + bs2.a.getZ());
                nBTTagCompound.setString(uUID.toString() + n5 + "facing", bs2.e.getName());
                int n6 = 0;
                for (BlockPos blockPos : bs2.b) {
                    nBTTagCompound.setString(uUID.toString() + n5 + "block" + n6, blockPos.getX() + "|" + blockPos.getY() + "|" + blockPos.getZ());
                    ++n6;
                }
                ++n5;
            }
            ++n2;
        }
        return nBTTagCompound;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
