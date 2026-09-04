/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ai;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.eq;
import com.trolmastercard.sexmod.fp;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public static class eq.a.a {
    HashSet<EntityPlayer> a = new HashSet();

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderHandEvent renderHandEvent) {
        block2: {
            ei ei2 = ei.g((EntityPlayer)Minecraft.func_71410_x().field_71439_g);
            if (ei2 == null) {
                return;
            }
            if (!(ei2 instanceof ai)) {
                return;
            }
            if (((ai)((Object)ei2)).e() == null) break block2;
            renderHandEvent.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void a(TickEvent.PlayerTickEvent playerTickEvent) {
        EntityPlayer entityPlayer = playerTickEvent.player;
        if (entityPlayer == null) {
            return;
        }
        this.a(entityPlayer);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(TickEvent.RenderTickEvent renderTickEvent) {
        if (renderTickEvent.phase == TickEvent.Phase.END) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        if (entityPlayerSP == null) {
            return;
        }
        this.a((EntityPlayer)entityPlayerSP);
    }

    void a(EntityPlayer entityPlayer) {
        ei ei2 = ei.g(entityPlayer);
        if (!(ei2 instanceof eq)) {
            return;
        }
        fp fp2 = ei2.y();
        if (fp2 == fp.THROWN) {
            return;
        }
        if (fp2 == fp.START_THROWING && ((ai)((Object)ei2)).a() > 15) {
            return;
        }
        UUID uUID = ((eq)ei2).e();
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer2 = entityPlayer.field_70170_p.func_152378_a(uUID);
        if (entityPlayer2 == null) {
            return;
        }
        entityPlayer.field_70145_X = true;
        entityPlayer.func_189654_d(true);
        ei2.field_70145_X = true;
        ei2.func_189654_d(true);
        entityPlayer.func_70107_b(entityPlayer2.field_70165_t, entityPlayer2.field_70163_u + 2.0, entityPlayer2.field_70161_v);
        entityPlayer.field_70142_S = entityPlayer2.field_70142_S;
        entityPlayer.field_70137_T = entityPlayer2.field_70137_T + 2.0;
        entityPlayer.field_70136_U = entityPlayer2.field_70136_U;
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderWorldLastEvent renderWorldLastEvent) {
        Minecraft minecraft = Minecraft.func_71410_x();
        RenderManager renderManager = minecraft.func_175598_ae();
        EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
        if (minecraft.field_71439_g == null) {
            return;
        }
        Vec3d vec3d = entityPlayerSP.func_174791_d();
        for (EntityPlayer entityPlayer : this.a) {
            Vec3d vec3d2 = entityPlayer.func_174791_d();
            Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
            renderManager.func_188391_a((Entity)entityPlayer, vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, 69.0f, renderWorldLastEvent.getPartialTicks(), true);
        }
        GlStateManager.func_179145_e();
        GlStateManager.func_179126_j();
        GlStateManager.func_179141_d();
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void b(TickEvent.RenderTickEvent renderTickEvent) {
        if (renderTickEvent.phase == TickEvent.Phase.START) {
            this.b();
        } else {
            this.a();
        }
    }

    @SideOnly(value=Side.CLIENT)
    void a() {
        for (EntityPlayer entityPlayer : this.a) {
            entityPlayer.field_70128_L = true;
        }
    }

    @SideOnly(value=Side.CLIENT)
    void b() {
        this.a.clear();
        Minecraft minecraft = Minecraft.func_71410_x();
        EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
        if (minecraft.field_71441_e == null) {
            return;
        }
        for (EntityPlayer entityPlayer : minecraft.field_71441_e.field_73010_i) {
            eq eq2;
            ei ei2;
            if (entityPlayer == entityPlayerSP || !((ei2 = ei.g(entityPlayer)) instanceof eq) || (eq2 = (eq)ei2).e() == null) continue;
            fp fp2 = eq2.y();
            if (fp2 == fp.THROWN || fp2 == fp.START_THROWING) {
                return;
            }
            this.a.add(entityPlayer);
            entityPlayer.field_70128_L = false;
        }
    }

    @SubscribeEvent
    public void a(PlayerInteractEvent.EntityInteract entityInteract) {
        EntityPlayer entityPlayer = entityInteract.getEntityPlayer();
        if (!entityPlayer.func_70093_af()) {
            return;
        }
        if (!(entityInteract.getTarget() instanceof EntityPlayer)) {
            return;
        }
        ei ei2 = ei.d(entityInteract.getTarget().getPersistentID());
        if (!(ei2 instanceof eq)) {
            return;
        }
        ei ei3 = ei.d(entityPlayer.getPersistentID());
        if (ei3 != null) {
            return;
        }
        ((eq)ei2).c(entityInteract.getEntityPlayer());
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
