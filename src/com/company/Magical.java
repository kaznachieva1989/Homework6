package com.company;

public class Magical extends Players implements HavingSuperpowers{
    @Override
    public void applySuperpowers() {
        System.out.println("Magical has " + this.getAttackTypes("Magic"));
    }
}
