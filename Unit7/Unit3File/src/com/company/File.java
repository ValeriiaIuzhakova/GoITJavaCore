package com.company;

import java.awt.*;
import java.util.Date;

class File {
    private int size;

    private Date creationDate;
    private Date openingDate;
    private Date updateDate;
    private String type;

    protected Image fileIcon;
    protected String additionalInfo;
    protected String name;

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

    public String getName() {
        return this.name;
    }
}
