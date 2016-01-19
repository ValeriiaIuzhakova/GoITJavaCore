package com.company;

class Pipe extends MusicalInstrument {
    private int valvesNumber;

    public Pipe(String name, int valvesNumber) {
        super(name);
        this.valvesNumber = valvesNumber;
    }

    public void pressValve() {
        System.out.println("Pipe's valve is pressed");
    }
}