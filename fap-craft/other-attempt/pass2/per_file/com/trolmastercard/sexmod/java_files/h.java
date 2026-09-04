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
        boolean bl;
        float f2 = this.d.func_70032_d((Entity)this.a);
        boolean bl2 = bl = f2 > 5.0f;
        if (this.d.ae() == null && !bl && this.f == f.a.a.FOLLOW) {
            if (++this.j > 60) {
                bl = false;
                this.j = 0;
            } else {
                bl = true;
            }
        }
        if (bl) {
            return f.a.a.FOLLOW;
        }
        return f.a.a.IDLE;
    }

    @Override
    protected void a(f.a.a a2) {
        switch (a2) {
            case FOLLOW: {
                double d = this.d.func_70032_d((Entity)this.a);
                if ((double)this.c.func_111269_d() > d) {
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
        float f2 = this.d.func_70032_d((Entity)this.a);
        float f3 = 0.02f;
        double d = Math.min(0.7, Math.floor(f2 / 3.0f) * 0.05);
        this.d.field_70747_aH = f3 = (float)((double)f3 + d);
        return f3;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
