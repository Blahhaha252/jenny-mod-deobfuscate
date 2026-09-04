/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.bh;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.co;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.dz;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gz;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
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
public class el
extends e2
implements bh {
    static final float ad = 10.0f;
    static final int ao = 16;
    static final int ap = 79;
    static final int ag = 109;
    static final int as = 150;
    static final int ar = 20;
    static final int ab = 110;
    static final int an = 4;
    int ak = -1;
    boolean aq = false;
    boolean ae = false;
    boolean ac = false;
    int af = -1;
    int Y = -1;
    int al = -1;
    int ai = -1;
    boolean ah = false;
    Object[] am;
    int Z = -1;
    int aa = 1;
    boolean aj = false;

    public el(World world) {
        super(world);
        this.P = -85;
        this.O = -175;
        this.K = -85;
        this.V = new Vec3d(-0.1, 0.05, 0.0);
    }

    @Override
    public void c() {
        this.a("Okay, I will be residing here then..");
        this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HUH[0], 6.0f);
    }

    @Override
    public String c() {
        return "Ellie";
    }

    @Override
    protected ResourceLocation func_184647_J() {
        return dz.a;
    }

    boolean i() {
        if (this.h()) {
            return false;
        }
        return this.field_70170_p.func_180495_p(this.func_180425_c().func_177982_a(0, 2, 0)).func_177230_c() != Blocks.field_150350_a;
    }

    public float func_70047_e() {
        return this.i() ? 1.53f : 1.9f;
    }

    @Override
    public float i() {
        return 0.4f;
    }

    @Override
    public void b() {
        UUID uUID = this.ae();
        if (uUID == null) {
            this.f();
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            this.f();
            return;
        }
        float f10 = entityPlayer.field_70177_z - 180.0f;
        this.b(f10);
        this.b(fp.CARRY_INTRO);
        this.a(true);
    }

    @Override
    public boolean t() {
        return this.y() != fp.CARRY_INTRO;
    }

    public boolean a(EntityPlayer entityPlayer, boolean bl2) {
        if (bl2) {
            el.a(entityPlayer, this, new String[]{"action.names.cowgirl", "action.names.missionary"}, false);
            return true;
        }
        if ((Integer)this.m.func_187225_a(D) == 0) {
            el.a(entityPlayer, this, new String[]{"action.names.dressup"}, true);
            return true;
        }
        el.a(entityPlayer, this, new String[]{"Face fuck"}, true);
        return true;
    }

    @Override
    public void x() {
        super.x();
        this.a("stay safe darling~");
        this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_SIGH[1], 6.0f);
    }

    @Override
    public void a(String string, UUID uUID) {
        super.a(string, uUID);
        this.aq = true;
        switch (string) {
            case "action.names.missionary": {
                this.b(fp.HUGSELECTED);
                this.a("animationFollowUp", "Missionary");
                break;
            }
            case "action.names.cowgirl": {
                this.b(fp.HUGSELECTED);
                this.a("animationFollowUp", "cowgirl");
                break;
            }
            case "action.names.dressup": 
            case "action.names.strip": {
                this.b(fp.STRIP);
                this.a("animationFollowUp", "");
                break;
            }
            case "Face fuck": {
                this.a(true, true, uUID);
                d3.a(false);
            }
        }
    }

    @Override
    protected void a(EntityPlayerMP entityPlayerMP, boolean bl2) {
    }

    @Override
    public void b(fp fp2) {
        fp fp3 = this.y();
        if (fp2 == fp.HUGSELECTED && !this.field_70170_p.field_72995_K) {
            this.ai = 79;
        }
        if (fp3 == fp.MISSIONARY_CUM && (fp2 == fp.MISSIONARY_FAST || fp2 == fp.MISSIONARY_SLOW)) {
            return;
        }
        if (fp3 == fp.COWGIRLCUM && (fp2 == fp.COWGIRLSLOW || fp2 == fp.COWGIRLFAST)) {
            return;
        }
        if (fp3 == fp.CARRY_CUM && (fp2 == fp.CARRY_SLOW || fp2 == fp.CARRY_FAST)) {
            return;
        }
        if (fp2 == fp.CARRY_INTRO) {
            this.ak = 0;
        }
        super.b(fp2);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.ae) {
            this.a((EntityPlayer)Minecraft.func_71410_x().field_71439_g, true);
            this.ae = false;
        }
        this.m();
        this.h();
    }

    void h() {
        if (ds.a()) {
            return;
        }
        if (this.y() != fp.CARRY_SLOW) {
            return;
        }
        ds.d();
    }

    void e() {
        if (this.ak == -1) {
            return;
        }
        if (++this.ak < 110) {
            return;
        }
        this.ak = -1;
        if (this.y() != fp.CARRY_INTRO) {
            return;
        }
        UUID uUID = this.ae();
        if (uUID == null) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        float f10 = this.I().floatValue();
        Vec3d vec3d = this.o().func_178787_e(ck.a(new Vec3d(0.0, (double)(2.5625f - entityPlayer.func_70047_e()), -0.3125), 180.0f + f10));
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    }

    void m() {
        block3: {
            if (this.y() != fp.SITDOWNIDLE) {
                return;
            }
            EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 10.0);
            if (entityPlayer == null) {
                return;
            }
            if (this.func_70032_d((Entity)entityPlayer) > 1.5f) {
                return;
            }
            if (!entityPlayer.getPersistentID().equals(Minecraft.func_71410_x().field_71439_g.getPersistentID())) break block3;
            fh.b();
        }
    }

    @Override
    public void func_70619_bc() {
        super.func_70619_bc();
        this.o();
        this.d();
        this.n();
        this.q();
        this.j();
        this.a();
        this.t();
        this.u();
    }

    void o() {
        if (this.ac) {
            return;
        }
        this.ac = true;
        this.field_70145_X = false;
        this.func_189654_d(false);
    }

    @Override
    protected void U() {
        Vec3d vec3d;
        Vec3d vec3d2;
        EntityPlayer entityPlayer;
        UUID uUID;
        String string = (String)this.m.func_187225_a(h);
        if ("Missionary".equals(string)) {
            this.m.func_187227_b(D, (Object)0);
            this.b(fp.MISSIONARY_START);
            uUID = this.ae();
            if (uUID == null) {
                return;
            }
            entityPlayer = this.field_70170_p.func_152378_a(uUID);
            if (entityPlayer == null) {
                this.r();
                return;
            }
            entityPlayer.func_189654_d(true);
            entityPlayer.field_70145_X = true;
            vec3d2 = this.o();
            entityPlayer.field_70177_z = this.I().floatValue();
            vec3d = ck.a(new Vec3d(0.0, 0.0, 0.1), entityPlayer.field_70177_z);
            vec3d2 = vec3d2.func_178787_e(vec3d);
            entityPlayer.func_70634_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c);
            ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        }
        if ("cowgirl".equals(string)) {
            this.m.func_187227_b(D, (Object)0);
            this.b(fp.COWGIRLSTART);
            uUID = this.ae();
            if (uUID == null) {
                return;
            }
            entityPlayer = this.field_70170_p.func_152378_a(uUID);
            if (entityPlayer == null) {
                this.r();
                return;
            }
            entityPlayer.func_189654_d(true);
            entityPlayer.field_70145_X = true;
            vec3d2 = this.o();
            entityPlayer.field_70177_z = this.I().floatValue() + 180.0f;
            vec3d = ck.a(new Vec3d(0.0, 1.0 - (double)entityPlayer.eyeHeight, -1.8125), entityPlayer.field_70177_z);
            vec3d2 = vec3d2.func_178787_e(vec3d);
            entityPlayer.func_70634_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c);
            ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        }
    }

    void u() {
        if (--this.af != 0) {
            return;
        }
        this.U();
    }

    void t() {
        if (this.y() != fp.SITDOWNIDLE || this.af >= 0) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 10.0);
        if (entityPlayer == null) {
            return;
        }
        if (this.func_70032_d((Entity)entityPlayer) > 1.5f) {
            return;
        }
        this.af = 20;
        this.e(entityPlayer.getPersistentID());
    }

    void a() {
        if (--this.Y != 0) {
            return;
        }
        this.b(fp.HUGIDLE);
    }

    void j() {
        if (--this.al != 0) {
            return;
        }
        this.b(fp.SITDOWNIDLE);
    }

    void q() {
        if (--this.ai != 0 && !this.ah) {
            return;
        }
        this.ah = true;
        this.m.func_187227_b(G, (Object)false);
        this.b(fp.NULL);
        this.field_70145_X = false;
        this.func_189654_d(false);
        if (this.am == null) {
            this.am = this.g();
        }
        if (this.am == null) {
            this.h("no bed in sight...");
            this.field_70170_p.func_184133_a(null, this.func_180425_c(), com.trolmastercard.sexmod.c.GIRLS_ELLIE_SIGH[0], SoundCategory.NEUTRAL, 6.0f, 1.0f);
            this.s();
            this.f();
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
        if (entityPlayer != null) {
            entityPlayer.func_189654_d(false);
            entityPlayer.field_70145_X = false;
        }
        Vec3d vec3d = (Vec3d)this.am[0];
        int n2 = (Integer)this.am[1];
        if (vec3d.func_72438_d(this.func_174791_d()) > 1.0) {
            this.func_70661_as().func_75492_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, (double)0.35f);
            this.k();
            return;
        }
        this.c(vec3d);
        this.b(n2);
        this.b(fp.SITDOWN);
        this.m.func_187227_b(G, (Object)true);
        this.al = 109;
        this.field_70145_X = true;
        this.func_189654_d(true);
        this.ah = false;
        this.am = null;
    }

    @Override
    public void g() {
        super.g();
        this.Y = -1;
    }

    Object[] g() {
        Vec3d vec3d;
        BlockPos blockPos;
        int n2 = -1;
        int n3 = 0;
        Vec3d[][] vec3dArrayArray = new Vec3d[][]{{new Vec3d(0.5, 0.0, -0.18), new Vec3d(0.0, 0.0, -1.0), new Vec3d(0.0, 0.0, 1.0)}, {new Vec3d(0.5, 0.0, 1.18), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, -1.0)}, {new Vec3d(-0.18, 0.0, 0.5), new Vec3d(-1.0, 0.0, 0.0), new Vec3d(1.0, 0.0, 0.0)}, {new Vec3d(1.18, 0.0, 0.5), new Vec3d(1.0, 0.0, 0.0), new Vec3d(-1.0, 0.0, 0.0)}};
        int[] nArray = new int[]{0, 180, -90, 90};
        do {
            if ((blockPos = this.a(this.func_180425_c(), ++n3)) == null) {
                return null;
            }
            vec3d = new Vec3d((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p());
            for (int i2 = 0; i2 < vec3dArrayArray.length; ++i2) {
                Vec3d vec3d2 = vec3d.func_178787_e(vec3dArrayArray[i2][1]);
                Block block = this.field_70170_p.func_180495_p(new BlockPos(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c)).func_177230_c();
                Vec3d vec3d3 = vec3d.func_178787_e(vec3dArrayArray[i2][2]);
                Block block2 = this.field_70170_p.func_180495_p(new BlockPos(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c)).func_177230_c();
                if (block != Blocks.field_150350_a || block2 != Blocks.field_150324_C) continue;
                if (n2 == -1) {
                    n2 = i2;
                    continue;
                }
                double d10 = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72450_a, vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72448_b, vec3d.func_178787_e((Vec3d)vec3dArrayArray[n2][0]).field_72449_c);
                double d11 = this.func_180425_c().func_177954_c(vec3d.func_178787_e((Vec3d)vec3dArrayArray[i2][0]).field_72450_a, vec3d.func_178787_e((Vec3d)vec3dArrayArray[i2][0]).field_72448_b, vec3d.func_178787_e((Vec3d)vec3dArrayArray[i2][0]).field_72449_c);
                if (!(d11 < d10)) continue;
                n2 = i2;
            }
        } while (n2 == -1);
        blockPos = vec3d.func_178787_e(vec3dArrayArray[n2][0]);
        return new Object[]{blockPos, nArray[n2]};
    }

    void d() {
        if (this.func_70660_b(co.b) == null) {
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_72890_a((Entity)this, 10.0);
        if (entityPlayer == null) {
            return;
        }
        this.func_184596_c(co.b);
        this.e(entityPlayer.getPersistentID());
        float f10 = (float)(Math.atan2(this.field_70161_v - entityPlayer.field_70161_v, this.field_70165_t - entityPlayer.field_70165_t) * 57.29577951308232);
        this.b(f10);
        this.c(this.func_174791_d());
        this.m.func_187227_b(G, (Object)true);
        this.b(fp.DASH);
        this.Z = 16;
        this.func_189654_d(true);
        this.field_70145_X = true;
        ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer);
        this.field_70714_bg.func_85156_a((EntityAIBase)this.z);
        this.field_70714_bg.func_85156_a((EntityAIBase)this.o);
    }

    void n() {
        if (--this.Z != 0) {
            return;
        }
        UUID uUID = this.ae();
        if (uUID == null) {
            this.f();
            return;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            this.f();
            return;
        }
        entityPlayer.func_189654_d(true);
        entityPlayer.field_70145_X = true;
        Vec3d vec3d = ck.a(new Vec3d(0.0, 0.0, -0.5), entityPlayer.field_70177_z);
        Vec3d vec3d2 = vec3d.func_178787_e(entityPlayer.func_174791_d());
        this.c(vec3d2);
        this.b(entityPlayer.field_70177_z);
        this.b(fp.HUG);
        this.Y = 150;
    }

    void f() {
        this.m.func_187227_b(G, (Object)false);
        this.b(fp.NULL);
        this.e((UUID)null);
        this.field_70145_X = false;
        this.func_189654_d(false);
        this.ah = false;
        this.Y = -1;
        this.Z = -1;
        this.ai = -1;
        this.am = null;
    }

    protected boolean func_184645_a(EntityPlayer entityPlayer, EnumHand enumHand) {
        block2: {
            if (el.d(entityPlayer) != null) {
                return false;
            }
            if (this.ae() != null) {
                return false;
            }
            if (!this.field_70170_p.field_72995_K) break block2;
            this.a(entityPlayer, false);
        }
        return true;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.COWGIRLFAST || fp2 == fp.COWGIRLSLOW) {
            return fp.COWGIRLCUM;
        }
        if (fp2 == fp.MISSIONARY_FAST || fp2 == fp.MISSIONARY_SLOW) {
            return fp.MISSIONARY_CUM;
        }
        if (fp2 == fp.CARRY_SLOW || fp2 == fp.CARRY_FAST) {
            return fp.CARRY_CUM;
        }
        return null;
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.COWGIRLSLOW) {
            return fp.COWGIRLFAST;
        }
        if (fp2 == fp.MISSIONARY_SLOW) {
            return fp.MISSIONARY_FAST;
        }
        if (fp2 == fp.CARRY_SLOW) {
            return fp.CARRY_FAST;
        }
        return null;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
            return null;
        }
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
                    this.a("animation.ellie.null", true, animationEvent);
                    break;
                }
                this.a("animation.ellie.eyes", true, animationEvent);
                break;
            }
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.ellie.null", true, animationEvent);
                    break;
                }
                double d10 = Math.abs(this.field_70169_q - this.field_70165_t) + Math.abs(this.field_70166_s - this.field_70161_v);
                if (d10 == 0.0) {
                    this.a(this.i() ? "animation.ellie.crouchidle" : "animation.ellie.idle", true, animationEvent);
                    break;
                }
                if (this.i()) {
                    this.a("animation.ellie.crouchwalk", true, animationEvent);
                    break;
                }
                switch (this.q()) {
                    case RUN: {
                        this.a("animation.ellie.run", true, animationEvent);
                        break;
                    }
                    case FAST_WALK: {
                        this.a("animation.ellie.fastwalk", true, animationEvent);
                        break;
                    }
                    case WALK: {
                        this.a("animation.ellie.walk", true, animationEvent);
                    }
                }
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.ellie.null", true, animationEvent);
                        break block5;
                    }
                    case STRIP: {
                        this.a("animation.ellie.strip", false, animationEvent);
                        break block5;
                    }
                    case DASH: {
                        this.a("animation.ellie.dash", false, animationEvent);
                        break block5;
                    }
                    case HUG: {
                        this.a("animation.ellie.hug", false, animationEvent);
                        break block5;
                    }
                    case HUGIDLE: {
                        this.a("animation.ellie.hugidle", true, animationEvent);
                        break block5;
                    }
                    case HUGSELECTED: {
                        this.a("animation.ellie.hugselected", false, animationEvent);
                        break block5;
                    }
                    case SITDOWN: {
                        this.a("animation.ellie.sitdown", false, animationEvent);
                        break block5;
                    }
                    case SITDOWNIDLE: {
                        this.a("animation.ellie.sitdownidle", true, animationEvent);
                        break block5;
                    }
                    case COWGIRLSTART: {
                        this.a("animation.ellie.cowgirlstart", false, animationEvent);
                        break block5;
                    }
                    case COWGIRLSLOW: {
                        this.a("animation.ellie.cowgirlslow2", true, animationEvent);
                        break block5;
                    }
                    case COWGIRLFAST: {
                        this.a("animation.ellie.cowgirlfast", true, animationEvent);
                        break block5;
                    }
                    case COWGIRLCUM: {
                        this.a("animation.ellie.cowgirlcum", true, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.ellie.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.ellie.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case RIDE: {
                        this.a("animation.ellie.ride", true, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.ellie.sit", true, animationEvent);
                        break block5;
                    }
                    case THROW_PEARL: {
                        this.a("animation.ellie.throwpearl", false, animationEvent);
                        break block5;
                    }
                    case DOWNED: {
                        this.a("animation.ellie.downed", true, animationEvent);
                        break block5;
                    }
                    case MISSIONARY_START: {
                        this.a("animation.ellie.missionary_start", false, animationEvent);
                        break block5;
                    }
                    case MISSIONARY_SLOW: {
                        this.a("animation.ellie.missionary_slow", true, animationEvent);
                        break block5;
                    }
                    case MISSIONARY_FAST: {
                        this.a("animation.ellie.missionary_fast", true, animationEvent);
                        break block5;
                    }
                    case MISSIONARY_CUM: {
                        this.a("animation.ellie.missionary_cum", false, animationEvent);
                        break block5;
                    }
                    case CARRY_INTRO: {
                        this.a("animation.ellie.carry_intro", false, animationEvent);
                        break block5;
                    }
                    case CARRY_SLOW: {
                        this.a("animation.ellie.carry_slow" + this.aa, true, animationEvent);
                        break block5;
                    }
                    case CARRY_FAST: {
                        this.a("animation.ellie.carry_fast", true, animationEvent);
                        break block5;
                    }
                    case CARRY_CUM: {
                        this.a("animation.ellie.carry_cum", true, animationEvent);
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
                case "becomeNude": {
                    if (!this.e()) break;
                    this.a("currentModel", (Integer)this.m.func_187225_a(D) == 1 ? "0" : "1");
                    break;
                }
                case "stripDone": {
                    this.b((fp)null);
                    this.r();
                    this.U();
                    break;
                }
                case "hugMSG2": {
                    this.h("Hmm...");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HMPH[3], 6.0f);
                    break;
                }
                case "hugMSG3": {
                    this.h("Hey!");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HUH[1], 1.0f);
                    break;
                }
                case "hugMSG4": {
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.mommyhorny", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_MOMMYHORNY, 0.5f);
                    break;
                }
                case "hugMSG5": {
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.whattodo", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HUH[1], 6.0f);
                    break;
                }
                case "hugDone": {
                    if (!this.n()) break;
                    this.a((EntityPlayer)Minecraft.func_71410_x().field_71439_g, true);
                    break;
                }
                case "hugselectedMSG1": {
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.iknow", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HMPH[3], 6.0f);
                    break;
                }
                case "hugselectedMSG2": {
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.followmedarling", (Object[])new Object[0]));
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[3], 6.0f);
                    if (!this.n()) break;
                    d3.a(true);
                    break;
                }
                case "sitdownMSG1": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_COMETOMOMMY, 0.5f);
                    if (!this.e()) break;
                    this.h(I18n.func_135052_a((String)"ellie.dialogue.cometomommy", (Object[])new Object[0]));
                    break;
                }
                case "cowgirlStartMSG0": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[4], 6.0f);
                    break;
                }
                case "cowgirlStartMSG1": {
                    if (!this.e()) break;
                    this.a(I18n.func_135052_a((String)"ellie.dialogue.like", (Object[])new Object[0]));
                    ds.b();
                    break;
                }
                case "cowgirlStartMSG2": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 6.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "cowgirlStartDone": {
                    if (!this.n()) break;
                    this.b(fp.COWGIRLSLOW);
                    ds.d();
                    break;
                }
                case "cowgirlfastMSG1": {
                    if (this.aj) {
                        this.aj = false;
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 6.0f);
                    }
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "cowgirlfastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.COWGIRLSLOW);
                    break;
                }
                case "cowgirlfastdomMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    if (!this.n()) break;
                    ds.a(0.2);
                    break;
                }
                case "cowgirlcumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 6.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    break;
                }
                case "cowgirlcumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_MOAN[5], 3.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    break;
                }
                case "cowgirlcumMSG3": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING), 0.75f);
                    break;
                }
                case "cowgirlcumMSG4": {
                    if (!this.n()) break;
                    ds.c();
                    break;
                }
                case "cowgirlcumMSG5": 
                case "missionary_cumMSG2": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GOODBOY, 0.5f);
                    if (!this.n()) break;
                    this.a(I18n.func_135052_a((String)"ellie.dialogue.goodboy", (Object[])new Object[0]));
                    break;
                }
                case "cowgirlcumMSG6": 
                case "blackScreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "missionary_cumDone": 
                case "cowgirlcumDone": 
                case "carry_cumDone": {
                    if (!this.n()) break;
                    ds.b();
                    this.r();
                    break;
                }
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
                case "pearl": {
                    ge.b.sendToServer((IMessage)new gg(this.f()));
                    break;
                }
                case "openSexUi": {
                    if (!this.e()) break;
                    ds.d();
                    break;
                }
                case "missionary_slowMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    if (this.func_70681_au().nextBoolean() && this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_MOAN), 6.0f);
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 6.0f);
                    }
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "missionary_fastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    if (this.func_70681_au().nextBoolean() || this.func_70681_au().nextBoolean()) {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_MOAN), 6.0f);
                    } else {
                        this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 6.0f);
                    }
                    if (!this.n()) break;
                    ds.a(0.05);
                    break;
                }
                case "missionary_startDone": {
                    if (!this.n()) break;
                    this.b(fp.MISSIONARY_SLOW);
                    ds.d();
                    break;
                }
                case "missionary_fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.MISSIONARY_SLOW);
                    break;
                }
                case "bedRustle": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    this.a(com.trolmastercard.sexmod.c.MISC_BEDRUSTLE[0]);
                    break;
                }
                case "bedRustle1": {
                    this.a(com.trolmastercard.sexmod.c.MISC_BEDRUSTLE[1]);
                    break;
                }
                case "missionary_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_AHH), 6.0f);
                    break;
                }
                case "carry_introMSG1": {
                    this.a("I'm hungry..");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_HMPH, 6.0f);
                    break;
                }
                case "carry_introMSG2": {
                    this.a("heh~");
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ELLIE_GIGGLE[3], 6.0f);
                    break;
                }
                case "lipsound": {
                    this.a(com.trolmastercard.sexmod.c.GIRLS_ALLIE_LIPSOUND, new int[0]);
                    if (!this.n()) break;
                    ds.a(0.02);
                    break;
                }
                case "cum": {
                    this.a(com.trolmastercard.sexmod.c.MISC_INSERTS, 6.0f);
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    break;
                }
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING, new int[0]);
                    if (!this.n()) break;
                    ds.a(0.04);
                    break;
                }
                case "carry_slowDone": {
                    int n2 = this.aa;
                    do {
                        this.aa = this.func_70681_au().nextInt(4) + 1;
                    } while (this.aa == n2);
                    break;
                }
                case "carry_fastDone": {
                    if (!this.n() || d3.d) break;
                    this.b(fp.CARRY_SLOW);
                    break;
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

