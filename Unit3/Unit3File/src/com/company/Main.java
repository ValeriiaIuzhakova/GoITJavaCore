package com.company;

import java.awt.*;
import java.util.Date;

class Directory {
    private String name;
    private int attributes;
    private File[] files;

    //Constructor
    public Directory() {}

    public boolean create(String name) {
        System.out.println("Directory " + name + " is created");
        return true;
    }

    public boolean delete() {
        System.out.println("Directory " + name + " is deleted");
        return true;
    }

    public boolean addFile(File file) {
        System.out.println("File is added");
        return true;
    }

    public boolean removeFile(String name) {
        System.out.println("File is removed");
        return true;
    }
}

class File {
    private String name;
    private int size;
    private String type;
    private Date creationDate;
    private Date updateDate;
    private Date openingDate;

    public File(String name) {
        this.name = name;
    }

    public File(String name, int size) {}

    public void open() {
        System.out.println("A file is opened");
    }

    public int read() {
        System.out.println("A file is read");
        return 0;
    }

    public boolean  write() {
        System.out.println("A file is written");
        return true;
    }

    public boolean delete() {
        System.out.println("A file is deleted");
        return true;
    }

    public void close() {
        System.out.println("A file is closed");
    }

    public String getType() {
        System.out.println("A file type is taken");
        return this.name;
    }
}

class TextFile extends File {

    private String textFileExtension;
    private Image fileIcon;
    private String additionalInfo;

    public TextFile(String name) {
        super(name);
    }
    public String getExtension() {
        System.out.println("Getting file extension");
        return this.textFileExtension;
    }
}

class AudioFile extends File {

    private String audioFileExtension;
    private Image fileIcon;
    private String additionalInfo;

    public AudioFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return this.audioFileExtension;
    }
}

class ImageFile extends File {

    private String imageFileExtension;
    Image fileIcon;
    String additionalInfo;

    public ImageFile(String name) {
        super(name);
    }

    public String getExtension() {
        System.out.println("Getting file extension");
        return this.imageFileExtension;
    }
}

public class Main {

    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.create("directory_name");

        TextFile textFile = new TextFile("text_file.txt");
        AudioFile audioFile = new AudioFile("audio_file.mp3");
        ImageFile imageFile = new ImageFile("image_file.jpg");

        directory.addFile(textFile);
        directory.addFile(audioFile);
        directory.addFile(imageFile);
    }
}

