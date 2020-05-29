package com.morse;

import java.util.List;
import java.util.Map;

public class Util {
    public static enum Type {
        AMERICAN,
        CONTINENTAL,
        INTERNATIONAL
    }

    public static void prettyPrint(Map<String, List> transMap) {
        List<Character> firstRow = transMap.get("orig");
        List<String> secRow = transMap.get("trans");


        StringBuilder formatSec = new StringBuilder();
        StringBuilder formatFirst = new StringBuilder();
        secRow.forEach(morse->formatSec.append("%5s   "));
        secRow.forEach(morse->formatFirst.append("   %-5s"));

        System.out.printf(formatSec.toString(), secRow.toArray());
        System.out.println("");
        System.out.printf(formatFirst.toString(), firstRow.toArray());
    }
}
