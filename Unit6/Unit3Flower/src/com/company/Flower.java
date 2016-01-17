package com.company;

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