package com.company;

import java.awt.*;

class AudioFile extends File {

    private String audioFileExtension;
    private Image fileIcon;
    private String additionalInfo;
    private String name = "audioFile";

    public AudioFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return this.audioFileExtension;
    }
}