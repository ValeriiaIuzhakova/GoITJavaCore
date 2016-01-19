package com.company;

class Piano extends MusicalInstrument {
    private int keysNumber;

    public Piano(String name, int stringNumber) {
        super(name);
        this.keysNumber = stringNumber;
    }

    public void pressKey() {
        System.out.println("Piano's key is pressed");
    }
}
