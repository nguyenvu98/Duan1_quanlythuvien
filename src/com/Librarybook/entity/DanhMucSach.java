/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.entity;

/**
 *
 * @author user
 */
public class DanhMucSach {

    private String MaDanhMucSach;
    private String TenDanhMucSach;

    @Override
    public String toString() {
        return this.getMaDanhMucSach();
    }

    
    public DanhMucSach(String MaDanhMucSach, String TenDanhMucSach) {
        this.MaDanhMucSach = MaDanhMucSach;
        this.TenDanhMucSach = TenDanhMucSach;
    }

    public DanhMucSach() {
    }

    public String getMaDanhMucSach() {
        return MaDanhMucSach;
    }

    public void setMaDanhMucSach(String MaDanhMucSach) {
        this.MaDanhMucSach = MaDanhMucSach;
    }

    public String getTenDanhMucSach() {
        return TenDanhMucSach;
    }

    public void setTenDanhMucSach(String TenDanhMucSach) {
        this.TenDanhMucSach = TenDanhMucSach;
    }

}
