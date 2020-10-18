package com.rizkidelagaprasetya.Modul2.Praktikum.polimorfisme;

public class demoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("apa aja dah");
        Lagu lagu2 = new Lagu("halu", "feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
