package ru.netology;

public class SQRService {


    public static int findNumberOfSquares(int left, int right) {
        int countSquares = 0; // счетчик количества квадратов
        int i = 0;
        for (i = 10; i <= 99; i++) {
            int value = (int) Math.pow(i, 2);
            if (value >= left && value <= right) {
                countSquares++;
            }
        }
        return countSquares;
    }
}
