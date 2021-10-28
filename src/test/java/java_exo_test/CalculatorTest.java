package java_exo_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class CalculatorTest {
    @Test
    void should_add_correctly() {
        assertEquals(8., Calculator.add(4, 4));
    }

    @Test
    void should_substract_correctly() {
        assertEquals(0., Calculator.soustract(4, 4));
    }

    @Test
    void should_multiply_correctly() {
        assertEquals(16., Calculator.mul(4, 4));
    }

    @Test
    void should_divide_correctly() {
        assertEquals(1., Calculator.div(4, 4));
    }

    @Test
    void should_power_correctly() {
        assertEquals(64., Calculator.pow(4,3));
    }

    @Test
    void should_racine_correctly() {
        assertEquals(2., Calculator.sqrt(4));
    }

    @Test
    void should_not_add_correctly() {
        assertNotEquals(12., Calculator.add(5, 8));
    }

    @Test
    void should_not_substract_correctly() {
        assertNotEquals(1., Calculator.soustract(4, 4));
    }

    @Test
    void should_not_multiply_correctly() {
        assertNotEquals(26., Calculator.mul(4, 4));
    }

    @Test
    void should_not_divide_correctly() {
        assertNotEquals(6., Calculator.div(4, 4));
    }

    @Test
    void should_not_power_correctly() {
        assertNotEquals(6., Calculator.pow(4, 3));
    }
    @Test
    void should_not_square_correctly() {
        assertNotEquals(6., Calculator.sqrt(4));
    }
}