package me.erez.kingdoms.proficiency;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ProficiencyBase {
	
	public ProficiencyBase(Player player) {
		this.player = player;
	}
	
	public ProficiencyBase(Player player, int level, double xp, ArrayList<Quest> quests) {
		this.player = player;
		this.level = level;
		this.xp = xp;
		this.quests = quests;
	}
	
	
	protected Player player;
	protected int level = 1;
	protected double xp = 0;
	protected ArrayList<Quest> quests = new ArrayList<Quest>();
	protected ArrayList<ItemStack> kit = new ArrayList<ItemStack>();
	
	
	

}
