/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraftforge.client.event.ClientChatEvent
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.em;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public static class br.a.a {
    boolean a = false;

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(ClientChatEvent clientChatEvent) {
        String string = clientChatEvent.getOriginalMessage();
        if (!"id".equals(string)) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        List list = entityPlayerSP.field_70170_p.func_72872_a(em.class, entityPlayerSP.func_174813_aQ().func_186662_g(10.0));
        em em2 = null;
        for (em em3 : list) {
            if (em2 == null) {
                em2 = em3;
                continue;
            }
            if (!(entityPlayerSP.func_70032_d((Entity)em3) < entityPlayerSP.func_70032_d((Entity)em2))) continue;
            em2 = em3;
        }
        if (em2 == null) {
            return;
        }
        entityPlayerSP.func_146105_b((ITextComponent)new TextComponentString(em2.f().toString()), false);
        clientChatEvent.setCanceled(true);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        Minecraft minecraft = Minecraft.func_71410_x();
        minecraft.func_152343_a(() -> br.c(true));
        this.a = false;
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(EntityJoinWorldEvent entityJoinWorldEvent) {
        block2: {
            if (!entityJoinWorldEvent.getEntity().equals((Object)Minecraft.func_71410_x().field_71439_g)) {
                return;
            }
            if (this.a) {
                return;
            }
            this.a = true;
            if (!br.b()) break block2;
            br.a();
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        Minecraft.func_71410_x().func_152344_a(() -> br.a(true));
        this.a = false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
