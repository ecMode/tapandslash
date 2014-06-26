package com.irlheroes.tapandslash.common;

public class Character {
	private String name;
	private int maxHealth;
	private int maxAttack;
	private int imgId;
	
	public Character(String name)
	{
		this.setName(name);
		this.setMaxHealth(100);
		this.setMaxAttack(10);
		this.imgId = Constants.defaultCharacterImage;
	}
	
	public Character(String name, int maxHealth, int maxAttack, int imgId)
	{
		this.setName(name);
		this.setMaxHealth(maxHealth);
		this.setMaxAttack(maxAttack);
		this.imgId = imgId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getMaxAttack() {
		return maxAttack;
	}

	public void setMaxAttack(int maxAttack) {
		this.maxAttack = maxAttack;
	}

	public int getImgSource() {
		return imgId;
	}

	public void setImgSource(int imgSource) {
		this.imgId = imgSource;
	}
	
	
	
}
