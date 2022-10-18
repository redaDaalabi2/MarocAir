package DAO;

public class AdminDao extends Query {

    @Override
    public Boolean signIn(String table, String email, String password) throws Exception {
        return super.signIn(table, email, password);
    }
}
