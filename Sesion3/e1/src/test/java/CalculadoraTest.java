import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();
    @Test
    @DisplayName("Prueba suma")
    void sumaTest() {
        int esperado = 5;
        assertEquals(esperado, calculadora.suma(3,2));
    }

    @Test
    @DisplayName("Prueba resta")
    void restaTest() {
        int esperado = 1;
        assertEquals(esperado, calculadora.resta(3,2));
    }

    @Test
    @DisplayName("Prueba multiplicacion")
    void multiplicaTest() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiplica(3,2));
    }

    @Test
    @DisplayName("Prueba dividir entre 0")
    void divideEntre0Test() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100,0), "No es posible dividir un valor entre 0");
    }

    @Test
    @DisplayName("Prueba division")
    void divide() {
        assertEquals(3, calculadora.divide(12,4));
    }
}