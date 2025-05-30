package com.stonurd.csnc.client.event;

import java.util.Arrays;

import org.joml.Vector3f;

import com.github.alexmodguy.alexscaves.AlexsCaves;
import com.github.alexmodguy.alexscaves.client.ClientProxy;
import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.github.alexmodguy.alexscaves.server.block.fluid.ACFluidRegistry;
import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;
import com.github.alexmodguy.alexscaves.server.potion.DeepsightEffect;
import com.mojang.blaze3d.systems.RenderSystem;
import com.stonurd.csnc.server.block.fluid.CSNCFluidRegistry;

import net.minecraft.world.entity.*;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.FogType;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

public class EventFog {
/* 
@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void onFogRender(ViewportEvent.RenderFog event) {
        Camera cam = event.getCamera();
        Minecraft minecraft = Minecraft.getInstance();

                
        Camera.NearPlane camera_nearplane = cam.getNearPlane();
        Vector3f lookVector = cam.getLookVector(); // Direction the camera is looking

        Vec3 forward = new Vec3(lookVector).scale(0.05F); //Copied from Camera.java
        for (Vec3 vec3 : Arrays.asList(
                    forward,
                    camera_nearplane.getTopLeft(),
                    camera_nearplane.getTopRight(),
                    camera_nearplane.getBottomLeft(),
                    camera_nearplane.getBottomRight()
                )) {
                    Vec3 vec31 = cam.getPosition().add(vec3);
                    BlockPos blockpos = BlockPos.containing(vec31);
                    FluidState fluidstate1 = minecraft.level.getFluidState(blockpos);
            if (fluidstate1.is(CSNCFluidRegistry.HONEY_FLUID_SOURCE1.get()) || fluidstate1.is(CSNCFluidRegistry.HONEY_FLUID_FLOWING1.get())) {
                RenderSystem.setShaderFogStart(1F);
                RenderSystem.setShaderFogEnd(-60F);
                RenderSystem.setShaderFogColor(255f/255f,255f/255f,0f/255f);
           } 
        }
    }
}
*/





/*
    private static float lastSampledFogNearness = 0.0F;
    private static float lastSampledWaterFogFarness = 0.0F;
    private static Vec3 lastSampledFogColor = Vec3.ZERO;
    private static Vec3 lastSampledWaterFogColor = Vec3.ZERO;
    
@SubscribeEvent(priority = EventPriority.LOWEST)
    public void fogRender(ViewportEvent.RenderFog event) {
        if (event.isCanceled()) {
            //another mod has cancelled fog rendering.
            return;
        }
        //some mods incorrectly set the RenderSystem fog start and end directly, so this will have to do as a band-aid...
        float defaultFarPlaneDistance = RenderSystem.getShaderFogEnd();
        float defaultNearPlaneDistance = RenderSystem.getShaderFogStart();

        Entity player = Minecraft.getInstance().getCameraEntity();
        FluidState fluidstate = player.level().getFluidState(event.getCamera().getBlockPosition());
        BlockState blockState = player.level().getBlockState(event.getCamera().getBlockPosition());
        if (!fluidstate.isEmpty() && fluidstate.getType().getFluidType().equals(ACFluidRegistry.ACID_FLUID_TYPE.get())) {
            event.setCanceled(true);
            float farness = 10.0F;
            if (Minecraft.getInstance().player.hasEffect(ACEffectRegistry.DEEPSIGHT.get())) {
                farness *= 1.0F + 1.5F * DeepsightEffect.getIntensity(Minecraft.getInstance().player, (float) event.getPartialTick());
            }
            event.setFarPlaneDistance(farness);
            event.setNearPlaneDistance(0.0F);
            return;
        }
        if (!fluidstate.isEmpty() && fluidstate.getType().getFluidType().equals(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get())) {
            event.setCanceled(true);
            float farness = 20.0F;
            float nearness = -8.0F;
            if (Minecraft.getInstance().player.hasEffect(ACEffectRegistry.DEEPSIGHT.get())) {
                float f = DeepsightEffect.getIntensity(Minecraft.getInstance().player, (float) event.getPartialTick());
                farness *= 1.0F + 1.5F * f;
                nearness *= 1.0F - f;
            }
            event.setFarPlaneDistance(farness);
            event.setNearPlaneDistance(nearness);
            return;
        }
        if (event.getCamera().getFluidInCamera() == FogType.WATER && AlexsCaves.CLIENT_CONFIG.biomeWaterFogOverrides.get()) {
            float farness = lastSampledWaterFogFarness;
            if (Minecraft.getInstance().player.hasEffect(ACEffectRegistry.DEEPSIGHT.get())) {
                farness *= 1.0F + 1.5F * DeepsightEffect.getIntensity(Minecraft.getInstance().player, (float) event.getPartialTick());
            }
            if (farness != 1.0F) {
                event.setCanceled(true);
                event.setFarPlaneDistance(defaultFarPlaneDistance * farness);
            }
        } else if (event.getMode() == FogRenderer.FogMode.FOG_TERRAIN && AlexsCaves.CLIENT_CONFIG.biomeSkyFogOverrides.get()) {
            float nearness = lastSampledFogNearness;
            float primordialBossAmount = AlexsCaves.PROXY.getPrimordialBossActiveAmount((float) event.getPartialTick());
            boolean flag = Math.abs(nearness) - 1.0F < 0.01F;
            if (primordialBossAmount > 0.0F) {
                flag = true;
                nearness *= (1.0F - primordialBossAmount * 0.75F);
            }
            if (flag) {
                event.setCanceled(true);
                event.setNearPlaneDistance(defaultNearPlaneDistance * nearness);
            }
        }
    }





    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void fogColor(ViewportEvent.ComputeFogColor event) {
        Entity player = Minecraft.getInstance().player;
        BlockState blockState = player.level().getBlockState(event.getCamera().getBlockPosition());
        if (player.getEyeInFluidType() != null && player.getEyeInFluidType().equals(ACFluidRegistry.ACID_FLUID_TYPE.get())) {
            event.setRed((float) (0));
            event.setGreen((float) (1));
            event.setBlue((float) (0));
        } else if (player.getEyeInFluidType() != null && player.getEyeInFluidType().equals(ACFluidRegistry.PURPLE_SODA_FLUID_TYPE.get())) {
            event.setRed(0.6F);
            event.setGreen(0.1F);
            event.setBlue(0.85F);
        } else if (event.getCamera().getFluidInCamera() == FogType.NONE && AlexsCaves.CLIENT_CONFIG.biomeSkyFogOverrides.get()) {
            float override = ClientProxy.acSkyOverrideAmount;
            float setR = event.getRed();
            float setG = event.getGreen();
            float setB = event.getBlue();

            boolean flag = false;
            if (override != 0.0F) {
                flag = true;
                Vec3 vec3 = lastSampledFogColor;
                setR = (float) (vec3.x - setR) * override + setR;
                setG = (float) (vec3.y - setG) * override + setG;
                setB = (float) (vec3.z - setB) * override + setB;
            }
            float primordialBossAmount = AlexsCaves.PROXY.getPrimordialBossActiveAmount((float) event.getPartialTick());
            if (primordialBossAmount > 0.0F) {
                flag = true;
                setR = (0.8F - setR) * primordialBossAmount + setR;
                setG = (0.2F - setG) * primordialBossAmount + setG;
                setB = (0.15F - setB) * primordialBossAmount + setB;
            }
            if (flag) {
                event.setRed(setR);
                event.setGreen(setG);
                event.setBlue(setB);
            }
        } else if (event.getCamera().getFluidInCamera() == FogType.WATER && AlexsCaves.CLIENT_CONFIG.biomeWaterFogOverrides.get()) {
            int i = Minecraft.getInstance().options.biomeBlendRadius().get();
            float override = ClientProxy.acSkyOverrideAmount;
            if (override != 0) {
                Vec3 vec3 = lastSampledWaterFogColor;
                event.setRed((float) (event.getRed() + (vec3.x - event.getRed()) * override));
                event.setGreen((float) (event.getGreen() + (vec3.y - event.getGreen()) * override));
                event.setBlue((float) (event.getBlue() + (vec3.z - event.getBlue()) * override));
            }
        }
    }

*/
}
