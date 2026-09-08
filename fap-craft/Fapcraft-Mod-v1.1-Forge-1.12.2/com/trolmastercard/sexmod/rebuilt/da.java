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
 *  software.bernie.geckolib3.core.processor.IBone
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoCube
 *  software.bernie.geckolib3.geo.render.built.GeoModel
 *  software.bernie.geckolib3.model.AnimatedGeoModel
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
    static final ef.b.b G = new ef.b.b(H, 0.1f, 12, 0.035f, (n, f) -> (float)(Math.sin((double)f * 0.3 + -0.2 * (double)n) * 15.0), (n, f) -> (float)(Math.sin((double)f * -0.15 + -0.2 * (double)n) * 3.0), (n, f) -> 0.0f, 0.03f, 0.005f);
    static final ef.b.b t = new ef.b.b(H, 0.0f, 12, 0.0f, (n, f) -> (float)(Math.sin((double)f * 0.3 + -0.2 * (double)n) * 15.0), (n, f) -> (float)(Math.sin((double)f * -0.15 + -0.2 * (double)n) * 3.0), (n, f) -> 0.0f, 0.03f, 0.005f);
    boolean r = false;
    float s = 0.0f;

    public da(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d) {
        super(renderManager, animatedGeoModel, d);
    }

    @Nullable
    protected f7 a(f_ f_2) {
        if (f_2.world instanceof gj) {
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
    protected void b(Tessellator tessellator, BufferBuilder bufferBuilder, em em2, f7 f72, float f) {
        da.a(tessellator, bufferBuilder, em2, f72, f);
    }

    @Override
    protected void b(f_ f_2) {
        float f;
        if (f_2.y() != fp.MASTERBATE) {
            return;
        }
        f_2.rotationYaw = f = f_2.I().floatValue();
        f_2.prevRenderYawOffset = f;
        f_2.renderYawOffset = f;
        f_2.prevRotationYawHead = f;
        f_2.rotationYawHead = f;
    }

    @Override
    public void a(f_ f_2, double d, double d2, double d3, float f, float f3) {
        block1: {
            Vec3d vec3d = da.a(f_2, f3);
            if (vec3d != null) {
                f_2.a(vec3d);
            }
            f_2.aG = vec3d;
            f_.a(f_2, f3);
            this.d(f_2);
            this.c(f_2);
            super.a(f_2, d, d2, d3, f, f3);
            da.a((em)f_2, f3);
            if (!f_2.b()) break block1;
            dh.a((em)f_2, f3);
        }
    }

    void c(f_ f_2) {
        if (f_2.y() != fp.RAPE_CHARGE) {
            return;
        }
        f_2.prevRenderYawOffset = f_2.renderYawOffset = f_2.I().floatValue();
    }

    void d(f_ f_2) {
        boolean bl;
        if (!((Boolean)f_2.getDataManager().get(f_.bP)).booleanValue()) {
            return;
        }
        Vec3d vec3d = new Vec3d(f_2.lastTickPosX, f_2.lastTickPosY, f_2.lastTickPosZ);
        Vec3d vec3d2 = f_2.getPositionVector().subtract(vec3d);
        boolean bl2 = bl = Math.abs(vec3d2.x) + Math.abs(vec3d2.z) < (double)0.05f;
        if (bl) {
            f_2.renderYawOffset = this.s;
            f_2.prevRenderYawOffset = this.s;
        } else {
            float f;
            f_2.renderYawOffset = f = (float)(gc.b(Math.atan2(vec3d2.z, vec3d2.x)) - 90.0);
            f_2.prevRenderYawOffset = f;
            this.s = f;
        }
    }

    @Nullable
    public static Vec3d a(f_ f_2, float f) {
        float f3 = f_2.az();
        if (f3 == -1.0f) {
            f_2.af = -1L;
            f_2.aH = -1L;
            return null;
        }
        EntityLivingBase entityLivingBase = f_2.M();
        if (entityLivingBase == null) {
            return null;
        }
        Vec3d vec3d = b6.a(new Vec3d(entityLivingBase.prevPosX, entityLivingBase.prevPosY, entityLivingBase.prevPosZ), entityLivingBase.getPositionVector(), (double)f);
        if (f3 == 24.0f && f_2.af == -1L) {
            f_2.af = da.i.world.getTotalWorldTime();
            f_2.aH = f_2.af + 8L;
        }
        if (be.a((double)f3, 24.0, 32.0)) {
            Vec3d vec3d2 = ck.a(new Vec3d(0.0, 0.0, 3.0), f_2.I().floatValue() + 180.0f);
            Vec3d vec3d3 = f_2.B();
            Vec3d vec3d4 = vec3d.add(0.0, (double)entityLivingBase.getEyeHeight(), 0.0).add(vec3d2);
            float f4 = ((float)da.i.world.getTotalWorldTime() + f - (float)f_2.af) / (float)(f_2.aH - f_2.af);
            return b6.a(vec3d3, vec3d4, (double)f4);
        }
        if (be.a((double)f3, 32.0, 54.0)) {
            Vec3d vec3d5 = ck.a(new Vec3d(0.0, 0.0, 1.5), f_2.I().floatValue() + 180.0f);
            return vec3d.add(vec3d5);
        }
        return null;
    }

    public static void a(em em2, float f) {
        EntityPlayerSP entityPlayerSP = da.i.player;
        if (entityPlayerSP == null) {
            return;
        }
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.pushMatrix();
        // STOP LOOSING THIS
        af.a(i, em2, f);
        i.getTextureManager().bindTexture(e);
        GlStateManager.disableCull();
        GlStateManager.disableLighting();
        da.a(em2, bufferBuilder, tessellator, b6.a(em2.prevRenderYawOffset, em2.renderYawOffset, f));
        da.b(em2, bufferBuilder, tessellator, f);
        da.a(em2, bufferBuilder, tessellator);
        GlStateManager.popMatrix();
        GlStateManager.enableCull();
        GlStateManager.enableLighting();
    }

    static void b(em em2, BufferBuilder bufferBuilder, Tessellator tessellator, float f) {
        double d;
        double d2;
        if (!(em2 instanceof f_)) {
            return;
        }
        if (!((Boolean)em2.getDataManager().get(f_.bP)).booleanValue()) {
            return;
        }
        if (((Boolean)em2.getDataManager().get(f_.L)).booleanValue()) {
            return;
        }
        GlStateManager.pushMatrix();
        Vec3d vec3d = em2.b("stars");
        GlStateManager.translate((double)vec3d.x, (double)vec3d.y, (double)vec3d.z);
        float f3 = (float)da.i.world.getTotalWorldTime() + f;
        float f4 = (float)(Math.sin((double)f3 * 0.2) * 5.0);
        float f5 = (float)(Math.cos((double)f3 * 0.2) * 5.0);
        float f6 = (float)((double)f3 * 3.0);
        GlStateManager.rotate((float)f4, (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.rotate((float)f6, (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)f5, (float)0.0f, (float)0.0f, (float)1.0f);
        float f9 = gc.c(9.0);
        f7 f72 = f_.aa;
        i.getTextureManager().bindTexture(e);
        bufferBuilder.begin(3, DefaultVertexFormats.POSITION_TEX_COLOR);
        GlStateManager.glLineWidth((float)da.a(em2, f, 1.0f, 3.0f));
        float f10 = 0.0f;
        while ((double)f10 < Math.PI * 2) {
            d2 = Math.sin(f10) * (double)0.3f;
            d = Math.cos(f10) * (double)0.3f;
            bufferBuilder.pos(d2, 0.0, d).tex(0.0, 0.0).color(f72.a, f72.c, f72.b, 1.0f).endVertex();
            f10 += f9;
        }
        tessellator.draw();
        i.getTextureManager().bindTexture(w);
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        f9 = gc.c(60.0);
        f10 = 0.0f;
        while ((double)f10 < Math.PI * 2) {
            d2 = Math.sin(f10) * (double)0.3f;
            d = Math.cos(f10) * (double)0.3f;
            bufferBuilder.pos(d2 - (double)0.1f, (double)0.1f, d).tex(0.0, 0.0).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
            bufferBuilder.pos(d2 + (double)0.1f, (double)0.1f, d).tex(1.0, 0.0).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
            bufferBuilder.pos(d2 + (double)0.1f, (double)-0.1f, d).tex(1.0, 1.0).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
            bufferBuilder.pos(d2 - (double)0.1f, (double)-0.1f, d).tex(0.0, 1.0).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
            f10 += f9;
        }
        tessellator.draw();
        GlStateManager.popMatrix();
    }

    static void a(em em2, BufferBuilder bufferBuilder, Tessellator tessellator, float f) {
        if (em2.y() == fp.GIVE_COIN && fp.GIVE_COIN.ticksPlaying[1] > 100) {
            return;
        }
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        Vec3d[][] vec3dArray = af.a(em2, f, "hairStrandStartR", "hairStrandMidR", "hairStrandEndR", 0.0296875f, 0.06484375f, 0.026124999f, 0.0570625f, "head");
        Vec3d[][] vec3dArray2 = af.a(em2, f, "hairStrandStartL", "hairStrandMidL", "hairStrandEndL", 0.0296875f, 0.06484375f, 0.026124999f, 0.0570625f, "head");
        af.a(bufferBuilder, vec3dArray, I);
        af.a(bufferBuilder, vec3dArray2, I);
        tessellator.draw();
    }

    static void a(em em2, BufferBuilder bufferBuilder, Tessellator tessellator) {
        if (!((b7)((Object)em2)).a()) {
            return;
        }
        i.getTextureManager().bindTexture(cb.h);
        Vec3d[] vec3dArray = new Vec3d[14];
        Vec3d[] vec3dArray2 = new Vec3d[14];
        for (int i = 0; i < 14; ++i) {
            vec3dArray[i] = em2.b("wingRV" + i);
            vec3dArray2[i] = em2.b("wingLV" + i);
        }
        da.a(bufferBuilder, tessellator, vec3dArray);
        da.a(bufferBuilder, tessellator, vec3dArray2);
    }

    static void a(BufferBuilder bufferBuilder, Tessellator tessellator, Vec3d[] vec3dArray) {
        bufferBuilder.begin(4, DefaultVertexFormats.POSITION_TEX_COLOR);
        bufferBuilder.pos(vec3dArray[0].x, vec3dArray[0].y, vec3dArray[0].z).tex((double)da.C.c, (double)da.C.a).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[1].x, vec3dArray[1].y, vec3dArray[1].z).tex((double)(da.C.c + 0.125f), (double)da.C.a).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[2].x, vec3dArray[2].y, vec3dArray[2].z).tex((double)(da.C.c + 0.125f), (double)(da.C.a + 0.125f)).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[11].x, vec3dArray[11].y, vec3dArray[11].z).tex((double)da.C.c, (double)da.C.a).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[12].x, vec3dArray[12].y, vec3dArray[12].z).tex((double)(da.C.c + 0.125f), (double)da.C.a).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[13].x, vec3dArray[13].y, vec3dArray[13].z).tex((double)(da.C.c + 0.125f), (double)(da.C.a + 0.125f)).color(255, 255, 255, 255).endVertex();
        tessellator.draw();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        bufferBuilder.pos(vec3dArray[3].x, vec3dArray[3].y, vec3dArray[3].z).tex((double)da.x.c, (double)(da.x.a + 0.125f)).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[4].x, vec3dArray[4].y, vec3dArray[4].z).tex((double)da.x.c, (double)da.x.a).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[5].x, vec3dArray[5].y, vec3dArray[5].z).tex((double)(da.x.c + 0.125f), (double)da.x.a).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[6].x, vec3dArray[6].y, vec3dArray[6].z).tex((double)(da.x.c + 0.125f), (double)(da.x.a + 0.125f)).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[7].x, vec3dArray[7].y, vec3dArray[7].z).tex((double)da.x.c, (double)(da.x.a + 0.125f)).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[8].x, vec3dArray[8].y, vec3dArray[8].z).tex((double)da.x.c, (double)da.x.a).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[9].x, vec3dArray[9].y, vec3dArray[9].z).tex((double)(da.x.c + 0.125f), (double)da.x.a).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(vec3dArray[10].x, vec3dArray[10].y, vec3dArray[10].z).tex((double)(da.x.c + 0.125f), (double)(da.x.a + 0.125f)).color(255, 255, 255, 255).endVertex();
        tessellator.draw();
    }

    @Override
    protected void a(GeoModel geoModel, BufferBuilder bufferBuilder, f_ f_2, float f, float f3, float f4, float f5, float f6) {
        GeoBone geoBone = (GeoBone)geoModel.topLevelBones.get(0);
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
        this.renderRecursively(bufferBuilder, geoBone2, f, f3, f4, f5);
        Tessellator.getInstance().draw();
        this.a(bufferBuilder, geoBone3, f_2, f6);
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
        try {
            Minecraft.getMinecraft().renderEngine.bindTexture(this.d(this.j));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.renderRecursively(bufferBuilder, geoBone4, f, f3, f4, ((f_)this.j).v());
        Tessellator.getInstance().draw();
        if (geoBone5 != null) {
            bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
            Minecraft.getMinecraft().renderEngine.bindTexture(ce.j);
            this.renderRecursively(bufferBuilder, geoBone5, f, f3, f4, ((f_)this.j).v());
            Tessellator.getInstance().draw();
        }
        MATRIX_STACK.pop();
    }

    @Override
    protected void a(BufferBuilder bufferBuilder, String string, GeoBone geoBone) {
        block30: {
            switch (string) {
                case "hairBack": {
                    if (i.isGamePaused()) break;
                    IBone iBone = ((f_)this.j).b().getBone("head");
                    float f = gc.d(iBone.getRotationX());
                    if (f < 0.0f) {
                        geoBone.setRotationX(gc.c(-f));
                        break;
                    }
                    float f3 = Math.min(1.0f, f / 45.0f);
                    geoBone.setRotationX(gc.c(-f));
                    geoBone.setPositionY(geoBone.getPositionY() + f3 * 1.5f);
                    break;
                }
                case "hairDownSideL": 
                case "hairDownSideR": {
                    if (i.isGamePaused()) break;
                    IBone iBone = ((f_)this.j).b().getBone("head");
                    float f = gc.d(iBone.getRotationX());
                    if (f < 0.0f) {
                        geoBone.setRotationX(gc.c(-f / 2.0f));
                        break;
                    }
                    float f4 = Math.min(1.0f, f / 45.0f);
                    geoBone.setRotationX(gc.c(-f));
                    geoBone.setPositionY(geoBone.getPositionY() + f4);
                    break;
                }
                case "head": {
                    EntityLivingBase entityLivingBase;
                    this.c(geoBone);
                    fp fp2 = ((f_)this.j).y();
                    if (fp2 != fp.FLY && fp2 != fp.ATTACK_SWORD || (entityLivingBase = ((f_)this.j).M()) == null) break;
                    float f = i.getRenderPartialTicks();
                    Vec3d vec3d = b6.a(new Vec3d(((f_)this.j).lastTickPosX, ((f_)this.j).lastTickPosY, ((f_)this.j).lastTickPosZ), ((f_)this.j).getPositionVector(), (double)f);
                    Vec3d vec3d2 = b6.a(new Vec3d(entityLivingBase.lastTickPosX, entityLivingBase.lastTickPosY, entityLivingBase.lastTickPosZ), ((f_)this.j).getPositionVector(), (double)f);
                    Vec3d vec3d3 = vec3d.subtract(vec3d2);
                    float f5 = (float)ck.a((Vec3d)vec3d3, (float)((f_)this.j).renderYawOffset).z;
                    float f6 = (float)Math.atan2(vec3d3.y, f5);
                    break;
                }
                case "weapon": {
                    if (!((f_)this.j).ap) break;
                    GlStateManager.pushMatrix();
                    Tessellator.getInstance().draw();
                    com.trolmastercard.sexmod.p.a(MATRIX_STACK, geoBone);
                    GL11.glEnable((int)2896);
                    GlStateManager.scale((double)1.5, (double)1.0, (double)2.0);
                    GlStateManager.translate((double)0.0, (double)0.0, (double)0.05);
                    GlStateManager.rotate((float)110.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    Minecraft.getMinecraft().getItemRenderer().renderItem((EntityLivingBase)this.j, new ItemStack(Items.IRON_SWORD), ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
                    this.bindTexture(Objects.requireNonNull(this.getEntityTexture((EntityLivingBase)this.j)));
                    bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
                    GL11.glDisable((int)2896);
                    GlStateManager.popMatrix();
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
                    float f = ((f_)this.j).renderYawOffset;
                    Vec3d vec3d = entityLivingBase.getPositionVector().subtract(((f_)this.j).getPositionVector());
                    vec3d = ck.a(vec3d, f);
                    double d = -be.b(vec3d.x, -1.0, 1.0);
                    geoBone.setRotationZ(geoBone.getRotationZ() + gc.c(45.0 * d));
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
        float f = ((f_)this.j).aD ? 1.0f - Math.min(0.29f, fp.a(this.j, i.getRenderPartialTicks())) / 0.29f : 1.0f;
        this.a(bufferBuilder, geoBone, f);
        this.bindTexture(ce.j);
    }

    void d(GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW, fp.MORNING_BLOWJOB_FAST)) {
            return;
        }
        if (i.isGamePaused()) {
            return;
        }
        float f = (float)da.i.player.ticksExisted + i.getRenderPartialTicks();
        float f3 = (float)(Math.sin(f * 0.1f) * (double)0.1f) + 0.2f;
        float f4 = (float)Math.sin(f * 0.1f) * 0.1f;
        if (fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
            geoBone.setRotationY(geoBone.getRotationY() + f3);
            geoBone.setRotationZ(geoBone.getRotationZ() + f4);
            return;
        }
        if (!((f_)this.j).aD) {
            return;
        }
        float f5 = 1.0f - Math.min(0.5f, fp.a(this.j, i.getRenderPartialTicks())) / 0.5f;
        geoBone.setRotationY(geoBone.getRotationY() + f3 * f5);
        geoBone.setRotationZ(geoBone.getRotationZ() + f4 * f5);
    }

    void c(GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW, fp.MORNING_BLOWJOB_FAST)) {
            return;
        }
        if (i.isGamePaused()) {
            return;
        }
        float f = (float)da.i.player.ticksExisted + i.getRenderPartialTicks();
        float f3 = (float)Math.sin(f * -0.1f) * 0.1f;
        float f4 = (float)Math.sin(f * 0.1f) * 0.1f;
        if (fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
            geoBone.setRotationY(geoBone.getRotationY() + f3);
            geoBone.setRotationZ(geoBone.getRotationZ() + f4);
            return;
        }
        if (!((f_)this.j).aD) {
            return;
        }
        float f5 = Math.min(0.5f, fp.a(this.j, i.getRenderPartialTicks())) / 0.5f;
        geoBone.setRotationY(geoBone.getRotationY() + f3 * f5);
        geoBone.setRotationZ(geoBone.getRotationZ() + f4 * f5);
    }

    @Override
    void a(GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
            return;
        }
        if (i.isGamePaused()) {
            return;
        }
        float f = (float)da.i.player.ticksExisted + i.getRenderPartialTicks();
        geoBone.setPositionX((float)((double)geoBone.getPositionX() + Math.sin(f * 0.1f) * (double)-0.1f));
    }

    @Override
    void b(GeoBone geoBone) {
        if (!fp.a(this.j, fp.MORNING_BLOWJOB_SLOW)) {
            return;
        }
        if (i.isGamePaused()) {
            return;
        }
        float f = (float)da.i.player.ticksExisted + i.getRenderPartialTicks();
        geoBone.setPositionX((float)((double)geoBone.getPositionX() + Math.sin(f * 0.1f) * (double)-0.15f));
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, float f3) {
        float f5 = fp.d(this.j, i.getRenderPartialTicks());
        float f6 = f3 * (float)((double)0.02f * ((double)-0.4f * Math.cos(Math.PI * 2 * (double)f5 + 1.05) + (double)0.6f));
        ef.b.b b2 = new ef.b.b(H, 0.0f, 12, f6, (n, f4) -> f3 * (float)(Math.cos(Math.PI * 2 * (double)f5 + (double)0.35f + (double)(-0.2f * (float)n)) * -10.0), (n, f) -> 0.0f, (n, f4) -> f3 * (float)(Math.cos(Math.PI * 2 * (double)f5 + 1.25 + (double)(-0.1f * (float)n)) * -5.0), 0.03f, 0.005f);
        this.a(bufferBuilder, geoBone, b2);
    }

    void d(BufferBuilder bufferBuilder, GeoBone geoBone) {
        float f4 = fp.d(this.j, i.getRenderPartialTicks());
        ef.b.b b2 = new ef.b.b(H, 0.0f, 12, 0.02f, (n, f3) -> (float)(Math.cos(Math.PI * 2 * (double)f4 + (double)(-0.2f * (float)n)) * 15.0), (n, f3) -> (float)(Math.cos(Math.PI * 2 * (double)f4 + (double)(-0.2f * (float)n)) * 5.0), (n, f) -> 0.0f, 0.03f, 0.005f);
        this.a(bufferBuilder, geoBone, b2);
    }

    void f(BufferBuilder bufferBuilder, GeoBone geoBone) {
        float f = ((f_)this.j).b(i.getRenderPartialTicks());
        if (f == 0.0f) {
            this.a(bufferBuilder, geoBone, G);
            return;
        }
        if (f == 1.0f) {
            this.a(bufferBuilder, geoBone, t);
            return;
        }
        ef.b.b b2 = G.a();
        b2.g = b6.a(da.G.g, 0.0f, f);
        b2.e = b6.a(da.G.e, 0.0f, f);
        this.a(bufferBuilder, geoBone, b2);
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, ef.b.b b2) {
        GlStateManager.pushMatrix();
        Tessellator.getInstance().draw();
        com.trolmastercard.sexmod.p.a(MATRIX_STACK, geoBone);
        GlStateManager.disableCull();
        this.bindTexture(e);
        ef.a(bufferBuilder, Tessellator.getInstance(), i, b2);
        this.bindTexture(Objects.requireNonNull(this.getEntityTexture((EntityLivingBase)this.j)));
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, f_ f_2, float f) {
        if (f_2.y() != fp.GIVE_COIN) {
            return;
        }
        n = bufferBuilder;
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        if (!this.p.contains(geoBone.getName())) {
            for (GeoCube geoCube : geoBone.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.pushMatrix();
                this.q = geoBone;
                this.a(bufferBuilder, geoCube, 1.0f, 1.0f, 1.0f, 1.0f, 0.0);
                GlStateManager.popMatrix();
                MATRIX_STACK.pop();
            }
        }
        Tessellator.getInstance().draw();
        GeoBone geoBone2 = (GeoBone)geoBone.childBones.get(0);
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
        GL11.glDisable((int)2896);
        float f3 = be.b((float)fp.GIVE_COIN.ticksPlaying[1] + f, 105.0f, 125.0f);
        float f4 = (f3 - 105.0f) / 20.0f;
        float f5 = b6.a(120.0f, 240.0f, f4);
        f7 f72 = b6.a(av.f, av.e, (double)f4);
        float f6 = OpenGlHelper.lastBrightnessX;
        float f9 = OpenGlHelper.lastBrightnessY;
        OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)f5, (float)f5);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone2);
        MATRIX_STACK.moveToPivot(geoBone2);
        MATRIX_STACK.rotate(geoBone2);
        MATRIX_STACK.scale(geoBone2);
        MATRIX_STACK.moveBackFromPivot(geoBone2);
        if (!this.p.contains(geoBone2.getName())) {
            for (GeoCube geoCube : geoBone2.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.pushMatrix();
                this.q = geoBone2;
                this.a(bufferBuilder, geoCube, f72.a, f72.c, f72.b, 1.0f, 0.0);
                GlStateManager.popMatrix();
                MATRIX_STACK.pop();
            }
        }
        MATRIX_STACK.pop();
        MATRIX_STACK.pop();
        Tessellator.getInstance().draw();
        GL11.glEnable((int)2896);
        OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)f6, (float)f9);
    }

    @Override
    protected Vec3d a(f_ f_2, float f, Vec3d vec3d) {
        if (f_2.y() == fp.RUN) {
            float f3;
            f_2.rotationYaw = f3 = f_2.I().floatValue();
            f_2.prevRenderYawOffset = f3;
            f_2.renderYawOffset = f3;
            f_2.prevRotationYawHead = f3;
            f_2.rotationYawHead = f3;
        }
        return vec3d;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}
