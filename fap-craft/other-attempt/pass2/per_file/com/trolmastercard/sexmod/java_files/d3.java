/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.MovementInput
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraftforge.client.event.InputUpdateEvent
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovementInput;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class d3 {
    private static boolean c = true;
    public static boolean d = false;
    public static boolean a = false;
    public static MovementInput b;

    @SubscribeEvent
    public void a(InputUpdateEvent inputUpdateEvent) {
        b = inputUpdateEvent.getMovementInput();
        d = d3.b.field_78899_d;
        a = d3.b.field_78901_c;
        if (c) {
            return;
        }
        if (d3.b.field_78901_c) {
            ei.i();
        }
        if (d3.b.field_78899_d) {
            em.k(Minecraft.func_71410_x().field_71439_g.getPersistentID());
        }
        if (d3.b.field_78901_c && ds.c >= 1.0) {
            em.f(Minecraft.func_71410_x().field_71439_g.getPersistentID());
        }
        d3.b.field_187256_d = false;
        d3.b.field_187255_c = false;
        d3.b.field_187257_e = false;
        d3.b.field_187258_f = false;
        d3.b.field_78899_d = false;
        d3.b.field_78901_c = false;
        d3.b.field_192832_b = 0.0f;
        d3.b.field_78902_a = 0.0f;
        Minecraft.func_71410_x().field_71439_g.func_70016_h(0.0, 0.0, 0.0);
    }

    public static boolean b() {
        return c;
    }

    public static void a(boolean bl) {
        block0: {
            c = bl;
            if (bl) break block0;
            d3.a();
        }
    }

    @SideOnly(value=Side.CLIENT)
    static void a() {
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        if (!ei.e((EntityPlayer)entityPlayerSP)) {
            return;
        }
        entityPlayerSP.func_146105_b((ITextComponent)new TextComponentString("Jump to get out of the animation"), true);
    }

    @SubscribeEvent
    public void a(MouseEvent mouseEvent) {
        block0: {
            if (c || !mouseEvent.isButtonstate()) break block0;
            mouseEvent.setCanceled(true);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
