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
        try {
            if (Vec3d.field_186680_a.equals((Object)this.e)) {
                this.d = this.f;
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw an.a(runtimeException);
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
        try {
            if (blockPos2 == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw an.a(runtimeException);
        }
        int n3 = blockPos2.func_177958_n();
        int n4 = blockPos.func_177958_n();
        if (n3 - n4 != 0) {
            int n5;
            float f;
            double d;
            Vec3d vec3d;
            Vec3d vec3d2;
            double d2 = Math.max(n3, n4);
            double d3 = (this.d.field_72448_b - this.f.field_72448_b) / (this.d.field_72450_a - this.f.field_72450_a);
            double d4 = this.f.field_72448_b - d3 * this.f.field_72450_a;
            double d5 = d3 * d2 + d4;
            double d6 = (this.d.field_72449_c - this.f.field_72449_c) / (this.d.field_72450_a - this.f.field_72450_a);
            double d7 = this.f.field_72449_c - d6 * this.f.field_72450_a;
            double d8 = d6 * d2 + d7;
            try {
                Vec3d vec3d3;
                an an2 = this;
                vec3d2 = vec3d3;
                vec3d = vec3d3;
                d = d2;
                f = 0.03f;
                n5 = n3 > n4 ? -1 : 1;
            }
            catch (RuntimeException runtimeException) {
                throw an.a(runtimeException);
            }
            vec3d2(d + (double)(f * (float)n5), d5, d8);
            an2.f = vec3d;
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
        int n6 = blockPos2.func_177956_o();
        if (n6 - (n2 = blockPos.func_177956_o()) != 0) {
            int n7;
            float f;
            double d;
            double d9;
            Vec3d vec3d;
            Vec3d vec3d4;
            double d10 = Math.max(n6, n2);
            double d11 = (this.d.field_72450_a - this.f.field_72450_a) / (this.d.field_72448_b - this.f.field_72448_b);
            double d12 = this.f.field_72450_a - d11 * this.f.field_72448_b;
            double d13 = d11 * d10 + d12;
            double d14 = (this.d.field_72449_c - this.f.field_72449_c) / (this.d.field_72448_b - this.f.field_72448_b);
            double d15 = this.f.field_72449_c - d14 * this.f.field_72448_b;
            double d16 = d14 * d10 + d15;
            try {
                Vec3d vec3d5;
                an an3 = this;
                vec3d4 = vec3d5;
                vec3d = vec3d5;
                d9 = d13;
                d = d10;
                f = 0.03f;
                n7 = n6 > n2 ? -1 : 1;
            }
            catch (RuntimeException runtimeException) {
                throw an.a(runtimeException);
            }
            vec3d4(d9, d + (double)(f * (float)n7), d16);
            an3.f = vec3d;
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
        int n8 = blockPos2.func_177952_p();
        if (n8 - (n = blockPos.func_177952_p()) != 0) {
            int n9;
            float f;
            double d;
            double d17;
            double d18;
            Vec3d vec3d;
            Vec3d vec3d6;
            double d19 = Math.max(n8, n);
            double d20 = (this.d.field_72448_b - this.f.field_72448_b) / (this.d.field_72449_c - this.f.field_72449_c);
            double d21 = this.f.field_72448_b - d20 * this.f.field_72449_c;
            double d22 = d20 * d19 + d21;
            double d23 = (this.d.field_72450_a - this.f.field_72450_a) / (this.d.field_72449_c - this.f.field_72449_c);
            double d24 = this.f.field_72450_a - d23 * this.f.field_72449_c;
            double d25 = d23 * d19 + d24;
            try {
                Vec3d vec3d7;
                an an4 = this;
                vec3d6 = vec3d7;
                vec3d = vec3d7;
                d18 = d25;
                d17 = d22;
                d = d19;
                f = 0.03f;
                n9 = n8 > n ? -1 : 1;
            }
            catch (RuntimeException runtimeException) {
                throw an.a(runtimeException);
            }
            vec3d6(d18, d17, d + (double)(f * (float)n9));
            an4.f = vec3d;
            this.e = new Vec3d(0.0, 0.0, 0.0);
            return;
        }
    }

    static List<BlockPos> a(BlockPos blockPos, BlockPos blockPos2) {
        int n;
        int n2;
        int n3;
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.add(blockPos);
        int n4 = blockPos.func_177958_n();
        int n5 = blockPos.func_177956_o();
        int n6 = blockPos.func_177952_p();
        int n7 = blockPos2.func_177958_n();
        int n8 = blockPos2.func_177956_o();
        int n9 = blockPos2.func_177952_p();
        int n10 = Math.abs(n7 - n4);
        int n11 = Math.abs(n8 - n5);
        int n12 = Math.abs(n9 - n6);
        try {
            n3 = n4 < n7 ? 1 : -1;
        }
        catch (RuntimeException runtimeException) {
            throw an.a(runtimeException);
        }
        int n13 = n3;
        try {
            n2 = n5 < n8 ? 1 : -1;
        }
        catch (RuntimeException runtimeException) {
            throw an.a(runtimeException);
        }
        int n14 = n2;
        try {
            n = n6 < n9 ? 1 : -1;
        }
        catch (RuntimeException runtimeException) {
            throw an.a(runtimeException);
        }
        int n15 = n;
        int n16 = Math.max(n10, Math.max(n11, n12));
        int n17 = n4;
        int n18 = n5;
        int n19 = n6;
        int n20 = n16 / 2;
        int n21 = n16 / 2;
        int n22 = n16 / 2;
        for (int i = 0; i < n16; ++i) {
            arrayList.add(new BlockPos(n17, n18, n19));
            n21 -= n11;
            n22 -= n12;
            if ((n20 -= n10) < 0) {
                n17 += n13;
                n20 += n16;
                continue;
            }
            if (n21 < 0) {
                n18 += n14;
                n21 += n16;
                continue;
            }
            if (n22 >= 0) continue;
            n19 += n15;
            n22 += n16;
        }
        arrayList.add(blockPos2);
        return arrayList;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
