/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_unidad01_fps;

/**
 *
 * @author usuario
 */
public class Moto {
    String placa;
    String modelo;
    int año;
    String marca;
    
    String mostrarInfo(){
        var retorno= " La placa de la motocicleta es: "+this.placa + " La marca de la motocicleta es: "+this.marca + " Su modelo es: "+this.modelo+" Salio en el año: "+this.año;
        return retorno;
        
    }
    
    
}
