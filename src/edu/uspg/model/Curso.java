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
public class Curso implements IPrintInformacion {
    public Integer idCurso;
    public String nombre;
    public String descripcion;
    public Integer creditos;
    public boolean aprobado;
    public Integer notas[];
   

    public Curso(Integer idCurso, String nombre, String descripcion, Integer creditos, boolean aprobado, Integer[] notas) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.aprobado = aprobado;
        this.notas = notas;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }

    @Override
    public void showInformation() {
        System.out.println("Datos Curso");
        System.out.println("id\t\tnombre");
        System.out.println(this.idCurso + "\t\t" + this.nombre);
    }
    
    
    
    
}
