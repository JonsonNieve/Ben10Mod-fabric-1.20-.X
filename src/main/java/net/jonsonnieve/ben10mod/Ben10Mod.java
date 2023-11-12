package net.jonsonnieve.ben10mod;

import net.fabricmc.api.ModInitializer;

import net.jonsonnieve.ben10mod.item.ModItems;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ben10Mod implements ModInitializer {
	public static final String MOD_ID = "ben10mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Identifier OMNITRIX_SOUND_ID = new Identifier(Ben10Mod.MOD_ID, "omnitrix_sound");
	public static SoundEvent OMNITRIX_SOUND_EVENT = SoundEvent.of(OMNITRIX_SOUND_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		Registry.register(Registries.SOUND_EVENT, Ben10Mod.OMNITRIX_SOUND_ID, OMNITRIX_SOUND_EVENT);
		ModItems.registerModItems();
	}
}