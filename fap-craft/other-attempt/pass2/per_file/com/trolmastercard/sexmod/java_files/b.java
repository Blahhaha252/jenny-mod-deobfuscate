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
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoCube
 *  software.bernie.geckolib3.geo.render.built.GeoModel
 *  software.bernie.geckolib3.geo.render.built.GeoQuad
 *  software.bernie.geckolib3.geo.render.built.GeoVertex
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.renderers.geo.GeoEntityRenderer
 *  software.bernie.geckolib3.util.MatrixStack
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.c8;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.cy;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fs;
import com.trolmastercard.sexmod.fw;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gt;
import com.trolmastercard.sexmod.gw;
import com.trolmastercard.sexmod.gx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import javax.vecmath.Tuple3f;
import javax.vecmath.Tuple4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.geo.render.built.GeoQuad;
import software.bernie.geckolib3.geo.render.built.GeoVertex;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.util.MatrixStack;

public class b
extends GeoEntityRenderer<cy> {
    public static final float e = 1.876945f;
    public static final float i = 2.876945f;
    Minecraft a;
    cy c = null;
    br.b.b b = null;
    HashMap<String, String> h = new HashMap();
    HashMap<String, String> f = new HashMap();
    HashMap<String, gt> g = new HashMap();
    public static boolean k = false;
    Vec3d d = new Vec3d(1.0, 1.0, 1.0);
    Vec3d j;

    public b(RenderManager renderManager, AnimatedGeoModel<cy> animatedGeoModel) {
        super(renderManager, animatedGeoModel);
        this.a = Minecraft.func_71410_x();
        this.a();
    }

    void a() {
        this.h.put("customLegL", "legL");
        this.h.put("customShinL", "shinL");
        this.h.put("customLegR", "legR");
        this.h.put("customShinR", "shinR");
        this.f.put("top", "upperBody");
        this.f.put("customArmL", "armL");
        this.f.put("customLowerArmL", "lowerArmL");
        this.f.put("customArmR", "armR");
        this.f.put("customLowerArmR", "lowerArmR");
        this.g.put("lowerArmR", em2 -> gc.c(em2.ai()));
        this.g.put("lowerArmL", em2 -> gc.c(em2.T()));
    }

    boolean d(cy cy2) {
        String string = cy2.a();
        if (cy2.f) {
            return false;
        }
        if (br.f(string)) {
            return false;
        }
        if (br.g() != null) {
            return true;
        }
        UUID uUID = cy2.b();
        em em2 = em.b(uUID);
        if (em2 == null) {
            return true;
        }
        HashSet<String> hashSet = em2.Y();
        hashSet.remove(string);
        String string2 = em.a(hashSet);
        ge.b.sendToServer((IMessage)new fw(string2, cy2.b()));
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public static void a(em em2, float f) {
        if (em2.field_70128_L) {
            return;
        }
        if (!em2.field_70170_p.field_72995_K) {
            return;
        }
        if (!em2.H()) {
            return;
        }
        RenderManager renderManager = Minecraft.func_71410_x().func_175598_ae();
        for (String string : em2.Y()) {
            cy cy2 = new cy(em2.field_70170_p, em2.f(), string);
            k = true;
            renderManager.func_188391_a((Entity)cy2, 0.0, 0.0, 0.0, 0.0f, f, false);
        }
    }

    public boolean a(cy cy2, ICamera iCamera, double d, double d2, double d3) {
        return super.func_177071_a((Entity)cy2, iCamera, d, d2, d3);
    }

    boolean a(float f) {
        if (f == 2.876945f) {
            return true;
        }
        if (f == 1.876945f) {
            return true;
        }
        if (k) {
            k = false;
            return true;
        }
        return false;
    }

    void a(br.b.b b2, cy cy2, float f) {
        if (b2 == null || b2.i() == c8.DEFAULT) {
            this.j = null;
            return;
        }
        GL11.glDisable((int)2896);
        this.j = b2.i() == c8.SEXMOD ? cj.a(cy2, f) : null;
    }

    public void a(cy cy2, double d, double d2, double d3, float f, float f2) {
        EntityPlayer entityPlayer;
        UUID uUID;
        em em2;
        if (!this.a(f2)) {
            return;
        }
        if (br.d) {
            return;
        }
        if (this.d(cy2)) {
            return;
        }
        cy2.c = new MatrixStack();
        br.b.b b2 = br.b(cy2.a());
        this.c = cy2;
        this.b = b2;
        this.a(b2, cy2, f2);
        if (f2 == 1.876945f || f2 == 2.876945f) {
            this.d = new Vec3d(1.0, 1.0, 1.0);
            super.doRender((EntityLivingBase)cy2, d, d2, d3, f, f2);
            GL11.glEnable((int)2896);
            return;
        }
        UUID uUID2 = cy2.b();
        if (uUID2 == null) {
            return;
        }
        em em3 = em.b(uUID2);
        if (em3 == null) {
            return;
        }
        if (b2 != null && !b2.a() && em3.ah() == 0) {
            return;
        }
        if (!(em3 instanceof ei)) {
            em2 = em3;
        } else {
            uUID = ((ei)em3).m();
            if (uUID == null) {
                return;
            }
            entityPlayer = cy2.field_70170_p.func_152378_a(uUID);
            em2 = entityPlayer == null ? em3 : entityPlayer;
        }
        uUID = em3.a(this.a, cy2, (EntityLivingBase)em2, f2);
        entityPlayer = new BlockPos(Math.floor(((EntityLivingBase)em2).field_70165_t), Math.floor(((EntityLivingBase)em2).field_70163_u), Math.floor(((EntityLivingBase)em2).field_70161_v));
        int n2 = ((EntityLivingBase)em2).field_70170_p.func_175721_c((BlockPos)entityPlayer, true);
        Vec3d vec3d = new Vec3d(1.0, 1.0, 1.0);
        float f4 = be.b(n2, 10.0f, 15.0f) / 15.0f;
        this.d = new Vec3d(vec3d.field_72450_a * (double)f4, vec3d.field_72448_b * (double)f4, vec3d.field_72449_c * (double)f4);
        GlStateManager.func_179094_E();
        GlStateManager.func_179137_b((double)((Vec3d)uUID).field_72450_a, (double)((Vec3d)uUID).field_72448_b, (double)((Vec3d)uUID).field_72449_c);
        if (em3.Q()) {
            GlStateManager.func_179114_b((float)em3.I().floatValue(), (float)0.0f, (float)1.0f, (float)0.0f);
        }
        super.doRender((EntityLivingBase)cy2, 0.0, 0.0, 0.0, f, f2);
        GlStateManager.func_179121_F();
        GL11.glEnable((int)2896);
    }

    public static Vec3d a(Minecraft minecraft, cy cy2, EntityLivingBase entityLivingBase, em em2, float f) {
        Vec3d vec3d;
        Vec3d vec3d2;
        if (em2.Q()) {
            vec3d2 = em2.o();
            float f2 = em2.I().floatValue();
            cy2.field_70169_q = vec3d2.field_72450_a;
            cy2.field_70167_r = vec3d2.field_72448_b;
            cy2.field_70166_s = vec3d2.field_72449_c;
            cy2.field_70142_S = vec3d2.field_72450_a;
            cy2.field_70137_T = vec3d2.field_72448_b;
            cy2.field_70136_U = vec3d2.field_72449_c;
            cy2.field_70165_t = vec3d2.field_72450_a;
            cy2.field_70163_u = vec3d2.field_72448_b;
            cy2.field_70161_v = vec3d2.field_72449_c;
            cy2.field_70177_z = f2;
            cy2.field_70126_B = f2;
            cy2.field_70759_as = f2;
            cy2.field_70758_at = f2;
            cy2.field_70761_aq = f2;
            cy2.field_70760_ar = f2;
            cy2.field_70125_A = f2;
            cy2.field_70127_C = f2;
            vec3d = vec3d2;
        } else {
            cy2.field_70177_z = entityLivingBase.field_70177_z;
            cy2.field_70126_B = entityLivingBase.field_70126_B;
            cy2.field_70759_as = entityLivingBase.field_70759_as;
            cy2.field_70758_at = entityLivingBase.field_70758_at;
            cy2.field_70761_aq = entityLivingBase.field_70761_aq;
            cy2.field_70760_ar = entityLivingBase.field_70760_ar;
            cy2.field_70125_A = entityLivingBase.field_70125_A;
            cy2.field_70127_C = entityLivingBase.field_70127_C;
            cy2.field_70169_q = entityLivingBase.field_70169_q;
            cy2.field_70167_r = entityLivingBase.field_70167_r;
            cy2.field_70166_s = entityLivingBase.field_70166_s;
            cy2.field_70142_S = entityLivingBase.field_70142_S;
            cy2.field_70137_T = entityLivingBase.field_70137_T;
            cy2.field_70136_U = entityLivingBase.field_70136_U;
            cy2.field_70165_t = entityLivingBase.field_70165_t;
            cy2.field_70163_u = entityLivingBase.field_70163_u;
            cy2.field_70161_v = entityLivingBase.field_70161_v;
            vec3d = b6.a(new Vec3d(entityLivingBase.field_70142_S, entityLivingBase.field_70137_T, entityLivingBase.field_70136_U), entityLivingBase.func_174791_d(), (double)f);
        }
        vec3d2 = minecraft.field_71439_g;
        Vec3d vec3d3 = b6.a(new Vec3d(vec3d2.field_70142_S, vec3d2.field_70137_T, vec3d2.field_70136_U), vec3d2.func_174791_d(), (double)f);
        return vec3d.func_178788_d(vec3d3);
    }

    public void a(GeoModel geoModel, cy cy2, float f, float f2, float f4, float f5, float f6) {
        GlStateManager.func_179129_p();
        GlStateManager.func_179091_B();
        BufferBuilder bufferBuilder = Tessellator.func_178181_a().func_178180_c();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        for (GeoBone geoBone : geoModel.topLevelBones) {
            if (f != 1.876945f) {
                this.a(cy2, geoBone, f);
            }
            cy2.c.translate(-geoBone.getPivotX() / 16.0f, -geoBone.getPivotY() / 16.0f, -geoBone.getPivotZ() / 16.0f);
            this.renderRecursively(bufferBuilder, geoBone, f2, f4, f5, f6);
        }
        Tessellator.func_178181_a().func_78381_a();
        GlStateManager.func_179101_C();
        GlStateManager.func_179089_o();
    }

    EntityLivingBase c(cy cy2) {
        EntityPlayer entityPlayer;
        em em2 = this.b(cy2);
        if (em2 == null) {
            return null;
        }
        em em3 = !(em2 instanceof ei) ? em2 : ((entityPlayer = cy2.field_70170_p.func_152378_a(((ei)em2).m())) == null ? em2 : entityPlayer);
        return em3;
    }

    em b(cy cy2) {
        UUID uUID = cy2.b();
        em em2 = fs.a(uUID);
        if (em2 != null) {
            return em2;
        }
        return em.b(uUID);
    }

    void a(cy cy2, GeoBone geoBone, float f) {
        String string = this.a(cy2);
        if (string == null) {
            return;
        }
        this.a(cy2, geoBone, f, string);
    }

    void a(cy cy2, GeoBone geoBone, float f, String string) {
        em em2 = this.b(cy2);
        EntityLivingBase entityLivingBase = this.c(cy2);
        cy2.c = em2.a(string, false);
        if (!cy2.f || f != 2.876945f) {
            return;
        }
        cy2.c.scale(0.5f, 0.5f, 0.5f);
        cy2.c.rotateY((float)Math.toRadians(-com.trolmastercard.sexmod.a.b));
    }

    String a(cy cy2) {
        if (cy2.f) {
            return cy2.d.boneName;
        }
        br.b.b b2 = br.b(cy2.a());
        if (b2 == null) {
            return null;
        }
        if (gw.CUSTOM_BONE.equals((Object)b2.j())) {
            return b2.b();
        }
        return b2.j().boneName;
    }

    public void renderRecursively(BufferBuilder bufferBuilder, GeoBone geoBone, float f, float f2, float f4, float f5) {
        this.c.c.push();
        this.c.c.translate(geoBone);
        this.c.c.moveToPivot(geoBone);
        this.c.c.rotate(geoBone);
        this.c.c.scale(geoBone);
        this.c.c.moveBackFromPivot(geoBone);
        if (!geoBone.isHidden()) {
            for (GeoCube geoCube : geoBone.childCubes) {
                this.c.c.push();
                GlStateManager.func_179094_E();
                this.renderCube(bufferBuilder, geoCube, f, f2, f4, f5);
                GlStateManager.func_179121_F();
                this.c.c.pop();
            }
        }
        if (!geoBone.childBonesAreHiddenToo()) {
            for (GeoCube geoCube : geoBone.childBones) {
                this.renderRecursively(bufferBuilder, (GeoBone)geoCube, f, f2, f4, f5);
            }
        }
        try {
            this.c.c.pop();
        }
        catch (IllegalStateException illegalStateException) {
            // empty catch block
        }
    }

    public void renderCube(BufferBuilder bufferBuilder, GeoCube geoCube, float f, float f2, float f4, float f5) {
        this.c.c.moveToPivot(geoCube);
        this.c.c.rotate(geoCube);
        this.c.c.moveBackFromPivot(geoCube);
        for (GeoQuad geoQuad : geoCube.quads) {
            if (geoQuad == null) continue;
            Vector3f vector3f = new Vector3f((float)geoQuad.normal.func_177958_n(), (float)geoQuad.normal.func_177956_o(), (float)geoQuad.normal.func_177952_p());
            this.c.c.getNormalMatrix().transform((Tuple3f)vector3f);
            if ((geoCube.size.y == 0.0f || geoCube.size.z == 0.0f) && vector3f.getX() < 0.0f) {
                vector3f.x *= -1.0f;
            }
            if ((geoCube.size.x == 0.0f || geoCube.size.z == 0.0f) && vector3f.getY() < 0.0f) {
                vector3f.y *= -1.0f;
            }
            if ((geoCube.size.x == 0.0f || geoCube.size.y == 0.0f) && vector3f.getZ() < 0.0f) {
                vector3f.z *= -1.0f;
            }
            if (this.j != null) {
                this.d = gx.a(this.d, vector3f, this.j);
            }
            for (GeoVertex geoVertex : geoQuad.vertices) {
                Vector4f vector4f = new Vector4f(geoVertex.position.getX(), geoVertex.position.getY(), geoVertex.position.getZ(), 1.0f);
                this.c.c.getModelMatrix().transform((Tuple4f)vector4f);
                bufferBuilder.func_181662_b((double)vector4f.getX(), (double)vector4f.getY(), (double)vector4f.getZ()).func_187315_a((double)geoVertex.textureU, (double)geoVertex.textureV).func_181666_a((float)this.d.field_72450_a, (float)this.d.field_72448_b, (float)this.d.field_72449_c, f5).func_181663_c(vector3f.getX(), vector3f.getY(), vector3f.getZ()).func_181675_d();
            }
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}
