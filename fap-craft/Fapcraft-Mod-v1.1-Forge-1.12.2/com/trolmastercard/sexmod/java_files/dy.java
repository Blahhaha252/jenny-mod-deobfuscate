/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.vecmath.Vector4f
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoCube
 *  software.bernie.geckolib3.geo.render.built.GeoModel
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.by;
import com.trolmastercard.sexmod.d6;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.e3;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.eh;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.eq;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.g5;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dy
extends d6<e3> {
    static final Vec3i w = new Vec3i(255, 255, 255);
    static final float K = -420.69f;
    static final float A = 8.0f;
    static final float L = 3.0f;
    static final Vec3d G = new Vec3d(10.0, -20.0, -10.0);
    static final float J = 0.1f;
    static final HashSet<String> D = new HashSet<String>(Arrays.asList("meatTorso", "meatCheekR", "meatCheekL", "meatFootR", "meatFootL", "meatShinR", "meatShinL", "meatLegL", "meatLegR", "nippleR", "nippleL", "preggy", "shoeL", "shoeR", "frontAndInside", "Lside", "Rside", "cheekR", "cheekL", "fuckhole", "head", "nose", "neck", "armL", "lowerArmL", "armR", "lowerArmR", "torso", "LegL", "LegR", "shinL", "shinR"));
    static final HashSet<String> M = new HashSet<String>(Arrays.asList("lashR", "lashL", "closedR", "closedL", "browL", "browR", "closedL", "closedL"));
    static final HashSet<String> C = new HashSet<String>(Arrays.asList("meatLegR", "meatShinR", "meatFootR", "boobR", "boobR1", "boobR2"));
    static Minecraft y;
    float v = 0.0f;
    boolean u = false;
    boolean F = false;
    static float B;
    float z = 0.0f;
    static float H;
    static float t;
    static float I;
    static float E;
    static float N;
    static float x;

    public dy(RenderManager renderManager, AnimatedGeoModel animatedGeoModel, double d) {
        super(renderManager, animatedGeoModel, d);
        y = Minecraft.func_71410_x();
    }

    protected ResourceLocation a(e3 e32) throws IOException {
        ResourceLocation resourceLocation;
        block10: {
            UUID uUID;
            block9: {
                uUID = e32.ae();
                if (uUID == null) {
                    uUID = e32.e();
                }
                try {
                    if (!(e32.field_70170_p instanceof gj) && uUID != null) break block9;
                }
                catch (IOException iOException) {
                    throw dy.a(iOException);
                }
                resourceLocation = (ResourceLocation)l.get(y.func_110432_I().func_148256_e().getId());
                try {
                    if (resourceLocation == null) {
                        return this.a(y.func_110432_I().func_148256_e().getId(), e32.field_70170_p);
                    }
                    break block10;
                }
                catch (IOException iOException) {
                    throw dy.a(iOException);
                }
            }
            resourceLocation = (ResourceLocation)l.get(uUID);
            try {
                if (resourceLocation == null) {
                    return this.a(uUID, e32.field_70170_p);
                }
            }
            catch (IOException iOException) {
                throw dy.a(iOException);
            }
        }
        return resourceLocation;
    }

    public static void a(em em2, float f) {
        y.func_175598_ae().func_188391_a((Entity)em2, 0.0, 0.0, 0.0, -420.69f, f, false);
    }

    public static void a(float f) {
        try {
            if (!(y.func_175606_aa() instanceof EntityPlayer)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        EntityPlayer entityPlayer = (EntityPlayer)y.func_175606_aa();
        float f2 = entityPlayer.field_70140_Q - entityPlayer.field_70141_P;
        float f3 = -(entityPlayer.field_70140_Q + f2 * f);
        float f4 = entityPlayer.field_71107_bF + (entityPlayer.field_71109_bG - entityPlayer.field_71107_bF) * f;
        float f5 = MathHelper.func_76126_a((float)(f3 * (float)Math.PI)) * f4 * 0.5f;
        GlStateManager.func_179137_b((double)(Math.cos((double)dy.y.field_71439_g.field_70177_z * (Math.PI / 180)) * (double)f5), (double)Math.abs(MathHelper.func_76134_b((float)(f3 * (float)Math.PI)) * f4), (double)(Math.sin((double)dy.y.field_71439_g.field_70177_z * (Math.PI / 180)) * (double)f5));
    }

    @Override
    public void a(GeoModel geoModel, e3 e32, float f, float f2, float f3, float f4, float f5) {
        super.a(geoModel, e32, f, f2, f3, f4, e32.ar);
    }

    public void func_76979_b(Entity entity, double d, double d2, double d3, float f, float f2) {
        block7: {
            try {
                if (!(entity instanceof e3)) {
                    super.func_76979_b(entity, d, d2, d3, f, f2);
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
            e3 e32 = (e3)entity;
            try {
                try {
                    if (e32.y() != fp.PICK_UP && e32.y() != fp.SHOULDER_IDLE) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                return;
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
        }
        super.func_76979_b(entity, d, d2, d3, f, f2);
    }

    public static Vec3d a(World world, em em2, UUID uUID, double d, double d2, double d3) {
        try {
            if (world == null) {
                return new Vec3d(d, d2, d3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        try {
            if (uUID == null) {
                return new Vec3d(d, d2, d3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        try {
            if (em2 == null) {
                return new Vec3d(d, d2, d3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        EntityPlayer entityPlayer = world.func_152378_a(uUID);
        try {
            if (entityPlayer == null) {
                return new Vec3d(d, d2, d3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        Vec3d vec3d = entityPlayer.func_174791_d();
        Vec3d vec3d2 = dy.y.field_71439_g.func_174791_d();
        em2.field_70760_ar = entityPlayer.field_70758_at;
        em2.field_70761_aq = entityPlayer.field_70759_as;
        em2.b(fp.START_THROWING);
        return vec3d.func_178788_d(vec3d2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void a(e3 var1_1, double var2_2, double var4_3, double var6_4, float var8_5, float var9_6) {
        block78: {
            block77: {
                block74: {
                    block68: {
                        block72: {
                            block73: {
                                block69: {
                                    block70: {
                                        block66: {
                                            block67: {
                                                block65: {
                                                    block64: {
                                                        block63: {
                                                            block62: {
                                                                try {
                                                                    try {
                                                                        this.j = var1_1;
                                                                        v0 = this;
                                                                        if (-420.69f != var8_5 || var1_1.y() != fp.SHOULDER_IDLE) break block62;
                                                                    }
                                                                    catch (RuntimeException v1) {
                                                                        throw dy.a(v1);
                                                                    }
                                                                    v2 = true;
                                                                    break block63;
                                                                }
                                                                catch (RuntimeException v3) {
                                                                    throw dy.a(v3);
                                                                }
                                                            }
                                                            v2 = false;
                                                        }
                                                        try {
                                                            try {
                                                                v0.u = v2;
                                                                v4 = this;
                                                                if (-420.69f != var8_5 || var1_1.y() != fp.PICK_UP) break block64;
                                                            }
                                                            catch (RuntimeException v5) {
                                                                throw dy.a(v5);
                                                            }
                                                            v6 = true;
                                                            break block65;
                                                        }
                                                        catch (RuntimeException v7) {
                                                            throw dy.a(v7);
                                                        }
                                                    }
                                                    v6 = false;
                                                }
                                                v4.F = v6;
                                                this.z = var1_1.field_70170_p.func_175721_c(var1_1.func_180425_c(), true);
                                                this.v = var9_6;
                                                dy.B = var8_5;
                                                var10_7 = var1_1.y();
                                                var11_8 = var1_1.e();
                                                if (var1_1.h()) {
                                                    var12_9 = dy.a(var1_1.field_70170_p, var1_1, var11_8, var2_2, var4_3, var6_4);
                                                    var2_2 = var12_9.field_72450_a;
                                                    var4_3 = var12_9.field_72448_b;
                                                    var6_4 = var12_9.field_72449_c;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var10_7 != fp.THROWN && var10_7 != fp.START_THROWING) break block66;
                                                                }
                                                                catch (RuntimeException v8) {
                                                                    throw dy.a(v8);
                                                                }
                                                                if (dy.y.field_71474_y.field_74320_O != 0) break block67;
                                                            }
                                                            catch (RuntimeException v9) {
                                                                throw dy.a(v9);
                                                            }
                                                            if (var8_5 != -420.69f) break block67;
                                                        }
                                                        catch (RuntimeException v10) {
                                                            throw dy.a(v10);
                                                        }
                                                        if (var1_1.h()) break block67;
                                                    }
                                                    catch (RuntimeException v11) {
                                                        throw dy.a(v11);
                                                    }
                                                    return;
                                                }
                                                catch (RuntimeException v12) {
                                                    throw dy.a(v12);
                                                }
                                            }
                                            if (!var1_1.h()) {
                                                var1_1.field_70760_ar = var12_10 = var1_1.I().floatValue();
                                                var1_1.field_70761_aq = var12_10;
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (!dy.a((em)var1_1, var10_7)) break block68;
                                                    if (!dy.y.field_71439_g.getPersistentID().equals(var11_8)) break block69;
                                                }
                                                catch (RuntimeException v13) {
                                                    throw dy.a(v13);
                                                }
                                                if (-420.69f == var8_5) break block70;
                                            }
                                            catch (RuntimeException v14) {
                                                throw dy.a(v14);
                                            }
                                            return;
                                        }
                                        catch (RuntimeException v15) {
                                            throw dy.a(v15);
                                        }
                                    }
                                    var1_1.field_70761_aq = dy.y.field_71439_g.field_70177_z + 180.0f;
                                    var1_1.field_70760_ar = dy.y.field_71439_g.field_70177_z + 180.0f;
                                    var12_11 = dy.y.field_71439_g.func_70040_Z();
                                    GlStateManager.func_179094_E();
                                    GlStateManager.func_179137_b((double)var12_11.field_72450_a, (double)(var12_11.field_72448_b + (double)dy.y.field_71439_g.func_70047_e()), (double)var12_11.field_72449_c);
                                    var13_17 = e3.b(new Vec3d((double)(-Math.abs(dy.y.field_71439_g.field_70125_A)), 0.0, 0.0), dy.y.field_71439_g.field_70177_z);
                                    GlStateManager.func_179114_b((float)dy.y.field_71439_g.field_70125_A, (float)((float)var13_17.field_72450_a), (float)0.0f, (float)((float)var13_17.field_72449_c));
                                    var2_2 = 0.0;
                                    var4_3 = 0.0;
                                    var6_4 = 0.0;
                                    break block77;
                                }
                                try {
                                    try {
                                        block71: {
                                            try {
                                                try {
                                                    if (!var1_1.h() || var11_8 == null) break block71;
                                                }
                                                catch (RuntimeException v16) {
                                                    throw dy.a(v16);
                                                }
                                                if (!dy.y.field_71439_g.getPersistentID().equals(var11_8)) break block72;
                                            }
                                            catch (RuntimeException v17) {
                                                throw dy.a(v17);
                                            }
                                        }
                                        if (var11_8 == null) break block73;
                                    }
                                    catch (RuntimeException v18) {
                                        throw dy.a(v18);
                                    }
                                    if (dy.y.field_71439_g.getPersistentID().equals(var11_8)) break block73;
                                }
                                catch (RuntimeException v19) {
                                    throw dy.a(v19);
                                }
                                var12_12 = var1_1.field_70170_p.func_152378_a(var11_8);
                                try {
                                    if (var12_12 == null) ** GOTO lbl131
                                    var1_1.field_70761_aq = var12_12.field_70177_z;
                                    var1_1.field_70760_ar = var12_12.field_70177_z;
                                }
                                catch (RuntimeException v20) {
                                    throw dy.a(v20);
                                }
                            }
                            var1_1.field_70761_aq = dy.y.field_71439_g.field_70177_z;
                            var1_1.field_70760_ar = dy.y.field_71439_g.field_70177_z;
                        }
                        var12_13 = dy.a((em)var1_1, var1_1.e(), var9_6);
                        var2_2 = var12_13.field_72450_a;
                        var4_3 = var12_13.field_72448_b;
                        var6_4 = var12_13.field_72449_c;
                        break block77;
                    }
                    if (this.u) {
                        dy.a(var9_6);
                        var12_14 = new Vec3d((double)b6.a(-0.1f, 0.2f, dy.y.field_71474_y.field_74334_X / 110.0f), 0.0, 0.0);
                        var12_14 = e3.b(var12_14, dy.y.field_71439_g.field_70177_z);
                        var2_2 = var12_14.field_72450_a;
                        var4_3 = var12_14.field_72448_b;
                        var6_4 = var12_14.field_72449_c;
                        var1_1.field_70761_aq = dy.y.field_71439_g.field_70177_z;
                        var1_1.field_70760_ar = dy.y.field_71439_g.field_70126_B;
                        if (dy.y.field_71439_g.func_70093_af()) {
                            var4_3 -= 0.075;
                        }
                    } else {
                        block76: {
                            block75: {
                                try {
                                    try {
                                        if (var10_7 != fp.SHOULDER_IDLE) break block74;
                                        if (var11_8 != null) break block75;
                                    }
                                    catch (RuntimeException v21) {
                                        throw dy.a(v21);
                                    }
                                    return;
                                }
                                catch (RuntimeException v22) {
                                    throw dy.a(v22);
                                }
                            }
                            try {
                                try {
                                    if (!dy.y.field_71439_g.getPersistentID().equals(var11_8) || dy.y.field_71474_y.field_74320_O != 0) break block76;
                                }
                                catch (RuntimeException v23) {
                                    throw dy.a(v23);
                                }
                                return;
                            }
                            catch (RuntimeException v24) {
                                throw dy.a(v24);
                            }
                        }
                        var12_15 = var1_1.field_70170_p.func_152378_a(var11_8);
                        try {
                            if (var12_15 == null) {
                                return;
                            }
                        }
                        catch (RuntimeException v25) {
                            throw dy.a(v25);
                        }
                        var13_18 = dy.a(var12_15, var9_6);
                        var2_2 = var13_18.x;
                        var4_3 = var13_18.y;
                        var6_4 = var13_18.z;
                        var1_1.field_70761_aq = var13_18.w;
                        if (var12_15.func_70093_af()) {
                            var4_3 -= 0.32;
                        }
                    }
                    break block77;
                }
                try {
                    if (var10_7 != fp.PICK_UP || var11_8 == null) break block77;
                }
                catch (RuntimeException v26) {
                    throw dy.a(v26);
                }
                var12_16 = var1_1.field_70170_p.func_152378_a(var11_8);
                try {
                    if (var12_16 != null) {
                        var1_1.field_70760_ar = var12_16.field_70758_at;
                        var1_1.field_70761_aq = var12_16.field_70759_as;
                    }
                }
                catch (RuntimeException v27) {
                    throw dy.a(v27);
                }
            }
            try {
                try {
                    try {
                        super.a(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6);
                        if (!dy.a((em)var1_1, var10_7) || dy.y.field_71474_y.field_74320_O != 0) break block78;
                    }
                    catch (RuntimeException v28) {
                        throw dy.a(v28);
                    }
                    if (!dy.y.field_71439_g.getPersistentID().equals(var11_8)) break block78;
                }
                catch (RuntimeException v29) {
                    throw dy.a(v29);
                }
                GlStateManager.func_179121_F();
            }
            catch (RuntimeException v30) {
                throw dy.a(v30);
            }
        }
    }

    public static boolean a(em em2, fp fp2) {
        block16: {
            block15: {
                try {
                    try {
                        if (fp2 != fp.START_THROWING || em2.h()) break block15;
                    }
                    catch (RuntimeException runtimeException) {
                        throw dy.a(runtimeException);
                    }
                    return false;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
            }
            try {
                block17: {
                    try {
                        try {
                            if (dy.y.field_71474_y.field_74320_O == 0) break block16;
                            if (fp2 == fp.START_THROWING) break block17;
                        }
                        catch (RuntimeException runtimeException) {
                            throw dy.a(runtimeException);
                        }
                        if (fp2 != fp.PICK_UP) break block16;
                    }
                    catch (RuntimeException runtimeException) {
                        throw dy.a(runtimeException);
                    }
                }
                return false;
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
        }
        try {
            switch (fp2) {
                case PICK_UP: 
                case CATCH: 
                case CATCH_BJ: 
                case CATCH_BJ_IDLE: 
                case START_THROWING: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
    }

    public static Vec3d a(em em2, UUID uUID, float f) {
        try {
            if (uUID == null) {
                return Vec3d.field_186680_a;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        EntityPlayer entityPlayer = em2.field_70170_p.func_152378_a(uUID);
        try {
            if (entityPlayer == null) {
                return Vec3d.field_186680_a;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        Vec3d vec3d = b6.a(new Vec3d(entityPlayer.field_70169_q, entityPlayer.field_70167_r, entityPlayer.field_70166_s), entityPlayer.func_174791_d(), (double)f);
        Vec3d vec3d2 = b6.a(new Vec3d(dy.y.field_71439_g.field_70169_q, dy.y.field_71439_g.field_70167_r, dy.y.field_71439_g.field_70166_s), dy.y.field_71439_g.func_174791_d(), (double)f);
        return vec3d.func_178788_d(vec3d2);
    }

    public static Vector4f a(EntityPlayer entityPlayer, float f) {
        EntityPlayerSP entityPlayerSP = dy.y.field_71439_g;
        float f2 = b6.a(entityPlayer.field_70760_ar, entityPlayer.field_70761_aq, f);
        Vec3d vec3d = b6.a(new Vec3d(entityPlayer.field_70142_S, entityPlayer.field_70137_T, entityPlayer.field_70136_U), entityPlayer.func_174791_d(), (double)f);
        Vec3d vec3d2 = b6.a(new Vec3d(entityPlayerSP.field_70142_S, entityPlayerSP.field_70137_T, entityPlayerSP.field_70136_U), entityPlayerSP.func_174791_d(), (double)f);
        Vec3d vec3d3 = vec3d.func_178788_d(vec3d2);
        return new Vector4f((float)vec3d3.field_72450_a, (float)vec3d3.field_72448_b, (float)vec3d3.field_72449_c, f2);
    }

    @Override
    protected Vec3i a(String string) {
        String[] stringArray;
        block24: {
            block23: {
                stringArray = e4.a(this.j);
                try {
                    if (stringArray.length < 8) {
                        return r;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                try {
                    if (string.contains("band")) {
                        return w;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                try {
                    try {
                        if (!string.contains("eyeColor") && !string.contains("eyeColor2")) break block23;
                    }
                    catch (RuntimeException runtimeException) {
                        throw dy.a(runtimeException);
                    }
                    return dy.b(stringArray[8]);
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
            }
            try {
                try {
                    if (!string.contains("variant") && !string.contains("boob")) break block24;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                return dy.c(stringArray[7]);
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
        }
        try {
            if (string.contains("hair")) {
                return dy.d(stringArray[6]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        try {
            if (D.contains(string)) {
                return dy.c(stringArray[7]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        try {
            if (M.contains(string)) {
                return dy.d(stringArray[6]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        return r;
    }

    public static Vec3i b(String string) {
        return eh.values()[Integer.parseInt(string)].a();
    }

    public static Vec3i c(String string) {
        return by.values()[Integer.parseInt(string)].a();
    }

    public static Vec3i d(String string) {
        return g5.values()[Integer.parseInt(string)].a();
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(BufferBuilder var1_1, String var2_2, GeoBone var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void a(em em2, GeoBone geoBone, String string) {
        block10: {
            block9: {
                try {
                    if (!em2.h()) break block9;
                    geoBone.setHidden(true);
                    break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
            }
            if (em2 instanceof e3) {
                boolean bl;
                GeoBone geoBone2;
                int n = Integer.parseInt(string);
                try {
                    geoBone2 = geoBone;
                    bl = n == 0;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                geoBone2.setHidden(bl);
            } else {
                try {
                    if (em2 instanceof eq) {
                        geoBone.setHidden(((ItemStack)em2.func_184212_Q().func_187225_a(e2.X)).func_190926_b());
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
            }
        }
    }

    public static void a(boolean bl, GeoBone geoBone, float f, float f2) {
        try {
            if (y.func_147113_T()) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        try {
            if (!bl) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        geoBone.setRotationX(geoBone.getRotationX() + gc.c(be.b(x, -f, f)));
        geoBone.setRotationZ(geoBone.getRotationZ() + gc.c(be.b(N, -f2, f2)));
    }

    public static void a(em em2, GeoBone geoBone) {
        block7: {
            try {
                try {
                    if (B == -420.69f && em2.y() == fp.SHOULDER_IDLE) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                return;
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
        }
        float f = -dy.y.func_175598_ae().field_78732_j;
        try {
            geoBone.setPivotY(8.0f);
            if (y.func_147113_T()) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        geoBone.setRotationX(geoBone.getRotationX() + gc.c(f));
    }

    public static void a(GeoBone geoBone, String string) {
        int n = Integer.parseInt(string);
        dy.a(geoBone, n);
    }

    static HashSet<Integer> b(int n, String string) {
        int n2;
        int n3 = n - 1;
        ArrayList<HashSet<Integer>> arrayList = dy.a(n3);
        for (n2 = Integer.parseInt(string); n2 >= arrayList.size(); n2 -= arrayList.size()) {
        }
        return arrayList.get(n2);
    }

    static ArrayList<HashSet<Integer>> a(int n) {
        ArrayList<HashSet<Integer>> arrayList = new ArrayList<HashSet<Integer>>();
        dy.a(0, new HashSet<Integer>(), n, arrayList);
        return arrayList;
    }

    static void a(int n, HashSet<Integer> hashSet, int n2, ArrayList<HashSet<Integer>> arrayList) {
        try {
            if (n > n2) {
                arrayList.add(hashSet);
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        HashSet<Integer> hashSet2 = new HashSet<Integer>(hashSet);
        dy.a(n + 1, hashSet, n2, arrayList);
        hashSet2.add(n);
        dy.a(n + 1, hashSet2, n2, arrayList);
    }

    static HashSet<Integer> a(int n, String string) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int n2 = Integer.parseInt(string);
        n2 = (int)(0.01f * (float)n2 * (float)n2);
        int n3 = Math.round((float)n2 / 100.0f * (float)n);
        Random random = new Random(n2);
        for (int i = 0; i < n3; ++i) {
            int n4 = random.nextInt(n);
            try {
                if (!hashSet.contains(n4)) {
                    hashSet.add(n4);
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
            --i;
        }
        return hashSet;
    }

    static void a(GeoBone geoBone2, String string, String string2, String string3) {
        GeoBone geoBone3 = dy.a(geoBone2, Integer.parseInt(string));
        GeoBone geoBone4 = dy.a(geoBone3, Integer.parseInt(string2));
        List list = geoBone4.childBones;
        int n2 = list.size();
        HashSet<Integer> hashSet = dy.b(n2, string3);
        geoBone4.childBones.forEach(geoBone -> geoBone.setHidden(true));
        hashSet.forEach(n -> dy.b(geoBone4, n));
    }

    @Override
    protected Vec3i a(Vec3i vec3i) {
        block4: {
            try {
                try {
                    if (this.u || this.F) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                return vec3i;
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
        }
        float f = be.b(this.z, 2.0f, 15.0f) / 15.0f;
        return new Vec3i((double)((float)vec3i.func_177958_n() * f), (double)((float)vec3i.func_177956_o() * f), (double)((float)vec3i.func_177952_p() * f));
    }

    @Override
    protected ItemStack a(@Nullable ItemStack itemStack) {
        block4: {
            fp fp2 = ((e3)this.j).y();
            try {
                try {
                    if (fp2 != fp.RUN && fp2 != fp.CATCH) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                return (ItemStack)((e3)this.j).func_184212_Q().func_187225_a(e3.a0);
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
        }
        return itemStack;
    }

    @Override
    public HashSet<String> a() {
        return new HashSet<String>(){
            {
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
    protected float a() {
        try {
            if (((e3)this.j).y() == fp.CATCH) {
                return 0.5f;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        return 1.0f;
    }

    @Override
    protected Vec3d a(ItemStack itemStack) {
        block7: {
            try {
                if (itemStack == null) {
                    return Vec3d.field_186680_a;
                }
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
            try {
                try {
                    if (!(itemStack.func_77973_b() instanceof ItemBlock) && itemStack.func_77976_d() != 1) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                return super.a(itemStack);
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
        }
        return new Vec3d(180.0, 0.0, 0.0);
    }

    @Override
    public void a(BufferBuilder bufferBuilder, GeoCube geoCube, GeoBone geoBone, float f, float f2, float f3, float f4, double d) {
        block7: {
            try {
                try {
                    if (!this.u || C.contains(geoBone.getName())) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw dy.a(runtimeException);
                }
                return;
            }
            catch (RuntimeException runtimeException) {
                throw dy.a(runtimeException);
            }
        }
        try {
            if (this.p.contains(geoBone.getName())) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw dy.a(runtimeException);
        }
        this.q = geoBone;
        super.a(bufferBuilder, geoCube, geoBone, f, f2, f3, f4, d);
    }

    static {
        B = 0.0f;
        H = 0.0f;
        t = 0.0f;
        I = 0.0f;
        E = 0.0f;
        N = 0.0f;
        x = 0.0f;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}
