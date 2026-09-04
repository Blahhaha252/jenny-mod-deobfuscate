/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.ClientChatEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.eu;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.w;
import java.util.UUID;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class w {
    public static w a;
    private a.a b;

    public void a() {
        block1: {
            float f10;
            if (w.a.b == null) {
                return;
            }
            w.a.b.e -= 1.0f;
            if (!(f10 <= 0.0f)) break block1;
            Minecraft.func_71410_x().field_71439_g.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.DARK_PURPLE + I18n.func_135052_a((String)"genderswap.sexpromt.timeout", (Object[])new Object[0])));
            this.c();
        }
    }

    public a.a b() {
        return w.a.b;
    }

    void c() {
        w.a.b = null;
    }

    public void a(@Nonnull a.a a10) {
        World world = Minecraft.func_71410_x().field_71439_g.field_70170_p;
        EntityPlayer entityPlayer = world.func_152378_a(a10.d);
        EntityPlayer entityPlayer2 = world.func_152378_a(a10.c);
        if (entityPlayer2 == null || entityPlayer == null) {
            return;
        }
        TextComponentString textComponentString = new TextComponentString(TextFormatting.LIGHT_PURPLE + (a10.b ? entityPlayer2.func_70005_c_() : entityPlayer.func_70005_c_()) + " " + TextFormatting.DARK_PURPLE + I18n.func_135052_a((String)"genderswap.sexpromt.playerxaskedfory", (Object[])new Object[0]) + " " + TextFormatting.LIGHT_PURPLE + I18n.func_135052_a((String)a10.a, (Object[])new Object[0]));
        TextComponentString textComponentString2 = new TextComponentString(TextFormatting.DARK_PURPLE + I18n.func_135052_a((String)"genderswap.sexpromt.autodeletion", (Object[])new Object[0]));
        TextComponentString textComponentString3 = new TextComponentString(TextFormatting.DARK_PURPLE + "[ " + TextFormatting.LIGHT_PURPLE + I18n.func_135052_a((String)"genderswap.sexpromt.accept", (Object[])new Object[0]) + TextFormatting.DARK_PURPLE + " | " + TextFormatting.LIGHT_PURPLE + I18n.func_135052_a((String)"genderswap.sexpromt.decline", (Object[])new Object[0]) + TextFormatting.DARK_PURPLE + " ]");
        entityPlayer.func_145747_a((ITextComponent)textComponentString);
        entityPlayer.func_145747_a((ITextComponent)textComponentString2);
        entityPlayer.func_145747_a((ITextComponent)textComponentString3);
        this.b = a10;
    }

    @SubscribeEvent
    public void a(ClientChatEvent clientChatEvent) {
        block2: {
            if (a.b() == null) {
                return;
            }
            String string = clientChatEvent.getMessage().toLowerCase();
            if (string.equals(I18n.func_135052_a((String)"genderswap.sexpromt.accept", (Object[])new Object[0]).toLowerCase())) {
                a.a a10 = a.b();
                this.a(a10.a, a10.d, a10.c);
                this.c();
                clientChatEvent.setCanceled(true);
            }
            if (!string.equals(I18n.func_135052_a((String)"genderswap.sexpromt.decline", (Object[])new Object[0]).toLowerCase())) break block2;
            Minecraft.func_71410_x().field_71439_g.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.DARK_PURPLE + I18n.func_135052_a((String)"genderswap.sexpromt.declineconformation", (Object[])new Object[0])));
            this.c();
            clientChatEvent.setCanceled(true);
        }
    }

    void a(String string, UUID uUID, UUID uUID2) {
        ge.b.sendToServer((IMessage)new eu(uUID, uUID2, string));
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

