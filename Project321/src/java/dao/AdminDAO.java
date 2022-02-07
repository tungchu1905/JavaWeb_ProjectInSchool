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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chutr
 */
public class AdminDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
   public void insertpd(String name, String image, String price, String title, String des, 
           String cid, String quantity, String tid){
       String s = "insert into HE141487_Product "
               + "values(?,?,?,?,?,?,?,?)";
       try {
           conn = new DBContext().getConnection();
           ps = conn.prepareStatement(s);
           ps.setString(1, name);
           ps.setString(2,"img/shop/"+ image);
           ps.setString(3, price);
           ps.setString(4, title);
           ps.setString(5,des);
           ps.setString(6, cid);
           ps.setString(7, quantity);
           ps.setString(8, tid);
           ps.executeUpdate();
           
       } catch (Exception e) {
       }
   }
   public void deletepd(String pid){
       String s = "delete from HE141487_Product where id = ?";
       try {
           conn = new DBContext().getConnection();
           ps = conn.prepareStatement(s);
           ps.setString(1, pid);
           ps.executeUpdate();
       } catch (Exception e) {
       }
   }
   public void editpd(String name, String price, String title, String des, 
           String cid, String quantity, String tid, String id){
       String s = "update HE141487_Product set name =?,  \n" +
"price = ?, title = ? ,description = ?, cateID = ?, quantity = ? , taste = ? where id =?";
       try {
           conn = new DBContext().getConnection();
           ps = conn.prepareStatement(s);
           ps.setString(1, name);
//           ps.setString(2,"img/shop/"+ image);
           ps.setString(2, price);
           ps.setString(3, title);
           ps.setString(4, des);
           ps.setString(5, cid);
           ps.setString(6, quantity);
           ps.setString(7, tid);
           ps.setString(8, id);
           ps.executeUpdate();
       } catch (Exception e) {
       }
   }
   public List<Account> getAll (){
       List<Account> list = new ArrayList<>();
       String s = "select * from HE141487_Account where user_id>1";
       try {
           conn = new DBContext().getConnection();
           ps = conn.prepareStatement(s);
           rs = ps.executeQuery();
           while(rs.next()){
               list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7), rs.getString(8)));
           }
       } catch (Exception e) {
       }
       return list;
   }
   public void deleteAccount (String userid){
       String s = "delete from HE141487_Account where user_id = ?";
       try {
           conn = new DBContext().getConnection();
           ps = conn.prepareStatement(s);
           ps.setString(1, userid);
           ps.executeUpdate();
       } catch (Exception e) {
       }
   }
    public static void main(String[] args) {
        AdminDAO dao = new AdminDAO();
       
        System.out.println(dao);
    }
}
