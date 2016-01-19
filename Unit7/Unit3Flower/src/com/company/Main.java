package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Bouquet bouquet = new Bouquet();

            bouquet.create("Bouquet has been created");

            Rose rose = new Rose("Rose");
            Chamomile chamomile = new Chamomile("Chamomile");
            Astra astra = new Astra("Astra");
            Tulip tulip = new Tulip("Tulip");
            Rosebush rosebush = new Rosebush("Rosebush", -1);

            bouquet.addFlower(rose);
            bouquet.addFlower(chamomile);
            bouquet.addFlower(astra);
            bouquet.addFlower(tulip);
            bouquet.addFlower(rosebush);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
