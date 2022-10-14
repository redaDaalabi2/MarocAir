package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import Config.ConnectionProvider;
import Models.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Admin admin = new Admin();
        admin.setNom(nom);
        admin.setPrenom(prenom);
        admin.setEmail(email);
        admin.setPassword(password);
        try {
            Connection conn = ConnectionProvider.getCon();
            PreparedStatement pst = conn.prepareStatement("INSERT INTO admin(nom, prenom, email, password) values(?,?,?,?)");
            pst.setString(1, admin.getNom());
            pst.setString(2, admin.getPrenom());
            pst.setString(3, admin.getEmail());
            pst.setString(4, admin.getPassword());
            int value = pst.executeUpdate();
            if (value > 0) {
                request.getSession().setAttribute("sm", "Admin Added Successfully");
            } else {
                request.getSession().setAttribute("em", "Admin Not Added");
            }
            request.getRequestDispatcher("/Views/index.jsp").forward(request, response);
        } catch (Exception ex) {
            out.println( ex.getClass().getName()+": "+ ex.getMessage() );
            System.out.println(ex.getStackTrace());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

}
