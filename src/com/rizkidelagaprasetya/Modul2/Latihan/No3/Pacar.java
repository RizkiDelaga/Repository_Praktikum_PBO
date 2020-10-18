package com.rizkidelagaprasetya.Modul2.Latihan.No3;

public class Pacar extends Mahasiswa{
    public String namaPacar;
    public String lamaHubungan;

    public void pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan){
        System.out.println("Nama\t\t\t : " + nama);
        super.nama = nama;
        System.out.println("Status\t\t\t : " + status);
        super.status = status;
        System.out.println("Semester\t\t : " + semester);
        super.semester = semester;
        System.out.println("Nama Pacar\t\t : " + namaPacar);
        System.out.println("Lama Hubungan\t : " + lamaHubungan);
        System.out.println();
    }
}
