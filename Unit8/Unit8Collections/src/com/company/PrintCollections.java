package com.company;

import java.util.List;
import java.util.Set;

public class PrintCollections {

    private static String separator = "\n";

    private static String toString(List<?> list) {
        StringBuilder sb = new StringBuilder();
        boolean needSeparator = false;
        int count = 0;

        for(Object object : list) {
            if (needSeparator) {
                sb.append(separator);
            }
            sb.append(count + " " + object.toString());
            needSeparator = true;
            count++;
        }
        sb.append(separator);
        return sb.toString();
    }

    private static String toString(Set<?> set) {
        StringBuilder sb = new StringBuilder();
        boolean needSeparator = false;
        int count = 0;

        for(Object object : set) {
            if (needSeparator) {
                sb.append(separator);
            }
            sb.append(count + " " + object.toString());
            needSeparator = true;
            count++;
        }
        sb.append(separator);
        return sb.toString();
    }

    public static void print(List<?> list) {
        System.out.print(toString(list));
    }

    public static void print(Set<?> set) {
        System.out.print(toString(set));
    }
}

