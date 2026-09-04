/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.CommandException
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.entity.Entity
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.e3;
import com.trolmastercard.sexmod.em;
import java.util.ConcurrentModificationException;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class gn
extends CommandBase {
    public static final gn a = new gn();

    public String func_71517_b() {
        return "locatenearestgoblinlair";
    }

    public String func_71518_a(ICommandSender iCommandSender) {
        return "/locatenearestgoblinlair";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void func_184881_a(MinecraftServer minecraftServer, ICommandSender iCommandSender, String[] stringArray) throws CommandException {
        Entity entity = iCommandSender.func_174793_f();
        if (entity != null && entity.field_71093_bK != 0) {
            iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.YELLOW + "goblin lairs don't exist in the " + (entity.field_71093_bK == -1 ? TextFormatting.RED + "Nether" : TextFormatting.DARK_PURPLE + "End")));
            return;
        }
        e3 e32 = null;
        try {
            for (em em2 : em.ad()) {
                if (!(em2 instanceof e3)) continue;
                e3 e33 = (e3)em2;
                if (!e33.aX) continue;
                if (e32 == null) {
                    e32 = e33;
                    continue;
                }
                if (!(e33.func_174818_b(iCommandSender.func_180425_c()) < e32.func_174818_b(iCommandSender.func_180425_c()))) continue;
                e32 = e33;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        if (e32 == null) {
            iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.RED + "No nearby goblin lair found uwu"));
            return;
        }
        BlockPos blockPos = e32.func_180425_c();
        iCommandSender.func_145747_a((ITextComponent)new TextComponentString(String.format("%sgoblin lair found at %s%s %s%s %s%s", TextFormatting.YELLOW, TextFormatting.RED, blockPos.func_177958_n(), TextFormatting.GREEN, blockPos.func_177956_o(), TextFormatting.BLUE, blockPos.func_177952_p())));
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
