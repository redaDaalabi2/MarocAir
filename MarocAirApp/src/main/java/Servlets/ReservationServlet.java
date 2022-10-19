package Servlets;

import DAO.VolDao;
import Services.Mail;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ReservationServlet", value = "/ReservationServlet")
public class ReservationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          int flighID = Integer.parseInt(request.getParameter("code"));

          VolDao volDao = new VolDao();
        try {
          volDao.setReservation(ClientConnectionServlet.clientID,flighID);
            Mail.sendMail("TEST","tst mail","\"muiugfbne@mozmail.com\"");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
