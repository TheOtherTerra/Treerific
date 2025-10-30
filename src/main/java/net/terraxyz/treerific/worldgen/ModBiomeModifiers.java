import net.minecraft.world.level.biome.Biomes;


public class ModBiomeModifiers {
  public static final ResourceKey<BiomeModifier> ADD_STONEWOOD_TREE = registerKey("add_tree_stonewood");
}

public static void bootstrap(BootstrapContext<BiomeModifier> context) {
  context.register(ADD_STONEWOOD_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.STONY_PEAKS)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.STONEWOOD_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
}
