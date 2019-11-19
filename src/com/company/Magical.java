package com.company;

public class Magical extends Hero implements SuperSkill{

    public Magical(int health, int hitDamage, String type)
    {
        super(health,hitDamage,type);
        super.setName("Magical");
    }

    @Override
    public void applySuperSkill() {
        System.out.println("Magical hits with super power.");
    }

    @Override
    public void hit() {
        System.out.println("Magical hits to Boss");
    }
}
