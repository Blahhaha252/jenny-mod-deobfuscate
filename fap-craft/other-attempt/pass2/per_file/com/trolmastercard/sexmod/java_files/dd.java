/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Tuple3f
 *  javax.vecmath.Tuple4f
 *  javax.vecmath.Vector3f
 *  javax.vecmath.Vector4f
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.GL11
 *  software.bernie.geckolib3.geo.render.built.GeoCube
 *  software.bernie.geckolib3.geo.render.built.GeoQuad
 *  software.bernie.geckolib3.geo.render.built.GeoVertex
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.renderers.geo.GeoItemRenderer
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a2;
import com.trolmastercard.sexmod.ad;
import com.trolmastercard.sexmod.aj;
import com.trolmastercard.sexmod.gx;
import javax.vecmath.Tuple3f;
import javax.vecmath.Tuple4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoQuad;
import software.bernie.geckolib3.geo.render.built.GeoVertex;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class dd
extends GeoItemRenderer<aj> {
    static final Vec3d a = new Vec3d(0.0, 1.0, 0.0);

    public dd() {
        super((AnimatedGeoModel)new a2());
    }

    public void a(aj aj2, ItemStack itemStack) {
        if (ad.b[0] == 0.0f) {
            GL11.glDisable((int)2896);
        }
        super.render((Item)aj2, itemStack);
        GL11.glEnable((int)2896);
    }

    public void renderCube(BufferBuilder bufferBuilder, GeoCube geoCube, float f, float f2, float f3, float f4) {
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
            Vec3d vec3d = ad.b[0] == 0.0f ? gx.a(new Vec3d((double)f, (double)f2, (double)f3), vector3f, a) : new Vec3d((double)f, (double)f2, (double)f3);
            for (GeoVertex geoVertex : geoQuad.vertices) {
                Vector4f vector4f = new Vector4f(geoVertex.position.getX(), geoVertex.position.getY(), geoVertex.position.getZ(), 1.0f);
                MATRIX_STACK.getModelMatrix().transform((Tuple4f)vector4f);
                bufferBuilder.func_181662_b((double)vector4f.getX(), (double)vector4f.getY(), (double)vector4f.getZ()).func_187315_a((double)geoVertex.textureU, (double)geoVertex.textureV).func_181666_a((float)vec3d.field_72450_a, (float)vec3d.field_72448_b, (float)vec3d.field_72449_c, f4).func_181663_c(vector3f.getX(), vector3f.getY(), vector3f.getZ()).func_181675_d();
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
