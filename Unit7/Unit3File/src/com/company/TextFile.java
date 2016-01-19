package com.company;

class TextFile extends File {
    private String textFileExtension;

    public TextFile(String name) {
        super(name);
    }
    public String getExtension() {
        System.out.println("Getting file extension");
        return this.textFileExtension;
    }
}