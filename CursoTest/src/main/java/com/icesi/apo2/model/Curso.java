package com.icesi.apo2.model;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private String profesor;
    private int creditos;
    private int cupo;

    private Estudiante[] estudiantes;

    public Curso(String nombre, String profesor, int creditos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
        this.cupo = 25;
        estudiantes = new Estudiante[25];
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getCupo() {
        return cupo;
    }

    public boolean registrarEstudiante(String nombre, String codigo, String correo, int semestre, String carrera){

        boolean flag = false;

        if(!nombre.isEmpty() && codigo.contains("A") && (codigo.length()==9) && correo.contains("@u.icesi.edu.co") && carrera.equalsIgnoreCase("Ingenieria de Sistemas")){
            if(cupo > 0){
                for (int i=0; i<estudiantes.length && !flag;i++){
                    if(estudiantes[i] == null){
                        estudiantes[i] = new Estudiante(nombre, codigo, correo, semestre,carrera);
                        flag = true;
                        cupo--;
                    }
                }
            }
        }
        return flag;
    }
}
