package DAO;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import static Services.Mail.getaBoolean;

public class testDao extends Query{


    public static void main(String[] args) throws Exception {
//        sendMail("Test","testinf mail","\"muiugfbne@mozmail.com\"");
        setReservation(11,1);

    }

    public static Boolean sendMail(String body,String subject ,String email) {
        return getaBoolean(body, subject, email);
    }
    public static Boolean setReservation(int clientID, int flightID) throws Exception {
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
