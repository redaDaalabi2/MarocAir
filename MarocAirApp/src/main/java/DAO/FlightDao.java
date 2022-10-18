package DAO;

import Config.ConnectionProvider;
import Models.Flight;
import java.sql.*;

public class FlightDao {
    // Create a flight in the database
    public static void createFlight(Flight flight) throws Exception {
        String query = "INSERT INTO flight (ville_depart, ville_arrivee, heure_depart, heure_arrivee, date_depart, date_arrivee, nbre_place, prix, stopover) VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'false')";
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
}
