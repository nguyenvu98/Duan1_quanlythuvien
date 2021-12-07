/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.ChiTietPhieuMuon;
import com.Librarybook.entity.PhieuMuon;
import com.Librarybook.util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class PhieuMuonDAO extends SystemDAO<PhieuMuon, Integer> {
    
    @Override
    public void insert(PhieuMuon entity) {
        String sql = "insert into PhieuMuon(MaPM, NgayMuon, SoNgayMuon, MaNV, GhiChu, TrangThai) values(?,?,?,?,?,?)";
        XJdbc.update(sql, entity.getMaPM(),
                entity.getNgayMuon(),
                entity.getSoNgayMuon(),
                entity.getMaNV(),
                entity.getGhiChu(),
                entity.getTrangThai()
        );
    }
    
    @Override
    public void update(PhieuMuon entity) {
        String sql = "update PhieuMuon set NgayMuon = ?, SoNgayMuon = ?, MaNV = ?, GhiChu = ?, TrangThai = ? where MaPM = ?";
        XJdbc.update(sql, entity.getNgayMuon(),
                entity.getSoNgayMuon(),
                entity.getMaNV(),
                entity.getGhiChu(),
                entity.getTrangThai(),
                entity.getMaPM()
        );
    }
    
    @Override
    public void delete(Integer id) {
        String sql = "delete from PhieuMuon where MaPM = ?";
        XJdbc.update(sql, id);
    }
    
    @Override
    public List<PhieuMuon> selectAll() {
        String sql = "Select * from PhieuMuon";
        return this.selectBySql(sql);
    }
    
    @Override
    public PhieuMuon selectById(Integer id) {
        String sql = "select * from PhieuMuon where MaPM = ?";
        List<PhieuMuon> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    @Override
    protected List<PhieuMuon> selectBySql(String sql, Object... args) {
        
        List<PhieuMuon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                PhieuMuon entity = new PhieuMuon();
                entity.setMaPM(rs.getString("MaPM"));
                entity.setNgayMuon(rs.getDate("NgayMuon"));
                entity.setSoNgayMuon(rs.getInt("SoNgayMuon"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setTrangThai(rs.getString("TrangThai"));
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
