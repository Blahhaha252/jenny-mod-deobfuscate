package com.trolmaster.sexmod;

import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.g6;
import com.trolmastercard.sexmod.ge;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class aw extends CommandBase {
    public static final aw INSTANCE = new aw();
    
    @Override
    public String getName() {
        return "reloadcustommodels";
    }
    
    @Override
    public String getUsage() {
        return "/reloadcustommodels";
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return 2;
    }
    
    @Override
    public void execute(MinecraftServer mcServer, ICommandSender sender, String[] args) throws CommandException {
        for (EntityPlayerMP entity : mcServer.getPlayerList().getPlayers()) {
            mcServer.addScheduledTask(() -> ge.b.sendTo((IMessage) new g6(br.e()), entity));
        }
    }
}