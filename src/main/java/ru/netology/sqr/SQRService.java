package ru.netology.sqr;

public class SQRService {

    public static int permutation(int lowLineLimit, int upLineLimit) {

        int countSquares = 0;
        for (int i = 10; i >= 10 && i <= 99; i++) {
            int squareOfNumber = i * i;

            if (squareOfNumber >= lowLineLimit && squareOfNumber <= upLineLimit) {
                countSquares++;

            }
        }
        return countSquares;
    }
}
