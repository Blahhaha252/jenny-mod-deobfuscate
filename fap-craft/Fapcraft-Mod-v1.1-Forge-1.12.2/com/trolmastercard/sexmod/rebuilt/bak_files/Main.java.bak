/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.ICommand
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventHandler
 *  net.minecraftforge.fml.common.Mod$Instance
 *  net.minecraftforge.fml.common.SidedProxy
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPostInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLServerStartingEvent
 *  net.minecraftforge.fml.common.event.FMLServerStoppedEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.CommonProxy;
import com.trolmastercard.sexmod.aw;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.bj;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.d6;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.fs;
import com.trolmastercard.sexmod.g3;
import com.trolmastercard.sexmod.gm;
import com.trolmastercard.sexmod.gn;
import com.trolmastercard.sexmod.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import net.minecraft.command.ICommand;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(modid="sexmod", name="Fapcraft", version="1.1.0", dependencies="after:geckolib")
public class Main {
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide="com.trolmastercard.sexmod.ClientProxy", serverSide="com.trolmastercard.sexmod.CommonProxy")
    public static CommonProxy proxy;
    public static final Logger LOGGER;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent fMLPreInitializationEvent) {
        GeckoLib.initialize();
        proxy.preInitRegistries(fMLPreInitializationEvent);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent fMLInitializationEvent) throws IOException {
        proxy.initRegistries(fMLInitializationEvent);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent fMLPostInitializationEvent) throws IOException {
        proxy.postInit(fMLPostInitializationEvent);
    }

    @Mod.EventHandler
    public static void onWorldClosed(FMLServerStoppedEvent fMLServerStoppedEvent) {
        block0: {
            em.ad().clear();
            ax.a();
            ff.aY.clear();
            v.a();
            g3.b().a();
            fs.a();
            br.e = false;
            bj.a();
            if (FMLCommonHandler.instance().getSide() != Side.CLIENT) break block0;
            Main.clientReset();
        }
    }

    @Mod.EventHandler
    public static void onWorldStart(FMLServerStartingEvent fMLServerStartingEvent) {
        fMLServerStartingEvent.registerServerCommand((ICommand)gn.a);
        fMLServerStartingEvent.registerServerCommand((ICommand)aw.a);
    }

    @SideOnly(value=Side.CLIENT)
    static void clientReset() {
        gm.a();
        d6.c();
    }

    @SideOnly(value=Side.CLIENT)
    @Mod.EventHandler
    public void registerReplacedRenderers(FMLInitializationEvent fMLInitializationEvent) {
        GeckoLib.initialize();
    }

    public static void setConfigs() throws IOException {
        Appendable appendable;
        File file = new File("config");
        file.mkdir();
        File file2 = new File("config/sexmod.json");
        if (!file2.exists()) {
            file2.createNewFile();
            appendable = new FileWriter(file2);
            ((Writer)appendable).write("{\"shouldGenBuildings\":true,\"shouldLoadOtherSkins\":false,\"allowFlying\":true}");
            ((OutputStreamWriter)appendable).close();
        }
        appendable = new StringBuilder();
        Object object = new BufferedReader(new FileReader(file2));
        Object object2 = null;
        try {
            String string;
            while ((string = ((BufferedReader)object).readLine()) != null) {
                ((StringBuilder)appendable).append(string);
            }
        }
        catch (Throwable throwable) {
            object2 = throwable;
            throw throwable;
        }
        finally {
            if (object != null) {
                if (object2 != null) {
                    try {
                        ((BufferedReader)object).close();
                    }
                    catch (Throwable throwable) {
                        ((Throwable)object2).addSuppressed(throwable);
                    }
                } else {
                    ((BufferedReader)object).close();
                }
            }
        }
        object = ((StringBuilder)appendable).toString();
        if (!((String)object).contains("shouldGenBuildings")) {
            file2.delete();
            file2 = new File("config/sexmod.json");
            file2.createNewFile();
            object2 = new FileWriter(file2);
            ((Writer)object2).write("{\"shouldGenBuildings\":true,\"shouldLoadOtherSkins\":false,\"allowFlying\":true}");
            ((OutputStreamWriter)object2).close();
            g3.i = true;
            cv.d = false;
            ei.ag = true;
            return;
        }
        int n2 = ((String)object).indexOf("shouldGenBuildings");
        int n3 = ((String)object).indexOf("shouldLoadOtherSkins");
        int n4 = ((String)object).indexOf("allowFlying");
        g3.i = 't' == ((String)object).charAt(n2 + 20);
        cv.d = 't' == ((String)object).charAt(n3 + 22);
        ei.ag = 't' == ((String)object).charAt(n4 + 13);
    }

    static {
        LOGGER = LogManager.getLogger((String)"sexmod");
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

