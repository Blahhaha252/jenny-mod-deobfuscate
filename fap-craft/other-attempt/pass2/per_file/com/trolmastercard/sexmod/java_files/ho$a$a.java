/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.event.entity.living.EnderTeleportEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public static class ho.a.a {
    @SubscribeEvent
    public void a(EnderTeleportEvent enderTeleportEvent) {
        if (enderTeleportEvent.getEntityLiving() instanceof em) {
            em em2 = (em)enderTeleportEvent.getEntityLiving();
            em2.q = null;
            em2.b(fp.NULL);
            em2.func_184212_Q().func_187227_b(em.G, (Object)false);
            em2.x();
        }
    }
}
