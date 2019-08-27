import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.InputMismatchException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialRecursiveTest {

    @ParameterizedTest
    @CsvSource({ "0, 1", "3, 6", "9, 362880", "-7, 5040"})
    void sum3And5Till(int number, int expected) {
        //act
        int factorial = FactorialRecursive.recursiveFactorial(number);

        //assert
        assertEquals(expected, factorial);
    }
}
