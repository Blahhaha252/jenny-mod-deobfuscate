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
        int n;
        int n2;
        int n3;
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
        int n4 = blockPos2.func_177958_n();
        if (n4 - (n3 = blockPos.func_177958_n()) != 0) {
            double d = Math.max(n4, n3);
            double d2 = (this.d.field_72448_b - this.f.field_72448_b) / (this.d.field_72450_a - this.f.field_72450_a);
            double d3 = this.f.field_72448_b - d2 * this.f.field_72450_a;
            double d4 = d2 * d + d3;
            double d5 = (this.d.field_72449_c - this.f.field_72449_c) / (this.d.field_72450_a - this.f.field_72450_a);
            double d6 = this.f.field_72449_c - d5 * this.f.field_72450_a;
            double d7 = d5 * d + d6;
            this.f = new Vec3d(d + (double)(0.03f * (float)(n4 > n3 ? -1 : 1)), d4, d7);
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
        int n5 = blockPos2.func_177956_o();
        if (n5 - (n2 = blockPos.func_177956_o()) != 0) {
            double d = Math.max(n5, n2);
            double d8 = (this.d.field_72450_a - this.f.field_72450_a) / (this.d.field_72448_b - this.f.field_72448_b);
            double d9 = this.f.field_72450_a - d8 * this.f.field_72448_b;
            double d10 = d8 * d + d9;
            double d11 = (this.d.field_72449_c - this.f.field_72449_c) / (this.d.field_72448_b - this.f.field_72448_b);
            double d12 = this.f.field_72449_c - d11 * this.f.field_72448_b;
            double d13 = d11 * d + d12;
            this.f = new Vec3d(d10, d + (double)(0.03f * (float)(n5 > n2 ? -1 : 1)), d13);
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
        int n6 = blockPos2.func_177952_p();
        if (n6 - (n = blockPos.func_177952_p()) != 0) {
            double d = Math.max(n6, n);
            double d14 = (this.d.field_72448_b - this.f.field_72448_b) / (this.d.field_72449_c - this.f.field_72449_c);
            double d15 = this.f.field_72448_b - d14 * this.f.field_72449_c;
            double d16 = d14 * d + d15;
            double d17 = (this.d.field_72450_a - this.f.field_72450_a) / (this.d.field_72449_c - this.f.field_72449_c);
            double d18 = this.f.field_72450_a - d17 * this.f.field_72449_c;
            double d19 = d17 * d + d18;
            this.f = new Vec3d(d19, d16, d + (double)(0.03f * (float)(n6 > n ? -1 : 1)));
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
    }

    static List<BlockPos> a(BlockPos blockPos, BlockPos blockPos2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.add(blockPos);
        int n = blockPos.func_177958_n();
        int n2 = blockPos.func_177956_o();
        int n3 = blockPos.func_177952_p();
        int n4 = blockPos2.func_177958_n();
        int n5 = blockPos2.func_177956_o();
        int n6 = blockPos2.func_177952_p();
        int n7 = Math.abs(n4 - n);
        int n8 = Math.abs(n5 - n2);
        int n9 = Math.abs(n6 - n3);
        int n10 = n < n4 ? 1 : -1;
        int n11 = n2 < n5 ? 1 : -1;
        int n12 = n3 < n6 ? 1 : -1;
        int n13 = Math.max(n7, Math.max(n8, n9));
        int n14 = n;
        int n15 = n2;
        int n16 = n3;
        int n17 = n13 / 2;
        int n18 = n13 / 2;
        int n19 = n13 / 2;
        for (int i = 0; i < n13; ++i) {
            arrayList.add(new BlockPos(n14, n15, n16));
            n18 -= n8;
            n19 -= n9;
            if ((n17 -= n7) < 0) {
                n14 += n10;
                n17 += n13;
                continue;
            }
            if (n18 < 0) {
                n15 += n11;
                n18 += n13;
                continue;
            }
            if (n19 >= 0) continue;
            n16 += n12;
            n19 += n13;
        }
        arrayList.add(blockPos2);
        return arrayList;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
