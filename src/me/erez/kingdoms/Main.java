package me.erez.kingdoms;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.erez.kingdoms.files.DataManager;
import me.erez.kingdoms.listeners.Join;
import me.erez.kingdoms.proficiency.ProficiencyHandler;
import me.erez.kingdoms.proficiency.alchemist.Alchemist;
import me.erez.kingdoms.proficiency.blacksmith.Blacksmith;
import me.erez.kingdoms.proficiency.enchanter.Enchanter;
import me.erez.kingdoms.proficiency.engineer.Engineer;
import me.erez.kingdoms.proficiency.explorer.Explorer;
import me.erez.kingdoms.proficiency.farmer.Farmer;
import me.erez.kingdoms.proficiency.hunter.Hunter;
import me.erez.kingdoms.proficiency.lumberjack.Lumberjack;
import me.erez.kingdoms.proficiency.miner.Miner;
import net.md_5.bungee.api.ChatColor;


public class Main extends JavaPlugin {
	
	//data.yml handler
	public DataManager data;
	
	//ArrayLists
	public ArrayList<ProficiencyHandler> proficiencies = new ArrayList<ProficiencyHandler>();
	
	public ArrayList<Alchemist> alchemists = new ArrayList<Alchemist>();
	public ArrayList<Blacksmith> blacksmiths = new ArrayList<Blacksmith>();
	public ArrayList<Enchanter> enchanters = new ArrayList<Enchanter>();
	public ArrayList<Engineer> engineers = new ArrayList<Engineer>();
	public ArrayList<Explorer> explorers = new ArrayList<Explorer>();
	public ArrayList<Farmer> farmers = new ArrayList<Farmer>();
	public ArrayList<Hunter> hunters = new ArrayList<Hunter>();
	public ArrayList<Lumberjack> lumberjacks = new ArrayList<Lumberjack>();
	public ArrayList<Miner> miners = new ArrayList<Miner>();

	
	
	
	
	@Override
	public void onEnable() {
		
		this.data = new DataManager(this);
		data.reloadConfig();
		
		new Join(this);
		
		
		for(Player player : Bukkit.getOnlinePlayers()) {
			handleDataFile(player);
		}
		
		
		
	}
	
	
	public void handleDataFile(Player player) {
		String uuid = player.getUniqueId().toString();
		ProficiencyHandler proficiencyHandler;
				
		
		
		data.reloadConfig();
		//See if the player has joined the server
		if(!(data.getConfig().contains("proficiencies." + uuid))) { 
			
			data.getConfig().set("proficiencies." + uuid + ".playerName", player.getName());
			
			data.getConfig().set("proficiencies." + uuid + ".isAlchemist", false);
			data.getConfig().set("proficiencies." + uuid + ".isBlacksmith", false);
			data.getConfig().set("proficiencies." + uuid + ".isEnchanter", false);
			data.getConfig().set("proficiencies." + uuid + ".isEngineer", false);
			data.getConfig().set("proficiencies." + uuid + ".isExplorer", false);
			data.getConfig().set("proficiencies." + uuid + ".isFarmer", false);
			data.getConfig().set("proficiencies." + uuid + ".isHunter", false);
			data.getConfig().set("proficiencies." + uuid + ".isLumberjack", false);
			data.getConfig().set("proficiencies." + uuid + ".isMiner", false);

			
			data.saveConfig();
			
			proficiencyHandler = new ProficiencyHandler(player, player.getName());
			proficiencies.add(proficiencyHandler);
			
			Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " has joined the Kingdoms server for the first time!");
			
			return;
			
		}
		
		boolean isAlchemist = data.getConfig().getBoolean("proficiencies." + uuid + "isAlchemist");
		boolean isBlacksmith = data.getConfig().getBoolean("proficiencies." + uuid + "isBlacksmith");
		boolean isEnchanter = data.getConfig().getBoolean("proficiencies." + uuid + ".isEnchanter");
		boolean isEngineer = data.getConfig().getBoolean("proficiencies." + uuid + ".isEngineer");
		boolean isExplorer = data.getConfig().getBoolean("proficiencies." + uuid + ".isExplorer");
		boolean isFarmer = data.getConfig().getBoolean("proficiencies." + uuid + ".isFarmer");
		boolean isHunter = data.getConfig().getBoolean("proficiencies." + uuid + ".isHunter");
		boolean isLumberjack = data.getConfig().getBoolean("proficiencies." + uuid + ".isLumberjack");
		boolean isMiner = data.getConfig().getBoolean("proficiencies." + uuid + ".isMiner");

		
		proficiencyHandler = new ProficiencyHandler(player, isAlchemist, isBlacksmith, isEnchanter, isEngineer,
				isExplorer, isFarmer, isHunter, isLumberjack, isMiner);
		
		proficiencies.add(proficiencyHandler);

		
	}

}