package com.rizkidelagaprasetya.Modul2.Latihan.No1;

public class demoClub {
    public static void main(String[] args) {
        // membuat object class Club
        Club club1 = new Club();
        Club club2 = new Club("Juventus");
        Club club3 = new Club("Real Madrid", "Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol.");
        Club club4 = new Club("Barcelona", 1899, "Camp Nou");
        Club club5 = new Club("Liverpool", 1892, "Anfield", 6,"Liverpool FC adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool.");

        // memanggil method getTeam // OUTPUT
        System.out.println("Club1\t\t\t\t:");
        club1.getTeam();
        System.out.println("Club2\t\t\t\t:");
        club2.getTeam();
        System.out.println("Club3\t\t\t\t:");
        club3.getTeam();
        System.out.println("Club4\t\t\t\t:");
        club4.getTeam();
        System.out.println("Club5\t\t\t\t:");
        club5.getTeam();

    }
}
