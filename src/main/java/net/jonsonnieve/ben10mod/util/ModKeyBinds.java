package net.jonsonnieve.ben10mod.util;


import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.jonsonnieve.ben10mod.Ben10Mod;
import net.jonsonnieve.ben10mod.item.OmnitrixItem;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Hand;
import org.lwjgl.glfw.GLFW;

import static net.jonsonnieve.ben10mod.util.ModHUDMessagesHelper.GREEN_TEXT_STYLE;
import static net.jonsonnieve.ben10mod.util.ModHUDMessagesHelper.showMessage;

public class ModKeyBinds {
    public static void registerKeybindings(){
        registerOmnitrixKeyBinding();
    }

    private static void registerOmnitrixKeyBinding(){
        KeyBinding alienUpKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.ben10mod.change-alien-up", // The translation key of the keybinding's name
                InputUtil.Type.MOUSE, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_MOUSE_BUTTON_5, // The keycode of the key
                "category.ben10mod.change-alien-up" // The translation key of the keybinding's category.
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(client.player != null){
                Item handItem = client.player.getStackInHand(Hand.OFF_HAND).getItem();
                NbtCompound nbt = client.player.getStackInHand(Hand.OFF_HAND).getNbt();
                boolean isOmnitrixActivated = false;

                if(handItem instanceof OmnitrixItem && nbt != null){
                    isOmnitrixActivated = nbt.getBoolean("isActivated");
                }
                while (alienUpKeyBinding.wasPressed() && isOmnitrixActivated) {
                    client.player.playSound(ModSounds.OMNITRIX_CHANGE_ALIEN_SOUND_EVENT, 1.0f, 1.0f);
                    showMessage(client.player, Ben10Mod.getNextAlien(), GREEN_TEXT_STYLE, true);
                }
            }
        });

        KeyBinding alienDownKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.ben10mod.change-alien-down",
                InputUtil.Type.MOUSE,
                GLFW.GLFW_MOUSE_BUTTON_4,
                "category.ben10mod.change-alien-down"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(client.player != null){
                Item handItem = client.player.getStackInHand(Hand.OFF_HAND).getItem();
                NbtCompound nbt = client.player.getStackInHand(Hand.OFF_HAND).getNbt();
                boolean isOmnitrixActivated = false;

                if(handItem instanceof OmnitrixItem && nbt != null){
                    isOmnitrixActivated = nbt.getBoolean("isActivated");
                }
                while (alienDownKeyBinding.wasPressed() && isOmnitrixActivated) {
                    client.player.playSound(ModSounds.OMNITRIX_CHANGE_ALIEN_SOUND_EVENT, 1.0f, 1.0f);
                    showMessage(client.player, Ben10Mod.getPrevAlien(), GREEN_TEXT_STYLE, true);

                }
            }
        });
    }


}
