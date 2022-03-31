package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculalateLeft100Right200() {

        int left = 100;
        int right = 200;
        int expected = 5;

        int actual = SQRService.Permutation(left, right);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculalateLeft500Right1000() {

        int left = 500;
        int right = 1000;
        int expected = 9;

        int actual = SQRService.Permutation(left, right);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculalateLeft1000Right7000() {

        int left = 1000;
        int right = 7000;
        int expected = 52;

        int actual = SQRService.Permutation(left, right);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculalateLeft8000Right9800() {

        int left = 8000;
        int right = 10000;
        int expected = 10;

        int actual = SQRService.Permutation(left, right);

        assertEquals(expected, actual);
    }
}