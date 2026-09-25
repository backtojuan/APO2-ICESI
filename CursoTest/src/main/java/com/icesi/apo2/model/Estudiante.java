package com.icesi.apo2.model;

public class Estudiante {

    private String nombre;
    private String codigo;
    private String correo;
    private int semestre;
    private String carrera;

    public Estudiante(String nombre, String codigo, String correo, int semestre, String carrera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }
}
