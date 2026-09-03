/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.projectile.EntityArrow
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraftforge.event.entity.ProjectileImpactEvent$Arrow
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f8;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public static class f8.b {
    @SubscribeEvent
    public void a(ProjectileImpactEvent.Arrow arrow) {
        RayTraceResult rayTraceResult = arrow.getRayTraceResult();
        EntityArrow entityArrow = arrow.getArrow();
        try {
            if (!(entityArrow.field_70250_c instanceof f8)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw f8.b.a(runtimeException);
        }
        try {
            if (rayTraceResult.field_72308_g instanceof em) {
                arrow.setCanceled(true);
            }
        }
        catch (RuntimeException runtimeException) {
            throw f8.b.a(runtimeException);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
