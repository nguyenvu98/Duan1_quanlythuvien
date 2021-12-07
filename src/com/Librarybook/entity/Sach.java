/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.entity;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Sach {
    private String maSach ;
    private String tenSach;
    private String maDMSach;
    private String maTheLoai;
    private String tacGia;
    private String NXB;
    private int soLuongC;
    private String tomTatND ;

    public Sach(String maSach, String tenSach, String maDMSach, String maTheLoai, String tacGia, String NXB, int soLuongC, String tomTatND) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.maDMSach = maDMSach;
        this.maTheLoai = maTheLoai;
        this.tacGia = tacGia;
        this.NXB = NXB;
        this.soLuongC = soLuongC;
        this.tomTatND = tomTatND;
    }

    public Sach() {
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getMaDMSach() {
        return maDMSach;
    }

    public void setMaDMSach(String maDMSach) {
        this.maDMSach = maDMSach;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getSoLuongC() {
        return soLuongC;
    }

    public void setSoLuongC(int soLuongC) {
        this.soLuongC = soLuongC;
    }

    public String getTomTatND() {
        return tomTatND;
    }

    public void setTomTatND(String tomTatND) {
        this.tomTatND = tomTatND;
    }

}
