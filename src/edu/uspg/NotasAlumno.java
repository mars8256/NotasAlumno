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
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author morozco
 */
public class NotasAlumno {

    static List<Alumno> listaAlumno = new ArrayList();
    static List<Curso> listaCurso = new ArrayList();
    static List<AlumnoCurso> listaAlumnoCurso = new ArrayList();
    public static Integer notas[] = new Integer[5];
        
    static int opcionMenuPrincipal;
    static public Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
         menuPrincipal();
    }
    
    public static void menuPrincipal(){
        
        System.out.println("MENÚ");
        System.out.println("================");
        System.out.println("1. GRABAR CURSO");
        System.out.println("2. GRABAR ALUMNO");
        System.out.println("3. ASOCIAR ALUMNO CURSO");
        System.out.println("4. CURSOS EXISTENTES");
        System.out.println("5. SALIR");
        
        System.out.println("Seleccione su opción:");
        opcionMenuPrincipal = sc.nextInt();
        
        switch(opcionMenuPrincipal){
        
            case 1:
                grabarCurso();
                break;
            case 2:
                grabarAlumno();
                break;
            case 3:
                asociarAlumnoCurso();
                break;
            case 4:
                cursosExistentes();
                break;
            case 5:
                listaAlumnoCursosAsociados();
                break;
            case 6:
                ingresarNotas();
                break;
            case 7:
                //salir
                break;
            default:
                System.out.println("opción no encontrada");
                break;
        }
                
        
    }
    
    public static void grabarCurso(){
  
        Curso curso;
        
        Integer idCurso;
        String nombre;
        String descripcion;
        Integer creditos;
        boolean aprobado = true;
               
        System.out.println("Ingrese idCurso:");
        idCurso = sc.nextInt();
        
        System.out.println("Ingrese nombre:");
        nombre = sc.next();
        
        System.out.println("Ingrese creditos:");
        creditos = sc.nextInt();
        
        System.out.println("Ingrese descripcion:");
        descripcion = sc.next();
        
        curso = new Curso(idCurso,nombre,descripcion,creditos,aprobado,notas);
        
        listaCurso.add(curso);
        
        System.out.println("mensaje grabado correctamente.");
        menuPrincipal();
    }
    
    public static void cursosExistentes(){
        Iterator<Curso> iteratorCurso = listaCurso.iterator();
        Curso curso;
        System.out.println(listaCurso.size()); 
        
        System.out.println("\t\tLISTA DE CURSOS");
        System.out.println("=======================================");
        System.out.println("codigo\t\tnombre\t\tcreditos");
        while(iteratorCurso.hasNext()){
            curso = iteratorCurso.next();
            System.out.println(curso.idCurso + "\t\t" + 
                    curso.nombre + "\t\t" + 
                    curso.creditos);
        }
        
        menuPrincipal();
    }
    
    public static void grabarAlumno(){}
    
    public static void asociarAlumnoCurso(){}
    
    public static void listaAlumnoCursosAsociados(){}
    
    public static void ingresarNotas(){}
    
} 
