package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculalateLowLineLimit100UpLineLimit200() {

        int lowLineLimit = 100;
        int upLineLimit = 200;
        int expected = 5;

        int actual = SQRService.Permutation(lowLineLimit, upLineLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculalateLowLineLimit500UpLineLimit1000() {

        int lowLineLimit = 500;
        int upLineLimit = 1000;
        int expected = 9;

        int actual = SQRService.Permutation(lowLineLimit, upLineLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculalateLowLineLimit1000UpLineLimit7000() {

        int lowLineLimit = 1000;
        int upLineLimit = 7000;
        int expected = 52;

        int actual = SQRService.Permutation(lowLineLimit, upLineLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculalateLowLineLimit8000UpLineLimit9800() {

        int lowLineLimit = 8000;
        int upLineLimit = 10000;
        int expected = 10;

        int actual = SQRService.Permutation(lowLineLimit, upLineLimit);

        assertEquals(expected, actual);
    }
}