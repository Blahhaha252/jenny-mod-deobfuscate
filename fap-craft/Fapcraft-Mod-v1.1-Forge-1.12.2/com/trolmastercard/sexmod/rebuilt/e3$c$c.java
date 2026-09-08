/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.DamageSource
 *  net.minecraftforge.event.entity.living.LivingAttackEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerChangedDimensionEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.ai;
import com.trolmastercard.sexmod.e3;
import com.trolmastercard.sexmod.ea;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public static class e3.c.c {
    static Minecraft a = null;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(TickEvent.ClientTickEvent var1_1) {
        block12: {
            if (var1_1.phase == TickEvent.Phase.START) {
                return;
            }
            var2_2 = new ArrayList<e3>();
            try lbl-1000:
            // 4 sources

            {
                for (em var4_5 : em.ad()) {
                    if (!var4_5.world.isRemote) {
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                break block12;
            }
            catch (ConcurrentModificationException var3_4) {
                // empty catch block
                break block12;
            }
lbl-1000:
            // 1 sources

            {
                if (!(var4_5 instanceof e3) || (var6_9 = (var5_8 = (e3)var4_5).e()) == null || (var7_10 = var5_8.world.getPlayerEntityByUUID(var6_9)) == null || var7_10.dimension == var5_8.dimension) ** GOTO lbl-1000
                var2_2.add(var5_8);
            }
            ** GOTO lbl-1000
        }
        var3_3 = var2_2.iterator();
        while (true) {
            if (!var3_3.hasNext()) {
                return;
            }
            var4_7 = (e3)var3_3.next();
            var4_7.a((UUID)null);
            var4_7.e((UUID)null);
            var4_7.setDead();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SubscribeEvent
    public void a(PlayerEvent.PlayerChangedDimensionEvent var1_1) {
        block8: {
            var2_2 = var1_1.player;
            var3_3 = var2_2.getPersistentID();
            var4_4 = var1_1.toDim;
            var5_5 = var2_2.world;
            var6_6 = null;
            try lbl-1000:
            // 4 sources

            {
                for (em var8_9 : em.ad()) {
                    if (var8_9.world.isRemote) {
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                break block8;
            }
            catch (ConcurrentModificationException var7_8) {
                // empty catch block
                break block8;
            }
lbl-1000:
            // 1 sources

            {
                if (!(var8_9 instanceof e3)) ** GOTO lbl-1000
            }
            {
                var9_10 = (e3)var8_9;
                if (!var3_3.equals(var9_10.e())) ** GOTO lbl-1000
            }
            {
                var10_11 = var9_10.C();
                var11_12 = var9_10.F();
                var6_6 = var9_10;
                var6_6.a((UUID)null);
                var6_6.e((UUID)null);
                var6_6.b(fp.NULL);
                var12_13 = new e3(var5_5);
                var12_13.dimension = var4_4;
                var12_13.forceSpawn = true;
                var12_13.f(var10_11);
                var12_13.e(var11_12);
                e3.access$000(var12_13).set(e3.aC, (Object)true);
                var5_5.spawnEntity((Entity)var12_13);
                var12_13.setPositionAndUpdate(var2_2.posX, var2_2.posY, var2_2.posZ);
                var12_13.a(var3_3);
                var12_13.b(fp.SHOULDER_IDLE);
            }
        }
        if (var6_6 == null) {
            return;
        }
        var5_5.removeEntity(var6_6);
        em.ad().remove(var6_6);
    }

    @SubscribeEvent
    public void a(LivingAttackEvent livingAttackEvent) {
        block2: {
            if (livingAttackEvent.getSource() == DamageSource.OUT_OF_WORLD) {
                return;
            }
            EntityLivingBase entityLivingBase = livingAttackEvent.getEntityLiving();
            if (!(entityLivingBase instanceof e3)) {
                return;
            }
            e3 e32 = (e3)entityLivingBase;
            if (e32.e() == null) break block2;
            livingAttackEvent.setCanceled(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SubscribeEvent
    @SideOnly(value=Side.CLIENT)
    public void a(InputEvent.KeyInputEvent keyInputEvent) {
        if (a == null) {
            a = Minecraft.getMinecraft();
        }
        if (e3.c.c.a.currentScreen instanceof ea) {
            return;
        }
        if (!ClientProxy.keyBindings[0].isPressed()) {
            return;
        }
        em em2 = null;
        UUID uUID = Minecraft.getMinecraft().player.getPersistentID();
        try {
            for (em em3 : em.ad()) {
                ai ai2;
                if (!em3.world.isRemote || !(em3 instanceof ai) || !uUID.equals((ai2 = (ai)((Object)em3)).e())) continue;
                em2 = em3;
                break;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        if (em2 == null) {
            return;
        }
        if (em2.y() != fp.SHOULDER_IDLE) {
            return;
        }
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new ea(em2));
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
