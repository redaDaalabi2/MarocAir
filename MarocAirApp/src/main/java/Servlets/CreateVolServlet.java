package Servlets;

import DAO.FlightDao;
import Models.Flight;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

@WebServlet(name = "CreateVolServlet", value = "/CreateVolServlet")
public class CreateVolServlet extends HttpServlet {
    FlightDao flightDao = new FlightDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("./Views/Admin/createVol.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ville_depart = request.getParameter("ville_depart");
        String ville_arrivee = request.getParameter("ville_arrivee");
        Time heure_depart = Time.valueOf(request.getParameter("heure_depart")+":00");
        Time heure_arrivee = Time.valueOf(request.getParameter("heure_arrivee")+":00");
        Date date_depart = Date.valueOf(request.getParameter("date_depart"));
        Date date_arrivee = Date.valueOf(request.getParameter("date_arrivee"));
        int nbre_place = Integer.parseInt(request.getParameter("nbre_place"));
        float prix = Float.parseFloat(request.getParameter("prix"));
        boolean stopover = Boolean.parseBoolean(request.getParameter("stopover"));
        String stopover_aero = request.getParameter("stopover_aero");

        Flight flight = new Flight();

        flight.setVille_depart(ville_depart);
        flight.setVille_arrivee(ville_arrivee);
        flight.setHeure_depart(Time.valueOf(String.valueOf(heure_depart)));
        flight.setHeure_arrivee(Time.valueOf(String.valueOf(heure_arrivee)));
        flight.setDate_depart(Date.valueOf(String.valueOf(date_depart)));
        flight.setDate_arrivee(Date.valueOf(String.valueOf(date_arrivee)));
        flight.setNbre_place(nbre_place);
        flight.setPrix(prix);
        flight.setStopover(stopover);
        flight.setStopover_aero(stopover_aero);

        try {
            flightDao.createFlight(flight);
            response.sendRedirect("./getAllVolServlet");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
