/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.pathfinding.Path
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.pathfinding.PathPoint
 *  net.minecraft.util.math.BlockPos
 */
package com.trolmastercard.sexmod;

import java.util.ArrayList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.math.BlockPos;

public class fl {
    public static BlockPos a(Path path) {
        if (path == null) {
            return BlockPos.field_177992_a;
        }
        PathPoint pathPoint = path.func_75870_c();
        if (pathPoint == null) {
            return BlockPos.field_177992_a;
        }
        return new BlockPos(pathPoint.field_75839_a, pathPoint.field_75837_b, pathPoint.field_75838_c);
    }

    public static BlockPos a(EntityLiving entityLiving) {
        PathNavigate pathNavigate = entityLiving.func_70661_as();
        Path path = pathNavigate.func_75505_d();
        return fl.a(path);
    }

    public static boolean a(Path path, BlockPos[] blockPosArray) {
        int n = path.func_75874_d();
        ArrayList<PathPoint> arrayList = new ArrayList<PathPoint>();
        for (int i = 0; i < n; ++i) {
            arrayList.add(path.func_75877_a(i));
        }
        for (PathPoint pathPoint : arrayList) {
            for (BlockPos blockPos : blockPosArray) {
                if (pathPoint.field_75839_a != blockPos.func_177958_n() || pathPoint.field_75837_b != blockPos.func_177956_o() || pathPoint.field_75838_c != blockPos.func_177952_p()) continue;
                return true;
            }
        }
        return false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
