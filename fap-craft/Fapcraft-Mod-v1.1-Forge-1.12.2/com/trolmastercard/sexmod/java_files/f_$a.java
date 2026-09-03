/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockHorizontal
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityBlaze
 *  net.minecraft.entity.monster.EntityWitherSkeleton
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.event.entity.EntityMountEvent
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.event.entity.living.LivingSpawnEvent$CheckSpawn
 *  net.minecraftforge.event.entity.player.PlayerWakeUpEvent
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerRespawnEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.ab;
import com.trolmastercard.sexmod.aq;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.c4;
import com.trolmastercard.sexmod.cc;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.fq;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.hf;
import com.trolmastercard.sexmod.s;
import com.trolmastercard.sexmod.v;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public static class f_.a {
    boolean a(f_ f_2) {
        boolean bl;
        try {
            bl = f_2.ab() != null;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        return bl;
    }

    @SubscribeEvent(priority=EventPriority.LOWEST)
    public void a(LivingSpawnEvent.CheckSpawn checkSpawn) {
        Entity entity;
        block13: {
            Event.Result result = checkSpawn.getResult();
            try {
                if (result == Event.Result.DENY) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (checkSpawn.isSpawner()) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            entity = checkSpawn.getEntity();
            try {
                try {
                    if (entity instanceof EntityWitherSkeleton || entity instanceof EntityBlaze) break block13;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                return;
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
        }
        BlockPos blockPos = entity.func_180425_c();
        World world = entity.field_70170_p;
        try {
            if (!f_.a(blockPos, world)) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        checkSpawn.setResult(Event.Result.DENY);
        fq.a(blockPos, fq.c);
        f_ f_2 = new f_(world);
        f_2.func_70634_a(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p());
        world.func_72838_d((Entity)f_2);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(InputEvent.KeyInputEvent keyInputEvent) {
        Minecraft minecraft = Minecraft.func_71410_x();
        try {
            if (!minecraft.field_71474_y.field_74314_A.func_151470_d()) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        try {
            if (!hf.d()) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        try {
            for (em em2 : em.ad()) {
                try {
                    if (!em2.field_70170_p.field_72995_K) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                try {
                    if (!(em2 instanceof f_)) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                try {
                    if (!minecraft.field_71439_g.getPersistentID().equals(((f_)em2).ax())) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                hf.a();
                em2.b(fp.BOOST);
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
    }

    @SubscribeEvent
    public void a(EntityMountEvent entityMountEvent) {
        try {
            if (entityMountEvent.isMounting()) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        Entity entity = entityMountEvent.getEntityBeingMounted();
        try {
            if (!(entity instanceof f_)) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        try {
            if (entity.field_70170_p.field_72995_K) {
                hf.c();
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        ((f_)entity).t();
    }

    @SubscribeEvent(priority=EventPriority.HIGH)
    public void a(LivingDeathEvent livingDeathEvent) {
        f_ f_2;
        block15: {
            block14: {
                Entity entity = livingDeathEvent.getEntity();
                try {
                    if (!(entity instanceof f_)) {
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                try {
                    if (livingDeathEvent.getSource().equals(DamageSource.field_76380_i)) {
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                f_2 = (f_)entity;
                try {
                    if (f_2.bU) {
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                try {
                    if (entity.field_70170_p.field_72995_K) {
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                try {
                    if (f_2.k()) break block14;
                    f_2.a((Entity)f_2.func_110142_aN().func_180135_h());
                    break block15;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
            }
            cc.a(f_2);
            ge.b.sendToAllTracking((IMessage)new ab(f_2.f(), v.b(f_2)), (Entity)f_2);
            be.a(900, () -> v.a(f_2));
            f_2.bU = true;
        }
        f_2.func_70606_j(1.0f);
        livingDeathEvent.setCanceled(true);
    }

    @SubscribeEvent
    public void a(PlayerEvent.PlayerRespawnEvent playerRespawnEvent) {
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP)playerRespawnEvent.player;
        em em2 = em.a(entityPlayerMP.getPersistentID(), true);
        try {
            if (!(em2 instanceof f_)) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        f_ f_2 = (f_)em2;
        try {
            f_2.a((EntityLivingBase)null);
            s.a.a(em2);
            ge.b.sendTo((IMessage)new gz(true), entityPlayerMP);
            em2.b((fp)null);
            if (f_2.bZ == null) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        f_2.bZ.e(f_2);
        f_2.bZ = null;
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderWorldLastEvent renderWorldLastEvent) {
        Minecraft minecraft = Minecraft.func_71410_x();
        RenderManager renderManager = minecraft.func_175598_ae();
        float f = minecraft.func_184121_ak();
        try {
            for (em em2 : em.ad()) {
                c4 c42;
                Vec3d vec3d;
                Vec3d vec3d2;
                try {
                    if (!(em2 instanceof f_)) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                try {
                    if (!em2.field_70170_p.field_72995_K) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                try {
                    if (em2.y() != fp.SUMMON_SKELETON) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                double d = ((f_)em2).ad;
                try {
                    if (d < 9.0) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                try {
                    if (d > 30.0) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw f_.a.a(concurrentModificationException);
                }
                Vec3d vec3d3 = b6.a(new Vec3d(em2.field_70142_S, em2.field_70137_T, em2.field_70136_U), em2.func_174791_d(), (double)f);
                double d2 = (d - 9.0) / 21.0;
                if (((Boolean)em2.func_184212_Q().func_187225_a(bN)).booleanValue()) {
                    vec3d2 = em2.b("energyBallR");
                    vec3d = vec3d3.func_178787_e(vec3d2);
                    c42 = new c4(em2.field_70170_p, (f_)em2);
                    c42.g = d2;
                    c42.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
                    renderManager.func_188391_a((Entity)c42, 0.0, 0.0, 0.0, 0.0f, f, true);
                    c42.func_70107_b(0.0, -500.0, 0.0);
                    c42.func_70106_y();
                }
                if (!((Boolean)em2.func_184212_Q().func_187225_a(b7)).booleanValue()) continue;
                vec3d2 = em2.b("energyBallL");
                vec3d = vec3d3.func_178787_e(vec3d2);
                c42 = new c4(em2.field_70170_p, (f_)em2);
                c42.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
                c42.g = d2;
                renderManager.func_188391_a((Entity)c42, 0.0, 0.0, 0.0, 0.0f, f, true);
                c42.func_70107_b(0.0, -500.0, 0.0);
                c42.func_70106_y();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        GlStateManager.func_179145_e();
        GlStateManager.func_179126_j();
        GlStateManager.func_179141_d();
    }

    boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        if (enumFacing == EnumFacing.NORTH) {
            blockPos = blockPos.func_177976_e();
            try {
                if (this.a(world, blockPos)) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177984_a())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177968_d())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177968_d().func_177984_a())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            return true;
        }
        if (enumFacing == EnumFacing.WEST) {
            blockPos = blockPos.func_177968_d();
            try {
                if (this.a(world, blockPos)) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177984_a())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177974_f())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177974_f().func_177984_a())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            return true;
        }
        if (enumFacing == EnumFacing.SOUTH) {
            blockPos = blockPos.func_177974_f();
            try {
                if (this.a(world, blockPos)) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177984_a())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177978_c())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177978_c().func_177984_a())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            return true;
        }
        if (enumFacing == EnumFacing.EAST) {
            blockPos = blockPos.func_177978_c();
            try {
                if (this.a(world, blockPos)) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177984_a())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177976_e())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            try {
                if (this.a(world, blockPos.func_177976_e().func_177984_a())) {
                    return false;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
            return true;
        }
        Main.LOGGER.error("Weird bed orientation, when checking for space next to bed, on galaths morning blowjob animation: " + enumFacing.func_176610_l());
        return false;
    }

    boolean a(World world, BlockPos blockPos) {
        Block block = world.func_180495_p(blockPos).func_177230_c();
        for (Class<?> clazz : aS) {
            try {
                if (!clazz.isInstance(block)) continue;
                return false;
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw f_.a.a(concurrentModificationException);
            }
        }
        return true;
    }

    @SubscribeEvent
    public void a(PlayerWakeUpEvent playerWakeUpEvent) {
        float f;
        EntityPlayer entityPlayer = playerWakeUpEvent.getEntityPlayer();
        try {
            if (entityPlayer.field_70170_p.field_72995_K) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        try {
            if (!v.a(entityPlayer.getPersistentID(), entityPlayer.field_70170_p)) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        Vec3d vec3d = entityPlayer.func_174791_d();
        BlockPos blockPos = new BlockPos(vec3d);
        EnumFacing enumFacing = (EnumFacing)entityPlayer.field_70170_p.func_180495_p(blockPos).func_177229_b((IProperty)BlockHorizontal.field_185512_D);
        try {
            if (!this.a(entityPlayer.field_70170_p, blockPos, enumFacing)) {
                entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%sFor Galath and Manglelie to %swake you up with a blowjob%s, you have to provide enough space to the %sright side%s of your bed. This includes the %stop and bottom half%s of the bed.", TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY)));
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        switch ((EnumFacing)entityPlayer.field_70170_p.func_180495_p(blockPos).func_177229_b((IProperty)BlockHorizontal.field_185512_D)) {
            default: {
                f = 0.0f;
                break;
            }
            case NORTH: {
                f = 180.0f;
                break;
            }
            case EAST: {
                f = -90.0f;
                break;
            }
            case WEST: {
                f = 90.0f;
            }
        }
        Vec3d vec3d2 = new Vec3d((double)blockPos.func_177958_n() + 0.5, (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p() + 0.5);
        UUID uUID = v.b(entityPlayer);
        try {
            if (uUID != null) {
                v.a((f_)em.a(uUID));
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw f_.a.a(concurrentModificationException);
        }
        f_ f_2 = new f_(entityPlayer.field_70170_p, entityPlayer, vec3d, true);
        f_2.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        entityPlayer.field_70170_p.func_72838_d((Entity)f_2);
        v.a(entityPlayer, f_2);
        f_2.v();
        f_2.c(vec3d2);
        f_2.b(f);
        f_2.a(true);
        f_2.e(entityPlayer.getPersistentID());
        f_2.b(fp.MORNING_BLOWJOB_SLOW);
        ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        be.a(500, () -> {
            entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
            ge.b.sendTo((IMessage)new aq(-10.0f, f + 180.0f + 5.0f, 0), (EntityPlayerMP)entityPlayer);
        });
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
