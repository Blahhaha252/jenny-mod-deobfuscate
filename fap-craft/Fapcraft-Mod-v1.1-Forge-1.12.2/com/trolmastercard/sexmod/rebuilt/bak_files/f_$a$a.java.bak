/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockHorizontal
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
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
import java.util.Iterator;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
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

public static class f_.a.a {
    boolean a(f_ f_2) {
        return f_2.ab() != null;
    }

    @SubscribeEvent(priority=EventPriority.LOWEST)
    public void a(LivingSpawnEvent.CheckSpawn checkSpawn) {
        World world;
        Event.Result result = checkSpawn.getResult();
        if (result == Event.Result.DENY) {
            return;
        }
        if (checkSpawn.isSpawner()) {
            return;
        }
        Entity entity = checkSpawn.getEntity();
        if (!(entity instanceof EntityWitherSkeleton) && !(entity instanceof EntityBlaze)) {
            return;
        }
        BlockPos blockPos = entity.func_180425_c();
        if (!f_.a(blockPos, world = entity.field_70170_p)) {
            return;
        }
        checkSpawn.setResult(Event.Result.DENY);
        fq.a(blockPos, fq.c);
        f_ f_2 = new f_(world);
        f_2.func_70634_a(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p());
        world.func_72838_d((Entity)f_2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(InputEvent.KeyInputEvent keyInputEvent) {
        em em2;
        Minecraft minecraft = Minecraft.func_71410_x();
        if (!minecraft.field_71474_y.field_74314_A.func_151470_d()) {
            return;
        }
        if (!hf.d()) {
            return;
        }
        Iterator<em> iterator = em.ad().iterator();
        do {
            if (!iterator.hasNext()) return;
            em2 = iterator.next();
        } while (!em2.field_70170_p.field_72995_K || !(em2 instanceof f_) || !minecraft.field_71439_g.getPersistentID().equals(((f_)em2).ax()));
        try {
            hf.a();
            em2.b(fp.BOOST);
            return;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
    }

    @SubscribeEvent
    public void a(EntityMountEvent entityMountEvent) {
        if (entityMountEvent.isMounting()) {
            return;
        }
        Entity entity = entityMountEvent.getEntityBeingMounted();
        if (!(entity instanceof f_)) {
            return;
        }
        if (entity.field_70170_p.field_72995_K) {
            hf.c();
            return;
        }
        ((f_)entity).t();
    }

    @SubscribeEvent(priority=EventPriority.HIGH)
    public void a(LivingDeathEvent livingDeathEvent) {
        Entity entity = livingDeathEvent.getEntity();
        if (!(entity instanceof f_)) {
            return;
        }
        if (livingDeathEvent.getSource().equals(DamageSource.field_76380_i)) {
            return;
        }
        f_ f_2 = (f_)entity;
        if (f_2.bU) {
            return;
        }
        if (entity.field_70170_p.field_72995_K) {
            return;
        }
        if (!f_2.k()) {
            f_2.a((Entity)f_2.func_110142_aN().func_180135_h());
        } else {
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
        if (!(em2 instanceof f_)) {
            return;
        }
        f_ f_2 = (f_)em2;
        f_2.a((EntityLivingBase)null);
        s.a$a.a(em2);
        ge.b.sendTo((IMessage)new gz(true), entityPlayerMP);
        em2.b((fp)null);
        if (f_2.bZ == null) {
            return;
        }
        f_2.bZ.e(f_2);
        f_2.bZ = null;
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
    public void a(RenderWorldLastEvent var1_1) {
        block10: {
            var2_2 = Minecraft.func_71410_x();
            var3_3 = var2_2.func_175598_ae();
            var4_4 = var2_2.func_184121_ak();
            try lbl-1000:
            // 5 sources

            {
                for (em var6_7 : em.ad()) {
                    if (!(var6_7 instanceof f_)) {
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                break block10;
            }
            catch (ConcurrentModificationException var5_6) {
                // empty catch block
                break block10;
            }
lbl-1000:
            // 1 sources

            {
                if (!var6_7.field_70170_p.field_72995_K || var6_7.y() != fp.SUMMON_SKELETON || (var7_8 = (double)((f_)var6_7).ad) < 9.0 || var7_8 > 30.0) ** GOTO lbl-1000
            }
            {
                var9_9 = b6.a(new Vec3d(var6_7.field_70142_S, var6_7.field_70137_T, var6_7.field_70136_U), var6_7.func_174791_d(), (double)var4_4);
                var10_10 = (var7_8 - 9.0) / 21.0;
                if (((Boolean)var6_7.func_184212_Q().func_187225_a(f_.bN)).booleanValue()) {
                    var12_11 = var6_7.b("energyBallR");
                    var13_12 = var9_9.func_178787_e(var12_11);
                    var14_13 = new c4(var6_7.field_70170_p, (f_)var6_7);
                    var14_13.g = var10_10;
                    var14_13.func_70634_a(var13_12.field_72450_a, var13_12.field_72448_b, var13_12.field_72449_c);
                    var3_3.func_188391_a((Entity)var14_13, 0.0, 0.0, 0.0, 0.0f, var4_4, true);
                    var14_13.func_70107_b(0.0, -500.0, 0.0);
                    var14_13.func_70106_y();
                }
                if (!((Boolean)var6_7.func_184212_Q().func_187225_a(f_.b7)).booleanValue()) ** GOTO lbl-1000
                var12_11 = var6_7.b("energyBallL");
                var13_12 = var9_9.func_178787_e(var12_11);
                var14_13 = new c4(var6_7.field_70170_p, (f_)var6_7);
                var14_13.func_70634_a(var13_12.field_72450_a, var13_12.field_72448_b, var13_12.field_72449_c);
                var14_13.g = var10_10;
                var3_3.func_188391_a((Entity)var14_13, 0.0, 0.0, 0.0, 0.0f, var4_4, true);
                var14_13.func_70107_b(0.0, -500.0, 0.0);
                var14_13.func_70106_y();
                ** GOTO lbl-1000
            }
        }
        GlStateManager.func_179145_e();
        GlStateManager.func_179126_j();
        GlStateManager.func_179141_d();
    }

    boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        if (enumFacing == EnumFacing.NORTH) {
            if (this.a(world, blockPos = blockPos.func_177976_e())) {
                return false;
            }
            if (this.a(world, blockPos.func_177984_a())) {
                return false;
            }
            if (this.a(world, blockPos.func_177968_d())) {
                return false;
            }
            return !this.a(world, blockPos.func_177968_d().func_177984_a());
        }
        if (enumFacing == EnumFacing.WEST) {
            if (this.a(world, blockPos = blockPos.func_177968_d())) {
                return false;
            }
            if (this.a(world, blockPos.func_177984_a())) {
                return false;
            }
            if (this.a(world, blockPos.func_177974_f())) {
                return false;
            }
            return !this.a(world, blockPos.func_177974_f().func_177984_a());
        }
        if (enumFacing == EnumFacing.SOUTH) {
            if (this.a(world, blockPos = blockPos.func_177974_f())) {
                return false;
            }
            if (this.a(world, blockPos.func_177984_a())) {
                return false;
            }
            if (this.a(world, blockPos.func_177978_c())) {
                return false;
            }
            return !this.a(world, blockPos.func_177978_c().func_177984_a());
        }
        if (enumFacing == EnumFacing.EAST) {
            if (this.a(world, blockPos = blockPos.func_177978_c())) {
                return false;
            }
            if (this.a(world, blockPos.func_177984_a())) {
                return false;
            }
            if (this.a(world, blockPos.func_177976_e())) {
                return false;
            }
            return !this.a(world, blockPos.func_177976_e().func_177984_a());
        }
        Main.LOGGER.error("Weird bed orientation, when checking for space next to bed, on galaths morning blowjob animation: " + enumFacing.func_176610_l());
        return false;
    }

    boolean a(World world, BlockPos blockPos) {
        Block block = world.func_180495_p(blockPos).func_177230_c();
        for (Class<?> clazz : f_.aS) {
            if (!clazz.isInstance(block)) continue;
            return false;
        }
        return true;
    }

    @SubscribeEvent
    public void a(PlayerWakeUpEvent playerWakeUpEvent) {
        float f;
        EnumFacing enumFacing;
        EntityPlayer entityPlayer = playerWakeUpEvent.getEntityPlayer();
        if (entityPlayer.field_70170_p.field_72995_K) {
            return;
        }
        if (!v.a(entityPlayer.getPersistentID(), entityPlayer.field_70170_p)) {
            return;
        }
        Vec3d vec3d = entityPlayer.func_174791_d();
        BlockPos blockPos = new BlockPos(vec3d);
        if (!this.a(entityPlayer.field_70170_p, blockPos, enumFacing = (EnumFacing)entityPlayer.field_70170_p.func_180495_p(blockPos).func_177229_b((IProperty)BlockHorizontal.field_185512_D))) {
            entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%sFor Galath and Manglelie to %swake you up with a blowjob%s, you have to provide enough space to the %sright side%s of your bed. This includes the %stop and bottom half%s of the bed.", TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY)));
            return;
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
        if (uUID != null) {
            v.a((f_)em.a(uUID));
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
