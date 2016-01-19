package com.company;

class Rosebush extends Flower{
    private Rose[] roses;

    public Rosebush(String name, int size) throws RosebushQuantityException {
        super(name);
        if (size <= 0) {
            throw new RosebushQuantityException("Rosebush quantity must be greater than zero");
        }
        this.roses = new Rose[size];
    }

    public void bloom() {
        System.out.println("A rosebush bloom");
    }
}
