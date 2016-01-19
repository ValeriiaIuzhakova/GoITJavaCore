package com.company;

import java.util.ArrayList;
import java.util.List;

class MusicShop {
    private boolean itemAvailability;
    private int itemQuantity;

    private List<MusicalInstrument> store;

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
