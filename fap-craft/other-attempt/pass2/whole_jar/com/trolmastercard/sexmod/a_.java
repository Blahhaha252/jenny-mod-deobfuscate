/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.CommandException
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.IClientCommand
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.IClientCommand;

public class a_
extends CommandBase
implements IClientCommand {
    static final String d = "sexmod/futa";
    static final int a = 10;
    static final float c = 0.025f;
    public static boolean e = true;
    public static final a_ b = new a_();

    public a_() {
        block4: {
            String string = "";
            try {
                string = new BufferedReader(new FileReader(d)).readLine().toLowerCase();
            }
            catch (Exception exception) {
                // empty catch block
            }
            if ("".equals(string)) {
                return;
            }
            if ("true".equals(string)) {
                e = true;
            }
            if (!"false".equals(string)) break block4;
            e = false;
        }
    }

    public String func_71517_b() {
        return "futa";
    }

    public String func_71518_a(ICommandSender iCommandSender) {
        return "/futa <true|false>";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void func_184881_a(MinecraftServer var1_1, ICommandSender var2_2, String[] var3_3) throws CommandException {
        if (var3_3.length < 1) {
            this.a(var2_2);
            return;
        }
        var4_4 = var3_3[0].toLowerCase();
        if ("true".equals(var4_4)) {
            a_.e = true;
        } else {
            if (!"false".equals(var4_4)) {
                this.a(var2_2);
                return;
            }
            a_.e = false;
        }
        try {
            var5_5 = new FileWriter("sexmod/futa");
            var5_5.write(var4_4);
            var5_5.close();
        }
        catch (IOException var5_6) {
            var5_6.printStackTrace();
        }
        try lbl-1000:
        // 4 sources

        {
            for (em var6_8 : em.ad()) {
                if (var6_8.field_70128_L) {
                    continue;
                }
                ** GOTO lbl-1000
            }
            return;
        }
        catch (ConcurrentModificationException var5_7) {
            // empty catch block
            return;
        }
lbl-1000:
        // 1 sources

        {
            if (!var6_8.field_70170_p.field_72995_K || !(var6_8 instanceof f_)) ** GOTO lbl-1000
        }
        {
            var7_9 = var6_8.b("cockParticles").func_178787_e(var6_8.func_174791_d());
            var8_10 = var6_8.func_70681_au();
            for (var9_11 = 0; var9_11 < 10; ++var9_11) {
                var6_8.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, var7_9.field_72450_a, var7_9.field_72448_b, var7_9.field_72449_c, (double)(var8_10.nextFloat() * 0.025f * (float)be.a()), (double)(var8_10.nextFloat() * 0.025f * (float)be.a()), (double)(var8_10.nextFloat() * 0.025f * (float)be.a()), new int[0]);
            }
            ** GOTO lbl-1000
        }
    }

    void a(ICommandSender iCommandSender) {
        iCommandSender.func_145747_a((ITextComponent)new TextComponentString(String.format("%sYou can either do %s/futa true %sor %s/futa false", TextFormatting.YELLOW, TextFormatting.GRAY, TextFormatting.YELLOW, TextFormatting.GRAY)));
    }

    public boolean allowUsageWithoutPrefix(ICommandSender iCommandSender, String string) {
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

