package com.stonurd.csnc.server.block.fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.fluids.ForgeFlowingFluid.Properties;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;



public class earth extends FluidType{

    public earth(Properties properties) {
        super(properties);
    }
    /* 
public static class Flowing extends earth {
		public Flowing(final Properties properties) {
			super(properties);
}
@Override
		public boolean isSource(final FluidState state) {
			return false;
		}


}

*/
}
