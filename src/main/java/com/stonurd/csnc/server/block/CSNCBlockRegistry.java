package com.stonurd.csnc.server.block;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.block.fluid.CSNCFluidRegistry;

import net.minecraft.resources.ResourceLocation;

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
        .noCollission().strength(25.0F).lightLevel(state -> 0).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> RUBY_CHOCOLATE1 = BLOCK_REG.register("ruby_chocolate", ()
    -> new LiquidBlock(CSNCFluidRegistry.RUBY_CHOCOLATE_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> CURDLED_MILK1 = BLOCK_REG.register("curdled_milk", ()
    -> new LiquidBlock(CSNCFluidRegistry.CURDLED_MILK_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> MAYONNAISE1 = BLOCK_REG.register("mayonnaise", ()
    -> new LiquidBlock(CSNCFluidRegistry.MAYONNAISE_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> KETCHUP1 = BLOCK_REG.register("ketchup", ()
    -> new LiquidBlock(CSNCFluidRegistry.KETCHUP_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> FRYING_OIL1 = BLOCK_REG.register("frying_oil", ()
    -> new LiquidBlock(CSNCFluidRegistry.FRYING_OIL_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> SLIME1 = BLOCK_REG.register("slime", ()
    -> new LiquidBlock(CSNCFluidRegistry.SLIME_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN)
        .noCollission().strength(125.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> BLACK_CHOCOLATE1 = BLOCK_REG.register("black_chocolate", ()
    -> new LiquidBlock(CSNCFluidRegistry.BLACK_CHOCOLATE_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));

public static final RegistryObject<LiquidBlock> RED_WINE_BUCKET1 = BLOCK_REG.register("red_wine", ()
    -> new LiquidBlock(CSNCFluidRegistry.RED_WINE_SOURCE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> WHITE_WINE_BUCKET1 = BLOCK_REG.register("white_wine", ()
    -> new LiquidBlock(CSNCFluidRegistry.WHITE_WINE_SOURCE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> APPLE_JUICE_BUCKET1 = BLOCK_REG.register("apple_juice", ()
    -> new LiquidBlock(CSNCFluidRegistry.APPLE_FUID_SOURCE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));

public static final RegistryObject<LiquidBlock> WINE_BUCKET1 = BLOCK_REG.register("wine", ()
    -> new LiquidBlock(CSNCFluidRegistry.WINE_SOURCE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));

public static final RegistryObject<LiquidBlock> VINEGAR_BUCKET1 = BLOCK_REG.register("vinegar", ()
    -> new LiquidBlock(CSNCFluidRegistry.VINEGAR_SOURCE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));

@SuppressWarnings("removal")
public static final RegistryObject<Block> LIMESTONE1 =  RegistryObject.create(new ResourceLocation("create", "limestone"),ForgeRegistries.BLOCKS);
}