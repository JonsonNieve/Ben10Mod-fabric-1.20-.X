package net.jonsonnieve.ben10mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jonsonnieve.ben10mod.Ben10Mod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item OMNITRIX = registerItem("omnitrix",
            new OmnitrixItem(
                    new FabricItemSettings().maxCount(1)
            )
    );

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Ben10Mod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Ben10Mod.LOGGER.info("Registering Mod items for " + Ben10Mod.MOD_ID);
    }
}
