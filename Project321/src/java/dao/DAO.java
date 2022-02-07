/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Category;
import entity.Product;
import entity.Taste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chutr
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // load du lieu tu db len
  
    ///////////////////   /product 
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String s = "select id,name,image,price,title,description,HE141487_Product.cateID,quantity,HE141487_Product.taste,\n" +
"HE141487_category.cname, HE141487_taste.tname from HE141487_product,HE141487_category,HE141487_taste where \n" +
"HE141487_Product.cateID=HE141487_category.cid and HE141487_Product.taste=HE141487_taste.tid";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11)
                    ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllHome() {
        List<Product> list = new ArrayList<>();
        String s = "select top 6 * from HE141487_Product";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),rs.getInt(8),rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> gettop3New() {
        List<Product> list = new ArrayList<>();
        String s = "select top 3 * from HE141487_Product \n"
                + "	order by id desc ";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),rs.getInt(8),rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product prodetail(String id) {
        String s = "select * from HE141487_Product where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),rs.getInt(8),rs.getInt(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    // SEARCH PRODUCT
    public List<Product> Searchbyname(String name,int index) {
        List<Product> list = new ArrayList<>();
        String s = "select * from(\n" +
"                  SELECT *,ROW_NUMBER() OVER (ORDER BY id) AS RowNum\n" +
"                   FROM HE141487_Product where name like ?\n" +
"                )\n" +
"                as acc\n" +
"                WHERE acc.RowNum BETWEEN ? AND ?;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, "%" + name + "%");
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
                        rs.getInt(7),rs.getInt(8),rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }
public int countProductSe(String name) {
        String s = "select COUNT(*) from HE141487_Product where name like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
             ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
        }
        return 0;
    }
    ///////////////////////// CATEGORY 
    public List<Category> listCate() {
        List<Category> catlist = new ArrayList<>();
        String s = "select * from HE141487_category";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                catlist.add(new Category(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return catlist;
    }

    public List<Product> getAllbyCid(String cid) {
        List<Product> list = new ArrayList<>();
        String s = "select top 6 * from HE141487_Product where cateID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),rs.getInt(8),rs.getInt(9)));

            }
        } catch (Exception e) {
        }
        return list;
    }



    public List<Product> getlistRelated(String cid) {
        List<Product> list = new ArrayList<>();
        String sql = "select top 3 * from HE141487_Product where cateID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),rs.getInt(8),rs.getInt(9)));

            }
        } catch (Exception e) {
        }
        return list;
    }

    ///////////////////////// TASTE 
    public List<Taste> listTaste() {
        List<Taste> list = new ArrayList<>();
        String s = "select * from HE141487_taste";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Taste(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllbyTid(String tid) {
        List<Product> list = new ArrayList<>();
        String s = "select top 6 * from HE141487_Product where taste = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(s);
            ps.setString(1, tid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),rs.getInt(8),rs.getInt(9)));

            }
        } catch (Exception e) {
        }
        return list;
    }

    
    
    
    ///////////////////// PHAN TRANG PAGING 

    public int countProduct() {
        String s = "select COUNT(*) from HE141487_Product ";
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

    public List<Product> pagingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String s = "select * from\n"
                + "(\n"
                + "    SELECT *,ROW_NUMBER() OVER (ORDER BY id) AS RowNum\n"
                + "    FROM HE141487_Product\n"
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
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),rs.getInt(8),rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Product> list = dao.pagingProduct(1);
        System.out.println(list);
    }
    
}
