/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIAvoidEntity
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIWanderAvoidWater
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Biomes
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.Path
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.pathfinding.PathPoint
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraft.world.biome.Biome
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.controller.AnimationController$ISoundListener
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ac;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.bh;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.dq;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.ej;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fg;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.gh;
import com.trolmastercard.sexmod.gi;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gk;
import com.trolmastercard.sexmod.gp;
import com.trolmastercard.sexmod.m;
import com.trolmastercard.sexmod.s;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
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
public class eb
extends e2
implements bh,
fg {
    public static double ap = 0.01;
    public ItemStack ao;
    public static final DataParameter<Float> Y = EntityDataManager.func_187226_a(eb.class, (DataSerializer)DataSerializers.field_187193_c).func_187156_b().func_187161_a(121);
    public static final DataParameter<ItemStack> az = EntityDataManager.func_187226_a(eb.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(120);
    public static final DataParameter<Boolean> af = EntityDataManager.func_187226_a(eb.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(119);
    public static final DataParameter<ItemStack> ag = EntityDataManager.func_187226_a(eb.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(118);
    static final float ah = 3.0f;
    static final float ax = 1200.0f;
    @Nullable
    public gi av;
    public float aa;
    public float Z;
    int aj;
    public boolean ac;
    int aw;
    boolean ay;
    int ak;
    int ab;
    public BlockPos ai;
    int at;
    int as;
    boolean am;
    long al;
    boolean ar;
    Path au;
    int aq;
    HashSet<BlockPos> an;
    boolean ae;
    boolean ad;

    public eb(World world) {
        block1: {
            super(world);
            this.ao = new ItemStack((Item)gp.a);
            this.aa = 1.0f;
            this.Z = 0.0f;
            this.aj = 8000;
            this.ac = false;
            this.aw = 0;
            this.ay = false;
            this.ak = 0;
            this.ab = 0;
            this.at = 0;
            this.as = 0;
            this.al = 0L;
            this.ar = false;
            this.au = null;
            this.aq = 0;
            this.an = new HashSet();
            this.ae = false;
            this.ad = false;
            this.P = 230;
            this.O = 150;
            this.K = 320;
            this.V = new Vec3d(0.0, -0.05999999718368053, 0.10000001192092894);
            if (this.Q.getStackInSlot(0) == ItemStack.field_190927_a) {
                this.Q.setStackInSlot(0, new ItemStack(Items.field_151036_c));
            }
            if (this.Q.getStackInSlot(6) != ItemStack.field_190927_a) break block1;
            this.Q.setStackInSlot(6, new ItemStack((Item)Items.field_151112_aM));
        }
    }

    @Override
    public String c() {
        return "Luna";
    }

    @Override
    public float i() {
        return -0.2f;
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.m.func_187214_a(Y, (Object)Float.valueOf(0.0f));
        this.m.func_187214_a(az, (Object)ItemStack.field_190927_a);
        this.m.func_187214_a(af, (Object)false);
        this.m.func_187214_a(ag, (Object)ItemStack.field_190927_a);
    }

    @Override
    public void c() {
        this.a("Love it here owo");
        this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_OWO, new int[0]);
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.COWGIRL_SITTING_CUM && (fp2 == fp.COWGIRL_SITTING_SLOW || fp2 == fp.COWGIRL_SITTING_FAST)) {
            return;
        }
        if (this.y() == fp.TOUCH_BOOBS_CUM && (fp2 == fp.TOUCH_BOOBS_FAST || fp2 == fp.TOUCH_BOOBS_SLOW)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    public void b() {
        this.ac = true;
    }

    public float func_70047_e() {
        return 1.34f;
    }

    public boolean func_184645_a(EntityPlayer entityPlayer, EnumHand enumHand) {
        block2: {
            boolean bl;
            if (super.func_184645_a(entityPlayer, enumHand)) {
                return true;
            }
            ItemStack itemStack = entityPlayer.func_184586_b(enumHand);
            boolean bl2 = bl = itemStack.func_77973_b() == Items.field_151057_cb;
            if (bl) {
                itemStack.func_111282_a(entityPlayer, (EntityLivingBase)this, enumHand);
                return true;
            }
            if (!this.field_70170_p.field_72995_K || this.b(entityPlayer)) break block2;
            this.a(I18n.func_135052_a((String)"bia.dialogue.busy", (Object[])new Object[0]));
        }
        return true;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        String[] stringArray = new String[]{"action.names.sex", "action.names.touchboobs", "action.names.headpat"};
        ItemStack[] itemStackArray = new ItemStack[]{new ItemStack(Items.field_151115_aP, 3, 0), new ItemStack(Items.field_151115_aP, 2, 1), null};
        eb.a(entityPlayer, (em)this, stringArray, itemStackArray);
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    protected static void a(EntityPlayer entityPlayer, em em2, String[] stringArray, ItemStack[] itemStackArray) {
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(em2, entityPlayer, stringArray, itemStackArray, true));
    }

    public void b(ItemStack itemStack) {
        this.m.func_187227_b(ag, (Object)itemStack);
    }

    @Override
    public void g() {
        this.z = new EntityAIWanderAvoidWater((EntityCreature)this, 0.35);
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.o);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.z);
    }

    @Override
    public void func_70619_bc() {
        super.func_70619_bc();
        if (!this.J()) {
            this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(1.0);
        } else {
            this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5);
        }
        this.m();
        this.i();
        this.m.func_187227_b(af, (Object)(this.av != null && this.m.func_187225_a(ag) == ItemStack.field_190927_a ? 1 : 0));
        if (this.al == this.field_70170_p.func_82737_E() && this.av != null) {
            this.field_70170_p.func_72900_e((Entity)this.av);
            this.av = null;
        }
        if (this.ay) {
            double d = this.o().func_72438_d(this.func_174791_d());
            if (d < 0.5 || this.ak > 200) {
                this.ay = false;
                this.ak = 0;
                this.m.func_187227_b(G, (Object)true);
                this.field_70145_X = true;
                this.func_189654_d(true);
                this.field_70159_w = 0.0;
                this.field_70181_x = 0.0;
                this.field_70179_y = 0.0;
                this.b(fp.WAIT_CAT);
            } else if (++this.ak == 60 || this.ak == 120) {
                this.func_70661_as().func_75499_g();
                this.func_70661_as().func_75492_a(this.o().field_72450_a, this.o().field_72448_b, this.o().field_72449_c, 0.2);
            }
        }
        if (this.ac) {
            ++this.aw;
            if (this.func_174791_d().equals((Object)this.o()) || this.aw > 40) {
                this.ac = false;
                this.aw = 0;
                this.b(this.field_70170_p.func_73046_m().func_184103_al().func_177451_a((UUID)this.ae()).field_70177_z + 180.0f);
                this.m.func_187227_b(G, (Object)true);
                this.func_70661_as().func_75499_g();
                this.U();
            } else {
                this.field_70177_z = this.I().floatValue();
                this.func_189654_d(false);
                Vec3d vec3d = b6.a(this.func_174791_d(), this.o(), 40 - this.aw);
                this.func_70107_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
            }
        }
        this.d();
        this.m.func_187227_b(az, (Object)this.Q.getStackInSlot(6));
    }

    void d() {
        ItemStack itemStack = this.ao;
        ItemStack itemStack2 = (ItemStack)this.m.func_187225_a(az);
        if (itemStack2.equals(ItemStack.field_190927_a)) {
            return;
        }
        Map map = EnchantmentHelper.func_82781_a((ItemStack)itemStack2);
        EnchantmentHelper.func_82782_a((Map)map, (ItemStack)itemStack);
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
        if (fp.WAIT_CAT.equals((Object)this.y())) {
            this.f();
        } else {
            this.ab = 0;
        }
    }

    void f() {
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 10.0);
        if (entityPlayer == null) {
            return;
        }
        if (entityPlayer.func_70032_d((Entity)this) > 1.25f) {
            return;
        }
        if (this.field_70170_p.field_72995_K) {
            this.a(entityPlayer, this.ab);
        } else if (this.ab == 25) {
            this.e(entityPlayer.getPersistentID());
            entityPlayer.func_191958_b(0.0f, 0.0f, 0.0f, 0.0f);
            entityPlayer.func_70634_a(this.func_174791_d().field_72450_a, this.func_174791_d().field_72448_b, this.func_174791_d().field_72449_c);
            this.b(fp.COWGIRL_SITTING_INTRO);
            entityPlayer.func_70034_d(this.I().floatValue() + 180.0f);
            entityPlayer.field_70177_z = this.I().floatValue() + 180.0f;
            entityPlayer.field_70126_B = this.I().floatValue() + 180.0f;
            this.r = this.I().floatValue() + 180.0f;
            this.a(0.0, -0.075f, -0.7109375, 0.0f, 0.0f);
            this.m.func_187227_b(D, (Object)0);
        }
        ++this.ab;
    }

    @SideOnly(value=Side.CLIENT)
    void a(EntityPlayer entityPlayer, int n2) {
        block1: {
            EntityPlayerSP entityPlayerSP;
            if (n2 == 0 && (entityPlayerSP = Minecraft.func_71410_x().field_71439_g).getPersistentID().equals(entityPlayer.getPersistentID())) {
                fh.b();
                entityPlayerSP.func_70016_h(0.0, 0.0, 0.0);
                d3.a(false);
            }
            if (n2 != 25 || !(entityPlayerSP = Minecraft.func_71410_x().field_71439_g).getPersistentID().equals(entityPlayer.getPersistentID())) break block1;
            Minecraft.func_71410_x().field_71474_y.field_74320_O = 2;
        }
    }

    @Override
    public void a() {
        this.m.func_187227_b(G, (Object)false);
        this.b(fp.NULL);
        this.ar = true;
        BlockPos blockPos = this.a(this.func_180425_c());
        if (blockPos == null) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE, new int[0]);
            ge.b.sendToAllAround((IMessage)new gh("<" + this.c() + "> Heh.. there is no bed nearby.. but I already ate the fish so nya~ hehe", this.field_71093_bK, this.f()), this.P());
        } else {
            Vec3d vec3d = new Vec3d((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p());
            int[] nArray = new int[]{0, 180, -90, 90};
            Vec3d[][] vec3dArrayArray = new Vec3d[][]{{new Vec3d(0.5, 0.0, -0.5), new Vec3d(0.0, 0.0, -1.0)}, {new Vec3d(0.5, 0.0, 1.5), new Vec3d(0.0, 0.0, 1.0)}, {new Vec3d(-0.5, 0.0, 0.5), new Vec3d(-1.0, 0.0, 0.0)}, {new Vec3d(1.5, 0.0, 0.5), new Vec3d(1.0, 0.0, 0.0)}};
            int n2 = -1;
            for (int i = 0; i < vec3dArrayArray.length; ++i) {
                Vec3d vec3d2 = vec3d.func_178787_e(vec3dArrayArray[i][1]);
                if (this.field_70170_p.func_180495_p(new BlockPos(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c)).func_177230_c() != Blocks.field_150350_a) continue;
                if (n2 == -1) {
                    n2 = i;
                    continue;
                }
                double d = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72450_a, vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72448_b, vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72449_c);
                double d2 = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)vec3dArrayArray[i][0]).field_72450_a, vec3d.func_178787_e((Vec3d)vec3dArrayArray[i][0]).field_72448_b, vec3d.func_178787_e((Vec3d)vec3dArrayArray[i][0]).field_72449_c);
                if (!(d2 < d)) continue;
                n2 = i;
            }
            if (n2 == -1) {
                this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE, new int[0]);
                this.a("Heh.. the bed is obscured.. but I already ate the fish so nya~ hehe");
                return;
            }
            Vec3d vec3d3 = vec3d.func_178787_e(vec3dArrayArray[n2][0]);
            this.b(nArray[n2]);
            this.c(new Vec3d(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c));
            this.r = this.I().floatValue();
            this.func_70661_as().func_75499_g();
            this.func_70661_as().func_75492_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, 0.2);
            this.ay = true;
            this.ak = 0;
        }
    }

    public void j() {
        EntityItem entityItem = new EntityItem(this.field_70170_p, this.field_70165_t, this.field_70163_u, this.field_70161_v, (ItemStack)this.m.func_187225_a(ag));
        Vec3d vec3d = ck.a(new Vec3d(0.0, (double)0.2f + Math.random() * (double)0.1f, (double)-0.2f + Math.random() * (double)-0.1f), this.field_70177_z);
        entityItem.field_70159_w = vec3d.field_72450_a;
        entityItem.field_70181_x = vec3d.field_72448_b;
        entityItem.field_70179_y = vec3d.field_72449_c;
        this.field_70170_p.func_72838_d((Entity)entityItem);
        this.m.func_187227_b(ag, (Object)ItemStack.field_190927_a);
    }

    public void q() {
        this.ai = null;
        this.at = 0;
        this.as = 0;
        this.am = false;
        this.m.func_187227_b(G, (Object)false);
        this.m.func_187227_b(ag, (Object)ItemStack.field_190927_a);
        this.func_174810_b(false);
        this.b(fp.NULL);
        if (this.av != null) {
            this.field_70170_p.func_72900_e((Entity)this.av);
            this.av = null;
        }
        if (this.ae() != null) {
            return;
        }
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.o);
        if (this.J()) {
            return;
        }
        this.z = new EntityAIWanderAvoidWater((EntityCreature)this, 0.35);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.z);
    }

    public void h() {
        block0: {
            this.q();
            if (++this.aq < 3) break block0;
            this.aq = 0;
            this.aj = 0;
        }
    }

    void i() {
        ItemStack itemStack;
        int n2;
        if (this.J() || this.ae() != null || this.ar) {
            if (((Boolean)this.m.func_187225_a(af)).booleanValue()) {
                this.q();
            }
            return;
        }
        ++this.aj;
        if ((float)n2 < 1200.0f) {
            return;
        }
        if (this.av != null && this.av.d == 15) {
            ((gp)this.ao.func_77973_b()).a(this.field_70170_p, this, EnumHand.MAIN_HAND);
            this.al = this.field_70170_p.func_82737_E() + 20L;
            itemStack = (ItemStack)this.m.func_187225_a(ag);
            if (itemStack != ItemStack.field_190927_a) {
                if (itemStack.func_77973_b() instanceof ItemFood) {
                    this.b(fp.FISHING_EAT);
                } else {
                    this.b(fp.FISHING_THROW_AWAY);
                }
            }
        }
        if (!this.y().toString().toLowerCase().contains("fishing")) {
            this.n();
            this.e();
        }
        if (this.ai != null && this.au == null && this.func_70661_as().func_75505_d() == null && !this.field_70171_ac && this.field_70122_E) {
            itemStack = this.field_70170_p.func_72901_a(this.func_174791_d().func_72441_c(0.0, (double)this.func_70047_e(), 0.0), new Vec3d((double)this.ai.func_177958_n(), (double)this.ai.func_177956_o(), (double)this.ai.func_177952_p()), true);
            this.func_174810_b(true);
            if (this.z != null) {
                this.field_70714_bg.func_85156_a((EntityAIBase)this.z);
                this.z = null;
            }
            if (this.o != null) {
                this.field_70714_bg.func_85156_a((EntityAIBase)this.o);
                this.o = null;
            }
            if (this.y() == fp.NULL) {
                this.b(fp.FISHING_START);
                this.c(this.func_174791_d());
                this.m.func_187227_b(G, (Object)true);
                this.b((float)Math.atan2(this.field_70161_v - (double)this.ai.func_177952_p(), this.field_70165_t - (double)this.ai.func_177958_n()) * 57.29578f + 90.0f);
            }
            return;
        }
        this.au = this.func_70661_as().func_75505_d();
    }

    public void o() {
        this.an.add(this.ai);
        this.q();
    }

    void e() {
        block6: {
            if (this.ai == null) {
                return;
            }
            PathNavigate pathNavigate = this.func_70661_as();
            pathNavigate.func_75492_a((double)this.ai.func_177958_n(), (double)this.ai.func_177956_o(), (double)this.ai.func_177952_p(), (double)0.35f);
            Path path = pathNavigate.func_75505_d();
            if (path == null) {
                return;
            }
            if (path.func_75874_d() <= path.func_75873_e() + 1) break block6;
            PathPoint pathPoint = path.func_75877_a(path.func_75873_e() + 1);
            PathPoint pathPoint2 = path.func_75877_a(path.func_75874_d() - 1);
            Vec3d vec3d = new Vec3d((double)pathPoint2.field_75839_a, (double)pathPoint2.field_75837_b, (double)pathPoint2.field_75838_c);
            BlockPos blockPos = new BlockPos(pathPoint.field_75839_a, pathPoint.field_75837_b, pathPoint.field_75838_c);
            if (this.func_174791_d().func_72438_d(vec3d) < 0.75) {
                pathNavigate.func_75499_g();
                this.func_70107_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
            }
            if (this.field_70170_p.func_180495_p(blockPos.func_177982_a(0, 1, 0)).func_177230_c() == Blocks.field_150355_j) {
                pathNavigate.func_75499_g();
            }
            if (this.field_70170_p.func_180495_p(blockPos).func_177230_c() == Blocks.field_150355_j) {
                pathNavigate.func_75499_g();
            }
            if (this.field_70170_p.func_180495_p(blockPos.func_177982_a(0, -1, 0)).func_177230_c() == Blocks.field_150355_j) {
                pathNavigate.func_75499_g();
            }
        }
    }

    void n() {
        block7: {
            int n2;
            BlockPos blockPos;
            block6: {
                BlockPos blockPos2;
                int n3 = 0;
                blockPos = null;
                n2 = 0;
                while (++n3 < 50 && (blockPos2 = this.a(this.func_180425_c(), n3 + 1, (Block)Blocks.field_150355_j, 60, 10, new HashSet<Biome>(Arrays.asList(Biomes.field_76781_i, Biomes.field_76771_b, Biomes.field_150575_M, Biomes.field_76787_r, Biomes.field_150576_N, Biomes.field_76780_h, Biomes.field_150599_m)))) != null) {
                    while (this.field_70170_p.func_180495_p(blockPos2.func_177982_a(0, 1, 0)).func_177230_c() == Blocks.field_150355_j) {
                        blockPos2 = blockPos2.func_177982_a(0, 1, 0);
                    }
                    int n4 = 1;
                    BlockPos blockPos3 = blockPos2;
                    while (this.field_70170_p.func_180495_p(blockPos3.func_177982_a(0, -1, 0)).func_177230_c() == Blocks.field_150355_j) {
                        blockPos3 = blockPos3.func_177982_a(0, -1, 0);
                        ++n4;
                    }
                    if (this.an.contains(blockPos2)) continue;
                    if (blockPos == null) {
                        blockPos = blockPos2;
                        n2 = n4;
                        continue;
                    }
                    if (n4 <= n2) continue;
                    blockPos = blockPos2;
                    n2 = n4;
                    if (n2 < 6) continue;
                    break;
                }
                if (blockPos == null) {
                    return;
                }
                if (this.ai == null || this.at < n2) {
                    this.ai = blockPos;
                    this.at = n2;
                }
                if (!this.ai.equals(blockPos)) break block6;
                this.as = 0;
                break block7;
            }
            if (++this.as <= 20) break block7;
            this.ai = blockPos;
            this.at = n2;
        }
    }

    void m() {
        Path path = this.func_70661_as().func_75505_d();
        if (path == null) {
            return;
        }
        PathPoint pathPoint = path.func_75870_c();
        PathPoint pathPoint2 = new PathPoint(be.a(this.field_70165_t), be.a(this.field_70163_u), be.a(this.field_70161_v));
        if (pathPoint == null) {
            return;
        }
        this.m.func_187227_b(Y, (Object)Float.valueOf(pathPoint.func_75829_a(pathPoint2)));
    }

    @Override
    public void a(String string, UUID uUID) {
        block2: {
            super.a(string, uUID);
            if ("action.names.touchboobs".equals(string)) {
                this.e(uUID);
                this.a(true, true, uUID);
                this.a("animationFollowUp", "touch_boobs");
                this.a("currentModel", "0");
                d3.a(false);
            }
            if ("action.names.sex".equals(string)) {
                this.e(uUID);
                this.a(true, true, uUID);
                this.a("animationFollowUp", "sex");
                d3.a(false);
            }
            if (!"action.names.headpat".equals(string)) break block2;
            this.e(uUID);
            this.a(true, true, uUID);
            d3.a(false);
            this.a("animationFollowUp", "headpat");
        }
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.TOUCH_BOOBS_SLOW) {
            return fp.TOUCH_BOOBS_FAST;
        }
        if (fp2 == fp.COWGIRL_SITTING_SLOW) {
            return fp.COWGIRL_SITTING_FAST;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.TOUCH_BOOBS_SLOW || fp2 == fp.TOUCH_BOOBS_FAST) {
            return fp.TOUCH_BOOBS_CUM;
        }
        if (fp2 == fp.COWGIRL_SITTING_FAST || fp2 == fp.COWGIRL_SITTING_SLOW) {
            return fp.COWGIRL_SITTING_CUM;
        }
        return null;
    }

    @Override
    protected void U() {
        switch ((String)this.m.func_187225_a(h)) {
            case "touch_boobs": {
                if (this.y() != fp.PAYMENT) {
                    this.b(fp.PAYMENT);
                    return;
                }
                this.b(fp.TOUCH_BOOBS_INTRO);
                break;
            }
            case "sex": {
                if (this.y() != fp.PAYMENT) {
                    this.b(fp.PAYMENT);
                } else {
                    ge.b.sendToServer((IMessage)new ac(this.f()));
                    ge.b.sendToServer((IMessage)new s(this.f()));
                }
                return;
            }
            case "headpat": {
                this.b(fp.HEAD_PAT);
            }
        }
        if (this.field_70170_p.field_72995_K) {
            this.a("animationFollowUp", "");
        } else {
            this.m.func_187227_b(h, (Object)"");
        }
    }

    protected void func_184581_c(DamageSource damageSource) {
        this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_OUU, new int[0]);
    }

    @Nullable
    protected SoundEvent func_184615_bR() {
        if (this.func_70681_au().nextFloat() * 100.0f > 95.0f) {
            return com.trolmastercard.sexmod.c.GIRLS_ALLIE_SCAWY[2];
        }
        return com.trolmastercard.sexmod.c.GIRLS_LUNA_OUU[12];
    }

    @Override
    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(1.0);
    }

    protected float func_175134_bD() {
        return this.func_70090_H() ? 1.0f : 0.5f;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
            return PlayState.STOP;
        }
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL) {
                    this.a("animation.cat.null", true, animationEvent);
                    break;
                }
                this.a("animation.cat.blink", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.cat.null", true, animationEvent);
                    break;
                }
                if (this.func_184218_aH()) {
                    this.a("animation.cat.sit", true, animationEvent);
                    break;
                }
                if (Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v) > 0.0) {
                    if (this.field_70122_E && Math.abs(Math.abs(this.field_70167_r) - Math.abs(this.field_70163_u)) < (double)0.1f) {
                        this.a(((Float)this.m.func_187225_a(Y)).floatValue() < 3.0f ? "animation.cat.walk" : "animation.cat.run", true, animationEvent);
                    } else {
                        this.a("animation.cat.fly", true, animationEvent);
                    }
                    this.field_70177_z = this.field_70759_as;
                    break;
                }
                this.a("animation.cat.idle" + (this.ad ? "2" : ""), true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.cat.null", true, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.cat.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case RIDE: 
                    case SIT: {
                        this.a("animation.cat.sit", true, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.cat.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case THROW_PEARL: {
                        this.a("animation.cat.throwpearl", true, animationEvent);
                        break block5;
                    }
                    case DOWNED: {
                        this.a("animation.cat.downed", true, animationEvent);
                        break block5;
                    }
                    case FISHING_START: {
                        this.a("animation.cat.start_fishing", false, animationEvent);
                        break block5;
                    }
                    case FISHING_IDLE: {
                        this.a("animation.cat.idle_fishing", true, animationEvent);
                        break block5;
                    }
                    case FISHING_EAT: {
                        this.a("animation.cat.eat_fishing", false, animationEvent);
                        break block5;
                    }
                    case FISHING_THROW_AWAY: {
                        this.a("animation.cat.throw_away", false, animationEvent);
                        break block5;
                    }
                    case PAYMENT: {
                        this.a("animation.cat.payment", false, animationEvent);
                        break block5;
                    }
                    case TOUCH_BOOBS_INTRO: {
                        this.a("animation.cat.touch_boobs_intro", false, animationEvent);
                        break block5;
                    }
                    case TOUCH_BOOBS_SLOW: {
                        this.a("animation.cat.touch_boobs_slow" + (this.ae ? "1" : ""), true, animationEvent);
                        break block5;
                    }
                    case TOUCH_BOOBS_FAST: {
                        this.a("animation.cat.touch_boobs_fast", true, animationEvent);
                        break block5;
                    }
                    case TOUCH_BOOBS_CUM: {
                        this.a("animation.cat.touch_boobs_cum", false, animationEvent);
                        break block5;
                    }
                    case WAIT_CAT: {
                        this.a("animation.cat.wait", false, animationEvent);
                        break block5;
                    }
                    case COWGIRL_SITTING_INTRO: {
                        this.a("animation.cat.sitting_intro", false, animationEvent);
                        break block5;
                    }
                    case COWGIRL_SITTING_SLOW: {
                        this.a("animation.cat.sitting_slow", true, animationEvent);
                        break block5;
                    }
                    case COWGIRL_SITTING_FAST: {
                        this.a("animation.cat.sitting_fast", true, animationEvent);
                        break block5;
                    }
                    case COWGIRL_SITTING_CUM: {
                        this.a("animation.cat.sitting_cum", false, animationEvent);
                        break block5;
                    }
                    case HEAD_PAT: {
                        this.a("animation.cat.head_pat", true, animationEvent);
                    }
                }
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        if (this.C == null) {
            this.p();
        }
        AnimationController.ISoundListener iSoundListener = soundKeyframeEvent -> {
            switch (soundKeyframeEvent.sound) {
                case "attackSound": {
                    this.a(SoundEvents.field_187727_dV);
                    break;
                }
                case "attackDone": {
                    this.b(fp.NULL);
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "idleDone": {
                    this.ad = this.func_70681_au().nextInt(10) == 0;
                    break;
                }
                case "idle2Done": {
                    this.ad = false;
                    break;
                }
                case "pearl": {
                    ge.b.sendToServer((IMessage)new gg(this.f()));
                    break;
                }
                case "start_fishingDone": {
                    if (!this.e()) break;
                    this.b(fp.FISHING_IDLE);
                    break;
                }
                case "rod_shoot": {
                    if (!this.e()) break;
                    ge.b.sendToServer((IMessage)new ej(this.f()));
                    break;
                }
                case "eat": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_EAT), 0.5f + 0.5f * (float)this.field_70146_Z.nextInt(2), (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.2f + 1.0f);
                    this.aa -= 0.33333334f;
                    break;
                }
                case "eatPay": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_EAT), 0.5f + 0.5f * (float)this.field_70146_Z.nextInt(2), (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.2f + 1.0f);
                    this.n -= 0.33333334f;
                    break;
                }
                case "burp": {
                    this.a(SoundEvents.field_187739_dZ, 0.5f, this.field_70146_Z.nextFloat() * 0.1f + 0.9f);
                    break;
                }
                case "eatingDone": {
                    if (this.e()) {
                        ge.b.sendToServer((IMessage)new gk(this.f()));
                        this.b(fp.NULL);
                    }
                    this.aa = 1.0f;
                    this.Z = 0.0f;
                    break;
                }
                case "throw_away": {
                    if (this.e()) {
                        ge.b.sendToServer((IMessage)new dq(this.f()));
                    }
                    this.aa = 1.0f;
                    this.Z = 0.0f;
                    break;
                }
                case "renderItem": {
                    this.Z = 1.0f;
                    break;
                }
                case "paymentMSG1": {
                    this.a(this.ae(), "Here, I know u like fish and yea.. these are for you");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0]);
                    break;
                }
                case "paymentMSG2": {
                    this.a("huh~?");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HUH, new int[0]);
                    break;
                }
                case "paymentMSG3": {
                    this.a("nyyyaaaa~ :D");
                    int[] nArray = new int[]{1, 7, 10, 11};
                    int n2 = nArray[this.func_70681_au().nextInt(nArray.length)];
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_CUTENYA[n2]);
                    break;
                }
                case "paymentMSG4": {
                    this.a("tankuuuu owowowo");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_OWO, new int[0]);
                    break;
                }
                case "paymentDone": {
                    if (this.e()) {
                        this.U();
                    }
                    this.n = 1.0f;
                    break;
                }
                case "breath": 
                case "rod_breath": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_LIGHTBREATHING, new int[0]);
                    break;
                }
                case "happyOh": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HAPPYOH, new int[0]);
                    break;
                }
                case "cutenya3": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_CUTENYA[3]);
                    break;
                }
                case "cutenya2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_CUTENYA[2]);
                    break;
                }
                case "huh": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HUH, new int[0]);
                    break;
                }
                case "hmph": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HMPH, new int[0]);
                    break;
                }
                case "hehe": 
                case "giggle": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE, new int[0]);
                    break;
                }
                case "singing": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_SINGING, new int[0]);
                    break;
                }
                case "touch_boobsMSG1": {
                    this.a("comon~ touch me hihi~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE, new int[0]);
                    break;
                }
                case "touch": {
                    this.a(com.trolmastercard.sexmod.c.MISC_TOUCH, new int[0]);
                    break;
                }
                case "jump": {
                    this.a(com.trolmastercard.sexmod.c.MISC_JUMP[0], 0.2f);
                    break;
                }
                case "horninya": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA, new int[0]);
                    break;
                }
                case "horninya2": 
                case "touch_boobs_cumMSG3": 
                case "sitting_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA[1]);
                    this.a(com.trolmastercard.sexmod.c.MISC_CUMINFLATION[0], 5.0f);
                    break;
                }
                case "moan": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MOAN));
                    break;
                }
                case "touch_boobs_introDone": {
                    this.b(fp.TOUCH_BOOBS_SLOW);
                    if (!this.n()) break;
                    ds.b();
                    ds.d();
                    d3.a(false);
                    break;
                }
                case "touch_boobs_slowDone": {
                    if (this.ae) {
                        this.ae = false;
                        break;
                    }
                    this.ae = Math.random() < 0.5;
                    break;
                }
                case "addCumSlow": {
                    if (!this.n()) break;
                    ds.a(0.02f);
                    break;
                }
                case "addCumFast": {
                    if (!this.n()) break;
                    ds.a(0.04f);
                    break;
                }
                case "fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.TOUCH_BOOBS_SLOW);
                    break;
                }
                case "moanOrNya": {
                    if (Math.random() > 0.5) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MOAN));
                        break;
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA));
                    break;
                }
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "touch_boobs_cumDone": {
                    if (!this.n()) break;
                    ds.b();
                    this.r();
                    break;
                }
                case "resetGirl": {
                    if (!this.e()) break;
                    this.r();
                    break;
                }
                case "touch_boobs_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA[3]);
                    break;
                }
                case "touch_boobs_cumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA[9]);
                    break;
                }
                case "call_playerMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE, new int[0]);
                    this.a("come here - big guy hehe~");
                    break;
                }
                case "pounding": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    break;
                }
                case "sitting_introMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_GIGGLE, new int[0]);
                    this.a("hehe~");
                    break;
                }
                case "sitting_introDone": {
                    if (!this.n()) break;
                    this.b(fp.COWGIRL_SITTING_SLOW);
                    ds.b();
                    ds.d();
                    break;
                }
                case "sitting_slowMSG1": {
                    if (this.func_70681_au().nextBoolean()) {
                        if (this.func_70681_au().nextBoolean()) {
                            this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA));
                            break;
                        }
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MOAN));
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_LIGHTBREATHING));
                    }
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "sitting_fastMSG1": {
                    if (this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA));
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MOAN));
                    }
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "sitting_fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.COWGIRL_SITTING_SLOW);
                    Vec3d vec3d = new Vec3d(0.0, (double)-0.075f, -0.7109375);
                    Vec3d vec3d2 = ck.a(vec3d, this.I().floatValue() + 180.0f);
                    Minecraft.func_71410_x().field_71439_g.func_70107_b(this.o().field_72450_a + vec3d2.field_72450_a, this.o().field_72448_b + vec3d2.field_72448_b, this.o().field_72449_c + vec3d2.field_72449_c);
                    break;
                }
                case "sitting_fastTp": {
                    if (!this.n()) break;
                    Vec3d vec3d = new Vec3d(0.0, -0.160625, -0.9925);
                    Vec3d vec3d3 = ck.a(vec3d, this.I().floatValue() + 180.0f);
                    Minecraft.func_71410_x().field_71439_g.func_70107_b(this.o().field_72450_a + vec3d3.field_72450_a, this.o().field_72448_b + vec3d3.field_72448_b, this.o().field_72449_c + vec3d3.field_72449_c);
                    break;
                }
                case "headpatMSG1": {
                    this.a("huh?~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HUH, new int[0]);
                    break;
                }
                case "headpatMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_MMM, new int[0]);
                    break;
                }
                case "headpatMSG3": {
                    this.a("nya~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_LUNA_HORNINYA[0]);
                }
            }
        };
        this.E.transitionLengthTicks = 10.0;
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    @Override
    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        super.func_70037_a(nBTTagCompound);
        this.func_189654_d(false);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static class a$a {
        @SubscribeEvent
        public void a(EntityJoinWorldEvent entityJoinWorldEvent) {
            Entity entity = entityJoinWorldEvent.getEntity();
            if (entity instanceof EntityCreeper) {
                EntityCreeper entityCreeper = (EntityCreeper)entity;
                entityCreeper.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)entityCreeper, eb.class, 6.0f, 1.0, 1.2));
            }
        }
    }
}
