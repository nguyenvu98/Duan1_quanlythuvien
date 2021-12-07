/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.Sach;
import com.Librarybook.util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class SachDAO extends SystemDAO<Sach, String> {

    @Override
    public void insert(Sach entity) {
        String sql = "INSERT INTO Sach (MaSach, TenSach, MaDanhMucSach, MaTheLoai, TenTacGia, TenNXB, SoLuong, NoiDung) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, entity.getMaSach(),
                entity.getTenSach(),
                entity.getMaDMSach(),
                entity.getMaTheLoai(),
                entity.getTacGia(),
                entity.getNXB(),
                entity.getSoLuongC(),
                entity.getTomTatND()
        );
    }

    @Override
    public void update(Sach entity) {
        String sql = "UPDATE Sach SET TenSach=?, MaDanhMucSach=?, MaTheLoai=?, TenTacGia=?, TenNXB=?, SoLuong=?, NoiDung = ? WHERE MaSach=?";
        XJdbc.update(sql, entity.getTenSach(),
                entity.getMaDMSach(),
                entity.getMaTheLoai(),
                entity.getTacGia(),
                entity.getNXB(),
                entity.getSoLuongC(),
                entity.getTomTatND(),
                entity.getMaSach()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM Sach WHERE MaSach=?";
        XJdbc.update(sql, id);
    }

    @Override
    public List<Sach> selectAll() {
        String sql = "select * from Sach";
        return this.selectBySql(sql);
    }

    @Override
    public Sach selectById(String MaSach) {
        String sql = "select * from Sach where MaSach = ?";
        List<Sach> list = this.selectBySql(sql, MaSach);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<Sach> selectBySql(String sql, Object... args) {
        List<Sach> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Sach entity = new Sach();
                entity.setMaSach(rs.getString("MaSach"));
                entity.setTenSach(rs.getString("TenSach"));
                entity.setMaDMSach(rs.getString("MaDanhMucSach"));
                entity.setMaTheLoai(rs.getString("MaTheLoai"));
                entity.setTacGia(rs.getString("TenTacGia"));
                entity.setNXB(rs.getString("TenNXB"));
                entity.setSoLuongC(rs.getInt("SoLuong"));
                entity.setTomTatND(rs.getString("NoiDung"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }   
}
