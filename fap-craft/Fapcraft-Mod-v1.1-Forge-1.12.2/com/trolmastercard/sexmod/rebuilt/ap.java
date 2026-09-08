/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraft.world.storage.loot.LootEntry
 *  net.minecraft.world.storage.loot.LootEntryItem
 *  net.minecraft.world.storage.loot.LootPool
 *  net.minecraft.world.storage.loot.LootTableList
 *  net.minecraft.world.storage.loot.conditions.LootCondition
 *  net.minecraft.world.storage.loot.functions.LootFunction
 *  net.minecraftforge.client.event.ModelRegistryEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  net.minecraftforge.client.model.ModelLoader
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.LootTableLoadEvent
 *  net.minecraftforge.event.RegistryEvent$Register
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickItem
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedOutEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  net.minecraftforge.registries.IForgeRegistryEntry
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.builder.AnimationBuilder
 *  software.bernie.geckolib3.core.builder.ILoopType
 *  software.bernie.geckolib3.core.builder.ILoopType$EDefaultLoopTypes
 *  software.bernie.geckolib3.core.controller.AnimationController
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 *  software.bernie.geckolib3.core.manager.AnimationFactory
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ev;
import com.trolmastercard.sexmod.f0;
import com.trolmastercard.sexmod.fp;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistryEntry;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ap
extends Item
implements IAnimatable {
    static final String e = "sexmodAllieInUse";
    static final String d = "sexmodAllieInUseTicks";
    public static final String j = "sexmodUses";
    public static final String h = "sexmodAllieID";
    static final Integer c = 95;
    static final Integer k = 50;
    public static final int a = 150;
    public static final float f = 0.75f;
    public static final ap b = new ap();
    private final AnimationFactory i = new AnimationFactory((IAnimatable)this);
    AnimationController<ap> g;

    public ap() {
        this.setCreativeTab(CreativeTabs.MISC);
        this.maxStackSize = 1;
    }

    public static void a() {
        b.setRegistryName("sexmod", "allies_lamp");
        b.setTranslationKey("allies_lamp");
        MinecraftForge.EVENT_BUS.register(ap.class);
    }

    @SubscribeEvent
    public static void a(RegistryEvent.Register<Item> register) {
        register.getRegistry().register((IForgeRegistryEntry)b);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public static void a(ModelRegistryEvent modelRegistryEvent) {
        ModelLoader.setCustomModelResourceLocation((Item)b, (int)0, (ModelResourceLocation)new ModelResourceLocation("sexmod:allies_lamp"));
        b.setTileEntityItemStackRenderer((TileEntityItemStackRenderer)new f0());
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void a(RenderGameOverlayEvent.Pre pre) {
        block0: {
            NBTTagCompound nBTTagCompound = Minecraft.getMinecraft().player.getEntityData();
            if (!nBTTagCompound.getBoolean(e)) break block0;
            pre.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void a(LootTableLoadEvent lootTableLoadEvent) {
        block2: {
            HashSet<ResourceLocation> hashSet = new HashSet<ResourceLocation>();
            hashSet.add(LootTableList.CHESTS_ABANDONED_MINESHAFT);
            hashSet.add(LootTableList.CHESTS_DESERT_PYRAMID);
            hashSet.add(LootTableList.CHESTS_SIMPLE_DUNGEON);
            hashSet.add(LootTableList.CHESTS_WOODLAND_MANSION);
            if (!hashSet.contains(lootTableLoadEvent.getName())) break block2;
            LootPool lootPool = lootTableLoadEvent.getTable().getPool("pool3");
            if (lootPool == null) {
                lootPool = lootTableLoadEvent.getTable().getPool("pool2");
            }
            if (lootPool != null) {
                lootPool.addEntry((LootEntry)new LootEntryItem((Item)b, 5, 0, new LootFunction[0], new LootCondition[0], "sexmod:allies_lamp"));
            }
        }
    }

    public void registerControllers(AnimationData animationData) {
        this.g = new AnimationController((IAnimatable)this, "controller", 2.0f, this::a);
        animationData.addAnimationController(this.g);
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack itemStack, World world, List<String> list, ITooltipFlag iTooltipFlag) {
        NBTTagCompound nBTTagCompound = itemStack.getTagCompound();
        if (nBTTagCompound == null) {
            return;
        }
        int n = 3 - itemStack.getTagCompound().getInteger(j);
        switch (n) {
            case 2: {
                list.add("2 wishes left");
                break;
            }
            case 1: {
                list.add("1 wish left");
                break;
            }
            case 0: {
                list.add("no wishes left");
            }
        }
    }

    @SideOnly(value=Side.CLIENT)
    protected <segs extends IAnimatable> PlayState a(AnimationEvent<segs> animationEvent) {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        NBTTagCompound nBTTagCompound = entityPlayerSP.getEntityData();
        boolean bl = nBTTagCompound.getBoolean(e);
        if (!bl) {
            animationEvent.getController().clearAnimationCache();
            return PlayState.STOP;
        }
        animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.lamp.rub", (ILoopType)ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME));
        return PlayState.CONTINUE;
    }

    public void onUpdate(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        Vec3d vec3d;
        if (!(entity instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer entityPlayer = (EntityPlayer)entity;
        NBTTagCompound nBTTagCompound = entity.getEntityData();
        if (!itemStack.equals(entityPlayer.getHeldItemMainhand()) && !itemStack.equals(entityPlayer.getHeldItemOffhand())) {
            return;
        }
        boolean bl2 = nBTTagCompound.getBoolean(e);
        int n2 = nBTTagCompound.getInteger(d);
        if (!bl2) {
            return;
        }
        nBTTagCompound.setInteger(d, n2 + 1);
        if (n2 > k && n2 < c) {
            double d = (float)(n2 - k) / (float)(c - k);
            d = b6.h(d);
            vec3d = new Vec3d(0.0, (double)entityPlayer.eyeHeight * (1.0 - d), 0.0);
            cj.spawnParticleRing(world, EnumParticleTypes.CRIT_MAGIC, this.a(entityPlayer).add(vec3d), (int)(d * 150.0), d * 0.75, d);
        }
        if (n2 < c) {
            return;
        }
        cj.spawnParticleRing(world, EnumParticleTypes.CRIT_MAGIC, this.a(entityPlayer), 150, 0.75, 2.0);
        nBTTagCompound.setBoolean(e, false);
        nBTTagCompound.setInteger(d, 0);
        if (world.isRemote) {
            d3.a(false);
            return;
        }
        NBTTagCompound nBTTagCompound2 = itemStack.getTagCompound();
        if (nBTTagCompound2 == null) {
            nBTTagCompound2 = new NBTTagCompound();
        }
        nBTTagCompound2.setInteger(j, nBTTagCompound2.getInteger(j) + 1);
        ev ev2 = new ev(entityPlayer.world, entityPlayer.getHeldItemMainhand());
        ev2.e(entityPlayer.getPersistentID());
        vec3d = this.a(entityPlayer);
        ev2.setPositionAndRotation(vec3d.x, vec3d.y, vec3d.z, entityPlayer.rotationYaw + 180.0f, entityPlayer.rotationPitch);
        ev2.c(ev2.getPositionVector());
        ev2.b(entityPlayer.rotationYaw + 180.0f);
        ev2.a(true);
        ev2.setNoGravity(true);
        ev2.noClip = true;
        entityPlayer.world.spawnEntity((Entity)ev2);
        BlockPos blockPos = ev2.getPosition().add(0, -1, 0);
        if (ev2.world.getBlockState(blockPos).getBlock().equals(Blocks.SAND)) {
            ev2.b(fp.SUMMON_SAND);
        } else {
            ev2.b(ev2.f() ? fp.SUMMON : fp.SUMMON_NORMAL);
        }
        itemStack.setTagCompound(nBTTagCompound2);
    }

    Vec3d a(EntityPlayer entityPlayer) {
        return entityPlayer.getPositionVector().add(ck.a(new Vec3d(0.0, 0.0, 2.0), entityPlayer.rotationYawHead));
    }

    public AnimationFactory getFactory() {
        return this.i;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static class a$a {
        @SubscribeEvent
        public void a(PlayerEvent.PlayerLoggedOutEvent playerLoggedOutEvent) {
            playerLoggedOutEvent.player.getEntityData().setBoolean(ap.e, false);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SubscribeEvent
        public void a(PlayerInteractEvent.RightClickItem rightClickItem) {
            em em22;
            EntityPlayer entityPlayer = rightClickItem.getEntityPlayer();
            EnumHand enumHand = rightClickItem.getHand();
            ItemStack itemStack = entityPlayer.getHeldItem(enumHand);
            if (ei.e(entityPlayer)) {
                return;
            }
            if (entityPlayer.world.isRemote && !d3.b()) {
                return;
            }
            if (!entityPlayer.world.isRemote) {
                try {
                    for (em em22 : em.ad()) {
                        ev ev2;
                        ItemStack itemStack2;
                        if (em22.isDead || !(em22 instanceof ev) || !itemStack.equals(itemStack2 = (ItemStack)(ev2 = (ev)em22).getDataManager().get(ev.N))) continue;
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    // empty catch block
                }
            }
            if (itemStack.getItem() != b) {
                return;
            }
            NBTTagCompound nBTTagCompound = itemStack.getTagCompound();
            if (nBTTagCompound != null && nBTTagCompound.getInteger(ap.j) >= 3) {
                return;
            }
            em22 = entityPlayer.getEntityData();
            boolean bl = em22.getBoolean(ap.e);
            if (bl) {
                return;
            }
            em22.setBoolean(ap.e, true);
            em22.setInteger(ap.d, 0);
        }

        private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
            return concurrentModificationException;
        }
    }
}
