/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


public class Product {
    private int id;
    private String name;
    private String image;
    private double price;
    private String title;
    private String description;
    private int pcate;
    private int quantity;
    private int ptaste;
    private String catename;
    private String tastename;
    private int soluong;
    public Product() {
    }

    public Product(int id, String name, String image, double price, String title, String description, int pcate, int quantity, int ptaste) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
        this.pcate = pcate;
        this.quantity = quantity;
        this.ptaste = ptaste;
    }

    public Product(int id, String name, String image, double price, String title, String description, int pcate, int quantity, int ptaste, String catename, String tastename) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
        this.pcate = pcate;
        this.quantity = quantity;
        this.ptaste = ptaste;
        this.catename = catename;
        this.tastename = tastename;
    }

    public Product(int id, String name, String image, double price, String title, String description, int pcate, int quantity, int ptaste, int soluong){
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
        this.pcate = pcate;
        this.quantity = quantity;
        this.ptaste = ptaste;
        this.soluong =soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public int getPtaste() {
        return ptaste;
    }

    public void setPtaste(int ptaste) {
        this.ptaste = ptaste;
    }

    public String getTastename() {
        return tastename;
    }

    public void setTastename(String tastename) {
        this.tastename = tastename;
    }

    

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPcate() {
        return pcate;
    }

    public void setPcate(int pcate) {
        this.pcate = pcate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
  
 
}
