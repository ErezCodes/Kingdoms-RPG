package me.erez.kingdoms.proficiency.hunter;

import java.util.ArrayList;

import org.bukkit.entity.Player;

import me.erez.kingdoms.proficiency.ProficiencyBase;
import me.erez.kingdoms.proficiency.Quest;

public class Hunter extends ProficiencyBase {

	public Hunter(Player player) {
		super(player);
	}
	
	public Hunter(Player player, int level, double xp, ArrayList<Quest> quests) {
		super(player, level, xp, quests);
	}
	
	
	

	

	
}