package com.example.ThiCuoiMon.ultil;

public class Bai1 {

    public int tong(int n){
        int tong=0;
        if (n<0){
            throw new IllegalArgumentException("số nguyên phải lớn hơn 0");
        }
        else {
            for (int i=0 ; i<= n; ++i){
                if (i%6!=0){
                    tong+=i;
                }
            }
        }

        return tong;
    }
}
