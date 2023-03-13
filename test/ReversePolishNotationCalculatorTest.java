import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReversePolishNotationCalculatorTest {
    private static ReversePolishNotationCalculator reversePolishNotationCalculator;

    @BeforeAll
    static void beforeAll() {
        reversePolishNotationCalculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        assertEquals(7, reversePolishNotationCalculator.calculatePolishNotation("4 3 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(1, reversePolishNotationCalculator.calculatePolishNotation("4 3 -"));
    }

    @Test
    public void shouldCalculateProduction() {
        assertEquals(12, reversePolishNotationCalculator.calculatePolishNotation("4 3 *"));
    }

    @Test
    public void shouldCalculateAdditionForOneNegativeOperand() {
        assertEquals(-1, reversePolishNotationCalculator.calculatePolishNotation("-4 3 +"));
    }

    @Test
    public void shouldCalculateSubtractionForOneNegativeOperand() {
        assertEquals(7, reversePolishNotationCalculator.calculatePolishNotation("4 -3 -"));
    }

    @Test
    public void shouldCalculateProductionForOneNegativeOperand() {
        assertEquals(-12, reversePolishNotationCalculator.calculatePolishNotation("4 -3 *"));
    }

    @Test
    public void shouldCalculateCompoundArithmeticInPresenceOfSomeAdditionalSpaces() {
        assertEquals(10, reversePolishNotationCalculator.calculatePolishNotation("-2 -1  4  0 +  -  *"));
    }
}
