package com.example.examplemod;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModInfo.MOD_ID);

    //public static final RegistryObject<Item> DIAMOND_STICK = ITEMS.register("diamond_stick", new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DIRT_SWORD = ITEMS.register("dirt_sword", () ->
            new SwordItem(ModItemTier.DIRT, 7, -2.0F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIRT_PICKAXE = ITEMS.register("dirt_pickaxe", () ->
            new PickaxeItem(ModItemTier.DIRT, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIRT_SHOVEL = ITEMS.register("dirt_shovel", () ->
            new ShovelItem(ModItemTier.DIRT, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIRT_AXE = ITEMS.register("dirt_axe", () ->
            new AxeItem(ModItemTier.DIRT, 4.0F, -2.3F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIRT_HOE = ITEMS.register("dirt_hoe", () ->
            new HoeItem(ModItemTier.DIRT, -1, -3.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> FLOWER_SWORD = ITEMS.register("flower_sword", () ->
            new SwordItem(ModItemTier.FLOWER, 4, -1.0F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> FLOWER_PICKAXE = ITEMS.register("flower_pickaxe", () ->
            new PickaxeItem(ModItemTier.FLOWER, 1, -2.9F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> FLOWER_SHOVEL = ITEMS.register("flower_shovel", () ->
            new ShovelItem(ModItemTier.FLOWER, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> FLOWER_AXE = ITEMS.register("flower_axe", () ->
            new AxeItem(ModItemTier.FLOWER, 3, -1.4F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> FLOWER_HOE = ITEMS.register("flower_hoe", () ->
            new HoeItem(ModItemTier.FLOWER, -1, -3.5F, (new Item.Properties()).group(ItemGroup.TOOLS)));

}
