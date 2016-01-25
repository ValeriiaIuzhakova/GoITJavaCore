package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println ("\n" + "№1 " + "Unordered table");
        System.out.println ("-------------------");
        System.out.format("%1s%7s", "#", "Value\n");
        System.out.println ("-------------------");

        List arrList = new ArrayList<Object>();

        arrList.add(new TextFile("file.txt"));
        arrList.add(new AudioFile("audio.mp3"));
        arrList.add(new ImageFile("image.jpg"));
        arrList.add(new Tulip("Tulip"));
        arrList.add(new Rose("Rose"));
        arrList.add(new Astra("Astra"));
        arrList.add(new Chamomile("Chamomile"));

        PrintCollections.print(arrList);
        System.out.println ("-------------------");

        System.out.println ( "\n" + "№2 " + "Ordered table");
        System.out.println ("-------------------");
        System.out.format("%1s%7s", "#", "Value\n");
        System.out.println ("-------------------");

        Set<String> treeSet = new TreeSet<String>();

        treeSet.add("TextFile");
        treeSet.add("AudioFile");
        treeSet.add("ImageFile");
        treeSet.add("Rose");
        treeSet.add("Chamomile");
        treeSet.add("Astra");
        treeSet.add("Tulip");

        PrintCollections.print(treeSet);
        System.out.println("-------------------");
    }
}
