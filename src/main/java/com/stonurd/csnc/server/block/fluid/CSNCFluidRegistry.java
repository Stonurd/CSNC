package com.stonurd.csnc.server.block.fluid;

import com.stonurd.csnc.CSNCMain;
import com.stonurd.csnc.server.item.CSNCItemRegistry;
import com.stonurd.csnc.server.block.CSNCBlockRegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Fluid;
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

//Honey
public static ForgeFlowingFluid.Properties honeyProperties() {
        return new ForgeFlowingFluid.Properties(HONEY_FLUID_TYPE1, HONEY_FLUID_SOURCE1, HONEY_FLUID_FLOWING1).tickRate(40).slopeFindDistance(2).levelDecreasePerBlock(2)
                .bucket(CSNCItemRegistry.HONEY_BUCKET1).block(CSNCBlockRegistry.HONEY1); 
        }
public static final RegistryObject<FluidType> HONEY_FLUID_TYPE1 = FLUID_TYPE_REG.register("honey", ()
        -> new HoneyType(FluidType.Properties.create().lightLevel(5).density(2048).viscosity(4906).temperature(300).pathType(BlockPathTypes.LAVA)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
        ));
public static final RegistryObject<FlowingFluid> HONEY_FLUID_SOURCE1 = FLUID_REG.register("honey", () -> new ForgeFlowingFluid.Source(honeyProperties()));
public static final RegistryObject<FlowingFluid> HONEY_FLUID_FLOWING1 = FLUID_REG.register("honey_flowing", () -> new ForgeFlowingFluid.Flowing(honeyProperties()));
//anotherFluid
}
//https://colorspire.com/rgb-color-wheel/


