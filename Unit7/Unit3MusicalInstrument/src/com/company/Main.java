package com.company;

public class Main {
    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop();

        Guitar guitar = new Guitar("Guitar", 7);
        Piano piano = new Piano("Piano", 70);
        Pipe pipe = new Pipe("Pipe", 10);

        System.out.println("Items count: " + musicShop.itemsCount());

        musicShop.addItem(guitar);
        musicShop.addItem(piano);
        musicShop.addItem(pipe);

        System.out.println("Items count: " + musicShop.itemsCount());

        musicShop.createOrder(musicShop.getItem(1));

        System.out.println("Items count: " + musicShop.itemsCount());
    }
}