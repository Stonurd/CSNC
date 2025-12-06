package com.stonurd.csnc.server.misc;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.item.CSNCItemRegistry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class CSNCreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> DEF_REG = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CSNCMain.MODID);

         public static final RegistryObject<CreativeModeTab> CSNC_TAB = DEF_REG.register("csn_core", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.csnc"))
            .icon(() -> new ItemStack(CSNCItemRegistry.HONEY_BUCKET1.get()))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .displayItems((enabledFeatures, output) -> {
                output.accept(CSNCItemRegistry.HONEY_BUCKET1.get());
                output.accept(CSNCItemRegistry.CARAMEL_BUCKET1.get());
                output.accept(CSNCItemRegistry.INK_BUCKET1.get());
                output.accept(CSNCItemRegistry.RUBY_CHOCOLATE_BUCKET1.get());
                output.accept(CSNCItemRegistry.CURDLED_MILK_BUCKET1.get());
                output.accept(CSNCItemRegistry.MAYONNAISE_BUCKET1.get());
                output.accept(CSNCItemRegistry.KETCHUP_BUCKET1.get());
                output.accept(CSNCItemRegistry.FRYING_OIL_BUCKET1.get());
                output.accept(CSNCItemRegistry.SLIME_BUCKET1.get());
                output.accept(CSNCItemRegistry.BLACK_CHOCOLATE_BUCKET1.get());
            })
            .build());
}