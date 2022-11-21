package com.company;

public class CocheMain {

    public static void main(String[] args) {

        Coche car1 = new Coche("blanco", "toyota", "hilux", 1000.00, 6.10, 0);

        System.out.println(car1);
        car1.acelerar(50);
        System.out.println(car1);

        CocheElectrico car2 = new CocheElectrico("rojo", "bmw","hybrid1",1000d, 4.50,0,"TYI");

        System.out.println(car2);
    }
}
