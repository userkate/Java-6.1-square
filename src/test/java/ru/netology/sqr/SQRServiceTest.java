package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @Test
    public void calcTestWhenBothNumberFinded() {
        SQRService service = new SQRService();
        int actual = service.squares(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestWhenOneNumberFinded() {
        SQRService service = new SQRService();
        int actual = service.squares(0, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestWhenZeroNumberFinded() {
        SQRService service = new SQRService();
        int actual = service.squares(10, 15);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}