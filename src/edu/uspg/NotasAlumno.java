/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

import edu.uspg.model.Alumno;
import edu.uspg.model.AlumnoCurso;
import edu.uspg.model.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morozco
 */
public class NotasAlumno {

    static List<Alumno> listaAlumno = new ArrayList();
    static List<Curso> listaCurso = new ArrayList();
    static List<AlumnoCurso> listaAlumnoCurso = new ArrayList();
    public static Integer notas[] = new Integer[5];
    public static void main(String[] args) {
       Alumno juan = new Alumno(202011, "Juan", 
            "Perez", "Escuintla", 
            0.0, 1, "juan@uspg.edu.gt");
       Alumno pedro = new Alumno(202011, "Pedro", 
            "Aguilar", "Escuintla", 
            0.0, 2, "pedro@uspg.edu.gt");
       
       Curso curso = new Curso(1, "Programación II", 
               "Programación Orientada a Objetos", 
               5, false, notas);
       
        Curso curso2 = new Curso(2, "Física", 
               "Descripción del curso", 
               4, false, notas);
       
       
        
        
       listaAlumno.add(juan);
       listaAlumno.add(pedro);
       
       listaCurso.add(curso);
       listaCurso.add(curso2);
       
       AlumnoCurso alumnoCurso = new AlumnoCurso(1,juan,listaCurso);
       
       listaAlumnoCurso.add(alumnoCurso);
    }
    
}
