package me.shalckercraft.commandspart2;

import me.shalckercraft.commandspart2.commands.FeedCommand;
import me.shalckercraft.commandspart2.commands.GodCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PLugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
