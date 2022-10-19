package Servlets;

import DAO.FlightDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DeleteVolServlet", value = "/DeleteVolServlet")
public class DeleteVolServlet extends HttpServlet {
    FlightDao flightDao = new FlightDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            FlightDao.deleteFlight(id);
            response.sendRedirect("./getAllVolServlet");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
