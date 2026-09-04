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
        UUID uUID = e32.ae();
        if (uUID == null) {
            uUID = e32.e();
        }
        if (e32.field_70170_p instanceof gj || uUID == null) {
            resourceLocation = (ResourceLocation)l.get(y.func_110432_I().func_148256_e().getId());
            if (resourceLocation == null) {
                return this.a(y.func_110432_I().func_148256_e().getId(), e32.field_70170_p);
            }
        } else {
            resourceLocation = (ResourceLocation)l.get(uUID);
            if (resourceLocation == null) {
                return this.a(uUID, e32.field_70170_p);
            }
        }
        return resourceLocation;
    }

    public static void a(em em2, float f) {
        y.func_175598_ae().func_188391_a((Entity)em2, 0.0, 0.0, 0.0, -420.69f, f, false);
    }

    public static void a(float f) {
        if (!(y.func_175606_aa() instanceof EntityPlayer)) {
            return;
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
        if (!(entity instanceof e3)) {
            super.func_76979_b(entity, d, d2, d3, f, f2);
            return;
        }
        e3 e32 = (e3)entity;
        if (e32.y() == fp.PICK_UP || e32.y() == fp.SHOULDER_IDLE) {
            return;
        }
        super.func_76979_b(entity, d, d2, d3, f, f2);
    }

    public static Vec3d a(World world, em em2, UUID uUID, double d, double d2, double d3) {
        if (world == null) {
            return new Vec3d(d, d2, d3);
        }
        if (uUID == null) {
            return new Vec3d(d, d2, d3);
        }
        if (em2 == null) {
            return new Vec3d(d, d2, d3);
        }
        EntityPlayer entityPlayer = world.func_152378_a(uUID);
        if (entityPlayer == null) {
            return new Vec3d(d, d2, d3);
        }
        Vec3d vec3d = entityPlayer.func_174791_d();
        Vec3d vec3d2 = dy.y.field_71439_g.func_174791_d();
        em2.field_70760_ar = entityPlayer.field_70758_at;
        em2.field_70761_aq = entityPlayer.field_70759_as;
        em2.b(fp.START_THROWING);
        return vec3d.func_178788_d(vec3d2);
    }

    @Override
    public void a(e3 e32, double d, double d2, double d3, float f, float f2) {
        block23: {
            Vec3d vec3d;
            this.j = e32;
            this.u = -420.69f == f && e32.y() == fp.SHOULDER_IDLE;
            this.F = -420.69f == f && e32.y() == fp.PICK_UP;
            this.z = e32.field_70170_p.func_175721_c(e32.func_180425_c(), true);
            this.v = f2;
            B = f;
            fp fp2 = e32.y();
            UUID uUID = e32.e();
            if (e32.h()) {
                vec3d = dy.a(e32.field_70170_p, e32, uUID, d, d2, d3);
                d = vec3d.field_72450_a;
                d2 = vec3d.field_72448_b;
                d3 = vec3d.field_72449_c;
            }
            if (fp2 == fp.THROWN || fp2 == fp.START_THROWING) {
                if (dy.y.field_71474_y.field_74320_O == 0 && f == -420.69f && !e32.h()) {
                    return;
                }
                if (!e32.h()) {
                    float f3;
                    e32.field_70760_ar = f3 = e32.I().floatValue();
                    e32.field_70761_aq = f3;
                }
            }
            if (dy.a((em)e32, fp2)) {
                if (dy.y.field_71439_g.getPersistentID().equals(uUID)) {
                    if (-420.69f != f) {
                        return;
                    }
                    e32.field_70761_aq = dy.y.field_71439_g.field_70177_z + 180.0f;
                    e32.field_70760_ar = dy.y.field_71439_g.field_70177_z + 180.0f;
                    vec3d = dy.y.field_71439_g.func_70040_Z();
                    GlStateManager.func_179094_E();
                    GlStateManager.func_179137_b((double)vec3d.field_72450_a, (double)(vec3d.field_72448_b + (double)dy.y.field_71439_g.func_70047_e()), (double)vec3d.field_72449_c);
                    Vec3d vec3d2 = e3.b(new Vec3d((double)(-Math.abs(dy.y.field_71439_g.field_70125_A)), 0.0, 0.0), dy.y.field_71439_g.field_70177_z);
                    GlStateManager.func_179114_b((float)dy.y.field_71439_g.field_70125_A, (float)((float)vec3d2.field_72450_a), (float)0.0f, (float)((float)vec3d2.field_72449_c));
                    d = 0.0;
                    d2 = 0.0;
                    d3 = 0.0;
                } else {
                    if (!e32.h() || uUID == null || dy.y.field_71439_g.getPersistentID().equals(uUID)) {
                        if (uUID != null && !dy.y.field_71439_g.getPersistentID().equals(uUID)) {
                            vec3d = e32.field_70170_p.func_152378_a(uUID);
                            if (vec3d != null) {
                                e32.field_70761_aq = vec3d.field_70177_z;
                                e32.field_70760_ar = vec3d.field_70177_z;
                            }
                        } else {
                            e32.field_70761_aq = dy.y.field_71439_g.field_70177_z;
                            e32.field_70760_ar = dy.y.field_71439_g.field_70177_z;
                        }
                    }
                    vec3d = dy.a((em)e32, e32.e(), f2);
                    d = vec3d.field_72450_a;
                    d2 = vec3d.field_72448_b;
                    d3 = vec3d.field_72449_c;
                }
            } else if (this.u) {
                dy.a(f2);
                vec3d = new Vec3d((double)b6.a(-0.1f, 0.2f, dy.y.field_71474_y.field_74334_X / 110.0f), 0.0, 0.0);
                vec3d = e3.b(vec3d, dy.y.field_71439_g.field_70177_z);
                d = vec3d.field_72450_a;
                d2 = vec3d.field_72448_b;
                d3 = vec3d.field_72449_c;
                e32.field_70761_aq = dy.y.field_71439_g.field_70177_z;
                e32.field_70760_ar = dy.y.field_71439_g.field_70126_B;
                if (dy.y.field_71439_g.func_70093_af()) {
                    d2 -= 0.075;
                }
            } else if (fp2 == fp.SHOULDER_IDLE) {
                if (uUID == null) {
                    return;
                }
                if (dy.y.field_71439_g.getPersistentID().equals(uUID) && dy.y.field_71474_y.field_74320_O == 0) {
                    return;
                }
                vec3d = e32.field_70170_p.func_152378_a(uUID);
                if (vec3d == null) {
                    return;
                }
                Vector4f vector4f = dy.a((EntityPlayer)vec3d, f2);
                d = vector4f.x;
                d2 = vector4f.y;
                d3 = vector4f.z;
                e32.field_70761_aq = vector4f.w;
                if (vec3d.func_70093_af()) {
                    d2 -= 0.32;
                }
            } else if (fp2 == fp.PICK_UP && uUID != null && (vec3d = e32.field_70170_p.func_152378_a(uUID)) != null) {
                e32.field_70760_ar = vec3d.field_70758_at;
                e32.field_70761_aq = vec3d.field_70759_as;
            }
            super.a(e32, d, d2, d3, f, f2);
            if (!dy.a((em)e32, fp2) || dy.y.field_71474_y.field_74320_O != 0 || !dy.y.field_71439_g.getPersistentID().equals(uUID)) break block23;
            GlStateManager.func_179121_F();
        }
    }

    public static boolean a(em em2, fp fp2) {
        if (fp2 == fp.START_THROWING && !em2.h()) {
            return false;
        }
        if (dy.y.field_71474_y.field_74320_O != 0 && (fp2 == fp.START_THROWING || fp2 == fp.PICK_UP)) {
            return false;
        }
        switch (fp2) {
            case PICK_UP: 
            case CATCH: 
            case CATCH_BJ: 
            case CATCH_BJ_IDLE: 
            case START_THROWING: {
                return true;
            }
        }
        return false;
    }

    public static Vec3d a(em em2, UUID uUID, float f) {
        if (uUID == null) {
            return Vec3d.field_186680_a;
        }
        EntityPlayer entityPlayer = em2.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return Vec3d.field_186680_a;
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
        String[] stringArray = e4.a(this.j);
        if (stringArray.length < 8) {
            return r;
        }
        if (string.contains("band")) {
            return w;
        }
        if (string.contains("eyeColor") || string.contains("eyeColor2")) {
            return dy.b(stringArray[8]);
        }
        if (string.contains("variant") || string.contains("boob")) {
            return dy.c(stringArray[7]);
        }
        if (string.contains("hair")) {
            return dy.d(stringArray[6]);
        }
        if (D.contains(string)) {
            return dy.c(stringArray[7]);
        }
        if (M.contains(string)) {
            return dy.d(stringArray[6]);
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

    @Override
    protected void a(BufferBuilder bufferBuilder, String string, GeoBone geoBone) {
        block22: {
            if (((e3)this.j).field_70170_p instanceof gj) {
                return;
            }
            String[] stringArray = e4.a(this.j);
            if (stringArray.length < 8) {
                return;
            }
            switch (string) {
                case "earL": {
                    dy.a(geoBone, stringArray[0], stringArray[1], stringArray[3]);
                    break;
                }
                case "earR": {
                    dy.a(geoBone, stringArray[0], stringArray[2], stringArray[4]);
                    break;
                }
                case "hair": {
                    dy.a(geoBone, stringArray[5]);
                    break;
                }
                case "body": {
                    geoBone.setPivotY(-0.15f);
                    dy.a(this.j, geoBone);
                    break;
                }
                case "LegR": {
                    dy.a(this.u, geoBone, 25.0f, 25.0f);
                    break;
                }
                case "boobR": {
                    dy.a(this.u, geoBone, 30.0f, 30.0f);
                    break;
                }
                case "boobR1": {
                    dy.a(this.u, geoBone, 10.0f, 15.0f);
                    break;
                }
                case "boobR2": {
                    dy.a(this.u, geoBone, 5.0f, 3.0f);
                }
            }
            if (!string.contains("crown")) break block22;
            dy.a(this.j, geoBone, stringArray[9]);
        }
    }

    public static void a(em em2, GeoBone geoBone, String string) {
        block1: {
            block2: {
                block0: {
                    if (!em2.h()) break block0;
                    geoBone.setHidden(true);
                    break block1;
                }
                if (!(em2 instanceof e3)) break block2;
                int n = Integer.parseInt(string);
                geoBone.setHidden(n == 0);
                break block1;
            }
            if (!(em2 instanceof eq)) break block1;
            geoBone.setHidden(((ItemStack)em2.func_184212_Q().func_187225_a(e2.X)).func_190926_b());
        }
    }

    public static void a(boolean bl, GeoBone geoBone, float f, float f2) {
        if (y.func_147113_T()) {
            return;
        }
        if (!bl) {
            return;
        }
        geoBone.setRotationX(geoBone.getRotationX() + gc.c(be.b(x, -f, f)));
        geoBone.setRotationZ(geoBone.getRotationZ() + gc.c(be.b(N, -f2, f2)));
    }

    public static void a(em em2, GeoBone geoBone) {
        if (B != -420.69f || em2.y() != fp.SHOULDER_IDLE) {
            return;
        }
        float f = -dy.y.func_175598_ae().field_78732_j;
        geoBone.setPivotY(8.0f);
        if (y.func_147113_T()) {
            return;
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
        if (n > n2) {
            arrayList.add(hashSet);
            return;
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
            if (!hashSet.contains(n4)) {
                hashSet.add(n4);
                continue;
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
        if (!this.u && !this.F) {
            return vec3i;
        }
        float f = be.b(this.z, 2.0f, 15.0f) / 15.0f;
        return new Vec3i((double)((float)vec3i.func_177958_n() * f), (double)((float)vec3i.func_177956_o() * f), (double)((float)vec3i.func_177952_p() * f));
    }

    @Override
    protected ItemStack a(@Nullable ItemStack itemStack) {
        fp fp2 = ((e3)this.j).y();
        if (fp2 == fp.RUN || fp2 == fp.CATCH) {
            return (ItemStack)((e3)this.j).func_184212_Q().func_187225_a(e3.a0);
        }
        return itemStack;
    }

    @Override
    public HashSet<String> a() {
        return new HashSet<String>(this){
            final /* synthetic */ dy this$0;
            {
                this.this$0 = dy2;
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
        if (((e3)this.j).y() == fp.CATCH) {
            return 0.5f;
        }
        return 1.0f;
    }

    @Override
    protected Vec3d a(ItemStack itemStack) {
        if (itemStack == null) {
            return Vec3d.field_186680_a;
        }
        if (itemStack.func_77973_b() instanceof ItemBlock || itemStack.func_77976_d() == 1) {
            return super.a(itemStack);
        }
        return new Vec3d(180.0, 0.0, 0.0);
    }

    @Override
    public void a(BufferBuilder bufferBuilder, GeoCube geoCube, GeoBone geoBone, float f, float f2, float f3, float f4, double d) {
        if (this.u && !C.contains(geoBone.getName())) {
            return;
        }
        if (this.p.contains(geoBone.getName())) {
            return;
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
