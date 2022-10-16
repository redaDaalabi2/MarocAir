package Servlets;

import DAO.ClientDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ClientConnectionServlet", value = "/ClientConnectionServlet")
public class ClientConnectionServlet extends HttpServlet {
    ClientDao clientDao = new ClientDao();
    private String table = "client";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("pwd");

        try {
            if(clientDao.signIn(table,email,password)){
              response.sendRedirect("Views/Client/booking.jsp");
            }else{
//                response.sendRedirect("Views/Client/booking.jsp");
              response.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
