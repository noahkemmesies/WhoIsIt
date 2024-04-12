package Person.Head;

import Person.Person;

import java.awt.*;

public class Head<T extends Headgear> {

    private final Hair hair;
    private final T headgear;

    public Head(Hair hair, T headgear) {
        this.hair = hair;
        this.headgear = headgear;
    }


    public Hair getHair() {
        return hair;
    }

    public Headgear getHeadgear() {
        return headgear;
    }

    public boolean compareTo(Head anotherH) {
        return getHair().compareTo(anotherH.getHair()) && getHeadgear().compareTo(anotherH.getHeadgear());
    }


    public static Head generateRandomHead() {
        return new Head(Hair.generateRandomHair(), Headgear.generateRandomHeadgear());
    }
}