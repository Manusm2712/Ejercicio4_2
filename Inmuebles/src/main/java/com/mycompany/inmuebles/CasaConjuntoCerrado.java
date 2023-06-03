/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;

/**
 *
 * @author maria
 */
public class CasaConjuntoCerrado extends CasaUrbana{
    protected double valorArea= 2500000;
    protected double valorAdministracion;
    protected double piscina;
    protected boolean camposDeportivos;
    
    public CasaConjuntoCerrado(int area, int identificadorInmobilario, String direccion, int numHabitaciones, int numBaños, int numPisos,double valorAdministracion,double piscina,boolean camposDeportivos){
        super(area, identificadorInmobilario, direccion, numHabitaciones, numBaños, numPisos);
        this.valorAdministracion = valorAdministracion;
        this.piscina = piscina;
        this.camposDeportivos = camposDeportivos;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El valor del area es: "+ valorArea);
        System.out.println("El valor de la administracion es: "+ valorAdministracion);
        System.out.println("Tiene piscina de: "+ piscina);
        System.out.println("Tiene campos deportivos: "+ camposDeportivos);
    }
}
