/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4d
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIWanderAvoidWater
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
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
        this.func_70105_a(0.49f, 1.65f);
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
            this.m.func_187227_b(h, (Object)"");
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
    protected ResourceLocation func_184647_J() {
        return dz.c;
    }

    @Override
    public void func_70619_bc() {
        block8: {
            block9: {
                super.func_70619_bc();
                if (this.ab) {
                    this.func_189654_d(false);
                    this.field_70145_X = false;
                    this.ab = false;
                }
                if (this.Y) {
                    ++this.ag;
                    if (this.func_174791_d().equals((Object)this.o()) || this.ag > 40) {
                        this.Y = false;
                        this.ag = 0;
                        this.b(this.field_70170_p.func_73046_m().func_184103_al().func_177451_a((UUID)this.ae()).field_70177_z + 180.0f);
                        this.m.func_187227_b(G, (Object)true);
                        this.func_70661_as().func_75499_g();
                        this.U();
                    } else {
                        this.field_70177_z = this.I().floatValue();
                        try {
                            e.equals(null);
                        }
                        catch (NullPointerException nullPointerException) {
                            this.c(this.aa());
                        }
                        this.func_189654_d(false);
                        Vec3d vec3d = b6.a(this.func_174791_d(), this.o(), 40 - this.ag);
                        this.func_70107_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
                    }
                }
                if (!this.af) break block8;
                if (!(this.func_174791_d().func_72438_d(this.o()) < 0.6) && this.Z <= 200) break block9;
                this.af = false;
                this.m.func_187227_b(G, (Object)true);
                this.Z = 0;
                this.field_70145_X = true;
                this.func_189654_d(true);
                this.field_70159_w = 0.0;
                this.field_70181_x = 0.0;
                this.field_70179_y = 0.0;
                if ("anal".equals(this.m.func_187225_a(h))) {
                    this.b(fp.ANAL_PREPARE);
                    this.f(0);
                } else {
                    this.b(fp.SITDOWN);
                }
                break block8;
            }
            ++this.Z;
            if (this.Z != 60 && this.Z != 120) break block8;
            this.func_70661_as().func_75499_g();
            this.func_70661_as().func_75492_a(this.o().field_72450_a, this.o().field_72448_b, this.o().field_72449_c, 0.35);
        }
    }

    public boolean func_184645_a(EntityPlayer entityPlayer, EnumHand enumHand) {
        block3: {
            boolean bl;
            if (super.func_184645_a(entityPlayer, enumHand)) {
                return true;
            }
            if (this.y() == fp.SITDOWNIDLE) {
                return true;
            }
            ItemStack itemStack = entityPlayer.func_184586_b(enumHand);
            boolean bl2 = bl = itemStack.func_77973_b() == Items.field_151057_cb;
            if (bl) {
                itemStack.func_111282_a(entityPlayer, (EntityLivingBase)this, enumHand);
                return true;
            }
            if (!this.field_70170_p.field_72995_K || this.b(entityPlayer)) break block3;
            this.a(I18n.func_135052_a((String)"bia.dialogue.busy", (Object[])new Object[0]));
        }
        return true;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (this.ae() == null && (!this.J() || ((String)this.m.func_187225_a(v)).equals(Minecraft.func_71410_x().field_71439_g.getPersistentID().toString()))) {
            String[] stringArray = new String[]{(Integer)this.m.func_187225_a(D) == 1 ? "action.names.strip" : "action.names.dressup", "action.names.talk", "action.names.headpat"};
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
    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.field_70170_p.field_72995_K && this.n() && this.y() == fp.PRONE_DOGGY_INTRO && !fh.a()) {
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
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 10.0);
        if (entityPlayer == null) {
            return;
        }
        if (entityPlayer.func_70032_d((Entity)this) > 1.0f) {
            return;
        }
        if (this.ac == -1) {
            if (this.field_70170_p.field_72995_K) {
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
        entityPlayer.field_70145_X = true;
        entityPlayer.func_189654_d(true);
        if (fp2 == fp.ANAL_WAIT) {
            if (!this.field_70170_p.field_72995_K) {
                this.b(fp.ANAL_START);
                Vec3d vec3d = this.o().func_178787_e(ck.a(-0.3, -1.0, -0.5, this.I().floatValue()));
                entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
            } else if (this.n()) {
                ds.d();
            }
            return;
        }
        entityPlayer.field_70177_z = f = this.I().floatValue();
        entityPlayer.field_70125_A = 60.0f;
        if (!this.field_70170_p.field_72995_K) {
            this.f(0);
            this.b(fp.PRONE_DOGGY_INTRO);
            Vec3d vec3d = this.o();
            Vec3d vec3d2 = vec3d.func_178787_e(ck.a(0.0, 0.0, 1.0, f));
            this.c(vec3d2);
            Vec3d vec3d3 = vec3d.func_178787_e(ck.a(0.0, 1.1875 - (double)entityPlayer.func_70047_e(), 0.5, f));
            entityPlayer.func_70634_a(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
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
            this.ah = this.func_70681_au().nextInt(3) + 1;
        } while (n2 == this.ah);
    }

    @Override
    public void g() {
        this.z = new EntityAIWanderAvoidWater((EntityCreature)this, 0.35);
        this.o = new df((EntityLiving)this, EntityPlayer.class, 3.0f, 1.0f);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.o);
        this.field_70714_bg.func_75776_a(5, (EntityAIBase)this.z);
    }

    @Override
    public void a(String string, UUID uUID) {
        super.a(string, uUID);
        switch (string) {
            case "action.names.talk": {
                this.e(Minecraft.func_71410_x().field_71439_g.getPersistentID());
                this.a("playerSheHasSexWith", Minecraft.func_71410_x().field_71439_g.getPersistentID().toString());
                this.a("animationFollowUp", "talkHorny");
                this.a(uUID);
                break;
            }
            case "action.names.headpat": {
                this.e(Minecraft.func_71410_x().field_71439_g.getPersistentID());
                this.a("playerSheHasSexWith", Minecraft.func_71410_x().field_71439_g.getPersistentID().toString());
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

    public void func_70645_a(DamageSource damageSource) {
        super.func_70645_a(damageSource);
        if (this.field_70170_p.field_72995_K) {
            return;
        }
        EntityItem entityItem = new EntityItem(this.field_70170_p, this.field_70165_t, this.field_70163_u, this.field_70161_v, new ItemStack(Blocks.field_150325_L, this.func_70681_au().nextInt(4), 12));
        this.field_70170_p.func_72838_d((Entity)entityItem);
    }

    void a(UUID uUID) {
        this.a(true, true, uUID);
        d3.a(false);
    }

    Vector4d a() {
        BlockPos blockPos = null;
        int n2 = 0;
        while (!this.a(blockPos)) {
            blockPos = this.a(this.func_180425_c(), n2);
            if (++n2 != 50) continue;
        }
        if (blockPos == null || n2 == 50) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[2]);
            this.a(I18n.func_135052_a((String)"jenny.dialogue.nobedinsight", (Object[])new Object[0]));
            return null;
        }
        this.field_70714_bg.func_85156_a((EntityAIBase)this.z);
        this.field_70714_bg.func_85156_a((EntityAIBase)this.o);
        Vec3d vec3d = new Vec3d((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p());
        int n3 = -1;
        for (int i = 0; i < this.ad.length; ++i) {
            Vec3d vec3d2 = vec3d.func_178787_e(this.ad[i][1]);
            Vec3d vec3d3 = vec3d.func_178788_d(this.ad[i][1]);
            Block block = this.field_70170_p.func_180495_p(new BlockPos(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c)).func_177230_c();
            if (block != Blocks.field_150350_a || !cj.b(this.field_70170_p, new BlockPos(vec3d3))) continue;
            if (n3 == -1) {
                n3 = i;
                continue;
            }
            double d = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)this.ad[n3][0]).field_72450_a, vec3d.func_178787_e((Vec3d)this.ad[n3][0]).field_72448_b, vec3d.func_178787_e((Vec3d)this.ad[n3][0]).field_72449_c);
            double d2 = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)this.ad[i][0]).field_72450_a, vec3d.func_178787_e((Vec3d)this.ad[i][0]).field_72448_b, vec3d.func_178787_e((Vec3d)this.ad[i][0]).field_72449_c);
            if (!(d2 < d)) continue;
            n3 = i;
        }
        if (n3 == -1) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[2]);
            this.a(I18n.func_135052_a((String)"jenny.dialogue.nobedinsight", (Object[])new Object[0]));
            return null;
        }
        Vec3d vec3d4 = vec3d.func_178787_e(this.ad[n3][0]);
        return new Vector4d(vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c, (double)this.ai[n3]);
    }

    boolean a(BlockPos blockPos) {
        if (blockPos == null) {
            return false;
        }
        if (cj.b(this.field_70170_p, blockPos.func_177978_c()) && this.field_70170_p.func_175623_d(blockPos.func_177968_d())) {
            return true;
        }
        if (cj.b(this.field_70170_p, blockPos.func_177974_f()) && this.field_70170_p.func_175623_d(blockPos.func_177976_e())) {
            return true;
        }
        if (cj.b(this.field_70170_p, blockPos.func_177968_d()) && this.field_70170_p.func_175623_d(blockPos.func_177978_c())) {
            return true;
        }
        return cj.b(this.field_70170_p, blockPos.func_177976_e()) && this.field_70170_p.func_175623_d(blockPos.func_177974_f());
    }

    Vector4d b() {
        BlockPos blockPos = this.a(this.func_180425_c());
        if (blockPos == null) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[2]);
            this.a(I18n.func_135052_a((String)"jenny.dialogue.nobedinsight", (Object[])new Object[0]));
            return null;
        }
        this.field_70714_bg.func_85156_a((EntityAIBase)this.z);
        this.field_70714_bg.func_85156_a((EntityAIBase)this.o);
        Vec3d vec3d = new Vec3d((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p());
        int n2 = -1;
        for (int i = 0; i < this.ad.length; ++i) {
            Vec3d vec3d2 = vec3d.func_178787_e(this.ad[i][1]);
            if (this.field_70170_p.func_180495_p(new BlockPos(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c)).func_177230_c() != Blocks.field_150350_a) continue;
            if (n2 == -1) {
                n2 = i;
                continue;
            }
            double d = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)this.ad[n2][0]).field_72450_a, vec3d.func_178787_e((Vec3d)this.ad[n2][0]).field_72448_b, vec3d.func_178787_e((Vec3d)this.ad[n2][0]).field_72449_c);
            double d2 = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)this.ad[i][0]).field_72450_a, vec3d.func_178787_e((Vec3d)this.ad[i][0]).field_72448_b, vec3d.func_178787_e((Vec3d)this.ad[i][0]).field_72449_c);
            if (!(d2 < d)) continue;
            n2 = i;
        }
        if (n2 == -1) {
            this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[2]);
            this.a(I18n.func_135052_a((String)"jenny.dialogue.bedobscured", (Object[])new Object[0]));
            return null;
        }
        Vec3d vec3d3 = vec3d.func_178787_e(this.ad[n2][0]);
        return new Vector4d(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, (double)this.ai[n2]);
    }

    @Override
    public void a() {
        Vector4d vector4d;
        String string = (String)this.m.func_187225_a(h);
        Vector4d vector4d2 = vector4d = string.equals("anal") ? this.b() : this.a();
        if (vector4d == null) {
            return;
        }
        Vec3d vec3d = new Vec3d(vector4d.getX(), vector4d.getY(), vector4d.getZ());
        this.b((float)vector4d.getW());
        this.c(vec3d);
        this.r = this.I().floatValue();
        this.func_70661_as().func_75499_g();
        this.func_70661_as().func_75492_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, 0.35);
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
        switch ((String)this.m.func_187225_a(h)) {
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
        if (this.field_70170_p.field_72995_K) {
            this.a("animationFollowUp", "");
        } else {
            this.m.func_187227_b(h, (Object)"");
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
        if (this.field_70170_p instanceof gj) {
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
                if (this.func_184218_aH()) {
                    this.a("animation.bia.sit", true, animationEvent);
                    break;
                }
                if (Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v) > 0.0) {
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
                    this.field_70177_z = this.field_70759_as;
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
                    this.a("currentModel", (Integer)this.m.func_187225_a(D) == 1 ? "0" : "1");
                    break;
                }
                case "stripDone": {
                    this.r();
                    this.U();
                    break;
                }
                case "stripMSG1": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.hihi", (Object[])new Object[0]));
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
                    this.a(I18n.func_135052_a((String)"bia.dialogue.heya", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HEY, new int[0]);
                    break;
                }
                case "talk_hornyMSG2": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.horny", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_GIGGLE[2]);
                    break;
                }
                case "talk_hornyMSG3": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.so", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[0]);
                    break;
                }
                case "talk_hornyMSG4": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.fun", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[0]);
                    break;
                }
                case "talk_hornyDone": {
                    this.b(fp.TALK_IDLE);
                    if (!this.n()) break;
                    this.b((EntityPlayer)Minecraft.func_71410_x().field_71439_g);
                    break;
                }
                case "talk_responseMSG1": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.huh", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[2]);
                    break;
                }
                case "talk_responseMSG2": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.iuhm", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[1]);
                    break;
                }
                case "talk_responseMSG3": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.yes", (Object[])new Object[0]));
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
                    this.a(I18n.func_135052_a((String)"bia.dialogue.headpats", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_BREATH[0]);
                    break;
                }
                case "headpatMSG2": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.hmm", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_MMM[0]);
                    break;
                }
                case "headpatMSG3": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.huh2", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_BIA_HUH[0]);
                    break;
                }
                case "headpatMSG4": {
                    this.a(I18n.func_135052_a((String)"bia.dialogue.thankyou", (Object[])new Object[0]));
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
                    this.a(this.func_70681_au().nextBoolean() ? com.trolmastercard.sexmod.c.GIRLS_BIA_AHH : com.trolmastercard.sexmod.c.GIRLS_BIA_MMM, new int[0]);
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
