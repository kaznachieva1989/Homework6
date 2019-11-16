package com.company;

import java.io.PrintStream;

public class Warrior extends Players implements HavingSuperpowers {

    @Override
    public void applySuperpowers() {
        System.out.println("Warrior has " + this.getAttackTypes("Physical"));

    }
}
