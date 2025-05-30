package com.stonurd.csnc.server.item;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.block.fluid.CSNCFluidRegistry;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//CSNCCreativeTab.java

public class CSNCItemRegistry {
public static final DeferredRegister<Item> ITEM_REG = DeferredRegister.create(ForgeRegistries.ITEMS, CSNCMain.MODID);

public static final RegistryObject<Item> HONEY_BUCKET1 = ITEM_REG.register("honey_bucket", () -> new BucketItem(CSNCFluidRegistry.HONEY_FLUID_SOURCE1,
    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

}