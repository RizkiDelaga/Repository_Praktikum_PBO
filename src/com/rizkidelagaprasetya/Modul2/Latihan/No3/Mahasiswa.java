package com.rizkidelagaprasetya.Modul2.Latihan.No3;

public class Mahasiswa {
    public String nama;
    public String status;
    public  int semester;

    public void mahasiswa(String nama, String status, int semester){
        System.out.println("nama\t\t: " + nama);
        this.nama = nama;
        System.out.println("Status\t\t: " + status);
        this.status = status;
        System.out.println("semester\t: " + semester);
        this.semester = semester;
        System.out.println();
    }

    public void getStatus(){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Status\t\t: " + status);
        System.out.println("Semester\t: " + semester);
        System.out.println();
    }
}