package HomeWork_3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @ParameterizedTest
    @ValueSource(ints = {24, 25, 50, 99, 100})
    @DisplayName("Does the number belong to the interval")
    void numberInInterval(int number) {
        Task2 task2 = new Task2();
        assertTrue(task2.numberInInterval(number));
    }
}