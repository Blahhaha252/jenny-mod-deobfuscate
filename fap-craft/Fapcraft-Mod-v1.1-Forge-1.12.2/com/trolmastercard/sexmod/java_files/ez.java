/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.particle.ParticleDragonBreath
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package com.trolmastercard.sexmod;

import net.minecraft.client.particle.ParticleDragonBreath;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ez
extends ParticleDragonBreath {
    public static final float a = 0.2f;
    public static final float c = 0.5f;
    public static float b = 0.2f;

    public ez(World world, double d, double d2, double d3) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
    }

    public void func_180434_a(BufferBuilder bufferBuilder, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.field_70544_f = b;
        float f7 = (float)this.field_94054_b / 16.0f;
        float f8 = f7 + 0.0624375f;
        float f9 = (float)this.field_94055_c / 16.0f;
        float f10 = f9 + 0.0624375f;
        float f11 = 0.1f * this.field_70544_f;
        if (this.field_187119_C != null) {
            f7 = this.field_187119_C.func_94209_e();
            f8 = this.field_187119_C.func_94212_f();
            f9 = this.field_187119_C.func_94206_g();
            f10 = this.field_187119_C.func_94210_h();
        }
        float f12 = (float)(this.field_187123_c + (this.field_187126_f - this.field_187123_c) * (double)f - field_70556_an);
        float f13 = (float)(this.field_187124_d + (this.field_187127_g - this.field_187124_d) * (double)f - field_70554_ao);
        float f14 = (float)(this.field_187125_e + (this.field_187128_h - this.field_187125_e) * (double)f - field_70555_ap);
        int n = this.func_189214_a(f);
        int n2 = n >> 16 & 0xFFFF;
        int n3 = n & 0xFFFF;
        Vec3d[] vec3dArray = new Vec3d[]{new Vec3d((double)(-f2 * f11 - f5 * f11), (double)(-f3 * f11), (double)(-f4 * f11 - f6 * f11)), new Vec3d((double)(-f2 * f11 + f5 * f11), (double)(f3 * f11), (double)(-f4 * f11 + f6 * f11)), new Vec3d((double)(f2 * f11 + f5 * f11), (double)(f3 * f11), (double)(f4 * f11 + f6 * f11)), new Vec3d((double)(f2 * f11 - f5 * f11), (double)(-f3 * f11), (double)(f4 * f11 - f6 * f11))};
        if (this.field_190014_F != 0.0f) {
            float f15 = this.field_190014_F + (this.field_190014_F - this.field_190015_G) * f;
            float f16 = MathHelper.func_76134_b((float)(f15 * 0.5f));
            float f17 = MathHelper.func_76126_a((float)(f15 * 0.5f)) * (float)ez.field_190016_K.field_72450_a;
            float f18 = MathHelper.func_76126_a((float)(f15 * 0.5f)) * (float)ez.field_190016_K.field_72448_b;
            float f19 = MathHelper.func_76126_a((float)(f15 * 0.5f)) * (float)ez.field_190016_K.field_72449_c;
            Vec3d vec3d = new Vec3d((double)f17, (double)f18, (double)f19);
            try {
                for (int i = 0; i < 4; ++i) {
                    vec3dArray[i] = vec3d.func_186678_a(2.0 * vec3dArray[i].func_72430_b(vec3d)).func_178787_e(vec3dArray[i].func_186678_a((double)(f16 * f16) - vec3d.func_72430_b(vec3d))).func_178787_e(vec3d.func_72431_c(vec3dArray[i]).func_186678_a((double)(2.0f * f16)));
                }
            }
            catch (RuntimeException runtimeException) {
                throw ez.a(runtimeException);
            }
        }
        bufferBuilder.func_181662_b((double)f12 + vec3dArray[0].field_72450_a, (double)f13 + vec3dArray[0].field_72448_b, (double)f14 + vec3dArray[0].field_72449_c).func_187315_a((double)f8, (double)f10).func_181666_a(this.field_70552_h, this.field_70553_i, this.field_70551_j, this.field_82339_as).func_187314_a(n2, n3).func_181675_d();
        bufferBuilder.func_181662_b((double)f12 + vec3dArray[1].field_72450_a, (double)f13 + vec3dArray[1].field_72448_b, (double)f14 + vec3dArray[1].field_72449_c).func_187315_a((double)f8, (double)f9).func_181666_a(this.field_70552_h, this.field_70553_i, this.field_70551_j, this.field_82339_as).func_187314_a(n2, n3).func_181675_d();
        bufferBuilder.func_181662_b((double)f12 + vec3dArray[2].field_72450_a, (double)f13 + vec3dArray[2].field_72448_b, (double)f14 + vec3dArray[2].field_72449_c).func_187315_a((double)f7, (double)f9).func_181666_a(this.field_70552_h, this.field_70553_i, this.field_70551_j, this.field_82339_as).func_187314_a(n2, n3).func_181675_d();
        bufferBuilder.func_181662_b((double)f12 + vec3dArray[3].field_72450_a, (double)f13 + vec3dArray[3].field_72448_b, (double)f14 + vec3dArray[3].field_72449_c).func_187315_a((double)f7, (double)f10).func_181666_a(this.field_70552_h, this.field_70553_i, this.field_70551_j, this.field_82339_as).func_187314_a(n2, n3).func_181675_d();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
