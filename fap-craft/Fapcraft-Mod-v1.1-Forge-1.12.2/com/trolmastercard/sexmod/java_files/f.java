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

import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.em;
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
    public a f = com.trolmastercard.sexmod.f$a.IDLE;
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
        try {
            if (n >= 20) {
                this.d.func_70107_b(this.a.field_70165_t, this.a.field_70163_u, this.a.field_70161_v);
            }
        }
        catch (RuntimeException runtimeException) {
            throw com.trolmastercard.sexmod.f.b(runtimeException);
        }
        this.d.field_70159_w = 0.0;
        this.d.field_70181_x = 0.0;
        this.d.field_70179_y = 0.0;
    }

    protected double b() {
        em.a a2;
        double d;
        float f2 = this.d.func_70032_d((Entity)this.a);
        if (this.a.func_70051_ag()) {
            d = 0.7;
            a2 = em.a.RUN;
        } else {
            d = 0.5;
            a2 = em.a.WALK;
        }
        double d2 = Math.floor(f2 / 5.0f) * 0.2;
        d += d2;
        if (this.d.func_70090_H()) {
            d *= 60.0;
            a2 = em.a.WALK;
        }
        this.c.func_75489_a(d);
        this.d.a(a2);
        return d;
    }

    public void func_75251_c() {
        this.c.func_75499_g();
        this.f = com.trolmastercard.sexmod.f$a.IDLE;
        this.d.b(fp.NULL);
        this.e.func_187227_b(em.v, (Object)"");
        this.c = null;
        this.e = null;
        this.a = null;
    }

    public boolean func_75250_a() {
        boolean bl;
        try {
            bl = !((String)this.d.func_184212_Q().func_187225_a(em.v)).equals("");
        }
        catch (RuntimeException runtimeException) {
            throw com.trolmastercard.sexmod.f.b(runtimeException);
        }
        return bl;
    }

    public boolean func_75253_b() {
        boolean bl;
        block5: {
            block4: {
                String string = (String)this.e.func_187225_a(em.v);
                try {
                    try {
                        if (string.equals("") || this.d.field_70170_p.func_152378_a(UUID.fromString(string)) == null) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.f.b(runtimeException);
                    }
                    bl = true;
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.f.b(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void func_75249_e() {
        this.c = this.d.func_70661_as();
        this.e = this.d.func_184212_Q();
        this.a = this.d.field_70170_p.func_152378_a(UUID.fromString((String)this.e.func_187225_a(em.v)));
    }

    public void func_75246_d() {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    try {
                        try {
                            this.f = this.a();
                            if (this.d.o == null) break block4;
                            df df2 = this.d.o;
                            if (this.f != com.trolmastercard.sexmod.f$a.IDLE) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.f.b(runtimeException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.f.b(runtimeException);
                    }
                }
                bl = false;
            }
            df2.a = bl;
        }
        this.a(this.f);
    }

    protected abstract a a();

    protected abstract void a(a var1);

    @SubscribeEvent
    public void a(LivingDeathEvent livingDeathEvent) {
        if (livingDeathEvent.getEntityLiving() instanceof em) {
            em em2 = (em)livingDeathEvent.getEntityLiving();
            try {
                if (!((String)em2.func_184212_Q().func_187225_a(em.v)).equals("")) {
                    livingDeathEvent.setCanceled(true);
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.f.b(runtimeException);
            }
        }
    }

    private static RuntimeException b(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static enum a {
        ATTACK,
        FOLLOW,
        IDLE,
        RIDE,
        DOWNED;

    }
}
