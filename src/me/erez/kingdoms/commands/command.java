package me.erez.kingdoms.commands;
import me.erez.kingdoms.Main;
import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class command implements CommandExecutor {
    private Main plugin;
    
    public command(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("systemTime").setExecutor(this);
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	
    	Player player = (Player) sender;
    	
    	player.sendMessage("" + System.currentTimeMillis());
    	
    	
        
        return true;
    }
    
    
    
}