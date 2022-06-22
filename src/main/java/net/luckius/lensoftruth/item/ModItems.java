package net.luckius.lensoftruth.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.luckius.lensoftruth.Mod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TRUTH_LENS = registerItem("lens_of_truth",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mod.MODID, name), item);
    }

    public static void registerModItems() {
        Mod.LOGGER.debug("Registering Mod Items for " + Mod.MODID);
    }
}
