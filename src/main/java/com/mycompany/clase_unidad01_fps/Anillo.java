/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_unidad01_fps;

/**
 *
 * @author usuario
 */
public class Anillo {
    String material;
    double peso;
    double valor;
    String numeroSerie;
    
    String mostrarInfo(){
        var retorno= "Su anillo esta hecho de: "+this.material+" El peso de este es de: "+this.peso+" onzas "+"El valor del anillo es de: "+this.valor+" dolares y su numero de serie es de: "+this.numeroSerie;
        return retorno;
    }    
}
