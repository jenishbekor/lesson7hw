package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        Boss boss=new Boss(750, 50);
        System.out.println(boss);

        Warrior warrior=new Warrior(250,30,"Warrior");
        System.out.println(warrior);

        Magical magical=new Magical(250, 20, "Magical");
        System.out.println(magical);

        Mental mental=new Mental(250, 10,"Mental");
        System.out.println(mental);
    }
}
