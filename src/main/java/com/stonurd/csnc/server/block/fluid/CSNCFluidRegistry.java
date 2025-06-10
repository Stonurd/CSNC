package com.stonurd.csnc.server.block.fluid;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.item.CSNCItemRegistry;
import com.stonurd.csnc.server.block.CSNCBlockRegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.pathfinder.BlockPathTypes;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

public class CSNCFluidRegistry {
//registerZone
public static final DeferredRegister<FluidType> FLUID_TYPE_REG = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CSNCMain.MODID);
public static final DeferredRegister<Fluid> FLUID_REG = DeferredRegister.create(ForgeRegistries.FLUIDS, CSNCMain.MODID);

//Honey HONEY from create
public static ForgeFlowingFluid.Properties honeyProperties() {
        return new ForgeFlowingFluid.Properties(HONEY_FLUID_TYPE1, HONEY_FLUID_SOURCE1, HONEY_FLUID_FLOWING1).tickRate(40).slopeFindDistance(2).levelDecreasePerBlock(2)
                .bucket(CSNCItemRegistry.HONEY_BUCKET1).block(CSNCBlockRegistry.HONEY1);
        }
public static final RegistryObject<FluidType> HONEY_FLUID_TYPE1 = FLUID_TYPE_REG.register("honey", ()
        -> new HoneyFluidType(FluidType.Properties.create().lightLevel(1).density(2048).viscosity(4906).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> HONEY_FLUID_SOURCE1 = FLUID_REG.register("honey", () -> new ForgeFlowingFluid.Source(honeyProperties()));
public static final RegistryObject<FlowingFluid> HONEY_FLUID_FLOWING1 = FLUID_REG.register("honey_flowing", () -> new ForgeFlowingFluid.Flowing(honeyProperties()));
//ink INK
public static ForgeFlowingFluid.Properties inkProperties() {
        return new ForgeFlowingFluid.Properties(INK_FLUID_TYPE1, INK_FLUID_SOURCE1, INK_FLUID_FLOWING1).tickRate(4).slopeFindDistance(2).levelDecreasePerBlock(1)
                .bucket(CSNCItemRegistry.INK_BUCKET1).block(CSNCBlockRegistry.INK1);
        }
public static final RegistryObject<FluidType> INK_FLUID_TYPE1 = FLUID_TYPE_REG.register("ink", ()
        -> new InkFluidType(FluidType.Properties.create().lightLevel(0).density(16).viscosity(32).temperature(300).pathType(BlockPathTypes.WATER).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
        ));
public static final RegistryObject<FlowingFluid> INK_FLUID_SOURCE1 = FLUID_REG.register("ink", () -> new ForgeFlowingFluid.Source(inkProperties()));
public static final RegistryObject<FlowingFluid> INK_FLUID_FLOWING1 = FLUID_REG.register("ink_flowing", () -> new ForgeFlowingFluid.Flowing(inkProperties()));
//caramel CARAMEL from create confectionnery
public static ForgeFlowingFluid.Properties caramelProperties() {
        return new ForgeFlowingFluid.Properties(CARAMEL_FLUID_TYPE1, CARAMEL_FLUID_SOURCE1, CARAMEL_FLUID_FLOWING1).tickRate(40).slopeFindDistance(2).levelDecreasePerBlock(2)
                .bucket(CSNCItemRegistry.CARAMEL_BUCKET1).block(CSNCBlockRegistry.CARAMEL1);
        }
public static final RegistryObject<FluidType> CARAMEL_FLUID_TYPE1 = FLUID_TYPE_REG.register("caramel", ()
        -> new CaramelFluidType(FluidType.Properties.create().lightLevel(1).density(2048).viscosity(4906).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> CARAMEL_FLUID_SOURCE1 = FLUID_REG.register("caramel", () -> new ForgeFlowingFluid.Source(caramelProperties()));
public static final RegistryObject<FlowingFluid> CARAMEL_FLUID_FLOWING1 = FLUID_REG.register("caramel_flowing", () -> new ForgeFlowingFluid.Flowing(caramelProperties()));
//ruby_chocolate rubychocolate RUBY_CHOCOLATE from create confectionnery
public static ForgeFlowingFluid.Properties rubychocolateProperties() {
        return new ForgeFlowingFluid.Properties(RUBY_CHOCOLATE_FLUID_TYPE1, RUBY_CHOCOLATE_FLUID_SOURCE1, RUBY_CHOCOLATE_FLUID_FLOWING1).tickRate(40).slopeFindDistance(2).levelDecreasePerBlock(2)
                .bucket(CSNCItemRegistry.RUBY_CHOCOLATE_BUCKET1).block(CSNCBlockRegistry.RUBY_CHOCOLATE1);
        }
public static final RegistryObject<FluidType> RUBY_CHOCOLATE_FLUID_TYPE1 = FLUID_TYPE_REG.register("ruby_chocolate", ()
        -> new RubyChocolateFluidType(FluidType.Properties.create().lightLevel(1).density(2048).viscosity(4906).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> RUBY_CHOCOLATE_FLUID_SOURCE1 = FLUID_REG.register("ruby_chocolate", () -> new ForgeFlowingFluid.Source(rubychocolateProperties()));
public static final RegistryObject<FlowingFluid> RUBY_CHOCOLATE_FLUID_FLOWING1 = FLUID_REG.register("ruby_chocolate_flowing", () -> new ForgeFlowingFluid.Flowing(rubychocolateProperties()));
//curdled_milk curdledmilk CURDLED_MILK from create bitterballen
public static ForgeFlowingFluid.Properties curdledmilkProperties() {
        return new ForgeFlowingFluid.Properties(CURDLED_MILK_FLUID_TYPE1, CURDLED_MILK_FLUID_SOURCE1, CURDLED_MILK_FLUID_FLOWING1).tickRate(40).slopeFindDistance(2).levelDecreasePerBlock(2)
                .bucket(CSNCItemRegistry.CURDLED_MILK_BUCKET1).block(CSNCBlockRegistry.CURDLED_MILK1);
        }
public static final RegistryObject<FluidType> CURDLED_MILK_FLUID_TYPE1 = FLUID_TYPE_REG.register("curdled_milk", ()
        -> new CurdledMilkFluidType(FluidType.Properties.create().lightLevel(1).density(1024).viscosity(2048).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> CURDLED_MILK_FLUID_SOURCE1 = FLUID_REG.register("curdled_milk", () -> new ForgeFlowingFluid.Source(curdledmilkProperties()));
public static final RegistryObject<FlowingFluid> CURDLED_MILK_FLUID_FLOWING1 = FLUID_REG.register("curdled_milk_flowing", () -> new ForgeFlowingFluid.Flowing(curdledmilkProperties()));
//mayonnaise MAYONNAISE from create bitterballen
public static ForgeFlowingFluid.Properties mayonnaiseProperties() {
        return new ForgeFlowingFluid.Properties(MAYONNAISE_FLUID_TYPE1, MAYONNAISE_FLUID_SOURCE1, MAYONNAISE_FLUID_FLOWING1).tickRate(40).slopeFindDistance(2).levelDecreasePerBlock(2)
                .bucket(CSNCItemRegistry.MAYONNAISE_BUCKET1).block(CSNCBlockRegistry.MAYONNAISE1);
        }
public static final RegistryObject<FluidType> MAYONNAISE_FLUID_TYPE1 = FLUID_TYPE_REG.register("mayonnaise", ()
        -> new MayonnaiseFluidType(FluidType.Properties.create().lightLevel(1).density(2048).viscosity(4906).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> MAYONNAISE_FLUID_SOURCE1 = FLUID_REG.register("mayonnaise", () -> new ForgeFlowingFluid.Source(mayonnaiseProperties()));
public static final RegistryObject<FlowingFluid> MAYONNAISE_FLUID_FLOWING1 = FLUID_REG.register("mayonnaise_flowing", () -> new ForgeFlowingFluid.Flowing(mayonnaiseProperties()));
//ketchup KETCHUP from create bitterballen
public static ForgeFlowingFluid.Properties ketchupProperties() {
        return new ForgeFlowingFluid.Properties(KETCHUP_FLUID_TYPE1, KETCHUP_FLUID_SOURCE1, KETCHUP_FLUID_FLOWING1).tickRate(40).slopeFindDistance(2).levelDecreasePerBlock(2)
                .bucket(CSNCItemRegistry.KETCHUP_BUCKET1).block(CSNCBlockRegistry.KETCHUP1);
        }
public static final RegistryObject<FluidType> KETCHUP_FLUID_TYPE1 = FLUID_TYPE_REG.register("ketchup", ()
        -> new KetchupFluidType(FluidType.Properties.create().lightLevel(1).density(2048).viscosity(4906).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> KETCHUP_FLUID_SOURCE1 = FLUID_REG.register("ketchup", () -> new ForgeFlowingFluid.Source(ketchupProperties()));
public static final RegistryObject<FlowingFluid> KETCHUP_FLUID_FLOWING1 = FLUID_REG.register("ketchup_flowing", () -> new ForgeFlowingFluid.Flowing(ketchupProperties()));
//frying_oil fryingoil FRYING_OIL from create bitterballen
public static ForgeFlowingFluid.Properties fryingoilProperties() {
        return new ForgeFlowingFluid.Properties(FRYING_OIL_FLUID_TYPE1, FRYING_OIL_FLUID_SOURCE1, FRYING_OIL_FLUID_FLOWING1).tickRate(5).slopeFindDistance(2).levelDecreasePerBlock(1)
                .bucket(CSNCItemRegistry.FRYING_OIL_BUCKET1).block(CSNCBlockRegistry.FRYING_OIL1);
        }
public static final RegistryObject<FluidType> FRYING_OIL_FLUID_TYPE1 = FLUID_TYPE_REG.register("frying_oil", ()
        -> new FryingOilFluidType(FluidType.Properties.create().lightLevel(1).density(1024).viscosity(1024).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
        ));
public static final RegistryObject<FlowingFluid> FRYING_OIL_FLUID_SOURCE1 = FLUID_REG.register("frying_oil", () -> new ForgeFlowingFluid.Source(fryingoilProperties()));
public static final RegistryObject<FlowingFluid> FRYING_OIL_FLUID_FLOWING1 = FLUID_REG.register("frying_oil_flowing", () -> new ForgeFlowingFluid.Flowing(fryingoilProperties()));
//slime SLIME from create: thing and misc
public static ForgeFlowingFluid.Properties slimeProperties() {
        return new ForgeFlowingFluid.Properties(SLIME_FLUID_TYPE1, SLIME_FLUID_SOURCE1, SLIME_FLUID_FLOWING1).tickRate(5).slopeFindDistance(2).levelDecreasePerBlock(3)
                .bucket(CSNCItemRegistry.SLIME_BUCKET1).block(CSNCBlockRegistry.SLIME1);
        }
public static final RegistryObject<FluidType> SLIME_FLUID_TYPE1 = FLUID_TYPE_REG.register("slime", ()
        -> new SlimeFluidType(FluidType.Properties.create().lightLevel(1).density(1024).viscosity(2048).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> SLIME_FLUID_SOURCE1 = FLUID_REG.register("slime", () -> new ForgeFlowingFluid.Source(slimeProperties()));
public static final RegistryObject<FlowingFluid> SLIME_FLUID_FLOWING1 = FLUID_REG.register("slime_flowing", () -> new ForgeFlowingFluid.Flowing(slimeProperties()));

//black_chocolate BLACK_CHOCOLATE from create confectionnery
public static ForgeFlowingFluid.Properties blackchocolateProperties() {
        return new ForgeFlowingFluid.Properties(BLACK_CHOCOLATE_FLUID_TYPE1, BLACK_CHOCOLATE_FLUID_SOURCE1, BLACK_CHOCOLATE_FLUID_FLOWING1).tickRate(10).slopeFindDistance(2).levelDecreasePerBlock(3)
                .bucket(CSNCItemRegistry.BLACK_CHOCOLATE_BUCKET1).block(CSNCBlockRegistry.BLACK_CHOCOLATE1);
        }
public static final RegistryObject<FluidType> BLACK_CHOCOLATE_FLUID_TYPE1 = FLUID_TYPE_REG.register("black_chocolate", ()
        -> new BlackChocolateFluidType(FluidType.Properties.create().lightLevel(1).density(1024).viscosity(2048).temperature(300).pathType(BlockPathTypes.LAVA).rarity(Rarity.UNCOMMON)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> BLACK_CHOCOLATE_FLUID_SOURCE1 = FLUID_REG.register("black_chocolate", () -> new ForgeFlowingFluid.Source(blackchocolateProperties()));
public static final RegistryObject<FlowingFluid> BLACK_CHOCOLATE_FLUID_FLOWING1 = FLUID_REG.register("black_chocolate_flowing", () -> new ForgeFlowingFluid.Flowing(blackchocolateProperties()));
}