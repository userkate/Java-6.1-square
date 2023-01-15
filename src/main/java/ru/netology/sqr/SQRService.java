package ru.netology.sqr;

public class SQRService {
    public int squares(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int checkedNumber = i * i;
            if (checkedNumber >= min && checkedNumber <= max) {
                counter++;
            }
        }
        return counter;
    }
}