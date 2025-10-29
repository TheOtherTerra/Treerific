
package net.terraxyz.treerific.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.terraxyz.treerific.Treerific;
import net.terraxyz.treerific.block.ModBlocks;
import net.terraxyz.treerific.util.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Treerifc.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                ;


        tag(BlockTags.NEEDS_IRON_TOOL)
                ;

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                ;

        tag(ModTags.Blocks.NEEDS_SPECTRASTEEL_TOOL)
                ;

        tag(ModTags.Blocks.INCORRECT_FOR_SPECTRASTEEL_TOOL)
                ;
        
    }
}
