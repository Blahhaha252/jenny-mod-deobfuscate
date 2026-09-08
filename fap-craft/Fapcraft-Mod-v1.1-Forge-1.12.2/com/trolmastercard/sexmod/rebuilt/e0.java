package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ac;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.bh;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.df;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.dz;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fg;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.gj;
import java.util.UUID;
import javax.vecmath.Vector4d;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
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
public class e0
extends e2
implements bh,
fg {
    static final int ae = 3;
    public boolean Y = false;
    int ag = 0;
    boolean af = false;
    int Z = 0;
    boolean ab = true;
    int ac = -1;
    boolean aa = false;
    final int[] ai = new int[]{0, 180, -90, 90};
    final Vec3d[][] ad = new Vec3d[][]{{new Vec3d(0.5, 0.0, -0.5), new Vec3d(0.0, 0.0, -1.0)}, {new Vec3d(0.5, 0.0, 1.5), new Vec3d(0.0, 0.0, 1.0)}, {new Vec3d(-0.5, 0.0, 0.5), new Vec3d(-1.0, 0.0, 0.0)}, {new Vec3d(1.5, 0.0, 0.5), new Vec3d(1.0, 0.0, 0.0)}};
    int ah = 1;

    public e0(World world) {
        super(world);
        this.setSize(0.49f, 1.65f);
        this.P = 140;
        this.O = 50;
        this.K = 140;
        this.V = new Vec3d(0.0, -0.029999997854232782, -0.2);
    }

    @Override
    public String c() {
        return "Bia";
    }

    @Override
    public float i() {
        return -0.2f;
    }

    @Override
    public void c() {
        this.a("I am living here now nya~");
        this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH, new int[0]);
    }

    @Override
    public void b() {
        this.Y = true;
    }

    @Override
    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp3 == fp.ANAL_CUM || fp3 == fp.PRONE_DOGGY_CUM) {
            this.m.set(h, (Object)"");
        }
        if (fp3 == fp.ANAL_CUM && (fp2 == fp.ANAL_FAST || fp2 == fp.ANAL_SLOW)) {
            return;
        }
        if (fp3 == fp.PRONE_DOGGY_CUM && (fp2 == fp.PRONE_DOGGY_HARD || fp2 == fp.PRONE_DOGGY_SOFT)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    protected ResourceLocation getLootTable() {
        return dz.c;
    }

    @Override
    public void updateAITasks() {
        block8: {
            block9: {
                super.updateAITasks();
                if (this.ab) {
                    this.setNoGravity(false);
                    this.noClip = false;
                    this.ab = false;
                }
                if (this.Y) {
                    ++this.ag;
                    if (this.getPositionVector().equals((Object)this.o()) || this.ag > 40) {
                        this.Y = false;
                        this.ag = 0;
                        this.b(this.world.getMinecraftServer().getPlayerList().getPlayerByUUID((UUID)this.ae()).rotationYaw + 180.0f);
                        this.m.set(G, (Object)true);
                        this.getNavigator().clearPath();
                        this.U();
                    } else {
                        this.rotationYaw = this.I().floatValue();
                        try {
                            e.equals(null);
                        }
                        catch (NullPointerException nullPointerException) {
                            this.c(this.aa());
                        }
                        this.setNoGravity(false);
                        Vec3d vec3d = b6.a(this.getPositionVector(), this.o(), 40 - this.ag);
                        this.setPosition(vec3d.x, vec3d.y, vec3d.z);
                    }
                }
                if (!this.af) break block8;
                if (!(this.getPositionVector().distanceTo(this.o()) < 0.6) && this.Z <= 200) break block9;
                this.af = false;
                this.m.set(G, (Object)true);
                this.Z = 0;
                this.noClip = true;
                this.setNoGravity(true);
                this.motionX = 0.0;
                this.motionY = 0.0;
                this.motionZ = 0.0;
                if ("anal".equals(this.m.get(h))) {
                    this.b(fp.ANAL_PREPARE);
                    this.f(0);
                } else {
                    this.b(fp.SITDOWN);
                }
                break block8;
            }
            ++this.Z;
            if (this.Z != 60 && this.Z != 120) break block8;
            this.getNavigator().clearPath();
            this.getNavigator().tryMoveToXYZ(this.o().x, this.o().y, this.o().z, 0.35);
        }
    }

    public boolean processInteract(EntityPlayer entityPlayer, EnumHand enumHand) {
        block3: {
            boolean bl;
            if (super.processInteract(entityPlayer, enumHand)) {
                return true;
            }
            if (this.y() == fp.SITDOWNIDLE) {
                return true;
            }
            ItemStack itemStack = entityPlayer.getHeldItem(enumHand);
            boolean bl2 = bl = itemStack.getItem() == Items.NAME_TAG;
            if (bl) {
                itemStack.interactWithEntity(entityPlayer, (EntityLivingBase)this, enumHand);
                return true;
            }
            if (!this.world.isRemote || this.b(entityPlayer)) break block3;
            this.a(I18n.format((String)"bia.dialogue.busy", (Object[])new Object[0]));
        }
        return true;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (this.ae() == null && (!this.J() || ((String)this.m.get(v)).equals(Minecraft.getMinecraft().player.getPersistentID().toString()))) {
            String[] stringArray = new String[]{(Integer)this.m.get(D) == 1 ? "action.names.strip" : "action.names.dressup", "action.names.talk", "action.names.headpat"};
            e0.a(entityPlayer, this, stringArray, true);
            return true;
        }
        return false;
    }

    void b(EntityPlayer entityPlayer) {
        e0.a(entityPlayer, this, new String[]{"action.names.anal", "doggy"}, false);
    }

    @Override
    public void ac() {
        if (this.Q() && !this.aa) {
            this.r();
        }
        this.aa = false;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.world.isRemote && this.n() && this.y() == fp.PRONE_DOGGY_INTRO && !fh.a()) {
            ds.d();
        }
        this.d();
    }

    @Override
    protected void V() {
        super.V();
        this.ac = -1;
    }

    void d() {
        float f;
        fp fp2 = this.y();
        if (fp2 != fp.ANAL_WAIT && fp2 != fp.SITDOWNIDLE) {
            return;
        }
        EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 10.0);
        if (entityPlayer == null) {
            return;
        }
        if (entityPlayer.getDistance((Entity)this) > 1.0f) {
            return;
        }
        if (this.ac == -1) {
            if (this.world.isRemote) {
                fh.b();
                d3.a(false);
            } else {
                this.e(entityPlayer.getPersistentID());
            }
            this.ac = j;
            return;
        }
        if (--this.ac > 0) {
            return;
        }
        this.ac = -1;
        entityPlayer.noClip = true;
        entityPlayer.setNoGravity(true);
        if (fp2 == fp.ANAL_WAIT) {
            if (!this.world.isRemote) {
                this.b(fp.ANAL_START);
                Vec3d vec3d = this.o().add(ck.a(-0.3, -1.0, -0.5, this.I().floatValue()));
                entityPlayer.setPositionAndUpdate(vec3d.x, vec3d.y, vec3d.z);
            } else if (this.n()) {
                ds.d();
            }
            return;
        }
        entityPlayer.rotationYaw = f = this.I().floatValue();
        entityPlayer.rotationPitch = 60.0f;
        if (!this.world.isRemote) {
            this.f(0);
            this.b(fp.PRONE_DOGGY_INTRO);
            Vec3d vec3d = this.o();
            Vec3d vec3d2 = vec3d.add(ck.a(0.0, 0.0, 1.0, f));
            this.c(vec3d2);
            Vec3d vec3d3 = vec3d.add(ck.a(0.0, 1.1875 - (double)entityPlayer.getEyeHeight(), 0.5, f));
            entityPlayer.setPositionAndUpdate(vec3d3.x, vec3d3.y, vec3d3.z);
            this.a(true);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void ag() {
        super.ag();
        if (this.y() != fp.PRONE_DOGGY_HARD) {
            return;
        }
        int n2 = this.ah;
        do {
            this.ah = this.getRNG().nextInt(3) + 1;
        } while (n2 == this.ah);
    }

    @Override
    public void g() {
        this.z = new EntityAIWanderAvoidWater((EntityCreature)this, 0.35);
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.tasks.addTask(5, (EntityAIBase)this.o);
        this.tasks.addTask(5, (EntityAIBase)this.z);
    }

    @Override
    public void a(String string, UUID uUID) {
        super.a(string, uUID);
        switch (string) {
            case "action.names.talk": {
                this.e(Minecraft.getMinecraft().player.getPersistentID());
                this.a("playerSheHasSexWith", Minecraft.getMinecraft().player.getPersistentID().toString());
                this.a("animationFollowUp", "talkHorny");
                this.a(uUID);
                break;
            }
            case "action.names.headpat": {
                this.e(Minecraft.getMinecraft().player.getPersistentID());
                this.a("playerSheHasSexWith", Minecraft.getMinecraft().player.getPersistentID().toString());
                this.a("animationFollowUp", "Headpat");
                this.a(uUID);
                break;
            }
            case "action.names.anal": {
                this.a("animationFollowUp", "anal");
                this.b(fp.TALK_RESPONSE);
                this.aa = true;
                break;
            }
            case "doggy": {
                this.a("animationFollowUp", "doggy");
                this.b(fp.TALK_RESPONSE);
                this.aa = true;
                break;
            }
            case "action.names.dressup": 
            case "action.names.strip": {
                this.b(fp.STRIP);
            }
        }
    }

    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);
        if (this.world.isRemote) {
            return;
        }
        EntityItem entityItem = new EntityItem(this.world, this.posX, this.posY, this.posZ, new ItemStack(Blocks.WOOL, this.getRNG().nextInt(4), 12));
        this.world.spawnEntity((Entity)entityItem);
    }

    void a(UUID uUID) {
        this.a(true, true, uUID);
        d3.a(false);
    }

    Vector4d a() {
        BlockPos blockPos = null;
        int n2 = 0;
        while (!this.a(blockPos)) {
            blockPos = this.a(this.getPosition(), n2);
            if (++n2 != 50) continue;
        }
        if (blockPos == null || n2 == 50) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[2]);
            this.a(I18n.format((String)"jenny.dialogue.nobedinsight", (Object[])new Object[0]));
            return null;
        }
        this.tasks.removeTask((EntityAIBase)this.z);
        this.tasks.removeTask((EntityAIBase)this.o);
        Vec3d vec3d = new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ());
        int n3 = -1;
        for (int i = 0; i < this.ad.length; ++i) {
            Vec3d vec3d2 = vec3d.add(this.ad[i][1]);
            Vec3d vec3d3 = vec3d.subtract(this.ad[i][1]);
            Block block = this.world.getBlockState(new BlockPos(vec3d2.x, vec3d2.y, vec3d2.z)).getBlock();
            if (block != Blocks.AIR || !cj.isBedBlock(this.world, new BlockPos(vec3d3))) continue;
            if (n3 == -1) {
                n3 = i;
                continue;
            }
            double d = this.getPosition().distanceSq(vec3d.add((Vec3d)this.ad[n3][0]).x, vec3d.add((Vec3d)this.ad[n3][0]).y, vec3d.add((Vec3d)this.ad[n3][0]).z);
            double d2 = this.getPosition().distanceSq(vec3d.add((Vec3d)this.ad[i][0]).x, vec3d.add((Vec3d)this.ad[i][0]).y, vec3d.add((Vec3d)this.ad[i][0]).z);
            if (!(d2 < d)) continue;
            n3 = i;
        }
        if (n3 == -1) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[2]);
            this.a(I18n.format((String)"jenny.dialogue.nobedinsight", (Object[])new Object[0]));
            return null;
        }
        Vec3d vec3d4 = vec3d.add(this.ad[n3][0]);
        return new Vector4d(vec3d4.x, vec3d4.y, vec3d4.z, (double)this.ai[n3]);
    }

    boolean a(BlockPos blockPos) {
        if (blockPos == null) {
            return false;
        }
        if (cj.isBedBlock(this.world, blockPos.north()) && this.world.isAirBlock(blockPos.south())) {
            return true;
        }
        if (cj.isBedBlock(this.world, blockPos.east()) && this.world.isAirBlock(blockPos.west())) {
            return true;
        }
        if (cj.isBedBlock(this.world, blockPos.south()) && this.world.isAirBlock(blockPos.north())) {
            return true;
        }
        return cj.isBedBlock(this.world, blockPos.west()) && this.world.isAirBlock(blockPos.east());
    }

    Vector4d b() {
        BlockPos blockPos = this.a(this.getPosition());
        if (blockPos == null) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[2]);
            this.a(I18n.format((String)"jenny.dialogue.nobedinsight", (Object[])new Object[0]));
            return null;
        }
        this.tasks.removeTask((EntityAIBase)this.z);
        this.tasks.removeTask((EntityAIBase)this.o);
        Vec3d vec3d = new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ());
        int n2 = -1;
        for (int i = 0; i < this.ad.length; ++i) {
            Vec3d vec3d2 = vec3d.add(this.ad[i][1]);
            if (this.world.getBlockState(new BlockPos(vec3d2.x, vec3d2.y, vec3d2.z)).getBlock() != Blocks.AIR) continue;
            if (n2 == -1) {
                n2 = i;
                continue;
            }
            double d = this.getPosition().distanceSq(vec3d.add((Vec3d)this.ad[n2][0]).x, vec3d.add((Vec3d)this.ad[n2][0]).y, vec3d.add((Vec3d)this.ad[n2][0]).z);
            double d2 = this.getPosition().distanceSq(vec3d.add((Vec3d)this.ad[i][0]).x, vec3d.add((Vec3d)this.ad[i][0]).y, vec3d.add((Vec3d)this.ad[i][0]).z);
            if (!(d2 < d)) continue;
            n2 = i;
        }
        if (n2 == -1) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[2]);
            this.a(I18n.format((String)"jenny.dialogue.bedobscured", (Object[])new Object[0]));
            return null;
        }
        Vec3d vec3d3 = vec3d.add(this.ad[n2][0]);
        return new Vector4d(vec3d3.x, vec3d3.y, vec3d3.z, (double)this.ai[n2]);
    }

    @Override
    public void a() {
        Vector4d vector4d;
        String string = (String)this.m.get(h);
        Vector4d vector4d2 = vector4d = string.equals("anal") ? this.b() : this.a();
        if (vector4d == null) {
            return;
        }
        Vec3d vec3d = new Vec3d(vector4d.getX(), vector4d.getY(), vector4d.getZ());
        this.b((float)vector4d.getW());
        this.c(vec3d);
        this.r = this.I().floatValue();
        this.getNavigator().clearPath();
        this.getNavigator().tryMoveToXYZ(vec3d.x, vec3d.y, vec3d.z, 0.35);
        this.af = true;
        this.Z = 0;
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.ANAL_SLOW) {
            return fp.ANAL_FAST;
        }
        if (fp2 == fp.PRONE_DOGGY_INTRO) {
            return fp.PRONE_DOGGY_INSERT;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.ANAL_SLOW || fp2 == fp.ANAL_FAST) {
            return fp.ANAL_CUM;
        }
        if (fp2 == fp.PRONE_DOGGY_SOFT || fp2 == fp.PRONE_DOGGY_HARD) {
            return fp.PRONE_DOGGY_CUM;
        }
        return null;
    }

    @Override
    protected void U() {
        switch ((String)this.m.get(h)) {
            case "talkHorny": {
                this.b(fp.TALK_HORNY);
                break;
            }
            case "Headpat": {
                this.b(fp.HEAD_PAT);
                break;
            }
            case "doggy": 
            case "anal": {
                this.r();
                ge.b.sendToServer((IMessage)new ac(this.f()));
                return;
            }
        }
        if (this.world.isRemote) {
            this.a("animationFollowUp", "");
        } else {
            this.m.set(h, (Object)"");
        }
    }

    @Override
    public float T() {
        return 35.0f;
    }

    @Override
    public float ai() {
        return 140.0f;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.world instanceof gj) {
            return null;
        }
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
                    this.a("animation.bia.null", true, animationEvent);
                    break;
                }
                this.a("animation.bia.fhappy", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.bia.null", true, animationEvent);
                    break;
                }
                if (this.isRiding()) {
                    this.a("animation.bia.sit", true, animationEvent);
                    break;
                }
                if (Math.abs(this.prevPosX - this.posX) + Math.abs(this.prevPosZ - this.posZ) > 0.0) {
                    switch (this.q()) {
                        case RUN: {
                            this.a("animation.bia.run", true, animationEvent);
                            break;
                        }
                        case FAST_WALK: {
                            this.a("animation.bia.fastwalk", true, animationEvent);
                            break;
                        }
                        case WALK: {
                            this.a("animation.bia.walk", true, animationEvent);
                        }
                    }
                    this.rotationYaw = this.rotationYawHead;
                    break;
                }
                this.a("animation.bia.idle", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.bia.null", true, animationEvent);
                        break block5;
                    }
                    case STRIP: {
                        this.a("animation.bia.strip", false, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.bia.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.bia.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case RIDE: {
                        this.a("animation.bia.ride", true, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.bia.sit", true, animationEvent);
                        break block5;
                    }
                    case THROW_PEARL: {
                        this.a("animation.bia.throwpearl", false, animationEvent);
                        break block5;
                    }
                    case DOWNED: {
                        this.a("animation.bia.downed", true, animationEvent);
                        break block5;
                    }
                    case TALK_HORNY: {
                        this.a("animation.bia.talk_horny2", true, animationEvent);
                        break block5;
                    }
                    case TALK_IDLE: {
                        this.a("animation.bia.talk_idle2", true, animationEvent);
                        break block5;
                    }
                    case TALK_RESPONSE: {
                        this.a("animation.bia.talk_response", true, animationEvent);
                        break block5;
                    }
                    case ANAL_PREPARE: {
                        this.a("animation.bia.anal_prepare", false, animationEvent);
                        break block5;
                    }
                    case ANAL_WAIT: {
                        this.a("animation.bia.anal_wait", false, animationEvent);
                        break block5;
                    }
                    case ANAL_START: {
                        this.a("animation.bia.anal_start", true, animationEvent);
                        break block5;
                    }
                    case ANAL_SLOW: {
                        this.a("animation.bia.anal_slow", true, animationEvent);
                        break block5;
                    }
                    case ANAL_FAST: {
                        this.a("animation.bia.anal_fast", true, animationEvent);
                        break block5;
                    }
                    case ANAL_CUM: {
                        this.a("animation.bia.anal_cum", false, animationEvent);
                        break block5;
                    }
                    case HEAD_PAT: {
                        this.a("animation.bia.headpat", false, animationEvent);
                        break block5;
                    }
                    case SITDOWN: {
                        this.a("animation.bia.sitdown", false, animationEvent);
                        break block5;
                    }
                    case SITDOWNIDLE: {
                        this.a("animation.bia.sitdownidle", true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_INTRO: {
                        this.a("animation.bia.prone_doggy_intro", true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_INSERT: {
                        this.a("animation.bia.prone_doggy_insert", true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_SOFT: {
                        this.a("animation.bia.prone_doggy_soft", true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_HARD: {
                        this.a("animation.bia.prone_doggy_hard" + this.ah, true, animationEvent);
                        break block5;
                    }
                    case PRONE_DOGGY_CUM: {
                        this.a("animation.bia.prone_doggy_cum", true, animationEvent);
                        break block5;
                    }
                    case WAVE_IDLE: {
                        this.a("animation.bia.wave_idle", true, animationEvent);
                        break block5;
                    }
                    case WAVE: {
                        this.a("animation.bia.wave", true, animationEvent);
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
                case "attackDone": {
                    this.b(fp.NULL);
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "becomeNude": {
                    if (!this.e()) break;
                    this.a("currentModel", (Integer)this.m.get(D) == 1 ? "0" : "1");
                    break;
                }
                case "stripDone": {
                    this.r();
                    this.U();
                    break;
                }
                case "stripMSG1": {
                    this.a(I18n.format((String)"bia.dialogue.hihi", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE));
                    break;
                }
                case "sexUiOn": {
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "pearl": {
                    ge.b.sendToServer((IMessage)new gg(this.f()));
                    break;
                }
                case "talk_hornyMSG1": {
                    this.a(I18n.format((String)"bia.dialogue.heya", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HEY, new int[0]);
                    break;
                }
                case "talk_hornyMSG2": {
                    this.a(I18n.format((String)"bia.dialogue.horny", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE[2]);
                    break;
                }
                case "talk_hornyMSG3": {
                    this.a(I18n.format((String)"bia.dialogue.so", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[0]);
                    break;
                }
                case "talk_hornyMSG4": {
                    this.a(I18n.format((String)"bia.dialogue.fun", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[0]);
                    break;
                }
                case "talk_hornyDone": {
                    this.b(fp.TALK_IDLE);
                    if (!this.n()) break;
                    this.b((EntityPlayer)Minecraft.getMinecraft().player);
                    break;
                }
                case "talk_responseMSG1": {
                    this.a(I18n.format((String)"bia.dialogue.huh", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[2]);
                    break;
                }
                case "talk_responseMSG2": {
                    this.a(I18n.format((String)"bia.dialogue.iuhm", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[1]);
                    break;
                }
                case "talk_responseMSG3": {
                    this.a(I18n.format((String)"bia.dialogue.yes", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE[0]);
                    break;
                }
                case "talk_responseDone": {
                    if (this.n()) {
                        this.s();
                    }
                    this.U();
                    break;
                }
                case "anal_prepareMSG1": {
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB[0]);
                    break;
                }
                case "anal_prepareMSG2": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEDRUSTLE[0]);
                    break;
                }
                case "anal_prepareDone": {
                    this.b(fp.ANAL_WAIT);
                    if (!this.n()) break;
                    ds.b();
                    break;
                }
                case "anal_startMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[3]);
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING[34]);
                    break;
                }
                case "anal_fastMSG1": {
                    if (this.n()) {
                        ds.a(0.02);
                    }
                }
                case "anal_slowMSG1": 
                case "anal_startMSG2": {
                    if (this.n()) {
                        ds.a(0.02);
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.5f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_BIA_AHH));
                    break;
                }
                case "anal_fastDone": {
                    if (!this.n() || d3.d) break;
                }
                case "anal_startDone": {
                    this.b(fp.ANAL_SLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "anal_cumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_BIA_AHH));
                    break;
                }
                case "blackScreen": 
                case "anal_cumBlackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "doggy_cumDone": 
                case "anal_cumDone": {
                    if (!this.n()) break;
                    ds.b();
                    this.r();
                    break;
                }
                case "headpatMSG1": {
                    this.a(I18n.format((String)"bia.dialogue.headpats", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[0]);
                    break;
                }
                case "headpatMSG2": {
                    this.a(I18n.format((String)"bia.dialogue.hmm", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[0]);
                    break;
                }
                case "headpatMSG3": {
                    this.a(I18n.format((String)"bia.dialogue.huh2", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[0]);
                    break;
                }
                case "headpatMSG4": {
                    this.a(I18n.format((String)"bia.dialogue.thankyou", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE[1]);
                    break;
                }
                case "headpatDone": {
                    this.r();
                    break;
                }
                case "sitdownMSG1": {
                    this.a("come here big boy~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH, new int[0]);
                    break;
                }
                case "sitdownDone": {
                    this.b(fp.SITDOWNIDLE);
                    break;
                }
                case "slide": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_SLIDE));
                    if (!this.n()) break;
                    ds.a(0.005);
                    break;
                }
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    break;
                }
                case "doggyMoan": {
                    this.a(this.getRNG().nextBoolean() ? com.trolmastercard.sexmod.c.GIRLS_BIA_AHH : com.trolmastercard.sexmod.c.GIRLS_BIA_MMM, new int[0]);
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "doggySwitch": {
                    if (!this.n() || !d3.d) break;
                    this.b(fp.PRONE_DOGGY_HARD);
                    break;
                }
                case "doggyReset": {
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_INSERTS, 6.0f);
                    break;
                }
                case "orgasm1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[6]);
                    break;
                }
                case "orgasm2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[7]);
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }
}

static class e0.a.a {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        b = new int[fp.values().length];
        try {
            e0.a.a.b[fp.NULL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.STRIP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.ATTACK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.BOW.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.RIDE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.SIT.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.THROW_PEARL.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.DOWNED.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.TALK_HORNY.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.TALK_IDLE.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.TALK_RESPONSE.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.ANAL_PREPARE.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.ANAL_WAIT.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.ANAL_START.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.ANAL_SLOW.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.ANAL_FAST.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.ANAL_CUM.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.HEAD_PAT.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.SITDOWN.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.SITDOWNIDLE.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.PRONE_DOGGY_INTRO.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.PRONE_DOGGY_INSERT.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.PRONE_DOGGY_SOFT.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.PRONE_DOGGY_HARD.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.PRONE_DOGGY_CUM.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.WAVE_IDLE.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.b[fp.WAVE.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[em.a$a.values().length];
        try {
            e0.a.a.a[em.a$a.RUN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.a[em.a$a.FAST_WALK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e0.a.a.a[em.a$a.WALK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}