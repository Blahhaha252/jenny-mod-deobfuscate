package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.c8;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.gw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import net.minecraft.util.ResourceLocation;

import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.em;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



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
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
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

    public static int b(boolean bl) {
        br.a(bl);
        return br.c(bl);
    }

    static void b(Level level, String string) {
        if (Main.proxy instanceof ClientProxy) {
            br.a(level, string);
        } else {
            Main.LOGGER.log(level, string);
        }
    }

    public static void a(boolean bl) {
        if (bl) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static float i(String string) {
        b.b b2 = c.get(string);
        if (b2 == null) {
            return 0.0f;
        }
        return b2.f();
    }

    @SideOnly(value=Side.CLIENT)
    static void c() {
        for (Map.Entry<String, b.b> entry : c.entrySet()) {
            b.b b2 = entry.getValue();
            if (b2 == null) continue;
            ResourceLocation resourceLocation = b2.c();
            ResourceLocation resourceLocation2 = b2.k();
            if (resourceLocation != null) {
                GeckoLibCache.getInstance().getGeoModels().remove(resourceLocation);
            }
            if (resourceLocation2 == null) continue;
            Minecraft.getMinecraft().renderEngine.deleteTexture(resourceLocation2);
        }
    }

    @SideOnly(value=Side.CLIENT)
    static void a(Level level, String string) {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP == null) {
            Main.LOGGER.log(level, string);
            return;
        }
        TextFormatting textFormatting = Level.DEBUG.equals((Object)level) ? TextFormatting.DARK_GREEN : (Level.ERROR.equals((Object)level) ? TextFormatting.RED : TextFormatting.WHITE);
        entityPlayerSP.sendMessage((ITextComponent)new TextComponentString(textFormatting.toString() + string));
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
        Minecraft minecraft = Minecraft.getMinecraft();
        ServerData serverData = minecraft.getCurrentServerData();
        if (serverData == null) {
            return null;
        }
        String string = serverData.serverIP;
        int n2 = string.indexOf(":");
        if (n2 != -1) {
            string = string.substring(0, n2);
        }
        return string;
    }

    public static int c(boolean bl) {
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
            string4 = br.a(string3, string2, bl);
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
        return Minecraft.getMinecraft().renderEngine.getDynamicTextureLocation(string, new DynamicTexture(bufferedImage));
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

    public static String a(String string, String string2, boolean bl) {
        if (c.get(string) != null) {
            return String.format("already registered '%s'... honestly, unsure how this could happen lol", string);
        }
        String string3 = String.format("%s/%s/", string2, string);
        String string4 = string3 + string + ".cfg";
        File file = new File(string4);
        if (!file.exists()) {
            return String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", string, string4);
        }
        b.b b2 = new b.b(file, string);
        if (b2.h != null) {
            return b2.h;
        }
        String string5 = string3 + string + ".png";
        File file2 = new File(string5);
        if (!file2.exists()) {
            return String.format("The texture for the custom model '%s' couldn't be found at '%s' are you sure it exists?", string, string5);
        }
        ResourceLocation resourceLocation = null;
        if (bl) {
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
        if (bl) {
            RawGeoModel rawGeoModel;
            try {
                rawGeoModel = br.a(file3);
            }
            catch (IOException iOException) {
                return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", string, string6);
            }
            try {
                RawGeometryTree rawGeometryTree = RawGeometryTree.parseHierarchy((RawGeoModel)rawGeoModel, (ResourceLocation)resourceLocation2);
                GeoModel geoModel = GeoBuilder.getGeoBuilder((String)resourceLocation2.getNamespace()).constructGeoModel(rawGeometryTree);
                GeckoLibCache.getInstance().getGeoModels().put(resourceLocation2, geoModel);
            }
            catch (Exception exception) {
                return String.format("The geo model for the custom model '%s' at '%s' appears to be corrupted. Try replacing it.", string, string6);
            }
        }
        if (bl) {
            b2.b(resourceLocation2);
            b2.a(resourceLocation);
        }
        c.put(string, b2);
        br.b(Level.DEBUG, String.format("successfully registered custom model '%s'", string));
        return "";
    }

    public static ResourceLocation k(String string) {
        b.b b2 = c.get(string);
        if (b2 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The custom model for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return null;
        }
        return b2.c();
    }

    public static ResourceLocation c(String string) {
        b.b b2 = c.get(string);
        if (b2 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The custom texture for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return null;
        }
        return b2.k();
    }

    public static GeoModel j(String string) {
        return (GeoModel)GeckoLibCache.getInstance().getGeoModels().get(br.k(string));
    }

    public static gw e(String string) {
        b.b b2 = c.get(string);
        if (b2 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The ClothingType for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return gw.HEAD;
        }
        return b2.d;
    }

    public static HashSet<fy> a(String string) {
        b.b b2 = c.get(string);
        if (b2 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The HashSet<GirlType> for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return null;
        }
        return b2.g;
    }

    public static HashSet<String> g(String string) {
        b.b b2 = c.get(string);
        if (b2 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The HashSet<String> for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return new HashSet<String>();
        }
        return b2.b;
    }

    public static String d(String string) {
        b.b b2 = c.get(string);
        if (b2 == null) {
            if (!string.equals("cross")) {
                System.out.printf("The author for '%s', hasn't been registered, but gamers tried to use it anyways. Crash is imminent%n", string);
            }
            return "";
        }
        return b2.k;
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

    @SideOnly(value=Side.CLIENT)
    public static class a$a {
        boolean a = false;

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(ClientChatEvent clientChatEvent) {
            String string = clientChatEvent.getOriginalMessage();
            if (!"id".equals(string)) {
                return;
            }
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            List list = entityPlayerSP.world.getEntitiesWithinAABB(em.class, entityPlayerSP.getEntityBoundingBox().grow(10.0));
            em em2 = null;
            for (em em3 : list) {
                if (em2 == null) {
                    em2 = em3;
                    continue;
                }
                if (!(entityPlayerSP.getDistance((Entity)em3) < entityPlayerSP.getDistance((Entity)em2))) continue;
                em2 = em3;
            }
            if (em2 == null) {
                return;
            }
            entityPlayerSP.sendStatusMessage((ITextComponent)new TextComponentString(em2.f().toString()), false);
            clientChatEvent.setCanceled(true);
        }

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
            Minecraft minecraft = Minecraft.getMinecraft();
            minecraft.addScheduledTask(() -> br.c(true));
            this.a = false;
        }

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(EntityJoinWorldEvent entityJoinWorldEvent) {
            block2: {
                if (!entityJoinWorldEvent.getEntity().equals((Object)Minecraft.getMinecraft().player)) {
                    return;
                }
                if (this.a) {
                    return;
                }
                this.a = true;
                if (!br.b()) break block2;
                br.a();
            }
        }

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
            Minecraft.getMinecraft().addScheduledTask(() -> br.a(true));
            this.a = false;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}

@SideOnly(value=Side.CLIENT)
public static class br.a.a {
    boolean a = false;

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(ClientChatEvent clientChatEvent) {
        String string = clientChatEvent.getOriginalMessage();
        if (!"id".equals(string)) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        List list = entityPlayerSP.world.getEntitiesWithinAABB(em.class, entityPlayerSP.getEntityBoundingBox().grow(10.0));
        em em2 = null;
        for (em em3 : list) {
            if (em2 == null) {
                em2 = em3;
                continue;
            }
            if (!(entityPlayerSP.getDistance((Entity)em3) < entityPlayerSP.getDistance((Entity)em2))) continue;
            em2 = em3;
        }
        if (em2 == null) {
            return;
        }
        entityPlayerSP.sendStatusMessage((ITextComponent)new TextComponentString(em2.f().toString()), false);
        clientChatEvent.setCanceled(true);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.addScheduledTask(() -> br.c(true));
        this.a = false;
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(EntityJoinWorldEvent entityJoinWorldEvent) {
        block2: {
            if (!entityJoinWorldEvent.getEntity().equals((Object)Minecraft.getMinecraft().player)) {
                return;
            }
            if (this.a) {
                return;
            }
            this.a = true;
            if (!br.b()) break block2;
            br.a();
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        Minecraft.getMinecraft().addScheduledTask(() -> br.a(true));
        this.a = false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
public static class br.b.b {
    gw d;
    HashSet<fy> g = new HashSet();
    HashSet<String>b = new HashSet();
    String k;
    String j;
    boolean c;
    
}

public static class br.b.b {
    gw d;
    HashSet<fy> g = new HashSet();
    HashSet<String> b = new HashSet();
    String k;
    String j;
    boolean c;
    c8 e;
    float m = 1.0f;
    float a = 0.0f;
    ResourceLocation i;
    ResourceLocation f;
    public String h = null;
    float l;

    public br.b.b(File file, String string) {
        String string2;
        String string3;
        FileInputStream fileInputStream;
        if (string.contains(" ") || string.contains("#") || string.contains("$")) {
            this.h = String.format("You cannot call your custom model '%s'. '#', '$' and spaces are illegal characters", string);
            return;
        }
        if ("cross".equalsIgnoreCase(string)) {
            this.h = "You cannot call your custom model 'cross'. Im sorry, but I need that specific name for internal stuff";
            return;
        }
        Properties properties = new Properties();
        try {
            fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            this.h = String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", string, file.getAbsolutePath());
            return;
        }
        try {
            properties.load(fileInputStream);
        }
        catch (IOException iOException) {
            this.h = String.format("couldn't read the cfg File for '%s' at '%s'. It appears to be corrupted. Try making a new one", string, file.getAbsolutePath());
            return;
        }
        String string32 = properties.getProperty("wear_type");
        if (string32 == null) {
            this.h = String.format("The cfg File for the model '%s' at '%s' is missing the 'wear_type'. Go to the bottom of the cfg File and write 'wear_type=HEAD'. Check the cfg files of my examples to see what values for 'wear_type' are possible", string, file.getAbsolutePath());
            return;
        }
        try {
            string32 = string32.replace(" ", "");
            this.d = gw.valueOf(string32);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.h = String.format("you entered '%s' into the 'wear_type' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'wear_type", string32, string, file.getAbsolutePath());
            return;
        }
        if (gw.CUSTOM_BONE.equals((Object)this.d)) {
            this.j = properties.getProperty("custom_bone");
            if ("".equals(this.j)) {
                this.h = String.format("You selected CUSTOM_BONE as the 'wear_type' in the cfg file for '%s' at '%s', yet you left the 'custom_bone' field right underneath it empty. If you want ur model to be parented to a specific bone, you have to enter the name of that bone at the field 'custom_bone'.", string, file.getAbsolutePath());
                return;
            }
        }
        String string4 = properties.getProperty("which_girls");
        string4 = string4.replace(" ", "");
        String[] stringArray2 = string4.split(",");
        for (String stringArray3 : stringArray2) {
            try {
                if ("".equals(stringArray3)) continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.h = String.format("you entered '%s' as one of the girls, you put into the 'which_girls' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_girls'.", stringArray3, string, file.getAbsolutePath());
                return;
            }
            this.g.add(fy.valueOf(stringArray3));
        }
        Object object = properties.getProperty("which_lighting");
        if (object == null) {
            this.h = String.format("The %s's cfg file at '%s' doesn't contain the field 'which_lighting'. Go to the bottom of the cfg file and write either 'which_lighting=DEFAULT', 'which_lighting=SEXMOD', or 'which_lighting=NONE'.", string, file.getAbsolutePath());
            return;
        }
        object = ((String)object).replace(" ", "");
        try {
            this.e = c8.valueOf((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.h = String.format("you entered '%s' into the 'which_lighting' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_lighting'.", object, string, file.getAbsolutePath());
        }
        String string5 = properties.getProperty("author");
        this.k = string5 == null || "".equals(string5) ? "anon" : string5;
        String string6 = properties.getProperty("bones_to_hide");
        if (string6 != null && !"".equals(string6)) {
            string6 = string6.replace(" ", "");
            String[] stringArray = string6.split(",");
            this.b.addAll(Arrays.asList(stringArray));
        }
        if ((string3 = properties.getProperty("enable_when_nude")) == null) {
            this.c = false;
        } else {
            String string7 = string3.replace(" ", "");
            this.c = string7.equalsIgnoreCase("yes");
        }
        String string8 = properties.getProperty("gui_size_factor");
        if (string8 != null && !"".equals(string8)) {
            string8 = string8.replace(" ", "");
            string8 = string8.replace(",", ".");
            try {
                this.m = Float.parseFloat(string8);
            }
            catch (NumberFormatException numberFormatException) {
                this.h = String.format("you entered '%s' into the 'gui_size_factor' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_size_factor'.", string8, string, file.getAbsolutePath());
            }
        }
        if ((string2 = properties.getProperty("gui_vertical_positioning")) != null && !"".equals(string2)) {
            string2 = string2.replace(" ", "");
            string2 = string2.replace(",", ".");
            try {
                this.a = Float.parseFloat(string2);
            }
            catch (NumberFormatException numberFormatException) {
                this.h = String.format("you entered '%s' into the 'gui_vertical_positioning' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_vertical_positioning'.", string2, string, file.getAbsolutePath());
            }
        }
        String string9 = properties.getProperty("version");
        string9 = string9.replace(" ", "");
        string9 = string9.replace(",", ".");
        try {
            this.l = Float.parseFloat(string9);
        }
        catch (NumberFormatException numberFormatException) {
            this.h = String.format("you entered '%s' into the 'versionString' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'versionString'.", string9, string, file.getAbsolutePath());
        }
    }

    public String b() {
        return this.j;
    }

    public c8 i() {
        return this.e;
    }

    public float g() {
        return this.a;
    }

    public float d() {
        return this.m;
    }

    public gw j() {
        return this.d;
    }

    public HashSet<fy> l() {
        return this.g;
    }

    public String e() {
        return this.k;
    }

    public boolean a() {
        return this.c;
    }

    public HashSet<String> h() {
        return this.b;
    }

    public ResourceLocation k() {
        return this.i;
    }

    public void a(ResourceLocation resourceLocation) {
        this.i = resourceLocation;
    }

    public ResourceLocation c() {
        return this.f;
    }

    public void b(ResourceLocation resourceLocation) {
        this.f = resourceLocation;
    }

    public float f() {
        return this.l;
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }
}
