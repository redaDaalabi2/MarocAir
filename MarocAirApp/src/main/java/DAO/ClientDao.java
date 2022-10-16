package DAO;


import Config.ConnectionProvider;
import Models.Client;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDao extends Query {

       public int register(Client client) throws Exception {

       String query = "INSERT INTO client(nom,prenom,email,\"password\",phone) VALUES(?,?,?,?,?)";
              PreparedStatement preparedStatement = ConnectionProvider.getCon().prepareStatement(query);
              preparedStatement.setString(1,client.getNom());
              preparedStatement.setString(2,client.getPrenom());
              preparedStatement.setString(3,client.getEmail());
              preparedStatement.setString(4,client.getPassword());
              preparedStatement.setString(5,client.getPhone());

              return preparedStatement.executeUpdate();
       }



}
