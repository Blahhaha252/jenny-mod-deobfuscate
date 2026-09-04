/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.annotation.Nullable
 *  net.minecraft.block.BlockBed
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.bs;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.fm;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.h6;
import com.trolmastercard.sexmod.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.BlockBed;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ax {
    static final int d = 4;
    private static final HashMap<UUID, a.a> c = new HashMap();
    static final Vec3d[] b = new Vec3d[]{new Vec3d(0.0, 0.0, 0.0), new Vec3d(0.5, 0.0, 0.0), new Vec3d(-0.5, 0.0, 0.0), new Vec3d(0.0, 0.0, 0.5), new Vec3d(0.0, 0.0, -0.5)};
    static HashMap<ff, BlockPos[]> a = new HashMap();

    public static void a() {
        c.clear();
        a.clear();
    }

    public static void a(World world, Vec3d vec3d) {
        UUID uUID = UUID.randomUUID();
        float[] fArray = new float[4];
        fArray[0] = 0.25f;
        for (int i2 = 1; i2 < fArray.length; ++i2) {
            fArray[i2] = ff.j();
        }
        ArrayList<ff> arrayList = new ArrayList<ff>();
        for (float f10 : fArray) {
            ff ff2 = ff.a(world, uUID, f10);
            arrayList.add(ff2);
        }
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.values()[r.f.nextInt(EyeAndKoboldColor.values().length)];
        a.a a10 = new a.a(uUID, eyeAndKoboldColor, (ff)arrayList.get(0), arrayList);
        c.put(uUID, a10);
        int n2 = 0;
        for (ff ff2 : arrayList) {
            ff2.func_70107_b(vec3d.field_72450_a + ax.b[n2].field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c + ax.b[n2].field_72449_c);
            world.func_72838_d((Entity)ff2);
            ++n2;
        }
    }

    public static boolean o(UUID uUID) {
        return c.get(uUID) != null;
    }

    public static void a(UUID uUID, UUID uUID2) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            return;
        }
        a10.a(uUID2);
    }

    public static void a(UUID uUID, EyeAndKoboldColor eyeAndKoboldColor) {
        a.a a10 = c.get(uUID);
        if (a10 != null) {
            System.out.println("tribe of UUID " + uUID.toString() + " does already exist lol");
            return;
        }
        c.put(uUID, new a.a(uUID, eyeAndKoboldColor));
    }

    public static boolean a(BlockPos blockPos) {
        for (Map.Entry<ff, BlockPos[]> entry : a.entrySet()) {
            BlockPos[] blockPosArray = entry.getValue();
            if (blockPosArray[0].equals((Object)blockPos)) {
                return true;
            }
            if (!blockPosArray[1].equals((Object)blockPos)) continue;
            return true;
        }
        return false;
    }

    public static BlockPos[] a(ff ff2) {
        return a.get(ff2);
    }

    public static void a(ff ff2, BlockPos blockPos) {
        World world = ff2.field_70170_p;
        BlockPos blockPos2 = null;
        if (world.func_180495_p(blockPos.func_177978_c()).func_177230_c() instanceof BlockBed) {
            blockPos2 = blockPos.func_177978_c();
        }
        if (world.func_180495_p(blockPos.func_177974_f()).func_177230_c() instanceof BlockBed) {
            blockPos2 = blockPos.func_177974_f();
        }
        if (world.func_180495_p(blockPos.func_177968_d()).func_177230_c() instanceof BlockBed) {
            blockPos2 = blockPos.func_177968_d();
        }
        if (world.func_180495_p(blockPos.func_177976_e()).func_177230_c() instanceof BlockBed) {
            blockPos2 = blockPos.func_177976_e();
        }
        if (blockPos2 == null) {
            System.out.println("bed @" + blockPos.toString() + " apparently doesn't have another half.. wtf");
            return;
        }
        a.put(ff2, new BlockPos[]{blockPos, blockPos2});
    }

    public static void b(ff ff2) {
        a.remove(ff2);
    }

    public static void d(UUID uUID, ff ff2) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.g = ff2;
    }

    public static void c(UUID uUID, ff ff2) {
        block1: {
            a.a a10 = c.get(uUID);
            if (a10 == null) {
                System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
                return;
            }
            a10.a(ff2);
            c.replace(uUID, a10);
            ff2.func_184212_Q().func_187227_b(ff.aL, (Object)Optional.of((Object)uUID));
            if (ff2.aA) break block1;
            ff2.func_184212_Q().func_187227_b(ff.N, (Object)a10.h.toString());
        }
    }

    public static void k(UUID uUID) {
        block1: {
            a.a a10 = c.get(uUID);
            if (a10 == null) {
                System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
                return;
            }
            ff ff2 = a10.g;
            if (ff2 != null && !ff2.field_70128_L) break block1;
            a10.g = a10.b();
        }
    }

    public static void a(UUID uUID, ff ff2) {
        Object object;
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.b(ff2);
        a10.b(ff2.f());
        if (a10.g != null && a10.g.func_145782_y() == ff2.func_145782_y() && (object = a10.b()) != null) {
            a10.g = object;
        }
        for (bs object2 : a10.f) {
            object2.c(ff2);
        }
        if (!a10.a.isEmpty()) {
            c.replace(uUID, a10);
            return;
        }
        if (!ff2.J()) {
            return;
        }
        object = ff2.z();
        if (object != null) {
            HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
            hashSet.addAll(a10.i);
            hashSet.addAll(a10.b);
            for (bs bs2 : a10.f) {
                hashSet.addAll(bs2.b);
            }
            ge.b.sendTo((IMessage)new h6(hashSet, false), (EntityPlayerMP)object);
            object.func_145747_a((ITextComponent)new TextComponentString(String.format("ur %stribe %shas been %seradicated %suwu", TextFormatting.RED, TextFormatting.WHITE, TextFormatting.RED, TextFormatting.WHITE)));
        }
    }

    @Nullable
    public static ff f(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        return a10.g;
    }

    public static boolean e(UUID uUID, ff ff2) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return false;
        }
        if (a10.g == null) {
            return false;
        }
        return a10.g.func_145782_y() == ff2.func_145782_y();
    }

    public static EyeAndKoboldColor l(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return ff.aJ;
        }
        return a10.h;
    }

    public static HashSet<BlockPos> j(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashSet<BlockPos>();
        }
        return a10.b;
    }

    public static void a(UUID uUID, BlockPos blockPos) {
        if (blockPos == null) {
            return;
        }
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.b.add(blockPos);
    }

    public static void e(UUID uUID, BlockPos blockPos) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.b.remove(blockPos);
    }

    public static HashSet<BlockPos> q(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        return a10.i;
    }

    public static void f(UUID uUID, BlockPos blockPos) {
        if (blockPos == null) {
            return;
        }
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.i.add(blockPos);
    }

    public static void d(UUID uUID, BlockPos blockPos) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.i.remove(blockPos);
    }

    public static HashSet<BlockPos> a(UUID uUID, bs bs2) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashSet<BlockPos>();
        }
        if (bs2 != null) {
            a10.b(bs2);
            return bs2.b;
        }
        return new HashSet<BlockPos>();
    }

    public static HashSet<BlockPos> c(UUID uUID, BlockPos blockPos) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashSet<BlockPos>();
        }
        bs bs2 = null;
        for (bs bs3 : a10.f) {
            if (!bs3.b.contains(blockPos)) continue;
            bs2 = bs3;
            break;
        }
        return ax.a(uUID, bs2);
    }

    public static void b(UUID uUID, bs bs2) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.a(bs2);
    }

    public static void b(UUID uUID, ff ff2) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        bs bs2 = null;
        for (bs bs3 : a10.f) {
            if (!bs3.b(ff2)) continue;
            bs2 = bs3;
        }
        if (bs2 == null) {
            System.out.println("task of worker " + ff2.f() + " not found uwu");
            return;
        }
        a10.b(bs2);
    }

    @Nullable
    public static Collection<bs> p(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        return a10.f;
    }

    public static fm i(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return fm.REST;
        }
        return a10.e();
    }

    public static void a(UUID uUID, fm fm2) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.a(fm2);
    }

    public static int h(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return 0;
        }
        return a10.f();
    }

    public static List<ff> n(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new ArrayList<ff>();
        }
        return a10.a;
    }

    public static void b(UUID uUID, BlockPos blockPos) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.a(blockPos);
    }

    @Nullable
    public static BlockPos m(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        return a10.g();
    }

    public static HashSet<EntityLivingBase> e(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashSet<EntityLivingBase>();
        }
        return a10.c();
    }

    public static void a(UUID uUID, EntityLivingBase entityLivingBase) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.a(entityLivingBase);
    }

    public static void b(UUID uUID, EntityLivingBase entityLivingBase) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.b(entityLivingBase);
    }

    public static boolean g(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return false;
        }
        for (ff ff2 : a10.a) {
            if (ff2.ae() == null) continue;
            return true;
        }
        return false;
    }

    public static boolean c(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return false;
        }
        return a10.c;
    }

    public static void a(UUID uUID, boolean bl2) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.c = bl2;
    }

    @Nullable
    public static UUID a(UUID uUID) {
        if (uUID == null) {
            return null;
        }
        for (Map.Entry<UUID, a.a> entry : c.entrySet()) {
            a.a a10 = entry.getValue();
            if (a10.d().size() == 0 && a10.f() == 0 || !uUID.equals(entry.getValue().a())) continue;
            return entry.getKey();
        }
        return null;
    }

    @Nullable
    public static UUID b(UUID uUID) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        List<ff> list = a10.a;
        if (list.isEmpty()) {
            return null;
        }
        ff ff2 = list.get(0);
        if (!ff2.J()) {
            return null;
        }
        String string = (String)list.get(0).func_184212_Q().func_187225_a(em.v);
        return UUID.fromString(string);
    }

    public static HashSet<BlockPos> d(UUID uUID) {
        a.a a10 = c.get(uUID);
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return hashSet;
        }
        for (bs bs2 : a10.f) {
            hashSet.addAll(bs2.b);
        }
        hashSet.addAll(a10.i);
        hashSet.addAll(a10.b);
        return hashSet;
    }

    public static HashMap<UUID, BlockPos> a(UUID uUID, World world) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashMap<UUID, BlockPos>();
        }
        HashMap<UUID, BlockPos> hashMap = a10.k;
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        for (Map.Entry<UUID, BlockPos> entry : hashMap.entrySet()) {
            BlockPos blockPos = entry.getValue();
            UUID uUID2 = entry.getKey();
            if (!world.func_175697_a(blockPos, 5)) continue;
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos.func_177973_b(new Vec3i(-3, -3, -3)), blockPos.func_177982_a(3, 3, 3));
            List list = world.func_72872_a(ff.class, axisAlignedBB);
            boolean bl2 = false;
            for (ff ff2 : list) {
                if (!uUID2.equals(ff2.f())) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            arrayList.add(uUID2);
        }
        a10.k = hashMap;
        return hashMap;
    }

    public static void a(UUID uUID, UUID uUID2, BlockPos blockPos) {
        a.a a10 = c.get(uUID);
        if (a10 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a10.a(uUID2, blockPos);
    }

    static /* synthetic */ HashMap access$000() {
        return c;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

