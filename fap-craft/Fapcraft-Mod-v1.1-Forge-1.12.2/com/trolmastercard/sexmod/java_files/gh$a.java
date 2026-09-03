/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gh;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class gh.a
implements IMessageHandler<gh, IMessage> {
    public IMessage a(gh gh2, MessageContext messageContext) {
        block6: {
            block5: {
                try {
                    if (!gh2.b) {
                        System.out.println("recieved an unvalid message @SendChatMessage :(");
                        return null;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw gh.a.a(runtimeException);
                }
                try {
                    if (!messageContext.side.isClient()) break block5;
                    Minecraft.func_71410_x().field_71439_g.func_145747_a((ITextComponent)new TextComponentString(gh2.a));
                    break block6;
                }
                catch (RuntimeException runtimeException) {
                    throw gh.a.a(runtimeException);
                }
            }
            FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                Vec3d vec3d = em.g(gh2.c).get(0).M();
                ge.b.sendToAllAround((IMessage)new gh(gh2.a, gh2.d, gh2.c), new NetworkRegistry.TargetPoint(gh2.d, vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, 40.0));
            });
        }
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
