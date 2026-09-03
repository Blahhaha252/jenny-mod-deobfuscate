/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.processor.IBone
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gj;
import java.util.HashMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cx
extends cv {
    HashMap<Integer, float[]> f = new HashMap<Integer, float[]>(){
        {
            this.put(0, new float[]{0.0f, -1.2f, 1.2f});
            this.put(-90, new float[]{2.0f, -71.56f, -68.0f});
            this.put(90, new float[]{-2.0f, 68.0f, 70.5f});
        }
    };

    public cx() {
        this.c = this.a();
    }

    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/ellie/nude.geo.json"), new ResourceLocation("sexmod", "geo/ellie/dressed.geo.json")};
    }

    @Override
    public ResourceLocation b() {
        return new ResourceLocation("sexmod", "textures/entity/ellie/ellie.png");
    }

    @Override
    public ResourceLocation b(em em2) {
        return new ResourceLocation("sexmod", "animations/ellie/ellie.animation.json");
    }

    public void a(em em2, Integer n, AnimationEvent animationEvent) {
        float f;
        float f2;
        float f3;
        IBone iBone;
        EntityPlayer entityPlayer;
        block24: {
            int n2;
            Vec3d vec3d;
            block25: {
                block23: {
                    block22: {
                        try {
                            super.a(em2, n, animationEvent);
                            if (em2.field_70170_p instanceof gj) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw cx.a(runtimeException);
                        }
                        try {
                            if (em2 instanceof ei) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw cx.a(runtimeException);
                        }
                        try {
                            if (em2.y() != fp.SITDOWNIDLE) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw cx.a(runtimeException);
                        }
                        entityPlayer = em2.field_70170_p.func_72890_a((Entity)em2, 15.0);
                        try {
                            if (entityPlayer == null) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw cx.a(runtimeException);
                        }
                        iBone = this.getAnimationProcessor().getBone("head");
                        vec3d = em2.func_174791_d().func_178788_d(entityPlayer.func_174791_d());
                        n2 = Math.round(em2.I().floatValue());
                        if (n2 != 180) break block25;
                        f3 = (float)Math.atan2(vec3d.field_72450_a, vec3d.field_72449_c) * 1.2f;
                        f3 = f3 > 0.0f ? Math.max(1.5f, Math.min(3.14f, f3)) : Math.max(-3.14f, Math.min(-1.5f, f3));
                        try {
                            try {
                                try {
                                    if (f3 == 1.5f || f3 == 3.14f) break block22;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cx.a(runtimeException);
                                }
                                if (f3 == -3.14f) break block22;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cx.a(runtimeException);
                            }
                            if (f3 != -1.5f) break block23;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cx.a(runtimeException);
                        }
                    }
                    f3 = 0.0f;
                    break block24;
                }
                f3 += 3.0f;
                break block24;
            }
            f2 = this.f.get(n2)[1];
            float f4 = this.f.get(n2)[2];
            f3 = ((float)(Math.atan2(vec3d.field_72450_a, vec3d.field_72449_c) + (double)this.f.get(n2)[0]) + em2.I().floatValue()) * 0.8f;
            f3 = be.b(f3, f2, f4);
            try {
                if (f3 != f2 && f3 != f4) break block24;
            }
            catch (RuntimeException runtimeException) {
                throw cx.a(runtimeException);
            }
            f3 = 0.0f;
        }
        try {
            f = f3 == 0.0f ? 0.0f : be.b((float)((entityPlayer.field_70163_u - em2.field_70163_u) * 0.5), -0.75f, 0.75f);
        }
        catch (RuntimeException runtimeException) {
            throw cx.a(runtimeException);
        }
        f2 = f;
        iBone.setRotationY(f3);
        iBone.setRotationX(f2);
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] g() {
        return new String[]{"headband"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] a() {
        return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

    @Override
    public String[] e() {
        return new String[]{"fleshL", "fleshR", "vagina", "hotpants", "slip", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
