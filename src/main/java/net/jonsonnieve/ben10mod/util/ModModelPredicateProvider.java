package net.jonsonnieve.ben10mod.util;

import net.jonsonnieve.ben10mod.item.ModItems;
import net.jonsonnieve.ben10mod.item.OmnitrixItem;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {
    public static void registerModModels(){
        registerOmnitrix();
    }

    private static void registerOmnitrix(){
        ModelPredicateProviderRegistry.register(ModItems.OMNITRIX, new Identifier("activated"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0F;
                    }

                    Item handItem = entity.getStackInHand(Hand.OFF_HAND).getItem();
                    NbtCompound nbt = entity.getStackInHand(Hand.OFF_HAND).getNbt();

                    if(handItem instanceof OmnitrixItem && nbt != null){
                        return nbt.getBoolean("isActivated") ? 1.0F : 0.0F;
                    }
                    else {
                        return 0.0F;
                    }
                }
        );
    }
}
