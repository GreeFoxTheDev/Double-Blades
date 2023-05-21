package greefox.doubleblades;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class DoubleBlades extends JavaPlugin {

    @Override
    public void onEnable() {
        Iron.init();
        Gold.init();
        Copper.init();
        Diamond.init();
        Bukkit.getPluginManager().registerEvents(new DBladesListener(this), this);
        Bukkit.getPluginManager().registerEvents(new AbilityListener(this), this);
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.AQUA + "***********************************");
        console.sendMessage(ChatColor.AQUA + "| Double Blade have been enabled! |");
        console.sendMessage(ChatColor.AQUA + "***********************************");
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.DARK_RED + "*************************************");
        console.sendMessage(ChatColor.DARK_RED + "| Double Blades have been disabled! |");
        console.sendMessage(ChatColor.DARK_RED + "*************************************");
    }
}
