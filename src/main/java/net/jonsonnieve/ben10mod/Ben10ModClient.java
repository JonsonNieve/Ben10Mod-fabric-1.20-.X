package net.jonsonnieve.ben10mod;

import net.fabricmc.api.ClientModInitializer;
import net.jonsonnieve.ben10mod.util.ModModelPredicateProvider;

public class Ben10ModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
