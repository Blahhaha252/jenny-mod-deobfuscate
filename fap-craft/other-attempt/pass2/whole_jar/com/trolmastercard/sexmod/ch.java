/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a6;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f3;
import com.trolmastercard.sexmod.fo;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.n;
import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ch
extends GuiScreen {
    fo c;
    EntityPlayer a;
    boolean e;
    static final ResourceLocation b = new ResourceLocation("sexmod", "textures/gui/girlinventory.png");
    double d = 0.0;

    public ch(fo fo2, EntityPlayer entityPlayer) {
        this.c = fo2;
        this.a = entityPlayer;
        this.e = !"".equals(fo2.func_184212_Q().func_187225_a(em.v));
    }

    public boolean func_73868_f() {
        return false;
    }

    public void func_73863_a(int n2, int n3, float f10) {
        super.func_73863_a(n2, n3, f10);
        this.field_146292_n.clear();
        ScaledResolution scaledResolution = new ScaledResolution(this.field_146297_k);
        int n4 = scaledResolution.func_78326_a();
        this.d = Math.min(1.0, this.d + (double)(this.field_146297_k.func_193989_ak() / 5.0f));
        this.field_146292_n.add(new GuiButton(0, n4 / 2 - 119 + (int)(100.0 - 100.0 * this.d), 30, (int)(this.d * 100.0), 20, this.e ? I18n.func_135052_a((String)"action.names.stopfollowme", (Object[])new Object[0]) : I18n.func_135052_a((String)"action.names.followme", (Object[])new Object[0])));
        this.field_146292_n.add(new GuiButton(1, n4 / 2 + 19, 30, (int)(this.d * 100.0), 20, I18n.func_135052_a((String)"action.names.gohome", (Object[])new Object[0])));
        this.field_146297_k.field_71446_o.func_110577_a(b);
        this.func_73729_b(n4 / 2 - 7, 61 - (int)(15.0 - this.d * 15.0), 32, 0, 15, 15);
        this.field_146292_n.add(new GuiButton(2, n4 / 2 - 10, 59 - (int)(15.0 - this.d * 15.0), 20, 20, ""));
        this.func_73729_b(n4 / 2 - 20, 20, (Boolean)this.c.func_184212_Q().func_187225_a(fo.K) != false ? 0 : 40, 130, 40, 40);
    }

    protected void func_73864_a(int n2, int n3, int n4) throws IOException {
        ScaledResolution scaledResolution = new ScaledResolution(this.field_146297_k);
        int n5 = scaledResolution.func_78326_a();
        if (((Boolean)this.c.func_184212_Q().func_187225_a(fo.K)).booleanValue() && n2 >= n5 / 2 - 20 && n2 <= n5 / 2 + 20 && n3 >= 20 && n3 <= 60) {
            ge.b.sendToServer((IMessage)new f3(this.c.f(), this.a.getPersistentID()));
            this.func_146281_b();
        }
        super.func_73864_a(n2, n3, n4);
    }

    protected void func_146284_a(GuiButton guiButton) throws IOException {
        block4: {
            super.func_146284_a(guiButton);
            if (guiButton.field_146127_k == 0) {
                if (this.e) {
                    ge.b.sendToServer((IMessage)new n(this.c.f(), "master", ""));
                    this.a.func_145747_a((ITextComponent)new TextComponentString(I18n.func_135052_a((String)"bee.dialogue.sad", (Object[])new Object[0])));
                } else {
                    ge.b.sendToServer((IMessage)new n(this.c.f(), "master", this.a.getPersistentID().toString()));
                    this.a.func_145747_a((ITextComponent)new TextComponentString(I18n.func_135052_a((String)"bee.dialogue.exited", (Object[])new Object[0])));
                }
                this.e = !this.e;
                this.a.func_71053_j();
            }
            if (guiButton.field_146127_k == 1) {
                ge.b.sendToServer((IMessage)new gg(this.c.f()));
                this.a.func_71053_j();
            }
            if (guiButton.field_146127_k != 2) break block4;
            ge.b.sendToServer((IMessage)new a6(this.c.f(), new Vec3d(this.c.field_70165_t, this.c.field_70163_u, this.c.field_70161_v)));
            this.a.func_71053_j();
            this.a.func_145747_a((ITextComponent)new TextComponentString(I18n.func_135052_a((String)"bee.dialogue.home", (Object[])new Object[0])));
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

