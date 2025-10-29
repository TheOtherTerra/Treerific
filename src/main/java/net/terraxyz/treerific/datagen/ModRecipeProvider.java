package net.terraxyz.treerific.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.terraxyz.treerific.Treerific;
import net.terraxyz.treerific.block.ModBlocks;
import net.terraxyz.treerific.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.terraxyz.treerific.Treerific.MOD_ID;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        /*List<ItemLike> SPECTRASTEEL_CRYSTAL_SMELTABLES = List.of(ModItems.SPECTRASTEEL_SHARD.get(),
                ModBlocks.SPECTRASTEEL_ORE.get(), ModItems.SPECTRASTEEL_CRYSTAL.get());
*/

            //SHAPED RECIPES
       
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STONEWOOD_STAIRS.get(), 4).group("stonewood")
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.STONEWOOD_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_PLANKS.get()), has(ModBlocks.STONEWOOD_PLANKS.get()))
                .save(pRecipeOutput, "treerific:stonewood_stairs_one");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STONEWOOD_STAIRS.get(), 4).group("stonewood")
                .pattern("  A")
                .pattern(" AA")
                .pattern("AAA")
                .define('A', ModBlocks.STONEWOOD_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_PLANKS.get()), has(ModBlocks.STONEWOOD_PLANKS.get()))
                .save(pRecipeOutput, "treerific:stonewood_stairs_two");



                //SPECIAL GUYS
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEWOOD_SLAB.get(), ModBlocks.STONEWOOD_PLANKS.get());

        buttonBuilder(ModBlocks.STONEWOOD_BUTTON.get(), Ingredient.of(ModBlocks.STONEWOOD_PLANKS.get())).group("stonewood")
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_PLANKS.get()), has(ModBlocks.STONEWOOD_PLANKS.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.STONEWOOD_PRESSURE_PLATE.get(), ModBlocks.STONEWOOD_PLANKS.get());

        fenceBuilder(ModBlocks.STONEWOOD_FENCE.get(), Ingredient.of(ModBlocks.STONEWOOD_PLANKS.get())).group("stonewood")
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_PLANKS.get()), has(ModBlocks.STONEWOOD_PLANKS.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.STONEWOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.STONEWOOD_PLANKS.get())).group("stonewood")
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_PLANKS.get()), has(ModBlocks.STONEWOOD_PLANKS.get())).save(pRecipeOutput);
        wallBuilder(ModBlocks.STONEWOOD_WALL.get(), Ingredient.of(ModBlocks.STONEWOOD_PLANKS.get())).group("stonewood")
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_PLANKS.get()), has(ModBlocks.STONEWOOD_PLANKS.get()))
                .save(pRecipeOutput);
    
        doorBuilder(ModBlocks.STONEWOOD_DOOR.get(), Ingredient.of(ModBlocks.STONEWOOD_PLANKS.get())).group("stonewood")
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_PLANKS.get()), has(ModBlocks.STONEWOOD_PLANKS.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.STONEWOOD_TRAPDOOR.get(), Ingredient.of(ModItems.STONEWOOD_PLANKS.get())).group("stonewood")
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_PLANKS.get()), has(ModBlocks.STONEWOOD_PLANKS.get())).save(pRecipeOutput);


                      
                /*SMITHING
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.SPECTRASTEEL_UPGRADE_TEMPLATE.get()), // Template
                        Ingredient.of(Items.NETHERITE_CHESTPLATE),                // Base
                        Ingredient.of(ModItems.SPECTRASTEEL_INGOT.get()),         // Addition
                        RecipeCategory.COMBAT,                                    // Category
                        ModItems.SPECTRASTEEL_CHESTPLATE.get()                    // Result
                ).unlocks("has_spectrasteel", has(ModItems.SPECTRASTEEL_INGOT.get()))
                .save(pRecipeOutput, ResourceLocation.fromNamespaceAndPath("terraeclipse", "smithing/spectrasteel_chestplate_upgrade"));
*/

        /*SHAPELESS RECIPES
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SPECTRASTEEL_INGOT.get(), 9).group("spectrasteel")
                .requires(ModBlocks.SPECTRASTEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SPECTRASTEEL_BLOCK.get()), has(ModBlocks.SPECTRASTEEL_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.STONEWOOD_PLANKS.get(), 4).group("stonewood")
                .requires(ModBlocks.STONEWOOD_LOG.get())
                .unlockedBy(getHasName(ModBlocks.STONEWOOD_LOG.get()), has(ModBlocks.STONEWOOD_LOG.get())).save(pRecipeOutput);
*/


        /*oreSmelting(pRecipeOutput, SPECTRASTEEL_CRYSTAL_SMELTABLES, RecipeCategory.MISC, ModItems.SPECTRASTEEL_SHARD.get(), 0.25f, 200, "spectrasteel_shard").group("spectrasteel");
        oreBlasting(pRecipeOutput, SPECTRASTEEL_CRYSTAL_SMELTABLES, RecipeCategory.MISC, ModItems.SPECTRASTEEL_SHARD.get(), 0.25f, 100, "spectrasteel_shard").group("spectrasteel");
*/
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
