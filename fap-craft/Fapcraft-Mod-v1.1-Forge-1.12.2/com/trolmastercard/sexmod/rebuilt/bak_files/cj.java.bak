/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 *  com.google.common.collect.UnmodifiableIterator
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBed$EnumPartType
 *  net.minecraft.block.properties.PropertyDirection
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.FMLCommonHandler
 */
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

    public static Vec3d a(EntityLivingBase entityLivingBase, float f) {
        World world = entityLivingBase.field_70170_p;
        if (world instanceof gj) {
            return new Vec3d(0.0, 1.0, 0.0);
        }
        BlockPos blockPos = new BlockPos(Math.floor(entityLivingBase.field_70165_t), Math.floor(entityLivingBase.field_70163_u), Math.floor(entityLivingBase.field_70161_v));
        HashMap<Vec3d, Integer> hashMap = new HashMap<Vec3d, Integer>();
        int n = 0;
        for (int i = -1; i < 2; ++i) {
            for (int j = -1; j < 2; ++j) {
                for (int k = -1; k < 2; ++k) {
                    int n2 = world.func_175721_c(blockPos.func_177982_a(i, j, k), false);
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
            vec3d = new Vec3d(vec3d.field_72450_a, vec3d.field_72448_b, -vec3d.field_72449_c);
            float f2 = -b6.a(entityLivingBase.field_70760_ar, entityLivingBase.field_70761_aq, f);
            vec3d = ck.a(vec3d, f2);
        }
        return vec3d.func_72432_b();
    }

    public static int a(World world, int n, int n2) {
        HashSet hashSet = Sets.newHashSet((Object[])new Block[]{Blocks.field_150349_c, Blocks.field_150354_m, Blocks.field_180395_cM, Blocks.field_150355_j, Blocks.field_150348_b, Blocks.field_150347_e});
        int n3 = world.func_72800_K();
        boolean bl = false;
        while (!bl && n3-- >= 0) {
            Block block = world.func_180495_p(new BlockPos(n, n3, n2)).func_177230_c();
            bl = hashSet.contains(block);
        }
        return n3;
    }

    public static BlockPos a(World world, BlockPos blockPos) {
        return new BlockPos(blockPos.func_177958_n(), cj.a(world, blockPos.func_177958_n(), blockPos.func_177952_p()), blockPos.func_177952_p());
    }

    public static boolean b(World world, BlockPos blockPos) {
        return cj.a(world, blockPos, null, null, null);
    }

    public static boolean a(World world, BlockPos blockPos, Vec3d vec3d, EnumFacing enumFacing, EntityPlayer entityPlayer) {
        Object object;
        IBlockState iBlockState = world.func_180495_p(blockPos);
        Block block = iBlockState.func_177230_c();
        if (block.isBed(iBlockState, (IBlockAccess)world, blockPos, null)) {
            return true;
        }
        TileEntity tileEntity = world.func_175625_s(blockPos);
        if (tileEntity != null && (object = tileEntity.func_145748_c_()) != null && (object.toString().contains(" bed") || object.toString().contains("bed "))) {
            return true;
        }
        if (enumFacing == null || vec3d == null) {
            return false;
        }
        object = block.getPickBlock(iBlockState, new RayTraceResult(vec3d, enumFacing), world, blockPos, entityPlayer).func_82833_r().toLowerCase();
        return ((String)object).contains(" bed") || ((String)object).contains("bed ");
    }

    public static void a(World world, EnumParticleTypes enumParticleTypes, Vec3d vec3d, int n, double d, double d2) {
        for (int i = 0; i < n; ++i) {
            float f = (float)i / (float)n;
            double d3 = Math.PI * 2 * (double)f;
            double d4 = Math.sin(d3);
            double d5 = Math.cos(d3);
            world.func_175688_a(enumParticleTypes, vec3d.field_72450_a + (d4 *= d), vec3d.field_72448_b, vec3d.field_72449_c + (d5 *= d), 0.0, (double)r.f.nextFloat() * d2, 0.0, new int[0]);
        }
    }

    public static BlockPos a(BlockPos blockPos, IBlockState iBlockState) {
        ImmutableMap immutableMap = iBlockState.func_177228_b();
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
                unmodifiableIterator = blockPos.func_177978_c();
            }
            if (enumFacing == EnumFacing.EAST) {
                unmodifiableIterator = blockPos.func_177974_f();
            }
            if (enumFacing == EnumFacing.SOUTH) {
                unmodifiableIterator = blockPos.func_177968_d();
            }
            if (enumFacing == EnumFacing.WEST) {
                unmodifiableIterator = blockPos.func_177976_e();
            }
        } else {
            if (enumFacing == EnumFacing.NORTH) {
                unmodifiableIterator = blockPos.func_177968_d();
            }
            if (enumFacing == EnumFacing.EAST) {
                unmodifiableIterator = blockPos.func_177976_e();
            }
            if (enumFacing == EnumFacing.SOUTH) {
                unmodifiableIterator = blockPos.func_177978_c();
            }
            if (enumFacing == EnumFacing.WEST) {
                unmodifiableIterator = blockPos.func_177974_f();
            }
        }
        if (unmodifiableIterator == null) {
            System.out.println("bed is fucked up - it appears to be positioned vertically (wtf?)");
            return null;
        }
        return unmodifiableIterator;
    }

    public static Set<? extends EntityPlayer> a(Entity entity) {
        if (entity == null) {
            return Collections.emptySet();
        }
        return FMLCommonHandler.instance().getMinecraftServerInstance().func_71218_a(entity.field_71093_bK).func_73039_n().getTrackingPlayers(entity);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
