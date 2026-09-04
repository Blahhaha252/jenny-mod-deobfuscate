/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 *  net.minecraftforge.event.world.WorldEvent$Unload
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.b3;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.ge;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public static class ff.c.c {
    int a = 0;

    @SubscribeEvent
    public void a(LivingDeathEvent livingDeathEvent) {
        if (livingDeathEvent.getEntityLiving() instanceof ff) {
            ff ff2 = (ff)livingDeathEvent.getEntityLiving();
            if (ff2.field_70170_p.field_72995_K) {
                return;
            }
            for (int i = 0; i < ff2.X.getSlots(); ++i) {
                ItemStack itemStack = ff2.X.getStackInSlot(i);
                if (itemStack.func_77973_b() == Items.field_190931_a) continue;
                ff2.func_145779_a(itemStack.func_77973_b(), itemStack.func_190916_E());
            }
        }
    }

    @SubscribeEvent
    public void b(LivingHurtEvent livingHurtEvent) {
        EntityPlayer entityPlayer;
        Entity entity = livingHurtEvent.getEntity();
        World world = entity.func_130014_f_();
        if (world.field_72995_K) {
            return;
        }
        if (!(entity instanceof ff)) {
            return;
        }
        ff ff2 = (ff)entity;
        Optional optional = (Optional)ff2.func_184212_Q().func_187225_a(ff.aL);
        if (!optional.isPresent()) {
            return;
        }
        Entity entity2 = livingHurtEvent.getSource().func_76346_g();
        if (entity2 == null) {
            return;
        }
        if (!(entity2 instanceof EntityLivingBase)) {
            return;
        }
        if (entity2 instanceof EntityPlayer) {
            entityPlayer = (EntityPlayer)entity2;
            if (entityPlayer.field_71075_bZ.field_75098_d) {
                return;
            }
            if (entityPlayer.equals((Object)ff2.z())) {
                return;
            }
        }
        if ((entityPlayer = ff2.z()) != null) {
            entityPlayer.func_146105_b((ITextComponent)new TextComponentString(TextFormatting.RED + "Your Tribe is under Attack!"), true);
        }
        ax.a((UUID)optional.get(), (EntityLivingBase)entity2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SubscribeEvent
    public void a(WorldEvent.Unload var1_1) {
        try lbl-1000:
        // 4 sources

        {
            for (em var3_4 : em.ad()) {
                if (!(var3_4 instanceof ff)) {
                    continue;
                }
                ** GOTO lbl-1000
            }
            return;
        }
        catch (ConcurrentModificationException var2_3) {
            // empty catch block
            return;
        }
lbl-1000:
        // 1 sources

        {
            var4_5 = (ff)var3_4;
            var5_6 = (Optional)var4_5.func_184212_Q().func_187225_a(ff.aL);
            if (!var5_6.isPresent() || !ax.e((UUID)var5_6.get(), var4_5)) ** GOTO lbl-1000
        }
        {
            var4_5.s((UUID)var5_6.get());
            ** GOTO lbl-1000
        }
    }

    @SubscribeEvent
    public void a(LivingHurtEvent livingHurtEvent) {
        block1: {
            if (livingHurtEvent.getSource() != DamageSource.field_76368_d) {
                return;
            }
            Entity entity = livingHurtEvent.getEntity();
            if (!(entity instanceof ff)) break block1;
            entity.func_70107_b(entity.field_70165_t, entity.field_70163_u + 1.0, entity.field_70161_v);
            livingHurtEvent.setCanceled(true);
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(TickEvent.ClientTickEvent clientTickEvent) {
        block1: {
            WorldClient worldClient = Minecraft.func_71410_x().field_71441_e;
            if (worldClient == null) {
                return;
            }
            if (++this.a % 20 != 0) break block1;
            ge.b.sendToServer((IMessage)new b3());
        }
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
