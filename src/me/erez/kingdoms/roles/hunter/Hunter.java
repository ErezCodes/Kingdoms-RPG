package me.erez.kingdoms.roles.hunter;

import java.util.HashMap;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;

import me.erez.kingdoms.roles.Roles;
import net.md_5.bungee.api.ChatColor;

public class Hunter {
	
	public Hunter(Roles role) {
		this.role = role;
	}
	
	//defaults
	private Roles role;
	private int level = 1;
	private double xp = 0;
	private HashMap<String, Double> quests = new HashMap<String, Double>(); //String: quest itself | Double: xp amount for the quest
	
	//Pet
	private String petName = role.getPlayerName() + "'s bear";
	private Double petHealth;
	private boolean isPetDead = false;
	private PolarBear petBear;
	private double petTimeRemaining;
	private ChatColor petBearNameColor = ChatColor.WHITE;
	
	//Intended to only be used once
//	public void constructPet() {
//		petName = role.getPlayer().getName() + "'s Bear";
//	}
	
	
	public void spawnBear() {
		
		Player player = role.getPlayer();
		petBear = (PolarBear) role.getPlayer().getWorld().spawnEntity(player.getLocation(), EntityType.POLAR_BEAR);
		petBear.setCustomName(petBearNameColor + petName);
		petBear.setCustomNameVisible(true);
		
		petHealth = petBear.getHealth();
		isPetDead = false;
		
	}
	
	
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getXp() {
		return xp;
	}
	public void setXp(double xp) {
		this.xp = xp;
	}
	public HashMap<String, Double> getQuests() {
		return quests;
	}
	public void setQuests(HashMap<String, Double> quests) {
		this.quests = quests;
	}
	

	
}