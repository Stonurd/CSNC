package com.stonurd.csnc.server.block.fluid;

import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.github.alexmodguy.alexscaves.server.block.fluid.ACFluidRegistry;

import com.stonurd.csnc.server.block.CSNCBlockRegistry;

import net.minecraft.world.level.block.Blocks;

import net.minecraftforge.common.ForgeMod;

import net.minecraftforge.fluids.FluidInteractionRegistry;
import net.minecraftforge.fluids.FluidInteractionRegistry.InteractionInformation;

import slimeknights.tconstruct.fluids.TinkerFluids;

public class CSNCFluidInteraction {

    public static void postInit() {

//NETHERRACK
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(Blocks.NETHERITE_BLOCK) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        Blocks.NETHERRACK.defaultBlockState()));
//Alex's Caves
        //basaltLike interaction zone
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.BLOCK_OF_SCARLET_NEODYMIUM.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.GALENA.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.BLOCK_OF_AZURE_NEODYMIUM.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.GALENA.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.DRAIN.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.ABYSSMARINE.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.AMBER.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.LIMESTONE.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.PRIMAL_MAGMA.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.FLOOD_BASALT.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.STRIPPED_THORNWOOD_WOOD.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.COPROLITH.get().defaultBlockState()));
        //btw fluid interaction zone
                //CAKE_LAYER
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.CARAMEL_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ForgeMod.WATER_TYPE.get(),
                        fluidState -> ACBlockRegistry.CAKE_LAYER.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ForgeMod.WATER_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.CARAMEL_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.CAKE_LAYER.get().defaultBlockState()));

                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.BLACK_CHOCOLATE_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ForgeMod.WATER_TYPE.get(),
                        fluidState -> ACBlockRegistry.BLOCK_OF_CHOCOLATE.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ForgeMod.WATER_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.BLACK_CHOCOLATE_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.BLOCK_OF_CHOCOLATE.get().defaultBlockState()));
//honey original interraction from create
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.HONEY_FLUID_TYPE1.get(),
                        fluidState -> fluidState.isSource() ? Blocks.OBSIDIAN.defaultBlockState() : CSNCBlockRegistry.LIMESTONE1.get().defaultBlockState()));
//ink original interraction from CEI
 FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.INK_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ForgeMod.LAVA_TYPE.get(),
                        fluidState -> Blocks.BLACKSTONE.defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.INK_FLUID_TYPE1.get(),
                        fluidState -> Blocks.BLACKSTONE.defaultBlockState()));
//ROCK_CANDY zone
        //YELLOW_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.HONEY_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.YELLOW_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.HONEY_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.YELLOW_ROCK_CANDY.get().defaultBlockState()));
        //BLACK_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.INK_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.BLACK_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.INK_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.BLACK_ROCK_CANDY.get().defaultBlockState()));
        //ORANGE_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.CARAMEL_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.ORANGE_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.CARAMEL_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.ORANGE_ROCK_CANDY.get().defaultBlockState()));
        //PINK_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.RUBY_CHOCOLATE_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.PINK_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.RUBY_CHOCOLATE_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.PINK_ROCK_CANDY.get().defaultBlockState()));
        //WHITE_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.CURDLED_MILK_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.WHITE_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.CURDLED_MILK_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.WHITE_ROCK_CANDY.get().defaultBlockState()));
        //LIGHT_GRAY_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.MAYONNAISE_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.LIGHT_GRAY_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.MAYONNAISE_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.LIGHT_GRAY_ROCK_CANDY.get().defaultBlockState()));
        //RED_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.KETCHUP_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.RED_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.KETCHUP_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.RED_ROCK_CANDY.get().defaultBlockState()));
        //GRAY_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.FRYING_OIL_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.GRAY_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.FRYING_OIL_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.GRAY_ROCK_CANDY.get().defaultBlockState()));
        //LIME_ROCK_CANDY
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.SLIME_FLUID_TYPE1.get(),
                        fluidState -> ACBlockRegistry.LIME_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.SLIME_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.LIME_ROCK_CANDY.get().defaultBlockState()));
        //LIGHT_BLUE_ROCK_CANDY TinkerFluids.skySlime.getType()
                FluidInteractionRegistry.addInteraction(TinkerFluids.skySlime.getType(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.LIGHT_BLUE_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                TinkerFluids.skySlime.getType(),
                        fluidState -> ACBlockRegistry.LIGHT_BLUE_ROCK_CANDY.get().defaultBlockState()));
        //PURPLE_ROCK_CANDY TinkerFluids.enderSlime.getType()
                FluidInteractionRegistry.addInteraction(TinkerFluids.enderSlime.getType(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.PURPLE_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                TinkerFluids.enderSlime.getType(),
                        fluidState -> ACBlockRegistry.PURPLE_ROCK_CANDY.get().defaultBlockState()));
        //CYAN_ROCK_CANDY TinkerFluids.earthSlime.getType()
                FluidInteractionRegistry.addInteraction(TinkerFluids.earthSlime.getType(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                        fluidState -> ACBlockRegistry.CYAN_ROCK_CANDY.get().defaultBlockState()));
                FluidInteractionRegistry.addInteraction(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                TinkerFluids.earthSlime.getType(),
                        fluidState -> ACBlockRegistry.CYAN_ROCK_CANDY.get().defaultBlockState()));
        }
}
/* 
 FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.HONEY_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                fluidState -> fluidState.isSource() ? Blocks.OBSIDIAN.defaultBlockState() : ACBlockRegistry.YELLOW_ROCK_CANDY.get().defaultBlockState()));

*/
/*
 FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.HONEY_FLUID_TYPE1.get(), new InteractionInformation(
                (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(TinkerWorld.slimeDirt.get(DirtType.EARTH)) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                Blocks.HONEY_BLOCK.defaultBlockState()));
 */
/*
FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.BLOCK_OF_SCARLET_NEODYMIUM.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.GALENA.get().defaultBlockState()));
 */
/*                FluidInteractionRegistry.addInteraction(TinkerFluids.skySlime.getType(), new FluidInteractionRegistry.InteractionInformation(
                CSNCFluidRegistry.RUBY_CHOCOLATE_FLUID_TYPE1.get(),
                fluidState -> ACBlockRegistry.CYAN_ROCK_CANDY.get().defaultBlockState()
        ));*/

