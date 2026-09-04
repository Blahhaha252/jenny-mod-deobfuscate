/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Tuple3f
 *  javax.vecmath.Vector2f
 *  javax.vecmath.Vector3f
 *  javax.vecmath.Vector4d
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.renderers.geo.GeoItemRenderer
 *  software.bernie.geckolib3.renderers.geo.IGeoRenderer
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.bc;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.e8;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.hy;
import com.trolmastercard.sexmod.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.vecmath.Tuple3f;
import javax.vecmath.Vector2f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4d;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class fa
extends GeoItemRenderer<hy> {
    private static final ResourceLocation c = new ResourceLocation("textures/entity/endercrystal/endercrystal.png");
    private final e8 q = new e8();
    static final float p = 10.0f;
    static final float f = 1.5f;
    static final float m = 0.175f;
    static final float r = 0.1f;
    static final float g = 0.04f;
    static final float d = 8.0f;
    static final float i = 6.0f;
    static final float a = 1.3f;
    static final Vector2f[] l = new Vector2f[]{new Vector2f(1.0f, 0.0f), new Vector2f(0.0f, 1.0f), new Vector2f(0.0f, 0.0f), new Vector2f(0.5f, 0.5f), new Vector2f(0.75f, 0.25f), new Vector2f(0.25f, 0.75f), new Vector2f(0.25f, 0.75f)};
    static boolean o = false;
    Minecraft e = Minecraft.func_71410_x();
    Vector2f j;
    double b = 0.0;
    EntityPlayer k;
    ItemStack h;
    static HashMap<ItemStack, Vector3f> n = new HashMap();

    public fa() {
        super((AnimatedGeoModel)new bc());
    }

    public static boolean b() {
        return o;
    }

    public static void a() {
        o = !o;
    }

    public void a(hy hy2, ItemStack itemStack) {
        EntityPlayer entityPlayer = null;
        for (EntityPlayer entityPlayer2 : this.e.field_71441_e.field_73010_i) {
            if (entityPlayer2.field_71071_by.field_70462_a.contains((Object)itemStack)) {
                entityPlayer = entityPlayer2;
                break;
            }
            if (!entityPlayer2.field_71071_by.field_184439_c.contains((Object)itemStack)) continue;
            entityPlayer = entityPlayer2;
            break;
        }
        if (entityPlayer != null) {
            double d = entityPlayer.field_70165_t - entityPlayer.field_70142_S;
            double d2 = entityPlayer.field_70161_v - entityPlayer.field_70136_U;
            double d3 = Math.PI / 180 * (double)entityPlayer.field_70177_z;
            this.j = new Vector2f((float)(d * Math.cos(d3) + d2 * Math.sin(d3)), (float)(-d * Math.sin(d3) + d2 * Math.cos(d3)));
        } else {
            this.j = new Vector2f(0.0f, 0.0f);
        }
        if (!Minecraft.func_71410_x().func_147113_T()) {
            this.b = (float)Minecraft.func_71410_x().field_71439_g.field_70173_aa + this.e.func_184121_ak();
        }
        this.h = itemStack;
        this.k = entityPlayer;
        super.render((Item)hy2, itemStack);
    }

    public void renderRecursively(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f3, float f4) {
        if ("staff".equals(geoBone.getName())) {
            GlStateManager.func_179094_E();
            Tessellator.func_178181_a().func_78381_a();
            com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, geoBone);
            GlStateManager.func_179137_b((double)0.0, (double)(1.5 + 0.001 * Math.sin(0.005 * this.b) + 0.001), (double)0.0);
            Vector3f vector3f = n.get(this.h);
            GlStateManager.func_179139_a((double)this.d(), (double)this.d(), (double)this.d());
            if (vector3f == null) {
                vector3f = new Vector3f(0.0f, 0.0f, 0.0f);
            }
            vector3f.add((Tuple3f)new Vector3f(this.j.x, this.k == null ? 0.0f : (float)(this.k.field_70163_u - this.k.field_70137_T), this.j.y));
            GlStateManager.func_179114_b((float)(vector3f.z * 10.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)(vector3f.x * 10.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.func_179114_b((float)(-vector3f.y * 10.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.func_179114_b((float)((float)(this.b * (double)0.1f)), (float)1.0f, (float)1.0f, (float)1.0f);
            n.put(this.h, vector3f);
            this.e.func_110434_K().func_110577_a(c);
            this.q.func_78088_a((Entity)Minecraft.func_71410_x().field_71439_g, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
            GlStateManager.func_179121_F();
            if (this.k != null) {
                this.c();
            }
            this.e.func_110434_K().func_110577_a(new bc().a(null));
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        }
        super.renderRecursively(bufferBuilder, geoBone, f, f2, f3, f4);
    }

    void c() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Vec3d> arrayList2 = new ArrayList<Vec3d>();
        for (Vector4d vector4d : ff.aY) {
            arrayList.add((int)vector4d.getW());
            arrayList2.add(new Vec3d(vector4d.getX(), vector4d.getY(), vector4d.getZ()));
        }
        if (arrayList.size() == 0) {
            return;
        }
        if (o) {
            this.a(arrayList, arrayList2);
        } else {
            this.a(arrayList);
        }
    }

    void a(List<Integer> list, List<Vec3d> list2) {
        for (int i = 0; i < list.size(); ++i) {
            float f = b6.a(this.k.field_70758_at, this.k.field_70759_as, this.e.func_184121_ak());
            float f2 = b6.a(this.k.field_70127_C, this.k.field_70125_A, this.e.func_184121_ak());
            Vec3d vec3d = b6.a(new Vec3d(this.k.field_70169_q, this.k.field_70167_r + (double)this.k.func_70047_e(), this.k.field_70166_s), this.k.func_174791_d().func_72441_c(0.0, (double)this.k.func_70047_e(), 0.0), (double)this.e.func_184121_ak());
            Vec3d vec3d2 = vec3d.func_178788_d(list2.get(i));
            vec3d2 = ck.a(vec3d2, -f2, f);
            double d = Math.abs(vec3d2.field_72450_a) + Math.abs(vec3d2.field_72449_c) + Math.abs(vec3d2.field_72448_b);
            double d2 = -vec3d2.field_72450_a / d;
            double d3 = -vec3d2.field_72448_b / d;
            double d4 = vec3d2.field_72449_c / d;
            d2 = this.a(d2);
            d3 = this.a(d3);
            d4 = this.a(d4);
            this.b(list.get(i), (float)(d2 *= (double)1.3f), (float)(d3 *= (double)1.3f), (float)(d4 *= (double)1.3f));
        }
    }

    void a(List<Integer> list) {
        float f = 1.0f / (float)list.size();
        float f2 = 0.0f;
        for (int i = 0; i < list.size(); ++i) {
            this.a(list.get(i), 1.0f - (f2 += f), 0.0f + f2, (float)b6.b((double)0.8f, (double)1.2f, (double)i / (double)list.size()));
        }
    }

    double a(double d) {
        return d * Math.sqrt(1.0 - d * d / 2.0);
    }

    double d() {
        return (double)0.175f + 0.025 * Math.sin(0.005 * this.b) + 0.025;
    }

    void a(int n, float f, float f2, float f3) {
        this.a(new ItemStack(Blocks.field_150325_L, 1, n), f, f2, f3);
    }

    void b(int n, float f, float f2, float f3) {
        this.b(new ItemStack(Blocks.field_150325_L, 1, n), f, f2, f3);
    }

    void b(ItemStack itemStack, float f, float f2, float f3) {
        GlStateManager.func_179094_E();
        GlStateManager.func_179137_b((double)0.0, (double)(1.5 + 0.001 * Math.sin(0.005 * this.b) + 0.001), (double)0.0);
        GlStateManager.func_179152_a((float)0.04f, (float)0.04f, (float)0.04f);
        GlStateManager.func_179109_b((float)(f * 6.0f), (float)(f2 * 6.0f), (float)(f3 * 6.0f));
        this.e.func_175597_ag().func_178099_a((EntityLivingBase)Minecraft.func_71410_x().field_71439_g, itemStack, ItemCameraTransforms.TransformType.NONE);
        GlStateManager.func_179121_F();
    }

    void a(ItemStack itemStack, float f, float f2, float f3) {
        GlStateManager.func_179094_E();
        GlStateManager.func_179137_b((double)0.0, (double)(1.5 + 0.001 * Math.sin(0.005 * this.b) + 0.001), (double)0.0);
        GlStateManager.func_179152_a((float)0.04f, (float)0.04f, (float)0.04f);
        GlStateManager.func_179114_b((float)((float)(this.b * 8.0 * (double)f3)), (float)0.0f, (float)f, (float)f2);
        GlStateManager.func_179109_b((float)6.0f, (float)0.0f, (float)0.0f);
        this.e.func_175597_ag().func_178099_a((EntityLivingBase)Minecraft.func_71410_x().field_71439_g, itemStack, ItemCameraTransforms.TransformType.NONE);
        GlStateManager.func_179121_F();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
