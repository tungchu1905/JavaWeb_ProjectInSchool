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
public class CheckoutDAO {
       Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<Product> listCartProduct(int uid) {
        List<Product> list = new ArrayList<>();
        String s = "select  HE141487_Cart.ProID, name, image, price, title, description, cateID,quantity,taste,soluong from  "
                + "HE141487_Cart, HE141487_Product where HE141487_Cart.ProID = HE141487_Product.id and user_id = ?";

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
                        rs.getInt(7), rs.getInt(8),rs.getInt(9),rs.getInt(10))
                );
            }
        } catch (Exception e) {
        }
        return list;
    }
    public void updatecart(int so, int uid,int pid){
        String s = "update HE141487_Cart set soluong = ? where user_id = ? and ProID = ?";
        try {
            conn = new DBContext().getConnection();
            ps=conn.prepareStatement(s);
            ps.setInt(1, so);
            ps.setInt(2, uid);
            ps.setInt(3, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        CheckoutDAO dao =new CheckoutDAO();
        
    }

        public void updateProduct(int id, int quantity){
            String s = "update HE141487_Product set quantity = ? where id = ?";
            
            try {
                conn = new DBContext().getConnection();
            ps=conn.prepareStatement(s);
            ps.setInt(1, quantity);
            ps.setInt(2, id);
            ps.executeUpdate();
            } catch (Exception e) {
            }
        }
        
        
        public void addCheckout(int uid,String name,String address,String city
                ,String phone,String email,String card,String cardnumber){
            String s = "insert into HE141487_Checkout values(?,?,?,?,?,?,?,?)";
            try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(s);
                ps.setInt(1, uid);
                ps.setString(2, name);
                ps.setString(3, address);
                ps.setString(4, city);
                ps.setString(5, phone);
                ps.setString(6, email);
                ps.setString(7, card);
                ps.setString(8, cardnumber);
                ps.executeUpdate();
            } catch (Exception e) {
            }
        }
}
