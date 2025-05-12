package com.stonurd.csnc.server.block;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.registries.RegistryObject;

public class HoneyFluidBlock extends LiquidBlock {

public HoneyFluidBlock(RegistryObject<FlowingFluid> flowingFluid, BlockBehaviour.Properties properties) {
        super(flowingFluid, properties);
    }    
}