package DAO;
import Config.ConnectionProvider;
import Models.Admin;
import java.sql.*;

public class AdminDao {
    public boolean loginAdmin(Admin admin) throws Exception {
        String query = "SELECT * FROM admin WHERE email = ? AND password = ?";
        PreparedStatement preparedStatement = ConnectionProvider.getCon().prepareStatement(query);
        preparedStatement.setString(1,admin.getEmail());
        preparedStatement.setString(2,admin.getPassword());
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            return true;
        }
        return false;
    }
}
