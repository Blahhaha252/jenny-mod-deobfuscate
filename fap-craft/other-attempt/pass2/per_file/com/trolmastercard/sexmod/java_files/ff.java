/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.annotation.Nullable
 *  javax.vecmath.Vector4d
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockFalling
 *  net.minecraft.block.BlockLog
 *  net.minecraft.block.properties.PropertyBool
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.ai.EntityAITempt
 *  net.minecraft.entity.item.EntityFallingBlock
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.tileentity.TileEntityChest
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumFacing$Axis
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 *  net.minecraftforge.event.world.WorldEvent$Unload
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  net.minecraftforge.items.IItemHandler
 *  net.minecraftforge.items.ItemStackHandler
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.PlayState
 *  software.bernie.geckolib3.core.controller.AnimationController$ISoundListener
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.manager.AnimationData
 *  software.bernie.geckolib3.resource.GeckoLibCache
 */
package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.a1;
import com.trolmastercard.sexmod.a8;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.b3;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.ba;
import com.trolmastercard.sexmod.bh;
import com.trolmastercard.sexmod.bs;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.c7;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.co;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.dj;
import com.trolmastercard.sexmod.dr;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.dw;
import com.trolmastercard.sexmod.e1;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.en;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fm;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.g7;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.h6;
import com.trolmastercard.sexmod.hy;
import com.trolmastercard.sexmod.hz;
import com.trolmastercard.sexmod.m;
import com.trolmastercard.sexmod.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.vecmath.Vector4d;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockLog;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.resource.GeckoLibCache;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ff
extends e4
implements bh,
IInventory,
dr {
    public static final EyeAndKoboldColor aJ = EyeAndKoboldColor.PURPLE;
    public static final float Y = 0.25f;
    static final int ar = 20;
    static final int ag = 2;
    static final int aG = 30;
    static final int ah = 84;
    static final int a3 = 32;
    static final int a1 = 5;
    static final float ae = 1.5f;
    static final float aW = 20.0f;
    static final double au = 10.0;
    static final double ay = 2.0;
    static final double al = 3.0;
    static final int aQ = 300;
    static final int aq = 5;
    static final int aO = 100;
    static final int aB = 100;
    static final int ac = 2;
    static final float am = 2.0f;
    static final int aw = 300;
    static final float aj = 0.2f;
    static final double aH = 0.7;
    static final int aa = 142;
    public static final DataParameter<Float> aE = EntityDataManager.func_187226_a(ff.class, (DataSerializer)DataSerializers.field_187193_c).func_187156_b().func_187161_a(122);
    public static final DataParameter<String> T = EntityDataManager.func_187226_a(ff.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(123);
    public static final DataParameter<Boolean> aC = EntityDataManager.func_187226_a(ff.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(124);
    public static final DataParameter<Boolean> aZ = EntityDataManager.func_187226_a(ff.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(125);
    public static final DataParameter<String> aU = EntityDataManager.func_187226_a(ff.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(126);
    public static final DataParameter<Boolean> ak = EntityDataManager.func_187226_a(ff.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(127);
    public static final DataParameter<Boolean> at = EntityDataManager.func_187226_a(ff.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(128);
    public static final DataParameter<Optional<UUID>> aL = EntityDataManager.func_187226_a(ff.class, (DataSerializer)DataSerializers.field_187203_m).func_187156_b().func_187161_a(129);
    public static final int av = 24;
    public static double af = 69.0;
    public static List<Vector4d> aY = new ArrayList<Vector4d>();
    ItemStackHandler X = new ItemStackHandler(27);
    public String as = null;
    boolean az = false;
    int aP = 0;
    int U = 0;
    boolean a2 = false;
    int aD = 0;
    int a5 = 0;
    float S = Float.MAX_VALUE;
    static long aV = Long.MIN_VALUE;
    String[] an = new String[]{"What the fuck did you just fucking say about me, you little bitch? I'll have you know I graduated top of my class in the Navy Seals, and I've been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I'm the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the fuck out with precision the likes of which has never been seen before on this Earth, mark my fucking words. You think you can get away with saying that shit to me over the Internet? Think again, fucker. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You're fucking dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that's just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable ass off the face of the continent, you little shit. If only you could have known what unholy retribution your little \"clever\" comment was about to bring down upon you, maybe you would have held your fucking tongue. But you couldn't, you didn't, and now you're paying the price, you goddamn idiot. I will shit fury all over you and you will drown in it. You're fucking dead, kiddo.", "suck my iron cock you worthless piece of shit!", "you'll die a fucking virgin!", "not even Johnny sins would wanna stick his cock up ur ass", "fuck you with ur borderline illegal fetishes!", "ur cum tastes terrible!", "I've always faked my orgasms when having sex with you!", "Not even Jenny would fuck you for 6 diamonds!", "U look like u'd use a shovel to mine diamonds, fucking idiot!", "Why tf does ur cock smell like my asshole???", "do all of us a favor and hit [ALT]+[F4]!", "I'm about to say the N word!", "you are under attack retard", "Eat my ass!", "my tongue is longer than ur fucking dick bitch!", "Ligma titties!", "touch some grass bitch!"};
    IBlockState R = null;
    IBlockState aX = null;
    BlockPos aF = null;
    boolean ao = true;
    Vec3d aS = Vec3d.field_186680_a;
    BlockPos aM = null;
    BlockPos aI = null;
    int ai = 0;
    int Z = 0;
    int aK = 0;
    int a0 = 0;
    boolean ax = false;
    BlockPos ap = null;
    int ab = 0;
    int aR = 24;
    int W = 0;
    ItemStack ad = null;
    public boolean aA = false;
    int V = -1;
    boolean a4 = true;
    boolean aT = false;
    public boolean Q = false;
    int aN = 0;

    public ff(World world) {
        super(world);
        this.func_70105_a(0.5f, 0.99f);
    }

    ff(World world, UUID uUID, float f) {
        this(world);
        this.m.func_187227_b(aL, (Object)Optional.of((Object)uUID));
        this.m.func_187227_b(aE, (Object)Float.valueOf(f));
    }

    public static ff a(World world, UUID uUID) {
        float f = ff.j();
        return ff.a(world, uUID, f);
    }

    public static ff a(World world, UUID uUID, float f) {
        af = 10.0 - (double)f * 25.0;
        return new ff(world, uUID, f);
    }

    @Override
    protected String a(StringBuilder stringBuilder) {
        ff.b(stringBuilder, 8);
        ff.b(stringBuilder, 3);
        ff.b(stringBuilder);
        ff.b(stringBuilder);
        ff.a(stringBuilder, 2);
        ff.a(stringBuilder, 2);
        ff.a(stringBuilder, 1);
        ff.a(stringBuilder, 1);
        return stringBuilder.toString();
    }

    @Override
    public ArrayList<Integer> D() {
        return new ArrayList<Integer>(this){
            final /* synthetic */ ff this$0;
            {
                this.this$0 = ff2;
                this.add(101);
                this.add(EyeAndKoboldColor.values().length);
                this.add(EyeAndKoboldColor.values().length);
                this.add(8);
                this.add(3);
                this.add(101);
                this.add(101);
                this.add(3);
                this.add(3);
                this.add(4);
                this.add(2);
            }
        };
    }

    @Override
    public ArrayList<Integer> L() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(Math.round(((Float)this.m.func_187225_a(aE)).floatValue() * 100.0f / 0.25f));
        arrayList.add(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((String)this.m.func_187225_a(N))));
        arrayList.add(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((Vec3i)this.m.func_187225_a(K))));
        return arrayList;
    }

    @Override
    public void a(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        block5: for (int i = 0; i < list.size(); ++i) {
            int n2 = list.get(i);
            switch (i) {
                case 0: {
                    this.m.func_187227_b(aE, (Object)Float.valueOf((float)n2 / 100.0f * 0.25f));
                    continue block5;
                }
                case 1: {
                    String string = (String)this.m.func_187225_a(N);
                    String string2 = EyeAndKoboldColor.values()[n2].toString();
                    if (!string2.equals(string)) {
                        this.aA = true;
                    }
                    this.m.func_187227_b(N, (Object)string2);
                    continue block5;
                }
                case 2: {
                    this.m.func_187227_b(K, (Object)new BlockPos(EyeAndKoboldColor.values()[n2].getMainColor()));
                    continue block5;
                }
                default: {
                    ff.c(stringBuilder, n2);
                }
            }
        }
        this.m.func_187227_b(M, (Object)stringBuilder.toString());
        dj.c();
    }

    void m() {
        if (this.d == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        block5: for (int i = 0; i < this.d.size(); ++i) {
            Map.Entry entry = (Map.Entry)this.d.get(i);
            int n2 = (Integer)((Map.Entry)entry.getValue()).getValue();
            switch (i) {
                case 0: {
                    this.m.func_187227_b(aE, (Object)Float.valueOf((float)n2 / 100.0f * 0.25f));
                    continue block5;
                }
                case 1: {
                    this.m.func_187227_b(N, (Object)EyeAndKoboldColor.values()[n2].toString());
                    continue block5;
                }
                case 2: {
                    this.m.func_187227_b(K, (Object)new BlockPos(EyeAndKoboldColor.values()[n2].getMainColor()));
                    continue block5;
                }
                default: {
                    ff.c(stringBuilder, n2);
                }
            }
        }
        this.m.func_187227_b(M, (Object)stringBuilder.toString());
        dj.c();
    }

    @Override
    public e1 g(int n2) {
        switch (n2) {
            case 0: {
                return new e1(160, 0);
            }
            case 1: {
                return new e1(180, 0);
            }
            case 2: {
                return new e1(200, 0);
            }
            case 3: {
                return new e1(220, 0);
            }
            case 4: {
                return new e1(227, 20);
            }
            case 5: {
                return new e1(140, 40);
            }
            case 6: {
                return new e1(160, 40);
            }
            case 7: {
                return new e1(180, 40);
            }
            case 8: {
                return new e1(227, 40);
            }
            case 9: {
                return new e1(0, 130);
            }
            case 10: {
                return new e1(20, 130);
            }
        }
        return e1.a;
    }

    @Override
    public String c() {
        return (String)this.m.func_187225_a(T);
    }

    @Override
    public float i() {
        return 0.2f - (0.25f - ((Float)this.m.func_187225_a(aE)).floatValue());
    }

    public float func_70047_e() {
        return 0.94f;
    }

    public static float j() {
        return (float)(Math.random() * 0.25);
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.values()[this.func_70681_au().nextInt(EyeAndKoboldColor.values().length)];
        this.m.func_187214_a(K, (Object)new BlockPos(eyeAndKoboldColor.getMainColor()));
        this.m.func_187214_a(N, (Object)aJ.name());
        this.m.func_187214_a(aL, (Object)Optional.absent());
        this.m.func_187214_a(aE, (Object)Float.valueOf(0.0f));
        this.m.func_187214_a(T, (Object)ba.values()[this.func_70681_au().nextInt(ba.values().length)].toString());
        this.m.func_187214_a(aC, (Object)false);
        this.m.func_187214_a(aZ, (Object)false);
        this.m.func_187214_a(aU, (Object)"null");
        this.m.func_187214_a(ak, (Object)false);
        this.m.func_187214_a(at, (Object)false);
    }

    @Override
    protected void func_184651_r() {
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 0.4, false, new HashSet(I)));
        this.field_70714_bg.func_75776_a(3, (EntityAIBase)new hz((EntityLiving)this));
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.o);
    }

    protected float func_175134_bD() {
        return 0.45f;
    }

    @Override
    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(af);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(30.0);
    }

    @Override
    public boolean func_70104_M() {
        return true;
    }

    protected boolean func_184645_a(EntityPlayer entityPlayer, EnumHand enumHand) {
        if (this.ae() != null) {
            return false;
        }
        ItemStack itemStack = entityPlayer.func_184586_b(EnumHand.MAIN_HAND);
        if (!itemStack.func_77973_b().equals(Items.field_151057_cb)) {
            itemStack = entityPlayer.func_184586_b(EnumHand.OFF_HAND);
        }
        if (itemStack.func_77973_b().equals(Items.field_151057_cb) && entityPlayer.getPersistentID().toString().equals(this.m.func_187225_a(v))) {
            this.m.func_187227_b(T, (Object)itemStack.func_82833_r());
            itemStack.func_190918_g(1);
            return true;
        }
        if (((Boolean)this.m.func_187225_a(aC)).booleanValue()) {
            return false;
        }
        if (this.y() == fp.SLEEP) {
            return false;
        }
        ItemStack itemStack2 = entityPlayer.func_184586_b(EnumHand.MAIN_HAND);
        if (itemStack2.func_77973_b() != hy.b) {
            itemStack2 = entityPlayer.func_184586_b(EnumHand.OFF_HAND);
        }
        if (!this.J() && itemStack2.func_77973_b() == hy.b) {
            if (!this.field_70170_p.field_72995_K) {
                return true;
            }
            Optional optional = (Optional)this.m.func_187225_a(aL);
            if (!optional.isPresent()) {
                return true;
            }
            if (!aY.isEmpty()) {
                return true;
            }
            this.m((UUID)optional.get());
            return true;
        }
        if (this.J() && itemStack2.func_77973_b() == hy.b && ((String)this.m.func_187225_a(v)).equals(entityPlayer.getPersistentID().toString())) {
            entityPlayer.openGui((Object)Main.instance, 1, this.field_70170_p, this.func_180425_c().func_177958_n(), this.func_180425_c().func_177956_o(), this.func_180425_c().func_177952_p());
            return true;
        }
        if (this.field_70170_p.field_72995_K) {
            if (this.J() && ((String)this.m.func_187225_a(v)).equals(entityPlayer.getPersistentID().toString())) {
                this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_MASTER);
            }
            this.b(entityPlayer);
        } else {
            this.e(entityPlayer.getPersistentID());
            this.func_70661_as().func_75499_g();
            this.b((float)(Math.atan2(this.field_70161_v - entityPlayer.field_70161_v, this.field_70165_t - entityPlayer.field_70165_t) * 57.29577951308232 + 90.0));
            this.c(new Vec3d(this.field_70165_t, Math.floor(this.field_70163_u), this.field_70161_v));
            this.m.func_187227_b(G, (Object)true);
            this.b(fp.NULL);
        }
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    void m(UUID uUID) {
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new g7(uUID));
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean b(EntityPlayer entityPlayer) {
        if (this.J() && entityPlayer.getPersistentID().toString().equals(this.m.func_187225_a(v))) {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(this, entityPlayer, new String[]{"anal", "oral", "mating"}, null, false));
            return true;
        }
        if (this.func_70660_b(co.b) != null) {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(this, entityPlayer, new String[]{"anal", "oral"}, null, false));
            return true;
        }
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(this, entityPlayer, new String[]{"anal", "oral"}, new ItemStack[]{new ItemStack(Items.field_151043_k, 3), new ItemStack(Items.field_151035_b)}, false));
        return true;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void ac() {
        if (this.az) {
            this.az = false;
            return;
        }
        this.e((UUID)null);
        this.a("shouldbeattargetpos", "false");
    }

    @Override
    public void r() {
        this.Q = false;
        super.r();
    }

    protected void a(boolean bl, UUID uUID) {
        super.a(bl, true, uUID);
        d3.a(false);
    }

    @Override
    public void a(String string, UUID uUID) {
        block2: {
            this.az = true;
            if ("oral".equals(string)) {
                this.a("animationFollowUp", fp.STARTBLOWJOB.toString());
                this.a(true, uUID);
            }
            if ("anal".equals(string)) {
                this.a("animationFollowUp", fp.KOBOLD_ANAL_START.toString());
                this.a(true, uUID);
            }
            if (!"mating".equals(string)) break block2;
            this.a("animationFollowUp", fp.MATING_PRESS_START.toString());
            this.a(true, uUID);
        }
    }

    @Override
    public void b() {
        this.a2 = true;
        this.m.func_187227_b(G, (Object)false);
    }

    @Override
    protected void a() {
        dj.c();
    }

    boolean g() {
        if (!this.a2) {
            return false;
        }
        ++this.aD;
        this.field_70145_X = false;
        this.func_189654_d(false);
        if (this.aD > 40) {
            this.a2 = false;
            this.aD = 0;
            EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
            this.b(entityPlayer.field_70177_z + 180.0f);
            this.m.func_187227_b(G, (Object)true);
            entityPlayer.field_70145_X = true;
            entityPlayer.func_189654_d(true);
            this.field_70145_X = true;
            this.func_189654_d(true);
            this.func_70661_as().func_75499_g();
            this.U();
            return true;
        }
        this.field_70177_z = this.I().floatValue();
        this.func_189654_d(false);
        Vec3d vec3d = b6.a(this.func_174791_d(), this.o(), 40 - this.aD);
        this.func_70107_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
        this.b(fp.NULL);
        Optional optional = (Optional)this.m.func_187225_a(aL);
        if (!optional.isPresent()) {
            return true;
        }
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p((UUID)optional.get());
        if (collection == null) {
            return true;
        }
        for (bs bs2 : collection) {
            bs2.c(this);
        }
        return true;
    }

    void o(UUID uUID) {
        if (this.V == -1) {
            return;
        }
        if (++this.V < 132) {
            return;
        }
        this.V = -1;
        if (this.y() != fp.MATING_PRESS_CUM) {
            return;
        }
        UUID uUID2 = this.ae();
        if (uUID2 == null) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID2);
        if (entityPlayer == null) {
            return;
        }
        EyeAndKoboldColor eyeAndKoboldColor = com.trolmastercard.sexmod.ax.l(uUID);
        ItemStack itemStack = new ItemStack((Item)c7.a, 1, eyeAndKoboldColor.getWoolMeta());
        NBTTagCompound nBTTagCompound = itemStack.func_77978_p();
        if (nBTTagCompound == null) {
            nBTTagCompound = new NBTTagCompound();
        }
        nBTTagCompound.func_74778_a("tribeID", uUID.toString());
        nBTTagCompound.func_74778_a("tribeColor", eyeAndKoboldColor.toString());
        itemStack.func_77982_d(nBTTagCompound);
        entityPlayer.field_71071_by.func_70441_a(itemStack);
    }

    @Override
    public void func_70619_bc() {
        Object object;
        super.func_70619_bc();
        this.ax = false;
        Optional optional = (Optional)this.m.func_187225_a(aL);
        if (optional.isPresent()) {
            this.o((UUID)optional.get());
            com.trolmastercard.sexmod.ax.k((UUID)optional.get());
            object = this.z();
            if (object != null) {
                com.trolmastercard.sexmod.ax.a((UUID)optional.get(), object.getPersistentID());
            }
        }
        if (this.g()) {
            return;
        }
        if (this.ae() != null) {
            return;
        }
        if (!((Boolean)this.m.func_187225_a(aC)).booleanValue()) {
            if (this.func_110143_aJ() != this.func_110138_aP() && ++this.a5 >= 100) {
                this.func_70606_j(this.func_110143_aJ() + 2.0f);
                this.a5 = 0;
                ge.b.sendToAllTracking((IMessage)new en(this.f(), EnumParticleTypes.HEART.func_179346_b()), (Entity)this);
            }
        } else {
            this.a5 = 0;
        }
        if (!((Boolean)this.m.func_187225_a(G)).booleanValue()) {
            this.func_189654_d(false);
        }
        if (!optional.isPresent()) {
            return;
        }
        --this.aP;
        if (this.y() == fp.ATTACK) {
            this.func_70661_as().func_75499_g();
            this.field_70177_z = this.I().floatValue();
            this.field_70759_as = this.I().floatValue();
            ++this.U;
            if (22 == this.U) {
                this.u();
            }
            if (32 == this.U) {
                object = com.trolmastercard.sexmod.ax.e((UUID)optional.get());
                HashSet<EntityLivingBase> hashSet = new HashSet<EntityLivingBase>();
                Iterator iterator = ((HashSet)object).iterator();
                while (iterator.hasNext()) {
                    EntityLivingBase entityLivingBase = (EntityLivingBase)iterator.next();
                    if (entityLivingBase.func_70032_d((Entity)this) > 2.0f) continue;
                    entityLivingBase.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 5.0f);
                    if (!entityLivingBase.field_70128_L) continue;
                    hashSet.add(entityLivingBase);
                }
                for (EntityLivingBase entityLivingBase : hashSet) {
                    com.trolmastercard.sexmod.ax.b((UUID)optional.get(), entityLivingBase);
                }
            }
            if (84 <= this.U) {
                this.b(fp.NULL);
                this.m.func_187227_b(G, (Object)false);
                this.U = 0;
            }
            return;
        }
        this.m.func_187227_b(aC, (Object)this.c((UUID)optional.get(), false));
        this.m.func_187227_b(aZ, (Object)com.trolmastercard.sexmod.ax.e((UUID)optional.get(), this));
        this.m.func_187227_b(ak, (Object)com.trolmastercard.sexmod.ax.c((UUID)optional.get()));
        this.d();
        this.h();
        this.o.a = this.o();
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
        this.t();
        this.v();
        this.q();
        this.w();
        this.m();
    }

    void w() {
        if (!this.field_70170_p.field_72995_K) {
            return;
        }
        if (this.field_70170_p.func_82737_E() - 300L < aV) {
            return;
        }
        if (!this.J()) {
            return;
        }
        if (this.y() != fp.NULL) {
            return;
        }
        if (!"".equals(this.m.func_187225_a(h))) {
            return;
        }
        if (((Boolean)this.m.func_187225_a(ak)).booleanValue()) {
            return;
        }
        String string = (String)this.m.func_187225_a(v);
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 10.0);
        if (entityPlayer == null) {
            this.S = Float.MAX_VALUE;
            return;
        }
        if (!entityPlayer.getPersistentID().toString().equals(string)) {
            return;
        }
        float f = this.func_70032_d((Entity)entityPlayer);
        if (f < 2.0f && this.S > 2.0f) {
            this.b(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_HEYMASTER));
            this.a("Hey master!");
            aV = this.field_70170_p.func_82737_E();
        }
        this.S = f;
    }

    void q() {
        if (!this.field_70170_p.field_72995_K) {
            return;
        }
        if (this.y() == fp.SLEEP) {
            return;
        }
        if (!((Boolean)this.m.func_187225_a(ak)).booleanValue()) {
            return;
        }
        if (!this.J()) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(UUID.fromString((String)this.m.func_187225_a(v)));
        if (entityPlayer == null) {
            return;
        }
        this.b(entityPlayer);
    }

    void t() {
        if (((Boolean)this.m.func_187225_a(aC)).booleanValue()) {
            return;
        }
        if (this.J()) {
            return;
        }
        Optional optional = (Optional)this.m.func_187225_a(aL);
        if (!optional.isPresent()) {
            return;
        }
        for (EntityPlayer entityPlayer : this.field_70170_p.field_73010_i) {
            double d;
            double d2 = d = entityPlayer.func_174791_d().func_72438_d(this.func_174791_d());
            if (!this.field_70170_p.field_72995_K) {
                for (ff ff2 : com.trolmastercard.sexmod.ax.n((UUID)optional.get())) {
                    double d4 = entityPlayer.func_174791_d().func_72438_d(ff2.func_174791_d());
                    if (!(d4 < d2)) continue;
                    d2 = d4;
                }
            }
            if (d2 > 10.0) continue;
            if (entityPlayer.func_184586_b(EnumHand.MAIN_HAND).func_77973_b() != hy.b && entityPlayer.func_184586_b(EnumHand.OFF_HAND).func_77973_b() != hy.b) {
                return;
            }
            PathNavigate pathNavigate = this.func_70661_as();
            pathNavigate.func_75499_g();
            if (this.field_70170_p.field_72995_K) {
                this.b(entityPlayer);
            } else if (d > 2.0) {
                ff ff2;
                ff2 = this.c(entityPlayer.func_180425_c());
                pathNavigate.func_75492_a((double)ff2.func_177958_n(), (double)ff2.func_177956_o(), (double)ff2.func_177952_p(), (double)0.35f);
            }
            return;
        }
    }

    @Override
    protected void U() {
        block7: {
            boolean bl;
            String string = (String)this.m.func_187225_a(em.h);
            boolean bl2 = this.func_70660_b(co.b) != null;
            boolean bl3 = false;
            if (this.J()) {
                bl3 = ((String)this.m.func_187225_a(v)).equals(this.ae().toString());
            }
            boolean bl4 = bl = !bl2 && !bl3;
            if (string.equals(fp.STARTBLOWJOB.toString())) {
                if (!bl || this.y() == fp.PAYMENT) {
                    this.b(fp.STARTBLOWJOB);
                } else {
                    this.b(fp.PAYMENT);
                }
            }
            if (string.equals(fp.KOBOLD_ANAL_START.toString())) {
                if (!bl || this.y() == fp.PAYMENT) {
                    this.b(fp.KOBOLD_ANAL_START);
                } else {
                    this.b(fp.PAYMENT);
                }
            }
            if (!string.equals(fp.MATING_PRESS_START.toString())) break block7;
            this.b(fp.MATING_PRESS_START);
        }
    }

    void v() {
        if (!this.field_70170_p.field_72995_K) {
            return;
        }
        UUID uUID = this.ae();
        if (uUID == null) {
            return;
        }
        if (!((Boolean)this.m.func_187225_a(G)).booleanValue()) {
            return;
        }
        if (this.y() != fp.NULL) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        this.b(entityPlayer);
    }

    void b(EntityPlayer entityPlayer) {
        ei ei2 = ei.d(entityPlayer.getPersistentID());
        Vec3d vec3d = new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u + (double)(ei2 == null ? entityPlayer.eyeHeight : ei2.func_70047_e()), entityPlayer.field_70161_v);
        Vec3d vec3d2 = new Vec3d(this.field_70165_t, this.field_70163_u + (double)this.func_70047_e(), this.field_70161_v);
        double d = vec3d2.func_72438_d(vec3d);
        double d2 = vec3d.field_72448_b - vec3d2.field_72448_b;
        this.field_70125_A = (float)(-(Math.sin(d2 / d) * 57.29577951308232));
    }

    void u() {
    }

    boolean o() {
        if (this.y() != fp.NULL) {
            return false;
        }
        if (Math.abs(this.field_70159_w) + Math.abs(this.field_70179_y) > 0.01) {
            return false;
        }
        return !this.a();
    }

    void d() {
        Optional optional = (Optional)this.m.func_187225_a(aL);
        if (!optional.isPresent()) {
            return;
        }
        UUID uUID = (UUID)optional.get();
        if (!((Boolean)this.m.func_187225_a(aC)).booleanValue() && com.trolmastercard.sexmod.ax.c(uUID)) {
            if (!this.J()) {
                return;
            }
            EntityPlayer entityPlayer = this.z();
            if (entityPlayer == null) {
                return;
            }
            for (bs bs2 : com.trolmastercard.sexmod.ax.p(uUID)) {
                if (!bs2.b(this)) continue;
                bs2.c(this);
                this.b(fp.NULL);
                this.m.func_187227_b(G, (Object)false);
            }
            this.field_70145_X = false;
            this.func_189654_d(false);
            PathNavigate pathNavigate = this.func_70661_as();
            double d = this.func_174791_d().func_72438_d(entityPlayer.func_174791_d());
            if (d > 2.0) {
                pathNavigate.func_75497_a((Entity)entityPlayer, this.a(entityPlayer, d));
                this.k();
                if (d > 15.0) {
                    this.c(entityPlayer);
                }
            }
        } else if (com.trolmastercard.sexmod.ax.e(uUID, this)) {
            this.b(uUID);
        } else {
            this.n(uUID);
        }
    }

    protected double a(EntityPlayer entityPlayer, double d) {
        double d2 = entityPlayer.func_70051_ag() ? 0.7 : 0.35;
        double d4 = Math.floor(d / 5.0) * 0.3;
        d2 += d4;
        if (this.func_70090_H()) {
            d2 *= 60.0;
        }
        return d2;
    }

    void s(UUID uUID) {
        block2: {
            BlockPos blockPos = com.trolmastercard.sexmod.ax.m(uUID);
            if (blockPos == null) {
                return;
            }
            if (this.aX != null) {
                this.field_70170_p.func_175656_a(blockPos, this.aX);
            }
            if (this.R == null) break block2;
            this.field_70170_p.func_175656_a(blockPos.func_177982_a(0, -1, 0), this.R);
        }
    }

    void b(UUID uUID) {
        fm fm2;
        if (this.d(uUID)) {
            return;
        }
        if (!this.J() && com.trolmastercard.sexmod.ax.g(uUID)) {
            this.func_70661_as().func_75499_g();
            this.aM = null;
            return;
        }
        fm fm3 = com.trolmastercard.sexmod.ax.i(uUID);
        if (fm3 != (fm2 = this.p())) {
            com.trolmastercard.sexmod.ax.a(uUID, fm2);
            switch (fm2) {
                case REST: {
                    this.p(uUID);
                    com.trolmastercard.sexmod.ax.b(uUID, null);
                    this.h("okay resting time owo");
                    break;
                }
                case ACTIVE: {
                    this.s(uUID);
                    this.q(uUID);
                }
            }
        }
        switch (fm2) {
            case ACTIVE: {
                this.aF = null;
                this.c(uUID);
                break;
            }
            case REST: {
                this.l(uUID);
            }
        }
    }

    void p(UUID uUID) {
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
        if (collection == null) {
            return;
        }
        for (bs bs2 : collection) {
            bs2.a();
        }
    }

    void q(UUID uUID) {
        if (!this.J()) {
            return;
        }
        List<ff> list = com.trolmastercard.sexmod.ax.n(uUID);
        for (ff ff2 : list) {
            com.trolmastercard.sexmod.ax.b(ff2);
            if (ff2.ae() != null) continue;
            ff2.field_70145_X = false;
            ff2.func_189654_d(false);
            ff2.func_184212_Q().func_187227_b(G, (Object)false);
            ff2.b(fp.NULL);
        }
    }

    void l(UUID uUID) {
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
        if (collection != null) {
            for (bs bs2 : collection) {
                bs2.c(this);
            }
        }
        if (this.J()) {
            this.i(uUID);
        } else {
            this.a(uUID);
        }
    }

    void i(UUID uUID) {
        BlockPos[] blockPosArray = com.trolmastercard.sexmod.ax.a(this);
        if (blockPosArray != null) {
            Vec3d vec3d = new Vec3d((double)((float)blockPosArray[0].func_177958_n() + 0.5f), (double)blockPosArray[0].func_177956_o() + 0.5625, (double)((float)blockPosArray[0].func_177952_p() + 0.5f));
            Vec3d vec3d2 = new Vec3d((double)((float)blockPosArray[1].func_177958_n() + 0.5f), (double)blockPosArray[1].func_177956_o() + 0.5625, (double)((float)blockPosArray[1].func_177952_p() + 0.5f));
            boolean bl = vec3d.func_178788_d((Vec3d)vec3d2).field_72450_a == 0.0;
            Vec3d vec3d3 = b6.a(vec3d, vec3d2, 0.5);
            this.m.func_187227_b(G, (Object)true);
            this.c(vec3d3);
            this.b(bl ? 0.0f : 90.0f);
            this.field_70145_X = true;
            this.func_189654_d(true);
            return;
        }
        HashSet<BlockPos> hashSet = com.trolmastercard.sexmod.ax.j(uUID);
        BlockPos blockPos = null;
        if (hashSet == null) {
            return;
        }
        for (BlockPos blockPos2 : hashSet) {
            IBlockState iBlockState = this.field_70170_p.func_180495_p(blockPos2);
            boolean bl = false;
            for (Map.Entry entry : iBlockState.func_177228_b().entrySet()) {
                if (!(entry.getKey() instanceof PropertyBool)) continue;
                bl = (Boolean)entry.getValue();
                break;
            }
            if (bl || com.trolmastercard.sexmod.ax.a(blockPos2)) continue;
            if (blockPos == null) {
                blockPos = blockPos2;
                continue;
            }
            if (!(this.func_174818_b(blockPos) > this.func_174818_b(blockPos2))) continue;
            blockPos = blockPos2;
        }
        if (blockPos == null) {
            return;
        }
        if (blockPos.func_185332_f((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) > 2.0) {
            if (Math.abs(blockPos.func_177973_b((Vec3i)this.func_180425_c()).func_177956_o()) > 4) {
                this.b(blockPos.func_177982_a(0, 1, 0));
            } else {
                BlockPos blockPos3 = this.c(blockPos);
                this.func_70661_as().func_75492_a((double)blockPos3.func_177958_n(), (double)blockPos3.func_177956_o(), (double)blockPos3.func_177952_p(), (double)0.35f);
                if (this.func_70661_as().func_75505_d() == null) {
                    this.b(blockPos.func_177982_a(0, 1, 0));
                }
            }
            return;
        }
        com.trolmastercard.sexmod.ax.a(this, blockPos);
        this.b(fp.SLEEP);
    }

    void a(UUID uUID) {
        BlockPos blockPos = com.trolmastercard.sexmod.ax.m(uUID);
        if (blockPos == null && com.trolmastercard.sexmod.ax.e(uUID, this)) {
            BlockPos blockPos2 = this.func_180425_c().func_177982_a(1, 0, 0);
            this.R = this.field_70170_p.func_180495_p(blockPos2.func_177982_a(0, -1, 0));
            this.aX = this.field_70170_p.func_180495_p(blockPos2);
            this.field_70170_p.func_175656_a(blockPos2.func_177982_a(0, -1, 0), Blocks.field_150424_aL.func_176223_P());
            this.field_70170_p.func_175656_a(blockPos2, dw.a.func_176223_P());
            com.trolmastercard.sexmod.ax.b(uUID, blockPos2);
        }
        if (blockPos == null) {
            return;
        }
        if (this.aF == null) {
            this.aF = blockPos.func_177982_a((this.func_70681_au().nextBoolean() ? 1 : -1) * (this.func_70681_au().nextInt(2) + 1), 0, (this.func_70681_au().nextBoolean() ? 1 : -1) * (this.func_70681_au().nextInt(2) + 1));
        }
        this.func_70661_as().func_75492_a((double)this.aF.func_177958_n(), (double)this.aF.func_177956_o(), (double)this.aF.func_177952_p(), (double)0.35f);
        this.k();
    }

    void c(UUID uUID) {
        if (this.J()) {
            com.trolmastercard.sexmod.ax.b(uUID, null);
            this.g(uUID);
            return;
        }
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
        if (collection == null) {
            return;
        }
        if (this.ao) {
            this.aM = null;
            this.b(uUID, collection);
        } else {
            this.a(uUID, collection);
        }
    }

    void b(UUID uUID, Collection<bs> collection) {
        block0: {
            if (!collection.isEmpty()) break block0;
            this.ao = false;
            this.r(uUID);
            this.h("Lets go somewhere else");
        }
    }

    void a(UUID uUID, Collection<bs> collection) {
        BlockPos blockPos = com.trolmastercard.sexmod.ax.m(uUID);
        if (blockPos == null) {
            this.r(uUID);
            return;
        }
        if (this.field_70173_aa % 40 == 0) {
            if (this.aS.equals((Object)this.func_174791_d())) {
                this.r(uUID);
                this.aM = null;
            }
            this.aS = this.func_174791_d();
        }
        if (this.aM == null || this.aM.func_185332_f((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 4.0) {
            this.aM = this.t(uUID);
        }
        this.func_70661_as().func_75492_a((double)this.aM.func_177958_n(), (double)this.aM.func_177956_o(), (double)this.aM.func_177952_p(), (double)0.35f);
        this.k();
        if (Math.sqrt(this.func_180425_c().func_177951_i((Vec3i)blockPos)) > 5.0) {
            return;
        }
        this.ao = true;
        this.h("Time to work bitches!");
        int n2 = com.trolmastercard.sexmod.ax.h(uUID);
        for (int i = 1; i < n2; ++i) {
            this.c(uUID, collection);
        }
        com.trolmastercard.sexmod.ax.b(uUID, null);
    }

    protected void c(EntityPlayer entityPlayer) {
        BlockPos blockPos;
        int n2 = 0;
        do {
            blockPos = entityPlayer.func_180425_c().func_177982_a(com.trolmastercard.sexmod.r.f.nextInt(10), 0, com.trolmastercard.sexmod.r.f.nextInt(10));
        } while (++n2 < 20 && !this.func_184595_k(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p()));
        if (n2 == 20) {
            this.func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
        }
        this.field_70159_w = 0.0;
        this.field_70181_x = 0.0;
        this.field_70179_y = 0.0;
    }

    BlockPos t(UUID uUID) {
        BlockPos blockPos = com.trolmastercard.sexmod.ax.m(uUID);
        if (blockPos == null) {
            return BlockPos.field_177992_a;
        }
        return this.c(blockPos);
    }

    BlockPos c(BlockPos blockPos) {
        BlockPos blockPos2 = this.func_180425_c();
        BlockPos blockPos3 = blockPos.func_177973_b((Vec3i)blockPos2);
        if (Math.abs(blockPos3.func_177958_n()) + Math.abs(blockPos3.func_177952_p()) < 20) {
            return blockPos;
        }
        double d = Math.min(Math.abs(blockPos3.func_177958_n()), Math.abs(blockPos3.func_177952_p()));
        double d2 = Math.max(Math.abs(blockPos3.func_177958_n()), Math.abs(blockPos3.func_177952_p()));
        double d4 = d / (d2 + d);
        int n2 = (int)((double)((blockPos3.func_177958_n() > 0 ? 1 : -1) * 20) * (d == (double)Math.abs(blockPos3.func_177958_n()) ? d4 : 1.0 - d4));
        int n3 = (int)((double)((blockPos3.func_177952_p() > 0 ? 1 : -1) * 20) * (d == (double)Math.abs(blockPos3.func_177952_p()) ? d4 : 1.0 - d4));
        BlockPos blockPos4 = this.func_180425_c().func_177982_a(n2, 0, n3);
        blockPos4 = new BlockPos(blockPos4.func_177958_n(), cj.a(this.field_70170_p, blockPos4.func_177958_n(), blockPos4.func_177952_p()) + 1, blockPos4.func_177952_p());
        return blockPos4;
    }

    void r(UUID uUID) {
        BlockPos blockPos;
        int n2 = 0;
        do {
            blockPos = this.func_180425_c();
            blockPos = blockPos.func_177982_a((50 + this.func_70681_au().nextInt(50)) * (this.func_70681_au().nextBoolean() ? 1 : -1), 0, (50 + this.func_70681_au().nextInt(50)) * (this.func_70681_au().nextBoolean() ? 1 : -1));
        } while (((blockPos = new BlockPos(blockPos.func_177958_n(), cj.a(this.field_70170_p, blockPos.func_177958_n(), blockPos.func_177952_p()), blockPos.func_177952_p())).func_177956_o() <= 0 || !this.func_70661_as().func_188555_b(blockPos)) && ++n2 < 100);
        com.trolmastercard.sexmod.ax.b(uUID, blockPos);
    }

    void c(UUID uUID, Collection<bs> collection) {
        List<BlockPos> list = this.a(this.func_180425_c(), BlockLog.class, 30, 4, null);
        BlockPos blockPos = null;
        for (BlockPos blockPos2 : list) {
            Block block = this.field_70170_p.func_180495_p(blockPos2.func_177977_b()).func_177230_c();
            if (block instanceof BlockLog || block == Blocks.field_150350_a) continue;
            boolean bl = false;
            for (bs bs2 : collection) {
                if (!bs2.c(blockPos2)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            blockPos = blockPos2;
            break;
        }
        if (blockPos == null) {
            return;
        }
        bs.a(this.field_70170_p, blockPos, uUID);
        this.h("Someone, go fall this tree!");
    }

    fm p() {
        long l = this.field_70170_p.func_72820_D();
        if (l < 12000L) {
            return fm.ACTIVE;
        }
        return fm.REST;
    }

    boolean d(UUID uUID) {
        return this.c(uUID, true);
    }

    boolean c(UUID uUID, boolean bl) {
        Optional optional;
        Object object2;
        HashSet<EntityLivingBase> hashSet = com.trolmastercard.sexmod.ax.e(uUID);
        ff ff2 = com.trolmastercard.sexmod.ax.f(uUID);
        if (ff2 == null) {
            return false;
        }
        for (Object object2 : this.field_70170_p.func_72872_a(ff.class, new AxisAlignedBB(ff2.field_70165_t - 30.0, ff2.field_70163_u - 30.0, ff2.field_70161_v - 30.0, ff2.field_70165_t + 30.0, ff2.field_70163_u + 30.0, ff2.field_70161_v + 30.0))) {
            if (!this.func_70685_l((Entity)object2) || ((em)((Object)object2)).J() && this.J()) continue;
            optional = (Optional)object2.func_184212_Q().func_187225_a(aL);
            if (!optional.isPresent()) {
                hashSet.add((EntityLivingBase)object2);
                continue;
            }
            if (((UUID)optional.get()).equals(uUID)) continue;
            hashSet.add((EntityLivingBase)object2);
        }
        EntityLivingBase entityLivingBase = null;
        object2 = new ArrayList();
        for (EntityLivingBase entityLivingBase2 : hashSet) {
            if (entityLivingBase2.field_70128_L) {
                object2.add(entityLivingBase2);
                continue;
            }
            if (ff2.func_70032_d((Entity)entityLivingBase2) > 30.0f || entityLivingBase != null && !(this.func_70032_d((Entity)entityLivingBase) > this.func_70032_d((Entity)entityLivingBase2))) continue;
            entityLivingBase = entityLivingBase2;
        }
        optional = object2.iterator();
        while (optional.hasNext()) {
            EntityLivingBase entityLivingBase2;
            entityLivingBase2 = (EntityLivingBase)optional.next();
            com.trolmastercard.sexmod.ax.b(uUID, entityLivingBase2);
        }
        if (entityLivingBase == null) {
            return false;
        }
        if (!bl) {
            return true;
        }
        if (this.y() != fp.ATTACK) {
            this.m.func_187227_b(G, (Object)false);
            this.b(fp.NULL);
        }
        optional = this.c(entityLivingBase.func_180425_c());
        this.func_70661_as().func_75492_a((double)optional.func_177958_n(), (double)optional.func_177956_o(), (double)optional.func_177952_p(), 0.7);
        this.k();
        if (this.func_70032_d((Entity)entityLivingBase) > 1.5f) {
            return true;
        }
        if (this.aP > 0) {
            return true;
        }
        float f = (float)(Math.atan2(this.field_70161_v - entityLivingBase.field_70161_v, this.field_70165_t - entityLivingBase.field_70165_t) * 57.29577951308232 + 90.0);
        this.b(f);
        this.b(fp.ATTACK);
        this.aP = 84;
        return true;
    }

    void n(UUID uUID) {
        if (this.d(uUID)) {
            return;
        }
        fm fm2 = com.trolmastercard.sexmod.ax.i(uUID);
        switch (fm2) {
            case REST: {
                this.l(uUID);
                break;
            }
            case ACTIVE: {
                this.aF = null;
                this.h(uUID);
            }
        }
    }

    void h(UUID uUID) {
        BlockPos blockPos = com.trolmastercard.sexmod.ax.m(uUID);
        if (blockPos == null) {
            this.aM = null;
            this.g(uUID);
            return;
        }
        ff ff2 = com.trolmastercard.sexmod.ax.f(uUID);
        if (com.trolmastercard.sexmod.ax.g(uUID)) {
            this.func_70661_as().func_75499_g();
            this.aM = null;
            return;
        }
        if (ff2 == null) {
            System.out.println("leader of tribe " + uUID + " is null");
            return;
        }
        if (ff2.func_70032_d((Entity)this) > 20.0f) {
            this.func_70107_b(ff2.field_70165_t, ff2.field_70163_u, ff2.field_70161_v);
            this.aM = null;
        }
        if (this.field_70173_aa % 40 == 0) {
            if (this.aS.equals((Object)this.func_174791_d())) {
                this.aM = this.t(uUID);
            }
            this.aS = this.func_174791_d();
        }
        if (this.aM == null || this.aM.func_185332_f((int)this.field_70165_t, (int)this.field_70163_u, (int)this.field_70161_v) < 4.0) {
            this.aM = this.t(uUID);
        }
        this.func_70661_as().func_75492_a((double)this.aM.func_177958_n(), (double)this.aM.func_177956_o(), (double)this.aM.func_177952_p(), (double)0.35f);
        this.k();
    }

    void g(UUID uUID) {
        block9: {
            if (this.ae() != null) {
                return;
            }
            Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
            if (collection == null) {
                return;
            }
            bs bs2 = null;
            for (bs bs3 : collection) {
                if (!bs3.b(this)) continue;
                bs2 = bs3;
                break;
            }
            if (bs2 == null) {
                for (bs bs3 : collection) {
                    if (this.J() && !this.c(uUID, bs3)) continue;
                    if (!this.a(bs3)) {
                        this.ax = true;
                        continue;
                    }
                    if (!bs3.a(this)) continue;
                    bs2 = bs3;
                    this.aI = null;
                    if (bs3.d() == bs.a$a.FALL_TREE) {
                        this.h("Ima fall this tree owo");
                        break;
                    }
                    this.h("Ima go mine uwu");
                    this.b(bs3.b());
                    this.field_70170_p.func_175656_a(bs3.b(), Blocks.field_150350_a.func_176223_P());
                    break;
                }
            }
            if (bs2 == null) {
                this.u(uUID);
                return;
            }
            if (bs2.d() == bs.a$a.FALL_TREE) {
                this.a(uUID, bs2.b(), bs2);
            }
            if (bs2.d() != bs.a$a.MINE) break block9;
            this.b(uUID, bs2);
        }
    }

    void b(BlockPos blockPos) {
        ge.b.sendToAllTracking((IMessage)new en(this.f(), EnumParticleTypes.PORTAL.func_179346_b(), 30), new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 30.0));
        this.func_70107_b(0.5f + (float)blockPos.func_177958_n(), blockPos.func_177956_o(), 0.5f + (float)blockPos.func_177952_p());
        ge.b.sendToAllTracking((IMessage)new en(this.f(), EnumParticleTypes.PORTAL.func_179346_b(), 30), new NetworkRegistry.TargetPoint(this.field_71093_bK, this.field_70165_t, this.field_70163_u, this.field_70161_v, 30.0));
    }

    void b(UUID uUID, bs bs2) {
        block4: {
            if (this.y() != fp.MINE) {
                this.a(uUID, bs2);
                return;
            }
            --this.Z;
            --this.ai;
            if (this.ai == 0) {
                IBlockState iBlockState;
                IBlockState iBlockState2 = this.field_70170_p.func_180495_p(this.aI.func_177984_a());
                if (!(iBlockState2.func_177230_c() instanceof BlockFalling)) {
                    bs2.a(this.aI);
                    iBlockState = this.z();
                    if (iBlockState != null) {
                        ge.b.sendTo((IMessage)new h6(this.aI, false), (EntityPlayerMP)iBlockState);
                    }
                }
                iBlockState = this.field_70170_p.func_180495_p(this.aI);
                this.b(new ItemStack(iBlockState.func_177230_c().func_180660_a(iBlockState, this.func_70681_au(), 0), 1, iBlockState.func_177230_c().func_180651_a(iBlockState)));
                this.field_70170_p.func_175655_b(this.aI, false);
            }
            if (this.Z > 0) break block4;
            this.Z = 100;
            this.ai = 24;
            this.b(fp.NULL);
        }
    }

    void a(UUID uUID, bs bs2) {
        PathNavigate pathNavigate = this.func_70661_as();
        if (this.aI == null || !bs2.g().contains(this.aI)) {
            BlockPos blockPos;
            this.aI = this.a(bs2, uUID);
            if (this.aI == null) {
                boolean bl = bs2.g().isEmpty();
                HashSet<BlockPos> hashSet = com.trolmastercard.sexmod.ax.a(uUID, bs2);
                UUID uUID2 = com.trolmastercard.sexmod.ax.b(uUID);
                if (uUID2 == null) {
                    return;
                }
                EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID2);
                if (entityPlayer == null) {
                    return;
                }
                if (!bl) {
                    entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("<%s> It's impossible to mine here...", this.c())));
                }
                ge.b.sendTo((IMessage)new h6(hashSet, false), (EntityPlayerMP)entityPlayer);
                return;
            }
            if (Math.abs(this.func_180425_c().func_177956_o() - bs2.b().func_177956_o()) > 3) {
                blockPos = bs2.b().func_177971_a(bs2.f().func_176734_d().func_176730_m());
                this.field_70170_p.func_175656_a(blockPos, Blocks.field_150350_a.func_176223_P());
                this.b(blockPos);
            }
            blockPos = this.aI.func_177971_a(bs2.f().func_176734_d().func_176730_m());
            pathNavigate.func_75492_a((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p(), (double)0.35f);
            return;
        }
        IBlockState iBlockState = this.field_70170_p.func_180495_p(this.aI);
        if (!this.a(new ItemStack(iBlockState.func_177230_c().func_180660_a(iBlockState, com.trolmastercard.sexmod.r.f, 0)))) {
            this.ax = true;
            this.b(uUID, true);
            return;
        }
        if (this.field_70159_w != 0.0 || this.field_70179_y != 0.0 || !this.field_70122_E || this.func_70011_f(this.aI.func_177958_n(), this.aI.func_177956_o(), this.aI.func_177952_p()) > 3.0 || ++this.aK < 10) {
            BlockPos blockPos = this.aI.func_177971_a(bs2.f().func_176734_d().func_176730_m());
            pathNavigate.func_75492_a((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p(), (double)0.35f);
            return;
        }
        pathNavigate.func_75499_g();
        this.aK = 0;
        this.b(fp.MINE);
        this.field_70177_z = this.field_70759_as = (float)(Math.atan2(this.field_70161_v - (double)this.aI.func_177952_p(), this.field_70165_t - (double)this.aI.func_177958_n()) * 57.29577951308232 + 90.0);
        this.m.func_187227_b(at, (Object)false);
    }

    BlockPos a(bs bs2, UUID uUID) {
        Object object;
        Object object2;
        Object object32;
        BlockPos blockPos;
        HashSet<BlockPos> hashSet = bs2.g();
        EnumFacing enumFacing = bs2.f();
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Integer n2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        for (BlockPos object32 : hashSet) {
            switch (enumFacing) {
                case NORTH: {
                    if (n2 != null && object32.func_177952_p() < n2) break;
                    n2 = object32.func_177952_p();
                    arrayList.add(object32);
                    break;
                }
                case SOUTH: {
                    if (n2 != null && object32.func_177952_p() > n2) break;
                    n2 = object32.func_177952_p();
                    arrayList.add(object32);
                    break;
                }
                case EAST: {
                    if (n2 != null && object32.func_177958_n() > n2) break;
                    n2 = object32.func_177958_n();
                    arrayList.add(object32);
                    break;
                }
                case WEST: {
                    if (n2 != null && object32.func_177958_n() < n2) break;
                    n2 = object32.func_177958_n();
                    arrayList.add(object32);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (BlockPos blockPos2 : arrayList) {
            if ((enumFacing == EnumFacing.NORTH || enumFacing == EnumFacing.SOUTH) && blockPos2.func_177952_p() == n2.intValue()) {
                arrayList2.add(blockPos2);
            }
            if (enumFacing != EnumFacing.EAST && enumFacing != EnumFacing.WEST || blockPos2.func_177958_n() != n2.intValue()) continue;
            arrayList2.add(blockPos2);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        ArrayList<BlockPos> arrayList3 = new ArrayList<BlockPos>();
        EnumFacing enumFacing2 = bs2.f();
        BlockPos blockPos3 = bs2.b();
        if (enumFacing2.func_176740_k() == EnumFacing.Axis.Z) {
            blockPos = new BlockPos(blockPos3.func_177958_n(), blockPos3.func_177956_o(), ((BlockPos)arrayList2.get(0)).func_177952_p());
            blockPos = enumFacing2 == EnumFacing.NORTH ? blockPos.func_177978_c() : blockPos.func_177968_d();
            arrayList3.add(blockPos.func_177977_b());
            arrayList3.add(blockPos.func_177977_b().func_177974_f());
            arrayList3.add(blockPos.func_177977_b().func_177976_e());
            arrayList3.add(blockPos);
            arrayList3.add(blockPos.func_177984_a());
            arrayList3.add(blockPos.func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177984_a().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177976_e());
            arrayList3.add(blockPos.func_177976_e().func_177984_a());
            arrayList3.add(blockPos.func_177976_e().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177976_e().func_177984_a().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177976_e().func_177976_e());
            arrayList3.add(blockPos.func_177976_e().func_177976_e().func_177984_a());
            arrayList3.add(blockPos.func_177976_e().func_177976_e().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177974_f());
            arrayList3.add(blockPos.func_177974_f().func_177984_a());
            arrayList3.add(blockPos.func_177974_f().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177974_f().func_177984_a().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177974_f().func_177974_f());
            arrayList3.add(blockPos.func_177974_f().func_177974_f().func_177984_a());
            arrayList3.add(blockPos.func_177974_f().func_177974_f().func_177984_a().func_177984_a());
        } else {
            blockPos = new BlockPos(((BlockPos)arrayList2.get(0)).func_177958_n(), blockPos3.func_177956_o(), blockPos3.func_177952_p());
            blockPos = enumFacing2 == EnumFacing.EAST ? blockPos.func_177974_f() : blockPos.func_177976_e();
            arrayList3.add(blockPos.func_177977_b());
            arrayList3.add(blockPos.func_177977_b().func_177978_c());
            arrayList3.add(blockPos.func_177977_b().func_177968_d());
            arrayList3.add(blockPos);
            arrayList3.add(blockPos.func_177984_a());
            arrayList3.add(blockPos.func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177984_a().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177968_d());
            arrayList3.add(blockPos.func_177968_d().func_177984_a());
            arrayList3.add(blockPos.func_177968_d().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177968_d().func_177984_a().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177968_d().func_177968_d());
            arrayList3.add(blockPos.func_177968_d().func_177968_d().func_177984_a());
            arrayList3.add(blockPos.func_177968_d().func_177968_d().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177978_c());
            arrayList3.add(blockPos.func_177978_c().func_177984_a());
            arrayList3.add(blockPos.func_177978_c().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177978_c().func_177984_a().func_177984_a().func_177984_a());
            arrayList3.add(blockPos.func_177978_c().func_177978_c());
            arrayList3.add(blockPos.func_177978_c().func_177978_c().func_177984_a());
            arrayList3.add(blockPos.func_177978_c().func_177978_c().func_177984_a().func_177984_a());
        }
        HashSet<BlockPos> hashSet2 = new HashSet<BlockPos>();
        for (Object object32 : arrayList3) {
            if (!this.field_70170_p.func_180495_p((BlockPos)object32).func_185904_a().func_76224_d()) continue;
            this.field_70170_p.func_180501_a((BlockPos)object32, Blocks.field_150347_e.func_176223_P(), 2);
            if (!arrayList2.contains(object32)) continue;
            hashSet2.add((BlockPos)object32);
        }
        if (!hashSet2.isEmpty()) {
            bs2.a(hashSet2);
            object2 = this.z();
            if (object2 != null) {
                ge.b.sendTo((IMessage)new h6(hashSet2, true), (EntityPlayerMP)object2);
            }
        }
        arrayList3.clear();
        arrayList3.add(blockPos.func_177977_b());
        if (enumFacing2.func_176740_k() == EnumFacing.Axis.Z) {
            arrayList3.add(blockPos.func_177977_b().func_177976_e());
            arrayList3.add(blockPos.func_177977_b().func_177974_f());
        } else {
            arrayList3.add(blockPos.func_177977_b().func_177978_c());
            arrayList3.add(blockPos.func_177977_b().func_177968_d());
        }
        for (Object object32 : arrayList3) {
            if (!this.field_70170_p.func_180495_p((BlockPos)object32).func_177230_c().func_176205_b((IBlockAccess)this.field_70170_p, (BlockPos)object32)) continue;
            this.field_70170_p.func_175656_a((BlockPos)object32, Blocks.field_150347_e.func_176223_P());
        }
        object2 = new HashSet();
        object32 = arrayList2.iterator();
        while (object32.hasNext()) {
            object = (BlockPos)object32.next();
            Block block = this.field_70170_p.func_180495_p((BlockPos)object).func_177230_c();
            if (block != Blocks.field_150350_a) continue;
            ((HashSet)object2).add(object);
        }
        if (!((HashSet)object2).isEmpty()) {
            arrayList2.removeAll((Collection<?>)object2);
            bs2.b((HashSet<BlockPos>)object2);
            object32 = com.trolmastercard.sexmod.ax.b(uUID);
            if (object32 != null && (object = this.field_70170_p.func_152378_a((UUID)object32)) != null) {
                ge.b.sendTo((IMessage)new h6((HashSet<BlockPos>)object2, false), (EntityPlayerMP)object);
            }
        }
        if (arrayList2.isEmpty()) {
            return this.a(bs2, uUID);
        }
        object32 = null;
        object = bs2.c();
        for (int i = 0; i < object.size(); ++i) {
            if (((ff)object.get(i)).func_145782_y() != this.func_145782_y()) continue;
            if (i == 0) {
                object32 = this.a(arrayList2, -1, bs2.f(), bs2.b());
                if (object32 != null || (object32 = this.a(arrayList2, 0, bs2.f(), bs2.b())) != null) break;
                object32 = this.a(arrayList2, 1, bs2.f(), bs2.b());
                break;
            }
            if (i == 1) {
                object32 = this.a(arrayList2, 1, bs2.f(), bs2.b());
                if (object32 != null || (object32 = this.a(arrayList2, 0, bs2.f(), bs2.b())) != null) break;
                object32 = this.a(arrayList2, -1, bs2.f(), bs2.b());
                break;
            }
            if (i != 2) continue;
            object32 = this.a(arrayList2, 0, bs2.f(), bs2.b());
            if (object32 != null || (object32 = this.a(arrayList2, 1, bs2.f(), bs2.b())) != null) break;
            object32 = this.a(arrayList2, -1, bs2.f(), bs2.b());
            break;
        }
        return object32;
    }

    @Nullable
    BlockPos a(List<BlockPos> list, int n2, EnumFacing enumFacing, BlockPos blockPos) {
        BlockPos blockPos2;
        int n3;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
        ArrayList<BlockPos> arrayList3 = new ArrayList<BlockPos>();
        int n4 = n3 = enumFacing == EnumFacing.SOUTH || enumFacing == EnumFacing.WEST ? -1 : 1;
        if (enumFacing.func_176740_k() == EnumFacing.Axis.Z) {
            blockPos2 = new BlockPos(blockPos.func_177958_n(), blockPos.func_177956_o(), list.get(0).func_177952_p());
            arrayList3.add(blockPos2);
            arrayList3.add(blockPos2.func_177984_a());
            arrayList3.add(blockPos2.func_177984_a().func_177984_a());
            arrayList3.add(blockPos2.func_177976_e());
            arrayList3.add(blockPos2.func_177976_e().func_177984_a());
            arrayList3.add(blockPos2.func_177976_e().func_177984_a().func_177984_a());
            arrayList3.add(blockPos2.func_177974_f());
            arrayList3.add(blockPos2.func_177974_f().func_177984_a());
            arrayList3.add(blockPos2.func_177974_f().func_177984_a().func_177984_a());
            if (n2 == 0) {
                for (BlockPos blockPos3 : arrayList3) {
                    arrayList2.add(blockPos3.func_177965_g(2));
                    arrayList2.add(blockPos3.func_177965_g(-2));
                }
                for (BlockPos blockPos3 : list) {
                    if (arrayList2.contains(blockPos3)) continue;
                    arrayList.add(blockPos3);
                }
            } else {
                for (BlockPos blockPos3 : arrayList3) {
                    arrayList2.add(blockPos3.func_177965_g(n3 * 2 * n2));
                }
                for (BlockPos blockPos3 : arrayList2) {
                    if (!list.contains(blockPos3)) continue;
                    arrayList.add(blockPos3);
                }
            }
        }
        if (enumFacing.func_176740_k() == EnumFacing.Axis.X) {
            blockPos2 = new BlockPos(list.get(0).func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p());
            arrayList3.add(blockPos2);
            arrayList3.add(blockPos2.func_177984_a());
            arrayList3.add(blockPos2.func_177984_a().func_177984_a());
            arrayList3.add(blockPos2.func_177978_c());
            arrayList3.add(blockPos2.func_177978_c().func_177984_a());
            arrayList3.add(blockPos2.func_177978_c().func_177984_a().func_177984_a());
            arrayList3.add(blockPos2.func_177968_d());
            arrayList3.add(blockPos2.func_177968_d().func_177984_a());
            arrayList3.add(blockPos2.func_177968_d().func_177984_a().func_177984_a());
            if (n2 == 0) {
                for (BlockPos blockPos3 : arrayList3) {
                    arrayList2.add(blockPos3.func_177970_e(2));
                    arrayList2.add(blockPos3.func_177970_e(-2));
                }
                for (BlockPos blockPos3 : list) {
                    if (arrayList2.contains(blockPos3)) continue;
                    arrayList.add(blockPos3);
                }
            } else {
                for (BlockPos blockPos3 : arrayList3) {
                    arrayList2.add(blockPos3.func_177970_e(n3 * 2 * n2));
                }
                for (BlockPos blockPos3 : arrayList2) {
                    if (!list.contains(blockPos3)) continue;
                    arrayList.add(blockPos3);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (BlockPos)arrayList.get(this.func_70681_au().nextInt(arrayList.size()));
    }

    void u(UUID uUID) {
        if (this.b(uUID, false)) {
            return;
        }
        this.e();
    }

    void e() {
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 15.0);
        if (this.J() && entityPlayer != null && entityPlayer.func_70032_d((Entity)this) < 2.0f && ((String)this.m.func_187225_a(v)).equals(entityPlayer.getPersistentID().toString())) {
            this.func_70661_as().func_75499_g();
            return;
        }
        if (this.ap == null || this.func_70011_f(this.ap.func_177958_n(), this.ap.func_177956_o(), this.ap.func_177952_p()) > this.n() || this.ab > 100) {
            int n2 = (this.func_70681_au().nextBoolean() ? 1 : -1) * this.func_70681_au().nextInt(5);
            int n3 = (this.func_70681_au().nextBoolean() ? 1 : -1) * this.func_70681_au().nextInt(5);
            int n4 = cj.a(this.field_70170_p, this.func_180425_c().func_177958_n() + n2, this.func_180425_c().func_177952_p() + n3);
            this.ap = new BlockPos(this.func_180425_c().func_177958_n() + n2, n4, this.func_180425_c().func_177952_p() + n3);
            this.ab = 0;
        }
        if (Math.sqrt(this.ap.func_177951_i((Vec3i)this.func_180425_c())) > 2.0) {
            this.func_70661_as().func_75492_a((double)this.ap.func_177958_n(), (double)this.ap.func_177956_o(), (double)this.ap.func_177952_p(), (double)0.35f);
            this.k();
        } else {
            ++this.ab;
        }
    }

    double n() {
        return Math.sqrt(800.0);
    }

    boolean b(UUID uUID, boolean bl) {
        block3: {
            if (this.f()) {
                return false;
            }
            if (this.a(uUID, bl)) {
                this.a0 = 0;
                return true;
            }
            if (--this.a0 >= 0 || !this.ax) {
                return false;
            }
            this.a0 = 300;
            EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(UUID.fromString((String)this.m.func_187225_a(v)));
            EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)this.m.func_187225_a(N));
            if (entityPlayer == null) break block3;
            entityPlayer.func_146105_b((ITextComponent)new TextComponentString(eyeAndKoboldColor.getTextColor() + this.c() + "s " + TextFormatting.WHITE + "inventory is full and there are either no chests to put her items in or said chests are full as well"), false);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean a(UUID uUID, boolean bl) {
        TileEntityChest tileEntityChest;
        int n2;
        IItemHandler iItemHandler;
        BlockPos blockPos3;
        HashSet<BlockPos> hashSet = com.trolmastercard.sexmod.ax.q(uUID);
        if (hashSet == null) {
            return false;
        }
        BlockPos blockPos2 = null;
        for (BlockPos blockPos3 : hashSet) {
            TileEntityChest tileEntityChest2 = (TileEntityChest)this.field_70170_p.func_175625_s(blockPos3);
            iItemHandler = tileEntityChest2.getSingleChestHandler();
            n2 = 0;
            for (int i = 0; i < this.X.getSlots(); ++i) {
                ItemStack itemStack = this.X.getStackInSlot(i);
                if (itemStack.func_190926_b()) continue;
                for (int j = 0; j < iItemHandler.getSlots(); ++j) {
                    ItemStack itemStack2 = iItemHandler.insertItem(j, itemStack, true);
                    if (itemStack2.func_190916_E() == itemStack.func_190916_E()) continue;
                    n2 = 1;
                    break;
                }
                if (n2 != 0) break;
            }
            if (n2 == 0) continue;
            if (blockPos2 == null) {
                blockPos2 = blockPos3;
                continue;
            }
            if (!(this.func_174818_b(blockPos2) > this.func_174818_b(blockPos3))) continue;
            blockPos2 = blockPos3;
        }
        if (blockPos2 == null) {
            return false;
        }
        if (this.func_70011_f(blockPos2.func_177958_n(), blockPos2.func_177956_o(), blockPos2.func_177952_p()) < 2.0) {
            tileEntityChest = (TileEntityChest)this.field_70170_p.func_175625_s(blockPos2);
            blockPos3 = tileEntityChest.getSingleChestHandler();
            block3: for (int i = 0; i < this.X.getSlots(); ++i) {
                iItemHandler = this.X.getStackInSlot(i);
                if (iItemHandler.func_190926_b()) continue;
                for (n2 = 0; n2 < blockPos3.getSlots(); ++n2) {
                    ItemStack itemStack = blockPos3.insertItem(n2, (ItemStack)iItemHandler, false);
                    if (itemStack.func_190916_E() <= 0) {
                        this.X.setStackInSlot(i, ItemStack.field_190927_a);
                        continue block3;
                    }
                    this.X.setStackInSlot(i, itemStack);
                    iItemHandler = itemStack;
                }
            }
            this.field_70170_p.func_184133_a(null, blockPos2, SoundEvents.field_187654_U, SoundCategory.BLOCKS, 1.0f, 1.0f);
            return true;
        }
        if (Math.abs(blockPos2.func_177956_o() - this.func_180425_c().func_177956_o()) > 4) {
            if (!bl) return false;
            this.b(blockPos2);
            return true;
        } else {
            tileEntityChest = this.func_70661_as();
            blockPos3 = this.c(blockPos2);
            tileEntityChest.func_75492_a((double)blockPos3.func_177958_n(), (double)blockPos3.func_177956_o(), (double)blockPos3.func_177952_p(), (double)0.35f);
            if (tileEntityChest.func_75505_d() != null) return true;
            if (!bl) return false;
            this.b(blockPos2);
        }
        return true;
    }

    boolean c(UUID uUID, bs bs2) {
        List<ff> list = com.trolmastercard.sexmod.ax.n(uUID);
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
        ff ff2 = null;
        Vec3d vec3d = new Vec3d((double)bs2.b().func_177958_n(), (double)bs2.b().func_177956_o(), (double)bs2.b().func_177952_p());
        for (ff ff3 : list) {
            boolean bl = false;
            for (bs bs3 : collection) {
                if (!bs3.b(ff3)) continue;
                bl = true;
                break;
            }
            if (bl || ff3.ae() != null) continue;
            if (ff2 == null) {
                ff2 = ff3;
                continue;
            }
            if (!(ff2.func_174791_d().func_72438_d(vec3d) > ff3.func_174791_d().func_72438_d(vec3d))) continue;
            ff2 = ff3;
        }
        return this.equals(ff2);
    }

    void a(UUID uUID, bs bs2, BlockPos blockPos) {
        if (this.ad == null) {
            this.aR = 24;
            this.W = 0;
            this.b(fp.NULL);
            this.m.func_187227_b(G, (Object)false);
            EntityPlayer entityPlayer = this.z();
            HashSet<BlockPos> hashSet = bs2.g();
            if (entityPlayer != null && !hashSet.isEmpty()) {
                ge.b.sendTo((IMessage)new h6(hashSet, false), (EntityPlayerMP)entityPlayer);
            }
            com.trolmastercard.sexmod.ax.b(uUID, this);
            return;
        }
        switch (this.ad.func_77960_j()) {
            case 3: 
            case 5: {
                this.field_70170_p.func_175656_a(blockPos, Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, blockPos, EnumFacing.NORTH, (float)blockPos.func_177958_n(), (float)blockPos.func_177956_o(), (float)blockPos.func_177952_p(), this.ad.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
                this.field_70170_p.func_175656_a(blockPos.func_177978_c(), Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, blockPos.func_177978_c(), EnumFacing.NORTH, (float)blockPos.func_177958_n(), (float)blockPos.func_177956_o(), (float)(blockPos.func_177952_p() + 1), this.ad.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
                this.field_70170_p.func_175656_a(blockPos.func_177976_e(), Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, blockPos.func_177976_e(), EnumFacing.NORTH, (float)(blockPos.func_177958_n() + 1), (float)blockPos.func_177956_o(), (float)blockPos.func_177952_p(), this.ad.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
                this.field_70170_p.func_175656_a(blockPos.func_177978_c().func_177976_e(), Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, blockPos.func_177978_c().func_177976_e(), EnumFacing.NORTH, (float)(blockPos.func_177958_n() + 1), (float)blockPos.func_177956_o(), (float)(blockPos.func_177952_p() + 1), this.ad.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
                break;
            }
            default: {
                this.field_70170_p.func_175656_a(blockPos, Blocks.field_150345_g.getStateForPlacement(this.field_70170_p, blockPos, EnumFacing.NORTH, (float)blockPos.func_177958_n(), (float)blockPos.func_177956_o(), (float)blockPos.func_177952_p(), this.ad.func_77960_j(), (EntityLivingBase)this, EnumHand.MAIN_HAND));
            }
        }
        this.aR = 24;
        this.W = 0;
        this.ad = null;
        this.b(fp.NULL);
        this.a(false);
        EntityPlayer entityPlayer = this.z();
        HashSet<BlockPos> hashSet = bs2.g();
        if (entityPlayer != null && !hashSet.isEmpty()) {
            ge.b.sendTo((IMessage)new h6(hashSet, false), (EntityPlayerMP)entityPlayer);
        }
        com.trolmastercard.sexmod.ax.b(uUID, this);
    }

    void a(UUID uUID, BlockPos blockPos, bs bs2) {
        if (this.y() != fp.MINE) {
            this.a(blockPos, uUID);
            return;
        }
        --this.W;
        if (this.W > 0) {
            return;
        }
        if (this.W == 0) {
            ge.b.sendToAllAround((IMessage)new a1(this.f()), this.P());
        }
        if (this.field_70170_p.func_180495_p(blockPos).func_177230_c() == Blocks.field_150350_a) {
            this.a(uUID, bs2, blockPos);
            return;
        }
        --this.aR;
        if (this.aR >= 0) {
            return;
        }
        this.aR = 24;
        this.W = 78;
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        EntityPlayer entityPlayer = this.z();
        for (BlockPos object2 : bs2.g()) {
            if (this.field_70170_p.func_180495_p(object2).func_177230_c() == Blocks.field_150350_a) {
                hashSet.add(object2);
                continue;
            }
            if (object2.func_177958_n() == blockPos.func_177958_n() && object2.func_177952_p() == blockPos.func_177952_p()) continue;
            try {
                ItemStack blockPos2 = this.field_70170_p.func_180495_p(object2).func_177230_c().func_185473_a(this.field_70170_p, blockPos, this.field_70170_p.func_180495_p(blockPos));
                if (blockPos2.func_77973_b() != Items.field_190931_a) {
                    this.b(blockPos2);
                }
            }
            catch (IllegalArgumentException i) {
                Main.LOGGER.error("Couldn't get an item out of the block that a kobold just destroyed when falling a tree. As a result, the block wasn't added into the kobolds inventory. If you see this message, pls tell trol about it and send her the following stacktrace. Do you maybe remember what block the kobold just removed? Stacktrace follwing:");
                Main.LOGGER.warn("block in question: " + this.field_70170_p.func_180495_p(object2).func_177230_c().func_149739_a());
                Main.LOGGER.error(i.getMessage());
            }
            this.ad = this.a(object2);
            this.field_70170_p.func_175655_b(object2, false);
            bs2.a(object2);
            bs2.b(hashSet);
            hashSet.add(object2);
            if (entityPlayer != null) {
                ge.b.sendTo((IMessage)new h6(hashSet, false), (EntityPlayerMP)entityPlayer);
            }
            return;
        }
        try {
            ItemStack itemStack = this.field_70170_p.func_180495_p(blockPos).func_177230_c().func_185473_a(this.field_70170_p, blockPos, this.field_70170_p.func_180495_p(blockPos));
            if (itemStack.func_77973_b() != Items.field_190931_a) {
                this.b(itemStack);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Main.LOGGER.error("Couldn't get an item out of the block that a kobold just destroyed when falling a tree. As a result, the block wasn't added into the kobolds inventory. If you see this message, pls tell trol about it and send her the following stacktrace. Do you maybe remember what block the kobold just removed? Stacktrace follwing:");
            Main.LOGGER.warn("block in question: " + this.field_70170_p.func_180495_p(blockPos).func_177230_c().func_149739_a());
            Main.LOGGER.error(illegalArgumentException.getMessage());
        }
        this.ad = this.a(blockPos);
        this.field_70170_p.func_175655_b(blockPos, false);
        int n2 = 0;
        for (BlockPos hashSet2 : bs2.g()) {
            if (!(this.field_70170_p.func_180495_p(hashSet2).func_177230_c() instanceof BlockLog)) continue;
            ++n2;
        }
        HashSet<BlockPos> hashSet2 = new HashSet<BlockPos>();
        for (int i = 0; i < n2; ++i) {
            hashSet2.add(blockPos.func_177982_a(0, i, 0));
        }
        HashSet<BlockPos> hashSet3 = new HashSet<BlockPos>();
        for (BlockPos blockPos2 : bs2.g()) {
            if (hashSet2.contains(blockPos2)) continue;
            hashSet3.add(blockPos2);
        }
        if (!hashSet3.isEmpty() && entityPlayer != null) {
            ge.b.sendTo((IMessage)new h6(hashSet3, false), (EntityPlayerMP)entityPlayer);
        }
        int n3 = 1;
        while (true) {
            BlockPos blockPos2;
            blockPos2 = blockPos.func_177982_a(0, n3, 0);
            IBlockState iBlockState = this.field_70170_p.func_180495_p(blockPos2);
            if (this.field_70170_p.func_180495_p(blockPos2).func_177230_c() instanceof BlockLog) {
                this.field_70170_p.func_175655_b(blockPos2, false);
                EntityFallingBlock entityFallingBlock = new EntityFallingBlock(this.field_70170_p, (double)blockPos2.func_177958_n() + 0.5, (double)blockPos2.func_177956_o(), (double)blockPos2.func_177952_p() + 0.5, iBlockState);
                entityFallingBlock.field_145812_b = 1;
                this.field_70170_p.func_72838_d((Entity)entityFallingBlock);
            }
            if (!bs2.g().contains(blockPos2)) break;
            ++n3;
        }
    }

    ItemStack a(BlockPos blockPos) {
        ItemStack itemStack;
        try {
            itemStack = this.field_70170_p.func_180495_p(blockPos).func_177230_c().func_185473_a(this.field_70170_p, blockPos, this.field_70170_p.func_180495_p(blockPos));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Main.LOGGER.error("Couldn't turn a wooden block into an item to get its meta data. As a result the kobold is just gonna plant a oak saplinig instead. If you see this message, pls tell trol about it and send her the following stacktrace. Do you maybe remember what block the kobold just removed? Stacktrace follwing:");
            Main.LOGGER.warn("block in question: " + this.field_70170_p.func_180495_p(blockPos).func_177230_c().func_149739_a());
            Main.LOGGER.error(illegalArgumentException.getMessage());
            return new ItemStack(Blocks.field_150345_g, 1, 0);
        }
        int n2 = ItemBlock.func_150891_b((Item)itemStack.func_77973_b());
        int n3 = itemStack.func_77973_b().getMetadata(itemStack);
        if (n2 == 17 && n3 == 1) {
            return new ItemStack(Blocks.field_150345_g, 1, 1);
        }
        if (n2 == 17 && n3 == 2) {
            return new ItemStack(Blocks.field_150345_g, 1, 2);
        }
        if (n2 == 17 && n3 == 3) {
            return new ItemStack(Blocks.field_150345_g, 1, 3);
        }
        if (n2 == 162 && n3 == 0) {
            return new ItemStack(Blocks.field_150345_g, 1, 4);
        }
        if (n2 == 162 && n3 == 1) {
            return new ItemStack(Blocks.field_150345_g, 1, 5);
        }
        return new ItemStack(Blocks.field_150345_g, 1, 0);
    }

    void a(BlockPos blockPos, UUID uUID) {
        EntityPlayer entityPlayer;
        BlockPos blockPos2 = null;
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        if (this.field_70170_p.func_180495_p(blockPos.func_177978_c().func_177977_b()).func_185917_h() && !this.field_70170_p.func_180495_p(blockPos.func_177978_c()).func_185913_b()) {
            arrayList.add(blockPos.func_177978_c());
        }
        if (this.field_70170_p.func_180495_p(blockPos.func_177974_f().func_177977_b()).func_185917_h() && !this.field_70170_p.func_180495_p(blockPos.func_177974_f()).func_185913_b()) {
            arrayList.add(blockPos.func_177974_f());
        }
        if (this.field_70170_p.func_180495_p(blockPos.func_177968_d().func_177977_b()).func_185917_h() && !this.field_70170_p.func_180495_p(blockPos.func_177968_d()).func_185913_b()) {
            arrayList.add(blockPos.func_177968_d());
        }
        if (this.field_70170_p.func_180495_p(blockPos.func_177976_e().func_177977_b()).func_185917_h() && !this.field_70170_p.func_180495_p(blockPos.func_177976_e()).func_185913_b()) {
            arrayList.add(blockPos.func_177976_e());
        }
        for (BlockPos blockPos3 : arrayList) {
            if (blockPos2 == null) {
                blockPos2 = blockPos3;
                continue;
            }
            double d = new Vec3d((double)((float)blockPos2.func_177958_n() + 0.5f), (double)blockPos2.func_177956_o(), (double)((float)blockPos2.func_177952_p() + 0.5f)).func_72438_d(this.func_174791_d());
            double d2 = new Vec3d((double)((float)blockPos3.func_177958_n() + 0.5f), (double)blockPos3.func_177956_o(), (double)((float)blockPos3.func_177952_p() + 0.5f)).func_72438_d(this.func_174791_d());
            if (!(d2 < d)) continue;
            blockPos2 = blockPos3;
        }
        if (blockPos2 == null) {
            com.trolmastercard.sexmod.ax.b(uUID, this);
            entityPlayer = this.z();
            if (entityPlayer == null) {
                return;
            }
            entityPlayer.func_146105_b((ITextComponent)new TextComponentString("Your kobolds cannot fall this tree because it starts underground"), true);
            return;
        }
        if (this.func_180425_c().func_185332_f(blockPos2.func_177958_n(), blockPos2.func_177956_o(), blockPos2.func_177952_p()) > 1.0) {
            if (Math.abs(this.func_180425_c().func_177956_o() - blockPos2.func_177956_o()) > 4) {
                this.b(blockPos2);
                return;
            }
            entityPlayer = this.c(blockPos2);
            this.func_70661_as().func_75492_a((double)entityPlayer.func_177958_n() + 0.5, (double)entityPlayer.func_177956_o(), (double)entityPlayer.func_177952_p() + 0.5, 0.35);
            this.k();
            return;
        }
        float f = 0.0f;
        if (blockPos2.func_177973_b((Vec3i)blockPos).equals((Object)new BlockPos(0, 0, -1))) {
            f = 0.0f;
        }
        if (blockPos2.func_177973_b((Vec3i)blockPos).equals((Object)new BlockPos(1, 0, 0))) {
            f = 90.0f;
        }
        if (blockPos2.func_177973_b((Vec3i)blockPos).equals((Object)new BlockPos(0, 0, 1))) {
            f = 180.0f;
        }
        if (blockPos2.func_177973_b((Vec3i)blockPos).equals((Object)new BlockPos(-1, 0, 0))) {
            f = -90.0f;
        }
        this.c(new Vec3d((double)blockPos2.func_177958_n() + 0.5, (double)blockPos2.func_177956_o(), (double)blockPos2.func_177952_p() + 0.5));
        this.b(f);
        this.m.func_187227_b(G, (Object)true);
        this.m.func_187227_b(at, (Object)true);
        this.b(fp.MINE);
        this.field_70170_p.func_175655_b(blockPos2.func_177984_a(), false);
    }

    void h() {
        if (this.aA) {
            return;
        }
        Optional optional = (Optional)this.m.func_187225_a(aL);
        if (!optional.isPresent()) {
            return;
        }
        this.m.func_187227_b(N, (Object)com.trolmastercard.sexmod.ax.l((UUID)optional.get()).toString());
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.MATING_PRESS_CUM && (fp2 == fp.MATING_PRESS_SOFT || fp2 == fp.MATING_PRESS_HARD)) {
            return;
        }
        if (this.y() == fp.KOBOLD_ANAL_CUM && (fp2 == fp.KOBOLD_ANAL_SLOW || fp2 == fp.KOBOLD_ANAL_FAST)) {
            return;
        }
        if (this.y() == fp.CUMBLOWJOB && (fp2 == fp.SUCKBLOWJOB || fp2 == fp.THRUSTBLOWJOB)) {
            return;
        }
        if (fp2 == fp.MATING_PRESS_CUM) {
            this.V = 0;
        }
        super.b(fp2);
    }

    public void func_70645_a(DamageSource damageSource) {
        block2: {
            EntityPlayer entityPlayer;
            super.func_70645_a(damageSource);
            if (this.field_70170_p.field_72995_K) {
                return;
            }
            Optional optional = (Optional)this.m.func_187225_a(aL);
            if (!optional.isPresent()) {
                return;
            }
            UUID uUID = (UUID)optional.get();
            com.trolmastercard.sexmod.ax.a(uUID, this);
            if (!this.J() || (entityPlayer = this.field_70170_p.func_152378_a(UUID.fromString((String)this.func_184212_Q().func_187225_a(v)))) == null) break block2;
            entityPlayer.func_145747_a((ITextComponent)new TextComponentString(String.format("%s%s%s has perished %suwu", TextFormatting.RED, this.c(), TextFormatting.WHITE, TextFormatting.RED)));
        }
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.SUCKBLOWJOB_BLINK) {
            return fp.THRUSTBLOWJOB;
        }
        if (fp2 == fp.KOBOLD_ANAL_SLOW) {
            return fp.KOBOLD_ANAL_FAST;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.THRUSTBLOWJOB || fp2 == fp.SUCKBLOWJOB_BLINK) {
            return fp.CUMBLOWJOB;
        }
        if (fp2 == fp.KOBOLD_ANAL_SLOW || fp2 == fp.KOBOLD_ANAL_FAST) {
            return fp.KOBOLD_ANAL_CUM;
        }
        if (fp2 == fp.MATING_PRESS_HARD || fp2 == fp.MATING_PRESS_SOFT) {
            return fp.MATING_PRESS_CUM;
        }
        return null;
    }

    @Override
    public void func_70014_b(NBTTagCompound nBTTagCompound) {
        block0: {
            super.func_70014_b(nBTTagCompound);
            nBTTagCompound.func_74776_a("body_size", ((Float)this.m.func_187225_a(aE)).floatValue());
            nBTTagCompound.func_74768_a("eyeColorX", ((BlockPos)this.m.func_187225_a(K)).func_177958_n());
            nBTTagCompound.func_74768_a("eyeColorY", ((BlockPos)this.m.func_187225_a(K)).func_177956_o());
            nBTTagCompound.func_74768_a("eyeColorZ", ((BlockPos)this.m.func_187225_a(K)).func_177952_p());
            nBTTagCompound.func_74778_a("model", (String)this.m.func_187225_a(M));
            nBTTagCompound.func_74778_a("name", (String)this.m.func_187225_a(T));
            nBTTagCompound.func_74778_a("master", (String)this.m.func_187225_a(v));
            nBTTagCompound.func_74782_a("inventory", (NBTBase)this.X.serializeNBT());
            nBTTagCompound.func_74778_a("bodyColor", (String)this.m.func_187225_a(N));
            nBTTagCompound.func_74757_a("editedColorManually", this.aA);
            Optional optional = (Optional)this.m.func_187225_a(aL);
            if (!optional.isPresent()) break block0;
            nBTTagCompound.func_186854_a("tribeId", (UUID)optional.get());
            nBTTagCompound.func_74757_a("isLeader", com.trolmastercard.sexmod.ax.e((UUID)optional.get(), this));
            nBTTagCompound.func_74778_a("tribeName", (String)this.m.func_187225_a(aU));
        }
    }

    @Override
    public void func_70037_a(NBTTagCompound nBTTagCompound) {
        BlockPos blockPos;
        super.func_70037_a(nBTTagCompound);
        String string = nBTTagCompound.func_74779_i("model");
        if (!"".equals(string)) {
            this.m.func_187227_b(M, (Object)string);
        }
        if (!BlockPos.field_177992_a.equals((Object)(blockPos = new BlockPos(nBTTagCompound.func_74762_e("eyeColorX"), nBTTagCompound.func_74762_e("eyeColorY"), nBTTagCompound.func_74762_e("eyeColorZ"))))) {
            this.m.func_187227_b(K, (Object)blockPos);
        }
        this.m.func_187227_b(aE, (Object)Float.valueOf(nBTTagCompound.func_74760_g("body_size")));
        this.m.func_187227_b(T, (Object)nBTTagCompound.func_74779_i("name"));
        this.m.func_187227_b(v, (Object)nBTTagCompound.func_74779_i("master"));
        this.X.deserializeNBT(nBTTagCompound.func_74775_l("inventory"));
        String string2 = nBTTagCompound.func_74779_i("bodyColor");
        if (!"".equals(string2)) {
            this.m.func_187227_b(N, (Object)nBTTagCompound.func_74779_i("bodyColor"));
        }
        this.aA = nBTTagCompound.func_74767_n("editedColorManually");
        UUID uUID = nBTTagCompound.func_186857_a("tribeId");
        if (uUID != null && !this.field_70128_L) {
            this.m.func_187227_b(aL, (Object)Optional.of((Object)uUID));
            if (!com.trolmastercard.sexmod.ax.o(uUID)) {
                com.trolmastercard.sexmod.ax.a(uUID, EyeAndKoboldColor.valueOf((String)this.m.func_187225_a(N)));
            }
            com.trolmastercard.sexmod.ax.c(uUID, this);
            if (nBTTagCompound.func_74767_n("isLeader")) {
                com.trolmastercard.sexmod.ax.d(uUID, this);
            }
            this.m.func_187227_b(aU, (Object)nBTTagCompound.func_74779_i("tribeName"));
        }
    }

    @Override
    public boolean a() {
        if (this.h()) {
            return false;
        }
        Block block = this.field_70170_p.func_180495_p(this.func_180425_c().func_177982_a(0, 1, 0)).func_177230_c();
        return !block.func_176205_b((IBlockAccess)this.field_70170_p, this.func_180425_c().func_177982_a(0, 1, 0));
    }

    boolean f() {
        for (int i = 0; i < this.X.getSlots(); ++i) {
            if (this.X.getStackInSlot(i).func_190926_b()) continue;
            return false;
        }
        return true;
    }

    boolean a(bs bs2) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        for (BlockPos blockPos : bs2.g()) {
            try {
                IBlockState iBlockState = this.field_70170_p.func_180495_p(blockPos);
                ItemStack itemStack = iBlockState.func_177230_c().func_185473_a(this.field_70170_p, blockPos, iBlockState);
                arrayList.add(itemStack);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        return this.a((List<ItemStack>)arrayList);
    }

    boolean a(ItemStack itemStack) {
        return this.a(this.X, itemStack, true, false);
    }

    boolean a(List<ItemStack> list) {
        ItemStackHandler itemStackHandler = new ItemStackHandler(this.X.getSlots());
        for (int i = 0; i < itemStackHandler.getSlots(); ++i) {
            itemStackHandler.setStackInSlot(i, this.X.getStackInSlot(i));
        }
        for (ItemStack itemStack : list) {
            if (this.a(itemStackHandler, itemStack, true, false)) continue;
            return false;
        }
        return true;
    }

    boolean b(ItemStack itemStack) {
        return this.a(this.X, itemStack, false, true);
    }

    boolean a(ItemStackHandler itemStackHandler, ItemStack itemStack, boolean bl, boolean bl2) {
        ItemStack itemStack2;
        int n2;
        for (n2 = 0; n2 < itemStackHandler.getSlots(); ++n2) {
            itemStack2 = itemStackHandler.getStackInSlot(n2);
            if (itemStack2.func_77973_b() != itemStack.func_77973_b() || itemStack2.func_77960_j() != itemStack.func_77960_j()) continue;
            int n3 = itemStack2.func_77976_d();
            if (n3 > itemStack.func_190916_E() + itemStack2.func_190916_E()) {
                if (!bl) {
                    itemStack2.func_190920_e(itemStack2.func_190916_E() + itemStack.func_190916_E());
                }
                return true;
            }
            int n4 = n3 - itemStack2.func_190916_E();
            itemStack2.func_190920_e(n3);
            itemStack.func_190920_e(itemStack.func_190916_E() - n4);
        }
        for (n2 = 0; n2 < itemStackHandler.getSlots(); ++n2) {
            itemStack2 = itemStackHandler.getStackInSlot(n2);
            if (itemStack2.func_77973_b() != Items.field_190931_a) continue;
            if (!bl) {
                itemStackHandler.setStackInSlot(n2, itemStack);
            }
            return true;
        }
        if (bl) {
            return false;
        }
        if (!bl2) {
            return false;
        }
        EntityItem entityItem = new EntityItem(this.field_70170_p);
        entityItem.func_92058_a(itemStack);
        entityItem.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        this.field_70170_p.func_72838_d((Entity)entityItem);
        return false;
    }

    void b(SoundEvent soundEvent, float f) {
        float f2 = 0.25f - ((Float)this.m.func_187225_a(aE)).floatValue();
        double d = f2 / 0.25f;
        float f4 = (float)b6.b((double)0.9f, (double)1.1f, d);
        this.a(soundEvent, f, f4);
    }

    void b(SoundEvent soundEvent) {
        this.b(soundEvent, 1.0f);
    }

    void a(SoundEvent[] soundEventArray) {
        this.b(soundEventArray, 1.0f);
    }

    void b(SoundEvent[] soundEventArray, float f) {
        this.b(soundEventArray[this.func_70681_au().nextInt(soundEventArray.length)], f);
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
            return PlayState.STOP;
        }
        if (this.C == null) {
            this.p();
        }
        float f = 0.25f - ((Float)this.func_184212_Q().func_187225_a(aE)).floatValue();
        GeckoLibCache.getInstance().parser.setValue("size", (double)f);
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL) {
                    this.a("animation.kobold.null", true, animationEvent);
                    break;
                }
                this.a("animation.kobold.blink", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.kobold.null", true, animationEvent);
                    break;
                }
                if (this.func_184218_aH()) {
                    this.a("animation.kobold.sit", true, animationEvent);
                    break;
                }
                double d = Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v);
                if (!((Boolean)this.m.func_187225_a(G)).booleanValue() && d > 0.0) {
                    if (this.field_70122_E && Math.abs(Math.abs(this.field_70167_r) - Math.abs(this.field_70163_u)) < (double)0.1f) {
                        this.field_70177_z = this.field_70759_as;
                        double d2 = 1.0 + (double)(f * 2.0f);
                        this.E.setAnimationSpeed(d2);
                        if (this.a()) {
                            this.a("animation.kobold.crouch_walk", true, animationEvent);
                            break;
                        }
                        if (((Boolean)this.m.func_187225_a(aC)).booleanValue()) {
                            this.a("animation.kobold.run_armed", true, animationEvent);
                            break;
                        }
                        if (d > (double)0.2f) {
                            this.a("animation.kobold.run", true, animationEvent);
                            break;
                        }
                        this.a("animation.kobold.walk", true, animationEvent);
                        break;
                    }
                    this.a("animation.kobold.fly", true, animationEvent);
                    break;
                }
                if (this.a()) {
                    this.a("animation.kobold.crouch_idle", true, animationEvent);
                    break;
                }
                this.a((Boolean)this.m.func_187225_a(aC) != false ? "animation.kobold.idle_armed" : "animation.kobold.idle", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.kobold.null", true, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.kobold.attack", false, animationEvent);
                        break block5;
                    }
                    case RIDE: 
                    case SIT: {
                        this.a("animation.kobold.sit", true, animationEvent);
                        break block5;
                    }
                    case MINE: {
                        this.a("animation.kobold.fall_tree", true, animationEvent);
                        break block5;
                    }
                    case PAYMENT: {
                        this.a("animation.kobold.paymentBackpack", true, animationEvent);
                        break block5;
                    }
                    case STARTBLOWJOB: {
                        this.a("animation.kobold.blowjobStart", false, animationEvent);
                        break block5;
                    }
                    case SUCKBLOWJOB_BLINK: {
                        String string = this.a4 ? "R" : "L";
                        String string2 = this.aT ? "Switch" : "";
                        this.a("animation.kobold.blowjobSlow" + string + string2, true, animationEvent);
                        break block5;
                    }
                    case THRUSTBLOWJOB: {
                        this.a("animation.kobold.blowjobFast", true, animationEvent);
                        break block5;
                    }
                    case CUMBLOWJOB: {
                        this.a("animation.kobold.blowjobCum", false, animationEvent);
                        break block5;
                    }
                    case KOBOLD_ANAL_START: {
                        this.a("animation.kobold.analStart", false, animationEvent);
                        break block5;
                    }
                    case KOBOLD_ANAL_SLOW: {
                        this.a("animation.kobold.analSoft", true, animationEvent);
                        break block5;
                    }
                    case KOBOLD_ANAL_FAST: {
                        this.a("animation.kobold.analHard", true, animationEvent);
                        break block5;
                    }
                    case KOBOLD_ANAL_CUM: {
                        this.a("animation.kobold.analCum", true, animationEvent);
                        break block5;
                    }
                    case SLEEP: {
                        this.a("animation.kobold.sleep", true, animationEvent);
                        break block5;
                    }
                    case MATING_PRESS_START: {
                        this.a("animation.kobold.mating_press_start", false, animationEvent);
                        break block5;
                    }
                    case MATING_PRESS_SOFT: {
                        this.a("animation.kobold.mating_press_soft", true, animationEvent);
                        break block5;
                    }
                    case MATING_PRESS_HARD: {
                        this.a("animation.kobold.mating_press_hard", true, animationEvent);
                        break block5;
                    }
                    case MATING_PRESS_CUM: {
                        this.a("animation.kobold.mating_press_cum", true, animationEvent);
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
                case "attackSound": {
                    this.a(SoundEvents.field_187727_dV);
                    break;
                }
                case "paymentMSG1": {
                    this.a(this.ae(), "I'd like to use ur services owo");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "plob": {
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, new int[0]);
                    break;
                }
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "paymentDone": {
                    if (!this.n()) break;
                    this.U();
                    break;
                }
                case "blowjobStartMSG1": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = ck.a(new Vec3d(0.0, 0.625 - (double)entityPlayerSP.func_70047_e(), -1.0), this.I().floatValue() + 180.0f);
                    ge.b.sendToServer((IMessage)new a8(this.ae().toString(), this.o().func_178787_e(vec3d), this.I().floatValue() + 180.0f, 0.0f));
                    break;
                }
                case "blowjobStartMSG2": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = ck.a(new Vec3d(0.5, 0.5 - (double)entityPlayerSP.func_70047_e(), -0.6875), this.I().floatValue() + 180.0f);
                    ge.b.sendToServer((IMessage)new a8(this.ae().toString(), this.o().func_178787_e(vec3d), this.I().floatValue() + 180.0f - 40.0f, 0.0f));
                    break;
                }
                case "lipsound": {
                    if (this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND, 1.5f);
                    } else {
                        this.a(com.trolmastercard.sexmod.c.GIRLS_JENNY_LIPSOUND, 1.5f);
                    }
                    ds.a(0.02f);
                    break;
                }
                case "touch": {
                    this.a(com.trolmastercard.sexmod.c.MISC_TOUCH, new int[0]);
                    break;
                }
                case "blowjobStartDone": {
                    this.b(fp.SUCKBLOWJOB_BLINK);
                    this.aT = false;
                    this.a4 = true;
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "switch": {
                    this.aT = this.func_70681_au().nextBoolean();
                    this.C.clearAnimationCache();
                    break;
                }
                case "endSwitch": {
                    this.aT = false;
                    this.a4 = !this.a4;
                    this.C.clearAnimationCache();
                    break;
                }
                case "blowjobFastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.SUCKBLOWJOB_BLINK);
                    break;
                }
                case "cumLoud": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 3.0f);
                    break;
                }
                case "cumQuiet": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 1.5f);
                    break;
                }
                case "analCumDone": 
                case "blowjobCumDone": {
                    if (!this.n()) break;
                    this.r();
                    ds.c();
                    break;
                }
                case "analStartDone": {
                    this.b(fp.KOBOLD_ANAL_SLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "analStartCam": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = ck.a(new Vec3d(0.0, 0.5625 - (double)entityPlayerSP.func_70047_e(), 0.5625), this.I().floatValue() + 180.0f);
                    ge.b.sendToServer((IMessage)new a8(this.ae().toString(), this.o().func_178787_e(vec3d), this.I().floatValue(), 0.0f));
                    break;
                }
                case "pounding": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    break;
                }
                case "analFastRapid": {
                    if (!this.n() || !d3.d) break;
                    if (this.y() == fp.KOBOLD_ANAL_FAST) {
                        this.C.tickOffset = 0.0;
                    }
                    this.b(fp.KOBOLD_ANAL_FAST);
                    break;
                }
                case "analDone": {
                    if (this.y() != fp.KOBOLD_ANAL_FAST) break;
                    this.b(fp.KOBOLD_ANAL_SLOW);
                    break;
                }
                case "analHard": {
                    if (!this.n()) break;
                    ds.a(0.04f);
                    break;
                }
                case "analSoft": {
                    if (!this.n()) break;
                    ds.a(0.02f);
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SMALLINSERTS, 2.0f);
                    break;
                }
                case "giggle": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_GIGGLE);
                    break;
                }
                case "moan": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_MOAN);
                    break;
                }
                case "moanMating": {
                    --this.aN;
                    if (this.aN > 0) break;
                    this.aN = 3;
                    this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_MOAN);
                    break;
                }
                case "analHardMSG1": {
                    --this.aN;
                    if (this.aN > 0) break;
                    this.aN = 4;
                    this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_MOAN);
                    break;
                }
                case "orgasm": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_ORGASM);
                    break;
                }
                case "breath": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_LIGHTBREATHING, 0.5f);
                    break;
                }
                case "haa": {
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_HAA, 0.7f);
                    break;
                }
                case "interested": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_INTERESTED);
                    break;
                }
                case "yep": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_YEP);
                    break;
                }
                case "bjmoan": {
                    this.b(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_BJMOAN));
                    break;
                }
                case "blowjobStartbreath": {
                    int n2 = this.func_70681_au().nextInt(3);
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_LIGHTBREATHING[n2]);
                    break;
                }
                case "matingCam": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = new Vec3d(0.0, 0.4375 - (double)entityPlayerSP.eyeHeight, -0.6875);
                    vec3d = ck.a(vec3d, this.I().floatValue() + 180.0f);
                    vec3d = vec3d.func_178787_e(this.o());
                    ge.b.sendToServer((IMessage)new a8(entityPlayerSP.getPersistentID().toString(), vec3d, this.I().floatValue() + 180.0f, 10.0f));
                    break;
                }
                case "mating_press_startDone": {
                    if (this.n()) {
                        ds.d();
                    }
                }
                case "mating_press_hardDone": {
                    if (!this.n()) break;
                    this.b(fp.MATING_PRESS_SOFT);
                    break;
                }
                case "mating_press_softReady": {
                    if (this.n()) {
                        ds.a(0.04f);
                    }
                    if (!this.n() || !d3.d) break;
                    this.b(fp.MATING_PRESS_HARD);
                    break;
                }
                case "mating_press_hardReady": {
                    if (this.n()) {
                        ds.a(0.04f);
                    }
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "mating_cum_cam": {
                    if (!this.n()) break;
                    EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
                    Vec3d vec3d = new Vec3d(0.0, 1.1875 - (double)entityPlayerSP.eyeHeight, 0.125);
                    vec3d = ck.a(vec3d, this.I().floatValue() + 180.0f);
                    vec3d = vec3d.func_178787_e(this.o());
                    ge.b.sendToServer((IMessage)new a8(entityPlayerSP.getPersistentID().toString(), vec3d, this.I().floatValue() + 180.0f, 70.0f));
                    break;
                }
                case "cumMsg": {
                    this.a("I.. hope I am satisfying you sir");
                    this.b(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_SAD[this.func_70681_au().nextInt(1)]);
                    break;
                }
                case "renderEgg": {
                    this.Q = true;
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB, 0.5f);
                    break;
                }
                case "mating_press_cumDone": {
                    if (!this.n()) break;
                    this.r();
                    break;
                }
            }
        };
        this.E.transitionLengthTicks = 10.0;
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    public int func_70302_i_() {
        return 27;
    }

    public boolean func_191420_l() {
        return false;
    }

    public ItemStack func_70301_a(int n2) {
        if (n2 >= this.X.getSlots()) {
            return ItemStack.field_190927_a;
        }
        return this.X.getStackInSlot(n2);
    }

    public ItemStack func_70298_a(int n2, int n3) {
        return this.X.extractItem(n2, n3, false);
    }

    public ItemStack func_70304_b(int n2) {
        return this.X.extractItem(n2, this.X.getStackInSlot(n2).func_190916_E(), false);
    }

    public void func_70299_a(int n2, ItemStack itemStack) {
        this.X.setStackInSlot(n2, itemStack);
    }

    public int func_70297_j_() {
        return 64;
    }

    public void func_70296_d() {
    }

    public boolean func_70300_a(EntityPlayer entityPlayer) {
        return true;
    }

    public void func_174889_b(EntityPlayer entityPlayer) {
    }

    public void func_174886_c(EntityPlayer entityPlayer) {
    }

    public boolean func_94041_b(int n2, ItemStack itemStack) {
        return true;
    }

    public int func_174887_a_(int n2) {
        return n2;
    }

    public void func_174885_b(int n2, int n3) {
    }

    public int func_174890_g() {
        return 0;
    }

    public void func_174888_l() {
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static class c$c {
        int a = 0;

        @SubscribeEvent
        public void a(LivingDeathEvent livingDeathEvent) {
            if (livingDeathEvent.getEntityLiving() instanceof ff) {
                ff ff2 = (ff)livingDeathEvent.getEntityLiving();
                if (ff2.field_70170_p.field_72995_K) {
                    return;
                }
                for (int i = 0; i < ff2.X.getSlots(); ++i) {
                    ItemStack itemStack = ff2.X.getStackInSlot(i);
                    if (itemStack.func_77973_b() == Items.field_190931_a) continue;
                    ff2.func_145779_a(itemStack.func_77973_b(), itemStack.func_190916_E());
                }
            }
        }

        @SubscribeEvent
        public void b(LivingHurtEvent livingHurtEvent) {
            EntityPlayer entityPlayer;
            Entity entity = livingHurtEvent.getEntity();
            World world = entity.func_130014_f_();
            if (world.field_72995_K) {
                return;
            }
            if (!(entity instanceof ff)) {
                return;
            }
            ff ff2 = (ff)entity;
            Optional optional = (Optional)ff2.func_184212_Q().func_187225_a(aL);
            if (!optional.isPresent()) {
                return;
            }
            Entity entity2 = livingHurtEvent.getSource().func_76346_g();
            if (entity2 == null) {
                return;
            }
            if (!(entity2 instanceof EntityLivingBase)) {
                return;
            }
            if (entity2 instanceof EntityPlayer) {
                entityPlayer = (EntityPlayer)entity2;
                if (entityPlayer.field_71075_bZ.field_75098_d) {
                    return;
                }
                if (entityPlayer.equals((Object)ff2.z())) {
                    return;
                }
            }
            if ((entityPlayer = ff2.z()) != null) {
                entityPlayer.func_146105_b((ITextComponent)new TextComponentString(TextFormatting.RED + "Your Tribe is under Attack!"), true);
            }
            com.trolmastercard.sexmod.ax.a((UUID)optional.get(), (EntityLivingBase)entity2);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SubscribeEvent
        public void a(WorldEvent.Unload var1_1) {
            try lbl-1000:
            // 4 sources

            {
                for (em var3_4 : em.ad()) {
                    if (!(var3_4 instanceof ff)) {
                        continue;
                    }
                    ** GOTO lbl-1000
                }
                return;
            }
            catch (ConcurrentModificationException var2_3) {
                // empty catch block
                return;
            }
lbl-1000:
            // 1 sources

            {
                var4_5 = (ff)var3_4;
                var5_6 = (Optional)var4_5.func_184212_Q().func_187225_a(ff.aL);
                if (!var5_6.isPresent() || !com.trolmastercard.sexmod.ax.e((UUID)var5_6.get(), var4_5)) ** GOTO lbl-1000
            }
            {
                var4_5.s((UUID)var5_6.get());
                ** GOTO lbl-1000
            }
        }

        @SubscribeEvent
        public void a(LivingHurtEvent livingHurtEvent) {
            block1: {
                if (livingHurtEvent.getSource() != DamageSource.field_76368_d) {
                    return;
                }
                Entity entity = livingHurtEvent.getEntity();
                if (!(entity instanceof ff)) break block1;
                entity.func_70107_b(entity.field_70165_t, entity.field_70163_u + 1.0, entity.field_70161_v);
                livingHurtEvent.setCanceled(true);
            }
        }

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(TickEvent.ClientTickEvent clientTickEvent) {
            block1: {
                WorldClient worldClient = Minecraft.func_71410_x().field_71441_e;
                if (worldClient == null) {
                    return;
                }
                if (++this.a % 20 != 0) break block1;
                ge.b.sendToServer((IMessage)new b3());
            }
        }

        private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
            return concurrentModificationException;
        }
    }
}
