package com.stonurd.csnc.server.block;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.material.FlowingFluid;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class HoneyFluidBlock extends LiquidBlock {

public HoneyFluidBlock(RegistryObject<FlowingFluid> flowingFluid, BlockBehaviour.Properties properties) {
        super(flowingFluid, properties);
    }
}