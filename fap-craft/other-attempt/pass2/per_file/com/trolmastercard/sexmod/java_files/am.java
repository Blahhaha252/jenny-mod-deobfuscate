/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.client.event.RenderPlayerEvent$Pre
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ai;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.dy;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import java.util.ConcurrentModificationException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class am {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderWorldLastEvent var1_1) {
        block11: {
            var2_2 = Minecraft.func_71410_x();
            if (var2_2.field_71474_y.field_74320_O != 0) {
                return;
            }
            var3_3 = var2_2.field_71439_g.getPersistentID();
            var4_4 = null;
            try lbl-1000:
            // 3 sources

            {
                for (em var6_7 : em.ad()) {
                    if (var6_7 == null) {
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                break block11;
            }
            catch (ConcurrentModificationException var5_6) {
                // empty catch block
                break block11;
            }
lbl-1000:
            // 1 sources

            {
                if (var6_7.field_70128_L || !var6_7.field_70170_p.field_72995_K || !(var6_7 instanceof ai) || !var3_3.equals((var7_9 = (ai)var6_7).e())) ** GOTO lbl-1000
                var4_4 = var6_7;
            }
        }
        if (var4_4 == null) {
            return;
        }
        var5_5 = var2_2.func_175598_ae().func_78713_a(var4_4);
        if (var5_5 == null) {
            return;
        }
        var6_8 = var2_2.field_71439_g.field_70177_z;
        dy.N = (float)((double)var2_2.field_71439_g.field_71158_b.field_78902_a * dy.G.field_72450_a);
        dy.N += -(var6_8 - dy.H) * 3.0f;
        dy.N = b6.a(dy.I, dy.N, 0.1f);
        var7_10 = -var2_2.field_71439_g.field_70125_A;
        dy.x = (float)((double)var2_2.field_71439_g.field_71158_b.field_192832_b * dy.G.field_72449_c + (double)((float)var2_2.field_71439_g.field_70181_x) * dy.G.field_72448_b);
        dy.x += -(var7_10 - dy.t) * 3.0f;
        dy.x = b6.a(dy.E, dy.x, 0.1f);
        dy.a(var4_4, var1_1.getPartialTicks());
        dy.H = var6_8;
        dy.I = dy.N;
        dy.t = var7_10;
        dy.E = dy.x;
        GlStateManager.func_179145_e();
        GlStateManager.func_179126_j();
        GlStateManager.func_179141_d();
    }

    /*
     * Exception decompiling
     */
    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void b(RenderWorldLastEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 7[WHILELOOP]
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderHandEvent var1_1) {
        var2_2 = Minecraft.func_71410_x();
        var3_3 = var2_2.field_71439_g.getPersistentID();
        try {
            var4_4 = em.ad().iterator();
lbl5:
            // 2 sources

            while (true) {
                if (var4_4.hasNext() == false) return;
                var5_6 = var4_4.next();
                if (!(var5_6 instanceof ai)) {
                    continue;
                }
                break;
            }
        }
        catch (ConcurrentModificationException var4_5) {
            // empty catch block
            return;
        }
        {
            var6_7 = var5_6.y();
            if ((var6_7 == fp.PICK_UP || var6_7 == fp.START_THROWING) && var3_3.equals(var8_9 = (var7_8 = (ai)var5_6).e())) ** break;
            ** continue;
            var1_1.setCanceled(true);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderPlayerEvent.Pre var1_1) {
        var2_2 = var1_1.getEntityPlayer().getPersistentID();
        try {
            var3_3 = em.ad().iterator();
lbl4:
            // 2 sources

            while (true) {
                if (var3_3.hasNext() == false) return;
                var4_5 = var3_3.next();
                if (!(var4_5 instanceof ai)) {
                    continue;
                }
                break;
            }
        }
        catch (ConcurrentModificationException var3_4) {
            // empty catch block
            return;
        }
        {
            var5_6 = (ai)var4_5;
        }
        {
            var6_7 = var4_5.y();
            if ((var6_7 == fp.PICK_UP || var6_7 == fp.START_THROWING) && var2_2.equals(var5_6.e())) ** break;
            ** continue;
            var1_1.setCanceled(true);
            return;
        }
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
