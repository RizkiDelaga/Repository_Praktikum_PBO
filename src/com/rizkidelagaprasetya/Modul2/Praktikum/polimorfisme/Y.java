package com.rizkidelagaprasetya.Modul2.Praktikum.polimorfisme;

public class Y extends X {
    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value kelas y : " + value);
    }
}