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
// was gn
public class NearestGoblinCommand extends CommandBase {
    public static final NearestGoblinCommand INSTANCE =
        new NearestGoblinCommand();
    
    public void execute(MinecraftServer server, IcommandSender sender, String[] args) throws CommandException {
        Entity entity = sender.getCommandSenderEntity;
        
        
        // If sender is in Nether/End, reject the command
        if (entity != null && entity.dimension != 0) {
            String dimension = 
                entity.dimension == -1
                    ? TextFormatting.RED + "Nether"
                    : TextFormatting.DARK_PURPLE + "End";

            sender.sendMessage(
                new TextComponentString(
                    TextFormatting.YELLOW +
                    "goblin lairs don't exist in the " +
                    dimension
                )
            );

            return;
        }

        e3 nearestLair = null;

        try {
            for (em entity2 : em.ad()) {
                if (!(entity2 instanceof e3)) {
                    continue;
                }

                e3 lair = (e3) entity2;

                if (!lair.aX) {
                    continue;
                }

                if (nearestLair == null ||
                    lair.func_174818_b(sender.getPosition()) <
                    nearestLair.func_174818_b(sender.getPosition())) {

                    nearestLair = lair;
                }
            }
        }
        catch (ConcurrentModificationException ignored) {
        }

        if (nearestLair == null) {
            sender.sendMessage(
                new TextComponentString(
                    TextFormatting.RED +
                    "No nearby goblin lair found uwu"
                )
            );
            return;
        }

        BlockPos pos = nearestLair.getPosition();

        sender.sendMessage(
            new TextComponentString(
                String.format(
                    "%sgoblin lair found at %s%s %s%s %s%s",
                    TextFormatting.YELLOW,
                    TextFormatting.RED, pos.getX(),
                    TextFormatting.GREEN, pos.getY),
                    TextFormatting.BLUE, pos.getZ()
                )
            )
        );
    }
}