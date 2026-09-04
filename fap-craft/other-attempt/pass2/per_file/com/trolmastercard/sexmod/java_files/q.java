/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedOutEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ap;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.ee;
import com.trolmastercard.sexmod.eg;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gf;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.h6;
import com.trolmastercard.sexmod.s;
import com.trolmastercard.sexmod.v;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class q {
    static final UUID b = UUID.fromString("b91e6484-8911-4def-ab04-9fa3452fca5f");
    static final UUID a = UUID.fromString("adf20149-2adc-4a9d-9af5-8e9aeda019d6");

    @SubscribeEvent
    public void a(PlayerEvent.PlayerLoggedInEvent playerLoggedInEvent) {
        UUID uUID;
        Object object2;
        EntityPlayerMP entityPlayerMP = playerLoggedInEvent.player.field_70170_p.func_73046_m().func_184103_al().func_177451_a(playerLoggedInEvent.player.getPersistentID());
        entityPlayerMP.func_82142_c(false);
        entityPlayerMP.func_189654_d(false);
        entityPlayerMP.field_70145_X = false;
        if (!entityPlayerMP.field_71075_bZ.field_75098_d && entityPlayerMP.field_71075_bZ.field_75100_b) {
            entityPlayerMP.field_71075_bZ.field_75100_b = false;
        }
        ge.b.sendTo((IMessage)new gz(true), entityPlayerMP);
        ge.b.sendTo((IMessage)new gf(v.c(entityPlayerMP.getPersistentID())), entityPlayerMP);
        for (Object object2 : entityPlayerMP.field_71071_by.field_70462_a) {
            if (object2.func_77973_b() != ap.b || !object2.func_77942_o()) continue;
            object2.func_77978_p().func_186854_a("user", UUID.randomUUID());
        }
        UUID uUID2 = ax.a(entityPlayerMP.getPersistentID());
        if (uUID2 != null) {
            object2 = ax.d(uUID2);
            ge.b.sendTo((IMessage)new h6((HashSet<BlockPos>)object2, true), entityPlayerMP);
        }
        ei.C();
        object2 = ei.d(playerLoggedInEvent.player.getPersistentID());
        World world = FMLCommonHandler.instance().getMinecraftServerInstance().func_130014_f_();
        this.a(world, (EntityPlayer)entityPlayerMP, (ei)((Object)object2));
        if (object2 != null) {
            ((em)((Object)object2)).a(false);
            ((ei)((Object)object2)).b(fp.NULL);
            s.a$a.a((em)((Object)object2));
        }
        if ((uUID = playerLoggedInEvent.player.getPersistentID()).equals(b)) {
            this.a(world, (EntityPlayer)entityPlayerMP, uUID);
        }
        if (uUID.equals(a)) {
            this.b(world, (EntityPlayer)entityPlayerMP, uUID);
        }
        f_.c((EntityPlayer)entityPlayerMP);
    }

    void a(World world, EntityPlayer entityPlayer, UUID uUID) {
        eg eg2 = new eg(world, uUID);
        eg2.func_189654_d(true);
        eg2.field_70145_X = true;
        eg2.field_70159_w = 0.0;
        eg2.field_70181_x = 0.0;
        eg2.field_70179_y = 0.0;
        eg2.func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u + 69.0, entityPlayer.field_70161_v);
        world.func_72838_d((Entity)eg2);
        eg2.B();
    }

    void b(World world, EntityPlayer entityPlayer, UUID uUID) {
        ee ee2 = new ee(world, uUID);
        ee2.func_189654_d(true);
        ee2.field_70145_X = true;
        ee2.field_70159_w = 0.0;
        ee2.field_70181_x = 0.0;
        ee2.field_70179_y = 0.0;
        ee2.func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u + 69.0, entityPlayer.field_70161_v);
        world.func_72838_d((Entity)ee2);
        ee2.B();
    }

    void a(World world, EntityPlayer entityPlayer, ei ei3) {
        Predicate<ei> predicate = ei2 -> true;
        List list = world.func_175644_a(ei.class, predicate::test);
        for (ei ei4 : list) {
            if (!ei4.m().equals(entityPlayer.getPersistentID()) || ei3 != null && ei4.func_145782_y() == ei3.func_145782_y()) continue;
            world.func_72900_e((Entity)ei4);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SubscribeEvent
    public void a(PlayerEvent.PlayerLoggedOutEvent var1_1) {
        var2_2 = var1_1.player;
        try lbl-1000:
        // 4 sources

        {
            for (em var4_5 : em.ad()) {
                if (var4_5 instanceof ei) {
                    ((ei)var4_5).b(var2_2);
                }
                ** GOTO lbl-1000
            }
            return;
        }
        catch (ConcurrentModificationException var3_4) {
            // empty catch block
            return;
        }
lbl-1000:
        // 1 sources

        {
            if (var4_5.ae() == null) ** GOTO lbl-1000
        }
        {
            if (!var4_5.ae().equals(var2_2.getPersistentID()) && !var4_5.ae().equals(var2_2.func_110124_au())) ** GOTO lbl-1000
        }
        {
            s.a$a.a(var4_5);
            var4_5.a(false);
            var4_5.b(fp.NULL);
        }
lbl-1000:
        // 2 sources

        {
            if (!(var4_5 instanceof ei) || !((ei)var4_5).m().equals(var2_2.getPersistentID()) || var4_5.ae() == null) ** GOTO lbl-1000
        }
        {
            var5_6 = (EntityPlayerMP)var1_1.player.field_70170_p.func_152378_a(var4_5.ae());
            ge.b.sendTo((IMessage)new gz(true), var5_6);
            s.a$a.a(var5_6);
            var2_2.func_82142_c(false);
            var4_5.e((UUID)null);
            ** GOTO lbl-1000
        }
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
