package com.company;

public class Main {

    public static void main(String[] args) {
    HavingSuperpowers[] abilities = {new Warrior(), new Magical(), new Mental()};
        for (int i = 0; i < abilities.length ; i++) {
            abilities[i].applySuperpowers();
        }
    }
}
