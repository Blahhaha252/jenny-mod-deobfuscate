/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.ServerData
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.Level
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.g6;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gw;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;
import software.bernie.geckolib3.geo.raw.pojo.Converter;
import software.bernie.geckolib3.geo.raw.pojo.RawGeoModel;
import software.bernie.geckolib3.geo.raw.tree.RawGeometryTree;
import software.bernie.geckolib3.geo.render.GeoBuilder;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.resource.GeckoLibCache;

public class br {
    public static final String a = "sexmod/custom_models";
    static final String b = "sexmod/custom_models/whitelisted_servers.txt";
    public static final String f = "sexmod_custom_models";
    static Map<String, b.b> c = new HashMap<String, b.b>();
    public static boolean d = false;
    public static boolean e = false;

    public static Map<String, b.b> i() {
        return c;
    }

    public static boolean f(String string) {
        return c.get(string) != null;
    }

    public static int b(boolean bl2) {
        br.a(bl2);
        return br.c(bl2);
    }

    static void b(Level level, String string) {
        if (Main.proxy instanceof ClientProxy) {
            br.a(level, string);
        } else {
            Main.LOGGER.log(level, string);
        }
    }

    public static void a(boolean bl2) {
        if (bl2) {
            br.c();
        }
        c.clear();
    }

    public static void a() {
        ge.b.sendToServer((IMessage)new g6());
    }

    @SideOnly(value=Side.CLIENT)
    public static boolean b() {
        String string = br.g();
        if (string == null) {
            return false;
        }
        return br.l(string);
    }

