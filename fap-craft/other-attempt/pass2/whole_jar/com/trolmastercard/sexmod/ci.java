/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ai;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.e3;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ci
extends cv {
    final float g = 60.0f;
    Minecraft f = Minecraft.func_71410_x();

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/goblin/goblin.geo.json"), new ResourceLocation("sexmod", "geo/goblin/armored.geo.json")};
    }

    @Override
    public ResourceLocation b() {
        return new ResourceLocation("sexmod", "textures/entity/goblin/goblin.png");
    }

    @Override
    public ResourceLocation b(em em2) {
        return new ResourceLocation("sexmod", "animations/goblin/goblin.animation.json");
    }

    protected boolean f(em em2) {
        if (!(em2 instanceof e3)) {
            return super.f(em2);
        }
        e3 e32 = (e3)em2;
        UUID uUID = e32.ae();
        if (uUID == null) {
            uUID = e32.e();
        }
        if (uUID == null) {
            return true;
        }
        World world = e32.field_70170_p;
        AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)world.func_152378_a(uUID);
        if (abstractClientPlayer == null) {
            return true;
        }
        return "default".equals(abstractClientPlayer.func_175154_l());
    }

    public void a(em em2, Integer n2, AnimationEvent animationEvent) {
        block10: {
            super.a(em2, n2, animationEvent);
            if (em2.field_70170_p instanceof gj) {
                return;
            }
            AnimationProcessor animationProcessor = this.getAnimationProcessor();
            boolean bl2 = em2 instanceof e3;
            IBone iBone = animationProcessor.getBone("preggy");
            iBone.setHidden((Boolean)em2.func_184212_Q().func_187225_a(e3.aV) == false);
            IBone iBone2 = animationProcessor.getBone("body");
            IBone iBone3 = animationProcessor.getBone("head");
            fp fp2 = em2.y();
            if ((fp2 == fp.BREEDING_SLOW_2 || fp2 == fp.BREEDING_FAST_2 || fp2 == fp.BREEDING_CUM_2) && this.f.field_71474_y.field_74320_O == 0) {
                iBone2.setPositionY(iBone2.getPositionY() + 1.5f);
            }
            ai ai2 = (ai)((Object)em2);
            if (bl2 && fp2 == fp.AWAIT_PICK_UP || fp2 == fp.VANISH) {
                this.a(em2, iBone2, iBone3);
            }
            if (bl2 && fp2 == fp.SIT) {
                this.a(em2, iBone3);
            }
            if (fp2 == fp.START_THROWING) {
                if (this.f.field_71439_g.getPersistentID().equals(ai2.e())) {
                    this.a(iBone2, animationProcessor, em2, ai2);
                } else {
                    this.a(iBone2, animationProcessor, em2);
                }
            } else {
                iBone2.setHidden(false);
            }
            if (!iBone2.isHidden() && fp2 == fp.START_THROWING || fp2 == fp.THROWN) {
                Vec3d vec3d = ci.d(em2);
                iBone2.setRotationX((float)vec3d.field_72450_a);
                iBone2.setPositionY((float)vec3d.field_72448_b);
                iBone2.setPositionZ((float)vec3d.field_72449_c);
            }
            if (fp2 == fp.START_THROWING || fp2 == fp.PICK_UP) {
                this.a(animationProcessor, ai2, em2);
            }
            if (bl2) break block10;
            this.b(animationProcessor, em2);
            this.a(animationProcessor, em2);
        }
    }

    void a(AnimationProcessor animationProcessor, em em2) {
        if (em2.y() != fp.START_THROWING) {
            return;
        }
        if (this.f.field_71474_y.field_74320_O != 0 || !this.f.field_71439_g.getPersistentID().equals(((ei)em2).m())) {
            return;
        }
        IBone iBone = animationProcessor.getBone("body");
        if (iBone == null) {
            return;
        }
        iBone.setHidden(true);
    }

    void b(AnimationProcessor animationProcessor, em em2) {
        if (em2.y() != fp.PICK_UP) {
            return;
        }
        if (this.f.field_71474_y.field_74320_O == 0 && this.f.field_71439_g.getPersistentID().equals(((ai)((Object)em2)).e())) {
            return;
        }
        IBone iBone = animationProcessor.getBone("body");
        if (iBone == null) {
            return;
        }
        IBone iBone2 = animationProcessor.getBone("steve");
        if (iBone2 == null) {
            return;
        }
        iBone.setPositionY(iBone.getPositionY() - 32.0f);
        iBone2.setPositionY(iBone2.getPositionY() - 32.0f);
    }

    void a(AnimationProcessor animationProcessor, ai ai2, em em2) {
        UUID uUID = ai2.e();
        if (uUID == null) {
            em2.ae();
        }
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer = em2.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        float f10 = b6.a(entityPlayer.field_184618_aE, entityPlayer.field_70721_aZ, this.f.func_184121_ak());
        float f11 = entityPlayer.field_184619_aG;
        float f12 = (float)Math.sin(f11);
        IBone iBone = animationProcessor.getBone("LeftLeg");
        IBone iBone2 = animationProcessor.getBone("RightLeg");
        float f13 = gc.c(60.0f * f12 * f10);
        iBone.setRotationX(f13);
        iBone2.setRotationX(-f13);
    }

    void a(em em2, IBone iBone) {
        EntityPlayer entityPlayer = em2.field_70170_p.func_72890_a((Entity)em2, 15.0);
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = entityPlayer.func_174791_d();
        Vec3d vec3d2 = em2.func_174791_d();
        Vec3d vec3d3 = vec3d.func_178788_d(vec3d2);
        float f10 = em2.field_70177_z;
        boolean bl2 = false;
        switch ((int)f10) {
            case 0: {
                bl2 = vec3d.field_72449_c > vec3d2.field_72449_c;
                break;
            }
            case 180: {
                bl2 = vec3d.field_72449_c < vec3d2.field_72449_c;
                break;
            }
            case 90: {
                bl2 = vec3d.field_72450_a < vec3d2.field_72450_a;
                break;
            }
            case -90: {
                boolean bl3 = bl2 = vec3d.field_72450_a > vec3d2.field_72450_a;
            }
        }
        if (!bl2) {
            iBone.setRotationY(0.0f);
            return;
        }
        float f11 = 0.0f;
        switch ((int)f10) {
            case 180: {
                f11 = 90.0f;
                break;
            }
            case 90: {
                f11 = 180.0f;
                break;
            }
            case 0: {
                f11 = -90.0f;
            }
        }
        float f12 = (float)(-(MathHelper.func_181159_b((double)vec3d3.field_72449_c, (double)vec3d3.field_72450_a) * 57.29577951308232 + (double)f11));
        float f13 = be.b((float)((double)entityPlayer.func_70047_e() + vec3d.field_72448_b - ((double)em2.func_70047_e() + vec3d2.field_72448_b)), -0.75f, 0.75f);
        iBone.setRotationY(gc.c(f12));
        iBone.setRotationX(f13);
    }

    void a(em em2, IBone iBone, IBone iBone2) {
        EntityPlayer entityPlayer = em2.field_70170_p.func_72890_a((Entity)em2, 15.0);
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = entityPlayer.func_174791_d();
        Vec3d vec3d2 = em2.func_174791_d();
        Vec3d vec3d3 = vec3d.func_178788_d(vec3d2);
        float f10 = (float)(-(Math.atan2(vec3d3.field_72449_c, vec3d3.field_72450_a) * 57.29577951308232)) + 90.0f;
        float f11 = be.b((float)((double)entityPlayer.func_70047_e() + vec3d.field_72448_b - ((double)em2.func_70047_e() + vec3d2.field_72448_b)), -0.75f, 0.75f);
        iBone.setRotationY(gc.c(f10));
        iBone2.setRotationX(f11);
    }

    void a(IBone iBone, AnimationProcessor animationProcessor, em em2) {
        if (em2.h()) {
            iBone.setHidden(true);
        } else {
            iBone.setHidden(false);
            animationProcessor.getBone("steve").setHidden(true);
        }
    }

    void a(IBone iBone, AnimationProcessor animationProcessor, em em2, ai ai2) {
        block2: {
            if (em2.h()) {
                iBone.setHidden(true);
            } else {
                iBone.setHidden(ai2.a() < 15);
            }
            if (em2.h()) break block2;
            animationProcessor.getBone("steve").setHidden(true);
        }
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorBoobL", "armorBoobR"};
    }

    @Override
    public String[] a() {
        return new String[]{"nippleL", "nippleR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorCheekR", "armorCheekL", "armorLegL", "armorLegR", "armorShinL", "armorShinR", "armorTorso"};
    }

    @Override
    public String[] e() {
        return new String[]{"fuckhole", "vagina", "meatCheekR", "meatCheekL", "meatLegL", "meatLegR", "meatShinL", "meatShinR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorFootL", "armorFootR"};
    }

    @Override
    public String[] d() {
        return new String[]{"meatFootL", "meatFootR"};
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

