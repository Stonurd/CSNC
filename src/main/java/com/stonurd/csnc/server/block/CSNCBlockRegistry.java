package com.stonurd.csnc.server.block;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.block.fluid.CSNCFluidRegistry;
import com.stonurd.csnc.server.block.fluid.subclass.AbsorsLiquidBlock;
import com.stonurd.csnc.server.block.fluid.subclass.HasteLiquidBlock;
import com.stonurd.csnc.server.block.fluid.subclass.IrradiateLiquidBlock;
import com.stonurd.csnc.server.block.fluid.subclass.RegenLiquidBlock;
import com.stonurd.csnc.server.block.fluid.subclass.SaturaLiquidBlock;
import com.stonurd.csnc.server.block.fluid.subclass.StrengLiquidBlock;

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

public static final RegistryObject<RegenLiquidBlock> HONEY1 = BLOCK_REG.register("honey", ()
    -> new RegenLiquidBlock(CSNCFluidRegistry.HONEY_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<AbsorsLiquidBlock> CARAMEL1 = BLOCK_REG.register("caramel", ()
    -> new AbsorsLiquidBlock(CSNCFluidRegistry.CARAMEL_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<LiquidBlock> INK1 = BLOCK_REG.register("ink", ()
    -> new LiquidBlock(CSNCFluidRegistry.INK_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
        .noCollission().strength(25.0F).lightLevel(state -> 0).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));

public static final RegistryObject<SaturaLiquidBlock> RUBY_CHOCOLATE1 = BLOCK_REG.register("ruby_chocolate", ()
    -> new SaturaLiquidBlock(CSNCFluidRegistry.RUBY_CHOCOLATE_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<StrengLiquidBlock> CURDLED_MILK1 = BLOCK_REG.register("curdled_milk", ()
    -> new StrengLiquidBlock(CSNCFluidRegistry.CURDLED_MILK_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<StrengLiquidBlock> MAYONNAISE1 = BLOCK_REG.register("mayonnaise", ()
    -> new StrengLiquidBlock(CSNCFluidRegistry.MAYONNAISE_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<HasteLiquidBlock> KETCHUP1 = BLOCK_REG.register("ketchup", ()
    -> new HasteLiquidBlock(CSNCFluidRegistry.KETCHUP_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
public static final RegistryObject<SaturaLiquidBlock> FRYING_OIL1 = BLOCK_REG.register("frying_oil", ()
    -> new SaturaLiquidBlock(CSNCFluidRegistry.FRYING_OIL_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE)
        .noCollission().strength(100.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));

public static final RegistryObject<LiquidBlock> SLIME1 = BLOCK_REG.register("slime", ()
    -> new LiquidBlock(CSNCFluidRegistry.SLIME_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN)
        .noCollission().strength(125.0F).lightLevel(state -> 1).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
        
public static final RegistryObject<SaturaLiquidBlock> BLACK_CHOCOLATE1 = BLOCK_REG.register("black_chocolate", ()
    -> new SaturaLiquidBlock(CSNCFluidRegistry.BLACK_CHOCOLATE_FLUID_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
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
@SuppressWarnings("removal")
public static final RegistryObject<Block> AUTUNITE1 =  RegistryObject.create(new ResourceLocation("createnuclear", "autunite"),ForgeRegistries.BLOCKS);

public static final RegistryObject<IrradiateLiquidBlock> URANIUM1 = BLOCK_REG.register("uranium", ()
    -> new IrradiateLiquidBlock(CSNCFluidRegistry.URANIUM_SOURCE1, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN)
        .noCollission().strength(100.0F).lightLevel(state -> 3).emissiveRendering((state, world, pos) -> false).noLootTable().replaceable().liquid().pushReaction(PushReaction.DESTROY)));
}