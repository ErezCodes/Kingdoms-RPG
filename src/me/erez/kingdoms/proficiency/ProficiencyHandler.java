package me.erez.kingdoms.proficiency;

import org.bukkit.entity.Player;

public class ProficiencyHandler {
	


	private Player player;
	private String playerName;
	
	
	private boolean isAlchemist = false;
	private boolean isBlacksmith = false;
	private boolean isEnchanter = false;
	private boolean isEngineer = false;
	private boolean isExplorer = false;
	private boolean isFarmer = false;
	private boolean isHunter = false;
	private boolean isLumberjack = false;
	private boolean isMiner = false;		
	
	
	public ProficiencyHandler(Player player, String playerName) {
		this.player = player;
		this.playerName = playerName;
	}
	
	
	
	
	public ProficiencyHandler(Player player, boolean isAlchemist, boolean isBlacksmith, boolean isEnchanter, boolean isEngineer,
			boolean isExplorer, boolean isFarmer, boolean isHunter, boolean isLumberjack,
			boolean isMiner) {
		
		this.player = player;
		this.isAlchemist = isAlchemist;
		this.isBlacksmith = isBlacksmith;
		this.isEnchanter = isEnchanter;
		this.isEngineer = isEngineer;
		this.isExplorer = isExplorer;
		this.isFarmer = isFarmer;
		this.isHunter = isHunter;
		this.isLumberjack = isLumberjack;
		this.isMiner = isMiner;
	}




	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public boolean isEngineer() {
		return isEngineer;
	}
	public void setEngineer(boolean isEngineer) {
		this.isEngineer = isEngineer;
	}
	public boolean isAlchemist() {
		return isAlchemist;
	}
	public void setAlchemist(boolean isAlchemist) {
		this.isAlchemist = isAlchemist;
	}
	public boolean isEnchanter() {
		return isEnchanter;
	}
	public void setEnchanter(boolean isEnchanter) {
		this.isEnchanter = isEnchanter;
	}
	public boolean isExplorer() {
		return isExplorer;
	}
	public void setExplorer(boolean isExplorer) {
		this.isExplorer = isExplorer;
	}
	public boolean isLumberjack() {
		return isLumberjack;
	}
	public void setLumberjack(boolean isLumberjack) {
		this.isLumberjack = isLumberjack;
	}
	public boolean isMiner() {
		return isMiner;
	}
	public void setMiner(boolean isMiner) {
		this.isMiner = isMiner;
	}
	public boolean isFarmer() {
		return isFarmer;
	}
	public void setFarmer(boolean isFarmer) {
		this.isFarmer = isFarmer;
	}
	public boolean isBlacksmith() {
		return isBlacksmith;
	}
	public void setBlacksmith(boolean isBlacksmith) {
		this.isBlacksmith = isBlacksmith;
	}
	public boolean isHunter() {
		return isHunter;
	}
	public void setHunter(boolean isHunter) {
		this.isHunter = isHunter;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
}