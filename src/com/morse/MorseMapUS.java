package com.morse;

public class MorseMapUS extends MorseMap {


    public MorseMapUS() {
        super();
        initCodes();
    }

    private void initCodes() {
        letterMorse.put("A", ".-"       );
        letterMorse.put("B", "-..."     );
        letterMorse.put("C", ".. ."     );
        letterMorse.put("D", "-.."      );
        letterMorse.put("E", "."        );
        letterMorse.put("F", ".-."      );
        letterMorse.put("G", "--."      );
        letterMorse.put("H", "..."      );
        letterMorse.put("I", ".."       );
        letterMorse.put("J", "-.-."     );
        letterMorse.put("K", "-.-"      );
        letterMorse.put("L", "--"       );
        letterMorse.put("M", "--"       );
        letterMorse.put("N", "-."       );
        letterMorse.put("O", ". ."      );
        letterMorse.put("P", "....."    );
        letterMorse.put("Q", "..-."     );
        letterMorse.put("R", ". .."     );
        letterMorse.put("S", "..."      );
        letterMorse.put("T", "-"        );
        letterMorse.put("U", "..-"      );
        letterMorse.put("V", "...-"     );
        letterMorse.put("W", ".--"      );
        letterMorse.put("X", ".-.."     );
        letterMorse.put("Y", ".. .."    );
        letterMorse.put("Z", "... ."    );
    }
}
