package com.company;

public class Mental extends Hero implements SuperSkill{

    public Mental(int health, int hitDamage, String type)
    {
        super(health,hitDamage,type);
        super.setName("Mental");
    }

    @Override
    public void applySuperSkill() {
        System.out.println("Mental helps other by increasing health.");
    }

    @Override
    public void hit() {
        System.out.println("Mental hits boss.");
    }
}
