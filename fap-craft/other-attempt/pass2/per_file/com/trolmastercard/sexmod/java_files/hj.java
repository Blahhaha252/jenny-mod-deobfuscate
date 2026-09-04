/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.ModelRegistryEvent
 *  net.minecraftforge.client.model.ModelLoader
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.RegistryEvent$Register
 *  net.minecraftforge.event.entity.player.AttackEntityEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickEmpty
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  net.minecraftforge.registries.IForgeRegistryEntry
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class hj
extends Item {
    public static final hj a = new hj();

    public hj() {
        this.func_77637_a(CreativeTabs.field_78040_i);
        this.field_77777_bU = 1;
    }

    public void func_77663_a(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        if (world.field_72995_K) {
            this.a(entity, itemStack);
        }
        super.func_77663_a(itemStack, world, entity, n, bl);
    }

    @SideOnly(value=Side.CLIENT)
    void a(Entity entity, ItemStack itemStack) {
        if (!(entity instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer entityPlayer = (EntityPlayer)entity;
        if (!itemStack.equals(entityPlayer.func_184614_ca()) && !itemStack.equals(entityPlayer.func_184592_cb())) {
            itemStack.func_77964_b(0);
            return;
        }
        RayTraceResult rayTraceResult = Minecraft.func_71410_x().field_71476_x;
        itemStack.func_77964_b(rayTraceResult != null && em.a(rayTraceResult.field_72308_g) ? 1 : 0);
    }

    @SubscribeEvent
    public void a(PlayerInteractEvent.EntityInteract entityInteract) {
        Entity entity = entityInteract.getTarget();
        if (!(entity instanceof em)) {
            return;
        }
        if (!em.a(entity)) {
            return;
        }
        EntityPlayer entityPlayer = entityInteract.getEntityPlayer();
        if (entityPlayer == null) {
            return;
        }
        ItemStack itemStack = entityPlayer.func_184614_ca();
        if (itemStack.func_77973_b() != a) {
            itemStack = entityPlayer.func_184592_cb();
        }
        if (itemStack.func_77973_b() != a) {
            return;
        }
        entityInteract.setCanceled(true);
        if (!entityInteract.getWorld().field_72995_K) {
            return;
        }
        if (br.d) {
            boolean bl = br.d = 0 != br.b(true);
            if (br.d) {
                return;
            }
        }
        com.trolmastercard.sexmod.a.a(((em)entity).E());
    }

    @SubscribeEvent
    public void a(AttackEntityEvent attackEntityEvent) {
        Entity entity = attackEntityEvent.getTarget();
        if (entity == null) {
            return;
        }
        if (!(entity instanceof em)) {
            return;
        }
        EntityPlayer entityPlayer = attackEntityEvent.getEntityPlayer();
        if (entityPlayer == null) {
            return;
        }
        ItemStack itemStack = entityPlayer.func_184614_ca();
        if (itemStack.func_77973_b() != a) {
            itemStack = entityPlayer.func_184592_cb();
        }
        if (itemStack.func_77973_b() != a) {
            return;
        }
        attackEntityEvent.setCanceled(true);
        if (!entityPlayer.field_70170_p.field_72995_K) {
            return;
        }
        em em2 = (em)entity;
        String string = em2.C();
        String string2 = em.c(em.h(em2.f()));
        entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s's model-code: %s%s$%s", em2.c(), TextFormatting.YELLOW, string, string2)));
        entityPlayer.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.ITALIC + "copied to clipboard"));
        be.a(String.format("%s$%s", string, string2));
    }

    @SubscribeEvent
    public void a(PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        block0: {
            if (!this.a(leftClickBlock.getEntityPlayer(), leftClickBlock.getWorld())) break block0;
            leftClickBlock.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void a(PlayerInteractEvent.LeftClickEmpty leftClickEmpty) {
        this.a(leftClickEmpty.getEntityPlayer(), leftClickEmpty.getWorld());
    }

    boolean a(EntityPlayer entityPlayer, World world) {
        if (entityPlayer == null) {
            return false;
        }
        ItemStack itemStack = entityPlayer.func_184614_ca();
        if (itemStack.func_77973_b() != a) {
            itemStack = entityPlayer.func_184592_cb();
        }
        if (itemStack.func_77973_b() != a) {
            return false;
        }
        if (!world.field_72995_K) {
            return true;
        }
        ei ei2 = ei.d(entityPlayer.getPersistentID());
        if (ei2 == null) {
            entityPlayer.func_146105_b((ITextComponent)new TextComponentString("you gotta turn into the girl, you want to copy the model-code off"), true);
            return true;
        }
        String string = ei2.C();
        String string2 = em.c(em.h(ei2.f()));
        entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s's model-code: %s%s$%s", be.b(fy.a((Entity)ei2).toString()), TextFormatting.YELLOW, string, string2)));
        entityPlayer.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.ITALIC + "copied to clipboard"));
        be.a(String.format("%s$%s", string, string2));
        return true;
    }

    public static void a() {
        a.setRegistryName("sexmod", "npc_editor_wand");
        a.func_77655_b("npc_editor_wand");
        MinecraftForge.EVENT_BUS.register(hj.class);
    }

    @SubscribeEvent
    public static void a(RegistryEvent.Register<Item> register) {
        register.getRegistry().register((IForgeRegistryEntry)a);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public static void a(ModelRegistryEvent modelRegistryEvent) {
        ModelLoader.setCustomModelResourceLocation((Item)a, (int)0, (ModelResourceLocation)new ModelResourceLocation("sexmod:npc_editor_wand"));
        ModelLoader.setCustomModelResourceLocation((Item)a, (int)1, (ModelResourceLocation)new ModelResourceLocation("sexmod:npc_editor_wand_active"));
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
