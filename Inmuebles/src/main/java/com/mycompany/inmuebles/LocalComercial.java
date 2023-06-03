/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;

/**
 *
 * @author maria
 */
public class LocalComercial extends Local{
    protected double valorArea =3000000;
    protected String centroComercial;
    
    public LocalComercial (int area, int identificadorInmobilario, String direccion, tipo tipoLocal, String centroComercial){
        super(area, identificadorInmobilario, direccion,tipoLocal);
        this.centroComercial = centroComercial;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El valor de area es: " + valorArea);
        System.out.println("El nombre del centro comercial es: " + centroComercial);
    } 
}
