package net.cutefox.athyx.item;

import net.cutefox.athyx.Athyx;
import net.cutefox.athyx.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ATHYX = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Athyx.MOD_ID, "athyx"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.athyx"))
                    .icon(() -> new ItemStack(ModItems.ATHYX_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ATHYX_INGOT);
                        entries.add(ModItems.ATHYX_NUGGET);
                        entries.add(ModItems.RAW_ATHYX);

                        entries.add(ModBlocks.ATHYX_BLOCK);
                        entries.add(ModBlocks.RAW_ATHYX_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Athyx.LOGGER.info("Registering Item Groups for " + Athyx.MOD_ID);
    }

}
