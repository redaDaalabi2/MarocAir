package Servlets;

import DAO.ClientDao;
import Models.Client;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ClientRegisterServlet", value = "/ClientRegisterServlet")
public class ClientRegisterServlet extends HttpServlet {

    ClientDao clientDao = new ClientDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("./Views/Client/clientRegister.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom = request.getParameter("nom") ;
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String password = request.getParameter("pwd");
        String phone = request.getParameter("phone");

        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setPhone(phone);
        client.setPassword(password);

        try {
            clientDao.register(client);
            response.sendRedirect("index.jsp");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
