package com.rizkidelagaprasetya.Modul2.Praktikum.polimorfisme;

public class Lagu {
    public String pencipta;
    public String judul;

    //overloading
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    // overloading
    public Lagu(String judul) {
        this.judul = judul;
    }
    public  void getDataLagu(){
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
        System.out.println();
    }
}