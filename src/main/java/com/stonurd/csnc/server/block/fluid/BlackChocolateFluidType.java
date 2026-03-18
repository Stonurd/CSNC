package com.stonurd.csnc.server.block.fluid;

import net.minecraft.client.Camera;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.FogRenderer;

import net.minecraftforge.common.SoundActions;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.material.FluidState;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;

import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;

public class BlackChocolateFluidType extends FluidType {

  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_STILL = new ResourceLocation("csnc:block/black_chocolate_still");
  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("csnc:block/black_chocolate_flow");

  public BlackChocolateFluidType(Properties properties) {
    super(properties);
  }

  @Override
  public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
    consumer.accept(new IClientFluidTypeExtensions() {

      @Override
      public ResourceLocation getStillTexture() {
        return FLUID_STILL;
      }

      @Override
      public ResourceLocation getFlowingTexture() {
        return FLUID_FLOWING;
      }

      @Override
        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick,
          float nearDistance, float farDistance, FogShape shape) {
            RenderSystem.setShaderFogColor(75f/255f,40f/255f,20f/255f);//100,60,0 no 80,48,1
            RenderSystem.setShaderFogStart(-1024.0f);
            RenderSystem.setShaderFogEnd(0.1f);
      }
    });
  }

  @Override
    public boolean isVaporizedOnPlacement(Level level, BlockPos pos, FluidStack stack) {
        return level.dimensionType().ultraWarm();
    }
  @Override
    public void onVaporize(@Nullable Player player, Level level, BlockPos pos, FluidStack stack) {
        SoundEvent sound = this.getSound(player, level, pos, SoundActions.FLUID_VAPORIZE);
        level.playSound(player, pos, sound != null ? sound : SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 0.5F, 2.6F + (level.random.nextFloat() - level.random.nextFloat()) * 0.8F);
        level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
    }

      public boolean move(FluidState state, LivingEntity entity, Vec3 movementVector, double gravity) {
        double y = entity.getY();
        boolean falling = entity.getDeltaMovement().y <= 0.0D;

          entity.moveRelative(0.02F, movementVector);
          entity.move(MoverType.SELF, entity.getDeltaMovement());

            if (entity.horizontalCollision && entity.onClimbable()) {
              entity.setDeltaMovement(entity.getDeltaMovement().multiply(0.5D, 0.8D, 0.5D));
              Vec3 fallingMovement = entity.getFluidFallingAdjustedMovement(gravity, falling, entity.getDeltaMovement());
              entity.setDeltaMovement(fallingMovement);
              } else {
                entity.setDeltaMovement(entity.getDeltaMovement().scale(0.5D));
            }

            if (!entity.isNoGravity()) {
              entity.setDeltaMovement(entity.getDeltaMovement().add(0.0D, -gravity / 4.0D, 0.0D));
            }

            Vec3 delta = entity.getDeltaMovement();
              if (entity.horizontalCollision && entity.isFree(delta.x, delta.y + (double)0.6F - entity.getY() + y, delta.z)) {
                entity.setDeltaMovement(delta.x, 0.3D, delta.z);
              }
              return true;
      }
}