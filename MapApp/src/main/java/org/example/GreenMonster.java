package org.example;

public class GreenMonster extends Monster {
    public GreenMonster(int x, int y) {
        super(x, y);
    }

    @Override
    public void greeting() {
        System.out.println("Monster at (" + getLocation()[0] + ", " + getLocation()[1] + "): I'm a green beast!");
    }
}