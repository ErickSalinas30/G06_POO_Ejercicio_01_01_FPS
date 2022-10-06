/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_unidad01_fps;

/**
 *
 * @author usuario
 */
public class Celular {
    String marca;
    int año;
    String modelo;
    String color;
    
    String mostrarInfo(){
        var retorno= "Su celular es de marca: "+ this.marca + " fue fabricado en el año: "+this.año+" su modelo es el: "+this.modelo+" Y el color qie tiene es de: "+this.color;
        return retorno;
        
    }
    
}
