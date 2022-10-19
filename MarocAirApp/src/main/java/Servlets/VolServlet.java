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
import java.util.LinkedList;
import java.util.List;

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
        List ll = new LinkedList();
       vol.setVille_depart(from);
       vol.setVille_arrivee(destination);

        try {
            int i = 1;
            ResultSet resultSet =  volDao.getVol(vol);
            while (resultSet.next()){
                Vol vol1 = new Vol();
                vol1.setVille_depart(resultSet.getString("ville_depart"));
                vol1.setVille_arrivee(resultSet.getString("ville_arrivee"));
                vol1.setStopover(resultSet.getBoolean("stopover"));
                vol1.setHeure_depart(resultSet.getTime("heure_depart"));
                vol1.setHeure_arrivee(resultSet.getTime("heure_arrivee"));
                vol1.setDate_depart(resultSet.getDate("date_depart"));
                vol1.setDate_arrivee(resultSet.getDate("date_arrivee"));
                vol1.setPrix(resultSet.getFloat("prix"));

                ll.add(vol1);
            }

//            Result result = ResultSupport.toResult(resultSet);
            request.setAttribute("data", ll);
            request.getRequestDispatcher("./Views/Client/booking.jsp").forward(request, response);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
