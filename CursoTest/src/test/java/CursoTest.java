import com.icesi.apo2.model.Curso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CursoTest {

    public Curso curso;

    private void setUp1(){
        curso = new Curso("Algoritmos y Programación 2", "Juan José Valencia", 3);
    }

    @Test
    public void testRegistrarEstudiante(){
        //Arrange
        curso = new Curso("Algoritmos y Programación 2", "Juan José Valencia", 3);
        String nombre = "Saray Jimenez";
        String correo = "saray@u.icesi.edu.co";
        String codigo = "A00123456";
        int semestre = 3;
        String carrera = "Ingenieria de Sistemas";

        //Act
        boolean resultado = curso.registrarEstudiante(nombre,codigo,correo,semestre,carrera);

        //Arrange
        Assertions.assertTrue(resultado);
        Assertions.assertEquals(24,curso.getCupo());
    }


}
