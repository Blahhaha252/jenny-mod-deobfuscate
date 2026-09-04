/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f;
import net.minecraft.entity.Entity;

public class h
extends f {
    int j = 0;
    int i = 0;

    public h(em em2) {
        super(em2);
    }

    @Override
    public void func_75251_c() {
        super.func_75251_c();
        this.d.field_70747_aH = 0.02f;
    }

    @Override
    protected f.a.a a() {
        boolean bl2;
        float f10 = this.d.func_70032_d((Entity)this.a);
        boolean bl3 = bl2 = f10 > 5.0f;
        if (this.d.ae() == null && !bl2 && this.f == f.a.a.FOLLOW) {
            if (++this.j > 60) {
                bl2 = false;
                this.j = 0;
            } else {
                bl2 = true;
            }
        }
        if (bl2) {
            return f.a.a.FOLLOW;
        }
        return f.a.a.IDLE;
    }

    @Override
    protected void a(f.a.a a10) {
        switch (a10) {
            case FOLLOW: {
                double d10 = this.d.func_70032_d((Entity)this.a);
                if ((double)this.c.func_111269_d() > d10) {
                    this.c.func_75499_g();
                    this.c.func_75497_a((Entity)this.a, 0.5);
                } else {
                    this.c();
                }
                this.i = 300;
                this.b();
                break;
            }
            case IDLE: {
                this.b();
            }
        }
    }

    @Override
    protected double b() {
        float f10 = this.d.func_70032_d((Entity)this.a);
        float f11 = 0.02f;
        double d10 = Math.min(0.7, Math.floor(f10 / 3.0f) * 0.05);
        this.d.field_70747_aH = f11 = (float)((double)f11 + d10);
        return f11;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

