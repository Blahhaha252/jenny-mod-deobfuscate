/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.client.event.RenderPlayerEvent$Pre
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class l {
    Vec3d b = null;
    Vec3d a = null;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @SubscribeEvent
    public void a(RenderPlayerEvent.Pre pre) {
        block7: {
            Iterator<em> iterator = em.ad().iterator();
            while (iterator.hasNext()) {
                em em2 = iterator.next();
                if (em2.field_70128_L || em2.ae() == null || em2.y() == fp.NULL) continue;
                EntityPlayer entityPlayer = pre.getEntityPlayer();
                if (!em2.y().hasPlayer || !em2.ae().equals(entityPlayer.getPersistentID()) && !em2.ae().equals(entityPlayer.func_110124_au())) {
                    continue;
                }
                break block7;
            }
            return;
        }
        try {
            pre.setCanceled(true);
            return;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @SubscribeEvent
    public void a(RenderHandEvent renderHandEvent) {
        fp fp2;
        UUID uUID;
        em em2;
        Minecraft minecraft = Minecraft.func_71410_x();
        EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
        ei ei2 = ei.g((EntityPlayer)entityPlayerSP);
        if (ei2 != null && ei2.Q()) {
            renderHandEvent.setCanceled(true);
            return;
        }
        Iterator<em> iterator = em.ad().iterator();
        do {
            if (!iterator.hasNext()) return;
            em2 = iterator.next();
            uUID = em2.ae();
            fp2 = em2.y();
        } while (em2.field_70128_L || uUID == null || fp2 == null || !fp2.hasPlayer || !uUID.equals(entityPlayerSP.func_110124_au()) && !uUID.equals(entityPlayerSP.getPersistentID()));
        try {
            renderHandEvent.setCanceled(true);
            return;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(TickEvent.RenderTickEvent renderTickEvent) {
        Minecraft minecraft = Minecraft.func_71410_x();
        if (minecraft.field_71439_g == null) {
            return;
        }
        if (renderTickEvent.phase == TickEvent.Phase.END) {
            if (this.b != null) {
                minecraft.field_71439_g.func_70107_b(this.b.field_72450_a, this.b.field_72448_b, this.b.field_72449_c);
                minecraft.field_71439_g.field_70142_S = this.a.field_72450_a;
                minecraft.field_71439_g.field_70137_T = this.a.field_72448_b;
                minecraft.field_71439_g.field_70136_U = this.a.field_72449_c;
                this.b = null;
                this.a = null;
            }
            return;
        }
        if (minecraft.field_71474_y.field_74320_O != 0) {
            return;
        }
        em em2 = em.a(minecraft.field_71439_g.getPersistentID(), false);
        if (em2 == null) {
            return;
        }
        if (!em2.y().useBoyCam) {
            return;
        }
        if (em2.m()) {
            return;
        }
        this.b = minecraft.field_71439_g.func_174791_d();
        this.a = new Vec3d(minecraft.field_71439_g.field_70142_S, minecraft.field_71439_g.field_70137_T, minecraft.field_71439_g.field_70136_U);
        Vec3d vec3d = em2.Q() ? em2.b("boyCam").func_178787_e(em2.o()) : em2.b("boyCam").func_178787_e(b6.a(new Vec3d(em2.field_70142_S, em2.field_70137_T, em2.field_70136_U), em2.func_174791_d(), (double)renderTickEvent.renderTickTime));
        minecraft.field_71439_g.field_70165_t = vec3d.field_72450_a;
        minecraft.field_71439_g.field_70163_u = vec3d.field_72448_b - (double)minecraft.field_71439_g.func_70047_e();
        minecraft.field_71439_g.field_70161_v = vec3d.field_72449_c;
        minecraft.field_71439_g.field_70142_S = vec3d.field_72450_a;
        minecraft.field_71439_g.field_70137_T = vec3d.field_72448_b - (double)minecraft.field_71439_g.func_70047_e();
        minecraft.field_71439_g.field_70136_U = vec3d.field_72449_c;
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
