package net.terraxyz.treerific.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.terraxyz.treerific.Treerific;

import java.util.List;


//items
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Treerific.MOD_ID);

  /*New Item
    public static final RegistryObject<Item> SPECTRASTEEL_SHARD = ITEMS.register("spectrasteel_shard",
            () -> new Item(new Item.Properties()))
*/

            /*tools
    public static final RegistryObject<Item> SPECTRASTEEL_SWORD = ITEMS.register("spectrasteel_sword",
            () -> new SwordItem(ModToolTiers.SPECTRASTEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SPECTRASTEEL, 4, -2.4f))));
    public static final RegistryObject<Item> SPECTRASTEEL_PICKAXE = ITEMS.register("spectrasteel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPECTRASTEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SPECTRASTEEL, 2, -2.8f))));
    public static final RegistryObject<Item> SPECTRASTEEL_SHOVEL = ITEMS.register("spectrasteel_shovel",
            () -> new ShovelItem(ModToolTiers.SPECTRASTEEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SPECTRASTEEL, 2, -3.0f))));
    public static final RegistryObject<Item> SPECTRASTEEL_AXE = ITEMS.register("spectrasteel_axe",
            () -> new AxeItem(ModToolTiers.SPECTRASTEEL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SPECTRASTEEL, 7, -3.0f))));
    public static final RegistryObject<Item> SPECTRASTEEL_HOE = ITEMS.register("spectrasteel_hoe",
            () -> new HoeItem(ModToolTiers.SPECTRASTEEL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SPECTRASTEEL, 0, -3.0f))));
*/

            /*armor
    public static final RegistryObject<Item> SPECTRASTEEL_HELMET = ITEMS.register("spectrasteel_helmet",
            () -> new ArmorItem(ModArmorMaterials.SPECTRASTEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<Item> SPECTRASTEEL_CHESTPLATE = ITEMS.register("spectrasteel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SPECTRASTEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<Item> SPECTRASTEEL_LEGGINGS = ITEMS.register("spectrasteel_leggings",
            () -> new ArmorItem(ModArmorMaterials.SPECTRASTEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> SPECTRASTEEL_BOOTS = ITEMS.register("spectrasteel_boots",
            () -> new ArmorItem(ModArmorMaterials.SPECTRASTEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties()));
*/

            /*smithing upgrade
            public static final RegistryObject<Item> SPECTRASTEEL_UPGRADE_TEMPLATE =
                    ITEMS.register("spectrasteel_upgrade_template",
                            () -> new SmithingTemplateItem(
                                    Component.translatable("item.terraeclipse.spectrasteel_upgrade_template.applies_to"),
                                    Component.translatable("item.terraeclipse.spectrasteel_upgrade_template.ingredients"),
                                    Component.translatable("item.terraeclipse.spectrasteel_upgrade_template.title"),
                                    Component.translatable("item.terraeclipse.spectrasteel_upgrade_template.base_slot_description"),
                                    Component.translatable("item.terraeclipse.spectrasteel_upgrade_template.additions_slot_description"),
                                    List.of(ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_armor_slot_chestplate")),
                                    List.of(ResourceLocation.fromNamespaceAndPath("minecraft", "item/empty_slot_ingot"))
                            )
                    );
*/
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
