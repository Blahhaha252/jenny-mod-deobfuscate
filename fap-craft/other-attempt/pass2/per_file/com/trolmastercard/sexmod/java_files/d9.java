/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Tuple3f
 *  javax.vecmath.Tuple4f
 *  javax.vecmath.Vector3f
 *  javax.vecmath.Vector4f
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemShield
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  software.bernie.geckolib3.core.util.Color
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoCube
 *  software.bernie.geckolib3.geo.render.built.GeoQuad
 *  software.bernie.geckolib3.geo.render.built.GeoVertex
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.dm;
import com.trolmastercard.sexmod.gx;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import javax.vecmath.Tuple3f;
import javax.vecmath.Tuple4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoQuad;
import software.bernie.geckolib3.geo.render.built.GeoVertex;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public abstract class d9
extends dm {
    protected static final Vec3i z = new Vec3i(255, 255, 255);
    static HashMap<Integer, Vec3i> A = new HashMap();

    public d9(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel);
    }

    public static void e() {
        A.clear();
    }

    protected Vec3i a(GeoBone geoBone) {
        String string = geoBone.getName();
        int n = string.hashCode() + this.j.getPersistentID().hashCode();
        Vec3i vec3i = A.get(n);
        if (vec3i != null) {
            return vec3i;
        }
        vec3i = this.a(string);
        A.put(n, vec3i);
        return vec3i;
    }

    protected abstract Vec3i a(String var1);

    protected void b(GeoBone geoBone, int n) {
        List list = geoBone.childBones;
        for (int i = 0; i < list.size(); ++i) {
            GeoBone geoBone2 = (GeoBone)list.get(i);
            if (n != i) continue;
            GeoBone geoBone3 = geoBone2;
            geoBone3.setHidden(false);
            return;
        }
    }

    protected float a() {
        return 1.0f;
    }

    protected Vec3d a(ItemStack itemStack) {
        return new Vec3d(-90.0, 0.0, 0.0);
    }

    protected GeoBone a(GeoBone geoBone, int n) {
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
    public void renderRecursively(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f3, float f4) {
        ItemStack itemStack;
        String string = geoBone.getName();
        if (this.r) {
            if (string.equals("upperBody")) {
                geoBone.setRotationX(geoBone.getRotationX() - 0.5f);
            }
            if (string.equals("head")) {
                geoBone.setRotationX(geoBone.getRotationX() + 0.5f);
            }
            if (string.equals("legL") || string.equals("legR")) {
                geoBone.setPositionZ(geoBone.getPositionZ() + 1.0f);
            }
        }
        if (string.equals("head")) {
            this.a(bufferBuilder, geoBone, Color.ofRGB((float)f, (float)f2, (float)f3));
        }
        this.a(string, geoBone);
        this.a(string, geoBone, this.w, bufferBuilder);
        if (this.u && (this.s.func_77973_b() instanceof ItemBow || this.x.func_77973_b() instanceof ItemBow)) {
            if (string.equals("armR")) {
                geoBone.setRotationX(geoBone.getRotationX() - this.j.field_70125_A / 50.0f);
            }
            if (string.equals("armL")) {
                geoBone.setRotationY(geoBone.getRotationY() - this.j.field_70125_A / 50.0f);
            }
            if (this.x.func_77973_b() instanceof ItemBow) {
                itemStack = this.x;
                this.x = this.s;
                this.s = itemStack;
            }
        }
        if (this.u && this.s.func_77973_b() instanceof ItemShield) {
            if (string.equals("armR")) {
                geoBone.setRotationZ(0.0f);
                geoBone.setRotationX(0.5f);
            } else if (this.x.func_77973_b() instanceof ItemShield && string.equals("armL")) {
                geoBone.setRotationZ(0.0f);
                geoBone.setRotationX(0.5f);
            }
        }
        if (string.equals("weapon") && !this.s.func_190926_b()) {
            this.a(bufferBuilder, geoBone, false);
        }
        if (string.equals("offhand") && !this.x.func_190926_b()) {
            this.a(bufferBuilder, geoBone, true);
        }
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        if ("Head2".equals(string) && !this.c()) {
            MATRIX_STACK.pop();
            return;
        }
        if (("neck".equals(string) || "head".equals(string)) && !this.a()) {
            MATRIX_STACK.pop();
            return;
        }
        if (!geoBone.isHidden) {
            itemStack = this.a(string, f, f2, f3);
            f = itemStack.x;
            f2 = itemStack.y;
            f3 = itemStack.z;
            double d = itemStack.w;
            if (!this.p.contains(string)) {
                for (GeoCube geoCube : geoBone.childCubes) {
                    MATRIX_STACK.push();
                    GlStateManager.func_179094_E();
                    this.q = geoBone;
                    this.a(bufferBuilder, geoCube, geoBone, f, f2, f3, f4, d);
                    GlStateManager.func_179121_F();
                    MATRIX_STACK.pop();
                }
            }
            for (GeoCube geoCube : geoBone.childBones) {
                if (d == 0.0) {
                    this.renderRecursively(bufferBuilder, (GeoBone)geoCube, f, f2, f3, f4);
                    continue;
                }
                this.a(bufferBuilder, (GeoBone)geoCube, f, f2, f3, f4, d);
            }
        }
        try {
            MATRIX_STACK.pop();
        }
        catch (IllegalStateException illegalStateException) {
            // empty catch block
        }
    }

    public void a(BufferBuilder bufferBuilder, GeoCube geoCube, GeoBone geoBone, float f, float f2, float f3, float f4, double d) {
        MATRIX_STACK.moveToPivot(geoCube);
        MATRIX_STACK.rotate(geoCube);
        MATRIX_STACK.moveBackFromPivot(geoCube);
        for (GeoQuad geoQuad : geoCube.quads) {
            Vec3d vec3d;
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
            if (this.c(geoBone.getName())) {
                vec3d = new Vec3d((double)f, (double)f2, (double)f3);
            } else {
                GeoVertex[] geoVertexArray = this.a(geoBone);
                geoVertexArray = this.a((Vec3i)geoVertexArray);
                vec3d = gx.a(this, geoBone, new Vec3d((double)((float)geoVertexArray.func_177958_n() / 255.0f), (double)((float)geoVertexArray.func_177956_o() / 255.0f), (double)((float)geoVertexArray.func_177952_p() / 255.0f)), vector3f);
            }
            for (GeoVertex geoVertex : geoQuad.vertices) {
                Vector4f vector4f = new Vector4f(geoVertex.position.getX(), geoVertex.position.getY(), geoVertex.position.getZ(), 1.0f);
                MATRIX_STACK.getModelMatrix().transform((Tuple4f)vector4f);
                bufferBuilder.func_181662_b((double)vector4f.getX(), (double)vector4f.getY(), (double)vector4f.getZ()).func_187315_a((double)geoVertex.textureU + d, (double)geoVertex.textureV).func_181666_a((float)vec3d.field_72450_a, (float)vec3d.field_72448_b, (float)vec3d.field_72449_c, f4).func_181663_c(vector3f.getX(), vector3f.getY(), vector3f.getZ()).func_181675_d();
            }
        }
    }

    protected boolean c(String string) {
        return string.startsWith("armor");
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}
