package com.stonurd.csnc.server.block;

import java.util.ArrayList;
import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.LiquidBlock;

import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.tconstruct.fluids.block.MobEffectLiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Function;

public class PotionEffectLiquidBlock extends LiquidBlock {

  private final Supplier<MobEffectInstance> effect;
  public PotionEffectLiquidBlock(Supplier<? extends FlowingFluid> supplier, Properties properties, Supplier<MobEffectInstance> effect) {
    super(supplier, properties);
    this.effect = effect;
  }

  @Override
  public void entityInside(@SuppressWarnings("null") BlockState state, @SuppressWarnings("null") Level level, @SuppressWarnings("null") BlockPos pos, @SuppressWarnings("null") Entity entity) {
    if (entity.getFluidTypeHeight(getFluid().getFluidType()) > 0 && entity instanceof LivingEntity living) {
      MobEffectInstance effect = this.effect.get();
      effect.setCurativeItems(new ArrayList<>());
      living.addEffect(effect);
    }
  }

 public static Function<Supplier<? extends FlowingFluid>, LiquidBlock> createEffect(MapColor color, int lightLevel, Supplier<MobEffectInstance> effect) {
    return fluid -> new MobEffectLiquidBlock(fluid, FluidDeferredRegister.createProperties(color, lightLevel), effect);
  }
}