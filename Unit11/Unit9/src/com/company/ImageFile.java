package com.company;

class ImageFile extends File {

    public ImageFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return super.fileExtension;
    }

}