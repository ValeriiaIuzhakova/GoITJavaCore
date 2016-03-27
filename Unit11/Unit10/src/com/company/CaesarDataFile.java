package com.company;

import java.io.*;
import java.util.Scanner;

public class CaesarDataFile {
    public static String writeDataFile(String data, String filename) throws IOException {
        CaesarAlgorithm caesar = new CaesarAlgorithm();
        String enc = caesar.encode(data);

        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));
        out.writeBytes(enc);
        out.close();

        return enc;
    }

    public static String readDataFile(String filename) throws IOException {
        CaesarAlgorithm caesar = new CaesarAlgorithm();
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)));
        String result = "";

        while(scanner.hasNext()) {
            result += scanner.next();
        }

        result = caesar.decode(result);
        return result;
    }
}
