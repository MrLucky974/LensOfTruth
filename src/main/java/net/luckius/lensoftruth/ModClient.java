package net.luckius.lensoftruth;

import net.fabricmc.api.ClientModInitializer;

public class ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Mod.LOGGER.info("[Lens Of Truth] - Mod client initialization");
    }
}
