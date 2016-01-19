package com.company;

class ImageFile extends File {
    private String imageFileExtension;

    public ImageFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return this.imageFileExtension;
    }
}
