/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.pathfinding.PathNavigateGround
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ay;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.PathNavigateGround;

static class ay.d
extends EntityAIBase {
    private final ay a;

    public ay.d(ay ay2) {
        this.a = ay2;
        this.func_75248_a(5);
        ((PathNavigateGround)ay2.func_70661_as()).func_179693_d(true);
    }

    public boolean func_75250_a() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.a.func_70090_H() && !this.a.func_180799_ab()) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ay.d.a(runtimeException);
                    }
                    bl = true;
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw ay.d.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void func_75246_d() {
        try {
            if (this.a.func_70681_au().nextFloat() < 0.8f) {
                this.a.func_70683_ar().func_75660_a();
            }
        }
        catch (RuntimeException runtimeException) {
            throw ay.d.a(runtimeException);
        }
        ((ay.b)this.a.func_70605_aq()).a(1.2);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
