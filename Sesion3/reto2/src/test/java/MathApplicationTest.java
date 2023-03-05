import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MathApplicationTest {

    @Mock
    CalculadoraService calcService;

    @InjectMocks
    MathApplication mathApplication;


    @Test
    void add() {
        when(calcService.add(10.0, 20.0)).thenReturn(30.0);
        assertEquals(mathApplication.add(10.0,20.0), 30.0, 0);
        verify(calcService).add(20.0,30);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}