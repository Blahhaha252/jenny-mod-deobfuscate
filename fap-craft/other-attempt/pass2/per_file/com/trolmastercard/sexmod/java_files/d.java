/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntityGuardian
 *  net.minecraft.entity.monster.EntityPigZombie
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package com.trolmastercard.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class d {
    public static boolean a(Entity entity) {
        if (entity instanceof EntityCreeper) {
            return false;
        }
        if (entity instanceof EntityPigZombie) {
            return false;
        }
        if (entity instanceof EntityGuardian) {
            return false;
        }
        return !(entity instanceof EntityEnderman);
    }

    public static boolean a(World world, Vec3d vec3d, Entity entity) {
        RayTraceResult rayTraceResult = world.func_147447_a(vec3d, entity.func_174791_d().func_72441_c(0.0, (double)entity.func_70047_e(), 0.0), true, true, false);
        if (rayTraceResult == null) {
            return true;
        }
        return rayTraceResult.field_72313_a != RayTraceResult.Type.BLOCK;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
