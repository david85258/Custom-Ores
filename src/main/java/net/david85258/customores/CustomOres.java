package net.david85258.customores;

import net.david85258.customores.WorldGen.CustomChunkGenerator;
import org.bukkit.WorldCreator;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomOres extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new WorldCreator("test").generator(new CustomChunkGenerator()).createWorld();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
