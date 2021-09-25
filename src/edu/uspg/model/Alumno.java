/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.model;

import edu.uspg.inter.IPrintInformacion;

/**
 *
 * @author morozco
 */
public class Alumno extends Usuario implements IPrintInformacion {
    public Integer carnet;
    public String nombres;
    public String apellidos;
    public String direccion;
    public Double promedio;
    

    public Alumno(Integer carnet, String nombres, 
            String apellidos, String direccion, 
            Double promedio, Integer idUsuario, String correo) {
        //super(idUsuario,correo);
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.promedio = promedio;
        
    }

    public Integer getCarnet() {
        return carnet;
    }

    public void setCarnet(Integer carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public void showInformation() {
        System.out.println("Datos Alumno");
        System.out.println("id\t\tnombre");
        System.out.println(this.carnet + "\t\t" + this.apellidos + " " + this.nombres);
    }
    
    
    
}
