package com.stonurd.csnc.server.block.fluid.subclass;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.function.Supplier;

//import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;//living.addEffect(new MobEffectInstance(ACEffectRegistry.SUGAR_RUSH.get(), 100, 0));

public class AbsorsLiquidBlock extends LiquidBlock {

    public AbsorsLiquidBlock(Supplier<? extends FlowingFluid> fluid, BlockBehaviour.Properties properties) {
        super(fluid, properties);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide && entity instanceof LivingEntity living) {
            if (!living.hasEffect(MobEffects.DAMAGE_RESISTANCE)) {
                living.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0));
            }
        }
        super.entityInside(state, level, pos, entity);
    }
}