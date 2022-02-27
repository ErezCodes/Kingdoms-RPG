package me.erez.kingdoms.listeners;

import me.erez.kingdoms.Main;
import me.erez.kingdoms.roles.Roles;

import java.util.ArrayList;
import java.util.Arrays;
import org.bukkit.Bukkit;
//import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ComponentBuilder;

public class Join implements Listener{
	private Main plugin;
	
	public Join(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	

	
	@EventHandler
	public void JoinEvent(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		String uuid = player.getUniqueId().toString();
		
		
		
		plugin.data.reloadConfig();
		//See if the player has joined the server
		if(!(plugin.data.getConfig().contains("roles." + uuid))) { 
			
			plugin.data.getConfig().set("roles. " + uuid + ".playerName", player.getName());
			plugin.data.getConfig().set("roles." + uuid + ".isAlchemist", false);
			plugin.data.getConfig().set("roles." + uuid + ".isBlacksmith", false);
			plugin.data.getConfig().set("roles." + uuid + ".isEnchanter", false);
			plugin.data.getConfig().set("roles." + uuid + ".isEngineer", false);
			plugin.data.getConfig().set("roles." + uuid + ".isExplorer", false);
			plugin.data.getConfig().set("roles." + uuid + ".isFarmer", false);
			plugin.data.getConfig().set("roles." + uuid + ".isHunter", false);
			plugin.data.getConfig().set("roles." + uuid + ".isKing", false);
			plugin.data.getConfig().set("roles." + uuid + ".isLumberjack", false);
			plugin.data.getConfig().set("roles." + uuid + ".isMiner", false);
			plugin.data.getConfig().set("roles." + uuid + ".isWarrior", false);
			plugin.data.getConfig().set("roles." + uuid + ".isWizard", false);
			plugin.data.getConfig().set("roles." + uuid + ".isPeasant", true);
			
			plugin.data.saveConfig();
			
			Roles role = new Roles(player, player.getName());
			plugin.roles.add(role);
			
			return;
			
		}
		
		boolean isAlchemist = plugin.data.getConfig().getBoolean("roles." + uuid + "isAlchemist");
		boolean isBlacksmith = plugin.data.getConfig().getBoolean("roles." + uuid + "isBlacksmith");
		boolean isEnchanter = plugin.data.getConfig().getBoolean("roles." + uuid + ".isEnchanter");
		boolean isEngineer = plugin.data.getConfig().getBoolean("roles." + uuid + ".isEngineer");
		boolean isExplorer = plugin.data.getConfig().getBoolean("roles." + uuid + ".isExplorer");
		boolean isFarmer = plugin.data.getConfig().getBoolean("roles." + uuid + ".isFarmer");
		boolean isHunter = plugin.data.getConfig().getBoolean("roles." + uuid + ".isHunter");
		boolean isKing = plugin.data.getConfig().getBoolean("roles." + uuid + ".isKing");
		boolean isLumberjack = plugin.data.getConfig().getBoolean("roles." + uuid + ".isLumberjack");
		boolean isMiner = plugin.data.getConfig().getBoolean("roles." + uuid + ".isMiner");
		boolean isWarrior = plugin.data.getConfig().getBoolean("roles." + uuid + ".isWarrior");
		boolean isWizard = plugin.data.getConfig().getBoolean("roles." + uuid + ".isWizard");
		boolean isPeasant = plugin.data.getConfig().getBoolean("roles." + uuid + ".isPeasant");
		
		Roles role = new Roles(player, isAlchemist, isBlacksmith, isEnchanter, isEngineer,
				isExplorer, isFarmer, isHunter, isKing, isLumberjack, isMiner, isWarrior, isWizard, isPeasant);
		
		plugin.roles.add(role);

		
		
	
		
	}

		
		
    protected ItemStack createGuiItem(final Material material, int amount, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, amount);
        final ItemMeta meta = item.getItemMeta();

        // Set the name of the item
        meta.setDisplayName(name);

        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }
    
    

}