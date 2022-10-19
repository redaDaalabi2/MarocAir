package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class testDao extends Query{


    public static void main(String[] args) throws Exception {
        String query = "SELECT * FROM flight";
        PreparedStatement preparedStatement = setPreparedStatement(query);
        ResultSet resultSet =  preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("ville_depart"));
        }

    }

}
