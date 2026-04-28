import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    /*
     * Unit test koji proverava da li kalkulator ispravno
     * računa aritmetički izraz sa prioritetom operacija.
     *
     * Testira se da li se množenje izvršava pre sabiranja.
     *
     * Izraz: 2 + 3 * 4
     * Očekivani rezultat: 14.0
     */
    @Test
    public void testCalculateExpressionWithOperatorPriority() {
        String result = Calculator.Run("2+3*4");
        assertEquals("14.0", result);
    }
}