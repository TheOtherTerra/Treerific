public class ModConfiguredFeatures {
  public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
    register(
      context, WALNUT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
        new TwoLayersFeatureSize(1, 0, 2)).dirt(BlockStateProvider.simple(Blocks.STONE)).build());
  }
}
