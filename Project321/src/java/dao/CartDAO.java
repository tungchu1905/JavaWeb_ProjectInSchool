/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chutr
 */
public class CartDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void addCart(String aid, String pid, String soluong) {
        String s = "insert into HE141487_Cart values(?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, aid);
            ps.setString(2, pid);
            ps.setString(3, soluong);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Product> listCartProduct(int uid, int index) {
        List<Product> list = new ArrayList<>();
        String s = "select  * from \n"
                + "(\n"
                + "    SELECT HE141487_Cart.ProID, name, image, price, title, description, cateID,quantity,taste,soluong,ROW_NUMBER() OVER (ORDER BY user_id) AS RowNum\n"
                + "    FROM HE141487_Cart, HE141487_Product where HE141487_Cart.ProID = HE141487_Product.id and user_id = ?\n"
                + ")\n"
                + "as acc\n"
                + "WHERE acc.RowNum BETWEEN ? AND ?;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setInt(1, uid);
            ps.setInt(2, ((index - 1) * 2) * 3 + 1); // 1,7,13,19
            ps.setInt(3, (index * 6));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10))
                );
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> listCartProduct(int uid) {
        List<Product> list = new ArrayList<>();
        String s = "SELECT HE141487_Cart.ProID, name, image, price, title, description, cateID,quantity,taste,soluong\n"
                + "    FROM HE141487_Cart, HE141487_Product where HE141487_Cart.ProID = HE141487_Product.id and user_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10))
                );
            }
        } catch (Exception e) {
        }

        return list;
    }

    public void deletecart(int uid, String proid) {

        String sql = "DELETE FROM HE141487_Cart WHERE user_id=? and ProID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, uid);
            ps.setString(2, proid);
            ps.executeUpdate();

        } catch (Exception ex) {
        }

    }public void deletecartadmin(String proid) {

        String sql = "DELETE FROM HE141487_Cart WHERE ProID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, proid);
            ps.executeUpdate();

        } catch (Exception ex) {
        }

    }

    public void deleteAllCart(int uid) {
        String sql = "DELETE FROM HE141487_Cart WHERE user_id=? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, uid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public boolean checkcart(String aID, String proid) {

        String sql = "SELECT * FROM HE141487_Cart WHERE user_id= ? and ProID = ?";
        PreparedStatement ps;
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, aID);
            ps.setString(2, proid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception ex) {

        }
        return false;
    }

    public int countCart(int uid) {
        String s = "  select COUNT(*) from HE141487_Cart where user_id = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
        }
        return 0;
    }
    public static void main(String[] args) {
        CartDAO dao = new CartDAO();
        List<Product> list = dao.listCartProduct(3);
        System.out.println(list);
    }
}
