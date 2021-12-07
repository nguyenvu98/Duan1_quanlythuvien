/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.DanhMucSach;
import com.Librarybook.util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class DanhMucSachDAO extends SystemDAO<DanhMucSach, String> {

    @Override
    public void insert(DanhMucSach entity) {
        String sql = "insert into DanhMucSach (MaDanhMucSach, TenDanhMucSach) values (?,?)";
        XJdbc.update(sql, entity.getMaDanhMucSach(),
                entity.getTenDanhMucSach());
    }

    @Override
    public void update(DanhMucSach entity) {
        String sql = "Update DanhMucSach set TenDanhMucSach = ? where MaDanhMucSach = ?";
        XJdbc.update(sql, entity.getTenDanhMucSach(),
                entity.getMaDanhMucSach());
    }

    @Override
    public List<DanhMucSach> selectAll() {
        String sql = "select * from DanhMucSach";
        return this.selectBySql(sql);
    }

    @Override
    public DanhMucSach selectById(String id) {
        String sql = "SELECT * FROM DanhMucSach WHERE MaDanhMucSach= ?";
        List<DanhMucSach> list = this.selectBySql(sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<DanhMucSach> selectBySql(String sql, Object... args) {
        List<DanhMucSach> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                DanhMucSach entity = new DanhMucSach();
                entity.setMaDanhMucSach(rs.getString("MaDanhMucSach"));
                entity.setTenDanhMucSach(rs.getString("TenDanhMucSach"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(String id) {
        String sql = "delete from DanhMucSach where MaDanhMucSach = ?";
        XJdbc.update(sql, id);
    }
}
