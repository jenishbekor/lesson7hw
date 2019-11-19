package com.company;

public abstract class Player {
    private int health;
    private int hitDamage;
    private String name;

    public Player(int health, int hitDamage) {
        this.health = health;
        this.hitDamage = hitDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(int hitDamage) {
        this.hitDamage = hitDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void hit();

    @Override
    public String toString() {
        return this.name + " : "+this.health;
    }
}
