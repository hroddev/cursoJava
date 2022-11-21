package com.company;

public class CocheElectrico extends Coche{
    String motorElectrico;
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad, String motorElectrico){
        super(color, fabricante, modelo, peso, largo, velocidad);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
