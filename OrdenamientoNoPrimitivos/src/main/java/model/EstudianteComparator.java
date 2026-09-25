package model;

import java.util.Comparator;

public class EstudianteComparator implements Comparator<Estudiante> {

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


}
