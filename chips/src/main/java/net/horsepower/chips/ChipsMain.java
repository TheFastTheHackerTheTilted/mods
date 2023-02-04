package net.horsepower.chips;

import net.fabricmc.api.ModInitializer;
import net.horsepower.chips.config.ModConfigs;
import net.horsepower.chips.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChipsMain implements ModInitializer {

	public static final String MOD_ID = "chips";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfigs.registerConfigs();

		ModItems.registerItems();


	}
}
