package DAO;

import Models.Vol;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VolDao extends Query{

    public ResultSet getVol(Vol vol) throws Exception {
        String query = "SELECT * FROM flight WHERE ville_depart = ? AND ville_arrivee = ?";
        PreparedStatement preparedStatement = setPreparedStatement(query);
        preparedStatement.setString(1,vol.getVille_depart());
        preparedStatement.setString(2,vol.getVille_arrivee());
        return preparedStatement.executeQuery();
    }

    public Boolean setReservation(int clientID, int flightID) throws Exception {
        String query = "INSERT INTO reservation(clientid, flightid, state) VALUES(?,?,?) ";
        PreparedStatement preparedStatement = setPreparedStatement(query);
        preparedStatement.setInt(1,clientID);
        preparedStatement.setInt(2, flightID);
        preparedStatement.setBoolean(3,true);

        if(preparedStatement.execute()){
            return true;
        }else{
            return false;
        }
    }
}
