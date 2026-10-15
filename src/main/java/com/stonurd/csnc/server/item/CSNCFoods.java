package com.stonurd.csnc.server.item;

import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class CSNCFoods {
        @SuppressWarnings("null")
        public static final FoodProperties YELLOWCAKE = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.1F).effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 1800), 1.0F).build();
}