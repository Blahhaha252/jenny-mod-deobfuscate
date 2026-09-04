/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLog
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.bs;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.fp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class bs {
    public static final int d = 30;
    BlockPos a;
    a.a c;
    HashSet<BlockPos> b;
    List<ff> f = new ArrayList<ff>();
    EnumFacing e = EnumFacing.NORTH;

    public bs(BlockPos blockPos, a.a a2, HashSet<BlockPos> hashSet) {
        this.a = blockPos;
        this.c = a2;
        this.b = hashSet;
    }

    public bs(BlockPos blockPos, a.a a2, HashSet<BlockPos> hashSet, EnumFacing enumFacing) {
        this.a = blockPos;
        this.c = a2;
        this.b = hashSet;
        this.e = enumFacing;
    }

    public EnumFacing f() {
        return this.e;
    }

    public BlockPos b() {
        return this.a;
    }

    public a.a d() {
        return this.c;
    }

    public HashSet<BlockPos> g() {
        return this.b;
    }

    public void b(BlockPos blockPos) {
        this.b.add(blockPos);
    }

    public void a(HashSet<BlockPos> hashSet) {
        this.b.addAll(hashSet);
    }

    public void a(BlockPos blockPos) {
        this.b.remove(blockPos);
    }

    public void b(HashSet<BlockPos> hashSet) {
        block0: {
            if (hashSet.isEmpty()) break block0;
            this.b.removeAll(hashSet);
        }
    }

    public boolean c(BlockPos blockPos) {
        return this.b.contains(blockPos);
    }

    public boolean a(ff ff2) {
        if (this.c.a <= this.f.size()) {
            return false;
        }
        this.f.add(ff2);
        return true;
    }

    public List<ff> c() {
        return this.f;
    }

    public void a() {
        for (ff ff2 : this.f) {
            if (ff2.ae() != null) continue;
            ff2.func_189654_d(false);
            ff2.field_70145_X = false;
            ff2.b(fp.NULL);
            ff2.func_184212_Q().func_187227_b(em.G, (Object)false);
        }
        this.f.clear();
    }

    public void c(ff ff2) {
        this.f.remove(ff2);
    }

    public boolean e() {
        return this.c.a <= this.f.size();
    }

    public boolean b(ff ff2) {
        return this.f.contains(ff2);
    }

    public static HashSet<BlockPos> a(World world, BlockPos blockPos, UUID uUID) {
        BlockPos blockPos2 = blockPos;
        while (!bs.c(world, blockPos2)) {
            blockPos2 = blockPos.func_177977_b();
        }
        BlockPos blockPos3 = blockPos;
        while (!bs.b(world, blockPos3)) {
            blockPos3 = blockPos3.func_177984_a();
        }
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        int n = blockPos3.func_177956_o() - blockPos2.func_177956_o();
        for (int i = 0; i <= n; ++i) {
            hashSet.add(blockPos2.func_177982_a(0, i, 0));
        }
        HashSet<BlockPos> hashSet2 = bs.a(world, blockPos2);
        HashSet<BlockPos> hashSet3 = new HashSet<BlockPos>();
        for (BlockPos object2 : hashSet2) {
            if (object2.func_177958_n() != blockPos2.func_177958_n() || object2.func_177952_p() != blockPos2.func_177952_p()) continue;
            hashSet3.add(object2);
        }
        for (BlockPos blockPos4 : hashSet3) {
            hashSet2.remove(blockPos4);
        }
        hashSet.addAll(hashSet2);
        HashSet hashSet4 = new HashSet();
        block5: for (BlockPos blockPos5 : hashSet) {
            for (bs bs2 : ax.p(uUID)) {
                HashSet<BlockPos> hashSet5 = bs2.g();
                if (!hashSet5.contains(blockPos5)) continue;
                hashSet4.add(blockPos5);
                continue block5;
            }
        }
        hashSet.removeAll(hashSet4);
        bs bs3 = new bs(blockPos2, a.a.FALL_TREE, hashSet);
        ax.b(uUID, bs3);
        return hashSet;
    }

    static boolean b(World world, BlockPos blockPos) {
        Block block = world.func_180495_p(blockPos.func_177984_a()).func_177230_c();
        return !(block instanceof BlockLog);
    }

    static boolean c(World world, BlockPos blockPos) {
        IBlockState iBlockState = world.func_180495_p(blockPos.func_177977_b());
        return !(iBlockState instanceof BlockLog) && iBlockState.func_185904_a() != Material.field_151579_a;
    }

    static HashSet<BlockPos> a(World world, BlockPos blockPos) {
        return bs.a(world, blockPos, new HashSet<BlockPos>());
    }

    static HashSet<BlockPos> a(World world, BlockPos blockPos, HashSet<BlockPos> hashSet) {
        block17: {
            if (hashSet.contains(blockPos)) {
                return new HashSet<BlockPos>();
            }
            hashSet.add(blockPos);
            if (world.func_180495_p(blockPos.func_177982_a(1, 0, 0)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(1, 0, 0), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, 0, 0)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(-1, 0, 0), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(0, 0, 1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(0, 0, 1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(0, 0, -1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(0, 0, -1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(1, 0, 1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(1, 0, 1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, 0, -1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(-1, 0, -1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, 0, 1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(-1, 0, 1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(1, 0, -1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(1, 0, -1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(0, 1, 0)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(0, 1, 0), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(1, 1, 0)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(1, 1, 0), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, 1, 0)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(-1, 1, 0), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(0, 1, 1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(0, 1, 1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(0, 1, -1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(0, 1, -1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(1, 1, 1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(1, 1, 1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, 1, -1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(-1, 1, -1), hashSet));
            }
            if (world.func_180495_p(blockPos.func_177982_a(-1, 1, 1)).func_177230_c() instanceof BlockLog) {
                hashSet.addAll(bs.a(world, blockPos.func_177982_a(-1, 1, 1), hashSet));
            }
            if (!(world.func_180495_p(blockPos.func_177982_a(1, 1, -1)).func_177230_c() instanceof BlockLog)) break block17;
            hashSet.addAll(bs.a(world, blockPos.func_177982_a(1, 1, -1), hashSet));
        }
        return hashSet;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
