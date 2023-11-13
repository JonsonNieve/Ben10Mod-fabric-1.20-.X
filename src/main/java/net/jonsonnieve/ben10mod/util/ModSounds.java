package net.jonsonnieve.ben10mod.util;

import net.jonsonnieve.ben10mod.Ben10Mod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier OMNITRIX_SOUND_ID = new Identifier(Ben10Mod.MOD_ID, "omnitrix_sound");
    public static SoundEvent OMNITRIX_SOUND_EVENT = SoundEvent.of(OMNITRIX_SOUND_ID);

    public static void registerModSounds(){
        registerSound(OMNITRIX_SOUND_ID, OMNITRIX_SOUND_EVENT);
    }

    private static void registerSound(Identifier id, SoundEvent event){
        Registry.register(Registries.SOUND_EVENT, id, event);
    }
}
