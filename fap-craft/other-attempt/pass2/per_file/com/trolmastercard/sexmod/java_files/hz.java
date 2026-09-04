/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockDoor
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.pathfinding.Path
 *  net.minecraft.pathfinding.PathNavigateGround
 *  net.minecraft.pathfinding.PathPoint
 *  net.minecraft.util.math.BlockPos
 */
package com.trolmastercard.sexmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.math.BlockPos;

public class hz
extends EntityAIBase {
    protected EntityLiving c;
    protected BlockPos b = BlockPos.field_177992_a;
    protected BlockDoor d;
    boolean e;
    float f;
    float a;
    int g = 10;

    public hz(EntityLiving entityLiving) {
        this.c = entityLiving;
        if (!(entityLiving.func_70661_as() instanceof PathNavigateGround)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }

    public boolean func_75250_a() {
        boolean bl = true;
        for (int i = -3; i < 5; ++i) {
            for (int j = -3; j < 5; ++j) {
                IBlockState iBlockState = this.c.field_70170_p.func_180495_p(this.c.func_180425_c().func_177982_a(i, 0, j));
                if (!(iBlockState.func_177230_c() instanceof BlockDoor) || iBlockState.func_185904_a() != Material.field_151575_d) continue;
                bl = false;
                break;
            }
            if (!bl) break;
        }
        if (bl) {
            return false;
        }
        PathNavigateGround pathNavigateGround = (PathNavigateGround)this.c.func_70661_as();
        Path path = pathNavigateGround.func_75505_d();
        if (path != null && !path.func_75879_b() && pathNavigateGround.func_179686_g()) {
            for (int i = 0; i < Math.min(path.func_75873_e() + 2, path.func_75874_d()); ++i) {
                PathPoint pathPoint = path.func_75877_a(i);
                this.b = new BlockPos(pathPoint.field_75839_a, pathPoint.field_75837_b + 1, pathPoint.field_75838_c);
                if (!(this.c.func_70092_e((double)this.b.func_177958_n(), this.c.field_70163_u, (double)this.b.func_177952_p()) <= 2.25)) continue;
                this.d = this.a(this.b);
                if (this.d == null) continue;
                return true;
            }
            this.b = new BlockPos((Entity)this.c).func_177984_a();
            this.d = this.a(this.b);
            return this.d != null;
        }
        return false;
    }

    public boolean func_75253_b() {
        return this.g >= 0;
    }

    public void func_75249_e() {
        this.e = false;
        this.f = (float)((double)((float)this.b.func_177958_n() + 0.5f) - this.c.field_70165_t);
        this.a = (float)((double)((float)this.b.func_177952_p() + 0.5f) - this.c.field_70161_v);
        this.d.func_176512_a(this.c.field_70170_p, this.b, true);
    }

    public void func_75246_d() {
        block0: {
            float f;
            float f2 = (float)((double)((float)this.b.func_177958_n() + 0.5f) - this.c.field_70165_t);
            float f3 = this.f * f2 + this.a * (f = (float)((double)((float)this.b.func_177952_p() + 0.5f) - this.c.field_70161_v));
            if (!(f3 < 0.0f) || --this.g > 0) break block0;
            this.d.func_176512_a(this.c.field_70170_p, this.b, false);
            this.e = true;
        }
    }

    public void func_75251_c() {
        this.g = 10;
    }

    private BlockDoor a(BlockPos blockPos) {
        IBlockState iBlockState = this.c.field_70170_p.func_180495_p(blockPos);
        Block block = iBlockState.func_177230_c();
        return block instanceof BlockDoor && iBlockState.func_185904_a() == Material.field_151575_d ? (BlockDoor)block : null;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}
