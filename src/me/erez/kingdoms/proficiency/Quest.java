package me.erez.kingdoms.proficiency;

public class Quest {
	
	private String name;
	private String description;
	private int requiredAmount;
	private int playerProgress;
	
	private double playerProgressPercent;
	
	public void calculateProgressPercent() {
		playerProgressPercent = (double) requiredAmount / (double) playerProgress;
	}
	
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRequiredAmount() {
		return requiredAmount;
	}

	public void setRequiredAmount(int requiredAmount) {
		this.requiredAmount = requiredAmount;
	}

	public int getPlayerProgress() {
		return playerProgress;
	}

	public void setPlayerProgress(int playerProgress) {
		this.playerProgress = playerProgress;
	}

	public double getPlayerProgressPercent() {
		return playerProgressPercent;
	}

	public void setPlayerProgressPercent(double playerProgressPercent) {
		this.playerProgressPercent = playerProgressPercent;
	}
	
	
	

}
