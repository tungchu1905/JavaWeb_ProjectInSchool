/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Product;
import entity.Taste;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chutr
 */
@WebServlet(name = "Category", urlPatterns = {"/category"})
public class Category extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String categoryid = request.getParameter("cid");
        String tid = request.getParameter("tid");
        
        int choi = Integer.parseInt(request.getParameter("choi"));
        DAO dao = new DAO();
        List<entity.Category> listcat = dao.listCate();
        
        switch (choi) {
            case 1: 
                List<Product> listnew = dao.gettop3New();
                List<Product> listbyCid = dao.getAllbyCid(categoryid);
                request.setAttribute("listcate", listcat);
                request.setAttribute("listtop3", listnew);
                request.setAttribute("listP", listbyCid);

                request.getRequestDispatcher("home.jsp").forward(request, response);
            break;
            case 2: 
                List<Taste> listT = dao.listTaste();
                int choide = Integer.parseInt(request.getParameter("choice"));
                request.setAttribute("listC", listcat);
                request.setAttribute("listT", listT);
                switch (choide) {
                    case 1:
                        List<Product> listS = dao.getAllbyCid(categoryid);

                        request.setAttribute("listS", listS);
                        break;
                    case 2:
                        List<Product> listSt = dao.getAllbyTid(tid);
                        request.setAttribute("listS", listSt);
                        break;
                }
                request.getRequestDispatcher("shop.jsp").forward(request, response);
            break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
