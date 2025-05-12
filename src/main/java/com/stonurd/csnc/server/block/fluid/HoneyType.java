package com.stonurd.csnc.server.block.fluid;

//import org.joml.Vector3f;

//import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
//import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;



public class HoneyType extends FluidType {

  public static final ResourceLocation FLUID_STILL = new ResourceLocation("csnc:block/honey_still.png");
  public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("csnc:block/honey_flow.png");
  public static final ResourceLocation OVERLAY = new ResourceLocation("csnc:textures/misc/under_acid.png");
  //private final Vector3f fogColor;


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
        /* 
        @Override
        public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level,
        int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
        return fogColor;
        }   
        */     
      });
}
}