package ru.netology.sqr;

public class SQRService {
    public int sqrRangeCounter(int from, int to) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (from <= i * i && i * i <= to) {
                counter++;
            }
        }
        return counter;
    }
}
