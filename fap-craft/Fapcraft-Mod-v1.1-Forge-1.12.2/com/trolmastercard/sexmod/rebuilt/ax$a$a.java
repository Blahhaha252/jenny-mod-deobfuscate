/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.bs;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.fm;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.h6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public static class ax.a.a {
    UUID m;
    UUID e;
    ff g;
    List<ff> a;
    EyeAndKoboldColor h;
    fm d = fm.REST;
    BlockPos l = null;
    Collection<bs> f = new ArrayList<bs>();
    HashSet<EntityLivingBase> j = new HashSet();
    HashSet<BlockPos> i = new HashSet();
    HashSet<BlockPos> b = new HashSet();
    HashMap<UUID, BlockPos> k = new HashMap();
    boolean c = false;

    public ax.a.a(UUID uUID, EyeAndKoboldColor eyeAndKoboldColor, ff ff2, List<ff> list) {
        this.m = uUID;
        this.h = eyeAndKoboldColor;
        this.g = ff2;
        this.a = list;
    }

    public ax.a.a(UUID uUID, EyeAndKoboldColor eyeAndKoboldColor) {
        this.m = uUID;
        this.h = eyeAndKoboldColor;
        this.a = new ArrayList<ff>();
    }

    public void a(UUID uUID) {
        this.e = uUID;
    }

    public UUID a() {
        return this.e;
    }

    public void b(bs bs2) {
        if (!this.f.contains(bs2)) {
            return;
        }
        for (ff ff2 : bs2.f) {
            ff2.b(fp.NULL);
            ff2.setNoGravity(false);
            ff2.noClip = false;
            ff2.getDataManager().set(em.G, (Object)false);
        }
        this.f.remove(bs2);
        if (bs2.b.isEmpty() || this.e == null) {
            return;
        }
        EntityPlayerMP entityPlayerMP = FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayerByUUID(this.e);
        if (entityPlayerMP == null) {
            return;
        }
        ge.b.sendTo((IMessage)new h6(bs2.b, false), entityPlayerMP);
    }

    public HashMap<UUID, BlockPos> d() {
        return this.k;
    }

    public void a(UUID uUID, BlockPos blockPos) {
        this.k.put(uUID, blockPos);
    }

    public void b(UUID uUID) {
        this.k.remove(uUID);
    }

    public void b(EntityLivingBase entityLivingBase) {
        this.j.remove(entityLivingBase);
    }

    public void a(EntityLivingBase entityLivingBase) {
        this.j.add(entityLivingBase);
    }

    public HashSet<EntityLivingBase> c() {
        return this.j;
    }

    public int f() {
        HashSet<UUID> hashSet = new HashSet<UUID>();
        for (ff object : this.a) {
            hashSet.add(object.f());
        }
        for (Map.Entry entry : this.k.entrySet()) {
            hashSet.add((UUID)entry.getKey());
        }
        return hashSet.size();
    }

    public BlockPos g() {
        return this.l;
    }

    public void a(BlockPos blockPos) {
        this.l = blockPos;
    }

    public void a(bs bs2) {
        this.f.add(bs2);
    }

    public fm e() {
        return this.d;
    }

    public void a(fm fm2) {
        this.d = fm2;
    }

    public void a(ff ff2) {
        if (this.a.contains(ff2)) {
            return;
        }
        UUID uUID = ff2.f();
        ArrayList<ff> arrayList = new ArrayList<ff>();
        for (ff ff3 : this.a) {
            if (!ff3.f().equals(uUID)) continue;
            arrayList.add(ff3);
        }
        for (ff ff3 : arrayList) {
            Main.LOGGER.warn(String.format("Removed old entry of kobold called %s with UUID %s owned by %s", ff3.c(), ff3.f(), this.e));
            this.b(ff3);
        }
        this.a.add(ff2);
    }

    public void b(ff ff2) {
        this.a.remove(ff2);
    }

    ff b() {
        ff ff2 = null;
        for (ff ff3 : this.a) {
            if (ff3.isDead) continue;
            if (ff2 == null) {
                ff2 = ff3;
                continue;
            }
            float f = ((Float)ff2.getDataManager().get(ff.aE)).floatValue();
            float f2 = ((Float)ff3.getDataManager().get(ff.aE)).floatValue();
            if (!(f2 < f)) continue;
            ff2 = ff3;
        }
        return ff2;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
