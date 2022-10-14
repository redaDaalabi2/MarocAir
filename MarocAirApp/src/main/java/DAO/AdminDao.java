package DAO;
import Config.ConnectionProvider;
import Models.Admin;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.*;

public class AdminDao {
    public void addAdmin(HttpServletRequest request, HttpServletResponse reponse, Admin admin) throws Exception {
        try {
            Connection con = ConnectionProvider.getCon();
            String sql = "INSERT INTO admin(nom, prenom, email, password) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
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
        } catch (Exception ex) {
            System.out.println("ERRO UserDAO addUser: " + ex.getMessage());
        }
    }
}
