package com.rizkidelagaprasetya.Modul2.Praktikum.inheritance;

public class demoInheritance {
    public static void main(String[] args) {
        A superClass = new A();
        B subClass = new B();

        System.out.println("Masukin data ke superClass ");
        superClass.x = 10;
        superClass.y = 23;
        superClass.printXY();

        System.out.println();

        subClass.x = 24;
        subClass.y = 22;
        subClass.z = 53;
        subClass.printXY();
        subClass.sumValue();
    }
}
