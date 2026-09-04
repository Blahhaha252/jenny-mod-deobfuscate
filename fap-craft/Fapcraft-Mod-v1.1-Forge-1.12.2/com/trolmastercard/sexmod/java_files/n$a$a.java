/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fn;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.n;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public static class n.a.a
implements IMessageHandler<n, IMessage> {
    public IMessage a(n n2, MessageContext messageContext) {
        if (!n2.b) {
            System.out.println("received an invalid message @ChangeDataParameter :(");
            return null;
        }
        FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            em em2 = em.a(n2.d);
            if (em2 == null) {
                return;
            }
            switch (n2.a) {
                case "pregnant": {
                    em2.func_184212_Q().func_187227_b(fn.U, (Object)Integer.valueOf(n2.c));
                    break;
                }
                case "currentModel": {
                    em2.func_184212_Q().func_187227_b(em.D, (Object)Integer.valueOf(n2.c));
                    break;
                }
                case "currentAction": {
                    if (fp.valueOf(n2.c) == fp.ATTACK && em2.y() != fp.NULL) break;
                    em2.b(fp.valueOf(n2.c));
                    break;
                }
                case "animationFollowUp": {
                    em2.func_184212_Q().func_187227_b(em.h, (Object)n2.c);
                    break;
                }
                case "playerSheHasSexWith": {
                    if (n2.c.equals("null")) {
                        em2.e((UUID)null);
                        break;
                    }
                    em2.e(UUID.fromString(n2.c));
                    break;
                }
                case "targetPos": {
                    String[] stringArray = n2.c.split("f");
                    Vec3d vec3d = new Vec3d(Double.parseDouble(stringArray[0]), Double.parseDouble(stringArray[1]), Double.parseDouble(stringArray[2]));
                    em2.c(vec3d);
                    break;
                }
                case "master": {
                    em2.func_184212_Q().func_187227_b(em.v, (Object)n2.c);
                    break;
                }
                case "walk speed": {
                    em2.func_184212_Q().func_187227_b(em.a, (Object)n2.c);
                    break;
                }
                case "shouldbeattargetpos": {
                    em2.func_184212_Q().func_187227_b(em.G, (Object)Boolean.valueOf(n2.c));
                }
            }
        });
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
