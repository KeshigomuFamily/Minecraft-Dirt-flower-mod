package com.example.examplemod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;


import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    DIRT(3, 17, 9.0F, 2.0F, 14, () -> Ingredient.fromItems(Items.DIRT)),
    FLOWER(1, 653, 9.0F, 1.0F, 22, () -> Ingredient.fromTag(ItemTags.TALL_FLOWERS)),
    GLASS(1, 54, 9.0F, 4.0F, 15, () -> Ingredient.fromItems(Items.GLASS)),
    OBSIDIAN(2, 1324, 9.0F, 4.0F, 18, () -> Ingredient.fromItems(Items.OBSIDIAN)),
    NETHER(4, 700, 9.0F, 20.0F, 6, () -> Ingredient.fromItems(Items.NETHER_STAR)),
    EMERALD(3, 1024, 9.0F, 5.0F, 22, () -> Ingredient.fromItems(Items.EMERALD));
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }
    {

    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() { return this.repairMaterial.get(); }
}