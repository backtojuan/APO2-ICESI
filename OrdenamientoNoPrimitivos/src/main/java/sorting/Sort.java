package sorting;

import model.Estudiante;

public class Sort {

    // Una version optimizada del algoritmo de burbuja
    public static void bubbleSort(Estudiante[] estudiantes, int n){
        int i, j;
        Estudiante temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (estudiantes[j].compareTo(estudiantes[j+1])>0) {
                    // Intercambia elementos
                    temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubieron elementos intercambiados, frena el ciclo interno
            if (swapped == false)
                break;
        }
    }
}
