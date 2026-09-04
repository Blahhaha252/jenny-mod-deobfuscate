/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.IGuiHandler
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.az;
import com.trolmastercard.sexmod.bx;
import com.trolmastercard.sexmod.ca;
import com.trolmastercard.sexmod.d4;
import com.trolmastercard.sexmod.eb;
import com.trolmastercard.sexmod.ek;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fb;
import java.io.File;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class et
implements IGuiHandler {
    File b;
    File c;
    boolean a = false;

    public et() {
    }

    public et(boolean bl2) {
        this.a();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    void a() {
        block15: {
            var1_1 = 2;
            if (var1_1 != 0) break block15;
            try lbl-1000:
            // 4 sources

            {
                for (em var3_5 : em.ad()) {
                    if (var3_5.field_70170_p.field_72995_K || var3_5.func_180425_c().func_177958_n() != 5) continue;
                    ** GOTO lbl-1000
                }
                break block15;
            }
            catch (ConcurrentModificationException var2_3) {
                // empty catch block
                break block15;
            }
lbl-1000:
            // 1 sources

            {
                if (var3_5.func_180425_c().func_177956_o() != 7 || var3_5.func_180425_c().func_177952_p() != 5) ** GOTO lbl-1000
            }
            {
                if (!(var3_5 instanceof eb)) ** GOTO lbl-1000
            }
            {
                new ca((eb)var3_5, Minecraft.func_71410_x().field_71439_g.field_71071_by, UUID.randomUUID());
            }
lbl-1000:
            // 2 sources

            {
                new d4(var3_5, Minecraft.func_71410_x().field_71439_g.field_71071_by, UUID.randomUUID());
                ** GOTO lbl-1000
            }
        }
        if (var1_1 != 1) return;
        try lbl-1000:
        // 4 sources

        {
            for (em var3_5 : em.ad()) {
                if (var3_5.field_70170_p.field_72995_K || !(var3_5 instanceof IInventory)) continue;
                ** GOTO lbl-1000
            }
            return;
        }
        catch (ConcurrentModificationException var2_4) {
            // empty catch block
            return;
        }
lbl-1000:
        // 1 sources

        {
            if (var3_5.func_180425_c().func_177958_n() != 3 || var3_5.func_180425_c().func_177956_o() != 1 || var3_5.func_180425_c().func_177952_p() != 7) ** GOTO lbl-1000
        }
        {
            var4_6 = (IInventory)var3_5;
            new bx((IInventory)Minecraft.func_71410_x().field_71439_g.field_71071_by, var4_6, (EntityPlayer)Minecraft.func_71410_x().field_71439_g, UUID.randomUUID());
            ** GOTO lbl-1000
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object getServerGuiElement(int var1_1, EntityPlayer var2_2, World var3_3, int var4_4, int var5_5, int var6_6) {
        block14: {
            if (var1_1 != 0) break block14;
            try lbl-1000:
            // 3 sources

            {
                for (em var8_10 : em.ad()) {
                    if (var8_10.field_70170_p.field_72995_K || var8_10.func_180425_c().func_177958_n() != var4_4) continue;
                    ** GOTO lbl-1000
                }
                break block14;
            }
            catch (ConcurrentModificationException var7_8) {
                // empty catch block
                break block14;
            }
lbl-1000:
            // 1 sources

            {
                if (var8_10.func_180425_c().func_177956_o() != var5_5 || var8_10.func_180425_c().func_177952_p() != var6_6) ** GOTO lbl-1000
            }
            {
                if (!(var8_10 instanceof eb)) return new d4(var8_10, var2_2.field_71071_by, UUID.randomUUID());
            }
            return new ca((eb)var8_10, var2_2.field_71071_by, UUID.randomUUID());
        }
        if (var1_1 != 1) return null;
        try lbl-1000:
        // 3 sources

        {
            for (em var8_10 : em.ad()) {
                if (var8_10.field_70170_p.field_72995_K || !(var8_10 instanceof IInventory)) continue;
                ** GOTO lbl-1000
            }
            return null;
        }
        catch (ConcurrentModificationException var7_9) {
            // empty catch block
            return null;
        }
lbl-1000:
        // 1 sources

        {
            if (var8_10.func_180425_c().func_177958_n() != var4_4 || var8_10.func_180425_c().func_177956_o() != var5_5 || var8_10.func_180425_c().func_177952_p() != var6_6) ** GOTO lbl-1000
        }
        {
            var9_11 = (IInventory)var8_10;
            return new bx((IInventory)var2_2.field_71071_by, var9_11, var2_2, UUID.randomUUID());
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object getClientGuiElement(int var1_1, EntityPlayer var2_2, World var3_3, int var4_4, int var5_5, int var6_6) {
        block14: {
            if (var1_1 != 0) break block14;
            try lbl-1000:
            // 3 sources

            {
                for (em var8_10 : em.ad()) {
                    if (!var8_10.field_70170_p.field_72995_K || var8_10.func_180425_c().func_177958_n() != var4_4) continue;
                    ** GOTO lbl-1000
                }
                break block14;
            }
            catch (ConcurrentModificationException var7_8) {
                // empty catch block
                break block14;
            }
lbl-1000:
            // 1 sources

            {
                if (var8_10.func_180425_c().func_177956_o() != var5_5 || var8_10.func_180425_c().func_177952_p() != var6_6) ** GOTO lbl-1000
            }
            {
                if (!(var8_10 instanceof eb)) return new fb(var8_10, var2_2.field_71071_by, UUID.randomUUID());
            }
            return new az((eb)var8_10, var2_2.field_71071_by, UUID.randomUUID());
        }
        if (var1_1 != 1) return null;
        try lbl-1000:
        // 3 sources

        {
            for (em var8_10 : em.ad()) {
                if (!var8_10.field_70170_p.field_72995_K || !(var8_10 instanceof IInventory)) continue;
                ** GOTO lbl-1000
            }
            return null;
        }
        catch (ConcurrentModificationException var7_9) {
            // empty catch block
            return null;
        }
lbl-1000:
        // 1 sources

        {
            if (var8_10.func_180425_c().func_177958_n() != var4_4 || var8_10.func_180425_c().func_177956_o() != var5_5 || var8_10.func_180425_c().func_177952_p() != var6_6) ** GOTO lbl-1000
        }
        return new ek(var2_2, var8_10, UUID.randomUUID());
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}

