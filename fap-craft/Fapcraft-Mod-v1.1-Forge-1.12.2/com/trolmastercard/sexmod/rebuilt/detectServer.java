package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.Main;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
// was class g0
public class detectServer {
    // was a()
    public static boolean isServer() {
        // String string
        String threadName = Thread.currentThread().getName().toLowerCase();

        if (threadName.contains("server")) {
            return true;
        } else if (threadName.contains("client")) {
            return false;
        }
        // was MinecraftServer minecraftServer
        MinecraftServer mcServer = FMLCommonHandler.instance().getMinecraftServerInstance();

        if (mcServer == null) {
            return false;
        }
        // was b1
        boolean bool1 = mcServer.isCallingFromMinecraftThread();
        Main.LOGGER.warn(
                "couldn't clarify if is running on a server or client thread. " +
                "Came to the solution onServer=" + bool1
        );

        return bool1;
    }
}