/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;

/**
 *
 * @author maria
 */
public class ApartamentoFamiliar extends Apartamento {
    protected double valorArea = 2000000;
    protected int valorAdministracion;
    
    public ApartamentoFamiliar (int area, int identificadorInmobilario, String direccion, int numHabitaciones, int numBaños, int valorAdministracion){
        super(area, identificadorInmobilario, direccion, numHabitaciones, numBaños);
        this.valorAdministracion = valorAdministracion;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El valor del area es: "+ this.valorArea);
        System.out.println("El valor de la administracion: "+ valorAdministracion);
    }
}
