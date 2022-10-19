package Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import Models.Flight;
import DAO.FlightDao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "getAllVolServlet", value = "/getAllVolServlet")
public class getAllVolServlet extends HttpServlet {
    FlightDao flightDao = new FlightDao();
    Flight flight = new Flight();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List flightslist = new LinkedList();
        try {
            ResultSet rs = flightDao.getAllFlights();
            while (rs.next()) {
                Flight flight = new Flight();
                flight.setId(rs.getInt("id"));
                flight.setFlightid(rs.getString("flightid"));
                flight.setVille_depart(rs.getString("ville_depart"));
                flight.setVille_arrivee(rs.getString("ville_arrivee"));
                flight.setHeure_depart(rs.getTime("heure_depart"));
                flight.setHeure_arrivee(rs.getTime("heure_arrivee"));
                flight.setDate_depart(rs.getDate("date_depart"));
                flight.setDate_arrivee(rs.getDate("date_arrivee"));
                flight.setNbre_place(rs.getInt("nbre_place"));
                flight.setPrix(rs.getFloat("prix"));
                flight.setStopover(rs.getBoolean("stopover"));
                flight.setStopover_aero(rs.getString("stopover_aero"));
                flightslist.add(flight);
            }
            request.setAttribute("flights", flightslist);
            request.getRequestDispatcher("./Views/Admin/adminDash.jsp").forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
