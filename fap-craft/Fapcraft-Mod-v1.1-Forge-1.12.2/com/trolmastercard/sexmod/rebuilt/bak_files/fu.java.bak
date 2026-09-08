/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.inventory.GuiContainerCreative
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayer$SleepResult
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.GuiScreenEvent$ActionPerformedEvent
 *  net.minecraftforge.client.event.GuiScreenEvent$InitGuiEvent
 *  net.minecraftforge.event.entity.living.LivingDamageEvent
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
 *  net.minecraftforge.event.entity.player.PlayerSleepInBedEvent
 *  net.minecraftforge.event.world.GetCollisionBoxesEvent
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerRespawnEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.e5;
import com.trolmastercard.sexmod.e9;
import com.trolmastercard.sexmod.ec;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.world.GetCollisionBoxesEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class fu {
    static final int a = 284453;

    @SubscribeEvent
    public void a(PlayerSleepInBedEvent playerSleepInBedEvent) {
        EntityPlayer entityPlayer = playerSleepInBedEvent.getEntityPlayer();
        ei ei2 = ei.g(entityPlayer);
        if (ei2 == null) {
            return;
        }
        if (!entityPlayer.func_70093_af()) {
            return;
        }
        playerSleepInBedEvent.setResult(EntityPlayer.SleepResult.OTHER_PROBLEM);
    }

    @SubscribeEvent
    public void a(GetCollisionBoxesEvent getCollisionBoxesEvent) {
    }

    @SubscribeEvent
    public void a(PlayerInteractEvent.RightClickBlock rightClickBlock) {
        ei ei2 = ei.d(rightClickBlock.getEntityPlayer().getPersistentID());
        BlockPos blockPos = rightClickBlock.getPos();
        World world = rightClickBlock.getEntityPlayer().field_70170_p;
        EntityPlayer entityPlayer = rightClickBlock.getEntityPlayer();
        if (ei2 == null) {
            return;
        }
        if (!ei2.v()) {
            return;
        }
        if (!cj.a(world, blockPos, rightClickBlock.getHitVec(), rightClickBlock.getFace(), entityPlayer)) {
            return;
        }
        if (((Boolean)ei2.func_184212_Q().func_187225_a(em.G)).booleanValue()) {
            rightClickBlock.setCanceled(true);
            return;
        }
        if (!entityPlayer.func_70093_af()) {
            return;
        }
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        if (world.func_180495_p(blockPos.func_177978_c()).func_177230_c() == Blocks.field_150350_a) {
            arrayList.add(blockPos.func_177978_c());
        }
        if (world.func_180495_p(blockPos.func_177974_f()).func_177230_c() == Blocks.field_150350_a) {
            arrayList.add(blockPos.func_177974_f());
        }
        if (world.func_180495_p(blockPos.func_177968_d()).func_177230_c() == Blocks.field_150350_a) {
            arrayList.add(blockPos.func_177968_d());
        }
        if (world.func_180495_p(blockPos.func_177976_e()).func_177230_c() == Blocks.field_150350_a) {
            arrayList.add(blockPos.func_177976_e());
        }
        BlockPos blockPos2 = null;
        for (BlockPos blockPos3 : arrayList) {
            double d;
            if (blockPos2 == null) {
                blockPos2 = blockPos3;
                continue;
            }
            Vec3d vec3d = entityPlayer.func_174791_d();
            double d2 = this.a(blockPos3.func_177958_n(), blockPos3.func_177956_o(), blockPos3.func_177952_p(), vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
            if (!(d2 < (d = this.a(blockPos2.func_177958_n(), blockPos2.func_177956_o(), blockPos2.func_177952_p(), vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c)))) continue;
            blockPos2 = blockPos3;
        }
        if (blockPos2 == null) {
            entityPlayer.func_145747_a((ITextComponent)new TextComponentString("Bed is obscured"));
            return;
        }
        entityPlayer.func_70107_b((double)blockPos2.func_177958_n() + 0.5, (double)blockPos2.func_177956_o(), (double)blockPos2.func_177952_p() + 0.5);
        if (blockPos.func_177978_c().equals((Object)blockPos2)) {
            entityPlayer.field_70177_z = 0.0f;
        }
        if (blockPos.func_177974_f().equals((Object)blockPos2)) {
            entityPlayer.field_70177_z = 90.0f;
        }
        if (blockPos.func_177968_d().equals((Object)blockPos2)) {
            entityPlayer.field_70177_z = 180.0f;
        }
        if (blockPos.func_177976_e().equals((Object)blockPos2)) {
            entityPlayer.field_70177_z = -90.0f;
        }
        if (rightClickBlock.getWorld().field_72995_K) {
            d3.a(false);
            ei2.H();
            return;
        }
        ei2.c(new Vec3d((double)blockPos2.func_177958_n() + 0.5, (double)((float)blockPos2.func_177956_o() + 0.0f), (double)blockPos2.func_177952_p() + 0.5));
        ei2.b(entityPlayer.field_70177_z);
        ei2.func_184212_Q().func_187227_b(em.G, (Object)true);
        ei2.u();
    }

    double a(double d, double d2, double d4, double d5, double d6, double d7) {
        double d8 = d - d5;
        double d9 = d2 - d6;
        double d10 = d4 - d7;
        return Math.sqrt(d8 * d8 + d9 * d9 + d10 * d10);
    }

    @SubscribeEvent
    public void a(PlayerEvent.PlayerRespawnEvent playerRespawnEvent) {
        EntityPlayer entityPlayer = playerRespawnEvent.player;
        if (entityPlayer == null) {
            return;
        }
        ei ei2 = ei.a(entityPlayer.getPersistentID());
        if (ei2 == null) {
            return;
        }
        Vec3d vec3d = entityPlayer.func_174791_d();
        ei2.field_71093_bK = entityPlayer.field_71093_bK;
        ei2.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        ei2.func_70619_bc();
        System.out.println(entityPlayer.field_70170_p.func_175697_a(ei2.func_180425_c(), 2));
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void b(PlayerInteractEvent.EntityInteract entityInteract) {
        block6: {
            if (!(entityInteract.getTarget() instanceof EntityPlayer)) {
                return;
            }
            if (entityInteract.getEntityPlayer().func_70093_af()) {
                return;
            }
            if (!entityInteract.getEntityPlayer().getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID())) {
                return;
            }
            EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
            ei ei2 = ei.d(entityPlayerSP.getPersistentID());
            EntityPlayer entityPlayer = (EntityPlayer)entityInteract.getTarget();
            ei ei3 = ei.g(entityPlayer);
            if (ei3 == null) {
                return;
            }
            if (ei2 != null) {
                entityPlayerSP.func_146105_b((ITextComponent)new TextComponentString("no lesbo yet owo"), true);
                return;
            }
            if (!ei3.l()) {
                return;
            }
            if (!ei3.p()) break block6;
            ei3.b((EntityPlayer)Minecraft.func_71410_x().field_71439_g);
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(PlayerInteractEvent.EntityInteract entityInteract) {
        block4: {
            if (!(entityInteract.getTarget() instanceof EntityPlayer)) {
                return;
            }
            if (!entityInteract.getEntityPlayer().getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID())) {
                return;
            }
            EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
            ei ei2 = ei.d(entityPlayerSP.getPersistentID());
            if (ei2 == null) {
                return;
            }
            EntityPlayer entityPlayer = (EntityPlayer)entityInteract.getTarget();
            ei ei3 = ei.d(entityPlayer.getPersistentID());
            if (ei3 != null) {
                entityPlayer.func_146105_b((ITextComponent)new TextComponentString("no lesbo yet owo"), true);
                return;
            }
            if (!ei2.p()) break block4;
            ei2.ab = false;
            ei2.b(entityPlayer);
        }
    }

    @SubscribeEvent
    public void b(PlayerInteractEvent.RightClickBlock rightClickBlock) {
        block8: {
            EntityPlayer entityPlayer = rightClickBlock.getEntityPlayer();
            ei ei2 = ei.g(entityPlayer);
            if (ei2 == null) {
                return;
            }
            if (!(ei2 instanceof ec)) {
                return;
            }
            if (!entityPlayer.func_70093_af()) {
                return;
            }
            if (!entityPlayer.func_184614_ca().equals(ItemStack.field_190927_a)) {
                return;
            }
            if (((Boolean)ei2.func_184212_Q().func_187225_a(em.G)).booleanValue()) {
                return;
            }
            if (entityPlayer.field_70125_A < 20.0f) {
                return;
            }
            Vec3d vec3d = rightClickBlock.getHitVec();
            if (vec3d == null) {
                return;
            }
            Vec3d vec3d2 = new Vec3d(vec3d.field_72450_a, Math.floor(vec3d.field_72448_b) + 0.0, vec3d.field_72449_c);
            if (vec3d.func_72438_d(entityPlayer.func_174791_d()) > 3.0) {
                return;
            }
            entityPlayer.func_70107_b(vec3d2.field_72450_a, Math.floor(vec3d.field_72448_b), vec3d2.field_72449_c);
            ei2.c(vec3d2);
            ei2.b(entityPlayer.field_70177_z);
            ei2.func_184212_Q().func_187227_b(em.G, (Object)true);
            ei2.func_184212_Q().func_187227_b(em.D, (Object)0);
            ei2.b(fp.STARTDOGGY);
            if (!rightClickBlock.getWorld().field_72995_K || !Minecraft.func_71410_x().field_71439_g.getPersistentID().equals(entityPlayer.getPersistentID())) break block8;
            d3.a(false);
        }
    }

    @SubscribeEvent
    public void a(LivingHurtEvent livingHurtEvent) {
        block3: {
            if (!(livingHurtEvent.getEntityLiving() instanceof EntityPlayer)) {
                return;
            }
            if (livingHurtEvent.getSource() != DamageSource.field_76379_h) {
                return;
            }
            EntityPlayer entityPlayer = (EntityPlayer)livingHurtEvent.getEntityLiving();
            ei ei2 = ei.g(entityPlayer);
            if (ei2 == null) {
                return;
            }
            if (!(ei2 instanceof e5) && !(ei2 instanceof e9)) break block3;
            livingHurtEvent.setCanceled(true);
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(GuiScreenEvent.InitGuiEvent initGuiEvent) {
        GuiScreen guiScreen = initGuiEvent.getGui();
        if (!(guiScreen instanceof GuiInventory) && !(guiScreen instanceof GuiContainerCreative)) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        if (entityPlayerSP == null) {
            return;
        }
        ei ei2 = ei.g((EntityPlayer)entityPlayerSP);
        if (ei2 == null) {
            return;
        }
        if (ei2.A()) {
            return;
        }
        List list = initGuiEvent.getButtonList();
        String string = I18n.func_135052_a((String)(ei2.ah() == 0 ? "action.names.dressup" : "action.names.strip"), (Object[])new Object[0]);
        list.add(new GuiButton(284453, (int)((double)guiScreen.field_146294_l * 0.5 - 35.0), (int)((double)guiScreen.field_146295_m * 0.87), 70, 20, string));
        initGuiEvent.setButtonList(list);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(GuiScreenEvent.ActionPerformedEvent actionPerformedEvent) {
        GuiScreen guiScreen = actionPerformedEvent.getGui();
        if (!(guiScreen instanceof GuiInventory) && !(guiScreen instanceof GuiContainerCreative)) {
            return;
        }
        if (actionPerformedEvent.getButton().field_146127_k != 284453) {
            return;
        }
        Minecraft minecraft = Minecraft.func_71410_x();
        ei ei2 = ei.d(minecraft.field_71439_g.getPersistentID());
        if (ei2 == null) {
            return;
        }
        if (ei2.A()) {
            return;
        }
        if (ei2.ae() != null) {
            return;
        }
        if (ei2.y() != fp.NULL) {
            return;
        }
        minecraft.field_71474_y.field_74320_O = 2;
        minecraft.field_71460_t.func_175066_a(null);
        ei2.b(fp.STRIP);
        d3.a(false);
        minecraft.field_71439_g.func_71053_j();
    }

    @SubscribeEvent
    public void a(LivingDamageEvent livingDamageEvent) {
        block3: {
            if (livingDamageEvent.getSource() != DamageSource.field_76379_h) {
                return;
            }
            EntityLivingBase entityLivingBase = livingDamageEvent.getEntityLiving();
            if (!(entityLivingBase instanceof EntityPlayer)) {
                return;
            }
            ei ei2 = ei.d(entityLivingBase.getPersistentID());
            if (ei2 == null) {
                return;
            }
            if (!(ei2 instanceof ec)) break block3;
            livingDamageEvent.setResult(Event.Result.DENY);
            livingDamageEvent.setAmount(0.0f);
            livingDamageEvent.setCanceled(true);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
