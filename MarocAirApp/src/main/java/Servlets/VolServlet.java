package Servlets;

import DAO.VolDao;
import Models.Vol;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.jsp.jstl.sql.Result;
import jakarta.servlet.jsp.jstl.sql.ResultSupport;

import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "VolServlet", value = "/VolServlet")
public class VolServlet extends HttpServlet {
    VolDao volDao = new VolDao();
    Vol vol = new Vol();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("./Views/Client/booking.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String from = request.getParameter("ville_depart");
       String destination = request.getParameter("ville_arrivee");

       vol.setVille_depart(from);
       vol.setVille_arrivee(destination);

        try {
            int i = 1;
            ResultSet resultSet =  volDao.getVol(vol);
            Result result = ResultSupport.toResult(resultSet);
            request.setAttribute("data", result);
            request.getRequestDispatcher("./Views/Client/booking.jsp").forward(request, response);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
