/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.a_;
import com.trolmastercard.sexmod.ak;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.b7;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ce;
import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f2;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.resource.GeckoLibCache;
import software.bernie.shadowed.eliotlash.molang.MolangParser;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cb
extends cv {
    public static ResourceLocation h = new ResourceLocation("sexmod", "textures/entity/galath/galath.png");
    float g = 0.0f;
    long f = -1L;
    long i = -1L;

    public cb() {
        this.c = this.a();
    }

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/galath/galath.geo.json"), new ResourceLocation("sexmod", "geo/galath/galath.geo.json"), new ResourceLocation("sexmod", "geo/galath/galath_con_mang.geo.json")};
    }

    @Override
    public ResourceLocation a(em em2) {
        if (em2.field_70170_p instanceof gj) {
            return this.c[0];
        }
        if (((b7)((Object)em2)).b()) {
            return this.c[2];
        }
        return this.c[(Integer)em2.func_184212_Q().func_187225_a(em.D)];
    }

    @Override
    public ResourceLocation b() {
        return h;
    }

    @Override
    public ResourceLocation b(em em2) {
        return new ResourceLocation("sexmod", "animations/galath/galath.animation.json");
    }

    protected boolean e(em em2) {
        if (!(em2 instanceof f_)) {
            return true;
        }
        f_ f_2 = (f_)em2;
        if (f_2.k()) {
            return true;
        }
        return f_2.M() == null;
    }

    public void a(em em2, Integer n2, AnimationEvent animationEvent) {
        block1: {
            this.k(em2);
            super.a(em2, n2, animationEvent);
            this.a(em2);
            this.h(em2);
            this.f(em2);
            this.b(em2);
            this.e(em2);
            this.g(em2);
            this.j(em2);
            this.a();
            this.c(em2);
            this.i(em2);
            this.d(em2);
            if (!(em2 instanceof f_)) {
                return;
            }
            f_ f_2 = (f_)em2;
            f_2.aE = this.getAnimationProcessor().getBone("head").getRotationX();
            if (!f_2.b()) break block1;
            ce.a(f_2, this.getAnimationProcessor(), animationEvent.getPartialTick());
        }
    }

    void i(em em2) {
        if (!fp.a(em2, fp.PUSSY_LICKING)) {
            return;
        }
        if (!(em2 instanceof f_)) {
            return;
        }
        if (this.a.func_147113_T()) {
            return;
        }
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        IBone iBone = animationProcessor.getBone("head");
        float f10 = this.a.func_184121_ak() + (float)this.a.field_71439_g.field_70173_aa;
        f7 f72 = this.a((f_)em2, f10);
        iBone.setRotationX(iBone.getRotationX() + f72.a);
        iBone.setRotationY(iBone.getRotationY() + f72.c);
        iBone.setRotationZ(iBone.getRotationZ() + f72.b);
        if (em2.y() != fp.PUSSY_LICKING || ((f_)em2).a5) {
            return;
        }
        float f11 = (float)(Math.sin(f10 * 0.3f) * 10.0);
        if (f11 > 0.0f && this.g < 0.0f || f11 < 0.0f && this.g > 0.0f) {
            em2.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND));
        }
        this.g = f11;
    }

    f7 a(f_ f_2, float f10) {
        return b6.a(this.a(f10), f7.d, (double)f_2.b(this.a.func_184121_ak()));
    }

    f7 a(float f10) {
        return new f7((float)Math.sin(f10 * 0.3f) * gc.c(10.0f), (float)Math.sin(f10 * 0.15f) * gc.c(7.0f), (float)Math.sin((double)f10 * -0.15) * gc.c(7.0f));
    }

    void c(em em2) {
        if (!(em2 instanceof f_)) {
            return;
        }
        f_ f_2 = (f_)em2;
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        IBone iBone = animationProcessor.getBone("body");
        f_2.bw = iBone.getRotationY();
        f_2.bm = iBone.getScaleY();
    }

    void d(em em2) {
        if (em2.C.getAnimationState() != AnimationState.Transitioning) {
            return;
        }
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        fp fp2 = em2.y();
        if (fp2 == fp.HUG_MANG) {
            IBone iBone = animationProcessor.getBone("body2");
            if (iBone == null) {
                return;
            }
            iBone.setPositionX(0.0f);
            iBone.setPositionY(-0.53f);
            iBone.setPositionZ(-40.05f);
        }
    }

    void k(em em2) {
        if (ClientProxy.IS_PRELOADING) {
            return;
        }
        if (em2.y() != fp.MASTERBATE) {
            return;
        }
        EntityPlayer entityPlayer = em2.z();
        if (entityPlayer == null) {
            entityPlayer = this.a.field_71439_g;
        }
        MolangParser molangParser = GeckoLibCache.getInstance().parser;
        Vec3d vec3d = ak.b((Entity)em2, entityPlayer, this.a.func_184121_ak()).func_178787_e(em2.b("head"));
        float f10 = (float)gc.b(Math.atan2(vec3d.field_72449_c, vec3d.field_72450_a)) - em2.I().floatValue();
        float f11 = (float)gc.b(Math.atan2(vec3d.field_72448_b, Math.sqrt(vec3d.field_72450_a * vec3d.field_72450_a + vec3d.field_72449_c * vec3d.field_72449_c)));
        double d10 = Math.abs(vec3d.field_72450_a) + Math.abs(vec3d.field_72448_b) + Math.abs(vec3d.field_72449_c);
        double d11 = d10 * 7.0 + -20.0;
        double d12 = d10 * 5.0 + -20.0;
        molangParser.setValue("pitch", d11 + (double)f11 - 80.0);
        molangParser.setValue("armpitch", d12 + (double)f11 + -110.0);
        molangParser.setValue("armyaw", f10 + 80.0f);
        molangParser.setValue("yaw", f10 + 90.0f);
    }

    void a() {
        if (ClientProxy.IS_PRELOADING) {
            return;
        }
        this.getAnimationProcessor().getBone("futaCock").setHidden(!a_.e);
        this.getAnimationProcessor().getBone("futaBallLL").setHidden(!a_.e);
        this.getAnimationProcessor().getBone("futaBallLR").setHidden(!a_.e);
    }

    void j(em em2) {
        if (!(em2 instanceof ei)) {
            return;
        }
        this.getAnimationProcessor().getBone("coin").setHidden(true);
    }

    void g(em em2) {
        this.getAnimationProcessor().getBone("wings").setHidden(!((b7)((Object)em2)).a());
    }

    void e(em em2) {
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        IBone iBone = animationProcessor.getBone("nippleR");
        IBone iBone2 = animationProcessor.getBone("nippleL");
        IBone iBone3 = animationProcessor.getBone("braBoobL");
        IBone iBone4 = animationProcessor.getBone("braBoobR");
        IBone iBone5 = animationProcessor.getBone("slip");
        boolean bl2 = ((b7)((Object)em2)).c();
        boolean bl3 = fp.a(em2, fp.PUSSY_LICKING, fp.MASTERBATE_SITTING, fp.MASTERBATE_SITTING_CUM);
        if (iBone == null) {
            return;
        }
        if (iBone3 == null) {
            return;
        }
        iBone.setHidden(!bl2);
        iBone2.setHidden(!bl2);
        iBone3.setHidden(bl2);
        iBone4.setHidden(bl2);
        iBone5.setHidden(bl2 || bl3);
    }

    void b(em em2) {
        boolean bl2;
        if (!(em2 instanceof f_)) {
            return;
        }
        if (!((Boolean)em2.func_184212_Q().func_187225_a(f_.bP)).booleanValue()) {
            return;
        }
        if (em2.y() != fp.KNOCK_OUT_FLY) {
            return;
        }
        IBone iBone = this.getAnimationProcessor().getBone("body");
        Vec3d vec3d = new Vec3d(em2.field_70142_S, em2.field_70137_T, em2.field_70136_U);
        Vec3d vec3d2 = em2.func_174791_d().func_178788_d(vec3d);
        boolean bl3 = bl2 = Math.abs(vec3d2.field_72450_a) + Math.abs(vec3d2.field_72449_c) < (double)0.01f;
        if (bl2) {
            iBone.setRotationX(gc.c(-90.0f));
            iBone.setPositionY(0.0f);
            iBone.setPositionZ(0.0f);
        } else {
            Vec3d vec3d3 = cb.d(em2);
            iBone.setRotationX(-((float)vec3d3.field_72450_a));
            iBone.setPositionY((float)vec3d3.field_72448_b);
            iBone.setPositionZ((float)vec3d3.field_72449_c);
        }
    }

    void h(em em2) {
        if (!(em2 instanceof f_)) {
            return;
        }
        if (em2.y() != fp.RAPE_CHARGE) {
            return;
        }
        Vec3d vec3d = cb.d(em2);
        IBone iBone = this.getAnimationProcessor().getBone("body");
        IBone iBone2 = this.getAnimationProcessor().getBone("rotationTool");
        iBone2.setRotationX((float)vec3d.field_72450_a);
        iBone.setPositionY((float)vec3d.field_72448_b);
        iBone.setPositionZ((float)vec3d.field_72449_c);
        float f10 = ((Float)em2.func_184212_Q().func_187225_a(f_.bO)).floatValue();
        iBone.setRotationY(gc.c(f10 * 180.0f));
    }

    void f(em em2) {
        if (!(em2 instanceof f_)) {
            return;
        }
        f_ f_2 = (f_)em2;
        if (f_2.y() != fp.ATTACK_SWORD) {
            this.f = -1L;
            this.i = -1L;
            return;
        }
        int n2 = f_2.az();
        if (n2 == 24 && this.f == -1L) {
            this.f = this.a.field_71441_e.func_82737_E();
            this.i = this.f + 8L;
        }
        if (!be.a((double)n2, 24.0, 32.0)) {
            return;
        }
        IBone iBone = this.getAnimationProcessor().getBone("body");
        Vec3d vec3d = cb.a(f_2, f_2.B());
        float f10 = ((float)Minecraft.func_71410_x().field_71441_e.func_82737_E() + this.a.func_184121_ak() - (float)this.f) / (float)(this.i - this.f);
        vec3d = b6.a(vec3d, Vec3d.field_186680_a, (double)f10);
        iBone.setRotationX((float)vec3d.field_72450_a);
        iBone.setPositionY((float)vec3d.field_72448_b);
        iBone.setPositionZ((float)vec3d.field_72449_c);
    }

    void a(em em2) {
        float f10 = 0.0f;
        switch (em2.y()) {
            case BOOST: {
                if (fp.BOOST.ticksPlaying[1] > 13 && fp.BOOST.ticksPlaying[1] < 40) {
                    f10 = 45.0f;
                }
            }
            case FLY: 
            case CONTROLLED_FLIGHT: {
                break;
            }
            default: {
                return;
            }
        }
        float f11 = Minecraft.func_71410_x().func_184121_ak();
        IBone iBone = this.getAnimationProcessor().getBone("rotationTool");
        f2 f22 = ((b7)((Object)em2)).d();
        iBone.setRotationX((float)b6.b(f22.c + (double)f10, f22.d + (double)f10, (double)f11));
        iBone.setRotationZ((float)b6.b(f22.b, f22.a, (double)f11));
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

