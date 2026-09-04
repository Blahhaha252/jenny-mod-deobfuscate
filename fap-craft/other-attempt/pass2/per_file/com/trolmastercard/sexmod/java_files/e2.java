/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  net.minecraftforge.items.CapabilityItemHandler
 *  net.minecraftforge.items.ItemStackHandler
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a6;
import com.trolmastercard.sexmod.bo;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.g;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.r;
import java.util.List;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public abstract class e2
extends em {
    public int S;
    public int P;
    public int O;
    public int K;
    public Vec3d V;
    public boolean N;
    public ItemStackHandler Q;
    public static final DataParameter<ItemStack> L = EntityDataManager.func_187226_a(e2.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(117);
    public static final DataParameter<ItemStack> R = EntityDataManager.func_187226_a(e2.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(116);
    public static final DataParameter<ItemStack> X = EntityDataManager.func_187226_a(e2.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(115);
    public static final DataParameter<ItemStack> T = EntityDataManager.func_187226_a(e2.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(114);
    public static final DataParameter<ItemStack> U = EntityDataManager.func_187226_a(e2.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(113);
    public static final DataParameter<ItemStack> W = EntityDataManager.func_187226_a(e2.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(112);
    public static final DataParameter<Integer> M = EntityDataManager.func_187226_a(e2.class, (DataSerializer)DataSerializers.field_187192_b).func_187156_b().func_187161_a(111);

    protected e2(World world) {
        block1: {
            super(world);
            this.S = 1;
            this.O = 0;
            this.V = Vec3d.field_186680_a;
            this.Q = new ItemStackHandler(7);
            if (this.Q.getStackInSlot(0) == ItemStack.field_190927_a) {
                this.Q.setStackInSlot(0, new ItemStack(Items.field_151040_l));
            }
            if (this.Q.getStackInSlot(1) != ItemStack.field_190927_a) break block1;
            this.Q.setStackInSlot(1, new ItemStack((Item)Items.field_151031_f));
        }
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.m.func_187214_a(M, (Object)0);
        this.m.func_187214_a(L, (Object)ItemStack.field_190927_a);
        this.m.func_187214_a(R, (Object)ItemStack.field_190927_a);
        this.m.func_187214_a(X, (Object)ItemStack.field_190927_a);
        this.m.func_187214_a(T, (Object)ItemStack.field_190927_a);
        this.m.func_187214_a(U, (Object)ItemStack.field_190927_a);
        this.m.func_187214_a(W, (Object)ItemStack.field_190927_a);
    }

    @Override
    protected void func_184651_r() {
        super.func_184651_r();
        this.field_70714_bg.func_75776_a(1, (EntityAIBase)new g(this));
    }

    public void c() {
    }

    @Override
    public void func_70619_bc() {
        super.func_70619_bc();
        if (this.field_70173_aa % 80 == 0 && this.func_110143_aJ() != this.func_110138_aP()) {
            if (!this.J()) {
                this.func_70691_i(1.0f);
            } else {
                List list = this.field_70170_p.func_72872_a(EntityMob.class, new AxisAlignedBB(new BlockPos(this.field_70165_t - 7.0, this.field_70163_u - 1.0, this.field_70161_v - 7.0), new BlockPos(this.field_70165_t + 7.0, this.field_70163_u + 1.0, this.field_70161_v + 7.0)));
                int n = list.isEmpty() ? 4 : 1;
                this.func_70691_i(n);
                ((WorldServer)this.field_70170_p).func_180505_a(EnumParticleTypes.HEART, false, this.field_70165_t, this.field_70163_u + 1.0 + com.trolmastercard.sexmod.r.f.nextDouble(), this.field_70161_v, n, 1.0, 1.0, 1.0, com.trolmastercard.sexmod.r.f.nextGaussian(), new int[0]);
            }
        }
        if (this.N && !this.J()) {
            this.N = false;
        }
        this.m.func_187227_b(field_184621_as, (Object)Byte.valueOf("1"));
        this.m.func_187227_b(L, (Object)this.Q.getStackInSlot(0));
        this.m.func_187227_b(R, (Object)this.Q.getStackInSlot(1));
        this.m.func_187227_b(X, (Object)this.Q.getStackInSlot(2));
        this.m.func_187227_b(T, (Object)this.Q.getStackInSlot(3));
        this.m.func_187227_b(U, (Object)this.Q.getStackInSlot(4));
        this.m.func_187227_b(W, (Object)this.Q.getStackInSlot(5));
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void a(String string, UUID uUID) {
        block1: {
            block4: {
                block3: {
                    block2: {
                        block0: {
                            if (!"action.names.followme".equals(string)) break block0;
                            this.a("master", uUID.toString());
                            break block1;
                        }
                        if (!"action.names.stopfollowme".equals(string)) break block2;
                        this.x();
                        break block1;
                    }
                    if (!"action.names.equipment".equals(string)) break block3;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    ge.b.sendToServer((IMessage)new bo(this.f(), entityPlayerSP.getPersistentID()));
                    break block1;
                }
                if (!"action.names.gohome".equals(string)) break block4;
                this.x();
                ge.b.sendToServer((IMessage)new gg(this.f()));
                break block1;
            }
            if (!"action.names.setnewhome".equals(string)) break block1;
            this.c();
            ge.b.sendToServer((IMessage)new a6(this.f(), new Vec3d((Vec3i)this.func_180425_c())));
        }
    }

    @Override
    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        nBTTagCompound.func_74782_a("inventory", (NBTBase)this.Q.serializeNBT());
        super.func_70014_b(nBTTagCompound);
    }

    @Override
    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        super.func_70037_a(nBTTagCompound);
        this.Q.deserializeNBT(nBTTagCompound.func_74775_l("inventory"));
    }

    public boolean hasCapability(Capability<?> capability, EnumFacing enumFacing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || super.hasCapability(capability, enumFacing);
    }

    public <T> T getCapability(Capability<T> capability, EnumFacing enumFacing) {
        return (T)(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ? this.Q : super.getCapability(capability, enumFacing));
    }

    private static RuntimeException b(RuntimeException runtimeException) {
        return runtimeException;
    }
}
