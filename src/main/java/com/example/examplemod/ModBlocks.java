package com.example.examplemod;

import com.example.examplemod.blocks.RedOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModInfo.MOD_ID);
    public static final RegistryObject<Block> RED_ORE = BLOCKS.register("red_ore", RedOre::new);
}
