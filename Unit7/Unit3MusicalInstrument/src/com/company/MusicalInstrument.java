package com.company;

class MusicalInstrument {
    private boolean sound;
    private String type;

    protected int timbre;
    protected String material;
    protected String name;
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
