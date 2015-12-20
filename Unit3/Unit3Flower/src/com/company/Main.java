package com.company;

import java.awt.*;
import java.util.Date;

class Bouquet {
    private int flowersNumber;
    private  String wrapper;
    private double price;

    public Bouquet() {}

    public boolean addFlower(Flower flower) {
        System.out.println("A flower " + flower.getName() + " is added to the buquet");
        return true;
    }

    public boolean removeFlower(Flower flower) {
        System.out.println("A flower is removed");
        return true;
    }

    public boolean create(String bouquet) {
        System.out.println("A bouquet is created");
        return true;
    }

}

class Flower {
    private String shape;
    private boolean smell;
    private int lenght;
    private String name;

    public Flower(String name) {
        this.name = name;
    }

    public void grow() {
        System.out.println("Flower's shape");
    }

    public void smell() {
        System.out.println("Flower's smell");
    }

    public String getName() {
        return this.name;
    }
}

class Rose extends Flower {
    private Color color;
    private Date bloomTime;

    public Rose(String name) {
        super(name);
    }

    public void bloom() {
        System.out.println("A rose bloom");
    }
}

class Rosebush {
    private Color color;
    private String name;
    private Date bloomTime;
    private Rose[] roses;

    public Rosebush(String name, int size) {
        this.name = name;
        this.roses = new Rose[size];
    }

    public void bloom() {
        System.out.println("A rosebush bloom");
    }
}

class Chamomile extends Flower {
    private Color color;
    private Date bloomTime;

    public Chamomile(String name) {
        super(name);
    }

    public void bloom() {
        System.out.println("A chamomile bloom");
    }
}

class Astra extends Flower {
    private Color color;
    private Date bloomTime;

    public Astra(String name) {
        super(name);
    }

    public void bloom() {
        System.out.println("An astra bloom");
    }
}

class Tulip extends Flower {
    private Color color;
    private Date bloomTime;

    public Tulip(String name) {
        super(name);
    }

    public void bloom() {
        System.out.println("A tulip bloom");
    }
}

public class Main {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        bouquet.create("Bouquet has been created");

        Rose rose = new Rose("Rose");
        Chamomile chamomile = new Chamomile("Chamomile");
        Astra astra = new Astra("Astra");
        Tulip tulip = new Tulip("Tulip");
        Rosebush roseBush = new Rosebush("Rosebush", 4);

        bouquet.addFlower(rose);
        bouquet.addFlower(chamomile);
        bouquet.addFlower(astra);
        bouquet.addFlower(tulip);
    }
}
