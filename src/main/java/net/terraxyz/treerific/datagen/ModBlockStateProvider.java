
package net.terraxyz.treerific.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.terraxyz.treerific.Treerific;
import net.terraxyz.treerific.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Treerific.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
      /*  blockWithItem(ModBlocks.SPECTRASTEEL_BLOCK);
        blockWithItem(ModBlocks.SPECTRASTEEL_ORE);
*/
        stairsBlock(ModBlocks.STONEWOOD_STAIRS.get(), blockTexture(ModBlocks.STONEWOOD_PLANKS.get()));
        slabBlock(ModBlocks.STONEWOOD_SLAB.get(), blockTexture(ModBlocks.STONEWOOD_PLANKS.get()), blockTexture(ModBlocks.STONEWOOD_PLANKS.get()));

        buttonBlock(ModBlocks.STONEWOOD_BUTTON.get(), blockTexture(ModBlocks.STONEWOOD_PLANKS.get()));
        pressurePlateBlock(ModBlocks.STONEWOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.STONEWOOD_PLANKS.get()));

        fenceBlock(ModBlocks.STONEWOOD_FENCE.get(), blockTexture(ModBlocks.STONEWOOD_PLANKS.get()));
        fenceGateBlock(ModBlocks.STONEWOOD_FENCE_GATE.get(), blockTexture(ModBlocks.STONEWOOD_PLANKS.get()));
        wallBlock(ModBlocks.STONEWOOD_WALL.get(), blockTexture(ModBlocks.STONEWOOD_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.STONEWOOD_DOOR.get(), modLoc("block/stonewood_door_bottom"), modLoc("block/stonewood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.STONEWOOD_TRAPDOOR.get(), modLoc("block/stonewood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.STONEWOOD_STAIRS);
        blockItem(ModBlocks.STONEWOOD_SLAB);
        blockItem(ModBlocks.STONEWOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.STONEWOOD_FENCE_GATE);
        blockItem(ModBlocks.STONEWOOD_TRAPDOOR, "_bottom");

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("treerific:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("treerific:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
