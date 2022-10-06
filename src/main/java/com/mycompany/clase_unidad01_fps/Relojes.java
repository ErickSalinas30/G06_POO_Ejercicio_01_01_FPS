/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_unidad01_fps;

/**
 *
 * @author usuario
 */
public class Relojes {
    double valor;
    String serie;
    String marca;
    String material;
    
    String mostrarInfo(){
        var retorno="Su reloj tiene un valor de: "+this.valor+" su numero de serie es "+this.serie+" la marca del reloj es "+this.marca+" y esta hecho de "+this.material;
        return retorno;
    }
}
