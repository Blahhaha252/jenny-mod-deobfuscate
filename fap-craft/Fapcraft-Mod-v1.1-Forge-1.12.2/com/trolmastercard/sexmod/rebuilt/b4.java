/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.Rotation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenerator
 *  net.minecraft.world.gen.structure.template.Template
 *  net.minecraft.world.gen.structure.template.TemplateManager
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.d7;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class b4
extends WorldGenerator
implements d7 {
    public String c;

    public b4(String string) {
        this.c = string;
    }

    public void a(World world, BlockPos blockPos) {
        ResourceLocation resourceLocation;
        MinecraftServer minecraftServer = world.getMinecraftServer();
        TemplateManager templateManager = b.getStructureTemplateManager();
        Template template = templateManager.get(minecraftServer, resourceLocation = new ResourceLocation("sexmod", this.c));
        if (template != null) {
            IBlockState iBlockState = world.getBlockState(blockPos);
            world.notifyBlockUpdate(blockPos, iBlockState, iBlockState, 3);
            template.addBlocksToWorld(world, blockPos, a);
        }
    }

    public void a(World world, BlockPos blockPos, Rotation rotation) {
        ResourceLocation resourceLocation;
        MinecraftServer minecraftServer = world.getMinecraftServer();
        TemplateManager templateManager = b.getStructureTemplateManager();
        Template template = templateManager.get(minecraftServer, resourceLocation = new ResourceLocation("sexmod", this.c));
        if (template != null) {
            IBlockState iBlockState = world.getBlockState(blockPos);
            world.notifyBlockUpdate(blockPos, iBlockState, iBlockState, 2);
            template.addBlocksToWorld(world, blockPos, a.setRotation(rotation));
        }
    }

    public boolean generate(World world, Random random, BlockPos blockPos) {
        this.a(world, blockPos);
        return true;
    }
}
