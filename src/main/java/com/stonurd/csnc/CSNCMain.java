package com.stonurd.csnc;

import com.mojang.logging.LogUtils;
import com.stonurd.csnc.server.item.CSNCItemRegistry;
import com.stonurd.csnc.server.misc.CSNCreativeTabRegistry;
import com.stonurd.csnc.server.block.CSNCBlockRegistry;
import com.stonurd.csnc.server.block.fluid.CSNCFluidRegistry;
import com.stonurd.csnc.server.block.fluid.CaramelFluidType;
import com.stonurd.csnc.server.block.fluid.CurdledMilkFluidType;
import com.stonurd.csnc.server.block.fluid.FryingOilFluidType;
import com.stonurd.csnc.server.block.fluid.HoneyFluidType;
import com.stonurd.csnc.server.block.fluid.InkFluidType;
import com.stonurd.csnc.server.block.fluid.KetchupFluidType;
import com.stonurd.csnc.server.block.fluid.MayonnaiseFluidType;
import com.stonurd.csnc.server.block.fluid.RubyChocolateFluidType;
import com.stonurd.csnc.server.block.fluid.SlimeFluidType;
import com.stonurd.csnc.server.block.fluid.UraniumFluidType;
import com.stonurd.csnc.server.block.fluid.BlackChocolateFluidType;
import com.stonurd.csnc.server.block.fluid.CSNCFluidInteraction;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

@Mod(CSNCMain.MODID)
public class CSNCMain {

    public static final String MODID = "csnc";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CSNCMain() {
        @SuppressWarnings("removal")
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        CSNCFluidRegistry.FLUID_TYPE_REG.register(modEventBus);
        CSNCFluidRegistry.FLUID_REG.register(modEventBus);
        CSNCItemRegistry.ITEM_REG.register(modEventBus);
        CSNCBlockRegistry.BLOCK_REG.register(modEventBus);
        CSNCreativeTabRegistry.DEF_REG.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        CSNCFluidInteraction.postInit();
        event.enqueueWork(BlackChocolateFluidType::registerDispenserBehavior);
        event.enqueueWork(CaramelFluidType::registerDispenserBehavior);
        event.enqueueWork(CurdledMilkFluidType::registerDispenserBehavior);
        event.enqueueWork(FryingOilFluidType::registerDispenserBehavior);
        event.enqueueWork(HoneyFluidType::registerDispenserBehavior);
        event.enqueueWork(InkFluidType::registerDispenserBehavior);
        event.enqueueWork(KetchupFluidType::registerDispenserBehavior);
        event.enqueueWork(MayonnaiseFluidType::registerDispenserBehavior);
        event.enqueueWork(RubyChocolateFluidType::registerDispenserBehavior);
        event.enqueueWork(SlimeFluidType::registerDispenserBehavior);
        event.enqueueWork(UraniumFluidType::registerDispenserBehavior);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}