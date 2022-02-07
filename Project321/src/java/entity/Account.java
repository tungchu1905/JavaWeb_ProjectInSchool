/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chutr
 */
public class Account {
    private int uid;
    private String username;
    private String password;
    private String phone; 
    private String email;
    private int isSell;
    private int isAdmin;
    private String fullname;

    public Account() {
    }

    public Account(int uid, String username, String password, String phone, String email, int isSell, int isAdmin, String fullname) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.isSell = isSell;
        this.isAdmin = isAdmin;
        this.fullname = fullname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIsSell() {
        return isSell;
    }

    public void setIsSell(int isSell) {
        this.isSell = isSell;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    

    
    
    
    
}