//.block(createEffect(MapColor.COLOR_ORANGE, 0, () -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5*20))).commonTag().flowing();
//Vector3f(224f / 255f, 56f / 255f, 208f / 255f)
//   Color(255f,255f,0f,255f);
//Vector3f(255f,255f,0f,255f);
/*
 public static readonly Color maroon = new Color(128f, 0f, 0f, 255f);//Color xxx = Colors.maroon;
        public static readonly Color darkred = new Color(139, 0f, 0f, 255f);
        public static readonly Color redbrown = new Color(165f,42f,42f,255f);
        public static readonly Color firebrick = new Color(178f,34f,34f,255f);
        public static readonly Color crimson = new Color(220f,20f,60f,255f);
        public static readonly Color red = new Color(255f,0f,0f,255f);
        public static readonly Color tomato = new Color(255f,99f,71f,255f);
        public static readonly Color coral = new Color(255f,127f,80f,255f);
        public static readonly Color indianred = new Color(205f,92f,92f,255f);
        public static readonly Color lightcoral = new Color(240f,128f,128f,255f);
        public static readonly Color darksalmon = new Color(233f,150f,122f,255f);
        public static readonly Color salmon = new Color(250f,128f,114f,255f);
        public static readonly Color lightsalmon = new Color(255f,160f,122f,255f);
        public static readonly Color orangered = new Color(255f,69f,0f,255f);
        public static readonly Color darkorange = new Color(255f,140f,0f,255f);
        public static readonly Color orange = new Color(255f,165f,0f,255f);
        public static readonly Color gold = new Color(255f,215f,0f,255f);
        public static readonly Color darkgoldenrod = new Color(184f,134f,11f,255f);
        public static readonly Color goldenrod = new Color(218f,165f,32f,255f);
        public static readonly Color palegoldenrod = new Color(238f,232f,170f,255f);
        public static readonly Color darkkhaki = new Color(189f,183f,107f,255f);
        public static readonly Color khaki = new Color(240f,230f,140f,255f);
        public static readonly Color olive = new Color(128f,128f,0f,255f);
        public static readonly Color yellow = new Color(255f,255f,0f,255f);
        public static readonly Color yellowgreen = new Color(154f,205f,50f,255f);
        public static readonly Color darkolivegreen = new Color(85f,107f,47f,255f);
        public static readonly Color olivedrab = new Color(107f,142f,35f,255f);
        public static readonly Color lawngreen = new Color(124f,252f,0f,255f);
        public static readonly Color chartreuse = new Color(127f,255f,0f,255f);
        public static readonly Color greenyellow = new Color(173f,255f,47f,255f);
        public static readonly Color darkgreen = new Color(0f,100f,0f,255f);
        public static readonly Color green = new Color(0f,128f,0f,255f);
        public static readonly Color forestgreen = new Color(34f,139f,34f,255f);
        public static readonly Color lime = new Color(0f,255f,0f,255f);
        public static readonly Color limegreen = new Color(50f,205f,50f,255f);
        public static readonly Color lightgreen = new Color(144f,238f,144f,255f);
        public static readonly Color palegreen = new Color(152f,251f,152f,255f);
        public static readonly Color darkseagreen = new Color(143f,188f,143f,255f);
        public static readonly Color mediumspringgreen = new Color(0f,250f,154f,255f);
        public static readonly Color springgreen = new Color(0f,255f,127f,255f);
        public static readonly Color seagreen = new Color(46f,139f,87f,255f);
        public static readonly Color mediumaquamarine = new Color(102f,205f,170f,255f);
        public static readonly Color mediumseagreen = new Color(60f,179f,113f,255f);
        public static readonly Color lightseagreen = new Color(32f,178f,170f,255f);
        public static readonly Color darkslategray = new Color(47f,79f,79f,255f);
        public static readonly Color teal = new Color(0f,128f,128f,255f);
        public static readonly Color darkcyan = new Color(0f,139f,139f,255f);
        public static readonly Color aqua = new Color(0f,255f,255f,255f);
        public static readonly Color cyan = new Color(0f,255f,255f,255f);
        public static readonly Color lightcyan = new Color(224f,255f,255f,255f);
        public static readonly Color darkturquoise = new Color(0f,206f,209f,255f);
        public static readonly Color turquoise = new Color(64f,224f,208f,255f);
        public static readonly Color mediumturquoise = new Color(72f,209f,204f,255f);
        public static readonly Color paleturquoise = new Color(175f,238f,238f,255f);
        public static readonly Color aquamarine = new Color(127f,255f,212f,255f);
        public static readonly Color powderblue = new Color(176f,224f,230f,255f);
        public static readonly Color cadetblue = new Color(95f,158f,160f,255f);
        public static readonly Color steelblue = new Color(70f,130f,180f,255f);
        public static readonly Color cornflowerblue = new Color(100f,149f,237f,255f);
        public static readonly Color deepskyblue = new Color(0f,191f,255f,255f);
        public static readonly Color dodgerblue = new Color(30f,144f,255f,255f);
        public static readonly Color lightblue = new Color(173f,216f,230f,255f);
        public static readonly Color skyblue = new Color(135f,206f,235f,255f);
        public static readonly Color lightskyblue = new Color(135f,206f,250f,255f);
        public static readonly Color midnightblue = new Color(25f,25f,112f,255f);
        public static readonly Color navy = new Color(0f,0f,128f,255f);
        public static readonly Color darkblue = new Color(0f,0f,139f,255f);
        public static readonly Color mediumblue = new Color(0f,0f,205f,255f);
        public static readonly Color blue = new Color(0f,0f,255f,255f);
        public static readonly Color royalblue = new Color(65f,105f,225f,255f);
        public static readonly Color blueviolet = new Color(138f,43f,226f,255f);
        public static readonly Color indigo = new Color(75f,0f,130f,255f);
        public static readonly Color darkslateblue = new Color(72f,61f,139f,255f);
        public static readonly Color slateblue = new Color(106f,90f,205f,255f);
        public static readonly Color mediumslateblue = new Color(123f,104f,238f,255f);
        public static readonly Color mediumpurple = new Color(147f,112f,219f,255f);
        public static readonly Color darkmagenta = new Color(139f,0f,139f,255f);
        public static readonly Color darkviolet = new Color(148f,0f,211f,255f);
        public static readonly Color darkorchid = new Color(153f,50f,204f,255f);
        public static readonly Color mediumorchid = new Color(186f,85f,211f,255f);
        public static readonly Color purple = new Color(128f,0f,128f,255f);
        public static readonly Color thistle = new Color(216f,191f,216f,255f);
        public static readonly Color plum = new Color(221f,160f,221f,255f);
        public static readonly Color violet = new Color(238f,130f,238f,255f);
        public static readonly Color magentafuchsia = new Color(255f,0f,255f,255f);
        public static readonly Color orchid = new Color(218f,112f,214f,255f);
        public static readonly Color mediumvioletred = new Color(199f,21f,133f,255f);
        public static readonly Color palevioletred = new Color(219f,112f,147f,255f);
        public static readonly Color deeppink = new Color(255f,20f,147f,255f);
        public static readonly Color hotpink = new Color(255f,105f,180f,255f);
        public static readonly Color lightpink = new Color(255f,182f,193f,255f);
        public static readonly Color pink = new Color(255f,192f,203f,255f);
        public static readonly Color antiquewhite = new Color(250f,235f,215f,255f);
        public static readonly Color beige = new Color(245f,245f,220f,255f);
        public static readonly Color bisque = new Color(255f,228f,196f,255f);
        public static readonly Color blanchedalmond = new Color(255f,235f,205f,255f);
        public static readonly Color wheat = new Color(245f,222f,179f,255f);
        public static readonly Color cornsilk = new Color(255f,248f,220f,255f);
        public static readonly Color lemonchiffon = new Color(255f,250f,205f,255f);
        public static readonly Color lightgoldenrod = new Color(250f,250f,210f,255f);
        public static readonly Color lightyellow = new Color(255f,255f,224f,255f);
        public static readonly Color saddlebrown = new Color(139f,69f,19f,255f);
        public static readonly Color sienna = new Color(160f,82f,45f,255f);
        public static readonly Color chocolate = new Color(210f,105f,30f,255f);
        public static readonly Color peru = new Color(205f,133f,63f,255f);
        public static readonly Color sandybrown = new Color(244f,164f,96f,255f);
        public static readonly Color burlywood = new Color(222f,184f,135f,255f);
        public static readonly Color tan = new Color(210f,180f,140f,255f);
        public static readonly Color rosybrown = new Color(188f,143f,143f,255f);
        public static readonly Color moccasin = new Color(255f,228f,181f,255f);
        public static readonly Color navajowhite = new Color(255f,222f,173f,255f);
        public static readonly Color peachpuff = new Color(255f,218f,185f,255f);
        public static readonly Color mistyrose = new Color(255f,228f,225f,255f);
        public static readonly Color lavenderblush = new Color(255f,240f,245f,255f);
        public static readonly Color linen = new Color(250f,240f,230f,255f);
        public static readonly Color oldlace = new Color(253f,245f,230f,255f);
        public static readonly Color papayawhip = new Color(255f,239f,213f,255f);
        public static readonly Color seashell = new Color(255f,245f,238f,255f);
        public static readonly Color mintcream = new Color(245f,255f,250f,255f);
        public static readonly Color slategray = new Color(112f,128f,144f,255f);
        public static readonly Color lightslategray = new Color(119f,136f,153f,255f);
        public static readonly Color lightsteelblue = new Color(176f,196f,222f,255f);
        public static readonly Color lavender = new Color(230f,230f,250f,255f);
        public static readonly Color floralwhite = new Color(255f,250f,240f,255f);
        public static readonly Color aliceblue = new Color(240f,248f,255f,255f);
        public static readonly Color ghostwhite = new Color(248f,248f,255f,255f);
        public static readonly Color honeydew = new Color(240f,255f,240f,255f);
        public static readonly Color ivory = new Color(255f,255f,240f,255f);
        public static readonly Color azure = new Color(240f,255f,255f,255f);
        public static readonly Color snow = new Color(255f,250f,250f,255f);
        public static readonly Color black = new Color(0f,0f,0f,255f);
        public static readonly Color dimgray = new Color(105f,105f,105f,255f);
        public static readonly Color gray = new Color(128f,128f,128f,255f);
        public static readonly Color darkgray = new Color(169f,169f,169f,255f);
        public static readonly Color silver = new Color(192f,192f,192f,255f);
        public static readonly Color lightgray = new Color(211f,211f,211f,255f);
        public static readonly Color gainsboro = new Color(220f,220f,220f,255f);
        public static readonly Color whitesmoke = new Color(245f,245f,245f,255f);
        public static readonly Color white = new Color(255f,255f,255f,255f);*/