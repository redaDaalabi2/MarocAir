package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import Models.Admin;
import DAO.AdminDao;
import java.io.IOException;

public class AdminServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Admin admin = new Admin();
        admin.setNom(nom);
        admin.setPrenom(prenom);
        admin.setEmail(email);
        admin.setPassword(password);
        AdminDao adminDao = new AdminDao();
        adminDao.addAdmin(request, response, admin);
        /*try {
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
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/index.jsp");
            dispatcher.forward(request, response);
            //request.getRequestDispatcher("/Views/index.jsp").forward(request, response);
        } catch (Exception ex) {
            out.println( ex.getClass().getName()+": "+ ex.getMessage() );
            System.out.println(ex.getStackTrace());
        }*/
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
