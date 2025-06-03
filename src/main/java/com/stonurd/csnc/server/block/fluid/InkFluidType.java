package com.stonurd.csnc.server.block.fluid;

import net.minecraft.client.Camera;
import net.minecraft.client.renderer.FogRenderer;

import net.minecraft.resources.ResourceLocation;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;

import java.util.function.Consumer;

public class InkFluidType extends FluidType {

  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_STILL = new ResourceLocation("csnc:block/ink");
  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("csnc:block/ink");

  public InkFluidType(Properties properties) {
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
            RenderSystem.setShaderFogColor(1f/255f,1f/255f,1f/255f);//(1f/255f,1f/255f,1f/255f)
            RenderSystem.setShaderFogStart(-1024);
            RenderSystem.setShaderFogEnd(96.0f);
      }
    });
  }
}