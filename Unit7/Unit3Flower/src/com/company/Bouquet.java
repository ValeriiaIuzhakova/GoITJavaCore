package com.company;

class Bouquet {
    private int flowersNumber;
    private double price;

    private  String wrapper;

    public Bouquet() {}

    public boolean addFlower(Flower flower) {
        System.out.println("A " + flower.getName() + " is added to the buquet");
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