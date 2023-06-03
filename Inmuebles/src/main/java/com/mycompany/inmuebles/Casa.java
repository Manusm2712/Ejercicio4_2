/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;

/**
 *
 * @author maria
 */
public class Casa extends InmuebleVivienda {
    protected int numPisos;
    
    public Casa(int area, int identificadorInmobilario, String direccion, int numHabitaciones, int numBaños, int numPisos ){
        super(area, identificadorInmobilario, direccion, numHabitaciones, numBaños);
        this.numPisos = numPisos;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El numero de pisos es: "+ numPisos);
    }
}
