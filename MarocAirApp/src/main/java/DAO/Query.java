package DAO;

import Config.ConnectionProvider;
import Servlets.ClientConnectionServlet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Query {

    public Boolean signIn(String table, String email, String password) throws Exception {
           String query = "SELECT * FROM "+table+" WHERE email = ? AND password = ?";
           PreparedStatement preparedStatement = ConnectionProvider.getCon().prepareStatement(query);
           preparedStatement.setString(1,email);
           preparedStatement.setString(2,password);

           ResultSet resultSet =   preparedStatement.executeQuery();
           if(resultSet.next()){
              ClientConnectionServlet.clientID =  resultSet.getInt("code");
               return true;
           }else{return false;}
    }

    public static PreparedStatement setPreparedStatement(String query) throws Exception {
        PreparedStatement preparedStatement = ConnectionProvider.getCon().prepareStatement(query);
        return preparedStatement;
    }
}
