package com.company;

class MusicalInstrument {
    protected boolean sound;
    protected int timbre;
    protected String material;
    protected String name;
    protected String type;
    protected String shape;

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
