/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b5;
import com.trolmastercard.sexmod.bd;
import com.trolmastercard.sexmod.fy;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public static class bd.a.a
implements IMessageHandler<bd, IMessage> {
    public IMessage a(bd bd2, MessageContext messageContext) {
        if (!bd2.c || messageContext.side != Side.CLIENT) {
            return null;
        }
        this.a(bd2.a);
        return null;
    }

    @SideOnly(value=Side.CLIENT)
    public void a(HashMap<fy, String> hashMap) {
        Minecraft minecraft = Minecraft.func_71410_x();
        minecraft.func_152344_a(() -> minecraft.func_147108_a((GuiScreen)new b5(hashMap)));
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
