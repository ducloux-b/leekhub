package io.battlearena.leekhub.model.entity;

public class Player {
	String name;
	int health;
	int bullet;
	int shield;
	boolean focused;
	
	public Player() {
		super();
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getHealth() {
		return health;
	}

	public final void setHealth(int health) {
		this.health = health;
	}

	public final int getBullet() {
		return bullet;
	}

	public final void setBullet(int bullet) {
		this.bullet = bullet;
	}

	public final int getShield() {
		return shield;
	}

	public final void setShield(int shield) {
		this.shield = shield;
	}

	public final boolean isFocused() {
		return focused;
	}

	public final void setFocused(boolean focused) {
		this.focused = focused;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + ", bullet=" + bullet + ", shield=" + shield
				+ ", focused=" + focused + "]";
	}
	

}
