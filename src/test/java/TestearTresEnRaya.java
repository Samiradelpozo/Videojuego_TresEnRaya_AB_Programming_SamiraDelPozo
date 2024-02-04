import org.example.Ganador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestearTresEnRaya {
    // Testear ganador por filas
    @Test
    public void testearGanadorFilaX(){
        String[] tabla = {"X", "X", "X", "_", "_", "_", "_", "_", "_"};
        assertTrue(Ganador.hayGanador(tabla));
    }
    @Test
    public void testearGanadorFilaO(){
        String[] tabla = {"_", "_", "_", "O", "O", "O", "_", "_", "_"};
        assertTrue(Ganador.hayGanador(tabla));
    }
    // Testear ganador por columna
    @Test
    public void testearGanadorColX(){
        String[] tabla = {"X", "_", "_", "X", "_", "_", "X", "_", "_"};
        assertTrue(Ganador.hayGanador(tabla));
    }
    @Test
    public void testearGanadorColO(){
        String[] tabla = {"_", "O", "_", "_", "O", "_", "_", "O", "_"};
        assertTrue(Ganador.hayGanador(tabla));
    }
    // Testear ganador por diagonal
    @Test
    public void testearGanadorDiagonal(){
        String[] tabla = {"X", "_", "_", "_", "X", "_", "_", "_", "X"};
        assertTrue(Ganador.hayGanador(tabla));
    }
    // Testear empate
    @Test
    public void testearEmpate(){
        String[] tabla = {"X", "O", "X", "O", "O", "X", "X", "X", "O"};
        assertTrue(Ganador.tablaLlena(tabla));
    }
}
