package com.example.examplemod;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModInfo.MOD_ID);

    public static final RegistryObject<Item> DIRT_SWORD = ITEMS.register("dirt_sword", () ->
            new SwordItem(ModItemTier.DIRT, 5, -2.0F, (new Item.Properties()).group(ItemGroup.COMBAT)));
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
    public static final RegistryObject<Item> GLASS_SWORD = ITEMS.register("glass_sword", () ->
            new SwordItem(ModItemTier.GLASS, 5, -1.2F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GLASS_PICKAXE = ITEMS.register("glass_pickaxe", () ->
            new PickaxeItem(ModItemTier.GLASS, 1, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GLASS_SHOVEL = ITEMS.register("glass_shovel", () ->
            new ShovelItem(ModItemTier.GLASS, -1, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GLASS_AXE = ITEMS.register("glass_axe", () ->
            new AxeItem(ModItemTier.GLASS, 3, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GLASS_HOE = ITEMS.register("glass_hoe", () ->
            new HoeItem(ModItemTier.GLASS, -2, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () ->
            new SwordItem(ModItemTier.OBSIDIAN, 6, -1.2F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () ->
            new PickaxeItem(ModItemTier.OBSIDIAN, 2, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () ->
            new ShovelItem(ModItemTier.OBSIDIAN, 0, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () ->
            new HoeItem(ModItemTier.OBSIDIAN, -1, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () ->
            new AxeItem(ModItemTier.OBSIDIAN, 4, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHER_STICK = ITEMS.register("nether_stick", () ->
            new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> NETHER_SWORD = ITEMS.register("nether_sword", () ->
            new SwordItem(ModItemTier.NETHER, 10, -0.08F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHER_PICKAXE = ITEMS.register("nether_pickaxe", () ->
            new PickaxeItem(ModItemTier.NETHER, 6, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHER_SHOVEL = ITEMS.register("nether_shovel", () ->
            new ShovelItem(ModItemTier.NETHER, -2, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHER_AXE = ITEMS.register("nether_axe", () ->
            new AxeItem(ModItemTier.NETHER, 8, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHER_HOE = ITEMS.register("nether_hoe", () ->
            new HoeItem(ModItemTier.NETHER, -4, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    //public static final RegistryObject<Item> NETHER_HAMMER = ITEMS.register("nether_hammer", () ->
    //        new TridentItem((new Item.Properties()).maxDamage(250).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> EMERALD_STICK = ITEMS.register("emerald_stick", () ->
            new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ModItemTier.EMERALD, 3, -0.08F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(ModItemTier.EMERALD, 1, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new ShovelItem(ModItemTier.EMERALD, 0, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(ModItemTier.EMERALD, 2, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new HoeItem(ModItemTier.EMERALD, -1, -1.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));}


