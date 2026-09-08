package com.trolmastercard.sexmod;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class cj {
    public static float a(float f, float f2) {
        f = gc.b(f);
        f2 = gc.b(f2);
        float f3 = Math.abs(f - f2);
        float f4 = 360.0f - f3;
        float f5 = Math.min(f3, f4);
        if (f > f2) {
            return -f5;
        }
        return f5;
    }
    // was public static Vec3d a(EntityLivingBase entityLivingBase, float f) {
    public static Vec3d getLightDirection(EntityLivingBase entityLivingBase, float f) {
        World world = entityLivingBase.world;
        if (world instanceof gj) {
            return new Vec3d(0.0, 1.0, 0.0);
        }
        BlockPos blockPos = new BlockPos(Math.floor(entityLivingBase.posX), Math.floor(entityLivingBase.posY), Math.floor(entityLivingBase.posZ));
        HashMap<Vec3d, Integer> hashMap = new HashMap<Vec3d, Integer>();
        int n = 0;
        for (int i = -1; i < 2; ++i) {
            for (int j = -1; j < 2; ++j) {
                for (int k = -1; k < 2; ++k) {
                    int n2 = world.getLight(blockPos.add(i, j, k), false);
                    hashMap.put(new Vec3d((double)i, (double)j, (double)k), n2);
                    if (n2 <= n) continue;
                    n = n2;
                }
            }
        }
        Vec3d vec3d = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            if ((Integer)entry.getValue() != n) continue;
            if (vec3d == null) {
                vec3d = (Vec3d)entry.getKey();
                continue;
            }
            vec3d = null;
            break;
        }
        if (vec3d == null) {
            vec3d = new Vec3d(0.2, 0.8, 0.0);
        } else {
            vec3d = new Vec3d(vec3d.x, vec3d.y, -vec3d.z);
            float f2 = -b6.a(entityLivingBase.prevRenderYawOffset, entityLivingBase.renderYawOffset, f);
            vec3d = ck.a(vec3d, f2);
        }
        return vec3d.normalize();
    }
    // was public static int a(World world, int n, int n2)
    public static int getTerrainY(World world, int blockX, int blockZ) {
        HashSet = validBlocks = Sets.netHashSet((object[])new Block[] {Blocks.GRASS, Blocks.SAND, Blocks.RED_SANDSTONE, Blocks.WATER, Blocks.STONE, Blocks.COBBLESTONE});
        int height = world.getHeight();
        boolean contains = false;
        while (!contains && height-- >= 0) {
            Block block = world.getBlockState(new Blockpos(blockX, height, blockZ)).getBlock();
            contains = hashset.contains(block);
        }
        return height;
    }

    public static BlockPos a(World world, BlockPos blockPos) {
        return new BlockPos(blockPos.getX(), cj.a(world, blockPos.getX(), blockPos.getZ()), blockPos.getZ());
    }
    // was public static boolean b(World world, BlockPos blockPos) {
    public static boolean isBedBlock(World world, BlockPos blockPos) {
        return cj.a(world, blockPos, null, null, null);
    }
    // was public static boolean a(World world, BlockPos blockPos, Vec3d vec3d, EnumFacing enumFacing, EntityPlayer entityPlayer) {
    public static boolean isBedBlock(World world, BlockPos blockPos, Vec3d vec3d, EnumFacing enumFacing, EntityPlayer entityPlayer) {
        Object object;
        IBlockState iBlockState = world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        if (block.isBed(iBlockState, (IBlockAccess)world, blockPos, null)) {
            return true;
        }
        TileEntity tileEntity = world.getTileEntity(blockPos);
        if (tileEntity != null && (object = tileEntity.getDisplayName()) != null && (object.toString().contains(" bed") || object.toString().contains("bed "))) {
            return true;
        }
        if (enumFacing == null || vec3d == null) {
            return false;
        }
        object = block.getPickBlock(iBlockState, new RayTraceResult(vec3d, enumFacing), world, blockPos, entityPlayer).getDisplayName().toLowerCase();
        return ((String)object).contains(" bed") || ((String)object).contains("bed ");
    }
    //was public static void a(World world, EnumParticleTypes enumParticleTypes, Vec3d vec3d, int n, double d, double d2)
    public static void spawnParticleRing(World world, EnumParticleTypes enumParticleTypes, Vec3d vec3d, int n, double d, double d2) {
        for (int i = 0; i < n; ++i) {
            float f = (float)i / (float)n;
            double d3 = Math.PI * 2 * (double)f;
            double d4 = Math.sin(d3);
            double d5 = Math.cos(d3);
            world.spawnParticle(enumParticleTypes, vec3d.x + (d4 *= d), vec3d.y, vec3d.z + (d5 *= d), 0.0, (double)r.f.nextFloat() * d2, 0.0, new int[0]);
        }
    }

    //was public static BlockPos a(BlockPos blockPos, IBlockState iBlockState) {
    public static BlockPos getOtherBedHalf(BlockPos blockPos, IBlockState iBlockState) {
        ImmutableMap immutableMap = iBlockState.getProperties();
        EnumFacing enumFacing = null;
        BlockBed.EnumPartType enumPartType = null;
        for (Map.Entry entry : immutableMap.entrySet()) {
            if (entry.getKey() instanceof PropertyDirection) {
                enumFacing = (EnumFacing)entry.getValue();
                continue;
            }
            if (!(entry.getKey() instanceof PropertyEnum)) continue;
            enumPartType = (BlockBed.EnumPartType)entry.getValue();
        }
        if (enumFacing == null) {
            System.out.println("bed is fucked up - it has no facing value");
            return null;
        }
        if (enumPartType == null) {
            System.out.println("bed is fucked up - it has no partType value");
            return null;
        }
        UnmodifiableIterator unmodifiableIterator = null;
        if (enumPartType == BlockBed.EnumPartType.FOOT) {
            if (enumFacing == EnumFacing.NORTH) {
                unmodifiableIterator = blockPos.north();
            }
            if (enumFacing == EnumFacing.EAST) {
                unmodifiableIterator = blockPos.east();
            }
            if (enumFacing == EnumFacing.SOUTH) {
                unmodifiableIterator = blockPos.south();
            }
            if (enumFacing == EnumFacing.WEST) {
                unmodifiableIterator = blockPos.west();
            }
        } else {
            if (enumFacing == EnumFacing.NORTH) {
                unmodifiableIterator = blockPos.south();
            }
            if (enumFacing == EnumFacing.EAST) {
                unmodifiableIterator = blockPos.west();
            }
            if (enumFacing == EnumFacing.SOUTH) {
                unmodifiableIterator = blockPos.north();
            }
            if (enumFacing == EnumFacing.WEST) {
                unmodifiableIterator = blockPos.east();
            }
        }
        if (unmodifiableIterator == null) {
            System.out.println("bed is fucked up - it appears to be positioned vertically (wtf?)");
            return null;
        }
        return unmodifiableIterator;
    }

    public static Set<? extends EntityPlayer> getTrackingPlayers(Entity entity) {
        if (entity == null) {
            return Collections.emptySet();
        }
        return FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(entity.dimension).getEntityTracker().getTrackingPlayers(entity);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
