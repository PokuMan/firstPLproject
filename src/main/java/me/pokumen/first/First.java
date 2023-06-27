package me.pokumen.first;

import org.bukkit.plugin.java.JavaPlugin;

public final class First extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Done");
    }
}
