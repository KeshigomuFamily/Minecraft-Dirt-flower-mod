package com.example.examplemod.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RedOre extends OreBlock {

    public RedOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .setRequiresTool()
                .harvestLevel(3)
                .harvestTool(ToolType.HOE));

    }
}


