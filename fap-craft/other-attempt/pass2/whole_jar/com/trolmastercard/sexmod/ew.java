/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.gj;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class ew
extends ei {
    public static final DataParameter<String> as = EntityDataManager.func_187226_a(ew.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(119);
    public static final DataParameter<BlockPos> au = EntityDataManager.func_187226_a(ew.class, (DataSerializer)DataSerializers.field_187200_j).func_187156_b().func_187161_a(120);
    public static final DataParameter<String> at = EntityDataManager.func_187226_a(ew.class, (DataSerializer)DataSerializers.field_187194_d).func_187156_b().func_187161_a(121);
    boolean ar = true;
    String ap = null;
    String av = null;
    BlockPos aq = null;

    protected ew(World world) {
        super(world);
    }

    protected ew(World world, UUID uUID) {
        super(world, uUID);
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        if (this.field_70170_p.field_72995_K && this.field_70170_p instanceof gj) {
            return;
        }
        this.m.func_187214_a(at, (Object)this.a(new StringBuilder()));
    }

    protected abstract String a(StringBuilder var1);

    public static String[] a(em em2) {
        return ((String)em2.func_184212_Q().func_187225_a(at)).split("-");
    }

    @Override
    public void func_70071_h_() {
        block3: {
            super.func_70071_h_();
            this.b();
            if (!this.ar) {
                return;
            }
            if (this.field_70170_p.field_72995_K) {
                this.a();
                this.ar = true;
                return;
            }
            EntityPlayer entityPlayer = this.k();
            if (entityPlayer == null) {
                return;
            }
            String string = entityPlayer.getEntityData().func_74779_i("sexmod:GirlSpecific" + (Object)((Object)fy.a((Entity)this)));
            this.ar = false;
            if ("".equals(string)) break block3;
            this.a(ew.c(string));
        }
    }

    void b() {
        if (!this.field_70170_p.field_72995_K) {
            return;
        }
        String string = (String)this.m.func_187225_a(as);
        String string2 = (String)this.m.func_187225_a(at);
        BlockPos blockPos = (BlockPos)this.m.func_187225_a(au);
        if (this.ap == null) {
            this.ap = string;
            this.av = string2;
            this.aq = blockPos;
            return;
        }
        if (!(this.av.equals(string2) && this.ap.equals(string) && this.aq.equals((Object)blockPos))) {
            this.a();
        }
        this.ap = string;
        this.av = string2;
        this.aq = blockPos;
    }

    protected abstract void a();

    private static RuntimeException d(RuntimeException runtimeException) {
        return runtimeException;
    }
}

