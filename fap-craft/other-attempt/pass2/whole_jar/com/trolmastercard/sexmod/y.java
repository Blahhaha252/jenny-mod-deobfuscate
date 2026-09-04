/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class y {
    public static final int a = 3;

    @SideOnly(value=Side.CLIENT)
    public static BufferedImage a(UUID uUID) throws IOException {
        StringBuilder stringBuilder;
        URL uRL = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uUID.toString().replace("-", ""));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
        String string = bufferedReader.lines().collect(Collectors.joining());
        int n2 = string.indexOf("\"value\" : ");
        int n3 = n2 + 11;
        StringBuilder stringBuilder2 = new StringBuilder();
        int n4 = 0;
        while (string.charAt(n3 + n4) != '\"') {
            stringBuilder2.append(string.charAt(n3 + n4));
            ++n4;
        }
        try {
            String string2 = new String(Base64.getDecoder().decode(stringBuilder2.toString()));
            int n5 = string2.indexOf("\"url\" : ");
            int n6 = n5 + 9;
            stringBuilder = new StringBuilder();
            int n7 = 0;
            while (string2.charAt(n6 + n7) != '\"') {
                stringBuilder.append(string2.charAt(n6 + n7));
                ++n7;
            }
        }
        catch (Exception exception) {
            return ImageIO.read(Minecraft.func_71410_x().func_110442_L().func_110536_a(new ResourceLocation("sexmod", "textures/player/steve.png")).func_110527_b());
        }
        URL uRL2 = new URL(stringBuilder.toString());
        return ImageIO.read(uRL2);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

