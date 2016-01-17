package com.company;

import java.awt.*;
import java.util.Date;

class Rosebush extends Flower{
    private Color color;
    private Date bloomTime;
    private Rose[] roses;

    public Rosebush(String name, int size) throws RosebushQuantityException {
        super(name);
        if(size <= 0) {
            throw new RosebushQuantityException("Rosebush quantity must be greater than zero");
        }
        this.roses = new Rose[size];
    }

    public void bloom() {
        System.out.println("A rosebush bloom");
    }
}
