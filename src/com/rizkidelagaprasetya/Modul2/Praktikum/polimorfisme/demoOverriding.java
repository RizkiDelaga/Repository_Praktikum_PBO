package com.rizkidelagaprasetya.Modul2.Praktikum.polimorfisme;

public class demoOverriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("mati listrik");
        subClass.getValue("mati air");
    }
}
