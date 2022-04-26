import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarLetras {

        @Test
        public void ejemplo1() {
            Integer[] input = {"Holaaa!"};
            String outputEsperado = "{h=1,0=1,I=1,a=3,!=1}";
            String outputActual = EjercicioContarLetrasS.Ejercicio(input);
            Assertions.assertEquals(outputEsperado, outputActual);
            // System.out.println("Test A ejecutado");

        }

        @Test
        public void ejemplo2() {
            Integer[] input = {"Holah!"};
            String outputEsperado = "{h=2,0=1,I=1,a=1,!=1}";
            String outputActual = EjercicioContarLetrasS.Ejercicio(input);
            Assertions.assertEquals(outputEsperado, outputActual);
            // System.out.println("Test A ejecutado");

        }

        @Test
        public void ejemplo3() {
            Integer[] input = {};
            String outputEsperado = null;
            String outputActual = EjercicioContarLetrasS.Ejercicio(input);
            Assertions.assertNull();
            // System.out.println("Test A ejecutado");

        }
    }
