/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Biomes
 *  net.minecraft.init.Blocks
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.Rotation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.world.chunk.IChunkProvider
 *  net.minecraft.world.gen.IChunkGenerator
 *  net.minecraft.world.storage.WorldSavedData
 *  net.minecraftforge.event.world.WorldEvent$Load
 *  net.minecraftforge.event.world.WorldEvent$Save
 *  net.minecraftforge.fml.common.IWorldGenerator
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.b4;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.e1;
import com.trolmastercard.sexmod.e3;
import com.trolmastercard.sexmod.g3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class g3
extends WorldSavedData
implements IWorldGenerator {
    static final String j = "sexmod:generation";
    static final int h = 156;
    static final int a = 62;
    static final int b = 6;
    final double f = 0.004f;
    public static boolean i = true;
    final List<b.b> e = new ArrayList<b.b>();
    final List<a$a> d = new ArrayList<a$a>();
    private static g3 g = null;
    static boolean c = true;

    public static g3 b() {
        block0: {
            if (g != null) break block0;
            g = new g3();
        }
        return g;
    }

    public g3(String string) {
        this();
    }

    private g3() {
        super(j);
        g = this;
        this.e.add(new b.b("ellie", new HashSet<Biome>(Arrays.asList(Biomes.field_150578_U, Biomes.field_150584_S, Biomes.field_76768_g, Biomes.field_150585_R)), new Vec3i(30, 27, 26), 9, true));
        this.e.add(new b.b("jenny", new HashSet<Biome>(Arrays.asList(Biomes.field_76772_c, Biomes.field_76767_f)), new Vec3i(9, 4, 9), 1, true));
        this.e.add(new b.b("ellie", new HashSet<Biome>(Arrays.asList(Biomes.field_150578_U, Biomes.field_150584_S, Biomes.field_76768_g, Biomes.field_150585_R)), new Vec3i(30, 27, 26), 9, true));
        this.e.add(new b.b("bia", new HashSet<Biome>(Arrays.asList(Biomes.field_185448_Z, Biomes.field_150583_P)), new Vec3i(11, 9, 15), 2, true));
        this.e.add(new b.b("luna", new HashSet<Biome>(Arrays.asList(Biomes.field_76771_b, Biomes.field_150575_M)), new Vec3i(3, 7, 10), 0, false));
    }

    public void a() {
        this.d.clear();
    }

    @SubscribeEvent
    public void a(WorldEvent.Save save) {
        World world = save.getWorld();
        world.func_175693_T().func_75745_a(j, (WorldSavedData)this);
        this.func_76185_a();
    }

    @SubscribeEvent
    public void a(WorldEvent.Load load) {
        World world = load.getWorld();
        world.func_175693_T().func_75742_a(g3.class, j);
    }

    public void func_76184_a(NBTTagCompound nBTTagCompound) {
        this.a();
        NBTTagCompound nBTTagCompound2 = nBTTagCompound.func_74775_l(j);
        int n = 0;
        while (true) {
            String string = nBTTagCompound2.func_74779_i("sexmod:name" + n);
            String string2 = nBTTagCompound2.func_74779_i("sexmod:pos" + n);
            if ("".equals(string) || "".equals(string2)) break;
            this.d.add(new a$a(g3.a(string2), string));
            ++n;
        }
    }

    public NBTTagCompound func_189551_b(NBTTagCompound nBTTagCompound) {
        nBTTagCompound.func_74782_a(j, (NBTBase)new NBTTagCompound());
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        int n = 0;
        for (a$a a$a2 : this.d) {
            nBTTagCompound2.func_74778_a("sexmod:name" + n, a$a2.a);
            nBTTagCompound2.func_74778_a("sexmod:pos" + n++, g3.a(a$a2.b));
        }
        nBTTagCompound.func_74782_a(j, (NBTBase)nBTTagCompound2);
        return nBTTagCompound;
    }

    static String a(e1 e12) {
        return e12.c + "|" + e12.b;
    }

    static e1 a(String string) {
        String[] stringArray = string.split("\\|");
        return new e1(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]));
    }

    public void generate(Random random, int n, int n2, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        if (!i) {
            return;
        }
        if (world.func_175624_G() == WorldType.field_77138_c) {
            return;
        }
        this.b(world, random, n, n2);
        this.a(world, random, n, n2);
        this.a(random, n, n2, world);
    }

    void a(Random random, int n, int n2, World world) {
        if (!c) {
            return;
        }
        c = false;
        for (b.b b2 : this.e) {
            this.a(b2, random, n, n2, world);
        }
        c = true;
    }

    void a(b.b b2, Random random, int n, int n2, World world) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        for (a$a a$a2 : this.d) {
            int n9 = n8 = a$a2.a.equals(b2.f) ? 156 : 62;
            if (!(a$a2.b.a(n, n2) < (float)n8)) continue;
            return;
        }
        int n10 = b2.c.func_177958_n();
        n8 = n * 16 + (16 - n10) / 2;
        Biome biome = world.field_73011_w.getBiomeForCoords(new BlockPos(n8, 80, n7 = n2 * 16 + (16 - (n6 = b2.c.func_177952_p())) / 2));
        if (!b2.e.contains(biome)) {
            return;
        }
        int n11 = Integer.MIN_VALUE;
        int n12 = Integer.MAX_VALUE;
        for (n5 = n8; n5 < n8 + n10; ++n5) {
            for (n4 = n7; n4 < n7 + n6; ++n4) {
                n3 = cj.a(world, n5, n4);
                if (b2.d && world.func_180495_p(new BlockPos(n5, n3, n4)).func_177230_c() == Blocks.field_150355_j) {
                    return;
                }
                if (n3 > n11) {
                    n11 = n3;
                }
                if (n3 >= n12) continue;
                n12 = n3;
            }
        }
        if (n11 - n12 > b2.a) {
            return;
        }
        n5 = n11;
        this.d.add(new a$a(new e1(n, n2), b2.f));
        b2.b.func_180709_b(world, random, new BlockPos(n8, n5, n7));
        if (!b2.d) {
            return;
        }
        n4 = 1;
        n3 = n5 - 1;
        while (n4 != 0) {
            n4 = 0;
            Vec3i vec3i = new Vec3i(n10 + 2, 0, n6 + 2);
            --n7;
            for (int i = --n8; i < n8 + vec3i.func_177958_n(); ++i) {
                for (int j = n7; j < n7 + vec3i.func_177952_p(); ++j) {
                    BlockPos blockPos = new BlockPos(i, n3, j);
                    IBlockState iBlockState = world.func_180495_p(blockPos);
                    if (!iBlockState.func_177230_c().func_176205_b((IBlockAccess)world, blockPos)) continue;
                    iBlockState = world.func_175678_i(blockPos) ? Blocks.field_150349_c.func_176223_P() : Blocks.field_150346_d.func_176223_P();
                    world.func_175656_a(blockPos, iBlockState);
                    n4 = 1;
                }
            }
            --n3;
        }
    }

    void b(World world, Random random, int n, int n2) {
        if (random.nextDouble() > (double)0.004f) {
            return;
        }
        int n3 = n * 16 + 8;
        int n4 = n2 * 16 + 8;
        int n5 = cj.a(world, n3, n4);
        if (world.func_180495_p(new BlockPos(n3, n5, n4)).func_185904_a().func_76224_d()) {
            return;
        }
        ax.a(world, new Vec3d((double)n3, (double)n5, (double)n4));
    }

    void a(World world, Random random, int n, int n2) {
        Vec3d vec3d;
        Material material;
        BlockPos blockPos;
        int n3 = 16 * n + 3;
        int n4 = 16 * n2 + 3;
        int n5 = random.nextInt(255);
        BlockPos blockPos2 = new BlockPos(n3, n5, n4);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        for (int i = 0; i <= e3.ah.func_177958_n(); ++i) {
            for (int j = -1; j <= e3.ah.func_177956_o(); ++j) {
                for (int k = 0; k <= e3.ah.func_177952_p(); ++k) {
                    blockPos = blockPos2.func_177982_a(i, j, k);
                    material = world.func_180495_p(blockPos).func_185904_a();
                    boolean bl = material.func_76220_a();
                    if (!(bl || j != -1 && j != e3.ah.func_177956_o())) {
                        return;
                    }
                    if (i != 0 && i != e3.ah.func_177958_n() && k != 0 && k != e3.ah.func_177952_p() || j != 0 || !world.func_175623_d(blockPos) || !world.func_175623_d(blockPos.func_177984_a())) continue;
                    arrayList.add(blockPos);
                }
            }
        }
        if (arrayList.size() == 0 || arrayList.size() > 4) {
            return;
        }
        BlockPos blockPos3 = null;
        Rotation rotation = arrayList.iterator();
        while (rotation.hasNext()) {
            BlockPos blockPos4;
            blockPos = blockPos4 = (BlockPos)rotation.next();
            material = blockPos2.func_177982_a(6, 0, 6);
            if (Math.abs((blockPos = blockPos.func_177973_b((Vec3i)material)).func_177958_n()) == Math.abs(blockPos.func_177952_p()) || Math.abs(blockPos.func_177958_n()) == Math.abs(blockPos.func_177952_p()) - 1 || Math.abs(blockPos.func_177958_n()) - 1 == Math.abs(blockPos.func_177952_p())) continue;
            blockPos3 = blockPos;
            break;
        }
        if (blockPos3 == null) {
            return;
        }
        blockPos = new Vec3i(0, 0, 0);
        float f = 0.0f;
        if (blockPos3.func_177952_p() == -6) {
            rotation = Rotation.NONE;
            vec3d = e3.aB;
            f = 180.0f;
        } else if (blockPos3.func_177958_n() == 5) {
            rotation = Rotation.CLOCKWISE_90;
            vec3d = e3.ao;
            blockPos = new Vec3i(e3.ah.func_177958_n() - 1, 0, 0);
            f = -90.0f;
        } else if (blockPos3.func_177952_p() == 5) {
            rotation = Rotation.CLOCKWISE_180;
            vec3d = e3.aM;
            blockPos = new Vec3i(e3.ah.func_177958_n() - 1, 0, e3.ah.func_177952_p() - 1);
        } else {
            rotation = Rotation.COUNTERCLOCKWISE_90;
            vec3d = e3.U;
            blockPos = new Vec3i(0, 0, e3.ah.func_177952_p() - 1);
            f = 90.0f;
        }
        new b4("goblin").a(world, blockPos2.func_177982_a(0, -1, 0).func_177971_a((Vec3i)blockPos), rotation);
        vec3d.func_72441_c((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p());
        vec3d = new Vec3d((double)blockPos2.func_177958_n() + vec3d.field_72450_a + 0.5, (double)blockPos2.func_177956_o() + vec3d.field_72448_b, (double)blockPos2.func_177952_p() + vec3d.field_72449_c + 0.5);
        e3 e32 = new e3(world, true, f, vec3d);
        e32.field_98038_p = true;
        world.func_72838_d((Entity)e32);
        world.func_72964_e(n, n2).func_76630_e();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    static class a$a {
        e1 b;
        String a;

        public a$a(e1 e12, String string) {
            this.b = e12;
            this.a = string;
        }
    }
}
