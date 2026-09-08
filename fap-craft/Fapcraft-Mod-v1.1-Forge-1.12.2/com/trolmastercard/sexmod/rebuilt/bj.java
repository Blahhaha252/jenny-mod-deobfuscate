/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 *  net.minecraft.world.storage.WorldSavedData
 *  net.minecraftforge.event.world.WorldEvent$Load
 *  net.minecraftforge.event.world.WorldEvent$Save
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f8;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.v;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class bj
extends WorldSavedData {
    static final String a = "sexmod:static_custom_model_manager";
    static final String d = "sexmod:static_custom_model_manager";
    public static HashMap<UUID, String> c = new HashMap();
    public static HashMap<UUID, String> b = new HashMap();

    public bj() {
        super("sexmod:static_custom_model_manager");
    }

    public bj(String string) {
        super("sexmod:static_custom_model_manager");
    }

    public static String c(em em2) {
        String string = bj.b(em2);
        if (string == null) {
            return "";
        }
        return string;
    }

    private static String b(em em2) {
        if (em2 instanceof f_) {
            UUID uUID = em2.f();
            UUID uUID2 = v.f(uUID);
            if (uUID2 == null) {
                uUID2 = uUID;
            }
            return c.get(uUID2);
        }
        if (em2 instanceof f8) {
            UUID uUID = v.f(((f8)em2).v());
            return b.get(uUID == null ? em2.f() : uUID);
        }
        return null;
    }

    public static void a(em em2) {
        if (em2 instanceof f_) {
            UUID uUID = em2.f();
            UUID uUID2 = v.f(uUID);
            if (uUID2 == null) {
                uUID2 = uUID;
            }
            c.put(uUID2, em2.C());
            return;
        }
        if (em2 instanceof f8) {
            UUID uUID = v.f(((f8)em2).v());
            b.put(uUID == null ? em2.f() : uUID, em2.C());
        }
    }

    @SubscribeEvent
    public void a(WorldEvent.Save save) {
        World world = save.getWorld();
        world.getMapStorage().setData("sexmod:static_custom_model_manager", (WorldSavedData)this);
        this.markDirty();
    }

    @SubscribeEvent
    public void a(WorldEvent.Load load) {
        World world = load.getWorld();
        world.getMapStorage().getOrLoadData(bj.class, "sexmod:static_custom_model_manager");
    }

    public void readFromNBT(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = nBTTagCompound.getCompoundTag("sexmod:static_custom_model_manager");
        this.a(nBTTagCompound2.getCompoundTag("galath"), c);
        this.a(nBTTagCompound2.getCompoundTag("mang"), b);
    }

    public NBTTagCompound writeToNBT(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        nBTTagCompound2.setTag("galath", (NBTBase)this.a(c));
        nBTTagCompound2.setTag("mang", (NBTBase)this.a(b));
        nBTTagCompound.setTag("sexmod:static_custom_model_manager", (NBTBase)nBTTagCompound2);
        return nBTTagCompound;
    }

    NBTTagCompound a(HashMap<UUID, String> hashMap) {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        int n = 0;
        for (Map.Entry<UUID, String> entry : hashMap.entrySet()) {
            UUID uUID = entry.getKey();
            nBTTagCompound.setString("UUID" + n, uUID.toString());
            nBTTagCompound.setString("MODEL" + n, entry.getValue());
            ++n;
        }
        return nBTTagCompound;
    }

    void a(NBTTagCompound nBTTagCompound, HashMap<UUID, String> hashMap) {
        int n = 0;
        String string;
        while (!"".equals(string = nBTTagCompound.getString("UUID" + n))) {
            hashMap.put(UUID.fromString(string), nBTTagCompound.getString("MODEL" + n));
            ++n;
        }
        return;
    }

    public static void a() {
        c.clear();
        b.clear();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
