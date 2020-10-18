package com.rizkidelagaprasetya.Modul2.Latihan.No2;

public class Ikan extends Binatang{
    public String nama;

    // constructor Ikan
    public Ikan(String nama) {
        this.nama = nama;
    }

    @Override
    public void makanan(String nama) {
        super.makanan(nama);
        System.out.println("Cacing Sutra Adalah Makanan "+ nama);
    }

    @Override
    public void tidur(String nama) {
        super.tidur(nama);
        System.out.println(nama + " Juga Bisa Tidur");
    }

    public void ikan(String nama){
        System.out.println(nama + " Adalah binatang yang paling cerdas otaknya sebesar otak manusia");
    }

    public void getNama(){
        System.out.println("Nama Ikan Nemo punya lulu adalah " + nama);
    }

    public void berenang(){
        System.out.println(nama + " berenang dengan sirip");
    }
}