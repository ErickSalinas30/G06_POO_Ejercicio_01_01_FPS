/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_unidad01_fps;

/**
 *
 * @author usuario
 */
public class Computadora {
    String marca;
    int capacidad;
    String modelo;
    int año;
    
    String mostrarInfo(){
        var retorno= " La computadora fue fabricada en el año: "+this.año + " su marca es: "+this.marca + " el modelo es: "+this.modelo + " Su memoria es de: "+this.capacidad+"Gb" ;
        return retorno;
    }
}
