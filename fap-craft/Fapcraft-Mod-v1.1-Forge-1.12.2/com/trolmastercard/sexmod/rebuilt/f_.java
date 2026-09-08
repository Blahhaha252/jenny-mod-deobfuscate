/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockBanner
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.BlockButton
 *  net.minecraft.block.BlockCarpet
 *  net.minecraft.block.BlockHorizontal
 *  net.minecraft.block.BlockLadder
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.BlockSign
 *  net.minecraft.block.BlockTorch
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityMultiPart
 *  net.minecraft.entity.MultiPartEntityPart
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.ai.EntityAITempt
 *  net.minecraft.entity.monster.EntityBlaze
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.monster.EntityWitherSkeleton
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.Packet
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.network.play.server.SPacketEntityVelocity
 *  net.minecraft.network.play.server.SPacketParticles
 *  net.minecraft.network.play.server.SPacketSoundEffect
 *  net.minecraft.pathfinding.Path
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.MovementInput
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.BossInfo$Color
 *  net.minecraft.world.BossInfo$Overlay
 *  net.minecraft.world.BossInfoServer
 *  net.minecraft.world.DimensionType
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
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
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.controller.AnimationController
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.a3;
import com.trolmastercard.sexmod.a8;
import com.trolmastercard.sexmod.a_;
import com.trolmastercard.sexmod.ab;
import com.trolmastercard.sexmod.aq;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.b7;
import com.trolmastercard.sexmod.bb;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.bj;
import com.trolmastercard.sexmod.bk;
import com.trolmastercard.sexmod.bv;
import com.trolmastercard.sexmod.bz;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.c4;
import com.trolmastercard.sexmod.cc;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.cs;
import com.trolmastercard.sexmod.ct;
import com.trolmastercard.sexmod.d;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ep;
import com.trolmastercard.sexmod.ez;
import com.trolmastercard.sexmod.f2;
import com.trolmastercard.sexmod.f7;
import com.trolmastercard.sexmod.f8;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fl;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.fq;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.g0;
import com.trolmastercard.sexmod.g_;
import com.trolmastercard.sexmod.ga;
import com.trolmastercard.sexmod.gb;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gy;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.h8;
import com.trolmastercard.sexmod.hf;
import com.trolmastercard.sexmod.hz;
import com.trolmastercard.sexmod.r;
import com.trolmastercard.sexmod.s;
import com.trolmastercard.sexmod.v;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBanner;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.MultiPartEntityPart;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketParticles;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovementInput;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
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
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f_
extends em
implements IEntityMultiPart,
b7 {
    public static final float a2 = 0.6f;
    public static final float b6 = 0.6f;
    public static final int bj = 10;
    public static final int an = 20;
    public static final float aU = 50.0f;
    public static final float ba = 40.0f;
    public static final int bM = 5;
    public static final int bs = 25;
    public static final float bJ = 30.0f;
    public static final float aA = 3.0f;
    public static final int a3 = 23;
    public static final int X = 45;
    public static final float ca = 0.3f;
    public static final float a8 = 9.0f;
    public static final float aX = 30.0f;
    public static final int bE = 24;
    public static final int aQ = 32;
    public static final int av = 5;
    public static final int bQ = 36;
    public static final int aR = 40;
    public static final int aB = 54;
    public static final int by = 10;
    public static final float b_ = 0.25f;
    public static final double ax = 3.0;
    public static final double bF = 1.0;
    public static final double bv = 1.5;
    public static final double az = (double)0.3f;
    public static final double ag = 40.0;
    public static final double au = 5.0;
    public static final double ae = 0.2;
    public static final double aV = 3.0;
    public static final double ar = (double)0.1f;
    public static final double ai = 6.0;
    public static final double ah = 50.0;
    public static final double bR = 39.0;
    public static final double bV = 58.0;
    public static final double aZ = 2.0;
    public static final double Q = 1.0;
    public static final float aJ = 0.5f;
    public static final f7 aa = new f7(0.83137256f, 0.6862745f, 0.21568628f);
    public static final Vec3d bz = new Vec3d((double)-1.049342f, 2.0547213554382324, -0.05048239231109619);
    public static final Vec3d bC = new Vec3d(1.2522261142730713, 1.435773253440857, 0.23570987582206726);
    public static final int aN = 10;
    public static final float ak = 0.2f;
    public static final int am = 5;
    public static final float T = 15.0f;
    public static final int aM = 48;
    public static final float be = 0.05f;
    public static final float a7 = 0.65f;
    public static final float bh = 0.9f;
    public static final float K = 45.0f;
    public static final float a0 = 1.0f;
    public static final float bn = 1.5f;
    public static final float ao = 110.0f;
    public static final int aj = 15;
    public static final float aw = 6.0f;
    public static final float bp = 0.94f;
    public static final int R = 13;
    public static final int bW = 40;
    public static final int bl = 25;
    public static final int aY = 38;
    public static final int N = 95;
    static final int bB = 10;
    static final int aI = 30;
    static final int bf = 175;
    static final float as = 2.0f;
    public static final float bo = 0.25f;
    public static final float Y = 1000.0f;
    public static final float bX = 15.0f;
    public static final float b9 = 5.0f;
    public static final int aW = 8000;
    public static final float aK = 0.1f;
    public static final float ac = 5.0f;
    public static final float b5 = -10.0f;
    public static final int bk = 16;
    public static final int br = 7;
    public static final int cb = 4;
    public static final float M = 0.5f;
    public static final float bi = 0.55f;
    static final Class<?>[] aS = new Class[]{BlockAir.class, BlockCarpet.class, BlockBush.class, BlockButton.class, BlockLadder.class, BlockTorch.class, BlockSign.class, BlockBanner.class};
    public static final DataParameter<Integer> bq = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.VARINT).getSerializer().createKey(111);
    public static final DataParameter<Integer> aP = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.VARINT).getSerializer().createKey(112);
    public static final DataParameter<Boolean> bN = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(113);
    public static final DataParameter<Boolean> b7 = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(114);
    public static final DataParameter<Boolean> ay = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(115);
    public static final DataParameter<Integer> bH = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.VARINT).getSerializer().createKey(116);
    public static final DataParameter<String> b8 = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(117);
    public static final DataParameter<Boolean> bP = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(118);
    public static final DataParameter<Float> bO = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.FLOAT).getSerializer().createKey(119);
    public static final DataParameter<Boolean> L = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(120);
    public static final DataParameter<String> a4 = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(121);
    public static final DataParameter<Boolean> bT = EntityDataManager.createKey(f_.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(122);
    public static final double b0 = 0.2;
    public static final float bS = 5.0f;
    public static final int a1 = 60;
    BossInfoServer aO = new BossInfoServer((ITextComponent)new TextComponentString(this.c()), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS);
    bb b2 = new bb(this, "energyBallHitBox", 0.75f, 0.75f);
    bb V = new bb(this, "energyBallHitBox", 0.75f, 0.75f);
    public h8 bZ = null;
    public Vec3d O = null;
    public Vec3d bL = null;
    public int aF = 0;
    public Vec3d bd = null;
    public List<EntityWitherSkeleton> bI = new ArrayList<EntityWitherSkeleton>();
    public float aE = 0.0f;
    public long af = -1L;
    public long aH = -1L;
    public float bw = 0.0f;
    public float bm = 0.0f;
    boolean bU = false;
    public Vec3d aG = null;
    boolean bA = false;
    Vec3d bD;
    Vec3d W;
    Vec3d Z;
    float al = 0.0f;
    boolean U = false;
    public int ad = 0;
    double a9 = 0.0;
    double bg = 0.0;
    double b4 = 0.0;
    double a_ = 0.0;
    boolean bK = false;
    Path aq = null;
    BlockPos bG = null;
    int aC = 0;
    fp ab = null;
    int at = 0;
    int bY = 0;
    int b3 = 0;
    long bc = 0L;
    boolean S = false;
    boolean P = false;
    int b1 = 0;
    boolean aT = false;
    public boolean bx = false;
    public boolean a5 = false;
    public boolean aD = false;
    public boolean bt = false;
    public boolean ap = false;
    public boolean bu = false;
    public boolean aL = true;
    public boolean bb = false;
    boolean a6 = false;

    public f_(World world) {
        super(world);
    }

    public f_(World world, @Nonnull EntityPlayer entityPlayer, Vec3d vec3d, boolean bl2) {
        this(world);
        UUID uUID = entityPlayer.getPersistentID();
        this.m.set(v, (Object)uUID.toString());
        this.aO.setVisible(false);
        this.bG = new BlockPos(this.getPositionVector());
        String string = gy.a(uUID, fy.GALATH);
        if (string != null) {
            super.g(string);
        }
        if (bl2) {
            return;
        }
        if (this.getRNG().nextFloat() > 0.1f) {
            this.b(fp.GALATH_SUMMON);
            return;
        }
        this.b(fp.MASTERBATE);
        this.b(180.0f - (float)gc.b(Math.atan2(vec3d.x - entityPlayer.posX, vec3d.z - entityPlayer.posZ)));
        com.trolmastercard.sexmod.be.a(8000, () -> {
            EntityPlayer entityPlayer = this.z();
            if (entityPlayer == null) {
                return;
            }
            if (entityPlayer.isDead) {
                return;
            }
            this.c(entityPlayer.getPositionVector());
            this.b(entityPlayer.rotationYaw + 180.0f);
            this.b(fp.RAPE_INTRO);
            this.e(entityPlayer.getPersistentID());
            this.a(true);
        });
    }

    public f_(World world, @Nonnull EntityPlayer entityPlayer, Vec3d vec3d) {
        this(world, entityPlayer, vec3d, false);
    }

    @Override
    public void f(String string) {
        super.f(string);
        com.trolmastercard.sexmod.bj.a(this);
    }

    @Override
    public String c() {
        return "Galath";
    }

    @Override
    public float i() {
        return this.aF() == null ? 0.5f : 1.35f;
    }

    public float getEyeHeight() {
        return 1.9f;
    }

    public boolean k() {
        return this.J();
    }

    public boolean isPushedByWater() {
        return false;
    }

    protected void handleJumpWater() {
        block0: {
            if (!this.k()) break block0;
            super.handleJumpWater();
        }
    }

    protected float getWaterSlowDown() {
        if (this.k()) {
            return super.getWaterSlowDown();
        }
        return 0.0f;
    }

    public boolean isInWater() {
        if (this.k()) {
            return super.isInWater();
        }
        return false;
    }

    public boolean handleWaterMovement() {
        if (this.k()) {
            return super.handleWaterMovement();
        }
        return false;
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.m.register(bq, (Object)-1);
        this.m.register(aP, (Object)0);
        this.m.register(bN, (Object)true);
        this.m.register(b7, (Object)true);
        this.m.register(ay, (Object)false);
        this.m.register(b8, (Object)"null");
        this.m.register(bH, (Object)-1);
        this.m.register(bP, (Object)false);
        this.m.register(bO, (Object)Float.valueOf(0.0f));
        this.m.register(L, (Object)false);
        this.m.register(a4, (Object)"");
        this.m.register(bT, (Object)false);
    }

    @Override
    protected void applyEntityAttributes() {
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.MAX_HEALTH);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ARMOR);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS);
        this.getAttributeMap().registerAttribute(SWIM_SPEED);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(50.0);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.FLYING_SPEED);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(110.0);
        this.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue((double)0.6f);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.6f);
    }

    @Override
    protected void initEntityAI() {
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 0.4, false, new HashSet(I)));
        this.tasks.addTask(3, (EntityAIBase)new hz((EntityLiving)this));
        this.tasks.addTask(5, (EntityAIBase)this.o);
    }

    public void addTrackingPlayer(EntityPlayerMP entityPlayerMP) {
        super.addTrackingPlayer(entityPlayerMP);
        this.aO.addPlayer(entityPlayerMP);
    }

    public void removeTrackingPlayer(EntityPlayerMP entityPlayerMP) {
        super.removeTrackingPlayer(entityPlayerMP);
        this.aO.removePlayer(entityPlayerMP);
    }

    @Override
    public Vec3d o() {
        if (this.world.isRemote && this.aG != null) {
            return this.aG;
        }
        return super.o();
    }

    @Nullable
    public UUID aF() {
        String string = (String)this.m.get(a4);
        if ("".equals(string)) {
            return null;
        }
        try {
            return UUID.fromString(string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Nullable
    public f8 a(boolean bl2) {
        em em2;
        UUID uUID = this.aF();
        if (uUID == null) {
            return null;
        }
        em em3 = em2 = bl2 ? f_.a(uUID) : f_.b(uUID);
        if (em2 instanceof f8) {
            return (f8)em2;
        }
        return null;
    }

    @Nullable
    public static f8 a(em em2, boolean bl2) {
        if (!(em2 instanceof f_)) {
            return null;
        }
        return ((f_)em2).a(bl2);
    }

    public void a(@Nullable UUID uUID) {
        this.m.set(a4, (Object)(uUID == null ? "" : uUID.toString()));
    }

    public void aC() {
        block0: {
            this.bA = true;
            f8 f82 = this.a(true);
            if (f82 == null) break block0;
            f82.q();
        }
    }

    public void w() {
        fp fp2 = this.y();
        if (fp2 != fp.RAPE_ON_GOING) {
            return;
        }
        this.bZ = h8.CHANGE_POSITION;
        this.bZ.b(this);
        this.a(false);
        this.b(fp.FLY);
        EntityPlayer entityPlayer = this.S();
        this.e((UUID)null);
        if (entityPlayer != null) {
            ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
        }
        em.a((em)this, com.trolmastercard.sexmod.c.GIRLS_GALATH_DIALOG[0]);
    }

    public Vec3d B() {
        String[] stringArray = ((String)this.m.get(b8)).split("\\|");
        return new Vec3d(Double.parseDouble(stringArray[0]), Double.parseDouble(stringArray[1]), Double.parseDouble(stringArray[2]));
    }

    public void e(@Nullable Vec3d vec3d) {
        this.m.set(b8, (Object)(vec3d.x + "|" + vec3d.y + "|" + vec3d.z));
    }

    public int az() {
        return (Integer)this.m.get(bH);
    }

    public void a(int n2) {
        this.m.set(bH, (Object)n2);
    }

    public boolean isNonBoss() {
        return false;
    }

    @Override
    public boolean b() {
        switch (this.y()) {
            default: {
                return false;
            }
            case HUG_MANG: 
            case MORNING_BLOWJOB_SLOW: 
            case MORNING_BLOWJOB_FAST: 
            case MORNING_BLOWJOB_CUM: 
        }
        return true;
    }

    void aa() {
        this.Z = new Vec3d(this.motionX, this.motionY, this.motionZ);
        this.bD = this.getPositionVector();
        this.W = this.getPositionVector().add(this.Z);
        this.Z = this.Z.scale(0.9);
    }

    @Override
    public void onUpdate() {
        block4: {
            boolean bl2 = this.k();
            if (bl2) {
                this.E();
            } else {
                this.c();
            }
            this.aa();
            super.onUpdate();
            if (bl2) {
                this.au();
            } else {
                this.R();
            }
            if (!this.world.isRemote) break block4;
            this.X();
        }
    }

    @Override
    public boolean B() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    void X() {
        if (this.y() != fp.GIVE_COIN) {
            return;
        }
        int n2 = fp.GIVE_COIN.ticksPlaying[1];
        if (n2 == 95) {
            cc.a((EntityPlayer)Minecraft.getMinecraft().player, this);
        }
        if (n2 <= 25 || n2 >= 38) {
            return;
        }
        Vec3d vec3d = this.getPositionVector();
        Vec3d vec3d2 = this.b("weapon").add(vec3d);
        Vec3d vec3d3 = this.b("offhand").add(vec3d);
        ez.b = 0.5f;
        for (float f = 0.0f; f < 1.0f; f += 0.2f) {
            Vec3d vec3d4 = com.trolmastercard.sexmod.b6.a(vec3d2, vec3d3, (double)f);
            Minecraft.getMinecraft().effectRenderer.addEffect((Particle)new ez(this.world, vec3d4.x, vec3d4.y, vec3d4.z));
        }
    }

    void E() {
        this.setNoGravity(this.ab() != null);
    }

    void au() {
        block1: {
            if (!this.isInWater() && !this.hasNoGravity() && this.motionY < 0.0 && this.y() != fp.MASTERBATE) {
                this.motionY *= (double)0.4f;
            }
            this.aB();
            this.aj();
            this.aq();
            this.aw();
            this.C();
            this.Y();
            this.o();
            if (this.M() != null) break block1;
            this.ap = false;
        }
    }

    void o() {
        if (this.world.isRemote) {
            return;
        }
        if (this.y() != fp.RAPE_CUM) {
            return;
        }
        if (fp.RAPE_CUM.ticksPlaying[0] < 28) {
            return;
        }
        this.a(false);
        this.b(fp.NULL);
        EntityPlayer entityPlayer = this.S();
        this.e((UUID)null);
        if (entityPlayer == null) {
            return;
        }
        entityPlayer.setPositionAndUpdate(entityPlayer.posX, Math.ceil(entityPlayer.posY) + 1.0, entityPlayer.posZ);
        ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
    }

    void Y() {
        if (this.world.isRemote) {
            return;
        }
        if (this.y() != fp.CORRUPT_CUM) {
            return;
        }
        if (fp.CORRUPT_CUM.ticksPlaying[0] < 30) {
            return;
        }
        this.a(false);
        this.b(fp.NULL);
        EntityPlayer entityPlayer = this.S();
        this.e((UUID)null);
        if (entityPlayer == null) {
            return;
        }
        entityPlayer.setPositionAndUpdate(entityPlayer.posX, Math.ceil(entityPlayer.posY) + 1.0, entityPlayer.posZ);
        ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
    }

    static boolean a(BlockPos blockPos, World world) {
        for (BlockPos object : fq.c) {
            if (!(Math.sqrt(blockPos.distanceSq((Vec3i)object)) < 1000.0)) continue;
            return false;
        }
        try {
            for (em em2 : em.ad()) {
                if (em2.world.isRemote || !(em2 instanceof f_) || em2.isDead || !(em2.getDistanceSq(blockPos) < 1000000.0)) continue;
                return false;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        int n2 = blockPos.getY();
        while ((float)n2 < 15.0f + (float)blockPos.getY()) {
            if (world.getBlockState(new BlockPos(blockPos.getX(), n2, blockPos.getZ())).getBlock() != Blocks.AIR) {
                return false;
            }
            ++n2;
        }
        n2 = blockPos.getY();
        while ((float)n2 > (float)blockPos.getY() - 5.0f) {
            if (world.getBlockState(new BlockPos(blockPos.getX(), n2, blockPos.getZ())).getBlock() instanceof BlockLiquid) {
                return false;
            }
            --n2;
        }
        return true;
    }

    void aw() {
        int n2;
        EntityPlayer entityPlayer = this.ab();
        fp fp2 = this.y();
        if (entityPlayer == null) {
            return;
        }
        if (fp2 != fp.BOOST) {
            return;
        }
        int n3 = n2 = g0.a() ? 0 : 1;
        if (fp2.ticksPlaying[n2] < 13) {
            return;
        }
        if (fp2.ticksPlaying[n2] == 13) {
            this.al = 6.0f;
        }
        Vec3d vec3d = entityPlayer.getLook(0.0f).normalize();
        this.motionX = vec3d.x * (double)this.al;
        this.motionY = vec3d.y * (double)this.al;
        this.motionZ = vec3d.z * (double)this.al;
        this.al *= 0.94f;
    }

    void c() {
        this.n();
        this.j();
        this.ah();
    }

    void R() {
        block0: {
            f_.a(this, 0.0f);
            this.h();
            this.aj();
            this.af();
            this.L();
            this.F();
            this.C();
            this.u();
            if (!this.world.isRemote) break block0;
            this.H();
        }
    }

    void u() {
        block2: {
            if (this.world.isRemote) {
                return;
            }
            if (this.y() != fp.CORRUPT_CUM) {
                return;
            }
            if (fp.CORRUPT_CUM.ticksPlaying[0] < 30) break block2;
            this.b(fp.GIVE_COIN);
        }
    }

    void C() {
        if (((Boolean)this.m.get(L)).booleanValue()) {
            this.bb = true;
            return;
        }
        switch (this.y()) {
            case RAPE_INTRO: 
            case RAPE_ON_GOING: 
            case RAPE_CUM: 
            case RAPE_CHARGE: 
            case RAPE_CUM_IDLE: 
            case CORRUPT_SLOW: 
            case CORRUPT_FAST: 
            case CORRUPT_CUM: 
            case MASTERBATE: {
                this.bb = true;
            }
            case RAPE_PREPARE: {
                return;
            }
        }
        this.bb = false;
    }

    @Override
    public boolean m() {
        if (this.y() != fp.CORRUPT_INTRO) {
            return false;
        }
        return this.U;
    }

    void F() {
        if (!this.world.isRemote) {
            return;
        }
        if (this.y() == fp.KNOCK_OUT_STAND_UP) {
            return;
        }
        this.aL = true;
    }

    void j() {
        this.aO.setPercent(this.getHealth() / this.getMaxHealth());
    }

    void n() {
        if (((Boolean)this.m.get(bP)).booleanValue()) {
            return;
        }
        this.setNoGravity(this.M() != null);
    }

    void L() {
        block0: {
            if (this.y() == fp.ATTACK_SWORD) break block0;
            this.ap = false;
            this.bu = false;
        }
    }

    protected void collideWithNearbyEntities() {
    }

    public void addPotionEffect(PotionEffect potionEffect) {
    }

    void af() {
        if (!this.world.isRemote) {
            return;
        }
        if (!this.bu) {
            return;
        }
        Vec3d vec3d = this.getPositionVector();
        Vec3d vec3d2 = this.b("weaponStart").add(vec3d);
        Vec3d vec3d3 = this.b("weaponEnd").add(vec3d);
        float f = 0.1f;
        Random random = this.getRNG();
        for (float f4 = 0.0f; f4 < 1.0f; f4 += f) {
            Vec3d vec3d4 = com.trolmastercard.sexmod.b6.a(vec3d2, vec3d3, (double)f4);
            for (int i = 0; i < 3; ++i) {
                this.world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, vec3d4.x + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), vec3d4.y + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), vec3d4.z + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), 0.0, 0.0, 0.0, new int[0]);
            }
        }
        for (int i = 0; i < 3; ++i) {
            this.world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, vec3d3.x + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1) * (double)(random.nextBoolean() ? 1 : -1), vec3d3.y + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), vec3d3.z + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void ag() {
        if (this.y() == fp.GALATH_DE_SUMMON) {
            return;
        }
        this.C.tickOffset = 0.0;
    }

    @Override
    public String ab() {
        EntityPlayer entityPlayer = this.z();
        if (entityPlayer == null) {
            return super.ab();
        }
        return String.format("%s %s[%s]", super.ab(), TextFormatting.DARK_PURPLE, entityPlayer.getName());
    }

    void h() {
        this.b2.a = false;
        this.V.a = false;
        if ((float)this.ad < 9.0f) {
            return;
        }
        if ((float)this.ad > 30.0f) {
            return;
        }
        this.b2.a = true;
        this.V.a = true;
        boolean bl2 = (Boolean)this.m.get(ay);
        Vec3d vec3d = this.getPositionVector().add(ck.a(bl2 ? ck.c(bz) : bz, 180.0f + this.renderYawOffset));
        Vec3d vec3d2 = this.getPositionVector().add(ck.a(bl2 ? ck.c(bC) : bC, 180.0f + this.renderYawOffset));
        this.b2.setLocationAndAngles(vec3d.x, vec3d.y, vec3d.z, this.renderYawOffset, 0.0f);
        this.V.setLocationAndAngles(vec3d2.x, vec3d2.y, vec3d2.z, this.renderYawOffset, 0.0f);
        this.b2.onUpdate();
        this.V.onUpdate();
    }

    void ah() {
        block1: {
            if (this.y() != fp.SUMMON_SKELETON) {
                this.ad = 0;
                return;
            }
            if (this.ad++ <= 45) break block1;
            this.ad = 0;
        }
    }

    @Override
    public f2 d() {
        return new f2(this.a9, this.bg, this.b4, this.a_);
    }

    void aj() {
        this.b4 = this.a9;
        this.a_ = this.bg;
        Vec3d vec3d = this.W.subtract(this.bD);
        Vec3d vec3d2 = ck.a(vec3d, this.renderYawOffset + 180.0f);
        this.a9 = gc.c(com.trolmastercard.sexmod.be.b(vec3d2.z * 40.0, -50.0, 50.0));
        this.bg = gc.c(com.trolmastercard.sexmod.be.b(vec3d2.x * 40.0, -50.0, 50.0));
    }

    public void f(Vec3d vec3d) {
        if (((Boolean)this.m.get(bP)).booleanValue()) {
            return;
        }
        this.m.set(bP, (Object)true);
        if (this.bZ != null) {
            this.bZ.e(this);
        }
        this.bZ = null;
        Vec3d vec3d2 = this.getPositionVector();
        Random random = this.getRNG();
        Vec3d vec3d3 = vec3d == null ? new Vec3d(random.nextDouble(), random.nextDouble(), random.nextDouble()).normalize() : vec3d2.subtract(vec3d).normalize();
        this.setVelocity(vec3d3.x * 1.0, 1.0, vec3d3.z * 1.0);
        this.b(fp.KNOCK_OUT_FLY);
        this.setNoGravity(false);
        this.noClip = false;
        this.getNavigator().clearPath();
        f_.a((em)this, com.trolmastercard.sexmod.c.GIRLS_GALATH_AAA, true);
    }

    void a(Entity entity) {
        em.a((em)this, TextFormatting.YELLOW + "Galath is paralyzed! Now it's time to corrupt her");
        em.a((em)this, TextFormatting.GRAY + "(Walk to her and right click her)");
        ge.b.sendToAllTracking((IMessage)new bv(this.getPositionVector(), true), (Entity)this);
        this.f((Vec3d)null);
        this.m.set(L, (Object)true);
    }

    @Override
    public void updateAITasks() {
        if (this.P) {
            com.trolmastercard.sexmod.v.a(this);
            return;
        }
        this.P();
        super.updateAITasks();
        this.o.a = this.x();
        if (this.k()) {
            this.ae();
        } else {
            this.an();
        }
    }

    void P() {
        if (this.bK) {
            return;
        }
        this.f(com.trolmastercard.sexmod.bj.c(this));
        this.bK = true;
    }

    boolean x() {
        if (this.y() != fp.NULL) {
            return false;
        }
        return !(Math.abs(this.motionX) + Math.abs(this.motionZ) > 0.01);
    }

    void aq() {
        if (!this.world.isRemote) {
            return;
        }
        if (this.ab() != null) {
            return;
        }
        EntityPlayer entityPlayer = this.z();
        if (entityPlayer == null) {
            return;
        }
        this.d(entityPlayer);
    }

    void d(EntityPlayer entityPlayer) {
        ei ei2 = ei.d(entityPlayer.getPersistentID());
        Vec3d vec3d = new Vec3d(entityPlayer.posX, entityPlayer.posY + (double)(ei2 == null ? entityPlayer.eyeHeight : ei2.getEyeHeight()), entityPlayer.posZ);
        Vec3d vec3d2 = new Vec3d(this.posX, this.posY + (double)this.getEyeHeight(), this.posZ);
        double d = vec3d2.distanceTo(vec3d);
        double d2 = vec3d.y - vec3d2.y;
        this.rotationPitch = (float)(-(Math.sin(d2 / d) * 57.29577951308232));
    }

    void ae() {
        this.aO.setVisible(false);
        if (!com.trolmastercard.sexmod.v.c(this)) {
            com.trolmastercard.sexmod.v.a(this);
            return;
        }
        if (this.ab() != null) {
            this.y();
            return;
        }
        this.m();
        if (this.aF() == null) {
            this.aJ();
        } else {
            this.am();
        }
    }

    void m() {
        block1: {
            if (!com.trolmastercard.sexmod.v.b(com.trolmastercard.sexmod.v.b(this))) {
                return;
            }
            boolean bl2 = this.v();
            if (!bl2) break block1;
            Main.LOGGER.warn("mommy thinks she got no daughter but she actually does have one. Failsafe called. Hopefully its fixed");
        }
    }

    void am() {
        if (this.ai()) {
            return;
        }
        this.m.set(bT, (Object)false);
        this.ao();
    }

    boolean ai() {
        UUID uUID = com.trolmastercard.sexmod.v.b(this);
        if (uUID == null) {
            return false;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            return false;
        }
        BlockPos blockPos = entityPlayer.getPosition();
        if (!this.a(blockPos)) {
            return false;
        }
        if (this.bZ != null) {
            this.bZ.e(this);
            this.bZ = null;
        }
        float f = this.getDistance((Entity)entityPlayer);
        PathNavigate pathNavigate = this.getNavigator();
        if (f < 4.0f) {
            pathNavigate.clearPath();
            return false;
        }
        if (f > 16.0f) {
            pathNavigate.clearPath();
            this.b(entityPlayer);
            return true;
        }
        if (fl.a(this.aq).distanceSq((Vec3i)blockPos) > 16.0) {
            if (!this.onGround) {
                return true;
            }
            this.aq = this.a(entityPlayer, blockPos);
            if (this.aq == null) {
                this.b(entityPlayer);
            } else {
                pathNavigate.setPath(this.aq, 1.0);
            }
        }
        if (this.aq == null || this.aq.isFinished()) {
            return false;
        }
        boolean bl2 = entityPlayer.isSprinting() || this.getDistance((Entity)entityPlayer) > 7.0f;
        double d = bl2 ? (double)0.55f : 0.5;
        double d2 = Math.floor(f / 5.0f) * 0.2;
        d += d2;
        if (this.isInWater()) {
            d *= 60.0;
        }
        pathNavigate.setSpeed(d);
        this.m.set(bT, (Object)bl2);
        this.b((fp)null);
        return true;
    }

    boolean a(BlockPos blockPos) {
        if (this.bZ == null) {
            return true;
        }
        BlockPos blockPos2 = this.getPosition();
        int n2 = Math.abs(blockPos.getX() - blockPos2.getX()) + Math.abs(blockPos.getX() - blockPos2.getX());
        return n2 > 16;
    }

    protected void b(EntityPlayer entityPlayer) {
        BlockPos blockPos;
        int n2 = 0;
        do {
            blockPos = entityPlayer.getPosition().add(com.trolmastercard.sexmod.r.f.nextInt(4), 0, com.trolmastercard.sexmod.r.f.nextInt(4));
        } while (++n2 < 20 && !this.attemptTeleport(blockPos.getX(), blockPos.getY(), blockPos.getZ()));
        if (n2 >= 20) {
            this.setPosition(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        }
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
    }

    @Nullable
    Path a(EntityPlayer entityPlayer, BlockPos blockPos) {
        PathNavigate pathNavigate = this.getNavigator();
        return pathNavigate.getPathToEntityLiving((Entity)entityPlayer);
    }

    void aJ() {
        this.at();
        this.ay();
    }

    void y() {
        block0: {
            this.bG = null;
            this.aC = 0;
            if (this.bZ == null) break block0;
            this.bZ.e(this);
            this.bZ = null;
        }
    }

    void at() {
        f8 f822;
        if (!this.onGround) {
            return;
        }
        if (this.aF() != null) {
            return;
        }
        if (this.y() == fp.HUG_MANG) {
            return;
        }
        if (com.trolmastercard.sexmod.v.b(com.trolmastercard.sexmod.v.f(this.f()))) {
            return;
        }
        BlockPos blockPos = this.getPosition();
        BlockPos blockPos2 = blockPos.add(-15.0, -15.0, -15.0);
        BlockPos blockPos3 = blockPos.add(15.0, 15.0, 15.0);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos2, blockPos3);
        List list = this.world.getEntitiesWithinAABB(f8.class, axisAlignedBB);
        f8 f83 = null;
        for (f8 f822 : list) {
            if (f822.isDead || f822.a(true) != null) continue;
            f83 = f822;
            break;
        }
        if (f83 == null) {
            if (this.y() == fp.RUN) {
                this.b((fp)null);
                this.getNavigator().clearPath();
            }
            return;
        }
        this.f = this.getNavigator();
        if (f83.getDistance((Entity)this) <= 3.65f) {
            this.f.clearPath();
            this.b(fp.HUG_MANG);
            this.motionX = 0.0;
            this.motionY = 0.0;
            this.motionZ = 0.0;
            this.c(this.getPositionVector());
            this.a(true);
            this.a(f83.f());
            f83.a(this.f());
            f83.b(fp.RIDE_MOMMY_HEAD);
            com.trolmastercard.sexmod.v.e(this.f());
            return;
        }
        Vec3d vec3d = this.getPositionVector();
        f822 = f83.getPositionVector();
        Vec3d vec3d2 = f822.subtract(vec3d);
        float f = (float)gc.b(Math.atan2(vec3d2.z, vec3d2.x)) - 90.0f;
        this.b(f);
        this.f.clearPath();
        this.f.tryMoveToEntityLiving((Entity)f83, (double)0.65f);
        this.b(fp.RUN);
    }

    void ay() {
        fp fp2 = this.y();
        if (fp2 == fp.RUN) {
            return;
        }
        if (fp2 == fp.HUG_MANG) {
            return;
        }
        if (this.Q() || fp2 == fp.MASTERBATE) {
            this.getNavigator().clearPath();
            return;
        }
        EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 15.0);
        if (this.J() && entityPlayer != null && entityPlayer.getDistance((Entity)this) < 2.0f && entityPlayer.getPersistentID().equals(this.O())) {
            this.getNavigator().clearPath();
            return;
        }
        if (this.bG == null || this.getDistance(this.bG.getX(), this.bG.getY(), this.bG.getZ()) > this.i() || this.aC > 175) {
            int n2 = (this.getRNG().nextBoolean() ? 1 : -1) * this.getRNG().nextInt(10);
            int n3 = (this.getRNG().nextBoolean() ? 1 : -1) * this.getRNG().nextInt(10);
            int n4 = this.world.provider.getDimensionType() == DimensionType.NETHER ? (int)Math.ceil(this.posY) : cj.a(this.world, this.getPosition().getX() + n2, this.getPosition().getZ() + n3);
            this.bG = new BlockPos(this.getPosition().getX() + n2, n4, this.getPosition().getZ() + n3);
            this.aC = 0;
        }
        if (Math.sqrt(this.bG.distanceSq((Vec3i)this.getPosition())) > 2.0) {
            this.getNavigator().tryMoveToXYZ((double)this.bG.getX(), (double)this.bG.getY(), (double)this.bG.getZ(), (double)0.35f);
            this.k();
        } else {
            ++this.aC;
        }
    }

    BlockPos av() {
        UUID uUID = com.trolmastercard.sexmod.v.b(this);
        if (uUID == null) {
            return BlockPos.ORIGIN;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            return BlockPos.ORIGIN;
        }
        return entityPlayer.getPosition();
    }

    double i() {
        return Math.sqrt(1800.0);
    }

    @Nullable
    public EntityPlayer ab() {
        List list = this.getPassengers();
        if (list.isEmpty()) {
            return null;
        }
        if (list.get(0) instanceof EntityPlayer) {
            return (EntityPlayer)list.get(0);
        }
        return null;
    }

    @Nullable
    public UUID ax() {
        EntityPlayer entityPlayer = this.ab();
        if (entityPlayer == null) {
            return null;
        }
        return entityPlayer.getPersistentID();
    }

    @Override
    public void g(String string) {
        super.g(string);
        UUID uUID = this.O();
        if (uUID == null) {
            return;
        }
        gy.a(uUID, fy.GALATH, string);
    }

    public void d(Vec3d vec3d) {
        this.motionX += vec3d.x;
        this.motionZ += vec3d.z;
        this.motionY = vec3d.y / 2.0;
    }

    public void t() {
        this.e((UUID)null);
        this.b((fp)null);
    }

    void aB() {
        EntityPlayer entityPlayer = this.ab();
        if (entityPlayer == null) {
            return;
        }
        this.prevRenderYawOffset = entityPlayer.prevRotationYawHead;
        this.renderYawOffset = entityPlayer.rotationYawHead;
    }

    void an() {
        this.aO.setVisible(true);
        this.ao();
        this.as();
    }

    void ao() {
        if (fp.a((em)this, fp.MASTERBATE, fp.HUG_MANG)) {
            return;
        }
        if (this.ae() != null) {
            return;
        }
        this.Q();
        this.I();
        this.D();
        this.q();
        this.J();
        this.T();
        this.S();
        this.b();
        this.ad();
        this.aG();
        this.aA();
        this.aD();
        this.O();
        this.Z();
    }

    void Q() {
        if (!this.k()) {
            return;
        }
        if (this.M() != null) {
            return;
        }
        int n2 = (Integer)this.m.get(bq);
        if (n2 == -1) {
            return;
        }
        if (this.bZ != null) {
            this.bZ.e(this);
        }
        this.bZ = null;
        this.b(fp.NULL);
    }

    void as() {
        if (this.M() != null) {
            this.bG = null;
            this.aC = 0;
            return;
        }
        if (((Boolean)this.m.get(L)).booleanValue()) {
            return;
        }
        if (((Boolean)this.m.get(bP)).booleanValue()) {
            return;
        }
        this.ay();
    }

    @Override
    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp3 == fp.GALATH_DE_SUMMON) {
            return;
        }
        if (fp3 == fp.CORRUPT_CUM && (fp2 == fp.CORRUPT_FAST || fp2 == fp.CORRUPT_SLOW)) {
            return;
        }
        if (fp3 == fp.RAPE_CUM && fp2 == fp.RAPE_ON_GOING) {
            return;
        }
        if (fp3 == fp.MORNING_BLOWJOB_CUM && (fp2 == fp.MORNING_BLOWJOB_SLOW || fp2 == fp.MORNING_BLOWJOB_FAST)) {
            return;
        }
        if (!this.world.isRemote && fp.a(fp3, fp.CORRUPT_CUM, fp.RAPE_CUM, fp.MORNING_BLOWJOB_CUM)) {
            com.trolmastercard.sexmod.v.a(this.ae(), this.world.getTotalWorldTime());
        }
        if (fp2 == fp.CORRUPT_SLOW) {
            this.aT = false;
            if (fp3 == fp.CORRUPT_INTRO) {
                this.d(false);
            }
            if (this.k() && fp3 == fp.NULL) {
                this.d(true);
            }
        }
        if (fp3 == fp.GIVE_COIN && fp2 == fp.NULL && !this.world.isRemote) {
            this.ap();
        }
        if (fp3 == fp.HUG_MANG && fp2 == fp.NULL) {
            this.al();
        }
        if (fp3 == fp.MORNING_BLOWJOB_CUM && fp2 == fp.NULL) {
            this.aE();
        }
        super.b(fp2);
    }

    void aE() {
        EntityPlayer entityPlayer = this.S();
        if (entityPlayer != null) {
            s.a$a.a((EntityPlayerMP)entityPlayer);
        }
        s.a$a.a(this);
    }

    void al() {
        this.a(false);
        f8 f82 = this.a(true);
        if (f82 == null) {
            return;
        }
        f82.c(true);
    }

    void ap() {
        EntityPlayer entityPlayer = this.S();
        if (entityPlayer == null) {
            return;
        }
        ItemStack itemStack = entityPlayer.getHeldItemMainhand();
        entityPlayer.setHeldItem(EnumHand.MAIN_HAND, new ItemStack((Item)cc.r));
        if (!itemStack.isEmpty()) {
            entityPlayer.inventory.addItemStackToInventory(itemStack);
        }
        ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
        this.e((UUID)null);
        this.a((EntityLivingBase)null);
        entityPlayer.sendMessage((ITextComponent)new TextComponentString(TextFormatting.GRAY + "Defeating a succubus makes her accept the victor as her master, granting him a coin to which her soul is bound. Using the coin summons her, offering services on demand. If her master uses the coin on her or goes too far, she returns to the coin"));
        com.trolmastercard.sexmod.v.a(this);
        entityPlayer.setPositionAndUpdate(entityPlayer.posX, Math.ceil(entityPlayer.posY) + 1.0, entityPlayer.posZ);
    }

    @SideOnly(value=Side.CLIENT)
    void H() {
        float f;
        fp fp2 = this.y();
        if (this.ab == fp.CORRUPT_INTRO || fp2 != fp.CORRUPT_INTRO) {
            this.ab = fp2;
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (!entityPlayerSP.getPersistentID().equals(this.ae())) {
            this.ab = fp2;
            return;
        }
        entityPlayerSP.rotationYaw = f = this.k() ? 0.0f : this.I().floatValue() + 180.0f;
        entityPlayerSP.prevRotationYaw = f;
        entityPlayerSP.rotationPitch = 80.0f;
        entityPlayerSP.prevRotationPitch = 80.0f;
        this.ab = fp2;
    }

    void d(boolean bl2) {
        EntityPlayer entityPlayer = this.S();
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = bl2 ? new Vec3d(-0.5, (double)(0.5f - entityPlayer.getEyeHeight()), (double)0.4f).add(this.o()) : ck.a(new Vec3d(0.5, (double)(0.5f - entityPlayer.getEyeHeight()), (double)0.4f), this.I().floatValue()).add(this.o());
        entityPlayer.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public float v() {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.gameSettings.thirdPersonView != 0) {
            return 1.0f;
        }
        switch (this.y()) {
            case CORRUPT_INTRO: {
                if (!this.U) break;
            }
            case CORRUPT_SLOW: 
            case CORRUPT_FAST: 
            case CORRUPT_CUM: {
                return 0.5f;
            }
        }
        return 1.0f;
    }

    @Override
    protected boolean X() {
        return false;
    }

    public boolean v() {
        if (this.a(true) != null) {
            return false;
        }
        f8 f82 = new f8(this.world);
        this.a(f82.f());
        f82.a(this.f());
        f82.c(true);
        f82.b(fp.RIDE_MOMMY_HEAD);
        f82.setPositionAndUpdate(this.posX, this.posY, this.posZ);
        this.world.spawnEntity((Entity)f82);
        return true;
    }

    void Z() {
        if (this.k()) {
            return;
        }
        fp fp2 = this.y();
        if (fp2 != fp.RAPE_CUM) {
            this.at = 0;
            return;
        }
        EntityPlayer entityPlayer = this.S();
        if (entityPlayer == null) {
            this.at = 0;
            return;
        }
        if (++this.at != 15) {
            return;
        }
        entityPlayer.attackEntityFrom((DamageSource)new a3(this), 2.1474836E9f);
    }

    void O() {
        EntityLivingBase entityLivingBase = this.M();
        if (entityLivingBase == null) {
            return;
        }
        for (EntityWitherSkeleton entityWitherSkeleton : this.bI) {
            if (entityWitherSkeleton.isDead || entityLivingBase.getDistance((Entity)entityWitherSkeleton) < 15.0f) continue;
            ge.b.sendToAllTracking((IMessage)new bv(entityWitherSkeleton.getPositionVector(), true), (Entity)this);
            entityWitherSkeleton.setDead();
            this.world.removeEntity((Entity)entityWitherSkeleton);
        }
    }

    void aD() {
        if (!((Boolean)this.m.get(bP)).booleanValue()) {
            return;
        }
        for (EntityWitherSkeleton entityWitherSkeleton : this.bI) {
            if (entityWitherSkeleton.isDead) continue;
            ge.b.sendToAllTracking((IMessage)new bv(entityWitherSkeleton.getPositionVector(), true), (Entity)this);
            entityWitherSkeleton.setDead();
            this.world.removeEntity((Entity)entityWitherSkeleton);
        }
        this.bI.clear();
    }

    public static void c(EntityPlayer entityPlayer) {
        block1: {
            em em2 = em.a(com.trolmastercard.sexmod.v.b(entityPlayer));
            if (em2 == null) {
                return;
            }
            if (!em2.equals(entityPlayer.getRidingEntity())) break block1;
            em2.e(entityPlayer.getPersistentID());
            em2.b(fp.CONTROLLED_FLIGHT);
        }
    }

    void aA() {
        for (EntityWitherSkeleton entityWitherSkeleton : this.bI) {
            if (entityWitherSkeleton.isDead || entityWitherSkeleton.ticksExisted % 10 != 0) continue;
            Set set = ((WorldServer)this.world).getEntityTracker().getTrackingPlayers((Entity)entityWitherSkeleton);
            for (EntityPlayer entityPlayer : set) {
                ((EntityPlayerMP)entityPlayer).connection.sendPacket((Packet)new SPacketParticles(EnumParticleTypes.DRAGON_BREATH, false, (float)entityWitherSkeleton.posX, (float)entityWitherSkeleton.posY, (float)entityWitherSkeleton.posZ, 0.2f * (float)com.trolmastercard.sexmod.be.a(), entityWitherSkeleton.getEyeHeight() / 2.0f, 0.2f * (float)com.trolmastercard.sexmod.be.a(), 0.0f, 5, new int[0]));
            }
        }
    }

    void aG() {
        ArrayList<EntityWitherSkeleton> arrayList = new ArrayList<EntityWitherSkeleton>();
        for (EntityWitherSkeleton entityWitherSkeleton : this.bI) {
            if (!entityWitherSkeleton.isDead) continue;
            arrayList.add(entityWitherSkeleton);
        }
        for (EntityWitherSkeleton entityWitherSkeleton : arrayList) {
            this.bI.remove(entityWitherSkeleton);
        }
    }

    void ad() {
        if (this.y() != fp.KNOCK_OUT_STAND_UP) {
            return;
        }
        ++this.bY;
        if ((double)this.bY == 39.0) {
            this.setNoGravity(true);
            this.setVelocity(0.0, 0.6f, 0.0);
            Vec3d vec3d = this.getPositionVector();
            Vec3d vec3d2 = vec3d.subtract(2.0, 2.0, 2.0);
            Vec3d vec3d3 = vec3d.add(2.0, 2.0, 2.0);
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(vec3d2.x, vec3d2.y, vec3d2.z, vec3d3.x, vec3d3.y, vec3d3.z);
            List list = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisAlignedBB);
            for (EntityLivingBase entityLivingBase : list) {
                if (entityLivingBase instanceof f_) continue;
                Vec3d vec3d4 = entityLivingBase.getPositionVector();
                Vec3d vec3d5 = vec3d4.subtract(vec3d).normalize();
                entityLivingBase.motionX = vec3d5.x * 1.0;
                entityLivingBase.motionZ = vec3d5.z * 1.0;
                entityLivingBase.motionY = 1.0;
                entityLivingBase.attackEntityFrom((DamageSource)new cs(this), 0.5f);
                if (!(entityLivingBase instanceof EntityPlayerMP)) continue;
                EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityLivingBase;
                entityPlayerMP.connection.sendPacket((Packet)new SPacketEntityVelocity((Entity)entityPlayerMP));
            }
        }
        if ((double)this.bY < 58.0) {
            return;
        }
        this.b(Vec3d.ZERO);
        this.m.set(bP, (Object)false);
        this.bY = 0;
    }

    void b() {
        int n2;
        if (this.y() != fp.KNOCK_OUT_GROUND) {
            return;
        }
        if (((Boolean)this.m.get(L)).booleanValue()) {
            return;
        }
        ++this.b3;
        if ((double)n2 < 50.0) {
            return;
        }
        this.b(fp.KNOCK_OUT_STAND_UP);
        this.bY = 0;
        this.b3 = 0;
    }

    void S() {
        block1: {
            fp fp2 = this.y();
            if (fp2 != fp.KNOCK_OUT_GROUND && fp2 != fp.KNOCK_OUT_STAND_UP) {
                return;
            }
            this.motionX = 0.0;
            this.motionZ = 0.0;
            if (!((Boolean)this.m.get(L)).booleanValue()) break block1;
            this.motionY = 0.0;
        }
    }

    void T() {
        if (this.y() != fp.KNOCK_OUT_FLY) {
            return;
        }
        BlockPos blockPos = this.getPosition();
        if (this.world.getBlockState(blockPos).getBlock() instanceof BlockLiquid) {
            BlockPos blockPos2 = blockPos;
            while (this.world.getBlockState(blockPos2.up()).getBlock() instanceof BlockLiquid) {
                blockPos2 = blockPos2.up();
            }
            for (int i = -1; i < 2; ++i) {
                for (int j = -1; j < 2; ++j) {
                    this.world.setBlockState(blockPos2.add(i, 0, j), Blocks.OBSIDIAN.getDefaultState());
                }
            }
            blockPos2 = blockPos2.up();
            this.setPositionAndUpdate(blockPos2.getX(), blockPos2.getY(), blockPos2.getZ());
            this.c(new Vec3d((Vec3i)blockPos2));
            ge.b.sendToAllTracking((IMessage)new bv(new Vec3d((Vec3i)blockPos2), true), (Entity)this);
            for (EntityPlayer entityPlayer : ((WorldServer)this.world).getEntityTracker().getTrackingPlayers((Entity)this)) {
                ((EntityPlayerMP)entityPlayer).connection.sendPacket((Packet)new SPacketSoundEffect(SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.AMBIENT, this.posX, this.posY, this.posZ, 1.0f, 1.0f));
            }
            this.b(fp.KNOCK_OUT_GROUND);
            return;
        }
        if (!this.onGround) {
            return;
        }
        this.b(fp.KNOCK_OUT_GROUND);
    }

    void J() {
        block1: {
            if (this.bZ != h8.CHANGE_POSITION) {
                return;
            }
            int n2 = this.ar();
            boolean bl2 = this.noClip = n2 == 0;
            if (this.world.isAirBlock(this.getPosition())) break block1;
            this.noClip = true;
        }
    }

    void q() {
        if (this.bZ == null) {
            return;
        }
        this.bZ.a(this);
    }

    void D() {
        block2: {
            if (this.M() == null) {
                this.aH();
                return;
            }
            if (this.bZ == null) {
                this.z();
                return;
            }
            if (!this.bZ.c(this)) break block2;
            this.z();
        }
    }

    void z() {
        h8 h82;
        if (((Boolean)this.m.get(bP)).booleanValue()) {
            return;
        }
        h8 h83 = this.bZ;
        if (this.ae() != null) {
            if (h83 != null) {
                h83.e(this);
            }
            this.bZ = null;
            return;
        }
        if (h83 != null && h83.applyAttackCoolDown) {
            h83.e(this);
            this.bZ = h8.CHANGE_POSITION;
            this.bZ.b(this);
            return;
        }
        h8[] h8Array = h8.values();
        while (!this.a(h82 = h8Array[this.getRNG().nextInt(h8Array.length)])) {
        }
        this.bZ = h82;
        if (h83 != null) {
            h83.e(this);
        }
        this.bZ.b(this);
    }

    boolean a(h8 h82) {
        if (h82.onlyDoThisOnPlayers && !(this.M() instanceof EntityPlayer)) {
            return false;
        }
        return h82.d(this);
    }

    void aH() {
        this.bZ = null;
    }

    void I() {
        EntityMob entityMob;
        if (this.f()) {
            return;
        }
        if (this.ae() != null) {
            return;
        }
        boolean bl2 = this.k();
        float f = bl2 ? 7.0f : 20.0f;
        Vec3d vec3d = new Vec3d((double)f, (double)f, (double)f);
        Vec3d vec3d2 = this.getPositionVector();
        Vec3d vec3d3 = vec3d2.subtract(vec3d);
        Vec3d vec3d4 = vec3d2.add(vec3d);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(vec3d3.x, vec3d3.y, vec3d3.z, vec3d4.x, vec3d4.y, vec3d4.z);
        Object object = entityMob = bl2 ? this.a(axisAlignedBB) : this.b(axisAlignedBB);
        if (entityMob == null) {
            this.aI();
            return;
        }
        this.a((EntityLivingBase)entityMob);
        em.a((em)this, com.trolmastercard.sexmod.c.GIRLS_GALATH_DIALOG[1], true);
        if (this.bZ != null) {
            this.bZ.e(this);
        }
        this.bZ = h8.CHANGE_POSITION;
        this.bZ.b(this);
    }

    EntityPlayer b(AxisAlignedBB axisAlignedBB) {
        List list = this.world.getEntitiesWithinAABB(EntityPlayer.class, axisAlignedBB, entityPlayer -> !ei.e(entityPlayer) && !entityPlayer.isCreative() && !entityPlayer.isSpectator());
        if (list.isEmpty()) {
            return null;
        }
        return (EntityPlayer)list.get(0);
    }

    EntityMob a(AxisAlignedBB axisAlignedBB) {
        List list = this.world.getEntitiesWithinAABB(EntityMob.class, axisAlignedBB);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList<EntityMob> arrayList = new ArrayList<EntityMob>();
        for (Object object : list) {
            if (!com.trolmastercard.sexmod.d.a((Entity)object)) continue;
            arrayList.add((EntityMob)object);
        }
        Vec3d vec3d = this.getPositionVector().add(0.0, (double)this.getEyeHeight(), 0.0);
        for (EntityMob entityMob : arrayList) {
            if (!com.trolmastercard.sexmod.d.a(this.world, vec3d, (Entity)entityMob)) continue;
            return entityMob;
        }
        return null;
    }

    void aI() {
        if (this.M() == null) {
            return;
        }
        this.a((EntityLivingBase)null);
        if (this.bZ != null) {
            this.bZ.e(this);
        }
        this.bZ = null;
        if (((Boolean)this.m.get(bP)).booleanValue()) {
            return;
        }
        this.b(fp.NULL);
    }

    boolean f() {
        float f;
        EntityLivingBase entityLivingBase = this.M();
        if (entityLivingBase == null) {
            return false;
        }
        if (entityLivingBase.isDead) {
            return false;
        }
        if (entityLivingBase.dimension != this.dimension) {
            return false;
        }
        float f4 = this.getDistance((Entity)entityLivingBase);
        float f5 = f = this.k() ? 16.0f : 30.0f;
        if (f4 > f) {
            return false;
        }
        if (!(entityLivingBase instanceof EntityPlayer)) {
            return true;
        }
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        if (em.c(entityPlayer.getPersistentID()) != null) {
            return false;
        }
        if (entityPlayer.isCreative()) {
            return false;
        }
        return !entityPlayer.isSpectator();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public em E() {
        f8 f82 = this.a(false);
        if (f82 == null) {
            return super.E();
        }
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP.isSneaking()) {
            return f82;
        }
        entityPlayerSP.sendStatusMessage((ITextComponent)new TextComponentString(TextFormatting.GRAY + "[sneak] + [right click] if you want to edit Manglelie instead"), true);
        return super.E();
    }

    protected boolean processInteract(EntityPlayer entityPlayer, EnumHand enumHand) {
        if (this.k()) {
            return this.a(entityPlayer, enumHand);
        }
        return this.b(entityPlayer, enumHand);
    }

    boolean a(EntityPlayer entityPlayer, EnumHand enumHand) {
        block3: {
            if (!entityPlayer.getPersistentID().equals(this.O())) {
                return false;
            }
            if (fp.a((em)this, fp.HUG_MANG, fp.RUN, fp.GALATH_SUMMON, fp.GALATH_DE_SUMMON, fp.MASTERBATE)) {
                return false;
            }
            if (((Object)((Object)cc.r)).equals(entityPlayer.getHeldItem(EnumHand.OFF_HAND).getItem()) || ((Object)((Object)cc.r)).equals(entityPlayer.getHeldItem(EnumHand.MAIN_HAND).getItem())) {
                return false;
            }
            this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_HUH, new int[0]);
            String[] stringArray = !entityPlayer.onGround ? new String[]{"ride"} : (this.a(false) == null ? new String[]{"cowgirl", "anal", "ride"} : new String[]{"cowgirl", "anal", "threesome", "ride"});
            if (!this.world.isRemote) break block3;
            f_.a(entityPlayer, this.af(), stringArray, false);
        }
        return true;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void a(String string, UUID uUID) {
        if ("ride".equals(string)) {
            hf.f();
            ge.b.sendToServer((IMessage)new bk());
            return;
        }
        if ("anal".equals(string)) {
            fh.b();
            d3.a(false);
            com.trolmastercard.sexmod.be.a(1200, () -> {
                EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
                this.c(entityPlayerSP.getPositionVector());
                this.b(0.0f);
                this.e(entityPlayerSP.getPersistentID());
                this.a(true);
                this.b(fp.CORRUPT_SLOW);
            });
            return;
        }
        if ("cowgirl".equals(string)) {
            fh.b();
            d3.a(false);
            com.trolmastercard.sexmod.be.a(1200, () -> {
                EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
                this.c(entityPlayerSP.getPositionVector());
                this.b(entityPlayerSP.rotationYaw + 180.0f);
                this.b(fp.RAPE_INTRO);
                this.e(entityPlayerSP.getPersistentID());
                this.a(true);
            });
            return;
        }
        if ("threesome".equals(string)) {
            f8 f82 = this.a(false);
            if (f82 == null) {
                return;
            }
            fh.b();
            d3.a(false);
            com.trolmastercard.sexmod.be.a(1200, () -> {
                Minecraft minecraft = Minecraft.getMinecraft();
                EntityPlayerSP entityPlayerSP = minecraft.player;
                minecraft.gameSettings.thirdPersonView = 1;
                f82.c(entityPlayerSP.getPositionVector());
                this.c(entityPlayerSP.getPositionVector());
                f82.b(entityPlayerSP.rotationYaw + 180.0f);
                this.b(entityPlayerSP.rotationYaw);
                f82.b(fp.THREESOME_SLOW);
                this.b(fp.PUSSY_LICKING);
                f82.e(entityPlayerSP.getPersistentID());
                this.e(entityPlayerSP.getPersistentID());
                f82.a(true);
                this.a(true);
            });
        }
    }

    boolean b(EntityPlayer entityPlayer, EnumHand enumHand) {
        if (!((Boolean)this.m.get(bP)).booleanValue()) {
            return super.processInteract(entityPlayer, enumHand);
        }
        if (this.y() != fp.KNOCK_OUT_GROUND) {
            return super.processInteract(entityPlayer, enumHand);
        }
        if (this.world.isRemote) {
            entityPlayer.rotationYaw -= -128.0f;
            entityPlayer.rotationPitch = 19.0f;
            return true;
        }
        this.b(fp.CORRUPT_INTRO);
        this.e(entityPlayer.getPersistentID());
        this.a(true);
        this.c(this.getPositionVector());
        this.b(entityPlayer.rotationYaw);
        ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        entityPlayer.setPositionAndUpdate(this.posX, this.posY, this.posZ);
        return true;
    }

    @Nullable
    public Entity[] getParts() {
        return new Entity[]{this.V, this.b2};
    }

    public void a(@Nullable EntityLivingBase entityLivingBase) {
        if (entityLivingBase == null) {
            this.m.set(bq, (Object)-1);
            return;
        }
        this.m.set(bq, (Object)entityLivingBase.getEntityId());
    }

    public int ar() {
        return (Integer)this.m.get(aP);
    }

    public void b(int n2) {
        this.m.set(aP, (Object)n2);
    }

    public EntityLivingBase M() {
        int n2 = (Integer)this.m.get(bq);
        if (-1 == n2) {
            return null;
        }
        return (EntityLivingBase)this.world.getEntityByID(n2);
    }

    public static Float a(f_ f_2, float f) {
        float f4;
        fp fp2 = f_2.y();
        if (fp2 != fp.FLY && fp2 != fp.SUMMON_SKELETON && fp2 != fp.RAPE_PREPARE) {
            return null;
        }
        EntityLivingBase entityLivingBase = f_2.M();
        if (entityLivingBase == null) {
            return null;
        }
        Vec3d vec3d = com.trolmastercard.sexmod.b6.a(new Vec3d(entityLivingBase.lastTickPosX, entityLivingBase.lastTickPosY, entityLivingBase.lastTickPosZ), entityLivingBase.getPositionVector(), (double)f);
        Vec3d vec3d2 = com.trolmastercard.sexmod.b6.a(new Vec3d(f_2.lastTickPosX, f_2.lastTickPosY, f_2.lastTickPosZ), f_2.getPositionVector(), (double)f);
        Vec3d vec3d3 = vec3d.subtract(vec3d2);
        f_2.renderYawOffset = f4 = (float)gc.b(Math.atan2(vec3d3.z, vec3d3.x)) - 90.0f;
        f_2.prevRenderYawOffset = f4;
        return Float.valueOf(f4);
    }

    void c(float f) {
        if (!this.world.isRemote) {
            return;
        }
        if (this.getHealth() - f <= 0.0f) {
            return;
        }
        long l = System.currentTimeMillis();
        if (l < this.bc + 1000L) {
            return;
        }
        this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_UUH, new int[0]);
        this.bc = l;
    }

    public boolean attackEntityFrom(DamageSource damageSource, float f) {
        if (damageSource.isFireDamage()) {
            return false;
        }
        if (DamageSource.DROWN.equals(damageSource)) {
            return false;
        }
        if (DamageSource.CACTUS.equals(damageSource)) {
            return false;
        }
        if (DamageSource.FALL.equals(damageSource)) {
            return false;
        }
        if (DamageSource.FLY_INTO_WALL.equals(damageSource)) {
            return false;
        }
        this.c(f);
        return super.attackEntityFrom(damageSource, f);
    }

    public boolean attackEntityFromPart(MultiPartEntityPart multiPartEntityPart, DamageSource damageSource, float f) {
        block3: {
            if (this.world.isRemote) {
                return false;
            }
            if (!(damageSource.getTrueSource() instanceof EntityPlayer)) {
                return false;
            }
            if (multiPartEntityPart == this.V) {
                this.m.set(b7, (Object)false);
                ge.b.sendToAllTracking((IMessage)new bv(this.V.getPositionVector(), false), (Entity)this);
            }
            if (multiPartEntityPart != this.b2) break block3;
            this.m.set(bN, (Object)false);
            ge.b.sendToAllTracking((IMessage)new bv(this.b2.getPositionVector(), false), (Entity)this);
        }
        return true;
    }

    @Override
    public void g() {
        this.a((EntityLivingBase)null);
        this.aH();
    }

    public World getWorld() {
        return this.world;
    }

    public void setFire(int n2) {
    }

    public void fall(float f, float f4) {
    }

    @Override
    @Nullable
    protected fp c(fp fp2) {
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        block2: {
            if (fp2 == fp.CORRUPT_FAST || fp2 == fp.CORRUPT_SLOW) {
                return fp.CORRUPT_CUM;
            }
            if (fp2 == fp.RAPE_ON_GOING) {
                return fp.RAPE_CUM;
            }
            if (!fp.a(fp2, fp.MORNING_BLOWJOB_SLOW, fp.MORNING_BLOWJOB_FAST)) break block2;
            this.S = true;
        }
        return null;
    }

    @Override
    public boolean c() {
        return this.bb;
    }

    @Override
    public boolean a() {
        switch (this.y()) {
            case CORRUPT_SLOW: 
            case CORRUPT_FAST: 
            case CORRUPT_CUM: 
            case COWGIRLCUM: {
                return false;
            }
        }
        return true;
    }

    public void c(boolean bl2) {
        block4: {
            fp fp2 = this.y();
            if (fp2 != fp.RAPE_ON_GOING && fp2 != fp.RAPE_INTRO) {
                return;
            }
            EntityPlayer entityPlayer = this.S();
            if (entityPlayer == null) {
                return;
            }
            if (0.0f >= entityPlayer.getHealth() - 1.0f) {
                return;
            }
            if (entityPlayer.capabilities.isCreativeMode) {
                return;
            }
            entityPlayer.attackEntityFrom((DamageSource)new a3(this), 1.0f);
            if (!bl2) break block4;
            this.heal(1.5f);
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nBTTagCompound) {
        block0: {
            super.writeEntityToNBT(nBTTagCompound);
            nBTTagCompound.setString("sexmod:master", (String)this.m.get(v));
            if (!this.bA) break block0;
            nBTTagCompound.setBoolean("sexmod:despawned", true);
        }
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nBTTagCompound) {
        block1: {
            String string;
            UUID uUID;
            super.readEntityFromNBT(nBTTagCompound);
            this.m.set(v, (Object)nBTTagCompound.getString("sexmod:master"));
            if (nBTTagCompound.getBoolean("sexmod:despawned")) {
                this.P = true;
            }
            if ((uUID = this.O()) == null || (string = gy.a(uUID, fy.GALATH)) == null) break block1;
            this.g(string);
        }
    }

    public void ak() {
        if (this.y() == fp.MASTERBATE_SITTING) {
            return;
        }
        this.bx = true;
        this.b(fp.MASTERBATE_SITTING);
    }

    public void a() {
        this.a5 = true;
        this.b(fp.PUSSY_LICKING);
    }

    @Override
    protected boolean a(fp fp2, String string, boolean bl2, AnimationEvent animationEvent) {
        if (fp2 == fp.MASTERBATE_SITTING && this.bx) {
            this.bx = false;
            this.a("animation.galath.masterbating_sitting", true, animationEvent, true);
            return true;
        }
        if (fp2 == fp.MORNING_BLOWJOB_FAST && this.S) {
            this.b(fp.MORNING_BLOWJOB_CUM);
            return true;
        }
        if (fp2 == fp.MORNING_BLOWJOB_FAST && this.aD) {
            this.a("animation.shared.bed_fast", true, animationEvent, true);
            this.aD = false;
            return true;
        }
        if (fp2 == fp.MORNING_BLOWJOB_CUM) {
            this.b((fp)null);
            return true;
        }
        if (fp2 == fp.PUSSY_LICKING && this.a5) {
            this.a5 = false;
            this.a("animation.galath.pussy_licking", true, animationEvent, true);
            return true;
        }
        if (fp2 == fp.MORNING_BLOWJOB_SLOW && (this.S || d3.d)) {
            this.aD = true;
            this.b(fp.MORNING_BLOWJOB_FAST);
            this.a("animation.shared.bed_soft", true, animationEvent, true);
            return true;
        }
        if (fp2 == fp.MORNING_BLOWJOB_SLOW && this.bt) {
            this.bt = false;
            this.a("animation.shared.bed_slow", true, animationEvent, true);
            return true;
        }
        if (fp2 == fp.MORNING_BLOWJOB_FAST && !d3.d) {
            this.b(fp.MORNING_BLOWJOB_SLOW);
            this.bt = true;
            this.a("animation.shared.bed_back", true, animationEvent, true);
            return true;
        }
        return false;
    }

    public float b(float f) {
        fp fp2 = this.y();
        if (fp2 == fp.PUSSY_LICKING && !this.a5) {
            return 0.0f;
        }
        if (fp2 == fp.MASTERBATE_SITTING && !this.bx) {
            return 1.0f;
        }
        float f4 = fp.d(this, f);
        if (fp2 == fp.MASTERBATE_SITTING) {
            return f4;
        }
        return 1.0f - f4;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.h()) {
            this.a("animation.galath.idle", true, animationEvent);
            return PlayState.CONTINUE;
        }
        fp fp2 = this.y();
        AnimationController animationController = animationEvent.getController();
        animationController.setAnimationSpeed(1.0);
        if (animationController.equals(this.s)) {
            if (!fp2.autoBlink || fp2 == fp.GALATH_DE_SUMMON) {
                return PlayState.STOP;
            }
            this.a("animation.galath.blink", true, animationEvent);
            return PlayState.CONTINUE;
        }
        if (animationController.equals(this.E)) {
            if (fp2 != fp.NULL) {
                return PlayState.STOP;
            }
            if (!this.onGround) {
                this.a("animation.galath.controlled_flight", true, animationEvent);
                return PlayState.CONTINUE;
            }
            Vec3d vec3d = this.getPositionVector().subtract(new Vec3d(this.lastTickPosX, this.lastTickPosY, this.lastTickPosZ));
            if (vec3d.equals((Object)Vec3d.ZERO)) {
                this.a("animation.galath.idle", true, animationEvent);
                return PlayState.CONTINUE;
            }
            this.rotationYaw = this.rotationYawHead;
            this.a("animation.galath." + ((Boolean)this.m.get(bT) != false ? "run" : "walk"), true, animationEvent);
            return PlayState.CONTINUE;
        }
        switch (this.y()) {
            case NULL: {
                return PlayState.STOP;
            }
            case FLY: {
                this.a("animation.galath.idle_flying", true, animationEvent);
                break;
            }
            case SUMMON_SKELETON: {
                this.a("animation.galath.summon_skeleton" + ((Boolean)this.m.get(ay) != false ? "Mirrored" : ""), true, animationEvent);
                break;
            }
            case ATTACK_SWORD: {
                this.a("animation.galath.attack", true, animationEvent);
                break;
            }
            case KNOCK_OUT_FLY: {
                animationController.setAnimationSpeed(1.5);
                this.a("animation.galath.knockout_air", true, animationEvent);
                break;
            }
            case KNOCK_OUT_GROUND: {
                this.a("animation.galath.knocked_out", true, animationEvent);
                break;
            }
            case KNOCK_OUT_STAND_UP: {
                this.a("animation.galath.knocked_out_stand_up", true, animationEvent);
                break;
            }
            case RAPE_PREPARE: {
                this.a("animation.galath.rape_prepare", true, animationEvent);
                break;
            }
            case RAPE_CHARGE: {
                this.a("animation.galath.rape_charge", true, animationEvent);
                break;
            }
            case RAPE_INTRO: {
                this.a("animation.galath.rape_intro", true, animationEvent);
                break;
            }
            case RAPE_ON_GOING: {
                this.a("animation.galath.rape" + this.b1, true, animationEvent);
                break;
            }
            case RAPE_CUM: {
                this.a("animation.galath.rape_cum", true, animationEvent);
                break;
            }
            case RAPE_CUM_IDLE: {
                this.a("animation.galath.rape_cum_idle", true, animationEvent);
                break;
            }
            case CORRUPT_FAST: {
                this.a("animation.galath.corrupt_" + (this.aT ? "hard" : "soft"), true, animationEvent);
                break;
            }
            case CORRUPT_SLOW: {
                this.a("animation.galath.corrupt_slow", true, animationEvent);
                break;
            }
            case CORRUPT_INTRO: {
                this.a("animation.galath.corrupt_intro", true, animationEvent);
                break;
            }
            case CORRUPT_CUM: {
                this.a("animation.galath.corrupt_cum", true, animationEvent);
                break;
            }
            case CONTROLLED_FLIGHT: {
                this.a("animation.galath.controlled_flight", true, animationEvent);
                break;
            }
            case BOOST: {
                this.a("animation.galath.boost", true, animationEvent);
                break;
            }
            case GALATH_SUMMON: {
                this.a("animation.galath.summon", false, animationEvent);
                break;
            }
            case GALATH_DE_SUMMON: {
                this.a("animation.galath.desummon" + (this.onGround ? "_standing" : ""), true, animationEvent);
                break;
            }
            case GIVE_COIN: {
                this.a("animation.galath.give_coin", true, animationEvent);
                break;
            }
            case MASTERBATE: {
                this.a("animation.galath.masterbate", true, animationEvent);
                break;
            }
            case RUN: {
                animationController.setAnimationSpeed(0.7);
                this.a("animation.galath.running", true, animationEvent);
                break;
            }
            case HUG_MANG: {
                this.a("animation.galath.hug_mang", true, animationEvent);
                break;
            }
            case PUSSY_LICKING: {
                this.a(this.a5 ? "animation.galath.pussy_licking_forward" : "animation.galath.pussy_licking", true, animationEvent);
                break;
            }
            case MASTERBATE_SITTING: {
                this.a(this.bx ? "animation.galath.pussy_licking_back" : "animation.galath.masterbating_sitting", true, animationEvent);
                break;
            }
            case MASTERBATE_SITTING_CUM: {
                this.a("animation.galath.masterbating_sitting_cum", true, animationEvent);
                break;
            }
            case MORNING_BLOWJOB_SLOW: {
                this.a(this.bt ? "animation.shared.bed_back" : "animation.shared.bed_slow", true, animationEvent);
                break;
            }
            case MORNING_BLOWJOB_FAST: {
                if (this.aD) {
                    this.a("animation.shared.bed_soft", true, animationEvent);
                    break;
                }
                this.a("animation.shared.bed_fast", 4, 0.75f, animationEvent);
                break;
            }
            case MORNING_BLOWJOB_CUM: {
                this.a("animation.shared.bed_cum", true, animationEvent);
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void registerControllers(AnimationData animationData) {
        this.C = new bz<f_>(this, "action", 0.0f, this::a);
        this.E = new AnimationController((IAnimatable)this, "movement", 5.0f, this::a);
        this.s = new AnimationController((IAnimatable)this, "eyes", 10.0f, this::a);
        this.C.registerSoundListener(soundKeyframeEvent -> {
            switch (soundKeyframeEvent.sound) {
                case "goodTiming": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_DIALOG[4]);
                    this.a("Good timing boy~");
                    break;
                }
                case "huh": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_HUH, new int[0]);
                    break;
                }
                case "giggle": {
                    Vec3d vec3d = this.A();
                    this.world.playSound(vec3d.x, vec3d.y, vec3d.z, com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_GIGGLE), SoundCategory.HOSTILE, 1.0f, 1.0f, false);
                    break;
                }
                case "dialog1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_DIALOG[1]);
                    break;
                }
                case "moan": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_MOAN, new int[0]);
                    break;
                }
                case "breath": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_BREATHING, new int[0]);
                    break;
                }
                case "dialog5": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_DIALOG[5]);
                    break;
                }
                case "switchmoan": {
                    if (this.a6) {
                        this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_BREATHING, new int[0]);
                    } else {
                        this.a(this.getRNG().nextBoolean() ? com.trolmastercard.sexmod.c.GIRLS_GALATH_MOAN : com.trolmastercard.sexmod.c.GIRLS_GALATH_AHH, new int[0]);
                    }
                    this.a6 = !this.a6;
                    break;
                }
                case "lightcharge": {
                    Vec3d vec3d = this.A();
                    this.world.playSound(vec3d.x, vec3d.y, vec3d.z, com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_LIGHTCHARGE), SoundCategory.HOSTILE, 1.0f, 1.0f, false);
                    break;
                }
                case "strongcharge": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_STRONGCHARGE, new int[0]);
                    break;
                }
                case "hmph": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_HMPH, new int[0]);
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 2.0f);
                    break;
                }
                case "giggle0": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_GIGGLE[0]);
                    break;
                }
                case "orgasm": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_ORGASM, new int[0]);
                    break;
                }
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    break;
                }
                case "flap": {
                    Vec3d vec3d = this.A();
                    this.world.playSound(vec3d.x, vec3d.y, vec3d.z, com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_FLAP), SoundCategory.HOSTILE, 1.0f, 1.0f, false);
                    break;
                }
                case "startRenderSword": {
                    this.ap = true;
                    this.bu = true;
                    break;
                }
                case "stopFadeInParticles": {
                    this.bu = false;
                    break;
                }
                case "stopRenderSword": {
                    this.ap = false;
                    this.bu = false;
                    break;
                }
                case "dontDrawStars": {
                    this.aL = false;
                    break;
                }
                case "setNude": {
                    this.bb = true;
                    Vec3d vec3d = this.getPositionVector();
                    Vec3d vec3d2 = this.b("slipR").add(vec3d);
                    Vec3d vec3d3 = this.b("slipL").add(vec3d);
                    Vec3d vec3d4 = this.b("turnable").add(vec3d);
                    this.world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, vec3d2.x, vec3d2.y, vec3d2.z, 0.0, 0.0, 0.0, new int[0]);
                    this.world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, vec3d3.x, vec3d3.y, vec3d3.z, 0.0, 0.0, 0.0, new int[0]);
                    this.world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, vec3d4.x, vec3d4.y, vec3d4.z, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case "rapeIntroDone": {
                    if (!this.n()) break;
                    this.b(fp.RAPE_ON_GOING);
                    break;
                }
                case "rape_switch": {
                    EntityPlayerSP entityPlayerSP;
                    Random random = this.getRNG();
                    int n2 = this.b1;
                    do {
                        this.b1 = random.nextInt(3);
                    } while (this.b1 == n2);
                    if (this.k() || !this.n() || !(0.0f >= (entityPlayerSP = Minecraft.getMinecraft().player).getHealth() - 1.0f)) break;
                    this.b(fp.RAPE_CUM);
                    break;
                }
                case "poundRape": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    if (!this.n()) break;
                    if (this.k()) {
                        ds.a(0.03f);
                        break;
                    }
                    ge.b.sendToServer((IMessage)new g_(true));
                    break;
                }
                case "rapeHurt": {
                    if (this.k() || !this.n()) break;
                    ge.b.sendToServer((IMessage)new g_(false));
                    break;
                }
                case "enableRapeUI": {
                    if (!this.n()) break;
                    if (this.k()) {
                        ds.a(false);
                        break;
                    }
                    gb.a();
                    break;
                }
                case "removeUI": {
                    if (!this.n() || this.k()) break;
                    gb.d();
                    break;
                }
                case "reloadRenderer": {
                    if (!this.n()) {
                        return;
                    }
                    Minecraft minecraft = Minecraft.getMinecraft();
                    if (minecraft.gameSettings.thirdPersonView == 0) break;
                    minecraft.renderGlobal.loadRenderers();
                    break;
                }
                case "corruptSwitch": {
                    if (!this.n() || !d3.d) break;
                    this.b(fp.CORRUPT_FAST);
                    break;
                }
                case "corrupt_hard": {
                    if (!this.n() || !d3.d) break;
                    this.aT = true;
                    this.N();
                    break;
                }
                case "corrupt_hard_end": {
                    this.b(fp.CORRUPT_SLOW);
                    this.aT = false;
                    break;
                }
                case "addCum": {
                    ds.a(0.03);
                    break;
                }
                case "clearcum": {
                    ga.a(this);
                    break;
                }
                case "setCamCorrupt": {
                    if (!this.n()) {
                        return;
                    }
                    this.U = true;
                    EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
                    float f = this.I().floatValue() + 220.0f;
                    Vec3d vec3d = ck.a(new Vec3d(0.5, (double)(0.5f - entityPlayerSP.getEyeHeight()), (double)0.4f), this.I().floatValue()).add(this.o());
                    ge.b.sendToServer((IMessage)new a8(entityPlayerSP.getPersistentID().toString(), vec3d, f, 15.0f));
                    ds.d();
                    break;
                }
                case "enableBoyCam": {
                    if (!this.n()) break;
                    this.U = false;
                    break;
                }
                case "masterbateCumming": {
                    if (!com.trolmastercard.sexmod.a_.e) break;
                    ga.a(new ep(90, em2 -> {
                        Vec3d vec3d = em2.d("futaCockTip");
                        Vec3d vec3d2 = em2.d("futaCockTipDirHelp");
                        return vec3d.subtract(vec3d2).normalize();
                    }, em2 -> em2.b("futaCockTip").add(em2.o()), this, 0.3f, 0.3f));
                    break;
                }
                case "creampie": {
                    ga.a(new ep(100, em2 -> ck.a(new Vec3d(0.0, 0.0, (double)0.6f), this.I().floatValue()), em2 -> em2.b("creampiePos").add(em2.o()), this, 0.6f, 0.5f));
                }
                case "creampieGalath": {
                    if (com.trolmastercard.sexmod.a_.e) {
                        ga.a(new ep(130, em2 -> {
                            Vec3d vec3d = em2.d("futaCockTip");
                            Vec3d vec3d2 = em2.d("futaCockTipDirHelp");
                            return vec3d.subtract(vec3d2).normalize();
                        }, em2 -> em2.b("futaCockTip").add(em2.o()), this, 0.3f, 0.3f));
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS), 3.0f);
                    break;
                }
                case "blackScreenTamed": {
                    if (!this.k()) break;
                }
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "blackScreenMaster": {
                    if (!Minecraft.getMinecraft().player.getPersistentID().equals(this.O())) break;
                    fh.b();
                    d3.a(false);
                    break;
                }
                case "flapControlled": {
                    if (!this.n()) break;
                    hf.f();
                    this.a(com.trolmastercard.sexmod.c.MISC_FLAP, new int[0]);
                    Minecraft minecraft = Minecraft.getMinecraft();
                    EntityPlayerSP entityPlayerSP = minecraft.player;
                    MovementInput movementInput = entityPlayerSP.movementInput;
                    Vec2f vec2f = movementInput.getMoveVector();
                    if (vec2f.x == 0.0f && vec2f.y == 0.0f) break;
                    Vec3d vec3d = ck.a(new Vec3d((double)(-vec2f.x), 0.0, (double)vec2f.y), com.trolmastercard.sexmod.b6.a(entityPlayerSP.prevRotationPitch, entityPlayerSP.rotationPitch, minecraft.getRenderPartialTicks()), com.trolmastercard.sexmod.b6.a(entityPlayerSP.prevRotationYawHead, entityPlayerSP.rotationYawHead, minecraft.getRenderPartialTicks()));
                    ge.b.sendToServer((IMessage)new ct(vec3d, this.f()));
                    break;
                }
                case "clap": {
                    this.a(com.trolmastercard.sexmod.c.MISC_CLAP, new int[0]);
                    break;
                }
                case "energysound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEEW[1]);
                    break;
                }
                case "energy2": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEEW[2]);
                    break;
                }
                case "tpSound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_WEOWEO[2]);
                    break;
                }
                case "lick": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND));
                    break;
                }
                case "setCoinLook": {
                    float f;
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
                    entityPlayerSP.rotationYaw = f = this.I().floatValue() + 180.0f;
                    entityPlayerSP.prevRotationYaw = f;
                    entityPlayerSP.rotationPitch = 0.0f;
                    entityPlayerSP.prevRotationPitch = 0.0f;
                    break;
                }
                case "sexui": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "boostSound": {
                    Minecraft.getMinecraft().player.playSound(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_LIGHTCHARGE), 1.0f, 1.0f);
                    Minecraft.getMinecraft().player.playSound(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_FLAP), 1.0f, 1.0f);
                }
            }
        });
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.s);
        animationData.addAnimationController(this.E);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static class a$a {
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
            BlockPos blockPos = entity.getPosition();
            if (!f_.a(blockPos, world = entity.world)) {
                return;
            }
            checkSpawn.setResult(Event.Result.DENY);
            fq.a(blockPos, fq.c);
            f_ f_2 = new f_(world);
            f_2.setPositionAndUpdate(blockPos.getX(), blockPos.getY(), blockPos.getZ());
            world.spawnEntity((Entity)f_2);
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
            Minecraft minecraft = Minecraft.getMinecraft();
            if (!minecraft.gameSettings.keyBindJump.isKeyDown()) {
                return;
            }
            if (!hf.d()) {
                return;
            }
            Iterator<em> iterator = em.ad().iterator();
            do {
                if (!iterator.hasNext()) return;
                em2 = iterator.next();
            } while (!em2.world.isRemote || !(em2 instanceof f_) || !minecraft.player.getPersistentID().equals(((f_)em2).ax()));
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
            if (entity.world.isRemote) {
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
            if (livingDeathEvent.getSource().equals(DamageSource.OUT_OF_WORLD)) {
                return;
            }
            f_ f_2 = (f_)entity;
            if (f_2.bU) {
                return;
            }
            if (entity.world.isRemote) {
                return;
            }
            if (!f_2.k()) {
                f_2.a((Entity)f_2.getCombatTracker().getFighter());
            } else {
                cc.a(f_2);
                ge.b.sendToAllTracking((IMessage)new ab(f_2.f(), com.trolmastercard.sexmod.v.b(f_2)), (Entity)f_2);
                com.trolmastercard.sexmod.be.a(900, () -> com.trolmastercard.sexmod.v.a(f_2));
                f_2.bU = true;
            }
            f_2.setHealth(1.0f);
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
                var2_2 = Minecraft.getMinecraft();
                var3_3 = var2_2.getRenderManager();
                var4_4 = var2_2.getRenderPartialTicks();
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
                    if (!var6_7.world.isRemote || var6_7.y() != fp.SUMMON_SKELETON || (var7_8 = (double)((f_)var6_7).ad) < 9.0 || var7_8 > 30.0) ** GOTO lbl-1000
                }
                {
                    var9_9 = com.trolmastercard.sexmod.b6.a(new Vec3d(var6_7.lastTickPosX, var6_7.lastTickPosY, var6_7.lastTickPosZ), var6_7.getPositionVector(), (double)var4_4);
                    var10_10 = (var7_8 - 9.0) / 21.0;
                    if (((Boolean)var6_7.getDataManager().get(f_.bN)).booleanValue()) {
                        var12_11 = var6_7.b("energyBallR");
                        var13_12 = var9_9.add(var12_11);
                        var14_13 = new c4(var6_7.world, (f_)var6_7);
                        var14_13.g = var10_10;
                        var14_13.setPositionAndUpdate(var13_12.x, var13_12.y, var13_12.z);
                        var3_3.renderEntity((Entity)var14_13, 0.0, 0.0, 0.0, 0.0f, var4_4, true);
                        var14_13.setPosition(0.0, -500.0, 0.0);
                        var14_13.setDead();
                    }
                    if (!((Boolean)var6_7.getDataManager().get(f_.b7)).booleanValue()) ** GOTO lbl-1000
                    var12_11 = var6_7.b("energyBallL");
                    var13_12 = var9_9.add(var12_11);
                    var14_13 = new c4(var6_7.world, (f_)var6_7);
                    var14_13.setPositionAndUpdate(var13_12.x, var13_12.y, var13_12.z);
                    var14_13.g = var10_10;
                    var3_3.renderEntity((Entity)var14_13, 0.0, 0.0, 0.0, 0.0f, var4_4, true);
                    var14_13.setPosition(0.0, -500.0, 0.0);
                    var14_13.setDead();
                    ** GOTO lbl-1000
                }
            }
            GlStateManager.enableLighting();
            GlStateManager.enableDepth();
            GlStateManager.enableAlpha();
        }

        boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
            if (enumFacing == EnumFacing.NORTH) {
                if (this.a(world, blockPos = blockPos.west())) {
                    return false;
                }
                if (this.a(world, blockPos.up())) {
                    return false;
                }
                if (this.a(world, blockPos.south())) {
                    return false;
                }
                return !this.a(world, blockPos.south().up());
            }
            if (enumFacing == EnumFacing.WEST) {
                if (this.a(world, blockPos = blockPos.south())) {
                    return false;
                }
                if (this.a(world, blockPos.up())) {
                    return false;
                }
                if (this.a(world, blockPos.east())) {
                    return false;
                }
                return !this.a(world, blockPos.east().up());
            }
            if (enumFacing == EnumFacing.SOUTH) {
                if (this.a(world, blockPos = blockPos.east())) {
                    return false;
                }
                if (this.a(world, blockPos.up())) {
                    return false;
                }
                if (this.a(world, blockPos.north())) {
                    return false;
                }
                return !this.a(world, blockPos.north().up());
            }
            if (enumFacing == EnumFacing.EAST) {
                if (this.a(world, blockPos = blockPos.north())) {
                    return false;
                }
                if (this.a(world, blockPos.up())) {
                    return false;
                }
                if (this.a(world, blockPos.west())) {
                    return false;
                }
                return !this.a(world, blockPos.west().up());
            }
            Main.LOGGER.error("Weird bed orientation, when checking for space next to bed, on galaths morning blowjob animation: " + enumFacing.getName());
            return false;
        }

        boolean a(World world, BlockPos blockPos) {
            Block block = world.getBlockState(blockPos).getBlock();
            for (Class<?> clazz : aS) {
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
            if (entityPlayer.world.isRemote) {
                return;
            }
            if (!com.trolmastercard.sexmod.v.a(entityPlayer.getPersistentID(), entityPlayer.world)) {
                return;
            }
            Vec3d vec3d = entityPlayer.getPositionVector();
            BlockPos blockPos = new BlockPos(vec3d);
            if (!this.a(entityPlayer.world, blockPos, enumFacing = (EnumFacing)entityPlayer.world.getBlockState(blockPos).getValue((IProperty)BlockHorizontal.FACING))) {
                entityPlayer.sendMessage((ITextComponent)new TextComponentString(String.format("%sFor Galath and Manglelie to %swake you up with a blowjob%s, you have to provide enough space to the %sright side%s of your bed. This includes the %stop and bottom half%s of the bed.", TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY, TextFormatting.DARK_RED, TextFormatting.GRAY)));
                return;
            }
            switch ((EnumFacing)entityPlayer.world.getBlockState(blockPos).getValue((IProperty)BlockHorizontal.FACING)) {
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
            Vec3d vec3d2 = new Vec3d((double)blockPos.getX() + 0.5, (double)blockPos.getY(), (double)blockPos.getZ() + 0.5);
            UUID uUID = com.trolmastercard.sexmod.v.b(entityPlayer);
            if (uUID != null) {
                com.trolmastercard.sexmod.v.a((f_)em.a(uUID));
            }
            f_ f_2 = new f_(entityPlayer.world, entityPlayer, vec3d, true);
            f_2.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
            entityPlayer.world.spawnEntity((Entity)f_2);
            com.trolmastercard.sexmod.v.a(entityPlayer, f_2);
            f_2.v();
            f_2.c(vec3d2);
            f_2.b(f);
            f_2.a(true);
            f_2.e(entityPlayer.getPersistentID());
            f_2.b(fp.MORNING_BLOWJOB_SLOW);
            ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
            com.trolmastercard.sexmod.be.a(500, () -> {
                entityPlayer.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
                ge.b.sendTo((IMessage)new aq(-10.0f, f + 180.0f + 5.0f, 0), (EntityPlayerMP)entityPlayer);
            });
        }

        private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
            return concurrentModificationException;
        }
    }
}
