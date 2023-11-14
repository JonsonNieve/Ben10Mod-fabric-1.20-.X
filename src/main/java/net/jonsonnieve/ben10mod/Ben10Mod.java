package net.jonsonnieve.ben10mod;

import net.fabricmc.api.ModInitializer;

import net.jonsonnieve.ben10mod.item.ModItemGroups;
import net.jonsonnieve.ben10mod.item.ModItems;
import net.jonsonnieve.ben10mod.util.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ben10Mod implements ModInitializer {
	public static final String MOD_ID = "ben10mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModSounds.registerModSounds();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}