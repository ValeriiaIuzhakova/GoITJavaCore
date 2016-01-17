package com.company;

import java.awt.*;
import java.util.Date;

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
