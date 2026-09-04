/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class an {
    public static final float a = 9.81f;
    public static final float g = 0.05f;
    public static final float b = 0.05f;
    public static final float c = 0.03f;
    World h;
    Vec3d d;
    Vec3d f;
    Vec3d e;

    public an(World world, Vec3d vec3d, Vec3d vec3d2) {
        this.h = world;
        this.f = vec3d;
        this.d = vec3d;
        this.e = vec3d2;
    }

    public void a() {
        int n2;
        int n3;
        int n4;
        if (Vec3d.field_186680_a.equals((Object)this.e)) {
            this.d = this.f;
            return;
        }
        this.e = new Vec3d(this.e.field_72450_a * (double)0.95f, (this.e.field_72448_b - 0.4905000329017639) * (double)0.95f, this.e.field_72449_c * (double)0.95f);
        this.d = this.f;
        this.f = new Vec3d(this.f.field_72450_a + this.e.field_72450_a * (double)0.05f, this.f.field_72448_b + this.e.field_72448_b * (double)0.05f, this.f.field_72449_c + this.e.field_72449_c * (double)0.05f);
        BlockPos blockPos = new BlockPos(this.d);
        BlockPos blockPos2 = null;
        for (BlockPos blockPos3 : an.a(new BlockPos(this.d), new BlockPos(this.f))) {
            if (this.h.func_180495_p(blockPos3).func_177230_c() == Blocks.field_150350_a) {
                blockPos = blockPos3;
                continue;
            }
            blockPos2 = blockPos3;
            break;
        }
        if (blockPos2 == null) {
            return;
        }
        int n5 = blockPos2.func_177958_n();
        if (n5 - (n4 = blockPos.func_177958_n()) != 0) {
            double d10 = Math.max(n5, n4);
            double d11 = (this.d.field_72448_b - this.f.field_72448_b) / (this.d.field_72450_a - this.f.field_72450_a);
            double d12 = this.f.field_72448_b - d11 * this.f.field_72450_a;
            double d13 = d11 * d10 + d12;
            double d14 = (this.d.field_72449_c - this.f.field_72449_c) / (this.d.field_72450_a - this.f.field_72450_a);
            double d15 = this.f.field_72449_c - d14 * this.f.field_72450_a;
            double d16 = d14 * d10 + d15;
            this.f = new Vec3d(d10 + (double)(0.03f * (float)(n5 > n4 ? -1 : 1)), d13, d16);
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
        int n6 = blockPos2.func_177956_o();
        if (n6 - (n3 = blockPos.func_177956_o()) != 0) {
            double d17 = Math.max(n6, n3);
            double d18 = (this.d.field_72450_a - this.f.field_72450_a) / (this.d.field_72448_b - this.f.field_72448_b);
            double d19 = this.f.field_72450_a - d18 * this.f.field_72448_b;
            double d20 = d18 * d17 + d19;
            double d21 = (this.d.field_72449_c - this.f.field_72449_c) / (this.d.field_72448_b - this.f.field_72448_b);
            double d22 = this.f.field_72449_c - d21 * this.f.field_72448_b;
            double d23 = d21 * d17 + d22;
            this.f = new Vec3d(d20, d17 + (double)(0.03f * (float)(n6 > n3 ? -1 : 1)), d23);
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
        int n7 = blockPos2.func_177952_p();
        if (n7 - (n2 = blockPos.func_177952_p()) != 0) {
            double d24 = Math.max(n7, n2);
            double d25 = (this.d.field_72448_b - this.f.field_72448_b) / (this.d.field_72449_c - this.f.field_72449_c);
            double d26 = this.f.field_72448_b - d25 * this.f.field_72449_c;
            double d27 = d25 * d24 + d26;
            double d28 = (this.d.field_72450_a - this.f.field_72450_a) / (this.d.field_72449_c - this.f.field_72449_c);
            double d29 = this.f.field_72450_a - d28 * this.f.field_72449_c;
            double d30 = d28 * d24 + d29;
            this.f = new Vec3d(d30, d27, d24 + (double)(0.03f * (float)(n7 > n2 ? -1 : 1)));
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
    }

    static List<BlockPos> a(BlockPos blockPos, BlockPos blockPos2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.add(blockPos);
        int n2 = blockPos.func_177958_n();
        int n3 = blockPos.func_177956_o();
        int n4 = blockPos.func_177952_p();
        int n5 = blockPos2.func_177958_n();
        int n6 = blockPos2.func_177956_o();
        int n7 = blockPos2.func_177952_p();
        int n8 = Math.abs(n5 - n2);
        int n9 = Math.abs(n6 - n3);
        int n10 = Math.abs(n7 - n4);
        int n11 = n2 < n5 ? 1 : -1;
        int n12 = n3 < n6 ? 1 : -1;
        int n13 = n4 < n7 ? 1 : -1;
        int n14 = Math.max(n8, Math.max(n9, n10));
        int n15 = n2;
        int n16 = n3;
        int n17 = n4;
        int n18 = n14 / 2;
        int n19 = n14 / 2;
        int n20 = n14 / 2;
        for (int i2 = 0; i2 < n14; ++i2) {
            arrayList.add(new BlockPos(n15, n16, n17));
            n19 -= n9;
            n20 -= n10;
            if ((n18 -= n8) < 0) {
                n15 += n11;
                n18 += n14;
                continue;
            }
            if (n19 < 0) {
                n16 += n12;
                n19 += n14;
                continue;
            }
            if (n20 >= 0) continue;
            n17 += n13;
            n20 += n14;
        }
        arrayList.add(blockPos2);
        return arrayList;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

