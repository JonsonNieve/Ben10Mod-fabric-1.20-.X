package net.jonsonnieve.ben10mod.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.Text;

import java.awt.*;

public class ModHUDMessagesHelper {
    public static final Style GREEN_TEXT_STYLE = Style.EMPTY.withColor(Color.GREEN.getRGB());
    public static final Style BLUE_TEXT_STYLE = Style.EMPTY.withColor(Color.BLUE.getRGB());
    public static final Style RED_TEXT_STYLE = Style.EMPTY.withColor(Color.RED.getRGB());
    public static final Style YELLOW_TEXT_STYLE = Style.EMPTY.withColor(Color.YELLOW.getRGB());

    public static void showMessage(PlayerEntity player, String message, Style style, boolean overlay){
        player.sendMessage(
                Text.literal(message).setStyle(style),
                overlay
        );
    }
}
