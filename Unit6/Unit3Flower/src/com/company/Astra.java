package com.company;

import java.awt.*;
import java.util.Date;

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
