/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CartDAO;
import dao.CheckoutDAO;
import entity.Product;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chutr
 */
@WebServlet(name = "Checkout", urlPatterns = {"/checkout"})
public class Checkout extends HttpServlet {

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
        CartDAO dao = new CartDAO();
        CheckoutDAO cdao = new CheckoutDAO();
        HttpSession session = request.getSession();
        int uid = Integer.parseInt(String.valueOf(session.getAttribute("accid")));
        // giamr so luong trong kho
        List<Product> list = dao.listCartProduct(uid);
        int soluong[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            soluong[i] = Integer.parseInt(request.getParameter(list.get(i).getImage()));
            cdao.updateProduct(list.get(i).getId(), soluong[i]);
        }

        // xoa toan bo san pham trong cart
        dao.deleteAllCart(uid);
        String name = request.getParameter("fullname");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String phone_number = request.getParameter("phone_number");
        String email_address = request.getParameter("email_address");
        String CreditCardType = request.getParameter("CreditCardType");
        String card_number = request.getParameter("card_number");
        cdao.addCheckout(uid, name, address, city, phone_number, email_address, CreditCardType, card_number);
        request.getRequestDispatcher("home").forward(request, response);
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
