package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final String dataFile = "data.txt";
        CaesarAlgorithm caesar = new CaesarAlgorithm();
        int operation = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("To perform input, press '1', output - '2'");

        try {
            operation = sc.nextInt();
        } catch (InputMismatchException i){
            System.out.println("Invalid input. Exception: " + i);
        }

        switch (operation) {
            case 1: {
                sc.nextLine();
                System.out.println("Please enter some text...");
                String str = sc.nextLine();
                String enc = caesar.encode(str);
                System.out.println("Encoded: " + enc);
                String dec = caesar.decode(enc);

                DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
                out.writeBytes(enc);
                out.close();
                break;
            }
            case 2: {
                try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(dataFile)))) {
                    while (scanner.hasNext()) {
                        System.out.println("Decoded: " + caesar.decode(scanner.next()));
                    }
                    break;
                } catch (IOException x) {
                    System.out.println(x);
                }
            }
            default: {
                System.out.println("You entered a number not from the range OR The system cannot find the file");
                break;
            }
        }
    }
}
