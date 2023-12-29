package HomeWork_3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 0, 1, 2})
    @DisplayName("Is the number even")
    void evenOddNumber(int number) {
        Task1 task1 = new Task1();
        assertTrue(task1.evenOddNumber(number));
    }
}