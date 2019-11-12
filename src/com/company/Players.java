package com.company;

public class Players {
    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAttackTypes() {
        return attackTypes;
    }

    public void setAttackTypes(String attackTypes) {
        this.attackTypes = attackTypes;
    }

    private String attackTypes;

}
