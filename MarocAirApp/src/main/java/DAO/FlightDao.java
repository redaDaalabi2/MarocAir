package DAO;

import Config.ConnectionProvider;
import Models.Flight;

import java.sql.*;

public class FlightDao {
    // Create a flight in the database
    public static void createFlight(Flight flight) throws Exception {
        String query = "INSERT INTO flight (ville_depart, ville_arrivee, heure_depart, heure_arrivee, date_depart, date_arrivee, nbre_place, prix, stopover, stopover_aero) VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'false', 'null')";
        Connection connection = ConnectionProvider.getCon();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, flight.getVille_depart());
        statement.setString(2, flight.getVille_arrivee());
        statement.setTime(3, flight.getHeure_depart());
        statement.setTime(4, flight.getHeure_arrivee());
        statement.setDate(5, flight.getDate_depart());
        statement.setDate(6, flight.getDate_arrivee());
        statement.setInt(7, flight.getNbre_place());
        statement.setFloat(8, flight.getPrix());
        statement.executeUpdate();
    }

    //get all flights
    public ResultSet getAllFlights() throws Exception {
        String query = "SELECT * FROM flight";
        Connection connection = ConnectionProvider.getCon();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    //Delete a flight
    public static void deleteFlight(int id) throws Exception {
        String query = "DELETE FROM flight WHERE id = ?";
        Connection connection = ConnectionProvider.getCon();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    //Update a flight
    public static void updateFlight(Flight flight) throws Exception {
        String query = "UPDATE flight SET ville_depart = ?, ville_arrivee = ?, heure_depart = ?, heure_arrivee = ?, date_depart = ?, date_arrivee = ?, nbre_place = ?, prix = ? WHERE id = ?";
        Connection connection = ConnectionProvider.getCon();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, flight.getVille_depart());
        statement.setString(2, flight.getVille_arrivee());
        statement.setTime(3, flight.getHeure_depart());
        statement.setTime(4, flight.getHeure_arrivee());
        statement.setDate(5, flight.getDate_depart());
        statement.setDate(6, flight.getDate_arrivee());
        statement.setInt(7, flight.getNbre_place());
        statement.setFloat(8, flight.getPrix());
        statement.executeUpdate();
    }

    //function getRecordById to get a flight by id
    public static Flight getRecordById(int id) throws Exception {
        String query = "SELECT * FROM flight WHERE id = ?";
        Connection connection = ConnectionProvider.getCon();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Flight flight = new Flight();
        while (resultSet.next()) {
            flight.setId(resultSet.getInt("id"));
            flight.setVille_depart(resultSet.getString("ville_depart"));
            flight.setVille_arrivee(resultSet.getString("ville_arrivee"));
            flight.setHeure_depart(resultSet.getTime("heure_depart"));
            flight.setHeure_arrivee(resultSet.getTime("heure_arrivee"));
            flight.setDate_depart(resultSet.getDate("date_depart"));
            flight.setDate_arrivee(resultSet.getDate("date_arrivee"));
            flight.setNbre_place(resultSet.getInt("nbre_place"));
            flight.setPrix(resultSet.getFloat("prix"));
        }
        return flight;
    }

}
