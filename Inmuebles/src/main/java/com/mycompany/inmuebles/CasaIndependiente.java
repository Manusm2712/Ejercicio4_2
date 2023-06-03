/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;
public class CasaIndependiente extends CasaUrbana {
    protected double valorArea=3000000;
    
    public CasaIndependiente(int area, int identificadorInmobilario, String direccion, int numHabitaciones, int numBaños, int numPisos){
        super(area, identificadorInmobilario, direccion, numHabitaciones, numBaños, numPisos);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El valor del area es: "+ valorArea);
    }
}
