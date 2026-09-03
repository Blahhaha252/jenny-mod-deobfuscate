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

public static class ax.b
extends WorldSavedData {
    public ax.b(String string) {
        super(string);
    }

    @SubscribeEvent
    public void a(WorldEvent.Save save) {
        World world = save.getWorld();
        world.func_175693_T().func_75745_a("tribes", (WorldSavedData)this);
        this.func_76185_a();
    }

    @SubscribeEvent
    public void a(WorldEvent.Load load) {
        World world = load.getWorld();
        world.func_175693_T().func_75742_a(ax.b.class, "tribes");
    }

    @SubscribeEvent
    public void a(PlayerSleepInBedEvent playerSleepInBedEvent) {
        try {
            if (ax.a(playerSleepInBedEvent.getPos())) {
                playerSleepInBedEvent.setResult(EntityPlayer.SleepResult.OTHER_PROBLEM);
            }
        }
        catch (RuntimeException runtimeException) {
            throw ax.b.a(runtimeException);
        }
    }

    @SubscribeEvent
    public void a(BlockEvent.PlaceEvent placeEvent) {
        BlockPos blockPos;
        World world;
        BlockPos blockPos2;
        block30: {
            BlockChest.Type type;
            block29: {
                block28: {
                    block27: {
                        blockPos2 = placeEvent.getPos();
                        IBlockState iBlockState = placeEvent.getState();
                        world = placeEvent.getWorld();
                        try {
                            if (world.field_72995_K) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw ax.b.a(runtimeException);
                        }
                        try {
                            if (!(iBlockState.func_177230_c() instanceof BlockChest)) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw ax.b.a(runtimeException);
                        }
                        type = ((BlockChest)world.func_180495_p((BlockPos)blockPos2).func_177230_c()).field_149956_a;
                        blockPos = null;
                        try {
                            if (!(world.func_180495_p(blockPos2.func_177978_c()).func_177230_c() instanceof BlockChest) || !type.equals((Object)((BlockChest)world.func_180495_p((BlockPos)blockPos2.func_177978_c()).func_177230_c()).field_149956_a)) break block27;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ax.b.a(runtimeException);
                        }
                        blockPos = blockPos2.func_177978_c();
                    }
                    try {
                        if (!(world.func_180495_p(blockPos2.func_177974_f()).func_177230_c() instanceof BlockChest) || !type.equals((Object)((BlockChest)world.func_180495_p((BlockPos)blockPos2.func_177974_f()).func_177230_c()).field_149956_a)) break block28;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ax.b.a(runtimeException);
                    }
                    blockPos = blockPos2.func_177974_f();
                }
                try {
                    if (!(world.func_180495_p(blockPos2.func_177968_d()).func_177230_c() instanceof BlockChest) || !type.equals((Object)((BlockChest)world.func_180495_p((BlockPos)blockPos2.func_177968_d()).func_177230_c()).field_149956_a)) break block29;
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                blockPos = blockPos2.func_177968_d();
            }
            try {
                if (!(world.func_180495_p(blockPos2.func_177976_e()).func_177230_c() instanceof BlockChest) || !type.equals((Object)((BlockChest)world.func_180495_p((BlockPos)blockPos2.func_177976_e()).func_177230_c()).field_149956_a)) break block30;
            }
            catch (RuntimeException runtimeException) {
                throw ax.b.a(runtimeException);
            }
            blockPos = blockPos2.func_177976_e();
        }
        try {
            if (blockPos == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ax.b.a(runtimeException);
        }
        for (Map.Entry entry : c.entrySet()) {
            ax.a a2 = (ax.a)entry.getValue();
            try {
                if (!a2.i.contains(blockPos)) {
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ax.b.a(runtimeException);
            }
            a2.i.add(blockPos2);
            UUID uUID = ax.b((UUID)entry.getKey());
            try {
                if (uUID == null) {
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ax.b.a(runtimeException);
            }
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)world.func_152378_a(uUID);
            try {
                if (entityPlayerMP == null) {
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ax.b.a(runtimeException);
            }
            ge.b.sendTo((IMessage)new h6(blockPos2, true), entityPlayerMP);
        }
    }

    @SubscribeEvent
    public void a(EntityJoinWorldEvent entityJoinWorldEvent) {
        EntityZombie entityZombie;
        Entity entity = entityJoinWorldEvent.getEntity();
        if (entity instanceof EntityZombie) {
            entityZombie = (EntityZombie)entity;
            entityZombie.field_70715_bh.func_75776_a(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, false));
        }
        if (entity instanceof AbstractSkeleton) {
            entityZombie = (AbstractSkeleton)entity;
            entityZombie.field_70715_bh.func_75776_a(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, false));
        }
        if (entity instanceof EntitySpider) {
            entityZombie = (EntitySpider)entity;
            entityZombie.field_70715_bh.func_75776_a(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, true));
        }
    }

    @SubscribeEvent
    public void a(BlockEvent.BreakEvent breakEvent) {
        Object object;
        Object object2;
        ax.a a2;
        BlockPos blockPos = breakEvent.getPos();
        World world = breakEvent.getWorld();
        try {
            if (world.field_72995_K) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ax.b.a(runtimeException);
        }
        IBlockState iBlockState = world.func_180495_p(blockPos);
        Block block = iBlockState.func_177230_c();
        if (block instanceof BlockChest) {
            for (Map.Entry entry : c.entrySet()) {
                a2 = (ax.a)entry.getValue();
                try {
                    if (!a2.i.contains(blockPos)) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                a2.i.remove(blockPos);
                object2 = ax.b((UUID)entry.getKey());
                try {
                    if (object2 == null) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                object = (EntityPlayerMP)world.func_152378_a((UUID)object2);
                try {
                    if (object == null) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                ge.b.sendTo((IMessage)new h6(blockPos, false), object);
            }
        }
        if (block instanceof BlockBed) {
            for (Map.Entry entry : c.entrySet()) {
                a2 = (ax.a)entry.getValue();
                try {
                    if (!a2.b.contains(blockPos)) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                object2 = cj.a(blockPos, iBlockState);
                a2.b.remove(blockPos);
                a2.b.remove(object2);
                object = ax.b((UUID)entry.getKey());
                try {
                    if (object == null) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                EntityPlayerMP entityPlayerMP = (EntityPlayerMP)world.func_152378_a((UUID)object);
                try {
                    if (entityPlayerMP == null) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
                hashSet.add(blockPos);
                hashSet.add((BlockPos)object2);
                ge.b.sendTo((IMessage)new h6(hashSet, false), entityPlayerMP);
            }
        }
    }

    String a(String string, NBTTagCompound nBTTagCompound) {
        String string2 = nBTTagCompound.func_74779_i(string);
        nBTTagCompound.func_74778_a(string, "");
        return string2;
    }

    public void func_76184_a(NBTTagCompound nBTTagCompound) {
        int n2 = 0;
        while (true) {
            Object object;
            Object object2;
            Object object3;
            String string;
            String string2 = this.a("tribeId" + n2, nBTTagCompound);
            try {
                if ("".equals(string2)) {
                    break;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ax.b.a(runtimeException);
            }
            UUID uUID = UUID.fromString(string2);
            EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf(this.a("tribeColor" + n2, nBTTagCompound));
            ax.a(uUID, eyeAndKoboldColor);
            String string3 = this.a("tribeMaster" + n2, nBTTagCompound);
            try {
                if (!"".equals(string3)) {
                    ax.a(uUID, UUID.fromString(string3));
                }
            }
            catch (RuntimeException runtimeException) {
                throw ax.b.a(runtimeException);
            }
            int n3 = 0;
            while (true) {
                String string4 = this.a(uUID.toString() + "member" + n3 + "pos", nBTTagCompound);
                try {
                    if ("".equals(string4)) {
                        break;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                string = this.a(uUID.toString() + "member" + n3 + "id", nBTTagCompound);
                try {
                    if ("".equals(string)) {
                        break;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                object3 = string4.split("\\|");
                object2 = new BlockPos(Integer.parseInt(object3[0]), Integer.parseInt(object3[1]), Integer.parseInt(object3[2]));
                object = UUID.fromString(string);
                ax.a(uUID, (UUID)object, (BlockPos)object2);
                ++n3;
            }
            int n4 = 0;
            while (true) {
                string = this.a(uUID.toString() + "bed" + n4, nBTTagCompound);
                try {
                    if ("".equals(string)) {
                        break;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                object3 = string.split("\\|");
                object2 = new BlockPos(Integer.parseInt(object3[0]), Integer.parseInt(object3[1]), Integer.parseInt(object3[2]));
                ax.a(uUID, (BlockPos)object2);
                ++n4;
            }
            int n5 = 0;
            while (true) {
                object3 = this.a(uUID.toString() + "chest" + n5, nBTTagCompound);
                try {
                    if ("".equals(object3)) {
                        break;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                object2 = ((String)object3).split("\\|");
                object = new BlockPos(Integer.parseInt(object2[0]), Integer.parseInt(object2[1]), Integer.parseInt(object2[2]));
                ax.f(uUID, (BlockPos)object);
                ++n5;
            }
            int n6 = 0;
            while (true) {
                object2 = this.a(uUID.toString() + n6 + "taskKind", nBTTagCompound);
                try {
                    if ("".equals(object2)) {
                        break;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                object = this.a(uUID.toString() + n6 + "facing", nBTTagCompound);
                EnumFacing enumFacing = EnumFacing.NORTH;
                if (!"".equals(object)) {
                    enumFacing = EnumFacing.func_176739_a((String)object);
                }
                String string5 = this.a(uUID.toString() + n6 + "pos", nBTTagCompound);
                String[] stringArray = string5.split("\\|");
                BlockPos blockPos = new BlockPos(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]), Integer.parseInt(stringArray[2]));
                HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
                int n7 = 0;
                while (true) {
                    String string6 = this.a(uUID.toString() + n6 + "block" + n7, nBTTagCompound);
                    try {
                        if ("".equals(string6)) {
                            break;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw ax.b.a(runtimeException);
                    }
                    String[] stringArray2 = string6.split("\\|");
                    BlockPos blockPos2 = new BlockPos(Integer.parseInt(stringArray2[0]), Integer.parseInt(stringArray2[1]), Integer.parseInt(stringArray2[2]));
                    hashSet.add(blockPos2);
                    ++n7;
                }
                ax.b(uUID, new bs(blockPos, bs.a.valueOf((String)object2), hashSet, enumFacing));
                ++n6;
            }
            ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public NBTTagCompound func_189551_b(NBTTagCompound nBTTagCompound) {
        int n2 = 0;
        for (Map.Entry entry : c.entrySet()) {
            Object object2;
            ax.a a2 = (ax.a)entry.getValue();
            UUID uUID = (UUID)entry.getKey();
            UUID uUID2 = a2.a();
            try {
                nBTTagCompound.func_74778_a("tribeId" + n2, uUID.toString());
                nBTTagCompound.func_74778_a("tribeColor" + n2, a2.h.toString());
                if (uUID2 != null) {
                    nBTTagCompound.func_74778_a("tribeMaster" + n2, uUID2.toString());
                }
            }
            catch (RuntimeException runtimeException) {
                throw ax.b.a(runtimeException);
            }
            int n3 = 0;
            HashSet<Object> hashSet = new HashSet<Object>();
            for (ff iterator2 : a2.a) {
                try {
                    if (iterator2.field_70128_L) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                object2 = iterator2.func_180425_c();
                UUID uUID3 = iterator2.f();
                nBTTagCompound.func_74778_a(uUID.toString() + "member" + n3 + "pos", object2.func_177958_n() + "|" + object2.func_177956_o() + "|" + object2.func_177952_p());
                nBTTagCompound.func_74778_a(uUID.toString() + "member" + n3 + "id", uUID3.toString());
                hashSet.add(uUID3);
                ++n3;
            }
            for (Map.Entry entry2 : a2.k.entrySet()) {
                object2 = (UUID)entry2.getKey();
                BlockPos blockPos = (BlockPos)entry2.getValue();
                try {
                    if (hashSet.contains(object2)) {
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ax.b.a(runtimeException);
                }
                nBTTagCompound.func_74778_a(uUID.toString() + "member" + n3 + "pos", blockPos.func_177958_n() + "|" + blockPos.func_177956_o() + "|" + blockPos.func_177952_p());
                nBTTagCompound.func_74778_a(uUID.toString() + "member" + n3 + "id", ((UUID)object2).toString());
                hashSet.add(object2);
                ++n3;
            }
            int n4 = 0;
            for (Object object2 : a2.b) {
                nBTTagCompound.func_74778_a(uUID.toString() + "bed" + n4, object2.func_177958_n() + "|" + object2.func_177956_o() + "|" + object2.func_177952_p());
                ++n4;
            }
            boolean bl = false;
            object2 = a2.i.iterator();
            while (object2.hasNext()) {
                void n5;
                BlockPos blockPos = (BlockPos)object2.next();
                nBTTagCompound.func_74778_a(uUID.toString() + "chest" + (int)n5, blockPos.func_177958_n() + "|" + blockPos.func_177956_o() + "|" + blockPos.func_177952_p());
                ++n5;
            }
            int n5 = 0;
            for (bs bs2 : a2.f) {
                nBTTagCompound.func_74778_a(uUID.toString() + n5 + "taskKind", bs2.c.toString());
                nBTTagCompound.func_74778_a(uUID.toString() + n5 + "pos", bs2.a.func_177958_n() + "|" + bs2.a.func_177956_o() + "|" + bs2.a.func_177952_p());
                nBTTagCompound.func_74778_a(uUID.toString() + n5 + "facing", bs2.e.func_176610_l());
                int n6 = 0;
                for (BlockPos blockPos : bs2.b) {
                    nBTTagCompound.func_74778_a(uUID.toString() + n5 + "block" + n6, blockPos.func_177958_n() + "|" + blockPos.func_177956_o() + "|" + blockPos.func_177952_p());
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
