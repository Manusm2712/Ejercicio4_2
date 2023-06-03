/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;

/**
 *
 * @author maria
 */
public class Inmueble {
    protected int identificadorInmobilario;
    protected int area;
    protected String direccion;
    protected double precioVenta;  

    public Inmueble(int area, int identificadorInmobilario, String direccion){
        this.area = area;
        this.identificadorInmobilario = identificadorInmobilario;
        this.direccion = direccion;
        this.precioVenta = 0;
    }
    public double calcularPrecioVenta (double valorArea){
        valorArea = valorArea*area;
        precioVenta = valorArea;
        return valorArea;
    }    
    public void imprimir(){
        System.out.println("El identificador inmobilario es: "+identificadorInmobilario);
        System.out.println("El area es: "+area);
        System.out.println("La direccion es: "+direccion);
        System.out.println("El precio de la venta es: "+precioVenta);
    }
}

