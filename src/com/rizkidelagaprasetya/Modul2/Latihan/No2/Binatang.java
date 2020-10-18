package com.rizkidelagaprasetya.Modul2.Latihan.No2;

public class Binatang {

    public void makanan(String nama){}

    public void tidur(String nama){}

    public static void main(String[] args) {
        Burung burung = new Burung("Yukio");
        Ikan ikan = new Ikan("Dory");
        Kucing kucing = new Kucing("Begal");

        // memanggil method-method yang ada di class Burung
        burung.makanan("Burung Pelatuk ");
        burung.tidur("Burung Merpati");
        burung.burung("Burung Kolibri");
        burung.getNama();
        burung.terbang();


        // Memanggil method-method yang ada di class Ikan
        ikan.makanan("Ikan Nemo");
        ikan.tidur("Lumba-Lumba");
        ikan.ikan("Ikan Dolpin");
        ikan.getNama();
        ikan.berenang();


        // Memanggil method-method yang ada di class Kucing
        kucing.makanan("Persia");
        kucing.tidur("Anggora");
        kucing.kucing("Siam");
        kucing.getNama();
        kucing.meong();

    }
}