    /*
     * Exception decompiling
     */
    public static void h(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static boolean l(String string) {
        return br.f().contains(string);
    }

    /*
     * Exception decompiling
     */
    static HashSet<String> f() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 4 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static float i(String string) {
        b.b b10 = c.get(string);
        if (b10 == null) {
            return 0.0f;
        }
        return b10.f();
    }

    @SideOnly(value=Side.CLIENT)
    static void c() {
        for (Map.Entry<String, b.b> entry : c.entrySet()) {
            b.b b10 = entry.getValue();
            if (b10 == null) continue;
            ResourceLocation resourceLocation = b10.c();
            ResourceLocation resourceLocation2 = b10.k();
            if (resourceLocation != null) {
                GeckoLibCache.getInstance().getGeoModels().remove(resourceLocation);
            }
            if (resourceLocation2 == null) continue;
            Minecraft.func_71410_x().field_71446_o.func_147645_c(resourceLocation2);
        }
    }

    @SideOnly(value=Side.CLIENT)
    static void a(Level level, String string) {
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        if (entityPlayerSP == null) {
            Main.LOGGER.log(level, string);
            return;
        }
        TextFormatting textFormatting = Level.DEBUG.equals((Object)level) ? TextFormatting.DARK_GREEN : (Level.ERROR.equals((Object)level) ? TextFormatting.RED : TextFormatting.WHITE);
        entityPlayerSP.func_145747_a((ITextComponent)new TextComponentString(textFormatting.toString() + string));
    }

    public static String h() {
        if (Main.proxy instanceof ClientProxy) {
            return br.d();
        }
        return f;
    }

    @SideOnly(value=Side.CLIENT)
    public static String d() {
        String string = br.g();
        if (string == null) {
            return "sexmod/custom_models/singleplayer";
        }
        return "sexmod/custom_models/" + string;
    }

    @SideOnly(value=Side.CLIENT)
    @Nullable
    public static String g() {
        Minecraft minecraft = Minecraft.func_71410_x();
        ServerData serverData = minecraft.func_147104_D();
        if (serverData == null) {
            return null;
        }
        String string = serverData.field_78845_b;
        int n2 = string.indexOf(":");
        if (n2 != -1) {
            string = string.substring(0, n2);
        }
        return string;
    }

    public static int c(boolean bl2) {
        br.b(Level.INFO, "loading up custom models...");
        String string2 = br.h();
        File file2 = new File(string2);
        file2.mkdirs();
        String[] stringArray = file2.list((file, string) -> new File(file, string).isDirectory());
        if (stringArray == null) {
            br.b(Level.ERROR, String.format("Something is wrong with the custom models folder at '%s'. Check if it exists, if not - make the directory yourself because Minecraft cannot do it itself for some reason", file2.getAbsolutePath()));
            return -1;
        }
        br.b(Level.INFO, String.format("found %s custom model(s)", stringArray.length));
        int n2 = 0;
        for (String string3 : stringArray) {
            String string4 = br.a(string3, string2);
            if (!"".equals(string4)) {
                br.b(Level.ERROR, string4);
                return -1;
            }
            string4 = br.a(string3, string2, bl2);
            if (!"".equals(string4)) {
                br.b(Level.ERROR, string4);
                return -1;
            }
            ++n2;
        }
        br.b(Level.DEBUG, String.format("successfully registered %s custom models", n2));
        e = true;
        return 0;
    }

    public static String a(String string, String string2) {
        String string3 = String.format("%s/%s", string2, string);
        File file = new File(String.format("%s/%s.geo.json", string3, string));
        File file2 = new File(String.format("%s/%s.png", string3, string));
        File file3 = new File(String.format("%s/%s.cfg", string3, string));
        if (!file.exists()) {
            return String.format("couldn't find model File for '%s'. It should have been at '%s'. Are you sure it exists?", string, file.getAbsolutePath());
        }
        if (!file2.exists()) {
            return String.format("couldn't find texture File for '%s'. It should have been at '%s'. Are you sure it exists?", string, file2.getAbsolutePath());
        }
        if (!file3.exists()) {
            return String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", string, file3.getAbsolutePath());
        }
        return "";
    }

    @SideOnly(value=Side.CLIENT)
    static ResourceLocation a(String string, File file) throws Exception {
        BufferedImage bufferedImage = ImageIO.read(file);
        return Minecraft.func_71410_x().field_71446_o.func_110578_a(string, new DynamicTexture(bufferedImage));
    }

    @SideOnly(value=Side.CLIENT)
    static RawGeoModel a(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (Object object = new BufferedReader(new FileReader(file));){
            String string;
            while ((string = ((BufferedReader)object).readLine()) != null) {
                stringBuilder.append(string);
            }
        }
        object = stringBuilder.toString();
        return Converter.fromJsonString((String)object);
    }

    public static String a(String string, String string2, boolean bl2) {
        if (c.get(string) != null) {
            return String.format("already registered '%s'... honestly, unsure how this could happen lol", string);
        }
        String string3 = String.format("%s/%s/", string2, string);
        String string4 = string3 + string + ".cfg";
        File file = new File(string4);
        if (!file.exists()) {
            return String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", string, string4);
        }
        b.b b10 = new b.b(file, string);
        if (b10.h != null) {
            return b10.h;
        }
        String string5 = string3 + string + ".png";
        File file2 = new File(string5);
        if (!file2.exists()) {
            return String.format("The texture for the custom model '%s' couldn't be found at '%s' are you sure it exists?", string, string5);
        }
        ResourceLocation resourceLocation = null;
        if (bl2) {
            try {
                resourceLocation = br.a(string, file2);
            }
            catch (IOException iOException) {
                return String.format("The texture for the custom model '%s' at '%s' appears to be corrupted. Try making a new one", string, string5);
            }
            catch (Exception exception) {
                return String.format("Couldn't load the texture for the custom model '%s' at '%s'. Maybe try increasing the amount of RAM of ur Minecraft client", string, file2);
            }
        }
        ResourceLocation resourceLocation2 = new ResourceLocation("sexmod", string + "Model");
        String string6 = string3 + string + ".geo.json";
        File file3 = new File(string6);
        if (!file3.exists()) {
            return String.format("The geo model for the custom model '%s' couldn't be found at '%s' are you sure it exists?", string, string6);
        }
        if (bl2) {
            RawGeoModel rawGeoModel;
            try {
                rawGeoModel = br.a(file3);
            }
            catch (IOException iOException) {
                return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", string, string6);
            }
            try {
                RawGeometryTree rawGeometryTree = RawGeometryTree.parseHierarchy(rawGeoModel, resourceLocation2);
                GeoModel geoModel = GeoBuilder.getGeoBuilder(resourceLocation2.func_110624_b()).constructGeoModel(rawGeometryTree);
                GeckoLibCache.getInstance().getGeoModels().put(resourceLocation2, geoModel);
            }
            catch (Exception exception) {
                return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", string, string6);
            }
        }
        if (bl2) {
            b10.b(resourceLocation2);
            b10.a(resourceLocation);
        }
        c.put(string, b10);
        br.b(Level.DEBUG, String.format("successfully registered custom model '%s'", string));
        return "";
    }

    public static ResourceLocation k(String string) {
        b.b b10 = c.get(string);
        if (b10 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The custom model for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return null;
        }
        return b10.c();
    }

    public static ResourceLocation c(String string) {
        b.b b10 = c.get(string);
        if (b10 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The custom texture for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return null;
        }
        return b10.k();
    }

    public static GeoModel j(String string) {
        return GeckoLibCache.getInstance().getGeoModels().get(br.k(string));
    }

    public static gw e(String string) {
        b.b b10 = c.get(string);
        if (b10 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The ClothingType for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return gw.HEAD;
        }
        return b10.d;
    }

    public static HashSet<fy> a(String string) {
        b.b b10 = c.get(string);
        if (b10 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The HashSet<GirlType> for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return null;
        }
        return b10.g;
    }

    public static HashSet<String> g(String string) {
        b.b b10 = c.get(string);
        if (b10 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The HashSet<String> for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return new HashSet<String>();
        }
        return b10.b;
    }

    public static String d(String string) {
        b.b b10 = c.get(string);
        if (b10 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The author for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return "";
        }
        return b10.k;
    }

    @Nullable
    public static b.b b(String string) {
        return c.get(string);
    }

    public static HashMap<gw, List<String>> a(em em2) {
        HashMap<gw, List<String>> hashMap = new HashMap<gw, List<String>>();
        for (Object object : gw.values()) {
            hashMap.put((gw)((Object)object), new ArrayList());
        }
        for (Map.Entry entry : c.entrySet()) {
            Object object;
            String string = (String)entry.getKey();
            object = (b.b)entry.getValue();
            gw gw2 = ((b.b)object).d;
            List<String> list = hashMap.get((Object)gw2);
            if (!((b.b)object).g.isEmpty() && !((b.b)object).g.contains((Object)fy.a((Entity)em2))) continue;
            list.add(string);
            hashMap.put(gw2, list);
        }
        return hashMap;
    }

    public static HashMap<String, Float> e() {
        HashMap<String, Float> hashMap = new HashMap<String, Float>();
        for (Map.Entry<String, b.b> entry : br.i().entrySet()) {
            hashMap.put(entry.getKey(), Float.valueOf(entry.getValue().f()));
        }
        return hashMap;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

