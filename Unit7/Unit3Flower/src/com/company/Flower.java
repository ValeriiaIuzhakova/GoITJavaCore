package com.company;

import java.awt.*;
import java.util.Date;

class Flower {
    private int lenght;
    private boolean smell;

    private String name;
    private String shape;

    protected Date bloomTime;
    protected Color color;

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