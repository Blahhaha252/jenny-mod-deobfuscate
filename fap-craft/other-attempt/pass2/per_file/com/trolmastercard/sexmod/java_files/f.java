/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.r;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class f
extends EntityAIBase {
    public em d;
    public EntityPlayer a;
    public PathNavigate c;
    public EntityDataManager e;
    public a.a f = a.a.IDLE;
    public static final double g = 0.5;
    public static final double h = 0.7;
    public static final int b = 60;

    public f(em em2) {
        this.d = em2;
        this.c = em2.func_70661_as();
        this.e = em2.func_184212_Q();
    }

    protected void c() {
        BlockPos blockPos;
        int n = 0;
        do {
            blockPos = this.a.func_180425_c().func_177982_a(r.f.nextInt(10), 0, r.f.nextInt(10));
        } while (++n < 20 && !this.d.func_184595_k(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p()));
        if (n >= 20) {
            this.d.func_70107_b(this.a.field_70165_t, this.a.field_70163_u, this.a.field_70161_v);
        }
        this.d.field_70159_w = 0.0;
        this.d.field_70181_x = 0.0;
        this.d.field_70179_y = 0.0;
    }

    protected double b() {
        em.a$a a$a2;
        double d;
        float f2 = this.d.func_70032_d((Entity)this.a);
        if (this.a.func_70051_ag()) {
            d = 0.7;
            a$a2 = em.a$a.RUN;
        } else {
            d = 0.5;
            a$a2 = em.a$a.WALK;
        }
        double d2 = Math.floor(f2 / 5.0f) * 0.2;
        d += d2;
        if (this.d.func_70090_H()) {
            d *= 60.0;
            a$a2 = em.a$a.WALK;
        }
        this.c.func_75489_a(d);
        this.d.a(a$a2);
        return d;
    }

    public void func_75251_c() {
        this.c.func_75499_g();
        this.f = a.a.IDLE;
        this.d.b(fp.NULL);
        this.e.func_187227_b(em.v, (Object)"");
        this.c = null;
        this.e = null;
        this.a = null;
    }

    public boolean func_75250_a() {
        return !((String)this.d.func_184212_Q().func_187225_a(em.v)).equals("");
    }

    public boolean func_75253_b() {
        String string = (String)this.e.func_187225_a(em.v);
        return !string.equals("") && this.d.field_70170_p.func_152378_a(UUID.fromString(string)) != null;
    }

    public void func_75249_e() {
        this.c = this.d.func_70661_as();
        this.e = this.d.func_184212_Q();
        this.a = this.d.field_70170_p.func_152378_a(UUID.fromString((String)this.e.func_187225_a(em.v)));
    }

    public void func_75246_d() {
        this.f = this.a();
        if (this.d.o != null) {
            this.d.o.a = this.f == a.a.IDLE;
        }
        this.a(this.f);
    }

    protected abstract a.a a();

    protected abstract void a(a.a var1);

    @SubscribeEvent
    public void a(LivingDeathEvent livingDeathEvent) {
        block0: {
            em em2;
            if (!(livingDeathEvent.getEntityLiving() instanceof em) || ((String)(em2 = (em)livingDeathEvent.getEntityLiving()).func_184212_Q().func_187225_a(em.v)).equals("")) break block0;
            livingDeathEvent.setCanceled(true);
        }
    }

    private static RuntimeException b(RuntimeException runtimeException) {
        return runtimeException;
    }
}
