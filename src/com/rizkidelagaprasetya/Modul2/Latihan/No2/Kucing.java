package com.rizkidelagaprasetya.Modul2.Latihan.No2;

public class Kucing extends Binatang{
    public String nama;

    // constructor Kucing
    public Kucing(String nama) {
        this.nama = nama;
    }

    @Override
    public void makanan(String nama) {
        super.makanan(nama);
        System.out.println("\nIkan Adalah Salah Satu Makanan Kucing " + nama);
    }

    @Override
    public void tidur(String nama) {
        super.tidur(nama);
        System.out.println("Kucing " + nama + " Tidur 12 – 16 jam/Hari");
    }

    public void kucing(String nama){
        System.out.println("kucing " + nama + " banyak ditemukan di negara Thailand");
    }

    public void getNama(){
        System.out.println("Nama kucing Lala adalah " + nama);
    }

    public void meong(){
        System.out.println(nama + " Meminta makan dengan mengeluarkan bunyi 'meong'");
    }
}
