/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.server.management.PlayerList
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.g9;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class g9.a.a
implements IMessageHandler<g9, IMessage> {
    public IMessage a(g9 g92, MessageContext messageContext) {
        if (!g92.c || messageContext.side != Side.SERVER) {
            System.out.println("received an invalid message @ClaimTribe :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            List<ff> list = ax.n(g92.d);
            EyeAndKoboldColor eyeAndKoboldColor = null;
            for (ff object2 : list) {
                if (object2.J()) continue;
                EntityDataManager entityDataManager = object2.func_184212_Q();
                entityDataManager.func_187227_b(em.v, (Object)g92.a.toString());
                entityDataManager.func_187227_b(ff.aU, (Object)g92.b);
                eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)entityDataManager.func_187225_a(ff.N));
            }
            if (eyeAndKoboldColor == null) {
                return;
            }
            PlayerList playerList = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al();
            String string = messageContext.getServerHandler().field_147369_b.func_70005_c_();
            for (EntityPlayer entityPlayer : playerList.func_181057_v()) {
                entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s formed the " + eyeAndKoboldColor.getTextColor() + "%s " + TextFormatting.WHITE + "Tribe", string, g92.b)));
            }
            ax.a(g92.d, true);
            ax.a(g92.d, messageContext.getServerHandler().field_147369_b.getPersistentID());
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
