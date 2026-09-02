//package com.simibubi.create.content.fluids.pipes;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.LEVEL_HONEY;

import org.spongepowered.asm.mixin.Mixin;

import com.simibubi.create.AllFluids;
import com.simibubi.create.content.kinetics.RotationPropagator;
import com.stonurd.csnc.server.block.fluid.CSNCFluidRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.fluids.FluidStack;


/*
  @Inject(method = "use(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;
  Lnet/minecraft/util/math/BlockPos;
  Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;
  Lnet/minecraft/util/math/BlockRayTraceResult;)Lnet/minecraft/util/ActionResultType;",
at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BeehiveBlock;
dropHoneycomb(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V"))

ModifyVariable - (very safe) changes the result or value of a stored variable. Multiple modifyvariables can stack on the same variable which makes it safe too.
Overwrite - (Extremely Dangerous) completely overwrite the method and runs only your code. Overwrites can and will break a lot of mods and other mixins, including other overwrites or injects into the middle of the method. 
Overwrites are good for testing purposes to help know what needs to be changed but try to never use them in production.

@At(value = "INVOKE_ASSIGN", target = "<method>"),

target:
Lcom/simibubi/create/content/fluids/pipes/VanillaFluidTargets.java

AllFluids.HONEY.get()

CSNCFluidRegistry.HONEY_FLUID_SOURCE1.get()
*/

//@Mixin(VanillaFluidTargets.class)
public class VanillaFluidTargetsMixin {

/*
@Inject(@At(value = "INVOKE_ASSIGN", target = "<method>")),






*/
	public static boolean canProvideFluidWithoutCapability(BlockState state) {
		if (state.hasProperty(BlockStateProperties.LEVEL_HONEY))
			return true;
		if (state.is(Blocks.CAULDRON))
			return true;
		if (state.is(Blocks.LAVA_CAULDRON))
			return true;
		if (state.is(Blocks.WATER_CAULDRON))
			return true;
		return false;
	}

	public static FluidStack drainBlock(Level level, BlockPos pos, BlockState state, boolean simulate) {
		if (state.hasProperty(BlockStateProperties.LEVEL_HONEY) && state.getValue(LEVEL_HONEY) >= 5) {
			if (!simulate)
				level.setBlock(pos, state.setValue(LEVEL_HONEY, 0), 3);
			return new FluidStack(CSNCFluidRegistry.HONEY_FLUID_SOURCE1.get()
				.getSource(), 500);
		}

		if (state.is(Blocks.LAVA_CAULDRON)) {
			if (!simulate)
				level.setBlock(pos, Blocks.CAULDRON.defaultBlockState(), 3);
			return new FluidStack(Fluids.LAVA, 1000);
		}
		
		if (state.is(Blocks.WATER_CAULDRON) && state.getBlock() instanceof LayeredCauldronBlock lcb) {
			if (!lcb.isFull(state))
				return FluidStack.EMPTY;
			if (!simulate)
				level.setBlock(pos, Blocks.CAULDRON.defaultBlockState(), 3);
			return new FluidStack(Fluids.WATER, 1000);
		}

		return FluidStack.EMPTY;
	}

}
/*
package com.simibubi.create.content.fluids.pipes;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.LEVEL_HONEY;

import com.simibubi.create.AllFluids;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.fluids.FluidStack;

public class VanillaFluidTargets {

	public static boolean canProvideFluidWithoutCapability(BlockState state) {
		if (state.hasProperty(BlockStateProperties.LEVEL_HONEY))
			return true;
		if (state.is(Blocks.CAULDRON))
			return true;
		if (state.is(Blocks.LAVA_CAULDRON))
			return true;
		if (state.is(Blocks.WATER_CAULDRON))
			return true;
		return false;
	}

	public static FluidStack drainBlock(Level level, BlockPos pos, BlockState state, boolean simulate) {
		if (state.hasProperty(BlockStateProperties.LEVEL_HONEY) && state.getValue(LEVEL_HONEY) >= 5) {
			if (!simulate)
				level.setBlock(pos, state.setValue(LEVEL_HONEY, 0), 3);
			return new FluidStack(AllFluids.HONEY.get()
				.getSource(), 250);
		}
		
		if (state.is(Blocks.LAVA_CAULDRON)) {
			if (!simulate)
				level.setBlock(pos, Blocks.CAULDRON.defaultBlockState(), 3);
			return new FluidStack(Fluids.LAVA, 1000);
		}
		
		if (state.is(Blocks.WATER_CAULDRON) && state.getBlock() instanceof LayeredCauldronBlock lcb) {
			if (!lcb.isFull(state))
				return FluidStack.EMPTY;
			if (!simulate)
				level.setBlock(pos, Blocks.CAULDRON.defaultBlockState(), 3);
			return new FluidStack(Fluids.WATER, 1000);
		}

		return FluidStack.EMPTY;
	}

}
*/