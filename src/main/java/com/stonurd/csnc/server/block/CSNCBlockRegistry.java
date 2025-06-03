package com.stonurd.csnc.server.block;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.block.fluid.CSNCFluidRegistry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;



public class CSNCBlockRegistry {
public static final DeferredRegister<Block> BLOCK_REG = DeferredRegister.create(ForgeRegistries.BLOCKS, CSNCMain.MODID);

public static final RegistryObject<LiquidBlock> HONEY1 = BLOCK_REG.register("honey", ()
    -> new LiquidBlock(CSNCFluidRegistry.HONEY_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> CARAMEL1 = BLOCK_REG.register("caramel", ()
    -> new LiquidBlock(CSNCFluidRegistry.CARAMEL_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> INK1 = BLOCK_REG.register("ink", ()
    -> new LiquidBlock(CSNCFluidRegistry.INK_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
        .noCollission().strength(25.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));






}