package com.company;

public class Main {

    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.create("directory_name");

        TextFile textFile = new TextFile("text_file.txt");
        AudioFile audioFile = new AudioFile("audio_file.mp3");
        ImageFile imageFile = new ImageFile("image_file.jpg");
        File file = new File("file");

        try {
            directory.addFile(textFile);
            directory.addFile(audioFile);
            directory.addFile(imageFile);
            directory.addFile(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

