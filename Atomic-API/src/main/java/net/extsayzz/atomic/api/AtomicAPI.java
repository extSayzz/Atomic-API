package net.extsayzz.atomic.api;

import lombok.Getter;
import net.extsayzz.atomic.api.init.AtomicHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class AtomicAPI extends JavaPlugin {

    @Getter
    private static AtomicAPI instance;

    @Getter
    private AtomicHandler atomicHandler;

    @Override
    public void onEnable() {
        instance = this;
        atomicHandler = new AtomicHandler();

    }


    @Override
    public void onDisable() {

    }
}
