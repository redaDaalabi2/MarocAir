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
}
