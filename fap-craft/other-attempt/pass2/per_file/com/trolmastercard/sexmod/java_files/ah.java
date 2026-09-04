/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.DamageSource
 *  net.minecraftforge.event.entity.living.LivingAttackEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a3;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ah {
    @SubscribeEvent
    public void b(LivingAttackEvent livingAttackEvent) {
        if (livingAttackEvent.getSource() == DamageSource.field_76380_i) {
            return;
        }
        if (!(livingAttackEvent.getEntity() instanceof em)) {
            return;
        }
        em em2 = (em)livingAttackEvent.getEntity();
        if (em2 instanceof ei) {
            livingAttackEvent.setCanceled(true);
        } else {
            livingAttackEvent.setCanceled(em2.ae() != null);
        }
    }

    @SubscribeEvent
    public void a(LivingAttackEvent livingAttackEvent) {
        block3: {
            DamageSource damageSource = livingAttackEvent.getSource();
            if (damageSource == DamageSource.field_76380_i || damageSource instanceof a3) {
                return;
            }
            if (!(livingAttackEvent.getEntity() instanceof EntityPlayer)) {
                return;
            }
            EntityPlayer entityPlayer = (EntityPlayer)livingAttackEvent.getEntity();
            em em2 = em.i(entityPlayer.getPersistentID());
            if (em2 == null) {
                return;
            }
            if (!(em2.func_70032_d((Entity)entityPlayer) < 1.0f)) break block3;
            livingAttackEvent.setCanceled(true);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
