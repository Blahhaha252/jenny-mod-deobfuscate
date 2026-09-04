/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.vecmath.Vector4f
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.d9;
import com.trolmastercard.sexmod.dy;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.e3;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.eq;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.fp;
import java.util.HashSet;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.vecmath.Vector4f;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dg
extends d9 {
    eq B = null;
    boolean C = false;
    boolean E = false;
    boolean D = false;

    public dg(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel);
    }

    @Override
    protected Vec3i a(String string) {
        String[] stringArray = e4.a(this.j);
        if (stringArray.length < 8) {
            return z;
        }
        if (string.contains("band")) {
            return dy.w;
        }
        if (string.contains("eyeColor") || string.contains("eyeColor2")) {
            return dy.b(stringArray[8]);
        }
        if (string.contains("variant") || string.contains("boob")) {
            return dy.c(stringArray[7]);
        }
        if (string.contains("hair")) {
            return dy.d(stringArray[6]);
        }
        if (dy.D.contains(string)) {
            return dy.c(stringArray[7]);
        }
        if (dy.M.contains(string)) {
            return dy.d(stringArray[6]);
        }
        return z;
    }

    @Override
    protected Vector4f a(String string, float f, float f2, float f3) {
        if (string.startsWith("crown")) {
            ItemStack itemStack = (ItemStack)this.j.func_184212_Q().func_187225_a(e2.X);
            if (itemStack.func_190926_b()) {
                return super.a(string, f, f2, f3);
            }
            ItemArmor itemArmor = (ItemArmor)itemStack.func_77973_b();
            ItemArmor.ArmorMaterial armorMaterial = itemArmor.func_82812_d();
            float f4 = 0.0f;
            switch (armorMaterial) {
                case GOLD: {
                    f4 = 1.0f;
                    break;
                }
                case CHAIN: 
                case IRON: {
                    f4 = 2.0f;
                    break;
                }
                case LEATHER: {
                    f4 = 4.0f;
                    int n = itemArmor.func_82814_b(itemStack);
                    float f5 = (float)(n >> 16 & 0xFF) / 255.0f;
                    float f6 = (float)(n >> 8 & 0xFF) / 255.0f;
                    float f8 = (float)(n & 0xFF) / 255.0f;
                    f = f5;
                    f2 = f6;
                    f3 = f8;
                }
            }
            return new Vector4f(f, f2, f3, 72.0f * f4 / 4096.0f);
        }
        return super.a(string, f, f2, f3);
    }

    @Override
    protected boolean c(String string) {
        if (string.startsWith("crown")) {
            return true;
        }
        return super.c(string);
    }

    @Override
    public HashSet<String> a() {
        return new HashSet<String>(this){
            final /* synthetic */ dg this$0;
            {
                this.this$0 = dg2;
                this.add("boobs");
                this.add("booty");
                this.add("vagina");
                this.add("fuckhole");
                this.add("preggy");
                this.add("LegL");
                this.add("LegR");
                this.add("cheekR");
                this.add("cheekL");
            }
        };
    }

    @Override
    protected void a(String string, GeoBone geoBone) {
        block21: {
            String[] stringArray = e4.a(this.j);
            if (stringArray.length < 8) {
                return;
            }
            switch (string) {
                case "earL": {
                    dy.a(geoBone, stringArray[0], stringArray[1], stringArray[3]);
                    break;
                }
                case "earR": {
                    dy.a(geoBone, stringArray[0], stringArray[2], stringArray[4]);
                    break;
                }
                case "hair": {
                    dy.a(geoBone, stringArray[5]);
                    break;
                }
                case "body": {
                    geoBone.setPivotY(-0.15f);
                    dy.a(this.j, geoBone);
                    break;
                }
                case "LegR": {
                    dy.a(this.C, geoBone, 25.0f, 25.0f);
                    break;
                }
                case "boobR": {
                    dy.a(this.C, geoBone, 30.0f, 30.0f);
                    break;
                }
                case "boobR1": {
                    dy.a(this.C, geoBone, 10.0f, 15.0f);
                    break;
                }
                case "boobR2": {
                    dy.a(this.C, geoBone, 5.0f, 3.0f);
                }
            }
            if (!string.contains("crown")) break block21;
            dy.a(this.j, geoBone, stringArray[9]);
        }
    }

    @Override
    public void a(em em2, double d, double d2, double d3, float f, float f2) {
        block24: {
            Vec3d vec3d;
            this.D = v;
            this.B = (eq)em2;
            this.C = -420.69f == f && em2.y() == fp.SHOULDER_IDLE;
            this.E = -420.69f == f && em2.y() == fp.PICK_UP;
            this.y = f2;
            dy.B = f;
            fp fp2 = em2.y();
            UUID uUID = this.B.e();
            if (em2.h()) {
                vec3d = dy.a(em2.field_70170_p, em2, uUID, d, d2, d3);
                d = vec3d.field_72450_a;
                d2 = vec3d.field_72448_b;
                d3 = vec3d.field_72449_c;
            }
            if (fp2 == fp.THROWN || fp2 == fp.START_THROWING) {
                if (dg.i.field_71474_y.field_74320_O == 0 && f == -420.69f && !em2.h()) {
                    return;
                }
                if (!em2.h()) {
                    float f3;
                    em2.field_70760_ar = f3 = em2.I().floatValue();
                    em2.field_70761_aq = f3;
                }
            }
            if (dy.a(em2, fp2)) {
                if (dg.i.field_71439_g.getPersistentID().equals(uUID)) {
                    if (-420.69f != f) {
                        return;
                    }
                    em2.field_70761_aq = dg.i.field_71439_g.field_70177_z + 180.0f;
                    em2.field_70760_ar = dg.i.field_71439_g.field_70177_z + 180.0f;
                    vec3d = dg.i.field_71439_g.func_70040_Z();
                    GlStateManager.func_179094_E();
                    GlStateManager.func_179137_b((double)vec3d.field_72450_a, (double)(vec3d.field_72448_b + (double)dg.i.field_71439_g.func_70047_e()), (double)vec3d.field_72449_c);
                    Vec3d vec3d2 = e3.b(new Vec3d((double)(-Math.abs(dg.i.field_71439_g.field_70125_A)), 0.0, 0.0), dg.i.field_71439_g.field_70177_z);
                    GlStateManager.func_179114_b((float)dg.i.field_71439_g.field_70125_A, (float)((float)vec3d2.field_72450_a), (float)0.0f, (float)((float)vec3d2.field_72449_c));
                    d = 0.0;
                    d2 = 0.0;
                    d3 = 0.0;
                } else if (!this.B.m().equals(dg.i.field_71439_g.getPersistentID())) {
                    if (!em2.h() || uUID == null || dg.i.field_71439_g.getPersistentID().equals(uUID)) {
                        if (uUID != null && !dg.i.field_71439_g.getPersistentID().equals(uUID)) {
                            vec3d = em2.field_70170_p.func_152378_a(uUID);
                            if (vec3d != null) {
                                em2.field_70761_aq = vec3d.field_70177_z;
                                em2.field_70760_ar = vec3d.field_70177_z;
                            }
                        } else {
                            em2.field_70761_aq = dg.i.field_71439_g.field_70177_z;
                            em2.field_70760_ar = dg.i.field_71439_g.field_70177_z;
                        }
                    }
                    vec3d = dy.a(em2, this.B.e(), f2);
                    d = vec3d.field_72450_a;
                    d2 = vec3d.field_72448_b;
                    d3 = vec3d.field_72449_c;
                }
            } else if (this.C) {
                dy.a(f2);
                vec3d = new Vec3d((double)b6.a(-0.1f, 0.2f, dg.i.field_71474_y.field_74334_X / 110.0f), 0.0, 0.0);
                vec3d = e3.b(vec3d, dg.i.field_71439_g.field_70177_z);
                d = vec3d.field_72450_a;
                d2 = vec3d.field_72448_b;
                d3 = vec3d.field_72449_c;
                em2.field_70761_aq = dg.i.field_71439_g.field_70177_z;
                em2.field_70760_ar = dg.i.field_71439_g.field_70126_B;
                if (dg.i.field_71439_g.func_70093_af()) {
                    d2 -= 0.075;
                }
            } else if (fp2 == fp.SHOULDER_IDLE) {
                if (uUID == null) {
                    return;
                }
                if (dg.i.field_71439_g.getPersistentID().equals(uUID) && dg.i.field_71474_y.field_74320_O == 0) {
                    return;
                }
                vec3d = em2.field_70170_p.func_152378_a(uUID);
                if (vec3d == null) {
                    return;
                }
                Vector4f vector4f = dy.a((EntityPlayer)vec3d, f2);
                d = vector4f.x;
                d2 = vector4f.y;
                d3 = vector4f.z;
                em2.field_70761_aq = vector4f.w;
                if (vec3d.func_70093_af()) {
                    d2 -= 0.32;
                }
            } else if (fp2 == fp.PICK_UP && uUID != null && (vec3d = em2.field_70170_p.func_152378_a(uUID)) != null) {
                em2.field_70760_ar = vec3d.field_70758_at;
                em2.field_70761_aq = vec3d.field_70759_as;
            }
            super.a(em2, d, d2, d3, f, f2);
            if (!dy.a(em2, fp2) || dg.i.field_71474_y.field_74320_O != 0 || !dg.i.field_71439_g.getPersistentID().equals(uUID)) break block24;
            GlStateManager.func_179121_F();
        }
    }

    @Override
    protected void b(Tessellator tessellator, BufferBuilder bufferBuilder, em em2, f7 f72, float f) {
        dg.a(tessellator, bufferBuilder, em2, f72, f);
    }

    @Nullable
    protected f7 e(em em2) {
        if (!this.D) {
            return null;
        }
        if (!(em2 instanceof eq)) {
            return null;
        }
        eq eq2 = (eq)em2;
        UUID uUID = eq2.m();
        EntityPlayerSP entityPlayerSP = dg.i.field_71439_g;
        if (uUID == null || dg.i.field_71474_y.field_74320_O == 0 && entityPlayerSP.getPersistentID().equals(uUID)) {
            return null;
        }
        EntityPlayer entityPlayer = eq2.k();
        if (entityPlayer == null) {
            return null;
        }
        ItemStack itemStack = (ItemStack)eq2.func_184212_Q().func_187225_a(e2.T);
        if (itemStack.func_190926_b()) {
            return null;
        }
        if (!(itemStack.func_77973_b() instanceof ItemArmor)) {
            return null;
        }
        ItemArmor itemArmor = (ItemArmor)itemStack.func_77973_b();
        switch (itemArmor.func_82812_d()) {
            default: {
                return new f7(23.0f, 100.0f, 93.0f);
            }
            case GOLD: {
                return new f7(99.0f, 98.0f, 14.0f);
            }
            case CHAIN: 
            case IRON: {
                return new f7(85.0f, 85.0f, 85.0f);
            }
            case LEATHER: 
        }
        int n = itemArmor.func_82814_b(itemStack);
        float f = n >> 16 & 0xFF;
        float f2 = n >> 8 & 0xFF;
        float f3 = n & 0xFF;
        return new f7(f, f2, f3);
    }

    @Override
    protected void c() {
        GlStateManager.func_179137_b((double)0.0, (double)-0.77, (double)-0.05);
        GlStateManager.func_179139_a((double)0.5, (double)0.5, (double)0.5);
    }

    @Override
    protected void a(boolean bl, ItemStack itemStack) {
        super.a(bl, itemStack);
        if (itemStack.func_77973_b().func_77661_b(itemStack) == EnumAction.BOW) {
            if (bl) {
                GlStateManager.func_179109_b((float)0.1f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            } else {
                GlStateManager.func_179114_b((float)170.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            return;
        }
        GlStateManager.func_179114_b((float)(bl ? 70.0f : 180.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.func_179137_b((double)0.0, (double)0.05, (double)-0.03);
    }

    @Override
    protected void a(boolean bl) {
    }

    @Override
    protected void a(boolean bl, boolean bl2) {
        super.a(bl, bl2);
        if (bl) {
            if (bl2) {
                GlStateManager.func_179137_b((double)0.0, (double)0.2, (double)-0.25);
                GlStateManager.func_179114_b((float)85.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)38.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179114_b((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else {
                GlStateManager.func_179114_b((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.func_179137_b((double)0.0, (double)-0.265, (double)-0.04);
            }
        } else if (bl2) {
            GlStateManager.func_179114_b((float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)150.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.func_179137_b((double)0.0, (double)-0.33, (double)-0.1);
        } else {
            GlStateManager.func_179137_b((double)-0.02, (double)-0.05, (double)-0.05);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
