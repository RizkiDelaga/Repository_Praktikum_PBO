package com.rizkidelagaprasetya.Modul2.Latihan.No1;

public class Club {
    // Variabel Static dengan nilai default
    public String nama = "Belum Di Inputkan";
    public int tahunBerdiri = 0;
    public String stadion = "Belum Di Inputkan";
    public int juaraUcl = 0;
    public String deskripsi = "Belum Di Inputkan";

    // Constructor
    public Club(){
    }

    public Club(String nama) {
        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    // method untuk menampilkan isi
    public void getTeam(){
        System.out.println("Nama\t\t\t\t: " + nama);

        System.out.println("Tahun Berdiri\t\t: " + tahunBerdiri);

        System.out.println("Stadion\t\t\t\t: " + stadion);

        System.out.println("Juara UCL\t\t\t: " + juaraUcl);

        System.out.println("Deskripsi\t\t\t: " + deskripsi);
        System.out.println();

    }
}
