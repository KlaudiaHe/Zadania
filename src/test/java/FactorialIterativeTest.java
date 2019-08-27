import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialIterativeTest {

    @ParameterizedTest
    @CsvSource({ "0, 1", "3, 6", "9, 362880", "-7, 5040"})
    void sum3And5Till(int number, int expected) {
        //act
        int factorial = FactorialIterative.IterativeFactorial(number);

        //assert
        assertEquals(expected, factorial);
    }
}
