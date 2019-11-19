package com.company;

public class Boss extends Player {
    private String defenceType;

    public Boss(int health, int hitDamage)
    {
        super(health,hitDamage);
        super.setName("Boss");
    }

    @Override
    public void hit() {
        System.out.println("Boss hits heros");
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }
}
