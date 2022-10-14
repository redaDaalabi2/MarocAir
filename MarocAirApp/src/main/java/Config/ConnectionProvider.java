package Config;

import java.sql.*;
public class ConnectionProvider implements Provider {
    static Connection con;

    public static Connection getCon() throws Exception {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(connUrl, username, password);
        return con;
    }
}
