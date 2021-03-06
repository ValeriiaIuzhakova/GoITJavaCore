package com.company;

import java.util.ArrayList;
import java.util.List;

public class CaesarAlgorithm {

    private static char[] symbols = {'.', ',', ';', ':', '!', '?', '-', ' '};
    private static List<Character> alphabet;

    public CaesarAlgorithm() {
        alphabet = new ArrayList<Character>();

        for (int i = 0; i <= 9; i++) {
            alphabet.add(Character.forDigit(i, 10));
        }

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }

        for (char c : symbols) {
            alphabet.add(c);
        }
    }

    public String encode (String phrase){
        StringBuilder encrypted = new StringBuilder();
        int alphabetSize = alphabet.size();

        for (int i = 0; i < phrase.length(); i++) {
            char encChar = phrase.charAt(i);
            int index = alphabet.indexOf(encChar);
            index = (index + 3) % alphabetSize;
            encrypted.append(alphabet.get(index));
        }

        return encrypted.toString();
    }

    public String decode (String phrase){
        StringBuilder decrypted = new StringBuilder();
        int alphabetSize = alphabet.size();

        for (int i = 0; i < phrase.length(); i++) {
            char decChar = phrase.charAt(i);
            int index = alphabet.indexOf(decChar);
            index = (index - 3) % alphabetSize;
            if (index < 0) {
                index = index + alphabetSize;
            }
            decrypted.append(alphabet.get(index));
        }

        return decrypted.toString();
    }
}