package com.company;

public class Coche {

    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // constructor
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        this.velocidad = velocidad;
    }

    // comportamiento o metodos
    public void acelerar(Integer cantidad){
        this.velocidad += cantidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
