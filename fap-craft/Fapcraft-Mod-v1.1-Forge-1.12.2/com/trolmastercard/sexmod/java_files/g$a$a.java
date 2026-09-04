/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.event.entity.living.LivingHealEvent
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.fp;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public static class g.a.a {
    @SubscribeEvent
    public void a(LivingHurtEvent livingHurtEvent) {
        block0: {
            e2 e22;
            block1: {
                if (!(livingHurtEvent.getEntityLiving() instanceof e2)) break block0;
                e22 = (e2)livingHurtEvent.getEntityLiving();
                if (!e22.N) break block1;
                livingHurtEvent.setCanceled(true);
                break block0;
            }
            if (!(e22.func_110143_aJ() - livingHurtEvent.getAmount() < 0.0f) || ((String)e22.func_184212_Q().func_187225_a(e2.v)).equals("")) break block0;
            e22.N = true;
            e22.b(fp.DOWNED);
            livingHurtEvent.setAmount(e22.func_110143_aJ() - 1.0f);
            e22.func_70661_as().func_75499_g();
        }
    }

    @SubscribeEvent
    public void a(LivingHealEvent livingHealEvent) {
        block1: {
            if (!(livingHealEvent.getEntityLiving() instanceof e2)) break block1;
            e2 e22 = (e2)livingHealEvent.getEntityLiving();
            if (e22.N && e22.func_110143_aJ() + livingHealEvent.getAmount() >= e22.func_110138_aP()) {
                e22.N = false;
                e22.b(fp.NULL);
            }
        }
    }

    @SubscribeEvent
    public void a(LivingDeathEvent livingDeathEvent) {
        if (livingDeathEvent.getEntityLiving() instanceof e2) {
            e2 e22 = (e2)livingDeathEvent.getEntityLiving();
            if (e22.field_70170_p.field_72995_K) {
                return;
            }
            for (int i = 0; i < 6; ++i) {
                Item item = e22.Q.getStackInSlot(i).func_77973_b();
                if (item == Items.field_190931_a) continue;
                e22.func_145779_a(item, 1);
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
