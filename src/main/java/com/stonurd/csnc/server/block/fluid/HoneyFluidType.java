package com.stonurd.csnc.server.block.fluid;

import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.FogRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;

import java.util.function.Consumer;

public class HoneyFluidType extends FluidType {

  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_STILL = new ResourceLocation("csnc:block/honey_still");
  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("csnc:block/honey_flowing");
  @SuppressWarnings("removal")
  public static final ResourceLocation OVERLAY = new ResourceLocation("csnc:textures/block/honey_still.png");

  public HoneyFluidType(Properties properties) {
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
      public ResourceLocation getRenderOverlayTexture(Minecraft mc) {
        return OVERLAY;
      }

      @Override
        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick,
          float nearDistance, float farDistance, FogShape shape) {
            RenderSystem.setShaderFogColor(240f/255f,201f/255f,85f/255f);//too light 255,216,100 
            RenderSystem.setShaderFogStart(-256.0f);//-128
            RenderSystem.setShaderFogEnd(0.7f);//96.0f
      }
    });
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