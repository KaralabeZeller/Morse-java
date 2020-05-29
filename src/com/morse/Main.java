package com.morse;

public class Main {

    public static void main(String[] args) {
        Morse morseUS = new Morse(Util.Type.AMERICAN);

        Util.prettyPrint(morseUS.morseCodes.translateToMorseRaw("sos rizs"));
    }
}
