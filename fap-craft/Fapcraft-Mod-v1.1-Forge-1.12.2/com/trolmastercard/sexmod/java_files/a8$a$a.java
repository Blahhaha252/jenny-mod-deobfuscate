/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a8;
import java.util.EnumSet;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public static class a8.a.a
implements IMessageHandler<a8, IMessage> {
    public IMessage a(a8 a82, MessageContext messageContext) {
        if (!a82.b || messageContext.side != Side.SERVER) {
            System.out.println("received an invalid message @TeleportPlayer :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            try {
                System.out.println("teleporting player " + a82.c + " to " + a82.e);
                EntityPlayerMP entityPlayerMP = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_177451_a(UUID.fromString(a82.c));
                a82.a = MathHelper.func_76142_g((float)a82.a);
                a82.d = MathHelper.func_76142_g((float)a82.d);
                entityPlayerMP.func_70012_b(a82.e.field_72450_a, a82.e.field_72448_b, a82.e.field_72449_c, a82.a, a82.d);
                entityPlayerMP.func_70034_d(a82.a);
                entityPlayerMP.field_70159_w = 0.0;
                entityPlayerMP.field_70181_x = 0.0;
                entityPlayerMP.field_70179_y = 0.0;
                entityPlayerMP.field_71135_a.func_175089_a(a82.e.field_72450_a, a82.e.field_72448_b, a82.e.field_72449_c, a82.a, a82.d, EnumSet.noneOf(SPacketPlayerPosLook.EnumFlags.class));
            }
            catch (Exception exception) {
                System.out.println("couldn't find player with UUID: " + a82.c);
                System.out.println("could only find the following players:");
                System.out.println(FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_181058_b(true));
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
