package com.morse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseMap {

    public Map<String, String> letterMorse; // Map for [S -> ...]
    public Map<String, String> MorseLetter; // Map for [... -> S]

    public MorseMap() {
        letterMorse = new HashMap<>();
        MorseLetter = new HashMap<>();
        initCodes();
    }

    // Implement this in the extended classes
    private void initCodes() {
    }

    public String getMorse(String letter) {
        return letterMorse.get(letter);
    }

    public String getLetter(String morse) {
        return MorseLetter.get(morse);
    }

    public String translateToMorse(String text) {
        List<String> translated = new ArrayList<>();
        List<Character> chars = text.chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());

        chars.forEach(ch->translated.add(getMorse(ch.toString().toUpperCase())));

        return refineTranslation(chars, translated);
    }

    public Map<String,List> translateToMorseRaw(String text) {
        List<String> translated = new ArrayList<>();
        List<Character> chars = text.chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());

        chars.forEach(ch->translated.add(getMorse(ch.toString().toUpperCase())));

        Map<String,List> retMap = new HashMap<>();
        retMap.put("orig", chars);
        retMap.put("trans", refineTranslationRaw(chars, translated));

        return retMap;
    }

    private String refineTranslation(List<Character> chars, List<String> translated) {
        for(int i = 0; i < translated.size(); i++) {
            if(translated.get(i) == null) {
                translated.set(i, chars.get(i).toString());
                if(chars.get(i).equals(' ')) {
                    translated.set(i, "     "); // TODO Should be 7 long
                }
            }
        }
        return String.join("\t", translated);
    }

    private List<String> refineTranslationRaw(List<Character> chars, List<String> translated) {
        for(int i = 0; i < translated.size(); i++) {
            if(translated.get(i) == null)
                translated.set(i, chars.get(i).toString());
        }
        return translated;
    }


}
