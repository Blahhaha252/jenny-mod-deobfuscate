/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.util.Pair
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.ai.EntityAITempt
 *  net.minecraft.entity.ai.EntityAIWanderAvoidWater
 *  net.minecraft.entity.item.EntityEnderPearl
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.Packet
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.network.play.server.SPacketSoundEffect
 *  net.minecraft.pathfinding.Path
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.pathfinding.PathNavigateGround
 *  net.minecraft.pathfinding.PathPoint
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraft.world.biome.Biome
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.Level
 */
package com.trolmastercard.sexmod;

import com.mojang.realmsclient.util.Pair;
import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.a1;
import com.trolmastercard.sexmod.a8;
import com.trolmastercard.sexmod.b;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.cy;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.d_;
import com.trolmastercard.sexmod.dc;
import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.dz;
import com.trolmastercard.sexmod.e1;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ew;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.fs;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.g0;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gh;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gw;
import com.trolmastercard.sexmod.hz;
import com.trolmastercard.sexmod.m;
import com.trolmastercard.sexmod.n;
import com.trolmastercard.sexmod.r;
import com.trolmastercard.sexmod.s;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.GeoModelProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.util.MatrixStack;

public abstract class em
extends EntityCreature
implements IAnimatable {
    public static int j = 22;
    protected static final long t = 20L;
    private final AnimationFactory g;
    public EntityAIWanderAvoidWater z;
    public df o;
    public static HashSet<em> k = new HashSet();
    public Vec3d B;
    protected float r;
    protected EntityDataManager m;
    public PathNavigate f;
    public Vec3d l;
    public EntityEnderPearl q;
    public float n;
    public boolean F;
    private boolean i;
    HashMap<String, Vec3d> x;
    public static final DataParameter<String> v = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(110);
    public static final DataParameter<Boolean> G = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(109);
    public static final DataParameter<String> e = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(108);
    public static final DataParameter<Float> w = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187193_c).func_187156_b().func_187161_a(107);
    public static final DataParameter<String> u = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(106);
    public static final DataParameter<Integer> D = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(105);
    public static final DataParameter<String> J = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(104);
    public static final DataParameter<String> h = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(103);
    public static final DataParameter<String> y = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(102);
    public static final DataParameter<String> a = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(101);
    public static final DataParameter<String> b = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(100);
    public static final DataParameter<String> c = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(99);
    protected static final List<Item> I = Arrays.asList(Items.field_151166_bC, Items.field_151045_i, Items.field_151043_k, Items.field_151079_bi);
    public AnimationController C;
    public AnimationController E;
    public AnimationController s;
    HashMap<String, Pair<Integer, Integer>> A;
    AnimationProcessor<?> H;
    public List<String> p;
    protected List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> d;

    public void a(a.a a10) {
        this.m.func_187227_b(a, (Object)a10.toString());
    }

    public a.a q() {
        return a.a.valueOf((String)this.m.func_187225_a(a));
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, String string2) {
        ge.b.sendToServer((IMessage)new n(this.f(), string, string2));
    }

    public UUID f() {
        try {
            return UUID.fromString((String)this.m.func_187225_a(u));
        }
        catch (Exception exception) {
            UUID uUID = UUID.randomUUID();
            this.m.func_187227_b(u, (Object)uUID.toString());
            return uUID;
        }
    }

    public fp y() {
        return fp.valueOf((String)this.m.func_187225_a(J));
    }

    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp3 == fp2) {
            return;
        }
        if (fp2 == fp.ATTACK && fp3 != fp.NULL) {
            return;
        }
        fp fp4 = fp2 = fp2 == null ? fp.NULL : fp2;
        if (this.field_70170_p.field_72995_K) {
            this.a("currentAction", fp2.toString());
            return;
        }
        fp3.ticksPlaying = new int[]{0, 0};
        this.m.func_187227_b(J, (Object)fp2.toString());
    }

    public int ah() {
        return (Integer)this.m.func_187225_a(D);
    }

    public void f(int n2) {
        if (this.field_70170_p.field_72995_K) {
            this.a("currentModel", "0");
        } else {
            this.m.func_187227_b(D, (Object)n2);
        }
    }

    public boolean m() {
        return false;
    }

    @Nullable
    public EntityPlayer S() {
        UUID uUID = this.ae();
        if (uUID == null) {
            return null;
        }
        return this.field_70170_p.func_152378_a(uUID);
    }

    public static void a(em em2, String string) {
        for (EntityPlayer entityPlayer : cj.a((Entity)em2)) {
            entityPlayer.func_145747_a((ITextComponent)new TextComponentString(string));
        }
    }

    public static void a(em em2, SoundEvent soundEvent, boolean bl2) {
        Vec3d vec3d = em2.func_174791_d();
        for (EntityPlayer entityPlayer : cj.a((Entity)em2)) {
            Vec3d vec3d2;
            if (!bl2) {
                vec3d2 = vec3d;
            } else {
                Vec3d vec3d3 = entityPlayer.func_174791_d();
                Vec3d vec3d4 = vec3d.func_178788_d(vec3d3).func_72432_b();
                vec3d2 = vec3d3.func_178787_e(vec3d4);
            }
            ((EntityPlayerMP)entityPlayer).field_71135_a.func_147359_a((Packet)new SPacketSoundEffect(soundEvent, SoundCategory.AMBIENT, vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, 1.0f, 1.0f));
        }
    }

    public static void a(em em2, SoundEvent soundEvent) {
        em.a(em2, soundEvent, false);
    }

    public static void a(em em2, SoundEvent[] soundEventArray) {
        em.a(em2, com.trolmastercard.sexmod.c.a(soundEventArray));
    }

    public static void a(em em2, SoundEvent[] soundEventArray, boolean bl2) {
        em.a(em2, com.trolmastercard.sexmod.c.a(soundEventArray), bl2);
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3d A() {
        Vec3d vec3d = Minecraft.func_71410_x().field_71439_g.func_174791_d();
        Vec3d vec3d2 = this.func_174791_d();
        Vec3d vec3d3 = vec3d2.func_178788_d(vec3d).func_72432_b();
        return vec3d.func_178787_e(vec3d3);
    }

    @Nullable
    public UUID ae() {
        String string = (String)this.m.func_187225_a(y);
        if (string.equals("null")) {
            return null;
        }
        return UUID.fromString(string);
    }

    public void e(UUID uUID) {
        if (this.field_70170_p.field_72995_K) {
            if (uUID == null) {
                this.a("playerSheHasSexWith", (String)null);
            } else {
                this.a("playerSheHasSexWith", uUID.toString());
            }
            return;
        }
        if (uUID == null) {
            this.m.func_187227_b(y, (Object)"null");
        } else {
            this.m.func_187227_b(y, (Object)uUID.toString());
        }
    }

    public void a(@Nonnull EntityPlayer entityPlayer) {
        this.e(entityPlayer.getPersistentID());
    }

    public Vec3d o() {
        String[] stringArray = ((String)this.m.func_187225_a(e)).split("\\|");
        return new Vec3d(Double.parseDouble(stringArray[0]), Double.parseDouble(stringArray[1]), Double.parseDouble(stringArray[2]));
    }

    public void c(Vec3d vec3d) {
        if (this.field_70170_p.field_72995_K) {
            String string = vec3d.field_72450_a + "f" + vec3d.field_72448_b + "f" + vec3d.field_72449_c + "f";
            this.a("targetPos", string);
            return;
        }
        this.m.func_187227_b(e, (Object)(vec3d.field_72450_a + "|" + vec3d.field_72448_b + "|" + vec3d.field_72449_c));
    }

    public void a(Vec3d vec3d) {
        this.m.func_187227_b(e, (Object)(vec3d.field_72450_a + "|" + vec3d.field_72448_b + "|" + vec3d.field_72449_c));
    }

    public Float I() {
        return (Float)this.m.func_187225_a(w);
    }

    public void b(float f10) {
        this.m.func_187227_b(w, (Object)Float.valueOf(f10));
    }

    public void a(boolean bl2) {
        if (this.field_70170_p.field_72995_K) {
            this.a("shouldbeattargetpos", String.valueOf(bl2));
            return;
        }
        this.m.func_187227_b(G, (Object)bl2);
    }

    public boolean Q() {
        return (Boolean)this.m.func_187225_a(G);
    }

    protected boolean func_70692_ba() {
        return false;
    }

    protected em(World world) {
        block2: {
            super(world);
            this.g = new AnimationFactory(this);
            this.l = Vec3d.field_186680_a;
            this.n = 1.0f;
            this.F = false;
            this.i = false;
            this.x = new HashMap();
            this.A = new HashMap();
            this.H = null;
            this.p = new ArrayList<String>();
            this.d = null;
            if (world.field_72995_K) {
                this.p();
            }
            if (world.field_72995_K && world instanceof gj) {
                return;
            }
            PathNavigate pathNavigate = this.func_70661_as();
            if (!(pathNavigate instanceof PathNavigateGround)) break block2;
            ((PathNavigateGround)pathNavigate).func_179688_b(true);
        }
    }

    @SideOnly(value=Side.CLIENT)
    protected void p() {
        this.C = new AnimationController<em>(this, "action", 0.0f, this::a);
        this.E = new AnimationController<em>(this, "movement", 5.0f, this::a);
        this.s = new AnimationController<em>(this, "eyes", 10.0f, this::a);
    }

    protected void func_70088_a() {
        super.func_70088_a();
        this.f = this.func_70661_as();
        this.m = this.func_184212_Q();
        this.m.func_187214_a(u, (Object)UUID.randomUUID().toString());
        this.m.func_187214_a(D, (Object)1);
        this.m.func_187214_a(J, (Object)fp.NULL.toString());
        this.m.func_187214_a(h, (Object)"");
        this.m.func_187214_a(y, (Object)"null");
        this.m.func_187214_a(G, (Object)false);
        this.m.func_187214_a(w, (Object)Float.valueOf(0.0f));
        this.m.func_187214_a(e, (Object)"0|0|0");
        this.m.func_187214_a(v, (Object)"");
        this.m.func_187214_a(a, (Object)a.a.WALK.toString());
        this.m.func_187214_a(b, (Object)"");
        this.m.func_187214_a(c, (Object)"");
    }

    public void b(boolean bl2) {
        this.i = bl2;
        if (bl2) {
            fs.b(this);
        } else {
            fs.a(this);
        }
    }

    public boolean h() {
        return this.i;
    }

    public static List<em> ad() {
        if (!g0.a()) {
            return em.Z();
        }
        WorldServer[] worldServerArray = FMLCommonHandler.instance().getMinecraftServerInstance().field_71305_c;
        if (worldServerArray.length == 0) {
            return new ArrayList<em>();
        }
        ArrayList<em> arrayList = new ArrayList<em>();
        for (WorldServer worldServer : worldServerArray) {
            arrayList.addAll(worldServer.func_175644_a(em.class, em2 -> true));
        }
        return arrayList;
    }

    @SideOnly(value=Side.CLIENT)
    private static List<em> Z() {
        WorldClient worldClient = Minecraft.func_71410_x().field_71441_e;
        if (worldClient == null) {
            return new ArrayList<em>();
        }
        return worldClient.func_175644_a(em.class, em2 -> true);
    }

    public boolean B() {
        return true;
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20.0);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(30.0);
    }

    protected void func_184651_r() {
        this.z = new EntityAIWanderAvoidWater((EntityCreature)this, 0.35);
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 0.4, false, new HashSet<Item>(I)));
        this.field_70714_bg.func_75776_a(3, (EntityAIBase)new hz((EntityLiving)this));
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.o);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.z);
    }

    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        nBTTagCompound.func_74780_a("homeX", this.l.field_72450_a);
        nBTTagCompound.func_74780_a("homeY", this.l.field_72448_b);
        nBTTagCompound.func_74780_a("homeZ", this.l.field_72449_c);
        nBTTagCompound.func_74778_a("girlID", (String)this.m.func_187225_a(u));
        String string = this.w();
        if (!"".equals(string)) {
            nBTTagCompound.func_74778_a("sexmod:customname", string);
        }
        if (this.X()) {
            nBTTagCompound.func_74778_a("sexmod:customModel", this.C());
        }
        super.func_70014_b(nBTTagCompound);
    }

    protected boolean X() {
        return em.a((Entity)this);
    }

    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        block4: {
            String string;
            super.func_70037_a(nBTTagCompound);
            this.l = new Vec3d(nBTTagCompound.func_74769_h("homeX"), nBTTagCompound.func_74769_h("homeY"), nBTTagCompound.func_74769_h("homeZ"));
            String string2 = nBTTagCompound.func_74779_i("sexmod:customname");
            if (!"".equals(string2)) {
                this.g(string2);
            }
            if ("".equals(string = nBTTagCompound.func_74779_i("girlID"))) {
                return;
            }
            UUID uUID = UUID.fromString(string);
            boolean bl2 = false;
            for (em em2 : em.g(uUID)) {
                if (em2.field_70170_p.field_72995_K || em2 == this || em2.field_70128_L || !em2.isAddedToWorld()) continue;
                bl2 = true;
                break;
            }
            if (bl2) {
                Main.LOGGER.log(Level.WARN, String.format("got a duped %s with id '%s'. Deleted her", this.c(), uUID));
                this.field_70170_p.func_72900_e((Entity)this);
                return;
            }
            this.m.func_187227_b(u, (Object)uUID.toString());
            if (!this.X()) break block4;
            this.f(nBTTagCompound.func_74779_i("sexmod:customModel"));
        }
    }

    public boolean d() {
        return true;
    }

    public void func_70016_h(double d10, double d11, double d12) {
        this.field_70159_w = d10;
        this.field_70181_x = d11;
        this.field_70179_y = d12;
    }

    public void b(Vec3d vec3d) {
        this.field_70159_w = vec3d.field_72450_a;
        this.field_70181_x = vec3d.field_72448_b;
        this.field_70179_y = vec3d.field_72449_c;
    }

    public Vec3d j() {
        return new Vec3d(this.field_70142_S, this.field_70137_T, this.field_70136_U);
    }

    public void func_70619_bc() {
        if (((Boolean)this.m.func_187225_a(G)).booleanValue()) {
            this.func_70034_d(this.I().floatValue());
            this.func_70080_a(this.o().field_72450_a, this.o().field_72448_b, this.o().field_72449_c, this.I().floatValue(), 0.0f);
            this.func_70101_b(this.I().floatValue(), this.field_70125_A);
        }
        if (this.l.equals((Object)Vec3d.field_186680_a)) {
            this.l = new Vec3d((Vec3i)this.func_180425_c());
        }
        this.G();
    }

    public void func_70071_h_() {
        super.func_70071_h_();
        this.l();
    }

    protected void G() {
        if (!br.e) {
            return;
        }
        HashSet<String> hashSet = this.Y();
        fy fy2 = fy.a((Entity)this);
        HashSet<String> hashSet2 = new HashSet<String>();
        String string = br.h();
        for (String string2 : hashSet) {
            if (!"".equals(br.a(string2, string))) {
                hashSet2.add(string2);
                continue;
            }
            HashSet<fy> hashSet3 = br.a(string2);
            if (hashSet3 == null) {
                hashSet2.add(string2);
                continue;
            }
            if (hashSet3.isEmpty() || hashSet3.contains((Object)fy2)) continue;
            hashSet2.add(string2);
        }
        if (hashSet2.isEmpty()) {
            return;
        }
        hashSet.removeAll(hashSet2);
        this.f(em.a(hashSet));
    }

    protected void l() {
        block2: {
            fp fp2 = this.y();
            int n2 = this.field_70170_p.field_72995_K ? 1 : 0;
            fp2.ticksPlaying[n2] = fp2.ticksPlaying[n2] + 1;
            if (fp2.ticksPlaying[n2] < fp2.length) {
                return;
            }
            if (fp2.followUp == null) {
                return;
            }
            if (this.field_70170_p.field_72995_K) break block2;
            this.b(fp2.followUp);
        }
    }

    protected void k() {
        Path path = this.func_70661_as().func_75505_d();
        if (path == null) {
            return;
        }
        if (this.field_70122_E || this.func_70090_H()) {
            return;
        }
        int n2 = path.func_75873_e();
        int n3 = path.func_75874_d();
        if (n3 == n2 || n3 - 1 == n2) {
            return;
        }
        PathPoint pathPoint = path.func_75877_a(n2);
        PathPoint pathPoint2 = path.func_75877_a(n2 + 1);
        Vec3d vec3d = new Vec3d((double)(pathPoint2.field_75839_a - pathPoint.field_75839_a), (double)(pathPoint2.field_75837_b - pathPoint.field_75837_b), (double)(pathPoint2.field_75838_c - pathPoint.field_75838_c));
        this.field_70159_w = vec3d.field_72450_a / 7.0;
        this.field_70179_y = vec3d.field_72449_c / 7.0;
    }

    public void g() {
    }

    @SideOnly(value=Side.CLIENT)
    public boolean b(EntityPlayer entityPlayer) {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    protected static void a(EntityPlayer entityPlayer, em em2) {
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(em2, entityPlayer));
    }

    @SideOnly(value=Side.CLIENT)
    protected static void a(EntityPlayer entityPlayer, em em2, String[] stringArray, ItemStack[] itemStackArray, boolean bl2) {
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(em2, entityPlayer, stringArray, itemStackArray, bl2));
    }

    @SideOnly(value=Side.CLIENT)
    protected static void a(EntityPlayer entityPlayer, em em2, String[] stringArray, boolean bl2) {
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(em2, entityPlayer, stringArray, null, bl2));
    }

    public void a(ItemStack itemStack) {
        this.field_184627_bm = itemStack;
    }

    public void d(int n2) {
        this.field_184628_bn = n2;
    }

    public Vec3d M() {
        return new Vec3d(this.field_70169_q, this.field_70167_r, this.field_70166_s);
    }

    protected static Vec3d a(em em2) {
        return new Vec3d(em2.field_70169_q, em2.field_70167_r, em2.field_70166_s);
    }

    public em af() {
        return this;
    }

    public void x() {
        if (this.field_70170_p.field_72995_K) {
            this.a("master", "");
            this.a("walk speed", a.a.WALK.toString());
        } else {
            this.m.func_187227_b(v, (Object)"");
            this.m.func_187227_b(a, (Object)a.a.WALK.toString());
        }
    }

    protected void a(EntityPlayerMP entityPlayerMP, boolean bl2) {
        entityPlayerMP.field_70159_w = 0.0;
        entityPlayerMP.field_70181_x = 0.0;
        entityPlayerMP.field_70179_y = 0.0;
        if (bl2) {
            Vec3d vec3d = this.a(0.35);
            entityPlayerMP.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        }
    }

    public void j(UUID uUID) {
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        entityPlayer.field_70159_w = 0.0;
        entityPlayer.field_70181_x = 0.0;
        entityPlayer.field_70179_y = 0.0;
        Vec3d vec3d = this.a(0.35);
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        this.b(entityPlayer.field_70759_as + 180.0f);
    }

    protected void a(boolean bl2, boolean bl3, UUID uUID) {
        if (this.field_70170_p.field_72995_K) {
            ge.b.sendToServer((IMessage)new dc(this.f(), uUID, bl2, bl3));
        } else {
            dc.a.a.a(this.f(), uUID, bl2, bl3);
        }
    }

    public static em b(UUID uUID) {
        if (uUID == null) {
            return null;
        }
        for (em em2 : em.g(uUID)) {
            if (!em2.field_70170_p.field_72995_K) continue;
            return em2;
        }
        return null;
    }

    public static em a(UUID uUID) {
        if (uUID == null) {
            return null;
        }
        for (em em2 : em.g(uUID)) {
            if (em2.field_70170_p.field_72995_K) continue;
            return em2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList<em> g(UUID uUID) {
        ArrayList<em> arrayList = new ArrayList<em>();
        try {
            for (em em2 : em.ad()) {
                if (em2 == null) continue;
                if (!em2.f().equals(uUID)) continue;
                arrayList.add(em2);
            }
            return arrayList;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            System.out.println("had a ConcurrentModificationException while cycling through the girl list... hopefully nothin borke owo");
            concurrentModificationException.printStackTrace();
        }
        return arrayList;
    }

    protected BlockPos a(BlockPos blockPos) {
        return this.a(blockPos, 1);
    }

    public BlockPos a(BlockPos blockPos, int n2) {
        return this.a(blockPos, n2, Blocks.field_150324_C, 22, 3, null);
    }

    public void W() {
        this.m.func_187227_b(field_184621_as, (Object)Byte.valueOf("1"));
    }

    public void K() {
        this.m.func_187227_b(field_184621_as, (Object)Byte.valueOf("0"));
    }

    public BlockPos a(BlockPos blockPos, int n2, Block block, int n3, int n4, @Nullable HashSet<Biome> hashSet) {
        int n5 = 1;
        int n6 = -1;
        BlockPos blockPos2 = blockPos;
        int n7 = 0;
        while (n5 < n3) {
            for (int i2 = 0; i2 < 2; ++i2) {
                int n8;
                int n9;
                n6 *= -1;
                for (n9 = 0; n9 < n5; ++n9) {
                    blockPos2 = blockPos2.func_177982_a(0, 0, n6);
                    for (n8 = -n4; n8 < n4 + 1; ++n8) {
                        if (this.field_70170_p.func_180495_p(blockPos2.func_177982_a(0, n8, n6)).func_177230_c() != block || ++n7 < n2 || hashSet != null && !hashSet.contains(this.field_70170_p.func_180494_b(blockPos2.func_177982_a(n6, n8, 0)))) continue;
                        return blockPos2.func_177982_a(0, n8, n6);
                    }
                }
                for (n9 = 0; n9 < n5; ++n9) {
                    blockPos2 = blockPos2.func_177982_a(n6, 0, 0);
                    for (n8 = -n4; n8 < n4 + 1; ++n8) {
                        if (this.field_70170_p.func_180495_p(blockPos2.func_177982_a(n6, n8, 0)).func_177230_c() != block || ++n7 < n2 || hashSet != null && !hashSet.contains(this.field_70170_p.func_180494_b(blockPos2.func_177982_a(n6, n8, 0)))) continue;
                        return blockPos2.func_177982_a(n6, n8, 0);
                    }
                }
                ++n5;
            }
        }
        return null;
    }

    protected List<BlockPos> a(BlockPos blockPos, Class clazz, int n2, int n3, @Nullable HashSet<Biome> hashSet) {
        int n4 = 1;
        int n5 = -1;
        BlockPos blockPos2 = blockPos;
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        while (n4 < n2) {
            for (int i2 = 0; i2 < 2; ++i2) {
                int n6;
                int n7;
                n5 *= -1;
                for (n7 = 0; n7 < n4; ++n7) {
                    blockPos2 = blockPos2.func_177982_a(0, 0, n5);
                    for (n6 = -n3; n6 < n3 + 1; ++n6) {
                        if (!clazz.isInstance(this.field_70170_p.func_180495_p(blockPos2.func_177982_a(0, n6, n5)).func_177230_c()) || hashSet != null && !hashSet.contains(this.field_70170_p.func_180494_b(blockPos2.func_177982_a(n5, n6, 0)))) continue;
                        arrayList.add(blockPos2.func_177982_a(0, n6, n5));
                    }
                }
                for (n7 = 0; n7 < n4; ++n7) {
                    blockPos2 = blockPos2.func_177982_a(n5, 0, 0);
                    for (n6 = -n3; n6 < n3 + 1; ++n6) {
                        if (!clazz.isInstance(this.field_70170_p.func_180495_p(blockPos2.func_177982_a(n5, n6, 0)).func_177230_c()) || hashSet != null && !hashSet.contains(this.field_70170_p.func_180494_b(blockPos2.func_177982_a(n5, n6, 0)))) continue;
                        arrayList.add(blockPos2.func_177982_a(n5, n6, 0));
                    }
                }
                ++n4;
            }
        }
        return arrayList;
    }

    public boolean J() {
        return !((String)this.m.func_187225_a(v)).equals("");
    }

    @Nullable
    public UUID O() {
        String string = (String)this.m.func_187225_a(v);
        if ("".equals(string)) {
            return null;
        }
        try {
            return UUID.fromString(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    @Nullable
    public EntityPlayer z() {
        UUID uUID = this.O();
        if (uUID == null) {
            return null;
        }
        return this.field_70170_p.func_152378_a(uUID);
    }

    protected ResourceLocation func_184647_J() {
        return dz.d;
    }

    @SideOnly(value=Side.CLIENT)
    public void a(String string, UUID uUID) {
    }

    @SideOnly(value=Side.CLIENT)
    protected abstract <E extends IAnimatable> PlayState a(AnimationEvent<E> var1);

    @SideOnly(value=Side.CLIENT)
    protected boolean a(fp fp2, String string, boolean bl2, AnimationEvent animationEvent) {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, boolean bl2, AnimationEvent animationEvent, boolean bl3) {
        if (!bl3 && fp.b(this, animationEvent.getPartialTick()) && this.a(this.y(), string, d3.d, animationEvent)) {
            return;
        }
        ILoopType.EDefaultLoopTypes eDefaultLoopTypes = bl2 ? ILoopType.EDefaultLoopTypes.LOOP : ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME;
        animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation(string, eDefaultLoopTypes));
        animationEvent.getController().transitionLengthTicks = 0.0;
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, boolean bl2, AnimationEvent animationEvent) {
        this.a(string, bl2, animationEvent, false);
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, int n2, float f10, AnimationEvent animationEvent, boolean bl2) {
        if (!bl2 && fp.b(this, animationEvent.getPartialTick()) && this.a(this.y(), string, d3.d, animationEvent)) {
            return;
        }
        AnimationController animationController = animationEvent.getController();
        Pair pair = this.A.get(string);
        if (pair == null) {
            pair = Pair.of((Object)0, (Object)0);
        }
        int n3 = (Integer)pair.first();
        int n4 = (Integer)pair.second();
        if (!fp.b(this, animationEvent.getPartialTick())) {
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation(n3 == 0 ? string : string + n3, ILoopType.EDefaultLoopTypes.LOOP));
            animationEvent.getController().transitionLengthTicks = 0.0;
            return;
        }
        int n5 = this.a(n3, n4, n2, f10);
        animationController.setAnimation(new AnimationBuilder().addAnimation(n5 == 0 ? string : string + n5, ILoopType.EDefaultLoopTypes.LOOP));
        animationController.transitionLengthTicks = 0.0;
        this.A.put(string, (Pair<Integer, Integer>)Pair.of((Object)n5, (Object)(n5 == 0 ? n4 : n5)));
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, int n2, float f10, AnimationEvent animationEvent) {
        this.a(string, n2, f10, animationEvent, false);
    }

    int a(int n2, int n3, int n4, float f10) {
        int n5;
        if (n2 != 0) {
            return 0;
        }
        Random random = this.func_70681_au();
        if (random.nextFloat() > f10) {
            return 0;
        }
        while (((n5 = random.nextInt(n4)) == n3 || n5 == 0) && n4 > 2) {
        }
        return n5;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public abstract void registerControllers(AnimationData var1);

    protected void s() {
        block1: {
            block0: {
                if (!this.field_70170_p.field_72995_K || !this.n()) break block0;
                this.B = null;
                ge.b.sendToServer((IMessage)new s(this.f(), true));
                break block1;
            }
            if (this.field_70170_p.field_72995_K) break block1;
            s.a.a.a((EntityPlayerMP)this.field_70170_p.func_152378_a(this.ae()));
        }
    }

    public static em c(EntityPlayer entityPlayer) {
        if (entityPlayer == null) {
            return null;
        }
        return em.i(entityPlayer.getPersistentID());
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3d a(Minecraft minecraft, cy cy2, EntityLivingBase entityLivingBase, float f10) {
        return com.trolmastercard.sexmod.b.a(minecraft, cy2, entityLivingBase, this, f10);
    }

    public static em i(@Nonnull UUID uUID) {
        return em.a(uUID, null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static em a(@Nonnull UUID var0, Boolean var1_1) {
        try lbl-1000:
        // 4 sources

        {
            for (em var3_4 : em.ad()) {
                if (var3_4.field_70128_L) {
                    continue;
                }
                ** GOTO lbl-1000
            }
            return null;
        }
        catch (ConcurrentModificationException var2_3) {
            // empty catch block
            return null;
        }
lbl-1000:
        // 1 sources

        {
            if (!var0.equals(var3_4.ae())) ** GOTO lbl-1000
        }
        {
            if (var1_1 == null) {
                return var3_4;
            }
            var4_5 = var3_4.field_70170_p.field_72995_K;
            if (!var4_5 || var1_1.booleanValue()) ** GOTO lbl16
        }
        {
            return var3_4;
lbl16:
            // 1 sources

            if (var4_5 || !var1_1.booleanValue()) ** GOTO lbl-1000
        }
        return var3_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static em c(@Nonnull UUID uUID) {
        boolean bl2 = FMLCommonHandler.instance().getMinecraftServerInstance() == null;
        try {
            for (em em2 : em.ad()) {
                boolean bl3;
                if (em2.field_70128_L || (bl3 = em2.field_70170_p.field_72995_K) != bl2 || !uUID.equals(em2.ae())) continue;
                return em2;
            }
            return null;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        return null;
    }

    public static em d(@Nonnull EntityPlayer entityPlayer) {
        return em.c(entityPlayer.getPersistentID());
    }

    @SideOnly(value=Side.CLIENT)
    public void ac() {
    }

    public void r() {
        block0: {
            this.B = null;
            this.func_189654_d(false);
            this.b((fp)null);
            if (!this.field_70170_p.field_72995_K) break block0;
            this.V();
        }
    }

    @SideOnly(value=Side.CLIENT)
    protected void V() {
        block0: {
            if (!this.n()) break block0;
            d3.a(true);
            Minecraft.func_71410_x().field_71439_g.func_82142_c(false);
            ge.b.sendToServer((IMessage)new s(this.f()));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    public static void k(UUID uUID) {
        try {
            for (em em2 : em.ad()) {
                UUID uUID2 = em2.ae();
                if (uUID2 == null || !uUID2.equals(uUID)) continue;
                fp fp2 = em2.c(em2.y());
                if (fp2 == null) {
                    return;
                }
                em2.b(fp2);
                return;
            }
            return;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SideOnly(value=Side.CLIENT)
    public static void f(UUID var0) {
        try lbl-1000:
        // 4 sources

        {
            for (em var2_3 : em.ad()) {
                if (var2_3.field_70128_L) {
                    continue;
                }
                ** GOTO lbl-1000
            }
            return;
        }
        catch (ConcurrentModificationException var1_2) {
            // empty catch block
            return;
        }
lbl-1000:
        // 1 sources

        {
            if (!var2_3.field_70170_p.field_72995_K || (var3_4 = var2_3.ae()) == null || !var3_4.equals(var0) || (var4_5 = var2_3.a(var2_3.y())) == null) ** GOTO lbl-1000
        }
        {
            var2_3.b(var4_5);
            ** GOTO lbl-1000
        }
    }

    public void N() {
        this.ag();
        ge.b.sendToServer((IMessage)new a1(this.f()));
    }

    @SideOnly(value=Side.CLIENT)
    public void ag() {
        this.C.tickOffset = 0.0;
    }

    @SideOnly(value=Side.CLIENT)
    @Nullable
    protected abstract fp c(fp var1);

    @SideOnly(value=Side.CLIENT)
    protected abstract fp a(fp var1);

    public NetworkRegistry.TargetPoint P() {
        return new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0);
    }

    protected void a(double d10, double d11, double d12, float f10, float f11) {
        if (this.ae() == null) {
            System.out.println("couldnt move camera because the player isn't set");
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
        if (this.B == null) {
            this.B = entityPlayer.func_174791_d();
        }
        Vec3d vec3d = this.B;
        vec3d = vec3d.func_72441_c(-Math.sin((double)(this.r + 90.0f) * (Math.PI / 180)) * d10, 0.0, Math.cos((double)(this.r + 90.0f) * (Math.PI / 180)) * d10);
        vec3d = vec3d.func_72441_c(0.0, d11, 0.0);
        vec3d = vec3d.func_72441_c(-Math.sin((double)this.r * (Math.PI / 180)) * d12, 0.0, Math.cos((double)this.r * (Math.PI / 180)) * d12);
        if (this.field_70170_p.field_72995_K) {
            ge.b.sendToServer((IMessage)new a8(entityPlayer.getPersistentID().toString(), vec3d, this.r + f10, f11));
            return;
        }
        entityPlayer.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, this.r + f10, f11);
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        this.field_70159_w = 0.0;
        this.field_70181_x = 0.0;
        this.field_70179_y = 0.0;
    }

    @SideOnly(value=Side.CLIENT)
    protected boolean n() {
        if (!this.field_70170_p.field_72995_K) {
            return false;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
        return entityPlayerSP.getPersistentID().equals(this.ae()) || entityPlayerSP.func_110124_au().equals(this.ae());
    }

    protected void U() {
    }

    public void g(String string) {
        this.m.func_187227_b(c, (Object)string);
    }

    public String w() {
        return (String)this.m.func_187225_a(c);
    }

    public abstract String c();

    public String ab() {
        String string = (String)this.m.func_187225_a(c);
        if (!"".equals(string)) {
            return string;
        }
        return this.c();
    }

    public abstract float i();

    @SideOnly(value=Side.CLIENT)
    public boolean t() {
        return true;
    }

    public void h(String string) {
        block1: {
            block0: {
                if (this.field_70170_p.field_72995_K) break block0;
                ge.b.sendToAllAround((IMessage)new gh(String.format("<%s> %s", this.ab(), string), this.field_71093_bK, this.f()), new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 40.0));
                break block1;
            }
            if (!this.n()) break block1;
            ge.b.sendToServer((IMessage)new gh(String.format("<%s> %s", this.ab(), string), this.field_71093_bK, this.f()));
        }
    }

    protected void b(String string, boolean bl2) {
        block2: {
            if (!bl2) {
                this.h(string);
            }
            if (!this.field_70170_p.field_72995_K) {
                ge.b.sendToAllAround((IMessage)new gh(string, this.field_71093_bK, this.f()), new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 40.0));
                return;
            }
            if (!this.n()) break block2;
            ge.b.sendToServer((IMessage)new gh(string, this.field_71093_bK, this.f()));
        }
    }

    protected void a(String string) {
        block0: {
            if (!this.field_70170_p.field_72995_K) break block0;
            Minecraft.func_71410_x().field_71439_g.func_145747_a((ITextComponent)new TextComponentString(String.format("<%s> %s", this.ab(), string)));
        }
    }

    protected void a(UUID uUID, String string) {
        block1: {
            EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
            if (entityPlayer == null) {
                System.out.println("Player with UUID " + uUID.toString() + " not found");
                return;
            }
            if (!this.field_70170_p.field_72995_K) break block1;
            Minecraft.func_71410_x().field_71439_g.func_145747_a((ITextComponent)new TextComponentString("<" + entityPlayer.func_70005_c_() + "> " + string));
        }
    }

    public void a(SoundEvent soundEvent, float f10, float f11) {
        this.field_70170_p.func_184134_a((double)this.func_180425_c().func_177958_n(), (double)this.func_180425_c().func_177956_o(), (double)this.func_180425_c().func_177952_p(), soundEvent, SoundCategory.NEUTRAL, f10, f11, false);
    }

    public void a(SoundEvent soundEvent) {
        this.a(soundEvent, 1.0f, 1.0f);
    }

    public void a(SoundEvent[] soundEventArray, int ... nArray) {
        if (nArray.length == 0) {
            this.a(soundEventArray[this.func_70681_au().nextInt(soundEventArray.length)]);
            return;
        }
        this.a(soundEventArray[nArray[this.func_70681_au().nextInt(nArray.length)]], 1.0f, 1.0f);
    }

    public void a(SoundEvent[] soundEventArray, float f10) {
        this.a(soundEventArray[this.func_70681_au().nextInt(soundEventArray.length)], f10, 1.0f);
    }

    public void a(SoundEvent soundEvent, float f10) {
        this.a(soundEvent, f10, 1.0f);
    }

    public static boolean a(Entity entity) {
        if (entity == null) {
            return false;
        }
        if (!(entity instanceof em)) {
            return false;
        }
        return !(entity instanceof ei);
    }

    @SideOnly(value=Side.CLIENT)
    public em E() {
        return this;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean e() {
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 50.0);
        if (entityPlayer == null) {
            return false;
        }
        return entityPlayer.getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID());
    }

    public Vec3d aa() {
        return this.a(1.0);
    }

    public Vec3d a(double d10) {
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
        float f10 = entityPlayer.field_70177_z;
        return entityPlayer.func_174791_d().func_72441_c(-Math.sin((double)f10 * (Math.PI / 180)) * d10, 0.0, Math.cos((double)f10 * (Math.PI / 180)) * d10);
    }

    public Vec3d a(Vec3d vec3d, float f10) {
        return vec3d;
    }

    public static void a(EnumParticleTypes enumParticleTypes, em em2) {
        double d10 = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        double d11 = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        double d12 = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        em2.field_70170_p.func_175688_a(enumParticleTypes, em2.field_70165_t + (double)(com.trolmastercard.sexmod.r.f.nextFloat() * em2.field_70130_N * 2.0f) - (double)em2.field_70130_N, em2.field_70163_u + 0.5 + (double)(com.trolmastercard.sexmod.r.f.nextFloat() * em2.field_70131_O), em2.field_70161_v + (double)(com.trolmastercard.sexmod.r.f.nextFloat() * em2.field_70130_N * 2.0f) - (double)em2.field_70130_N, d10, d11, d12, new int[0]);
    }

    public static void a(EnumParticleTypes enumParticleTypes, em em2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            em.a(enumParticleTypes, em2);
        }
    }

    @Override
    public AnimationFactory getFactory() {
        return this.g;
    }

    public boolean func_70104_M() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    protected SoundEvent func_184639_G() {
        if (this.func_70681_au().nextInt(10000) == 0) {
            if (this.field_70170_p.field_72995_K && Minecraft.func_71410_x().field_71439_g.func_174791_d().func_72438_d(this.func_174791_d()) < 10.0) {
                this.a("whopa");
            }
            return com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_FART);
        }
        return null;
    }

    public float T() {
        return 0.0f;
    }

    public float ai() {
        return 0.0f;
    }

    @SideOnly(value=Side.CLIENT)
    public MatrixStack a(String string, boolean bl2) {
        IBone iBone;
        if (this.H == null) {
            this.H = this.b();
        }
        if ((iBone = this.H.getBone(string)) == null) {
            if (!cv.e.contains(string)) {
                Main.LOGGER.log(Level.WARN, String.format("The bone '%s' does not exist on %s. Bone model matrix couldn't be calculated", string, this.c()));
                this.p.remove(string);
            }
            return new MatrixStack();
        }
        GeoBone geoBone = (GeoBone)iBone;
        ArrayList<GeoBone> arrayList = new ArrayList<GeoBone>();
        Object object = geoBone;
        while (((GeoBone)object).parent != null) {
            GeoBone geoBone2 = ((GeoBone)object).parent;
            arrayList.add(geoBone2);
            object = geoBone2;
        }
        Collections.reverse(arrayList);
        object = new MatrixStack();
        if (this.Q()) {
            ((MatrixStack)object).rotateY((float)(-Math.toRadians(this.I().floatValue())));
        } else if (bl2) {
            ((MatrixStack)object).rotateY((float)(-Math.toRadians(b6.a(this.field_70760_ar, this.field_70761_aq, Minecraft.func_71410_x().func_184121_ak()))));
        }
        for (GeoBone geoBone3 : arrayList) {
            ((MatrixStack)object).translate(geoBone3);
            ((MatrixStack)object).moveToPivot(geoBone3);
            ((MatrixStack)object).rotate(geoBone3);
            ((MatrixStack)object).scale(geoBone3);
            ((MatrixStack)object).moveBackFromPivot(geoBone3);
        }
        ((MatrixStack)object).translate(geoBone);
        ((MatrixStack)object).moveToPivot(geoBone);
        ((MatrixStack)object).rotate(geoBone);
        ((MatrixStack)object).scale(geoBone);
        object = this.a((MatrixStack)object);
        return object;
    }

    protected MatrixStack a(MatrixStack matrixStack) {
        return matrixStack;
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3d b(String string) {
        block1: {
            Vec3d vec3d = this.x.get(string);
            if (vec3d != null) {
                return vec3d;
            }
            if (this.p.contains(string)) break block1;
            this.p.add(string);
        }
        return Vec3d.field_186680_a;
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3d d(String string) {
        return this.b(string).func_178787_e(this.func_174791_d());
    }

    public void a(String string, Vec3d vec3d) {
        this.x.put(string, vec3d);
    }

    @SideOnly(value=Side.CLIENT)
    public float R() {
        AnimationProcessor<?> animationProcessor = this.b();
        IBone iBone = animationProcessor.getBone("girlCam");
        if (iBone == null) {
            return 0.0f;
        }
        float f10 = iBone.getPivotY();
        f10 = this.a(f10);
        return f10 / 16.0f;
    }

    @SideOnly(value=Side.CLIENT)
    public float v() {
        return 1.0f;
    }

    protected float a(float f10) {
        return f10;
    }

    public AnimatedGeoModel<? extends em> a() {
        Minecraft minecraft = Minecraft.func_71410_x();
        Render render = minecraft.func_175598_ae().func_78713_a((Entity)this);
        if (render == null) {
            return null;
        }
        if (!(render instanceof d_)) {
            return null;
        }
        GeoEntityRenderer geoEntityRenderer = (GeoEntityRenderer)render;
        GeoModelProvider geoModelProvider = geoEntityRenderer.getGeoModelProvider();
        if (geoModelProvider == null) {
            return null;
        }
        if (!(geoModelProvider instanceof AnimatedGeoModel)) {
            return null;
        }
        return (AnimatedGeoModel)geoModelProvider;
    }

    public AnimationProcessor<?> b() {
        return this.a().getAnimationProcessor();
    }

    public boolean h(int n2) {
        ArrayList<Integer> arrayList = this.D();
        if (arrayList.size() - 1 < n2) {
            return false;
        }
        return (Integer)arrayList.get(n2) == 101;
    }

    public e1 g(int n2) {
        return e1.a;
    }

    public void a(List<Integer> list) {
        if (!(this instanceof e4) && !(this instanceof ew)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int n2 : list) {
            e4.c(stringBuilder, n2);
        }
        this.m.func_187227_b(e4.M, (Object)stringBuilder.toString());
    }

    public String F() {
        if (this instanceof e4 || this instanceof ew) {
            return (String)this.m.func_187225_a(e4.M);
        }
        return "";
    }

    public static String c(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int n2 : list) {
            stringBuilder.append(n2);
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }

    public static List<Integer> c(String string) {
        String[] stringArray;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (String string2 : stringArray = string.split("-")) {
            arrayList.add(Integer.parseInt(string2));
        }
        return arrayList;
    }

    public static List<Integer> h(UUID uUID) {
        ArrayList<Integer> arrayList;
        block0: {
            em em2 = Main.proxy instanceof ClientProxy ? em.b(uUID) : em.a(uUID);
            arrayList = new ArrayList<Integer>(em2.L());
            if (!(em2 instanceof e4) && !(em2 instanceof ew)) break block0;
            arrayList.addAll(em.c((String)em2.func_184212_Q().func_187225_a(e4.M)));
        }
        return arrayList;
    }

    public ArrayList<Integer> L() {
        return new ArrayList<Integer>();
    }

    public List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> d(UUID uUID) {
        if (this.d != null) {
            return this.d;
        }
        ArrayList<Integer> arrayList = this.D();
        if (arrayList.isEmpty()) {
            this.d = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
            return this.d;
        }
        ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>> arrayList2 = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
        List<Integer> list = em.h(uUID);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            arrayList2.add(new AbstractMap.SimpleEntry<gw, AbstractMap.SimpleEntry<List<String>, Integer>>(gw.GIRL_SPECIFIC, new AbstractMap.SimpleEntry<List<String>, Integer>(this.e((Integer)arrayList.get(i2)), list.get(i2))));
        }
        this.d = arrayList2;
        return arrayList2;
    }

    public void b(List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> list) {
        this.d = list;
    }

    public void a(int n2, int n3) {
        if (this.d == null) {
            return;
        }
        if (this.d.size() - 1 < n2) {
            return;
        }
        Map.Entry<gw, Map.Entry<List<String>, Integer>> entry = this.d.get(n2);
        entry.getValue().setValue(n3);
        this.d.set(n2, entry);
    }

    public void e(String string) {
        block0: {
            if (!(this instanceof e4) && !(this instanceof ew)) break block0;
            this.m.func_187227_b(e4.M, (Object)string);
        }
    }

    private List<String> e(int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add("");
        }
        return arrayList;
    }

    public ArrayList<Integer> D() {
        return new ArrayList<Integer>();
    }

    public List<Integer> u() {
        return new ArrayList<Integer>();
    }

    public void f(String string) {
        this.m.func_187227_b(b, (Object)string);
    }

    public String C() {
        return (String)this.m.func_187225_a(b);
    }

    public static String a(HashSet<String> hashSet) {
        if (hashSet == null) {
            return "";
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : hashSet) {
            stringBuilder.append(string);
            stringBuilder.append("#");
        }
        return stringBuilder.toString();
    }

    public HashSet<String> Y() {
        String string = this.C();
        String[] stringArray = string.split("#");
        HashSet<String> hashSet = new HashSet<String>();
        for (String string2 : stringArray) {
            if ("".equals(string2) || "cross".equals(string2)) continue;
            hashSet.add(string2);
        }
        return hashSet;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean H() {
        return true;
    }

    private static RuntimeException c(RuntimeException runtimeException) {
        return runtimeException;
    }
}

