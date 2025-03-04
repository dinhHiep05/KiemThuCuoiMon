package com.example.ThiCuoiMon.service;

import com.example.ThiCuoiMon.entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> nhanViens = new ArrayList<>();

    public void add (NhanVien nhanVien){
        nhanViens.add(nhanVien);
    }

    public NhanVien getNVbyMaNV (String ma){
        for (NhanVien nhanVien : nhanViens){
            if (nhanVien.getMaNV() == ma){
                return nhanVien;
            }
        }
        return null;
    }

    public void update (NhanVien nhanVien){
        if (nhanVien==null){
            throw new IllegalArgumentException("không tồn tại nhân viên có mã: "+nhanVien.getMaNV());
        }
        for (int i=0; i<nhanViens.size(); ++i){
            if (nhanViens.get(i).getMaNV()==nhanVien.getMaNV()){
                nhanViens.set(i, nhanVien);
            }
        }
    }
}
