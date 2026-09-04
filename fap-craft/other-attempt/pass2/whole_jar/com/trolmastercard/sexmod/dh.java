/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.ItemRenderer
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.GL11
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.af;
import com.trolmastercard.sexmod.ak;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.ce;
import com.trolmastercard.sexmod.d_;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.f8;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gv;
import com.trolmastercard.sexmod.gx;
import com.trolmastercard.sexmod.p;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class dh
extends d_<f8> {
    static final gv C = new gv(115, 108, 188, 255);
    static final f7 D = new f7(0.05f, 0.04f, 0.0f);
    static final f7 v = new f7(0.0f, 0.065f, 0.0f);
    static final f7 z = new f7(0.0f, 0.03f, 0.03f);
    static final gv r = new gv(63, 59, 150, 255);
    static final gv x = new gv(79, 74, 188, 255);
    static final float A = 0.5f;
    static final float w = 0.5f;
    static final int s = 40;
    static final float y = 0.01f;
    static final float t = 0.03f;
    public static final HashSet<String> B = new HashSet<String>(){
        {
            this.add("boobs2");
            this.add("booty2");
            this.add("vagina2");
            this.add("fuckhole2");
        }
    };
    boolean u = false;

    public dh(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d10) {
        super(renderManager, animatedGeoModel, d10);
    }

    @Override
    public HashSet<String> a() {
        block0: {
            if (this.u) break block0;
            B.addAll(gx.a);
            this.u = true;
        }
        return B;
    }

    @Override
    public void a(f8 f82, double d10, double d11, double d12, float f10, float f11) {
        if (this.d(f82)) {
            return;
        }
        if (this.a(f82)) {
            return;
        }
        if (dh.c(f82, 0.5f)) {
            return;
        }
        if (this.c(f82)) {
            return;
        }
        super.a(f82, d10, d11, d12, f10, f11);
        dh.a(f82, f11);
    }

    boolean c(f8 f82) {
        f_ f_2 = f82.a(false);
        if (f_2 == null) {
            return false;
        }
        switch (f_2.y()) {
            case CONTROLLED_FLIGHT: 
            case BOOST: {
                return true;
            }
        }
        return false;
    }

    boolean a(f8 f82) {
        if (f82.y() != fp.RIDE_MOMMY_HEAD) {
            return false;
        }
        return f82.a(false) == null;
    }

    boolean d(f8 f82) {
        f_ f_2 = f82.a(false);
        if (f_2 == null) {
            return false;
        }
        if (f_2.field_70128_L) {
            f82.a((UUID)null);
            return false;
        }
        return f_2.b();
    }

    public void func_76979_b(Entity entity, double d10, double d11, double d12, float f10, float f11) {
        if (!(entity instanceof f8)) {
            super.func_76979_b(entity, d10, d11, d12, f10, f11);
            return;
        }
        f8 f82 = (f8)entity;
        if (this.d(f82)) {
            return;
        }
        if (f82.r()) {
            return;
        }
        super.func_76979_b(entity, d10, d11, d12, f10, f11);
    }

    static boolean c(em em2, float f10) {
        if (!(em2 instanceof f8)) {
            return false;
        }
        f_ f_2 = ((f8)em2).a(false);
        if (f_2 == null) {
            return false;
        }
        return f_2.bm < f10;
    }

    public static void a(em em2, float f10) {
        EntityPlayerSP entityPlayerSP = dh.i.field_71439_g;
        if (entityPlayerSP == null) {
            return;
        }
        if (dh.c(em2, 0.5f)) {
            return;
        }
        Tessellator tessellator = Tessellator.func_178181_a();
        BufferBuilder bufferBuilder = tessellator.func_178180_c();
        GlStateManager.func_179094_E();
        if (em2.h()) {
            GlStateManager.func_179137_b((double)0.0, (double)0.01, (double)0.0);
        } else {
            af.a(i, em2, f10);
            dh.b(em2, f10);
        }
        i.func_110434_K().func_110577_a(e);
        GlStateManager.func_179129_p();
        GlStateManager.func_179140_f();
        dh.a(em2, bufferBuilder, tessellator, dh.a(em2, f10));
        dh.a(em2, bufferBuilder, tessellator);
        GlStateManager.func_179121_F();
        GlStateManager.func_179089_o();
        GlStateManager.func_179145_e();
    }

    static void b(em em2, float f10) {
        if (!(em2 instanceof f8)) {
            return;
        }
        f8 f82 = (f8)em2;
        if (!f82.r()) {
            return;
        }
        if (ce.c(f82)) {
            return;
        }
        f_ f_2 = f82.a(false);
        if (f_2 == null) {
            return;
        }
        GlStateManager.func_179114_b((float)(-b6.b(em2.field_70760_ar, em2.field_70761_aq, (double)f10)), (float)0.0f, (float)1.0f, (float)0.0f);
    }

    static boolean a(em em2) {
        if (em2 instanceof f_) {
            em2 = ((f_)em2).a(false);
        }
        if (em2 == null) {
            return false;
        }
        return !fp.a(em2, fp.THREESOME_SLOW, fp.THREESOME_FAST, fp.THREESOME_CUM);
    }

    static void a(em em2, BufferBuilder bufferBuilder, Tessellator tessellator) {
        if (!dh.a(em2)) {
            return;
        }
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181706_f);
        for (int i2 = 0; i2 < 39; ++i2) {
            dh.a(em2, bufferBuilder, i2, i2 + 1);
        }
        dh.a(em2, bufferBuilder, 39, 0);
        tessellator.func_78381_a();
    }

    static void a(em em2, BufferBuilder bufferBuilder, int n2, int n3) {
        Vec3d vec3d = em2.b("skirt_" + n2 + "_0");
        Vec3d vec3d2 = em2.b("skirt_" + n2 + "_1");
        Vec3d vec3d3 = em2.b("skirt_" + n2 + "_2");
        Vec3d vec3d4 = em2.b("skirt_" + n3 + "_0");
        Vec3d vec3d5 = em2.b("skirt_" + n3 + "_1");
        Vec3d vec3d6 = em2.b("skirt_" + n3 + "_2");
        gv gv2 = n2 % 2 == 0 ? x : r;
        bufferBuilder.func_181662_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3d5.field_72450_a, vec3d5.field_72448_b, vec3d5.field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3d5.field_72450_a, vec3d5.field_72448_b, vec3d5.field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3d6.field_72450_a, vec3d6.field_72448_b, vec3d6.field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
        bufferBuilder.func_181662_b(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c).func_181669_b(gv2.a, gv2.d, gv2.c, gv2.b).func_181675_d();
    }

    @Override
    protected void a(BufferBuilder bufferBuilder, String string, GeoBone geoBone) {
        block2: {
            dh.a(this.j, string, geoBone, false);
            Entity entity = ((f8)this.j).b();
            if (entity == null) {
                return;
            }
            if ("weapon".equals(string) && ((f8)this.j).a(entity, i.func_184121_ak())) {
                this.a(bufferBuilder, geoBone, true);
            }
            if (!"offhand".equals(string) || ((f8)this.j).a(entity, i.func_184121_ak())) break block2;
            this.a(bufferBuilder, geoBone, false);
        }
    }

    void a(BufferBuilder bufferBuilder, GeoBone geoBone, boolean bl2) {
        ItemRenderer itemRenderer = Minecraft.func_71410_x().func_175597_ag();
        GlStateManager.func_179094_E();
        Tessellator.func_178181_a().func_78381_a();
        com.trolmastercard.sexmod.p.a(IGeoRenderer.MATRIX_STACK, geoBone);
        GL11.glEnable((int)2896);
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        if (bl2) {
            GlStateManager.func_179137_b((double)-0.01, (double)0.0, (double)0.0);
            GlStateManager.func_179114_b((float)120.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        } else {
            GlStateManager.func_179137_b((double)0.15, (double)0.0, (double)-0.05);
            GlStateManager.func_179114_b((float)-140.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GlStateManager.func_179139_a((double)0.7, (double)0.7, (double)0.7);
        ItemStack itemStack = new ItemStack((Item)Items.field_151031_f);
        float f10 = ((f8)this.j).b(i.func_184121_ak());
        if (f10 < 1.0f) {
            float f11 = (float)b6.e(f10);
            ((f8)this.j).d((int)(11.0f * (1.0f - f11) + 71980.0f));
            ((f8)this.j).a(itemStack);
            ((f8)this.j).func_184598_c(EnumHand.MAIN_HAND);
            ((f8)this.j).W();
        } else {
            ((f8)this.j).a(ItemStack.field_190927_a);
            ((f8)this.j).K();
        }
        itemRenderer.func_178099_a((EntityLivingBase)this.j, itemStack, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        this.func_110776_a(Objects.requireNonNull(this.getEntityTexture(this.j)));
        GL11.glDisable((int)2896);
        GlStateManager.func_179121_F();
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    }

    public static void a(em em2, String string, GeoBone geoBone, boolean bl2) {
        float f10;
        String string2;
        if (!string.contains("skirt_")) {
            return;
        }
        int n2 = dh.a(string);
        if (be.a((double)n2, 17.0, 35.0)) {
            if (i.func_147113_T()) {
                return;
            }
            String string3 = string2 = n2 < 26 ? "cheekL" : "cheekR";
            if (bl2) {
                string2 = string2 + "2";
            }
            if ((f10 = gc.d(em2.b().getBone(string2).getRotationX())) < 0.0f) {
                return;
            }
            geoBone.setPositionY(geoBone.getPositionY() + f10 * 0.01f);
        }
        if (be.a((double)n2, 1.0, 11.0)) {
            if (!string.endsWith("1")) {
                return;
            }
            String string4 = string2 = n2 < 6 ? "legR" : "legL";
            if (bl2) {
                string2 = string2 + "2";
            }
            if ((f10 = gc.d(em2.b().getBone(string2).getRotationX())) < 0.0f) {
                return;
            }
            geoBone.setRotationX(gc.c(f10));
            geoBone.setPositionY(gc.c(f10 * 0.03f));
        }
    }

    static int a(String string) {
        int n2 = string.indexOf(95);
        int n3 = string.indexOf(95, n2 + 1);
        if (n2 != -1 && n3 != -1) {
            String string2 = string.substring(n2 + 1, n3);
            try {
                return Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                return -1;
            }
        }
        return -1;
    }

    @Override
    protected void a(GeoModel geoModel, BufferBuilder bufferBuilder, f8 f82, float f10, float f11, float f12, float f13, float f14) {
        if (!ce.c(f82)) {
            super.a(geoModel, bufferBuilder, f82, f10, f11, f12, f13, f14);
            return;
        }
        GeoBone geoBone = geoModel.topLevelBones.get(0);
        GeoBone geoBone2 = null;
        GeoBone geoBone3 = null;
        for (GeoBone geoBone4 : geoBone.childBones) {
            switch (geoBone4.getName()) {
                case "steve": {
                    geoBone3 = geoBone4;
                    break;
                }
                case "body2": {
                    geoBone2 = geoBone4;
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
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        try {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.d(this.j));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.renderRecursively(bufferBuilder, geoBone3, f10, f11, f12, ((f8)this.j).v());
        Tessellator.func_178181_a().func_78381_a();
        MATRIX_STACK.pop();
    }

    static void a(em em2, BufferBuilder bufferBuilder, Tessellator tessellator, float f10) {
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
        Vec3d[][] vec3dArray = af.a(em2, f10, "clothBoobLconStart", "clothBoobLconEnd", D, v);
        Vec3d[][] vec3dArray2 = af.a(em2, f10, "clothBoobRconStart", "clothBoobRconEnd", D, v);
        Vec3d[][] vec3dArray3 = af.a(em2, f10, "clothBoobMidconStart", "clothBoobMidconEnd", z, z);
        af.a(bufferBuilder, vec3dArray, C);
        af.a(bufferBuilder, vec3dArray2, C);
        af.a(bufferBuilder, vec3dArray3, C);
        tessellator.func_78381_a();
    }

    public boolean a(HashSet hashSet, GeoBone geoBone) {
        while (geoBone.parent != null) {
            String string = geoBone.getName();
            if (string.contains("clothBoob")) {
                return true;
            }
            if (hashSet.contains(string)) {
                return false;
            }
            if (string.startsWith("armor")) {
                return false;
            }
            geoBone = geoBone.parent;
        }
        return true;
    }

    @Override
    protected Vec3d a(f8 f82, float f10, Vec3d vec3d) {
        f_ f_2;
        if (f82.y() == fp.RUN) {
            float f11;
            f82.field_70177_z = f11 = f82.I().floatValue();
            f82.field_70760_ar = f11;
            f82.field_70761_aq = f11;
            f82.field_70758_at = f11;
            f82.field_70759_as = f11;
            return vec3d;
        }
        if (dh.b(f82) && (f_2 = f82.a(false)) != null) {
            dh.a(f_2, f10, (EntityLivingBase)f82);
            return dh.b(f_2, f10);
        }
        return vec3d;
    }

    public static void a(f_ f_2, float f10, EntityLivingBase entityLivingBase) {
        boolean bl2 = f_2.Q();
        float f11 = bl2 ? f_2.I().floatValue() : f_2.field_70759_as;
        float f12 = bl2 ? f_2.I().floatValue() : f_2.field_70758_at;
        Float f13 = f_.a(f_2, f10);
        if (f13 != null) {
            f11 = f13.floatValue();
            f12 = f13.floatValue();
        }
        entityLivingBase.field_70177_z = f11;
        entityLivingBase.field_70760_ar = f12;
        entityLivingBase.field_70761_aq = f11;
        entityLivingBase.field_70758_at = f12;
        entityLivingBase.field_70759_as = f11;
    }

    public static boolean b(f8 f82) {
        return f82.r() && !ce.c(f82);
    }

    public static Vec3d b(f_ f_2, float f10) {
        return ak.a((Entity)f_2, (EntityPlayer)dh.i.field_71439_g, f10).func_178787_e(f_2.b("mangPos"));
    }

    public static Vec3d a(f_ f_2, float f10) {
        return ak.a((Entity)f_2, f10).func_178787_e(f_2.b("mangPos"));
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

