package net.cutefox.athyx.item;

import net.cutefox.athyx.Athyx;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static Item ATHYX_INGOT = registerItem("athyx_ingot", new Item(new FabricItemSettings()
            .fireproof()
            .rarity(Rarity.RARE)));
    public static Item ATHYX_NUGGET = registerItem("athyx_nugget", new Item(new FabricItemSettings()
            .fireproof()
            .rarity(Rarity.RARE)));
    public static Item RAW_ATHYX = registerItem("raw_athyx", new Item(new FabricItemSettings()
            .fireproof()
            .rarity(Rarity.RARE)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ATHYX_INGOT);
        entries.add(ATHYX_NUGGET);
        entries.add(RAW_ATHYX);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Athyx.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Athyx.LOGGER.info("Registering Mod Items for " + Athyx.MOD_ID);

    }
}
