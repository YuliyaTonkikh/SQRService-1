package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    int left = 0;
    int right = 0;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.left = 200;
        this.right = 300;


    }

    @org.junit.jupiter.api.Test
    void findNumberOfSquares() {
        int expected = 3;
        assertEquals(expected, SQRService.findNumberOfSquares(this.left, this.right));
    }
}