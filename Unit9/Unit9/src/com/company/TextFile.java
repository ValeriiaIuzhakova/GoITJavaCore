package com.company;

class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return super.fileExtension;
    }

}