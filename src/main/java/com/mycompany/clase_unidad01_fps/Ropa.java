/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_unidad01_fps;

/**
 *
 * @author usuario
 */
public class Ropa {
    int talla;
    String marca;
    double valor;
    String color;
    
    String mostrarInfo(){
        var retorno="Su talla de ropa es "+this.talla+" la marca de ropa que tiene usted es "+this.marca+" el valor de la ropa es "+this.valor+" y su ropa es de color "+this.color;
        return retorno;
    }
          
    
}
