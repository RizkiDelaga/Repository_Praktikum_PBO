package com.rizkidelagaprasetya.Modul2.Latihan.No3;

public class demoNo3 {
    public static void main(String[] args) {
        Mahasiswa Parent = new Mahasiswa();
        Pacar Child = new Pacar();

        // memanggil method dan memasukan value yg akan di pakai di method getStatus
        Parent.mahasiswa("Zoro", "Pacaran", 3);
        Child.pacar("Nico Robin", "Pacaran", 3, "Zoro", "75 Tahun");

        // OUTPUT // Memanggil method getStatus
        System.out.println("Get Status Mahasiswa : ");
        Parent.getStatus();

        System.out.println("Get Status Pacar :");
        Child.getStatus();
    }
}