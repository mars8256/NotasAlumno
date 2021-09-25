/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.model;

import java.util.List;

/**
 *
 * @author morozco
 */
public class AlumnoCurso {
    public Integer idAlumnoCurso;
    public Alumno alumno;
    public List<Curso> listaCursos;

    public AlumnoCurso(Integer idAlumnoCurso, Alumno alumno, List<Curso> listaCursos) {
        this.idAlumnoCurso = idAlumnoCurso;
        this.alumno = alumno;
        this.listaCursos = listaCursos;
    }

    public Integer getIdAlumnoCurso() {
        return idAlumnoCurso;
    }

    public void setIdAlumnoCurso(Integer idAlumnoCurso) {
        this.idAlumnoCurso = idAlumnoCurso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
    
    
    
}
