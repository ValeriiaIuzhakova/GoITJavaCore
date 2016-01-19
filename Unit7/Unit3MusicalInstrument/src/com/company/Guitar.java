package com.company;

class Guitar extends MusicalInstrument {
    private int stringNumber;

    public Guitar(String name, int stringNumber) {
        super(name);
        this.stringNumber = stringNumber;
    }

    public void hitString() {
        System.out.println("Guitar's string is hitted");
    }
}
