package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList();

        list.add(new AudioFile("audio.mp3"));
        list.add(new ImageFile("image.jpg"));
        list.add(new TextFile("file.txt"));

        CaesarAlgorithm caesar = new CaesarAlgorithm();
        String enc = caesar.encode(list.toString());
        System.out.println(enc);
        System.out.println(caesar.decode(enc));
    }
}