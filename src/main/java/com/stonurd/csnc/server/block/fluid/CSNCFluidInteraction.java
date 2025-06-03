package com.stonurd.csnc.server.block.fluid;

import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.github.alexmodguy.alexscaves.server.block.fluid.ACFluidRegistry;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;

import net.minecraft.world.level.block.Blocks;

import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fluids.FluidInteractionRegistry;
import net.minecraftforge.fluids.FluidInteractionRegistry.InteractionInformation;
import slimeknights.tconstruct.fluids.TinkerFluids;

public class CSNCFluidInteraction {
    public static void postInit() {

    //Alex's Caves basaltLike interaction
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.BLOCK_OF_SCARLET_NEODYMIUM.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.GALENA.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.BLOCK_OF_AZURE_NEODYMIUM.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.GALENA.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.DRAIN.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.ABYSSMARINE.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.AMBER.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.LIMESTONE.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.PRIMAL_MAGMA.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.FLOOD_BASALT.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.STRIPPED_THORNWOOD_WOOD.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.COPROLITH.get().defaultBlockState()
        ));
    //FullVanilla basaltLike interaction
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(Blocks.NETHERITE_BLOCK) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        Blocks.NETHERRACK.defaultBlockState()
        ));
    //Alex's Caves extra
    //Rock candy
    //test
        FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.HONEY_FLUID_TYPE1.get(), new InteractionInformation(
                (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(Blocks.NETHERITE_BLOCK) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                Blocks.HONEY_BLOCK.defaultBlockState()
        ));
        FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.HONEY_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                fluidState -> fluidState.isSource() ? Blocks.OBSIDIAN.defaultBlockState() : ACBlockRegistry.YELLOW_ROCK_CANDY.get().defaultBlockState()
                ));
        FluidInteractionRegistry.addInteraction(CSNCFluidRegistry.HONEY_FLUID_TYPE1.get(), new FluidInteractionRegistry.InteractionInformation(
                ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get(),
                fluidState -> fluidState.isSource() ? Blocks.OBSIDIAN.defaultBlockState() : ACBlockRegistry.YELLOW_ROCK_CANDY.get().defaultBlockState()
                ));



}
}
//SlimeType
//TinkerFluids.
//earth_slime