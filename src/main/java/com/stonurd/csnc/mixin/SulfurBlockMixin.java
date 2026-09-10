package com.stonurd.csnc.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.github.alexmodguy.alexscaves.server.block.ACSoundTypes;
import com.github.alexmodguy.alexscaves.server.block.SulfurBlock;
import com.github.alexmodguy.alexscaves.server.block.SulfurBudBlock;
import com.github.alexmodguy.alexscaves.server.block.fluid.ACFluidRegistry;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

@Mixin(value = SulfurBlock.class, remap = false)
public class SulfurBlockMixin extends Block {

    public SulfurBlockMixin() {
        super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2F, 4.0F).sound(ACSoundTypes.SULFUR).randomTicks());
    }
/**
 * @reason Speedup sulfur spawn @author 0
 */
@Overwrite
    public void randomTick(BlockState currentState, ServerLevel level, BlockPos blockPos, RandomSource randomSource) {
        if (randomSource.nextInt(1) == 0) {
            Direction direction = Util.getRandom(Direction.values(), randomSource);
            BlockPos offset = blockPos.relative(direction);
            if (level.getBlockState(offset).isAir() && isDrippingAcidAbove(level, offset)) {
                BlockState blockstate1 = ACBlockRegistry.SULFUR_BUD_SMALL.get().defaultBlockState().setValue(SulfurBudBlock.FACING, direction).setValue(SulfurBudBlock.LIQUID_LOGGED, SulfurBudBlock.getLiquidType(level.getFluidState(offset)));
                level.setBlockAndUpdate(offset, blockstate1);
            }
        }
    }

    private boolean isDrippingAcidAbove(Level level, BlockPos pos) {
        if (level.getFluidState(pos).getFluidType() == ACFluidRegistry.ACID_FLUID_TYPE.get()) {
            return true;
        }
        while (level.getBlockState(pos).isAir() && pos.getY() < level.getMaxBuildHeight()) {
            pos = pos.above();
        }
        BlockState acidState = level.getBlockState(pos);
        return acidState.is(ACBlockRegistry.ACIDIC_RADROCK.get());
    }
}