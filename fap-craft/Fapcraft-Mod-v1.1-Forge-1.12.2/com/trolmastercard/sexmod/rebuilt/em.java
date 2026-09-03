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
import com.trolmastercard.sexmod.ew;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.fs;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.detectServer;
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

public abstract class em extends EntityCreature impements IAnimatable {
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
    
    public void a(a a2) {
        this.m.set(a, (Object)a2.toString());
    }

    public a q() {
        return com.trolmastercard.sexmod.em$a.valueOf((String)this.m.get(a));
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
        fp fp3;
        fp fp4 = this.y();
        if (fp4 == fp2) {
            return;
        }
        if (fp2 != fp.ATTACK || fp4 == fp.NULL) {
            fp3 = fp2 == null ? fp.NULL : fp2;
            fp2 = fp3;
            if (this.world.isRemote) {
                this.a("currentAction", fp2.toString());
                return;
            }
            fp4.ticksPlaying = new int[]{0, 0};
            this.m.set(J, (Object)fp2.toString());
        } else {
            return;
        }
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
        for (EntityPlayer entityPlayer : cj.a((Entity)em2)) {
            entityPlayer.sendMessage((ITextComponent)new TextComponentString(string));
        }
    }
    
    public static void a(em em2, SoundEvent soundEvent, boolean bl) {
        Vec3d vec3d = em2.getPositionVector();
        for (EntityPlayer entityPlayer : cj.a((Entity)em2)) {
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
        } else {
            if (uUID == null) {
                this.m.set(y, (Object) "null");
            } else {
                this.m.set(y, (Object)uUID.toString());   
            }
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
        try {
            if (this.world.isRemote) {
                this.a("shouldbeattargetpos", String.valueOf(bl));
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        this.m.set(G, (Object)bl);
    }

    public boolean Q() {
        return (Boolean)this.m.get(G);
    }

    protected boolean canDespawn() {
        return false;
    }
    
    protected em(World world){
        super(world);
        this.g = new AnimationFactory((IAnimatable)this);
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
        if (world.isRemote && world instanceof gj)  {
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
        this.m.register(a, (Object)com.trolmastercard.sexmod.em$a.WALK.toString());
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
    
    public static list<em> ad() {
        if (!g0.a()) {
            return em.Z();
        }
        WorldServer[] worldServerArray FMLCommonHandler.instance().getMinecraftServerInstance().worlds;
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
        super.readEntityFromNBT(nBTTagCompound);
        this.l = new Vec3d(nBTTagCompound.getDouble("homeX"), nBTTagCompound.getDouble("homeY"), nBTTagCompound.getDouble("homeZ"));
        String string = nBTTagCompound.getString("sexmod:customname");
        if (!"".equals(string)) {
            this.g(string);
        }
        String string2 = nBTTagCompound.getString("girlID");
        if ("".equals(string2)) {
            return;
        }
        UUID uUID = UUID.fromString(string2);
        boolean bl = false;
        for (em em2 : em.g(uUID)) {
            if (em2.world.isRemote) continue;
            if (em2 == this) continue;
            if (em2.isDead) continue;
            if (!em2.isAddedToWorld()) continue;
      
            bl = true;
            break;
        }
        if (bl) {
            Main.LOGGER.log(Level.WARN, String.format("got a duped %s with id '%s'. Deleted her", this.c(), uUID));
            this.world.removeEntity((Entity)this);
            return;
        }
        this.m.set(u, (Object)uUID.toString());
        if (this.X()) {
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
            if (hashSet3.isEmpty()) {
                continue;
            }
            if (hashSet3.contains((Object)fy2)) continue;
            hashSet2.add(string2);
        }
        if (hashSet2.isEmpty()) {
            return;
        }
        hashSet.removeAll(hashSet2);
        this.f(em.a(hashSet));
    }

    protected void l() {
        int n2;
        int[] nArray;
        fp fp2 = this.y();
        nArray = fp2.ticksPlaying;
        n2 = this.world.isRemote ? 1 : 0;
        nArray[n2] = nArray[n2] + 1;
        if (nArray[n2] < fp2.length) {
            return;
        }
        if (fp2.followUp == null) {
            return;
        }
        if (!this.world.isRemote) {
            this.b(fp2.followUp);
        }
    }
    
    protected void k() {
        int n2;
        Path path;
        path = this.getNavigator().getPath();
        
        if (path == null) return;
        if (this.onGround || this.isInWater()) return;
        
        n2 = path.getCurrentPathIndex();
        int n3 = path.getCurrentPathLength();
        
        if (n3 == n2 || n3 - 1 == n2) return;
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
            this.a("walk speed", com.trolmastercard.sexmod.em$a.WALK.toString());
        } else {
            this.m.set(v, (Object)"");
            this.m.set(a, (Object)com.trolmastercard.sexmod.em$a.WALK.toString());
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
            dc.a.a(this.f(), uUID, bl, bl2);
        }
    }
    
    public static em b(UUID uUID) {
        if (uUID == null) return null;
        
        for (em em2 : em.g(uUID)) {
            if (!em2.world.isRemote) continue;
            return em2;
        }
        
        return null;
    }


    public static em a(UUID uUID) {
        if (uUID == null) return null;

        for (em em2 : em.g(uUID)) {
            if (em2.world.isRemote) continue;
            return em2;
        }
        return null;
    }


    public static ArrayList<em> g(UUID uUID) {
        ArrayList<em> arrayList = new ArrayList<em>();
        for (em em2 : em.ad()) {
            if (em2 == null) continue;
            if (!em2.f().equals(uUID)) continue;
            arrayList.add(em2);
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
                n6 *= -1;
                for (int n9 = 0; n9 < n5; ++n9){
                    blockPos2 = blockPos2.add(0, 0, n6);
                    for (int n8 = -n4; n8 <= n4; ++n8) {
                        if (this.world.getBlockState(blockPos2.add(0, n8, n6)).getBlock() == block){
                            ++n7;
                            if (n7 >= n2) {
                                if (hashSet == null || hashSet.contains(this.world.getBiome(blockPos2.add(n6, n8, 0)))) {
                                    return blockPos2.add(0, n8, n6);
                                }
                            }
                        }
                    }
                }
            
                for (int n9 = 0; n9 < n5; ++n9) {
                    blockPos2 = blockPos2.add(n6, 0, 0);
                    for (int n8 = -n4; n8 <= n4; ++n8) {
                        if (this.world.getBlockState(blockPos2.add(n6, n8, 0)).getBlock() == block) {
                            ++n7;
                            if (n7 >= n2) {
                                if (hashSet == null || hashSet.contains(this.world.getBiome(blockPos2.add(n6, n8, 0)))) {
                                    return blockPos2.add(n6, n8, 0);
                                }
                            }
                        }
                    }
                }
                ++n5;
            }
            
        }
        return null;
    }
    protected List<BlockPos> a(BlockPos blockPos)
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
                block18: for (n7 = 0; n7 < n4; ++n7) {
                    blockPos2 = blockPos2.add(0, 0, n5);
                    n6 = -n3;
                    while (true) {
                        block22: {
                            try {
                                block23: {
                                    try {
                                        try {
                                            try {
                                                if (n6 >= n3 + 1) continue block18;
                                                if (!clazz.isInstance(this.world.getBlockState(blockPos2.add(0, n6, n5)).getBlock())) break block22;
                                            }
                                            catch (ConcurrentModificationException concurrentModificationException) {
                                                throw em.c(concurrentModificationException);
                                            }
                                            if (hashSet == null) break block23;
                                        }
                                        catch (ConcurrentModificationException concurrentModificationException) {
                                            throw em.c(concurrentModificationException);
                                        }
                                        if (!hashSet.contains(this.world.getBiome(blockPos2.add(n5, n6, 0)))) break block22;
                                    }
                                    catch (ConcurrentModificationException concurrentModificationException) {
                                        throw em.c(concurrentModificationException);
                                    }
                                }
                                arrayList.add(blockPos2.add(0, n6, n5));
                            }
                            catch (ConcurrentModificationException concurrentModificationException) {
                                throw em.c(concurrentModificationException);
                            }
                        }
                        ++n6;
                    }
                }
                block20: for (n7 = 0; n7 < n4; ++n7) {
                    blockPos2 = blockPos2.add(n5, 0, 0);
                    n6 = -n3;
                    while (true) {
                        block24: {
                            try {
                                block25: {
                                    try {
                                        try {
                                            try {
                                                if (n6 >= n3 + 1) continue block20;
                                                if (!clazz.isInstance(this.world.getBlockState(blockPos2.add(n5, n6, 0)).getBlock())) break block24;
                                            }
                                            catch (ConcurrentModificationException concurrentModificationException) {
                                                throw em.c(concurrentModificationException);
                                            }
                                            if (hashSet == null) break block25;
                                        }
                                        catch (ConcurrentModificationException concurrentModificationException) {
                                            throw em.c(concurrentModificationException);
                                        }
                                        if (!hashSet.contains(this.world.getBiome(blockPos2.add(n5, n6, 0)))) break block24;
                                    }
                                    catch (ConcurrentModificationException concurrentModificationException) {
                                        throw em.c(concurrentModificationException);
                                    }
                                }
                                arrayList.add(blockPos2.add(n5, n6, 0));
                            }
                            catch (ConcurrentModificationException concurrentModificationException) {
                                throw em.c(concurrentModificationException);
                            }
                        }
                        ++n6;
                    }
                }
                ++n4;
            }
        }
        return arrayList;
    }

