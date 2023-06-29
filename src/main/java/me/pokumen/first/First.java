package me.pokumen.first;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public final class First extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin Di aktfkan");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin Di non aktfkan");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (cmd.getName().equalsIgnoreCase("hello")) {
         if (sender instanceof Player) {
             Player player = (Player) sender;
             player.sendMessage("Hallo, Selamat Datang Di Server");
         } else {
             sender.sendMessage("Perintah ini hanya dapat digunakan oleh pemain.");
         }
         return true;
     }
     return true;
    }
}
