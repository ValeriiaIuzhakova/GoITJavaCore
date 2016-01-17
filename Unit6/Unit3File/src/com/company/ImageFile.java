package com.company;

import java.awt.*;

class ImageFile extends File {

    private String imageFileExtension;
    private Image fileIcon;
    private String additionalInfo;
    private String name = "imageFile";

    public ImageFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return this.imageFileExtension;
    }
}
