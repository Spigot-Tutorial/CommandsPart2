package me.shalckercraft.commandspart2;

import me.shalckercraft.commandspart2.commands.FeedCMD;
import me.shalckercraft.commandspart2.commands.GodCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class PLugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("god").setExecutor(new GodCMD());
        getCommand("feed").setExecutor(new FeedCMD());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
