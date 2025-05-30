package com.stonurd.csnc.server.block;


import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class HoneyFluidBlock extends LiquidBlock {

private MobEffect effect;

public HoneyFluidBlock(RegistryObject<FlowingFluid> flowingFluid, BlockBehaviour.Properties properties, MobEffect effect) {
        super(flowingFluid, properties);
        this.effect = effect;
    }

public void entityInside(BlockState blockState, Level level, BlockPos pos, Entity entity) {
     if (entity instanceof LivingEntity living) {
     this.effect = (MobEffects.SATURATION);
//new MobEffects();
}
}
}

//        this.effect= (MobEffects.SATURATION);


/*
@Override
  public void entityInside(BlockState blockState, Level level, BlockPos pos, Entity entity) {
     if (entity instanceof LivingEntity living) {
      //effect = this.effect.get();
      //living.hasEffect(effect); NO
     }
    /* 
    if (entity.getFluidTypeHeight(getFluid().getFluidType()) > 0 && entity instanceof LivingEntity living) {
      MobEffect effect = MobEffects.SATURATION;
    }
*/


//.block(createEffect(MapColor.GRASS, 0,
// () -> new MobEffectInstance(TinkerEffects.bouncy.get(), 5*20))).commonTag("slime").flowing(SlimeFluid.Source::new, SlimeFluid.Flowing::new);
//MobEffects.POISON, 5*20

/*private final Supplier<MobEffectInstance> effect;
  public MobEffectLiquidBlock(Supplier<? extends FlowingFluid> supplier, Properties properties, Supplier<MobEffectInstance> effect) {
    super(supplier, properties);
    this.effect = effect;
  }

  @Override
  public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
    if (entity.getFluidTypeHeight(getFluid().getFluidType()) > 0 && entity instanceof LivingEntity living) {
      MobEffectInstance effect = this.effect.get();
      effect.setCurativeItems(new ArrayList<>());
      living.addEffect(effect);
    }
  }

  // Creates a new block supplier
  public static Function<Supplier<? extends FlowingFluid>, LiquidBlock> createEffect(MapColor color, int lightLevel, Supplier<MobEffectInstance> effect) {
    return fluid -> new MobEffectLiquidBlock(fluid, FluidDeferredRegister.createProperties(color, lightLevel), effect);
  }
*/

/* 
  public HoneyFluidBlock(RegistryObject<FlowingFluid> flowingFluid, BlockBehaviour.Properties properties) {
        super(flowingFluid, properties);
    }
*/
/*
    public HoneyFluidBlock(Supplier<? extends FlowingFluid> p_54694_, Properties p_54695_) {
        super(p_54694_, p_54695_);
      todo generated
    }
*/
/* 
private final Supplier<MobEffectInstance> effect;
  public HoneyFluidBlock(Supplier<? extends FlowingFluid> supplier, Properties properties, Supplier<MobEffectInstance> effect) {
    super(supplier, properties);
    this.effect = effect;
  }



  @Override
  public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
    if (entity.getFluidTypeHeight(getFluid().getFluidType()) > 0 && entity instanceof LivingEntity living) {
      MobEffectInstance effect = this.effect.get();
      effect.setCurativeItems(new ArrayList<>());
      living.addEffect(effect);
    }
  }*/