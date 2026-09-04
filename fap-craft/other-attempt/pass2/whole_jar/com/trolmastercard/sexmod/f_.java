/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockBanner
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.BlockButton
 *  net.minecraft.block.BlockCarpet
 *  net.minecraft.block.BlockLadder
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.BlockSign
 *  net.minecraft.block.BlockTorch
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.particle.Particle
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
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.a3;
import com.trolmastercard.sexmod.a8;
import com.trolmastercard.sexmod.a_;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.b7;
import com.trolmastercard.sexmod.bb;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.bj;
import com.trolmastercard.sexmod.bk;
import com.trolmastercard.sexmod.bv;
import com.trolmastercard.sexmod.bz;
import com.trolmastercard.sexmod.c;
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
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBanner;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.particle.Particle;
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
    public static final DataParameter<Integer> bq = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(111);
    public static final DataParameter<Integer> aP = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(112);
    public static final DataParameter<Boolean> bN = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(113);
    public static final DataParameter<Boolean> b7 = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(114);
    public static final DataParameter<Boolean> ay = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(115);
    public static final DataParameter<Integer> bH = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(116);
    public static final DataParameter<String> b8 = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(117);
    public static final DataParameter<Boolean> bP = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(118);
    public static final DataParameter<Float> bO = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187193_c).func_187156_b().func_187161_a(119);
    public static final DataParameter<Boolean> L = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(120);
    public static final DataParameter<String> a4 = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(121);
    public static final DataParameter<Boolean> bT = EntityDataManager.func_187226_a(f_.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(122);
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
        this.m.func_187227_b(v, (Object)uUID.toString());
        this.aO.func_186758_d(false);
        this.bG = new BlockPos(this.func_174791_d());
        String string = gy.a(uUID, fy.GALATH);
        if (string != null) {
            super.g(string);
        }
        if (bl2) {
            return;
        }
        if (this.func_70681_au().nextFloat() > 0.1f) {
            this.b(fp.GALATH_SUMMON);
            return;
        }
        this.b(fp.MASTERBATE);
        this.b(180.0f - (float)gc.b(Math.atan2(vec3d.field_72450_a - entityPlayer.field_70165_t, vec3d.field_72449_c - entityPlayer.field_70161_v)));
        com.trolmastercard.sexmod.be.a(8000, () -> {
            EntityPlayer entityPlayer = this.z();
            if (entityPlayer == null) {
                return;
            }
            if (entityPlayer.field_70128_L) {
                return;
            }
            this.c(entityPlayer.func_174791_d());
            this.b(entityPlayer.field_70177_z + 180.0f);
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

    public float func_70047_e() {
        return 1.9f;
    }

    public boolean k() {
        return this.J();
    }

    public boolean func_96092_aw() {
        return false;
    }

    protected void func_70629_bd() {
        block0: {
            if (!this.k()) break block0;
            super.func_70629_bd();
        }
    }

    protected float func_189749_co() {
        if (this.k()) {
            return super.func_189749_co();
        }
        return 0.0f;
    }

    public boolean func_70090_H() {
        if (this.k()) {
            return super.func_70090_H();
        }
        return false;
    }

    public boolean func_70072_I() {
        if (this.k()) {
            return super.func_70072_I();
        }
        return false;
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.m.func_187214_a(bq, (Object)-1);
        this.m.func_187214_a(aP, (Object)0);
        this.m.func_187214_a(bN, (Object)true);
        this.m.func_187214_a(b7, (Object)true);
        this.m.func_187214_a(ay, (Object)false);
        this.m.func_187214_a(b8, (Object)"null");
        this.m.func_187214_a(bH, (Object)-1);
        this.m.func_187214_a(bP, (Object)false);
        this.m.func_187214_a(bO, (Object)Float.valueOf(0.0f));
        this.m.func_187214_a(L, (Object)false);
        this.m.func_187214_a(a4, (Object)"");
        this.m.func_187214_a(bT, (Object)false);
    }

    @Override
    protected void func_110147_ax() {
        this.func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111267_a);
        this.func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111266_c);
        this.func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111263_d);
        this.func_110140_aT().func_111150_b(SharedMonsterAttributes.field_188791_g);
        this.func_110140_aT().func_111150_b(SharedMonsterAttributes.field_189429_h);
        this.func_110140_aT().func_111150_b(SWIM_SPEED);
        this.func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111265_b).func_111128_a(50.0);
        this.func_110140_aT().func_111150_b(SharedMonsterAttributes.field_193334_e);
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(110.0);
        this.func_110148_a(SharedMonsterAttributes.field_193334_e).func_111128_a((double)0.6f);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a((double)0.6f);
    }

    @Override
    protected void func_184651_r() {
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 0.4, false, new HashSet(I)));
        this.field_70714_bg.func_75776_a(3, (EntityAIBase)new hz((EntityLiving)this));
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.o);
    }

    public void func_184178_b(EntityPlayerMP entityPlayerMP) {
        super.func_184178_b(entityPlayerMP);
        this.aO.func_186760_a(entityPlayerMP);
    }

    public void func_184203_c(EntityPlayerMP entityPlayerMP) {
        super.func_184203_c(entityPlayerMP);
        this.aO.func_186761_b(entityPlayerMP);
    }

    @Override
    public Vec3d o() {
        if (this.field_70170_p.field_72995_K && this.aG != null) {
            return this.aG;
        }
        return super.o();
    }

    @Nullable
    public UUID aF() {
        String string = (String)this.m.func_187225_a(a4);
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
        this.m.func_187227_b(a4, (Object)(uUID == null ? "" : uUID.toString()));
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
        String[] stringArray = ((String)this.m.func_187225_a(b8)).split("\\|");
        return new Vec3d(Double.parseDouble(stringArray[0]), Double.parseDouble(stringArray[1]), Double.parseDouble(stringArray[2]));
    }

    public void e(@Nullable Vec3d vec3d) {
        this.m.func_187227_b(b8, (Object)(vec3d.field_72450_a + "|" + vec3d.field_72448_b + "|" + vec3d.field_72449_c));
    }

    public int az() {
        return (Integer)this.m.func_187225_a(bH);
    }

    public void a(int n2) {
        this.m.func_187227_b(bH, (Object)n2);
    }

    public boolean func_184222_aU() {
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
        this.Z = new Vec3d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
        this.bD = this.func_174791_d();
        this.W = this.func_174791_d().func_178787_e(this.Z);
        this.Z = this.Z.func_186678_a(0.9);
    }

    @Override
    public void func_70071_h_() {
        block4: {
            boolean bl2 = this.k();
            if (bl2) {
                this.E();
            } else {
                this.c();
            }
            this.aa();
            super.func_70071_h_();
            if (bl2) {
                this.au();
            } else {
                this.R();
            }
            if (!this.field_70170_p.field_72995_K) break block4;
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
            cc.a((EntityPlayer)Minecraft.func_71410_x().field_71439_g, this);
        }
        if (n2 <= 25 || n2 >= 38) {
            return;
        }
        Vec3d vec3d = this.func_174791_d();
        Vec3d vec3d2 = this.b("weapon").func_178787_e(vec3d);
        Vec3d vec3d3 = this.b("offhand").func_178787_e(vec3d);
        ez.b = 0.5f;
        for (float f10 = 0.0f; f10 < 1.0f; f10 += 0.2f) {
            Vec3d vec3d4 = com.trolmastercard.sexmod.b6.a(vec3d2, vec3d3, (double)f10);
            Minecraft.func_71410_x().field_71452_i.func_78873_a((Particle)new ez(this.field_70170_p, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c));
        }
    }

    void E() {
        this.func_189654_d(this.ab() != null);
    }

    void au() {
        block1: {
            if (!this.func_70090_H() && !this.func_189652_ae() && this.field_70181_x < 0.0 && this.y() != fp.MASTERBATE) {
                this.field_70181_x *= (double)0.4f;
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
        if (this.field_70170_p.field_72995_K) {
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
        entityPlayer.func_70634_a(entityPlayer.field_70165_t, Math.ceil(entityPlayer.field_70163_u) + 1.0, entityPlayer.field_70161_v);
        ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
    }

    void Y() {
        if (this.field_70170_p.field_72995_K) {
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
        entityPlayer.func_70634_a(entityPlayer.field_70165_t, Math.ceil(entityPlayer.field_70163_u) + 1.0, entityPlayer.field_70161_v);
        ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
    }

    static boolean a(BlockPos blockPos, World world) {
        for (BlockPos object : fq.c) {
            if (!(Math.sqrt(blockPos.func_177951_i((Vec3i)object)) < 1000.0)) continue;
            return false;
        }
        try {
            for (em em2 : em.ad()) {
                if (em2.field_70170_p.field_72995_K || !(em2 instanceof f_) || em2.field_70128_L || !(em2.func_174818_b(blockPos) < 1000000.0)) continue;
                return false;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        int n2 = blockPos.func_177956_o();
        while ((float)n2 < 15.0f + (float)blockPos.func_177956_o()) {
            if (world.func_180495_p(new BlockPos(blockPos.func_177958_n(), n2, blockPos.func_177952_p())).func_177230_c() != Blocks.field_150350_a) {
                return false;
            }
            ++n2;
        }
        n2 = blockPos.func_177956_o();
        while ((float)n2 > (float)blockPos.func_177956_o() - 5.0f) {
            if (world.func_180495_p(new BlockPos(blockPos.func_177958_n(), n2, blockPos.func_177952_p())).func_177230_c() instanceof BlockLiquid) {
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
        Vec3d vec3d = entityPlayer.func_70676_i(0.0f).func_72432_b();
        this.field_70159_w = vec3d.field_72450_a * (double)this.al;
        this.field_70181_x = vec3d.field_72448_b * (double)this.al;
        this.field_70179_y = vec3d.field_72449_c * (double)this.al;
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
            if (!this.field_70170_p.field_72995_K) break block0;
            this.H();
        }
    }

    void u() {
        block2: {
            if (this.field_70170_p.field_72995_K) {
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
        if (((Boolean)this.m.func_187225_a(L)).booleanValue()) {
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
        if (!this.field_70170_p.field_72995_K) {
            return;
        }
        if (this.y() == fp.KNOCK_OUT_STAND_UP) {
            return;
        }
        this.aL = true;
    }

    void j() {
        this.aO.func_186735_a(this.func_110143_aJ() / this.func_110138_aP());
    }

    void n() {
        if (((Boolean)this.m.func_187225_a(bP)).booleanValue()) {
            return;
        }
        this.func_189654_d(this.M() != null);
    }

    void L() {
        block0: {
            if (this.y() == fp.ATTACK_SWORD) break block0;
            this.ap = false;
            this.bu = false;
        }
    }

    protected void func_85033_bc() {
    }

    public void func_70690_d(PotionEffect potionEffect) {
    }

    void af() {
        if (!this.field_70170_p.field_72995_K) {
            return;
        }
        if (!this.bu) {
            return;
        }
        Vec3d vec3d = this.func_174791_d();
        Vec3d vec3d2 = this.b("weaponStart").func_178787_e(vec3d);
        Vec3d vec3d3 = this.b("weaponEnd").func_178787_e(vec3d);
        float f10 = 0.1f;
        Random random = this.func_70681_au();
        for (float f11 = 0.0f; f11 < 1.0f; f11 += f10) {
            Vec3d vec3d4 = com.trolmastercard.sexmod.b6.a(vec3d2, vec3d3, (double)f11);
            for (int i2 = 0; i2 < 3; ++i2) {
                this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d4.field_72450_a + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), vec3d4.field_72448_b + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), vec3d4.field_72449_c + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), 0.0, 0.0, 0.0, new int[0]);
            }
        }
        for (int i3 = 0; i3 < 3; ++i3) {
            this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d3.field_72450_a + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1) * (double)(random.nextBoolean() ? 1 : -1), vec3d3.field_72448_b + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), vec3d3.field_72449_c + random.nextDouble() * 0.25 * (double)(random.nextBoolean() ? 1 : -1), 0.0, 0.0, 0.0, new int[0]);
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
        return String.format("%s %s[%s]", super.ab(), TextFormatting.DARK_PURPLE, entityPlayer.func_70005_c_());
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
        boolean bl2 = (Boolean)this.m.func_187225_a(ay);
        Vec3d vec3d = this.func_174791_d().func_178787_e(ck.a(bl2 ? ck.c(bz) : bz, 180.0f + this.field_70761_aq));
        Vec3d vec3d2 = this.func_174791_d().func_178787_e(ck.a(bl2 ? ck.c(bC) : bC, 180.0f + this.field_70761_aq));
        this.b2.func_70012_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, this.field_70761_aq, 0.0f);
        this.V.func_70012_b(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, this.field_70761_aq, 0.0f);
        this.b2.func_70071_h_();
        this.V.func_70071_h_();
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
        Vec3d vec3d = this.W.func_178788_d(this.bD);
        Vec3d vec3d2 = ck.a(vec3d, this.field_70761_aq + 180.0f);
        this.a9 = gc.c(com.trolmastercard.sexmod.be.b(vec3d2.field_72449_c * 40.0, -50.0, 50.0));
        this.bg = gc.c(com.trolmastercard.sexmod.be.b(vec3d2.field_72450_a * 40.0, -50.0, 50.0));
    }

    public void f(Vec3d vec3d) {
        if (((Boolean)this.m.func_187225_a(bP)).booleanValue()) {
            return;
        }
        this.m.func_187227_b(bP, (Object)true);
        if (this.bZ != null) {
            this.bZ.e(this);
        }
        this.bZ = null;
        Vec3d vec3d2 = this.func_174791_d();
        Random random = this.func_70681_au();
        Vec3d vec3d3 = vec3d == null ? new Vec3d(random.nextDouble(), random.nextDouble(), random.nextDouble()).func_72432_b() : vec3d2.func_178788_d(vec3d).func_72432_b();
        this.func_70016_h(vec3d3.field_72450_a * 1.0, 1.0, vec3d3.field_72449_c * 1.0);
        this.b(fp.KNOCK_OUT_FLY);
        this.func_189654_d(false);
        this.field_70145_X = false;
        this.func_70661_as().func_75499_g();
        f_.a((em)this, com.trolmastercard.sexmod.c.GIRLS_GALATH_AAA, true);
    }

    void a(Entity entity) {
        em.a((em)this, TextFormatting.YELLOW + "Galath is paralyzed! Now it's time to corrupt her");
        em.a((em)this, TextFormatting.GRAY + "(Walk to her and right click her)");
        ge.b.sendToAllTracking((IMessage)new bv(this.func_174791_d(), true), (Entity)this);
        this.f((Vec3d)null);
        this.m.func_187227_b(L, (Object)true);
    }

    @Override
    public void func_70619_bc() {
        if (this.P) {
            com.trolmastercard.sexmod.v.a(this);
            return;
        }
        this.P();
        super.func_70619_bc();
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
        return !(Math.abs(this.field_70159_w) + Math.abs(this.field_70179_y) > 0.01);
    }

    void aq() {
        if (!this.field_70170_p.field_72995_K) {
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
        Vec3d vec3d = new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u + (double)(ei2 == null ? entityPlayer.eyeHeight : ei2.func_70047_e()), entityPlayer.field_70161_v);
        Vec3d vec3d2 = new Vec3d(this.field_70165_t, this.field_70163_u + (double)this.func_70047_e(), this.field_70161_v);
        double d10 = vec3d2.func_72438_d(vec3d);
        double d11 = vec3d.field_72448_b - vec3d2.field_72448_b;
        this.field_70125_A = (float)(-(Math.sin(d11 / d10) * 57.29577951308232));
    }

    void ae() {
        this.aO.func_186758_d(false);
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
        this.m.func_187227_b(bT, (Object)false);
        this.ao();
    }

    boolean ai() {
        UUID uUID = com.trolmastercard.sexmod.v.b(this);
        if (uUID == null) {
            return false;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return false;
        }
        BlockPos blockPos = entityPlayer.func_180425_c();
        if (!this.a(blockPos)) {
            return false;
        }
        if (this.bZ != null) {
            this.bZ.e(this);
            this.bZ = null;
        }
        float f10 = this.func_70032_d((Entity)entityPlayer);
        PathNavigate pathNavigate = this.func_70661_as();
        if (f10 < 4.0f) {
            pathNavigate.func_75499_g();
            return false;
        }
        if (f10 > 16.0f) {
            pathNavigate.func_75499_g();
            this.b(entityPlayer);
            return true;
        }
        if (fl.a(this.aq).func_177951_i((Vec3i)blockPos) > 16.0) {
            if (!this.field_70122_E) {
                return true;
            }
            this.aq = this.a(entityPlayer, blockPos);
            if (this.aq == null) {
                this.b(entityPlayer);
            } else {
                pathNavigate.func_75484_a(this.aq, 1.0);
            }
        }
        if (this.aq == null || this.aq.func_75879_b()) {
            return false;
        }
        boolean bl2 = entityPlayer.func_70051_ag() || this.func_70032_d((Entity)entityPlayer) > 7.0f;
        double d10 = bl2 ? (double)0.55f : 0.5;
        double d11 = Math.floor(f10 / 5.0f) * 0.2;
        d10 += d11;
        if (this.func_70090_H()) {
            d10 *= 60.0;
        }
        pathNavigate.func_75489_a(d10);
        this.m.func_187227_b(bT, (Object)bl2);
        this.b((fp)null);
        return true;
    }

    boolean a(BlockPos blockPos) {
        if (this.bZ == null) {
            return true;
        }
        BlockPos blockPos2 = this.func_180425_c();
        int n2 = Math.abs(blockPos.func_177958_n() - blockPos2.func_177958_n()) + Math.abs(blockPos.func_177958_n() - blockPos2.func_177958_n());
        return n2 > 16;
    }

    protected void b(EntityPlayer entityPlayer) {
        BlockPos blockPos;
        int n2 = 0;
        do {
            blockPos = entityPlayer.func_180425_c().func_177982_a(com.trolmastercard.sexmod.r.f.nextInt(4), 0, com.trolmastercard.sexmod.r.f.nextInt(4));
        } while (++n2 < 20 && !this.func_184595_k(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p()));
        if (n2 >= 20) {
            this.func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
        }
        this.field_70159_w = 0.0;
        this.field_70181_x = 0.0;
        this.field_70179_y = 0.0;
    }

    @Nullable
    Path a(EntityPlayer entityPlayer, BlockPos blockPos) {
        PathNavigate pathNavigate = this.func_70661_as();
        return pathNavigate.func_75494_a((Entity)entityPlayer);
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
        if (!this.field_70122_E) {
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
        BlockPos blockPos = this.func_180425_c();
        BlockPos blockPos2 = blockPos.func_177963_a(-15.0, -15.0, -15.0);
        BlockPos blockPos3 = blockPos.func_177963_a(15.0, 15.0, 15.0);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos2, blockPos3);
        List list = this.field_70170_p.func_72872_a(f8.class, axisAlignedBB);
        f8 f83 = null;
        for (f8 f822 : list) {
            if (f822.field_70128_L || f822.a(true) != null) continue;
            f83 = f822;
            break;
        }
        if (f83 == null) {
            if (this.y() == fp.RUN) {
                this.b((fp)null);
                this.func_70661_as().func_75499_g();
            }
            return;
        }
        this.f = this.func_70661_as();
        if (f83.func_70032_d((Entity)this) <= 3.65f) {
            this.f.func_75499_g();
            this.b(fp.HUG_MANG);
            this.field_70159_w = 0.0;
            this.field_70181_x = 0.0;
            this.field_70179_y = 0.0;
            this.c(this.func_174791_d());
            this.a(true);
            this.a(f83.f());
            f83.a(this.f());
            f83.b(fp.RIDE_MOMMY_HEAD);
            com.trolmastercard.sexmod.v.e(this.f());
            return;
        }
        Vec3d vec3d = this.func_174791_d();
        f822 = f83.func_174791_d();
        Vec3d vec3d2 = f822.func_178788_d(vec3d);
        float f10 = (float)gc.b(Math.atan2(vec3d2.field_72449_c, vec3d2.field_72450_a)) - 90.0f;
        this.b(f10);
        this.f.func_75499_g();
        this.f.func_75497_a((Entity)f83, (double)0.65f);
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
            this.func_70661_as().func_75499_g();
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 15.0);
        if (this.J() && entityPlayer != null && entityPlayer.func_70032_d((Entity)this) < 2.0f && entityPlayer.getPersistentID().equals(this.O())) {
            this.func_70661_as().func_75499_g();
            return;
        }
        if (this.bG == null || this.func_70011_f(this.bG.func_177958_n(), this.bG.func_177956_o(), this.bG.func_177952_p()) > this.i() || this.aC > 175) {
            int n2 = (this.func_70681_au().nextBoolean() ? 1 : -1) * this.func_70681_au().nextInt(10);
            int n3 = (this.func_70681_au().nextBoolean() ? 1 : -1) * this.func_70681_au().nextInt(10);
            int n4 = this.field_70170_p.field_73011_w.func_186058_p() == DimensionType.NETHER ? (int)Math.ceil(this.field_70163_u) : cj.a(this.field_70170_p, this.func_180425_c().func_177958_n() + n2, this.func_180425_c().func_177952_p() + n3);
            this.bG = new BlockPos(this.func_180425_c().func_177958_n() + n2, n4, this.func_180425_c().func_177952_p() + n3);
            this.aC = 0;
        }
        if (Math.sqrt(this.bG.func_177951_i((Vec3i)this.func_180425_c())) > 2.0) {
            this.func_70661_as().func_75492_a((double)this.bG.func_177958_n(), (double)this.bG.func_177956_o(), (double)this.bG.func_177952_p(), (double)0.35f);
            this.k();
        } else {
            ++this.aC;
        }
    }

    BlockPos av() {
        UUID uUID = com.trolmastercard.sexmod.v.b(this);
        if (uUID == null) {
            return BlockPos.field_177992_a;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return BlockPos.field_177992_a;
        }
        return entityPlayer.func_180425_c();
    }

    double i() {
        return Math.sqrt(1800.0);
    }

    @Nullable
    public EntityPlayer ab() {
        List list = this.func_184188_bt();
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
        this.field_70159_w += vec3d.field_72450_a;
        this.field_70179_y += vec3d.field_72449_c;
        this.field_70181_x = vec3d.field_72448_b / 2.0;
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
        this.field_70760_ar = entityPlayer.field_70758_at;
        this.field_70761_aq = entityPlayer.field_70759_as;
    }

    void an() {
        this.aO.func_186758_d(true);
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
        int n2 = (Integer)this.m.func_187225_a(bq);
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
        if (((Boolean)this.m.func_187225_a(L)).booleanValue()) {
            return;
        }
        if (((Boolean)this.m.func_187225_a(bP)).booleanValue()) {
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
        if (!this.field_70170_p.field_72995_K && fp.a(fp3, fp.CORRUPT_CUM, fp.RAPE_CUM, fp.MORNING_BLOWJOB_CUM)) {
            com.trolmastercard.sexmod.v.a(this.ae(), this.field_70170_p.func_82737_E());
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
        if (fp3 == fp.GIVE_COIN && fp2 == fp.NULL && !this.field_70170_p.field_72995_K) {
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
            s.a.a.a((EntityPlayerMP)entityPlayer);
        }
        s.a.a.a(this);
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
        ItemStack itemStack = entityPlayer.func_184614_ca();
        entityPlayer.func_184611_a(EnumHand.MAIN_HAND, new ItemStack((Item)cc.r));
        if (!itemStack.func_190926_b()) {
            entityPlayer.field_71071_by.func_70441_a(itemStack);
        }
        ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
        this.e((UUID)null);
        this.a((EntityLivingBase)null);
        entityPlayer.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.GRAY + "Defeating a succubus makes her accept the victor as her master, granting him a coin to which her soul is bound. Using the coin summons her, offering services on demand. If her master uses the coin on her or goes too far, she returns to the coin"));
        com.trolmastercard.sexmod.v.a(this);
        entityPlayer.func_70634_a(entityPlayer.field_70165_t, Math.ceil(entityPlayer.field_70163_u) + 1.0, entityPlayer.field_70161_v);
    }

    @SideOnly(value=Side.CLIENT)
    void H() {
        float f10;
        fp fp2 = this.y();
        if (this.ab == fp.CORRUPT_INTRO || fp2 != fp.CORRUPT_INTRO) {
            this.ab = fp2;
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        if (!entityPlayerSP.getPersistentID().equals(this.ae())) {
            this.ab = fp2;
            return;
        }
        entityPlayerSP.field_70177_z = f10 = this.k() ? 0.0f : this.I().floatValue() + 180.0f;
        entityPlayerSP.field_70126_B = f10;
        entityPlayerSP.field_70125_A = 80.0f;
        entityPlayerSP.field_70127_C = 80.0f;
        this.ab = fp2;
    }

    void d(boolean bl2) {
        EntityPlayer entityPlayer = this.S();
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = bl2 ? new Vec3d(-0.5, (double)(0.5f - entityPlayer.func_70047_e()), (double)0.4f).func_178787_e(this.o()) : ck.a(new Vec3d(0.5, (double)(0.5f - entityPlayer.func_70047_e()), (double)0.4f), this.I().floatValue()).func_178787_e(this.o());
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public float v() {
        Minecraft minecraft = Minecraft.func_71410_x();
        if (minecraft.field_71474_y.field_74320_O != 0) {
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
        f8 f82 = new f8(this.field_70170_p);
        this.a(f82.f());
        f82.a(this.f());
        f82.c(true);
        f82.b(fp.RIDE_MOMMY_HEAD);
        f82.func_70634_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        this.field_70170_p.func_72838_d((Entity)f82);
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
        entityPlayer.func_70097_a((DamageSource)new a3(this), 2.1474836E9f);
    }

    void O() {
        EntityLivingBase entityLivingBase = this.M();
        if (entityLivingBase == null) {
            return;
        }
        for (EntityWitherSkeleton entityWitherSkeleton : this.bI) {
            if (entityWitherSkeleton.field_70128_L || entityLivingBase.func_70032_d((Entity)entityWitherSkeleton) < 15.0f) continue;
            ge.b.sendToAllTracking((IMessage)new bv(entityWitherSkeleton.func_174791_d(), true), (Entity)this);
            entityWitherSkeleton.func_70106_y();
            this.field_70170_p.func_72900_e((Entity)entityWitherSkeleton);
        }
    }

    void aD() {
        if (!((Boolean)this.m.func_187225_a(bP)).booleanValue()) {
            return;
        }
        for (EntityWitherSkeleton entityWitherSkeleton : this.bI) {
            if (entityWitherSkeleton.field_70128_L) continue;
            ge.b.sendToAllTracking((IMessage)new bv(entityWitherSkeleton.func_174791_d(), true), (Entity)this);
            entityWitherSkeleton.func_70106_y();
            this.field_70170_p.func_72900_e((Entity)entityWitherSkeleton);
        }
        this.bI.clear();
    }

    public static void c(EntityPlayer entityPlayer) {
        block1: {
            em em2 = em.a(com.trolmastercard.sexmod.v.b(entityPlayer));
            if (em2 == null) {
                return;
            }
            if (!em2.equals(entityPlayer.func_184187_bx())) break block1;
            em2.e(entityPlayer.getPersistentID());
            em2.b(fp.CONTROLLED_FLIGHT);
        }
    }

    void aA() {
        for (EntityWitherSkeleton entityWitherSkeleton : this.bI) {
            if (entityWitherSkeleton.field_70128_L || entityWitherSkeleton.field_70173_aa % 10 != 0) continue;
            Set set = ((WorldServer)this.field_70170_p).func_73039_n().getTrackingPlayers((Entity)entityWitherSkeleton);
            for (EntityPlayer entityPlayer : set) {
                ((EntityPlayerMP)entityPlayer).field_71135_a.func_147359_a((Packet)new SPacketParticles(EnumParticleTypes.DRAGON_BREATH, false, (float)entityWitherSkeleton.field_70165_t, (float)entityWitherSkeleton.field_70163_u, (float)entityWitherSkeleton.field_70161_v, 0.2f * (float)com.trolmastercard.sexmod.be.a(), entityWitherSkeleton.func_70047_e() / 2.0f, 0.2f * (float)com.trolmastercard.sexmod.be.a(), 0.0f, 5, new int[0]));
            }
        }
    }

    void aG() {
        ArrayList<EntityWitherSkeleton> arrayList = new ArrayList<EntityWitherSkeleton>();
        for (EntityWitherSkeleton entityWitherSkeleton : this.bI) {
            if (!entityWitherSkeleton.field_70128_L) continue;
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
            this.func_189654_d(true);
            this.func_70016_h(0.0, 0.6f, 0.0);
            Vec3d vec3d = this.func_174791_d();
            Vec3d vec3d2 = vec3d.func_178786_a(2.0, 2.0, 2.0);
            Vec3d vec3d3 = vec3d.func_72441_c(2.0, 2.0, 2.0);
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
            List list = this.field_70170_p.func_72872_a(EntityLivingBase.class, axisAlignedBB);
            for (EntityLivingBase entityLivingBase : list) {
                if (entityLivingBase instanceof f_) continue;
                Vec3d vec3d4 = entityLivingBase.func_174791_d();
                Vec3d vec3d5 = vec3d4.func_178788_d(vec3d).func_72432_b();
                entityLivingBase.field_70159_w = vec3d5.field_72450_a * 1.0;
                entityLivingBase.field_70179_y = vec3d5.field_72449_c * 1.0;
                entityLivingBase.field_70181_x = 1.0;
                entityLivingBase.func_70097_a((DamageSource)new cs(this), 0.5f);
                if (!(entityLivingBase instanceof EntityPlayerMP)) continue;
                EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityLivingBase;
                entityPlayerMP.field_71135_a.func_147359_a((Packet)new SPacketEntityVelocity((Entity)entityPlayerMP));
            }
        }
        if ((double)this.bY < 58.0) {
            return;
        }
        this.b(Vec3d.field_186680_a);
        this.m.func_187227_b(bP, (Object)false);
        this.bY = 0;
    }

    void b() {
        int n2;
        if (this.y() != fp.KNOCK_OUT_GROUND) {
            return;
        }
        if (((Boolean)this.m.func_187225_a(L)).booleanValue()) {
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
            this.field_70159_w = 0.0;
            this.field_70179_y = 0.0;
            if (!((Boolean)this.m.func_187225_a(L)).booleanValue()) break block1;
            this.field_70181_x = 0.0;
        }
    }

    void T() {
        if (this.y() != fp.KNOCK_OUT_FLY) {
            return;
        }
        BlockPos blockPos = this.func_180425_c();
        if (this.field_70170_p.func_180495_p(blockPos).func_177230_c() instanceof BlockLiquid) {
            BlockPos blockPos2 = blockPos;
            while (this.field_70170_p.func_180495_p(blockPos2.func_177984_a()).func_177230_c() instanceof BlockLiquid) {
                blockPos2 = blockPos2.func_177984_a();
            }
            for (int i2 = -1; i2 < 2; ++i2) {
                for (int i3 = -1; i3 < 2; ++i3) {
                    this.field_70170_p.func_175656_a(blockPos2.func_177982_a(i2, 0, i3), Blocks.field_150343_Z.func_176223_P());
                }
            }
            blockPos2 = blockPos2.func_177984_a();
            this.func_70634_a(blockPos2.func_177958_n(), blockPos2.func_177956_o(), blockPos2.func_177952_p());
            this.c(new Vec3d((Vec3i)blockPos2));
            ge.b.sendToAllTracking((IMessage)new bv(new Vec3d((Vec3i)blockPos2), true), (Entity)this);
            for (EntityPlayer entityPlayer : ((WorldServer)this.field_70170_p).func_73039_n().getTrackingPlayers((Entity)this)) {
                ((EntityPlayerMP)entityPlayer).field_71135_a.func_147359_a((Packet)new SPacketSoundEffect(SoundEvents.field_187659_cY, SoundCategory.AMBIENT, this.field_70165_t, this.field_70163_u, this.field_70161_v, 1.0f, 1.0f));
            }
            this.b(fp.KNOCK_OUT_GROUND);
            return;
        }
        if (!this.field_70122_E) {
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
            boolean bl2 = this.field_70145_X = n2 == 0;
            if (this.field_70170_p.func_175623_d(this.func_180425_c())) break block1;
            this.field_70145_X = true;
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
        if (((Boolean)this.m.func_187225_a(bP)).booleanValue()) {
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
        while (!this.a(h82 = h8Array[this.func_70681_au().nextInt(h8Array.length)])) {
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
        float f10 = bl2 ? 7.0f : 20.0f;
        Vec3d vec3d = new Vec3d((double)f10, (double)f10, (double)f10);
        Vec3d vec3d2 = this.func_174791_d();
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
        Vec3d vec3d4 = vec3d2.func_178787_e(vec3d);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c);
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
        List list = this.field_70170_p.func_175647_a(EntityPlayer.class, axisAlignedBB, entityPlayer -> !ei.e(entityPlayer) && !entityPlayer.func_184812_l_() && !entityPlayer.func_175149_v());
        if (list.isEmpty()) {
            return null;
        }
        return (EntityPlayer)list.get(0);
    }

    EntityMob a(AxisAlignedBB axisAlignedBB) {
        List list = this.field_70170_p.func_72872_a(EntityMob.class, axisAlignedBB);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList<EntityMob> arrayList = new ArrayList<EntityMob>();
        for (Object object : list) {
            if (!com.trolmastercard.sexmod.d.a((Entity)object)) continue;
            arrayList.add((EntityMob)object);
        }
        Vec3d vec3d = this.func_174791_d().func_72441_c(0.0, (double)this.func_70047_e(), 0.0);
        for (EntityMob entityMob : arrayList) {
            if (!com.trolmastercard.sexmod.d.a(this.field_70170_p, vec3d, (Entity)entityMob)) continue;
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
        if (((Boolean)this.m.func_187225_a(bP)).booleanValue()) {
            return;
        }
        this.b(fp.NULL);
    }

    boolean f() {
        float f10;
        EntityLivingBase entityLivingBase = this.M();
        if (entityLivingBase == null) {
            return false;
        }
        if (entityLivingBase.field_70128_L) {
            return false;
        }
        if (entityLivingBase.field_71093_bK != this.field_71093_bK) {
            return false;
        }
        float f11 = this.func_70032_d((Entity)entityLivingBase);
        float f12 = f10 = this.k() ? 16.0f : 30.0f;
        if (f11 > f10) {
            return false;
        }
        if (!(entityLivingBase instanceof EntityPlayer)) {
            return true;
        }
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        if (em.c(entityPlayer.getPersistentID()) != null) {
            return false;
        }
        if (entityPlayer.func_184812_l_()) {
            return false;
        }
        return !entityPlayer.func_175149_v();
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public em E() {
        f8 f82 = this.a(false);
        if (f82 == null) {
            return super.E();
        }
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        if (entityPlayerSP.func_70093_af()) {
            return f82;
        }
        entityPlayerSP.func_146105_b((ITextComponent)new TextComponentString(TextFormatting.GRAY + "[sneak] + [right click] if you want to edit Manglelie instead"), true);
        return super.E();
    }

    protected boolean func_184645_a(EntityPlayer entityPlayer, EnumHand enumHand) {
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
            if (cc.r.equals(entityPlayer.func_184586_b(EnumHand.OFF_HAND).func_77973_b()) || cc.r.equals(entityPlayer.func_184586_b(EnumHand.MAIN_HAND).func_77973_b())) {
                return false;
            }
            this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_HUH, new int[0]);
            String[] stringArray = !entityPlayer.field_70122_E ? new String[]{"ride"} : (this.a(false) == null ? new String[]{"cowgirl", "anal", "ride"} : new String[]{"cowgirl", "anal", "threesome", "ride"});
            if (!this.field_70170_p.field_72995_K) break block3;
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
                EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                this.c(entityPlayerSP.func_174791_d());
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
                EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                this.c(entityPlayerSP.func_174791_d());
                this.b(entityPlayerSP.field_70177_z + 180.0f);
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
                Minecraft minecraft = Minecraft.func_71410_x();
                EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
                minecraft.field_71474_y.field_74320_O = 1;
                f82.c(entityPlayerSP.func_174791_d());
                this.c(entityPlayerSP.func_174791_d());
                f82.b(entityPlayerSP.field_70177_z + 180.0f);
                this.b(entityPlayerSP.field_70177_z);
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
        if (!((Boolean)this.m.func_187225_a(bP)).booleanValue()) {
            return super.func_184645_a(entityPlayer, enumHand);
        }
        if (this.y() != fp.KNOCK_OUT_GROUND) {
            return super.func_184645_a(entityPlayer, enumHand);
        }
        if (this.field_70170_p.field_72995_K) {
            entityPlayer.field_70177_z -= -128.0f;
            entityPlayer.field_70125_A = 19.0f;
            return true;
        }
        this.b(fp.CORRUPT_INTRO);
        this.e(entityPlayer.getPersistentID());
        this.a(true);
        this.c(this.func_174791_d());
        this.b(entityPlayer.field_70177_z);
        ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        entityPlayer.func_70634_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        return true;
    }

    @Nullable
    public Entity[] func_70021_al() {
        return new Entity[]{this.V, this.b2};
    }

    public void a(@Nullable EntityLivingBase entityLivingBase) {
        if (entityLivingBase == null) {
            this.m.func_187227_b(bq, (Object)-1);
            return;
        }
        this.m.func_187227_b(bq, (Object)entityLivingBase.func_145782_y());
    }

    public int ar() {
        return (Integer)this.m.func_187225_a(aP);
    }

    public void b(int n2) {
        this.m.func_187227_b(aP, (Object)n2);
    }

    public EntityLivingBase M() {
        int n2 = (Integer)this.m.func_187225_a(bq);
        if (-1 == n2) {
            return null;
        }
        return (EntityLivingBase)this.field_70170_p.func_73045_a(n2);
    }

    public static Float a(f_ f_2, float f10) {
        float f11;
        fp fp2 = f_2.y();
        if (fp2 != fp.FLY && fp2 != fp.SUMMON_SKELETON && fp2 != fp.RAPE_PREPARE) {
            return null;
        }
        EntityLivingBase entityLivingBase = f_2.M();
        if (entityLivingBase == null) {
            return null;
        }
        Vec3d vec3d = com.trolmastercard.sexmod.b6.a(new Vec3d(entityLivingBase.field_70142_S, entityLivingBase.field_70137_T, entityLivingBase.field_70136_U), entityLivingBase.func_174791_d(), (double)f10);
        Vec3d vec3d2 = com.trolmastercard.sexmod.b6.a(new Vec3d(f_2.field_70142_S, f_2.field_70137_T, f_2.field_70136_U), f_2.func_174791_d(), (double)f10);
        Vec3d vec3d3 = vec3d.func_178788_d(vec3d2);
        f_2.field_70761_aq = f11 = (float)gc.b(Math.atan2(vec3d3.field_72449_c, vec3d3.field_72450_a)) - 90.0f;
        f_2.field_70760_ar = f11;
        return Float.valueOf(f11);
    }

    void c(float f10) {
        if (!this.field_70170_p.field_72995_K) {
            return;
        }
        if (this.func_110143_aJ() - f10 <= 0.0f) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 < this.bc + 1000L) {
            return;
        }
        this.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_UUH, new int[0]);
        this.bc = l2;
    }

    public boolean func_70097_a(DamageSource damageSource, float f10) {
        if (damageSource.func_76347_k()) {
            return false;
        }
        if (DamageSource.field_76369_e.equals(damageSource)) {
            return false;
        }
        if (DamageSource.field_76367_g.equals(damageSource)) {
            return false;
        }
        if (DamageSource.field_76379_h.equals(damageSource)) {
            return false;
        }
        if (DamageSource.field_188406_j.equals(damageSource)) {
            return false;
        }
        this.c(f10);
        return super.func_70097_a(damageSource, f10);
    }

    public boolean func_70965_a(MultiPartEntityPart multiPartEntityPart, DamageSource damageSource, float f10) {
        block3: {
            if (this.field_70170_p.field_72995_K) {
                return false;
            }
            if (!(damageSource.func_76346_g() instanceof EntityPlayer)) {
                return false;
            }
            if (multiPartEntityPart == this.V) {
                this.m.func_187227_b(b7, (Object)false);
                ge.b.sendToAllTracking((IMessage)new bv(this.V.func_174791_d(), false), (Entity)this);
            }
            if (multiPartEntityPart != this.b2) break block3;
            this.m.func_187227_b(bN, (Object)false);
            ge.b.sendToAllTracking((IMessage)new bv(this.b2.func_174791_d(), false), (Entity)this);
        }
        return true;
    }

    @Override
    public void g() {
        this.a((EntityLivingBase)null);
        this.aH();
    }

    public World func_82194_d() {
        return this.field_70170_p;
    }

    public void func_70015_d(int n2) {
    }

    public void func_180430_e(float f10, float f11) {
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
            if (0.0f >= entityPlayer.func_110143_aJ() - 1.0f) {
                return;
            }
            if (entityPlayer.field_71075_bZ.field_75098_d) {
                return;
            }
            entityPlayer.func_70097_a((DamageSource)new a3(this), 1.0f);
            if (!bl2) break block4;
            this.func_70691_i(1.5f);
        }
    }

    @Override
    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        block0: {
            super.func_70014_b(nBTTagCompound);
            nBTTagCompound.func_74778_a("sexmod:master", (String)this.m.func_187225_a(v));
            if (!this.bA) break block0;
            nBTTagCompound.func_74757_a("sexmod:despawned", true);
        }
    }

    @Override
    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        block1: {
            String string;
            UUID uUID;
            super.func_70037_a(nBTTagCompound);
            this.m.func_187227_b(v, (Object)nBTTagCompound.func_74779_i("sexmod:master"));
            if (nBTTagCompound.func_74767_n("sexmod:despawned")) {
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

    public float b(float f10) {
        fp fp2 = this.y();
        if (fp2 == fp.PUSSY_LICKING && !this.a5) {
            return 0.0f;
        }
        if (fp2 == fp.MASTERBATE_SITTING && !this.bx) {
            return 1.0f;
        }
        float f11 = fp.d(this, f10);
        if (fp2 == fp.MASTERBATE_SITTING) {
            return f11;
        }
        return 1.0f - f11;
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
            if (!this.field_70122_E) {
                this.a("animation.galath.controlled_flight", true, animationEvent);
                return PlayState.CONTINUE;
            }
            Vec3d vec3d = this.func_174791_d().func_178788_d(new Vec3d(this.field_70142_S, this.field_70137_T, this.field_70136_U));
            if (vec3d.equals((Object)Vec3d.field_186680_a)) {
                this.a("animation.galath.idle", true, animationEvent);
                return PlayState.CONTINUE;
            }
            this.field_70177_z = this.field_70759_as;
            this.a("animation.galath." + ((Boolean)this.m.func_187225_a(bT) != false ? "run" : "walk"), true, animationEvent);
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
                this.a("animation.galath.summon_skeleton" + ((Boolean)this.m.func_187225_a(ay) != false ? "Mirrored" : ""), true, animationEvent);
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
                this.a("animation.galath.desummon" + (this.field_70122_E ? "_standing" : ""), true, animationEvent);
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
        this.E = new AnimationController<f_>(this, "movement", 5.0f, this::a);
        this.s = new AnimationController<f_>(this, "eyes", 10.0f, this::a);
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
                    this.field_70170_p.func_184134_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_GIGGLE), SoundCategory.HOSTILE, 1.0f, 1.0f, false);
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
                        this.a(this.func_70681_au().nextBoolean() ? com.trolmastercard.sexmod.c.GIRLS_GALATH_MOAN : com.trolmastercard.sexmod.c.GIRLS_GALATH_AHH, new int[0]);
                    }
                    this.a6 = !this.a6;
                    break;
                }
                case "lightcharge": {
                    Vec3d vec3d = this.A();
                    this.field_70170_p.func_184134_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_LIGHTCHARGE), SoundCategory.HOSTILE, 1.0f, 1.0f, false);
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
                    this.field_70170_p.func_184134_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_FLAP), SoundCategory.HOSTILE, 1.0f, 1.0f, false);
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
                    Vec3d vec3d = this.func_174791_d();
                    Vec3d vec3d2 = this.b("slipR").func_178787_e(vec3d);
                    Vec3d vec3d3 = this.b("slipL").func_178787_e(vec3d);
                    Vec3d vec3d4 = this.b("turnable").func_178787_e(vec3d);
                    this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, 0.0, 0.0, 0.0, new int[0]);
                    this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, 0.0, 0.0, 0.0, new int[0]);
                    this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case "rapeIntroDone": {
                    if (!this.n()) break;
                    this.b(fp.RAPE_ON_GOING);
                    break;
                }
                case "rape_switch": {
                    EntityPlayerSP entityPlayerSP;
                    Random random = this.func_70681_au();
                    int n2 = this.b1;
                    do {
                        this.b1 = random.nextInt(3);
                    } while (this.b1 == n2);
                    if (this.k() || !this.n() || !(0.0f >= (entityPlayerSP = Minecraft.func_71410_x().field_71439_g).func_110143_aJ() - 1.0f)) break;
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
                    Minecraft minecraft = Minecraft.func_71410_x();
                    if (minecraft.field_71474_y.field_74320_O == 0) break;
                    minecraft.field_71438_f.func_72712_a();
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
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    float f10 = this.I().floatValue() + 220.0f;
                    Vec3d vec3d = ck.a(new Vec3d(0.5, (double)(0.5f - entityPlayerSP.func_70047_e()), (double)0.4f), this.I().floatValue()).func_178787_e(this.o());
                    ge.b.sendToServer((IMessage)new a8(entityPlayerSP.getPersistentID().toString(), vec3d, f10, 15.0f));
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
                        return vec3d.func_178788_d(vec3d2).func_72432_b();
                    }, em2 -> em2.b("futaCockTip").func_178787_e(em2.o()), this, 0.3f, 0.3f));
                    break;
                }
                case "creampie": {
                    ga.a(new ep(100, em2 -> ck.a(new Vec3d(0.0, 0.0, (double)0.6f), this.I().floatValue()), em2 -> em2.b("creampiePos").func_178787_e(em2.o()), this, 0.6f, 0.5f));
                }
                case "creampieGalath": {
                    if (com.trolmastercard.sexmod.a_.e) {
                        ga.a(new ep(130, em2 -> {
                            Vec3d vec3d = em2.d("futaCockTip");
                            Vec3d vec3d2 = em2.d("futaCockTipDirHelp");
                            return vec3d.func_178788_d(vec3d2).func_72432_b();
                        }, em2 -> em2.b("futaCockTip").func_178787_e(em2.o()), this, 0.3f, 0.3f));
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
                    if (!Minecraft.func_71410_x().field_71439_g.getPersistentID().equals(this.O())) break;
                    fh.b();
                    d3.a(false);
                    break;
                }
                case "flapControlled": {
                    if (!this.n()) break;
                    hf.f();
                    this.a(com.trolmastercard.sexmod.c.MISC_FLAP, new int[0]);
                    Minecraft minecraft = Minecraft.func_71410_x();
                    EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
                    MovementInput movementInput = entityPlayerSP.field_71158_b;
                    Vec2f vec2f = movementInput.func_190020_b();
                    if (vec2f.field_189982_i == 0.0f && vec2f.field_189983_j == 0.0f) break;
                    Vec3d vec3d = ck.a(new Vec3d((double)(-vec2f.field_189982_i), 0.0, (double)vec2f.field_189983_j), com.trolmastercard.sexmod.b6.a(entityPlayerSP.field_70127_C, entityPlayerSP.field_70125_A, minecraft.func_184121_ak()), com.trolmastercard.sexmod.b6.a(entityPlayerSP.field_70758_at, entityPlayerSP.field_70759_as, minecraft.func_184121_ak()));
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
                    float f11;
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    entityPlayerSP.field_70177_z = f11 = this.I().floatValue() + 180.0f;
                    entityPlayerSP.field_70126_B = f11;
                    entityPlayerSP.field_70125_A = 0.0f;
                    entityPlayerSP.field_70127_C = 0.0f;
                    break;
                }
                case "sexui": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "boostSound": {
                    Minecraft.func_71410_x().field_71439_g.func_184185_a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_GALATH_LIGHTCHARGE), 1.0f, 1.0f);
                    Minecraft.func_71410_x().field_71439_g.func_184185_a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_FLAP), 1.0f, 1.0f);
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
}

