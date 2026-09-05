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
    // first thing order
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent fMLPreInitializationEvent) {
        GeckoLib.initialize();
        proxy.preInitRegistries(fMLPreInitializationEvent);
    }
    // second thing order
    @Mod.EventHandler
    public void init(FMLInitializationEvent fMLInitializationEvent) throws IOException {
        proxy.initRegistries(fMLInitializationEvent);
    }
    // third thing order
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
        File folder = new File("config");
        folder.mkdir();
        File json_config = new File("config/sexmod.json");
        
        if (!json_config.exists()) {
            json_config.createNewFile();
            FileWriter writer = new FileWriter(json_config);
            writer.write("{\"shouldGenBuildings\":true,\"shouldLoadOtherSkins\":false,\"allowFlying\":true}");
            writer.close();
        }
        StringBuilder settingsStr = new StringBuilder();
        BufferedReader buffer = new BufferedReader(new FileReader(json_config));
        Throwable e = null;
        try {
            String temp;
            while ((temp = buffer.readLine()) != null) {
                settingsStr.append(temp);
            }
        } catch (Throwable e2) {
            e = e2;
            throw e2;
        } finally {
            if (buffer != null) {
                if (e != null) {
                    try {
                        buffer.close();
                    }   catch (Throwable e2) {
                        e.addSuppressed(e2);
                    }
                } else {
                    buffer.close()
                }
            }
        }
        String settings = settingsStr.toString();
        if (!settings.contains("shouldGenBuildings")) {
            json_config.delete();
            json_config = new File("config/sexmod.json");
            json_config.createNewFile();
            FileWriter writer = FileWriter(json_config);
            writer.write("{\"shouldGenBuildings\":true,\"shouldLoadOtherSkins\":false,\"allowFlying\":true}");
            writer.close();
            
            g3.shouldGenerate = true;
            cv.d = false;
            ei.ag = true;
            return;
        }
        int shouldGen = settings.indexOf("shouldGenBuildings");
        int loadSkins = settings.indexOf("shouldLoadOtherSkins");
        int allowFlight = settings.indexOf("allowFlying");
        g3.shouldGenerate = 't' == settings.charAt(shouldGen + 20);
        cv.d = 't' == settings.charAt(loadSkins + 22);
        ei.ag = 't' == settings.charAt(allowFlight + 13);
    }

    static {
        LOGGER = LogManager.getLogger((String)"sexmod");
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

