/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityWitherSkeleton
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.network.Packet
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.network.play.server.SPacketEntity$S16PacketEntityLook
 *  net.minecraft.network.play.server.SPacketEntityVelocity
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a1;
import com.trolmastercard.sexmod.ao;
import com.trolmastercard.sexmod.b2;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.bv;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.c4;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.cs;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.g1;
import com.trolmastercard.sexmod.g8;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.h_;
import com.trolmastercard.sexmod.r;
import com.trolmastercard.sexmod.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketEntity;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public enum h8 {
    CHANGE_POSITION(f_2 -> {
        World world = f_2.field_70170_p;
        BlockPos blockPos = f_2.func_180425_c();
        BlockPos blockPos2 = f_2.M().func_180425_c();
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        HashMap<BlockPos, Integer> hashMap = new HashMap<BlockPos, Integer>();
        int n2 = 0;
        boolean bl = !world.func_175623_d(blockPos.func_177977_b());
        for (int i = -10; i < 10; ++i) {
            for (int j = -10; j < 10; ++j) {
                for (int k = -10; k < 10; ++k) {
                    RayTraceResult rayTraceResult;
                    if (i == 0 && j == 0 && k == 0) continue;
                    BlockPos blockPos3 = blockPos2.func_177971_a((Vec3i)new BlockPos(i, j, k));
                    if (bl && blockPos.func_177956_o() >= blockPos3.func_177956_o() || !world.func_175623_d(blockPos3) || !world.func_175623_d(blockPos3.func_177984_a()) || !world.func_175623_d(blockPos3.func_177984_a().func_177984_a()) || (rayTraceResult = world.func_147447_a(new Vec3d((Vec3i)blockPos), new Vec3d((Vec3i)blockPos3), true, true, true)) != null) continue;
                    int n3 = blockPos3.func_177956_o();
                    while (--n3 >= 0 && world.func_180495_p(new BlockPos(blockPos3.func_177958_n(), n3, blockPos3.func_177952_p())).func_177230_c() instanceof BlockAir) {
                    }
                    if (world.func_180495_p(new BlockPos(blockPos3.func_177958_n(), n3, blockPos3.func_177952_p())).func_177230_c() instanceof BlockLiquid) continue;
                    arrayList.add(blockPos3);
                    if (!world.func_175623_d(blockPos3.func_177977_b()) || !world.func_175623_d(blockPos3.func_177977_b().func_177977_b()) || blockPos2.func_185332_f(blockPos3.func_177958_n(), blockPos3.func_177956_o(), blockPos3.func_177952_p()) < 5.0 || blockPos.func_185332_f(blockPos3.func_177958_n(), blockPos3.func_177956_o(), blockPos3.func_177952_p()) < 3.0) continue;
                    int n4 = 0;
                    for (int i2 = -1; i2 < 2; ++i2) {
                        for (int i3 = -1; i3 < 2; ++i3) {
                            for (int i4 = -1; i4 < 4; ++i4) {
                                if (!world.func_175623_d(blockPos3.func_177982_a(i2, i4, i3))) continue;
                                ++n4;
                            }
                        }
                    }
                    if (n4 < 25) continue;
                    hashMap.put(blockPos3, n4);
                    if (n4 <= n2) continue;
                    n2 = n4;
                }
            }
        }
        if (!hashMap.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
            arrayList2.sort((entry, entry2) -> ((Integer)entry2.getValue()).compareTo((Integer)entry.getValue()));
            f_2.O = new Vec3d((Vec3i)((Map.Entry)arrayList2.get(be.a(arrayList2.size() - 1))).getKey());
        } else {
            f_2.O = arrayList.isEmpty() ? new Vec3d((Vec3i)blockPos2.func_177963_a((double)be.a(10.0f, true), (double)be.a(10.0f, false), (double)be.a(10.0f, true))) : new Vec3d((Vec3i)arrayList.get(r.f.nextInt(arrayList.size())));
        }
        f_2.bL = null;
        f_2.b(0);
        f_2.b(fp.FLY);
        ge.b.sendToAllTracking((IMessage)new a1(f_2.f()), (Entity)f_2);
    }, f_2 -> {
        Vec3d vec3d = f_2.func_174791_d();
        Vec3d vec3d2 = f_2.O;
        if (vec3d2 == null) {
            return;
        }
        f_2.bL = vec3d;
        int n2 = f_2.ar();
        f_2.b(n2 + 1);
        if (n2 != 0) {
            return;
        }
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
        Vec3d vec3d4 = vec3d3.func_72432_b();
        f_2.field_70159_w = vec3d4.field_72450_a * (double)0.6f;
        f_2.field_70179_y = vec3d4.field_72449_c * (double)0.6f;
        f_2.field_70181_x = be.b(vec3d3.field_72448_b * (double)0.6f, (double)-0.6f, (double)0.6f);
    }, f_2 -> f_2.ar() > 23, f_2 -> {
        f_2.b(Vec3d.field_186680_a);
        f_2.b(0);
        f_2.bL = null;
    }, false, f_2 -> true, false),
    SUMMON_SKELETON(f_2 -> {
        f_2.b(fp.SUMMON_SKELETON);
        f_2.ad = 0;
        EntityDataManager entityDataManager = f_2.func_184212_Q();
        entityDataManager.func_187227_b(f_.bN, (Object)true);
        entityDataManager.func_187227_b(f_.b7, (Object)true);
        entityDataManager.func_187227_b(f_.ay, (Object)f_2.func_70681_au().nextBoolean());
        em.a((em)f_2, com.trolmastercard.sexmod.c.GIRLS_GALATH_STRONGCHARGE, true);
    }, f_2 -> {
        c4 c42;
        Vec3d vec3d;
        Vec3d vec3d2;
        Vec3d vec3d3;
        f_2.b(Vec3d.field_186680_a);
        if ((float)f_2.ad != 30.0f) {
            return;
        }
        f_.a(f_2, 0.0f);
        Vec3d vec3d4 = f_2.func_174791_d();
        Vec3d vec3d5 = f_2.M().func_174791_d();
        Random random = f_2.func_70681_au();
        boolean bl = (Boolean)f_2.func_184212_Q().func_187225_a(f_.ay);
        if (((Boolean)f_2.func_184212_Q().func_187225_a(f_.bN)).booleanValue()) {
            vec3d3 = vec3d4.func_178787_e(ck.a(bl ? ck.c(f_.bz) : f_.bz, 180.0f + f_2.field_70761_aq));
            vec3d2 = vec3d5.func_178788_d(vec3d3).func_72432_b();
            vec3d2 = new Vec3d(vec3d2.field_72450_a + random.nextDouble() * (double)0.3f, vec3d2.field_72448_b + random.nextDouble() * (double)0.3f, vec3d2.field_72449_c + random.nextDouble() * (double)0.3f);
            vec3d2 = vec3d2.func_72432_b();
            vec3d = new Vec3d(vec3d2.field_72450_a * (double)0.4f, vec3d2.field_72448_b * (double)0.4f, vec3d2.field_72449_c * (double)0.4f);
            c42 = new c4(f_2.field_70170_p, f_2, vec3d);
            c42.func_70634_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
            f_2.field_70170_p.func_72838_d((Entity)c42);
        }
        if (((Boolean)f_2.func_184212_Q().func_187225_a(f_.b7)).booleanValue()) {
            vec3d3 = vec3d4.func_178787_e(ck.a(bl ? ck.c(f_.bC) : f_.bC, 180.0f + f_2.field_70761_aq));
            vec3d2 = vec3d5.func_178788_d(vec3d3).func_72432_b();
            vec3d2 = new Vec3d(vec3d2.field_72450_a + random.nextDouble() * (double)0.3f, vec3d2.field_72448_b + random.nextDouble() * (double)0.3f, vec3d2.field_72449_c + random.nextDouble() * (double)0.3f);
            vec3d2 = vec3d2.func_72432_b();
            vec3d = new Vec3d(vec3d2.field_72450_a * (double)0.4f, vec3d2.field_72448_b * (double)0.4f, vec3d2.field_72449_c * (double)0.4f);
            c42 = new c4(f_2.field_70170_p, f_2, vec3d);
            c42.func_70634_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
            f_2.field_70170_p.func_72838_d((Entity)c42);
        }
    }, f_2 -> f_2.ad >= 45, f_2 -> {
        f_2.ad = 0;
    }, true, f_2 -> f_2.bI.size() < 2, true),
    ATTACK_SWORD(f_2 -> {
        f_2.a(0);
        f_2.b(fp.ATTACK_SWORD);
        f_2.b(Vec3d.field_186680_a);
        Vec3d vec3d = f_2.func_174791_d();
        f_2.e(vec3d);
        Vec3d vec3d2 = f_2.M().func_174791_d();
        g8 g82 = new g8(vec3d2.field_72450_a - vec3d.field_72450_a, vec3d2.field_72449_c - vec3d.field_72449_c);
        double d = gc.b(Math.atan2(g82.a, g82.b)) - 90.0;
        f_2.a(true);
        f_2.c(vec3d);
        f_2.b((float)d);
        em.a((em)f_2, com.trolmastercard.sexmod.c.GIRLS_GALATH_STRONGCHARGE, true);
    }, f_2 -> {
        EntityLivingBase entityLivingBase = f_2.M();
        int n2 = f_2.az() + 1;
        f_2.a(n2);
        if (be.a((double)n2, 24.0, 32.0)) {
            Vec3d vec3d = entityLivingBase.func_174791_d().func_72441_c(0.0, (double)entityLivingBase.func_70047_e(), 0.0);
            g8 g82 = new g8(vec3d.field_72450_a - f_2.field_70165_t, vec3d.field_72449_c - f_2.field_70161_v);
            double d = gc.b(Math.atan2(g82.a, g82.b)) - 90.0;
            f_2.b((float)d);
            Vec3d vec3d2 = ck.a(new Vec3d(0.0, 0.0, 3.0), (float)(d + 180.0));
            Vec3d vec3d3 = f_2.B();
            Vec3d vec3d4 = vec3d.func_178787_e(vec3d2);
            float f = (float)(n2 - 24) / 8.0f;
            Vec3d vec3d5 = b6.a(vec3d3, vec3d4, (double)f);
            f_2.c(vec3d5);
        } else if (be.a((double)n2, 32.0, 54.0)) {
            Vec3d vec3d = ck.a(new Vec3d(0.0, 0.0, 1.5), f_2.I().floatValue() + 180.0f);
            Vec3d vec3d6 = entityLivingBase.func_174791_d().func_178787_e(vec3d);
            f_2.c(vec3d6);
            cs cs2 = new cs(f_2);
            entityLivingBase.field_70737_aN = 0;
            entityLivingBase.field_70172_ad = 0;
            if (n2 == 36) {
                entityLivingBase.func_70097_a((DamageSource)cs2, 5.0f);
            }
            if (n2 == 40) {
                entityLivingBase.func_70097_a((DamageSource)cs2, 5.0f);
            }
        } else if (n2 == 54) {
            f_2.a(false);
            f_2.b(fp.FLY);
            Vec3d vec3d = f_2.B().func_178788_d(f_2.func_174791_d()).func_72432_b();
            f_2.field_70159_w = vec3d.field_72450_a * (double)0.6f;
            f_2.field_70181_x = vec3d.field_72448_b * (double)0.6f;
            f_2.field_70179_y = vec3d.field_72449_c * (double)0.6f;
            f_2.b(1);
        } else {
            f_2.b(f_2.ar() + 1);
        }
    }, f_2 -> f_2.ar() > 23, f_2 -> {
        f_2.b(0);
        f_2.b(Vec3d.field_186680_a);
        f_2.a(-1);
        f_2.a(false);
    }, true, f_2 -> true, false),
    RAPE(f_2 -> {
        f_2.b(fp.RAPE_PREPARE);
        f_2.aF = 0;
        f_2.bd = null;
        f_2.O = null;
        f_2.func_184212_Q().func_187227_b(f_.bO, (Object)Float.valueOf(0.0f));
    }, f_2 -> {
        block7: {
            double d;
            boolean bl;
            double d2;
            Vec3d vec3d;
            Vec3d vec3d2;
            EntityPlayer entityPlayer2;
            Vec3d vec3d3;
            if (++f_2.aF < 48) {
                return;
            }
            f_2.b(fp.RAPE_CHARGE);
            EntityLivingBase entityLivingBase = f_2.M();
            if (f_2.bd == null) {
                f_2.O = entityLivingBase.func_174791_d().func_72441_c(0.0, (double)(entityLivingBase.func_70047_e() / 2.0f), 0.0);
                f_2.bd = f_2.func_174791_d();
                vec3d3 = entityLivingBase.func_174791_d().func_178788_d(f_2.func_174791_d()).func_72432_b();
                f_2.b((float)(gc.b(Math.atan2(vec3d3.field_72449_c, vec3d3.field_72450_a)) - 90.0));
            }
            vec3d3 = f_2.func_174791_d();
            Vec3d vec3d4 = vec3d3.func_178786_a((double)0.65f, (double)0.65f, (double)0.65f);
            Vec3d vec3d5 = vec3d3.func_72441_c((double)0.65f, (double)0.65f, (double)0.65f);
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c, vec3d5.field_72450_a, vec3d5.field_72448_b, vec3d5.field_72449_c);
            List list = f_2.field_70170_p.func_72872_a(EntityPlayer.class, axisAlignedBB);
            for (EntityPlayer entityPlayer2 : list) {
                if (entityPlayer2.field_70128_L || !entityPlayer2.field_70122_E || em.a(entityPlayer2.getPersistentID(), true) != null) continue;
                vec3d2 = entityPlayer2.func_174791_d();
                vec3d = vec3d3.func_178788_d(vec3d2);
                Vec3d vec3d6 = ck.a(vec3d, f_2.I().floatValue());
                d2 = Math.abs(vec3d6.field_72450_a);
                if (d2 > (double)0.65f) continue;
                for (EntityWitherSkeleton entityWitherSkeleton : f_2.bI) {
                    Vec3d vec3d7 = entityWitherSkeleton.func_174791_d();
                    entityWitherSkeleton.field_70170_p.func_72900_e((Entity)entityWitherSkeleton);
                    ge.b.sendToAllTracking((IMessage)new bv(vec3d7, true), new NetworkRegistry.TargetPoint(entityWitherSkeleton.field_71093_bK, vec3d7.field_72450_a, vec3d7.field_72448_b, vec3d7.field_72449_c, 50.0));
                }
                f_2.bI.clear();
                EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer2;
                f_2.c(entityPlayer2.func_174791_d());
                f_2.e(entityPlayer2.getPersistentID());
                f_2.a(true);
                f_2.b(fp.RAPE_INTRO);
                byte by = (byte)MathHelper.func_76141_d((float)((f_2.I().floatValue() + 180.0f) * 256.0f / 360.0f));
                ge.b.sendTo((IMessage)new gz(false), entityPlayerMP);
                entityPlayerMP.field_71135_a.func_147359_a((Packet)new SPacketEntityVelocity(entityPlayerMP.func_145782_y(), 0.0, 0.0, 0.0));
                entityPlayerMP.field_71135_a.func_147359_a((Packet)new SPacketEntity.S16PacketEntityLook(entityPlayerMP.func_145782_y(), by, -14, true));
                return;
            }
            Vec3d vec3d8 = f_2.bd;
            entityPlayer2 = f_2.O;
            vec3d2 = entityPlayer2.func_178788_d(vec3d8);
            vec3d = entityPlayer2.func_178787_e(vec3d2);
            vec3d = new Vec3d(vec3d.field_72450_a, vec3d8.field_72448_b, vec3d.field_72449_c);
            boolean bl2 = bl = vec3d3.func_72438_d(new Vec3d(vec3d8.field_72450_a, vec3d3.field_72448_b, vec3d8.field_72449_c)) > vec3d3.func_72438_d(new Vec3d(vec3d.field_72450_a, vec3d3.field_72448_b, vec3d.field_72449_c));
            if (bl) {
                d2 = ck.a((Vec3d)entityPlayer2, vec3d, vec3d3);
                d = entityPlayer2.func_72438_d(vec3d);
            } else {
                d2 = ck.a(vec3d8, (Vec3d)entityPlayer2, vec3d3);
                d = vec3d8.func_72438_d((Vec3d)entityPlayer2);
            }
            double d3 = d / (double)0.05f;
            double d4 = 1.0 / d3 * 20.0;
            d2 += d4;
            if (!bl && d2 < (double)0.9f) {
                f_2.O = entityLivingBase.func_174791_d().func_72441_c(0.0, (double)(entityLivingBase.func_70047_e() / 2.0f), 0.0);
            }
            vec3d3 = bl ? new Vec3d(b6.b(entityPlayer2.field_72450_a, vec3d.field_72450_a, Math.min(1.0, d2)), b6.b(entityPlayer2.field_72448_b, vec3d.field_72448_b, Math.min(1.0, b6.a(d2))), b6.b(entityPlayer2.field_72449_c, vec3d.field_72449_c, Math.min(1.0, d2))) : new Vec3d(b6.b(vec3d8.field_72450_a, entityPlayer2.field_72450_a, d2), b6.b(vec3d8.field_72448_b, entityPlayer2.field_72448_b, b6.g(d2)), b6.b(vec3d8.field_72449_c, entityPlayer2.field_72449_c, d2));
            f_2.func_70107_b(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
            if (!bl) break block7;
            f_2.func_184212_Q().func_187227_b(f_.bO, (Object)Float.valueOf((float)d2));
        }
    }, f_2 -> {
        if (f_2.y() == fp.RAPE_INTRO) {
            return true;
        }
        Vec3d vec3d = f_2.bd;
        Vec3d vec3d2 = f_2.O;
        if (vec3d == null) {
            return false;
        }
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
        Vec3d vec3d4 = vec3d2.func_178787_e(vec3d3);
        vec3d4 = new Vec3d(vec3d4.field_72450_a, vec3d.field_72448_b, vec3d4.field_72449_c);
        return f_2.func_70011_f(vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c) < (double)0.1f;
    }, f_2 -> {
        f_2.O = null;
        f_2.bd = null;
        f_2.aF = 0;
        f_2.func_184212_Q().func_187227_b(f_.bO, (Object)Float.valueOf(0.0f));
    }, true, f_2 -> true, true);

    final h_ a;
    final b2 f;
    final ao c;
    final u b;
    final g1 d;
    public final boolean applyAttackCoolDown;
    public final boolean onlyDoThisOnPlayers;

    private h8(b2 b22, ao ao2, h_ h_2, u u2, boolean bl, g1 g12, boolean bl2) {
        this.a = h_2;
        this.f = b22;
        this.c = ao2;
        this.b = u2;
        this.applyAttackCoolDown = bl;
        this.d = g12;
        this.onlyDoThisOnPlayers = bl2;
    }

    public void b(f_ f_2) {
        this.f.a(f_2);
    }

    public boolean c(f_ f_2) {
        return this.a.a(f_2);
    }

    public void a(f_ f_2) {
        this.c.a(f_2);
    }

    public void e(f_ f_2) {
        this.b.a(f_2);
    }

    public boolean d(f_ f_2) {
        return this.d.a(f_2);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
