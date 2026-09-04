/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.ModelRegistryEvent
 *  net.minecraftforge.client.model.ModelLoader
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.RegistryEvent$Register
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerChangedDimensionEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  net.minecraftforge.registries.IForgeRegistryEntry
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.av;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ez;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gf;
import com.trolmastercard.sexmod.v;
import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
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

public class cc
extends Item
implements IAnimatable {
    public static final cc r = new cc();
    public static final long c = 4000L;
    public static final long g = 1000L;
    public static final long j = 3000L;
    public static final float q = 0.1f;
    public static final float p = -0.01f;
    public static final float e = 0.0015f;
    public static final float k = 2.0f;
    public static final float h = 1.5f;
    public static final float d = 0.03f;
    public static final float s = 100.0f;
    public static final float l = 0.2f;
    public static final float o = 1.5f;
    public static final String b = "sexmod:galath_coin_activation_time";
    public static final String m = "sexmod:galath_coin_deactivation_time";
    public static final String n = "sexmod:galath_coin_de_summoning_animation_time";
    public static final String f = "Defeating a succubus makes her accept the victor as her master, granting him a coin to which her soul is bound. Using the coin summons her, offering services on demand. If her master uses the coin on her or goes too far, she returns to the coin";
    private final AnimationFactory i = new AnimationFactory(this);
    AnimationController<cc> a;

    public cc() {
        this.field_77777_bU = 1;
    }

    public static void a() {
        r.setRegistryName("sexmod", "galath_coin");
        r.func_77655_b("galath_coin");
        MinecraftForge.EVENT_BUS.register(cc.class);
    }

    @SubscribeEvent
    public static void a(RegistryEvent.Register<Item> register) {
        register.getRegistry().register((IForgeRegistryEntry)r);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public static void a(ModelRegistryEvent modelRegistryEvent) {
        ModelLoader.setCustomModelResourceLocation((Item)r, (int)0, (ModelResourceLocation)new ModelResourceLocation("sexmod:galath_coin"));
        r.setTileEntityItemStackRenderer(new av());
    }

    public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entityPlayer, EnumHand enumHand) {
        NBTTagCompound nBTTagCompound = entityPlayer.getEntityData();
        ActionResult actionResult = new ActionResult(EnumActionResult.FAIL, (Object)entityPlayer.func_184586_b(enumHand));
        if (nBTTagCompound.func_74763_f(m) != 0L) {
            return actionResult;
        }
        if (nBTTagCompound.func_74763_f(b) != 0L) {
            return actionResult;
        }
        if (!this.a(world, entityPlayer)) {
            world.func_184134_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v, com.trolmastercard.sexmod.c.MISC_BEEW[0], SoundCategory.PLAYERS, 1.0f, 1.0f, false);
            return new ActionResult(EnumActionResult.SUCCESS, (Object)entityPlayer.func_184586_b(enumHand));
        }
        world.func_184134_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v, com.trolmastercard.sexmod.c.MISC_WEOWEO[1], SoundCategory.PLAYERS, 1.0f, 1.0f, false);
        nBTTagCompound.func_74772_a(b, System.currentTimeMillis());
        return new ActionResult(EnumActionResult.SUCCESS, (Object)entityPlayer.func_184586_b(enumHand));
    }

    boolean a(World world, EntityPlayer entityPlayer) {
        if (!world.field_72995_K) {
            return !v.c(entityPlayer.getPersistentID());
        }
        return !v.f;
    }

    @SubscribeEvent
    public void a(PlayerInteractEvent.EntityInteract entityInteract) {
        EntityPlayer entityPlayer = entityInteract.getEntityPlayer();
        ItemStack itemStack = entityPlayer.func_184586_b(entityInteract.getHand());
        if (!r.equals(itemStack.func_77973_b())) {
            return;
        }
        Entity entity = entityInteract.getTarget();
        if (!(entity instanceof f_)) {
            return;
        }
        f_ f_2 = (f_)entity;
        if (!entityPlayer.getPersistentID().equals(f_2.O())) {
            return;
        }
        entityPlayer.field_70170_p.func_184134_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v, com.trolmastercard.sexmod.c.MISC_WEOWEO[0], SoundCategory.PLAYERS, 1.0f, 1.0f, false);
        entityPlayer.getEntityData().func_74772_a(m, System.currentTimeMillis());
        entityInteract.setCanceled(true);
    }

    public void func_77663_a(ItemStack itemStack, World world, Entity entity, int n2, boolean bl2) {
        super.func_77663_a(itemStack, world, entity, n2, bl2);
        if (!(entity instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer entityPlayer = (EntityPlayer)entity;
        NBTTagCompound nBTTagCompound = entityPlayer.getEntityData();
        long l2 = nBTTagCompound.func_74763_f(b);
        long l3 = nBTTagCompound.func_74763_f(m);
        long l4 = System.currentTimeMillis();
        this.b(entityPlayer, nBTTagCompound, l4, l2);
        this.a(entityPlayer, nBTTagCompound, l4, l3);
        if (l3 != 0L && l4 > l3 + 4000L) {
            nBTTagCompound.func_74772_a(m, 0L);
            nBTTagCompound.func_74757_a(n, false);
        }
        if (!world.field_72995_K) {
            return;
        }
        this.a(entityPlayer, l4, l2);
        this.b(entityPlayer, l4, l3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    void b(EntityPlayer var1_1, long var2_2, long var4_3) {
        block11: {
            if (var4_3 == 0L) {
                return;
            }
            if (var2_2 <= var4_3 + 1000L || var2_2 >= var4_3 + 3000L) {
                return;
            }
            var6_4 = null;
            try lbl-1000:
            // 3 sources

            {
                for (em var8_7 : em.ad()) {
                    if (var8_7.field_70128_L) {
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                break block11;
            }
            catch (ConcurrentModificationException var7_6) {
                // empty catch block
                break block11;
            }
lbl-1000:
            // 1 sources

            {
                if (!var8_7.field_70170_p.field_72995_K || !(var8_7 instanceof f_) || !var1_1.equals((Object)var8_7.z())) ** GOTO lbl-1000
            }
            {
                var6_4 = (f_)var8_7;
            }
        }
        if (var6_4 == null) {
            return;
        }
        var7_5 = var6_4.o().func_72441_c(0.0, 1.5, 0.0);
        var8_7 = var1_1.func_174791_d().func_72441_c(0.0, (double)var1_1.func_70047_e(), 0.0);
        var9_8 = var8_7.func_178787_e(ck.a((float)(var1_1.func_184614_ca().func_77973_b().equals(cc.r) != false ? 1 : -1) * 0.1f, (double)(-0.01f + var1_1.field_70125_A * 0.0015f), 0.0, var1_1.field_70761_aq));
        var10_9 = (float)(var2_2 - var4_3 - 1000L) / 2000.0f;
        var11_10 = b6.a(var7_5, var9_8, (double)var10_9);
        ez.b = 0.2f;
        Minecraft.func_71410_x().field_71452_i.func_78873_a((Particle)new ez(var1_1.field_70170_p, var11_10.field_72450_a, var11_10.field_72448_b, var11_10.field_72449_c));
    }

    @SideOnly(value=Side.CLIENT)
    void a(EntityPlayer entityPlayer) {
        if (!Minecraft.func_71410_x().field_71439_g.getPersistentID().equals(entityPlayer.getPersistentID())) {
            return;
        }
        v.f = true;
    }

    @SideOnly(value=Side.CLIENT)
    void a(EntityPlayer entityPlayer, long l2, long l3) {
        if (l2 <= l3 + 1000L || l2 >= l3 + 3000L) {
            return;
        }
        Vec3d vec3d = entityPlayer.func_174791_d().func_72441_c(0.0, (double)entityPlayer.func_70047_e(), 0.0);
        Vec3d vec3d2 = vec3d.func_178787_e(ck.a((float)(entityPlayer.func_184614_ca().func_77973_b().equals(r) ? 1 : -1) * 0.1f, (double)(-0.01f + entityPlayer.field_70125_A * 0.0015f), 0.0, entityPlayer.field_70761_aq));
        Vec3d vec3d3 = vec3d.func_178787_e(entityPlayer.func_70040_Z().func_72432_b().func_186678_a(2.0));
        float f10 = (float)(l2 - l3 - 1000L) / 2000.0f;
        Vec3d vec3d4 = b6.a(vec3d2, vec3d3, (double)f10);
        ez.b = 0.2f;
        Minecraft.func_71410_x().field_71452_i.func_78873_a((Particle)new ez(entityPlayer.field_70170_p, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c));
    }

    @SubscribeEvent
    public void a(PlayerEvent.PlayerChangedDimensionEvent playerChangedDimensionEvent) {
        EntityPlayer entityPlayer = playerChangedDimensionEvent.player;
        if (entityPlayer.field_70170_p.field_72995_K) {
            return;
        }
        UUID uUID = v.b(entityPlayer);
        em em2 = em.a(uUID);
        if (em2 == null) {
            return;
        }
        v.a((f_)em2);
        ge.b.sendTo((IMessage)new gf(false), (EntityPlayerMP)entityPlayer);
    }

    void b(EntityPlayer entityPlayer, NBTTagCompound nBTTagCompound, long l2, long l3) {
        block4: {
            if (l3 == 0L) {
                return;
            }
            if (l2 - l3 <= 4000L) {
                return;
            }
            nBTTagCompound.func_74772_a(b, 0L);
            Vec3d vec3d = entityPlayer.func_174791_d().func_72441_c(0.0, (double)entityPlayer.func_70047_e(), 0.0);
            Vec3d vec3d2 = vec3d.func_178787_e(entityPlayer.func_70040_Z().func_72432_b().func_186678_a(2.0));
            Random random = entityPlayer.func_70681_au();
            int n2 = 0;
            while ((float)n2 < 100.0f) {
                entityPlayer.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, (double)((2.0f * random.nextFloat() - 1.0f) * 0.2f), (double)((2.0f * random.nextFloat() - 1.0f) * 0.2f), (double)((2.0f * random.nextFloat() - 1.0f) * 0.2f), new int[0]);
                ++n2;
            }
            World world = entityPlayer.field_70170_p;
            if (world.field_72995_K) {
                this.a(entityPlayer);
                return;
            }
            f_ f_2 = new f_(entityPlayer.field_70170_p, entityPlayer, vec3d2);
            f_2.func_70634_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c);
            v.a(entityPlayer, f_2);
            entityPlayer.field_70170_p.func_72838_d((Entity)f_2);
            if (!v.b(entityPlayer.getPersistentID())) break block4;
            f_2.v();
        }
    }

    void d(EntityPlayer entityPlayer) {
        if (entityPlayer.field_70170_p.field_72995_K) {
            this.b(entityPlayer);
        } else {
            this.c(entityPlayer);
        }
    }

    void c(EntityPlayer entityPlayer) {
        block0: {
            UUID uUID = v.b(entityPlayer);
            em em2 = em.a(uUID);
            if (!(em2 instanceof f_)) break block0;
            cc.a((f_)em2);
        }
    }

    public static void a(f_ f_2) {
        f_2.b(fp.GALATH_DE_SUMMON);
        f_2.aC();
        f_2.a(true);
        f_2.c(f_2.func_174791_d());
        f_2.b(f_2.field_70177_z);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    void b(EntityPlayer var1_1) {
        block9: {
            var2_2 = null;
            try lbl-1000:
            // 3 sources

            {
                for (em var4_5 : em.ad()) {
                    if (var4_5.field_70128_L) {
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                break block9;
            }
            catch (ConcurrentModificationException var3_4) {
                // empty catch block
                break block9;
            }
lbl-1000:
            // 1 sources

            {
                if (!var4_5.field_70170_p.field_72995_K || !(var4_5 instanceof f_) || !var1_1.equals((Object)var4_5.z())) ** GOTO lbl-1000
            }
            {
                var2_2 = (f_)var4_5;
            }
        }
        if (var2_2 == null) {
            return;
        }
        cc.a(var1_1, var2_2);
    }

    @SideOnly(value=Side.CLIENT)
    public static void a(UUID uUID, f_ f_2) {
        block1: {
            World world = f_2.field_70170_p;
            Vec3d vec3d = f_2.Q() ? f_2.o() : f_2.func_174791_d();
            Vec3d vec3d2 = vec3d.func_72441_c(0.0, 1.5, 0.0);
            Random random = f_2.func_70681_au();
            int n2 = 0;
            while ((float)n2 < 100.0f) {
                Vec3d vec3d3 = new Vec3d((double)((random.nextFloat() * 2.0f - 1.0f) * 1.5f), (double)((random.nextFloat() * 2.0f - 1.0f) * 1.5f), (double)((random.nextFloat() * 2.0f - 1.0f) * 1.5f));
                Vec3d vec3d4 = vec3d2.func_178787_e(vec3d3);
                Vec3d vec3d5 = vec3d3.func_186678_a((double)-0.03f);
                world.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c, vec3d5.field_72450_a, vec3d5.field_72448_b, vec3d5.field_72449_c, new int[0]);
                ++n2;
            }
            if (!Minecraft.func_71410_x().field_71439_g.getPersistentID().equals(uUID)) break block1;
            v.f = false;
        }
    }

    public static void a(EntityPlayer entityPlayer, f_ f_2) {
        cc.a(entityPlayer.getPersistentID(), f_2);
    }

    void a(EntityPlayer entityPlayer, NBTTagCompound nBTTagCompound, long l2, long l3) {
        if (l3 == 0L) {
            return;
        }
        long l4 = l2 - l3;
        World world = entityPlayer.field_70170_p;
        boolean bl2 = nBTTagCompound.func_74767_n(n);
        if (!bl2 && l4 > 1000L - (long)(world.field_72995_K ? 0 : 150)) {
            nBTTagCompound.func_74757_a(n, true);
            this.d(entityPlayer);
        }
        if (world.field_72995_K) {
            return;
        }
        if (l2 - l3 <= 3000L) {
            return;
        }
        UUID uUID = v.b(entityPlayer);
        em em2 = em.a(uUID);
        if (!(em2 instanceof f_)) {
            return;
        }
        v.a((f_)em2);
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        this.a = new AnimationController<cc>(this, "controller", 0.0f, this::a);
        animationData.addAnimationController(this.a);
    }

    @SideOnly(value=Side.CLIENT)
    protected <segs extends IAnimatable> PlayState a(AnimationEvent<segs> animationEvent) {
        NBTTagCompound nBTTagCompound = Minecraft.func_71410_x().field_71439_g.getEntityData();
        if (nBTTagCompound.func_74763_f(b) == 0L && nBTTagCompound.func_74763_f(m) == 0L) {
            animationEvent.getController().clearAnimationCache();
            return PlayState.STOP;
        }
        this.a.setAnimation(new AnimationBuilder().addAnimation("animation.galath_coin.summon", ILoopType.EDefaultLoopTypes.PLAY_ONCE));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.i;
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}

