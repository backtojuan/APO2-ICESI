package ui;

import model.Estudiante;
import model.EstudianteComparator;
import sorting.Sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Estudiante[] estudiantes = new Estudiante[]{new Estudiante("Saray","Jimenez",3),
                new Estudiante("Isabella", "Gordillo", 3),
                new Estudiante("Daniel", "Fernandez", 5),
                new Estudiante("Daniel", "Herrera", 4)};


        System.out.println("ANTES DE ORDENAR\n");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }

        //Sort.bubbleSort(estudiantes,4);

        Arrays.sort(estudiantes, new EstudianteComparator());

        System.out.println("DESPUES DE ORDENAR\n");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }
    }
}
