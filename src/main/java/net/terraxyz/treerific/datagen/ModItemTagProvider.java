
package net.terraxyz.treerific.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.terraxyz.treerific.Treerific;
import net.terraxyz.treerific.item.ModItems;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput,
                              CompletableFuture<HolderLookup.Provider> provider,
                              CompletableFuture<TagsProvider.TagLookup<Block>> blockTags,
                              @Nullable ExistingFileHelper helper) {
        super(packOutput, provider, blockTags, Treerific.MOD_ID, helper);
    }

   /* @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SPECTRASTEEL_HELMET.get())
                .add(ModItems.SPECTRASTEEL_CHESTPLATE.get())
                .add(ModItems.SPECTRASTEEL_LEGGINGS.get())
                .add(ModItems.SPECTRASTEEL_BOOTS.get());
    */}

    /* Embedded model provider class
    public static class ModItemModelProvider extends ItemModelProvider {
        private static final LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

        static {
            trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
            trimMaterials.put(TrimMaterials.IRON, 0.2F);
            trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
            trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
            trimMaterials.put(TrimMaterials.COPPER, 0.5F);
            trimMaterials.put(TrimMaterials.GOLD, 0.6F);
            trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
            trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
            trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
            trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
       */ }

        public ModItemModelProvider(PackOutput output, ExistingFileHelper helper) {
            super(output, Treerific.MOD_ID, helper);
        }

       /* @Override
        protected void registerModels() {
            trimmedArmorItem(ModItems.SPECTRASTEEL_HELMET);
            trimmedArmorItem(ModItems.SPECTRASTEEL_CHESTPLATE);
            trimmedArmorItem(ModItems.SPECTRASTEEL_LEGGINGS);
            trimmedArmorItem(ModItems.SPECTRASTEEL_BOOTS);
        */}

        private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
            final String MOD_ID = Treerific.MOD_ID;

            /*if (itemRegistryObject.get() instanceof ArmorItem armorItem) {
                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                ResourceLocation baseItemLoc = itemRegistryObject.getId();

                trimMaterials.forEach((trimMaterial, trimValue) -> {
                    String trimTexturePath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                    String modelName = baseItemLoc.getPath() + "_" + trimMaterial.location().getPath() + "_trim";

                    ResourceLocation trimTextureLoc = ResourceLocation.fromNamespaceAndPath(MOD_ID, trimTexturePath);
                    ResourceLocation modelLoc = ResourceLocation.fromNamespaceAndPath(MOD_ID, "item/" + modelName);
*/

                    existingFileHelper.trackGenerated(trimTextureLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                    getBuilder(modelName)
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer0", MOD_ID + ":item/" + baseItemLoc.getPath())
                            .texture("layer1", trimTextureLoc);

                    withExistingParent(baseItemLoc.getPath(), mcLoc("item/generated"))
                            .override()
                            .model(new ModelFile.UncheckedModelFile(modelLoc))
                            .predicate(mcLoc("trim_type"), trimValue).end()
                            .texture("layer0", MOD_ID + ":item/" + baseItemLoc.getPath());
                });
            }
        }
    }
}
