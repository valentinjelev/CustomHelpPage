package me.codedcrown.customhelppage;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomHelpPage extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("CustomHelpPage е стартиран успешно!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("CustomHelpPage е изключен успешно!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("help")) {
            if (sender instanceof Player) {
                // player
                Player player = (Player) sender;
                String name = player.getName();
                if (player.hasPermission("help.use")) {
                    player.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "---------------------------------------");
                    player.sendMessage(ChatColor.GRAY + "✦ " + ChatColor.WHITE + "Здравей, " + ChatColor.LIGHT_PURPLE + name + "" + ChatColor.WHITE + " ! " + ChatColor.GRAY + "✦ ");
                    player.sendMessage(ChatColor.GRAY + "➥ " + ChatColor.WHITE + "Прочети правилата ни чрез " + ChatColor.GRAY + "➜ " + ChatColor.LIGHT_PURPLE + "/pravilnik");
                    player.sendMessage(ChatColor.GRAY + "➥ " + ChatColor.WHITE + "Можеш да видиш екипа, чрез менюто " + ChatColor.GRAY + "➜ " + ChatColor.LIGHT_PURPLE + "/ekip");
                    player.sendMessage(ChatColor.GRAY + "➥ " + ChatColor.WHITE + "Виж социалните ни мрежи чрез " + ChatColor.GRAY + "➜ " + ChatColor.LIGHT_PURPLE + "/links");
                    player.sendMessage(ChatColor.GRAY + "➥ " + ChatColor.WHITE + "Започни работа чрез " + ChatColor.GRAY + "➜ " + ChatColor.LIGHT_PURPLE + "/jobs");
                    player.sendMessage(ChatColor.GRAY + "➥ " + ChatColor.WHITE + "Купувай и продавай бързо чрез " + ChatColor.GRAY + "➜ " + ChatColor.LIGHT_PURPLE + "/shop");
                    player.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "---------------------------------------");
                    return true;
                }
                player.sendMessage(ChatColor.RED + "Нямате право да използвате тази команда!");
                return true;
            }
        }

        return false;
    }
}
