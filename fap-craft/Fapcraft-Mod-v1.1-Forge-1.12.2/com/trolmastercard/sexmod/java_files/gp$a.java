/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.IItemPropertyGetter
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.eb;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

class gp.a
implements IItemPropertyGetter {
    gp.a() {
    }

    @SideOnly(value=Side.CLIENT)
    public float func_185085_a(ItemStack itemStack, @Nullable World world, @Nullable EntityLivingBase entityLivingBase) {
        float f;
        try {
            if (entityLivingBase == null) {
                return 0.0f;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gp.a.a(runtimeException);
        }
        try {
            if (!(entityLivingBase instanceof eb)) {
                return 0.0f;
            }
        }
        catch (RuntimeException runtimeException) {
            throw gp.a.a(runtimeException);
        }
        try {
            f = (Boolean)entityLivingBase.func_184212_Q().func_187225_a(eb.af) != false ? 1.0f : 0.0f;
        }
        catch (RuntimeException runtimeException) {
            throw gp.a.a(runtimeException);
        }
        return f;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
