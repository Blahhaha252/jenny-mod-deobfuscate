/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.cu;
import com.trolmastercard.sexmod.g6;
import com.trolmastercard.sexmod.ge;
import java.util.ArrayList;
import java.util.Map;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class g6.a.a
implements IMessageHandler<g6, IMessage> {
    public IMessage a(g6 g62, MessageContext messageContext) {
        if (!g62.a) {
            System.out.println("received an invalid Message @RequestServerModelAvailability :(");
            return null;
        }
        if (messageContext.side.isClient()) {
            if (!br.b()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Map.Entry<String, Float> entry : g62.b.entrySet()) {
                String string = entry.getKey();
                if (!br.f(string)) {
                    arrayList.add(string);
                    continue;
                }
                float f = br.i(string);
                float f2 = entry.getValue().floatValue();
                if (!(f2 > f)) continue;
                arrayList.add(string);
            }
            return new cu(arrayList);
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> ge.b.sendTo((IMessage)new g6(br.e()), messageContext.getServerHandler().field_147369_b));
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
