/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.a;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.ei;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public static class a.b {
    @SubscribeEvent
    @SideOnly(value=Side.CLIENT)
    public void a(InputEvent.KeyInputEvent keyInputEvent) {
        block13: {
            boolean bl;
            block15: {
                block14: {
                    try {
                        if (!ClientProxy.keyBindings[1].func_151468_f()) {
                            return;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw a.b.a(runtimeException);
                    }
                    try {
                        try {
                            if (!br.d) break block13;
                            if (0 == br.b(true)) break block14;
                        }
                        catch (RuntimeException runtimeException) {
                            throw a.b.a(runtimeException);
                        }
                        bl = true;
                        break block15;
                    }
                    catch (RuntimeException runtimeException) {
                        throw a.b.a(runtimeException);
                    }
                }
                bl = false;
            }
            try {
                br.d = bl;
                if (br.d) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw a.b.a(runtimeException);
            }
        }
        Minecraft minecraft = Minecraft.func_71410_x();
        ei ei2 = ei.d(minecraft.field_71439_g.getPersistentID());
        try {
            if (ei2 == null) {
                minecraft.field_71439_g.func_146105_b((ITextComponent)new TextComponentString("You have to turn into the girl you want to customize"), true);
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw a.b.a(runtimeException);
        }
        a.a(ei2);
    }

    @SubscribeEvent
    @SideOnly(value=Side.CLIENT)
    public void a(TickEvent.ClientTickEvent clientTickEvent) {
        h = s;
        s = 0;
        for (Integer n : a) {
            s += n.intValue();
        }
        a.clear();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
