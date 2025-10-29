package net.terraxyz.treerific.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.terraxyz.treerific.TerraEclipse;
import net.terraxyz.treerific.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TerraEclipse.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TREERIFIC_TAB = CREATIVE_MODE_TABS.register("treerific_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STONEWOOD_SAPLING.get()))
                    .title(Component.translatable("creativetab.treerific.treerific_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.STONEWOOD_LOG.get());
                        output.accept(ModBlocks.STRIPPED_STONEWOOD_LOG.get());
                        output.accept(ModBlocks.STONEWOOD_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_STONEWOOD_WOOD.get());
                        output.accept(ModBlocks.STONEWOOD_PLANKS.get());
                        output.accept(ModBlocks.STONEWOOD_STAIRS.get());
                        output.accept(ModBlocks.STONEWOOD_SLAB.get());
                        output.accept(ModBlocks.STONEWOOD_FENCE.get());
                        output.accept(ModBlocks.STONEWOOD_FENCE_GATE.get());
                        output.accept(ModBlocks.STONEWOOD_WALL.get());
                        output.accept(ModBlocks.STONEWOOD_DOOR.get());
                        output.accept(ModBlocks.STONEWOOD_TRAPDOOR.get());
                        output.accept(ModBlocks.STONEWOOD_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.STONEWOOD_BUTTON.get());
                      
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
