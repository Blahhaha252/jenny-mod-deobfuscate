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

public static class ax.a {
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

    public ax.a(UUID uUID, EyeAndKoboldColor eyeAndKoboldColor, ff ff2, List<ff> list) {
        this.m = uUID;
        this.h = eyeAndKoboldColor;
        this.g = ff2;
        this.a = list;
    }

    public ax.a(UUID uUID, EyeAndKoboldColor eyeAndKoboldColor) {
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
        block11: {
            try {
                if (!this.f.contains(bs2)) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ax.a.a(runtimeException);
            }
            for (ff ff2 : bs2.f) {
                ff2.b(fp.NULL);
                ff2.func_189654_d(false);
                ff2.field_70145_X = false;
                ff2.func_184212_Q().func_187227_b(em.G, (Object)false);
            }
            try {
                try {
                    this.f.remove(bs2);
                    if (!bs2.b.isEmpty() && this.e != null) break block11;
                }
                catch (RuntimeException runtimeException) {
                    throw ax.a.a(runtimeException);
                }
                return;
            }
            catch (RuntimeException runtimeException) {
                throw ax.a.a(runtimeException);
            }
        }
        EntityPlayerMP entityPlayerMP = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_177451_a(this.e);
        try {
            if (entityPlayerMP == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ax.a.a(runtimeException);
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
        try {
            if (this.a.contains(ff2)) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ax.a.a(runtimeException);
        }
        UUID uUID = ff2.f();
        ArrayList<ff> arrayList = new ArrayList<ff>();
        for (ff ff3 : this.a) {
            try {
                if (!ff3.f().equals(uUID)) continue;
                arrayList.add(ff3);
            }
            catch (RuntimeException runtimeException) {
                throw ax.a.a(runtimeException);
            }
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
            try {
                if (ff3.field_70128_L) {
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ax.a.a(runtimeException);
            }
            if (ff2 == null) {
                ff2 = ff3;
                continue;
            }
            float f = ((Float)ff2.func_184212_Q().func_187225_a(ff.aE)).floatValue();
            float f2 = ((Float)ff3.func_184212_Q().func_187225_a(ff.aE)).floatValue();
            if (!(f2 < f)) continue;
            ff2 = ff3;
        }
        return ff2;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
