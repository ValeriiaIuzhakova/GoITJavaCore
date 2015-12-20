package com.company;
import java.util.ArrayList;
import java.util.List;

class MusicShop {
    private List<MusicalInstrument> store;
    private int itemQuantity;
    private boolean itemAvailability;

    public MusicShop() {
        this.store = new ArrayList<MusicalInstrument>();
        this.itemQuantity = 0;
    }

    public void addItem(MusicalInstrument instrument) {
        System.out.println("Item is added: " + instrument.getName());
        this.itemQuantity++;
        this.store.add(instrument);
    }

    public MusicalInstrument getItem(int id) {
        MusicalInstrument instrument;
        instrument = this.store.get(id);
        System.out.println("Item is gotten: " + instrument.getName());
        return instrument;
    }

    public void createOrder(MusicalInstrument instrument) {
        System.out.println("Sold item: " + instrument.getName());
        System.out.println("Order is created");
        this.itemQuantity--;
    }

    public int itemsCount() {
        return this.itemQuantity;
    }

}

class MusicalInstrument {
    private int sound;
    private String shape;
    private String material;
    private String name;
    private int timbre;
    private int itemId;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Musical instrument is playing");
    }

    public String getName () {
        return this.name;
    }
}

class Guitar extends MusicalInstrument{
    private int stringNumber;

    public Guitar(String name, int stringNumber) {
        super(name);
        this.stringNumber = stringNumber;
    }

    public void hitString() {
        System.out.println("Guitar's string is hitted");
    }
}

class Piano extends MusicalInstrument{
    private int keysNumber;


    public Piano(String name, int stringNumber) {
        super(name);
        this.keysNumber = stringNumber;
    }

    public void pressKey() {
        System.out.println("Piano's key is pressed");
    }
}

class Pipe extends MusicalInstrument{
    private int valvesNumber;

    public Pipe(String name, int valvesNumber) {
        super(name);
        this.valvesNumber = valvesNumber;
    }

    public void pressValve() {
        System.out.println("Pipe's valve is pressed");
    }
}

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