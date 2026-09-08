/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  javax.vecmath.Vector2f
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
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
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.living.LivingAttackEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerChangedDimensionEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.Level
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.controller.AnimationController$ISoundListener
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 */
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
    static final HashSet<Item> ag = new HashSet<Item>(Arrays.asList(Items.field_151013_M, Items.field_151136_bY, Items.field_151043_k, Items.field_151153_ao, Items.field_151006_E, Items.field_151011_C, Items.field_151005_D, Items.field_151010_B, Items.field_151150_bK, Items.field_151169_ag, Items.field_151151_aj, Items.field_151171_ah, Items.field_151149_ai, Items.field_151043_k, Items.field_151074_bl, Item.func_150898_a((Block)Blocks.field_150340_R), Item.func_150898_a((Block)Blocks.field_150352_o)));
    public static final DataParameter<String> Q = EntityDataManager.func_187226_a(e3.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(122);
    public static final DataParameter<String> aK = EntityDataManager.func_187226_a(e3.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(123);
    public static final DataParameter<ItemStack> a0 = EntityDataManager.func_187226_a(e3.class, (DataSerializer)DataSerializers.field_187196_f).func_187156_b().func_187161_a(124);
    public static final DataParameter<Boolean> aC = EntityDataManager.func_187226_a(e3.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(125);
    public static final DataParameter<Boolean> aV = EntityDataManager.func_187226_a(e3.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(126);
    public boolean aX = false;
    public float ac = 0.0f;
    public long av = -1L;
    public Vec3d al = Vec3d.field_186680_a;
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
        this.func_70105_a(e3.aS.x, e3.aS.y);
    }

    public e3(World world, @Nonnull String string, int n) {
        this(world);
        this.m.func_187227_b(aK, (Object)string);
        this.m.func_187227_b(M, (Object)this.a(new StringBuilder(), n));
    }

    public e3(World world, boolean bl, float f, Vec3d vec3d) {
        this(world);
        if (!bl) {
            return;
        }
        this.m.func_187227_b(M, (Object)this.b(new StringBuilder()));
        this.ac = f;
        this.al = vec3d;
        this.aX = true;
        this.c(vec3d);
        this.b(f);
        this.b(fp.SIT);
        this.a(true);
        this.func_70107_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    }

    @Override
    public void g() {
        super.g();
        this.a((UUID)null);
        this.field_70145_X = false;
        this.func_189654_d(false);
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        eh eh2 = eh.values()[this.func_70681_au().nextInt(eh.values().length)];
        this.m.func_187214_a(K, (Object)new BlockPos(eh2.a()));
        this.m.func_187214_a(N, (Object)ax.name());
        this.m.func_187214_a(Q, (Object)"");
        this.m.func_187214_a(aK, (Object)"");
        this.m.func_187214_a(a0, (Object)ItemStack.field_190927_a);
        this.m.func_187214_a(aC, (Object)false);
        this.m.func_187214_a(aV, (Object)false);
    }

    @Override
    protected void a() {
        dy.c();
    }

    public void func_70106_y() {
        super.func_70106_y();
        this.a((UUID)null);
        if (this.field_70170_p.field_72995_K) {
            return;
        }
        ItemStack itemStack = (ItemStack)this.m.func_187225_a(a0);
        if (itemStack == ItemStack.field_190927_a) {
            return;
        }
        EntityItem entityItem = new EntityItem(this.field_70170_p, this.field_70165_t, this.field_70163_u, this.field_70161_v, itemStack);
        this.field_70170_p.func_72838_d((Entity)entityItem);
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

    public float func_70047_e() {
        return 0.75f;
    }

    @Override
    public float i() {
        return 0.1f;
    }

    @Override
    public void a(UUID uUID) {
        if (uUID == null) {
            this.m.func_187227_b(Q, (Object)"");
            return;
        }
        this.m.func_187227_b(Q, (Object)uUID.toString());
    }

    @Override
    @Nullable
    public UUID e() {
        String string = (String)this.m.func_187225_a(Q);
        if ("".equals(string)) {
            return null;
        }
        try {
            return UUID.fromString((String)this.m.func_187225_a(Q));
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
            this.m.func_187227_b(M, (Object)stringBuilder.toString());
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
        this.m.func_187227_b(M, (Object)stringBuilder.toString());
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
    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        super.func_70014_b(nBTTagCompound);
        nBTTagCompound.func_74778_a("bodyColor", (String)this.m.func_187225_a(N));
        nBTTagCompound.func_74768_a("eyeColorX", ((BlockPos)this.m.func_187225_a(K)).func_177958_n());
        nBTTagCompound.func_74768_a("eyeColorY", ((BlockPos)this.m.func_187225_a(K)).func_177956_o());
        nBTTagCompound.func_74768_a("eyeColorZ", ((BlockPos)this.m.func_187225_a(K)).func_177952_p());
        nBTTagCompound.func_74778_a("model", (String)this.m.func_187225_a(M));
        nBTTagCompound.func_74778_a("girlID", (String)this.m.func_187225_a(u));
        nBTTagCompound.func_74778_a("queen", (String)this.m.func_187225_a(aK));
        nBTTagCompound.func_74757_a("isQueen", this.aX);
        nBTTagCompound.func_74757_a("isTamed", ((Boolean)this.m.func_187225_a(aC)).booleanValue());
        nBTTagCompound.func_74768_a("robTicks", this.aO);
        if (!this.aX) {
            return;
        }
        nBTTagCompound.func_74757_a("preggo", ((Boolean)this.m.func_187225_a(aV)).booleanValue());
        nBTTagCompound.func_74776_a("throneRot", this.ac);
        nBTTagCompound.func_74780_a("thronePosX", this.al.field_72450_a);
        nBTTagCompound.func_74780_a("thronePosY", this.al.field_72448_b);
        nBTTagCompound.func_74780_a("thronePosZ", this.al.field_72449_c);
        nBTTagCompound.func_74772_a("impregnationTick", this.av);
        for (int i = 0; i < this.T.size(); ++i) {
            nBTTagCompound.func_74778_a("guard" + i, this.T.get(i).toString());
        }
    }

    @Override
    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        super.func_70037_a(nBTTagCompound);
        this.aX = nBTTagCompound.func_74767_n("isQueen");
        this.m.func_187227_b(M, (Object)nBTTagCompound.func_74779_i("model"));
        this.m.func_187227_b(N, (Object)nBTTagCompound.func_74779_i("bodyColor"));
        String[] stringArray = e3.a(this);
        if (Integer.parseInt(stringArray[3]) > 7 || Integer.parseInt(stringArray[4]) > 7) {
            this.m.func_187227_b(M, (Object)this.a(new StringBuilder(), this.k()));
            Main.LOGGER.log(Level.INFO, "updated an old Goblin");
        }
        this.m.func_187227_b(K, (Object)new BlockPos(nBTTagCompound.func_74762_e("eyeColorX"), nBTTagCompound.func_74762_e("eyeColorY"), nBTTagCompound.func_74762_e("eyeColorZ")));
        this.m.func_187227_b(u, (Object)nBTTagCompound.func_74779_i("girlID"));
        this.m.func_187227_b(aK, (Object)nBTTagCompound.func_74779_i("queen"));
        this.m.func_187227_b(aC, (Object)nBTTagCompound.func_74767_n("isTamed"));
        this.aO = nBTTagCompound.func_74762_e("robTicks");
        if (!this.aX) {
            return;
        }
        this.ac = nBTTagCompound.func_74760_g("throneRot");
        this.al = new Vec3d(nBTTagCompound.func_74769_h("thronePosX"), nBTTagCompound.func_74769_h("thronePosY"), nBTTagCompound.func_74769_h("thronePosZ"));
        int n = 0;
        while (!"".equals(nBTTagCompound.func_74779_i("guard" + n))) {
            this.T.add(UUID.fromString(nBTTagCompound.func_74779_i("guard" + n)));
            ++n;
        }
        this.m.func_187227_b(aV, (Object)nBTTagCompound.func_74767_n("preggo"));
        this.av = nBTTagCompound.func_74763_f("impregnationTick");
    }

    protected boolean func_184645_a(EntityPlayer entityPlayer, EnumHand enumHand) {
        if (this.field_70170_p.field_72995_K) {
            return true;
        }
        if (this.aX) {
            return true;
        }
        if (this.y() == fp.RUN) {
            if ((double)this.func_70032_d((Entity)entityPlayer) > 3.5) {
                entityPlayer.func_146105_b((ITextComponent)new TextComponentString("get a bit closer..."), true);
            } else {
                this.c(entityPlayer.func_174791_d());
                this.b(entityPlayer.field_70177_z);
                this.b(fp.CATCH);
                this.m.func_187227_b(h, (Object)"bj");
                this.a(entityPlayer.getPersistentID());
                this.e(entityPlayer.getPersistentID());
                this.func_70661_as().func_75499_g();
                this.field_70159_w = 0.0;
                this.field_70181_x = 0.0;
                this.field_70179_y = 0.0;
            }
            return true;
        }
        if (e3.d(entityPlayer.getPersistentID())) {
            entityPlayer.func_146105_b((ITextComponent)new TextComponentString("you are already carrying a Goblin"), true);
        } else {
            this.a(entityPlayer.getPersistentID());
            this.b(fp.PICK_UP);
            this.aQ = 45;
            this.a(false);
            this.m.func_187227_b(aC, (Object)true);
            this.func_70661_as().func_75499_g();
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
            if (var2_3.field_70170_p.field_72995_K || var2_3.field_70128_L || !var0.equals(var3_4 = ((ai)var2_3).e())) ** GOTO lbl-1000
            return true;
        }
    }

    @Override
    protected void func_184651_r() {
        this.o = new df((EntityLiving)this, EntityPlayer.class, 2.0f, 1.0f);
        this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.field_70714_bg.func_75776_a(3, (EntityAIBase)new hz((EntityLiving)this));
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.o);
    }

    @Override
    public void func_70619_bc() {
        super.func_70619_bc();
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

    public boolean func_70067_L() {
        fp fp2 = this.y();
        if (fp2 == fp.THROWN) {
            return false;
        }
        if (fp2 == fp.RUN) {
            return super.func_70067_L();
        }
        if (fp2 == fp.AWAIT_PICK_UP) {
            return super.func_70067_L();
        }
        if (this.e() != null) {
            return false;
        }
        if (fp2 != fp.NULL) {
            return false;
        }
        return super.func_70067_L();
    }

    void b(EntityPlayer entityPlayer) {
        ei ei2 = ei.d(entityPlayer.getPersistentID());
        Vec3d vec3d = new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u + (double)(ei2 == null ? entityPlayer.eyeHeight : ei2.func_70047_e()), entityPlayer.field_70161_v);
        Vec3d vec3d2 = new Vec3d(this.field_70165_t, this.field_70163_u + (double)this.func_70047_e(), this.field_70161_v);
        double d = vec3d2.func_72438_d(vec3d);
        double d2 = vec3d.field_72448_b - vec3d2.field_72448_b;
        this.field_70125_A = (float)(-(Math.sin(d2 / d) * 57.29577951308232));
    }

    void n() {
        if (!((Boolean)this.m.func_187225_a(aC)).booleanValue()) {
            return;
        }
        if (this.ae() != null) {
            return;
        }
        if (this.y() != fp.NULL) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 15.0);
        if (entityPlayer != null && entityPlayer.func_70032_d((Entity)this) < 2.0f) {
            this.b(entityPlayer);
            this.func_70661_as().func_75499_g();
            return;
        }
        if (this.R == null || this.func_70011_f(this.R.func_177958_n(), this.R.func_177956_o(), this.R.func_177952_p()) > this.l() || this.Y > 100) {
            int n = (this.func_70681_au().nextBoolean() ? 1 : -1) * this.func_70681_au().nextInt(5);
            int n2 = (this.func_70681_au().nextBoolean() ? 1 : -1) * this.func_70681_au().nextInt(5);
            int n3 = cj.a(this.field_70170_p, this.func_180425_c().func_177958_n() + n, this.func_180425_c().func_177952_p() + n2);
            this.R = new BlockPos(this.func_180425_c().func_177958_n() + n, n3, this.func_180425_c().func_177952_p() + n2);
            this.Y = 0;
        }
        if (Math.sqrt(this.R.func_177951_i((Vec3i)this.func_180425_c())) > 2.0) {
            this.func_70661_as().func_75492_a((double)this.R.func_177958_n(), (double)this.R.func_177956_o(), (double)this.R.func_177952_p(), (double)0.3f);
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
        if (!this.field_70122_E) {
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
            if (!((Boolean)this.m.func_187225_a(aV)).booleanValue()) {
                return;
            }
            if (this.av + 8400L >= this.field_70170_p.func_82737_E()) break block2;
            this.m.func_187227_b(aV, (Object)false);
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
            if (!((Boolean)e32.func_184212_Q().func_187225_a(aC)).booleanValue()) continue;
            bl = true;
        }
        if (!bl) {
            return;
        }
        this.h("Farewell my knight. You are welcome once I am breedable again.");
        for (e3 e32 : this.ab) {
            if (((Boolean)e32.func_184212_Q().func_187225_a(aC)).booleanValue()) continue;
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
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
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
        Vec3d vec3d = this.al.func_178787_e(e3.b(aT, f));
        Vec3d vec3d2 = this.al.func_178787_e(e3.b(ap, f));
        Vec3d vec3d3 = this.al.func_178787_e(e3.b(as, f));
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
        e33.func_189654_d(false);
        e34.func_189654_d(false);
        entityPlayer.func_189654_d(false);
        e33.field_70145_X = false;
        e34.field_70145_X = false;
        entityPlayer.field_70145_X = false;
        entityPlayer.field_70177_z = f;
        entityPlayer.field_70125_A = 30.0f;
        entityPlayer.func_70634_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
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
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = e3.b(new Vec3d(0.0, 0.15625 - (double)entityPlayer.func_70047_e(), -0.8859375), this.ac - 180.0f);
        vec3d = vec3d.func_178787_e(this.o());
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    }

    public static Vec3d b(Vec3d vec3d, float f) {
        return e3.a(vec3d, 0.0f, f);
    }

    public static Vec3d a(Vec3d vec3d, float f, float f2) {
        Vec3d vec3d2 = new Vec3d(vec3d.field_72450_a, vec3d.field_72448_b * Math.cos((double)f * (Math.PI / 180)) - vec3d.field_72449_c * Math.sin((double)f * (Math.PI / 180)), vec3d.field_72448_b * Math.sin((double)f * (Math.PI / 180)) + vec3d.field_72449_c * Math.cos((double)f * (Math.PI / 180)));
        Vec3d vec3d3 = new Vec3d(-Math.sin((double)(f2 + 90.0f) * (Math.PI / 180)) * vec3d2.field_72450_a - Math.sin((double)f2 * (Math.PI / 180)) * vec3d2.field_72449_c, vec3d2.field_72448_b, Math.cos((double)(f2 + 90.0f) * (Math.PI / 180)) * vec3d2.field_72450_a + Math.cos((double)f2 * (Math.PI / 180)) * vec3d2.field_72449_c);
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
                vec3d = this.al.func_178787_e(au);
                break;
            }
            case 180: {
                vec3d = this.al.func_178787_e(W);
                break;
            }
            case -90: {
                vec3d = this.al.func_178787_e(at);
                break;
            }
            default: {
                vec3d = this.al.func_178787_e(af);
            }
        }
        UUID uUID = this.ae();
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        this.c(vec3d);
        this.b(this.ac);
        this.b(fp.BREEDING_INTRO_0);
        this.field_70145_X = true;
        this.func_189654_d(true);
        Vec3d vec3d2 = e3.b(new Vec3d(0.0, 0.44375 - (double)entityPlayer.eyeHeight, -0.7875), this.ac - 180.0f);
        entityPlayer.field_70145_X = true;
        entityPlayer.func_189654_d(true);
        entityPlayer.func_70634_a(vec3d2.field_72450_a + vec3d.field_72450_a, vec3d2.field_72448_b + vec3d.field_72448_b, vec3d2.field_72449_c + vec3d.field_72449_c);
        List<e3> list = this.I();
        if (list.size() >= 1) {
            e32 = list.get(0);
            e32.c(vec3d);
            e32.b(this.ac);
            e32.b(fp.BREEDING_INTRO_1);
            e32.field_70145_X = true;
            e32.func_189654_d(true);
        }
        if (list.size() >= 2) {
            e32 = list.get(1);
            e32.c(vec3d);
            e32.b(this.ac);
            e32.b(fp.BREEDING_INTRO_2);
            e32.field_70145_X = true;
            e32.func_189654_d(true);
        }
        this.an = 0;
    }

    AxisAlignedBB a(Vec3d vec3d, Vec3d vec3d2) {
        return new AxisAlignedBB(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c);
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
        Vec3d vec3d2 = this.al.func_178786_a(0.5, 0.0, 0.5).func_178788_d(vec3d);
        AxisAlignedBB axisAlignedBB = this.a(vec3d2, vec3d2.func_72441_c((double)ah.func_177958_n(), (double)ah.func_177956_o(), (double)ah.func_177952_p()));
        List list = this.field_70170_p.func_72872_a(EntityPlayer.class, axisAlignedBB);
        if (list.isEmpty()) {
            return;
        }
        EntityPlayer entityPlayer = (EntityPlayer)list.get(0);
        if (!entityPlayer.field_70122_E) {
            return;
        }
        if (((Boolean)this.m.func_187225_a(aV)).booleanValue()) {
            if (this.ai + 1200L < this.field_70170_p.func_82737_E()) {
                entityPlayer.func_146105_b((ITextComponent)new TextComponentString("The Queen is still pregnant - so no breeding for you uwu"), true);
                this.ai = this.field_70170_p.func_82737_E();
            }
            return;
        }
        UUID uUID = entityPlayer.getPersistentID();
        Vec3d vec3d3 = entityPlayer.func_174791_d();
        float f = entityPlayer.field_70177_z + 180.0f;
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
            this.field_70170_p.func_72900_e((Entity)e322);
        }
        this.ab.clear();
        e3 e33 = new e3(this.field_70170_p, this.f().toString(), this.k());
        e33.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        this.field_70170_p.func_72838_d((Entity)e33);
        this.ab.add(e33);
        e322 = new e3(this.field_70170_p, this.f().toString(), this.k());
        e322.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        this.field_70170_p.func_72838_d((Entity)e322);
        this.ab.add(e322);
        return this.ab;
    }

    void f() {
        if (this.aZ) {
            return;
        }
        this.field_70145_X = false;
        this.func_189654_d(false);
        if (!(this.aX || ((Boolean)this.m.func_187225_a(aC)).booleanValue() || ((String)this.m.func_187225_a(aK)).equals("") || this.y() != fp.NULL)) {
            this.field_70170_p.func_72900_e((Entity)this);
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
                this.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
                Vec3d vec3d2 = e3.a(new Vec3d(0.0, 0.0, 1.5), f, f2);
                this.field_70159_w = vec3d2.field_72450_a;
                this.field_70181_x = vec3d2.field_72448_b;
                this.field_70179_y = vec3d2.field_72449_c;
                if (!this.field_70170_p.field_72995_K) {
                    this.b(f2);
                }
            }
            this.field_70145_X = false;
            this.func_189654_d(false);
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
            return em2.func_174791_d();
        }
        EntityPlayer entityPlayer = em2.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return em2.func_174791_d();
        }
        return entityPlayer.func_174791_d().func_72441_c(0.0, (double)entityPlayer.func_70047_e(), 0.0).func_178787_e(e3.a(new Vec3d((double)0.4f, 0.0, 0.0), e3.d(em2), e3.c(em2)));
    }

    public static float c(em em2) {
        ai ai2 = (ai)((Object)em2);
        UUID uUID = ai2.e();
        if (uUID == null) {
            return 0.0f;
        }
        EntityPlayer entityPlayer = em2.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return 0.0f;
        }
        return entityPlayer.field_70759_as;
    }

    public static float d(em em2) {
        ai ai2 = (ai)((Object)em2);
        UUID uUID = ai2.e();
        if (uUID == null) {
            return 0.0f;
        }
        EntityPlayer entityPlayer = em2.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return 0.0f;
        }
        return entityPlayer.field_70125_A;
    }

    void J() {
        boolean bl;
        if (!this.field_70122_E) {
            return;
        }
        if (this.y() != fp.RUN) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 100.0);
        if (entityPlayer == null) {
            return;
        }
        double d = 20.0;
        do {
            if (d <= 0.0) {
                return;
            }
            Vec3d vec3d = this.func_174791_d().func_178788_d(entityPlayer.func_174791_d());
            Vec3d vec3d2 = new Vec3d(Math.abs(vec3d.field_72450_a), Math.abs(vec3d.field_72448_b), Math.abs(vec3d.field_72449_c));
            double d2 = vec3d2.field_72450_a / (vec3d2.field_72450_a + vec3d2.field_72449_c);
            double d4 = vec3d2.field_72449_c / (vec3d2.field_72450_a + vec3d2.field_72449_c);
            Vec3d vec3d3 = this.func_174791_d().func_178787_e(new Vec3d((double)(vec3d.field_72450_a > 0.0 ? 1 : -1) * d2 * d, 0.0, (double)(vec3d.field_72449_c > 0.0 ? 1 : -1) * d4 * d));
            PathNavigate pathNavigate = this.func_70661_as();
            pathNavigate.func_75499_g();
            bl = pathNavigate.func_75492_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, (double)0.825f);
            d -= 1.0;
        } while (!bl);
    }

    protected void func_70664_aZ() {
        if (this.y() == fp.RUN && !this.j()) {
            return;
        }
        super.func_70664_aZ();
    }

    boolean j() {
        PathNavigate pathNavigate = this.func_70661_as();
        Path path = pathNavigate.func_75505_d();
        if (path == null) {
            return true;
        }
        int n2 = path.func_75873_e();
        int n3 = path.func_75874_d();
        if (n3 == n2 || n3 - 1 == n2) {
            return true;
        }
        PathPoint pathPoint = path.func_75877_a(n2);
        PathPoint pathPoint2 = path.func_75877_a(n2 + 1);
        return pathPoint2.field_75837_b - pathPoint.field_75837_b == 1;
    }

    void B() {
        if (!this.aX) {
            return;
        }
        if (((Boolean)this.m.func_187225_a(aC)).booleanValue()) {
            return;
        }
        if (((Boolean)this.m.func_187225_a(aV)).booleanValue()) {
            return;
        }
        if (this.y() != fp.SIT) {
            return;
        }
        if (++this.aO < 32000) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 3000.0);
        if (entityPlayer == null) {
            return;
        }
        if (!entityPlayer.field_70122_E) {
            return;
        }
        if (entityPlayer.field_70160_al) {
            return;
        }
        Integer n2 = this.c(entityPlayer);
        if (n2 == null) {
            return;
        }
        Vec3d vec3d = entityPlayer.func_174791_d();
        Vec3d vec3d2 = this.func_174791_d();
        Vec3d vec3d3 = vec3d.func_178788_d(vec3d2);
        double d = Math.sqrt(vec3d3.field_72450_a * vec3d3.field_72450_a + vec3d3.field_72449_c * vec3d3.field_72449_c);
        if (d > 100.0) {
            return;
        }
        ItemStack itemStack = entityPlayer.field_71071_by.func_70301_a(n2.intValue()).func_77946_l();
        e3 e32 = new e3(this.field_70170_p, this.f().toString(), this.k());
        Vec3d vec3d4 = e3.b(new Vec3d(0.0, 0.0, (double)-0.2f), entityPlayer.field_70759_as);
        e32.func_70107_b(entityPlayer.field_70165_t + vec3d4.field_72450_a, entityPlayer.field_70163_u, entityPlayer.field_70161_v + vec3d4.field_72449_c);
        e32.b(fp.RUN);
        this.field_70170_p.func_72838_d((Entity)e32);
        e32.m.func_187227_b(a0, (Object)itemStack);
        entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("<%s> I got your %s hehe~", e32.c(), itemStack.func_82833_r())));
        entityPlayer.field_71071_by.func_70304_b(n2.intValue());
        this.aO = 0;
    }

    int k() {
        return Integer.parseInt(e3.a(this)[7]);
    }

    @Nullable
    Integer c(EntityPlayer entityPlayer) {
        NonNullList nonNullList = entityPlayer.field_71071_by.field_70462_a;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < nonNullList.size(); ++i) {
            ItemStack itemStack = (ItemStack)nonNullList.get(i);
            if (itemStack == ItemStack.field_190927_a || !ag.contains(itemStack.func_77973_b())) continue;
            arrayList.add(i);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Integer)arrayList.get(this.func_70681_au().nextInt(arrayList.size()));
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
        this.func_189654_d(true);
        this.b(fp.SIT);
    }

    @Override
    public void func_70071_h_() {
        block2: {
            this.i();
            e3.e(this);
            this.e();
            if (this.e() != null) {
                this.field_71087_bX = false;
            }
            super.func_70071_h_();
            this.y();
            this.H();
            this.F();
            if (!this.field_70170_p.field_72995_K) break block2;
            this.v();
            this.A();
            if (this.e() != null) {
                this.field_70145_X = true;
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

    public void func_70015_d(int n2) {
        block0: {
            if (this.e() != null) break block0;
            super.func_70015_d(n2);
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
        this.field_70170_p.func_72900_e((Entity)this);
    }

    void H() {
        if (((Boolean)this.m.func_187225_a(aC)).booleanValue()) {
            return;
        }
        if (this.y() != fp.THROWN) {
            return;
        }
        if (!this.field_70122_E && !this.func_70090_H()) {
            return;
        }
        this.ar = (float)((double)this.ar - 0.05);
        if (this.ar > 0.0f) {
            return;
        }
        if (this.field_70170_p.field_72995_K) {
            return;
        }
        this.b(fp.NULL);
        this.e((UUID)null);
        this.a((UUID)null);
        this.field_70170_p.func_72900_e((Entity)this);
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
        Minecraft.func_71410_x().field_71439_g.func_71053_j();
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
        Minecraft minecraft = Minecraft.func_71410_x();
        minecraft.field_71439_g.func_71053_j();
        minecraft.field_71474_y.field_74320_O = 2;
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
        if (fp2 == fp.START_THROWING && !this.field_70170_p.field_72995_K) {
            this.e(this.e());
            this.L();
        }
        if (fp2 == fp.PAIZURI_START && !this.field_70170_p.field_72995_K) {
            this.z();
        }
        if (fp2 == fp.NELSON_INTRO && !this.field_70170_p.field_72995_K) {
            this.q();
        }
        if (this.y() == fp.PAIZURI_CUM && fp2 == fp.NULL && !this.field_70170_p.field_72995_K) {
            this.D();
        }
        if (fp2 == fp.BREEDING_CUM_0) {
            this.m.func_187227_b(aV, (Object)true);
            this.av = this.field_70170_p.func_82737_E();
            this.ai = this.field_70170_p.func_82737_E();
        }
        if (fp2 == fp.BREEDING_CUM_0) {
            this.Z = 0;
        }
        if (fp2 == fp.NELSON_CUM) {
            this.m.func_187227_b(aV, (Object)true);
        }
        if (fp3 == fp.NELSON_CUM && fp2 != fp.NELSON_CUM) {
            this.m.func_187227_b(aV, (Object)false);
        }
        super.b(fp2);
    }

    void D() {
        block1: {
            EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
            if (entityPlayer != null) {
                s.a$a.a((EntityPlayerMP)entityPlayer);
            }
            this.e((UUID)null);
            this.a(false);
            this.field_70145_X = false;
            this.func_189654_d(false);
            this.m.func_187227_b(a0, (Object)ItemStack.field_190927_a);
            if (((Boolean)this.m.func_187225_a(aC)).booleanValue()) break block1;
            this.func_70634_a(this.l.field_72450_a, this.l.field_72448_b, this.l.field_72449_c);
            this.field_70170_p.func_72900_e((Entity)this);
        }
    }

    void q() {
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
        if (entityPlayer == null) {
            return;
        }
        this.a((UUID)null);
        this.c(entityPlayer.func_174791_d());
        this.b(entityPlayer.field_70177_z);
        this.a(true);
        this.field_70145_X = true;
        this.func_189654_d(true);
        entityPlayer.func_189654_d(true);
        entityPlayer.field_70145_X = true;
        this.e(entityPlayer.getPersistentID());
    }

    void z() {
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
        if (entityPlayer == null) {
            return;
        }
        this.a((UUID)null);
        this.c(entityPlayer.func_174791_d());
        this.b(entityPlayer.field_70177_z + 180.0f);
        this.a(true);
        this.field_70145_X = true;
        this.func_189654_d(true);
        entityPlayer.func_189654_d(true);
        entityPlayer.field_70145_X = true;
        this.e(entityPlayer.getPersistentID());
        entityPlayer.func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u - 0.5, entityPlayer.field_70161_v);
        entityPlayer.field_70125_A = 70.0f;
        entityPlayer.field_70127_C = 70.0f;
    }

    void L() {
        ItemStack itemStack = (ItemStack)this.m.func_187225_a(a0);
        if (itemStack == ItemStack.field_190927_a) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
        if (entityPlayer == null) {
            return;
        }
        entityPlayer.field_71071_by.func_70441_a(itemStack.func_77946_l());
        this.m.func_187227_b(a0, (Object)ItemStack.field_190927_a);
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
        EntityPlayer entityPlayer = em2.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            ai2.b(-1);
            em2.b(fp.NULL);
            ai2.a((UUID)null);
            return;
        }
        em2.func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
        if (em2.func_174791_d().func_72438_d(entityPlayer.func_174791_d()) > 10.0) {
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
        em2.field_70145_X = true;
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
        if (!((Boolean)this.m.func_187225_a(aC)).booleanValue() && !Minecraft.func_71410_x().field_71439_g.func_70685_l((Entity)this)) {
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
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        this.func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
        this.field_70145_X = true;
        this.func_189654_d(true);
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
        Block block = this.field_70170_p.func_180495_p(this.func_180425_c().func_177982_a(0, 1, 0)).func_177230_c();
        return !block.func_176205_b((IBlockAccess)this.field_70170_p, this.func_180425_c().func_177982_a(0, 1, 0));
    }

    public void func_180430_e(float f, float f2) {
        fp fp2 = this.y();
        if (fp2 == fp.THROWN || fp2 == fp.START_THROWING) {
            return;
        }
        super.func_180430_e(f, f2);
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
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
                double d = Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v);
                if (!((Boolean)this.m.func_187225_a(G)).booleanValue() && d > 0.0) {
                    if (this.field_70122_E && Math.abs(Math.abs(this.field_70167_r) - Math.abs(this.field_70163_u)) < (double)0.1f) {
                        if (d > (double)0.2f) {
                            this.a("animation.goblin.walk", true, animationEvent);
                        } else {
                            this.a("animation.goblin.walk", true, animationEvent);
                        }
                        this.field_70177_z = this.field_70759_as;
                        break;
                    }
                    this.a("animation.goblin.fly", true, animationEvent);
                    break;
                }
                this.a("animation.goblin.idle", true, animationEvent);
                break;
            }
            case "action": {
                Minecraft minecraft = Minecraft.func_71410_x();
                String string = minecraft.field_71439_g.getPersistentID().equals(this.e()) && minecraft.field_71474_y.field_74320_O == 0 ? "1" : "3";
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
                        if (this.field_70122_E) {
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
                    if (!"bj".equals(this.m.func_187225_a(h))) break;
                    this.b(fp.CATCH_BJ);
                    break;
                }
                case "catchBjDone": {
                    this.b(fp.CATCH_BJ_IDLE);
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
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
                    if (this.func_70681_au().nextBoolean()) break;
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
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    entityPlayerSP.field_70125_A = 70.0f;
                    entityPlayerSP.field_70127_C = 70.0f;
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
                    Minecraft minecraft = Minecraft.func_71410_x();
                    minecraft.field_71439_g.field_70177_z = this.I().floatValue() + 170.0f;
                    minecraft.field_71439_g.field_70125_A = -20.0f;
                    minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                    minecraft.field_71474_y.field_74320_O = 2;
                    break;
                }
                case "breedingHmm": {
                    if (this.n()) {
                        Minecraft minecraft = Minecraft.func_71410_x();
                        minecraft.field_71439_g.field_70177_z = this.I().floatValue() + 180.0f;
                        minecraft.field_71439_g.field_70125_A = -15.0f;
                        minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                        minecraft.field_71474_y.field_74320_O = 0;
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
                        Minecraft minecraft = Minecraft.func_71410_x();
                        minecraft.field_71474_y.field_74320_O = 2;
                        minecraft.field_71439_g.field_70177_z = this.I().floatValue() - 120.0f;
                        minecraft.field_71439_g.field_70125_A = -30.0f;
                    }
                }
                case "breedingIntroDone": {
                    this.b(fp.BREEDING_SLOW_0);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "breeding_slow1Done": {
                    if (this.func_70681_au().nextBoolean()) {
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
                    if (!this.func_70681_au().nextBoolean()) break;
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
                    Minecraft minecraft = Minecraft.func_71410_x();
                    minecraft.field_71474_y.field_74320_O = 0;
                    minecraft.field_71439_g.field_70177_z = this.I().floatValue() + 180.0f;
                    minecraft.field_71439_g.field_70125_A = -15.0f;
                    minecraft.field_71439_g.field_70759_as = minecraft.field_71439_g.field_70177_z;
                    minecraft.field_71474_y.field_74320_O = 0;
                    break;
                }
                case "neslon_introDone": {
                    this.b(fp.NELSON_SLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "nelson_slowDone": {
                    if (!this.func_70681_au().nextBoolean()) break;
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

    public static class c$c {
        static Minecraft a = null;

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(TickEvent.ClientTickEvent var1_1) {
            block12: {
                if (var1_1.phase == TickEvent.Phase.START) {
                    return;
                }
                var2_2 = new ArrayList<e3>();
                try lbl-1000:
                // 4 sources

                {
                    for (em var4_5 : em.ad()) {
                        if (!var4_5.field_70170_p.field_72995_K) {
                            continue;
                        }
                        ** GOTO lbl-1000
                    }
                    break block12;
                }
                catch (ConcurrentModificationException var3_4) {
                    // empty catch block
                    break block12;
                }
lbl-1000:
                // 1 sources

                {
                    if (!(var4_5 instanceof e3) || (var6_9 = (var5_8 = (e3)var4_5).e()) == null || (var7_10 = var5_8.field_70170_p.func_152378_a(var6_9)) == null || var7_10.field_71093_bK == var5_8.field_71093_bK) ** GOTO lbl-1000
                    var2_2.add(var5_8);
                }
                ** GOTO lbl-1000
            }
            var3_3 = var2_2.iterator();
            while (true) {
                if (!var3_3.hasNext()) {
                    return;
                }
                var4_7 = (e3)var3_3.next();
                var4_7.a((UUID)null);
                var4_7.e((UUID)null);
                var4_7.func_70106_y();
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SubscribeEvent
        public void a(PlayerEvent.PlayerChangedDimensionEvent var1_1) {
            block8: {
                var2_2 = var1_1.player;
                var3_3 = var2_2.getPersistentID();
                var4_4 = var1_1.toDim;
                var5_5 = var2_2.field_70170_p;
                var6_6 = null;
                try lbl-1000:
                // 4 sources

                {
                    for (em var8_9 : em.ad()) {
                        if (var8_9.field_70170_p.field_72995_K) {
                            continue;
                        }
                        ** GOTO lbl-1000
                    }
                    break block8;
                }
                catch (ConcurrentModificationException var7_8) {
                    // empty catch block
                    break block8;
                }
lbl-1000:
                // 1 sources

                {
                    if (!(var8_9 instanceof e3)) ** GOTO lbl-1000
                }
                {
                    var9_10 = (e3)var8_9;
                    if (!var3_3.equals(var9_10.e())) ** GOTO lbl-1000
                }
                {
                    var10_11 = var9_10.C();
                    var11_12 = var9_10.F();
                    var6_6 = var9_10;
                    var6_6.a((UUID)null);
                    var6_6.e((UUID)null);
                    var6_6.b(fp.NULL);
                    var12_13 = new e3(var5_5);
                    var12_13.field_71093_bK = var4_4;
                    var12_13.field_98038_p = true;
                    var12_13.f(var10_11);
                    var12_13.e(var11_12);
                    e3.access$000(var12_13).func_187227_b(e3.aC, (Object)true);
                    var5_5.func_72838_d((Entity)var12_13);
                    var12_13.func_70634_a(var2_2.field_70165_t, var2_2.field_70163_u, var2_2.field_70161_v);
                    var12_13.a(var3_3);
                    var12_13.b(fp.SHOULDER_IDLE);
                }
            }
            if (var6_6 == null) {
                return;
            }
            var5_5.func_72900_e(var6_6);
            em.ad().remove(var6_6);
        }

        @SubscribeEvent
        public void a(LivingAttackEvent livingAttackEvent) {
            block2: {
                if (livingAttackEvent.getSource() == DamageSource.field_76380_i) {
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
                a = Minecraft.func_71410_x();
            }
            if (c$c.a.field_71462_r instanceof ea) {
                return;
            }
            if (!ClientProxy.keyBindings[0].func_151468_f()) {
                return;
            }
            em em2 = null;
            UUID uUID = Minecraft.func_71410_x().field_71439_g.getPersistentID();
            try {
                for (em em3 : em.ad()) {
                    ai ai2;
                    if (!em3.field_70170_p.field_72995_K || !(em3 instanceof ai) || !uUID.equals((ai2 = (ai)((Object)em3)).e())) continue;
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
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new ea(em2));
        }

        private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
            return concurrentModificationException;
        }
    }
}
