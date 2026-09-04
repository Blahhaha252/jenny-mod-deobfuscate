/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  javax.vecmath.Vector2f
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemElytra
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
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
    public static boolean ag = true;
    public Vector2f ao = new Vector2f(0.0f, 0.0f);
    public boolean ad = false;
    public boolean aj = false;
    public boolean ak = false;
    public boolean af = true;
    public boolean ah = false;
    protected static final DataParameter<Optional<UUID>> ai = EntityDataManager.func_187226_a(em.class, (DataSerializer)DataSerializers.field_187203_m).func_187156_b().func_187161_a(118);
    public static Hashtable<UUID, ei> al = new Hashtable();
    public static List<ei> Z = new ArrayList<ei>();
    int an = -1;
    public boolean ab = true;

    protected ei(World world) {
        super(world);
        this.func_70105_a(0.01f, 0.01f);
        Z.add(this);
    }

    protected ei(World world, UUID uUID) {
        this(world);
        this.m.func_187227_b(ai, (Object)Optional.of((Object)uUID));
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
                if (em2.field_70170_p.field_72995_K || !(em2 instanceof ei) || !uUID.equals((ei2 = (ei)em2).m())) continue;
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
        return new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u - 0.0, this.field_70161_v, 50.0);
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

    public boolean func_70067_L() {
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
        if (((Optional)this.m.func_187225_a(ai)).isPresent() && (entityPlayer = this.field_70170_p.func_152378_a((UUID)((Optional)this.m.func_187225_a(ai)).get())) != null) {
            return entityPlayer.func_70005_c_();
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
    public boolean func_70104_M() {
        return false;
    }

    public boolean func_70058_J() {
        return true;
    }

    public boolean F() {
        return false;
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.m.func_187214_a(ai, (Object)Optional.absent());
    }

    @SideOnly(value=Side.CLIENT)
    public static void i() {
        ei ei2 = ei.d(Minecraft.func_71410_x().field_71439_g.getPersistentID());
        if (ei2 == null) {
            return;
        }
        ei2.r();
    }

    @Override
    public void r() {
        block0: {
            this.B = null;
            this.func_189654_d(false);
            if (!this.field_70170_p.field_72995_K) break block0;
            this.V();
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    protected void V() {
        if (this.n() || this.f()) {
            d3.a(true);
            EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
            entityPlayerSP.func_82142_c(false);
            entityPlayerSP.func_189654_d(false);
            entityPlayerSP.field_70145_X = false;
            this.m.func_187227_b(G, (Object)false);
            ge.b.sendToServer((IMessage)new s(this.f()));
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean H() {
        Minecraft minecraft = Minecraft.func_71410_x();
        return !this.f() || minecraft.field_71474_y.field_74320_O != 0;
    }

    protected void c(boolean bl) {
        if (!ag) {
            return;
        }
        if (this.m() == null) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.m());
        if (entityPlayer == null) {
            return;
        }
        entityPlayer.field_71075_bZ.field_75101_c = bl;
        if (!bl) {
            entityPlayer.field_71075_bZ.field_75100_b = false;
        }
        entityPlayer.func_71016_p();
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

    public AxisAlignedBB func_174813_aQ() {
        return super.func_174813_aQ().func_72317_d(0.0, 0.5, 0.0);
    }

    protected EntityPlayer j() {
        List list = this.field_70170_p.field_73010_i;
        EntityPlayer entityPlayer = null;
        for (EntityPlayer entityPlayer2 : list) {
            if (entityPlayer2.getPersistentID().equals(((Optional)this.m.func_187225_a(ai)).get())) continue;
            if (entityPlayer == null) {
                entityPlayer = entityPlayer2;
                continue;
            }
            double d = entityPlayer.func_70092_e(this.w().field_72450_a, this.w().field_72448_b, this.w().field_72449_c);
            double d2 = entityPlayer2.func_70092_e(this.w().field_72450_a, this.w().field_72448_b, this.w().field_72449_c);
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
        return entityPlayer.getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID());
    }

    public Vec3d w() {
        return new Vec3d(this.field_70165_t, this.field_70163_u - 0.0, this.field_70161_v);
    }

    protected void b(UUID uUID) {
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP)this.field_70170_p.func_152378_a(uUID);
        EntityPlayerMP entityPlayerMP2 = (EntityPlayerMP)this.field_70170_p.func_152378_a((UUID)((Optional)this.m.func_187225_a(ai)).get());
        ge.b.sendTo((IMessage)new gz(false), entityPlayerMP);
        ge.b.sendTo((IMessage)new gz(false), entityPlayerMP2);
        this.e(uUID);
        this.field_70177_z = 0.0f;
        this.field_70759_as = 0.0f;
        entityPlayerMP.field_70177_z = 180.0f;
        entityPlayerMP.field_70759_as = 180.0f;
        entityPlayerMP.func_189654_d(true);
        entityPlayerMP.field_70145_X = true;
        Vec3d vec3d = this.func_174791_d();
        entityPlayerMP.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c + 1.0);
        entityPlayerMP.field_71075_bZ.field_75100_b = true;
        entityPlayerMP2.field_71075_bZ.field_75100_b = true;
        this.j(uUID);
        this.m.func_187227_b(G, (Object)true);
        this.c(vec3d);
        this.b(0.0f);
    }

    protected void func_180429_a(BlockPos blockPos, Block block) {
        super.func_180429_a(blockPos, block);
    }

    public AxisAlignedBB a(EntityPlayer entityPlayer) {
        return entityPlayer.func_174813_aQ();
    }

    @Override
    public void func_70071_h_() {
        block1: {
            this.field_70145_X = true;
            this.func_189654_d(true);
            super.func_70071_h_();
            this.D();
            if (!this.field_70170_p.field_72995_K) {
                return;
            }
            if (!this.f()) break block1;
            com.trolmastercard.sexmod.w.a.a();
        }
    }

    @SideOnly(value=Side.CLIENT)
    void h() {
        Minecraft.func_71410_x().field_71439_g.eyeHeight = this.func_70047_e();
    }

    @SideOnly(value=Side.CLIENT)
    public boolean f() {
        if (!((Optional)this.m.func_187225_a(ai)).isPresent()) {
            return false;
        }
        return ((UUID)((Optional)this.m.func_187225_a(ai)).get()).equals(Minecraft.func_71410_x().field_71439_g.getPersistentID());
    }

    public boolean E() {
        return false;
    }

    void d(EntityPlayer entityPlayer) {
        NBTTagCompound nBTTagCompound = entityPlayer.getEntityData();
        String string = nBTTagCompound.func_74779_i(aa + (Object)((Object)fy.a((Entity)this)));
        this.f(string);
    }

    @Override
    public void func_70619_bc() {
        block5: {
            Object object;
            ei.C();
            this.l();
            this.G();
            UUID uUID = this.m();
            if (uUID == null) {
                return;
            }
            EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
            if (entityPlayer == null) {
                this.func_70634_a(this.field_70165_t, 0.0, this.field_70161_v);
                return;
            }
            this.d(entityPlayer);
            if (this.Q()) {
                object = this.o();
                this.func_70634_a(object.field_72450_a, object.field_72448_b, object.field_72449_c);
            } else {
                this.func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u + 0.0, entityPlayer.field_70161_v);
            }
            object = this.y();
            if (object == fp.NULL && entityPlayer.field_82175_bq) {
                this.b(fp.ATTACK);
            }
            if (object != fp.ATTACK || entityPlayer.field_82175_bq) break block5;
            this.b(fp.NULL);
        }
    }

    void D() {
        if (this.an == -1) {
            return;
        }
        ++this.an;
        if (!this.field_70170_p.field_72995_K && this.an == 65) {
            this.f(this.ah() == 0 ? 1 : 0);
        }
        if (this.an < 100) {
            return;
        }
        if (this.y() != fp.STRIP) {
            return;
        }
        if (this.field_70170_p.field_72995_K) {
            this.n();
            return;
        }
        this.b(fp.NULL);
    }

    @SideOnly(value=Side.CLIENT)
    void n() {
        if (this.f()) {
            Minecraft minecraft = Minecraft.func_71410_x();
            minecraft.field_71474_y.field_74320_O = 0;
            minecraft.field_71460_t.func_175066_a(minecraft.func_175606_aa());
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
        if (!this.field_70170_p.field_72995_K && fp2 == fp.NULL && this.Q()) {
            System.out.println("prevented a potential animation break");
            return;
        }
        if (fp2 == fp.STRIP) {
            this.an = this.field_70170_p.field_72995_K ? 5 : 0;
        }
        super.b(fp2);
    }

    void f(EntityPlayer entityPlayer) {
        this.m.func_187227_b(X, (Object)ItemStack.field_190927_a);
        this.m.func_187227_b(T, (Object)ItemStack.field_190927_a);
        this.m.func_187227_b(U, (Object)ItemStack.field_190927_a);
        this.m.func_187227_b(W, (Object)ItemStack.field_190927_a);
        for (ItemStack itemStack : entityPlayer.func_184193_aE()) {
            if (itemStack.func_77973_b() instanceof ItemElytra) {
                this.m.func_187227_b(T, (Object)itemStack);
                continue;
            }
            if (!(itemStack.func_77973_b() instanceof ItemArmor)) continue;
            ItemArmor itemArmor = (ItemArmor)itemStack.func_77973_b();
            switch (itemArmor.func_185083_B_()) {
                case HEAD: {
                    this.m.func_187227_b(X, (Object)itemStack);
                    break;
                }
                case CHEST: {
                    this.m.func_187227_b(T, (Object)itemStack);
                    break;
                }
                case LEGS: {
                    this.m.func_187227_b(U, (Object)itemStack);
                    break;
                }
                case FEET: {
                    this.m.func_187227_b(W, (Object)itemStack);
                }
            }
        }
    }

    public UUID m() {
        if (((Optional)this.m.func_187225_a(ai)).isPresent()) {
            return (UUID)((Optional)this.m.func_187225_a(ai)).get();
        }
        return null;
    }

    @Nullable
    public EntityPlayer k() {
        UUID uUID = this.m();
        if (uUID == null) {
            return null;
        }
        return this.field_70170_p.func_152378_a(uUID);
    }

    public void a(Optional<UUID> optional) {
        this.m.func_187227_b(ai, optional);
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
            if (!object.getValue().field_70128_L) continue;
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
        if (!((Optional)this.m.func_187225_a(ai)).isPresent()) {
            return;
        }
        ge.b.sendToServer((IMessage)new g4(string, uUID, (UUID)((Optional)this.m.func_187225_a(ai)).get(), this.ab));
        this.ab = true;
    }

    @Override
    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        super.func_70014_b(nBTTagCompound);
        nBTTagCompound.func_74778_a("owner", ((UUID)((Optional)this.m.func_187225_a(ai)).get()).toString());
    }

    @Override
    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        super.func_70037_a(nBTTagCompound);
        this.m.func_187227_b(ai, (Object)Optional.of((Object)UUID.fromString(nBTTagCompound.func_74779_i("owner"))));
        Z.add(this);
    }

    @Override
    public void a(SoundEvent soundEvent, float f, float f2) {
        Vec3d vec3d = this.w();
        if (this.field_70170_p.field_72995_K) {
            this.field_70170_p.func_184134_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, soundEvent, SoundCategory.NEUTRAL, f, f2, false);
        } else {
            this.field_70170_p.func_184133_a(null, new BlockPos(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c), soundEvent, SoundCategory.PLAYERS, f, f2);
        }
    }

    @Override
    public void a(SoundEvent soundEvent) {
        this.a(soundEvent, 1.0f, 1.0f);
    }

    public void a(SoundEvent[] soundEventArray) {
        this.a(soundEventArray[this.func_70681_au().nextInt(soundEventArray.length)], 1.0f, 1.0f);
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
