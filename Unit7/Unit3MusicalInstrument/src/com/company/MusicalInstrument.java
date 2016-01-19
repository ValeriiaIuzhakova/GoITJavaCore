package com.company;

class MusicalInstrument {
    private int itemId;
    private int sound;
    private int timbre;

    private String material;
    private String name;
    private String shape;

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
