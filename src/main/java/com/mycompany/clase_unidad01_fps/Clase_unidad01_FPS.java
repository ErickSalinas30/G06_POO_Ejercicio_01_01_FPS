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
        var compu1 = new Computadora();
        compu1.año=2015;
        compu1.capacidad=128;
        compu1.marca="LG";
        compu1.modelo="L215";    
        
        System.out.println(compu1.mostrarInfo());
        
        var compu2 = new Computadora();
        compu2.año=2019;
        compu2.capacidad= 512;
        compu2.marca="ASUS";
        compu2.modelo="GV301QE211ZG";    
        
        System.out.println(compu2.mostrarInfo());
        
        var compu3 = new Computadora();
        compu3.año=2020;
        compu3.capacidad=512;
        compu3.marca="LENOVO";
        compu3.modelo="82K200USUS";    
        
        System.out.println(compu3.mostrarInfo());
        
        var moto1 = new Moto();
        moto1.año= 2019;
        moto1.marca= "Tuko";
        moto1.modelo="H2 150";
        moto1.placa="ABG-542";
        
        System.out.println(moto1.mostrarInfo());
        
        var moto2 = new Moto();
        moto2.año= 2020;
        moto2.marca= "Shineray";
        moto2.modelo="XY150-15";
        moto2.placa="APU-882";
        
        System.out.println(moto2.mostrarInfo());
        
        var moto3 = new Moto();
        moto3.año= 2017;
        moto3.marca= "Harley";
        moto3.modelo="32327";
        moto3.placa="UBX-7941";
                
        System.out.println(moto3.mostrarInfo());
        
        var celu1 = new Celular();
        celu1.año= 2019;
        celu1.color= "blanco";
        celu1.marca="Apple";
        celu1.modelo="Iphone 11";
        
        System.out.println(celu1.mostrarInfo());
        
        var celu2 = new Celular();
        celu2.año= 2022;
        celu2.color= "golden rose";
        celu2.marca="Samsung";
        celu2.modelo="Galaxy Z flip 3";
        
        System.out.println(celu2.mostrarInfo());
        
        var celu3 = new Celular();
        celu3.año= 2018;
        celu3.color= "azul";
        celu3.marca="Nokia";
        celu3.modelo="G21";
        
        System.out.println(celu3.mostrarInfo());
        
        var reloj1 = new Relojes();
        reloj1.marca="patek";
        reloj1.valor= 89.000;
        reloj1.serie="7140G";
        reloj1.material="Oro Blanco";
        
        System.out.println(reloj1.mostrarInfo());
        
        var reloj2 = new Relojes();
        reloj2.marca="Rolex";
        reloj2.valor=84.995;
        reloj2.serie="116508";
        reloj2.material="Oro Amarillo Macizo";

        System.out.println(reloj2.mostrarInfo());

        var reloj3 = new Relojes();
        reloj3.marca="Richard Mille";
        reloj3.valor=225.000;
        reloj3.serie="RM 67";
        reloj3.material="Extraplano Oro rosa";

        System.out.println(reloj3.mostrarInfo());
        
        var anillo1 = new Anillo();
        anillo1.material="oro";
        anillo1.numeroSerie="547516";
        anillo1.peso= 6.2;
        anillo1.valor=120;
        
        System.out.println(anillo1.mostrarInfo());
        
        var anillo2 = new Anillo();
        anillo2.material="plata";
        anillo2.numeroSerie="588816";
        anillo2.peso= 8.45;
        anillo2.valor=231;
        
        System.out.println(anillo2.mostrarInfo());
        
        var anillo3 = new Anillo();
        anillo3.material="plata";
        anillo3.numeroSerie="25491";
        anillo3.peso= 5.5;
        anillo3.valor=95.25;
        
        System.out.println(anillo3.mostrarInfo());
        
        var ropa1 = new Ropa();
        ropa1.talla=38;
        ropa1.marca="Gucci";
        ropa1.valor=1450;
        ropa1.color="Negro";

        System.out.println(ropa1.mostrarInfo());
    
        var ropa2 = new Ropa();
        ropa2.talla=40;
        ropa2.marca="Adidas";
        ropa2.valor=56.00;
        ropa2.color="Blanco";

        System.out.println(ropa2.mostrarInfo());

        var ropa3 = new Ropa();
        ropa3.marca="Nike";
        ropa3.talla=38;
        ropa3.valor=60.00;
        ropa3.color="Rosado";

        System.out.println(ropa3.mostrarInfo());

        
        
        
        
        
        
        
        
    }
}
