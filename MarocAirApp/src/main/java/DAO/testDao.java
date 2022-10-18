package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class testDao extends Query{


    public static void main(String[] args) throws Exception {
        String query = "SELECT * FROM flight WHERE ville_depart = ? AND ville_arrivee = ?";
        PreparedStatement preparedStatement = setPreparedStatement(query);

        preparedStatement.setString(1,"RAK");
        preparedStatement.setString(2,"PAR");
        ResultSet resultSet =  preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getString("ville_depart"));
        }

    }

}
