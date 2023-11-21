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
	private static final String[] ALIENS = {
			"Bestia",
			"Cuatro Brazos",
			"Materia Gris",
			"XLR8",
			"Ultra-T",
			"Diamante",
			"Insectoide",
			"Acuatico",
			"Fantasmatico",
			"Fuego"
	};

	private static int ALIEN_INDEX = ALIENS.length;


	@Override
	public void onInitialize() {
		ModSounds.registerModSounds();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}

	public static String getNextAlien(){
		return ALIENS[Math.floorMod(++ALIEN_INDEX, ALIENS.length)];
	};
	public static String getCurrentAlien(){
		return ALIENS[Math.floorMod(ALIEN_INDEX, ALIENS.length)];
	};

	public static String getPrevAlien(){
		return ALIENS[Math.floorMod(--ALIEN_INDEX, ALIENS.length)];
	};
}