package com.example.ThiCuoiMon.ultil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai1Test {
    private Bai1 bai1;
    @BeforeEach
    void setUp() {
        bai1 = new Bai1();
    }

    @Test
    void tong() {
        assertEquals(49, bai1.tong(10));
    }

    @Test
    void tongGioiHanSoAm() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> bai1.tong(-1));
        assertEquals("số nguyên phải lớn hơn 0", exception.getMessage());

    }

    @Test
    void tongGioiHanLa6(){
        assertEquals(15, bai1.tong(6));
    }
}