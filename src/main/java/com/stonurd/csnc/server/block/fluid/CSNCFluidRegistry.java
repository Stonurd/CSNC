package com.stonurd.csnc.server.block.fluid;

import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.block.CSNCBlockRegistry;
import com.stonurd.csnc.server.item.CSNCItemRegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidInteractionRegistry;
import net.minecraftforge.fluids.FluidInteractionRegistry.InteractionInformation;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class CSNCFluidRegistry {

public static final DeferredRegister<FluidType> FLUID_TYPE_REG = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CSNCMain.MODID);
public static final DeferredRegister<Fluid> FLUID_REG = DeferredRegister.create(ForgeRegistries.FLUIDS, CSNCMain.MODID);


//honey
private static ForgeFlowingFluid.Properties honeyProperties() {
        return new ForgeFlowingFluid.Properties(HONEY_FLUID_TYPE1, HONEY_FLUID_SOURCE1, HONEY_FLUID_FLOWING1).bucket(CSNCItemRegistry.HONEY_BUCKET1).block(CSNCBlockRegistry.HONEY1);
    }
public static final RegistryObject<FluidType> HONEY_FLUID_TYPE1 = FLUID_TYPE_REG.register("honey", ()
        -> new HoneyType(FluidType.Properties.create().lightLevel(1).density(1024).viscosity(2048).temperature(300).pathType(BlockPathTypes.LAVA)
               .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)));
public static final RegistryObject<FlowingFluid> HONEY_FLUID_SOURCE1 = FLUID_REG.register("honey", () -> new ForgeFlowingFluid.Source(honeyProperties()));
public static final RegistryObject<FlowingFluid> HONEY_FLUID_FLOWING1 = FLUID_REG.register("honey_flowing", () -> new ForgeFlowingFluid.Flowing(honeyProperties()));
//another

        public static void postInit() {

//Alex's Caves LAVA
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

        //Vanilla
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
        }
}