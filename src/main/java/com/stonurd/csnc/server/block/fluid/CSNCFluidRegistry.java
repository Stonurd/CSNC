package com.stonurd.csnc.server.block.fluid;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.item.CSNCItemRegistry;
import com.stonurd.csnc.server.block.CSNCBlockRegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.pathfinder.BlockPathTypes;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;


public class CSNCFluidRegistry {
//registerZone
public static final DeferredRegister<FluidType> FLUID_TYPE_REG = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CSNCMain.MODID);
public static final DeferredRegister<Fluid> FLUID_REG = DeferredRegister.create(ForgeRegistries.FLUIDS, CSNCMain.MODID);
//Honey
private static ForgeFlowingFluid.Properties honeyProperties() {
        return new ForgeFlowingFluid.Properties(HONEY_FLUID_TYPE1, HONEY_FLUID_SOURCE1, HONEY_FLUID_FLOWING1).tickRate(30).slopeFindDistance(2).levelDecreasePerBlock(2)
                .bucket(CSNCItemRegistry.HONEY_BUCKET1).block(CSNCBlockRegistry.HONEY1); }
public static final RegistryObject<FluidType> HONEY_FLUID_TYPE1 = FLUID_TYPE_REG.register("honey", ()
        -> new HoneyType(FluidType.Properties.create().lightLevel(15).density(1024).viscosity(2048).temperature(300).pathType(BlockPathTypes.LAVA)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)));
public static final RegistryObject<FlowingFluid> HONEY_FLUID_SOURCE1 = FLUID_REG.register("honey", () -> new ForgeFlowingFluid.Source(honeyProperties()));
public static final RegistryObject<FlowingFluid> HONEY_FLUID_FLOWING1 = FLUID_REG.register("honey_flowing", () -> new ForgeFlowingFluid.Flowing(honeyProperties()));
//anotherFluid

}