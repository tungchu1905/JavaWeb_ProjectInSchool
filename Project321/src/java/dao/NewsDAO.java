/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.News;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chutr
 */
public class NewsDAO {
// newsDAO and ContactsDAO
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public int countNews() {
        String s = "select COUNT(*) from HE141487_News ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
        }
        return 0;
    }

    public List<News> pagingNews(int index) {
        List<News> list = new ArrayList<>();
        String s = "select * from\n"
                + "(\n"
                + "    SELECT *,ROW_NUMBER() OVER (ORDER BY newsid) AS RowNum\n"
                + "    FROM HE141487_News\n"
                + ")\n"
                + "as acc\n"
                + "WHERE acc.RowNum BETWEEN ? AND ?;";
        try {

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setInt(1, ((index - 1) * 2) * 3 + 1); // 1,7,13,19
            ps.setInt(2, (index * 6));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new News(rs.getInt(1), 
                        rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void contact(String name, String email, String phone, String mess){
        String s = "insert into HE141487_Contact values(?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, mess);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}

