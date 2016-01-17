package com.company;

import java.awt.*;
import java.util.Date;

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
