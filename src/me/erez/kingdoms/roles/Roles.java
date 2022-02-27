package me.erez.kingdoms.roles;

import org.bukkit.entity.Player;

public class Roles {
	


	private Player player;
	private String playerName;
	
	
	private boolean isAlchemist = false;
	private boolean isBlacksmith = false;
	private boolean isEnchanter = false;
	private boolean isEngineer = false;
	private boolean isExplorer = false;
	private boolean isFarmer = false;
	private boolean isHunter = false;
	private boolean isKing = false;
	private boolean isLumberjack = false;
	private boolean isMiner = false;
	private boolean isWarrior = false;
	private boolean isWizard = false;
	
	private boolean isPeasant = true;
	
	
	
	public Roles(Player player, String playerName) {
		this.player = player;
		this.playerName = playerName;
	}
	
	
	
	
	public Roles(Player player, boolean isAlchemist, boolean isBlacksmith, boolean isEnchanter, boolean isEngineer,
			boolean isExplorer, boolean isFarmer, boolean isHunter, boolean isKing, boolean isLumberjack,
			boolean isMiner, boolean isWarrior, boolean isWizard, boolean isPeasant) {
		
		this.player = player;
		this.isAlchemist = isAlchemist;
		this.isBlacksmith = isBlacksmith;
		this.isEnchanter = isEnchanter;
		this.isEngineer = isEngineer;
		this.isExplorer = isExplorer;
		this.isFarmer = isFarmer;
		this.isHunter = isHunter;
		this.isKing = isKing;
		this.isLumberjack = isLumberjack;
		this.isMiner = isMiner;
		this.isWarrior = isWarrior;
		this.isWizard = isWizard;
		this.isPeasant = isPeasant;
	}




	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public boolean isKing() {
		return isKing;
	}
	public void setKing(boolean isKing) {
		this.isKing = isKing;
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
	public boolean isWizzard() {
		return isWizard;
	}
	public void setWizzard(boolean isWizzard) {
		this.isWizard = isWizzard;
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
	public boolean isWizard() {
		return isWizard;
	}
	public void setWizard(boolean isWizard) {
		this.isWizard = isWizard;
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
	public boolean isWarrior() {
		return isWarrior;
	}
	public void setWarrior(boolean isWarrior) {
		this.isWarrior = isWarrior;
	}
	public boolean isHunter() {
		return isHunter;
	}
	public void setHunter(boolean isHunter) {
		this.isHunter = isHunter;
	}
	public boolean isPeasant() {
		return isPeasant;
	}
	public void setPeasant(boolean isPeasant) {
		this.isPeasant = isPeasant;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
}