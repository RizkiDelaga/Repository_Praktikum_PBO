package com.rizkidelagaprasetya.Modul2.Latihan.No2;

public class Burung extends Binatang{
    public String nama;

    // constructor burung
    public Burung(String nama) {
        this.nama = nama;
    }

    @Override
    public void makanan(String nama) {
        super.makanan(nama);
        System.out.println("Serangga Adalah Makanan " + nama);
    }

    @Override
    public void tidur(String nama) {
        super.tidur(nama);
        System.out.println("Salah Satu Burung Yang Bisa Tidur Adalah " + nama);
    }

    public void burung(String nama){
        System.out.println("Terkadang " + nama + " Bermigrasi");
    }

    public void getNama(){
        System.out.println("Nama Burung yaya adalah " + nama);
    }

    public void terbang(){
        System.out.println(nama + " Terbang dengan sayapnya\n");
    }
}