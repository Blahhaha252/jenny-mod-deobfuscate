/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.living.LivingAttackEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerChangedDimensionEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.ai;
import com.trolmastercard.sexmod.e3;
import com.trolmastercard.sexmod.ea;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public static class e3.c {
    static Minecraft a = null;

    /*
     * Exception decompiling
     */
    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(TickEvent.ClientTickEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
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

    @SubscribeEvent
    public void a(PlayerEvent.PlayerChangedDimensionEvent playerChangedDimensionEvent) {
        EntityPlayer entityPlayer = playerChangedDimensionEvent.player;
        UUID uUID = entityPlayer.getPersistentID();
        int n = playerChangedDimensionEvent.toDim;
        World world = entityPlayer.field_70170_p;
        e3 e32 = null;
        try {
            for (em em2 : em.ad()) {
                try {
                    if (em2.field_70170_p.field_72995_K) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw e3.c.a(concurrentModificationException);
                }
                try {
                    if (!(em2 instanceof e3)) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw e3.c.a(concurrentModificationException);
                }
                e3 e33 = (e3)em2;
                try {
                    if (!uUID.equals(e33.e())) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw e3.c.a(concurrentModificationException);
                }
                String string = e33.C();
                String string2 = e33.F();
                e32 = e33;
                e32.a((UUID)null);
                e32.e((UUID)null);
                e32.b(fp.NULL);
                e3 e34 = new e3(world);
                e34.field_71093_bK = n;
                e34.field_98038_p = true;
                e34.f(string);
                e34.e(string2);
                e34.m.func_187227_b(aC, (Object)true);
                world.func_72838_d((Entity)e34);
                e34.func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                e34.a(uUID);
                e34.b(fp.SHOULDER_IDLE);
                break;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        try {
            if (e32 == null) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
        world.func_72900_e(e32);
        em.ad().remove(e32);
    }

    @SubscribeEvent
    public void a(LivingAttackEvent livingAttackEvent) {
        try {
            if (livingAttackEvent.getSource() == DamageSource.field_76380_i) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
        EntityLivingBase entityLivingBase = livingAttackEvent.getEntityLiving();
        try {
            if (!(entityLivingBase instanceof e3)) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
        e3 e32 = (e3)entityLivingBase;
        try {
            if (e32.e() != null) {
                livingAttackEvent.setCanceled(true);
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
    }

    @SubscribeEvent
    @SideOnly(value=Side.CLIENT)
    public void a(InputEvent.KeyInputEvent keyInputEvent) {
        try {
            if (a == null) {
                a = Minecraft.func_71410_x();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
        try {
            if (e3.c.a.field_71462_r instanceof ea) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
        try {
            if (!ClientProxy.keyBindings[0].func_151468_f()) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
        em em2 = null;
        UUID uUID = Minecraft.func_71410_x().field_71439_g.getPersistentID();
        try {
            for (em em3 : em.ad()) {
                if (!em3.field_70170_p.field_72995_K) continue;
                try {
                    if (!(em3 instanceof ai)) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw e3.c.a(concurrentModificationException);
                }
                ai ai2 = (ai)((Object)em3);
                if (!uUID.equals(ai2.e())) continue;
                em2 = em3;
                break;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        try {
            if (em2 == null) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
        try {
            if (em2.y() != fp.SHOULDER_IDLE) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw e3.c.a(concurrentModificationException);
        }
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new ea(em2));
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
