package com.example.ThiCuoiMon.service;

import com.example.ThiCuoiMon.entity.NhanVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    private NhanVienService nhanVienService;
    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }

    @Test
    void updateValid() {
        NhanVien nhanVien = new NhanVien("nv1", "h", 19, 90, 9,"abc");
        nhanVienService.add(nhanVien);

        nhanVien.setTen("b");
        nhanVien.setTuoi(18);
        nhanVien.setLuong(10);
        nhanVien.setSoNamLamViec(10);
        nhanVien.setPhongBan("aaa");
        nhanVienService.update(nhanVien);

        assertEquals("nv1", nhanVienService.getNVbyMaNV("nv1").getMaNV());
        assertEquals("b",nhanVienService.getNVbyMaNV("nv1").getTen());
        assertEquals(18,nhanVienService.getNVbyMaNV("nv1").getTuoi());
        assertEquals(10,nhanVienService.getNVbyMaNV("nv1").getLuong());


    }


    @Test
    void updateWithNameNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> nhanVienService.update(new NhanVien("nv1", "", 19, 90, 9,"abc")));
        assertEquals("tên không để trống", exception.getMessage());
    }

    @Test
    void updateWithTuoiAm(){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> nhanVienService.update(new NhanVien("nv1", "a", -1, 90, 9,"abc")));
        assertEquals("tuổi phải lớn hơn 18", exception.getMessage());
    }

    @Test
    void updateWithLuongAm(){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> nhanVienService.update(new NhanVien("nv1", "a", 19, -90, 9,"abc")));
        assertEquals("lương phải lớn hơn 0", exception.getMessage());
    }

    @Test
    void updateWithNamLamAm(){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> nhanVienService.update(new NhanVien("nv1", "a", 19, 90, -9,"abc")));
        assertEquals("số nam phải lớn hơn 0", exception.getMessage());
    }

    @Test
    void updateWithPhongBanNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> nhanVienService.update(new NhanVien("nv1", "as", 19, 90, 9,"")));
        assertEquals("phòng ban không để trống", exception.getMessage());
    }

}