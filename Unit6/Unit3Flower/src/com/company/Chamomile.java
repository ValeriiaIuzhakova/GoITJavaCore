package com.company;

import java.awt.*;
import java.util.Date;

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