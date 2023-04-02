package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum_should_return_summary() {

        Calculator calculator = new Calculator();

        var expected = 3 + 5;
        double actual = calculator.sum(3, 5);

//        Assertions.assertEquals(expected, actual, "not equals");

        Assertions.assertTrue(expected == actual, "not equals");
    }

    @Test
    void sub_should_return_subtraction() {

        Calculator calculator = new Calculator();

        var expected = 10 - 5;
        var actual = calculator.sub(10, 5);

        assertEquals(expected, actual, "something wrong...");
    }

    @Test
    void checkNull() {

        Student student = new Student();

        assertNotNull(student.getName(), "null value");
    }

    @Test
    void compare2Arrays() {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 1, 3};

//        assertArrayEquals(arr1, arr2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        assertArrayEquals(arr1, arr2);

    }

    @Test
    void personsAreSame() {

        var john = new Person("John", "Doe");
        var doe = new Person("John", "Doe");

        assertEquals(john, doe);
    }

    @Test
    void personsAreNotSameInstance() {
        Person john = new Person("John", "Doe");
        Person doe = new Person("John", "Doe");

        assertNotSame(john, doe);
    }


    @Test
    void divideByZeroThrowsIllegalArgumentException() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }


    @Test
    void firstAndLastNameMatches() {
        Person person = new Person("John", "Doe");

        assertAll("person",
                () -> assertEquals("John", person.getFirstName()),
                () -> assertEquals("Doe", person.getLastName())
        );
    }

}