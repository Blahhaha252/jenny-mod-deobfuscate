/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityMoveHelper
 *  net.minecraft.entity.ai.EntityMoveHelper$Action
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ay;
import com.trolmastercard.sexmod.r;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;

static class ay.b.b
extends EntityMoveHelper {
    private float b;
    private int c;
    private final ay d;
    private boolean a;

    public ay.b.b(ay ay2) {
        super((EntityLiving)ay2);
        this.d = ay2;
        this.b = 180.0f * ay2.field_70177_z / (float)Math.PI;
    }

    public void a(float f, boolean bl) {
        this.b = f;
        this.a = bl;
    }

    public void a(double d) {
        this.field_75645_e = d;
        this.field_188491_h = EntityMoveHelper.Action.MOVE_TO;
    }

    public void func_75641_c() {
        this.field_75648_a.field_70759_as = this.field_75648_a.field_70177_z = this.func_75639_a(this.field_75648_a.field_70177_z, this.b, 90.0f);
        this.field_75648_a.field_70761_aq = this.field_75648_a.field_70177_z;
        if (this.field_188491_h != EntityMoveHelper.Action.MOVE_TO) {
            this.field_75648_a.func_191989_p(0.0f);
        } else {
            this.field_188491_h = EntityMoveHelper.Action.WAIT;
            if (this.field_75648_a.field_70122_E) {
                this.field_75648_a.func_70659_e((float)(this.field_75645_e * this.field_75648_a.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e()));
                if (this.c-- <= 0) {
                    this.c = this.d.a();
                    if (this.a) {
                        this.c /= 3;
                    }
                    float f = r.f.nextInt(360);
                    ((ay.b.b)this.d.func_70605_aq()).a(f, false);
                    this.d.func_70683_ar().func_75660_a();
                    if (this.d.i()) {
                        this.d.func_184185_a(this.d.c(), this.d.func_70599_aP(), ((this.d.func_70681_au().nextFloat() - this.d.func_70681_au().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                    }
                } else {
                    this.d.field_70702_br = 0.0f;
                    this.d.field_191988_bg = 0.0f;
                    this.field_75648_a.func_70659_e(0.0f);
                }
            } else {
                this.field_75648_a.func_70659_e((float)(this.field_75645_e * this.field_75648_a.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e()));
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
