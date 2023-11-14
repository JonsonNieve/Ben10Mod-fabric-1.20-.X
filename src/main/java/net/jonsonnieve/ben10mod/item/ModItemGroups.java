package net.jonsonnieve.ben10mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jonsonnieve.ben10mod.Ben10Mod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BEN10_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Ben10Mod.MOD_ID, "ben10"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OMNITRIX))
            .displayName(Text.translatable("itemgroup.ben10"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OMNITRIX);
                    })
            .build());

    public static void registerItemGroups(){
        Ben10Mod.LOGGER.info("Registering Item Groups for " + Ben10Mod.MOD_ID);
    }
}
