package com.trolmastercard.sexmod;


import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.ai;
import com.trolmastercard.sexmod.by;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.dy;
import com.trolmastercard.sexmod.e1;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.ea;
import com.trolmastercard.sexmod.eh;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.g5;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.hz;
import com.trolmastercard.sexmod.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.vecmath.Vector2f;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e3
extends e4
implements ai {
    public static final by ax = by.DARK_GREEN;
    public static final Vec3i ah = new Vec3i(11, 6, 11);
    public static final Vec3d aB = new Vec3d(5.0, 1.0, 9.0);
    public static final Vec3d af = new Vec3d(3.0, -1.0, 6.0);
    public static final Vec3d ao = new Vec3d(1.0, 1.0, 5.0);
    public static final Vec3d au = new Vec3d(-6.0, -1.0, 3.0);
    public static final Vec3d aM = new Vec3d(5.0, 1.0, 1.0);
    public static final Vec3d W = new Vec3d(-3.0, -1.0, -6.0);
    public static final Vec3d U = new Vec3d(9.0, 1.0, 5.0);
    public static final Vec3d as = new Vec3d(0.0, -1.0, -4.0);
    public static final Vec3d aT = new Vec3d(1.0, -1.0, -3.0);
    public static final Vec3d ap = new Vec3d(-1.0, -1.0, -3.0);
    public static final Vec3d at = new Vec3d(6.0, -1.0, -3.0);
    public static final int aj = 39;
    public static final int ae = 15;
    public static final int aE = 8400;
    static final int aH = 45;
    static final int ad = 32000;
    static final int aw = 26;
    static final int V = 205;
    static final int aL = 100;
    static final int aA = 1200;
    static final int ak = 30;
    static final int aW = 37;
    static final float aU = 2.0f;
    static final int aI = 5;
    static final int S = 100;
    static final int aq = 20;
    static final float aG = 0.825f;
    static final Vector2f aS = new Vector2f(0.5f, 0.99f);
    static final HashSet<Item> ag = new HashSet<Item>(Arrays.asList(Items.GOLDEN_HOE, Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, Items.GOLDEN_APPLE, Items.GOLDEN_AXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_PICKAXE, Items.GOLDEN_SWORD, Items.GOLDEN_CARROT, Items.GOLDEN_HELMET, Items.GOLDEN_BOOTS, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS, Items.GOLD_INGOT, Items.GOLD_NUGGET, Item.getItemFromBlock((Block)Blocks.GOLD_BLOCK), Item.getItemFromBlock((Block)Blocks.GOLD_ORE)));
    public static final DataParameter<String> Q = EntityDataManager.createKey(e3.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(122);
    public static final DataParameter<String> aK = EntityDataManager.createKey(e3.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(123);
    public static final DataParameter<ItemStack> a0 = EntityDataManager.createKey(e3.class, (DataSerializer)DataSerializers.ITEM_STACK).getSerializer().createKey(124);
    public static final DataParameter<Boolean> aC = EntityDataManager.createKey(e3.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(125);
    public static final DataParameter<Boolean> aV = EntityDataManager.createKey(e3.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(126);
    public boolean aX = false;
    public float ac = 0.0f;
    public long av = -1L;
    public Vec3d al = Vec3d.ZERO;
    List<UUID> T = new ArrayList<UUID>();
    int aO = 31520;
    int aQ = -1;
    public int aR = -1;
    boolean aZ = false;
    BlockPos R = null;
    int Y = 0;
    int aa = 0;
    int aJ = 0;
    int an = -1;
    int am = 0;
    long ai = 0L;
    List<e3> ab = new ArrayList<e3>();
    int aY = -1;
    int az = -1;
    fp aN = null;
    public float ar = 1.0f;
    int Z = -1;
    boolean aD = true;
    boolean aF = true;
    boolean X = false;
    String aP = "";
    boolean ay = false;

    public e3(World world) {
        super(world);
        this.setSize(e3.aS.x, e3.aS.y);
    }

    public e3(World world, @Nonnull String string, int n) {
        this(world);
        this.m.set(aK, (Object)string);
        this.m.set(M, (Object)this.a(new StringBuilder(), n));
    }

    public e3(World world, boolean bl, float f, Vec3d vec3d) {
        this(world);
        if (!bl) {
            return;
        }
        this.m.set(M, (Object)this.b(new StringBuilder()));
        this.ac = f;
        this.al = vec3d;
        this.aX = true;
        this.c(vec3d);
        this.b(f);
        this.b(fp.SIT);
        this.a(true);
        this.setPosition(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    public void g() {
        super.g();
        this.a((UUID)null);
        this.noClip = false;
        this.setNoGravity(false);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        eh eh2 = eh.values()[this.getRNG().nextInt(eh.values().length)];
        this.m.register(K, (Object)new BlockPos(eh2.a()));
        this.m.register(N, (Object)ax.name());
        this.m.register(Q, (Object)"");
        this.m.register(aK, (Object)"");
        this.m.register(a0, (Object)ItemStack.EMPTY);
        this.m.register(aC, (Object)false);
        this.m.register(aV, (Object)false);
    }

    @Override
    protected void a() {
        dy.c();
    }

    public void setDead() {
        super.setDead();
        this.a((UUID)null);
        if (this.world.isRemote) {
            return;
        }
        ItemStack itemStack = (ItemStack)this.m.get(a0);
        if (itemStack == ItemStack.EMPTY) {
            return;
        }
        EntityItem entityItem = new EntityItem(this.world, this.posX, this.posY, this.posZ, itemStack);
        this.world.spawnEntity((Entity)entityItem);
    }

    @Override
    public void a(String string, UUID uUID) {
        block1: {
            if ("take ur stuff back".equals(string)) {
                this.b(fp.START_THROWING);
            }
            if (!"use her".equals(string)) break block1;
            this.c(uUID);
        }
    }

    public void c(UUID uUID) {
        this.aY = 0;
        fh.b();
        d3.a(false);
        this.e(uUID);
    }

    public void b(UUID uUID) {
        this.az = 0;
        fh.b();
        d3.a(false);
        this.e(uUID);
    }

    @Override
    public String c() {
        return "Goblin";
    }

    public float getEyeHeight() {
        return 0.75f;
    }

    @Override
    public float i() {
        return 0.1f;
    }

    @Override
    public void a(UUID uUID) {
        if (uUID == null) {
            this.m.set(Q, (Object)"");
            return;
        }
        this.m.set(Q, (Object)uUID.toString());
    }

    @Override
    @Nullable
    public UUID e() {
        String string = (String)this.m.get(Q);
        if ("".equals(string)) {
            return null;
        }
        try {
            return UUID.fromString((String)this.m.get(Q));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public int c() {
        return this.aQ;
    }

    @Override
    public void b(int n) {
        this.aQ = n;
    }

    protected String b(StringBuilder stringBuilder) {
        e3.a(stringBuilder, 3);
        e3.a(stringBuilder, 2);
        e3.a(stringBuilder, 2);
        e3.c(stringBuilder, 7);
        e3.c(stringBuilder, 7);
        e3.a(stringBuilder, 5);
        e3.a(stringBuilder, g5.values().length - 1);
        e3.a(stringBuilder, by.values().length - 1);
        e3.a(stringBuilder, eh.values().length - 1);
        e3.c(stringBuilder, 1);
        return stringBuilder.toString();
    }

    @Override
    protected String a(StringBuilder stringBuilder) {
        e3.a(stringBuilder, 3);
        e3.a(stringBuilder, 2);
        e3.a(stringBuilder, 2);
        e3.a(stringBuilder, 8);
        e3.a(stringBuilder, 8);
        e3.a(stringBuilder, 5);
        e3.a(stringBuilder, g5.values().length - 1);
        e3.a(stringBuilder, by.values().length - 1);
        e3.a(stringBuilder, eh.values().length - 1);
        e3.c(stringBuilder, 0);
        return stringBuilder.toString();
    }

    @Override
    public ArrayList<Integer> D() {
        return new ArrayList<Integer>(this){
            final /* synthetic */ e3 this$0;
            {
                this.this$0 = e32;
                this.add(4);
                this.add(3);
                this.add(3);
                this.add(16);
                this.add(16);
                this.add(6);
                this.add(g5.values().length);
                this.add(by.values().length);
                this.add(eh.values().length);
            }
        };
    }

    @Override
    public List<Integer> u() {
        return Collections.singletonList(2);
    }

    @Override
    public e1 g(int n) {
        switch (n) {
            case 0: {
                return new e1(40, 130);
            }
            case 1: {
                return new e1(60, 130);
            }
            case 2: {
                return new e1(80, 130);
            }
            case 3: {
                return new e1(100, 130);
            }
            case 4: {
                return new e1(120, 130);
            }
            case 5: {
                return new e1(140, 130);
            }
            case 6: {
                return new e1(160, 130);
            }
            case 7: {
                return new e1(180, 130);
            }
            case 8: {
                return new e1(200, 0);
            }
            case 9: {
                return new e1(200, 130);
            }
        }
        return e1.a;
    }

    @Override
    public void a(List<Integer> list) {
        block1: {
            StringBuilder stringBuilder = new StringBuilder();
            for (int n : list) {
                e3.c(stringBuilder, n);
            }
            e3.c(stringBuilder, Integer.parseInt(e3.a(this)[9]));
            this.m.set(M, (Object)stringBuilder.toString());
            if (!(Main.proxy instanceof ClientProxy)) break block1;
            dy.c();
        }
    }

    void i() {
        if (this.d == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : this.d) {
            int n = (Integer)((Map.Entry)entry.getValue()).getValue();
            e3.c(stringBuilder, n);
        }
        e3.c(stringBuilder, Integer.parseInt(e3.a(this)[9]));
        this.m.set(M, (Object)stringBuilder.toString());
        dy.c();
    }

    protected String a(StringBuilder stringBuilder, int n) {
        e3.a(stringBuilder, 3);
        e3.a(stringBuilder, 2);
        e3.a(stringBuilder, 2);
        e3.a(stringBuilder, 7);
        e3.a(stringBuilder, 7);
        e3.a(stringBuilder, 5);
        e3.a(stringBuilder, g5.values().length - 1);
        e3.c(stringBuilder, n);
        e3.a(stringBuilder, eh.values().length - 1);
        e3.c(stringBuilder, 0);
        return stringBuilder.toString();
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nBTTagCompound) {
        super.writeEntityToNBT(nBTTagCompound);
        nBTTagCompound.setString("bodyColor", (String)this.m.get(N));
        nBTTagCompound.setInteger("eyeColorX", ((BlockPos)this.m.get(K)).getX());
        nBTTagCompound.setInteger("eyeColorY", ((BlockPos)this.m.get(K)).getY());
        nBTTagCompound.setInteger("eyeColorZ", ((BlockPos)this.m.get(K)).getZ());
        nBTTagCompound.setString("model", (String)this.m.get(M));
        nBTTagCompound.setString("girlID", (String)this.m.get(u));
        nBTTagCompound.setString("queen", (String)this.m.get(aK));
        nBTTagCompound.setBoolean("isQueen", this.aX);
        nBTTagCompound.setBoolean("isTamed", ((Boolean)this.m.get(aC)).booleanValue());
        nBTTagCompound.setInteger("robTicks", this.aO);
        if (!this.aX) {
            return;
        }
        nBTTagCompound.setBoolean("preggo", ((Boolean)this.m.get(aV)).booleanValue());
        nBTTagCompound.setFloat("throneRot", this.ac);
        nBTTagCompound.setDouble("thronePosX", this.al.x);
        nBTTagCompound.setDouble("thronePosY", this.al.y);
        nBTTagCompound.setDouble("thronePosZ", this.al.z);
        nBTTagCompound.setLong("impregnationTick", this.av);
        for (int i = 0; i < this.T.size(); ++i) {
            nBTTagCompound.setString("guard" + i, this.T.get(i).toString());
        }
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nBTTagCompound) {
        super.readEntityFromNBT(nBTTagCompound);
        this.aX = nBTTagCompound.getBoolean("isQueen");
        this.m.set(M, (Object)nBTTagCompound.getString("model"));
        this.m.set(N, (Object)nBTTagCompound.getString("bodyColor"));
        String[] stringArray = e3.a(this);
        if (Integer.parseInt(stringArray[3]) > 7 || Integer.parseInt(stringArray[4]) > 7) {
            this.m.set(M, (Object)this.a(new StringBuilder(), this.k()));
            Main.LOGGER.log(Level.INFO, "updated an old Goblin");
        }
        this.m.set(K, (Object)new BlockPos(nBTTagCompound.getInteger("eyeColorX"), nBTTagCompound.getInteger("eyeColorY"), nBTTagCompound.getInteger("eyeColorZ")));
        this.m.set(u, (Object)nBTTagCompound.getString("girlID"));
        this.m.set(aK, (Object)nBTTagCompound.getString("queen"));
        this.m.set(aC, (Object)nBTTagCompound.getBoolean("isTamed"));
        this.aO = nBTTagCompound.getInteger("robTicks");
        if (!this.aX) {
            return;
        }
        this.ac = nBTTagCompound.getFloat("throneRot");
        this.al = new Vec3d(nBTTagCompound.getDouble("thronePosX"), nBTTagCompound.getDouble("thronePosY"), nBTTagCompound.getDouble("thronePosZ"));
        int n = 0;
        while (!"".equals(nBTTagCompound.getString("guard" + n))) {
            this.T.add(UUID.fromString(nBTTagCompound.getString("guard" + n)));
            ++n;
        }
        this.m.set(aV, (Object)nBTTagCompound.getBoolean("preggo"));
        this.av = nBTTagCompound.getLong("impregnationTick");
    }

    protected boolean processInteract(EntityPlayer entityPlayer, EnumHand enumHand) {
        if (this.world.isRemote) {
            return true;
        }
        if (this.aX) {
            return true;
        }
        if (this.y() == fp.RUN) {
            if ((double)this.getDistance((Entity)entityPlayer) > 3.5) {
                entityPlayer.sendStatusMessage((ITextComponent)new TextComponentString("get a bit closer..."), true);
            } else {
                this.c(entityPlayer.getPositionVector());
                this.b(entityPlayer.rotationYaw);
                this.b(fp.CATCH);
                this.m.set(h, (Object)"bj");
                this.a(entityPlayer.getPersistentID());
                this.e(entityPlayer.getPersistentID());
                this.getNavigator().clearPath();
                this.motionX = 0.0;
                this.motionY = 0.0;
                this.motionZ = 0.0;
            }
            return true;
        }
        if (e3.d(entityPlayer.getPersistentID())) {
            entityPlayer.sendStatusMessage((ITextComponent)new TextComponentString("you are already carrying a Goblin"), true);
        } else {
            this.a(entityPlayer.getPersistentID());
            this.b(fp.PICK_UP);
            this.aQ = 45;
            this.a(false);
            this.m.set(aC, (Object)true);
            this.getNavigator().clearPath();
        }
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean d(UUID var0) {
        if (var0 == null) {
            return false;
        }
        try lbl-1000:
        // 3 sources

        {
            for (em var2_3 : em.ad()) {
                if (!(var2_3 instanceof ai)) {
                    continue;
                }
                ** GOTO lbl-1000
            }
            return false;
        }
        catch (ConcurrentModificationException var1_2) {
            // empty catch block
            return false;
        }
lbl-1000:
        // 1 sources

        {
            if (var2_3.world.isRemote || var2_3.isDead || !var0.equals(var3_4 = ((ai)var2_3).e())) ** GOTO lbl-1000
            return true;
        }
    }

    @Override
    protected void initEntityAI() {
        this.o = new df((EntityLiving)this, EntityPlayer.class, 2.0f, 1.0f);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(3, (EntityAIBase)new hz((EntityLiving)this));
        this.tasks.addTask(5, (EntityAIBase)this.o);
    }

    @Override
    public void updateAITasks() {
        super.updateAITasks();
        this.f();
        e3.a(this);
        this.m();
        this.B();
        this.J();
        this.E();
        this.t();
        this.w();
        this.b();
        this.d();
        this.h();
        this.o();
        this.u();
        this.n();
    }

    public boolean canBeCollidedWith() {
        fp fp2 = this.y();
        if (fp2 == fp.THROWN) {
            return false;
        }
        if (fp2 == fp.RUN) {
            return super.canBeCollidedWith();
        }
        if (fp2 == fp.AWAIT_PICK_UP) {
            return super.canBeCollidedWith();
        }
        if (this.e() != null) {
            return false;
        }
        if (fp2 != fp.NULL) {
            return false;
        }
        return super.canBeCollidedWith();
    }

    void b(EntityPlayer entityPlayer) {
        ei ei2 = ei.d(entityPlayer.getPersistentID());
        Vec3d vec3d = new Vec3d(entityPlayer.posX, entityPlayer.posY + (double)(ei2 == null ? entityPlayer.eyeHeight : ei2.getEyeHeight()), entityPlayer.posZ);
        Vec3d vec3d2 = new Vec3d(this.posX, this.posY + (double)this.getEyeHeight(), this.posZ);
        double d = vec3d2.distanceTo(vec3d);
        double d2 = vec3d.y - vec3d2.y;
        this.rotationPitch = (float)(-(Math.sin(d2 / d) * 57.29577951308232));
    }

    void n() {
        if (!((Boolean)this.m.get(aC)).booleanValue()) {
            return;
        }
        if (this.ae() != null) {
            return;
        }
        if (this.y() != fp.NULL) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 15.0);
        if (entityPlayer != null && entityPlayer.getDistance((Entity)this) < 2.0f) {
            this.b(entityPlayer);
            this.getNavigator().clearPath();
            return;
        }
        if (this.R == null || this.getDistance(this.R.getX(), this.R.getY(), this.R.getZ()) > this.l() || this.Y > 100) {
            int n = (this.getRNG().nextBoolean() ? 1 : -1) * this.getRNG().nextInt(5);
            int n2 = (this.getRNG().nextBoolean() ? 1 : -1) * this.getRNG().nextInt(5);
            int n3 = cj.getTerrainY(this.world, this.getPosition().getX() + n, this.getPosition().getZ() + n2);
            this.R = new BlockPos(this.getPosition().getX() + n, n3, this.getPosition().getZ() + n2);
            this.Y = 0;
        }
        if (Math.sqrt(this.R.distanceSq((Vec3i)this.getPosition())) > 2.0) {
            this.getNavigator().tryMoveToXYZ((double)this.R.getX(), (double)this.R.getY(), (double)this.R.getZ(), (double)0.3f);
            this.k();
        } else {
            ++this.Y;
        }
    }

    double l() {
        return Math.sqrt(800.0);
    }

    void u() {
        if (this.y() != fp.STAND_UP) {
            return;
        }
        if (++this.aa < 37) {
            return;
        }
        this.aa = 0;
        this.b(fp.NULL);
    }

    @Override
    public void a(int n) {
        this.aJ = n;
    }

    @Override
    public int d() {
        return this.aJ;
    }

    void o() {
        if (this.y() != fp.THROWN) {
            return;
        }
        if (!this.onGround) {
            return;
        }
        int n = this.d() + 1;
        this.a(n);
        if (n < 30) {
            return;
        }
        this.a(0);
        this.b(fp.STAND_UP);
    }

    void h() {
        block2: {
            if (!this.aX) {
                return;
            }
            if (!((Boolean)this.m.get(aV)).booleanValue()) {
                return;
            }
            if (this.av + 8400L >= this.world.getTotalWorldTime()) break block2;
            this.m.set(aV, (Object)false);
        }
    }

    void d() {
        if (!this.aX) {
            return;
        }
        if (this.ab.isEmpty()) {
            return;
        }
        boolean bl = false;
        for (e3 e32 : this.ab) {
            if (!((Boolean)e32.getDataManager().get(aC)).booleanValue()) continue;
            bl = true;
        }
        if (!bl) {
            return;
        }
        this.h("Farewell my knight. You are welcome once I am breedable again.");
        for (e3 e32 : this.ab) {
            if (((Boolean)e32.getDataManager().get(aC)).booleanValue()) continue;
            e32.b(fp.VANISH);
        }
        this.ab.clear();
        this.e((UUID)null);
    }

    void b() {
        if (!this.aX) {
            return;
        }
        if (this.Z == -1) {
            return;
        }
        if (++this.Z < 100) {
            return;
        }
        this.Z = -1;
        UUID uUID = this.ae();
        if (uUID == null) {
            this.r();
            return;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            this.r();
            return;
        }
        this.e((UUID)null);
        for (e3 e32 : this.ab) {
            e32.e((UUID)null);
        }
        List<e3> list = this.I();
        float f = this.ac + 180.0f;
        Vec3d vec3d = this.al.add(e3.b(aT, f));
        Vec3d vec3d2 = this.al.add(e3.b(ap, f));
        Vec3d vec3d3 = this.al.add(e3.b(as, f));
        e3 e33 = (e3)list.get(0);
        e3 e34 = (e3)list.get(1);
        e33.c(vec3d);
        e34.c(vec3d2);
        e33.b(0.0f);
        e34.b(0.0f);
        e33.a(true);
        e34.a(true);
        e33.b(fp.AWAIT_PICK_UP);
        e34.b(fp.AWAIT_PICK_UP);
        e33.setNoGravity(false);
        e34.setNoGravity(false);
        entityPlayer.setNoGravity(false);
        e33.noClip = false;
        e34.noClip = false;
        entityPlayer.noClip = false;
        entityPlayer.rotationYaw = f;
        entityPlayer.rotationPitch = 30.0f;
        entityPlayer.setPositionAndUpdate(vec3d3.x, vec3d3.y, vec3d3.z);
        ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
        this.h("Thanks to you, my clan is soon going to get a few new members! In return I will bear of one of my guards to serve as your personal Onahole. Choose wisely~");
    }

    void w() {
        if (!this.aX) {
            return;
        }
        if (this.an == -1) {
            return;
        }
        if (++this.an < 205) {
            return;
        }
        this.an = -1;
        UUID uUID = this.ae();
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = e3.b(new Vec3d(0.0, 0.15625 - (double)entityPlayer.getEyeHeight(), -0.8859375), this.ac - 180.0f);
        vec3d = vec3d.add(this.o());
        entityPlayer.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
    }

    public static Vec3d b(Vec3d vec3d, float f) {
        return e3.a(vec3d, 0.0f, f);
    }

    public static Vec3d a(Vec3d vec3d, float f, float f2) {
        Vec3d vec3d2 = new Vec3d(vec3d.x, vec3d.y * Math.cos((double)f * (Math.PI / 180)) - vec3d.z * Math.sin((double)f * (Math.PI / 180)), vec3d.y * Math.sin((double)f * (Math.PI / 180)) + vec3d.z * Math.cos((double)f * (Math.PI / 180)));
        Vec3d vec3d3 = new Vec3d(-Math.sin((double)(f2 + 90.0f) * (Math.PI / 180)) * vec3d2.x - Math.sin((double)f2 * (Math.PI / 180)) * vec3d2.z, vec3d2.y, Math.cos((double)(f2 + 90.0f) * (Math.PI / 180)) * vec3d2.x + Math.cos((double)f2 * (Math.PI / 180)) * vec3d2.z);
        return vec3d3;
    }

    void t() {
        e3 e32;
        Vec3d vec3d;
        if (!this.aX) {
            return;
        }
        if (this.y() != fp.JUMP_0) {
            return;
        }
        if (++this.am < 26) {
            return;
        }
        this.am = 0;
        switch ((int)this.ac) {
            case 90: {
                vec3d = this.al.add(au);
                break;
            }
            case 180: {
                vec3d = this.al.add(W);
                break;
            }
            case -90: {
                vec3d = this.al.add(at);
                break;
            }
            default: {
                vec3d = this.al.add(af);
            }
        }
        UUID uUID = this.ae();
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            return;
        }
        this.c(vec3d);
        this.b(this.ac);
        this.b(fp.BREEDING_INTRO_0);
        this.noClip = true;
        this.setNoGravity(true);
        Vec3d vec3d2 = e3.b(new Vec3d(0.0, 0.44375 - (double)entityPlayer.eyeHeight, -0.7875), this.ac - 180.0f);
        entityPlayer.noClip = true;
        entityPlayer.setNoGravity(true);
        entityPlayer.setPositionAndUpdate(vec3d2.x + vec3d.x, vec3d2.y + vec3d.y, vec3d2.z + vec3d.z);
        List<e3> list = this.I();
        if (list.size() >= 1) {
            e32 = list.get(0);
            e32.c(vec3d);
            e32.b(this.ac);
            e32.b(fp.BREEDING_INTRO_1);
            e32.noClip = true;
            e32.setNoGravity(true);
        }
        if (list.size() >= 2) {
            e32 = list.get(1);
            e32.c(vec3d);
            e32.b(this.ac);
            e32.b(fp.BREEDING_INTRO_2);
            e32.noClip = true;
            e32.setNoGravity(true);
        }
        this.an = 0;
    }

    AxisAlignedBB a(Vec3d vec3d, Vec3d vec3d2) {
        return new AxisAlignedBB(vec3d.x, vec3d.y, vec3d.z, vec3d2.x, vec3d2.y, vec3d2.z);
    }

    void E() {
        if (!this.aX) {
            return;
        }
        if (this.ae() != null) {
            return;
        }
        Vec3d vec3d = null;
        switch ((int)this.ac) {
            case 0: {
                vec3d = aM;
                break;
            }
            case 90: {
                vec3d = U;
                break;
            }
            case 180: {
                vec3d = aB;
                break;
            }
            case -90: {
                vec3d = ao;
            }
        }
        if (vec3d == null) {
            return;
        }
        Vec3d vec3d2 = this.al.subtract(0.5, 0.0, 0.5).subtract(vec3d);
        AxisAlignedBB axisAlignedBB = this.a(vec3d2, vec3d2.add((double)ah.getX(), (double)ah.getY(), (double)ah.getZ()));
        List list = this.world.getEntitiesWithinAABB(EntityPlayer.class, axisAlignedBB);
        if (list.isEmpty()) {
            return;
        }
        EntityPlayer entityPlayer = (EntityPlayer)list.get(0);
        if (!entityPlayer.onGround) {
            return;
        }
        if (((Boolean)this.m.get(aV)).booleanValue()) {
            if (this.ai + 1200L < this.world.getTotalWorldTime()) {
                entityPlayer.sendStatusMessage((ITextComponent)new TextComponentString("The Queen is still pregnant - so no breeding for you uwu"), true);
                this.ai = this.world.getTotalWorldTime();
            }
            return;
        }
        UUID uUID = entityPlayer.getPersistentID();
        Vec3d vec3d3 = entityPlayer.getPositionVector();
        float f = entityPlayer.rotationYaw + 180.0f;
        ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        this.e(uUID);
        this.b(fp.JUMP_0);
        this.c(vec3d3);
        this.b(f);
        this.a(true);
        List<e3> list2 = this.I();
        if (list2.size() > 0) {
            e3 e32 = list2.get(0);
            e32.e(uUID);
            e32.b(fp.JUMP_1);
            e32.c(vec3d3);
            e32.b(f);
            e32.a(true);
            if (list2.size() > 1) {
                e3 e33 = list2.get(1);
                e33.e(uUID);
                e33.b(fp.JUMP_2);
                e33.c(vec3d3);
                e33.b(f);
                e33.a(true);
            }
        }
    }

    List<e3> I() {
        e3 e322;
        if (this.ab.size() > 1) {
            return this.ab;
        }
        for (e3 e322 : this.ab) {
            this.world.removeEntity((Entity)e322);
        }
        this.ab.clear();
        e3 e33 = new e3(this.world, this.f().toString(), this.k());
        e33.setPosition(this.posX, this.posY, this.posZ);
        this.world.spawnEntity((Entity)e33);
        this.ab.add(e33);
        e322 = new e3(this.world, this.f().toString(), this.k());
        e322.setPosition(this.posX, this.posY, this.posZ);
        this.world.spawnEntity((Entity)e322);
        this.ab.add(e322);
        return this.ab;
    }

    void f() {
        if (this.aZ) {
            return;
        }
        this.noClip = false;
        this.setNoGravity(false);
        if (!(this.aX || ((Boolean)this.m.get(aC)).booleanValue() || ((String)this.m.get(aK)).equals("") || this.y() != fp.NULL)) {
            this.world.removeEntity((Entity)this);
        }
        this.aZ = true;
    }

    void e() {
        block3: {
            e3 e32 = this;
            int n2 = e32.a();
            if (n2 == -1) {
                return;
            }
            e32.c(++n2);
            if (n2 == 15) {
                Vec3d vec3d = e3.b(this);
                float f = e3.d(this);
                float f2 = e3.c(this);
                this.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
                Vec3d vec3d2 = e3.a(new Vec3d(0.0, 0.0, 1.5), f, f2);
                this.motionX = vec3d2.x;
                this.motionY = vec3d2.y;
                this.motionZ = vec3d2.z;
                if (!this.world.isRemote) {
                    this.b(f2);
                }
            }
            this.noClip = false;
            this.setNoGravity(false);
            if (n2 != 39) break block3;
            this.c(-1);
            this.b(fp.THROWN);
            this.e((UUID)null);
            this.a((UUID)null);
        }
    }

    public static Vec3d b(em em2) {
        ai ai2 = (ai)((Object)em2);
        UUID uUID = ai2.e();
        if (uUID == null) {
            return em2.getPositionVector();
        }
        EntityPlayer entityPlayer = em2.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            return em2.getPositionVector();
        }
        return entityPlayer.getPositionVector().add(0.0, (double)entityPlayer.getEyeHeight(), 0.0).add(e3.a(new Vec3d((double)0.4f, 0.0, 0.0), e3.d(em2), e3.c(em2)));
    }

    public static float c(em em2) {
        ai ai2 = (ai)((Object)em2);
        UUID uUID = ai2.e();
        if (uUID == null) {
            return 0.0f;
        }
        EntityPlayer entityPlayer = em2.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            return 0.0f;
        }
        return entityPlayer.rotationYawHead;
    }

    public static float d(em em2) {
        ai ai2 = (ai)((Object)em2);
        UUID uUID = ai2.e();
        if (uUID == null) {
            return 0.0f;
        }
        EntityPlayer entityPlayer = em2.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            return 0.0f;
        }
        return entityPlayer.rotationPitch;
    }

    void J() {
        boolean bl;
        if (!this.onGround) {
            return;
        }
        if (this.y() != fp.RUN) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 100.0);
        if (entityPlayer == null) {
            return;
        }
        double d = 20.0;
        do {
            if (d <= 0.0) {
                return;
            }
            Vec3d vec3d = this.getPositionVector().subtract(entityPlayer.getPositionVector());
            Vec3d vec3d2 = new Vec3d(Math.abs(vec3d.x), Math.abs(vec3d.y), Math.abs(vec3d.z));
            double d2 = vec3d2.x / (vec3d2.x + vec3d2.z);
            double d4 = vec3d2.z / (vec3d2.x + vec3d2.z);
            Vec3d vec3d3 = this.getPositionVector().add(new Vec3d((double)(vec3d.x > 0.0 ? 1 : -1) * d2 * d, 0.0, (double)(vec3d.z > 0.0 ? 1 : -1) * d4 * d));
            PathNavigate pathNavigate = this.getNavigator();
            pathNavigate.clearPath();
            bl = pathNavigate.tryMoveToXYZ(vec3d3.x, vec3d3.y, vec3d3.z, (double)0.825f);
            d -= 1.0;
        } while (!bl);
    }

    protected void jump() {
        if (this.y() == fp.RUN && !this.j()) {
            return;
        }
        super.jump();
    }

    boolean j() {
        PathNavigate pathNavigate = this.getNavigator();
        Path path = pathNavigate.getPath();
        if (path == null) {
            return true;
        }
        int n2 = path.getCurrentPathIndex();
        int n3 = path.getCurrentPathLength();
        if (n3 == n2 || n3 - 1 == n2) {
            return true;
        }
        PathPoint pathPoint = path.getPathPointFromIndex(n2);
        PathPoint pathPoint2 = path.getPathPointFromIndex(n2 + 1);
        return pathPoint2.y - pathPoint.y == 1;
    }

    void B() {
        if (!this.aX) {
            return;
        }
        if (((Boolean)this.m.get(aC)).booleanValue()) {
            return;
        }
        if (((Boolean)this.m.get(aV)).booleanValue()) {
            return;
        }
        if (this.y() != fp.SIT) {
            return;
        }
        if (++this.aO < 32000) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 3000.0);
        if (entityPlayer == null) {
            return;
        }
        if (!entityPlayer.onGround) {
            return;
        }
        if (entityPlayer.isAirBorne) {
            return;
        }
        Integer n2 = this.c(entityPlayer);
        if (n2 == null) {
            return;
        }
        Vec3d vec3d = entityPlayer.getPositionVector();
        Vec3d vec3d2 = this.getPositionVector();
        Vec3d vec3d3 = vec3d.subtract(vec3d2);
        double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
        if (d > 100.0) {
            return;
        }
        ItemStack itemStack = entityPlayer.inventory.getStackInSlot(n2.intValue()).copy();
        e3 e32 = new e3(this.world, this.f().toString(), this.k());
        Vec3d vec3d4 = e3.b(new Vec3d(0.0, 0.0, (double)-0.2f), entityPlayer.rotationYawHead);
        e32.setPosition(entityPlayer.posX + vec3d4.x, entityPlayer.posY, entityPlayer.posZ + vec3d4.z);
        e32.b(fp.RUN);
        this.world.spawnEntity((Entity)e32);
        e32.m.set(a0, (Object)itemStack);
        entityPlayer.sendMessage((ITextComponent)new TextComponentString(String.format("<%s> I got your %s hehe~", e32.c(), itemStack.getDisplayName())));
        entityPlayer.inventory.removeStackFromSlot(n2.intValue());
        this.aO = 0;
    }

    int k() {
        return Integer.parseInt(e3.a(this)[7]);
    }

    @Nullable
    Integer c(EntityPlayer entityPlayer) {
        NonNullList nonNullList = entityPlayer.inventory.mainInventory;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < nonNullList.size(); ++i) {
            ItemStack itemStack = (ItemStack)nonNullList.get(i);
            if (itemStack == ItemStack.EMPTY || !ag.contains(itemStack.getItem())) continue;
            arrayList.add(i);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Integer)arrayList.get(this.getRNG().nextInt(arrayList.size()));
    }

    void m() {
        if (!this.aX) {
            return;
        }
        if (this.ae() != null) {
            return;
        }
        this.c(this.al);
        this.b(this.ac);
        this.a(true);
        this.setNoGravity(true);
        this.b(fp.SIT);
    }

    @Override
    public void onUpdate() {
        block2: {
            this.i();
            e3.e(this);
            this.e();
            if (this.e() != null) {
                this.inPortal = false;
            }
            super.onUpdate();
            this.y();
            this.H();
            this.F();
            if (!this.world.isRemote) break block2;
            this.v();
            this.A();
            if (this.e() != null) {
                this.noClip = true;
            }
        }
    }

    @Override
    public fp b() {
        return this.aN;
    }

    @Override
    public void a(fp fp2) {
        this.aN = fp2;
    }

    @Override
    public void c(int n2) {
        this.aR = n2;
    }

    @Override
    public int a() {
        return this.aR;
    }

    public static void e(em em2) {
        fp fp2 = em2.y();
        ai ai2 = (ai)((Object)em2);
        if (ai2.b() != fp.START_THROWING && fp2 == fp.START_THROWING) {
            ai2.c(0);
        }
        ai2.a(fp2);
    }

    public void setFire(int n2) {
        block0: {
            if (this.e() != null) break block0;
            super.setFire(n2);
        }
    }

    void F() {
        if (this.y() != fp.VANISH) {
            return;
        }
        this.ar -= 0.05f;
        if (this.ar > 0.0f) {
            return;
        }
        this.world.removeEntity((Entity)this);
    }

    void H() {
        if (((Boolean)this.m.get(aC)).booleanValue()) {
            return;
        }
        if (this.y() != fp.THROWN) {
            return;
        }
        if (!this.onGround && !this.isInWater()) {
            return;
        }
        this.ar = (float)((double)this.ar - 0.05);
        if (this.ar > 0.0f) {
            return;
        }
        if (this.world.isRemote) {
            return;
        }
        this.b(fp.NULL);
        this.e((UUID)null);
        this.a((UUID)null);
        this.world.removeEntity((Entity)this);
    }

    @SideOnly(value=Side.CLIENT)
    void v() {
        if (this.aY == -1) {
            return;
        }
        if (++this.aY != 15) {
            return;
        }
        this.aY = -1;
        this.b(fp.PAIZURI_START);
        Minecraft.getMinecraft().player.closeScreen();
    }

    @SideOnly(value=Side.CLIENT)
    void A() {
        if (this.az == -1) {
            return;
        }
        if (++this.az != 15) {
            return;
        }
        this.az = -1;
        this.b(fp.NELSON_INTRO);
        Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.player.closeScreen();
        minecraft.gameSettings.thirdPersonView = 2;
    }

    @Override
    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp3 == fp.PAIZURI_CUM && (fp2 == fp.PAIZURI_SLOW || fp2 == fp.PAIZURI_FAST)) {
            return;
        }
        if (fp3 == fp.NELSON_CUM && (fp2 == fp.NELSON_SLOW || fp2 == fp.NELSON_FAST)) {
            return;
        }
        if (fp3 == fp.BREEDING_CUM_0 && (fp2 == fp.BREEDING_SLOW_0 || fp2 == fp.BREEDING_FAST_0)) {
            return;
        }
        if (fp2 == fp.START_THROWING && !this.world.isRemote) {
            this.e(this.e());
            this.L();
        }
        if (fp2 == fp.PAIZURI_START && !this.world.isRemote) {
            this.z();
        }
        if (fp2 == fp.NELSON_INTRO && !this.world.isRemote) {
            this.q();
        }
        if (this.y() == fp.PAIZURI_CUM && fp2 == fp.NULL && !this.world.isRemote) {
            this.D();
        }
        if (fp2 == fp.BREEDING_CUM_0) {
            this.m.set(aV, (Object)true);
            this.av = this.world.getTotalWorldTime();
            this.ai = this.world.getTotalWorldTime();
        }
        if (fp2 == fp.BREEDING_CUM_0) {
            this.Z = 0;
        }
        if (fp2 == fp.NELSON_CUM) {
            this.m.set(aV, (Object)true);
        }
        if (fp3 == fp.NELSON_CUM && fp2 != fp.NELSON_CUM) {
            this.m.set(aV, (Object)false);
        }
        super.b(fp2);
    }

    void D() {
        block1: {
            EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.ae());
            if (entityPlayer != null) {
                s.a$a.a((EntityPlayerMP)entityPlayer);
            }
            this.e((UUID)null);
            this.a(false);
            this.noClip = false;
            this.setNoGravity(false);
            this.m.set(a0, (Object)ItemStack.EMPTY);
            if (((Boolean)this.m.get(aC)).booleanValue()) break block1;
            this.setPositionAndUpdate(this.l.x, this.l.y, this.l.z);
            this.world.removeEntity((Entity)this);
        }
    }

    void q() {
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.ae());
        if (entityPlayer == null) {
            return;
        }
        this.a((UUID)null);
        this.c(entityPlayer.getPositionVector());
        this.b(entityPlayer.rotationYaw);
        this.a(true);
        this.noClip = true;
        this.setNoGravity(true);
        entityPlayer.setNoGravity(true);
        entityPlayer.noClip = true;
        this.e(entityPlayer.getPersistentID());
    }

    void z() {
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.ae());
        if (entityPlayer == null) {
            return;
        }
        this.a((UUID)null);
        this.c(entityPlayer.getPositionVector());
        this.b(entityPlayer.rotationYaw + 180.0f);
        this.a(true);
        this.noClip = true;
        this.setNoGravity(true);
        entityPlayer.setNoGravity(true);
        entityPlayer.noClip = true;
        this.e(entityPlayer.getPersistentID());
        entityPlayer.setPositionAndUpdate(entityPlayer.posX, entityPlayer.posY - 0.5, entityPlayer.posZ);
        entityPlayer.rotationPitch = 70.0f;
        entityPlayer.prevRotationPitch = 70.0f;
    }

    void L() {
        ItemStack itemStack = (ItemStack)this.m.get(a0);
        if (itemStack == ItemStack.EMPTY) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.ae());
        if (entityPlayer == null) {
            return;
        }
        entityPlayer.inventory.addItemStackToInventory(itemStack.copy());
        this.m.set(a0, (Object)ItemStack.EMPTY);
    }

    public static void a(em em2) {
        if (em2.y() != fp.PICK_UP) {
            return;
        }
        ai ai2 = (ai)((Object)em2);
        UUID uUID = ai2.e();
        if (uUID == null) {
            ai2.b(-1);
            em2.b(fp.NULL);
            ai2.a((UUID)null);
            return;
        }
        EntityPlayer entityPlayer = em2.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            ai2.b(-1);
            em2.b(fp.NULL);
            ai2.a((UUID)null);
            return;
        }
        em2.setPosition(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        if (em2.getPositionVector().distanceTo(entityPlayer.getPositionVector()) > 10.0) {
            ai2.b(-1);
            em2.b(fp.NULL);
            ai2.a((UUID)null);
            return;
        }
        int n2 = ai2.c() - 1;
        ai2.b(n2);
        if (n2 != 0) {
            return;
        }
        em2.b(fp.SHOULDER_IDLE);
        em2.noClip = true;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean t() {
        if (this.y() != fp.NULL) {
            return false;
        }
        if (this.e() != null) {
            return false;
        }
        if (!((Boolean)this.m.get(aC)).booleanValue() && !Minecraft.getMinecraft().player.canEntityBeSeen((Entity)this)) {
            return false;
        }
        return this.e() == null;
    }

    void y() {
        if (this.y() != fp.SHOULDER_IDLE) {
            return;
        }
        UUID uUID = this.e();
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        if (entityPlayer == null) {
            return;
        }
        this.setPosition(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        this.noClip = true;
        this.setNoGravity(true);
    }

    @Override
    protected fp c(fp fp2) {
        switch (fp2) {
            case PAIZURI_IDLE: 
            case PAIZURI_SLOW: {
                return fp.PAIZURI_FAST;
            }
            case BREEDING_SLOW_0: {
                return fp.BREEDING_FAST_0;
            }
            case BREEDING_SLOW_2: {
                return fp.BREEDING_FAST_2;
            }
            case NELSON_SLOW: {
                return fp.NELSON_FAST;
            }
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        switch (fp2) {
            case PAIZURI_SLOW: 
            case PAIZURI_FAST: 
            case PAIZURI_FAST_CONTINUES: {
                return fp.PAIZURI_CUM;
            }
            case BREEDING_1: {
                return fp.BREEDING_CUM_1;
            }
            case BREEDING_SLOW_2: 
            case BREEDING_FAST_2: {
                return fp.BREEDING_CUM_2;
            }
            case NELSON_SLOW: 
            case NELSON_FAST: {
                return fp.NELSON_CUM;
            }
            case BREEDING_SLOW_0: 
            case BREEDING_FAST_0: {
                for (e3 e32 : this.ab) {
                    e32.a(fp2);
                }
                return fp.BREEDING_CUM_0;
            }
        }
        return null;
    }

    public boolean C() {
        Block block = this.world.getBlockState(this.getPosition().add(0, 1, 0)).getBlock();
        return !block.isPassable((IBlockAccess)this.world, this.getPosition().add(0, 1, 0));
    }

    public void fall(float f, float f2) {
        fp fp2 = this.y();
        if (fp2 == fp.THROWN || fp2 == fp.START_THROWING) {
            return;
        }
        super.fall(f, f2);
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.world instanceof gj) {
            return PlayState.STOP;
        }
        if (this.C == null) {
            this.p();
        }
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL) {
                    this.a("animation.goblin.null", true, animationEvent);
                    break;
                }
                this.a("animation.goblin.blink", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.goblin.null", true, animationEvent);
                    break;
                }
                double d = Math.abs(this.prevPosX - this.posX) + Math.abs(this.prevPosZ - this.posZ);
                if (!((Boolean)this.m.get(G)).booleanValue() && d > 0.0) {
                    if (this.onGround && Math.abs(Math.abs(this.prevPosY) - Math.abs(this.posY)) < (double)0.1f) {
                        if (d > (double)0.2f) {
                            this.a("animation.goblin.walk", true, animationEvent);
                        } else {
                            this.a("animation.goblin.walk", true, animationEvent);
                        }
                        this.rotationYaw = this.rotationYawHead;
                        break;
                    }
                    this.a("animation.goblin.fly", true, animationEvent);
                    break;
                }
                this.a("animation.goblin.idle", true, animationEvent);
                break;
            }
            case "action": {
                Minecraft minecraft = Minecraft.getMinecraft();
                String string = minecraft.player.getPersistentID().equals(this.e()) && minecraft.gameSettings.thirdPersonView == 0 ? "1" : "3";
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.goblin.null", true, animationEvent);
                        break block5;
                    }
                    case SHOULDER_IDLE: {
                        this.a("animation.goblin.shoulder_idle", true, animationEvent);
                        break block5;
                    }
                    case PICK_UP: {
                        this.a(String.format("animation.goblin.pick_up_%sperson", string), true, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.goblin.sit", true, animationEvent);
                        break block5;
                    }
                    case RUN: {
                        if (this.onGround) {
                            this.a("animation.goblin.running", true, animationEvent);
                            break block5;
                        }
                        this.a("animation.goblin.fly", true, animationEvent);
                        break block5;
                    }
                    case CATCH: {
                        this.a(String.format("animation.goblin.catch_%sperson", string), true, animationEvent);
                        break block5;
                    }
                    case CATCH_BJ: {
                        this.a(String.format("animation.goblin.catch_%spersonBj", string), true, animationEvent);
                        break block5;
                    }
                    case CATCH_BJ_IDLE: {
                        this.a(String.format("animation.goblin.catch_%spersonBj_idle", string), true, animationEvent);
                        break block5;
                    }
                    case START_THROWING: {
                        this.a(String.format("animation.goblin.throw_%sperson", string), true, animationEvent);
                        break block5;
                    }
                    case THROWN: {
                        this.a("animation.goblin.thrown", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_START: {
                        this.a("animation.goblin.paizuri_start", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_SLOW: {
                        this.a("animation.goblin.paizuri_slow" + this.aP, true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_FAST: {
                        this.a("animation.goblin.paizuri_fast", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_FAST_CONTINUES: {
                        this.a("animation.goblin.paizuri_fast_countinues", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_IDLE: {
                        this.a("animation.goblin.paizuri_idle", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_CUM: {
                        this.a("animation.goblin.paizuri_cum", true, animationEvent);
                        break block5;
                    }
                    case JUMP_0: {
                        this.a("animation.goblin.jump_1", true, animationEvent);
                        break block5;
                    }
                    case JUMP_1: {
                        this.a("animation.goblin.jump_2", true, animationEvent);
                        break block5;
                    }
                    case JUMP_2: {
                        this.a("animation.goblin.jump_3", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_INTRO_0: {
                        this.a("animation.goblin.breeding_intro_1", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_INTRO_1: {
                        this.a("animation.goblin.breeding_intro_2", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_INTRO_2: {
                        this.a("animation.goblin.breeding_intro_3", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_SLOW_0: {
                        this.a("animation.goblin.breeding_slow_1" + (this.aD ? "l" : "r"), true, animationEvent);
                        break block5;
                    }
                    case BREEDING_SLOW_2: {
                        this.a("animation.goblin.breeding_slow_3", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_FAST_0: {
                        this.a("animation.goblin.breeding_fast_1" + (this.ay ? "c" : "s"), true, animationEvent);
                        break block5;
                    }
                    case BREEDING_FAST_2: {
                        this.a("animation.goblin.breeding_fast_3", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_CUM_0: {
                        this.a("animation.goblin.breeding_cum_1", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_CUM_1: {
                        this.a("animation.goblin.breeding_cum_2", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_CUM_2: {
                        this.a("animation.goblin.breeding_cum_3", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_1: {
                        this.a("animation.goblin.breeding_2", true, animationEvent);
                        break block5;
                    }
                    case VANISH: 
                    case AWAIT_PICK_UP: {
                        this.a("animation.goblin.await_pick_up", true, animationEvent);
                        break block5;
                    }
                    case STAND_UP: {
                        this.a("animation.goblin.stand_up", false, animationEvent);
                        break block5;
                    }
                    case NELSON_INTRO: {
                        this.a("animation.goblin.nelson_intro", true, animationEvent);
                        break block5;
                    }
                    case NELSON_SLOW: {
                        this.a("animation.goblin.nelson_slow" + (this.aF ? "" : "2"), true, animationEvent);
                        break block5;
                    }
                    case NELSON_FAST: {
                        this.a("animation.goblin.nelson_fast" + (this.X ? "c" : "s"), true, animationEvent);
                        break block5;
                    }
                    case NELSON_CUM: {
                        this.a("animation.goblin.nelson_cum", true, animationEvent);
                    }
                }
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void registerControllers(AnimationData animationData) {
        if (this.C == null) {
            this.p();
        }
        AnimationController.ISoundListener iSoundListener = soundKeyframeEvent -> {
            switch (soundKeyframeEvent.sound) {
                case "catchEh": {
                    this.a("ehh..");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "catchAkward": {
                    this.a("awkward..");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "catchWell": {
                    this.a("well...");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "catchRather": {
                    this.a("would you rather have this stupid... thing?");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "catchMe": {
                    this.a("...or use me?~");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "catchDone": {
                    if (!"bj".equals(this.m.get(h))) break;
                    this.b(fp.CATCH_BJ);
                    break;
                }
                case "catchBjDone": {
                    this.b(fp.CATCH_BJ_IDLE);
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
                    e3.a((EntityPlayer)entityPlayerSP, this, new String[]{"use her", "take ur stuff back"}, null, false);
                    break;
                }
                case "paizuriChoice": {
                    this.a("good choice!~");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "paizuriBoth": {
                    this.a("...for both of us!");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "paizruiUse": {
                    this.a("now use me like a fuck toy!~");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "paizuriSwitch": {
                    if (this.getRNG().nextBoolean()) break;
                    this.aP = "".equals(this.aP) ? "2" : "";
                    break;
                }
                case "touch": {
                    this.a(com.trolmastercard.sexmod.c.MISC_TOUCH, 3.0f);
                    break;
                }
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    if (!this.n()) break;
                    ds.a(0.04f);
                    break;
                }
                case "paizuri_startDone": {
                    this.b(fp.PAIZURI_IDLE);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "paizuriFastDone": {
                    this.b(fp.PAIZURI_SLOW);
                    break;
                }
                case "paizuriFastReady": {
                    if (!this.n() || !d3.d) break;
                    this.b(fp.PAIZURI_FAST_CONTINUES);
                    break;
                }
                case "paizuriFastContinuesReady": {
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "smallPound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, 0.25f);
                    if (!this.n()) break;
                    ds.a(0.02f);
                    break;
                }
                case "paizruiCam": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
                    entityPlayerSP.rotationPitch = 70.0f;
                    entityPlayerSP.prevRotationPitch = 70.0f;
                    break;
                }
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "paizuriCumDone": {
                    this.b(fp.NULL);
                    break;
                }
                case "cumSound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 3.0f);
                    break;
                }
                case "jumpCam": {
                    if (!this.n()) break;
                    Minecraft minecraft = Minecraft.getMinecraft();
                    minecraft.player.rotationYaw = this.I().floatValue() + 170.0f;
                    minecraft.player.rotationPitch = -20.0f;
                    minecraft.player.rotationYawHead = minecraft.player.rotationYaw;
                    minecraft.gameSettings.thirdPersonView = 2;
                    break;
                }
                case "breedingHmm": {
                    if (this.n()) {
                        Minecraft minecraft = Minecraft.getMinecraft();
                        minecraft.player.rotationYaw = this.I().floatValue() + 180.0f;
                        minecraft.player.rotationPitch = -15.0f;
                        minecraft.player.rotationYawHead = minecraft.player.rotationYaw;
                        minecraft.gameSettings.thirdPersonView = 0;
                    }
                    this.a("hmm...");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "breedingFound": {
                    this.a("guess we found a worthy breeding partner!");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "breedingEnough": {
                    this.a("Eh.. go pin him down, before he runs off!");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "breedingCam2": {
                    if (this.n()) {
                        Minecraft minecraft = Minecraft.getMinecraft();
                        minecraft.gameSettings.thirdPersonView = 2;
                        minecraft.player.rotationYaw = this.I().floatValue() - 120.0f;
                        minecraft.player.rotationPitch = -30.0f;
                    }
                }
                case "breedingIntroDone": {
                    this.b(fp.BREEDING_SLOW_0);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "breeding_slow1Done": {
                    if (this.getRNG().nextBoolean()) {
                        boolean bl = this.aD = !this.aD;
                    }
                    if (!this.n() || !d3.d) break;
                    this.b(fp.BREEDING_FAST_0);
                    this.ay = false;
                    break;
                }
                case "breeding_fast1Done": {
                    this.b(fp.BREEDING_SLOW_0);
                    if (!this.n()) break;
                    this.ay = false;
                    break;
                }
                case "breeding_fast1Ready": {
                    if (!this.n() || !d3.d) break;
                    this.ay = true;
                    this.N();
                    this.C.tickOffset = 0.0;
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 2.0f);
                    break;
                }
                case "breeding_intro_3Done": {
                    this.b(fp.BREEDING_SLOW_2);
                    break;
                }
                case "breeding_3_wiggle": {
                    if (!this.getRNG().nextBoolean()) break;
                    this.C.tickOffset = 0.0;
                    break;
                }
                case "breeding_fast_3Done": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.BREEDING_SLOW_2);
                    break;
                }
                case "breeding_intro_2Done": {
                    this.b(fp.BREEDING_1);
                    break;
                }
                case "breeding_cumCam": {
                    if (!this.n()) break;
                    Minecraft minecraft = Minecraft.getMinecraft();
                    minecraft.gameSettings.thirdPersonView = 0;
                    minecraft.player.rotationYaw = this.I().floatValue() + 180.0f;
                    minecraft.player.rotationPitch = -15.0f;
                    minecraft.player.rotationYawHead = minecraft.player.rotationYaw;
                    minecraft.gameSettings.thirdPersonView = 0;
                    break;
                }
                case "neslon_introDone": {
                    this.b(fp.NELSON_SLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "nelson_slowDone": {
                    if (!this.getRNG().nextBoolean()) break;
                    this.aF = !this.aF;
                    break;
                }
                case "neslon_fastSwitch": {
                    if (!this.n()) {
                        this.X = true;
                        return;
                    }
                    if (!d3.d) break;
                    this.X = true;
                    break;
                }
                case "neslon_fastBackSwitch": {
                    if (!this.n()) {
                        this.C.tickOffset = 0.0;
                        break;
                    }
                    if (!d3.d) break;
                    this.C.tickOffset = 0.0;
                    break;
                }
                case "nelsonFastDone": {
                    this.X = false;
                    if (!this.n()) break;
                    this.b(fp.NELSON_SLOW);
                    break;
                }
                case "nelson_cumDone": {
                    if (!this.n()) break;
                    this.r();
                    this.b(fp.NULL);
                    break;
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        this.E.transitionLengthTicks = 10.0;
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    static /* synthetic */ EntityDataManager access$000(e3 e32) {
        return e32.m;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
    
    static class e3.a.a {
        static final /* synthetic */ int[] a;

        static {
            a = new int[fp.values().length];
            try {
                e3.a.a.a[fp.PAIZURI_IDLE.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.PAIZURI_SLOW.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_SLOW_0.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_SLOW_2.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.NELSON_SLOW.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.PAIZURI_FAST.ordinal()] = 6;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.PAIZURI_FAST_CONTINUES.ordinal()] = 7;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_1.ordinal()] = 8;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_FAST_2.ordinal()] = 9;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.NELSON_FAST.ordinal()] = 10;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_FAST_0.ordinal()] = 11;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.NULL.ordinal()] = 12;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.SHOULDER_IDLE.ordinal()] = 13;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.PICK_UP.ordinal()] = 14;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.SIT.ordinal()] = 15;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.RUN.ordinal()] = 16;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.CATCH.ordinal()] = 17;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.CATCH_BJ.ordinal()] = 18;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.CATCH_BJ_IDLE.ordinal()] = 19;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.START_THROWING.ordinal()] = 20;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.THROWN.ordinal()] = 21;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.PAIZURI_START.ordinal()] = 22;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.PAIZURI_CUM.ordinal()] = 23;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.JUMP_0.ordinal()] = 24;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.JUMP_1.ordinal()] = 25;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.JUMP_2.ordinal()] = 26;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_INTRO_0.ordinal()] = 27;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_INTRO_1.ordinal()] = 28;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_INTRO_2.ordinal()] = 29;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_CUM_0.ordinal()] = 30;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_CUM_1.ordinal()] = 31;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.BREEDING_CUM_2.ordinal()] = 32;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.VANISH.ordinal()] = 33;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.AWAIT_PICK_UP.ordinal()] = 34;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.STAND_UP.ordinal()] = 35;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.NELSON_INTRO.ordinal()] = 36;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                e3.a.a.a[fp.NELSON_CUM.ordinal()] = 37;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
        }
    
    }
    
    class e3.b.b extends ArrayList<Integer> {
        e3.b.b() {
            this.add(4);
            this.add(3);
            this.add(3);
            this.add(16);
            this.add(16);
            this.add(6);
            this.add(g5.values().length);
            this.add(by.values().length);
            this.add(eh.values().length);
        }
    }
    
    public static class e3.c.c {
        static Minecraft a = null;
        
        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(TickEvent.ClientTickEvent tickEvent) {
            if (tickEvent.phase != Phase.START) {
                ArrayList list = new ArrayList();
                Iterator iter;
                try {
                    iter = em.ad().iterator();
                    while (iter.hasNext()) {
                        em em2 = (em)iter.next();
                        if (em2.world.isRemote && em2 instanceof e3) {
                            e3 e32 = (em)em2;
                            UUID uid = e32.e();
                            if (uid != null) {
                                EntityPlayer ePlayer = e32.world.getPlayerEntityByUUID(uid);
                                if (ePlayer != null && ePlayer.dimension != e32.dimension) {
                                    list.add(e32);
                                }
                            }
                        }
                    }
                } catch (ConcurrentModificationException e) {
                    // empty catch
                }
                listIter listIter = list.iterator();
                
                while (listIter.hasNext()) {
                    e3 e33 = (e3)listIter.next();
                    e33.a((UUID)null);
                    e33.e((UUID)null);
                    e33.setDead();
                }
            }
        }
        
        @SubscribeEvent
        public void a(PlayerChangedDimensionEvent dEvent) {
            EntityPlayer ePlayer = dEvent.player;
            UUID uid = ePlayer.getPersistentID();
            int n1 = dEvent.toDim;
            World world = ePlayer.world;
            e3 e32 = null;
            try {
                Iterator iter = em.ad().iterator();
                while(iter.hasNext()) {
                    em em2 = (em)iter.next();
                    if (!em2.world.isRemote && em2 instanceof e3) {
                        e3 e33 = (e3)em2;
                        if (uid.equals(e33.e())) {
                            String str = e33.C();
                            String str2 = e33.F();
                            e32 = e33;
                            e33.a((UUID)null);
                            e33.e((UUID)null);
                            e33.b(fp.NULL);
                            e3 e34 = new e3(world);
                            e34.dimension = n1;
                            e34.forceSpawn = true;
                            e34.f(str);
                            e34.e(str2);
                            e3.access$000(e34).set(e3.ac, true);
                            world.spawnEntity(e34);
                            e34.setPositionAndUpdate(ePlayer.posX, ePlayer.posY, ePlayer.posZ);
                            e34.a(uid);
                            e34.b(fp.SHOULDER_IDLE);
                            break;
                        }
                        
                    }
                }
            } catch (ConcurrentModificationException e) {
                // empty catch 
            }
            if (e32 != null) {
                world.removeEntity(e32);
                em.ad().remove(e32);
            }
        }
        
        @SubscribeEvent
        public void a(LivingAttackEvent livingAttackEvent) {
            block2: {
                if (livingAttackEvent.getSource() == DamageSource.OUT_OF_WORLD) {
                    return;
                }
                EntityLivingBase entityLivingBase = livingAttackEvent.getEntityLiving();
                if (!(entityLivingBase instanceof e3)) {
                    return;
                }
                e3 e32 = (e3)entityLivingBase;
                if (e32.e() == null) break block2;
                livingAttackEvent.setCanceled(true);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SubscribeEvent
        @SideOnly(value=Side.CLIENT)
        public void a(InputEvent.KeyInputEvent keyInputEvent) {
            if (a == null) {
                a = Minecraft.getMinecraft();
            }
            if (c$c.a.currentScreen instanceof ea) {
                return;
            }
            if (!ClientProxy.keyBindings[0].isPressed()) {
                return;
            }
            em em2 = null;
            UUID uUID = Minecraft.getMinecraft().player.getPersistentID();
            try {
                for (em em3 : em.ad()) {
                    ai ai2;
                    if (!em3.world.isRemote || !(em3 instanceof ai) || !uUID.equals((ai2 = (ai)((Object)em3)).e())) continue;
                    em2 = em3;
                    break;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                // empty catch block
            }
            if (em2 == null) {
                return;
            }
            if (em2.y() != fp.SHOULDER_IDLE) {
                return;
            }
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new ea(em2));
        }
        private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
            return concurrentModificationException;
        }
    }
}
