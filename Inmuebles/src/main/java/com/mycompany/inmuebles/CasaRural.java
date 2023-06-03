/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;
public class CasaRural extends Casa {
    protected double valorArea= 1500000;
    protected int distanciaCabera;
    protected int altitud;
    
    public CasaRural(int area, int identificadorInmobilario, String direccion, int numHabitaciones, int numBaños, int numPisos, int distancia, int altitud){
        super(area, identificadorInmobilario, direccion, numHabitaciones, numBaños, numPisos);
        this.distanciaCabera = distancia;
        this.altitud = altitud;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El valor del area es: "+valorArea);
        System.out.println("La distancia cabera: "+distanciaCabera);
        System.out.println("La altitud es: "+altitud);
    }
}
