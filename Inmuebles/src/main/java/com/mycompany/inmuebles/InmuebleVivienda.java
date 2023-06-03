/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;
public class InmuebleVivienda extends Inmueble {
    protected int numHabitaciones;
    protected int numBaños;
    
    public InmuebleVivienda(int area, int identificadorInmobilario, String direccion, int numHabitaciones, int numBaños){
        super(area, identificadorInmobilario, direccion);
        this.numBaños = numBaños;
        this.numHabitaciones = numHabitaciones;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El numero de habitaciones es: "+numHabitaciones);
        System.out.println("El numero de baños es: "+numBaños);
    }
}
