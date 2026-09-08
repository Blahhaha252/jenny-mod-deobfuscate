package com.trolmastercard.sexmod;
// file was named g3

import net.minecraft.util.Mirror;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

import com.trolmastercard.sexmod.ax;
import com.trolmastercard.sexmod.cj;
import com.trolmastercard.sexmod.e3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


//was public class g3
public class StructureGenerator
extends WorldSavedData
implements IWorldGenerator {
    // was String j = "sexmod:generation";
    static final String genTag = "sexmod:generation";
    // static final int h = 156;
    // static final int a = 62;
    // static final int b = 6;
    // final double f = 0.004f;
    // was boolean i = true;
    public static boolean shouldGenerate = true;
    // was final List<b.b> e = new ArrayList<b.b>();
    final List<StructConfig> structConfig = new ArrayList<StructConfig>();
    // was  final List<a$a> d = new ArrayList<a$a>();
    final List<StructRecord> nbtInfo = new ArrayList<StructRecord>();
    // was private static g3 g = null;
    private static StructureGenerator instance = null;
    // was static boolean c = true;
    static boolean genGuard = true;
    
    //was public static g3 b()
    public static StructureGenerator getInstance() {
        if (instance == null) {
            instance = new StructureGenerator();
        }
        return instance;
    }
    
    //was public g3(String string)
    public StructureGenerator(String string) {
        this();
    }
    // was private g3()
    private StructureGenerator() {
        super(genTag);
        g = this;
        
        this.structConfig.add( new StructConfig("ellie", new HashSet<Biome>(Arrays.asList(Biomes.REDWOOD_TAIGA, Biomes.COLD_TAIGA, Biomes.TAIGA, Biomes.ROOFED_FOREST)), new Vec3i(30, 27, 26), 9, true));
        this.structConfig.add( new StructConfig("jenny", new HashSet<Biome>(Arrays.asList(Biomes.PLAINS, Biomes.FOREST)), new Vec3i(9, 4, 9), 1, true));
        this.structConfig.add( new StructConfig("ellie", new HashSet<Biome>(Arrays.asList(Biomes.REDWOOD_TAIGA, Biomes.COLD_TAIGA, Biomes.TAIGA, Biomes.ROOFED_FOREST)), new Vec3i(30, 27, 26), 9, true));
        this.structConfig.add( new StructConfig("bia", new HashSet<Biome>(Arrays.asList(Biomes.MUTATED_BIRCH_FOREST, Biomes.BIRCH_FOREST)), new Vec3i(11, 9, 15), 2, true));
        this.structConfig.add( new StructConfig("luna", new HashSet<Biome>(Arrays.asList(Biomes.OCEAN, Biomes.DEEP_OCEAN)), new Vec3i(3, 7, 10), 0, false));
    }
    // was public void a()
    public void clearNBTInfo() {
        this.nbtInfo.clear();
    }

    @SubscribeEvent
    // was public void a(WorldEvent.Save save) {
    public void onWorldSave(WorldEvent.Save save) {
        World world = save.getWorld();
        world.getMapStorage().setData(genTag, (WorldSavedData)this);
        this.markDirty();
    }

    @SubscribeEvent
    // was public void a(WorldEvent.Load load) {
    public void onWorldLoad(WorldEvent.Load load) {
        World world = load.getWorld();
        world.getMapStorage().getOrLoadData(StructureGenerator.class, genTag);
    }

    public void readFromNBT(NBTTagCompound nBTTagCompound) {
        this.a();
        NBTTagCompound nBTTagCompound2 = nBTTagCompound.getCompoundTag(genTag);
        int n = 0;
        while (true) {
            String string = nBTTagCompound2.getString("sexmod:name" + n);
            String string2 = nBTTagCompound2.getString("sexmod:pos" + n);
            if ("".equals(string) || "".equals(string2)) break;
            int[] pos = parsePos(string2);
            this.nbtInfo.add(new StructRecord(pos[0], pos[1], string));
            ++n;
        }
    }

    public NBTTagCompound writeToNBT(NBTTagCompound nBTTagCompound) {
        nBTTagCompound.setTag(genTag, (NBTBase)new NBTTagCompound());
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        int n = 0;
        for (StructRecord StructRecord2 : this.nbtInfo) {
            nBTTagCompound2.setString("sexmod:name" + n, StructRecord2.name);
            nBTTagCompound2.setString("sexmod:pos" + n++, combinePos(StructRecord.x StructRecord.y));
        }
        nBTTagCompound.setTag(genTag, (NBTBase)nBTTagCompound2);
        return nBTTagCompound;
    }
    
    static String combinePos(int a, int b) {
        return a + "|" + b;
    }
    static int[] parsePos(String string) {
        String[] parts = string.split("\\|");
        return new int[] {
            Integer.parseInt(parts[0]),
            Integer.parseInt(parts[1])
        };
    }
    
    // forge calls this generate
    public void generate(Random random, int n, int n2, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        if (!shouldGenerate) {
            return;
        }
        if (world.getWorldType() == WorldType.FLAT) {
            return;
        }
        // working on this
        // was another method this.b(world, random, n, n2)
        if (random.nextDouble() <= (double)0.004f) {
            int n3 = n * 16 + 8;
            int n4 = n2 * 16 + 8;
            int n5 = cj.a(world, n3, n4);
            if (!(world.getBlockState(new BlockPos(n3, n5, n4)).getMaterial().isLiquid())) {
                ax.a(world, new Vec3d((double)n3, (double)n5, (double)n4));
        }
        
        this.trySpawnGoblinStructure(world, random, n, n2);
        
        // was another method this.a(random, n, n2, world);
        
        if (genGuard) {
            genGuard = false;
            for (StructConfig struct: this.structConfig) {
                this.a(struct, random, n, n2, world);
            }
            genGuard = true;
        }
    }

   /* void a(Random random, int n, int n2, World world) {
        if (!c) {
            return;
        }
        c = false;
        for (StructConfig struct : this.structConfig) {
            this.a(struct, random, n, n2, world);
        }
        c = true;
    } */
    
    void a(StructConfig struct, Random random, int n, int n2, World world) {
        for (StructRecord record : this.nbtInfo) {
            int minDistance = record.name.equals(struct.name) ? 156 : 62;
            float distance = (float)Math.sqrt(
                (n - record.x) * (n - record.x) +
                (n2 - record.y) * (n2 - record.y)
            );
            if ((distance < (float)minDistance)) return;
        }
        int tempX = struct.dimensions.getX();
        int tempZ = struct.dimensions.getZ();
        int startX = n * 16 + (16 - tempX) / 2;
        int startZ = n2 * 16 + (16 - tempZ) /2;
        BlockPos bp = new BlockPos(startX, 80, startZ);
        Biome currentBiome = world.provider.getBiomeForCoords(bp);
        
        if (!struct.spawnBiomes.contains(currentBiome)) {
            return;
        }
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int x;
        int z;
        for (x = startX; x < startX + tempX; x++) {
            for (z = startZ; z < startZ + tempZ; z++) {
                int y = cj.a(world, x, z);
                BlockPos bpWater = new BlockPos(x, y, z);
                if (struct.requiresLand && world.getBlockState(bpWater).getBlock() == Blocks.WATER) {
                    return;
                }
                if (y > maxY) {
                    maxY = y;
                }
                if (y >= minY) continue;
                minY = y;
            }
        }
        if (maxY - minY > struct.maxTerrainVariation) {
            return;
        }
        this.nbtInfo.add(new StructRecord(n, n2, struct.name));
        struct.generate(world, random, new BlockPos(startX, maxY, startZ));
        if (!struct.requiresLand) {
            return;
        }
        boolean flag = true;
        int ty = maxY - 1;
        while (flag) {
            flag = false;
            Vec3i vec3i = new Vec3i(tempX + 2, 0, tempZ + 2);
            --startZ;
            --startX;
            for (int i = startX; i < startX + vec3i.getX(); i++) {
                for (int j = startZ; j < startZ + vec3i.getZ(); j++) {
                    BlockPos bp2 = new BlockPos(i, ty, j);
                    IBlockState blockState = world.getBlockState(bp2);
                    if (!blockState.getBlock().isPassable((IBlockAccess)world, bp2)) continue;
                    blockState = world.canSeeSky(bp2) ? Blocks.GRASS.getDefaultState() : Blocks.DIRT.getDefaultState();
                    world.setBlockState(bp2, blockState);
                    flag = true;
                }
            }
            --ty;
        }
    }
    

    /*void b(World world, Random random, int n, int n2) {
        if (random.nextDouble() > (double)0.004f) {
            return;
        }
        int n3 = n * 16 + 8;
        int n4 = n2 * 16 + 8;
        int n5 = cj.a(world, n3, n4);
        if (world.getBlockState(new BlockPos(n3, n5, n4)).getMaterial().isLiquid()) {
            return;
        }
        ax.a(world, new Vec3d((double)n3, (double)n5, (double)n4));
    }*/

    //was void a(World world, Random random, int n, int n2) {
    void trySpawnGoblinStructure(World world, Random random, int n, int n2) {
        Vec3d vec3d;
        Material material;
        BlockPos blockPos;
        int n3 = 16 * n + 3;
        int n4 = 16 * n2 + 3;
        int n5 = random.nextInt(255);
        BlockPos blockPos2 = new BlockPos(n3, n5, n4);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        
        for (int i = 0; i <= e3.ah.getX(); ++i) {
            for (int j = -1; j <= e3.ah.getY(); ++j) {
                for (int k = 0; k <= e3.ah.getZ(); ++k) {
                    blockPos = blockPos2.add(i, j, k);
                    material = world.getBlockState(blockPos).getMaterial();
                    boolean bl = material.isSolid();
                    if (!(bl || j != -1 && j != e3.ah.getY())) {
                        return;
                    }
                    if (
                        i != 0 &&
                        i != e3.ah.getX() && 
                        k != 0 && 
                        k != e3.ah.getZ() || 
                        j != 0 || 
                        !world.isAirBlock(blockPos) || 
                        !world.isAirBlock(blockPos.up())
                    ) continue;
                    arrayList.add(blockPos);
                }
            }
        }
        if (arrayList.size() == 0 || arrayList.size() > 4) {
            return;
        }
        BlockPos blockPos3 = null;
        Rotation rotation = arrayList.iterator();
        while (rotation.hasNext()) {
            BlockPos blockPos4;
            blockPos = blockPos4 = (BlockPos)rotation.next();
            material = blockPos2.add(6, 0, 6);
            if (
                Math.abs(
                    (blockPos = blockPos.subtract((Vec3i)material)).getX()
                ) == Math.abs(blockPos.getZ()) || 
                Math.abs(blockPos.getX()) == Math.abs(blockPos.getZ()) - 1 || 
                Math.abs(blockPos.getX()) - 1 == Math.abs(blockPos.getZ())
            ) continue;
            blockPos3 = blockPos;
            break;
        }
        if (blockPos3 == null) {
            return;
        }
        blockPos = new Vec3i(0, 0, 0);
        float f = 0.0f;
        if (blockPos3.getZ() == -6) {
            rotation = Rotation.NONE;
            vec3d = e3.aB;
            f = 180.0f;
        } else if (blockPos3.getX() == 5) {
            rotation = Rotation.CLOCKWISE_90;
            vec3d = e3.ao;
            blockPos = new Vec3i(e3.ah.getX() - 1, 0, 0);
            f = -90.0f;
        } else if (blockPos3.getZ() == 5) {
            rotation = Rotation.CLOCKWISE_180;
            vec3d = e3.aM;
            blockPos = new Vec3i(e3.ah.getX() - 1, 0, e3.ah.getZ() - 1);
        } else {
            rotation = Rotation.COUNTERCLOCKWISE_90;
            vec3d = e3.U;
            blockPos = new Vec3i(0, 0, e3.ah.getZ() - 1);
            f = 90.0f;
        }
        // DONT FORGET ABOUT THIS DUMB ASS
        placeStructure("goblin", world, blockPos2.add(0, -1, 0).add((Vec3i)blockPos), rotation);
        vec3d.add((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ());
        vec3d = new Vec3d((double)blockPos2.getX() + vec3d.x + 0.5, (double)blockPos2.getY() + vec3d.y, (double)blockPos2.getZ() + vec3d.z + 0.5);
        e3 e32 = new e3(world, true, f, vec3d);
        e32.forceSpawn = true;
        world.spawnEntity((Entity)e32);
        world.getChunk(n, n2).markDirty();
    }
    static void placeStructure(String name, World world, BlockPos pos, Rotation rotation) {
        ResourceLocation resources = new ResourceLocation("sexmod", name);
        MinecraftManager mc = world.getMinecraftServer();
        TemplateManager templateManager= StructConfig.WS.getStructureTemplateManager();
        Template template = templateManager.get(mc, resources);
        if (template != null) {
            IBlockState blockState = world.getBlockState(pos);
            world.notifyBlockUpdate(pos, blockstate, blockstate, 2);
            template.addBlocksToWorld(world, pos, StructConfig.placeSettings.setRotation(rotation));
        }
    }
    
    // was static class g3$a$a
    static class StructRecord {
        int x;
        int y;
        String name;
        public StructRecord(int x, int y, String name) {
            this.x = x;
            this.y = y;
            this.name = name;
        }
        
    }
}
// was static class g3$b$b
static class StructConfig extends WorldGenerator{
    public static final WorldServer WS = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(0);
    public static final PlacementSettings placeSettings = new PlacementSettings().setChunk(null).setIgnoreEntities(false).setMirror(Mirror.NONE).setRotation(Rotation.NONE);
    public final String name;
    public final HashSet<Biome> spawnBiomes;
    public final Vec3i dimensions;
    public final boolean requiresLand;
    public final int maxTerrainVariation;
    
    public StructConfig(String name, HashSet<Biome> spawnBiomes, Vec3i dimensions, int n, boolean bool) {
        this.name = name;
        this.spawnBiomes = spawnBiomes;
        this.dimensions = dimensions;
        this.maxTerrainVariation = n;
        this.requiresLand = bool;
    }
    
    @Override
    public boolean generate(World world, Random random, BlockPos blockPos) {
        ResourceLocation resources = new ResourceLocation("sexmod", this.name);
        MinecraftManager mc = world.getMinecraftServer();
        TemplateManager templateManager = WS.getStructureTemplateManager();
        Template template = templateManager.get(mc, resources);
        if (template != null) {
            IBlockState blockState = world.getBlockState(pos);
            world.notifyBlockUpdate(pos, blockState, blockState, 2);
            template.addBlocksToWorld(world, blockPos, placeSettings);
        }
        return true;
    }
}