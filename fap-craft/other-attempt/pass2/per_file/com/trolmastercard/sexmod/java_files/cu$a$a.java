/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.commons.io.FileUtils
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.cu;
import com.trolmastercard.sexmod.ge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.FileUtils;

public static class cu.a.a
implements IMessageHandler<cu, IMessage> {
    static int a = 0;

    @SideOnly(value=Side.CLIENT)
    void a(String string) {
        Minecraft.func_71410_x().field_71439_g.func_145747_a((ITextComponent)new TextComponentString(string));
    }

    @SideOnly(value=Side.CLIENT)
    void a() {
        Minecraft.func_71410_x().func_152343_a(() -> br.b(true));
    }

    /*
     * Unable to fully structure code
     */
    public IMessage a(cu var1_1, MessageContext var2_2) {
        block19: {
            block17: {
                block18: {
                    if (!var1_1.d) {
                        System.out.println("received an invalid Message @DownloadServerModel :(");
                        return null;
                    }
                    if (!var2_2.side.isClient()) break block19;
                    if (!br.b()) {
                        return null;
                    }
                    var3_3 = var1_1.e;
                    var4_5 = var1_1.f;
                    var5_6 = var1_1.b;
                    var6_7 = br.h() + "/" + var3_3;
                    var7_8 = new File(var6_7);
                    var7_8.mkdirs();
                    var8_9 = new File(var6_7 + "/" + var3_3 + var4_5.ending);
                    var9_10 = new FileOutputStream(var8_9);
                    var10_13 = null;
                    var9_10.write(var5_6);
                    if (var9_10 == null) break block17;
                    if (var10_13 == null) break block18;
                    try {
                        var9_10.close();
                    }
                    catch (Throwable var11_15) {
                        var10_13.addSuppressed(var11_15);
                    }
                    break block17;
                }
                var9_10.close();
                break block17;
                catch (Throwable var11_16) {
                    try {
                        var10_13 = var11_16;
                        throw var11_16;
                    }
                    catch (Throwable var12_18) {
                        if (var9_10 == null) ** GOTO lbl46
                        if (var10_13 == null) ** GOTO lbl45
                        try {
                            block20: {
                                try {
                                    var9_10.close();
                                }
                                catch (Throwable var13_20) {
                                    var10_13.addSuppressed(var13_20);
                                }
                                break block20;
lbl45:
                                // 1 sources

                                var9_10.close();
                            }
                            throw var12_18;
                        }
                        catch (IOException var9_11) {
                            var9_11.printStackTrace();
                        }
                    }
                }
            }
            var9_12 = 0;
            var10_14 = cu.b$b.values().length;
            for (cu.b$b var14_22 : cu.b$b.values()) {
                if (!new File(var6_7 + "/" + var3_3 + var14_22.ending).exists()) continue;
                ++var9_12;
            }
            if (var9_12 == var10_14) {
                this.a(String.format("%sSuccessfully downloaded the custom model '%s%s%s'!", new Object[]{TextFormatting.GREEN, TextFormatting.YELLOW, var3_3, TextFormatting.GREEN}));
            } else {
                this.a(String.format("%sdownloading custom model '%s%s%s' (%s/%s)...", new Object[]{TextFormatting.GRAY, TextFormatting.YELLOW, var3_3, TextFormatting.GRAY, var9_12, var10_14}));
            }
            if (++cu.a.a.a < var1_1.a) {
                return null;
            }
            cu.a.a.a = 0;
            this.a();
            return null;
        }
        var3_4 = FMLCommonHandler.instance().getMinecraftServerInstance();
        var3_4.func_152344_a((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onMessage$2(com.trolmastercard.sexmod.cu net.minecraft.server.MinecraftServer net.minecraftforge.fml.common.network.simpleimpl.MessageContext ), ()V)((cu)var1_1, (MinecraftServer)var3_4, (MessageContext)var2_2));
        return null;
    }

    private static /* synthetic */ void lambda$onMessage$2(cu cu2, MinecraftServer minecraftServer, MessageContext messageContext) {
        List<String> list = cu2.c;
        ArrayList<cu> arrayList = new ArrayList<cu>();
        for (String object : list) {
            String string = "sexmod_custom_models/" + object;
            for (cu.b$b b$b2 : cu.b$b.values()) {
                File file = new File(string + "/" + object + b$b2.ending);
                if (!file.exists()) {
                    System.out.println(file.getAbsolutePath() + " doesnt exist lol");
                    continue;
                }
                byte[] byArray = null;
                try {
                    byArray = FileUtils.readFileToByteArray((File)file);
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
                if (byArray == null) continue;
                arrayList.add(new cu(byArray, b$b2, object));
            }
        }
        int n2 = arrayList.size();
        for (cu cu3 : arrayList) {
            cu3.a(n2);
            minecraftServer.func_152344_a(() -> ge.b.sendTo((IMessage)cu3, messageContext.getServerHandler().field_147369_b));
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}
