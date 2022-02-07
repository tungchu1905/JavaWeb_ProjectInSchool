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
public class News {

    private int nid;
    private String nname;
    private String nimage;
    private String nlink;

    public News() {
    }

    public News(int nid, String nname, String nimage, String nlink) {
        this.nid = nid;
        this.nname = nname;
        this.nimage = nimage;
        this.nlink = nlink;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getNimage() {
        return nimage;
    }

    public void setNimage(String nimage) {
        this.nimage = nimage;
    }

    public String getNlink() {
        return nlink;
    }

    public void setNlink(String nlink) {
        this.nlink = nlink;
    }

}