    public boolean J() {
        boolean bl;
        try {
            bl = !((String)this.m.get(v)).equals("");
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        return bl;
    }

    @Nullable
    public UUID O() {
        String string = (String)this.m.get(v);
        try {
            if ("".equals(string)) {
                return null;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw em.c(illegalArgumentException);
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
        try {
            if (uUID == null) {
                return null;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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
        ILoopType.EDefaultLoopTypes eDefaultLoopTypes;
        block8: {
            try {
                try {
                    try {
                        if (bl2 || !fp.b(this, animationEvent.getPartialTick())) break block8;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw em.c(concurrentModificationException);
                    }
                    if (!this.a(this.y(), string, d3.d, animationEvent)) break block8;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                return;
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
        }
        try {
            eDefaultLoopTypes = bl ? ILoopType.EDefaultLoopTypes.LOOP : ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        ILoopType.EDefaultLoopTypes eDefaultLoopTypes2 = eDefaultLoopTypes;
        animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation(string, (ILoopType)eDefaultLoopTypes2));
        animationEvent.getController().transitionLengthTicks = 0.0;
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, boolean bl, AnimationEvent animationEvent) {
        this.a(string, bl, animationEvent, false);
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, int n2, float f, AnimationEvent animationEvent, boolean bl) {
        int n3;
        Integer n4;
        String string2;
        HashMap<String, Pair<Integer, Integer>> hashMap;
        String string3;
        AnimationBuilder animationBuilder;
        AnimationController animationController;
        int n5;
        int n6;
        AnimationController animationController2;
        block16: {
            String string4;
            AnimationBuilder animationBuilder2;
            AnimationController animationController3;
            block18: {
                block17: {
                    block15: {
                        try {
                            try {
                                try {
                                    if (bl || !fp.b(this, animationEvent.getPartialTick())) break block15;
                                }
                                catch (ConcurrentModificationException concurrentModificationException) {
                                    throw em.c(concurrentModificationException);
                                }
                                if (!this.a(this.y(), string, d3.d, animationEvent)) break block15;
                            }
                            catch (ConcurrentModificationException concurrentModificationException) {
                                throw em.c(concurrentModificationException);
                            }
                            return;
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw em.c(concurrentModificationException);
                        }
                    }
                    animationController2 = animationEvent.getController();
                    Pair pair = this.A.get(string);
                    if (pair == null) {
                        pair = Pair.of((Object)0, (Object)0);
                    }
                    n6 = (Integer)pair.first();
                    n5 = (Integer)pair.second();
                    try {
                        try {
                            if (fp.b(this, animationEvent.getPartialTick())) break block16;
                            animationController3 = animationEvent.getController();
                            animationBuilder2 = new AnimationBuilder();
                            if (n6 != 0) break block17;
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw em.c(concurrentModificationException);
                        }
                        string4 = string;
                        break block18;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw em.c(concurrentModificationException);
                    }
                }
                string4 = string + n6;
            }
            animationController3.setAnimation(animationBuilder2.addAnimation(string4, (ILoopType)ILoopType.EDefaultLoopTypes.LOOP));
            animationEvent.getController().transitionLengthTicks = 0.0;
            return;
        }
        int n7 = this.a(n6, n5, n2, f);
        try {
            animationController = animationController2;
            animationBuilder = new AnimationBuilder();
            string3 = n7 == 0 ? string : string + n7;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            animationController.setAnimation(animationBuilder.addAnimation(string3, (ILoopType)ILoopType.EDefaultLoopTypes.LOOP));
            animationController2.transitionLengthTicks = 0.0;
            hashMap = this.A;
            string2 = string;
            n4 = n7;
            n3 = n7 == 0 ? n5 : n7;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        hashMap.put(string2, (Pair<Integer, Integer>)Pair.of((Object)n4, (Object)n3));
    }

    @SideOnly(value=Side.CLIENT)
    protected void a(String string, int n2, float f, AnimationEvent animationEvent) {
        this.a(string, n2, f, animationEvent, false);
    }

    /*
     * Exception decompiling
     */
    int a(int var1_1, int var2_2, int var3_3, float var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @SideOnly(value=Side.CLIENT)
    public abstract void registerControllers(AnimationData var1);

    protected void s() {
        block8: {
            block7: {
                try {
                    try {
                        if (!this.world.isRemote || !this.n()) break block7;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw em.c(concurrentModificationException);
                    }
                    this.B = null;
                    ge.b.sendToServer((IMessage)new s(this.f(), true));
                    break block8;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
            }
            try {
                if (!this.world.isRemote) {
                    s.a.a((EntityPlayerMP)this.world.getPlayerEntityByUUID(this.ae()));
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
        }
    }

    public static em c(EntityPlayer entityPlayer) {
        try {
            if (entityPlayer == null) {
                return null;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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

    public static em a(@Nonnull UUID uUID, Boolean bl) {
        try {
            for (em em2 : em.ad()) {
                boolean bl2;
                block14: {
                    try {
                        if (em2.isDead) {
                            continue;
                        }
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw em.c(concurrentModificationException);
                    }
                    try {
                        if (!uUID.equals(em2.ae())) {
                            continue;
                        }
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw em.c(concurrentModificationException);
                    }
                    if (bl == null) {
                        return em2;
                    }
                    bl2 = em2.world.isRemote;
                    try {
                        if (!bl2 || bl.booleanValue()) break block14;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw em.c(concurrentModificationException);
                    }
                    return em2;
                }
                try {
                    if (bl2 || !bl.booleanValue()) continue;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                return em2;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        return null;
    }

    @Nullable
    public static em c(@Nonnull UUID uUID) {
        boolean bl;
        try {
            bl = FMLCommonHandler.instance().getMinecraftServerInstance() == null;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        boolean bl2 = bl;
        try {
            for (em em2 : em.ad()) {
                try {
                    if (em2.isDead) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                boolean bl3 = em2.world.isRemote;
                try {
                    if (bl3 != bl2) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                if (!uUID.equals(em2.ae())) continue;
                return em2;
            }
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
        try {
            this.B = null;
            this.setNoGravity(false);
            this.b((fp)null);
            if (this.world.isRemote) {
                this.V();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
    }

    @SideOnly(value=Side.CLIENT)
    protected void V() {
        try {
            if (this.n()) {
                d3.a(true);
                Minecraft.getMinecraft().player.setInvisible(false);
                ge.b.sendToServer((IMessage)new s(this.f()));
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
    }

    @SideOnly(value=Side.CLIENT)
    public static void k(UUID uUID) {
        try {
            for (em em2 : em.ad()) {
                UUID uUID2 = em2.ae();
                try {
                    if (uUID2 == null) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                try {
                    if (!uUID2.equals(uUID)) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                fp fp2 = em2.c(em2.y());
                if (fp2 == null) {
                    return;
                }
                em2.b(fp2);
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
    }

    @SideOnly(value=Side.CLIENT)
    public static void f(UUID uUID) {
        try {
            for (em em2 : em.ad()) {
                try {
                    if (em2.isDead) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                try {
                    if (!em2.world.isRemote) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                UUID uUID2 = em2.ae();
                try {
                    if (uUID2 == null) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                try {
                    if (!uUID2.equals(uUID)) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                fp fp2 = em2.a(em2.y());
                try {
                    if (fp2 == null) {
                        continue;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                em2.b(fp2);
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
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
        try {
            if (this.ae() == null) {
                System.out.println("couldnt move camera because the player isn't set");
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.ae());
        try {
            if (this.B == null) {
                this.B = entityPlayer.getPositionVector();
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        Vec3d vec3d = this.B;
        vec3d = vec3d.add(-Math.sin((double)(this.r + 90.0f) * (Math.PI / 180)) * d, 0.0, Math.cos((double)(this.r + 90.0f) * (Math.PI / 180)) * d);
        vec3d = vec3d.add(0.0, d2, 0.0);
        vec3d = vec3d.add(-Math.sin((double)this.r * (Math.PI / 180)) * d4, 0.0, Math.cos((double)this.r * (Math.PI / 180)) * d4);
        try {
            if (this.world.isRemote) {
                ge.b.sendToServer((IMessage)new a8(entityPlayer.getPersistentID().toString(), vec3d, this.r + f, f2));
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        entityPlayer.setPositionAndRotation(vec3d.x, vec3d.y, vec3d.z, this.r + f, f2);
        entityPlayer.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
    }

    @SideOnly(value=Side.CLIENT)
    protected boolean n() {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (!this.world.isRemote) {
                        return false;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
                try {
                    try {
                        if (!entityPlayerSP.getPersistentID().equals(this.ae()) && !entityPlayerSP.getUniqueID().equals(this.ae())) break block7;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw em.c(concurrentModificationException);
                    }
                    bl = true;
                    break block8;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
            }
            bl = false;
        }
        return bl;
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
        try {
            if (!"".equals(string)) {
                return string;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        return this.c();
    }

    public abstract float i();

    @SideOnly(value=Side.CLIENT)
    public boolean t() {
        return true;
    }

    public void h(String string) {
        block6: {
            block5: {
                try {
                    if (this.world.isRemote) break block5;
                    ge.b.sendToAllAround((IMessage)new gh(String.format("<%s> %s", this.ab(), string), this.dimension, this.f()), new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 40.0));
                    break block6;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
            }
            try {
                if (this.n()) {
                    ge.b.sendToServer((IMessage)new gh(String.format("<%s> %s", this.ab(), string), this.dimension, this.f()));
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
        }
    }

    protected void b(String string, boolean bl) {
        try {
            if (!bl) {
                this.h(string);
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (!this.world.isRemote) {
                ge.b.sendToAllAround((IMessage)new gh(string, this.dimension, this.f()), new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 40.0));
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (this.n()) {
                ge.b.sendToServer((IMessage)new gh(string, this.dimension, this.f()));
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
    }

    protected void a(String string) {
        try {
            if (this.world.isRemote) {
                Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentString(String.format("<%s> %s", this.ab(), string)));
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
    }

    protected void a(UUID uUID, String string) {
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        try {
            if (entityPlayer == null) {
                System.out.println("Player with UUID " + uUID.toString() + " not found");
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (this.world.isRemote) {
                Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentString("<" + entityPlayer.getName() + "> " + string));
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
    }

    public void a(SoundEvent soundEvent, float f, float f2) {
        this.world.playSound((double)this.getPosition().getX(), (double)this.getPosition().getY(), (double)this.getPosition().getZ(), soundEvent, SoundCategory.NEUTRAL, f, f2, false);
    }

    public void a(SoundEvent soundEvent) {
        this.a(soundEvent, 1.0f, 1.0f);
    }

    public void a(SoundEvent[] soundEventArray, int ... nArray) {
        try {
            if (nArray.length == 0) {
                this.a(soundEventArray[this.getRNG().nextInt(soundEventArray.length)]);
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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
        boolean bl;
        try {
            if (entity == null) {
                return false;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (!(entity instanceof em)) {
                return false;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            bl = !(entity instanceof ei);
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        return bl;
    }

    @SideOnly(value=Side.CLIENT)
    public em E() {
        return this;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean e() {
        EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 50.0);
        try {
            if (entityPlayer == null) {
                return false;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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
        try {
            for (int i = 0; i < n2; ++i) {
                em.a(enumParticleTypes, em2);
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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
        block6: {
            block7: {
                try {
                    try {
                        try {
                            if (this.getRNG().nextInt(10000) != 0) break block6;
                            if (!this.world.isRemote) break block7;
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw em.c(concurrentModificationException);
                        }
                        if (!(Minecraft.getMinecraft().player.getPositionVector().distanceTo(this.getPositionVector()) < 10.0)) break block7;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw em.c(concurrentModificationException);
                    }
                    this.a("whopa");
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
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
        GeoBone geoBone;
        ArrayList<GeoBone> arrayList;
        GeoBone geoBone2;
        block17: {
            block16: {
                IBone iBone;
                block14: {
                    block15: {
                        try {
                            if (this.H == null) {
                                this.H = this.b();
                            }
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw em.c(concurrentModificationException);
                        }
                        iBone = this.H.getBone(string);
                        try {
                            try {
                                if (iBone != null) break block14;
                                if (cv.e.contains(string)) break block15;
                            }
                            catch (ConcurrentModificationException concurrentModificationException) {
                                throw em.c(concurrentModificationException);
                            }
                            Main.LOGGER.log(Level.WARN, String.format("The bone '%s' does not exist on %s. Bone model matrix couldn't be calculated", string, this.c()));
                            this.p.remove(string);
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw em.c(concurrentModificationException);
                        }
                    }
                    return new MatrixStack();
                }
                geoBone2 = (GeoBone)iBone;
                arrayList = new ArrayList<GeoBone>();
                geoBone = geoBone2;
                while (geoBone.parent != null) {
                    GeoBone geoBone3 = geoBone.parent;
                    arrayList.add(geoBone3);
                    geoBone = geoBone3;
                }
                Collections.reverse(arrayList);
                geoBone = new MatrixStack();
                try {
                    if (!this.Q()) break block16;
                    geoBone.rotateY((float)(-Math.toRadians(this.I().floatValue())));
                    break block17;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
            }
            try {
                if (bl) {
                    geoBone.rotateY((float)(-Math.toRadians(b6.a(this.prevRenderYawOffset, this.renderYawOffset, Minecraft.getMinecraft().getRenderPartialTicks()))));
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
        }
        for (GeoBone geoBone4 : arrayList) {
            geoBone.translate(geoBone4);
            geoBone.moveToPivot(geoBone4);
            geoBone.rotate(geoBone4);
            geoBone.scale(geoBone4);
            geoBone.moveBackFromPivot(geoBone4);
        }
        geoBone.translate(geoBone2);
        geoBone.moveToPivot(geoBone2);
        geoBone.rotate(geoBone2);
        geoBone.scale(geoBone2);
        geoBone = this.a((MatrixStack)geoBone);
        return geoBone;
    }

    protected MatrixStack a(MatrixStack matrixStack) {
        return matrixStack;
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3d b(String string) {
        Vec3d vec3d = this.x.get(string);
        try {
            if (vec3d != null) {
                return vec3d;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (!this.p.contains(string)) {
                this.p.add(string);
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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
        try {
            if (iBone == null) {
                return 0.0f;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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
        try {
            if (render == null) {
                return null;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (!(render instanceof d_)) {
                return null;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        GeoEntityRenderer geoEntityRenderer = (GeoEntityRenderer)render;
        GeoModelProvider geoModelProvider = geoEntityRenderer.getGeoModelProvider();
        try {
            if (geoModelProvider == null) {
                return null;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (!(geoModelProvider instanceof AnimatedGeoModel)) {
                return null;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        return (AnimatedGeoModel)geoModelProvider;
    }

    public AnimationProcessor<?> b() {
        return this.a().getAnimationProcessor();
    }

    public boolean h(int n2) {
        boolean bl;
        ArrayList<Integer> arrayList = this.D();
        try {
            if (arrayList.size() - 1 < n2) {
                return false;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            bl = (Integer)arrayList.get(n2) == 101;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        return bl;
    }

    public e1 g(int n2) {
        return e1.a;
    }

    public void a(List<Integer> list) {
        block5: {
            try {
                try {
                    if (this instanceof e4 || this instanceof ew) break block5;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                return;
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int n2 : list) {
            e4.c(stringBuilder, n2);
        }
        this.m.set(e4.M, (Object)stringBuilder.toString());
    }

    public String F() {
        block4: {
            try {
                try {
                    if (!(this instanceof e4) && !(this instanceof ew)) break block4;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                return (String)this.m.get(e4.M);
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
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
        block6: {
            em em2;
            try {
                em2 = Main.proxy instanceof ClientProxy ? em.b(uUID) : em.a(uUID);
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
            em em3 = em2;
            arrayList = new ArrayList<Integer>(em3.L());
            try {
                try {
                    if (!(em3 instanceof e4) && !(em3 instanceof ew)) break block6;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                arrayList.addAll(em.c((String)em3.getDataManager().get(e4.M)));
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
        }
        return arrayList;
    }

    public ArrayList<Integer> L() {
        return new ArrayList<Integer>();
    }

    public List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> d(UUID uUID) {
        try {
            if (this.d != null) {
                return this.d;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        ArrayList<Integer> arrayList = this.D();
        try {
            if (arrayList.isEmpty()) {
                this.d = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
                return this.d;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>> arrayList2 = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
        List<Integer> list = em.h(uUID);
        try {
            for (int i = 0; i < arrayList.size(); ++i) {
                arrayList2.add(new AbstractMap.SimpleEntry<gw, AbstractMap.SimpleEntry<List<String>, Integer>>(gw.GIRL_SPECIFIC, new AbstractMap.SimpleEntry<List<String>, Integer>(this.e((Integer)arrayList.get(i)), list.get(i))));
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        this.d = arrayList2;
        return arrayList2;
    }

    public void b(List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> list) {
        this.d = list;
    }

    public void a(int n2, int n3) {
        try {
            if (this.d == null) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (this.d.size() - 1 < n2) {
                return;
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        Map.Entry<gw, Map.Entry<List<String>, Integer>> entry = this.d.get(n2);
        entry.getValue().setValue(n3);
        this.d.set(n2, entry);
    }

    public void e(String string) {
        block4: {
            try {
                try {
                    if (!(this instanceof e4) && !(this instanceof ew)) break block4;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw em.c(concurrentModificationException);
                }
                this.m.set(e4.M, (Object)string);
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
        }
    }

    private List<String> e(int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            for (int i = 0; i < n2; ++i) {
                arrayList.add("");
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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
        try {
            if (hashSet == null) {
                return "";
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
        }
        try {
            if (hashSet.isEmpty()) {
                return "";
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw em.c(concurrentModificationException);
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
            try {
                if ("".equals(string2)) {
                    continue;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
            try {
                if ("cross".equals(string2)) {
                    continue;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw em.c(concurrentModificationException);
            }
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

    public static enum a {
        WALK,
        FAST_WALK,
        RUN;

    }
}
