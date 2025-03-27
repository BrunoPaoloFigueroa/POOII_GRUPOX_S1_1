/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooii_grupox_s1_1;

/**
 *
 * @author USUARIO
 */
public class Circulo {
    
    
    private double radio = 12.5;
    private String color = "azul";

    public Circulo() {
  
    }

    public Circulo(double radio, String color) {
        this.setRadio(radio);
        this.setColor(color);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }


    public String toString() {
        return "Circulo [radio=" + radio + ", color=" + color + ", area=" + getArea() + "]";
    }
    
}
