package me.charass.tin3o;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TIN3O implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("tin3o");
    @Override
    public void onInitialize() {
        LOGGER.info("TIN3O is enabling.There is no out-of-order!!");
    }
}
