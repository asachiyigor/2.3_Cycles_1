package ru.netology.sqr;

public class SQRService {

    public static int Permutation(int left, int right) {

        int c = 0;
        for (int j = 10; j >= 10 && j <= 99; j++) {
            int d = j * j;

            if (d >= left && d <= right) {
                c++;

            }
        }
        return c;
    }
}
