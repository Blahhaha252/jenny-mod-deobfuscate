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
    public static final DataParameter<String> v = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(110);
    public static final DataParameter<Boolean> G = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(109);
    public static final DataParameter<String> e = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(108);
    public static final DataParameter<Float> w = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.FLOAT).getSerializer().createKey(107);
    public static final DataParameter<String> u = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(106);
    public static final DataParameter<Integer> D = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.VARINT).getSerializer().createKey(105);
    public static final DataParameter<String> J = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(104);
    public static final DataParameter<String> h = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(103);
    public static final DataParameter<String> y = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(102);
    public static final DataParameter<String> a = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(101);
    public static final DataParameter<String> b = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(100);
    public static final DataParameter<String> c = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(99);
    protected static final List<Item> I = Arrays.asList(Items.EMERALD, Items.DIAMOND, Items.GOLD_INGOT, Items.ENDER_PEARL);
    public AnimationController C;
    public AnimationController E;
    public AnimationController s;
    HashMap<String, Pair<Integer, Integer>> A;
    AnimationProcessor<?> H;
    public List<String> p;
    protected List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> d;

    public void a(a.a a2) {
        this.m.set(a, (Object)a2.toString());
    }

    public a.a q() {
        return a.a.valueOf((String)this.m.get(a));
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, String string2) {
        ge.b.sendToServer((IMessage)new n(this.f(), string, string2));
    }

    public UUID f() {
        try {
            return UUID.fromString((String)this.m.get(u));
        }
        catch (Exception exception) {
            UUID uUID = UUID.randomUUID();
            this.m.set(u, (Object)uUID.toString());
            return uUID;
        }
    }

    public fp y() {
        return fp.valueOf((String)this.m.get(J));
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
        if (this.world.isRemote) {
            this.a("currentAction", fp2.toString());
            return;
        }
        fp3.ticksPlaying = new int[]{0, 0};
        this.m.set(J, (Object)fp2.toString());
    }

    public int ah() {
        return (Integer)this.m.get(D);
    }

    public void f(int n2) {
        if (this.world.isRemote) {
            this.a("currentModel", "0");
        } else {
            this.m.set(D, (Object)n2);
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
        return this.world.getPlayerEntityByUUID(uUID);
    }

    public static void a(em em2, String string) {
        for (EntityPlayer entityPlayer : cj.getTrackingPlayers((Entity)em2)) {
            entityPlayer.sendMessage((ITextComponent)new TextComponentString(string));
        }
    }

    public static void a(em em2, SoundEvent soundEvent, boolean bl) {
        Vec3d vec3d = em2.getPositionVector();
        for (EntityPlayer entityPlayer : cj.getTrackingPlayers((Entity)em2)) {
            Vec3d vec3d2;
            if (!bl) {
                vec3d2 = vec3d;
            } else {
                Vec3d vec3d3 = entityPlayer.getPositionVector();
                Vec3d vec3d4 = vec3d.subtract(vec3d3).normalize();
                vec3d2 = vec3d3.add(vec3d4);
            }
            ((EntityPlayerMP)entityPlayer).connection.sendPacket((Packet)new SPacketSoundEffect(soundEvent, SoundCategory.AMBIENT, vec3d2.x, vec3d2.y, vec3d2.z, 1.0f, 1.0f));
        }
    }

    public static void a(em em2, SoundEvent soundEvent) {
        em.a(em2, soundEvent, false);
    }

    public static void a(em em2, SoundEvent[] soundEventArray) {
        em.a(em2, com.trolmastercard.sexmod.c.a(soundEventArray));
    }

    public static void a(em em2, SoundEvent[] soundEventArray, boolean bl) {
        em.a(em2, com.trolmastercard.sexmod.c.a(soundEventArray), bl);
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3d A() {
        Vec3d vec3d = Minecraft.getMinecraft().player.getPositionVector();
        Vec3d vec3d2 = this.getPositionVector();
        Vec3d vec3d3 = vec3d2.subtract(vec3d).normalize();
        return vec3d.add(vec3d3);
    }

    @Nullable
    public UUID ae() {
        String string = (String)this.m.get(y);
        if (string.equals("null")) {
            return null;
        }
        return UUID.fromString(string);
    }

    public void e(UUID uUID) {
        if (this.world.isRemote) {
            if (uUID == null) {
                this.a("playerSheHasSexWith", (String)null);
            } else {
                this.a("playerSheHasSexWith", uUID.toString());
            }
            return;
        }
        if (uUID == null) {
            this.m.set(y, (Object)"null");
        } else {
            this.m.set(y, (Object)uUID.toString());
        }
    }

    public void a(@Nonnull EntityPlayer entityPlayer) {
        this.e(entityPlayer.getPersistentID());
    }

    public Vec3d o() {
        String[] stringArray = ((String)this.m.get(e)).split("\\|");
        return new Vec3d(Double.parseDouble(stringArray[0]), Double.parseDouble(stringArray[1]), Double.parseDouble(stringArray[2]));
    }

    public void c(Vec3d vec3d) {
        if (this.world.isRemote) {
            String string = vec3d.x + "f" + vec3d.y + "f" + vec3d.z + "f";
            this.a("targetPos", string);
            return;
        }
        this.m.set(e, (Object)(vec3d.x + "|" + vec3d.y + "|" + vec3d.z));
    }

    public void a(Vec3d vec3d) {
        this.m.set(e, (Object)(vec3d.x + "|" + vec3d.y + "|" + vec3d.z));
    }

    public Float I() {
        return (Float)this.m.get(w);
    }

    public void b(float f) {
        this.m.set(w, (Object)Float.valueOf(f));
    }

    public void a(boolean bl) {
        if (this.world.isRemote) {
            this.a("shouldbeattargetpos", String.valueOf(bl));
            return;
        }
        this.m.set(G, (Object)bl);
    }

    public boolean Q() {
        return (Boolean)this.m.get(G);
    }

    protected boolean canDespawn() {
        return false;
    }

    protected em(World world) {
        super(world);
        this.g = new AnimationFactory((IAnimatable) this);
        this.l = Vec3d.ZERO;
        this.n = 1.0f;
        this.F = false;
        this.i = false;
        this.x = new HashMap();
        this.A = new HashMap();
        this.H = null;
        this.p = new ArrayList<String>();
        this.d = null;
        if (world.isRemote) {
            this.p();
        }
        if (world.isRemote && world instanceof gj) {
            return;
        }
        PathNavigate pathNavigate = this.getNavigator();
        if (pathNavigate instanceof PathNavigateGround) {
            ((PathNavigateGround)pathNavigate).setBreakDoors(true);
        }
    }

    @SideOnly(value=Side.CLIENT)
    protected void p() {
        this.C = new AnimationController((IAnimatable)this, "action", 0.0f, this::a);
        this.E = new AnimationController((IAnimatable)this, "movement", 5.0f, this::a);
        this.s = new AnimationController((IAnimatable)this, "eyes", 10.0f, this::a);
    }

    protected void entityInit() {
        super.entityInit();
        this.f = this.getNavigator();
        this.m = this.getDataManager();
        this.m.register(u, (Object)UUID.randomUUID().toString());
        this.m.register(D, (Object)1);
        this.m.register(J, (Object)fp.NULL.toString());
        this.m.register(h, (Object)"");
        this.m.register(y, (Object)"null");
        this.m.register(G, (Object)false);
        this.m.register(w, (Object)Float.valueOf(0.0f));
        this.m.register(e, (Object)"0|0|0");
        this.m.register(v, (Object)"");
        this.m.register(a, (Object)a.a.WALK.toString());
        this.m.register(b, (Object)"");
        this.m.register(c, (Object)"");
    }

    public void b(boolean bl) {
        this.i = bl;
        if (bl) {
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
        WorldServer[] worldServerArray = FMLCommonHandler.instance().getMinecraftServerInstance().worlds;
        if (worldServerArray.length == 0) {
            return new ArrayList<em>();
        }
        ArrayList<em> arrayList = new ArrayList<em>();
        for (WorldServer worldServer : worldServerArray) {
            arrayList.addAll(worldServer.getEntities(em.class, em2 -> true));
        }
        return arrayList;
    }

    @SideOnly(value=Side.CLIENT)
    private static List<em> Z() {
        WorldClient worldClient = Minecraft.getMinecraft().world;
        if (worldClient == null) {
            return new ArrayList<em>();
        }
        return worldClient.getEntities(em.class, em2 -> true);
    }

    public boolean B() {
        return true;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(30.0);
    }

    protected void initEntityAI() {
        this.z = new EntityAIWanderAvoidWater((EntityCreature)this, 0.35);
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 0.4, false, new HashSet<Item>(I)));
        this.tasks.addTask(3, (EntityAIBase)new hz((EntityLiving)this));
        this.tasks.addTask(5, (EntityAIBase)this.o);
        this.tasks.addTask(5, (EntityAIBase)this.z);
    }

    public void writeEntityToNBT(NBTTagCompound nBTTagCompound) {
        nBTTagCompound.setDouble("homeX", this.l.x);
        nBTTagCompound.setDouble("homeY", this.l.y);
        nBTTagCompound.setDouble("homeZ", this.l.z);
        nBTTagCompound.setString("girlID", (String)this.m.get(u));
        String string = this.w();
        if (!"".equals(string)) {
            nBTTagCompound.setString("sexmod:customname", string);
        }
        if (this.X()) {
            nBTTagCompound.setString("sexmod:customModel", this.C());
        }
        super.writeEntityToNBT(nBTTagCompound);
    }

    protected boolean X() {
        return em.a((Entity)this);
    }

    public void readEntityFromNBT(NBTTagCompound nBTTagCompound) {
        block4: {
            String string;
            super.readEntityFromNBT(nBTTagCompound);
            this.l = new Vec3d(nBTTagCompound.getDouble("homeX"), nBTTagCompound.getDouble("homeY"), nBTTagCompound.getDouble("homeZ"));
            String string2 = nBTTagCompound.getString("sexmod:customname");
            if (!"".equals(string2)) {
                this.g(string2);
            }
            if ("".equals(string = nBTTagCompound.getString("girlID"))) {
                return;
            }
            UUID uUID = UUID.fromString(string);
            boolean bl = false;
            for (em em2 : em.g(uUID)) {
                if (em2.world.isRemote || em2 == this || em2.isDead || !em2.isAddedToWorld()) continue;
                bl = true;
                break;
            }
            if (bl) {
                Main.LOGGER.log(Level.WARN, String.format("got a duped %s with id '%s'. Deleted her", this.c(), uUID));
                this.world.removeEntity((Entity)this);
                return;
            }
            this.m.set(u, (Object)uUID.toString());
            if (!this.X()) break block4;
            this.f(nBTTagCompound.getString("sexmod:customModel"));
        }
    }

    public boolean d() {
        return true;
    }

    public void setVelocity(double d, double d2, double d3) {
        this.motionX = d;
        this.motionY = d2;
        this.motionZ = d3;
    }

    public void b(Vec3d vec3d) {
        this.motionX = vec3d.x;
        this.motionY = vec3d.y;
        this.motionZ = vec3d.z;
    }

    public Vec3d j() {
        return new Vec3d(this.lastTickPosX, this.lastTickPosY, this.lastTickPosZ);
    }

    public void updateAITasks() {
        if (((Boolean)this.m.get(G)).booleanValue()) {
            this.setRotationYawHead(this.I().floatValue());
            this.setPositionAndRotation(this.o().x, this.o().y, this.o().z, this.I().floatValue(), 0.0f);
            this.setRotation(this.I().floatValue(), this.rotationPitch);
        }
        if (this.l.equals((Object)Vec3d.ZERO)) {
            this.l = new Vec3d((Vec3i)this.getPosition());
        }
        this.G();
    }

    public void onUpdate() {
        super.onUpdate();
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
            int n2 = this.world.isRemote ? 1 : 0;
            fp2.ticksPlaying[n2] = fp2.ticksPlaying[n2] + 1;
            if (fp2.ticksPlaying[n2] < fp2.length) {
                return;
            }
            if (fp2.followUp == null) {
                return;
            }
            if (this.world.isRemote) break block2;
            this.b(fp2.followUp);
        }
    }

    protected void k() {
        Path path = this.getNavigator().getPath();
        if (path == null) {
            return;
        }
        if (this.onGround || this.isInWater()) {
            return;
        }
        int n2 = path.getCurrentPathIndex();
        int n3 = path.getCurrentPathLength();
        if (n3 == n2 || n3 - 1 == n2) {
            return;
        }
        PathPoint pathPoint = path.getPathPointFromIndex(n2);
        PathPoint pathPoint2 = path.getPathPointFromIndex(n2 + 1);
        Vec3d vec3d = new Vec3d((double)(pathPoint2.x - pathPoint.x), (double)(pathPoint2.y - pathPoint.y), (double)(pathPoint2.z - pathPoint.z));
        this.motionX = vec3d.x / 7.0;
        this.motionZ = vec3d.z / 7.0;
    }

    public void g() {
    }

    @SideOnly(value=Side.CLIENT)
    public boolean b(EntityPlayer entityPlayer) {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    protected static void a(EntityPlayer entityPlayer, em em2) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new m(em2, entityPlayer));
    }

    @SideOnly(value=Side.CLIENT)
    protected static void a(EntityPlayer entityPlayer, em em2, String[] stringArray, ItemStack[] itemStackArray, boolean bl) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new m(em2, entityPlayer, stringArray, itemStackArray, bl));
    }

    @SideOnly(value=Side.CLIENT)
    protected static void a(EntityPlayer entityPlayer, em em2, String[] stringArray, boolean bl) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new m(em2, entityPlayer, stringArray, null, bl));
    }

    public void a(ItemStack itemStack) {
        this.activeItemStack = itemStack;
    }

    public void d(int n2) {
        this.activeItemStackUseCount = n2;
    }

    public Vec3d M() {
        return new Vec3d(this.prevPosX, this.prevPosY, this.prevPosZ);
    }

    protected static Vec3d a(em em2) {
        return new Vec3d(em2.prevPosX, em2.prevPosY, em2.prevPosZ);
    }

    public em af() {
        return this;
    }

    public void x() {
        if (this.world.isRemote) {
            this.a("master", "");
            this.a("walk speed", a.a.WALK.toString());
        } else {
            this.m.set(v, (Object)"");
            this.m.set(a, (Object)a.a.WALK.toString());
        }
    }

    protected void a(EntityPlayerMP entityPlayerMP, boolean bl) {
        entityPlayerMP.motionX = 0.0;
        entityPlayerMP.motionY = 0.0;
        entityPlayerMP.motionZ = 0.0;
        if (bl) {
            Vec3d vec3d = this.a(0.35);
            entityPlayerMP.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
        }
    }

    public void j(UUID uUID) {
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        entityPlayer.motionX = 0.0;
        entityPlayer.motionY = 0.0;
        entityPlayer.motionZ = 0.0;
        Vec3d vec3d = this.a(0.35);
        entityPlayer.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
        this.b(entityPlayer.rotationYawHead + 180.0f);
    }

    protected void a(boolean bl, boolean bl2, UUID uUID) {
        if (this.world.isRemote) {
            ge.b.sendToServer((IMessage)new dc(this.f(), uUID, bl, bl2));
        } else {
            dc.a$a.a(this.f(), uUID, bl, bl2);
        }
    }

    public static em b(UUID uUID) {
        if (uUID == null) {
            return null;
        }
        for (em em2 : em.g(uUID)) {
            if (!em2.world.isRemote) continue;
            return em2;
        }
        return null;
    }

    public static em a(UUID uUID) {
        if (uUID == null) {
            return null;
        }
        for (em em2 : em.g(uUID)) {
            if (em2.world.isRemote) continue;
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
        return this.a(blockPos, n2, Blocks.BED, 22, 3, null);
    }

    public void W() {
        this.m.set(HAND_STATES, (Object)Byte.valueOf("1"));
    }

    public void K() {
        this.m.set(HAND_STATES, (Object)Byte.valueOf("0"));
    }

    public BlockPos a(BlockPos blockPos, int n2, Block block, int n3, int n4, @Nullable HashSet<Biome> hashSet) {
        int n5 = 1;
        int n6 = -1;
        BlockPos blockPos2 = blockPos;
        int n7 = 0;
        while (n5 < n3) {
            for (int i = 0; i < 2; ++i) {
                int n8;
                int n9;
                n6 *= -1;
                for (n9 = 0; n9 < n5; ++n9) {
                    blockPos2 = blockPos2.add(0, 0, n6);
                    for (n8 = -n4; n8 < n4 + 1; ++n8) {
                        if (this.world.getBlockState(blockPos2.add(0, n8, n6)).getBlock() != block || ++n7 < n2 || hashSet != null && !hashSet.contains(this.world.getBiome(blockPos2.add(n6, n8, 0)))) continue;
                        return blockPos2.add(0, n8, n6);
                    }
                }
                for (n9 = 0; n9 < n5; ++n9) {
                    blockPos2 = blockPos2.add(n6, 0, 0);
                    for (n8 = -n4; n8 < n4 + 1; ++n8) {
                        if (this.world.getBlockState(blockPos2.add(n6, n8, 0)).getBlock() != block || ++n7 < n2 || hashSet != null && !hashSet.contains(this.world.getBiome(blockPos2.add(n6, n8, 0)))) continue;
                        return blockPos2.add(n6, n8, 0);
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
            for (int i = 0; i < 2; ++i) {
                int n6;
                int n7;
                n5 *= -1;
                for (n7 = 0; n7 < n4; ++n7) {
                    blockPos2 = blockPos2.add(0, 0, n5);
                    for (n6 = -n3; n6 < n3 + 1; ++n6) {
                        if (!clazz.isInstance(this.world.getBlockState(blockPos2.add(0, n6, n5)).getBlock()) || hashSet != null && !hashSet.contains(this.world.getBiome(blockPos2.add(n5, n6, 0)))) continue;
                        arrayList.add(blockPos2.add(0, n6, n5));
                    }
                }
                for (n7 = 0; n7 < n4; ++n7) {
                    blockPos2 = blockPos2.add(n5, 0, 0);
                    for (n6 = -n3; n6 < n3 + 1; ++n6) {
                        if (!clazz.isInstance(this.world.getBlockState(blockPos2.add(n5, n6, 0)).getBlock()) || hashSet != null && !hashSet.contains(this.world.getBiome(blockPos2.add(n5, n6, 0)))) continue;
                        arrayList.add(blockPos2.add(n5, n6, 0));
                    }
                }
                ++n4;
            }
        }
        return arrayList;
    }

    public boolean J() {
        return !((String)this.m.get(v)).equals("");
    }

    @Nullable
    public UUID O() {
        String string = (String)this.m.get(v);
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
        return this.world.getPlayerEntityByUUID(uUID);
    }

    protected ResourceLocation getLootTable() {
        return dz.d;
    }

    @SideOnly(value=Side.CLIENT)
    public void a(String string, UUID uUID) {
    }

    @SideOnly(value=Side.CLIENT)
    protected abstract <E extends IAnimatable> PlayState a(AnimationEvent<E> var1);

    @SideOnly(value=Side.CLIENT)
    protected boolean a(fp fp2, String string, boolean bl, AnimationEvent animationEvent) {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, boolean bl, AnimationEvent animationEvent, boolean bl2) {
        if (!bl2 && fp.b(this, animationEvent.getPartialTick()) && this.a(this.y(), string, d3.d, animationEvent)) {
            return;
        }
        ILoopType.EDefaultLoopTypes eDefaultLoopTypes = bl ? ILoopType.EDefaultLoopTypes.LOOP : ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME;
        animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation(string, (ILoopType)eDefaultLoopTypes));
        animationEvent.getController().transitionLengthTicks = 0.0;
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, boolean bl, AnimationEvent animationEvent) {
        this.a(string, bl, animationEvent, false);
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, int n2, float f, AnimationEvent animationEvent, boolean bl) {
        if (!bl && fp.b(this, animationEvent.getPartialTick()) && this.a(this.y(), string, d3.d, animationEvent)) {
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
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation(n3 == 0 ? string : string + n3, (ILoopType)ILoopType.EDefaultLoopTypes.LOOP));
            animationEvent.getController().transitionLengthTicks = 0.0;
            return;
        }
        int n5 = this.a(n3, n4, n2, f);
        animationController.setAnimation(new AnimationBuilder().addAnimation(n5 == 0 ? string : string + n5, (ILoopType)ILoopType.EDefaultLoopTypes.LOOP));
        animationController.transitionLengthTicks = 0.0;
        this.A.put(string, (Pair<Integer, Integer>)Pair.of((Object)n5, (Object)(n5 == 0 ? n4 : n5)));
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, int n2, float f, AnimationEvent animationEvent) {
        this.a(string, n2, f, animationEvent, false);
    }

    int a(int n2, int n3, int n4, float f) {
        int n5;
        if (n2 != 0) {
            return 0;
        }
        Random random = this.getRNG();
        if (random.nextFloat() > f) {
            return 0;
        }
        while (((n5 = random.nextInt(n4)) == n3 || n5 == 0) && n4 > 2) {
        }
        return n5;
    }

    @SideOnly(value=Side.CLIENT)
    public abstract void registerControllers(AnimationData var1);

    protected void s() {
        block1: {
            block0: {
                if (!this.world.isRemote || !this.n()) break block0;
                this.B = null;
                ge.b.sendToServer((IMessage)new s(this.f(), true));
                break block1;
            }
            if (this.world.isRemote) break block1;
            s.a$a.a((EntityPlayerMP)this.world.getPlayerEntityByUUID(this.ae()));
        }
    }

    public static em c(EntityPlayer entityPlayer) {
        if (entityPlayer == null) {
            return null;
        }
        return em.i(entityPlayer.getPersistentID());
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3d a(Minecraft minecraft, cy cy2, EntityLivingBase entityLivingBase, float f) {
        return com.trolmastercard.sexmod.b.a(minecraft, cy2, entityLivingBase, this, f);
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
                if (var3_4.isDead) {
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
            var4_5 = var3_4.world.isRemote;
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
        boolean bl = FMLCommonHandler.instance().getMinecraftServerInstance() == null;
        try {
            for (em em2 : em.ad()) {
                boolean bl2;
                if (em2.isDead || (bl2 = em2.world.isRemote) != bl || !uUID.equals(em2.ae())) continue;
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
            this.setNoGravity(false);
            this.b((fp)null);
            if (!this.world.isRemote) break block0;
            this.V();
        }
    }

    @SideOnly(value=Side.CLIENT)
    protected void V() {
        block0: {
            if (!this.n()) break block0;
            d3.a(true);
            Minecraft.getMinecraft().player.setInvisible(false);
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
                if (var2_3.isDead) {
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
            if (!var2_3.world.isRemote || (var3_4 = var2_3.ae()) == null || !var3_4.equals(var0) || (var4_5 = var2_3.a(var2_3.y())) == null) ** GOTO lbl-1000
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
        return new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 50.0);
    }

    protected void a(double d, double d2, double d4, float f, float f2) {
        if (this.ae() == null) {
            System.out.println("couldnt move camera because the player isn't set");
            return;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.ae());
        if (this.B == null) {
            this.B = entityPlayer.getPositionVector();
        }
        Vec3d vec3d = this.B;
        vec3d = vec3d.add(-Math.sin((double)(this.r + 90.0f) * (Math.PI / 180)) * d, 0.0, Math.cos((double)(this.r + 90.0f) * (Math.PI / 180)) * d);
        vec3d = vec3d.add(0.0, d2, 0.0);
        vec3d = vec3d.add(-Math.sin((double)this.r * (Math.PI / 180)) * d4, 0.0, Math.cos((double)this.r * (Math.PI / 180)) * d4);
        if (this.world.isRemote) {
            ge.b.sendToServer((IMessage)new a8(entityPlayer.getPersistentID().toString(), vec3d, this.r + f, f2));
            return;
        }
        entityPlayer.setPositionAndRotation(vec3d.x, vec3d.y, vec3d.z, this.r + f, f2);
        entityPlayer.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
    }

    @SideOnly(value=Side.CLIENT)
    protected boolean n() {
        if (!this.world.isRemote) {
            return false;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        return entityPlayerSP.getPersistentID().equals(this.ae()) || entityPlayerSP.getUniqueID().equals(this.ae());
    }

    protected void U() {
    }

    public void g(String string) {
        this.m.set(c, (Object)string);
    }

    public String w() {
        return (String)this.m.get(c);
    }

    public abstract String c();

    public String ab() {
        String string = (String)this.m.get(c);
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
                if (this.world.isRemote) break block0;
                ge.b.sendToAllAround((IMessage)new gh(String.format("<%s> %s", this.ab(), string), this.dimension, this.f()), new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 40.0));
                break block1;
            }
            if (!this.n()) break block1;
            ge.b.sendToServer((IMessage)new gh(String.format("<%s> %s", this.ab(), string), this.dimension, this.f()));
        }
    }

    protected void b(String string, boolean bl) {
        block2: {
            if (!bl) {
                this.h(string);
            }
            if (!this.world.isRemote) {
                ge.b.sendToAllAround((IMessage)new gh(string, this.dimension, this.f()), new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 40.0));
                return;
            }
            if (!this.n()) break block2;
            ge.b.sendToServer((IMessage)new gh(string, this.dimension, this.f()));
        }
    }

    protected void a(String string) {
        block0: {
            if (!this.world.isRemote) break block0;
            Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentString(String.format("<%s> %s", this.ab(), string)));
        }
    }

    protected void a(UUID uUID, String string) {
        block1: {
            EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
            if (entityPlayer == null) {
                System.out.println("Player with UUID " + uUID.toString() + " not found");
                return;
            }
            if (!this.world.isRemote) break block1;
            Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentString("<" + entityPlayer.getName() + "> " + string));
        }
    }

    public void a(SoundEvent soundEvent, float f, float f2) {
        this.world.playSound((double)this.getPosition().getX(), (double)this.getPosition().getY(), (double)this.getPosition().getZ(), soundEvent, SoundCategory.NEUTRAL, f, f2, false);
    }

    public void a(SoundEvent soundEvent) {
        this.a(soundEvent, 1.0f, 1.0f);
    }

    public void a(SoundEvent[] soundEventArray, int ... nArray) {
        if (nArray.length == 0) {
            this.a(soundEventArray[this.getRNG().nextInt(soundEventArray.length)]);
            return;
        }
        this.a(soundEventArray[nArray[this.getRNG().nextInt(nArray.length)]], 1.0f, 1.0f);
    }

    public void a(SoundEvent[] soundEventArray, float f) {
        this.a(soundEventArray[this.getRNG().nextInt(soundEventArray.length)], f, 1.0f);
    }

    public void a(SoundEvent soundEvent, float f) {
        this.a(soundEvent, f, 1.0f);
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
        EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 50.0);
        if (entityPlayer == null) {
            return false;
        }
        return entityPlayer.getPersistentID().equals(Minecraft.getMinecraft().player.getPersistentID());
    }

    public Vec3d aa() {
        return this.a(1.0);
    }

    public Vec3d a(double d) {
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.ae());
        float f = entityPlayer.rotationYaw;
        return entityPlayer.getPositionVector().add(-Math.sin((double)f * (Math.PI / 180)) * d, 0.0, Math.cos((double)f * (Math.PI / 180)) * d);
    }

    public Vec3d a(Vec3d vec3d, float f) {
        return vec3d;
    }

    public static void a(EnumParticleTypes enumParticleTypes, em em2) {
        double d = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        double d2 = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        double d4 = com.trolmastercard.sexmod.r.f.nextGaussian() * 0.02;
        em2.world.spawnParticle(enumParticleTypes, em2.posX + (double)(com.trolmastercard.sexmod.r.f.nextFloat() * em2.width * 2.0f) - (double)em2.width, em2.posY + 0.5 + (double)(com.trolmastercard.sexmod.r.f.nextFloat() * em2.height), em2.posZ + (double)(com.trolmastercard.sexmod.r.f.nextFloat() * em2.width * 2.0f) - (double)em2.width, d, d2, d4, new int[0]);
    }

    public static void a(EnumParticleTypes enumParticleTypes, em em2, int n2) {
        for (int i = 0; i < n2; ++i) {
            em.a(enumParticleTypes, em2);
        }
    }

    public AnimationFactory getFactory() {
        return this.g;
    }

    public boolean canBePushed() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    protected SoundEvent getAmbientSound() {
        if (this.getRNG().nextInt(10000) == 0) {
            if (this.world.isRemote && Minecraft.getMinecraft().player.getPositionVector().distanceTo(this.getPositionVector()) < 10.0) {
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
    public MatrixStack a(String string, boolean bl) {
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
        GeoBone geoBone2 = geoBone;
        while (geoBone2.parent != null) {
            GeoBone geoBone3 = geoBone2.parent;
            arrayList.add(geoBone3);
            geoBone2 = geoBone3;
        }
        Collections.reverse(arrayList);
        geoBone2 = new MatrixStack();
        if (this.Q()) {
            geoBone2.rotateY((float)(-Math.toRadians(this.I().floatValue())));
        } else if (bl) {
            geoBone2.rotateY((float)(-Math.toRadians(b6.a(this.prevRenderYawOffset, this.renderYawOffset, Minecraft.getMinecraft().getRenderPartialTicks()))));
        }
        for (GeoBone geoBone4 : arrayList) {
            geoBone2.translate(geoBone4);
            geoBone2.moveToPivot(geoBone4);
            geoBone2.rotate(geoBone4);
            geoBone2.scale(geoBone4);
            geoBone2.moveBackFromPivot(geoBone4);
        }
        geoBone2.translate(geoBone);
        geoBone2.moveToPivot(geoBone);
        geoBone2.rotate(geoBone);
        geoBone2.scale(geoBone);
        geoBone2 = this.a((MatrixStack)geoBone2);
        return geoBone2;
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
        return Vec3d.ZERO;
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3d d(String string) {
        return this.b(string).add(this.getPositionVector());
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
        float f = iBone.getPivotY();
        f = this.a(f);
        return f / 16.0f;
    }

    @SideOnly(value=Side.CLIENT)
    public float v() {
        return 1.0f;
    }

    protected float a(float f) {
        return f;
    }

    public AnimatedGeoModel<? extends em> a() {
        Minecraft minecraft = Minecraft.getMinecraft();
        Render render = minecraft.getRenderManager().getEntityRenderObject((Entity)this);
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
        this.m.set(e4.M, (Object)stringBuilder.toString());
    }

    public String F() {
        if (this instanceof e4 || this instanceof ew) {
            return (String)this.m.get(e4.M);
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
            arrayList.addAll(em.c((String)em2.getDataManager().get(e4.M)));
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
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList2.add(new AbstractMap.SimpleEntry<gw, AbstractMap.SimpleEntry<List<String>, Integer>>(gw.GIRL_SPECIFIC, new AbstractMap.SimpleEntry<List<String>, Integer>(this.e((Integer)arrayList.get(i)), list.get(i))));
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
            this.m.set(e4.M, (Object)string);
        }
    }

    private List<String> e(int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < n2; ++i) {
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
        this.m.set(b, (Object)string);
    }

    public String C() {
        return (String)this.m.get(b);
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
    
    public static enum em.a.a {
        WALK,
        FAST_WALK,
        RUN;

    }

}

