package Servlets;

import DAO.AdminDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AdminConnectionServlet", value = "/AdminConnectionServlet")
public class AdminConnectionServlet extends HttpServlet {
    AdminDao adminDao = new AdminDao();
    private String table = "admin";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("./Views/Admin/adminLogin.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        try {
            if(adminDao.signIn(table,email,password)){
                response.sendRedirect("./getAllVolServlet");

            }else{
                response.sendRedirect("./AdminConnectionServlet");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
