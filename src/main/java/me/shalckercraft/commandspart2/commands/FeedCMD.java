package me.shalckercraft.commandspart2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player p = (Player) sender;
            if (p.hasPermission("commandspart2.feed")) {
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.YELLOW + "Food set to max. Bon appetit.");
            } else {
                p.sendMessage(ChatColor.RED + "You do not have the require permission(commandspart2.feed) to run this command.");
            }

        }

        return true;
    }
}
