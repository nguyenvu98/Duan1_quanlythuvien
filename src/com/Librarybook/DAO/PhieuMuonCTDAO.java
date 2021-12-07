/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.ChiTietPhieuMuon;
import com.Librarybook.entity.NhanVien;
import com.Librarybook.util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class PhieuMuonCTDAO extends SystemDAO<ChiTietPhieuMuon, String> {

    @Override
    public void insert(ChiTietPhieuMuon entity) {
        String sql = "insert into CTPhieuMuon(MaPM, MaSach, NgayTra, TienPhat, TinhTrangSach) values(?,?,?,?,?)";
        XJdbc.update(sql, entity.getMaPM(),
                entity.getMaPM(),
                entity.getNgayTra(),
                entity.getTienPhat(),
                entity.getTinhTrangSach()
        );
    }

    @Override
    public void update(ChiTietPhieuMuon entity) {
        String sql = "update CTPhieuMuon set MaSach = ?, NgayTra = ?, TienPhat = ?, TinhTrangSach = ? where MaPM = ?";
        XJdbc.update(sql, entity.getMaPM(),
                entity.getNgayTra(),
                entity.getTienPhat(),
                entity.getTinhTrangSach(),
                entity.getMaPM()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "delete from CTPhieuMuon where MaPM = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public List<ChiTietPhieuMuon> selectAll() {
        String sql = "select * from CTPhieuMuon";
        return this.selectBySql(sql);
    }

    @Override
    public ChiTietPhieuMuon selectById(String id) {
        String sql = "select * from CTPhieuMuon where MaPM = ?";
        List<ChiTietPhieuMuon> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<ChiTietPhieuMuon> selectBySql(String sql, Object... args) {
        List<ChiTietPhieuMuon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ChiTietPhieuMuon entity = new ChiTietPhieuMuon();
                entity.setMaPM(rs.getString("MaPM"));
                entity.setMaSach(rs.getString("MaSach"));
                entity.setNgayTra(rs.getDate("NgayTra"));
                entity.setTienPhat(rs.getInt("TienPhat"));
                entity.setTinhTrangSach(rs.getString("TinhTrangSach"));
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
