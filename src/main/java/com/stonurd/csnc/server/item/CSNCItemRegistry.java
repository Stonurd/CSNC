package com.stonurd.csnc.server.item;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.block.fluid.CSNCFluidRegistry;

import net.minecraft.world.item.*;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

public class CSNCItemRegistry {
public static final DeferredRegister<Item> ITEM_REG = DeferredRegister.create(ForgeRegistries.ITEMS, CSNCMain.MODID);

public static final RegistryObject<Item> HONEY_BUCKET1 = ITEM_REG.register("honey_bucket", () -> new BucketItem(CSNCFluidRegistry.HONEY_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.COMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> CARAMEL_BUCKET1 = ITEM_REG.register("caramel_bucket", () -> new BucketItem(CSNCFluidRegistry.CARAMEL_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.UNCOMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> INK_BUCKET1 = ITEM_REG.register("ink_bucket", () -> new BucketItem(CSNCFluidRegistry.INK_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.COMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> RUBY_CHOCOLATE_BUCKET1 = ITEM_REG.register("ruby_chocolate_bucket", () -> new BucketItem(CSNCFluidRegistry.RUBY_CHOCOLATE_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.UNCOMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> CURDLED_MILK_BUCKET1 = ITEM_REG.register("curdled_milk_bucket", () -> new BucketItem(CSNCFluidRegistry.CURDLED_MILK_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.UNCOMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> MAYONNAISE_BUCKET1 = ITEM_REG.register("mayonnaise_bucket", () -> new BucketItem(CSNCFluidRegistry.MAYONNAISE_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.UNCOMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> KETCHUP_BUCKET1 = ITEM_REG.register("ketchup_bucket", () -> new BucketItem(CSNCFluidRegistry.KETCHUP_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.UNCOMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> FRYING_OIL_BUCKET1 = ITEM_REG.register("frying_oil_bucket", () -> new BucketItem(CSNCFluidRegistry.FRYING_OIL_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.UNCOMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> SLIME_BUCKET1 = ITEM_REG.register("slime_bucket", () -> new BucketItem(CSNCFluidRegistry.SLIME_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.UNCOMMON).craftRemainder(Items.BUCKET).stacksTo(1)));
public static final RegistryObject<Item> BLACK_CHOCOLATE_BUCKET1 = ITEM_REG.register("black_chocolate_bucket", () -> new BucketItem(CSNCFluidRegistry.BLACK_CHOCOLATE_FLUID_SOURCE1,
    new Item.Properties().rarity(Rarity.RARE).craftRemainder(Items.BUCKET).stacksTo(1)));
}











//Honey HONEY from create
//ink INK
//caramel CARAMEL from create confectionnery
//ruby_chocolate rubychocolate RUBY_CHOCOLATE from create confectionnery
//curdled_milk curdledmilk CURDLED_MILK from create bitterballen
//mayonnaise MAYONNAISE from create bitterballen
//ketchup KETCHUP from create bitterballen
//frying_oil fryingoil FRYING_OIL from create bitterballen
//slime SLIME from create: thing and misc