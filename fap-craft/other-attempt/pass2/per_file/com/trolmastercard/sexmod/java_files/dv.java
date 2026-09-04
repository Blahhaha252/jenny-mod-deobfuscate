/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Vec2f
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.dm;
import com.trolmastercard.sexmod.e5;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import java.util.ArrayList;
import java.util.Collection;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec2f;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class dv
extends dm {
    static final float E = 8.0f;
    static final float K = 1.68f;
    static final float M = 5.0f;
    static Collection<dv> J = new ArrayList<dv>();
    double C = 0.0;
    double z = 0.0;
    double A = 0.0;
    double D = 0.0;
    float F = 0.0f;
    float B = 0.0f;
    float G;
    float I;
    double H = 0.0;
    double L = 0.0;

    public dv(RenderManager renderManager, AnimatedGeoModel animatedGeoModel) {
        super(renderManager, animatedGeoModel);
        J.add(this);
    }

    @Override
    protected void c() {
        GlStateManager.func_179109_b((float)0.0f, (float)-1.1f, (float)0.0f);
        GlStateManager.func_179152_a((float)0.7f, (float)0.7f, (float)0.7f);
    }

    @Override
    protected void a(boolean bl, ItemStack itemStack) {
        super.a(bl, itemStack);
        switch (itemStack.func_77973_b().func_77661_b(itemStack)) {
            case BLOCK: 
            case BOW: {
                break;
            }
            default: {
                if (!bl) {
                    GlStateManager.func_179114_b((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                GlStateManager.func_179137_b((double)0.0, (double)0.05, (double)0.0);
            }
        }
    }

    @Override
    protected void a(boolean bl) {
        super.a(bl);
        if (bl) {
            GlStateManager.func_179137_b((double)0.15, (double)0.0, (double)0.0);
        } else {
            GlStateManager.func_179137_b((double)-0.05, (double)0.0, (double)0.0);
        }
    }

    @Override
    protected void a(boolean bl, boolean bl2) {
        super.a(bl, bl2);
        if (bl && !bl2) {
            GlStateManager.func_179137_b((double)-0.025, (double)-0.1, (double)-0.1);
            GlStateManager.func_179114_b((float)10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            return;
        }
        if (!bl && !bl2) {
            GlStateManager.func_179137_b((double)-0.05, (double)-0.125, (double)0.125);
            GlStateManager.func_179114_b((float)50.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            return;
        }
    }

    @Override
    protected void a(String string, GeoBone geoBone) {
        block6: {
            if (((Boolean)this.w.func_184212_Q().func_187225_a(em.G)).booleanValue()) {
                return;
            }
            if ("tail".equals(string)) {
                this.a(geoBone, 0.0f, 0.0f, 1.0f);
            }
            if ("body".equals(string)) {
                this.a(geoBone);
            }
            if (this.w.y() == fp.BOW) {
                return;
            }
            if ("armL".equals(string)) {
                this.a(geoBone, 0.0f, -0.34906584f, 0.15f);
            }
            if (this.w.y() == fp.ATTACK) {
                return;
            }
            if (!"armR".equals(string)) break block6;
            this.a(geoBone, 0.0f, 0.34906584f, 0.15f);
        }
    }

    void a(GeoBone geoBone, float f, float f2, float f3) {
        double d = this.C - this.A;
        double d2 = this.z - this.D;
        double d3 = Math.PI / 180 * (double)this.w.field_70177_z;
        Vec2f vec2f = new Vec2f((float)(d * Math.cos(d3) + d2 * Math.sin(d3)), (float)(-d * Math.sin(d3) + d2 * Math.cos(d3)));
        this.G = vec2f.field_189983_j * -8.0f;
        this.I = vec2f.field_189982_i * 8.0f;
        this.G = be.b(this.G, -1.68f, 1.68f);
        this.I = be.b(this.I, -1.68f, 1.68f);
        this.G = b6.a(this.F, this.G, this.y);
        this.I = b6.a(this.B, this.I, this.y);
        geoBone.setRotationX(f + this.G * f3);
        geoBone.setRotationZ(f2 + this.I * f3);
    }

    void a(GeoBone geoBone) {
        block0: {
            double d = this.C - this.A;
            double d2 = this.z - this.D;
            this.L = (Math.abs(d) + Math.abs(d2)) * 5.0;
            this.L = be.b((float)this.L, 0.0f, 1.0f);
            geoBone.setPositionY((float)b6.a(5.0, 0.0, b6.b(this.H, this.L, (double)this.y)));
            if (!(this.w instanceof e5)) break block0;
            ((e5)this.w).aq = (float)b6.a((double)0.3f, 0.0, b6.b(this.H, this.L, (double)this.y));
        }
    }

    void a() {
        if (this.w == null) {
            return;
        }
        this.F = this.G;
        this.B = this.I;
        this.H = this.L;
        if (this.w.m() == null) {
            return;
        }
        EntityPlayer entityPlayer = this.j.field_70170_p.func_152378_a(this.w.m());
        if (entityPlayer == null) {
            return;
        }
        this.A = this.C;
        this.D = this.z;
        this.C = entityPlayer.field_70165_t;
        this.z = entityPlayer.field_70161_v;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static class a$a {
        @SubscribeEvent
        public void a(TickEvent.ClientTickEvent clientTickEvent) {
            for (dv dv2 : J) {
                dv2.a();
            }
        }
    }
}
