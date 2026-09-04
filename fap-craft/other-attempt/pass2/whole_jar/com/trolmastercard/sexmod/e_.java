/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector2f
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityBoat
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemBow
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup
 *  net.minecraftforge.client.event.RenderPlayerEvent$Pre
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.dm;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import javax.vecmath.Vector2f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class e_ {
    public static final float c = 1.2345679f;
    Vec3d b = null;
    Vec3d d = null;
    ei a = null;
    boolean e = false;

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderPlayerEvent.Pre pre) {
        if (pre.getPartialRenderTick() == 1.2345679f) {
            return;
        }
        ei.C();
        ei ei2 = ei.d(pre.getEntityPlayer().getPersistentID());
        if (ei2 == null) {
            return;
        }
        pre.setCanceled(true);
        e_.a(ei2, pre.getEntityPlayer(), pre.getX(), pre.getY(), pre.getZ(), pre.getPartialRenderTick());
    }

    @SideOnly(value=Side.CLIENT)
    public static void a(ei ei2, EntityPlayer entityPlayer, double d10, double d11, double d12, float f10) {
        Minecraft minecraft = Minecraft.func_71410_x();
        if ((entityPlayer = ei2.c(entityPlayer)).func_98034_c((EntityPlayer)minecraft.field_71439_g) && !ei2.E()) {
            return;
        }
        RenderManager renderManager = minecraft.func_175598_ae();
        ei2.field_70177_z = entityPlayer.field_70177_z;
        ei2.field_70758_at = entityPlayer.field_70758_at;
        ei2.field_70759_as = entityPlayer.field_70759_as;
        ei2.field_70127_C = entityPlayer.field_70127_C;
        ei2.field_70125_A = entityPlayer.field_70125_A;
        ei2.field_70126_B = entityPlayer.field_70126_B;
        ei2.field_70169_q = entityPlayer.field_70169_q;
        ei2.field_70167_r = entityPlayer.field_70167_r;
        ei2.field_70166_s = entityPlayer.field_70166_s;
        ei2.field_70142_S = entityPlayer.field_70142_S;
        ei2.field_70137_T = entityPlayer.field_70137_T;
        ei2.field_70136_U = entityPlayer.field_70136_U;
        ei2.field_70761_aq = entityPlayer.field_70761_aq;
        ei2.field_70760_ar = entityPlayer.field_70760_ar;
        ei2.ad = entityPlayer.func_70093_af();
        ei2.aj = entityPlayer.func_70051_ag();
        ei2.ak = entityPlayer.func_184218_aH();
        ei2.af = entityPlayer.field_70122_E;
        ei2.ah = entityPlayer.func_184605_cv() != 0;
        double d13 = entityPlayer.field_70142_S - entityPlayer.field_70165_t;
        double d14 = entityPlayer.field_70161_v - entityPlayer.field_70136_U;
        double d15 = Math.PI / 180 * (double)entityPlayer.field_70177_z;
        ei2.ao = new Vector2f((float)(d13 * Math.cos(d15) + d14 * Math.sin(d15)), (float)(d13 * Math.sin(d15) + d14 * Math.cos(d15)));
        float f11 = ei2.z() ? e_.a(ei2, entityPlayer) : 0.0f;
        dm.v = true;
        renderManager.func_188391_a((Entity)ei2, d10, d11 + (double)f11, d12, 90.0f, f10, false);
    }

    static float a(ei ei2, EntityPlayer entityPlayer) {
        if (((Boolean)ei2.func_184212_Q().func_187225_a(em.G)).booleanValue()) {
            return 0.0f;
        }
        if ((entityPlayer.func_184614_ca().func_77973_b() instanceof ItemBow || entityPlayer.func_184592_cb().func_77973_b() instanceof ItemBow) && ei2.ah) {
            ei2.b(fp.BOW);
        }
        if (ei2.y() == fp.BOW && !ei2.ah) {
            ei2.b(fp.NULL);
        }
        if (ei2.y() == fp.BOW) {
            ei2.field_70177_z = ei2.field_70759_as;
            ei2.field_70761_aq = ei2.field_70759_as;
            ei2.field_70760_ar = ei2.field_70758_at;
        }
        if (ei2.ak) {
            return entityPlayer.func_184187_bx() instanceof EntityBoat ? 0.4f : 0.2f;
        }
        return 0.0f;
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(TickEvent.RenderTickEvent renderTickEvent) {
        block11: {
            Minecraft minecraft = Minecraft.func_71410_x();
            if (minecraft.field_71439_g == null) {
                return;
            }
            if (renderTickEvent.phase == TickEvent.Phase.END) {
                if (this.b != null) {
                    minecraft.field_71439_g.func_70107_b(this.b.field_72450_a, this.b.field_72448_b, this.b.field_72449_c);
                    minecraft.field_71439_g.field_70142_S = this.d.field_72450_a;
                    minecraft.field_71439_g.field_70137_T = this.d.field_72448_b;
                    minecraft.field_71439_g.field_70136_U = this.d.field_72449_c;
                    this.b = null;
                    this.d = null;
                }
                return;
            }
            if (minecraft.field_71474_y.field_74320_O != 0) {
                return;
            }
            ei ei2 = ei.d(minecraft.field_71439_g.getPersistentID());
            if (ei2 == null) {
                return;
            }
            if (!ei2.o()) {
                return;
            }
            this.b = minecraft.field_71439_g.func_174791_d();
            this.d = new Vec3d(minecraft.field_71439_g.field_70142_S, minecraft.field_71439_g.field_70137_T, minecraft.field_71439_g.field_70136_U);
            Vec3d vec3d = ei2.b("girlCam");
            vec3d = ei2.b(vec3d, renderTickEvent.renderTickTime);
            vec3d = vec3d.func_178787_e(b6.a(this.d, this.b, (double)renderTickEvent.renderTickTime));
            minecraft.field_71439_g.field_70165_t = vec3d.field_72450_a;
            minecraft.field_71439_g.field_70163_u = vec3d.field_72448_b - (double)minecraft.field_71439_g.func_70047_e();
            minecraft.field_71439_g.field_70161_v = vec3d.field_72449_c;
            minecraft.field_71439_g.field_70142_S = vec3d.field_72450_a;
            minecraft.field_71439_g.field_70137_T = vec3d.field_72448_b - (double)minecraft.field_71439_g.func_70047_e();
            minecraft.field_71439_g.field_70136_U = vec3d.field_72449_c;
            fp fp2 = ei2.y();
            float f10 = ei2.I().floatValue();
            if (ei2.a(fp2, (EntityPlayer)minecraft.field_71439_g)) {
                return;
            }
            if (fp2.flipGirlYaw) {
                f10 += 180.0f;
            }
            if (minecraft.field_71439_g.field_70125_A > fp2.maxGirlPitch) {
                minecraft.field_71439_g.field_70125_A = fp2.maxGirlPitch;
                minecraft.field_71439_g.field_70127_C = fp2.maxGirlPitch;
            }
            if (minecraft.field_71439_g.field_70125_A < fp2.minGirlPitch) {
                minecraft.field_71439_g.field_70125_A = fp2.minGirlPitch;
                minecraft.field_71439_g.field_70127_C = fp2.minGirlPitch;
            }
            if (minecraft.field_71439_g.field_70177_z > f10 + 90.0f) {
                minecraft.field_71439_g.field_70177_z = f10 + 90.0f;
                minecraft.field_71439_g.field_70126_B = f10 + 90.0f;
            }
            if (!(minecraft.field_71439_g.field_70177_z < f10 - 90.0f)) break block11;
            minecraft.field_71439_g.field_70177_z = f10 - 90.0f;
            minecraft.field_71439_g.field_70126_B = f10 - 90.0f;
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(EntityViewRenderEvent.CameraSetup cameraSetup) {
        Minecraft minecraft = Minecraft.func_71410_x();
        if (minecraft.field_71439_g == null) {
            return;
        }
        ei ei2 = ei.d(minecraft.field_71439_g.getPersistentID());
        if (ei2 == null) {
            return;
        }
        if (!ei2.F()) {
            return;
        }
        if (!ei2.Q()) {
            return;
        }
        cameraSetup.setRoll(180.0f);
        cameraSetup.setPitch(-cameraSetup.getPitch());
        cameraSetup.setYaw(-cameraSetup.getYaw());
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderWorldLastEvent renderWorldLastEvent) {
        Minecraft minecraft = Minecraft.func_71410_x();
        if (this.b == null) {
            return;
        }
        if (minecraft.field_71474_y.field_74320_O != 0) {
            return;
        }
        ei ei2 = ei.d(minecraft.field_71439_g.getPersistentID());
        if (ei2 == null) {
            return;
        }
        Vec3d vec3d = minecraft.field_71439_g.func_174791_d();
        Vec3d vec3d2 = b6.a(this.d, this.b, (double)renderWorldLastEvent.getPartialTicks());
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
        e_.a(ei2, (EntityPlayer)minecraft.field_71439_g, vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, renderWorldLastEvent.getPartialTicks());
        GlStateManager.func_179145_e();
        GlStateManager.func_179126_j();
        GlStateManager.func_179141_d();
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void b(TickEvent.RenderTickEvent renderTickEvent) {
        Minecraft minecraft = Minecraft.func_71410_x();
        if (minecraft.field_71439_g == null) {
            return;
        }
        if (renderTickEvent.phase == TickEvent.Phase.END) {
            return;
        }
        ei ei2 = ei.d(minecraft.field_71439_g.getPersistentID());
        if (ei2 == null) {
            if (this.e) {
                this.e = false;
                minecraft.field_71439_g.eyeHeight = minecraft.field_71439_g.getDefaultEyeHeight();
            }
            return;
        }
        if (ei2.Q()) {
            if (this.e) {
                this.e = false;
                minecraft.field_71439_g.eyeHeight = minecraft.field_71439_g.getDefaultEyeHeight();
            }
            return;
        }
        if (this.a != ei2) {
            e_.a(ei2, (EntityPlayer)minecraft.field_71439_g, 0.0, 500.0, 0.0, renderTickEvent.renderTickTime);
            this.a = ei2;
        }
        minecraft.field_71439_g.eyeHeight = ei2.R();
        this.e = true;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

