/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Tuple3f
 *  javax.vecmath.Tuple4f
 *  javax.vecmath.Vector3f
 *  javax.vecmath.Vector4f
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  org.lwjgl.opengl.GL11
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoCube
 *  software.bernie.geckolib3.geo.render.built.GeoQuad
 *  software.bernie.geckolib3.geo.render.built.GeoVertex
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.renderers.geo.IGeoRenderer
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.d_;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gx;
import com.trolmastercard.sexmod.p;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import javax.vecmath.Tuple3f;
import javax.vecmath.Tuple4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoQuad;
import software.bernie.geckolib3.geo.render.built.GeoVertex;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public abstract class d6<G extends e4>
extends d_<G> {
    protected static final Vec3i r = new Vec3i(255, 255, 255);
    static HashMap<Integer, Vec3i> s = new HashMap();

    public d6(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d) {
        super(renderManager, animatedGeoModel, d);
    }

    public static void c() {
        s.clear();
    }

    protected Vec3i a(GeoBone geoBone) {
        String string = geoBone.getName();
        int n = string.hashCode() + ((e4)this.j).getPersistentID().hashCode();
        Vec3i vec3i = s.get(n);
        if (vec3i != null) {
            return vec3i;
        }
        vec3i = this.a(string);
        s.put(n, vec3i);
        return vec3i;
    }

    protected abstract Vec3i a(String var1);

    protected static void b(GeoBone geoBone, int n) {
        List list = geoBone.childBones;
        for (int i = 0; i < list.size(); ++i) {
            GeoBone geoBone2 = (GeoBone)list.get(i);
            if (n != i) continue;
            GeoBone geoBone3 = geoBone2;
            geoBone3.setHidden(false);
            return;
        }
    }

    @Override
    protected void a(BufferBuilder bufferBuilder, GeoBone geoBone) {
        ItemStack itemStack = this.a((ItemStack)null);
        float f = this.a();
        Vec3d vec3d = this.a(itemStack);
        if (itemStack == null) {
            return;
        }
        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, geoBone);
        GL11.glEnable((int)2896);
        GlStateManager.func_179152_a((float)f, (float)f, (float)f);
        GlStateManager.func_179114_b((float)((float)vec3d.field_72450_a), (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)((float)vec3d.field_72448_b), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)((float)vec3d.field_72449_c), (float)0.0f, (float)0.0f, (float)1.0f);
        Minecraft.func_71410_x().func_175597_ag().func_178099_a((EntityLivingBase)this.j, itemStack, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture((EntityLivingBase)this.j)));
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GL11.glDisable((int)2896);
        GlStateManager.func_179121_F();
    }

    protected float a() {
        return 1.0f;
    }

    protected Vec3d a(ItemStack itemStack) {
        return new Vec3d(-90.0, 0.0, 0.0);
    }

    protected static GeoBone a(GeoBone geoBone, int n) {
        List list = geoBone.childBones;
        GeoBone geoBone2 = null;
        list.sort(Comparator.comparingDouble(GeoBone::getPivotY));
        for (int i = 0; i < list.size(); ++i) {
            GeoBone geoBone3 = (GeoBone)list.get(i);
            if (n == i) {
                geoBone2 = geoBone3;
                geoBone2.setHidden(false);
                continue;
            }
            geoBone3.setHidden(true);
        }
        return geoBone2;
    }

    protected Vec3i a(Vec3i vec3i) {
        return vec3i;
    }

    @Override
    public void a(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f3, float f4, double d) {
        if (((e4)this.j).field_70170_p instanceof gj) {
            return;
        }
        String string = geoBone.getName();
        if (string.equals("weapon")) {
            this.a(bufferBuilder, geoBone);
        }
        if (string.equals("itemRenderer") && ((e4)this.j).y() == fp.PAYMENT) {
            this.b(bufferBuilder, geoBone);
        }
        this.a(bufferBuilder, geoBone.getName(), geoBone);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        if (!geoBone.isHidden) {
            for (GeoCube geoCube : geoBone.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.func_179094_E();
                this.q = geoBone;
                this.a(bufferBuilder, geoCube, geoBone, f, f2, f3, f4, d);
                GlStateManager.func_179121_F();
                MATRIX_STACK.pop();
            }
            for (GeoCube geoCube : geoBone.childBones) {
                this.a(bufferBuilder, (GeoBone)geoCube, f, f2, f3, f4, d);
            }
        }
        MATRIX_STACK.pop();
    }

    @Override
    public void renderRecursively(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f3, float f4) {
        this.a(bufferBuilder, geoBone, f, f2, f3, f4, 0.0);
    }

    public void a(BufferBuilder bufferBuilder, GeoCube geoCube, GeoBone geoBone, float f, float f2, float f3, float f4, double d) {
        MATRIX_STACK.moveToPivot(geoCube);
        MATRIX_STACK.rotate(geoCube);
        MATRIX_STACK.moveBackFromPivot(geoCube);
        for (GeoQuad geoQuad : geoCube.quads) {
            if (geoQuad == null) continue;
            Vector3f vector3f = new Vector3f((float)geoQuad.normal.func_177958_n(), (float)geoQuad.normal.func_177956_o(), (float)geoQuad.normal.func_177952_p());
            MATRIX_STACK.getNormalMatrix().transform((Tuple3f)vector3f);
            if ((geoCube.size.y == 0.0f || geoCube.size.z == 0.0f) && vector3f.getX() < 0.0f) {
                vector3f.x *= -1.0f;
            }
            if ((geoCube.size.x == 0.0f || geoCube.size.z == 0.0f) && vector3f.getY() < 0.0f) {
                vector3f.y *= -1.0f;
            }
            if ((geoCube.size.x == 0.0f || geoCube.size.y == 0.0f) && vector3f.getZ() < 0.0f) {
                vector3f.z *= -1.0f;
            }
            Vec3i vec3i = this.a(geoBone);
            vec3i = this.a(vec3i);
            Vec3d vec3d = gx.a(this, geoBone, new Vec3d((double)((float)vec3i.func_177958_n() / 255.0f), (double)((float)vec3i.func_177956_o() / 255.0f), (double)((float)vec3i.func_177952_p() / 255.0f)), vector3f);
            for (GeoVertex geoVertex : geoQuad.vertices) {
                Vector4f vector4f = new Vector4f(geoVertex.position.getX(), geoVertex.position.getY(), geoVertex.position.getZ(), 1.0f);
                MATRIX_STACK.getModelMatrix().transform((Tuple4f)vector4f);
                bufferBuilder.func_181662_b((double)vector4f.getX(), (double)vector4f.getY(), (double)vector4f.getZ()).func_187315_a((double)geoVertex.textureU + d, (double)geoVertex.textureV).func_181666_a((float)vec3d.field_72450_a, (float)vec3d.field_72448_b, (float)vec3d.field_72449_c, f4).func_181663_c(vector3f.getX(), vector3f.getY(), vector3f.getZ()).func_181675_d();
            }
        }
    }

    private static RuntimeException c(RuntimeException runtimeException) {
        return runtimeException;
    }
}
