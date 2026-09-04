/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a7;
import com.trolmastercard.sexmod.at;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.d3;
import com.trolmastercard.sexmod.ds;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.fh;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;

public class e9
extends ei {
    protected e9(World world) {
        super(world);
    }

    public e9(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    public void B() {
        this.c(true);
    }

    @Override
    public void y() {
        this.c(false);
    }

    @Override
    public float i() {
        return 1.4f;
    }

    public float func_70047_e() {
        return 1.3f;
    }

    @Override
    public at a(int n2) {
        return new a7();
    }

    @Override
    public String c(int n2) {
        return "textures/entity/bee/hand.png";
    }

    @Override
    public void b(String string, UUID uUID) {
        this.a(0, fp.CITIZEN_START);
        this.f(0);
        this.b(fp.CITIZEN_START);
        this.b(uUID);
        EntityPlayer entityPlayer = this.field_70170_p.func_152378_a(uUID);
        if (entityPlayer == null) {
            return;
        }
        Vec3d vec3d = this.a(-0.2);
        entityPlayer.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        e9.a(entityPlayer, this, new String[]{"action.names.sex"}, false);
        return true;
    }

    @Override
    public void b(fp fp2) {
        if (this.y() == fp.CITIZEN_CUM && (fp2 == fp.CITIZEN_FAST || fp2 == fp.COWGIRLSLOW)) {
            return;
        }
        super.b(fp2);
    }

    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    protected fp c(fp fp2) {
        if (fp2 == fp.CITIZEN_SLOW) {
            return fp.CITIZEN_FAST;
        }
        return null;
    }

    @Override
    protected fp a(fp fp2) {
        if (fp2 == fp.CITIZEN_FAST || fp2 == fp.CITIZEN_SLOW) {
            return fp.CITIZEN_CUM;
        }
        return null;
    }

    @Override
    public void g() {
        super.g();
        this.f(1);
    }

    @Override
    protected <E extends IAnimatable> PlayState a(AnimationEvent<E> animationEvent) {
        block4 : switch (animationEvent.getController().getName()) {
            case "movement": {
                if (this.y() != fp.NULL) {
                    this.a("animation.bee.null", true, animationEvent);
                    break;
                }
                this.a("animation.bee.idle", true, animationEvent);
                break;
            }
            case "action": {
                switch (this.y()) {
                    case NULL: {
                        this.a("animation.bee.null", false, animationEvent);
                        break block4;
                    }
                    case CITIZEN_START: {
                        this.a("animation.bee.sex_start", false, animationEvent);
                        break block4;
                    }
                    case CITIZEN_SLOW: {
                        this.a("animation.bee.sex_slow", true, animationEvent);
                        break block4;
                    }
                    case CITIZEN_FAST: {
                        this.a("animation.bee.sex_fast", true, animationEvent);
                        break block4;
                    }
                    case CITIZEN_CUM: {
                        this.a("animation.bee.sex_cum", false, animationEvent);
                        break block4;
                    }
                    case THROW_PEARL: {
                        this.a("animation.bee.throw_pearl", true, animationEvent);
                        break block4;
                    }
                    case ATTACK: {
                        this.a("animation.bee.attack" + this.S, false, animationEvent);
                        break block4;
                    }
                    case BOW: {
                        this.a("animation.bee.bowcharge", false, animationEvent);
                        break block4;
                    }
                    case RIDE: {
                        this.a("animation.bee.ride", true, animationEvent);
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
                case "attackDone": {
                    if (++this.S != 3) break;
                    this.S = 0;
                    break;
                }
                case "pearl": {
                    if (!this.e() || this.y() != fp.THROW_PEARL) break;
                    ge.b.sendToServer((IMessage)new gg(this.f()));
                    break;
                }
                case "resetCumPercentage": {
                    if (!this.n()) break;
                    ds.b();
                    break;
                }
                case "sex_fastMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    if (!this.n()) break;
                    ds.a(0.04f);
                    break;
                }
                case "sex_startMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    if (!this.n()) break;
                    ds.a(0.02f);
                    break;
                }
                case "sex_fastReady": {
                    if (!this.n() || !d3.d) break;
                    this.N();
                    break;
                }
                case "sex_fastDone": {
                    if (!this.n() || d3.d) break;
                }
                case "sex_startDone": {
                    this.b(fp.CITIZEN_SLOW);
                    if (!this.n()) break;
                    ds.d();
                    break;
                }
                case "sex_cumMSG1": {
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_CUMINFLATION), 2.0f);
                    this.a(com.trolmastercard.sexmod.c.a(com.trolmastercard.sexmod.c.MISC_POUNDING));
                    break;
                }
                case "blackscreen": {
                    if (!this.n()) break;
                    fh.b();
                    break;
                }
                case "sex_cumDone": {
                    if (!this.n()) break;
                    ds.b();
                    this.r();
                    break;
                }
            }
        };
        this.C.registerSoundListener(iSoundListener);
        animationData.addAnimationController(this.C);
        animationData.addAnimationController(this.E);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

