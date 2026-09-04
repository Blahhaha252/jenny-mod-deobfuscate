/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3f
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.item.ItemStack
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.dm;
import java.util.HashSet;
import javax.vecmath.Vector3f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class d5
extends dm {
    Vector3f A = new Vector3f(0.0f, 0.0f, 0.0f);
    Vector3f D = new Vector3f(0.0f, 0.0f, 0.0f);
    Vector3f F = new Vector3f(0.0f, 0.0f, 0.0f);
    Vector3f E = new Vector3f(0.0f, 0.0f, 0.0f);
    Vector3f z = new Vector3f(0.0f, 0.0f, 0.0f);
    Vector3f B = new Vector3f(0.0f, 0.0f, 0.0f);
    Vector3f C = new Vector3f(0.0f, 0.0f, 0.0f);

    public d5(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel);
    }

    @Override
    protected void c() {
        GlStateManager.func_179109_b((float)0.0f, (float)-1.25f, (float)0.0f);
        GlStateManager.func_179152_a((float)0.8f, (float)0.8f, (float)0.8f);
    }

    @Override
    protected void a(String string, GeoBone geoBone) {
        block8: {
            if ("slime".equals(string)) {
                this.F = new Vector3f(geoBone.getRotationX(), geoBone.getRotationY(), geoBone.getRotationZ());
                this.A = new Vector3f(geoBone.getScaleX(), geoBone.getScaleY(), geoBone.getScaleZ());
                this.D = new Vector3f(geoBone.getPositionX(), geoBone.getPositionY(), geoBone.getPositionZ());
            }
            if ("upperBody".equals(string)) {
                this.B = new Vector3f(geoBone.getRotationX(), geoBone.getRotationY(), geoBone.getRotationZ());
            }
            if ("torso".equals(string)) {
                this.E = new Vector3f(geoBone.getRotationX(), geoBone.getRotationY(), geoBone.getRotationZ());
            }
            if ("head".equals(string)) {
                this.C = new Vector3f(geoBone.getRotationX(), geoBone.getRotationY(), geoBone.getRotationZ());
            }
            if ("boobs".equals(string)) {
                this.z = new Vector3f(geoBone.getRotationX(), geoBone.getRotationY(), geoBone.getRotationZ());
            }
            if ("figure".equals(string)) {
                geoBone.setRotationX(this.F.x);
                geoBone.setRotationY(this.F.y);
                geoBone.setRotationZ(this.F.z);
                geoBone.setScaleX(this.A.x);
                geoBone.setScaleY(this.A.y);
                geoBone.setScaleZ(this.A.z);
                geoBone.setPositionX(this.D.x);
                geoBone.setPositionY(this.D.y);
                geoBone.setPositionZ(this.D.z);
            }
            if ("dress".equals(string)) {
                geoBone.setRotationX(this.B.x);
                geoBone.setRotationY(this.B.y);
                geoBone.setRotationZ(this.B.z);
            }
            if ("hat".equals(string)) {
                geoBone.setRotationX(this.C.x);
                geoBone.setRotationY(this.C.y);
                geoBone.setRotationZ(this.C.z);
            }
            if (!"boobsSlime".equals(string)) break block8;
            geoBone.setRotationX(this.z.x);
            geoBone.setRotationY(this.z.y);
            geoBone.setRotationZ(this.z.z);
        }
    }

    @Override
    protected void a(boolean bl) {
        super.a(bl);
        if (bl) {
            GlStateManager.func_179109_b((float)0.15f, (float)0.0f, (float)0.0f);
        } else {
            GlStateManager.func_179137_b((double)-0.02, (double)0.0, (double)0.0);
            GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }
    }

    @Override
    public HashSet<String> a() {
        HashSet hashSet = super.a();
        hashSet.add("figure");
        return hashSet;
    }

    @Override
    protected void a(boolean bl, boolean bl2) {
        block2: {
            super.a(bl, bl2);
            if (bl && !bl2) {
                GlStateManager.func_179137_b((double)-0.025, (double)-0.025, (double)0.0);
                return;
            }
            if (!bl && bl2) {
                GlStateManager.func_179114_b((float)120.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                return;
            }
            if (bl || bl2) break block2;
            GlStateManager.func_179137_b((double)0.0, (double)0.4, (double)-0.1);
            GlStateManager.func_179114_b((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }
    }

    @Override
    protected void a(boolean bl, ItemStack itemStack) {
        super.a(bl, itemStack);
        switch (itemStack.func_77973_b().func_77661_b(itemStack)) {
            case BLOCK: 
            case BOW: {
                break;
            }
            default: {
                GlStateManager.func_179114_b((float)(bl ? 30.0f : 135.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179137_b((double)0.0, (double)0.05, (double)-0.05);
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
