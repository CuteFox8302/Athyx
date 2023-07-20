package net.cutefox.athyx;

import  net.cutefox.athyx.block.ModBlocks;
import net.cutefox.athyx.item.ModItemGroups;
import net.cutefox.athyx.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Athyx implements ModInitializer {
	public static final String MOD_ID = "athyx";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

	}
}