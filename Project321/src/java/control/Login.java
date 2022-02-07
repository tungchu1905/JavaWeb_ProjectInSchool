/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.LoginDAO;
import entity.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chutr
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

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
        // get user, pass o cookie 
        Cookie arr[] = request.getCookies();
        if (arr != null) {
            for (Cookie o : arr) {
                if (o.getName().equals("userC")) {
                    request.setAttribute("username", o.getValue());
                }
                if (o.getName().equals("passC")) {
                    request.setAttribute("password", o.getValue());
                }
            }
        }
        // set user, pass vao login form
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
        LoginDAO dao = new LoginDAO();
        Account ac = new Account();
        HttpSession session = request.getSession();

        String command = request.getParameter("command");
        String u = request.getParameter("username");
        String p = request.getParameter("password");
        switch (command) {

            //Login 
            case "loginaccount":

                String remember = request.getParameter("remember");

                ac = dao.getLogin(u, p);
                if (ac != null) {
                    Cookie c_user = new Cookie("userC", u);
                    Cookie c_pass = new Cookie("passC", p);
                    c_user.setMaxAge(1000);
                    if (remember != null) {
                        c_pass.setMaxAge(1000);
                    } else {
                        c_pass.setMaxAge(0);
                    }
                    session.setAttribute("acc", ac);
                    session.setAttribute("accid", ac.getUid());
                    session.setAttribute("username", ac.getUsername());
                    if (ac.getIsAdmin() == 1) {
                        session.setAttribute("admin", ac.getIsAdmin());
                    }
                    response.addCookie(c_user);
                    response.addCookie(c_pass);
                    session.setMaxInactiveInterval(1000);
                    request.getRequestDispatcher("home").forward(request, response);

                } else {
                    request.setAttribute("mess", "Sai tai khoan hoac mat khau");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                break;
            // Dang ki
            case "signup":
                String repass = request.getParameter("repassword");
                if ( u.length() < 8 || u.length() > 32
                        || p.length() < 6) {
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                } else {
                    if (!p.equals(repass)) {
                        request.getRequestDispatcher("register.jsp").forward(request, response);
                    } else {

                        ac = dao.CheckAccount(u);
                        if (ac == null) {
                            // duoc dang ki
                            dao.Signup(u, p);
                            ac = dao.getLogin(u, p);
                            session.setAttribute("acc", ac);
                            session.setAttribute("accid", ac.getUid());
                            session.setAttribute("username", ac.getUsername());
                            request.getRequestDispatcher("home").forward(request, response);
                        } else {
                            // day ve trang dang ki lai
                            request.getRequestDispatcher("register.jsp").forward(request, response);
                        }

                    }

                }

                break;
            //create account
        }

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
