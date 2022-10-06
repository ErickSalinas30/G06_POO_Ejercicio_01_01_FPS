/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_unidad01_fps;

/**
 *
 * @author usuario
 */
public class Asignatura {
    int codigo;
    boolean vigente;
    String nombre;
    int horas;
    String nombreDocente;
    double costoHora;
    
    double calcularCosto(){
            var retorno=this.costoHora*this.horas;
            return retorno;
    }
    
    
    String mostrarInfo(){
        var retorno= " la asignatura es: "+this.nombre + " El docente es: "+this.nombreDocente + " La asignatura cuesta: "+this.calcularCosto();
        return retorno;
        
    }
    
}
