package com.stonurd.csnc.mixin;

import java.util.HashMap;
import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import com.github.alexmodguy.alexscaves.server.block.SulfurBudBlock;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

@Mixin(value = SulfurBudBlock.class, remap = false)
public class SulfurBudBlockMixin {
    /**
     * @reason fix north south facing hitbox. @author 0
     */
    @Overwrite
    public static Map<Direction, VoxelShape> buildShapeMap(int pixWidth, int pixHeight) {
        Map<Direction, VoxelShape> map = new HashMap<>();
        map.put(Direction.UP, Block.box(8 - pixWidth / 2, 0.0D, 8 - pixWidth / 2, 8 + pixWidth / 2, pixHeight, 8 + pixWidth / 2));
        map.put(Direction.DOWN, Block.box(8 - pixWidth / 2, 16 - pixHeight, 8 - pixWidth / 2, 8 + pixWidth / 2, 16, 8 + pixWidth / 2));
        map.put(Direction.NORTH, Block.box(8 - pixWidth / 2, 8 - pixWidth / 2, 16 - pixHeight, 8 + pixWidth / 2, 8 + pixWidth / 2, 16));
        map.put(Direction.SOUTH, Block.box(8 - pixWidth / 2, 8 - pixWidth / 2, 0, 8 + pixWidth / 2, 8 + pixWidth / 2, pixHeight));
        map.put(Direction.EAST, Block.box(0, 8 - pixWidth / 2, 8 - pixWidth / 2, pixHeight, 8 + pixWidth / 2, 8 + pixWidth / 2));
        map.put(Direction.WEST, Block.box(16 - pixHeight, 8 - pixWidth / 2, 8 - pixWidth / 2, 16, 8 + pixWidth / 2, 8 + pixWidth / 2));
        return map;
    }
}