package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.a1;
import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.b3;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.ba;
import com.trolmastercard.sexmod.bh;
import com.trolmastercard.sexmod.bs;
import com.trolmastercard.sexmod.c7;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.co;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.dj;
import com.trolmastercard.sexmod.dr;
import com.trolmastercard.sexmod.dw;
import com.trolmastercard.sexmod.e1;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.en;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.g7;
import com.trolmastercard.sexmod.ge;
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
    public static final DataParameter<Float> aE = EntityDataManager.createKey(ff.class, (DataSerializer)DataSerializers.FLOAT).getSerializer().createKey(122);
    public static final DataParameter<String> T = EntityDataManager.createKey(ff.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(123);
    public static final DataParameter<Boolean> aC = EntityDataManager.createKey(ff.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(124);
    public static final DataParameter<Boolean> aZ = EntityDataManager.createKey(ff.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(125);
    public static final DataParameter<String> aU = EntityDataManager.createKey(ff.class, (DataSerializer)DataSerializers.STRING).getSerializer().createKey(126);
    public static final DataParameter<Boolean> ak = EntityDataManager.createKey(ff.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(127);
    public static final DataParameter<Boolean> at = EntityDataManager.createKey(ff.class, (DataSerializer)DataSerializers.BOOLEAN).getSerializer().createKey(128);
    public static final DataParameter<Optional<UUID>> aL = EntityDataManager.createKey(ff.class, (DataSerializer)DataSerializers.OPTIONAL_UNIQUE_ID).getSerializer().createKey(129);
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
    Vec3d aS = Vec3d.ZERO;
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
        this.setSize(0.5f, 0.99f);
    }

    ff(World world, UUID uUID, float f) {
        this(world);
        this.m.set(aL, (Object)Optional.of((Object)uUID));
        this.m.set(aE, (Object)Float.valueOf(f));
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
        return new ArrayList<Integer>(){
            {
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
        arrayList.add(Math.round(((Float)this.m.get(aE)).floatValue() * 100.0f / 0.25f));
        arrayList.add(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((String)this.m.get(N))));
        arrayList.add(EyeAndKoboldColor.indexOf(EyeAndKoboldColor.safeValueOf((Vec3i)this.m.get(K))));
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(List<Integer> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    /*
     * Exception decompiling
     */
    void m() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
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

    /*
     * Exception decompiling
     */
    @Override
    public e1 g(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    @Override
    public String c() {
        return (String)this.m.get(T);
    }

    @Override
    public float i() {
        return 0.2f - (0.25f - ((Float)this.m.get(aE)).floatValue());
    }

    public float getEyeHeight() {
        return 0.94f;
    }

    public static float j() {
        return (float)(Math.random() * 0.25);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.values()[this.getRNG().nextInt(EyeAndKoboldColor.values().length)];
        this.m.register(K, (Object)new BlockPos(eyeAndKoboldColor.getMainColor()));
        this.m.register(N, (Object)aJ.name());
        this.m.register(aL, (Object)Optional.absent());
        this.m.register(aE, (Object)Float.valueOf(0.0f));
        this.m.register(T, (Object)ba.values()[this.getRNG().nextInt(ba.values().length)].toString());
        this.m.register(aC, (Object)false);
        this.m.register(aZ, (Object)false);
        this.m.register(aU, (Object)"null");
        this.m.register(ak, (Object)false);
        this.m.register(at, (Object)false);
    }

    @Override
    protected void initEntityAI() {
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 0.4, false, new HashSet(I)));
        this.tasks.addTask(3, (EntityAIBase)new hz((EntityLiving)this));
        this.tasks.addTask(5, (EntityAIBase)this.o);
    }

    protected float getJumpUpwardsMotion() {
        return 0.45f;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(af);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(30.0);
    }

    @Override
    public boolean canBePushed() {
        return true;
    }

    protected boolean processInteract(EntityPlayer entityPlayer, EnumHand enumHand) {
        block45: {
            block43: {
                block44: {
                    block42: {
                        ItemStack itemStack;
                        block40: {
                            block41: {
                                block39: {
                                    try {
                                        if (this.ae() != null) {
                                            return false;
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ff.a(illegalArgumentException);
                                    }
                                    ItemStack itemStack2 = entityPlayer.getHeldItem(EnumHand.MAIN_HAND);
                                    if (!itemStack2.getItem().equals(Items.NAME_TAG)) {
                                        itemStack2 = entityPlayer.getHeldItem(EnumHand.OFF_HAND);
                                    }
                                    try {
                                        try {
                                            if (!itemStack2.getItem().equals(Items.NAME_TAG) || !entityPlayer.getPersistentID().toString().equals(this.m.get(v))) break block39;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ff.a(illegalArgumentException);
                                        }
                                        this.m.set(T, (Object)itemStack2.getDisplayName());
                                        itemStack2.shrink(1);
                                        return true;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ff.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    if (((Boolean)this.m.get(aC)).booleanValue()) {
                                        return false;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                try {
                                    if (this.y() == fp.SLEEP) {
                                        return false;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                itemStack = entityPlayer.getHeldItem(EnumHand.MAIN_HAND);
                                if (itemStack.getItem() != hy.b) {
                                    itemStack = entityPlayer.getHeldItem(EnumHand.OFF_HAND);
                                }
                                try {
                                    try {
                                        try {
                                            if (this.J() || itemStack.getItem() != hy.b) break block40;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ff.a(illegalArgumentException);
                                        }
                                        if (this.world.isRemote) break block41;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ff.a(illegalArgumentException);
                                    }
                                    return true;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                            }
                            Optional optional = (Optional)this.m.get(aL);
                            try {
                                if (!optional.isPresent()) {
                                    return true;
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            try {
                                if (!aY.isEmpty()) {
                                    return true;
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            this.m((UUID)optional.get());
                            return true;
                        }
                        try {
                            try {
                                try {
                                    if (!this.J() || itemStack.getItem() != hy.b) break block42;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                if (!((String)this.m.get(v)).equals(entityPlayer.getPersistentID().toString())) break block42;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            entityPlayer.openGui((Object)Main.instance, 1, this.world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ());
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (!this.world.isRemote) break block43;
                                if (!this.J()) break block44;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            if (!((String)this.m.get(v)).equals(entityPlayer.getPersistentID().toString())) break block44;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        this.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_MASTER);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                this.b(entityPlayer);
                break block45;
            }
            this.e(entityPlayer.getPersistentID());
            this.getNavigator().clearPath();
            this.b((float)(Math.atan2(this.posZ - entityPlayer.posZ, this.posX - entityPlayer.posX) * 57.29577951308232 + 90.0));
            this.c(new Vec3d(this.posX, Math.floor(this.posY), this.posZ));
            this.m.set(G, (Object)true);
            this.b(fp.NULL);
        }
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    void m(UUID uUID) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new g7(uUID));
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean b(EntityPlayer entityPlayer) {
        block7: {
            try {
                try {
                    if (!this.J() || !entityPlayer.getPersistentID().toString().equals(this.m.get(v))) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new m(this, entityPlayer, new String[]{"anal", "oral", "mating"}, null, false));
                return true;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        try {
            if (this.getActivePotionEffect(co.b) != null) {
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new m(this, entityPlayer, new String[]{"anal", "oral"}, null, false));
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new m(this, entityPlayer, new String[]{"anal", "oral"}, new ItemStack[]{new ItemStack(Items.GOLD_INGOT, 3), new ItemStack(Items.IRON_PICKAXE)}, false));
        return true;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void ac() {
        try {
            if (this.az) {
                this.az = false;
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
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
        try {
            this.az = true;
            if ("oral".equals(string)) {
                this.a("animationFollowUp", fp.STARTBLOWJOB.toString());
                this.a(true, uUID);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if ("anal".equals(string)) {
                this.a("animationFollowUp", fp.KOBOLD_ANAL_START.toString());
                this.a(true, uUID);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if ("mating".equals(string)) {
                this.a("animationFollowUp", fp.MATING_PRESS_START.toString());
                this.a(true, uUID);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
    }

    @Override
    public void b() {
        this.a2 = true;
        this.m.set(G, (Object)false);
    }

    @Override
    protected void a() {
        dj.c();
    }

    boolean g() {
        try {
            if (!this.a2) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        ++this.aD;
        this.noClip = false;
        this.setNoGravity(false);
        if (this.aD > 40) {
            this.a2 = false;
            this.aD = 0;
            EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(this.ae());
            this.b(entityPlayer.rotationYaw + 180.0f);
            this.m.set(G, (Object)true);
            entityPlayer.noClip = true;
            entityPlayer.setNoGravity(true);
            this.noClip = true;
            this.setNoGravity(true);
            this.getNavigator().clearPath();
            this.U();
            return true;
        }
        this.rotationYaw = this.I().floatValue();
        this.setNoGravity(false);
        Vec3d vec3d = b6.a(this.getPositionVector(), this.o(), 40 - this.aD);
        this.setPosition(vec3d.x, vec3d.y, vec3d.z);
        this.b(fp.NULL);
        Optional optional = (Optional)this.m.get(aL);
        try {
            if (!optional.isPresent()) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p((UUID)optional.get());
        try {
            if (collection == null) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        for (bs bs2 : collection) {
            bs2.c(this);
        }
        return true;
    }

    void o(UUID uUID) {
        try {
            if (this.V == -1) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (++this.V < 132) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            this.V = -1;
            if (this.y() != fp.MATING_PRESS_CUM) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        UUID uUID2 = this.ae();
        try {
            if (uUID2 == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID2);
        try {
            if (entityPlayer == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        EyeAndKoboldColor eyeAndKoboldColor = com.trolmastercard.sexmod.ax.l(uUID);
        ItemStack itemStack = new ItemStack((Item)c7.a, 1, eyeAndKoboldColor.getWoolMeta());
        NBTTagCompound nBTTagCompound = itemStack.getTagCompound();
        if (nBTTagCompound == null) {
            nBTTagCompound = new NBTTagCompound();
        }
        nBTTagCompound.setString("tribeID", uUID.toString());
        nBTTagCompound.setString("tribeColor", eyeAndKoboldColor.toString());
        itemStack.setTagCompound(nBTTagCompound);
        entityPlayer.inventory.addItemStackToInventory(itemStack);
    }

    @Override
    public void updateAITasks() {
        Optional optional;
        block39: {
            Object object;
            block40: {
                block38: {
                    block37: {
                        super.updateAITasks();
                        this.ax = false;
                        optional = (Optional)this.m.get(aL);
                        if (optional.isPresent()) {
                            this.o((UUID)optional.get());
                            com.trolmastercard.sexmod.ax.k((UUID)optional.get());
                            object = this.z();
                            try {
                                if (object != null) {
                                    com.trolmastercard.sexmod.ax.a((UUID)optional.get(), object.getPersistentID());
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                        }
                        try {
                            if (this.g()) {
                                return;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        try {
                            if (this.ae() != null) {
                                return;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        try {
                            try {
                                try {
                                    if (((Boolean)this.m.get(aC)).booleanValue()) break block37;
                                    if (this.getHealth() == this.getMaxHealth()) break block38;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                if (++this.a5 < 100) break block38;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            this.setHealth(this.getHealth() + 2.0f);
                            this.a5 = 0;
                            ge.b.sendToAllTracking((IMessage)new en(this.f(), EnumParticleTypes.HEART.getParticleName()), (Entity)this);
                            break block38;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    this.a5 = 0;
                }
                try {
                    if (!((Boolean)this.m.get(G)).booleanValue()) {
                        this.setNoGravity(false);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                try {
                    if (!optional.isPresent()) {
                        return;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                try {
                    try {
                        --this.aP;
                        if (this.y() != fp.ATTACK) break block39;
                        this.getNavigator().clearPath();
                        this.rotationYaw = this.I().floatValue();
                        this.rotationYawHead = this.I().floatValue();
                        ++this.U;
                        if (22 != this.U) break block40;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    this.u();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            if (32 == this.U) {
                object = com.trolmastercard.sexmod.ax.e((UUID)optional.get());
                HashSet<EntityLivingBase> hashSet = new HashSet<EntityLivingBase>();
                Iterator iterator = ((HashSet)object).iterator();
                while (iterator.hasNext()) {
                    EntityLivingBase entityLivingBase = (EntityLivingBase)iterator.next();
                    try {
                        if (entityLivingBase.getDistance((Entity)this) > 2.0f) {
                            continue;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    try {
                        entityLivingBase.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 5.0f);
                        if (!entityLivingBase.isDead) continue;
                        hashSet.add(entityLivingBase);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                for (EntityLivingBase entityLivingBase : hashSet) {
                    com.trolmastercard.sexmod.ax.b((UUID)optional.get(), entityLivingBase);
                }
            }
            try {
                if (84 <= this.U) {
                    this.b(fp.NULL);
                    this.m.set(G, (Object)false);
                    this.U = 0;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            return;
        }
        this.m.set(aC, (Object)this.c((UUID)optional.get(), false));
        this.m.set(aZ, (Object)com.trolmastercard.sexmod.ax.e((UUID)optional.get(), this));
        this.m.set(ak, (Object)com.trolmastercard.sexmod.ax.c((UUID)optional.get()));
        this.d();
        this.h();
        this.o.a = this.o();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        this.t();
        this.v();
        this.q();
        this.w();
        this.m();
    }

    void w() {
        float f;
        block28: {
            try {
                if (!this.world.isRemote) {
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (this.world.getTotalWorldTime() - 300L < aV) {
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (!this.J()) {
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (this.y() != fp.NULL) {
                    return;
                }    void n(UUID uUID) {
        if (this.d(uUID)) {
            return;
        }
        boolean tribe_state = com.trolmastercard.sexmod.ax.i(uUID);
        if (!tribe_state) {
            this.l(uUID);
            return;
        }
        this.aF = null;
        this.h(uUID);
    }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (!"".equals(this.m.get(h))) {
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (((Boolean)this.m.get(ak)).booleanValue()) {
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            String string = (String)this.m.get(v);
            EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 10.0);
            try {
                if (entityPlayer == null) {
                    this.S = Float.MAX_VALUE;
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (!entityPlayer.getPersistentID().toString().equals(string)) {
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            f = this.getDistance((Entity)entityPlayer);
            try {
                try {
                    if (!(f < 2.0f) || !(this.S > 2.0f)) break block28;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                this.b(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_KOBOLD_HEYMASTER));
                this.a("Hey master!");
                aV = this.world.getTotalWorldTime();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        this.S = f;
    }

    void q() {
        try {
            if (!this.world.isRemote) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (this.y() == fp.SLEEP) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (!((Boolean)this.m.get(ak)).booleanValue()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (!this.J()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(UUID.fromString((String)this.m.get(v)));
        try {
            if (entityPlayer == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        this.b(entityPlayer);
    }

    void t() {
        try {
            if (((Boolean)this.m.get(aC)).booleanValue()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (this.J()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        Optional optional = (Optional)this.m.get(aL);
        try {
            if (!optional.isPresent()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        for (EntityPlayer entityPlayer : this.world.playerEntities) {
            block24: {
                PathNavigate pathNavigate;
                double d;
                block23: {
                    block22: {
                        double d2 = d = entityPlayer.getPositionVector().distanceTo(this.getPositionVector());
                        if (!this.world.isRemote) {
                            for (ff ff2 : com.trolmastercard.sexmod.ax.n((UUID)optional.get())) {
                                double d4 = entityPlayer.getPositionVector().distanceTo(ff2.getPositionVector());
                                if (!(d4 < d2)) continue;
                                d2 = d4;
                            }
                        }
                        try {
                            if (d2 > 10.0) {
                                continue;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        try {
                            try {
                                if (entityPlayer.getHeldItem(EnumHand.MAIN_HAND).getItem() == hy.b || entityPlayer.getHeldItem(EnumHand.OFF_HAND).getItem() == hy.b) break block22;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            return;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    pathNavigate = this.getNavigator();
                    try {
                        pathNavigate.clearPath();
                        if (!this.world.isRemote) break block23;
                        this.b(entityPlayer);
                        break block24;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                if (d > 2.0) {
                    ff ff2;
                    ff2 = this.c(entityPlayer.getPosition());
                    pathNavigate.tryMoveToXYZ((double)ff2.getX(), (double)ff2.getY(), (double)ff2.getZ(), (double)0.35f);
                }
            }
            return;
        }
    }

    @Override
    protected void U() {
        String string;
        block27: {
            block29: {
                boolean bl;
                block24: {
                    block26: {
                        boolean bl2;
                        block23: {
                            block22: {
                                boolean bl3;
                                string = (String)this.m.get(em.h);
                                try {
                                    bl3 = this.getActivePotionEffect(co.b) != null;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                boolean bl4 = bl3;
                                boolean bl5 = false;
                                if (this.J()) {
                                    bl5 = ((String)this.m.get(v)).equals(this.ae().toString());
                                }
                                try {
                                    try {
                                        if (bl4 || bl5) break block22;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ff.a(illegalArgumentException);
                                    }
                                    bl2 = true;
                                    break block23;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                            }
                            bl2 = false;
                        }
                        bl = bl2;
                        try {
                            block25: {
                                try {
                                    try {
                                        if (!string.equals(fp.STARTBLOWJOB.toString())) break block24;
                                        if (!bl) break block25;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ff.a(illegalArgumentException);
                                    }
                                    if (this.y() != fp.PAYMENT) break block26;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                            }
                            this.b(fp.STARTBLOWJOB);
                            break block24;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    this.b(fp.PAYMENT);
                }
                try {
                    block28: {
                        try {
                            try {
                                if (!string.equals(fp.KOBOLD_ANAL_START.toString())) break block27;
                                if (!bl) break block28;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            if (this.y() != fp.PAYMENT) break block29;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    this.b(fp.KOBOLD_ANAL_START);
                    break block27;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            this.b(fp.PAYMENT);
        }
        try {
            if (string.equals(fp.MATING_PRESS_START.toString())) {
                this.b(fp.MATING_PRESS_START);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
    }

    void v() {
        try {
            if (!this.world.isRemote) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        UUID uUID = this.ae();
        try {
            if (uUID == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (!((Boolean)this.m.get(G)).booleanValue()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (this.y() != fp.NULL) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
        try {
            if (entityPlayer == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        this.b(entityPlayer);
    }

    void b(EntityPlayer entityPlayer) {
        float f;
        double d;
        double d2;
        Vec3d vec3d;
        Vec3d vec3d2;
        ei ei2 = ei.d(entityPlayer.getPersistentID());
        try {
            Vec3d vec3d3;
            vec3d2 = vec3d3;
            vec3d = vec3d3;
            d2 = entityPlayer.posX;
            d = entityPlayer.posY;
            f = ei2 == null ? entityPlayer.eyeHeight : ei2.getEyeHeight();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        vec3d2(d2, d + (double)f, entityPlayer.posZ);
        Vec3d vec3d4 = vec3d;
        Vec3d vec3d5 = new Vec3d(this.posX, this.posY + (double)this.getEyeHeight(), this.posZ);
        double d4 = vec3d5.distanceTo(vec3d4);
        double d5 = vec3d4.y - vec3d5.y;
        this.rotationPitch = (float)(-(Math.sin(d5 / d4) * 57.29577951308232));
    }

    void u() {
    }

    boolean o() {
        try {
            if (this.y() != fp.NULL) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (Math.abs(this.motionX) + Math.abs(this.motionZ) > 0.01) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (this.a()) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void d() {
        UUID uUID;
        block23: {
            block21: {
                block22: {
                    Optional optional = (Optional)this.m.get(aL);
                    try {
                        if (!optional.isPresent()) {
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    uUID = (UUID)optional.get();
                    try {
                        try {
                            try {
                                if (((Boolean)this.m.get(aC)).booleanValue() || !com.trolmastercard.sexmod.ax.c(uUID)) break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            if (this.J()) break block22;
                            return;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                EntityPlayer entityPlayer = this.z();
                try {
                    if (entityPlayer == null) {
                        return;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                for (bs bs2 : com.trolmastercard.sexmod.ax.p(uUID)) {
                    try {
                        if (!bs2.b(this)) continue;
                        bs2.c(this);
                        this.b(fp.NULL);
                        this.m.set(G, (Object)false);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                this.noClip = false;
                this.setNoGravity(false);
                PathNavigate pathNavigate = this.getNavigator();
                double d = this.getPositionVector().distanceTo(entityPlayer.getPositionVector());
                try {
                    try {
                        if (!(d > 2.0)) return;
                        pathNavigate.tryMoveToEntityLiving((Entity)entityPlayer, this.a(entityPlayer, d));
                        this.k();
                        if (!(d > 15.0)) return;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    this.c(entityPlayer);
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            try {
                if (!com.trolmastercard.sexmod.ax.e(uUID, this)) break block23;
                this.b(uUID);
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        this.n(uUID);
    }

    protected double a(EntityPlayer entityPlayer, double d) {
        double d2 = entityPlayer.isSprinting() ? 0.7 : 0.35;
        double d4 = Math.floor(d / 5.0) * 0.3;
        d2 += d4;
        if (this.isInWater()) {
            d2 *= 60.0;
        }
        return d2;
    }

    void s(UUID uUID) {
        BlockPos blockPos = com.trolmastercard.sexmod.ax.m(uUID);
        try {
            if (blockPos == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (this.aX != null) {
                this.world.setBlockState(blockPos, this.aX);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (this.R != null) {
                this.world.setBlockState(blockPos.add(0, -1, 0), this.R);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
    }

    /*
     * Exception decompiling
     */
    void b(UUID var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 6[SWITCH]
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

    void p(UUID uUID) {
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
        try {
            if (collection == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        for (bs bs2 : collection) {
            bs2.a();
        }
    }

    void q(UUID uUID) {
        try {
            if (!this.J()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        List<ff> list = com.trolmastercard.sexmod.ax.n(uUID);
        for (ff ff2 : list) {
            try {
                com.trolmastercard.sexmod.ax.b(ff2);
                if (ff2.ae() != null) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            ff2.noClip = false;
            ff2.setNoGravity(false);
            ff2.getDataManager().set(G, (Object)false);
            ff2.b(fp.NULL);
        }
    }

    void l(UUID uUID) {
        block5: {
            block4: {
                Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
                if (collection != null) {
                    for (bs bs2 : collection) {
                        bs2.c(this);
                    }
                }
                try {
                    if (!this.J()) break block4;
                    this.i(uUID);
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            this.a(uUID);
        }
    }

    void i(UUID uUID) {
        BlockPos blockPos;
        block27: {
            block29: {
                block28: {
                    BlockPos[] blockPosArray = com.trolmastercard.sexmod.ax.a(this);
                    if (blockPosArray != null) {
                        float f;
                        ff ff2;
                        boolean bl;
                        Vec3d vec3d = new Vec3d((double)((float)blockPosArray[0].getX() + 0.5f), (double)blockPosArray[0].getY() + 0.5625, (double)((float)blockPosArray[0].getZ() + 0.5f));
                        Vec3d vec3d2 = new Vec3d((double)((float)blockPosArray[1].getX() + 0.5f), (double)blockPosArray[1].getY() + 0.5625, (double)((float)blockPosArray[1].getZ() + 0.5f));
                        try {
                            bl = vec3d.subtract((Vec3d)vec3d2).x == 0.0;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        boolean bl2 = bl;
                        Vec3d vec3d3 = b6.a(vec3d, vec3d2, 0.5);
                        try {
                            this.m.set(G, (Object)true);
                            this.c(vec3d3);
                            ff2 = this;
                            f = bl2 ? 0.0f : 90.0f;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        ff2.b(f);
                        this.noClip = true;
                        this.setNoGravity(true);
                        return;
                    }
                    HashSet<BlockPos> hashSet = com.trolmastercard.sexmod.ax.j(uUID);
                    blockPos = null;
                    try {
                        if (hashSet == null) {
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    for (BlockPos blockPos2 : hashSet) {
                        IBlockState iBlockState = this.world.getBlockState(blockPos2);
                        boolean bl = false;
                        for (Map.Entry entry : iBlockState.getProperties().entrySet()) {
                            if (!(entry.getKey() instanceof PropertyBool)) continue;
                            bl = (Boolean)entry.getValue();
                            break;
                        }
                        try {
                            if (bl) {
                                continue;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        try {
                            if (com.trolmastercard.sexmod.ax.a(blockPos2)) {
                                continue;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        if (blockPos == null) {
                            blockPos = blockPos2;
                            continue;
                        }
                        if (!(this.getDistanceSq(blockPos) > this.getDistanceSq(blockPos2))) continue;
                        blockPos = blockPos2;
                    }
                    try {
                        if (blockPos == null) {
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (!(blockPos.getDistance((int)this.posX, (int)this.posY, (int)this.posZ) > 2.0)) break block27;
                            if (Math.abs(blockPos.subtract((Vec3i)this.getPosition()).getY()) <= 4) break block28;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        this.b(blockPos.add(0, 1, 0));
                        break block29;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                BlockPos blockPos3 = this.c(blockPos);
                try {
                    this.getNavigator().tryMoveToXYZ((double)blockPos3.getX(), (double)blockPos3.getY(), (double)blockPos3.getZ(), (double)0.35f);
                    if (this.getNavigator().getPath() == null) {
                        this.b(blockPos.add(0, 1, 0));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            return;
        }
        com.trolmastercard.sexmod.ax.a(this, blockPos);
        this.b(fp.SLEEP);
    }

    void a(UUID uUID) {
        block12: {
            int n2;
            int n3;
            int n4;
            int n5;
            BlockPos blockPos;
            block14: {
                block13: {
                    BlockPos blockPos2;
                    block11: {
                        blockPos2 = com.trolmastercard.sexmod.ax.m(uUID);
                        try {
                            if (blockPos2 != null || !com.trolmastercard.sexmod.ax.e(uUID, this)) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        BlockPos blockPos3 = this.getPosition().add(1, 0, 0);
                        this.R = this.world.getBlockState(blockPos3.add(0, -1, 0));
                        this.aX = this.world.getBlockState(blockPos3);
                        this.world.setBlockState(blockPos3.add(0, -1, 0), Blocks.NETHERRACK.getDefaultState());
                        this.world.setBlockState(blockPos3, dw.a.getDefaultState());
                        com.trolmastercard.sexmod.ax.b(uUID, blockPos3);
                    }
                    try {
                        if (blockPos2 == null) {
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (this.aF != null) break block12;
                            ff ff2 = this;
                            blockPos = blockPos2;
                            if (!this.getRNG().nextBoolean()) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        n5 = 1;
                        break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                n5 = -1;
            }
            try {
                n4 = n5 * (this.getRNG().nextInt(2) + 1);
                n3 = 0;
                n2 = this.getRNG().nextBoolean() ? 1 : -1;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            ff2.aF = blockPos.add(n4, n3, n2 * (this.getRNG().nextInt(2) + 1));
        }
        this.getNavigator().tryMoveToXYZ((double)this.aF.getX(), (double)this.aF.getY(), (double)this.aF.getZ(), (double)0.35f);
        this.k();
    }

    void c(UUID uUID) {
        block9: {
            Collection<bs> collection;
            block8: {
                try {
                    if (this.J()) {
                        com.trolmastercard.sexmod.ax.b(uUID, null);
                        this.g(uUID);
                        return;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                collection = com.trolmastercard.sexmod.ax.p(uUID);
                try {
                    if (collection == null) {
                        return;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                try {
                    if (!this.ao) break block8;
                    this.aM = null;
                    this.b(uUID, collection);
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            this.a(uUID, collection);
        }
    }

    void b(UUID uUID, Collection<bs> collection) {
        try {
            if (collection.isEmpty()) {
                this.ao = false;
                this.r(uUID);
                this.h("Lets go somewhere else");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
    }

    void a(UUID uUID, Collection<bs> collection) {
        BlockPos blockPos;
        block19: {
            block17: {
                block18: {
                    blockPos = com.trolmastercard.sexmod.ax.m(uUID);
                    try {
                        if (blockPos == null) {
                            this.r(uUID);
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (this.ticksExisted % 40 != 0) break block17;
                            if (!this.aS.equals((Object)this.getPositionVector())) break block18;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        this.r(uUID);
                        this.aM = null;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                this.aS = this.getPositionVector();
            }
            try {
                try {
                    if (this.aM != null && !(this.aM.getDistance((int)this.posX, (int)this.posY, (int)this.posZ) < 4.0)) break block19;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                this.aM = this.t(uUID);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        try {
            this.getNavigator().tryMoveToXYZ((double)this.aM.getX(), (double)this.aM.getY(), (double)this.aM.getZ(), (double)0.35f);
            this.k();
            if (Math.sqrt(this.getPosition().distanceSq((Vec3i)blockPos)) > 5.0) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        this.ao = true;
        this.h("Time to work bitches!");
        int n2 = com.trolmastercard.sexmod.ax.h(uUID);
        try {
            for (int i = 1; i < n2; ++i) {
                this.c(uUID, collection);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        com.trolmastercard.sexmod.ax.b(uUID, null);
    }

    protected void c(EntityPlayer entityPlayer) {
        BlockPos blockPos;
        int n2 = 0;
        do {
            blockPos = entityPlayer.getPosition().add(com.trolmastercard.sexmod.r.f.nextInt(10), 0, com.trolmastercard.sexmod.r.f.nextInt(10));
        } while (++n2 < 20 && !this.attemptTeleport(blockPos.getX(), blockPos.getY(), blockPos.getZ()));
        try {
            if (n2 == 20) {
                this.setPosition(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
    }

    BlockPos t(UUID uUID) {
        BlockPos blockPos = com.trolmastercard.sexmod.ax.m(uUID);
        try {
            if (blockPos == null) {
                return BlockPos.ORIGIN;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        return this.c(blockPos);
    }

    BlockPos c(BlockPos blockPos) {
        double d;
        double d2;
        int n2;
        double d4;
        double d5;
        int n3;
        BlockPos blockPos2 = this.getPosition();
        BlockPos blockPos3 = blockPos.subtract((Vec3i)blockPos2);
        try {
            if (Math.abs(blockPos3.getX()) + Math.abs(blockPos3.getZ()) < 20) {
                return blockPos;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        double d7 = Math.min(Math.abs(blockPos3.getX()), Math.abs(blockPos3.getZ()));
        double d8 = Math.max(Math.abs(blockPos3.getX()), Math.abs(blockPos3.getZ()));
        double d9 = d7 / (d8 + d7);
        try {
            n3 = blockPos3.getX() > 0 ? 1 : -1;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            d5 = n3 * 20;
            d4 = d7 == (double)Math.abs(blockPos3.getX()) ? d9 : 1.0 - d9;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        int n4 = (int)(d5 * d4);
        try {
            n2 = blockPos3.getZ() > 0 ? 1 : -1;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            d2 = n2 * 20;
            d = d7 == (double)Math.abs(blockPos3.getZ()) ? d9 : 1.0 - d9;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        int n5 = (int)(d2 * d);
        BlockPos blockPos4 = this.getPosition().add(n4, 0, n5);
        blockPos4 = new BlockPos(blockPos4.getX(), cj.a(this.world, blockPos4.getX(), blockPos4.getZ()) + 1, blockPos4.getZ());
        return blockPos4;
    }

    /*
     * Exception decompiling
     */
    void r(UUID var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    void c(UUID uUID, Collection<bs> collection) {
        List<BlockPos> list = this.a(this.getPosition(), BlockLog.class, 30, 4, null);
        BlockPos blockPos = null;
        for (BlockPos blockPos2 : list) {
            Block block = this.world.getBlockState(blockPos2.down()).getBlock();
            if (block instanceof BlockLog) continue;
            try {
                if (block == Blocks.AIR) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
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
        try {
            if (blockPos == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        bs.a(this.world, blockPos, uUID);
        this.h("Someone, go fall this tree!");
    }
    boolean p() {
        long l = this.world.getWorldTime();
        if (l < 12000L) {
            return true;
        }
        return false;
    }
    boolean d(UUID uUID) {
        return this.c(uUID, true);
    }

    boolean c(UUID uUID, boolean bl) {
        Iterator<Object> iterator;
        Object object2;
        HashSet<EntityLivingBase> hashSet = com.trolmastercard.sexmod.ax.e(uUID);
        ff ff2 = com.trolmastercard.sexmod.ax.f(uUID);
        try {
            if (ff2 == null) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        for (Object object2 : this.world.getEntitiesWithinAABB(ff.class, new AxisAlignedBB(ff2.posX - 30.0, ff2.posY - 30.0, ff2.posZ - 30.0, ff2.posX + 30.0, ff2.posY + 30.0, ff2.posZ + 30.0))) {
            try {
                if (!this.canEntityBeSeen((Entity)object2)) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                try {
                    if (((em)((Object)object2)).J() && this.J()) {
                        continue;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            iterator = (Optional)object2.getDataManager().get(aL);
            try {
                if (!iterator.isPresent()) {
                    hashSet.add((EntityLivingBase)object2);
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (((UUID)iterator.get()).equals(uUID)) continue;
                hashSet.add((EntityLivingBase)object2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        EntityLivingBase entityLivingBase = null;
        object2 = new ArrayList();
        for (EntityLivingBase entityLivingBase2 : hashSet) {
            try {
                if (entityLivingBase2.isDead) {
                    object2.add(entityLivingBase2);
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (ff2.getDistance((Entity)entityLivingBase2) > 30.0f) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (entityLivingBase != null && !(this.getDistance((Entity)entityLivingBase) > this.getDistance((Entity)entityLivingBase2))) continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            entityLivingBase = entityLivingBase2;
        }
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            EntityLivingBase entityLivingBase2;
            entityLivingBase2 = (EntityLivingBase)iterator.next();
            com.trolmastercard.sexmod.ax.b(uUID, entityLivingBase2);
        }
        try {
            if (entityLivingBase == null) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (!bl) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (this.y() != fp.ATTACK) {
                this.m.set(G, (Object)false);
                this.b(fp.NULL);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        iterator = this.c(entityLivingBase.getPosition());
        try {
            this.getNavigator().tryMoveToXYZ((double)iterator.getX(), (double)iterator.getY(), (double)iterator.getZ(), 0.7);
            this.k();
            if (this.getDistance((Entity)entityLivingBase) > 1.5f) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (this.aP > 0) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        float f = (float)(Math.atan2(this.posZ - entityLivingBase.posZ, this.posX - entityLivingBase.posX) * 57.29577951308232 + 90.0);
        this.b(f);
        this.b(fp.ATTACK);
        this.aP = 84;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
     
    void n(UUID uUID) {
        if (this.d(uUID)) {
            return;
        }
        boolean tribe_state = com.trolmastercard.sexmod.ax.i(uUID);
        if (!tribe_state) {
            this.l(uUID);
            return;
        }
        this.aF = null;
        this.h(uUID);
    }

    void h(UUID uUID) {
        block22: {
            block20: {
                block21: {
                    BlockPos blockPos = com.trolmastercard.sexmod.ax.m(uUID);
                    try {
                        if (blockPos == null) {
                            this.aM = null;
                            this.g(uUID);
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    ff ff2 = com.trolmastercard.sexmod.ax.f(uUID);
                    try {
                        if (com.trolmastercard.sexmod.ax.g(uUID)) {
                            this.getNavigator().clearPath();
                            this.aM = null;
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    try {
                        if (ff2 == null) {
                            System.out.println("leader of tribe " + uUID + " is null");
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    try {
                        if (ff2.getDistance((Entity)this) > 20.0f) {
                            this.setPosition(ff2.posX, ff2.posY, ff2.posZ);
                            this.aM = null;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (this.ticksExisted % 40 != 0) break block20;
                            if (!this.aS.equals((Object)this.getPositionVector())) break block21;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        this.aM = this.t(uUID);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                this.aS = this.getPositionVector();
            }
            try {
                try {
                    if (this.aM != null && !(this.aM.getDistance((int)this.posX, (int)this.posY, (int)this.posZ) < 4.0)) break block22;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                this.aM = this.t(uUID);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        this.getNavigator().tryMoveToXYZ((double)this.aM.getX(), (double)this.aM.getY(), (double)this.aM.getZ(), (double)0.35f);
        this.k();
    }

    void g(UUID uUID) {
        try {
            if (this.ae() != null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
        try {
            if (collection == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        bs bs2 = null;
        for (bs bs3 : collection) {
            if (!bs3.b(this)) continue;
            bs2 = bs3;
            break;
        }
        if (bs2 == null) {
            for (bs bs3 : collection) {
                try {
                    try {
                        if (this.J() && !this.c(uUID, bs3)) {
                            continue;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                try {
                    if (!this.a(bs3)) {
                        this.ax = true;
                        continue;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                if (!bs3.a(this)) continue;
                bs2 = bs3;
                try {
                    this.aI = null;
                    if (bs3.d() == bs.a.FALL_TREE) {
                        this.h("Ima fall this tree owo");
                        break;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                this.h("Ima go mine uwu");
                this.b(bs3.b());
                this.world.setBlockState(bs3.b(), Blocks.AIR.getDefaultState());
                break;
            }
        }
        try {
            if (bs2 == null) {
                this.u(uUID);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (bs2.d() == bs.a.FALL_TREE) {
                this.a(uUID, bs2.b(), bs2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (bs2.d() == bs.a.MINE) {
                this.b(uUID, bs2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
    }

    void b(BlockPos blockPos) {
        ge.b.sendToAllTracking((IMessage)new en(this.f(), EnumParticleTypes.PORTAL.getParticleName(), 30), new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 30.0));
        this.setPosition(0.5f + (float)blockPos.getX(), blockPos.getY(), 0.5f + (float)blockPos.getZ());
        ge.b.sendToAllTracking((IMessage)new en(this.f(), EnumParticleTypes.PORTAL.getParticleName(), 30), new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 30.0));
    }

    void b(UUID uUID, bs bs2) {
        try {
            if (this.y() != fp.MINE) {
                this.a(uUID, bs2);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        --this.Z;
        --this.ai;
        if (this.ai == 0) {
            IBlockState iBlockState;
            IBlockState iBlockState2 = this.world.getBlockState(this.aI.up());
            if (!(iBlockState2.getBlock() instanceof BlockFalling)) {
                bs2.a(this.aI);
                iBlockState = this.z();
                try {
                    if (iBlockState != null) {
                        ge.b.sendTo((IMessage)new h6(this.aI, false), (EntityPlayerMP)iBlockState);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            iBlockState = this.world.getBlockState(this.aI);
            this.b(new ItemStack(iBlockState.getBlock().getItemDropped(iBlockState, this.getRNG(), 0), 1, iBlockState.getBlock().damageDropped(iBlockState)));
            this.world.destroyBlock(this.aI, false);
        }
        try {
            if (this.Z <= 0) {
                this.Z = 100;
                this.ai = 24;
                this.b(fp.NULL);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
    }

    void a(UUID uUID, bs bs2) {
        PathNavigate pathNavigate;
        block28: {
            block27: {
                block25: {
                    BlockPos blockPos;
                    block26: {
                        pathNavigate = this.getNavigator();
                        try {
                            try {
                                if (this.aI != null && bs2.g().contains(this.aI)) break block25;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            this.aI = this.a(bs2, uUID);
                            if (this.aI != null) break block26;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        boolean bl = bs2.g().isEmpty();
                        HashSet<BlockPos> hashSet = com.trolmastercard.sexmod.ax.a(uUID, bs2);
                        UUID uUID2 = com.trolmastercard.sexmod.ax.b(uUID);
                        try {
                            if (uUID2 == null) {
                                return;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID2);
                        try {
                            if (entityPlayer == null) {
                                return;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        try {
                            if (!bl) {
                                entityPlayer.sendMessage((ITextComponent)new TextComponentString(String.format("<%s> It's impossible to mine here...", this.c())));
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        ge.b.sendTo((IMessage)new h6(hashSet, false), (EntityPlayerMP)entityPlayer);
                        return;
                    }
                    if (Math.abs(this.getPosition().getY() - bs2.b().getY()) > 3) {
                        blockPos = bs2.b().add(bs2.f().getOpposite().getDirectionVec());
                        this.world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                        this.b(blockPos);
                    }
                    blockPos = this.aI.add(bs2.f().getOpposite().getDirectionVec());
                    pathNavigate.tryMoveToXYZ((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ(), (double)0.35f);
                    return;
                }
                IBlockState iBlockState = this.world.getBlockState(this.aI);
                try {
                    if (!this.a(new ItemStack(iBlockState.getBlock().getItemDropped(iBlockState, com.trolmastercard.sexmod.r.f, 0)))) {
                        this.ax = true;
                        this.b(uUID, true);
                        return;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                try {
                    try {
                        try {
                            try {
                                if (this.motionX != 0.0 || this.motionZ != 0.0) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            if (!this.onGround) break block27;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        if (this.getDistance(this.aI.getX(), this.aI.getY(), this.aI.getZ()) > 3.0) break block27;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    if (++this.aK >= 10) break block28;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            BlockPos blockPos = this.aI.add(bs2.f().getOpposite().getDirectionVec());
            pathNavigate.tryMoveToXYZ((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ(), (double)0.35f);
            return;
        }
        pathNavigate.clearPath();
        this.aK = 0;
        this.b(fp.MINE);
        this.rotationYaw = this.rotationYawHead = (float)(Math.atan2(this.posZ - (double)this.aI.getZ(), this.posX - (double)this.aI.getX()) * 57.29577951308232 + 90.0);
        this.m.set(at, (Object)false);
    }

    /*
     * Exception decompiling
     */
    BlockPos a(bs var1_1, UUID var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 23[SWITCH]
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

    @Nullable
    BlockPos a(List<BlockPos> list, int n2, EnumFacing enumFacing, BlockPos blockPos) {
        BlockPos blockPos2;
        int n3;
        ArrayList<BlockPos> arrayList;
        ArrayList<BlockPos> arrayList2;
        ArrayList<BlockPos> arrayList3;
        block33: {
            int n4;
            block32: {
                try {
                    if (list.isEmpty()) {
                        return null;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                arrayList3 = new ArrayList<BlockPos>();
                arrayList2 = new ArrayList<BlockPos>();
                arrayList = new ArrayList<BlockPos>();
                try {
                    try {
                        if (enumFacing != EnumFacing.SOUTH && enumFacing != EnumFacing.WEST) break block32;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    n4 = -1;
                    break block33;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            n4 = n3 = 1;
        }
        if (enumFacing.getAxis() == EnumFacing.Axis.Z) {
            blockPos2 = new BlockPos(blockPos.getX(), blockPos.getY(), list.get(0).getZ());
            arrayList.add(blockPos2);
            arrayList.add(blockPos2.up());
            arrayList.add(blockPos2.up().up());
            arrayList.add(blockPos2.west());
            arrayList.add(blockPos2.west().up());
            arrayList.add(blockPos2.west().up().up());
            arrayList.add(blockPos2.east());
            arrayList.add(blockPos2.east().up());
            arrayList.add(blockPos2.east().up().up());
            if (n2 == 0) {
                for (BlockPos blockPos3 : arrayList) {
                    arrayList2.add(blockPos3.east(2));
                    arrayList2.add(blockPos3.east(-2));
                }
                for (BlockPos blockPos3 : list) {
                    try {
                        if (arrayList2.contains(blockPos3)) continue;
                        arrayList3.add(blockPos3);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
            } else {
                for (BlockPos blockPos3 : arrayList) {
                    arrayList2.add(blockPos3.east(n3 * 2 * n2));
                }
                for (BlockPos blockPos3 : arrayList2) {
                    try {
                        if (!list.contains(blockPos3)) continue;
                        arrayList3.add(blockPos3);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
            }
        }
        if (enumFacing.getAxis() == EnumFacing.Axis.X) {
            blockPos2 = new BlockPos(list.get(0).getX(), blockPos.getY(), blockPos.getZ());
            arrayList.add(blockPos2);
            arrayList.add(blockPos2.up());
            arrayList.add(blockPos2.up().up());
            arrayList.add(blockPos2.north());
            arrayList.add(blockPos2.north().up());
            arrayList.add(blockPos2.north().up().up());
            arrayList.add(blockPos2.south());
            arrayList.add(blockPos2.south().up());
            arrayList.add(blockPos2.south().up().up());
            if (n2 == 0) {
                for (BlockPos blockPos3 : arrayList) {
                    arrayList2.add(blockPos3.south(2));
                    arrayList2.add(blockPos3.south(-2));
                }
                for (BlockPos blockPos3 : list) {
                    try {
                        if (arrayList2.contains(blockPos3)) continue;
                        arrayList3.add(blockPos3);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
            } else {
                for (BlockPos blockPos3 : arrayList) {
                    arrayList2.add(blockPos3.south(n3 * 2 * n2));
                }
                for (BlockPos blockPos3 : arrayList2) {
                    try {
                        if (!list.contains(blockPos3)) continue;
                        arrayList3.add(blockPos3);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
            }
        }
        try {
            if (arrayList3.isEmpty()) {
                return null;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        return (BlockPos)arrayList3.get(this.getRNG().nextInt(arrayList3.size()));
    }

    void u(UUID uUID) {
        try {
            if (this.b(uUID, false)) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        this.e();
    }

    void e() {
        block26: {
            block25: {
                block22: {
                    int n2;
                    int n3;
                    block24: {
                        block23: {
                            block20: {
                                EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 15.0);
                                try {
                                    try {
                                        try {
                                            try {
                                                if (!this.J() || entityPlayer == null) break block20;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw ff.a(illegalArgumentException);
                                            }
                                            if (!(entityPlayer.getDistance((Entity)this) < 2.0f)) break block20;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ff.a(illegalArgumentException);
                                        }
                                        if (!((String)this.m.get(v)).equals(entityPlayer.getPersistentID().toString())) break block20;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ff.a(illegalArgumentException);
                                    }
                                    this.getNavigator().clearPath();
                                    return;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    block21: {
                                        try {
                                            try {
                                                if (this.ap == null || this.getDistance(this.ap.getX(), this.ap.getY(), this.ap.getZ()) > this.n()) break block21;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw ff.a(illegalArgumentException);
                                            }
                                            if (this.ab <= 100) break block22;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ff.a(illegalArgumentException);
                                        }
                                    }
                                    if (!this.getRNG().nextBoolean()) break block23;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                n3 = 1;
                                break block24;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                        }
                        n3 = -1;
                    }
                    int n4 = n3 * this.getRNG().nextInt(5);
                    try {
                        n2 = this.getRNG().nextBoolean() ? 1 : -1;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    int n5 = n2 * this.getRNG().nextInt(5);
                    int n6 = cj.a(this.world, this.getPosition().getX() + n4, this.getPosition().getZ() + n5);
                    this.ap = new BlockPos(this.getPosition().getX() + n4, n6, this.getPosition().getZ() + n5);
                    this.ab = 0;
                }
                try {
                    if (!(Math.sqrt(this.ap.distanceSq((Vec3i)this.getPosition())) > 2.0)) break block25;
                    this.getNavigator().tryMoveToXYZ((double)this.ap.getX(), (double)this.ap.getY(), (double)this.ap.getZ(), (double)0.35f);
                    this.k();
                    break block26;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            ++this.ab;
        }
    }

    double n() {
        return Math.sqrt(800.0);
    }

    boolean b(UUID uUID, boolean bl) {
        block13: {
            try {
                if (this.f()) {
                    return false;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (this.a(uUID, bl)) {
                    this.a0 = 0;
                    return true;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                try {
                    if (--this.a0 < 0 && this.ax) break block13;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                return false;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        this.a0 = 300;
        EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(UUID.fromString((String)this.m.get(v)));
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf((String)this.m.get(N));
        try {
            if (entityPlayer != null) {
                entityPlayer.sendStatusMessage((ITextComponent)new TextComponentString(eyeAndKoboldColor.getTextColor() + this.c() + "s " + TextFormatting.WHITE + "inventory is full and there are either no chests to put her items in or said chests are full as well"), false);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        return false;
    }

    boolean a(UUID uUID, boolean bl) {
        block37: {
            block38: {
                TileEntityChest tileEntityChest;
                BlockPos blockPos3;
                BlockPos blockPos2;
                block35: {
                    block36: {
                        int n2;
                        IItemHandler iItemHandler;
                        HashSet<BlockPos> hashSet = com.trolmastercard.sexmod.ax.q(uUID);
                        try {
                            if (hashSet == null) {
                                return false;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        blockPos2 = null;
                        for (BlockPos blockPos3 : hashSet) {
                            TileEntityChest tileEntityChest2 = (TileEntityChest)this.world.getTileEntity(blockPos3);
                            iItemHandler = tileEntityChest2.getSingleChestHandler();
                            n2 = 0;
                            for (int i = 0; i < this.X.getSlots(); ++i) {
                                ItemStack itemStack = this.X.getStackInSlot(i);
                                try {
                                    if (itemStack.isEmpty()) {
                                        continue;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                for (int j = 0; j < iItemHandler.getSlots(); ++j) {
                                    ItemStack itemStack2 = iItemHandler.insertItem(j, itemStack, true);
                                    if (itemStack2.getCount() == itemStack.getCount()) continue;
                                    n2 = 1;
                                    break;
                                }
                                try {
                                    if (n2 == 0) continue;
                                    break;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                            }
                            try {
                                if (n2 == 0) {
                                    continue;
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            if (blockPos2 == null) {
                                blockPos2 = blockPos3;
                                continue;
                            }
                            if (!(this.getDistanceSq(blockPos2) > this.getDistanceSq(blockPos3))) continue;
                            blockPos2 = blockPos3;
                        }
                        try {
                            if (blockPos2 == null) {
                                return false;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        if (this.getDistance(blockPos2.getX(), blockPos2.getY(), blockPos2.getZ()) < 2.0) {
                            tileEntityChest = (TileEntityChest)this.world.getTileEntity(blockPos2);
                            blockPos3 = tileEntityChest.getSingleChestHandler();
                            block25: for (int i = 0; i < this.X.getSlots(); ++i) {
                                iItemHandler = this.X.getStackInSlot(i);
                                try {
                                    if (iItemHandler.isEmpty()) {
                                        continue;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                for (n2 = 0; n2 < blockPos3.getSlots(); ++n2) {
                                    ItemStack itemStack = blockPos3.insertItem(n2, (ItemStack)iItemHandler, false);
                                    try {
                                        if (itemStack.getCount() <= 0) {
                                            this.X.setStackInSlot(i, ItemStack.EMPTY);
                                            continue block25;
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ff.a(illegalArgumentException);
                                    }
                                    this.X.setStackInSlot(i, itemStack);
                                    iItemHandler = itemStack;
                                }
                            }
                            this.world.playSound(null, blockPos2, SoundEvents.BLOCK_CHEST_LOCKED, SoundCategory.BLOCKS, 1.0f, 1.0f);
                            return true;
                        }
                        try {
                            try {
                                if (Math.abs(blockPos2.getY() - this.getPosition().getY()) <= 4) break block35;
                                if (!bl) break block36;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            this.b(blockPos2);
                            break block37;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    return false;
                }
                tileEntityChest = this.getNavigator();
                blockPos3 = this.c(blockPos2);
                try {
                    try {
                        tileEntityChest.tryMoveToXYZ((double)blockPos3.getX(), (double)blockPos3.getY(), (double)blockPos3.getZ(), (double)0.35f);
                        if (tileEntityChest.getPath() != null) break block37;
                        if (!bl) break block38;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    this.b(blockPos2);
                    break block37;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            return false;
        }
        return true;
    }

    boolean c(UUID uUID, bs bs2) {
        List<ff> list = com.trolmastercard.sexmod.ax.n(uUID);
        Collection<bs> collection = com.trolmastercard.sexmod.ax.p(uUID);
        ff ff2 = null;
        Vec3d vec3d = new Vec3d((double)bs2.b().getX(), (double)bs2.b().getY(), (double)bs2.b().getZ());
        for (ff ff3 : list) {
            boolean bl = false;
            for (bs bs3 : collection) {
                if (!bs3.b(ff3)) continue;
                bl = true;
                break;
            }
            try {
                if (bl) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (ff3.ae() != null) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            if (ff2 == null) {
                ff2 = ff3;
                continue;
            }
            if (!(ff2.getPositionVector().distanceTo(vec3d) > ff3.getPositionVector().distanceTo(vec3d))) continue;
            ff2 = ff3;
        }
        return this.equals(ff2);
    }

    /*
     * Exception decompiling
     */
    void a(UUID var1_1, bs var2_2, BlockPos var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 5[SWITCH]
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

    /*
     * Could not resolve type clashes
     * Loose catch block
     */
    void a(UUID uUID, BlockPos blockPos, bs bs2) {
        block58: {
            Object object2;
            try {
                if (this.y() != fp.MINE) {
                    this.a(blockPos, uUID);
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                --this.W;
                if (this.W > 0) {
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (this.W == 0) {
                    ge.b.sendToAllAround((IMessage)new a1(this.f()), this.P());
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                if (this.world.getBlockState(blockPos).getBlock() == Blocks.AIR) {
                    this.a(uUID, bs2, blockPos);
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            try {
                --this.aR;
                if (this.aR >= 0) {
                    return;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            this.aR = 24;
            this.W = 78;
            HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
            EntityPlayer entityPlayer = this.z();
            for (Object object2 : bs2.g()) {
                block55: {
                    try {
                        if (this.world.getBlockState((BlockPos)object2).getBlock() == Blocks.AIR) {
                            hashSet.add((BlockPos)object2);
                            continue;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    if (object2.getX() != blockPos.getX()) break block55;
                    try {
                        if (object2.getZ() == blockPos.getZ()) {
                            continue;
                        }
                        break block55;
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                try {
                    ItemStack itemStack = this.world.getBlockState((BlockPos)object2).getBlock().getItem(this.world, blockPos, this.world.getBlockState(blockPos));
                    try {
                        if (itemStack.getItem() != Items.AIR) {
                            this.b(itemStack);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    Main.LOGGER.error("Couldn't get an item out of the block that a kobold just destroyed when falling a tree. As a result, the block wasn't added into the kobolds inventory. If you see this message, pls tell trol about it and send her the following stacktrace. Do you maybe remember what block the kobold just removed? Stacktrace follwing:");
                    Main.LOGGER.warn("block in question: " + this.world.getBlockState((BlockPos)object2).getBlock().getTranslationKey());
                    Main.LOGGER.error(illegalArgumentException.getMessage());
                }
                try {
                    this.ad = this.a((BlockPos)object2);
                    this.world.destroyBlock((BlockPos)object2, false);
                    bs2.a((BlockPos)object2);
                    bs2.b(hashSet);
                    hashSet.add((BlockPos)object2);
                    if (entityPlayer != null) {
                        ge.b.sendTo((IMessage)new h6(hashSet, false), (EntityPlayerMP)entityPlayer);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                return;
            }
            try {
                ItemStack itemStack = this.world.getBlockState(blockPos).getBlock().getItem(this.world, blockPos, this.world.getBlockState(blockPos));
                try {
                    if (itemStack.getItem() != Items.AIR) {
                        this.b(itemStack);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                Main.LOGGER.error("Couldn't get an item out of the block that a kobold just destroyed when falling a tree. As a result, the block wasn't added into the kobolds inventory. If you see this message, pls tell trol about it and send her the following stacktrace. Do you maybe remember what block the kobold just removed? Stacktrace follwing:");
                Main.LOGGER.warn("block in question: " + this.world.getBlockState(blockPos).getBlock().getTranslationKey());
                Main.LOGGER.error(illegalArgumentException.getMessage());
            }
            this.ad = this.a(blockPos);
            this.world.destroyBlock(blockPos, false);
            int n2 = 0;
            for (BlockPos blockPos2 : bs2.g()) {
                try {
                    if (!(this.world.getBlockState(blockPos2).getBlock() instanceof BlockLog)) continue;
                    ++n2;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            object2 = new HashSet();
            try {
                for (int i = 0; i < n2; ++i) {
                    ((HashSet)object2).add(blockPos.add(0, i, 0));
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            HashSet<BlockPos> hashSet2 = new HashSet<BlockPos>();
            for (BlockPos blockPos3 : bs2.g()) {
                try {
                    if (((HashSet)object2).contains(blockPos3)) continue;
                    hashSet2.add(blockPos3);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            try {
                try {
                    if (hashSet2.isEmpty() || entityPlayer == null) break block58;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                ge.b.sendTo((IMessage)new h6(hashSet2, false), (EntityPlayerMP)entityPlayer);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        int n3 = 1;
        while (true) {
            BlockPos blockPos3;
            blockPos3 = blockPos.add(0, n3, 0);
            IBlockState iBlockState = this.world.getBlockState(blockPos3);
            if (this.world.getBlockState(blockPos3).getBlock() instanceof BlockLog) {
                this.world.destroyBlock(blockPos3, false);
                EntityFallingBlock entityFallingBlock = new EntityFallingBlock(this.world, (double)blockPos3.getX() + 0.5, (double)blockPos3.getY(), (double)blockPos3.getZ() + 0.5, iBlockState);
                entityFallingBlock.fallTime = 1;
                this.world.spawnEntity((Entity)entityFallingBlock);
            }
            try {
                if (!bs2.g().contains(blockPos3)) {
                    break;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            ++n3;
        }
    }

    ItemStack a(BlockPos blockPos) {
        block26: {
            int n2;
            int n3;
            block25: {
                block24: {
                    block23: {
                        block22: {
                            ItemStack itemStack;
                            try {
                                itemStack = this.world.getBlockState(blockPos).getBlock().getItem(this.world, blockPos, this.world.getBlockState(blockPos));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                Main.LOGGER.error("Couldn't turn a wooden block into an item to get its meta data. As a result the kobold is just gonna plant a oak saplinig instead. If you see this message, pls tell trol about it and send her the following stacktrace. Do you maybe remember what block the kobold just removed? Stacktrace follwing:");
                                Main.LOGGER.warn("block in question: " + this.world.getBlockState(blockPos).getBlock().getTranslationKey());
                                Main.LOGGER.error(illegalArgumentException.getMessage());
                                return new ItemStack(Blocks.SAPLING, 1, 0);
                            }
                            n3 = ItemBlock.getIdFromItem((Item)itemStack.getItem());
                            n2 = itemStack.getItem().getMetadata(itemStack);
                            try {
                                try {
                                    if (n3 != 17 || n2 != 1) break block22;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                return new ItemStack(Blocks.SAPLING, 1, 1);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (n3 != 17 || n2 != 2) break block23;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            return new ItemStack(Blocks.SAPLING, 1, 2);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (n3 != 17 || n2 != 3) break block24;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        return new ItemStack(Blocks.SAPLING, 1, 3);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (n3 != 162 || n2 != 0) break block25;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    return new ItemStack(Blocks.SAPLING, 1, 4);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            try {
                try {
                    if (n3 != 162 || n2 != 1) break block26;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                return new ItemStack(Blocks.SAPLING, 1, 5);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        return new ItemStack(Blocks.SAPLING, 1, 0);
    }

    void a(BlockPos blockPos, UUID uUID) {
        BlockPos blockPos2;
        block34: {
            EntityPlayer entityPlayer;
            block35: {
                ArrayList<BlockPos> arrayList;
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                blockPos2 = null;
                                arrayList = new ArrayList<BlockPos>();
                                try {
                                    try {
                                        if (!this.world.getBlockState(blockPos.north().down()).isFullCube() || this.world.getBlockState(blockPos.north()).isFullBlock()) break block30;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ff.a(illegalArgumentException);
                                    }
                                    arrayList.add(blockPos.north());
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    if (!this.world.getBlockState(blockPos.east().down()).isFullCube() || this.world.getBlockState(blockPos.east()).isFullBlock()) break block31;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                arrayList.add(blockPos.east());
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (!this.world.getBlockState(blockPos.south().down()).isFullCube() || this.world.getBlockState(blockPos.south()).isFullBlock()) break block32;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            arrayList.add(blockPos.south());
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (!this.world.getBlockState(blockPos.west().down()).isFullCube() || this.world.getBlockState(blockPos.west()).isFullBlock()) break block33;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        arrayList.add(blockPos.west());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                for (BlockPos blockPos3 : arrayList) {
                    if (blockPos2 == null) {
                        blockPos2 = blockPos3;
                        continue;
                    }
                    double d = new Vec3d((double)((float)blockPos2.getX() + 0.5f), (double)blockPos2.getY(), (double)((float)blockPos2.getZ() + 0.5f)).distanceTo(this.getPositionVector());
                    double d2 = new Vec3d((double)((float)blockPos3.getX() + 0.5f), (double)blockPos3.getY(), (double)((float)blockPos3.getZ() + 0.5f)).distanceTo(this.getPositionVector());
                    if (!(d2 < d)) continue;
                    blockPos2 = blockPos3;
                }
                if (blockPos2 == null) {
                    com.trolmastercard.sexmod.ax.b(uUID, this);
                    entityPlayer = this.z();
                    try {
                        if (entityPlayer == null) {
                            return;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    entityPlayer.sendStatusMessage((ITextComponent)new TextComponentString("Your kobolds cannot fall this tree because it starts underground"), true);
                    return;
                }
                try {
                    try {
                        if (!(this.getPosition().getDistance(blockPos2.getX(), blockPos2.getY(), blockPos2.getZ()) > 1.0)) break block34;
                        if (Math.abs(this.getPosition().getY() - blockPos2.getY()) <= 4) break block35;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    this.b(blockPos2);
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            entityPlayer = this.c(blockPos2);
            this.getNavigator().tryMoveToXYZ((double)entityPlayer.getX() + 0.5, (double)entityPlayer.getY(), (double)entityPlayer.getZ() + 0.5, 0.35);
            this.k();
            return;
        }
        float f = 0.0f;
        if (blockPos2.subtract((Vec3i)blockPos).equals((Object)new BlockPos(0, 0, -1))) {
            f = 0.0f;
        }
        if (blockPos2.subtract((Vec3i)blockPos).equals((Object)new BlockPos(1, 0, 0))) {
            f = 90.0f;
        }
        if (blockPos2.subtract((Vec3i)blockPos).equals((Object)new BlockPos(0, 0, 1))) {
            f = 180.0f;
        }
        if (blockPos2.subtract((Vec3i)blockPos).equals((Object)new BlockPos(-1, 0, 0))) {
            f = -90.0f;
        }
        this.c(new Vec3d((double)blockPos2.getX() + 0.5, (double)blockPos2.getY(), (double)blockPos2.getZ() + 0.5));
        this.b(f);
        this.m.set(G, (Object)true);
        this.m.set(at, (Object)true);
        this.b(fp.MINE);
        this.world.destroyBlock(blockPos2.up(), false);
    }

    void h() {
        try {
            if (this.aA) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        Optional optional = (Optional)this.m.get(aL);
        try {
            if (!optional.isPresent()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        this.m.set(N, (Object)com.trolmastercard.sexmod.ax.l((UUID)optional.get()).toString());
    }

    @Override
    public void b(fp fp2) {
        block25: {
            block23: {
                block21: {
                    try {
                        block22: {
                            try {
                                try {
                                    if (this.y() != fp.MATING_PRESS_CUM) break block21;
                                    if (fp2 == fp.MATING_PRESS_SOFT) break block22;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ff.a(illegalArgumentException);
                                }
                                if (fp2 != fp.MATING_PRESS_HARD) break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                        }
                        return;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                try {
                    block24: {
                        try {
                            try {
                                if (this.y() != fp.KOBOLD_ANAL_CUM) break block23;
                                if (fp2 == fp.KOBOLD_ANAL_SLOW) break block24;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ff.a(illegalArgumentException);
                            }
                            if (fp2 != fp.KOBOLD_ANAL_FAST) break block23;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                    }
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            try {
                block26: {
                    try {
                        try {
                            if (this.y() != fp.CUMBLOWJOB) break block25;
                            if (fp2 == fp.SUCKBLOWJOB) break block26;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        if (fp2 != fp.THRUSTBLOWJOB) break block25;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        try {
            if (fp2 == fp.MATING_PRESS_CUM) {
                this.V = 0;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        super.b(fp2);
    }

    public void onDeath(DamageSource damageSource) {
        try {
            super.onDeath(damageSource);
            if (this.world.isRemote) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        Optional optional = (Optional)this.m.get(aL);
        try {
            if (!optional.isPresent()) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        UUID uUID = (UUID)optional.get();
        com.trolmastercard.sexmod.ax.a(uUID, this);
        if (this.J()) {
            EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(UUID.fromString((String)this.getDataManager().get(v)));
            try {
                if (entityPlayer != null) {
                    entityPlayer.sendMessage((ITextComponent)new TextComponentString(String.format("%s%s%s has perished %suwu", TextFormatting.RED, this.c(), TextFormatting.WHITE, TextFormatting.RED)));
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
    }

    @Override
    protected fp c(fp fp2) {
        try {
            if (fp2 == fp.SUCKBLOWJOB_BLINK) {
                return fp.THRUSTBLOWJOB;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (fp2 == fp.KOBOLD_ANAL_SLOW) {
                return fp.KOBOLD_ANAL_FAST;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        block14: {
            block13: {
                block12: {
                    try {
                        try {
                            if (fp2 != fp.THRUSTBLOWJOB && fp2 != fp.SUCKBLOWJOB_BLINK) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        return fp.CUMBLOWJOB;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (fp2 != fp.KOBOLD_ANAL_SLOW && fp2 != fp.KOBOLD_ANAL_FAST) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    return fp.KOBOLD_ANAL_CUM;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            try {
                try {
                    if (fp2 != fp.MATING_PRESS_HARD && fp2 != fp.MATING_PRESS_SOFT) break block14;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                return fp.MATING_PRESS_CUM;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
        }
        return null;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nBTTagCompound) {
        super.writeEntityToNBT(nBTTagCompound);
        nBTTagCompound.setFloat("body_size", ((Float)this.m.get(aE)).floatValue());
        nBTTagCompound.setInteger("eyeColorX", ((BlockPos)this.m.get(K)).getX());
        nBTTagCompound.setInteger("eyeColorY", ((BlockPos)this.m.get(K)).getY());
        nBTTagCompound.setInteger("eyeColorZ", ((BlockPos)this.m.get(K)).getZ());
        nBTTagCompound.setString("model", (String)this.m.get(M));
        nBTTagCompound.setString("name", (String)this.m.get(T));
        nBTTagCompound.setString("master", (String)this.m.get(v));
        nBTTagCompound.setTag("inventory", (NBTBase)this.X.serializeNBT());
        nBTTagCompound.setString("bodyColor", (String)this.m.get(N));
        nBTTagCompound.setBoolean("editedColorManually", this.aA);
        Optional optional = (Optional)this.m.get(aL);
        try {
            if (optional.isPresent()) {
                nBTTagCompound.setUniqueId("tribeId", (UUID)optional.get());
                nBTTagCompound.setBoolean("isLeader", com.trolmastercard.sexmod.ax.e((UUID)optional.get(), this));
                nBTTagCompound.setString("tribeName", (String)this.m.get(aU));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nBTTagCompound) {
        block18: {
            UUID uUID;
            block19: {
                super.readEntityFromNBT(nBTTagCompound);
                String string = nBTTagCompound.getString("model");
                try {
                    if (!"".equals(string)) {
                        this.m.set(M, (Object)string);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                BlockPos blockPos = new BlockPos(nBTTagCompound.getInteger("eyeColorX"), nBTTagCompound.getInteger("eyeColorY"), nBTTagCompound.getInteger("eyeColorZ"));
                try {
                    if (!BlockPos.ORIGIN.equals((Object)blockPos)) {
                        this.m.set(K, (Object)blockPos);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                this.m.set(aE, (Object)Float.valueOf(nBTTagCompound.getFloat("body_size")));
                this.m.set(T, (Object)nBTTagCompound.getString("name"));
                this.m.set(v, (Object)nBTTagCompound.getString("master"));
                this.X.deserializeNBT(nBTTagCompound.getCompoundTag("inventory"));
                String string2 = nBTTagCompound.getString("bodyColor");
                try {
                    if (!"".equals(string2)) {
                        this.m.set(N, (Object)nBTTagCompound.getString("bodyColor"));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
                this.aA = nBTTagCompound.getBoolean("editedColorManually");
                uUID = nBTTagCompound.getUniqueId("tribeId");
                try {
                    try {
                        try {
                            if (uUID == null || this.isDead) break block18;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        this.m.set(aL, (Object)Optional.of((Object)uUID));
                        if (com.trolmastercard.sexmod.ax.o(uUID)) break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    com.trolmastercard.sexmod.ax.a(uUID, EyeAndKoboldColor.valueOf((String)this.m.get(N)));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            try {
                com.trolmastercard.sexmod.ax.c(uUID, this);
                if (nBTTagCompound.getBoolean("isLeader")) {
                    com.trolmastercard.sexmod.ax.d(uUID, this);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
            this.m.set(aU, (Object)nBTTagCompound.getString("tribeName"));
        }
    }

    @Override
    public boolean a() {
        boolean bl;
        try {
            if (this.h()) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        Block block = this.world.getBlockState(this.getPosition().add(0, 1, 0)).getBlock();
        try {
            bl = !block.isPassable((IBlockAccess)this.world, this.getPosition().add(0, 1, 0));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        return bl;
    }

    boolean f() {
        int n2 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n2 >= this.X.getSlots()) break;
                        if (this.X.getStackInSlot(n2).isEmpty()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            ++n2;
        }
        return true;
    }

    boolean a(bs bs2) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        for (BlockPos blockPos : bs2.g()) {
            try {
                IBlockState iBlockState = this.world.getBlockState(blockPos);
                ItemStack itemStack = iBlockState.getBlock().getItem(this.world, blockPos, iBlockState);
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
        try {
            for (int i = 0; i < itemStackHandler.getSlots(); ++i) {
                itemStackHandler.setStackInSlot(i, this.X.getStackInSlot(i));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        for (ItemStack itemStack : list) {
            try {
                if (this.a(itemStackHandler, itemStack, true, false)) continue;
                return false;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ff.a(illegalArgumentException);
            }
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
            int n3;
            block22: {
                block23: {
                    itemStack2 = itemStackHandler.getStackInSlot(n2);
                    try {
                        if (itemStack2.getItem() != itemStack.getItem()) {
                            continue;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    try {
                        if (itemStack2.getMetadata() != itemStack.getMetadata()) {
                            continue;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    n3 = itemStack2.getMaxStackSize();
                    try {
                        try {
                            if (n3 <= itemStack.getCount() + itemStack2.getCount()) break block22;
                            if (bl) break block23;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ff.a(illegalArgumentException);
                        }
                        itemStack2.setCount(itemStack2.getCount() + itemStack.getCount());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                }
                return true;
            }
            int n4 = n3 - itemStack2.getCount();
            itemStack2.setCount(n3);
            itemStack.setCount(itemStack.getCount() - n4);
        }
        for (n2 = 0; n2 < itemStackHandler.getSlots(); ++n2) {
            block24: {
                itemStack2 = itemStackHandler.getStackInSlot(n2);
                try {
                    try {
                        if (itemStack2.getItem() != Items.AIR) continue;
                        if (bl) break block24;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ff.a(illegalArgumentException);
                    }
                    itemStackHandler.setStackInSlot(n2, itemStack);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ff.a(illegalArgumentException);
                }
            }
            return true;
        }
        try {
            if (bl) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        try {
            if (!bl2) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        EntityItem entityItem = new EntityItem(this.world);
        entityItem.setItem(itemStack);
        entityItem.setPosition(this.posX, this.posY, this.posZ);
        this.world.spawnEntity((Entity)entityItem);
        return false;
    }

    void b(SoundEvent soundEvent, float f) {
        float f2 = 0.25f - ((Float)this.m.get(aE)).floatValue();
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
        this.b(soundEventArray[this.getRNG().nextInt(soundEventArray.length)], f);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 18[SWITCH]
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

    @Override
    @SideOnly(value=Side.CLIENT)
    public void registerControllers(AnimationData animationData) {
        try {
            if (this.C == null) {
                this.p();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        AnimationController.ISoundListener iSoundListener = var1_1 -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 33[SWITCH]
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        };
        this.E.transitionLengthTicks = 10.0;
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    public int getSizeInventory() {
        return 27;
    }

    public boolean isEmpty() {
        return false;
    }

    public ItemStack getStackInSlot(int n2) {
        try {
            if (n2 >= this.X.getSlots()) {
                return ItemStack.EMPTY;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ff.a(illegalArgumentException);
        }
        return this.X.getStackInSlot(n2);
    }

    public ItemStack decrStackSize(int n2, int n3) {
        return this.X.extractItem(n2, n3, false);
    }

    public ItemStack removeStackFromSlot(int n2) {
        return this.X.extractItem(n2, this.X.getStackInSlot(n2).getCount(), false);
    }

    public void setInventorySlotContents(int n2, ItemStack itemStack) {
        this.X.setStackInSlot(n2, itemStack);
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public void markDirty() {
    }

    public boolean isUsableByPlayer(EntityPlayer entityPlayer) {
        return true;
    }

    public void openInventory(EntityPlayer entityPlayer) {
    }

    public void closeInventory(EntityPlayer entityPlayer) {
    }

    public boolean isItemValidForSlot(int n2, ItemStack itemStack) {
        return true;
    }

    public int getField(int n2) {
        return n2;
    }

    public void setField(int n2, int n3) {
    }

    public int getFieldCount() {
        return 0;
    }

    public void clear() {
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static class c {
        int a = 0;

        @SubscribeEvent
        public void a(LivingDeathEvent livingDeathEvent) {
            if (livingDeathEvent.getEntityLiving() instanceof ff) {
                ff ff2 = (ff)livingDeathEvent.getEntityLiving();
                try {
                    if (ff2.world.isRemote) {
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
                }
                for (int i = 0; i < ff2.X.getSlots(); ++i) {
                    ItemStack itemStack = ff2.X.getStackInSlot(i);
                    try {
                        if (itemStack.getItem() == Items.AIR) continue;
                        ff2.dropItem(itemStack.getItem(), itemStack.getCount());
                        continue;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
                    }
                }
            }
        }

        @SubscribeEvent
        public void b(LivingHurtEvent livingHurtEvent) {
            EntityPlayer entityPlayer;
            Entity entity = livingHurtEvent.getEntity();
            World world = entity.getEntityWorld();
            try {
                if (world.isRemote) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
            try {
                if (!(entity instanceof ff)) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
            ff ff2 = (ff)entity;
            Optional optional = (Optional)ff2.getDataManager().get(aL);
            try {
                if (!optional.isPresent()) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
            Entity entity2 = livingHurtEvent.getSource().getTrueSource();
            try {
                if (entity2 == null) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
            try {
                if (!(entity2 instanceof EntityLivingBase)) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
            if (entity2 instanceof EntityPlayer) {
                entityPlayer = (EntityPlayer)entity2;
                try {
                    if (entityPlayer.capabilities.isCreativeMode) {
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
                }
                try {
                    if (entityPlayer.equals((Object)ff2.z())) {
                        return;
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
                }
            }
            entityPlayer = ff2.z();
            try {
                if (entityPlayer != null) {
                    entityPlayer.sendStatusMessage((ITextComponent)new TextComponentString(TextFormatting.RED + "Your Tribe is under Attack!"), true);
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
            com.trolmastercard.sexmod.ax.a((UUID)optional.get(), (EntityLivingBase)entity2);
        }

        @SubscribeEvent
        public void a(WorldEvent.Unload unload) {
            try {
                for (em em2 : em.ad()) {
                    try {
                        if (!(em2 instanceof ff)) {
                            continue;
                        }
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
                    }
                    ff ff2 = (ff)em2;
                    Optional optional = (Optional)ff2.getDataManager().get(aL);
                    try {
                        if (!optional.isPresent()) {
                            continue;
                        }
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
                    }
                    try {
                        if (!com.trolmastercard.sexmod.ax.e((UUID)optional.get(), ff2)) {
                            continue;
                        }
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
                    }
                    ff2.s((UUID)optional.get());
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                // empty catch block
            }
        }

        @SubscribeEvent
        public void a(LivingHurtEvent livingHurtEvent) {
            try {
                if (livingHurtEvent.getSource() != DamageSource.IN_WALL) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
            Entity entity = livingHurtEvent.getEntity();
            try {
                if (entity instanceof ff) {
                    entity.setPosition(entity.posX, entity.posY + 1.0, entity.posZ);
                    livingHurtEvent.setCanceled(true);
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
        }

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(TickEvent.ClientTickEvent clientTickEvent) {
            WorldClient worldClient = Minecraft.getMinecraft().world;
            try {
                if (worldClient == null) {
                    return;
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
            try {
                if (++this.a % 20 == 0) {
                    ge.b.sendToServer((IMessage)new b3());
                }
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                throw com.trolmastercard.sexmod.ff$c.a(concurrentModificationException);
            }
        }

        private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
            return concurrentModificationException;
        }
    }
}
