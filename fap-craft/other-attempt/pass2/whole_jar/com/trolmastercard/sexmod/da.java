/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.GL11
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.af;
import com.trolmastercard.sexmod.av;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.b7;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.bm;
import com.trolmastercard.sexmod.c3;
import com.trolmastercard.sexmod.cb;
import com.trolmastercard.sexmod.ce;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d_;
import com.trolmastercard.sexmod.dh;
import com.trolmastercard.sexmod.ef;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gv;
import com.trolmastercard.sexmod.gx;
import com.trolmastercard.sexmod.p;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class da
extends d_<f_>
implements c3 {
    public static final int D = 14;
    public static final HashSet<String> E = new HashSet<String>(){
        {
            this.add("static");
            this.add("turnable");
            this.add("slip");
            this.add("boobs");
            this.add("booty");
            this.add("vagina");
            this.add("fuckhole");
            this.add("futaBallLR");
            this.add("futaBallLL");
            this.add("coin");
            this.add("pentagram");
        }
    };
    public static final f7 y = new f7(0.0f, 0.0f, 0.0f);
    static final gv H = new gv(152, 45, 62, 255);
    static final gv I = new gv(84, 66, 88, 255);
    static final bm C = new bm(0.25f, 0.125f);
    static final bm x = new bm(0.375f, 0.125f);
    static final float F = 0.125f;
    static final ResourceLocation w = new ResourceLocation("sexmod", "textures/star.png");
    static final int v = 105;
    static final int A = 125;
    static final float B = 0.0296875f;
    static final float J = 0.06484375f;
    static final float z = 0.026124999f;
    static final float u = 0.0570625f;
    static final ef.b.b G = new ef.b.b(H, 0.1f, 12, 0.035f, (n2, f10) -> (float)(Math.sin((double)f10 * 0.3 + -0.2 * (double)n2) * 15.0), (n2, f10) -> (float)(Math.sin((double)f10 * -0.15 + -0.2 * (double)n2) * 3.0), (n2, f10) -> 0.0f, 0.03f, 0.005f);
    static final ef.b.b t = new ef.b.b(H, 0.0f, 12, 0.0f, (n2, f10) -> (float)(Math.sin((double)f10 * 0.3 + -0.2 * (double)n2) * 15.0), (n2, f10) -> (float)(Math.sin((double)f10 * -0.15 + -0.2 * (double)n2) * 3.0), (n2, f10) -> 0.0f, 0.03f, 0.005f);
    boolean r = false;
    float s = 0.0f;

    public da(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d10) {
        super(renderManager, animatedGeoModel, d10);
    }

    @Nullable
    protected f7 a(f_ f_2) {
        if (f_2.field_70170_p instanceof gj) {
            return null;
        }
        if (f_2.bb) {
            return null;
        }
        return y;
    }

    @Override
    public HashSet<String> a() {
        block0: {
            if (this.r) break block0;
            E.addAll(gx.a);
            E.addAll(dh.B);
            this.r = true;
        }
        return E;
    }

    @Override
    protected void b(Tessellator tessellator, BufferBuilder bufferBuilder, em em2, f7 f72, float f10) {
        da.a(tessellator, bufferBuilder, em2, f72, f10);
    }

    @Override
    protected void b(f_ f_2) {
        float f10;
        if (f_2.y() != fp.MASTERBATE) {
            return;
        }
        f_2.field_70177_z = f10 = f_2.I().floatValue();
        f_2.field_70760_ar = f10;
        f_2.field_70761_aq = f10;
        f_2.field_70758_at = f10;
        f_2.field_70759_as = f10;
    }

    @Override
    public void a(f_ f_2, double d10, double d11, double d12, float f10, float f11) {
        block1: {
            Vec3d vec3d = da.a(f_2, f11);
            if (vec3d != null) {
                f_2.a(vec3d);
            }
            f_2.aG = vec3d;
            f_.a(f_2, f11);
            this.d(f_2);
            this.c(f_2);
            super.a(f_2, d10, d11, d12, f10, f11);
            da.a((em)f_2, f11);
            if (!f_2.b()) break block1;
            dh.a((em)f_2, f11);
        }
    }

    void c(f_ f_2) {
        if (f_2.y() != fp.RAPE_CHARGE) {
            return;
        }
        f_2.field_70760_ar = f_2.field_70761_aq = f_2.I().floatValue();
    }

    void d(f_ f_2) {
        boolean bl2;
        if (!((Boolean)f_2.func_184212_Q().func_187225_a(f_.bP)).booleanValue()) {
            return;
        }
        Vec3d vec3d = new Vec3d(f_2.field_70142_S, f_2.field_70137_T, f_2.field_70136_U);
        Vec3d vec3d2 = f_2.func_174791_d().func_178788_d(vec3d);
        boolean bl3 = bl2 = Math.abs(vec3d2.field_72450_a) + Math.abs(vec3d2.field_72449_c) < (double)0.05f;
        if (bl2) {
            f_2.field_70761_aq = this.s;
            f_2.field_70760_ar = this.s;
        } else {
            float f10;
            f_2.field_70761_aq = f10 = (float)(gc.b(Math.atan2(vec3d2.field_72449_c, vec3d2.field_72450_a)) - 90.0);
            f_2.field_70760_ar = f10;
            this.s = f10;
        }
    }

    @Nullable
    public static Vec3d a(f_ f_2, float f10) {
        float f11 = f_2.az();
        if (f11 == -1.0f) {
            f_2.af = -1L;
            f_2.aH = -1L;
            return null;
        }
        EntityLivingBase entityLivingBase = f_2.M();
        if (entityLivingBase == null) {
            return null;
        }
        Vec3d vec3d = b6.a(new Vec3d(entityLivingBase.field_70169_q, entityLivingBase.field_70167_r, entityLivingBase.field_70166_s), entityLivingBase.func_174791_d(), (double)f10);
        if (f11 == 24.0f && f_2.af == -1L) {
            f_2.af = da.i.field_71441_e.func_82737_E();
            f_2.aH = f_2.af + 8L;
        }
        if (be.a((double)f11, 24.0, 32.0)) {
            Vec3d vec3d2 = ck.a(new Vec3d(0.0, 0.0, 3.0), f_2.I().floatValue() + 180.0f);
            Vec3d vec3d3 = f_2.B();
            Vec3d vec3d4 = vec3d.func_72441_c(0.0, (double)entityLivingBase.func_70047_e(), 0.0).func_178787_e(vec3d2);
            float f12 = ((float)da.i.field_71441_e.func_82737_E() + f10 - (float)f_2.af) / (float)(f_2.aH - f_2.af);
            return b6.a(vec3d3, vec3d4, (double)f12);
        }
        if (be.a((double)f11, 32.0, 54.0)) {
            Vec3d vec3d5 = ck.a(new Vec3d(0.0, 0.0, 1.5), f_2.I().floatValue() + 180.0f);
            return vec3d.func_178787_e(vec3d5);
        }
        return null;
    }

    public static void a(em em2, float f10) {
        EntityPlayerSP entityPlayerSP = da.i.field_71439_g;
        if (entityPlayerSP == null) {
            return;
        }
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        GlStateManager.func_179094_E();
        af.a(i, em2, f10);
        i.func_110434_K().func_110577_a(e);
        GlStateManager.func_179129_p();
        GlStateManager.func_179140_f();
        da.a(em2, bufferBuilder, tessellator, b6.a(em2.field_70760_ar, em2.field_70761_aq, f10));
        da.b(em2, bufferBuilder, tessellator, f10);
        da.a(em2, bufferBuilder, tessellator);
        GlStateManager.func_179121_F();
        GlStateManager.func_179089_o();
        GlStateManager.func_179145_e();
    }

    static void b(em em2, BufferBuilder bufferBuilder, Tessellator tessellator, float f10) {
        double d10;
        double d11;
        if (!(em2 instanceof f_)) {
            return;
        }
        if (!((Boolean)em2.func_184212_Q().func_187225_a(f_.bP)).booleanValue()) {
            return;
        }
        if (((Boolean)em2.func_184212_Q().func_187225_a(f_.L)).booleanValue()) {
            return;
        }
        GlStateManager.func_179094_E();
        Vec3d vec3d = em2.b("stars");
        GlStateManager.func_179137_b((double)vec3d.field_72450_a, (double)vec3d.field_72448_b, (double)vec3d.field_72449_c);
        float f11 = (float)da.i.field_71441_e.func_82737_E() + f10;
        float f12 = (float)(Math.sin((double)f11 * 0.2) * 5.0);
        float f13 = (float)(Math.cos((double)f11 * 0.2) * 5.0);
        float f14 = (float)((double)f11 * 3.0);
        GlStateManager.func_179114_b((float)f12, (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)f14, (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)f13, (float)0.0f, (float)0.0f, (float)1.0f);
        float f15 = gc.c(9.0);
        f7 f72 = f_.aa;
        i.func_110434_K().func_110577_a(e);
        bufferBuilder.func_181668_a(3, DefaultVertexFormats.field_181709_i);
        GlStateManager.func_187441_d((float)da.a(em2, f10, 1.0f, 3.0f));
        float f16 = 0.0f;
        while ((double)f16 < Math.PI * 2) {
            d11 = Math.sin(f16) * (double)0.3f;
            d10 = Math.cos(f16) * (double)0.3f;
            bufferBuilder.func_181662_b(d11, 0.0, d10).func_187315_a(0.0, 0.0).func_181666_a(f72.a, f72.c, f72.b, 1.0f).func_181675_d();
            f16 += f15;
        }
        tessellator.func_78381_a();
        i.func_110434_K().func_110577_a(w);
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
        f15 = gc.c(60.0);
        f16 = 0.0f;
        while ((double)f16 < Math.PI * 2) {
            d11 = Math.sin(f16) * (double)0.3f;
            d10 = Math.cos(f16) * (double)0.3f;
            bufferBuilder.func_181662_b(d11 - (double)0.1f, (double)0.1f, d10).func_187315_a(0.0, 0.0).func_181666_a(1.0f, 1.0f, 1.0f, 1.0f).func_181675_d();
            bufferBuilder.func_181662_b(d11 + (double)0.1f, (double)0.1f, d10).func_187315_a(1.0, 0.0).func_181666_a(1.0f, 1.0f, 1.0f, 1.0f).func_181675_d();
            bufferBuilder.func_181662_b(d11 + (double)0.1f, (double)-0.1f, d10).func_187315_a(1.0, 1.0).func_181666_a(1.0f, 1.0f, 1.0f, 1.0f).func_181675_d();
            bufferBuilder.func_181662_b(d11 - (double)0.1f, (double)-0.1f, d10).func_187315_a(0.0, 1.0).func_181666_a(1.0f, 1.0f, 1.0f, 1.0f).func_181675_d();
            f16 += f15;
        }
        tessellator.func_78381_a();
        GlStateManager.func_179121_F();
    }

    static void a(em em2, BufferBuilder bufferBuilder, Tessellator tessellator, float f10) {
        if (em2.y() == fp.GIVE_COIN && fp.GIVE_COIN.ticksPlaying[1] > 100) {
            return;
        }
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
        Vec3d[][] vec3dArray = af.a(em2, f10, "hairStrandStartR", "hairStrandMidR", "hairStrandEndR", 0.0296875f, 0.06484375f, 0.026124999f, 0.0570625f, "head");
        Vec3d[][] vec3dArray2 = af.a(em2, f10, "hairStrandStartL", "hairStrandMidL", "hairStrandEndL", 0.0296875f, 0.06484375f, 0.026124999f, 0.0570625f, "head");
        af.a(bufferBuilder, vec3dArray, I);
        af.a(bufferBuilder, vec3dArray2, I);
        tessellator.func_78381_a();
    }

    static void a(em em2, BufferBuilder bufferBuilder, Tessellator tessellator) {
        if (!((b7)((Object)em2)).a()) {
            return;
        }
        i.func_110434_K().func_110577_a(cb.h);
        Vec3d[] vec3dArray = new Vec3d[14];
        Vec3d[] vec3dArray2 = new Vec3d[14];
        for (int i2 = 0; i2 < 14; ++i2) {
            vec3dArray[i2] = em2.b("wingRV" + i2);
            vec3dArray2[i2] = em2.b("wingLV" + i2);
        }
        da.a(bufferBuilder, tessellator, vec3dArray);
        da.a(bufferBuilder, tessellator, vec3dArray2);
    }

    static void a(BufferBuilder bufferBuilder, Tessellator tessellator, Vec3d[] vec3dArray) {
        bufferBuilder.func_181668_a(4, DefaultVertexFormats.field_181709_i);
        bufferBuilder.func_181662_b(vec3dArray[0].field_72450_a, vec3dArray[0].field_72448_b, vec3dArray[0].field_72449_c).func_187315_a((double)da.C.c, (double)da.C.a).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[1].field_72450_a, vec3dArray[1].field_72448_b, vec3dArray[1].field_72449_c).func_187315_a((double)(da.C.c + 0.125f), (double)da.C.a).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[2].field_72450_a, vec3dArray[2].field_72448_b, vec3dArray[2].field_72449_c).func_187315_a((double)(da.C.c + 0.125f), (double)(da.C.a + 0.125f)).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[11].field_72450_a, vec3dArray[11].field_72448_b, vec3dArray[11].field_72449_c).func_187315_a((double)da.C.c, (double)da.C.a).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[12].field_72450_a, vec3dArray[12].field_72448_b, vec3dArray[12].field_72449_c).func_187315_a((double)(da.C.c + 0.125f), (double)da.C.a).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[13].field_72450_a, vec3dArray[13].field_72448_b, vec3dArray[13].field_72449_c).func_187315_a((double)(da.C.c + 0.125f), (double)(da.C.a + 0.125f)).func_181669_b(255, 255, 255, 255).func_181675_d();
        tessellator.func_78381_a();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
        bufferBuilder.func_181662_b(vec3dArray[3].field_72450_a, vec3dArray[3].field_72448_b, vec3dArray[3].field_72449_c).func_187315_a((double)da.x.c, (double)(da.x.a + 0.125f)).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[4].field_72450_a, vec3dArray[4].field_72448_b, vec3dArray[4].field_72449_c).func_187315_a((double)da.x.c, (double)da.x.a).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[5].field_72450_a, vec3dArray[5].field_72448_b, vec3dArray[5].field_72449_c).func_187315_a((double)(da.x.c + 0.125f), (double)da.x.a).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[6].field_72450_a, vec3dArray[6].field_72448_b, vec3dArray[6].field_72449_c).func_187315_a((double)(da.x.c + 0.125f), (double)(da.x.a + 0.125f)).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[7].field_72450_a, vec3dArray[7].field_72448_b, vec3dArray[7].field_72449_c).func_187315_a((double)da.x.c, (double)(da.x.a + 0.125f)).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[8].field_72450_a, vec3dArray[8].field_72448_b, vec3dArray[8].field_72449_c).func_187315_a((double)da.x.c, (double)da.x.a).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[9].field_72450_a, vec3dArray[9].field_72448_b, vec3dArray[9].field_72449_c).func_187315_a((double)(da.x.c + 0.125f), (double)da.x.a).func_181669_b(255, 255, 255, 255).func_181675_d();
        bufferBuilder.func_181662_b(vec3dArray[10].field_72450_a, vec3dArray[10].field_72448_b, vec3dArray[10].field_72449_c).func_187315_a((double)(da.x.c + 0.125f), (double)(da.x.a + 0.125f)).func_181669_b(255, 255, 255, 255).func_181675_d();
        tessellator.func_78381_a();
    }

    @Override
    protected void a(GeoModel geoModel, BufferBuilder bufferBuilder, f_ f_2, float f10, float f11, float f12, float f13, float f14) {
        GeoBone geoBone = geoModel.topLevelBones.get(0);
        GeoBone geoBone2 = null;
        GeoBone geoBone3 = null;
        GeoBone geoBone4 = null;
        GeoBone geoBone5 = null;
        for (GeoBone geoBone6 : geoBone.childBones) {
            switch (geoBone6.getName()) {
                case "steve": {
                    geoBone4 = geoBone6;
                    break;
                }
                case "body": {
                    geoBone2 = geoBone6;
                    break;
                }
                case "coin": {
                    geoBone3 = geoBone6;
                    break;
                }
                case "body2": {
                    geoBone5 = geoBone6;
                }
            }
        }
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        this.renderRecursively(bufferBuilder, geoBone2, f10, f11, f12, f13);
        Tessellator.func_178181_a().func_78381_a();
        this.a(bufferBuilder, geoBone3, f_2, f14);
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        try {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.d(this.j));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.renderRecursively(bufferBuilder, geoBone4, f10, f11, f12, ((f_)this.j).v());
        Tessellator.func_178181_a().func_78381_a();
        if (geoBone5 != null) {
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(ce.j);
            this.renderRecursively(bufferBuilder, geoBone5, f10, f11, f12, ((f_)this.j).v());
            Tessellator.func_178181_a().func_78381_a();
        }
        MATRIX_STACK.pop();
    }

    @Override
    protected void a(BufferBuilder bufferBuilder, String string, GeoBone geoBone) {
        block30: {
            switch (string) {
                case "hairBack": {
                    if (i.func_147113_T()) break;
                    IBone iBone = ((f_)this.j).b().getBone("head");
                    float f10 = gc.d(iBone.getRotationX());
                    if (f10 < 0.0f) {
                        geoBone.setRotationX(gc.c(-f10));
                        break;
                    }
                    float f11 = Math.min(1.0f, f10 / 45.0f);
                    geoBone.setRotationX(gc.c(-f10));
                    geoBone.setPositionY(geoBone.getPositionY() + f11 * 1.5f);
                    break;
                }
                case "hairDownSideL": 
                case "hairDownSideR": {
                    if (i.func_147113_T()) break;
                    IBone iBone = ((f_)this.j).b().getBone("head");
                    float f12 = gc.d(iBone.getRotationX());
                    if (f12 < 0.0f) {
                        geoBone.setRotationX(gc.c(-f12 / 2.0f));
                        break;
                    }
                    float f13 = Math.min(1.0f, f12 / 45.0f);
                    geoBone.setRotationX(gc.c(-f12));
                    geoBone.setPositionY(geoBone.getPositionY() + f13);
                    break;
                }
                case "head": {
                    EntityLivingBase entityLivingBase;
                    this.c(geoBone);
                    fp fp2 = ((f_)this.j).y();
                    if (fp2 != fp.FLY && fp2 != fp.ATTACK_SWORD || (entityLivingBase = ((f_)this.j).M()) == null) break;
                    float f14 = i.func_184121_ak();
                    Vec3d vec3d = b6.a(new Vec3d(((f_)this.j).field_70142_S, ((f_)this.j).field_70137_T, ((f_)this.j).field_70136_U), ((f_)this.j).func_174791_d(), (double)f14);
                    Vec3d vec3d2 = b6.a(new Vec3d(entityLivingBase.field_70142_S, entityLivingBase.field_70137_T, entityLivingBase.field_70136_U), ((f_)this.j).func_174791_d(), (double)f14);
                    Vec3d vec3d3 = vec3d.func_178788_d(vec3d2);
                    float f15 = (float)ck.a((Vec3d)vec3d3, (float)((f_)this.j).field_70761_aq).field_72449_c;
                    float f16 = (float)Math.atan2(vec3d3.field_72448_b, f15);
                    break;
                }
                case "weapon": {
                    if (!((f_)this.j).ap) break;
                    GlStateManager.func_179094_E();
                    Tessellator.func_178181_a().func_78381_a();
                    com.trolmastercard.sexmod.p.a(MATRIX_STACK, geoBone);
                    GL11.glEnable((int)2896);
                    GlStateManager.func_179139_a((double)1.5, (double)1.0, (double)2.0);
                    GlStateManager.func_179137_b((double)0.0, (double)0.0, (double)0.05);
                    GlStateManager.func_179114_b((float)110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    Minecraft.func_71410_x().func_175597_ag().func_178099_a((EntityLivingBase)this.j, new ItemStack(Items.field_151040_l), ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
                    this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
                    bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
                    GL11.glDisable((int)2896);
                    GlStateManager.func_179121_F();
                    break;
                }
                case "tongue": {
                    this.e(bufferBuilder, geoBone);
                    break;
                }
                case "mangTongue": {
                    this.c(bufferBuilder, geoBone);
                    break;
                }
                case "head3": {
                    this.d(geoBone);
                    break;
                }
                case "irisL": 
                case "irisR": {
                    this.a(geoBone);
                    break;
                }
                case "irsisFaceR2": 
                case "irsisFaceR3": {
                    this.b(geoBone);
                    break;
                }
                case "armL": 
                case "armR": {
                    EntityLivingBase entityLivingBase;
                    if (((f_)this.j).y() != fp.RAPE_CHARGE || (entityLivingBase = ((f_)this.j).M()) == null) break;
                    float f17 = ((f_)this.j).field_70761_aq;
                    Vec3d vec3d = entityLivingBase.func_174791_d().func_178788_d(((f_)this.j).func_174791_d());
                    vec3d = ck.a(vec3d, f17);
                    double d10 = -be.b(vec3d.field_72450_a, -1.0, 1.0);
                    geoBone.setRotationZ(geoBone.getRotationZ() + gc.c(45.0 * d10));
                }
            }
            if (!((f_)this.j).b()) break block30;
            dh.a(this.j, string, geoBone, true);
        }
    }

    void e(BufferBuilder bufferBuilder, GeoBone geoBone) {
        block1: {
            block0: {
                if (!fp.a(this.j, fp.PUSSY_LICKING, fp.MASTERBATE_SITTING)) break block0;
                this.f(bufferBuilder, geoBone);
                break block1;
            }
            if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) break block1;
            this.d(bufferBuilder, geoBone);
        }
    }

    void c(BufferBuilder bufferBuilder, GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW) && !((f_)this.j).aD) {
            return;
        }
        float f10 = ((f_)this.j).aD ? 1.0f - Math.min(0.29f, fp.a(this.j, i.func_184121_ak())) / 0.29f : 1.0f;
        this.a(bufferBuilder, geoBone, f10);
        this.func_110776_a(ce.j);
    }

    void d(GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW, fp.MORNING_BLOWJOB_FAST)) {
            return;
        }
        if (i.func_147113_T()) {
            return;
        }
        float f10 = (float)da.i.field_71439_g.field_70173_aa + i.func_184121_ak();
        float f11 = (float)(Math.sin(f10 * 0.1f) * (double)0.1f) + 0.2f;
        float f12 = (float)Math.sin(f10 * 0.1f) * 0.1f;
        if (fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
            geoBone.setRotationY(geoBone.getRotationY() + f11);
            geoBone.setRotationZ(geoBone.getRotationZ() + f12);
            return;
        }
        if (!((f_)this.j).aD) {
            return;
        }
        float f13 = 1.0f - Math.min(0.5f, fp.a(this.j, i.func_184121_ak())) / 0.5f;
        geoBone.setRotationY(geoBone.getRotationY() + f11 * f13);
        geoBone.setRotationZ(geoBone.getRotationZ() + f12 * f13);
    }

    void c(GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW, fp.MORNING_BLOWJOB_FAST)) {
            return;
        }
        if (i.func_147113_T()) {
            return;
        }
        float f10 = (float)da.i.field_71439_g.field_70173_aa + i.func_184121_ak();
        float f11 = (float)Math.sin(f10 * -0.1f) * 0.1f;
        float f12 = (float)Math.sin(f10 * 0.1f) * 0.1f;
        if (fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
            geoBone.setRotationY(geoBone.getRotationY() + f11);
            geoBone.setRotationZ(geoBone.getRotationZ() + f12);
            return;
        }
        if (!((f_)this.j).aD) {
            return;
        }
        float f13 = Math.min(0.5f, fp.a(this.j, i.func_184121_ak())) / 0.5f;
        geoBone.setRotationY(geoBone.getRotationY() + f11 * f13);
        geoBone.setRotationZ(geoBone.getRotationZ() + f12 * f13);
    }

    @Override
    void a(GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
            return;
        }
        if (i.func_147113_T()) {
            return;
        }
        float f10 = (float)da.i.field_71439_g.field_70173_aa + i.func_184121_ak();
        geoBone.setPositionX((float)((double)geoBone.getPositionX() + Math.sin(f10 * 0.1f) * (double)-0.1f));
    }

    @Override
    void b(GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
            return;
        }
        if (i.func_147113_T()) {
            return;
        }
        float f10 = (float)da.i.field_71439_g.field_70173_aa + i.func_184121_ak();
        geoBone.setPositionX((float)((double)geoBone.getPositionX() + Math.sin(f10 * 0.1f) * (double)-0.15f));
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, float f11) {
        float f13 = fp.d(this.j, i.func_184121_ak());
        float f14 = f11 * (float)((double)0.02f * ((double)-0.4f * Math.cos(Math.PI * 2 * (double)f13 + 1.05) + (double)0.6f));
        ef.b.b b10 = new ef.b.b(H, 0.0f, 12, f14, (n2, f12) -> f11 * (float)(Math.cos(Math.PI * 2 * (double)f13 + (double)0.35f + (double)(-0.2f * (float)n2)) * -10.0), (n2, f10) -> 0.0f, (n2, f12) -> f11 * (float)(Math.cos(Math.PI * 2 * (double)f13 + 1.25 + (double)(-0.1f * (float)n2)) * -5.0), 0.03f, 0.005f);
        this.a(bufferBuilder, geoBone, b10);
    }

    void d(BufferBuilder bufferBuilder, GeoBone geoBone) {
        float f12 = fp.d(this.j, i.func_184121_ak());
        ef.b.b b10 = new ef.b.b(H, 0.0f, 12, 0.02f, (n2, f11) -> (float)(Math.cos(Math.PI * 2 * (double)f12 + (double)(-0.2f * (float)n2)) * 15.0), (n2, f11) -> (float)(Math.cos(Math.PI * 2 * (double)f12 + (double)(-0.2f * (float)n2)) * 5.0), (n2, f10) -> 0.0f, 0.03f, 0.005f);
        this.a(bufferBuilder, geoBone, b10);
    }

    void f(BufferBuilder bufferBuilder, GeoBone geoBone) {
        float f10 = ((f_)this.j).b(i.func_184121_ak());
        if (f10 == 0.0f) {
            this.a(bufferBuilder, geoBone, G);
            return;
        }
        if (f10 == 1.0f) {
            this.a(bufferBuilder, geoBone, t);
            return;
        }
        ef.b.b b10 = G.a();
        b10.g = b6.a(da.G.g, 0.0f, f10);
        b10.e = b6.a(da.G.e, 0.0f, f10);
        this.a(bufferBuilder, geoBone, b10);
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, ef.b.b b10) {
        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(MATRIX_STACK, geoBone);
        GlStateManager.func_179129_p();
        this.func_110776_a(e);
        ef.a(bufferBuilder, Tessellator.func_178181_a(), i, b10);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GlStateManager.func_179089_o();
        GlStateManager.func_179121_F();
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, f_ f_2, float f10) {
        if (f_2.y() != fp.GIVE_COIN) {
            return;
        }
        n = bufferBuilder;
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        if (!this.p.contains(geoBone.getName())) {
            for (GeoCube geoCube : geoBone.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.func_179094_E();
                this.q = geoBone;
                this.a(bufferBuilder, geoCube, 1.0f, 1.0f, 1.0f, 1.0f, 0.0);
                GlStateManager.func_179121_F();
                MATRIX_STACK.pop();
            }
        }
        Tessellator.func_178181_a().func_78381_a();
        GeoBone geoBone2 = geoBone.childBones.get(0);
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GL11.glDisable((int)2896);
        float f11 = be.b((float)fp.GIVE_COIN.ticksPlaying[1] + f10, 105.0f, 125.0f);
        float f12 = (f11 - 105.0f) / 20.0f;
        float f13 = b6.a(120.0f, 240.0f, f12);
        f7 f72 = b6.a(av.f, av.e, (double)f12);
        float f14 = OpenGlHelper.lastBrightnessX;
        float f15 = OpenGlHelper.lastBrightnessY;
        OpenGlHelper.func_77475_a((int)OpenGlHelper.field_77476_b, (float)f13, (float)f13);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone2);
        MATRIX_STACK.moveToPivot(geoBone2);
        MATRIX_STACK.rotate(geoBone2);
        MATRIX_STACK.scale(geoBone2);
        MATRIX_STACK.moveBackFromPivot(geoBone2);
        if (!this.p.contains(geoBone2.getName())) {
            for (GeoCube geoCube : geoBone2.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.func_179094_E();
                this.q = geoBone2;
                this.a(bufferBuilder, geoCube, f72.a, f72.c, f72.b, 1.0f, 0.0);
                GlStateManager.func_179121_F();
                MATRIX_STACK.pop();
            }
        }
        MATRIX_STACK.pop();
        MATRIX_STACK.pop();
        Tessellator.func_178181_a().func_78381_a();
        GL11.glEnable((int)2896);
        OpenGlHelper.func_77475_a((int)OpenGlHelper.field_77476_b, (float)f14, (float)f15);
    }

    @Override
    protected Vec3d a(f_ f_2, float f10, Vec3d vec3d) {
        if (f_2.y() == fp.RUN) {
            float f11;
            f_2.field_70177_z = f11 = f_2.I().floatValue();
            f_2.field_70760_ar = f11;
            f_2.field_70761_aq = f11;
            f_2.field_70758_at = f11;
            f_2.field_70759_as = f11;
        }
        return vec3d;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

