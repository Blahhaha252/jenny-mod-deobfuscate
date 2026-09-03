/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.dv;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public static class dv.a {
    @SubscribeEvent
    public void a(TickEvent.ClientTickEvent clientTickEvent) {
        for (dv dv2 : J) {
            dv2.a();
        }
    }
}
