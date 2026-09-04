/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.init.MobEffects
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ay;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.MobEffects;

static class ay.a.a
extends EntityAIBase {
    private final ay b;
    private float a;
    private int c;

    public ay.a.a(ay ay2) {
        this.b = ay2;
        this.func_75248_a(2);
    }

    public boolean func_75250_a() {
        return this.b.func_70638_az() == null && (this.b.field_70122_E || this.b.func_70090_H() || this.b.func_180799_ab() || this.b.func_70644_a(MobEffects.field_188424_y));
    }

    public void func_75246_d() {
        if (--this.c <= 0) {
            this.c = 40 + this.b.func_70681_au().nextInt(60);
            this.a = this.b.func_70681_au().nextInt(360);
        }
        ((ay.b$b)this.b.func_70605_aq()).a(this.a, false);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
