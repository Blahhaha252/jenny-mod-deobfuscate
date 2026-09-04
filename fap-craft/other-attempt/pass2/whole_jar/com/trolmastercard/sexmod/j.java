/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBed
 *  net.minecraft.block.BlockChest
 *  net.minecraft.block.BlockLog
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  org.lwjgl.opengl.GL11
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.au;
import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.e6;
import com.trolmastercard.sexmod.fa;
import com.trolmastercard.sexmod.fc;
import com.trolmastercard.sexmod.fj;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gm;
import com.trolmastercard.sexmod.h6;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import org.lwjgl.opengl.GL11;

public class j
extends GuiScreen {
    static final float f = 100.0f;
    static final float g = 15.0f;
    static final float j = 0.5f;
    static final ResourceLocation h = new ResourceLocation("sexmod", "textures/gui/command.png");
    static final HashSet<Material> l = new HashSet<Material>(Arrays.asList(Material.field_151571_B, Material.field_151576_e, Material.field_151595_p, Material.field_151578_c));
    public static boolean d = false;
    float m = 0.0f;
    float a = 0.0f;
    float k = 0.0f;
    float n = 0.0f;
    float i = 0.0f;
    IBlockState e;
    BlockPos c;
    EnumFacing b;

    public j() {
        Minecraft minecraft = Minecraft.func_71410_x();
        this.c = minecraft.field_71476_x.func_178782_a();
        this.b = minecraft.field_71476_x.field_178784_b == null ? EnumFacing.NORTH : minecraft.field_71476_x.field_178784_b.func_176734_d();
        if (this.c == null) {
            this.c = BlockPos.field_177992_a;
        }
        this.e = minecraft.field_71441_e.func_180495_p(this.c);
    }

    public void func_146281_b() {
        block4: {
            super.func_146281_b();
            List<Float> list = Arrays.asList(Float.valueOf(this.a), Float.valueOf(this.k), Float.valueOf(this.n), Float.valueOf(this.i));
            float f10 = Collections.max(list).floatValue();
            if (f10 == 0.0f) {
                return;
            }
            if (this.a == f10) {
                this.b();
            }
            if (this.k == f10) {
                this.d();
            }
            if (this.n == f10) {
                this.c();
            }
            if (this.i != f10) break block4;
            this.a();
        }
    }

    void b() {
        IBlockState iBlockState = this.field_146297_k.field_71441_e.func_180495_p(this.c);
        if (iBlockState.func_177230_c() instanceof BlockBed || iBlockState.func_177230_c() instanceof BlockChest) {
            ge.b.sendToServer((IMessage)new h6(this.c, !gm.a(this.c)));
        }
    }

    void d() {
        ge.b.sendToServer((IMessage)new fj(!d));
    }

    void c() {
        fa.a();
    }

    void a() {
        Object[] objectArray;
        Block block = this.e.func_177230_c();
        if (block instanceof BlockLog) {
            if (gm.a(this.c)) {
                ge.b.sendToServer((IMessage)new au(this.c));
                return;
            }
            ge.b.sendToServer((IMessage)new fc(this.c));
        }
        if ((objectArray = this.e()) != null) {
            if (gm.a(this.c)) {
                ge.b.sendToServer((IMessage)new au(this.c));
                return;
            }
            ge.b.sendToServer((IMessage)new e6((BlockPos)objectArray[0], (EnumFacing)objectArray[1]));
        }
    }

    @Nullable
    Object[] e() {
        Material material = this.field_146297_k.field_71441_e.func_180495_p(this.c).func_185904_a();
        EntityPlayerSP entityPlayerSP = this.field_146297_k.field_71439_g;
        if (!l.contains(material)) {
            return null;
        }
        if (entityPlayerSP.func_180425_c().func_177956_o() > this.c.func_177956_o()) {
            return null;
        }
        BlockPos blockPos = this.c;
        while (this.field_146297_k.field_71441_e.func_180495_p(blockPos.func_177977_b().func_177971_a(this.b.func_176734_d().func_176730_m())).func_177230_c() == Blocks.field_150350_a) {
            blockPos = blockPos.func_177977_b();
        }
        if (this.c.func_177956_o() - blockPos.func_177956_o() > 3) {
            return null;
        }
        return new Object[]{blockPos, this.b};
    }

    public void func_73863_a(int n2, int n3, float f10) {
        boolean bl2;
        super.func_73863_a(n2, n3, f10);
        GL11.glEnable((int)3042);
        OpenGlHelper.func_148821_a((int)770, (int)771, (int)1, (int)0);
        GL11.glBlendFunc((int)770, (int)771);
        try {
            this.m = Math.min(1.0f, this.m + this.field_146297_k.func_193989_ak() / 5.0f);
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        float f11 = (float)this.a((double)this.m);
        float f12 = (1.0f - f11) * 100.0f;
        this.a += (float)(n2 < this.field_146294_l / 2 && n3 > this.field_146295_m / 2 ? 1 : -1) * this.field_146297_k.func_193989_ak();
        this.k += (float)(n2 < this.field_146294_l / 2 && n3 < this.field_146295_m / 2 ? 1 : -1) * this.field_146297_k.func_193989_ak();
        this.n += (float)(n2 > this.field_146294_l / 2 && n3 > this.field_146295_m / 2 ? 1 : -1) * this.field_146297_k.func_193989_ak();
        this.i += (float)(n2 > this.field_146294_l / 2 && n3 < this.field_146295_m / 2 ? 1 : -1) * this.field_146297_k.func_193989_ak();
        this.a = be.b(this.a, 0.0f, 1.0f);
        this.k = be.b(this.k, 0.0f, 1.0f);
        this.n = be.b(this.n, 0.0f, 1.0f);
        this.i = be.b(this.i, 0.0f, 1.0f);
        GlStateManager.func_179094_E();
        GlStateManager.func_179109_b((float)((float)this.field_146294_l / 2.0f), (float)((float)this.field_146295_m / 2.0f), (float)0.0f);
        GlStateManager.func_179152_a((float)f11, (float)f11, (float)f11);
        this.field_146297_k.field_71446_o.func_110577_a(h);
        GlStateManager.func_179094_E();
        GlStateManager.func_179152_a((float)(1.0f + this.k * 0.5f), (float)(1.0f + this.k * 0.5f), (float)1.0f);
        this.func_175174_a(-62.0f + f12 - this.k * 15.0f, -62.0f + f12 - this.k * 15.0f, 0, 0, 64, 64);
        this.c(f12);
        if (d) {
            this.func_175174_a(-62.0f + f12 - this.k * 15.0f, -62.0f + f12 - this.k * 15.0f, 128, 64, 64, 64);
        }
        GlStateManager.func_179121_F();
        GlStateManager.func_179094_E();
        GlStateManager.func_179152_a((float)(1.0f + this.n * 0.5f), (float)(1.0f + this.n * 0.5f), (float)1.0f);
        this.func_175174_a(-2.0f - f12 + this.n * 15.0f, -2.0f - f12 + this.n * 15.0f, 0, 0, 64, 64);
        this.a(f12);
        if (fa.b()) {
            this.func_175174_a(-2.0f - f12 + this.n * 15.0f, -2.0f - f12 + this.n * 15.0f, 128, 64, 64, 64);
        }
        GlStateManager.func_179121_F();
        Block block = this.e.func_177230_c();
        boolean bl3 = block instanceof BlockChest;
        boolean bl4 = block instanceof BlockBed;
        if (bl3 || bl4) {
            GlStateManager.func_179094_E();
            GlStateManager.func_179152_a((float)(1.0f + this.a * 0.5f), (float)(1.0f + this.a * 0.5f), (float)1.0f);
            this.func_175174_a(-62.0f + f12 - this.a * 15.0f, -2.0f - f12 + this.a * 15.0f, 0, 0, 64, 64);
            if (bl3) {
                this.d(f12);
            }
            if (bl4) {
                this.f(f12);
            }
            if (gm.a(this.c)) {
                this.func_175174_a(-62.0f + f12 - this.a * 15.0f, -2.0f - f12 + this.a * 15.0f, 128, 64, 64, 64);
            }
            GlStateManager.func_179121_F();
        }
        boolean bl5 = block instanceof BlockLog;
        boolean bl6 = bl2 = this.e() != null;
        if (bl5 || bl2) {
            GlStateManager.func_179094_E();
            GlStateManager.func_179152_a((float)(1.0f + this.i * 0.5f), (float)(1.0f + this.i * 0.5f), (float)1.0f);
            this.func_175174_a(-2.0f - f12 + this.i * 15.0f, -62.0f + f12 - this.i * 15.0f, 0, 0, 64, 64);
            if (bl5) {
                this.e(f12);
            }
            if (bl2) {
                this.b(f12);
            }
            if (gm.a(this.c)) {
                this.func_175174_a(-2.0f - f12 + this.i * 15.0f, -62.0f + f12 - this.i * 15.0f, 128, 64, 64, 64);
            }
            GlStateManager.func_179121_F();
        }
        GlStateManager.func_179121_F();
        GL11.glDisable((int)3042);
    }

    void a(float f10) {
        this.func_175174_a(-2.0f - f10 + this.n * 15.0f, -2.0f - f10 + this.n * 15.0f, 192, 64, 64, 64);
    }

    void c(float f10) {
        this.func_175174_a(-62.0f + f10 - this.k * 15.0f, -62.0f + f10 - this.k * 15.0f, 64, 64, 64, 64);
    }

    void e(float f10) {
        this.func_175174_a(-2.0f - f10 + this.i * 15.0f, -62.0f + f10 - this.i * 15.0f, 64, 0, 64, 64);
    }

    void b(float f10) {
        this.func_175174_a(-2.0f - f10 + this.i * 15.0f, -62.0f + f10 - this.i * 15.0f, 128, 0, 64, 64);
    }

    void f(float f10) {
        this.func_175174_a(-62.0f + f10 - this.a * 15.0f, -2.0f - f10 + this.a * 15.0f, 0, 64, 64, 64);
    }

    void d(float f10) {
        this.func_175174_a(-62.0f + f10 - this.a * 15.0f, -2.0f - f10 + this.a * 15.0f, 192, 0, 64, 64);
    }

    double a(double d10) {
        double d11 = 1.70158;
        double d12 = d11 + 1.0;
        return 1.0 + d12 * Math.pow(d10 - 1.0, 3.0) + d11 * Math.pow(d10 - 1.0, 2.0);
    }

    protected void func_146286_b(int n2, int n3, int n4) {
        this.field_146297_k.field_71439_g.func_71053_j();
        super.func_146286_b(n2, n3, n4);
    }

    public boolean func_73868_f() {
        return false;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }
}

