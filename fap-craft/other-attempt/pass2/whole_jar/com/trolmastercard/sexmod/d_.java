/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.vecmath.Matrix4f
 *  javax.vecmath.Tuple3f
 *  javax.vecmath.Tuple4f
 *  javax.vecmath.Vector3f
 *  javax.vecmath.Vector4f
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.ActiveRenderInfo
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.ItemRenderer
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityHanging
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.BlockRenderLayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.a;
import com.trolmastercard.sexmod.b;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.c3;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gx;
import com.trolmastercard.sexmod.p;
import com.trolmastercard.sexmod.y;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import javax.vecmath.Matrix4f;
import javax.vecmath.Tuple3f;
import javax.vecmath.Tuple4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import software.bernie.geckolib3.core.IAnimatableModel;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.geo.render.built.GeoQuad;
import software.bernie.geckolib3.geo.render.built.GeoVertex;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.GeoModelProvider;
import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;
import software.bernie.geckolib3.renderers.geo.RenderHurtColor;
import software.bernie.geckolib3.util.MatrixStack;
import software.bernie.shadowed.eliotlash.mclib.utils.Interpolations;

public abstract class d_<T extends em>
extends GeoEntityRenderer<T>
implements c3 {
    protected static final ResourceLocation e = new ResourceLocation("sexmod", "textures/line.png");
    static final float m = 1.5f;
    protected double c;
    protected T j;
    protected static Minecraft i;
    protected static HashMap<UUID, ResourceLocation> l;
    Color f = new Color(245, 199, 165);
    Color o = new Color(245, 157, 169);
    boolean h = false;
    protected HashSet<String> p = new HashSet();
    Integer k = null;
    Integer b = null;
    Integer d = null;
    float a = 0.0f;
    public static BufferBuilder n;
    Matrix4f g = null;
    protected GeoBone q = null;

    public d_(RenderManager renderManager, AnimatedGeoModel<T> animatedGeoModel, double d10) {
        super(renderManager, animatedGeoModel);
        this.c = d10;
        i = Minecraft.func_71410_x();
        this.field_76989_e = 0.2f;
    }

    protected ResourceLocation d(T t2) throws IOException {
        ResourceLocation resourceLocation;
        if (((em)t2).field_70170_p instanceof gj || ((em)t2).ae() == null) {
            resourceLocation = l.get(i.func_110432_I().func_148256_e().getId());
            if (resourceLocation == null) {
                return this.a(i.func_110432_I().func_148256_e().getId(), ((em)t2).field_70170_p);
            }
        } else {
            resourceLocation = l.get(((em)t2).ae());
            if (resourceLocation == null) {
                return this.a(((em)t2).ae(), ((em)t2).field_70170_p);
            }
        }
        return resourceLocation;
    }

    protected ResourceLocation a(UUID uUID, World world) throws IOException {
        BufferedImage bufferedImage;
        try {
            bufferedImage = y.a(uUID);
            Graphics graphics = bufferedImage.getGraphics();
            graphics.setColor(this.f);
            graphics.fillRect(0, 0, 4, 3);
            graphics.setColor(this.o);
            graphics.fillRect(4, 0, 3, 3);
        }
        catch (Exception exception) {
            if (!this.h) {
                this.h = true;
            }
            bufferedImage = ImageIO.read(i.func_110442_L().func_110536_a(new ResourceLocation("sexmod", "textures/player/steve.png")).func_110527_b());
        }
        l.put(uUID, this.field_76990_c.field_78724_e.func_110578_a("player" + uUID, new DynamicTexture(bufferedImage)));
        return l.get(uUID);
    }

    protected static float a(em em2, float f10) {
        return em2.Q() ? em2.I().floatValue() : b6.a(em2.field_70760_ar, em2.field_70761_aq, f10);
    }

    protected void d() {
    }

    protected void b() {
    }

    float a(World world, Vec3d vec3d, float f10, float f11) {
        RayTraceResult rayTraceResult = this.a(vec3d, vec3d.func_178787_e(ck.a(new Vec3d(0.0, 0.0, -4.0), f10, f11)), world);
        if (rayTraceResult == null) {
            return 4.0f;
        }
        Vec3d vec3d2 = rayTraceResult.field_72307_f;
        if (vec3d2 == null) {
            return 4.0f;
        }
        return (float)vec3d.func_72438_d(vec3d2);
    }

    boolean a(T t2, EntityPlayer entityPlayer) {
        if (t2 instanceof ei) {
            return true;
        }
        World world = ((em)t2).field_70170_p;
        Vec3d vec3d = t2.func_174791_d();
        float f10 = ((em)t2).field_70130_N * 1.5f;
        float f11 = ((em)t2).field_70131_O * 1.5f;
        Vec3d vec3d2 = entityPlayer.func_174791_d().func_72441_c(0.0, (double)entityPlayer.func_70047_e(), 0.0);
        int n2 = d_.i.field_71474_y.field_74320_O;
        if (n2 != 0) {
            return true;
        }
        if (n2 > 0) {
            float f12 = entityPlayer.field_70177_z;
            float f13 = entityPlayer.field_70125_A;
            if (n2 == 2) {
                f13 += 180.0f;
            }
            float f14 = 4.0f;
            Vec3d vec3d3 = vec3d2.func_72441_c((double)(MathHelper.func_76126_a((float)(f12 * ((float)Math.PI / 180))) * MathHelper.func_76134_b((float)(f13 * ((float)Math.PI / 180))) * f14), (double)(MathHelper.func_76126_a((float)(f13 * ((float)Math.PI / 180))) * f14), (double)(-MathHelper.func_76134_b((float)(f12 * ((float)Math.PI / 180))) * MathHelper.func_76134_b((float)(f13 * ((float)Math.PI / 180))) * f14));
            BlockPos blockPos = new BlockPos(vec3d3);
            boolean bl2 = world.func_175623_d(blockPos);
            if (!bl2) {
                vec3d2 = vec3d3;
            } else if (world.func_175623_d(blockPos.func_177982_a(0, 1, 0))) {
                vec3d2 = new Vec3d(vec3d3.field_72450_a, (double)(blockPos.func_177956_o() + 1), vec3d3.field_72449_c);
            }
        }
        Vec3d[] vec3dArray = new Vec3d[]{vec3d.func_72441_c((double)(-f10 / 2.0f), 0.0, (double)(-f10 / 2.0f)), vec3d.func_72441_c((double)(-f10 / 2.0f), 0.0, (double)(f10 / 2.0f)), vec3d.func_72441_c((double)(f10 / 2.0f), 0.0, (double)(-f10 / 2.0f)), vec3d.func_72441_c((double)(f10 / 2.0f), 0.0, (double)(f10 / 2.0f)), vec3d.func_72441_c((double)(-f10 / 2.0f), (double)f11, (double)(-f10 / 2.0f)), vec3d.func_72441_c((double)(-f10 / 2.0f), (double)f11, (double)(f10 / 2.0f)), vec3d.func_72441_c((double)(f10 / 2.0f), (double)f11, (double)(-f10 / 2.0f)), vec3d.func_72441_c((double)(f10 / 2.0f), (double)f11, (double)(f10 / 2.0f))};
        for (Vec3d vec3d3 : vec3dArray) {
            RayTraceResult rayTraceResult = this.a(vec3d2, vec3d3, world);
            if (rayTraceResult == null) {
                return true;
            }
            IBlockState iBlockState = world.func_180495_p(rayTraceResult.func_178782_a());
            if (iBlockState.func_185895_e()) {
                return true;
            }
            if (iBlockState.func_177230_c().func_180664_k() == BlockRenderLayer.SOLID) continue;
            return true;
        }
        return false;
    }

    HashSet<String> a(Boolean bl2, boolean bl3) {
        if (ClientProxy.IS_PRELOADING) {
            return new HashSet<String>();
        }
        HashSet<String> hashSet = bl2 != false ? com.trolmastercard.sexmod.a.b() : ((em)this.j).Y();
        HashSet<String> hashSet2 = new HashSet<String>();
        for (String string : hashSet) {
            br.b.b b10 = br.b(string);
            if (b10 == null || !b10.a() && bl3) continue;
            hashSet2.addAll(b10.h());
        }
        return hashSet2;
    }

    public void a(GeoModel geoModel, T t2, float f10, float f11, float f12, float f13, float f14) {
        if (d_.i.field_71439_g != null && !((em)t2).h() && ((em)t2).d() && !this.a(t2, (EntityPlayer)d_.i.field_71439_g)) {
            return;
        }
        GlStateManager.func_179091_B();
        this.a(t2, f10, f11, f12, f13, f14);
        this.renderLate(t2, f10, f11, f12, f13, f14);
        BufferBuilder bufferBuilder = Tessellator.func_178181_a().func_178180_c();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
        this.p.clear();
        this.p = this.a(((em)t2).h(), ((em)t2).ah() == 0);
        this.d();
        gx.a(((em)t2).b().getModelRendererList(), this.a(), this);
        gx.a(t2, f10);
        this.a(geoModel, bufferBuilder, t2, f11, f12, f13, f14, f10);
        this.renderAfter(t2, f10, f11, f12, f13, f14);
        GlStateManager.func_179101_C();
        GlStateManager.func_179089_o();
        GL20.glUseProgram((int)0);
    }

    protected void a(GeoModel geoModel, BufferBuilder bufferBuilder, T t2, float f10, float f11, float f12, float f13, float f14) {
        GeoBone geoBone = null;
        for (GeoBone geoBone2 : geoModel.topLevelBones) {
            if (geoBone2.getName().equals("steve")) {
                geoBone = geoBone2;
                continue;
            }
            this.renderRecursively(bufferBuilder, geoBone2, f10, f11, f12, f13);
        }
        Tessellator.func_178181_a().func_78381_a();
        this.b();
        if (geoBone != null) {
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
            try {
                Minecraft.func_71410_x().field_71446_o.func_110577_a(this.d(this.j));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            this.renderRecursively(bufferBuilder, geoBone, f10, f11, f12, ((em)this.j).v());
            Tessellator.func_178181_a().func_78381_a();
        }
    }

    String a(String string) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
        while ((string2 = bufferedReader.readLine()) != null) {
            stringBuilder.append(string2).append("//\n");
        }
        try {
            bufferedReader.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return stringBuilder.toString();
    }

    protected void a(double d10, double d11, double d12) {
        if (((em)this.j).h()) {
            return;
        }
        if (((em)this.j).y().hideNameTag) {
            return;
        }
        if (d_.i.func_175598_ae().field_78734_h == null) {
            return;
        }
        this.func_147906_a((Entity)this.j, ((em)this.j).ab(), d10, d11 + (double)((em)this.j).i(), d12, 300);
    }

    Vec3d a(EntityPlayer entityPlayer, float f10) {
        EntityLiving entityLiving = (EntityLiving)entityPlayer.func_184187_bx();
        EntityPlayerSP entityPlayerSP = d_.i.field_71439_g;
        Vec3d vec3d = entityLiving.func_70040_Z();
        Vec3d vec3d2 = b6.a(new Vec3d(entityPlayer.field_70142_S, entityPlayer.field_70137_T, entityPlayer.field_70136_U), entityPlayer.func_174791_d(), (double)f10);
        Vec3d vec3d3 = b6.a(new Vec3d(entityPlayerSP.field_70142_S, entityPlayerSP.field_70137_T, entityPlayerSP.field_70136_U), entityPlayerSP.func_174791_d(), (double)f10);
        vec3d3 = vec3d2.func_178788_d(vec3d3);
        ((em)this.j).field_70761_aq = entityLiving.field_70761_aq;
        return new Vec3d(vec3d3.field_72450_a + vec3d.field_72450_a * -0.5, vec3d3.field_72448_b + (double)0.15f, vec3d3.field_72449_c + vec3d.field_72449_c * -0.5);
    }

    protected Vec3d a(T t2, float f10, Vec3d vec3d) {
        return vec3d;
    }

    Vec3d a(T t2, float f10, double d10, double d11, double d12) {
        float f11;
        EntityPlayer entityPlayer;
        Vec3d vec3d = new Vec3d(d10, d11, d12);
        if (((em)t2).field_70170_p instanceof gj) {
            return vec3d;
        }
        if (((em)t2).t() && (!(t2 instanceof ei) || d_.i.field_71474_y.field_74320_O != 0)) {
            this.a(d10, d11, d12);
        }
        if ((entityPlayer = ((em)t2).z()) != null && entityPlayer.func_184218_aH() && entityPlayer.func_184187_bx() instanceof EntityHorse && ((EntityHorse)entityPlayer.func_184187_bx()).func_110257_ck()) {
            return this.a(entityPlayer, f10);
        }
        if (!((em)t2).Q()) {
            return vec3d;
        }
        if (!(t2 instanceof ei) || !((ei)t2).f() || d_.i.field_71474_y.field_74320_O == 0) {
            Vec3d vec3d2 = b6.a(new Vec3d(d_.i.field_71439_g.field_70142_S, d_.i.field_71439_g.field_70137_T, d_.i.field_71439_g.field_70136_U), d_.i.field_71439_g.func_174791_d(), (double)f10);
            vec3d = ((em)t2).o().func_178788_d(vec3d2);
        }
        ((em)t2).field_70177_z = f11 = ((em)t2).I().floatValue();
        ((em)t2).field_70760_ar = f11;
        ((em)t2).field_70761_aq = f11;
        ((em)t2).field_70758_at = f11;
        ((em)t2).field_70759_as = f11;
        return vec3d;
    }

    protected void b(T t2) {
    }

    public void a(T t2, double d10, double d11, double d12, float f10, float f11) {
        block11: {
            float f12;
            this.j = t2;
            Vec3d vec3d = this.a(t2, f11, d10, d11, d12);
            vec3d = this.a(t2, f11, vec3d);
            d10 = vec3d.field_72450_a;
            d11 = vec3d.field_72448_b;
            d12 = vec3d.field_72449_c;
            this.b(t2);
            if (t2.func_110167_bD()) {
                this.a((em)t2, d10, d11 + this.c, d12, f11);
            }
            GlStateManager.func_179094_E();
            GlStateManager.func_179137_b((double)d10, (double)d11, (double)d12);
            GL11.glDisable((int)2896);
            GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)0.5f);
            GlStateManager.func_179108_z();
            GlStateManager.func_179147_l();
            GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            boolean bl2 = t2.func_184187_bx() != null && t2.func_184187_bx().shouldRiderSit();
            EntityModelData entityModelData = new EntityModelData();
            entityModelData.isSitting = bl2;
            entityModelData.isChild = t2.func_70631_g_();
            float f13 = Interpolations.lerpYaw(((em)t2).field_70760_ar, ((em)t2).field_70761_aq, f11);
            float f14 = Interpolations.lerpYaw(((em)t2).field_70758_at, ((em)t2).field_70759_as, f11);
            float f15 = f14 - f13;
            if (bl2 && t2.func_184187_bx() instanceof EntityLivingBase) {
                EntityLivingBase entityLivingBase = (EntityLivingBase)t2.func_184187_bx();
                f13 = Interpolations.lerpYaw(entityLivingBase.field_70760_ar, entityLivingBase.field_70761_aq, f11);
                f15 = f14 - f13;
                f12 = MathHelper.func_76142_g((float)f15);
                if (f12 < -85.0f) {
                    f12 = -85.0f;
                }
                if (f12 >= 85.0f) {
                    f12 = 85.0f;
                }
                f13 = f14 - f12;
                if (f12 * f12 > 2500.0f) {
                    f13 += f12 * 0.2f;
                }
                f15 = f14 - f13;
            }
            float f16 = Interpolations.lerp(((em)t2).field_70127_C, ((em)t2).field_70125_A, f11);
            f12 = this.handleRotationFloat(t2, f11);
            this.b(t2, f12, f13, f11);
            float f17 = 0.0f;
            float f18 = 0.0f;
            if (!bl2 && t2.func_70089_S()) {
                f17 = Interpolations.lerp(((em)t2).field_184618_aE, ((em)t2).field_70721_aZ, f11);
                f18 = ((em)t2).field_184619_aG - ((em)t2).field_70721_aZ * (1.0f - f11);
                if (t2.func_70631_g_()) {
                    f18 *= 3.0f;
                }
                if (f17 > 1.0f) {
                    f17 = 1.0f;
                }
            }
            entityModelData.headPitch = -f16;
            entityModelData.netHeadYaw = -f15;
            AnimationEvent<T> animationEvent = new AnimationEvent<T>(t2, f18, f17, f11, !(f17 > -0.15f) || !(f17 < 0.15f), Collections.singletonList(entityModelData));
            GeoModelProvider geoModelProvider = super.getGeoModelProvider();
            ResourceLocation resourceLocation = geoModelProvider.getModelLocation(t2);
            GeoModel geoModel = geoModelProvider.getModel(resourceLocation);
            if (geoModelProvider instanceof IAnimatableModel) {
                ((IAnimatableModel)((Object)geoModelProvider)).setLivingAnimations(t2, t2.func_110124_au().hashCode(), animationEvent);
            }
            GlStateManager.func_179094_E();
            GlStateManager.func_179109_b((float)0.0f, (float)0.01f, (float)0.0f);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.getEntityTexture(t2));
            software.bernie.geckolib3.core.util.Color color = this.getRenderColor(t2, f11);
            boolean bl3 = this.setDoRenderBrightness(t2, f11);
            this.a(geoModel, t2, f11, (float)color.getRed() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getAlpha() / 255.0f);
            if (bl3) {
                RenderHurtColor.unset();
            }
            for (GeoLayerRenderer geoLayerRenderer : this.layerRenderers) {
                geoLayerRenderer.render(t2, f18, f17, f11, f18, f15, f16, color);
            }
            GL11.glEnable((int)2896);
            GlStateManager.func_179084_k();
            GlStateManager.func_179133_A();
            GlStateManager.func_179121_F();
            GlStateManager.func_179121_F();
            this.a(t2);
            com.trolmastercard.sexmod.b.a(t2, f11);
            f7 f72 = this.e(t2);
            if (f72 == null) break block11;
            this.a((em)t2, f11, f72);
        }
    }

    void a(T t2) {
        ArrayList<String> arrayList = new ArrayList<String>(cv.e);
        arrayList.addAll(((em)t2).p);
        for (String string : arrayList) {
            MatrixStack matrixStack = ((em)t2).a(string, !((em)t2).h());
            Matrix4f matrix4f = matrixStack.getModelMatrix();
            Vec3d vec3d = new Vec3d((double)(-matrix4f.m03), (double)matrix4f.m13, (double)(-matrix4f.m23));
            ((em)t2).a(string, vec3d);
        }
    }

    @Nullable
    protected f7 e(T t2) {
        return null;
    }

    public Entity c(em em2) {
        return em2;
    }

    void a(em em2, float f10, f7 f72) {
        EntityPlayerSP entityPlayerSP = d_.i.field_71439_g;
        f72 = new f7(f72.a / 255.0f, f72.c / 255.0f, f72.b / 255.0f);
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        GlStateManager.func_179094_E();
        GlStateManager.func_179137_b((double)0.0, (double)0.01, (double)0.0);
        Entity entity = this.c(em2);
        Vec3d vec3d = em2.Q() ? em2.o() : b6.a(new Vec3d(entity.field_70142_S, entity.field_70137_T, entity.field_70136_U), entity.func_174791_d(), (double)f10);
        Vec3d vec3d2 = b6.a(new Vec3d(entityPlayerSP.field_70142_S, entityPlayerSP.field_70137_T, entityPlayerSP.field_70136_U), entityPlayerSP.func_174791_d(), (double)f10);
        Vec3d vec3d3 = vec3d.func_178788_d(vec3d2);
        GlStateManager.func_179137_b((double)vec3d3.field_72450_a, (double)vec3d3.field_72448_b, (double)vec3d3.field_72449_c);
        i.func_110434_K().func_110577_a(e);
        float f11 = d_.a(em2, f10, 1.0f, 5.0f);
        this.b(tessellator, bufferBuilder, em2, f72, f11);
        GlStateManager.func_179121_F();
    }

    protected static float a(em em2, float f10, float f11, float f12) {
        EntityPlayerSP entityPlayerSP = d_.i.field_71439_g;
        Entity entity = ((d_)i.func_175598_ae().func_78713_a((Entity)em2)).c(em2);
        Vec3d vec3d = em2.Q() ? em2.o() : b6.a(new Vec3d(entity.field_70142_S, entity.field_70137_T, entity.field_70136_U), entity.func_174791_d(), (double)f10);
        Vec3d vec3d2 = b6.a(new Vec3d(entityPlayerSP.field_70142_S, entityPlayerSP.field_70137_T, entityPlayerSP.field_70136_U), entityPlayerSP.func_174791_d(), (double)f10);
        Vec3d vec3d3 = ActiveRenderInfo.getCameraPosition().func_178787_e(vec3d2);
        float f13 = (float)vec3d3.func_72438_d(vec3d);
        float f14 = Math.abs(f13) / 5.0f;
        return b6.a(f12, f11, be.b(f14, 0.0f, 1.0f));
    }

    protected void b(Tessellator tessellator, BufferBuilder bufferBuilder, em em2, f7 f72, float f10) {
    }

    protected static void a(BufferBuilder bufferBuilder, Tessellator tessellator, em em2, String string, String string2, float f10, float f11, float f12, float f13) {
        bufferBuilder.func_181668_a(1, DefaultVertexFormats.field_181709_i);
        GlStateManager.func_187441_d((float)f13);
        Vec3d vec3d = em2.b(string);
        Vec3d vec3d2 = em2.b(string2);
        bufferBuilder.func_181662_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c).func_187315_a(0.0, 0.0).func_181666_a(f10, f11, f12, 1.0f).func_181675_d();
        bufferBuilder.func_181662_b(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c).func_187315_a(0.0, 0.0).func_181666_a(f10, f11, f12, 1.0f).func_181675_d();
        tessellator.func_78381_a();
    }

    protected static void a(Tessellator tessellator, BufferBuilder bufferBuilder, em em2, f7 f72, float f10) {
        d_.a(bufferBuilder, tessellator, em2, "braStringMidStartR", "braStringMidMid1R", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidMid1R", "braStringMidMid2R", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidMid2R", "braStringMidMid3R", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidMid3R", "braStringMidEndR", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidEndR", "braStringBackR", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringBackR", "braStringRightEndR", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringRightEndR", "braStringRightStartR", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringRightR", "braStringRightL", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidStartL", "braStringMidMid1L", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidMid1L", "braStringMidMid2L", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidMid2L", "braStringMidMid3L", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidMid3L", "braStringMidEndL", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringMidEndL", "braStringBackL", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringBackL", "braStringLeftEndL", f72.a, f72.c, f72.b, f10);
        d_.a(bufferBuilder, tessellator, em2, "braStringLeftEndL", "braStringLeftStartL", f72.a, f72.c, f72.b, f10);
    }

    protected void b(T t2, float f10, float f11, float f12) {
        super.applyRotations(t2, f10, f11, f12);
        if (!(t2 instanceof ei)) {
            return;
        }
        UUID uUID = ((ei)t2).m();
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer = ((em)t2).field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        if (!entityPlayer.func_184613_cA()) {
            return;
        }
        float f13 = (float)entityPlayer.func_184599_cB() + f12;
        float f14 = MathHelper.func_76131_a((float)(f13 * f13 / 100.0f), (float)0.0f, (float)1.0f);
        GlStateManager.func_179114_b((float)(f14 * (-90.0f - entityPlayer.field_70125_A)), (float)1.0f, (float)0.0f, (float)0.0f);
        Vec3d vec3d = entityPlayer.func_70676_i(f12);
        double d10 = entityPlayer.field_70159_w * entityPlayer.field_70159_w + entityPlayer.field_70179_y * entityPlayer.field_70179_y;
        double d11 = vec3d.field_72450_a * vec3d.field_72450_a + vec3d.field_72449_c * vec3d.field_72449_c;
        if (d10 > 0.0 && d11 > 0.0) {
            double d12 = (entityPlayer.field_70159_w * vec3d.field_72450_a + entityPlayer.field_70179_y * vec3d.field_72449_c) / (Math.sqrt(d10) * Math.sqrt(d11));
            double d13 = entityPlayer.field_70159_w * vec3d.field_72449_c - entityPlayer.field_70179_y * vec3d.field_72450_a;
            GlStateManager.func_179114_b((float)((float)(Math.signum(d13) * Math.acos(d12)) * 180.0f / (float)Math.PI), (float)0.0f, (float)1.0f, (float)0.0f);
        }
    }

    protected void a(BufferBuilder bufferBuilder, String string, GeoBone geoBone) {
    }

    protected void a(em em2, double d10, double d11, double d12, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        int n2;
        Entity entity = em2.func_110166_bE();
        d11 -= (1.6 - (double)em2.field_70131_O) * 0.5;
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        double d13 = (double)b6.a(entity.field_70126_B, entity.field_70177_z, f10 * 0.5f) * 0.01745329238474369;
        double d14 = (double)b6.a(entity.field_70127_C, entity.field_70125_A, f10 * 0.5f) * 0.01745329238474369;
        double d15 = Math.cos(d13);
        double d16 = Math.sin(d13);
        double d17 = Math.sin(d14);
        if (entity instanceof EntityHanging) {
            d15 = 0.0;
            d16 = 0.0;
            d17 = -1.0;
        }
        double d18 = Math.cos(d14);
        double d19 = b6.b(entity.field_70169_q, entity.field_70165_t, (double)f10) - d15 * 0.7 - d16 * 0.5 * d18;
        double d20 = b6.b(entity.field_70167_r + (double)entity.func_70047_e() * 0.7, entity.field_70163_u + (double)entity.func_70047_e() * 0.7, (double)f10) - d17 * 0.5 - 0.25;
        double d21 = b6.b(entity.field_70166_s, entity.field_70161_v, (double)f10) - d16 * 0.7 + d15 * 0.5 * d18;
        double d22 = (double)b6.a(em2.field_70760_ar, em2.field_70761_aq, f10) * 0.01745329238474369 + 1.5707963267948966;
        d15 = Math.cos(d22) * (double)em2.field_70130_N * 0.4;
        d16 = Math.sin(d22) * (double)em2.field_70130_N * 0.4;
        double d23 = b6.b(em2.field_70169_q, em2.field_70165_t, (double)f10) + d15;
        double d24 = b6.b(em2.field_70167_r, em2.field_70163_u, (double)f10);
        double d25 = b6.b(em2.field_70166_s, em2.field_70161_v, (double)f10) + d16;
        d10 += d15;
        d12 += d16;
        double d26 = (float)(d19 - d23);
        double d27 = (float)(d20 - d24);
        double d28 = (float)(d21 - d25);
        GlStateManager.func_179090_x();
        GlStateManager.func_179140_f();
        GlStateManager.func_179129_p();
        bufferBuilder.func_181668_a(5, DefaultVertexFormats.field_181706_f);
        for (n2 = 0; n2 <= 24; ++n2) {
            f14 = 0.5f;
            f13 = 0.4f;
            f12 = 0.3f;
            if (n2 % 2 == 0) {
                f14 *= 0.7f;
                f13 *= 0.7f;
                f12 *= 0.7f;
            }
            f11 = (float)n2 / 24.0f;
            bufferBuilder.func_181662_b(d10 + d26 * (double)f11 + 0.0, d11 + d27 * (double)(f11 * f11 + f11) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f), d12 + d28 * (double)f11).func_181666_a(f14, f13, f12, 1.0f).func_181675_d();
            bufferBuilder.func_181662_b(d10 + d26 * (double)f11 + 0.025, d11 + d27 * (double)(f11 * f11 + f11) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f) + 0.025, d12 + d28 * (double)f11).func_181666_a(f14, f13, f12, 1.0f).func_181675_d();
        }
        tessellator.func_78381_a();
        bufferBuilder.func_181668_a(5, DefaultVertexFormats.field_181706_f);
        for (n2 = 0; n2 <= 24; ++n2) {
            f14 = 0.5f;
            f13 = 0.4f;
            f12 = 0.3f;
            if (n2 % 2 == 0) {
                f14 *= 0.7f;
                f13 *= 0.7f;
                f12 *= 0.7f;
            }
            f11 = (float)n2 / 24.0f;
            bufferBuilder.func_181662_b(d10 + d26 * (double)f11 + 0.0, d11 + d27 * (double)(f11 * f11 + f11) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f) + 0.025, d12 + d28 * (double)f11).func_181666_a(f14, f13, f12, 1.0f).func_181675_d();
            bufferBuilder.func_181662_b(d10 + d26 * (double)f11 + 0.025, d11 + d27 * (double)(f11 * f11 + f11) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f), d12 + d28 * (double)f11 + 0.025).func_181666_a(f14, f13, f12, 1.0f).func_181675_d();
        }
        tessellator.func_78381_a();
        GlStateManager.func_179145_e();
        GlStateManager.func_179098_w();
        GlStateManager.func_179089_o();
    }

    @Override
    public void renderRecursively(BufferBuilder bufferBuilder, GeoBone geoBone, float f10, float f11, float f12, float f13) {
        if (((em)this.j).field_70170_p instanceof gj) {
            return;
        }
        String string = geoBone.getName();
        if (string.equals("weapon") && this.j instanceof e2) {
            this.a(bufferBuilder, geoBone);
        }
        if (string.equals("itemRenderer") && ((em)this.j).y() == fp.PAYMENT) {
            this.b(bufferBuilder, geoBone);
        }
        if (string.equals("ballL") || string.equals("ballR") || string.equals("cock")) {
            f13 = 1.0f;
        }
        n = bufferBuilder;
        this.a(bufferBuilder, string, geoBone);
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
        if (!this.b(string)) {
            MATRIX_STACK.pop();
            return;
        }
        if (!geoBone.isHidden) {
            Vector4f vector4f = this.a(string, f10, f11, f12);
            f10 = vector4f.x;
            f11 = vector4f.y;
            f12 = vector4f.z;
            double d10 = vector4f.w;
            if (!this.p.contains(string)) {
                for (GeoCube object : geoBone.childCubes) {
                    MATRIX_STACK.push();
                    this.q = geoBone;
                    this.a(bufferBuilder, object, f10, f11, f12, f13, d10);
                    MATRIX_STACK.pop();
                }
            }
            for (GeoBone geoBone2 : geoBone.childBones) {
                if (d10 == 0.0) {
                    this.renderRecursively(bufferBuilder, geoBone2, f10, f11, f12, f13);
                    continue;
                }
                this.a(bufferBuilder, geoBone2, f10, f11, f12, f13, d10);
            }
        }
        try {
            MATRIX_STACK.pop();
        }
        catch (IllegalStateException illegalStateException) {
            // empty catch block
        }
    }

    protected Vector4f a(float f10, float f11, float f12) {
        return new Vector4f(f10, f11, f12, 0.0f);
    }

    boolean b(String string) {
        if (!string.startsWith("armor")) {
            return true;
        }
        return this.j instanceof e2;
    }

    protected Vector4f a(String string, float f10, float f11, float f12) {
        if (!string.startsWith("armor")) {
            return this.a(f10, f11, f12);
        }
        if (!(this.j instanceof e2)) {
            return this.a(f10, f11, f12);
        }
        if ((Integer)((em)this.j).m.func_187225_a(em.D) == 0) {
            return this.a(f10, f11, f12);
        }
        GeoModelProvider geoModelProvider = this.getGeoModelProvider();
        if (!(geoModelProvider instanceof cv)) {
            return this.a(f10, f11, f12);
        }
        cv cv2 = (cv)geoModelProvider;
        ItemStack itemStack = cv2.a((em)this.j, string);
        if (!(itemStack.func_77973_b() instanceof ItemArmor)) {
            return this.a(f10, f11, f12);
        }
        ItemArmor itemArmor = (ItemArmor)itemStack.func_77973_b();
        ItemArmor.ArmorMaterial armorMaterial = itemArmor.func_82812_d();
        float f13 = 0.0f;
        switch (armorMaterial) {
            case GOLD: {
                f13 = 1.0f;
                break;
            }
            case CHAIN: 
            case IRON: {
                f13 = 2.0f;
                break;
            }
            case LEATHER: {
                f13 = 4.0f;
                int n2 = itemArmor.func_82814_b(itemStack);
                float f14 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f15 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f16 = (float)(n2 & 0xFF) / 255.0f;
                f10 *= f14;
                f11 *= f15;
                f12 *= f16;
            }
        }
        return new Vector4f(f10, f11, f12, 72.0f * f13 / 4096.0f);
    }

    public void a(T t2, float f10, float f11, float f12, float f13, float f14) {
        this.g = (Matrix4f)MATRIX_STACK.getModelMatrix().clone();
    }

    public void a(BufferBuilder bufferBuilder, GeoBone geoBone, float f10, float f11, float f12, float f13, double d10) {
        if (((em)this.j).field_70170_p instanceof gj) {
            return;
        }
        String string = geoBone.getName();
        if (string.equals("weapon")) {
            this.a(bufferBuilder, geoBone);
        }
        if (string.equals("ballL") || string.equals("ballR") || string.equals("cock")) {
            f13 = 1.0f;
        }
        this.a(bufferBuilder, geoBone.getName(), geoBone);
        MATRIX_STACK.push();
        MATRIX_STACK.translate(geoBone);
        MATRIX_STACK.moveToPivot(geoBone);
        MATRIX_STACK.rotate(geoBone);
        MATRIX_STACK.scale(geoBone);
        MATRIX_STACK.moveBackFromPivot(geoBone);
        if (!geoBone.isHidden) {
            if (!this.p.contains(string)) {
                for (GeoCube object : geoBone.childCubes) {
                    MATRIX_STACK.push();
                    GlStateManager.func_179094_E();
                    this.q = geoBone;
                    this.a(bufferBuilder, object, f10, f11, f12, f13, d10);
                    GlStateManager.func_179121_F();
                    MATRIX_STACK.pop();
                }
            }
            for (GeoBone geoBone2 : geoBone.childBones) {
                this.a(bufferBuilder, geoBone2, f10, f11, f12, f13, d10);
            }
        }
        MATRIX_STACK.pop();
    }

    protected boolean c() {
        if (!((em)this.j).n()) {
            return true;
        }
        return d_.i.field_71474_y.field_74320_O != 0;
    }

    public void a(BufferBuilder bufferBuilder, GeoCube geoCube, float f10, float f11, float f12, float f13, double d10) {
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
            Vec3d vec3d = gx.a(this, this.q, new Vec3d((double)f10, (double)f11, (double)f12), vector3f);
            for (GeoVertex geoVertex : geoQuad.vertices) {
                Vector4f vector4f = new Vector4f(geoVertex.position.getX(), geoVertex.position.getY(), geoVertex.position.getZ(), 1.0f);
                MATRIX_STACK.getModelMatrix().transform((Tuple4f)vector4f);
                bufferBuilder.func_181662_b((double)vector4f.getX(), (double)vector4f.getY(), (double)vector4f.getZ()).func_187315_a((double)geoVertex.textureU + d10, (double)geoVertex.textureV).func_181666_a((float)vec3d.field_72450_a, (float)vec3d.field_72448_b, (float)vec3d.field_72449_c, f13).func_181663_c(vector3f.getX(), vector3f.getY(), vector3f.getZ()).func_181675_d();
            }
        }
    }

    protected ItemStack a() {
        switch ((String)((em)this.j).m.func_187225_a(em.h)) {
            case "doggy": {
                return new ItemStack(Items.field_151045_i, 2);
            }
            case "blowjob": {
                return new ItemStack(Items.field_151166_bC, 3);
            }
            case "strip": {
                return new ItemStack(Items.field_151043_k, 1);
            }
            case "boobjob": {
                return new ItemStack(Items.field_151079_bi, 2);
            }
            case "touch_boobs": {
                return new ItemStack(Items.field_151115_aP, 2, 1);
            }
            case "sex": {
                return new ItemStack(Items.field_151115_aP, 3, 0);
            }
        }
        return null;
    }

    protected void b(BufferBuilder bufferBuilder, GeoBone geoBone) {
        ItemStack itemStack = this.a();
        if (itemStack == null) {
            return;
        }
        ItemRenderer itemRenderer = Minecraft.func_71410_x().func_175597_ag();
        for (int i2 = 0; i2 < itemStack.func_190916_E(); ++i2) {
            GlStateManager.func_179094_E();
            Tessellator.func_178181_a().func_78381_a();
            com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, geoBone);
            GL11.glEnable((int)2896);
            GL11.glRotated((double)((double)geoBone.getRotationX() + 2.5), (double)0.0, (double)0.0, (double)1.0);
            GL11.glRotated((double)geoBone.getRotationY(), (double)0.0, (double)1.0, (double)0.0);
            GL11.glRotated((double)geoBone.getRotationZ(), (double)1.0, (double)0.0, (double)0.0);
            switch (i2) {
                case 1: {
                    GL11.glRotated((double)-15.0, (double)0.0, (double)0.0, (double)1.0);
                    GlStateManager.func_179137_b((double)0.0, (double)0.0, (double)-0.025);
                    break;
                }
                case 2: {
                    GL11.glRotated((double)15.0, (double)0.0, (double)0.0, (double)1.0);
                    GlStateManager.func_179137_b((double)0.0, (double)0.0, (double)0.025);
                }
            }
            GlStateManager.func_179152_a((float)((em)this.j).n, (float)((em)this.j).n, (float)((em)this.j).n);
            itemRenderer.func_178099_a(this.j, new ItemStack(itemStack.func_77973_b(), 1), ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
            this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
            bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
            GL11.glDisable((int)2896);
            GlStateManager.func_179121_F();
        }
    }

    protected ItemStack a(@Nullable ItemStack itemStack) {
        return itemStack;
    }

    protected void a(BufferBuilder bufferBuilder, GeoBone geoBone) {
        if (this.j == null) {
            return;
        }
        if (!(this.j instanceof e2)) {
            return;
        }
        EntityDataManager entityDataManager = this.j.func_184212_Q();
        e2 e22 = (e2)this.j;
        int n2 = (Integer)entityDataManager.func_187225_a(e2.M);
        if (e22.y() != fp.BOW) {
            this.a = 0.0f;
        }
        ItemStack itemStack = null;
        if (n2 == 1) {
            itemStack = (ItemStack)entityDataManager.func_187225_a(e2.L);
        } else if (n2 == 2) {
            itemStack = (ItemStack)entityDataManager.func_187225_a(e2.R);
        }
        itemStack = this.a(itemStack);
        if (itemStack == null) {
            return;
        }
        if (itemStack.func_77973_b().equals(Items.field_151031_f) && e22.y() == fp.BOW) {
            this.a += 0.015f;
            e22.d(Math.round(-this.a * 20.0f + (float)itemStack.func_77988_m()));
            e22.a(itemStack);
        }
        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(MATRIX_STACK, geoBone);
        GL11.glEnable((int)2896);
        if (itemStack.func_77973_b() instanceof ItemBow) {
            GL11.glRotatef((float)e22.K, (float)1.0f, (float)0.0f, (float)0.0f);
        } else if (e22.y() == fp.ATTACK && e22.S == 0) {
            GlStateManager.func_179137_b((double)e22.V.field_72450_a, (double)e22.V.field_72448_b, (double)e22.V.field_72449_c);
            GL11.glRotatef((float)e22.O, (float)1.0f, (float)0.0f, (float)0.0f);
        } else {
            GL11.glRotatef((float)e22.P, (float)1.0f, (float)0.0f, (float)0.0f);
        }
        Minecraft.func_71410_x().func_175597_ag().func_178099_a(this.j, itemStack, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        GL11.glDisable((int)2896);
        GlStateManager.func_179121_F();
    }

    RayTraceResult a(Vec3d vec3d, Vec3d vec3d2, World world) {
        int n2;
        int n3;
        if (Double.isNaN(vec3d.field_72450_a) || Double.isNaN(vec3d.field_72448_b) || Double.isNaN(vec3d.field_72449_c)) {
            return null;
        }
        if (Double.isNaN(vec3d2.field_72450_a) || Double.isNaN(vec3d2.field_72448_b) || Double.isNaN(vec3d2.field_72449_c)) {
            return null;
        }
        int n4 = MathHelper.func_76128_c((double)vec3d2.field_72450_a);
        int n5 = MathHelper.func_76128_c((double)vec3d2.field_72448_b);
        int n6 = MathHelper.func_76128_c((double)vec3d2.field_72449_c);
        int n7 = MathHelper.func_76128_c((double)vec3d.field_72450_a);
        BlockPos blockPos = new BlockPos(n7, n3 = MathHelper.func_76128_c((double)vec3d.field_72448_b), n2 = MathHelper.func_76128_c((double)vec3d.field_72449_c));
        IBlockState iBlockState = world.func_180495_p(blockPos);
        if (iBlockState.func_185890_d((IBlockAccess)world, blockPos) != Block.field_185506_k && iBlockState.func_177230_c().func_180664_k() == BlockRenderLayer.SOLID) {
            return iBlockState.func_185910_a(world, blockPos, vec3d, vec3d2);
        }
        int n8 = 200;
        while (n8-- >= 0) {
            IBlockState iBlockState2;
            EnumFacing enumFacing;
            if (Double.isNaN(vec3d.field_72450_a) || Double.isNaN(vec3d.field_72448_b) || Double.isNaN(vec3d.field_72449_c)) {
                return null;
            }
            if (n7 == n4 && n3 == n5 && n2 == n6) {
                return null;
            }
            boolean bl2 = true;
            boolean bl3 = true;
            boolean bl4 = true;
            double d10 = 999.0;
            double d11 = 999.0;
            double d12 = 999.0;
            if (n4 > n7) {
                d10 = (double)n7 + 1.0;
            } else if (n4 < n7) {
                d10 = (double)n7 + 0.0;
            } else {
                bl2 = false;
            }
            if (n5 > n3) {
                d11 = (double)n3 + 1.0;
            } else if (n5 < n3) {
                d11 = (double)n3 + 0.0;
            } else {
                bl3 = false;
            }
            if (n6 > n2) {
                d12 = (double)n2 + 1.0;
            } else if (n6 < n2) {
                d12 = (double)n2 + 0.0;
            } else {
                bl4 = false;
            }
            double d13 = 999.0;
            double d14 = 999.0;
            double d15 = 999.0;
            double d16 = vec3d2.field_72450_a - vec3d.field_72450_a;
            double d17 = vec3d2.field_72448_b - vec3d.field_72448_b;
            double d18 = vec3d2.field_72449_c - vec3d.field_72449_c;
            if (bl2) {
                d13 = (d10 - vec3d.field_72450_a) / d16;
            }
            if (bl3) {
                d14 = (d11 - vec3d.field_72448_b) / d17;
            }
            if (bl4) {
                d15 = (d12 - vec3d.field_72449_c) / d18;
            }
            if (d13 == -0.0) {
                d13 = -1.0E-4;
            }
            if (d14 == -0.0) {
                d14 = -1.0E-4;
            }
            if (d15 == -0.0) {
                d15 = -1.0E-4;
            }
            if (d13 < d14 && d13 < d15) {
                enumFacing = n4 > n7 ? EnumFacing.WEST : EnumFacing.EAST;
                vec3d = new Vec3d(d10, vec3d.field_72448_b + d17 * d13, vec3d.field_72449_c + d18 * d13);
            } else if (d14 < d15) {
                enumFacing = n5 > n3 ? EnumFacing.DOWN : EnumFacing.UP;
                vec3d = new Vec3d(vec3d.field_72450_a + d16 * d14, d11, vec3d.field_72449_c + d18 * d14);
            } else {
                enumFacing = n6 > n2 ? EnumFacing.NORTH : EnumFacing.SOUTH;
                vec3d = new Vec3d(vec3d.field_72450_a + d16 * d15, vec3d.field_72448_b + d17 * d15, d12);
            }
            if ((iBlockState2 = world.func_180495_p(blockPos = new BlockPos(n7 = MathHelper.func_76128_c((double)vec3d.field_72450_a) - (enumFacing == EnumFacing.EAST ? 1 : 0), n3 = MathHelper.func_76128_c((double)vec3d.field_72448_b) - (enumFacing == EnumFacing.UP ? 1 : 0), n2 = MathHelper.func_76128_c((double)vec3d.field_72449_c) - (enumFacing == EnumFacing.SOUTH ? 1 : 0)))).func_185904_a() != Material.field_151567_E && iBlockState2.func_185890_d((IBlockAccess)world, blockPos) == Block.field_185506_k || iBlockState2.func_177230_c().func_180664_k() != BlockRenderLayer.SOLID) continue;
            return iBlockState2.func_185910_a(world, blockPos, vec3d, vec3d2);
        }
        return null;
    }

    static {
        l = new HashMap();
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

