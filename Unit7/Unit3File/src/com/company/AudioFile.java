package com.company;

class AudioFile extends File {

    public AudioFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return super.fileExtension;
    }
}