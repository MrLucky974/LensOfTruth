package net.luckius.lensoftruth;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.luckius.lensoftruth.Mod.MODID;

public class ModClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    @Override
    public void onInitializeClient() {
        LOGGER.info("[Lens Of Truth] - Mod client initialization");
    }
}
