package com.company;

import java.awt.*;

class TextFile extends File {

    private String textFileExtension;
    private Image fileIcon;
    private String additionalInfo;
    private String name = "textFile";

    public TextFile(String name) {
        super(name);
    }
    public String getExtension() {
        System.out.println("Getting file extension");
        return this.textFileExtension;
    }
}