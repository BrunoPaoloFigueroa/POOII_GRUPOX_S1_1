/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooii_grupox_s1_1;

/**
 *
 * @author USUARIO
 */
public class CirculoTest {
    
     public static void probarCirculos() {
       
       Circulo c1 = new Circulo();
        System.out.println("Radio del circulo normal: " + c1.getRadio());
        System.out.println("Area del cIrculo normal: " + c1.getArea());

        
        Circulo c2 = new Circulo(6.55, "rojo");
        System.out.println("Radio del circulo cambiado: " + c2.getRadio());
        System.out.println("Area del circulo  cambiado: " + c2.getArea());
        
        c1.setRadio(85);
        c1.setColor("verde");
        System.out.println("Circulo modificado: " + c1);
        
     
        System.out.println("Informacion del c2: " + c2);
    }
}
