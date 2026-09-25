package model;

import java.util.Comparator;

public class Estudiante implements Comparable<Estudiante>{

    //Criterio de orden alterno nombres
    private String nombres;
    //Criterio de orden principal
    private String apellidos;
    //Criterio de desempate
    private int semestre;

    public Estudiante(String nombres, String apellidos, int semestre) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.semestre = semestre;
    }

    public String getNombres() {
        return nombres;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        if(this.apellidos.compareTo(otroEstudiante.apellidos)>0){
            return 1;
        }
        else if(this.apellidos.compareTo(otroEstudiante.apellidos)<0){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return this.nombres + " " + this.apellidos + " " + this.semestre + "\n";
    }

    EstudianteComparator estudianteComparator = new EstudianteComparator() {

        @Override
        public int compare(Estudiante estudiante1, Estudiante estudiante2) {
            if(estudiante1.getNombres().compareTo(estudiante2.getNombres())>0){
                return 1;
            }
            else if(estudiante1.getNombres().compareTo(estudiante2.getNombres())<0){
                return -1;
            }
            if(estudiante1.getSemestre() > estudiante2.getSemestre()){
                return 1;
            } else if (estudiante1.getSemestre() < estudiante2.getSemestre()) {
                return -1;
            }
            return 0;
        }
    };
}
