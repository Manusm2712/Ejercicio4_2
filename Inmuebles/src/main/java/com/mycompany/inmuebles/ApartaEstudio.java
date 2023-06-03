/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;
public class ApartaEstudio extends Apartamento {
    protected double valorArea = 1500000;

    public ApartaEstudio (int area, int identificadorInmobilario, String direccion, int numHabitaciones, int numBaños){
        super(area, identificadorInmobilario, direccion, numHabitaciones, numBaños);
    }   
    public void imprimir(){
        super.imprimir();
        System.out.println("El valor del area es: "+ valorArea);
    }    
}
