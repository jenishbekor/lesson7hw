package com.company;

public class Warrior extends Hero implements SuperSkill{

    public Warrior(int health, int hitDamage, String type)
    {
        super(health,hitDamage,type);
        super.setName("Warrior");
    }

    @Override
    public void applySuperSkill() {
        System.out.println("Warrior kills Boss with its super power.");
    }

    @Override
    public void hit() {
        System.out.println("Warrior hits boss.");
    }
}
