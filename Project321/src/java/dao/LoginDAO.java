/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author chutr
 */
public class LoginDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //DANG NHAP
    public Account getLogin(String username, String password) {
        String s = "select * from HE141487_Account where username =? and pass =? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7), rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    // check Account
    public Account CheckAccount(String username) {
        String s = "select * from HE141487_Account where username =? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7), rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //dang ki
    public Account Signup(String user, String pass) {
        String s = "insert into HE141487_Account(username, pass, isSell, isAdmin)values(?,?,0,0) ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return null;
    }

    // update
    public void updateaccount(String username,  String Phone, String email, String name, String id) {
        String s = "update HE141487_Account set username = ?, Phone = ?,"
                + " Email = ?, fullname = ? where user_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, username);
            ps.setString(2, Phone);
            ps.setString(3, email);
            ps.setString(4, name);
            ps.setString(5, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //// PHAN TRANG 
    public int countAccount() {
        String s = "select COUNT(*) from HE141487_Account ";
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
    // doi mat khau

    public void changePass(int uid, String pass) {
        String s = "update HE141487_Account set pass = ? where user_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, pass);
            ps.setInt(2, uid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        LoginDAO dao = new LoginDAO();
        Account acc = dao.getLogin("tungchu123", "123456a");
        System.out.println(dao);
    }
}
