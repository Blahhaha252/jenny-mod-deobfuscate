package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import com.trolmastercard.sexmod.EyeAndKoboldColor;
import com.trolmastercard.sexmod.Main;
import com.trolmastercard.sexmod.aa;
import com.trolmastercard.sexmod.bs;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.ff;
import com.trolmastercard.sexmod.fm;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.h6;
import com.trolmastercard.sexmod.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ax {
    static final int d = 4;
    private static final HashMap<UUID, a$a> c = new HashMap();
    static final Vec3d[] b = new Vec3d[]{new Vec3d(0.0, 0.0, 0.0), new Vec3d(0.5, 0.0, 0.0), new Vec3d(-0.5, 0.0, 0.0), new Vec3d(0.0, 0.0, 0.5), new Vec3d(0.0, 0.0, -0.5)};
    static HashMap<ff, BlockPos[]> a = new HashMap();

    public static void a() {
        c.clear();
        a.clear();
    }

    public static void a(World world, Vec3d vec3d) {
        UUID uUID = UUID.randomUUID();
        float[] fArray = new float[4];
        fArray[0] = 0.25f;
        for (int i = 1; i < fArray.length; ++i) {
            fArray[i] = (float)(Math.random() * fArray[0]);
            // was fArray[i] = ff.j();
        }
        ArrayList<ff> arrayList = new ArrayList<ff>();
        for (float f : fArray) {
            ff ff2 = ff.a(world, uUID, f);
            arrayList.add(ff2);
        }
        EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.values()[r.f.nextInt(EyeAndKoboldColor.values().length)];
        a$a a$a2 = new a$a(uUID, eyeAndKoboldColor, (ff)arrayList.get(0), arrayList);
        c.put(uUID, a$a2);
        int n2 = 0;
        for (ff ff2 : arrayList) {
            ff2.setPosition(vec3d.x + ax.b[n2].x, vec3d.y, vec3d.z + ax.b[n2].z);
            world.spawnEntity((Entity)ff2);
            ++n2;
        }
    }

    public static boolean o(UUID uUID) {
        return c.get(uUID) != null;
    }

    public static void a(UUID uUID, UUID uUID2) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            return;
        }
        a$a2.a(uUID2);
    }

    public static void a(UUID uUID, EyeAndKoboldColor eyeAndKoboldColor) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 != null) {
            System.out.println("tribe of UUID " + uUID.toString() + " does already exist lol");
            return;
        }
        c.put(uUID, new a$a(uUID, eyeAndKoboldColor));
    }

    public static boolean a(BlockPos blockPos) {
        for (Map.Entry<ff, BlockPos[]> entry : a.entrySet()) {
            BlockPos[] blockPosArray = entry.getValue();
            if (blockPosArray[0].equals((Object)blockPos)) {
                return true;
            }
            if (!blockPosArray[1].equals((Object)blockPos)) continue;
            return true;
        }
        return false;
    }

    public static BlockPos[] a(ff ff2) {
        return a.get(ff2);
    }

    public static void a(ff ff2, BlockPos blockPos) {
        World world = ff2.world;
        BlockPos blockPos2 = null;
        if (world.getBlockState(blockPos.north()).getBlock() instanceof BlockBed) {
            blockPos2 = blockPos.north();
        }
        if (world.getBlockState(blockPos.east()).getBlock() instanceof BlockBed) {
            blockPos2 = blockPos.east();
        }
        if (world.getBlockState(blockPos.south()).getBlock() instanceof BlockBed) {
            blockPos2 = blockPos.south();
        }
        if (world.getBlockState(blockPos.west()).getBlock() instanceof BlockBed) {
            blockPos2 = blockPos.west();
        }
        if (blockPos2 == null) {
            System.out.println("bed @" + blockPos.toString() + " apparently doesn't have another half.. wtf");
            return;
        }
        a.put(ff2, new BlockPos[]{blockPos, blockPos2});
    }

    public static void b(ff ff2) {
        a.remove(ff2);
    }

    public static void d(UUID uUID, ff ff2) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.g = ff2;
    }

    public static void c(UUID uUID, ff ff2) {
        block1: {
            a$a a$a2 = c.get(uUID);
            if (a$a2 == null) {
                System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
                return;
            }
            a$a2.a(ff2);
            c.replace(uUID, a$a2);
            ff2.getDataManager().set(ff.aL, (Object)Optional.of((Object)uUID));
            if (ff2.aA) break block1;
            ff2.getDataManager().set(ff.N, (Object)a$a2.h.toString());
        }
    }

    public static void k(UUID uUID) {
        block1: {
            a$a a$a2 = c.get(uUID);
            if (a$a2 == null) {
                System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
                return;
            }
            ff ff2 = a$a2.g;
            if (ff2 != null && !ff2.isDead) break block1;
            a$a2.g = a$a2.b();
        }
    }

    public static void a(UUID uUID, ff ff2) {
        Object object;
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.b(ff2);
        a$a2.b(ff2.f());
        if (a$a2.g != null && a$a2.g.getEntityId() == ff2.getEntityId() && (object = a$a2.b()) != null) {
            a$a2.g = object;
        }
        for (bs object2 : a$a2.f) {
            object2.c(ff2);
        }
        if (!a$a2.a.isEmpty()) {
            c.replace(uUID, a$a2);
            return;
        }
        if (!ff2.J()) {
            return;
        }
        object = ff2.z();
        if (object != null) {
            HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
            hashSet.addAll(a$a2.i);
            hashSet.addAll(a$a2.b);
            for (bs bs2 : a$a2.f) {
                hashSet.addAll(bs2.b);
            }
            ge.b.sendTo((IMessage)new h6(hashSet, false), (EntityPlayerMP)object);
            object.sendMessage((ITextComponent)new TextComponentString(String.format("ur %stribe %shas been %seradicated %suwu", TextFormatting.RED, TextFormatting.WHITE, TextFormatting.RED, TextFormatting.WHITE)));
        }
    }

    @Nullable
    public static ff f(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        return a$a2.g;
    }

    public static boolean e(UUID uUID, ff ff2) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return false;
        }
        if (a$a2.g == null) {
            return false;
        }
        return a$a2.g.getEntityId() == ff2.getEntityId();
    }

    public static EyeAndKoboldColor l(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return ff.aJ;
        }
        return a$a2.h;
    }

    public static HashSet<BlockPos> j(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashSet<BlockPos>();
        }
        return a$a2.b;
    }

    public static void a(UUID uUID, BlockPos blockPos) {
        if (blockPos == null) {
            return;
        }
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.b.add(blockPos);
    }

    public static void e(UUID uUID, BlockPos blockPos) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.b.remove(blockPos);
    }

    public static HashSet<BlockPos> q(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        return a$a2.i;
    }

    public static void f(UUID uUID, BlockPos blockPos) {
        if (blockPos == null) {
            return;
        }
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.i.add(blockPos);
    }

    public static void d(UUID uUID, BlockPos blockPos) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.i.remove(blockPos);
    }

    public static HashSet<BlockPos> a(UUID uUID, bs bs2) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashSet<BlockPos>();
        }
        if (bs2 != null) {
            a$a2.b(bs2);
            return bs2.b;
        }
        return new HashSet<BlockPos>();
    }

    public static HashSet<BlockPos> c(UUID uUID, BlockPos blockPos) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashSet<BlockPos>();
        }
        bs bs2 = null;
        for (bs bs3 : a$a2.f) {
            if (!bs3.b.contains(blockPos)) continue;
            bs2 = bs3;
            break;
        }
        return ax.a(uUID, bs2);
    }

    public static void b(UUID uUID, bs bs2) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.a(bs2);
    }

    public static void b(UUID uUID, ff ff2) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        bs bs2 = null;
        for (bs bs3 : a$a2.f) {
            if (!bs3.b(ff2)) continue;
            bs2 = bs3;
        }
        if (bs2 == null) {
            System.out.println("task of worker " + ff2.f() + " not found uwu");
            return;
        }
        a$a2.b(bs2);
    }

    @Nullable
    public static Collection<bs> p(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        return a$a2.f;
    }

    public static fm i(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return fm.REST;
        }
        return a$a2.e();
    }

    public static void a(UUID uUID, fm fm2) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.a(fm2);
    }

    public static int h(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return 0;
        }
        return a$a2.f();
    }

    public static List<ff> n(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new ArrayList<ff>();
        }
        return a$a2.a;
    }

    public static void b(UUID uUID, BlockPos blockPos) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.a(blockPos);
    }

    @Nullable
    public static BlockPos m(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        return a$a2.g();
    }

    public static HashSet<EntityLivingBase> e(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashSet<EntityLivingBase>();
        }
        return a$a2.c();
    }

    public static void a(UUID uUID, EntityLivingBase entityLivingBase) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.a(entityLivingBase);
    }

    public static void b(UUID uUID, EntityLivingBase entityLivingBase) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.b(entityLivingBase);
    }

    public static boolean g(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return false;
        }
        for (ff ff2 : a$a2.a) {
            if (ff2.ae() == null) continue;
            return true;
        }
        return false;
    }

    public static boolean c(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return false;
        }
        return a$a2.c;
    }

    public static void a(UUID uUID, boolean bl) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.c = bl;
    }

    @Nullable
    public static UUID a(UUID uUID) {
        if (uUID == null) {
            return null;
        }
        for (Map.Entry<UUID, a$a> entry : c.entrySet()) {
            a$a a$a2 = entry.getValue();
            if (a$a2.d().size() == 0 && a$a2.f() == 0 || !uUID.equals(entry.getValue().a())) continue;
            return entry.getKey();
        }
        return null;
    }

    @Nullable
    public static UUID b(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return null;
        }
        List<ff> list = a$a2.a;
        if (list.isEmpty()) {
            return null;
        }
        ff ff2 = list.get(0);
        if (!ff2.J()) {
            return null;
        }
        String string = (String)list.get(0).getDataManager().get(em.v);
        return UUID.fromString(string);
    }

    public static HashSet<BlockPos> d(UUID uUID) {
        a$a a$a2 = c.get(uUID);
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return hashSet;
        }
        for (bs bs2 : a$a2.f) {
            hashSet.addAll(bs2.b);
        }
        hashSet.addAll(a$a2.i);
        hashSet.addAll(a$a2.b);
        return hashSet;
    }

    public static HashMap<UUID, BlockPos> a(UUID uUID, World world) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return new HashMap<UUID, BlockPos>();
        }
        HashMap<UUID, BlockPos> hashMap = a$a2.k;
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        for (Map.Entry<UUID, BlockPos> entry : hashMap.entrySet()) {
            BlockPos blockPos = entry.getValue();
            UUID uUID2 = entry.getKey();
            if (!world.isAreaLoaded(blockPos, 5)) continue;
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos.subtract(new Vec3i(-3, -3, -3)), blockPos.add(3, 3, 3));
            List list = world.getEntitiesWithinAABB(ff.class, axisAlignedBB);
            boolean bl = false;
            for (ff ff2 : list) {
                if (!uUID2.equals(ff2.f())) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            arrayList.add(uUID2);
        }
        a$a2.k = hashMap;
        return hashMap;
    }

    public static void a(UUID uUID, UUID uUID2, BlockPos blockPos) {
        a$a a$a2 = c.get(uUID);
        if (a$a2 == null) {
            System.out.println("tribe of UUID " + uUID.toString() + " not found uwu");
            return;
        }
        a$a2.a(uUID2, blockPos);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static class b$b
    extends WorldSavedData {
        public b$b(String string) {
            super(string);
        }

        @SubscribeEvent
        public void a(WorldEvent.Save save) {
            World world = save.getWorld();
            world.getMapStorage().setData("tribes", (WorldSavedData)this);
            this.markDirty();
        }

        @SubscribeEvent
        public void a(WorldEvent.Load load) {
            World world = load.getWorld();
            world.getMapStorage().getOrLoadData(b$b.class, "tribes");
        }

        @SubscribeEvent
        public void a(PlayerSleepInBedEvent playerSleepInBedEvent) {
            block0: {
                if (!ax.a(playerSleepInBedEvent.getPos())) break block0;
                playerSleepInBedEvent.setResult(EntityPlayer.SleepResult.OTHER_PROBLEM);
            }
        }

        @SubscribeEvent
        public void a(BlockEvent.PlaceEvent placeEvent) {
            BlockPos blockPos = placeEvent.getPos();
            IBlockState iBlockState = placeEvent.getState();
            World world = placeEvent.getWorld();
            if (world.isRemote) {
                return;
            }
            if (!(iBlockState.getBlock() instanceof BlockChest)) {
                return;
            }
            BlockChest.Type type = ((BlockChest)world.getBlockState((BlockPos)blockPos).getBlock()).chestType;
            BlockPos blockPos2 = null;
            if (world.getBlockState(blockPos.north()).getBlock() instanceof BlockChest && type.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.north()).getBlock()).chestType)) {
                blockPos2 = blockPos.north();
            }
            if (world.getBlockState(blockPos.east()).getBlock() instanceof BlockChest && type.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.east()).getBlock()).chestType)) {
                blockPos2 = blockPos.east();
            }
            if (world.getBlockState(blockPos.south()).getBlock() instanceof BlockChest && type.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.south()).getBlock()).chestType)) {
                blockPos2 = blockPos.south();
            }
            if (world.getBlockState(blockPos.west()).getBlock() instanceof BlockChest && type.equals((Object)((BlockChest)world.getBlockState((BlockPos)blockPos.west()).getBlock()).chestType)) {
                blockPos2 = blockPos.west();
            }
            if (blockPos2 == null) {
                return;
            }
            for (Map.Entry entry : c.entrySet()) {
                EntityPlayerMP entityPlayerMP;
                a$a a$a2 = (a$a)entry.getValue();
                if (!a$a2.i.contains(blockPos2)) continue;
                a$a2.i.add(blockPos);
                UUID uUID = ax.b((UUID)entry.getKey());
                if (uUID == null || (entityPlayerMP = (EntityPlayerMP)world.getPlayerEntityByUUID(uUID)) == null) continue;
                ge.b.sendTo((IMessage)new h6(blockPos, true), entityPlayerMP);
            }
        }

        @SubscribeEvent
        public void a(EntityJoinWorldEvent entityJoinWorldEvent) {
            EntityZombie entityZombie;
            Entity entity = entityJoinWorldEvent.getEntity();
            if (entity instanceof EntityZombie) {
                entityZombie = (EntityZombie)entity;
                entityZombie.targetTasks.addTask(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, false));
            }
            if (entity instanceof AbstractSkeleton) {
                entityZombie = (AbstractSkeleton)entity;
                entityZombie.targetTasks.addTask(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, false));
            }
            if (entity instanceof EntitySpider) {
                entityZombie = (EntitySpider)entity;
                entityZombie.targetTasks.addTask(3, (EntityAIBase)new aa((EntityCreature)entityZombie, true, true));
            }
        }

        @SubscribeEvent
        public void a(BlockEvent.BreakEvent breakEvent) {
            Object object;
            Object object2;
            a$a a$a2;
            BlockPos blockPos = breakEvent.getPos();
            World world = breakEvent.getWorld();
            if (world.isRemote) {
                return;
            }
            IBlockState iBlockState = world.getBlockState(blockPos);
            Block block = iBlockState.getBlock();
            if (block instanceof BlockChest) {
                for (Map.Entry entry : c.entrySet()) {
                    a$a2 = (a$a)entry.getValue();
                    if (!a$a2.i.contains(blockPos)) continue;
                    a$a2.i.remove(blockPos);
                    object2 = ax.b((UUID)entry.getKey());
                    if (object2 == null || (object = (EntityPlayerMP)world.getPlayerEntityByUUID((UUID)object2)) == null) continue;
                    ge.b.sendTo((IMessage)new h6(blockPos, false), object);
                }
            }
            if (block instanceof BlockBed) {
                for (Map.Entry entry : c.entrySet()) {
                    EntityPlayerMP entityPlayerMP;
                    a$a2 = (a$a)entry.getValue();
                    if (!a$a2.b.contains(blockPos)) continue;
                    object2 = cj.a(blockPos, iBlockState);
                    a$a2.b.remove(blockPos);
                    a$a2.b.remove(object2);
                    object = ax.b((UUID)entry.getKey());
                    if (object == null || (entityPlayerMP = (EntityPlayerMP)world.getPlayerEntityByUUID((UUID)object)) == null) continue;
                    HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
                    hashSet.add(blockPos);
                    hashSet.add((BlockPos)object2);
                    ge.b.sendTo((IMessage)new h6(hashSet, false), entityPlayerMP);
                }
            }
        }

        String a(String string, NBTTagCompound nBTTagCompound) {
            String string2 = nBTTagCompound.getString(string);
            nBTTagCompound.setString(string, "");
            return string2;
        }

        public void readFromNBT(NBTTagCompound nBTTagCompound) {
            String string;
            int n2 = 0;
            while (!"".equals(string = this.a("tribeId" + n2, nBTTagCompound))) {
                Object object;
                Object object2;
                Object object3;
                String string2;
                String string3;
                UUID uUID = UUID.fromString(string);
                EyeAndKoboldColor eyeAndKoboldColor = EyeAndKoboldColor.valueOf(this.a("tribeColor" + n2, nBTTagCompound));
                ax.a(uUID, eyeAndKoboldColor);
                String string4 = this.a("tribeMaster" + n2, nBTTagCompound);
                if (!"".equals(string4)) {
                    ax.a(uUID, UUID.fromString(string4));
                }
                int n3 = 0;
                while (!"".equals(string3 = this.a(uUID.toString() + "member" + n3 + "pos", nBTTagCompound)) && !"".equals(string2 = this.a(uUID.toString() + "member" + n3 + "id", nBTTagCompound))) {
                    object3 = string3.split("\\|");
                    object2 = new BlockPos(Integer.parseInt(object3[0]), Integer.parseInt(object3[1]), Integer.parseInt(object3[2]));
                    object = UUID.fromString(string2);
                    ax.a(uUID, (UUID)object, (BlockPos)object2);
                    ++n3;
                }
                int n4 = 0;
                while (!"".equals(string2 = this.a(uUID.toString() + "bed" + n4, nBTTagCompound))) {
                    object3 = string2.split("\\|");
                    object2 = new BlockPos(Integer.parseInt(object3[0]), Integer.parseInt(object3[1]), Integer.parseInt(object3[2]));
                    ax.a(uUID, (BlockPos)object2);
                    ++n4;
                }
                int n5 = 0;
                while (!"".equals(object3 = this.a(uUID.toString() + "chest" + n5, nBTTagCompound))) {
                    object2 = ((String)object3).split("\\|");
                    object = new BlockPos(Integer.parseInt(object2[0]), Integer.parseInt(object2[1]), Integer.parseInt(object2[2]));
                    ax.f(uUID, (BlockPos)object);
                    ++n5;
                }
                int n6 = 0;
                while (!"".equals(object2 = this.a(uUID.toString() + n6 + "taskKind", nBTTagCompound))) {
                    String string5;
                    object = this.a(uUID.toString() + n6 + "facing", nBTTagCompound);
                    EnumFacing enumFacing = EnumFacing.NORTH;
                    if (!"".equals(object)) {
                        enumFacing = EnumFacing.byName((String)object);
                    }
                    String string6 = this.a(uUID.toString() + n6 + "pos", nBTTagCompound);
                    String[] stringArray = string6.split("\\|");
                    BlockPos blockPos = new BlockPos(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]), Integer.parseInt(stringArray[2]));
                    HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
                    int n7 = 0;
                    while (!"".equals(string5 = this.a(uUID.toString() + n6 + "block" + n7, nBTTagCompound))) {
                        String[] stringArray2 = string5.split("\\|");
                        BlockPos blockPos2 = new BlockPos(Integer.parseInt(stringArray2[0]), Integer.parseInt(stringArray2[1]), Integer.parseInt(stringArray2[2]));
                        hashSet.add(blockPos2);
                        ++n7;
                    }
                    ax.b(uUID, new bs(blockPos, bs.a$a.valueOf((String)object2), hashSet, enumFacing));
                    ++n6;
                }
                ++n2;
            }
        }

        /*
         * WARNING - void declaration
         */
        public NBTTagCompound writeToNBT(NBTTagCompound nBTTagCompound) {
            int n2 = 0;
            for (Map.Entry entry : c.entrySet()) {
                Object object2;
                a$a a$a2 = (a$a)entry.getValue();
                UUID uUID = (UUID)entry.getKey();
                UUID uUID2 = a$a2.a();
                nBTTagCompound.setString("tribeId" + n2, uUID.toString());
                nBTTagCompound.setString("tribeColor" + n2, a$a2.h.toString());
                if (uUID2 != null) {
                    nBTTagCompound.setString("tribeMaster" + n2, uUID2.toString());
                }
                int n3 = 0;
                HashSet<Object> hashSet = new HashSet<Object>();
                for (ff iterator2 : a$a2.a) {
                    if (iterator2.isDead) continue;
                    object2 = iterator2.getPosition();
                    UUID uUID3 = iterator2.f();
                    nBTTagCompound.setString(uUID.toString() + "member" + n3 + "pos", object2.getX() + "|" + object2.getY() + "|" + object2.getZ());
                    nBTTagCompound.setString(uUID.toString() + "member" + n3 + "id", uUID3.toString());
                    hashSet.add(uUID3);
                    ++n3;
                }
                for (Map.Entry entry2 : a$a2.k.entrySet()) {
                    object2 = (UUID)entry2.getKey();
                    BlockPos blockPos = (BlockPos)entry2.getValue();
                    if (hashSet.contains(object2)) continue;
                    nBTTagCompound.setString(uUID.toString() + "member" + n3 + "pos", blockPos.getX() + "|" + blockPos.getY() + "|" + blockPos.getZ());
                    nBTTagCompound.setString(uUID.toString() + "member" + n3 + "id", ((UUID)object2).toString());
                    hashSet.add(object2);
                    ++n3;
                }
                int n4 = 0;
                for (Object object2 : a$a2.b) {
                    nBTTagCompound.setString(uUID.toString() + "bed" + n4, object2.getX() + "|" + object2.getY() + "|" + object2.getZ());
                    ++n4;
                }
                boolean bl = false;
                object2 = a$a2.i.iterator();
                while (object2.hasNext()) {
                    void n5;
                    BlockPos blockPos = (BlockPos)object2.next();
                    nBTTagCompound.setString(uUID.toString() + "chest" + (int)n5, blockPos.getX() + "|" + blockPos.getY() + "|" + blockPos.getZ());
                    ++n5;
                }
                int n5 = 0;
                for (bs bs2 : a$a2.f) {
                    nBTTagCompound.setString(uUID.toString() + n5 + "taskKind", bs2.c.toString());
                    nBTTagCompound.setString(uUID.toString() + n5 + "pos", bs2.a.getX() + "|" + bs2.a.getY() + "|" + bs2.a.getZ());
                    nBTTagCompound.setString(uUID.toString() + n5 + "facing", bs2.e.getName());
                    int n6 = 0;
                    for (BlockPos blockPos : bs2.b) {
                        nBTTagCompound.setString(uUID.toString() + n5 + "block" + n6, blockPos.getX() + "|" + blockPos.getY() + "|" + blockPos.getZ());
                        ++n6;
                    }
                    ++n5;
                }
                ++n2;
            }
            return nBTTagCompound;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }

    public static class a$a {
        UUID m;
        UUID e;
        ff g;
        List<ff> a;
        EyeAndKoboldColor h;
        fm d = fm.REST;
        BlockPos l = null;
        Collection<bs> f = new ArrayList<bs>();
        HashSet<EntityLivingBase> j = new HashSet();
        HashSet<BlockPos> i = new HashSet();
        HashSet<BlockPos> b = new HashSet();
        HashMap<UUID, BlockPos> k = new HashMap();
        boolean c = false;

        public a$a(UUID uUID, EyeAndKoboldColor eyeAndKoboldColor, ff ff2, List<ff> list) {
            this.m = uUID;
            this.h = eyeAndKoboldColor;
            this.g = ff2;
            this.a = list;
        }

        public a$a(UUID uUID, EyeAndKoboldColor eyeAndKoboldColor) {
            this.m = uUID;
            this.h = eyeAndKoboldColor;
            this.a = new ArrayList<ff>();
        }

        public void a(UUID uUID) {
            this.e = uUID;
        }

        public UUID a() {
            return this.e;
        }

        public void b(bs bs2) {
            if (!this.f.contains(bs2)) {
                return;
            }
            for (ff ff2 : bs2.f) {
                ff2.b(fp.NULL);
                ff2.setNoGravity(false);
                ff2.noClip = false;
                ff2.getDataManager().set(em.G, (Object)false);
            }
            this.f.remove(bs2);
            if (bs2.b.isEmpty() || this.e == null) {
                return;
            }
            EntityPlayerMP entityPlayerMP = FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayerByUUID(this.e);
            if (entityPlayerMP == null) {
                return;
            }
            ge.b.sendTo((IMessage)new h6(bs2.b, false), entityPlayerMP);
        }

        public HashMap<UUID, BlockPos> d() {
            return this.k;
        }

        public void a(UUID uUID, BlockPos blockPos) {
            this.k.put(uUID, blockPos);
        }

        public void b(UUID uUID) {
            this.k.remove(uUID);
        }

        public void b(EntityLivingBase entityLivingBase) {
            this.j.remove(entityLivingBase);
        }

        public void a(EntityLivingBase entityLivingBase) {
            this.j.add(entityLivingBase);
        }

        public HashSet<EntityLivingBase> c() {
            return this.j;
        }

        public int f() {
            HashSet<UUID> hashSet = new HashSet<UUID>();
            for (ff object : this.a) {
                hashSet.add(object.f());
            }
            for (Map.Entry entry : this.k.entrySet()) {
                hashSet.add((UUID)entry.getKey());
            }
            return hashSet.size();
        }

        public BlockPos g() {
            return this.l;
        }

        public void a(BlockPos blockPos) {
            this.l = blockPos;
        }

        public void a(bs bs2) {
            this.f.add(bs2);
        }

        public fm e() {
            return this.d;
        }

        public void a(fm fm2) {
            this.d = fm2;
        }

        public void a(ff ff2) {
            if (this.a.contains(ff2)) {
                return;
            }
            UUID uUID = ff2.f();
            ArrayList<ff> arrayList = new ArrayList<ff>();
            for (ff ff3 : this.a) {
                if (!ff3.f().equals(uUID)) continue;
                arrayList.add(ff3);
            }
            for (ff ff3 : arrayList) {
                Main.LOGGER.warn(String.format("Removed old entry of kobold called %s with UUID %s owned by %s", ff3.c(), ff3.f(), this.e));
                this.b(ff3);
            }
            this.a.add(ff2);
        }

        public void b(ff ff2) {
            this.a.remove(ff2);
        }

        ff b() {
            ff ff2 = null;
            for (ff ff3 : this.a) {
                if (ff3.isDead) continue;
                if (ff2 == null) {
                    ff2 = ff3;
                    continue;
                }
                float f = ((Float)ff2.getDataManager().get(ff.aE)).floatValue();
                float f2 = ((Float)ff3.getDataManager().get(ff.aE)).floatValue();
                if (!(f2 < f)) continue;
                ff2 = ff3;
            }
            return ff2;
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
}
