/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;

/**
 *
 * @author maria
 */
public class Local extends Inmueble {
    enum tipo {INTERNO,CALLE};
    protected tipo tipoLocal;
    
    public Local (int area, int identificadorInmobilario, String direccion, tipo tipoLocal){
        super(area, identificadorInmobilario, direccion);
        this.tipoLocal = tipoLocal;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }     
}
