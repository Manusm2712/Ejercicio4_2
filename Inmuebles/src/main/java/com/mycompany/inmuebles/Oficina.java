/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;

/**
 *
 * @author maria
 */
public class Oficina extends Local {
    protected double valorArea = 3500000;
    protected boolean esGobierno;
    
    public Oficina (int area, int identificadorInmobilario, String direccion, tipo tipoLocal, boolean esGobierno){
        super(area, identificadorInmobilario, direccion,tipoLocal);
        this.esGobierno = esGobierno;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("El valor de area es: " + valorArea);
        System.out.println("La oficina pertenece al gobierno: " + esGobierno);
    }     
}
