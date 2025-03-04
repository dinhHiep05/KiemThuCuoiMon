package com.example.ThiCuoiMon.entity;

public class NhanVien {
    private String maNV;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;
    private String phongBan;

    public NhanVien(String maNV, String ten, int tuoi, float luong, int soNamLamViec, String phongBan) {
        setMaNV(maNV);
        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);
        setPhongBan(phongBan);
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        if (maNV.isEmpty() || maNV == null){
            throw new IllegalArgumentException("mã không được trống");
        }
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten.isEmpty() || ten==null){
            throw new IllegalArgumentException("tên không để trống");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi<18){
            throw new IllegalArgumentException("tuổi phải lớn hơn 18");

        }
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        if (luong<0){
            throw new IllegalArgumentException("lương phải lớn hơn 0");

        }
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        if (soNamLamViec<0){
            throw new IllegalArgumentException("số nam phải lớn hơn 0");

        }
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if (phongBan.isEmpty()||phongBan==null){
            throw new IllegalArgumentException("phòng ban không để trống");

        }
        this.phongBan = phongBan;
    }
}
