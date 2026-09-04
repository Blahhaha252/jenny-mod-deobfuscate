/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
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

import com.trolmastercard.sexmod.ai;
import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.by;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.dg;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.dy;
import com.trolmastercard.sexmod.e3;
import com.trolmastercard.sexmod.e4;
import com.trolmastercard.sexmod.eh;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.ew;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.fv;
import com.trolmastercard.sexmod.g5;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.m;
import com.trolmastercard.sexmod.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
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
public class eq
extends ew
implements ai {
    public static final float aI = 2.0f;
    public static final DataParameter<String> ax = EntityDataManager.func_187226_a(eq.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(122);
    public static final DataParameter<Boolean> aA = EntityDataManager.func_187226_a(eq.class, (DataSerializer)DataSerializers.field_187198_h).func_187156_b().func_187161_a(126);
    int aJ = 0;
    int az = -1;
    int aG = 0;
    fp aw = fp.NULL;
    int aE = -1;
    boolean aC = false;
    boolean aB = true;
    boolean ay = true;
    boolean aF = false;
    boolean aH = false;
    String aD = "";

    public eq(World world) {
        super(world);
    }

    public eq(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public float i() {
        return 0.9f;
    }

    @Override
    public at a(int n) {
        return new fv();
    }

    @Override
    public String c(int n) {
        return "textures/entity/kobold/hand.png";
    }

    @Override
    public Vec3i b(int n) {
        String[] stringArray = eq.a(this);
        if (stringArray.length < 8) {
            return super.b(n);
        }
        return by.values()[Integer.parseInt(stringArray[7])].a();
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        eh eh2 = eh.values()[this.func_70681_au().nextInt(eh.values().length)];
        this.m.func_187214_a(au, (Object)new BlockPos(eh2.a()));
        this.m.func_187214_a(as, (Object)e3.ax.name());
        this.m.func_187214_a(aA, (Object)false);
        this.m.func_187214_a(ax, (Object)"");
    }

    @Override
    public void b(String string, UUID uUID) {
        block1: {
            if ("anal".equals(string)) {
                this.b(uUID);
                this.b(fp.NELSON_INTRO);
                this.a(this.ah(), fp.NELSON_INTRO);
                this.f(0);
            }
            if (!"paizuri".equals(string)) break block1;
            this.b(uUID);
            this.b(fp.PAIZURI_START);
            this.a(this.ah(), fp.PAIZURI_START);
            this.f(0);
        }
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public boolean b(EntityPlayer entityPlayer) {
        Minecraft.func_71410_x().func_147108_a((GuiScreen)new m(this, entityPlayer, new String[]{"anal", "paizuri"}, null, false));
        return true;
    }

    @Override
    public EntityPlayer c(EntityPlayer entityPlayer) {
        UUID uUID = this.e();
        if (uUID == null) {
            return entityPlayer;
        }
        EntityPlayer entityPlayer2 = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer2 == null) {
            return entityPlayer;
        }
        return entityPlayer2;
    }

    @Override
    public boolean d() {
        return this.e() == null || !Minecraft.func_71410_x().field_71439_g.getPersistentID().equals(this.m());
    }

    @Override
    public boolean z() {
        UUID uUID = this.e();
        return uUID == null;
    }

    @Override
    public Vec3d c(Vec3d vec3d, float f) {
        UUID uUID = this.e();
        if (uUID == null) {
            return vec3d;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return vec3d;
        }
        Vec3d vec3d2 = entityPlayer.func_174791_d();
        Vec3d vec3d3 = new Vec3d(entityPlayer.field_70142_S, entityPlayer.field_70137_T, entityPlayer.field_70136_U);
        return b6.a(vec3d3, vec3d2, (double)f);
    }

    void c(EntityPlayer entityPlayer) {
        if (this.y() != fp.NULL) {
            return;
        }
        if (this.e() != null) {
            return;
        }
        if (e3.d(entityPlayer.getPersistentID())) {
            entityPlayer.func_146105_b((ITextComponent)new TextComponentString("you are already carrying a Goblin"), true);
            return;
        }
        this.a(entityPlayer.getPersistentID());
        this.b(fp.PICK_UP);
        this.b(45);
        EntityPlayer entityPlayer2 = this.k();
        if (entityPlayer2 == null) {
            return;
        }
        entityPlayer2.func_189654_d(true);
        entityPlayer2.field_70145_X = true;
        if (this.field_70170_p.field_72995_K) {
            return;
        }
        ge.b.sendTo((IMessage)new gz(false), (EntityPlayerMP)entityPlayer2);
    }

    @Override
    protected String a(StringBuilder stringBuilder) {
        e4.a(stringBuilder, 3);
        e4.a(stringBuilder, 2);
        e4.a(stringBuilder, 2);
        e4.a(stringBuilder, 7);
        e4.a(stringBuilder, 7);
        e4.a(stringBuilder, 5);
        e4.a(stringBuilder, g5.values().length - 1);
        e4.a(stringBuilder, by.values().length - 1);
        e4.a(stringBuilder, eh.values().length - 1);
        e4.c(stringBuilder, 0);
        return stringBuilder.toString();
    }

    @Override
    public ArrayList<Integer> D() {
        return new ArrayList<Integer>(this){
            final /* synthetic */ eq this$0;
            {
                this.this$0 = eq2;
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
    protected void a() {
        dg.e();
        dy.c();
    }

    public float func_70047_e() {
        return 0.75f;
    }

    @Override
    public boolean o() {
        return this.Q() || this.e() != null;
    }

    @Override
    public boolean a(fp fp2, EntityPlayer entityPlayer) {
        block4: {
            float f;
            UUID uUID = this.e();
            if (uUID == null) {
                return false;
            }
            EntityPlayer entityPlayer2 = this.field_70170_p.func_152378_a(uUID);
            if (entityPlayer2 == null) {
                return false;
            }
            float f2 = entityPlayer.field_70177_z;
            float f4 = fp2 == fp.PICK_UP ? 180.0f : 0.0f;
            float f5 = entityPlayer2.field_70177_z - 90.0f + f4;
            float f6 = entityPlayer2.field_70177_z + 90.0f + f4;
            if (f2 < f5) {
                entityPlayer.field_70177_z = f5;
            }
            if (f2 > f6) {
                entityPlayer.field_70177_z = f6;
            }
            float f8 = entityPlayer.field_70125_A;
            float f9 = f = fp2 == fp.PICK_UP ? 0.0f : 37.5f;
            if (!(f8 > f)) break block4;
            entityPlayer.field_70125_A = f;
        }
        return true;
    }

    @Override
    public Vec3d b(Vec3d vec3d, float f) {
        UUID uUID = this.e();
        if (uUID == null) {
            return vec3d;
        }
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return vec3d;
        }
        float f2 = b6.a(entityPlayer.field_70760_ar, entityPlayer.field_70761_aq, f);
        Vec3d vec3d2 = vec3d;
        float f4 = 135.0f;
        fp fp2 = this.y();
        if (fp2 == fp.PICK_UP) {
            vec3d2 = new Vec3d(vec3d.field_72450_a, vec3d.field_72448_b, -vec3d.field_72449_c);
            f4 += 40.0f;
        } else if (fp2 != fp.START_THROWING) {
            vec3d2 = vec3d2.func_178786_a(0.0, 2.0, 0.0);
        }
        vec3d2 = ck.a(vec3d2, f2 + f4);
        return vec3d2;
    }

    @SideOnly(value=Side.CLIENT)
    void f() {
        block2: {
            EntityPlayer entityPlayer = this.k();
            if (entityPlayer == null) {
                return;
            }
            if (this.y() != fp.START_THROWING) break block2;
            entityPlayer.field_70128_L = false;
            if (!this.field_70170_p.field_72996_f.contains(entityPlayer)) {
                this.field_70170_p.func_72838_d((Entity)entityPlayer);
            }
        }
    }

    @Override
    public void func_70071_h_() {
        e3.e(this);
        this.d();
        this.j();
        super.func_70071_h_();
        if (!this.field_70170_p.field_72995_K) {
            return;
        }
        this.f();
        fp fp2 = this.y();
        this.d(fp2);
        this.c(fp2);
        this.aw = fp2;
    }

    @Override
    public boolean E() {
        return this.e() != null;
    }

    void j() {
        fp fp2 = this.y();
        if (fp2 == fp.THROWN) {
            return;
        }
        if (fp2 == fp.START_THROWING && this.a() > 15) {
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
        EntityPlayer entityPlayer2 = this.k();
        if (entityPlayer2 == null) {
            return;
        }
        entityPlayer2.field_70145_X = true;
        entityPlayer2.func_189654_d(true);
        entityPlayer2.func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u + 2.0, entityPlayer.field_70161_v);
    }

    void d() {
        block5: {
            eq eq2 = this;
            int n2 = eq2.a();
            if (n2 == -1) {
                return;
            }
            eq2.c(++n2);
            EntityPlayer entityPlayer = this.k();
            if (entityPlayer == null) {
                return;
            }
            if (n2 == 15) {
                Vec3d vec3d = e3.b(this);
                float f = e3.d(this);
                float f2 = e3.c(this);
                if (this.field_70170_p.field_72995_K && this.f()) {
                    d3.a(true);
                }
                Vec3d vec3d2 = e3.a(new Vec3d(0.0, 0.0, 1.5), f, f2);
                entityPlayer.field_70159_w = vec3d2.field_72450_a;
                entityPlayer.field_70181_x = vec3d2.field_72448_b;
                entityPlayer.field_70179_y = vec3d2.field_72449_c;
                if (!this.field_70170_p.field_72995_K) {
                    this.b(f2);
                }
            }
            entityPlayer.field_70145_X = false;
            entityPlayer.func_189654_d(false);
            if (n2 != 39) break block5;
            this.c(-1);
            this.b(fp.THROWN);
            this.e((UUID)null);
            this.a((UUID)null);
        }
    }

    @Override
    public void func_70619_bc() {
        super.func_70619_bc();
        e3.a(this);
        this.o();
        this.e();
    }

    void e() {
        if (this.y() != fp.STAND_UP) {
            return;
        }
        if (++this.aJ < 37) {
            return;
        }
        this.aJ = 0;
        this.b(fp.NULL);
    }

    void o() {
        if (this.y() != fp.THROWN) {
            return;
        }
        EntityPlayer entityPlayer = this.k();
        if (entityPlayer == null) {
            return;
        }
        if (!entityPlayer.field_70122_E) {
            return;
        }
        int n2 = this.d() + 1;
        this.a(n2);
        if (n2 < 30) {
            return;
        }
        this.a(0);
        this.b(fp.STAND_UP);
    }

    @Override
    @Nullable
    public UUID e() {
        String string = (String)this.m.func_187225_a(ax);
        if ("".equals(string)) {
            return null;
        }
        try {
            return UUID.fromString((String)this.m.func_187225_a(ax));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void a(UUID uUID) {
        if (uUID == null) {
            this.m.func_187227_b(ax, (Object)"");
            return;
        }
        this.m.func_187227_b(ax, (Object)uUID.toString());
    }

    public EntityPlayer r() {
        UUID uUID = this.e();
        if (uUID == null) {
            return null;
        }
        return this.field_70170_p.func_152378_a(uUID);
    }

    @Override
    public void c(int n2) {
        this.az = n2;
    }

    @Override
    public int a() {
        return this.az;
    }

    @Override
    public void a(int n2) {
        this.aG = n2;
    }

    @Override
    public int d() {
        return this.aG;
    }

    @Override
    public void a(fp fp2) {
        this.aw = fp2;
    }

    @Override
    public fp b() {
        return this.aw;
    }

    @Override
    public void b(int n2) {
        this.aE = n2;
    }

    @Override
    public int c() {
        return this.aE;
    }

    @Override
    public void g() {
        super.g();
        this.m.func_187227_b(aA, (Object)false);
        if (this.e() == null) {
            return;
        }
        this.a((UUID)null);
        EntityPlayer entityPlayer = this.k();
        if (entityPlayer == null) {
            return;
        }
        ge.b.sendTo((IMessage)new gz(true), (EntityPlayerMP)entityPlayer);
    }

    @SideOnly(value=Side.CLIENT)
    void c(fp fp2) {
        block0: {
            if (fp2 != fp.NELSON_FAST || this.aw == fp.NELSON_FAST) break block0;
            this.aF = false;
        }
    }

    @SideOnly(value=Side.CLIENT)
    void d(fp fp2) {
        Minecraft minecraft = Minecraft.func_71410_x();
        if (!minecraft.field_71439_g.getPersistentID().equals(this.ae())) {
            return;
        }
        if (minecraft.field_71474_y.field_74320_O != 0) {
            return;
        }
        switch (fp2) {
            case NELSON_CUM: 
            case NELSON_FAST: 
            case NELSON_INTRO: 
            case NELSON_SLOW: {
                minecraft.field_71474_y.field_74320_O = 2;
                break;
            }
        }
    }

    @Override
    public void a(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int n2 : list) {
            e4.c(stringBuilder, n2);
        }
        e4.c(stringBuilder, 1);
        this.m.func_187227_b(at, (Object)stringBuilder.toString());
    }

    @Override
    @Nullable
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
        if (fp2 == fp.PAIZURI_START && !this.field_70170_p.field_72995_K) {
            this.m();
        }
        if (fp2 == fp.NELSON_INTRO && !this.field_70170_p.field_72995_K) {
            this.q();
        }
        if (fp2 == fp.NELSON_CUM) {
            this.m.func_187227_b(aA, (Object)true);
        }
        if (fp3 == fp.NELSON_CUM && fp2 != fp.NELSON_CUM) {
            this.m.func_187227_b(aA, (Object)false);
        }
        super.b(fp2);
    }

    void q() {
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
        if (entityPlayer == null) {
            return;
        }
        this.b(entityPlayer.field_70177_z);
        this.field_70145_X = true;
        this.func_189654_d(true);
        entityPlayer.func_189654_d(true);
        entityPlayer.field_70145_X = true;
        entityPlayer.func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v - 1.0);
    }

    void m() {
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(this.ae());
        if (entityPlayer == null) {
            return;
        }
        this.b(entityPlayer.field_70177_z + 180.0f);
        this.field_70145_X = true;
        this.func_189654_d(true);
        entityPlayer.func_189654_d(true);
        entityPlayer.field_70145_X = true;
        entityPlayer.func_70634_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u - 0.5, entityPlayer.field_70161_v - (double)0.6f);
        entityPlayer.field_70125_A = 70.0f;
        entityPlayer.field_70127_C = 70.0f;
    }

    @Override
    public boolean l() {
        return this.e() == null;
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
        if (!entityPlayer.getPersistentID().equals(this.e())) {
            return;
        }
        s.a$a.a(this);
        this.a(false);
        this.b(fp.NULL);
        this.a((UUID)null);
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
            case NELSON_FAST: 
            case NELSON_SLOW: {
                return fp.NELSON_CUM;
            }
        }
        return null;
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        if (this.field_70170_p instanceof gj) {
            return PlayState.STOP;
        }
        block5 : switch (animationEvent.getController().getName()) {
            case "eyes": {
                if (this.y() != fp.NULL || !this.y().autoBlink) {
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
                if (this.ak) {
                    this.a("animation.goblin.sit", true, animationEvent);
                    break;
                }
                if (this.E.getCurrentAnimation() != null && this.E.getCurrentAnimation().animationName.contains("fly") && this.af) {
                    boolean bl = this.aC = !this.aC;
                }
                if (!this.af) {
                    this.a("animation.goblin.fly" + (this.aC ? "2" : ""), true, animationEvent);
                    break;
                }
                if (Math.abs(this.ao.x) + Math.abs(this.ao.y) > 0.0f) {
                    if (this.aj) {
                        this.E.setAnimationSpeed((double)1.2f);
                        this.a("animation.goblin.running", true, animationEvent);
                        break;
                    }
                    if (this.ao.y >= -0.1f) {
                        this.E.setAnimationSpeed(2.0);
                        this.a("animation.goblin.walk", true, animationEvent);
                        break;
                    }
                    this.E.setAnimationSpeed(1.5);
                    this.a("animation.goblin.backwards_walk", true, animationEvent);
                    break;
                }
                this.a("animation.goblin.idle", true, animationEvent);
                break;
            }
            case "action": {
                Minecraft minecraft = Minecraft.func_71410_x();
                String string = minecraft.field_71439_g.getPersistentID().equals(this.e()) && minecraft.field_71474_y.field_74320_O == 0 ? "1" : "3";
                switch (this.y()) {
                    case SHOULDER_IDLE: {
                        this.a("animation.goblin.shoulder_idle", true, animationEvent);
                        break block5;
                    }
                    case PICK_UP: {
                        this.a(String.format("animation.goblin.pick_up_%sperson", string), true, animationEvent);
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
                    case NULL: {
                        this.a("animation.goblin.null", true, animationEvent);
                        break block5;
                    }
                    case STAND_UP: {
                        this.a("animation.goblin.stand_up", false, animationEvent);
                        break block5;
                    }
                    case STRIP: {
                        this.a("animation.goblin.strip", false, animationEvent);
                        break block5;
                    }
                    case ATTACK: {
                        this.a("animation.goblin.attack" + this.S, false, animationEvent);
                        break block5;
                    }
                    case BOW: {
                        this.a("animation.goblin.bowcharge", false, animationEvent);
                        break block5;
                    }
                    case SIT: {
                        this.a("animation.goblin.sit", true, animationEvent);
                        break block5;
                    }
                    case NELSON_INTRO: {
                        this.a("animation.goblin.nelson_intro", true, animationEvent);
                        break block5;
                    }
                    case NELSON_SLOW: {
                        this.a("animation.goblin.nelson_slow" + (this.ay ? "" : "2"), true, animationEvent);
                        break block5;
                    }
                    case NELSON_FAST: {
                        this.a("animation.goblin.nelson_fast" + (this.aF ? "c" : "s"), true, animationEvent);
                        break block5;
                    }
                    case NELSON_CUM: {
                        this.a("animation.goblin.nelson_cum", true, animationEvent);
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
                        this.a("animation.goblin.breeding_slow_1" + (this.aB ? "l" : "r"), true, animationEvent);
                        break block5;
                    }
                    case BREEDING_SLOW_2: {
                        this.a("animation.goblin.breeding_slow_3", true, animationEvent);
                        break block5;
                    }
                    case BREEDING_FAST_0: {
                        this.a("animation.goblin.breeding_fast_1" + (this.aH ? "c" : "s"), true, animationEvent);
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
                    case PAIZURI_START: {
                        this.a("animation.goblin.paizuri_start", true, animationEvent);
                        break block5;
                    }
                    case PAIZURI_SLOW: {
                        this.a("animation.goblin.paizuri_slow" + this.aD, true, animationEvent);
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
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "catchEh": {
                    this.a("ehh..");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "catchAkward": {
                    this.a("awkward..");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "catchWell": {
                    this.a("well...");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "catchRather": {
                    this.a("would you rather have this stupid... thing?");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "catchMe": {
                    this.a("...or use me?~");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
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
                    eq.a((EntityPlayer)entityPlayerSP, this, new String[]{"use her", "take ur stuff back"}, null, false);
                    break;
                }
                case "paizuriChoice": {
                    this.a("good choice!~");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "paizuriBoth": {
                    this.a("...for both of us!");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "paizruiUse": {
                    this.a("now use me like a fuck toy!~");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "paizuriSwitch": {
                    if (this.func_70681_au().nextBoolean()) break;
                    this.aD = "".equals(this.aD) ? "2" : "";
                    break;
                }
                case "touch": {
                    this.a(com.trolmastercard.sexmod.c.MISC_TOUCH, 3.0f);
                    break;
                }
                case "pound": {
                    this.a(com.trolmastercard.sexmod.c.MISC_POUNDING);
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
                case "paizuriFastContinuesReady": 
                case "neslon_fastBackSwitch": {
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
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "breedingFound": {
                    this.a("guess we found a worthy breeding partner!");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
                    break;
                }
                case "breedingEnough": {
                    this.a("Eh.. go pin him down, before he runs off!");
                    this.a(com.trolmastercard.sexmod.c.MISC_PLOB);
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
                        boolean bl = this.aB = !this.aB;
                    }
                    if (!this.n() || !d3.d) break;
                    this.b(fp.BREEDING_FAST_0);
                    this.aH = false;
                    break;
                }
                case "breeding_fast1Done": {
                    this.b(fp.BREEDING_SLOW_0);
                    if (!this.n()) break;
                    this.aH = false;
                    break;
                }
                case "breeding_fast1Ready": {
                    if (!this.n() || !d3.d) break;
                    this.aH = true;
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
                    this.ay = !this.ay;
                    break;
                }
                case "neslon_fastSwitch": {
                    if (!this.n()) {
                        this.aF = true;
                        return;
                    }
                    if (!d3.d) break;
                    this.aF = true;
                    break;
                }
                case "nelsonFastDone": {
                    this.aF = false;
                    if (!this.n()) break;
                    this.b(fp.NELSON_SLOW);
                    break;
                }
                case "paizuriCumDone": 
                case "nelson_cumDone": {
                    if (!this.n()) break;
                    this.r();
                    this.b(fp.NULL);
                    break;
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        this.E.transitionLengthTicks = 2.0;
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
        animationData.addAnimationController(this.s);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static class a$a {
        HashSet<EntityPlayer> a = new HashSet();

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(RenderHandEvent renderHandEvent) {
            block2: {
                ei ei2 = ei.g((EntityPlayer)Minecraft.func_71410_x().field_71439_g);
                if (ei2 == null) {
                    return;
                }
                if (!(ei2 instanceof ai)) {
                    return;
                }
                if (((ai)((Object)ei2)).e() == null) break block2;
                renderHandEvent.setCanceled(true);
            }
        }

        @SubscribeEvent
        public void a(TickEvent.PlayerTickEvent playerTickEvent) {
            EntityPlayer entityPlayer = playerTickEvent.player;
            if (entityPlayer == null) {
                return;
            }
            this.a(entityPlayer);
        }

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(TickEvent.RenderTickEvent renderTickEvent) {
            if (renderTickEvent.phase == TickEvent.Phase.END) {
                return;
            }
            EntityPlayerSP entityPlayerSP = Minecraft.func_71410_x().field_71439_g;
            if (entityPlayerSP == null) {
                return;
            }
            this.a((EntityPlayer)entityPlayerSP);
        }

        void a(EntityPlayer entityPlayer) {
            ei ei2 = ei.g(entityPlayer);
            if (!(ei2 instanceof eq)) {
                return;
            }
            fp fp2 = ei2.y();
            if (fp2 == fp.THROWN) {
                return;
            }
            if (fp2 == fp.START_THROWING && ((ai)((Object)ei2)).a() > 15) {
                return;
            }
            UUID uUID = ((eq)ei2).e();
            if (uUID == null) {
                return;
            }
            EntityPlayer entityPlayer2 = entityPlayer.field_70170_p.func_152378_a(uUID);
            if (entityPlayer2 == null) {
                return;
            }
            entityPlayer.field_70145_X = true;
            entityPlayer.func_189654_d(true);
            ei2.field_70145_X = true;
            ei2.func_189654_d(true);
            entityPlayer.func_70107_b(entityPlayer2.field_70165_t, entityPlayer2.field_70163_u + 2.0, entityPlayer2.field_70161_v);
            entityPlayer.field_70142_S = entityPlayer2.field_70142_S;
            entityPlayer.field_70137_T = entityPlayer2.field_70137_T + 2.0;
            entityPlayer.field_70136_U = entityPlayer2.field_70136_U;
        }

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void a(RenderWorldLastEvent renderWorldLastEvent) {
            Minecraft minecraft = Minecraft.func_71410_x();
            RenderManager renderManager = minecraft.func_175598_ae();
            EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
            if (minecraft.field_71439_g == null) {
                return;
            }
            Vec3d vec3d = entityPlayerSP.func_174791_d();
            for (EntityPlayer entityPlayer : this.a) {
                Vec3d vec3d2 = entityPlayer.func_174791_d();
                Vec3d vec3d3 = vec3d2.func_178788_d(vec3d);
                renderManager.func_188391_a((Entity)entityPlayer, vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c, 69.0f, renderWorldLastEvent.getPartialTicks(), true);
            }
            GlStateManager.func_179145_e();
            GlStateManager.func_179126_j();
            GlStateManager.func_179141_d();
        }

        @SideOnly(value=Side.CLIENT)
        @SubscribeEvent
        public void b(TickEvent.RenderTickEvent renderTickEvent) {
            if (renderTickEvent.phase == TickEvent.Phase.START) {
                this.b();
            } else {
                this.a();
            }
        }

        @SideOnly(value=Side.CLIENT)
        void a() {
            for (EntityPlayer entityPlayer : this.a) {
                entityPlayer.field_70128_L = true;
            }
        }

        @SideOnly(value=Side.CLIENT)
        void b() {
            this.a.clear();
            Minecraft minecraft = Minecraft.func_71410_x();
            EntityPlayerSP entityPlayerSP = minecraft.field_71439_g;
            if (minecraft.field_71441_e == null) {
                return;
            }
            for (EntityPlayer entityPlayer : minecraft.field_71441_e.field_73010_i) {
                eq eq2;
                ei ei2;
                if (entityPlayer == entityPlayerSP || !((ei2 = ei.g(entityPlayer)) instanceof eq) || (eq2 = (eq)ei2).e() == null) continue;
                fp fp2 = eq2.y();
                if (fp2 == fp.THROWN || fp2 == fp.START_THROWING) {
                    return;
                }
                this.a.add(entityPlayer);
                entityPlayer.field_70128_L = false;
            }
        }

        @SubscribeEvent
        public void a(PlayerInteractEvent.EntityInteract entityInteract) {
            EntityPlayer entityPlayer = entityInteract.getEntityPlayer();
            if (!entityPlayer.func_70093_af()) {
                return;
            }
            if (!(entityInteract.getTarget() instanceof EntityPlayer)) {
                return;
            }
            ei ei2 = ei.d(entityInteract.getTarget().getPersistentID());
            if (!(ei2 instanceof eq)) {
                return;
            }
            ei ei3 = ei.d(entityPlayer.getPersistentID());
            if (ei3 != null) {
                return;
            }
            ((eq)ei2).c(entityInteract.getEntityPlayer());
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
