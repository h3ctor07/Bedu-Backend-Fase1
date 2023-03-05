import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSumaTest {
    static Calculadora calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba Suma")
    void sumaTest() {
        int esperado = 5;
        assertEquals(esperado, calculadora.suma(3,2));
    }
}