package com.company;

class AudioFile extends File {
    private String audioFileExtension;

    public AudioFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return this.audioFileExtension;
    }
}