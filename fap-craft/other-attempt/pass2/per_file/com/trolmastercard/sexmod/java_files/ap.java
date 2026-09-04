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
        this.func_77637_a(CreativeTabs.field_78026_f);
        this.field_77777_bU = 1;
    }

    public static void a() {
        b.setRegistryName("sexmod", "allies_lamp");
        b.func_77655_b("allies_lamp");
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
            NBTTagCompound nBTTagCompound = Minecraft.func_71410_x().field_71439_g.getEntityData();
            if (!nBTTagCompound.func_74767_n(e)) break block0;
            pre.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void a(LootTableLoadEvent lootTableLoadEvent) {
        block2: {
            HashSet<ResourceLocation> hashSet = new HashSet<ResourceLocation>();
            hashSet.add(LootTableList.field_186424_f);
            hashSet.add(LootTableList.field_186429_k);
            hashSet.add(LootTableList.field_186422_d);
            hashSet.add(LootTableList.field_191192_o);
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
    public void func_77624_a(ItemStack itemStack, World world, List<String> list, ITooltipFlag iTooltipFlag) {
        NBTTagCompound nBTTagCompound = itemStack.func_77978_p();
        if (nBTTagCompound == null) {
            return;
        }
        int n = 3 - itemStack.func_77978_p().func_74762_e(j);
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
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        NBTTagCompound nBTTagCompound = entityPlayerSP.getEntityData();
        boolean bl = nBTTagCompound.func_74767_n(e);
        if (!bl) {
            animationEvent.getController().clearAnimationCache();
            return PlayState.STOP;
        }
        animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.lamp.rub", (ILoopType)ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME));
        return PlayState.CONTINUE;
    }

    public void func_77663_a(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        Vec3d vec3d;
        if (!(entity instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer entityPlayer = (EntityPlayer)entity;
        NBTTagCompound nBTTagCompound = entity.getEntityData();
        if (!itemStack.equals(entityPlayer.func_184614_ca()) && !itemStack.equals(entityPlayer.func_184592_cb())) {
            return;
        }
        boolean bl2 = nBTTagCompound.func_74767_n(e);
        int n2 = nBTTagCompound.func_74762_e(d);
        if (!bl2) {
            return;
        }
        nBTTagCompound.func_74768_a(d, n2 + 1);
        if (n2 > k && n2 < c) {
            double d = (float)(n2 - k) / (float)(c - k);
            d = b6.h(d);
            vec3d = new Vec3d(0.0, (double)entityPlayer.eyeHeight * (1.0 - d), 0.0);
            cj.a(world, EnumParticleTypes.CRIT_MAGIC, this.a(entityPlayer).func_178787_e(vec3d), (int)(d * 150.0), d * 0.75, d);
        }
        if (n2 < c) {
            return;
        }
        cj.a(world, EnumParticleTypes.CRIT_MAGIC, this.a(entityPlayer), 150, 0.75, 2.0);
        nBTTagCompound.func_74757_a(e, false);
        nBTTagCompound.func_74768_a(d, 0);
        if (world.field_72995_K) {
            d3.a(false);
            return;
        }
        NBTTagCompound nBTTagCompound2 = itemStack.func_77978_p();
        if (nBTTagCompound2 == null) {
            nBTTagCompound2 = new NBTTagCompound();
        }
        nBTTagCompound2.func_74768_a(j, nBTTagCompound2.func_74762_e(j) + 1);
        ev ev2 = new ev(entityPlayer.field_70170_p, entityPlayer.func_184614_ca());
        ev2.e(entityPlayer.getPersistentID());
        vec3d = this.a(entityPlayer);
        ev2.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, entityPlayer.field_70177_z + 180.0f, entityPlayer.field_70125_A);
        ev2.c(ev2.func_174791_d());
        ev2.b(entityPlayer.field_70177_z + 180.0f);
        ev2.a(true);
        ev2.func_189654_d(true);
        ev2.field_70145_X = true;
        entityPlayer.field_70170_p.func_72838_d((Entity)ev2);
        BlockPos blockPos = ev2.func_180425_c().func_177982_a(0, -1, 0);
        if (ev2.field_70170_p.func_180495_p(blockPos).func_177230_c().equals(Blocks.field_150354_m)) {
            ev2.b(fp.SUMMON_SAND);
        } else {
            ev2.b(ev2.f() ? fp.SUMMON : fp.SUMMON_NORMAL);
        }
        itemStack.func_77982_d(nBTTagCompound2);
    }

    Vec3d a(EntityPlayer entityPlayer) {
        return entityPlayer.func_174791_d().func_178787_e(ck.a(new Vec3d(0.0, 0.0, 2.0), entityPlayer.field_70759_as));
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
            playerLoggedOutEvent.player.getEntityData().func_74757_a(ap.e, false);
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
            ItemStack itemStack = entityPlayer.func_184586_b(enumHand);
            if (ei.e(entityPlayer)) {
                return;
            }
            if (entityPlayer.field_70170_p.field_72995_K && !d3.b()) {
                return;
            }
            if (!entityPlayer.field_70170_p.field_72995_K) {
                try {
                    for (em em22 : em.ad()) {
                        ev ev2;
                        ItemStack itemStack2;
                        if (em22.field_70128_L || !(em22 instanceof ev) || !itemStack.equals(itemStack2 = (ItemStack)(ev2 = (ev)em22).func_184212_Q().func_187225_a(ev.N))) continue;
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    // empty catch block
                }
            }
            if (itemStack.func_77973_b() != b) {
                return;
            }
            NBTTagCompound nBTTagCompound = itemStack.func_77978_p();
            if (nBTTagCompound != null && nBTTagCompound.func_74762_e(ap.j) >= 3) {
                return;
            }
            em22 = entityPlayer.getEntityData();
            boolean bl = em22.func_74767_n(ap.e);
            if (bl) {
                return;
            }
            em22.func_74757_a(ap.e, true);
            em22.func_74768_a(ap.d, 0);
        }

        private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
            return concurrentModificationException;
        }
    }
}
