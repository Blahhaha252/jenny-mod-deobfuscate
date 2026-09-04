/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBox
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.at;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class a0
extends ModelBase
implements at {
    private final ModelRenderer a;

    public a0() {
        this.field_78090_t = 16;
        this.field_78089_u = 16;
        this.a = new ModelRenderer((ModelBase)this);
        this.a.func_78793_a(-5.0f, 2.5f, 0.0f);
        this.a.field_78804_l.add(new ModelBox(this.a, 0, 0, -2.0f, -6.0f, 0.0f, 2, 6, 2, 0.0f, false));
    }

    public void func_78088_a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.func_78785_a(f6);
    }

    public void a(ModelRenderer modelRenderer, float f, float f2, float f3) {
        modelRenderer.field_78795_f = f;
        modelRenderer.field_78796_g = f2;
        modelRenderer.field_78808_h = f3;
    }

    @Override
    public ModelRenderer a() {
        return this.a;
    }
}
