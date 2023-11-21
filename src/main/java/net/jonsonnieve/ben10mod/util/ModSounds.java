package net.jonsonnieve.ben10mod.util;

import net.jonsonnieve.ben10mod.Ben10Mod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier OMNITRIX_ACTIVATED_SOUND_ID = new Identifier(Ben10Mod.MOD_ID, "omnitrix_activated");
    public static final SoundEvent OMNITRIX_ACTIVATED_SOUND_EVENT = SoundEvent.of(OMNITRIX_ACTIVATED_SOUND_ID);
    public static final Identifier OMNITRIX_CHANGE_ALIEN_SOUND_ID = new Identifier(Ben10Mod.MOD_ID, "omnitrix_change_alien");
    public static final SoundEvent OMNITRIX_CHANGE_ALIEN_SOUND_EVENT = SoundEvent.of(OMNITRIX_CHANGE_ALIEN_SOUND_ID);
    public static final Identifier OMNITRIX_TRANSFORM_SOUND_ID = new Identifier(Ben10Mod.MOD_ID, "omnitrix_transform");
    public static final SoundEvent OMNITRIX_TRANSFORM_SOUND_EVENT = SoundEvent.of(OMNITRIX_TRANSFORM_SOUND_ID);


    public static void registerModSounds(){
        registerSound(OMNITRIX_ACTIVATED_SOUND_ID, OMNITRIX_ACTIVATED_SOUND_EVENT);
        registerSound(OMNITRIX_CHANGE_ALIEN_SOUND_ID, OMNITRIX_CHANGE_ALIEN_SOUND_EVENT);
        registerSound(OMNITRIX_TRANSFORM_SOUND_ID, OMNITRIX_TRANSFORM_SOUND_EVENT);
    }

    private static void registerSound(Identifier id, SoundEvent event){
        Registry.register(Registries.SOUND_EVENT, id, event);
    }
}
