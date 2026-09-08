package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.be;
import com.trolmastercard.sexmod.c;
import com.trolmastercard.sexmod.cj;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class al
extends EntityLiving {
    public static final long b = 60000L;
    public static final float g = 3.0f;
    static final float c = 30.0f;
    static final int h = 175;
    static final int i = 10;
    BlockPos f = null;
    int d = 0;
    boolean e = false;
    public int a = -1;

    public al(World world) {
        super(world);
    }

    protected void updateAITasks() {
        super.updateAITasks();
        this.a();
    }

    void a() {
        if (this.e) {
            this.getNavigator().clearPath();
            return;
        }
        EntityPlayer entityPlayer = this.world.getClosestPlayerToEntity((Entity)this, 15.0);
        if (entityPlayer != null && entityPlayer.getDistance((Entity)this) < 3.0f) {
            this.getNavigator().clearPath();
            return;
        }
        if (this.f == null || this.getDistance(this.f.getX(), this.f.getY(), this.f.getZ()) > this.c() || this.d > 175) {
            int n = (this.getRNG().nextBoolean() ? 1 : -1) * this.getRNG().nextInt(10);
            int n2 = (this.getRNG().nextBoolean() ? 1 : -1) * this.getRNG().nextInt(10);
            int n3 = this.world.provider.getDimensionType() == DimensionType.NETHER ? (int)Math.ceil(this.posY) : cj.getTerrainY(this.world, this.getPosition().getX() + n, this.getPosition().getZ() + n2);
            this.f = new BlockPos(this.getPosition().getX() + n, n3, this.getPosition().getZ() + n2);
            this.d = 0;
        }
        if (Math.sqrt(this.f.distanceSq((Vec3i)this.getPosition())) > 2.0) {
            this.getNavigator().tryMoveToXYZ((double)this.f.getX(), (double)this.f.getY(), (double)this.f.getZ(), (double)0.35f);
            this.d();
        } else {
            ++this.d;
        }
    }

    protected void d() {
        Path path = this.getNavigator().getPath();
        if (path == null) {
            return;
        }
        if (this.onGround || this.isInWater()) {
            return;
        }
        int n = path.getCurrentPathIndex();
        int n2 = path.getCurrentPathLength();
        if (n2 == n || n2 - 1 == n) {
            return;
        }
        PathPoint pathPoint = path.getPathPointFromIndex(n);
        PathPoint pathPoint2 = path.getPathPointFromIndex(n + 1);
        Vec3d vec3d = new Vec3d((double)(pathPoint2.x - pathPoint.x), (double)(pathPoint2.y - pathPoint.y), (double)(pathPoint2.z - pathPoint.z));
        this.motionX = vec3d.x / 7.0;
        this.motionZ = vec3d.z / 7.0;
    }

    public boolean attackEntityFrom(DamageSource damageSource, float f) {
        if (damageSource == DamageSource.OUT_OF_WORLD) {
            this.world.removeEntity((Entity)this);
            return true;
        }
        if (!(damageSource.getTrueSource() instanceof EntityPlayer)) {
            return false;
        }
        if (this.world.isRemote) {
            this.b();
        }
        this.e = true;
        be.a(6250, () -> this.world.removeEntity((Entity)this));
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    void b() {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        this.a = entityPlayerSP.ticksExisted;
        entityPlayerSP.playSound(com.trolmastercard.sexmod.c.MISC_WEOWEO[3], 1.0f, 1.0f);
    }

    double c() {
        return Math.sqrt(1800.0);
    }

    public boolean getCanSpawnHere() {
        if (this.getRNG().nextInt(100) < 1 && this.getRNG().nextInt(100) < 10) {
            return true;
        }
        this.world.removeEntity((Entity)this);
        return false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
