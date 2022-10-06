/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase_unidad01_fps;

/**
 *
 * @author usuario
 */
public class Clase_unidad01_FPS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var progra = new Asignatura();
        progra.codigo=1;
        progra.costoHora=3.5;
        progra.horas=160;
        progra.nombre="Programacion Orientada a Objetos";
        progra.nombreDocente="Mauricio Ortiz Ochoa";
        progra.vigente=true;
        
        System.out.println(progra.mostrarInfo());
        
        var electro = new Asignatura();
        electro.codigo=2;
        electro.costoHora=3.5;
        electro.horas=160;
        electro.nombre="Electrotecnia";
        electro.nombreDocente="Juan Pablo Hurtado";
        electro.vigente=true;
        
        System.out.println(electro.mostrarInfo());
        
        var estructu = new Asignatura();
        estructu.codigo=2;
        estructu.costoHora=3.5;
        estructu.horas=160;
        estructu.nombre="Estructura de datos";
        estructu.nombreDocente="Andrea Maricela Plaza";
        estructu.vigente=true;
        
        System.out.println(estructu.mostrarInfo());
        
        
    }
}
