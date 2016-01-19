package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

class Directory {
    private int attributes;

    private File[] files;
    private String name;

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

    public boolean addFile(File file) throws IOException {
        String[] fileNameParts = file.getName().split("\\.");
        try {
            String fileName = fileNameParts[0];
            String fileExt = fileNameParts[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            throw new IOException("[Exception] File extension is missing: \n " + errors.toString());
        }
        System.out.println("File is added " + file.getName());
        return true;
    }

    public boolean removeFile(String name) {
        System.out.println("File is removed");
        return true;
    }
}

