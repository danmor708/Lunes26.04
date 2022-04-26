import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTexto {

    @Test
    public void testA() {
        Integer[] input = {1,1,1,1};
        String outputEsperado = "{1=4}";
        String outputActual = EjercicioTexting.Ejemplo1(input);
        Assertions.assertEquals(outputEsperado, outputActual);
        // System.out.println("Test A ejecutado");

    }

    @Test
    public void testB() {
        System.out.println("Test B ejecutado");

    }
}