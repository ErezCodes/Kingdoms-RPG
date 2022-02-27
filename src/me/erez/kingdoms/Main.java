package me.erez.kingdoms;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.erez.kingdoms.files.DataManager;
import me.erez.kingdoms.roles.Roles;
import me.erez.kingdoms.roles.alchemist.Alchemist;
import me.erez.kingdoms.roles.blacksmith.Blacksmith;
import me.erez.kingdoms.roles.enchanter.Enchanter;
import me.erez.kingdoms.roles.engineer.Engineer;
import me.erez.kingdoms.roles.explorer.Explorer;
import me.erez.kingdoms.roles.farmer.Farmer;
import me.erez.kingdoms.roles.hunter.Hunter;
import me.erez.kingdoms.roles.king.King;
import me.erez.kingdoms.roles.lumberjack.Lumberjack;
import me.erez.kingdoms.roles.miner.Miner;
import me.erez.kingdoms.roles.warrior.Warrior;
import me.erez.kingdoms.roles.wizard.Wizard;

public class Main extends JavaPlugin {
	
	//data.yml handler
	public DataManager data;
	
	//ArrayLists
	public ArrayList<Roles> roles = new ArrayList<Roles>();
	
	public ArrayList<Alchemist> alchemists = new ArrayList<Alchemist>();
	public ArrayList<Blacksmith> blacksmiths = new ArrayList<Blacksmith>();
	public ArrayList<Enchanter> enchanters = new ArrayList<Enchanter>();
	public ArrayList<Engineer> engineers = new ArrayList<Engineer>();
	public ArrayList<Explorer> explorers = new ArrayList<Explorer>();
	public ArrayList<Farmer> farmers = new ArrayList<Farmer>();
	public ArrayList<Hunter> hunters = new ArrayList<Hunter>();
	public ArrayList<King> kings = new ArrayList<King>();
	public ArrayList<Lumberjack> lumberjacks = new ArrayList<Lumberjack>();
	public ArrayList<Miner> miners = new ArrayList<Miner>();
	public ArrayList<Warrior> warriors = new ArrayList<Warrior>();
	public ArrayList<Wizard> wizards = new ArrayList<Wizard>();
	
	
	
	
	@Override
	public void onEnable() {
		
		this.data = new DataManager(this);
		data.reloadConfig();
		
	}

}