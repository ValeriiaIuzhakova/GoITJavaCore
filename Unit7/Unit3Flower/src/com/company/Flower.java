package com.company;

import java.awt.*;
import java.util.Date;

class Flower {
    private String groupPlants;

    protected int lenght;
    protected boolean smell;

    protected Date bloomTime;
    protected Color color;
    protected String name;
    protected String shape;

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