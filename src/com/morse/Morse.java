package com.morse;

public class Morse {

    private Util.Type type;
    public MorseMap morseCodes;

    public Morse(Util.Type type) {
        this.type = type;
        initMorseMap();
    }

    private void initMorseMap() {
        switch (type) {
            case AMERICAN -> morseCodes = new MorseMapUS();
        }
    }

}
