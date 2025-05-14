package com.stonurd.csnc.server.block.fluid;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

public class HoneyType extends FluidType {

  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_STILL = new ResourceLocation("csnc:block/honey_still.png");
  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("csnc:block/honey_flow.png");
  @SuppressWarnings("removal")
  public static final ResourceLocation OVERLAY = new ResourceLocation("csnc:textures/misc/under_acid.png");

  public HoneyType(Properties properties) {
    super(properties);
  }

  @Override
  public void initializeClient(java.util.function.Consumer<IClientFluidTypeExtensions> consumer) {
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
    });
  }
}