/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
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

import com.trolmastercard.sexmod.bw;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.cz;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.dc;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gj;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
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
public class ev
extends em {
    public static final int Q = 300;
    public static final int K = 8;
    public static final Vec3d O = new Vec3d(0.5, 1.0, 0.0);
    float U = 1.0f;
    public boolean P = false;
    public static final DataParameter<ItemStack> N = EntityDataManager.createKey(ev.class, (DataSerializer)DataSerializers.ITEM_STACK).getSerializer().createKey(111);
    boolean S = true;
    int T = 1;
    int L = 1;
    boolean M = false;
    boolean R = false;

    public ev(World world) {
        super(world);
        this.setSize((float)ev.O.x, (float)ev.O.y);
    }

    public ev(World world, ItemStack itemStack) {
        this(world);
        this.m.set(N, (Object)itemStack);
    }

    @Override
    public String c() {
        return "Allie";
    }

    @Override
    public float i() {
        return 1.0f;
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.m.register(N, (Object)ItemStack.EMPTY);
    }

    public boolean f() {
        NBTTagCompound nBTTagCompound = ((ItemStack)this.m.get(N)).getTagCompound();
        if (nBTTagCompound == null) {
            return true;
        }
        return nBTTagCompound.getInteger("sexmodUses") == 1;
    }

    @Override
    public void updateAITasks() {
        block2: {
            UUID uUID;
            super.updateAITasks();
            if (this.y() == fp.NULL) {
                this.world.removeEntity((Entity)this);
            }
            if ((uUID = this.ae()) == null) {
                return;
            }
            EntityPlayer entityPlayer = this.world.getPlayerEntityByUUID(uUID);
            if (entityPlayer != null) break block2;
            this.world.removeEntity((Entity)this);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void ac() {
        block0: {
            if (this.R) break block0;
            this.P = true;
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.U != 1.0f && this.U != -69.0f && this.U <= 0.0f) {
            if (this.n()) {
                ge.b.sendToServer((IMessage)new cz(this.f()));
                d3.a(true);
            }
            this.U = -69.0f;
        }
        if (!this.world.isRemote) {
            return;
        }
        if (this.P) {
            this.c();
        }
        if (this.S) {
            this.d();
        }
        this.b();
    }

    void b() {
        if (this.ticksExisted % 10 != 0) {
            return;
        }
        int n2 = this.getRNG().nextInt(8);
        Vec3d vec3d = this.b("tail" + n2).add(this.getPositionVector());
        this.world.spawnParticle(EnumParticleTypes.PORTAL, vec3d.x, vec3d.y, vec3d.z, this.getRNG().nextGaussian() * (double)0.01f, this.getRNG().nextGaussian() * (double)0.01f, this.getRNG().nextGaussian() * (double)0.01f, new int[0]);
    }

    @SideOnly(value=Side.CLIENT)
    void d() {
        this.S = false;
        cj.a(this.world, EnumParticleTypes.PORTAL, this.getPositionVector(), 300, 0.75, 1.5);
    }

    @SideOnly(value=Side.CLIENT)
    void c() {
        this.b((EntityPlayer)Minecraft.getMinecraft().player);
        this.P = false;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        this.R = false;
        String[] stringArray = new String[]{"action.names.makemerichallie", "action.names.deepthroat", "Reverse cowgirl"};
        ev.a(entityPlayer, this, stringArray, false);
        return true;
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.DEEPTHROAT_SLOW) {
            return fp.DEEPTHROAT_FAST;
        }
        if (fp2 == fp.REVERSE_COWGIRL_SLOW) {
            return fp.REVERSE_COWGIRL_FAST_START;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.DEEPTHROAT_FAST || fp2 == fp.DEEPTHROAT_SLOW) {
            return fp.DEEPTHROAT_CUM;
        }
        if (fp2 == fp.REVERSE_COWGIRL_SLOW || fp2 == fp.REVERSE_COWGIRL_FAST_START || fp2 == fp.REVERSE_COWGIRL_FAST_CONTINUES) {
            return fp.REVERSE_COWGIRL_CUM;
        }
        return null;
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.DEEPTHROAT_CUM && (fp2 == fp.DEEPTHROAT_FAST || fp2 == fp.DEEPTHROAT_SLOW)) {
            return;
        }
        if (this.y() == fp.REVERSE_COWGIRL_CUM && (fp2 == fp.REVERSE_COWGIRL_SLOW || fp2 == fp.REVERSE_COWGIRL_FAST_START || fp2 == fp.REVERSE_COWGIRL_FAST_CONTINUES)) {
            return;
        }
        if (!this.world.isRemote && fp2 == fp.REVERSE_COWGIRL_START) {
            this.a();
        }
        super.b(fp2);
    }

    void a() {
        EntityPlayer entityPlayer = this.S();
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = this.o();
        entityPlayer.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.world instanceof gj) {
            return PlayState.STOP;
        }
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() == fp.NULL && this.y().autoBlink) break;
                this.a("animation.allie.null", true, animationEvent);
                break;
            }
            case "movement": {
                this.a("animation.allie.tail", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case SUMMON: {
                        this.a("animation.allie.summon", false, animationEvent);
                        break block5;
                    }
                    case SUMMON_NORMAL: {
                        this.a("animation.allie.summon_normal", false, animationEvent);
                        break block5;
                    }
                    case SUMMON_NORMAL_WAIT: {
                        this.a("animation.allie.summon_normal_wait", true, animationEvent);
                        break block5;
                    }
                    case SUMMON_WAIT: {
                        this.a("animation.allie.summon_wait", true, animationEvent);
                        break block5;
                    }
                    case ALLIE_PREPARE_FIRST_TIME: {
                        this.a("animation.allie.deepthroat_prepare", false, animationEvent);
                        break block5;
                    }
                    case ALLIE_PREPARE_NORMAL: {
                        this.a("animation.allie.deepthroat_normal_prepare", false, animationEvent);
                        break block5;
                    }
                    case DEEPTHROAT_START: {
                        this.a("animation.allie.deepthroat_start", false, animationEvent);
                        break block5;
                    }
                    case DEEPTHROAT_SLOW: {
                        this.a("animation.allie.deepthroat_slow", true, animationEvent);
                        break block5;
                    }
                    case DEEPTHROAT_FAST: {
                        this.a("animation.allie.deepthroat_fast", true, animationEvent);
                        break block5;
                    }
                    case DEEPTHROAT_CUM: {
                        this.a("animation.allie.deepthroat_cum", false, animationEvent);
                        break block5;
                    }
                    case RICH_FIRST_TIME: {
                        this.a("animation.allie.rich", false, animationEvent);
                        break block5;
                    }
                    case RICH_NORMAL: {
                        this.a("animation.allie.rich_normal", false, animationEvent);
                        break block5;
                    }
                    case SUMMON_SAND: {
                        this.a("animation.allie.summon_sand", false, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_START: {
                        this.a("animation.allie.reverse_cowgirl_start", true, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_SLOW: {
                        this.a("animation.allie.reverse_cowgirl_slow" + this.T, true, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_FAST_CONTINUES: {
                        this.a("animation.allie.reverse_cowgirl_fastc" + this.L, true, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_FAST_START: {
                        this.a("animation.allie.reverse_cowgirl_fasts", true, animationEvent);
                        break block5;
                    }
                    case REVERSE_COWGIRL_CUM: {
                        this.a("animation.allie.reverse_cowgirl_cum", true, animationEvent);
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
                case "summonMSG1": {
                    this.a(I18n.format((String)"allie.dialogue.summon1", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_SCAWY[0], 0.5f);
                    break;
                }
                case "summonMSG2": {
                    this.a(I18n.format((String)"allie.dialogue.summon2", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_GIGGLE[this.getRNG().nextInt(4)]);
                    break;
                }
                case "summonMSG3": {
                    this.a(I18n.format((String)"allie.dialogue.summon3", (Object[])new Object[0]));
                    break;
                }
                case "summonMSG4": {
                    this.a(I18n.format((String)"allie.dialogue.summon4", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIGHTBREATHING[2]);
                    break;
                }
                case "summonMSG5": {
                    this.a(I18n.format((String)"allie.dialogue.summon5", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_HMPH[4]);
                    break;
                }
                case "summonMSG6": {
                    this.a(I18n.format((String)"allie.dialogue.summon6", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_GIGGLE[3]);
                    break;
                }
                case "summonMSG7": {
                    this.a(I18n.format((String)"allie.dialogue.summon7", (Object[])new Object[0]));
                    break;
                }
                case "summonMSG8": {
                    this.a(I18n.format((String)"allie.dialogue.summon8", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_HUH, new int[0]);
                    if (!this.n()) break;
                    this.b(this.world.getPlayerEntityByUUID(this.ae()));
                    break;
                }
                case "summonDone": {
                    this.b(fp.SUMMON_WAIT);
                    break;
                }
                case "deepthroat_prepareMSG1": {
                    this.a(I18n.format((String)"allie.dialogue.hihi", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_GIGGLE, new int[0]);
                    break;
                }
                case "deepthroat_prepareMSG2": {
                    this.a(I18n.format((String)"allie.dialogue.boys", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_SIGH[0]);
                    break;
                }
                case "scream": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SCREAM, new int[0]);
                    break;
                }
                case "blackscreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "deepthroat_prepareDone": {
                    if (!this.n()) break;
                    if ("reverse_cowgirl".equals(this.m.get(h))) {
                        this.rotationPitch = 30.0f;
                        this.b(fp.REVERSE_COWGIRL_START);
                        break;
                    }
                    this.b(fp.DEEPTHROAT_START);
                    ge.b.sendToServer((IMessage)new dc(this.f(), this.ae(), false, true));
                    this.r = this.rotationYaw + 180.0f;
                    this.a(0.0, 0.0, (double)1.35f, 0.0f, 30.0f);
                    ds.b();
                    break;
                }
                case "deepthroat_fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.DEEPTHROAT_SLOW);
                    break;
                }
                case "deepthroat_startDone": {
                    this.b(fp.DEEPTHROAT_SLOW);
                    break;
                }
                case "deepthroat_fastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_BJMOAN));
                    if (!this.n()) break;
                    ds.d();
                    ds.a(0.04f);
                    break;
                }
                case "deepthroat_slowMSG1": {
                    if (this.getRNG().nextFloat() > 0.33f) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND));
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_BJMOAN));
                    }
                    if (!this.n()) break;
                    ds.d();
                    ds.a(0.02f);
                    break;
                }
                case "deepthroat_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_MOAN));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_CUMINFLATION), 1.5f);
                    break;
                }
                case "cowgirl_cumDone": 
                case "deepthroat_cumDone": {
                    if (!this.n()) break;
                    this.r();
                    ge.b.sendToServer((IMessage)new cz(this.f()));
                    break;
                }
                case "summon_normalMSG1": {
                    this.a(I18n.format((String)"allie.dialogue.sup", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_GIGGLE[this.getRNG().nextInt(4)]);
                    break;
                }
                case "summon_normalMSG2": {
                    this.a(I18n.format((String)"allie.dialogue.youhave", (Object[])new Object[0]));
                    break;
                }
                case "summon_normalMSG3": {
                    if (((ItemStack)this.m.get(N)).getTagCompound().getInteger("sexmodUses") == 2) {
                        this.a(I18n.format((String)"allie.dialogue.2wishes", (Object[])new Object[0]));
                    } else {
                        this.a(I18n.format((String)"allie.dialogue.1wish", (Object[])new Object[0]));
                    }
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_HMPH[4]);
                    break;
                }
                case "summon_normalMSG4": {
                    this.a("So...");
                    break;
                }
                case "summon_normalMSG5": {
                    this.a(I18n.format((String)"allie.dialogue.tellme", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_HUH, new int[0]);
                    break;
                }
                case "summon_normalDone": {
                    this.b(fp.SUMMON_NORMAL_WAIT);
                    if (!this.n()) break;
                    this.b((EntityPlayer)Minecraft.getMinecraft().player);
                    break;
                }
                case "deepthroat_normal_prepareMSG1": {
                    this.a(I18n.format((String)"allie.dialogue.alright", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_GIGGLE));
                    break;
                }
                case "rich_MSG1": {
                    this.a(I18n.format((String)"allie.dialogue.wishgranted", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_PLOB));
                    if (!this.n()) break;
                    ge.b.sendToServer((IMessage)new bw(this.getPositionVector()));
                    break;
                }
                case "disappear": {
                    this.U = 0.99f;
                    break;
                }
                case "summon_sandMSG1": {
                    this.a(I18n.format((String)"allie.dialogue.nooo", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_SCAWY[2]);
                    break;
                }
                case "summon_sandMSG2": {
                    if (!this.e()) break;
                    this.b(I18n.format((String)"allie.dialogue.phobia", (Object[])new Object[0]), true);
                    break;
                }
                case "giggle": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_GIGGLE, new int[0]);
                    break;
                }
                case "pounding": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    break;
                }
                case "moan": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_MOAN, new int[0]);
                    break;
                }
                case "mmm": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_MMM));
                    break;
                }
                case "slide": {
                    this.a(com.trolmastercard.sexmod.c.MISC_SLIDE, 0, 1, 4, 6);
                    break;
                }
                case "slowMoan": {
                    if (this.getRNG().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_AHH));
                    }
                    if (!this.n()) break;
                    ds.a(0.02f);
                    break;
                }
                case "cowgirlSlowDone": {
                    int n2 = this.T;
                    do {
                        this.T = this.getRNG().nextInt(3) + 1;
                    } while (this.T == n2);
                    break;
                }
                case "fastMoan": {
                    if (this.n()) {
                        ds.a(0.04f);
                    }
                    if (!this.M) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_MOAN));
                        this.M = true;
                        break;
                    }
                    this.M = false;
                    break;
                }
                case "fastSwitch": {
                    if (!this.n() || !d3.d) break;
                    fp fp2 = this.y();
                    if (fp2 == fp.REVERSE_COWGIRL_FAST_START) {
                        this.b(fp.REVERSE_COWGIRL_FAST_CONTINUES);
                        break;
                    }
                    this.N();
                    int n3 = this.L;
                    do {
                        this.L = this.getRNG().nextInt(3) + 1;
                    } while (this.L == n3);
                    break;
                }
                case "openSexUi": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_INSERTS, 6.0f);
                    break;
                }
                case "aftermoan": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_AFTERSESSIONMOAN, new int[0]);
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    @Override
    public void a(String string, UUID uUID) {
        this.R = true;
        if ("action.names.makemerichallie".equals(string)) {
            this.b(this.f() ? fp.RICH_FIRST_TIME : fp.RICH_NORMAL);
            return;
        }
        this.a("animationFollowUp", "action.names.deepthroat".equals(string) ? "deepthroat" : "reverse_cowgirl");
        this.b(this.f() ? fp.ALLIE_PREPARE_FIRST_TIME : fp.ALLIE_PREPARE_NORMAL);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
