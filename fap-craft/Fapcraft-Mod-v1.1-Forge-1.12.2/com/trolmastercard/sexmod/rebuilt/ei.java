package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.g4;
import com.trolmastercard.sexmod.gd;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.s;
import com.trolmastercard.sexmod.w;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.vecmath.Vector2f;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ei
extends e2 {
    public static final String aa = "sexmod:CustomModel";
    public static final String ae = "sexmod:GirlSpecific";
    public static final float ac = 0.0f;
    public static final int am = 100;
    public static final int Y = 65;
    // was public static boolean ag = true;
    public static boolean flightAllowed = true;
    public Vector2f ao = new Vector2f(0.0f, 0.0f);
    public boolean ad = false;
    public boolean aj = false;
    public boolean ak = false;
    public boolean af = true;
    public boolean ah = false;
    protected static final DataParameter<Optional<UUID>> ai = EntityDataManager.createKey(em.class, (DataSerializer)DataSerializers.OPTIONAL_UNIQUE_ID).getSerializer().createKey(118);
    public static Hashtable<UUID, ei> al = new Hashtable();
    public static List<ei> Z = new ArrayList<ei>();
    int an = -1;
    public boolean ab = true;

    protected ei(World world) {
        super(world);
        this.setSize(0.01f, 0.01f);
        Z.add(this);
    }

    protected ei(World world, UUID uUID) {
        this(world);
        this.m.set(ai, (Object)Optional.of((Object)uUID));
    }

    @Nullable
    public static ei d(UUID uUID) {
        return al.get(uUID);
    }

    @Nullable
    public static ei g(@Nonnull EntityPlayer entityPlayer) {
        return al.get(entityPlayer.getPersistentID());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static ei a(UUID uUID) {
        try {
            for (em em2 : ei.ad()) {
                ei ei2;
                if (em2.world.isRemote || !(em2 instanceof ei) || !uUID.equals((ei2 = (ei)em2).m())) continue;
                return ei2;
            }
            return null;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        return null;
    }

    @Override
    public NetworkRegistry.TargetPoint P() {
        return new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY - 0.0, this.posZ, 50.0);
    }

    public void a(int n2, fp fp2) {
        ge.b.sendToAllTracking((IMessage)new gd(this.m(), n2, fp2), this.P());
    }

    public EntityPlayer c(EntityPlayer entityPlayer) {
        return entityPlayer;
    }

    public boolean z() {
        return true;
    }

    public Vec3d c(Vec3d vec3d, float f) {
        return vec3d;
    }

    public boolean canBeCollidedWith() {
        return false;
    }

    public boolean v() {
        return true;
    }

    public boolean q() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public void H() {
    }

    public boolean p() {
        return true;
    }

    public boolean a(String string) {
        return false;
    }

    public boolean A() {
        return true;
    }

    @Override
    public String c() {
        EntityPlayer entityPlayer;
        if (((Optional)this.m.get(ai)).isPresent() && (entityPlayer = this.world.getPlayerEntityByUUID((UUID)((Optional)this.m.get(ai)).get())) != null) {
            return entityPlayer.getName();
        }
        return "anonymous horny girl";
    }

    public void u() {
    }

    public abstract void b(String var1, UUID var2);

    public abstract at a(int var1);

    public abstract String c(int var1);

    public Vec3i b(int n2) {
        return new Vec3i(255, 255, 255);
    }

    @Override
    public boolean canBePushed() {
        return false;
    }

    public boolean isNotColliding() {
        return true;
    }

    public boolean F() {
        return false;
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.m.register(ai, (Object)Optional.absent());
    }

    @SideOnly(value=Side.CLIENT)
    public static void i() {
        ei ei2 = ei.d(Minecraft.getMinecraft().player.getPersistentID());
        if (ei2 == null) {
            return;
        }
        ei2.r();
    }

    @Override
    public void r() {
        block0: {
            this.B = null;
            this.setNoGravity(false);
            if (!this.world.isRemote) break block0;
            this.V();
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    protected void V() {
        if (this.n() || this.f()) {
            d3.a(true);
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            entityPlayerSP.setInvisible(false);
            entityPlayerSP.setNoGravity(false);
            entityPlayerSP.noClip = false;
            this.m.set(G, (Object)false);
            ge.b.sendToServer((IMessage)new s(this.f()));
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean H() {
        Minecraft minecraft = Minecraft.getMinecraft();
        return !this.f() || minecraft.gameSettings.thirdPersonView != 0;
    }

    protected void c(boolean bl) {
        if (!ag) {
            return;
        }
        if (this.m() == null) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.m());
        if (entityPlayer == null) {
            return;
        }
        entityPlayer.capabilities.allowFlying = bl;
        if (!bl) {
            entityPlayer.capabilities.isFlying = false;
        }
        entityPlayer.sendPlayerAbilities();
    }

    public static boolean e(UUID uUID) {
        ei.C();
        for (Map.Entry<UUID, ei> entry : al.entrySet()) {
            UUID uUID2 = entry.getKey();
            if (!uUID.equals(uUID2)) continue;
            return true;
        }
        return false;
    }

    public static boolean e(EntityPlayer entityPlayer) {
        if (entityPlayer == null) {
            return false;
        }
        return ei.e(entityPlayer.getPersistentID());
    }

    public AxisAlignedBB getEntityBoundingBox() {
        return super.getEntityBoundingBox().offset(0.0, 0.5, 0.0);
    }

    protected EntityPlayer j() {
        List list = this.world.playerEntities;
        EntityPlayer entityPlayer = null;
        for (EntityPlayer entityPlayer2 : list) {
            if (entityPlayer2.getPersistentID().equals(((Optional)this.m.get(ai)).get())) continue;
            if (entityPlayer == null) {
                entityPlayer = entityPlayer2;
                continue;
            }
            double d = entityPlayer.getDistanceSq(this.w().x, this.w().y, this.w().z);
            double d2 = entityPlayer2.getDistanceSq(this.w().x, this.w().y, this.w().z);
            if (!(d2 < d)) continue;
            entityPlayer = entityPlayer2;
        }
        return entityPlayer;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean e() {
        EntityPlayer entityPlayer = this.j();
        if (entityPlayer == null) {
            return false;
        }
        return entityPlayer.getPersistentID().equals(Minecraft.getMinecraft().player.getPersistentID());
    }

    public Vec3d w() {
        return new Vec3d(this.posX, this.posY - 0.0, this.posZ);
    }

    protected void b(UUID uUID) {
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP)this.world.getPlayerEntityByUUID(uUID);
        EntityPlayerMP entityPlayerMP2 = (EntityPlayerMP)this.world.getPlayerEntityByUUID((UUID)((Optional)this.m.get(ai)).get());
        ge.b.sendTo((IMessage)new gz(false), entityPlayerMP);
        ge.b.sendTo((IMessage)new gz(false), entityPlayerMP2);
        this.e(uUID);
        this.rotationYaw = 0.0f;
        this.rotationYawHead = 0.0f;
        entityPlayerMP.rotationYaw = 180.0f;
        entityPlayerMP.rotationYawHead = 180.0f;
        entityPlayerMP.setNoGravity(true);
        entityPlayerMP.noClip = true;
        Vec3d vec3d = this.getPositionVector();
        entityPlayerMP.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z + 1.0);
        entityPlayerMP.capabilities.isFlying = true;
        entityPlayerMP2.capabilities.isFlying = true;
        this.j(uUID);
        this.m.set(G, (Object)true);
        this.c(vec3d);
        this.b(0.0f);
    }

    protected void playStepSound(BlockPos blockPos, Block block) {
        super.playStepSound(blockPos, block);
    }

    public AxisAlignedBB a(EntityPlayer entityPlayer) {
        return entityPlayer.getEntityBoundingBox();
    }

    @Override
    public void onUpdate() {
        block1: {
            this.noClip = true;
            this.setNoGravity(true);
            super.onUpdate();
            this.D();
            if (!this.world.isRemote) {
                return;
            }
            if (!this.f()) break block1;
            com.trolmastercard.sexmod.w.a.a();
        }
    }

    @SideOnly(value=Side.CLIENT)
    void h() {
        Minecraft.getMinecraft().player.eyeHeight = this.getEyeHeight();
    }

    @SideOnly(value=Side.CLIENT)
    public boolean f() {
        if (!((Optional)this.m.get(ai)).isPresent()) {
            return false;
        }
        return ((UUID)((Optional)this.m.get(ai)).get()).equals(Minecraft.getMinecraft().player.getPersistentID());
    }

    public boolean E() {
        return false;
    }

    void d(EntityPlayer entityPlayer) {
        NBTTagCompound nBTTagCompound = entityPlayer.getEntityData();
        String string = nBTTagCompound.getString(aa + (Object)((Object)fy.a((Entity)this)));
        this.f(string);
    }

    @Override
    public void updateAITasks() {
        block5: {
            Object object;
            ei.C();
            this.l();
            this.G();
            UUID uUID = this.m();
            if (uUID == null) {
                return;
            }
            EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
            if (entityPlayer == null) {
                this.setPositionAndUpdate(this.posX, 0.0, this.posZ);
                return;
            }
            this.d(entityPlayer);
            if (this.Q()) {
                object = this.o();
                this.setPositionAndUpdate(object.x, object.y, object.z);
            } else {
                this.setPositionAndUpdate(entityPlayer.posX, entityPlayer.posY + 0.0, entityPlayer.posZ);
            }
            object = this.y();
            if (object == fp.NULL && entityPlayer.isSwingInProgress) {
                this.b(fp.ATTACK);
            }
            if (object != fp.ATTACK || entityPlayer.isSwingInProgress) break block5;
            this.b(fp.NULL);
        }
    }

    void D() {
        if (this.an == -1) {
            return;
        }
        ++this.an;
        if (!this.world.isRemote && this.an == 65) {
            this.f(this.ah() == 0 ? 1 : 0);
        }
        if (this.an < 100) {
            return;
        }
        if (this.y() != fp.STRIP) {
            return;
        }
        if (this.world.isRemote) {
            this.n();
            return;
        }
        this.b(fp.NULL);
    }

    @SideOnly(value=Side.CLIENT)
    void n() {
        if (this.f()) {
            Minecraft minecraft = Minecraft.getMinecraft();
            minecraft.gameSettings.thirdPersonView = 0;
            minecraft.entityRenderer.loadEntityShader(minecraft.getRenderViewEntity());
            d3.a(true);
        }
    }

    public boolean o() {
        return this.Q();
    }

    public Vec3d b(Vec3d vec3d, float f) {
        return vec3d;
    }

    public boolean a(fp fp2, EntityPlayer entityPlayer) {
        return false;
    }

    public boolean l() {
        return true;
    }

    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public void b(fp fp2) {
        if (!this.world.isRemote && fp2 == fp.NULL && this.Q()) {
            System.out.println("prevented a potential animation break");
            return;
        }
        if (fp2 == fp.STRIP) {
            this.an = this.world.isRemote ? 5 : 0;
        }
        super.b(fp2);
    }

    void f(EntityPlayer entityPlayer) {
        this.m.set(X, (Object)ItemStack.EMPTY);
        this.m.set(T, (Object)ItemStack.EMPTY);
        this.m.set(U, (Object)ItemStack.EMPTY);
        this.m.set(W, (Object)ItemStack.EMPTY);
        for (ItemStack itemStack : entityPlayer.getArmorInventoryList()) {
            if (itemStack.getItem() instanceof ItemElytra) {
                this.m.set(T, (Object)itemStack);
                continue;
            }
            if (!(itemStack.getItem() instanceof ItemArmor)) continue;
            ItemArmor itemArmor = (ItemArmor)itemStack.getItem();
            switch (itemArmor.getEquipmentSlot()) {
                case HEAD: {
                    this.m.set(X, (Object)itemStack);
                    break;
                }
                case CHEST: {
                    this.m.set(T, (Object)itemStack);
                    break;
                }
                case LEGS: {
                    this.m.set(U, (Object)itemStack);
                    break;
                }
                case FEET: {
                    this.m.set(W, (Object)itemStack);
                }
            }
        }
    }

    public UUID m() {
        if (((Optional)this.m.get(ai)).isPresent()) {
            return (UUID)((Optional)this.m.get(ai)).get();
        }
        return null;
    }

    @Nullable
    public EntityPlayer k() {
        UUID uUID = this.m();
        if (uUID == null) {
            return null;
        }
        return this.world.getPlayerEntityByUUID(uUID);
    }

    public void a(Optional<UUID> optional) {
        this.m.set(ai, optional);
    }

    public void y() {
    }

    public void B() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void C() {
        ArrayList<ei> arrayList = new ArrayList<ei>();
        try {
            for (ei ei2 : Z) {
                if (ei2.m() == null) continue;
                al.put(ei2.m(), ei2);
                arrayList.add(ei2);
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        Iterator<ei> iterator = arrayList.iterator();
        while (true) {
            ei ei2;
            if (!iterator.hasNext()) {
                ei.t();
                return;
            }
            ei2 = iterator.next();
            Z.remove((Object)ei2);
        }
    }

    static void t() {
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        for (Map.Entry<UUID, ei> object : al.entrySet()) {
            if (!object.getValue().isDead) continue;
            arrayList.add(object.getKey());
        }
        for (UUID uUID : arrayList) {
            al.remove(uUID);
        }
    }

    protected boolean c(UUID uUID) {
        if (uUID == null) {
            return false;
        }
        ei ei2 = ei.d(uUID);
        return ei2 != null;
    }

    @Override
    public void a(String string, UUID uUID) {
        if (this.a(string)) {
            return;
        }
        if (!((Optional)this.m.get(ai)).isPresent()) {
            return;
        }
        ge.b.sendToServer((IMessage)new g4(string, uUID, (UUID)((Optional)this.m.get(ai)).get(), this.ab));
        this.ab = true;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nBTTagCompound) {
        super.writeEntityToNBT(nBTTagCompound);
        nBTTagCompound.setString("owner", ((UUID)((Optional)this.m.get(ai)).get()).toString());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nBTTagCompound) {
        super.readEntityFromNBT(nBTTagCompound);
        this.m.set(ai, (Object)Optional.of((Object)UUID.fromString(nBTTagCompound.getString("owner"))));
        Z.add(this);
    }

    @Override
    public void a(SoundEvent soundEvent, float f, float f2) {
        Vec3d vec3d = this.w();
        if (this.world.isRemote) {
            this.world.playSound(vec3d.x, vec3d.y, vec3d.z, soundEvent, SoundCategory.NEUTRAL, f, f2, false);
        } else {
            this.world.playSound(null, new BlockPos(vec3d.x, vec3d.y, vec3d.z), soundEvent, SoundCategory.PLAYERS, f, f2);
        }
    }

    @Override
    public void a(SoundEvent soundEvent) {
        this.a(soundEvent, 1.0f, 1.0f);
    }

    public void a(SoundEvent[] soundEventArray) {
        this.a(soundEventArray[this.getRNG().nextInt(soundEventArray.length)], 1.0f, 1.0f);
    }

    @Override
    public void a(SoundEvent soundEvent, float f) {
        this.a(soundEvent, f, 1.0f);
    }

    @Override
    protected void U() {
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
