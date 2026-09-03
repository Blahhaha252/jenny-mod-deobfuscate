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

static class ay.a
extends EntityAIBase {
    private final ay b;
    private float a;
    private int c;

    public ay.a(ay ay2) {
        this.b = ay2;
        this.func_75248_a(2);
    }

    public boolean func_75250_a() {
        boolean bl;
        block12: {
            block10: {
                try {
                    block11: {
                        try {
                            try {
                                try {
                                    try {
                                        if (this.b.func_70638_az() != null) break block10;
                                        if (this.b.field_70122_E) break block11;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw ay.a.a(runtimeException);
                                    }
                                    if (this.b.func_70090_H()) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ay.a.a(runtimeException);
                                }
                                if (this.b.func_180799_ab()) break block11;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ay.a.a(runtimeException);
                            }
                            if (!this.b.func_70644_a(MobEffects.field_188424_y)) break block10;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ay.a.a(runtimeException);
                        }
                    }
                    bl = true;
                    break block12;
                }
                catch (RuntimeException runtimeException) {
                    throw ay.a.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void func_75246_d() {
        try {
            if (--this.c <= 0) {
                this.c = 40 + this.b.func_70681_au().nextInt(60);
                this.a = this.b.func_70681_au().nextInt(360);
            }
        }
        catch (RuntimeException runtimeException) {
            throw ay.a.a(runtimeException);
        }
        ((ay.b)this.b.func_70605_aq()).a(this.a, false);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
