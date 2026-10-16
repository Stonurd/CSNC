package com.stonurd.csnc.server.block.fluid;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import com.stonurd.csnc.server.block.CSNCBlockRegistry;
import com.stonurd.csnc.server.item.CSNCItemRegistry;

import java.util.function.Consumer;

public class KetchupFluidType extends FluidType{

  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_STILL = new ResourceLocation("csnc:block/ketchup_still");
  @SuppressWarnings("removal")
  public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("csnc:block/ketchup_flow");

  public KetchupFluidType(Properties properties) {
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
          RenderSystem.setShaderFogColor(96f/255f, 30f/255f, 30f/255f);//128,40,40 ok (128f/0f,40f/0f,40f/0f)
          RenderSystem.setShaderFogStart(-512.0f);
          RenderSystem.setShaderFogEnd(0.2f);
      }
    });
  }
      public boolean move(FluidState state, LivingEntity entity, Vec3 movementVector, double gravity) {
        double y = entity.getY();
        boolean falling = entity.getDeltaMovement().y <= 0.0D;

          entity.moveRelative(0.02F, movementVector);
          entity.move(MoverType.SELF, entity.getDeltaMovement());

            if (entity.horizontalCollision && entity.onClimbable()) {
              entity.setDeltaMovement(entity.getDeltaMovement().multiply(0.7D, 0.8D, 0.7D));
              Vec3 fallingMovement = entity.getFluidFallingAdjustedMovement(gravity, falling, entity.getDeltaMovement());
              entity.setDeltaMovement(fallingMovement);
              } else {
                entity.setDeltaMovement(entity.getDeltaMovement().scale(0.7D));
            }

            if (!entity.isNoGravity()) {
              entity.setDeltaMovement(entity.getDeltaMovement().add(0.0D, -gravity / 5.0D, 0.0D));
            }

            Vec3 delta = entity.getDeltaMovement();
              if (entity.horizontalCollision && entity.isFree(delta.x, delta.y + (double)0.6F - entity.getY() + y, delta.z)) {
                entity.setDeltaMovement(delta.x, 0.4D, delta.z);
              }
              return true;
      }
           
  public static void registerDispenserBehavior() {
    DispenserBlock.registerBehavior(CSNCItemRegistry.KETCHUP_BUCKET1.get(), new DefaultDispenseItemBehavior() {
        @Override
        protected ItemStack execute(BlockSource source, ItemStack stack) {
            Level level = source.getLevel();
            BlockPos target = source.getPos().relative(source.getBlockState().getValue(DispenserBlock.FACING));
            BlockState targetState = level.getBlockState(target);

            if (targetState.isAir() || targetState.canBeReplaced()) {
                level.setBlock(target, CSNCBlockRegistry.KETCHUP1.get().defaultBlockState(), 3);
                level.gameEvent(null, GameEvent.FLUID_PLACE, target);
                level.playSound(null, target, SoundEvents.BUCKET_EMPTY_LAVA, SoundSource.BLOCKS, 1.0F, 1.0F);
                return new ItemStack(Items.BUCKET);
            }

            // Target blocked: drop the bucket like a normal dispenser
            return super.execute(source, stack);
        }
    });
} 
}
