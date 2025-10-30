import net.terraxyz.treerific.block.ModBlocks;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;

public class ModPlacedFeatures {
  public static final ResourceKey<PlacedFeature> STONEWOOD_PLACED_KEY = registerKey("stonewood_placed");

 public static void bootstrap(BootstrapContext<PlacedFeature> context) {
   register(context, STONEWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.STONEWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.STONEWOOD_SAPLING.get()));
 }

}
