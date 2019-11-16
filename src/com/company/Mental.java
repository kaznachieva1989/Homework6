package com.company;

public class Mental extends Players implements HavingSuperpowers {
    @Override
    public void applySuperpowers() {
        System.out.println("Mental has " + this.getAttackTypes("Kinetic"));
    }
}
