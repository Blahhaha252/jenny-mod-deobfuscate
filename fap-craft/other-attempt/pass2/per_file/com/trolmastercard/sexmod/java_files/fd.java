/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.CommandException
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.IClientCommand
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.br;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.IClientCommand;

public class fd
extends CommandBase
implements IClientCommand {
    public static final fd a = new fd();

    public String func_71517_b() {
        return "whitelistserver";
    }

    public String func_71518_a(ICommandSender iCommandSender) {
        return "/whitelistserver";
    }

    public boolean allowUsageWithoutPrefix(ICommandSender iCommandSender, String string) {
        return false;
    }

    public boolean func_184882_a(MinecraftServer minecraftServer, ICommandSender iCommandSender) {
        return true;
    }

    public void func_184881_a(MinecraftServer minecraftServer, ICommandSender iCommandSender, String[] stringArray) throws CommandException {
        boolean bl;
        String string = br.g();
        if (string == null) {
            iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.YELLOW + "This is a multiplayer feature only"));
            return;
        }
        if (br.l(string)) {
            iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.GREEN + "Server is already whitelisted :)"));
            return;
        }
        boolean bl2 = bl = stringArray.length > 0 && "confirm".equals(stringArray[0]);
        if (!bl) {
            iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.YELLOW + "By whitelisting this server, you allow the server to send you the custom models that are used on it"));
            iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.RED + "ONLY WHITELIST SERVERS, WHOSE SERVER OWNER YOU KNOW AND TRUST"));
            iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.YELLOW + "to confirm your decision type:"));
            iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.GREEN + "/whitelistserver confirm"));
            return;
        }
        br.h(string);
        iCommandSender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.GREEN + "confirmed :)"));
        br.a();
    }

    private static CommandException a(CommandException commandException) {
        return commandException;
    }
}
